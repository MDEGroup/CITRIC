package it.univaq.disim.business.mutator.evaluation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import it.univaq.disim.business.mutator.km3.AttributeMutation;
import it.univaq.disim.business.mutator.km3.ClassMutation;
import it.univaq.disim.business.mutator.km3.DataTypeMutation;
import it.univaq.disim.business.mutator.km3.EnumLiteralMutation;
import it.univaq.disim.business.mutator.km3.EnumerationMutation;
import it.univaq.disim.business.mutator.km3.KM3BasicMutator;
import it.univaq.disim.business.mutator.km3.MetamodelMutation;
import it.univaq.disim.business.mutator.km3.OperationMutation;
import it.univaq.disim.business.mutator.km3.PackageMutation;
import it.univaq.disim.business.mutator.km3.ParameterMutation;
import it.univaq.disim.business.mutator.km3.ReferenceMutation;
import it.univaq.disim.business.mutator.km3.StructuralFeatureMutation;
import it.univaq.disim.common.utils.Utils;
import it.univaq.disim.test.Test;

public class EvaluateMutation {
	
	public static void main(String[] args) {
		
		String completeModelInstance = KM3BasicMutator.createCompleteKM3ModelInstance();
		
		/**
		 * CLASS
		 */
		System.out.println("Start CLASS mutations....");
		String class_modelInstance_add = ClassMutation.addInstances();
		String class_modelInstance_remove = ClassMutation.removeInstances();
		System.out.println("Ended CLASS mutations!");
		
		/**
		 * ATTRIBUTE
		 */
		System.out.println("Start ATTRIBUTE mutations....");
		String attribute_modelInstance_add = AttributeMutation.addInstances();
		String attribute_modelInstance_remove = AttributeMutation.removeInstances();
		System.out.println("Ended ATTRIBUTE mutations!");

		/**
		 * DATA TYPE
		 */
		System.out.println("Start DATATYPE mutations....");
		String dataType_modelInstance_add = DataTypeMutation.addInstances();
		String dataType_modelInstance_remove = DataTypeMutation.removeInstances();
		System.out.println("Ended DATATYPE mutations!");

		/**
		 * ENUMERATION
		 */
		System.out.println("Start ENUMERATION mutations....");
		String enumeration_modelInstance_add = EnumerationMutation.addInstances();
		String enumeration_modelInstance_remove = EnumerationMutation.removeInstances();
		System.out.println("Ended ENUMERATION mutations!");

		/**
		 * ENUMLITERAL
		 */
		System.out.println("Start ENUMLITERAL mutations....");
		String enumLiteral_modelInstance_add = EnumLiteralMutation.addInstances();
		String enumLiteral_modelInstance_remove = EnumLiteralMutation.removeInstances();
		System.out.println("Ended ENUMLITERAL mutations!");
		
		/**
		 * METAMODEL
		 */
		System.out.println("Start METAMODEL mutations....");
		String metamodel_modelInstance_add = MetamodelMutation.addInstances();
		String metamodel_modelInstance_remove = MetamodelMutation.removeInstances();
		System.out.println("Ended METAMODEL mutations!");
		
		/**
		 * PACKAGE
		 */
		System.out.println("Start PACKAGE mutations....");
		String package_modelInstance_add = PackageMutation.addInstances();
		String package_modelInstance_remove = PackageMutation.removeInstances();
		System.out.println("Ended PACKAGE mutations!");

		/**
		 * OPERATION
		 */
		System.out.println("Start OPERATION mutations....");
		String operation_modelInstance_add = OperationMutation.addInstances();
		String operation_modelInstance_remove = OperationMutation.removeInstances();
		System.out.println("Ended OPERATION mutations!");
		
		/**
		 * PARAMETER
		 */
		System.out.println("Start PARAMETER mutations....");
		String parameter_modelInstance_add = ParameterMutation.addInstances();
		String parameter_modelInstance_remove = ParameterMutation.removeInstances();
		System.out.println("Ended PARAMETER mutations!");
		
		/**
		 * REFERENCE
		 */
		System.out.println("Start REFERENCE mutations....");
		String reference_modelInstance_add = ReferenceMutation.addInstances();
		String reference_modelInstance_remove = ReferenceMutation.removeInstances();
		System.out.println("Ended REFERENCE mutations!");

		/**
		 * STRUCTURAL FEATURE
		 */
		System.out.println("Start STRUCTURAL FEATURE mutations....");
		String structuralFeature_modelInstance_add = StructuralFeatureMutation.addInstances();
		String structuralFeature_modelInstance_remove = StructuralFeatureMutation.removeInstances();
		System.out.println("Ended STRUCTURAL FEATURE mutations!");
		
		
		List<String> modelInstances = new ArrayList<String>();
		modelInstances.add(completeModelInstance);
		modelInstances.add(class_modelInstance_add);
		modelInstances.add(class_modelInstance_remove);
		modelInstances.add(operation_modelInstance_add);
		modelInstances.add(operation_modelInstance_remove);
		modelInstances.add(attribute_modelInstance_remove);
		modelInstances.add(attribute_modelInstance_add);
		modelInstances.add(parameter_modelInstance_remove);
		modelInstances.add(parameter_modelInstance_add);
		modelInstances.add(package_modelInstance_remove);
		modelInstances.add(package_modelInstance_add);
		modelInstances.add(metamodel_modelInstance_remove);
		modelInstances.add(metamodel_modelInstance_add);
		modelInstances.add(enumLiteral_modelInstance_remove);
		modelInstances.add(enumLiteral_modelInstance_add);
		modelInstances.add(enumeration_modelInstance_remove);
		modelInstances.add(enumeration_modelInstance_add);
		modelInstances.add(dataType_modelInstance_remove);
		modelInstances.add(dataType_modelInstance_add);
		modelInstances.add(reference_modelInstance_add);
		modelInstances.add(reference_modelInstance_remove);
		modelInstances.add(structuralFeature_modelInstance_add);
		modelInstances.add(structuralFeature_modelInstance_remove);
		
		HashMap<String, Float> resultChain1 = new HashMap<String, Float>();
		HashMap<String, Float> resultChain2 = new HashMap<String, Float>();
		HashMap<String, Float> resultChain3 = new HashMap<String, Float>();
		
		for (String model : modelInstances) {
			resultChain1.put(model, (float) Test.testChain1(model));
			resultChain2.put(model, (float) Test.testChain2(model));
			resultChain3.put(model, (float) Test.testChain3(model));
		}
		
		System.out.println("RESULTS:");
		System.out.println("CHAIN 1:");
		for (Entry<String, Float> entry : resultChain1.entrySet()) {
		    String key = entry.getKey();
		    float value = (float) entry.getValue();
		    System.out.println("IL = "+key +" = " + Utils.roundFloatValues(value, 2));
		}
		System.out.println("-------------------------------------------");
		System.out.println("CHAIN 2:");
		for (Entry<String, Float> entry : resultChain2.entrySet()) {
		    String key = entry.getKey();
		    float value = (float) entry.getValue();
		    System.out.println("IL = "+key +" = " + Utils.roundFloatValues(value, 2));
		}
		System.out.println("-------------------------------------------");
		System.out.println("CHAIN 3:");
		for (Entry<String, Float> entry : resultChain3.entrySet()) {
		    String key = entry.getKey();
		    float value = (float) entry.getValue();
		    System.out.println("IL = "+key +" = " + Utils.roundFloatValues(value, 2));
		}
	}
	
}
