package it.univaq.disim.business.mutator.km3;

import KM3.Class;
import KM3.KM3Factory;
import KM3.KM3Package;
import KM3.Metamodel;
import KM3.StructuralFeature;
import it.univaq.disim.business.manager.ModelManager;
import it.univaq.disim.common.utils.Utils;

public class StructuralFeatureMutation extends KM3BasicMutator{
	
	

	public static String basciInstance() {
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
		createStructuralFeatures(rootClass, rootClass, false, false);
		
		String outputPath = STRUCTURAL_FEATURE_PATH + "KM3_StructuralFeature_BASE.xmi";
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
		StructuralFeature km3StructuralFeature = km3Factory.createStructuralFeature();
		km3StructuralFeature.setName(generateRandomStructuralFeature(10));
		km3StructuralFeature.setPackage(km3Package);
		km3StructuralFeature.setOwner(rootClass);
		km3StructuralFeature.setType(rootClass);
		km3StructuralFeature.setLower(1);
		km3StructuralFeature.setUpper(1);
		km3StructuralFeature.setIsOrdered(false);
		km3StructuralFeature.setIsUnique(false);
		km3Package.getContents().add(km3StructuralFeature);
		
		String outputPath = STRUCTURAL_FEATURE_PATH + "KM3_name_set.xmi";
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
		StructuralFeature km3StructuralFeature = km3Factory.createStructuralFeature();
		km3StructuralFeature.setName(generateRandomStructuralFeature(10));
		km3StructuralFeature.setPackage(km3Package);
		km3StructuralFeature.setOwner(rootClass);
		km3StructuralFeature.setType(rootClass);
		km3StructuralFeature.setLower(1);
		km3StructuralFeature.setUpper(1);
		km3StructuralFeature.setIsOrdered(false);
		km3StructuralFeature.setIsUnique(false);
		km3Package.getContents().add(km3StructuralFeature);
		
		String outputPath = STRUCTURAL_FEATURE_PATH + "KM3_owner_set.xmi";
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
		StructuralFeature km3StructuralFeature = km3Factory.createStructuralFeature();
		km3StructuralFeature.setName(generateRandomStructuralFeature(10));
		km3StructuralFeature.setPackage(km3Package);
		km3StructuralFeature.setType(rootClass);
		km3StructuralFeature.setLower(1);
		km3StructuralFeature.setUpper(1);
		km3StructuralFeature.setIsOrdered(false);
		km3StructuralFeature.setIsUnique(false);
		km3Package.getContents().add(km3StructuralFeature);
		
		String outputPath = STRUCTURAL_FEATURE_PATH + "KM3_owner_unset.xmi";
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
		StructuralFeature km3StructuralFeature = km3Factory.createStructuralFeature();
		km3StructuralFeature.setName(generateRandomStructuralFeature(10));
		km3StructuralFeature.setPackage(km3Package);
		km3StructuralFeature.setOwner(rootClass);
		km3StructuralFeature.setType(rootClass);
		km3StructuralFeature.setLower(1);
		km3StructuralFeature.setUpper(1);
		km3StructuralFeature.setIsOrdered(false);
		km3StructuralFeature.setIsUnique(false);
		km3Package.getContents().add(km3StructuralFeature);
		
		String outputPath = STRUCTURAL_FEATURE_PATH + "KM3_type_set.xmi";
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
		StructuralFeature km3StructuralFeature = km3Factory.createStructuralFeature();
		km3StructuralFeature.setName(generateRandomStructuralFeature(10));
		km3StructuralFeature.setPackage(km3Package);
		km3StructuralFeature.setOwner(rootClass);
		km3StructuralFeature.setLower(1);
		km3StructuralFeature.setUpper(1);
		km3StructuralFeature.setIsOrdered(false);
		km3StructuralFeature.setIsUnique(false);
		km3Package.getContents().add(km3StructuralFeature);
		
		String outputPath = STRUCTURAL_FEATURE_PATH + "KM3_type_unset.xmi";
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
		StructuralFeature km3StructuralFeature = km3Factory.createStructuralFeature();
		km3StructuralFeature.setName(generateRandomStructuralFeature(10));
		km3StructuralFeature.setPackage(km3Package);
		km3StructuralFeature.setOwner(rootClass);
		km3StructuralFeature.setType(rootClass);
		km3StructuralFeature.setLower(1);
		km3StructuralFeature.setUpper(1);
		km3StructuralFeature.setIsOrdered(false);
		km3StructuralFeature.setIsUnique(false);
		km3Package.getContents().add(km3StructuralFeature);
		
		String outputPath = STRUCTURAL_FEATURE_PATH + "KM3_isUnique_set.xmi";
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
		StructuralFeature km3StructuralFeature = km3Factory.createStructuralFeature();
		km3StructuralFeature.setName(generateRandomStructuralFeature(10));
		km3StructuralFeature.setPackage(km3Package);
		km3StructuralFeature.setOwner(rootClass);
		km3StructuralFeature.setType(rootClass);
		km3StructuralFeature.setLower(1);
		km3StructuralFeature.setUpper(1);
		km3StructuralFeature.setIsOrdered(false);
		km3Package.getContents().add(km3StructuralFeature);
		
		String outputPath = STRUCTURAL_FEATURE_PATH + "KM3_isUnique_unset.xmi";
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
		StructuralFeature km3StructuralFeature = km3Factory.createStructuralFeature();
		km3StructuralFeature.setName(generateRandomStructuralFeature(10));
		km3StructuralFeature.setPackage(km3Package);
		km3StructuralFeature.setOwner(rootClass);
		km3StructuralFeature.setType(rootClass);
		km3StructuralFeature.setLower(1);
		km3StructuralFeature.setUpper(1);
		km3StructuralFeature.setIsOrdered(false);
		km3StructuralFeature.setIsUnique(false);
		km3Package.getContents().add(km3StructuralFeature);
		
		String outputPath = STRUCTURAL_FEATURE_PATH + "KM3_isOrdered_set.xmi";
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
		StructuralFeature km3StructuralFeature = km3Factory.createStructuralFeature();
		km3StructuralFeature.setName(generateRandomStructuralFeature(10));
		km3StructuralFeature.setPackage(km3Package);
		km3StructuralFeature.setOwner(rootClass);
		km3StructuralFeature.setType(rootClass);
		km3StructuralFeature.setLower(1);
		km3StructuralFeature.setUpper(1);
		km3StructuralFeature.setIsUnique(false);
		km3Package.getContents().add(km3StructuralFeature);
		
		String outputPath = STRUCTURAL_FEATURE_PATH + "KM3_isOrdered_unset.xmi";
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
		StructuralFeature km3StructuralFeature = km3Factory.createStructuralFeature();
		km3StructuralFeature.setName(generateRandomStructuralFeature(10));
		km3StructuralFeature.setPackage(km3Package);
		km3StructuralFeature.setOwner(rootClass);
		km3StructuralFeature.setType(rootClass);
		km3StructuralFeature.setLower(1);
		km3StructuralFeature.setUpper(1);
		km3StructuralFeature.setIsOrdered(false);
		km3StructuralFeature.setIsUnique(false);
		km3Package.getContents().add(km3StructuralFeature);
		
		String outputPath = STRUCTURAL_FEATURE_PATH + "KM3_upper_set.xmi";
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
		StructuralFeature km3StructuralFeature = km3Factory.createStructuralFeature();
		km3StructuralFeature.setName(generateRandomStructuralFeature(10));
		km3StructuralFeature.setPackage(km3Package);
		km3StructuralFeature.setOwner(rootClass);
		km3StructuralFeature.setType(rootClass);
		km3StructuralFeature.setLower(1);
		km3StructuralFeature.setIsOrdered(false);
		km3StructuralFeature.setIsUnique(false);
		km3Package.getContents().add(km3StructuralFeature);
		
		String outputPath = STRUCTURAL_FEATURE_PATH + "KM3_upper_unset.xmi";
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
		StructuralFeature km3StructuralFeature = km3Factory.createStructuralFeature();
		km3StructuralFeature.setName(generateRandomStructuralFeature(10));
		km3StructuralFeature.setPackage(km3Package);
		km3StructuralFeature.setOwner(rootClass);
		km3StructuralFeature.setType(rootClass);
		km3StructuralFeature.setLower(1);
		km3StructuralFeature.setUpper(1);
		km3StructuralFeature.setIsOrdered(false);
		km3StructuralFeature.setIsUnique(false);
		km3Package.getContents().add(km3StructuralFeature);
		
		String outputPath = STRUCTURAL_FEATURE_PATH + "KM3_lower_set.xmi";
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
		StructuralFeature km3StructuralFeature = km3Factory.createStructuralFeature();
		km3StructuralFeature.setName(generateRandomStructuralFeature(10));
		km3StructuralFeature.setPackage(km3Package);
		km3StructuralFeature.setOwner(rootClass);
		km3StructuralFeature.setType(rootClass);
		km3StructuralFeature.setUpper(1);
		km3StructuralFeature.setIsOrdered(false);
		km3StructuralFeature.setIsUnique(false);
		km3Package.getContents().add(km3StructuralFeature);
		
		String outputPath = STRUCTURAL_FEATURE_PATH + "KM3_lower_unset.xmi";
		ModelManager.serializeModelInstance(km3Metamodel, outputPath);
		return outputPath;
	}
	
	public static String setPackage() {
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
		StructuralFeature km3StructuralFeature = km3Factory.createStructuralFeature();
		km3StructuralFeature.setName(generateRandomStructuralFeature(10));
		km3StructuralFeature.setPackage(km3Package);
		km3StructuralFeature.setOwner(rootClass);
		km3StructuralFeature.setType(rootClass);
		km3StructuralFeature.setLower(1);
		km3StructuralFeature.setUpper(1);
		km3StructuralFeature.setIsOrdered(false);
		km3StructuralFeature.setIsUnique(false);
		km3Package.getContents().add(km3StructuralFeature);
		
		String outputPath = STRUCTURAL_FEATURE_PATH + "KM3_package_set.xmi";
		ModelManager.serializeModelInstance(km3Metamodel, outputPath);
		return outputPath;
	}
	
	public static String unsetPackage() {
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
		StructuralFeature km3StructuralFeature = km3Factory.createStructuralFeature();
		km3StructuralFeature.setName(generateRandomStructuralFeature(10));
		km3StructuralFeature.setOwner(rootClass);
		km3StructuralFeature.setType(rootClass);
		km3StructuralFeature.setLower(1);
		km3StructuralFeature.setUpper(1);
		km3StructuralFeature.setIsOrdered(false);
		km3StructuralFeature.setIsUnique(false);
		km3Package.getContents().add(km3StructuralFeature);
		
		String outputPath = STRUCTURAL_FEATURE_PATH + "KM3_package_unset.xmi";
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
		StructuralFeature km3StructuralFeature = km3Factory.createStructuralFeature();
		km3StructuralFeature.setPackage(km3Package);
		km3StructuralFeature.setOwner(rootClass);
		km3StructuralFeature.setType(rootClass);
		km3StructuralFeature.setLower(1);
		km3StructuralFeature.setUpper(1);
		km3StructuralFeature.setIsOrdered(false);
		km3StructuralFeature.setIsUnique(false);
		km3Package.getContents().add(km3StructuralFeature);
		
		String outputPath = STRUCTURAL_FEATURE_PATH + "KM3_name_unset.xmi";
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
		createStructuralFeatures(rootClass, rootClass, false, false);
		
		String outputPath = STRUCTURAL_FEATURE_PATH + "KM3_metaclass_add.xmi";
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
		
		String outputPath = STRUCTURAL_FEATURE_PATH + "KM3_metaclass_remove.xmi";
		ModelManager.serializeModelInstance(km3Metamodel, outputPath);
		return outputPath;
	}
}
