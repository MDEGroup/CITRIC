package it.univaq.disim.business.calculations;

import java.util.List;

import org.eclipse.ocl.ParserException;

import it.univaq.disim.business.datamodel.ATLBinding;
import it.univaq.disim.business.datamodel.Transformation;
import it.univaq.disim.business.manager.ATLTransformationManager;
import it.univaq.disim.business.manager.MetamodelManager;
import it.univaq.disim.common.utils.Utils;

public class Coverage{


	private static final boolean VISUALIZE_CALCULATIONS = false;


	public static void main(String[] args) {

		String atl = "resources/running_example/transformations/KM32XML.atl";
		String inputMM = "resources/running_example/metamodels/KM3.ecore";

		Transformation t = new Transformation();
		t.setATLTransformation(atl);
		t.setInputMetamodel(inputMM);
		t.isMeta_Metamodel(true);
		Coverage.coverage(t);
		
	}

	
	public static float coverage(Transformation transformation) {

		// System.out.println("Calculation Coverage for
		// "+transformation.getName()+" tranformation.");
		float coverage = (float) 0.0;

		
		String atlTransformation = transformation.getATLTransformation();
		ATLTransformationManager atlManager = new ATLTransformationManager(atlTransformation);
		
		List<ATLBinding> atlBindings = atlManager.getAllBindings();

		try {
			String inputMM = transformation.getInputMetamodel();
			int nMetaclassesIntoInputMetamodel = 0;
			if(!transformation.isMeta_Metamodel()) {
				MetamodelManager.registerMetamodel(inputMM);
				nMetaclassesIntoInputMetamodel = MetamodelManager.getAllMetamodelEClasses(inputMM).size();
			}else {
				nMetaclassesIntoInputMetamodel = MetamodelManager.getMeta_metamodelEClasses(inputMM).size();
			}
			int nStructuralFeaturesIntoInputMetamodel = MetamodelManager.getMetamodelStructuralFeatures(inputMM).size();

			int nRules = atlBindings.size();
			int nTransformationBindings = 0;
			for (ATLBinding atlBinding : atlBindings) {
				nTransformationBindings += atlBinding.getBindings().size();
			}

			if (nMetaclassesIntoInputMetamodel > 0 && nStructuralFeaturesIntoInputMetamodel > 0) {
				coverage = (float) (
									((float)
											((float) nRules / nMetaclassesIntoInputMetamodel) +
											((float) nTransformationBindings / nStructuralFeaturesIntoInputMetamodel)
									) * 0.5) ;
			}
			
			if(VISUALIZE_CALCULATIONS) {
				System.out.println("\t(a) # Transformation Rules: "+nRules);
				System.out.println("\t(b) # Input Metamodel Metaclasses: "+nMetaclassesIntoInputMetamodel);
				System.out.println("\t(c) # Transformation Bindings: "+nTransformationBindings);
				System.out.println("\t(d) # Input Metamodel Structural Features: "+nStructuralFeaturesIntoInputMetamodel);
				System.out.println("\tCov(T, MM) = [(a/b)+(c/d)*0.5]");
			}
		} catch (ParserException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
		}

		System.out.println("Cov(" + Utils.getNameFromPath(transformation.getInputMetamodel()) + ", "+transformation.getName() +") = " + Utils.roundFloatValues(coverage*(float)0.5, 2));
		return coverage;
	}
	

	

	
}
