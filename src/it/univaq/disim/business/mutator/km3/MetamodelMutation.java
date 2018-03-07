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

public class MetamodelMutation extends KM3BasicMutator{
	
	
	

	public static String basicInstance() {
		KM3Package.eINSTANCE.eClass();
        // Retrieve the default factory singleton
		km3Factory = KM3Factory.eINSTANCE; 
		// create the content of the model via this program
		Metamodel km3Metamodel = km3Factory.createMetamodel();
		km3Metamodel.setLocation(generateRandomMetamodelName(10));
		
		String outputPath = METAMODEL_PATH + "KM3_Metamodel_BASE.xmi";
		ModelManager.serializeModelInstance(km3Metamodel, outputPath);
		return outputPath;
	}
	
	public static String setLocation() {
		KM3Package.eINSTANCE.eClass();
		// Retrieve the default factory singleton
		km3Factory = KM3Factory.eINSTANCE; 
		// create the content of the model via this program
		Metamodel km3Metamodel = km3Factory.createMetamodel();
		km3Metamodel.setLocation(generateRandomMetamodelName(10));
		
		String outputPath = METAMODEL_PATH + "KM3_location_set.xmi";
		ModelManager.serializeModelInstance(km3Metamodel, outputPath);
		return outputPath;
	}
	
	public static String unsetLocation() {
		KM3Package.eINSTANCE.eClass();
		// Retrieve the default factory singleton
		km3Factory = KM3Factory.eINSTANCE; 
		// create the content of the model via this program
		Metamodel km3Metamodel = km3Factory.createMetamodel();
		km3Metamodel.setLocation(generateRandomMetamodelName(10));
		
		String outputPath = METAMODEL_PATH + "KM3_location_unset.xmi";
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
		
		
		
		String outputPath = METAMODEL_PATH + "KM3_metaclass_add.xmi";
		ModelManager.serializeModelInstance(km3Metamodel, outputPath);
		return outputPath;
	}
	
	
	
	
	public static String removeInstances() {
		KM3Package.eINSTANCE.eClass();
        // Retrieve the default factory singleton
		km3Factory = KM3Factory.eINSTANCE; 
		// create the content of the model via this program
		Metamodel km3Metamodel = km3Factory.createMetamodel();
		
		
		String outputPath = METAMODEL_PATH + "KM3_metaclass_remove.xmi";
		ModelManager.serializeModelInstance(km3Metamodel, outputPath);
		return outputPath;
	}
}
