package it.univaq.disim.business.mutator.km3;

import java.util.List;

import KM3.Attribute;
import KM3.Class;
import KM3.Classifier;
import KM3.DataType;
import KM3.EnumLiteral;
import KM3.Enumeration;
import KM3.KM3Factory;
import KM3.KM3Package;
import KM3.Metamodel;
import KM3.Operation;
import KM3.Package;
import KM3.Parameter;
import KM3.Reference;
import KM3.StructuralFeature;
import it.univaq.disim.business.manager.ModelManager;
import it.univaq.disim.common.utils.Utils;

public abstract class KM3BasicMutator {
	
	
	protected static int N_INSTANCES_TO_ADD = 100;
	protected static int N_BASIC_INSTANCES_TO_ADD = 5;
	
	public static String basicMutationPath = "resources/running_example/models/mutations/";
	public static String CLASS_PATH = 				basicMutationPath +	"Class/";
	public static String ATTRIBUTE_PATH = 			basicMutationPath +	"Attribute/";
	public static String CLASSIFIER_PATH = 			basicMutationPath +	"Classifier/";
	public static String DATATYPE_PATH = 			basicMutationPath +	"DataType/";
	public static String ENUMERATION_PATH = 			basicMutationPath +	"Enumeration/";
	public static String ENUMLITERAL_PATH = 			basicMutationPath +	"EnumLiteral/";
	public static String METAMODEL_PATH = 			basicMutationPath +	"Metamodel/";
	public static String OPERATION_PATH = 			basicMutationPath +	"Operation/";
	public static String PACKAGE_PATH = 				basicMutationPath +	"Package/";
	public static String PARAMETER_PATH = 			basicMutationPath +	"Parameter/";
	public static String REFERENCE_PATH = 			basicMutationPath +	"Reference/";
	public static String STRUCTURAL_FEATURE_PATH = 	basicMutationPath +	"StructuralFeature/";
	
	private static String COMPLETE_MODEL_PATH = "resources/running_example/models/mutations/KM3_complete.xmi";
	private static final String SEED_MODEL_PATH = "resources/running_example/models/Sample-km3/sample-km3.xmi";;
	
	protected static KM3Factory km3Factory;
	protected static Package km3Package;
	
	
	public static void main(String[] args) {
		createSeed();
	}
	
	public static String createCompleteKM3ModelInstance() {
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

		
		
		
		String outputPath = COMPLETE_MODEL_PATH;
		ModelManager.serializeModelInstance(km3Metamodel, outputPath);
		return outputPath;
	}
	
	public static String createSeed() {
		KM3Package.eINSTANCE.eClass();
		// Retrieve the default factory singleton
		km3Factory = KM3Factory.eINSTANCE; 
		// create the content of the model via this program
		Metamodel km3Metamodel = km3Factory.createMetamodel();
		km3Metamodel.setLocation("KM3 Metamodel");
		
		km3Package = km3Factory.createPackage();
		km3Package.setName("KM3 Package");
		km3Package.setMetamodel(km3Metamodel);
		km3Package.setLocation(Utils.generateRandomString(5));
		km3Package.setPackage(km3Package);
		
		DataType stringDataType = createStringDataType();
		stringDataType.setPackage(km3Package);
		stringDataType.setName("String");
		km3Package.getContents().add(stringDataType);
		
		Class rootClass = km3Factory.createClass();
		rootClass.setName(("Root Class"));
		rootClass.setPackage(km3Package);
		rootClass.setIsAbstract(false);
		km3Package.getContents().add(rootClass);
		
		
		int countClass = 0;
		while(countClass < 6) {
			Class km3Class = km3Factory.createClass();
			km3Class.setName(("Class_"+countClass));
			km3Class.setPackage(km3Package);
			km3Class.setIsAbstract(false);
			km3Package.getContents().add(km3Class);
			countClass++;
		}

		Operation ownerOperation = createOperation(rootClass, stringDataType, false, false);
		
		int countOpANDPar = 95;
		while(countOpANDPar > 0) {
			createParameter(ownerOperation, stringDataType, false, false);
			createOperation(rootClass, stringDataType, false, false);
			countOpANDPar--;
		}
		
		String outputPath = SEED_MODEL_PATH;
		ModelManager.serializeModelInstance(km3Metamodel, outputPath);
		return outputPath;
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
	
	 static Reference createReference(Class owner, Classifier type, boolean isContainer, Reference opposite) {
			Reference km3Reference = km3Factory.createReference();
			km3Reference.setName(generateRandomReferenceName(10));
			km3Reference.setPackage(km3Package);
			if(owner != null) {
				km3Reference.setOwner(owner);
			}
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
	 
	 static StructuralFeature createStructuralFeatures(Class owner, Classifier type, boolean isOrdered, boolean isUnique) {
		 StructuralFeature km3StructuralFeature = km3Factory.createStructuralFeature();
		 km3StructuralFeature.setName(generateRandomStructuralFeature(10));
		 km3StructuralFeature.setPackage(km3Package);
		 if(owner != null) {
			 km3StructuralFeature.setOwner(owner);
		 }
		 km3StructuralFeature.setType(type);
		 km3StructuralFeature.setLower(1);
		 km3StructuralFeature.setUpper(1);
		 km3StructuralFeature.setIsOrdered(isOrdered);
		 km3StructuralFeature.setIsUnique(isUnique);
		 km3Package.getContents().add(km3StructuralFeature);
		 return km3StructuralFeature;
	 }
	 
	 static Parameter createParameter(Operation ownerOperation, Classifier type, boolean isOrdered, boolean isUnique) {
		 Parameter km3Parameter = km3Factory.createParameter();
		 km3Parameter.setName(generateRandomParameter(10));
		 km3Parameter.setPackage(km3Package);
		 if(ownerOperation != null) {
			 km3Parameter.setOwner(ownerOperation);
		 }
		 km3Parameter.setType(type);
		 km3Parameter.setLower(1);
		 km3Parameter.setUpper(1);
		 km3Parameter.setIsOrdered(isOrdered);
		 km3Parameter.setIsUnique(isUnique);
		 km3Package.getContents().add(km3Parameter);
		 return km3Parameter;
	 }
	 
	 static Operation createOperation(Class owner, Classifier type, boolean isOrdered, boolean isUnique) {
		 Operation km3Operation = km3Factory.createOperation();
		 km3Operation.setName(generateRandomParameter(10));
		 km3Operation.setPackage(km3Package);
		 if(owner != null) {
			 km3Operation.setOwner(owner);
		 }
		 km3Operation.setType(type);
		 km3Operation.setLower(1);
		 km3Operation.setUpper(1);
		 km3Operation.setIsOrdered(isOrdered);
		 km3Operation.setIsUnique(isUnique);
		 km3Package.getContents().add(km3Operation);
		 return km3Operation;
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
			km3Enumeration.setName((generateRandomEnumerationName(10)));
			km3Enumeration.setPackage(km3Package);
			km3Package.getContents().add(km3Enumeration);
			return km3Enumeration;
		}
		
		 static EnumLiteral createEnumLiteral(Enumeration km3Enumeration) {
			EnumLiteral km3EnumLiteral = km3Factory.createEnumLiteral();
			km3EnumLiteral.setName((generateRandomEnumLiteralName(10)));
			km3EnumLiteral.setPackage(km3Package);
			km3EnumLiteral.setEnum(km3Enumeration);
			km3Package.getContents().add(km3EnumLiteral);
			return km3EnumLiteral;
		}
		
		static Class createClass(boolean isAbstract, List<Class> km3ClassSupertypes) {
			Class km3Class = km3Factory.createClass();
			km3Class.setName((generateRandomClassName(10)));
			km3Class.setPackage(km3Package);
			km3Class.setIsAbstract(isAbstract);
			km3Package.getContents().add(km3Class);
			if(km3ClassSupertypes != null) {
				km3Class.getSupertypes().addAll(km3ClassSupertypes);
			}
			return km3Class;
		}
		
		
		public static Metamodel createBasicKM3Structure() {
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
			
			DataType km3DataTypeInteger = km3Factory.createDataType();
			km3DataTypeInteger.setPackage(km3Package);
			km3DataTypeInteger.setName("Integer");
			km3Package.getContents().add(km3DataTypeInteger);
			
			DataType km3DataTypeBoolean = km3Factory.createDataType();
			km3DataTypeBoolean.setPackage(km3Package);
			km3DataTypeBoolean.setName("Boolean");
			km3Package.getContents().add(km3DataTypeBoolean);
			
			Enumeration km3Enumeration = km3Factory.createEnumeration();
			km3Enumeration.setName(generateRandomEnumerationName(10));
			km3Enumeration.setPackage(km3Package);
			km3Package.getContents().add(km3Enumeration);
			
			EnumLiteral km3EnumLiteral1 = km3Factory.createEnumLiteral();
			km3EnumLiteral1.setName(generateRandomEnumLiteralName(10));
			km3EnumLiteral1.setPackage(km3Package);
			km3EnumLiteral1.setEnum(km3Enumeration);
			km3Package.getContents().add(km3EnumLiteral1);
			
			EnumLiteral km3EnumLiteral2 = km3Factory.createEnumLiteral();
			km3EnumLiteral2.setName(generateRandomEnumLiteralName(10));
			km3EnumLiteral2.setPackage(km3Package);
			km3EnumLiteral2.setEnum(km3Enumeration);
			km3Package.getContents().add(km3EnumLiteral2);
			
			return km3Metamodel;
		}
		
		static String generateRandomOutputModelFileName(int len) {
			return basicMutationPath+"km3_instance_"+Utils.generateRandomString(len)+".xmi";
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

}
