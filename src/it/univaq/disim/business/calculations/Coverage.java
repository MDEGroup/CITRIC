package it.univaq.disim.business.calculations;

import java.util.List;

import org.eclipse.ocl.ParserException;

import it.univaq.disim.business.datamodel.ATLBinding;
import it.univaq.disim.business.datamodel.Transformation;
import it.univaq.disim.business.manager.ATLTransformationManager;
import it.univaq.disim.business.manager.MetamodelManager;

public class Coverage{


	public static float coverage(Transformation transformation) {

		// System.out.println("Calculation Coverage for
		// "+transformation.getName()+" tranformation.");
		float coverage = (float) 0.0;

		String inputMM = transformation.getInputMetamodel();
		MetamodelManager.registerMetamodel(inputMM);
		String atlTransformation = transformation.getATLTransformation();
		System.out.println(atlTransformation);
		
		List<ATLBinding> atlBindings = ATLTransformationManager.getAllBindings(transformation.getATLTransformation());

		try {
			int nMetaclassesIntoInputMetamodel = MetamodelManager.getAllMetamodelEClasses(inputMM).size();
			int nStructuralFeaturesIntoInputMetamodel = MetamodelManager.getMetamodelStructuralFeatures(inputMM).size();

			int nRules = atlBindings.size();
			int nTransformationBindings = 0;
			for (ATLBinding atlBinding : atlBindings) {
				nTransformationBindings += atlBinding.getBindings().size();
			}

			if (nMetaclassesIntoInputMetamodel > 0 && nStructuralFeaturesIntoInputMetamodel > 0) {
				coverage = (float) (((nRules / nMetaclassesIntoInputMetamodel)
						+ (nTransformationBindings / nStructuralFeaturesIntoInputMetamodel)) * 0.5);
			}
			
			System.out.println("# Input Metamodel Metaclasses: "+nMetaclassesIntoInputMetamodel);
			System.out.println("# Input Metamodel Structural Features: "+nStructuralFeaturesIntoInputMetamodel);
			System.out.println("# Transformation Rules: "+nRules);
			System.out.println("# Transformation Bindings: "+nTransformationBindings);
		} catch (ParserException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
		}

		System.out.println("Cov(" + transformation.getName() + ") = " + coverage);
		return coverage;
	}
	

	

	public static void main(String[] args) {

		String atl = "resources/running_example/KM32EMF/KM32EMF.atl";
		String inputMM = "resources/running_example/KM32EMF/KM.ecore";

		Transformation t = new Transformation();
		t.setATLTransformation(atl);
		t.setInputMetamodel(inputMM);
		Coverage.coverage(t);
		
	}

}
