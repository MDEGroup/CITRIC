package it.univaq.disim.business.calculations;

import java.util.List;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

import it.univaq.disim.business.datamodel.ATLBinding;
import it.univaq.disim.business.datamodel.ModelStructuralFeature;
import it.univaq.disim.business.datamodel.Transformation;
import it.univaq.disim.business.manager.ATLTransformationManager;
import it.univaq.disim.business.manager.MetamodelManager;
import it.univaq.disim.business.manager.ModelManager;

public class InformationLoss{
	
	public static void main(String[] args) {
		Transformation t = new Transformation();
		String inputMetamodelPath = "resources/test/CompanyMM.ecore";
		String inputModelPath = "resources/test/company-model.xmi";
		String atlTransformation = "resources/test/company2CMS.atl";
		t.setATLTransformation(atlTransformation);
		t.setInputMetamodel(inputMetamodelPath);
		t.setInputModel(inputModelPath);
		
		InformationLoss.informationLoss(t);
		
	}
	
	public static float informationLoss(Transformation transformation) {
		float result = 0;
		List<ModelStructuralFeature> modelStructuralFeatures = ModelManager.getAllModelStructuralFeaturesAndReferences(transformation.getInputModel(), transformation.getInputMetamodel());
		List<ModelStructuralFeature> metamodelStructuralFeatures = MetamodelManager.getAllMetamodelStructuralFeaturesAndReferences(transformation.getInputMetamodel());
		List<ATLBinding> atlBindings = ATLTransformationManager.getAllBindings(transformation.getATLTransformation());
		
		int totalNumberOfInputModelStructuralFeatures = 0;
		for (ModelStructuralFeature modelInstance : modelStructuralFeatures) {
			totalNumberOfInputModelStructuralFeatures += modelInstance.getTotalNumberOfStructuralFeatures();
		}
		
		int totalNumberofInputModelInstances = modelStructuralFeatures.size();
		
		String tmp = "";
		int countMetaclassOccurrences = 0;
		int countNumberOfModelImpactedStructuralFeatures = 0;
		for (ATLBinding atlBinding : atlBindings) {
			if(!atlBinding.getMetaclassName().equalsIgnoreCase(tmp)) {
				//If exists a rule that impacts with a model metaclass 
				for (ModelStructuralFeature modelStructuralFeature : modelStructuralFeatures) {
					if(atlBinding.getMetaclassName().equalsIgnoreCase(modelStructuralFeature.geteClass().getName())) {
						//used to avoid multiple rule with the same input metaclass
						tmp = atlBinding.getMetaclassName();
						countMetaclassOccurrences++;
						
						//Let calculate StructuralFeatures
						for (String ruleBinding : atlBinding.getBindings()) {
							for (EStructuralFeature modelMetaclassStructuralFeature : modelStructuralFeature.geteStructuralFeatures()) {
								if(modelMetaclassStructuralFeature.getName().equalsIgnoreCase(ruleBinding)) {
									countNumberOfModelImpactedStructuralFeatures++;
								}
							}
							for (EReference modelMetaclassReference : modelStructuralFeature.geteReferences()) {
								if(modelMetaclassReference.getName().equalsIgnoreCase(ruleBinding)){
									countNumberOfModelImpactedStructuralFeatures++;
								}
							}
						}
					}
					
				}
			}
		}
		System.out.println("(a) #Input Model Metaclass Occurrences in ATL T: "+countMetaclassOccurrences);
		System.out.println("(b) #Total Input Model Metaclass Occurrences in T: "+totalNumberofInputModelInstances);
		System.out.println("(c) #Input Model Metaclass Structural Features Occurrences in T Rules: "+countNumberOfModelImpactedStructuralFeatures);
		System.out.println("(d) #Total Input Model Metaclass Structural Features Occurrences in T Rules: "+totalNumberOfInputModelStructuralFeatures);
		System.out.println("IL(T, m) = [2-(a/b)+(c/d)*0.5]");
		
		result = (float) (2 - ((float)(((float) countMetaclassOccurrences / totalNumberofInputModelInstances) + ((float) countNumberOfModelImpactedStructuralFeatures / totalNumberOfInputModelStructuralFeatures))*0.5));
		System.out.println("IL("+transformation.getATLTransformation()+", "+transformation.getInputModel()+") = "+result);
		
		return result;
	}
	

}
