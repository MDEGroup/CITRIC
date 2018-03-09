package it.univaq.disim.business.evaluation.mutator;

import KM3.Class;
import KM3.DataType;
import KM3.EnumLiteral;
import KM3.Enumeration;
import KM3.KM3Factory;
import KM3.KM3Package;
import KM3.Metamodel;
import KM3.Operation;
import KM3.Reference;
import it.univaq.disim.business.manager.ModelManager;
import it.univaq.disim.common.utils.Utils;

public class OperationMutation extends KM3BasicMutator{
	
	public static String basicInstance() {
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
		
		Class rootClass = createClass(false, null);
		Operation km3Operation = km3Factory.createOperation();
		 km3Operation.setName(generateRandomParameter(10));
		 km3Operation.setPackage(km3Package);
		 km3Operation.setOwner(rootClass);
		 km3Operation.setType(rootClass);
		 km3Operation.setLower(1);
		 km3Operation.setUpper(1);
		 km3Operation.setIsOrdered(false);
		 km3Operation.setIsUnique(false);
		 km3Package.getContents().add(km3Operation);
		
		String outputPath = OPERATION_PATH + "KM3_Operation_BASE.xmi";
		ModelManager.serializeModelInstance(km3Metamodel, outputPath);
		return outputPath;
	}
	
	public static String setName() {
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
		
		Class rootClass = createClass(false, null);
		Operation km3Operation = km3Factory.createOperation();
		km3Operation.setName(generateRandomParameter(10));
		km3Operation.setPackage(km3Package);
		km3Operation.setOwner(rootClass);
		km3Operation.setType(rootClass);
		km3Operation.setLower(1);
		km3Operation.setUpper(1);
		km3Operation.setIsOrdered(false);
		km3Operation.setIsUnique(false);
		km3Package.getContents().add(km3Operation);

		String outputPath = OPERATION_PATH + "KM3_name_set.xmi";
		ModelManager.serializeModelInstance(km3Metamodel, outputPath);
		return outputPath;
	}
	
	public static String unsetName() {
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
		
		Class rootClass = createClass(false, null);
		Operation km3Operation = km3Factory.createOperation();
		km3Operation.setPackage(km3Package);
		km3Operation.setOwner(rootClass);
		km3Operation.setType(rootClass);
		km3Operation.setLower(1);
		km3Operation.setUpper(1);
		km3Operation.setIsOrdered(false);
		km3Operation.setIsUnique(false);
		km3Package.getContents().add(km3Operation);
		
		
		String outputPath = OPERATION_PATH + "KM3_name_unset.xmi";
		ModelManager.serializeModelInstance(km3Metamodel, outputPath);
		return outputPath;
	}
	
	public static String setParameter() {
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
		
		Class rootClass = createClass(false, null);
		Operation km3Operation = km3Factory.createOperation();
		km3Operation.setName(generateRandomParameter(10));
		km3Operation.setPackage(km3Package);
		km3Operation.setOwner(rootClass);
		km3Operation.setType(rootClass);
		km3Operation.setLower(1);
		km3Operation.setUpper(1);
		km3Operation.setIsOrdered(false);
		km3Operation.setIsUnique(false);
		km3Package.getContents().add(km3Operation);
		
		createParameter(km3Operation, rootClass, false, false);
		
		String outputPath = OPERATION_PATH + "KM3_parameter_set.xmi";
		ModelManager.serializeModelInstance(km3Metamodel, outputPath);
		return outputPath;
	}
	
	public static String unsetParameter() {
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
		
		Class rootClass = createClass(false, null);
		Operation km3Operation = km3Factory.createOperation();
		km3Operation.setName(generateRandomParameter(10));
		km3Operation.setPackage(km3Package);
		km3Operation.setOwner(rootClass);
		km3Operation.setType(rootClass);
		km3Operation.setLower(1);
		km3Operation.setUpper(1);
		km3Operation.setIsOrdered(false);
		km3Operation.setIsUnique(false);
		km3Package.getContents().add(km3Operation);
		
		
		String outputPath = OPERATION_PATH + "KM3_parameter_unset.xmi";
		ModelManager.serializeModelInstance(km3Metamodel, outputPath);
		return outputPath;
	}
	
	public static String setOwner() {
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
		
		Class rootClass = createClass(false, null);
		Operation km3Operation = km3Factory.createOperation();
		km3Operation.setName(generateRandomParameter(10));
		km3Operation.setPackage(km3Package);
		km3Operation.setOwner(rootClass);
		km3Operation.setType(rootClass);
		km3Operation.setLower(1);
		km3Operation.setUpper(1);
		km3Operation.setIsOrdered(false);
		km3Operation.setIsUnique(false);
		km3Package.getContents().add(km3Operation);
		
		String outputPath = OPERATION_PATH + "KM3_owner_set.xmi";
		ModelManager.serializeModelInstance(km3Metamodel, outputPath);
		return outputPath;
	}
	
	public static String unsetOwner() {
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
		
		Class rootClass = createClass(false, null);
		Operation km3Operation = km3Factory.createOperation();
		km3Operation.setName(generateRandomParameter(10));
		km3Operation.setPackage(km3Package);
		km3Operation.setType(rootClass);
		km3Operation.setLower(1);
		km3Operation.setUpper(1);
		km3Operation.setIsOrdered(false);
		km3Operation.setIsUnique(false);
		km3Package.getContents().add(km3Operation);
		
		String outputPath = OPERATION_PATH + "KM3_owner_unset.xmi";
		ModelManager.serializeModelInstance(km3Metamodel, outputPath);
		return outputPath;
	}
	
	public static String setType() {
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
		
		Class rootClass = createClass(false, null);
		Operation km3Operation = km3Factory.createOperation();
		km3Operation.setName(generateRandomParameter(10));
		km3Operation.setPackage(km3Package);
		km3Operation.setOwner(rootClass);
		km3Operation.setType(rootClass);
		km3Operation.setLower(1);
		km3Operation.setUpper(1);
		km3Operation.setIsOrdered(false);
		km3Operation.setIsUnique(false);
		km3Package.getContents().add(km3Operation);
		
		String outputPath = OPERATION_PATH + "KM3_type_set.xmi";
		ModelManager.serializeModelInstance(km3Metamodel, outputPath);
		return outputPath;
	}
	
	public static String unsetType() {
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
		
		Class rootClass = createClass(false, null);
		Operation km3Operation = km3Factory.createOperation();
		km3Operation.setName(generateRandomParameter(10));
		km3Operation.setPackage(km3Package);
		km3Operation.setOwner(rootClass);
		km3Operation.setLower(1);
		km3Operation.setUpper(1);
		km3Operation.setIsOrdered(false);
		km3Operation.setIsUnique(false);
		km3Package.getContents().add(km3Operation);
		
		String outputPath = OPERATION_PATH + "KM3_type_unset.xmi";
		ModelManager.serializeModelInstance(km3Metamodel, outputPath);
		return outputPath;
	}
	
	public static String setIsOrdered() {
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
		
		Class rootClass = createClass(false, null);
		Operation km3Operation = km3Factory.createOperation();
		km3Operation.setName(generateRandomParameter(10));
		km3Operation.setPackage(km3Package);
		km3Operation.setOwner(rootClass);
		km3Operation.setType(rootClass);
		km3Operation.setLower(1);
		km3Operation.setUpper(1);
		km3Operation.setIsOrdered(false);
		km3Operation.setIsUnique(false);
		km3Package.getContents().add(km3Operation);
		
		String outputPath = OPERATION_PATH + "KM3_isOrdered_set.xmi";
		ModelManager.serializeModelInstance(km3Metamodel, outputPath);
		return outputPath;
	}
	
	public static String unsetIsOrdered() {
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
		
		Class rootClass = createClass(false, null);
		Operation km3Operation = km3Factory.createOperation();
		km3Operation.setName(generateRandomParameter(10));
		km3Operation.setPackage(km3Package);
		km3Operation.setOwner(rootClass);
		km3Operation.setType(rootClass);
		km3Operation.setLower(1);
		km3Operation.setUpper(1);
		km3Operation.setIsUnique(false);
		km3Package.getContents().add(km3Operation);
		
		String outputPath = OPERATION_PATH + "KM3_isOrdered_unset.xmi";
		ModelManager.serializeModelInstance(km3Metamodel, outputPath);
		return outputPath;
	}
	
	public static String setIsUnique() {
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
		
		Class rootClass = createClass(false, null);
		Operation km3Operation = km3Factory.createOperation();
		km3Operation.setName(generateRandomParameter(10));
		km3Operation.setPackage(km3Package);
		km3Operation.setOwner(rootClass);
		km3Operation.setType(rootClass);
		km3Operation.setLower(1);
		km3Operation.setUpper(1);
		km3Operation.setIsOrdered(false);
		km3Operation.setIsUnique(false);
		km3Package.getContents().add(km3Operation);
		
		String outputPath = OPERATION_PATH + "KM3_isUnique_set.xmi";
		ModelManager.serializeModelInstance(km3Metamodel, outputPath);
		return outputPath;
	}
	
	public static String unsetIsUnique() {
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
		
		Class rootClass = createClass(false, null);
		Operation km3Operation = km3Factory.createOperation();
		km3Operation.setName(generateRandomParameter(10));
		km3Operation.setPackage(km3Package);
		km3Operation.setOwner(rootClass);
		km3Operation.setType(rootClass);
		km3Operation.setLower(1);
		km3Operation.setUpper(1);
		km3Operation.setIsOrdered(false);
		km3Package.getContents().add(km3Operation);
		
		String outputPath = OPERATION_PATH + "KM3_isUnique_unset.xmi";
		ModelManager.serializeModelInstance(km3Metamodel, outputPath);
		return outputPath;
	}
	
	public static String setUpper() {
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
		
		Class rootClass = createClass(false, null);
		Operation km3Operation = km3Factory.createOperation();
		km3Operation.setName(generateRandomParameter(10));
		km3Operation.setPackage(km3Package);
		km3Operation.setOwner(rootClass);
		km3Operation.setType(rootClass);
		km3Operation.setLower(1);
		km3Operation.setUpper(1);
		km3Operation.setIsOrdered(false);
		km3Operation.setIsUnique(false);
		km3Package.getContents().add(km3Operation);
		
		String outputPath = OPERATION_PATH + "KM3_upper_set.xmi";
		ModelManager.serializeModelInstance(km3Metamodel, outputPath);
		return outputPath;
	}
	
	public static String unsetUpper() {
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
		
		Class rootClass = createClass(false, null);
		Operation km3Operation = km3Factory.createOperation();
		km3Operation.setName(generateRandomParameter(10));
		km3Operation.setPackage(km3Package);
		km3Operation.setOwner(rootClass);
		km3Operation.setType(rootClass);
		km3Operation.setLower(1);
		km3Operation.setIsOrdered(false);
		km3Operation.setIsUnique(false);
		km3Package.getContents().add(km3Operation);
		
		String outputPath = OPERATION_PATH + "KM3_upper_unset.xmi";
		ModelManager.serializeModelInstance(km3Metamodel, outputPath);
		return outputPath;
	}
	
	public static String setLower() {
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
		
		Class rootClass = createClass(false, null);
		Operation km3Operation = km3Factory.createOperation();
		km3Operation.setName(generateRandomParameter(10));
		km3Operation.setPackage(km3Package);
		km3Operation.setOwner(rootClass);
		km3Operation.setType(rootClass);
		km3Operation.setLower(1);
		km3Operation.setUpper(1);
		km3Operation.setIsOrdered(false);
		km3Operation.setIsUnique(false);
		km3Package.getContents().add(km3Operation);
		
		String outputPath = OPERATION_PATH + "KM3_lower_set.xmi";
		ModelManager.serializeModelInstance(km3Metamodel, outputPath);
		return outputPath;
	}
	
	public static String unsetLower() {
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
		
		Class rootClass = createClass(false, null);
		Operation km3Operation = km3Factory.createOperation();
		km3Operation.setName(generateRandomParameter(10));
		km3Operation.setPackage(km3Package);
		km3Operation.setOwner(rootClass);
		km3Operation.setType(rootClass);
		km3Operation.setUpper(1);
		km3Operation.setIsOrdered(false);
		km3Operation.setIsUnique(false);
		km3Package.getContents().add(km3Operation);
		
		String outputPath = OPERATION_PATH + "KM3_lower_unset.xmi";
		ModelManager.serializeModelInstance(km3Metamodel, outputPath);
		return outputPath;
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
		
		Class rootClass = createClass(false, null);
		Operation km3Operation = km3Factory.createOperation();
		 km3Operation.setName(generateRandomParameter(10));
		 km3Operation.setPackage(km3Package);
		 km3Operation.setOwner(rootClass);
		 km3Operation.setType(rootClass);
		 km3Operation.setLower(1);
		 km3Operation.setUpper(1);
		 km3Operation.setIsOrdered(false);
		 km3Operation.setIsUnique(false);
		 km3Package.getContents().add(km3Operation);
		
		String outputPath = OPERATION_PATH + "KM3_metaclass_add.xmi";
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
		
		Class rootClass = createClass(false, null);
		
		
		String outputPath = OPERATION_PATH + "KM3_metaclass_remove.xmi";
		ModelManager.serializeModelInstance(km3Metamodel, outputPath);
		return outputPath;
	}
}
