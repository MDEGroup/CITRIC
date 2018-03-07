package it.univaq.disim.business.mutator.km3;

import KM3.DataType;
import KM3.Enumeration;
import KM3.KM3Factory;
import KM3.KM3Package;
import KM3.Metamodel;
import it.univaq.disim.business.manager.ModelManager;
import it.univaq.disim.common.utils.Utils;

public class EnumerationMutation extends KM3BasicMutator{
	

	
	

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
		
		
		Enumeration enumeration = createEnumeration();
		
		
		String outputPath = ENUMERATION_PATH + "KM3_Enumeration_BASE.xmi";
		ModelManager.serializeModelInstance(km3Metamodel, outputPath);
		return outputPath;
	}
	
	public static String setEnum() {
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
		
		
		Enumeration km3Enumeration = km3Factory.createEnumeration();
		km3Enumeration.setName((generateRandomEnumerationName(10)));
		km3Enumeration.setPackage(km3Package);
		km3Package.getContents().add(km3Enumeration);
		
		createEnumLiteral(km3Enumeration);
		
		
		String outputPath = ENUMERATION_PATH + "KM3_enum_set.xmi";
		ModelManager.serializeModelInstance(km3Metamodel, outputPath);
		return outputPath;
	}
	
	public static String unsetEnum() {
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
		
		
		Enumeration km3Enumeration = km3Factory.createEnumeration();
		km3Enumeration.setName((generateRandomEnumerationName(10)));
		km3Enumeration.setPackage(km3Package);
		km3Package.getContents().add(km3Enumeration);
		
		String outputPath = ENUMERATION_PATH + "KM3_enum_unset.xmi";
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
		
		
		Enumeration km3Enumeration = km3Factory.createEnumeration();
		km3Enumeration.setName((generateRandomEnumerationName(10)));
		km3Enumeration.setPackage(km3Package);
		km3Package.getContents().add(km3Enumeration);
		
		
		String outputPath = ENUMERATION_PATH + "KM3_package_set.xmi";
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
		
		
		Enumeration km3Enumeration = km3Factory.createEnumeration();
		km3Enumeration.setName((generateRandomEnumerationName(10)));
		km3Package.getContents().add(km3Enumeration);
		
		
		String outputPath = ENUMERATION_PATH + "KM3_package_unset.xmi";
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
		
		
		Enumeration km3Enumeration = km3Factory.createEnumeration();
		km3Enumeration.setName((generateRandomEnumerationName(10)));
		km3Enumeration.setPackage(km3Package);
		km3Package.getContents().add(km3Enumeration);
		
		
		String outputPath = ENUMERATION_PATH + "KM3_name_set.xmi";
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
		
		
		Enumeration km3Enumeration = km3Factory.createEnumeration();
		km3Enumeration.setPackage(km3Package);
		km3Package.getContents().add(km3Enumeration);
		
		
		String outputPath = ENUMERATION_PATH + "KM3_name_unset.xmi";
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
		
		Enumeration enumeration = createEnumeration();
		
		
		String outputPath = ENUMERATION_PATH + "KM3_metaclass_add.xmi";
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
		
		
		String outputPath = ENUMERATION_PATH + "KM3_metaclass_remove.xmi";
		ModelManager.serializeModelInstance(km3Metamodel, outputPath);
		return outputPath;
	}
}
