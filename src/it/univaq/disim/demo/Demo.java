package it.univaq.disim.demo;

import java.util.ArrayList;
import java.util.List;

import it.univaq.disim.business.calculations.Coverage;
import it.univaq.disim.business.calculations.InformationLoss;
import it.univaq.disim.business.datamodel.Transformation;
import it.univaq.disim.business.evaluation.EvaluateMutation;

public class Demo {

	public static void main(String[] args) {
		
		/**
		 * EVALUATE INFORMATION LOSS
		 */
		demoInformationLoss();
		
		/**
		 * EVALUATE COVERAGE
		 */
		demoCoverage();
		
		/**
		 * EVALUATE RUNNING EXAMPLE
		 */
		demoRunningExample();
		
		/**
		 * EVALUATE MUTATIONS
		 */
		//It may take time!
		demoMutations();
		
		
		
	}
	
	public static void demoInformationLoss() {
		Transformation t = new Transformation();
		String inputMetamodelPath = "resources/running_example/metamodels/KM3.ecore";
		String inputModelPath = "resources/running_example/models/mutations/KM3/Class/KM3_name_set.xmi";
//		String inputModelPath = "resources/running_example/models/mutations/KM3/Class/KM3_name_unset.xmi";
		String atlTransformation = "resources/running_example/transformations/KM32XML.atl";
		t.setATLTransformation(atlTransformation);
		t.setInputMetamodel(inputMetamodelPath);
		t.setInputModel(inputModelPath);
		
		InformationLoss.informationLoss(t);
	}
	
	public static void demoCoverage() {
		String atl = "resources/running_example/transformations/emf2java.atl";
		String inputMM = "resources/running_example/metamodels/Ecore.ecore";

		Transformation t = new Transformation();
		t.setATLTransformation(atl);
		t.setInputMetamodel(inputMM);
		t.isMeta_Metamodel(true);
		Coverage.coverage(t);
	}
	
	public static void demoMutations() {
		EvaluateMutation.evaluateMutations();
	}
	
	public static void demoRunningExample() {
		String inputModel = "resources/running_example/models/KM3_seed.xmi";
		List<String> inputModels = new ArrayList<String>();
		inputModels.add(inputModel);
		RunningExample.testRunningExampleChain3(inputModels);
	}

}
