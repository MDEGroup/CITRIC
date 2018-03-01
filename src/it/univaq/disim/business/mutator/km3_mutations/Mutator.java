package it.univaq.disim.business.mutator.km3_mutations;

import java.util.ArrayList;
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
import it.univaq.disim.business.calculations.InformationLoss;
import it.univaq.disim.business.datamodel.Transformation;
import it.univaq.disim.business.manager.ModelManager;
import it.univaq.disim.common.utils.Utils;
import org.eclipse.emf.ecore.resource.Resource;

public class Mutator {
	
	private static KM3Factory km3Factory;
	private static Package km3Package;
	
	private static int N_CLASSES = 10;
	private static int N_ATTRIBUTES_FOR_CLASS = 10;
	private static int N_REFERENCES_FOR_CLASS = 10;
	private static int N_REFERENCES = 10;
	private static int N_OPERATIONS = 10;
	private static int N_PARAMETERS = 10;
	private static int N_ENUMERATIONS = 10;
	private static int N_ENUM_LITERAL = 10;
	private static int N_STRUCTURAL_FEATURES_FOR_CLASS = 10;
	private static int N_STRUCTURAL_FEATURES = 10;
	private static int N_DATATYPE = 10;

	public static void main(String[] args) {
		String inputMetamodelPath = "resources/running_example/metamodels/KM3.ecore";
		String atlTransformation = "resources/running_example/transformations/KM32XML.atl";

		List<String> allMutations = getAllMutations();
		for (String modelPath : allMutations) {
			Transformation t = new Transformation();
			String inputModelPath = modelPath;
			t.setATLTransformation(atlTransformation);
			t.setInputMetamodel(inputMetamodelPath);
			t.setInputModel(inputModelPath);
			
			InformationLoss.informationLoss(t);
			
		}
		
	}
	
	public static List<String> getAllMutations(){
		List<String> mutations = new ArrayList<String>();
		mutations.add(example1());
		mutations.add(example2());
		mutations.add(example3());
		mutations.add(example4());
		mutations.add(exampleWithParameter());
		
		return mutations;
	}
	
	
	public static String exampleWithParameter() {
		Metamodel basicKM3Structure = createBasicKM3Structure();
		DataType dataTypeString = createStringDataType();
		
		while(N_DATATYPE > 1) {
			DataType dataTypeStringTMP = createStringDataType();	
			N_DATATYPE--;
		}
		
		while(N_CLASSES > 0) {
//			Class km3Class = createClass(false, null);
			Class km3Class = km3Factory.createClass();
			km3Class.setName(KM3ModelInstanceCreator.generateRandomClassName(10));
			km3Class.setPackage(km3Package);
			km3Class.setIsAbstract(true);
			km3Package.getContents().add(km3Class);
			while(N_ATTRIBUTES_FOR_CLASS > 0) {
				Attribute attribute = createAttribute(km3Class, dataTypeString, 1, 1, false, false);
				N_ATTRIBUTES_FOR_CLASS--;
			}
			while(N_REFERENCES_FOR_CLASS > 0 ) {
				Reference ref1 = createReference(km3Class, dataTypeString, false, null);
				N_REFERENCES_FOR_CLASS--;
			}
			while(N_STRUCTURAL_FEATURES_FOR_CLASS > 0) {
				StructuralFeature sf = createStructuralFeatures(km3Class, dataTypeString, false, false);
				N_STRUCTURAL_FEATURES_FOR_CLASS--;
			}
			N_CLASSES--;
		}
		
		while(N_REFERENCES > 0) {
			Reference ref = createReference(null, dataTypeString, false, null);
			N_REFERENCES--;
		}
		while(N_STRUCTURAL_FEATURES > 0) {
			StructuralFeature sf = createStructuralFeatures(null, dataTypeString, false, false);
			N_STRUCTURAL_FEATURES--;
		}
		while(N_OPERATIONS > 0) {
			Operation op = createOperation(null, dataTypeString, false, false);
			N_OPERATIONS--;
		}
		
		while(N_ENUMERATIONS > 0) {
			Enumeration enumeration = createEnumeration();
			N_ENUMERATIONS--;
		}
		
		while(N_PARAMETERS > 0) {
			Parameter par = createParameter(null, dataTypeString, false, false);
			N_PARAMETERS--;
		}
		
		
		Enumeration km3Enumeration = createEnumeration();
		while(N_ENUM_LITERAL > 0) {
			EnumLiteral enumLiteral = createEnumLiteral(km3Enumeration);
			N_ENUM_LITERAL--;
		}
		
		
		String outputPath = KM3ModelInstanceCreator.generateRandomOutputModelFileName(10);
		ModelManager.serializeModelInstance(basicKM3Structure, outputPath);
		return outputPath;
	}
	
	
	public static String example1() {
		Metamodel basicKM3Structure = createBasicKM3Structure();
		
		Class km3Class = km3Factory.createClass();
		km3Class.setName(KM3ModelInstanceCreator.generateRandomClassName(10));
		km3Class.setPackage(km3Package);
		km3Class.setIsAbstract(true);
		km3Package.getContents().add(km3Class);
		
		String outputPath = KM3ModelInstanceCreator.generateRandomOutputModelFileName(10);
		ModelManager.serializeModelInstance(basicKM3Structure, outputPath);
		return outputPath;
	}
	
	public static String example2() {
		Metamodel basicKM3Structure = createBasicKM3Structure();
		
		Class km3Class1 = km3Factory.createClass();
		km3Class1.setName(KM3ModelInstanceCreator.generateRandomClassName(10));
		km3Class1.setPackage(km3Package);
		km3Class1.setIsAbstract(true);
		km3Package.getContents().add(km3Class1);
		
		Class km3Class2 = km3Factory.createClass();
		km3Class2.setName(KM3ModelInstanceCreator.generateRandomClassName(10));
		km3Class2.setPackage(km3Package);
		km3Class2.setIsAbstract(true);
		km3Package.getContents().add(km3Class2);
		
		List<Class> km3ClassSupertypes = new ArrayList<Class>();
		km3ClassSupertypes.add(km3Class1);
		km3Class2.getSupertypes().addAll(km3ClassSupertypes);
		
		
		String outputPath = KM3ModelInstanceCreator.generateRandomOutputModelFileName(10);
		ModelManager.serializeModelInstance(basicKM3Structure, outputPath);
		return outputPath;
	}
	
	
	public static String example3() {
		Metamodel basicKM3Structure = createBasicKM3Structure();
		
		Class km3Class1 = km3Factory.createClass();
		km3Class1.setName(KM3ModelInstanceCreator.generateRandomClassName(10));
		km3Class1.setPackage(km3Package);
		km3Class1.setIsAbstract(true);
		km3Package.getContents().add(km3Class1);
		
		DataType dataTypeString = createStringDataType();
		
		Attribute attribute1 = createAttribute(km3Class1, dataTypeString, 1, 1, false, false);
		
		Class km3Class2 = km3Factory.createClass();
		km3Class2.setName(KM3ModelInstanceCreator.generateRandomClassName(10));
		km3Class2.setPackage(km3Package);
		km3Class2.setIsAbstract(true);
		km3Package.getContents().add(km3Class2);
		Attribute attribute2 = createAttribute(km3Class2, dataTypeString, 1, 1, false, false);
		
		
		
		String outputPath = KM3ModelInstanceCreator.generateRandomOutputModelFileName(10);
		ModelManager.serializeModelInstance(basicKM3Structure, outputPath);
		return outputPath;
	}
	
	public static String example4() {
		Metamodel basicKM3Structure = createBasicKM3Structure();
		
		Class km3Class1 = km3Factory.createClass();
		km3Class1.setName(KM3ModelInstanceCreator.generateRandomClassName(10));
		km3Class1.setPackage(km3Package);
		km3Class1.setIsAbstract(true);
		km3Package.getContents().add(km3Class1);
		DataType dataTypeString = createStringDataType();
		Attribute attribute1 = createAttribute(km3Class1, dataTypeString, 1, 1, false, false);
		Attribute attribute2 = createAttribute(km3Class1, dataTypeString, 1, 1, false, false);
		Attribute attribute3 = createAttribute(km3Class1, dataTypeString, 1, 1, false, false);
		Attribute attribute4 = createAttribute(km3Class1, dataTypeString, 1, 1, false, false);
		Attribute attribute5 = createAttribute(km3Class1, dataTypeString, 1, 1, false, false);
		Attribute attribute6 = createAttribute(km3Class1, dataTypeString, 1, 1, false, false);
		
		Class km3Class2 = km3Factory.createClass();
		km3Class2.setName(KM3ModelInstanceCreator.generateRandomClassName(10));
		km3Class2.setPackage(km3Package);
		km3Class2.setIsAbstract(true);
		km3Package.getContents().add(km3Class2);
		Attribute attribute7 = createAttribute(km3Class2, dataTypeString, 1, 1, false, false);
		Attribute attribute8 = createAttribute(km3Class2, dataTypeString, 1, 1, false, false);
		
		
		
		String outputPath = KM3ModelInstanceCreator.generateRandomOutputModelFileName(10);
		ModelManager.serializeModelInstance(basicKM3Structure, outputPath);
		return outputPath;
	}
	
	public static Metamodel createBasicKM3Structure() {
		KM3Package.eINSTANCE.eClass();
        // Retrieve the default factory singleton
		km3Factory = KM3Factory.eINSTANCE; 
		// create the content of the model via this program
		Metamodel km3Metamodel = km3Factory.createMetamodel();
		km3Metamodel.setLocation(KM3ModelInstanceCreator.generateRandomMetamodelName(10));
		
		km3Package = km3Factory.createPackage();
		km3Package.setName(KM3ModelInstanceCreator.generateRandomPackageName(10));
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
		km3Enumeration.setName(KM3ModelInstanceCreator.generateRandomEnumerationName(10));
		km3Enumeration.setPackage(km3Package);
		km3Package.getContents().add(km3Enumeration);
		
		EnumLiteral km3EnumLiteral1 = km3Factory.createEnumLiteral();
		km3EnumLiteral1.setName(KM3ModelInstanceCreator.generateRandomEnumLiteralName(10));
		km3EnumLiteral1.setPackage(km3Package);
		km3EnumLiteral1.setEnum(km3Enumeration);
		km3Package.getContents().add(km3EnumLiteral1);
		
		EnumLiteral km3EnumLiteral2 = km3Factory.createEnumLiteral();
		km3EnumLiteral2.setName(KM3ModelInstanceCreator.generateRandomEnumLiteralName(10));
		km3EnumLiteral2.setPackage(km3Package);
		km3EnumLiteral2.setEnum(km3Enumeration);
		km3Package.getContents().add(km3EnumLiteral2);
		
		return km3Metamodel;
	}
	
	static Attribute createAttribute(Class owner, Classifier km3DataType, int lower, int upper, boolean isOrdered, boolean isUnique) {
		Attribute km3Attribute = km3Factory.createAttribute();
		km3Attribute.setName(KM3ModelInstanceCreator.generateRandomAttributeName(5));
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
			km3Reference.setName(KM3ModelInstanceCreator.generateRandomReferenceName(10));
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
		 km3StructuralFeature.setName(KM3ModelInstanceCreator.generateRandomStructuralFeature(10));
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
		 km3Parameter.setName(KM3ModelInstanceCreator.generateRandomParameter(10));
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
		 km3Operation.setName(KM3ModelInstanceCreator.generateRandomParameter(10));
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
			km3Enumeration.setName((KM3ModelInstanceCreator.generateRandomEnumerationName(10)));
			km3Enumeration.setPackage(km3Package);
			km3Package.getContents().add(km3Enumeration);
			return km3Enumeration;
		}
		
		 static EnumLiteral createEnumLiteral(Enumeration km3Enumeration) {
			EnumLiteral km3EnumLiteral = km3Factory.createEnumLiteral();
			km3EnumLiteral.setName((KM3ModelInstanceCreator.generateRandomEnumLiteralName(10)));
			km3EnumLiteral.setPackage(km3Package);
			km3EnumLiteral.setEnum(km3Enumeration);
			km3Package.getContents().add(km3EnumLiteral);
			return km3EnumLiteral;
		}
		
		static Class createClass(boolean isAbstract, List<Class> km3ClassSupertypes) {
			Class km3Class = km3Factory.createClass();
			km3Class.setName((KM3ModelInstanceCreator.generateRandomClassName(10)));
			km3Class.setPackage(km3Package);
			km3Class.setIsAbstract(isAbstract);
			km3Package.getContents().add(km3Class);
			if(km3ClassSupertypes != null) {
				km3Class.getSupertypes().addAll(km3ClassSupertypes);
			}
			return km3Class;
		}
		
		
	
	public void addMetaclass(Metamodel metamodel, List<Attribute> attributes) {
		Class clazz = KM3ModelInstanceCreator.createClass(true, null);
		for (Attribute attribute : attributes) {
			attribute.setOwner(clazz);
		}
	}
	
	
	
}


