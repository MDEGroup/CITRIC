package it.univaq.disim.business.mutator.km3;

import KM3.Class;
import KM3.DataType;
import KM3.KM3Factory;
import KM3.KM3Package;
import KM3.Metamodel;
import it.univaq.disim.business.manager.ModelManager;
import it.univaq.disim.common.utils.Utils;

public class AttributeMutation extends KM3BasicMutator{
	
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
		
		DataType km3DataTypeString = km3Factory.createDataType();
		km3DataTypeString.setPackage(km3Package);
		km3DataTypeString.setName("String");
		km3Package.getContents().add(km3DataTypeString);
		
		Class rootClass = createClass(false, null);
		
		while(N_INSTANCES_TO_ADD > 0) {
			createAttribute(rootClass, km3DataTypeString, 1, 1, false, false);
			N_INSTANCES_TO_ADD--;
		}
		
		String outputPath = ATTRIBUTE_PATH + "KM3_add.xmi";
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
		
		DataType km3DataTypeString = km3Factory.createDataType();
		km3DataTypeString.setPackage(km3Package);
		km3DataTypeString.setName("String");
		km3Package.getContents().add(km3DataTypeString);
		
		Class rootClass = createClass(false, null);
		
		
		String outputPath = ATTRIBUTE_PATH + "KM3_remove.xmi";
		ModelManager.serializeModelInstance(km3Metamodel, outputPath);
		return outputPath;
	}
}
