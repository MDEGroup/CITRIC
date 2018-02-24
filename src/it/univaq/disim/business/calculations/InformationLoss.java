package it.univaq.disim.business.calculations;

import java.util.List;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

import it.univaq.disim.business.datamodel.ATLBinding;
import it.univaq.disim.business.datamodel.ModelStructuralFeature;
import it.univaq.disim.business.datamodel.RuleBinding;
import it.univaq.disim.business.datamodel.Transformation;
import it.univaq.disim.business.manager.ATLTransformationManager;
import it.univaq.disim.business.manager.MetamodelManager;
import it.univaq.disim.business.manager.ModelManager;
import it.univaq.disim.common.utils.Utils;

public class InformationLoss{
	
	public static void main(String[] args) {
		Transformation t = new Transformation();
		String inputMetamodelPath = "resources/running_example/metamodels/KM.ecore";
		String inputModelPath = "resources/mutations/KM3_seed.xmi";
		String atlTransformation = "resources/running_example/transformations/km3_2_java.atl";
		t.setATLTransformation(atlTransformation);
		t.setInputMetamodel(inputMetamodelPath);
		t.setInputModel(inputModelPath);
		
		InformationLoss.informationLoss(t);
		
	}
	
	public static float informationLoss(Transformation transformation) {
		float result = 0;
		List<ModelStructuralFeature> modelStructuralFeatures = ModelManager.getAllModelStructuralFeaturesAndReferences(transformation.getInputModel(), transformation.getInputMetamodel());
		List<ModelStructuralFeature> metamodelStructuralFeatures = MetamodelManager.getAllMetamodelStructuralFeaturesAndReferences(transformation.getInputMetamodel());
		ATLTransformationManager atlManager = new ATLTransformationManager(transformation.getATLTransformation());
		List<ATLBinding> atlBindings = atlManager.getAllBindings();
		
		int totalNumberOfInputModelStructuralFeatures = 0;
		for (ModelStructuralFeature modelInstance : modelStructuralFeatures) {
			totalNumberOfInputModelStructuralFeatures += modelInstance.getTotalNumberOfStructuralFeatures();
		}
		
		int totalNumberofInputModelInstances = modelStructuralFeatures.size();
		
		String tmp = "";
		int countMetaclassOccurrences = 0;
		int countNumberOfModelImpactedStructuralFeatures = 0;
		for (ATLBinding atlBinding : atlBindings) {
			if(!atlBinding.getInputMetaclassName().equalsIgnoreCase(tmp)) {
				//If exists a rule that impacts with a model metaclass 
				for (ModelStructuralFeature modelStructuralFeature : modelStructuralFeatures) {
					if(atlBinding.getInputMetaclassName().equalsIgnoreCase(modelStructuralFeature.geteClass().getName())) {
						//used to avoid multiple rule with the same input metaclass
						tmp = atlBinding.getInputMetaclassName();
						countMetaclassOccurrences++;
						
						//Let calculate StructuralFeatures
						for (RuleBinding ruleBinding : atlBinding.getBindings()) {
							for (EStructuralFeature modelMetaclassStructuralFeature : modelStructuralFeature.geteStructuralFeatures()) {
								if(modelMetaclassStructuralFeature.getName().equalsIgnoreCase(ruleBinding.getInput())) {
									countNumberOfModelImpactedStructuralFeatures++;
								}
							}
							for (EReference modelMetaclassReference : modelStructuralFeature.geteReferences()) {
								if(modelMetaclassReference.getName().equalsIgnoreCase(ruleBinding.getInput())){
									countNumberOfModelImpactedStructuralFeatures++;
								}
							}
						}
					}
					
				}
			}
		}
		System.out.println("\t(a) # Input Model Metaclass Occurrences in ATL T: "+countMetaclassOccurrences);
		System.out.println("\t(b) # Total Input Model Metaclasses in MM: "+totalNumberofInputModelInstances);
		System.out.println("\t(c) # Input Model Metaclass Structural Features Occurrences in ATL T Rules: "+countNumberOfModelImpactedStructuralFeatures);
		System.out.println("\t(d) # Total Input Model Metaclass Structural Features in MM: "+totalNumberOfInputModelStructuralFeatures);
		System.out.println("\tIL(T, m) = [2-(a/b)+(c/d)*0.5]");
		
		result = (float) (2 - ((float)(((float) countMetaclassOccurrences / totalNumberofInputModelInstances) + ((float) countNumberOfModelImpactedStructuralFeatures / totalNumberOfInputModelStructuralFeatures))*0.5));
		System.out.println("IL("+Utils.getNameFromPath(transformation.getATLTransformation())+", "+Utils.getNameFromPath(transformation.getInputModel())+") = "+result);
		
		return result;
	}
	

}
