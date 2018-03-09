package it.univaq.disim.business.evaluation.mutator;

import KM3.Attribute;
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

public class AttributeMutation extends KM3BasicMutator{
	
	
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
		Attribute km3Attribute = km3Factory.createAttribute();
		km3Attribute.setName(generateRandomAttributeName(5));
		km3Attribute.setPackage(km3Package);
		km3Attribute.setLower(1);
		km3Attribute.setUpper(1);
		km3Attribute.setIsOrdered(false);
		km3Attribute.setIsUnique(false);
		km3Attribute.setType(rootClass);
		km3Attribute.setOwner(rootClass);
		
		String outputPath = ATTRIBUTE_PATH + "KM3_Attribute_BASE.xmi";
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
		Attribute km3Attribute = km3Factory.createAttribute();
		km3Attribute.setName(generateRandomAttributeName(5));
		km3Attribute.setPackage(km3Package);
		km3Attribute.setLower(1);
		km3Attribute.setUpper(1);
		km3Attribute.setIsOrdered(false);
		km3Attribute.setIsUnique(false);
		km3Attribute.setType(rootClass);
		km3Attribute.setOwner(rootClass);
		
		String outputPath = ATTRIBUTE_PATH + "KM3_owner_set.xmi";
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
		Attribute km3Attribute = km3Factory.createAttribute();
		km3Attribute.setName(generateRandomAttributeName(5));
		km3Attribute.setPackage(km3Package);
		km3Attribute.setLower(1);
		km3Attribute.setUpper(1);
		km3Attribute.setIsOrdered(false);
		km3Attribute.setIsUnique(false);
		km3Attribute.setType(rootClass);
		km3Attribute.setOwner(rootClass);
		
		String outputPath = ATTRIBUTE_PATH + "KM3_owner_unset.xmi";
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
		Attribute km3Attribute = km3Factory.createAttribute();
		km3Attribute.setName(generateRandomAttributeName(5));
		km3Attribute.setPackage(km3Package);
		km3Attribute.setLower(1);
		km3Attribute.setUpper(1);
		km3Attribute.setIsOrdered(false);
		km3Attribute.setIsUnique(false);
		km3Attribute.setType(rootClass);
		km3Attribute.setOwner(rootClass);
		
		String outputPath = ATTRIBUTE_PATH + "KM3_type_set.xmi";
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
		Attribute km3Attribute = km3Factory.createAttribute();
		km3Attribute.setName(generateRandomAttributeName(5));
		km3Attribute.setPackage(km3Package);
		km3Attribute.setLower(1);
		km3Attribute.setUpper(1);
		km3Attribute.setIsOrdered(false);
		km3Attribute.setIsUnique(false);
		km3Attribute.setOwner(rootClass);
		
		String outputPath = ATTRIBUTE_PATH + "KM3_type_unset.xmi";
		ModelManager.serializeModelInstance(km3Metamodel, outputPath);
		return outputPath;
	}
	
	public static String setUnique() {
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
		Attribute km3Attribute = km3Factory.createAttribute();
		km3Attribute.setName(generateRandomAttributeName(5));
		km3Attribute.setPackage(km3Package);
		km3Attribute.setLower(1);
		km3Attribute.setUpper(1);
		km3Attribute.setIsOrdered(false);
		km3Attribute.setIsUnique(false);
		km3Attribute.setType(rootClass);
		km3Attribute.setOwner(rootClass);
		
		String outputPath = ATTRIBUTE_PATH + "KM3_unique_set.xmi";
		ModelManager.serializeModelInstance(km3Metamodel, outputPath);
		return outputPath;
	}
	
	public static String unsetUnique() {
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
		Attribute km3Attribute = km3Factory.createAttribute();
		km3Attribute.setName(generateRandomAttributeName(5));
		km3Attribute.setPackage(km3Package);
		km3Attribute.setLower(1);
		km3Attribute.setUpper(1);
		km3Attribute.setIsOrdered(false);
		km3Attribute.setType(rootClass);
		km3Attribute.setOwner(rootClass);
		
		String outputPath = ATTRIBUTE_PATH + "KM3_unique_unset.xmi";
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
		Attribute km3Attribute = km3Factory.createAttribute();
		km3Attribute.setName(generateRandomAttributeName(5));
		km3Attribute.setPackage(km3Package);
		km3Attribute.setLower(1);
		km3Attribute.setUpper(1);
		km3Attribute.setIsOrdered(false);
		km3Attribute.setIsUnique(false);
		km3Attribute.setType(rootClass);
		km3Attribute.setOwner(rootClass);
		
		String outputPath = ATTRIBUTE_PATH + "KM3_ordered_set.xmi";
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
		Attribute km3Attribute = km3Factory.createAttribute();
		km3Attribute.setName(generateRandomAttributeName(5));
		km3Attribute.setPackage(km3Package);
		km3Attribute.setLower(1);
		km3Attribute.setUpper(1);
		km3Attribute.setIsUnique(false);
		km3Attribute.setType(rootClass);
		km3Attribute.setOwner(rootClass);
		
		String outputPath = ATTRIBUTE_PATH + "KM3_ordered_unset.xmi";
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
		Attribute km3Attribute = km3Factory.createAttribute();
		km3Attribute.setName(generateRandomAttributeName(5));
		km3Attribute.setPackage(km3Package);
		km3Attribute.setLower(1);
		km3Attribute.setUpper(1);
		km3Attribute.setIsOrdered(false);
		km3Attribute.setIsUnique(false);
		km3Attribute.setType(rootClass);
		km3Attribute.setOwner(rootClass);
		
		String outputPath = ATTRIBUTE_PATH + "KM3_upper_set.xmi";
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
		Attribute km3Attribute = km3Factory.createAttribute();
		km3Attribute.setName(generateRandomAttributeName(5));
		km3Attribute.setPackage(km3Package);
		km3Attribute.setLower(1);
		km3Attribute.setIsOrdered(false);
		km3Attribute.setIsUnique(false);
		km3Attribute.setType(rootClass);
		km3Attribute.setOwner(rootClass);
		
		String outputPath = ATTRIBUTE_PATH + "KM3_upper_unset.xmi";
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
		Attribute km3Attribute = km3Factory.createAttribute();
		km3Attribute.setName(generateRandomAttributeName(5));
		km3Attribute.setPackage(km3Package);
		km3Attribute.setLower(1);
		km3Attribute.setUpper(1);
		km3Attribute.setIsOrdered(false);
		km3Attribute.setIsUnique(false);
		km3Attribute.setType(rootClass);
		km3Attribute.setOwner(rootClass);
		
		String outputPath = ATTRIBUTE_PATH + "KM3_lower_set.xmi";
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
		Attribute km3Attribute = km3Factory.createAttribute();
		km3Attribute.setName(generateRandomAttributeName(5));
		km3Attribute.setPackage(km3Package);
		km3Attribute.setUpper(1);
		km3Attribute.setIsOrdered(false);
		km3Attribute.setIsUnique(false);
		km3Attribute.setType(rootClass);
		km3Attribute.setOwner(rootClass);
		
		String outputPath = ATTRIBUTE_PATH + "KM3_lower_unset.xmi";
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
		Attribute km3Attribute = km3Factory.createAttribute();
		km3Attribute.setName(generateRandomAttributeName(5));
		km3Attribute.setPackage(km3Package);
		km3Attribute.setLower(1);
		km3Attribute.setUpper(1);
		km3Attribute.setIsOrdered(false);
		km3Attribute.setIsUnique(false);
		km3Attribute.setType(rootClass);
		km3Attribute.setOwner(rootClass);
		
		String outputPath = ATTRIBUTE_PATH + "KM3_name_set.xmi";
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
		Attribute km3Attribute = km3Factory.createAttribute();
		km3Attribute.setPackage(km3Package);
		km3Attribute.setLower(1);
		km3Attribute.setUpper(1);
		km3Attribute.setIsOrdered(false);
		km3Attribute.setIsUnique(false);
		km3Attribute.setType(rootClass);
		km3Attribute.setOwner(rootClass);
		
		String outputPath = ATTRIBUTE_PATH + "KM3_name_unset.xmi";
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
		createAttribute(rootClass, rootClass, 1, 1, false, false);
		
		String outputPath = ATTRIBUTE_PATH + "KM3_metaclass_add.xmi";
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
		
		
		String outputPath = ATTRIBUTE_PATH + "KM3_metaclass_remove.xmi";
		ModelManager.serializeModelInstance(km3Metamodel, outputPath);
		return outputPath;
	}
}
