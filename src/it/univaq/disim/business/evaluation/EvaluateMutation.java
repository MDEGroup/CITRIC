package it.univaq.disim.business.evaluation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import it.univaq.disim.business.evaluation.mutator.AttributeMutation;
import it.univaq.disim.business.evaluation.mutator.ClassMutation;
import it.univaq.disim.business.evaluation.mutator.DataTypeMutation;
import it.univaq.disim.business.evaluation.mutator.EnumLiteralMutation;
import it.univaq.disim.business.evaluation.mutator.EnumerationMutation;
import it.univaq.disim.business.evaluation.mutator.MetamodelMutation;
import it.univaq.disim.business.evaluation.mutator.OperationMutation;
import it.univaq.disim.business.evaluation.mutator.PackageMutation;
import it.univaq.disim.business.evaluation.mutator.ParameterMutation;
import it.univaq.disim.business.evaluation.mutator.ReferenceMutation;
import it.univaq.disim.business.evaluation.mutator.StructuralFeatureMutation;
import it.univaq.disim.test.Test;

public class EvaluateMutation {
	
	
	public static void main(String[] args) {
		evaluateMutations();
	}
	
	
	public static void evaluateMutations() {
		
//		String completeModelInstance = KM3BasicMutator.createCompleteKM3ModelInstance();
		
		/**
		 * CLASS
		 */
		System.out.println("Start CLASS mutations....");
		String class_modelInstance_supertype_set = ClassMutation.setSupertypes();
		String class_modelInstance_supertype_unset = ClassMutation.unsetSupertypes();
		String class_modelInstance_isAbstract_set = ClassMutation.setIsAbstract();
		String class_modelInstance_isAbstract_unset = ClassMutation.unsetIsAbstract();
		String class_modelInstance_operation_set = ClassMutation.setOperation();
		String class_modelInstance_operation_unset = ClassMutation.unsetOperation();
		String class_modelInstance_structuralFeature_set = ClassMutation.setStructuralFeature();
		String class_modelInstance_structuralFeature_unset = ClassMutation.unsetStructuralFeature();
		String class_modelInstance_name_set = ClassMutation.setName();
		String class_modelInstance_name_unset = ClassMutation.unsetName();
		String class_modelInstance_package_set = ClassMutation.setPackage();
		String class_modelInstance_package_unset = ClassMutation.unsetPackage();
		String class_modelInstance_basic = ClassMutation.basicInstance();
		String class_modelInstance_add = ClassMutation.addInstances();
		String class_modelInstance_remove = ClassMutation.removeInstances();
		System.out.println("Ended CLASS mutations!");
		
		/**
		 * PACKAGE
		 */
		System.out.println("Start PACKAGE mutations....");
		String package_modelInstance_basic = PackageMutation.basicInstance();
		String package_modelInstance_name_set = PackageMutation.setName();
		String package_modelInstance_name_unset = PackageMutation.unsetName();
		String package_modelInstance_contents_set = PackageMutation.setContents();
		String package_modelInstance_contents_unset = PackageMutation.unsetContents();
		String package_modelInstance_metamodel_set = PackageMutation.setMetamodel();
		String package_modelInstance_metamodel_unset = PackageMutation.unsetMetamodel();
		String package_modelInstance_package_set = PackageMutation.setPackage();
		String package_modelInstance_package_unset = PackageMutation.unsetPackage();
		String package_modelInstance_add = PackageMutation.addInstances();
		String package_modelInstance_remove = PackageMutation.removeInstances();
		System.out.println("Ended PACKAGE mutations!");
		
		/**
		 * ATTRIBUTE
		 */
		System.out.println("Start ATTRIBUTE mutations....");
		String attribute_modelInstance_basic = AttributeMutation.basicInstance();
		String attribute_modelInstance_name_set = AttributeMutation.setName();
		String attribute_modelInstance_name_unset = AttributeMutation.unsetName();
		String attribute_modelInstance_lower_set = AttributeMutation.setLower();
		String attribute_modelInstance_lower_unset = AttributeMutation.unsetLower();
		String attribute_modelInstance_upper_set = AttributeMutation.setUpper();
		String attribute_modelInstance_upper_unset = AttributeMutation.unsetUpper();
		String attribute_modelInstance_isOrdered_set = AttributeMutation.setIsOrdered();
		String attribute_modelInstance_isOrdered_unset = AttributeMutation.unsetIsOrdered();
		String attribute_modelInstance_unique_set = AttributeMutation.setUnique();
		String attribute_modelInstance_unique_unset = AttributeMutation.unsetUnique();
		String attribute_modelInstance_type_set = AttributeMutation.setType();
		String attribute_modelInstance_type_unset = AttributeMutation.unsetType();
		String attribute_modelInstance_owner_set = AttributeMutation.setOwner();
		String attribute_modelInstance_owner_unset = AttributeMutation.unsetOwner();
		String attribute_modelInstance_add = AttributeMutation.addInstances();
		String attribute_modelInstance_remove = AttributeMutation.removeInstances();
		System.out.println("Ended ATTRIBUTE mutations!");
		
		/**
		 * REFERENCE
		 */
		System.out.println("Start REFERENCE mutations....");
		String reference_modelInstance_basic = ReferenceMutation.basicInstance();
		String reference_modelInstance_name_set = ReferenceMutation.setName();
		String reference_modelInstance_name_unset = ReferenceMutation.unsetName();
		String reference_modelInstance_lower_set = ReferenceMutation.setLower();
		String reference_modelInstance_lower_unset = ReferenceMutation.unsetLower();
		String reference_modelInstance_upper_set = ReferenceMutation.setUpper();
		String reference_modelInstance_upper_unset = ReferenceMutation.unsetUpper();
		String reference_modelInstance_isUnique_set = ReferenceMutation.setIsUnique();
		String reference_modelInstance_isUnique_unset = ReferenceMutation.unsetIsUnique();
		String reference_modelInstance_isOrdered_set = ReferenceMutation.setIsOrdered();
		String reference_modelInstance_isOrdered_unset = ReferenceMutation.unsetIsOrdered();
		String reference_modelInstance_type_set = ReferenceMutation.setType();
		String reference_modelInstance_type_unset = ReferenceMutation.unsetType();
		String reference_modelInstance_owner_set = ReferenceMutation.setOwner();
		String reference_modelInstance_owner_unset = ReferenceMutation.unsetOwner();
		String reference_modelInstance_isContainer_set = ReferenceMutation.setIsContainer();
		String reference_modelInstance_isContainer_unset = ReferenceMutation.unsetIsContainer();
		String reference_modelInstance_opposite_set = ReferenceMutation.setOpposite();
		String reference_modelInstance_opposite_unset = ReferenceMutation.unsetOpposite();
		String reference_modelInstance_add = ReferenceMutation.addInstances();
		String reference_modelInstance_remove = ReferenceMutation.removeInstances();
		System.out.println("Ended REFERENCE mutations!");
		
		/**
		 * OPERATION
		 */
		System.out.println("Start OPERATION mutations....");
		String operation_modelInstance_basic = OperationMutation.basicInstance();
		String operation_modelInstance_name_set = OperationMutation.setName();
		String operation_modelInstance_name_unset = OperationMutation.unsetName();
		String operation_modelInstance_lower_set = OperationMutation.setLower();
		String operation_modelInstance_lower_unset = OperationMutation.unsetLower();
		String operation_modelInstance_upper_set = OperationMutation.setUpper();
		String operation_modelInstance_upper_unset = OperationMutation.unsetUpper();
		String operation_modelInstance_isUnique_set = OperationMutation.setIsUnique();
		String operation_modelInstance_isUnique_unset = OperationMutation.unsetIsUnique();
		String operation_modelInstance_isOrdered_set = OperationMutation.setIsOrdered();
		String operation_modelInstance_isOrdered_unset = OperationMutation.unsetIsOrdered();
		String operation_modelInstance_type_set = OperationMutation.setType();
		String operation_modelInstance_type_unset = OperationMutation.unsetType();
		String operation_modelInstance_owner_set = OperationMutation.setOwner();
		String operation_modelInstance_owner_unset = OperationMutation.unsetOwner();
		String operation_modelInstance_parameter_set = OperationMutation.setParameter();
		String operation_modelInstance_parameter_unset = OperationMutation.unsetParameter();
		String operation_modelInstance_add = OperationMutation.addInstances();
		String operation_modelInstance_remove = OperationMutation.removeInstances();
		System.out.println("Ended OPERATION mutations!");

		/**
		 * PARAMETER
		 */
		System.out.println("Start PARAMETER mutations....");
		String parameter_modelInstance_basic = ParameterMutation.basicInstance();
		String parameter_modelInstance_name_set = ParameterMutation.setName();
		String parameter_modelInstance_name_unset = ParameterMutation.unsetName();
		String parameter_modelInstance_lower_set = ParameterMutation.setLower();
		String parameter_modelInstance_lower_unset = ParameterMutation.unsetLower();
		String parameter_modelInstance_upper_set = ParameterMutation.setUpper();
		String parameter_modelInstance_upper_unset = ParameterMutation.unsetUpper();
		String parameter_modelInstance_isUnique_set = ParameterMutation.setIsUnique();
		String parameter_modelInstance_isUnique_unset = ParameterMutation.unsetIsUnique();
		String parameter_modelInstance_isOrdered_set = ParameterMutation.setIsOrdered();
		String parameter_modelInstance_isOrdered_unset = ParameterMutation.unsetIsOrdered();
		String parameter_modelInstance_type_set = ParameterMutation.setType();
		String parameter_modelInstance_type_unset = ParameterMutation.unsetType();
		String parameter_modelInstance_owner_set = ParameterMutation.setOwner();
		String parameter_modelInstance_owner_unset = ParameterMutation.unsetOwner();
		String parameter_modelInstance_add = ParameterMutation.addInstances();
		String parameter_modelInstance_remove = ParameterMutation.removeInstances();
		System.out.println("Ended PARAMETER mutations!");
		
		/**
		 * METAMODEL
		 */
		System.out.println("Start METAMODEL mutations....");
		String metamodel_modelInstance_basic = MetamodelMutation.basicInstance();
		String metamodel_modelInstance_location_set = MetamodelMutation.setLocation();
		String metamodel_modelInstance_location_unset = MetamodelMutation.unsetLocation();
		String metamodel_modelInstance_add = MetamodelMutation.addInstances();
		String metamodel_modelInstance_remove = MetamodelMutation.removeInstances();
		System.out.println("Ended METAMODEL mutations!");
		
		/**
		 * ENUMERATION
		 */
		System.out.println("Start ENUMERATION mutations....");
		String enumeration_modelInstance_basic = EnumerationMutation.basicInstance();
		String enumeration_modelInstance_package_set = EnumerationMutation.setPackage();
		String enumeration_modelInstance_package_unset = EnumerationMutation.unsetPackage();
		String enumeration_modelInstance_name_set = EnumerationMutation.setName();
		String enumeration_modelInstance_name_unset = EnumerationMutation.unsetName();
		String enumeration_modelInstance_enum_set = EnumerationMutation.setEnum();
		String enumeration_modelInstance_enum_unset = EnumerationMutation.unsetEnum();
		String enumeration_modelInstance_add = EnumerationMutation.addInstances();
		String enumeration_modelInstance_remove = EnumerationMutation.removeInstances();
		System.out.println("Ended ENUMERATION mutations!");
		
		/**
		 * ENUMLITERAL
		 */
		System.out.println("Start ENUMLITERAL mutations....");
		String enumLiteral_modelInstance_basic = EnumLiteralMutation.basicInstance();
		String enumLiteral_modelInstance_name_set = EnumLiteralMutation.setName();
		String enumLiteral_modelInstance_name_unset = EnumLiteralMutation.unsetName();
		String enumLiteral_modelInstance_package_set = EnumLiteralMutation.setPackage();
		String enumLiteral_modelInstance_package_unset = EnumLiteralMutation.unsetPackage();
		String enumLiteral_modelInstance_enum_set = EnumLiteralMutation.setEnum();
		String enumLiteral_modelInstance_enum_unset = EnumLiteralMutation.unsetEnum();
		String enumLiteral_modelInstance_add = EnumLiteralMutation.addInstances();
		String enumLiteral_modelInstance_remove = EnumLiteralMutation.removeInstances();
		System.out.println("Ended ENUMLITERAL mutations!");
		
		/**
		 * STRUCTURAL FEATURE
		 */
		System.out.println("Start STRUCTURAL FEATURE mutations....");
		String structuralFeature_modelInstance_basic = StructuralFeatureMutation.basciInstance();
		String structuralFeature_modelInstance_package_set = StructuralFeatureMutation.setPackage();
		String structuralFeature_modelInstance_package_unset = StructuralFeatureMutation.unsetPackage();
		String structuralFeature_modelInstance_lower_set = StructuralFeatureMutation.setLower();
		String structuralFeature_modelInstance_lower_unset = StructuralFeatureMutation.unsetLower();
		String structuralFeature_modelInstance_upper_set = StructuralFeatureMutation.setUpper();
		String structuralFeature_modelInstance_upper_unset = StructuralFeatureMutation.unsetUpper();
		String structuralFeature_modelInstance_isOrdered_set = StructuralFeatureMutation.setIsOrdered();
		String structuralFeature_modelInstance_isOrdered_unset = StructuralFeatureMutation.unsetIsOrdered();
		String structuralFeature_modelInstance_isUnique_set = StructuralFeatureMutation.setIsUnique();
		String structuralFeature_modelInstance_isUnique_unset = StructuralFeatureMutation.unsetIsUnique();
		String structuralFeature_modelInstance_type_set = StructuralFeatureMutation.setType();
		String structuralFeature_modelInstance_type_unset = StructuralFeatureMutation.unsetType();
		String structuralFeature_modelInstance_owner_set = StructuralFeatureMutation.setOwner();
		String structuralFeature_modelInstance_owner_unset = StructuralFeatureMutation.unsetOwner();
		String structuralFeature_modelInstance_name_set = StructuralFeatureMutation.setName();
		String structuralFeature_modelInstance_name_unset = StructuralFeatureMutation.unsetName();
		String structuralFeature_modelInstance_add = StructuralFeatureMutation.addInstances();
		String structuralFeature_modelInstance_remove = StructuralFeatureMutation.removeInstances();
		System.out.println("Ended STRUCTURAL FEATURE mutations!");
		
		/**
		 * DATA TYPE
		 */
		System.out.println("Start DATATYPE mutations....");
		String dataType_modelInstance_basic = DataTypeMutation.basicInstance();
		String dataType_modelInstance_package_set = DataTypeMutation.setPackage();
		String dataType_modelInstance_package_unset = DataTypeMutation.unsetPackage();
		String dataType_modelInstance_name_set = DataTypeMutation.setName();
		String dataType_modelInstance_name_unset = DataTypeMutation.unsetName();
		String dataType_modelInstance_add = DataTypeMutation.addInstances();
		String dataType_modelInstance_remove = DataTypeMutation.removeInstances();
		System.out.println("Ended DATATYPE mutations!");
		
		
		
		
		
		List<String> modelInstances = new ArrayList<String>();
		modelInstances.add(class_modelInstance_basic);
		modelInstances.add(class_modelInstance_add);
		modelInstances.add(class_modelInstance_remove);
		modelInstances.add(class_modelInstance_name_set);
		modelInstances.add(class_modelInstance_name_unset);
		modelInstances.add(class_modelInstance_package_set);
		modelInstances.add(class_modelInstance_package_unset);
		modelInstances.add(class_modelInstance_isAbstract_set);
		modelInstances.add(class_modelInstance_isAbstract_unset);
		modelInstances.add(class_modelInstance_structuralFeature_set);
		modelInstances.add(class_modelInstance_structuralFeature_unset);
		modelInstances.add(class_modelInstance_operation_set);
		modelInstances.add(class_modelInstance_operation_unset);
		modelInstances.add(class_modelInstance_supertype_set);
		modelInstances.add(class_modelInstance_supertype_unset);
		
		modelInstances.add(package_modelInstance_package_set);
		modelInstances.add(package_modelInstance_package_unset);
		modelInstances.add(package_modelInstance_metamodel_set);
		modelInstances.add(package_modelInstance_metamodel_unset);
		modelInstances.add(package_modelInstance_contents_set);
		modelInstances.add(package_modelInstance_contents_unset);
		modelInstances.add(package_modelInstance_name_set);
		modelInstances.add(package_modelInstance_name_unset);
		modelInstances.add(package_modelInstance_basic);
		modelInstances.add(package_modelInstance_remove);
		modelInstances.add(package_modelInstance_add);
		
		modelInstances.add(attribute_modelInstance_basic);
		modelInstances.add(attribute_modelInstance_owner_set);
		modelInstances.add(attribute_modelInstance_owner_unset);
		modelInstances.add(attribute_modelInstance_type_set);
		modelInstances.add(attribute_modelInstance_type_unset);
		modelInstances.add(attribute_modelInstance_unique_set);
		modelInstances.add(attribute_modelInstance_unique_unset);
		modelInstances.add(attribute_modelInstance_isOrdered_set);
		modelInstances.add(attribute_modelInstance_isOrdered_unset);
		modelInstances.add(attribute_modelInstance_upper_set);
		modelInstances.add(attribute_modelInstance_upper_unset);
		modelInstances.add(attribute_modelInstance_lower_set);
		modelInstances.add(attribute_modelInstance_lower_unset);
		modelInstances.add(attribute_modelInstance_name_set);
		modelInstances.add(attribute_modelInstance_name_unset);
		modelInstances.add(attribute_modelInstance_add);
		modelInstances.add(attribute_modelInstance_remove);
		
		modelInstances.add(reference_modelInstance_opposite_set);
		modelInstances.add(reference_modelInstance_opposite_unset);
		modelInstances.add(reference_modelInstance_isContainer_set);
		modelInstances.add(reference_modelInstance_isContainer_unset);
		modelInstances.add(reference_modelInstance_owner_set);
		modelInstances.add(reference_modelInstance_owner_unset);
		modelInstances.add(reference_modelInstance_type_set);
		modelInstances.add(reference_modelInstance_type_unset);
		modelInstances.add(reference_modelInstance_isOrdered_set);
		modelInstances.add(reference_modelInstance_isOrdered_unset);
		modelInstances.add(reference_modelInstance_isUnique_set);
		modelInstances.add(reference_modelInstance_isUnique_unset);
		modelInstances.add(reference_modelInstance_upper_set);
		modelInstances.add(reference_modelInstance_upper_unset);
		modelInstances.add(reference_modelInstance_lower_set);
		modelInstances.add(reference_modelInstance_lower_unset);
		modelInstances.add(reference_modelInstance_name_set);
		modelInstances.add(reference_modelInstance_name_unset);
		modelInstances.add(reference_modelInstance_basic);
		modelInstances.add(reference_modelInstance_add);
		modelInstances.add(reference_modelInstance_remove);
		
		modelInstances.add(operation_modelInstance_add);
		modelInstances.add(operation_modelInstance_remove);
		modelInstances.add(operation_modelInstance_name_set);
		modelInstances.add(operation_modelInstance_name_unset);
		modelInstances.add(operation_modelInstance_parameter_set);
		modelInstances.add(operation_modelInstance_parameter_unset);
		modelInstances.add(operation_modelInstance_owner_set);
		modelInstances.add(operation_modelInstance_owner_unset);
		modelInstances.add(operation_modelInstance_type_set);
		modelInstances.add(operation_modelInstance_type_unset);
		modelInstances.add(operation_modelInstance_isOrdered_set);
		modelInstances.add(operation_modelInstance_isOrdered_unset);
		modelInstances.add(operation_modelInstance_isUnique_set);
		modelInstances.add(operation_modelInstance_isUnique_unset);
		modelInstances.add(operation_modelInstance_upper_set);
		modelInstances.add(operation_modelInstance_upper_unset);
		modelInstances.add(operation_modelInstance_lower_set);
		modelInstances.add(operation_modelInstance_lower_unset);
		modelInstances.add(operation_modelInstance_basic);
		
		modelInstances.add(parameter_modelInstance_basic);
		modelInstances.add(parameter_modelInstance_owner_set);
		modelInstances.add(parameter_modelInstance_owner_unset);
		modelInstances.add(parameter_modelInstance_type_set);
		modelInstances.add(parameter_modelInstance_type_unset);
		modelInstances.add(parameter_modelInstance_isOrdered_set);
		modelInstances.add(parameter_modelInstance_isOrdered_unset);
		modelInstances.add(parameter_modelInstance_isUnique_set);
		modelInstances.add(parameter_modelInstance_isUnique_unset);
		modelInstances.add(parameter_modelInstance_upper_set);
		modelInstances.add(parameter_modelInstance_upper_unset);
		modelInstances.add(parameter_modelInstance_lower_set);
		modelInstances.add(parameter_modelInstance_lower_unset);
		modelInstances.add(parameter_modelInstance_name_set);
		modelInstances.add(parameter_modelInstance_name_unset);
		modelInstances.add(parameter_modelInstance_remove);
		modelInstances.add(parameter_modelInstance_add);

		modelInstances.add(metamodel_modelInstance_basic);
		modelInstances.add(metamodel_modelInstance_location_set);
		modelInstances.add(metamodel_modelInstance_location_unset);
		modelInstances.add(metamodel_modelInstance_remove);
		modelInstances.add(metamodel_modelInstance_add);
		
		modelInstances.add(enumeration_modelInstance_enum_set);
		modelInstances.add(enumeration_modelInstance_enum_unset);
		modelInstances.add(enumeration_modelInstance_name_set);
		modelInstances.add(enumeration_modelInstance_name_unset);
		modelInstances.add(enumeration_modelInstance_package_set);
		modelInstances.add(enumeration_modelInstance_package_unset);
		modelInstances.add(enumeration_modelInstance_basic);
		modelInstances.add(enumeration_modelInstance_remove);
		modelInstances.add(enumeration_modelInstance_add);
		
		modelInstances.add(enumLiteral_modelInstance_enum_set);
		modelInstances.add(enumLiteral_modelInstance_enum_unset);
		modelInstances.add(enumLiteral_modelInstance_package_set);
		modelInstances.add(enumLiteral_modelInstance_package_unset);
		modelInstances.add(enumLiteral_modelInstance_name_set);
		modelInstances.add(enumLiteral_modelInstance_name_unset);
		modelInstances.add(enumLiteral_modelInstance_basic);
		modelInstances.add(enumLiteral_modelInstance_remove);
		modelInstances.add(enumLiteral_modelInstance_add);
		
		modelInstances.add(structuralFeature_modelInstance_name_set);
		modelInstances.add(structuralFeature_modelInstance_name_unset);
		modelInstances.add(structuralFeature_modelInstance_owner_set);
		modelInstances.add(structuralFeature_modelInstance_owner_unset);
		modelInstances.add(structuralFeature_modelInstance_type_set);
		modelInstances.add(structuralFeature_modelInstance_type_unset);
		modelInstances.add(structuralFeature_modelInstance_isUnique_set);
		modelInstances.add(structuralFeature_modelInstance_isUnique_unset);
		modelInstances.add(structuralFeature_modelInstance_isOrdered_set);
		modelInstances.add(structuralFeature_modelInstance_isOrdered_unset);
		modelInstances.add(structuralFeature_modelInstance_upper_set);
		modelInstances.add(structuralFeature_modelInstance_upper_unset);
		modelInstances.add(structuralFeature_modelInstance_lower_set);
		modelInstances.add(structuralFeature_modelInstance_lower_unset);
		modelInstances.add(structuralFeature_modelInstance_package_set);
		modelInstances.add(structuralFeature_modelInstance_package_unset);
		modelInstances.add(structuralFeature_modelInstance_basic);
		modelInstances.add(structuralFeature_modelInstance_add);
		modelInstances.add(structuralFeature_modelInstance_remove);
		
		modelInstances.add(dataType_modelInstance_name_set);
		modelInstances.add(dataType_modelInstance_name_unset);
		modelInstances.add(dataType_modelInstance_package_set);
		modelInstances.add(dataType_modelInstance_package_unset);
		modelInstances.add(dataType_modelInstance_basic);
		modelInstances.add(dataType_modelInstance_remove);
		modelInstances.add(dataType_modelInstance_add);
		
		
		
		
		
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
		    System.out.println("IL = "+key +" = " + value);
		}
		System.out.println("-------------------------------------------");
		System.out.println("CHAIN 2:");
		for (Entry<String, Float> entry : resultChain2.entrySet()) {
		    String key = entry.getKey();
		    float value = (float) entry.getValue();
		    System.out.println("IL = "+key +" = " + value);
		}
		System.out.println("-------------------------------------------");
		System.out.println("CHAIN 3:");
		for (Entry<String, Float> entry : resultChain3.entrySet()) {
		    String key = entry.getKey();
		    float value = (float) entry.getValue();
//		    System.out.println("IL = "+key +" = " + Utils.roundFloatValues(value, 2));
		    System.out.println("IL = "+key +" = " + value);
		}
	}
	
	
}
