package it.univaq.disim.business.mutator.km3_mutations;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.Resource;

import KM3.Attribute;
import KM3.Class;
import KM3.Classifier;
import KM3.DataType;
import KM3.EnumLiteral;
import KM3.Enumeration;
import KM3.KM3Factory;
import KM3.KM3Package;
import KM3.Metamodel;
import KM3.Package;
import KM3.Reference;
import it.univaq.disim.business.manager.ModelManager;
import it.univaq.disim.common.utils.Utils;

public class KM3ModelInstanceCreator {
	
	private static KM3Factory km3Factory;
	private static Package km3Package;
	private int NUMBER_OF_MUTATIONS;
	private static String baseMutationsPath = "resources/mutations/";
	
	public KM3ModelInstanceCreator(int numberOfMutations) {
		KM3Package.eINSTANCE.eClass();
        // Retrieve the default factory singleton
		km3Factory = KM3Factory.eINSTANCE; 
		this.NUMBER_OF_MUTATIONS = numberOfMutations;
	}
	
	
	public static void main(String[] args) throws IOException {
		
		KM3ModelInstanceCreator km3Creator = new KM3ModelInstanceCreator(5);
//		String outputPath = km3Creator.baseMutationsPath + "KM3_seed.xmi";
//		Resource model = km3Creator.createSeedModel(outputPath);
		List<Resource> models = km3Creator.generateInstances();
		
		
		
		for (Resource model : models) {
			List<EClass> allModelEClasses = ModelManager.getAllModelEClasses(model);
			for (EClass eClass : allModelEClasses) {
				System.out.println(eClass.getName());
			}
		}

	}
	
	public List<Resource> generateInstances() {
		List<Resource> resources = new ArrayList<Resource>();
		for(int i=0; i<=this.NUMBER_OF_MUTATIONS; i++) {
			Resource model = createKM3Model();
			resources.add(model);
		}
		
		return resources;
	}
	

	public Resource createKM3Model() {
		
		// create the content of the model via this program
		Metamodel km3Metamodel = km3Factory.createMetamodel();
		km3Metamodel.setLocation(generateRandomMetamodelName(10));
		
		km3Package = createPackage(km3Metamodel);
		DataType dataTypeString = createStringDataType();
		DataType dataTypeInteger = createIntegerDataType();
		DataType dataTypeBoolean = createBooleanDataType();
		Enumeration enumeration = createEnumeration();
		EnumLiteral enumLit_1 = createEnumLiteral(enumeration);
		EnumLiteral enumLit_2 = createEnumLiteral(enumeration);
		Class class1 = createClass(true, null);
			Attribute attribute1 = createAttribute(class1, dataTypeString, 1, 1, false, false);
		Class class2 = createClass(true, null);
			Attribute attribute2 = createAttribute(class2, dataTypeInteger, 1, 1, false, false);
			
		List<Class> superTypeClasses = new ArrayList<Class>();
		superTypeClasses.add(class1);
		Class class3 = createClass(true, superTypeClasses);
			Attribute attribute3 = createAttribute(class3, enumeration, 1, 1, false, false);
			Reference ref1 = createReference(class3, dataTypeString, false, null);
		
		superTypeClasses.add(class2);
		Class class4 = createClass(true, superTypeClasses);
			Attribute attribute4 = createAttribute(class4, dataTypeBoolean, 1, 1, false, false);
			
		
		return saveModelInstance(km3Metamodel); 
	}
	
	static Resource saveModelInstance(Metamodel metamodel) {
		return ModelManager.serializeModelInstance(metamodel, generateRandomOutputModelFileName(10)); 
	}
	
	static Package createPackage(Metamodel km3Metamodel) {
		Package km3Package = km3Factory.createPackage();
		km3Package.setName(generateRandomPackageName(10));
		km3Package.setMetamodel(km3Metamodel);
		km3Package.setLocation(Utils.generateRandomString(5));
		km3Package.setPackage(km3Package);
		return km3Package;
	}

	 static Reference createReference(Class owner, Classifier type, boolean isContainer, Reference opposite) {
		Reference km3Reference = km3Factory.createReference();
		km3Reference.setName(generateRandomReferenceName(10));
		km3Reference.setPackage(km3Package);
		km3Reference.setOwner(owner);
		km3Reference.setType(type);
		km3Reference.setLower(1);
		km3Reference.setUpper(1);
		km3Reference.setIsContainer(isContainer);
		if(opposite != null) {
			km3Reference.setOpposite(opposite);
		}else {
			km3Reference.setOpposite(km3Reference);
		}
		km3Package.getContents().add(km3Reference);
		return km3Reference;
	}
	
	 static DataType createStringDataType() {
		DataType km3DataTypeString = km3Factory.createDataType();
		km3DataTypeString.setPackage(km3Package);
		km3DataTypeString.setName("String");
		km3Package.getContents().add(km3DataTypeString);
		return km3DataTypeString;
	}
	 static DataType createIntegerDataType() {
		DataType km3DataTypeInteger = km3Factory.createDataType();
		km3DataTypeInteger.setPackage(km3Package);
		km3DataTypeInteger.setName("Integer");
		km3Package.getContents().add(km3DataTypeInteger);
		return km3DataTypeInteger;
	}
	 static DataType createBooleanDataType() {
		DataType km3DataTypeBoolean = km3Factory.createDataType();
		km3DataTypeBoolean.setPackage(km3Package);
		km3DataTypeBoolean.setName("Boolean");
		km3Package.getContents().add(km3DataTypeBoolean);
		return km3DataTypeBoolean;
	}
	
	 static Enumeration createEnumeration() {
		Enumeration km3Enumeration = km3Factory.createEnumeration();
		km3Enumeration.setName(generateRandomEnumerationName(10));
		km3Enumeration.setPackage(km3Package);
		km3Package.getContents().add(km3Enumeration);
		return km3Enumeration;
	}
	
	 static EnumLiteral createEnumLiteral(Enumeration km3Enumeration) {
		EnumLiteral km3EnumLiteral = km3Factory.createEnumLiteral();
		km3EnumLiteral.setName(generateRandomEnumLiteralName(10));
		km3EnumLiteral.setPackage(km3Package);
		km3EnumLiteral.setEnum(km3Enumeration);
		km3Package.getContents().add(km3EnumLiteral);
		return km3EnumLiteral;
	}
	
	static Class createClass(boolean isAbstract, List<Class> km3ClassSupertypes) {
		Class km3Class = km3Factory.createClass();
		km3Class.setName(generateRandomClassName(10));
		km3Class.setPackage(km3Package);
		km3Class.setIsAbstract(isAbstract);
		km3Package.getContents().add(km3Class);
		if(km3ClassSupertypes != null) {
			km3Class.getSupertypes().addAll(km3ClassSupertypes);
		}
		return km3Class;
	}
	
	static Attribute createAttribute(Class owner, Classifier km3DataType, int lower, int upper, boolean isOrdered, boolean isUnique) {
		Attribute km3Attribute = km3Factory.createAttribute();
		km3Attribute.setName(generateRandomAttributeName(5));
		km3Attribute.setPackage(km3Package);
		km3Attribute.setLower(lower);
		km3Attribute.setUpper(upper);
		km3Attribute.setIsOrdered(isOrdered);
		km3Attribute.setIsUnique(isUnique);
		km3Attribute.setType(km3DataType);
		km3Attribute.setOwner(owner);
		return km3Attribute;
	}
	
	static String generateRandomOutputModelFileName(int len) {
		return baseMutationsPath+"km3_instance_"+Utils.generateRandomString(len)+".xmi";
	}
	
	static String generateRandomClassName(int len) {
		return "class_"+Utils.generateRandomString(len);
	}
	
	static String generateRandomReferenceName(int len) {
		return "reference_"+Utils.generateRandomString(len);
	}
	
	static String generateRandomAttributeName(int len) {
		return "attribute_"+Utils.generateRandomString(len);
	}
	
	static String generateRandomPackageName(int len) {
		return "package_"+Utils.generateRandomString(len);
	}
	
	static String generateRandomMetamodelName(int len) {
		return "Metamodel_"+Utils.generateRandomString(len);
	}
	
	static String generateRandomEnumerationName(int len) {
		return "enumeration_"+Utils.generateRandomString(len);
	}
	
	static String generateRandomEnumLiteralName(int len) {
		return "enum_literal_"+Utils.generateRandomString(len);
	}
	static String generateRandomStructuralFeature(int len) {
		return "structural_feature_"+Utils.generateRandomString(len);
	}
	static String generateRandomParameter(int len) {
		return "parameter_"+Utils.generateRandomString(len);
	}
	

	public Resource createSeedModel(String outputPath) {
//		KM3Package.eINSTANCE.eClass();
//        // Retrieve the default factory singleton
//		KM3Factory km3Factory = KM3Factory.eINSTANCE; 
		
		// create the content of the model via this program
		Metamodel km3Metamodel = km3Factory.createMetamodel();
		km3Metamodel.setLocation("SampleMM");
		
		Package km3Package = km3Factory.createPackage();
		km3Package.setName("Sample");
		km3Package.setMetamodel(km3Metamodel);
		km3Package.setLocation("33");
		km3Package.setPackage(km3Package);
		
		
		DataType km3DataTypeString = km3Factory.createDataType();
		km3DataTypeString.setPackage(km3Package);
		km3DataTypeString.setName("String");
		km3Package.getContents().add(km3DataTypeString);
		
		DataType km3DataTypeInteger = km3Factory.createDataType();
		km3DataTypeInteger.setName("Integer");
		km3DataTypeInteger.setPackage(km3Package);
		km3Package.getContents().add(km3DataTypeInteger);

		DataType km3DataTypeBoolean = km3Factory.createDataType();
		km3DataTypeBoolean.setName("Boolean");
		km3DataTypeBoolean.setPackage(km3Package);
		km3Package.getContents().add(km3DataTypeBoolean);
		
		Enumeration km3Enumeration = km3Factory.createEnumeration();
		km3Enumeration.setName("Kind");
		km3Enumeration.setPackage(km3Package);
		km3Package.getContents().add(km3Enumeration);
		
		EnumLiteral km3EnumLiteral_1 = km3Factory.createEnumLiteral();
		km3EnumLiteral_1.setName("firstKind");
		km3EnumLiteral_1.setPackage(km3Package);
		km3EnumLiteral_1.setEnum(km3Enumeration);
		km3Package.getContents().add(km3EnumLiteral_1);
		
		EnumLiteral km3EnumLiteral_2 = km3Factory.createEnumLiteral();
		km3EnumLiteral_2.setName("secondKind");
		km3EnumLiteral_2.setPackage(km3Package);
		km3EnumLiteral_2.setEnum(km3Enumeration);
		km3Package.getContents().add(km3EnumLiteral_2);
		
		Class km3ClassA = km3Factory.createClass();
		km3ClassA.setName("A");
		km3ClassA.setPackage(km3Package);
		km3ClassA.setIsAbstract(true);
		km3Package.getContents().add(km3ClassA);
		
			Attribute km3AttributeA = km3Factory.createAttribute();
			km3AttributeA.setName("a attribute");
			km3AttributeA.setPackage(km3Package);
			km3AttributeA.setIsOrdered(false);
			km3AttributeA.setIsUnique(false);
			km3AttributeA.setLower(1);
			km3AttributeA.setUpper(1);
			km3AttributeA.setType(km3DataTypeString);
			km3AttributeA.setOwner(km3ClassA);
		
		Class km3ClassB = km3Factory.createClass();
		km3ClassB.setName("B");
		km3ClassB.setPackage(km3Package);
		km3ClassB.setIsAbstract(false);
		km3Package.getContents().add(km3ClassB);

			Attribute km3AttributeB = km3Factory.createAttribute();
			km3AttributeB.setName("b attribute");
			km3AttributeB.setPackage(km3Package);
			km3AttributeB.setIsOrdered(false);
			km3AttributeB.setIsUnique(false);
			km3AttributeB.setLower(1);
			km3AttributeB.setUpper(1);
			km3AttributeB.setType(km3Enumeration);
			km3AttributeB.setOwner(km3ClassB);
			
		
		Class km3ClassC = km3Factory.createClass();
		km3ClassC.setName("C");
		km3ClassC.setPackage(km3Package);
		km3ClassC.setIsAbstract(false);
		List<Class> km3ClassCSupertypesList = new ArrayList<Class>();
		km3ClassCSupertypesList.add(km3ClassA);
		km3ClassC.getSupertypes().addAll(km3ClassCSupertypesList); 
		km3Package.getContents().add(km3ClassC);
		
			Attribute km3AttributeC = km3Factory.createAttribute();
			km3AttributeC.setName("c attribute");
			km3AttributeC.setPackage(km3Package);
			km3AttributeC.setIsOrdered(false);
			km3AttributeC.setIsUnique(false);
			km3AttributeC.setLower(1);
			km3AttributeC.setUpper(1);
			km3AttributeC.setType(km3DataTypeInteger);
			km3AttributeC.setOwner(km3ClassC);
		
		
		Class km3ClassD = km3Factory.createClass();
		km3ClassD.setName("D");
		km3ClassD.setPackage(km3Package);
		km3ClassD.setIsAbstract(false);
		List<Class> km3ClassDSupertypesList = new ArrayList<Class>();
		km3ClassDSupertypesList.add(km3ClassA);
		km3ClassDSupertypesList.add(km3ClassB);
		km3ClassD.getSupertypes().addAll(km3ClassDSupertypesList); 
		km3Package.getContents().add(km3ClassD);
		
			Attribute km3AttributeD = km3Factory.createAttribute();
			km3AttributeD.setName("d attribute");
			km3AttributeD.setPackage(km3Package);
			km3AttributeD.setIsOrdered(false);
			km3AttributeD.setIsUnique(false);
			km3AttributeD.setLower(1);
			km3AttributeD.setUpper(1);
			km3AttributeD.setType(km3DataTypeBoolean);
			km3AttributeD.setOwner(km3ClassD);
	    
			return ModelManager.serializeModelInstance(km3Metamodel, outputPath); 
			
	}
	

}
