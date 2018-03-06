package it.univaq.disim.business.mutator.km3;

import KM3.Class;
import KM3.DataType;
import KM3.EnumLiteral;
import KM3.Enumeration;
import KM3.KM3Factory;
import KM3.KM3Package;
import KM3.Metamodel;
import KM3.Operation;
import it.univaq.disim.business.manager.ModelManager;
import it.univaq.disim.common.utils.Utils;

public class ClassMutation extends KM3BasicMutator{
	
	public static void main(String[] args) {
		System.out.println("Start mutations....");
		addInstances();
		removeInstances();
		System.out.println("Ended mutations!");
	}
	
	

	public static String addInstances() {
		KM3Package.eINSTANCE.eClass();
        // Retrieve the default factory singleton
		km3Factory = KM3Factory.eINSTANCE; 
		// create the content of the model via this program
		Metamodel km3Metamodel = km3Factory.createMetamodel();
		km3Metamodel.setLocation(generateRandomMetamodelName(10));
		
		km3Package = km3Factory.createPackage();
		km3Package.setName(generateRandomPackageName(10));
		km3Package.setMetamodel(km3Metamodel);
		km3Package.setLocation(Utils.generateRandomString(5));
		km3Package.setPackage(km3Package);
		
		DataType stringDataType = createStringDataType();
		
		Enumeration enumeration = createEnumeration();
		EnumLiteral createEnumLiteral = createEnumLiteral(enumeration);
		
		Class rootClass = createClass(false, null);
		createAttribute(rootClass, stringDataType, 1, 1, false, false);
		createReference(rootClass, stringDataType, false, null);
		Operation ownerOperation = createOperation(rootClass, stringDataType, false, false);
		
		createParameter(ownerOperation, stringDataType, false, false);
		createStructuralFeatures(rootClass, stringDataType, false, false);
		
		
		
		while(N_BASIC_INSTANCES_TO_ADD > 0) {
			createClass(false, null);
			Enumeration enumerationTmp = createEnumeration();
			EnumLiteral createEnumLiteralTmp = createEnumLiteral(enumeration);
			DataType stringDataTypeTmp = createStringDataType();
			createAttribute(rootClass, stringDataType, 1, 1, false, false);
			createReference(rootClass, stringDataType, false, null);
			Operation opTmp = createOperation(rootClass, stringDataType, false, false);
			
			createParameter(opTmp, stringDataType, false, false);
			createStructuralFeatures(rootClass, stringDataType, false, false);
			N_BASIC_INSTANCES_TO_ADD--;
		}
		
		
		
		while(N_INSTANCES_TO_ADD > 0) {
			createClass(false, null);
			N_INSTANCES_TO_ADD--;
		}
		
		String outputPath = CLASS_PATH + "KM3_metaclass_add.xmi";
		ModelManager.serializeModelInstance(km3Metamodel, outputPath);
		return outputPath;
	}
	
	
	
	
	public static String removeInstances() {
		KM3Package.eINSTANCE.eClass();
        // Retrieve the default factory singleton
		km3Factory = KM3Factory.eINSTANCE; 
		// create the content of the model via this program
		Metamodel km3Metamodel = km3Factory.createMetamodel();
		km3Metamodel.setLocation(generateRandomMetamodelName(10));
		
		
		km3Package = km3Factory.createPackage();
		km3Package.setName(generateRandomPackageName(10));
		km3Package.setMetamodel(km3Metamodel);
		km3Package.setLocation(Utils.generateRandomString(5));
		km3Package.setPackage(km3Package);
		
		DataType stringDataType = createStringDataType();
		
		Enumeration enumeration = createEnumeration();
		EnumLiteral createEnumLiteral = createEnumLiteral(enumeration);
		
		Class rootClass = createClass(false, null);
		createAttribute(rootClass, stringDataType, 1, 1, false, false);
		createReference(rootClass, stringDataType, false, null);
		Operation ownerOperation = createOperation(rootClass, stringDataType, false, false);
		
		createParameter(ownerOperation, stringDataType, false, false);
		createStructuralFeatures(rootClass, stringDataType, false, false);
		
		
		
		while(N_BASIC_INSTANCES_TO_ADD > 0) {
			
			//REMOVED CLASSES ADDED HERE
//			createClass(false, null);
			Enumeration enumerationTmp = createEnumeration();
			EnumLiteral createEnumLiteralTmp = createEnumLiteral(enumeration);
			DataType stringDataTypeTmp = createStringDataType();
			createAttribute(rootClass, stringDataType, 1, 1, false, false);
			createReference(rootClass, stringDataType, false, null);
			Operation opTmp = createOperation(rootClass, stringDataType, false, false);
			
			createParameter(opTmp, stringDataType, false, false);
			createStructuralFeatures(rootClass, stringDataType, false, false);
			N_BASIC_INSTANCES_TO_ADD--;
		}
		
		
		String outputPath = CLASS_PATH + "KM3_metaclass_remove.xmi";
		ModelManager.serializeModelInstance(km3Metamodel, outputPath);
		return outputPath;
	}
}
