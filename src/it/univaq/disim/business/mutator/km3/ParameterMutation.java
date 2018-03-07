package it.univaq.disim.business.mutator.km3;

import KM3.Class;
import KM3.DataType;
import KM3.EnumLiteral;
import KM3.Enumeration;
import KM3.KM3Factory;
import KM3.KM3Package;
import KM3.Metamodel;
import KM3.Operation;
import KM3.Parameter;
import it.univaq.disim.business.manager.ModelManager;
import it.univaq.disim.common.utils.Utils;

public class ParameterMutation extends KM3BasicMutator{
	
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
		Operation ownerOperation = createOperation(rootClass, rootClass, false, false);
		
		createParameter(ownerOperation, rootClass, false, false);
		
		
		String outputPath = PARAMETER_PATH + "KM3_Parameter_BASIC.xmi";
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
		Operation ownerOperation = createOperation(rootClass, rootClass, false, false);
		
		Parameter km3Parameter = km3Factory.createParameter();
		 km3Parameter.setName(generateRandomParameter(10));
		 km3Parameter.setPackage(km3Package);
		 km3Parameter.setOwner(ownerOperation);
		 km3Parameter.setType(rootClass);
		 km3Parameter.setLower(1);
		 km3Parameter.setUpper(1);
		 km3Parameter.setIsOrdered(false);
		 km3Parameter.setIsUnique(false);
		 km3Package.getContents().add(km3Parameter);
		
		
		String outputPath = PARAMETER_PATH + "KM3_owner_set.xmi";
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
		Operation ownerOperation = createOperation(rootClass, rootClass, false, false);
		
		Parameter km3Parameter = km3Factory.createParameter();
		km3Parameter.setName(generateRandomParameter(10));
		km3Parameter.setPackage(km3Package);
		km3Parameter.setType(rootClass);
		km3Parameter.setLower(1);
		km3Parameter.setUpper(1);
		km3Parameter.setIsOrdered(false);
		km3Parameter.setIsUnique(false);
		km3Package.getContents().add(km3Parameter);
		
		
		String outputPath = PARAMETER_PATH + "KM3_owner_unset.xmi";
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
		Operation ownerOperation = createOperation(rootClass, rootClass, false, false);
		
		Parameter km3Parameter = km3Factory.createParameter();
		km3Parameter.setName(generateRandomParameter(10));
		km3Parameter.setPackage(km3Package);
		km3Parameter.setOwner(ownerOperation);
		km3Parameter.setType(rootClass);
		km3Parameter.setLower(1);
		km3Parameter.setUpper(1);
		km3Parameter.setIsOrdered(false);
		km3Parameter.setIsUnique(false);
		km3Package.getContents().add(km3Parameter);
		
		
		String outputPath = PARAMETER_PATH + "KM3_type_set.xmi";
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
		Operation ownerOperation = createOperation(rootClass, rootClass, false, false);
		
		Parameter km3Parameter = km3Factory.createParameter();
		km3Parameter.setName(generateRandomParameter(10));
		km3Parameter.setPackage(km3Package);
		km3Parameter.setOwner(ownerOperation);
		km3Parameter.setLower(1);
		km3Parameter.setUpper(1);
		km3Parameter.setIsOrdered(false);
		km3Parameter.setIsUnique(false);
		km3Package.getContents().add(km3Parameter);
		
		
		String outputPath = PARAMETER_PATH + "KM3_type_unset.xmi";
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
		Operation ownerOperation = createOperation(rootClass, rootClass, false, false);
		
		Parameter km3Parameter = km3Factory.createParameter();
		km3Parameter.setName(generateRandomParameter(10));
		km3Parameter.setPackage(km3Package);
		km3Parameter.setOwner(ownerOperation);
		km3Parameter.setType(rootClass);
		km3Parameter.setLower(1);
		km3Parameter.setUpper(1);
		km3Parameter.setIsOrdered(false);
		km3Parameter.setIsUnique(false);
		km3Package.getContents().add(km3Parameter);
		
		
		String outputPath = PARAMETER_PATH + "KM3_isOrdered_set.xmi";
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
		Operation ownerOperation = createOperation(rootClass, rootClass, false, false);
		
		Parameter km3Parameter = km3Factory.createParameter();
		km3Parameter.setName(generateRandomParameter(10));
		km3Parameter.setPackage(km3Package);
		km3Parameter.setOwner(ownerOperation);
		km3Parameter.setType(rootClass);
		km3Parameter.setLower(1);
		km3Parameter.setUpper(1);
		km3Parameter.setIsUnique(false);
		km3Package.getContents().add(km3Parameter);
		
		
		String outputPath = PARAMETER_PATH + "KM3_isOrdered_unset.xmi";
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
		Operation ownerOperation = createOperation(rootClass, rootClass, false, false);
		
		Parameter km3Parameter = km3Factory.createParameter();
		km3Parameter.setName(generateRandomParameter(10));
		km3Parameter.setPackage(km3Package);
		km3Parameter.setOwner(ownerOperation);
		km3Parameter.setType(rootClass);
		km3Parameter.setLower(1);
		km3Parameter.setUpper(1);
		km3Parameter.setIsOrdered(false);
		km3Parameter.setIsUnique(false);
		km3Package.getContents().add(km3Parameter);
		
		
		String outputPath = PARAMETER_PATH + "KM3_isUnique_set.xmi";
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
		Operation ownerOperation = createOperation(rootClass, rootClass, false, false);
		
		Parameter km3Parameter = km3Factory.createParameter();
		km3Parameter.setName(generateRandomParameter(10));
		km3Parameter.setPackage(km3Package);
		km3Parameter.setOwner(ownerOperation);
		km3Parameter.setType(rootClass);
		km3Parameter.setLower(1);
		km3Parameter.setUpper(1);
		km3Parameter.setIsOrdered(false);
		km3Package.getContents().add(km3Parameter);
		
		
		String outputPath = PARAMETER_PATH + "KM3_isUnique_unset.xmi";
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
		Operation ownerOperation = createOperation(rootClass, rootClass, false, false);
		
		Parameter km3Parameter = km3Factory.createParameter();
		km3Parameter.setName(generateRandomParameter(10));
		km3Parameter.setPackage(km3Package);
		km3Parameter.setOwner(ownerOperation);
		km3Parameter.setType(rootClass);
		km3Parameter.setLower(1);
		km3Parameter.setUpper(1);
		km3Parameter.setIsOrdered(false);
		km3Parameter.setIsUnique(false);
		km3Package.getContents().add(km3Parameter);
		
		
		String outputPath = PARAMETER_PATH + "KM3_upper_set.xmi";
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
		Operation ownerOperation = createOperation(rootClass, rootClass, false, false);
		
		Parameter km3Parameter = km3Factory.createParameter();
		km3Parameter.setName(generateRandomParameter(10));
		km3Parameter.setPackage(km3Package);
		km3Parameter.setOwner(ownerOperation);
		km3Parameter.setType(rootClass);
		km3Parameter.setLower(1);
		km3Parameter.setIsOrdered(false);
		km3Parameter.setIsUnique(false);
		km3Package.getContents().add(km3Parameter);
		
		
		String outputPath = PARAMETER_PATH + "KM3_upper_unset.xmi";
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
		Operation ownerOperation = createOperation(rootClass, rootClass, false, false);
		
		Parameter km3Parameter = km3Factory.createParameter();
		km3Parameter.setName(generateRandomParameter(10));
		km3Parameter.setPackage(km3Package);
		km3Parameter.setOwner(ownerOperation);
		km3Parameter.setType(rootClass);
		km3Parameter.setLower(1);
		km3Parameter.setUpper(1);
		km3Parameter.setIsOrdered(false);
		km3Parameter.setIsUnique(false);
		km3Package.getContents().add(km3Parameter);
		
		
		String outputPath = PARAMETER_PATH + "KM3_lower_set.xmi";
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
		Operation ownerOperation = createOperation(rootClass, rootClass, false, false);
		
		Parameter km3Parameter = km3Factory.createParameter();
		km3Parameter.setName(generateRandomParameter(10));
		km3Parameter.setPackage(km3Package);
		km3Parameter.setOwner(ownerOperation);
		km3Parameter.setType(rootClass);
		km3Parameter.setUpper(1);
		km3Parameter.setIsOrdered(false);
		km3Parameter.setIsUnique(false);
		km3Package.getContents().add(km3Parameter);
		
		
		String outputPath = PARAMETER_PATH + "KM3_lower_unset.xmi";
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
		Operation ownerOperation = createOperation(rootClass, rootClass, false, false);
		
		Parameter km3Parameter = km3Factory.createParameter();
		km3Parameter.setName(generateRandomParameter(10));
		km3Parameter.setPackage(km3Package);
		km3Parameter.setOwner(ownerOperation);
		km3Parameter.setType(rootClass);
		km3Parameter.setLower(1);
		km3Parameter.setUpper(1);
		km3Parameter.setIsOrdered(false);
		km3Parameter.setIsUnique(false);
		km3Package.getContents().add(km3Parameter);
		
		
		String outputPath = PARAMETER_PATH + "KM3_name_set.xmi";
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
		Operation ownerOperation = createOperation(rootClass, rootClass, false, false);
		
		Parameter km3Parameter = km3Factory.createParameter();
		km3Parameter.setPackage(km3Package);
		km3Parameter.setOwner(ownerOperation);
		km3Parameter.setType(rootClass);
		km3Parameter.setLower(1);
		km3Parameter.setUpper(1);
		km3Parameter.setIsOrdered(false);
		km3Parameter.setIsUnique(false);
		km3Package.getContents().add(km3Parameter);
		
		
		String outputPath = PARAMETER_PATH + "KM3_name_unset.xmi";
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
		Operation ownerOperation = createOperation(rootClass, rootClass, false, false);
		
		createParameter(ownerOperation, rootClass, false, false);
		
		
		String outputPath = PARAMETER_PATH + "KM3_metaclass_add.xmi";
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
		Operation ownerOperation = createOperation(rootClass, rootClass, false, false);
		
		String outputPath = PARAMETER_PATH + "KM3_metaclass_remove.xmi";
		ModelManager.serializeModelInstance(km3Metamodel, outputPath);
		return outputPath;
	}
}
