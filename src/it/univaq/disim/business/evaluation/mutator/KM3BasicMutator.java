package it.univaq.disim.business.evaluation.mutator;

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
import it.univaq.disim.business.manager.ModelManager;
import it.univaq.disim.common.utils.Utils;

public abstract class KM3BasicMutator {
	
	
	protected static int N_INSTANCES_TO_ADD = 100;
	protected static int N_BASIC_INSTANCES_TO_ADD = 5;
	
	public static String basicMutationPath = "resources/running_example/models/mutations/KM3/";
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
	
	private static String COMPLETE_MODEL_PATH = "resources/running_example/models/mutations/KM3/KM3_complete.xmi";
	private static final String SEED_MODEL_PATH = "resources/running_example/models/Sample-km3/sample-km3.xmi";
	private static final String GRAPH_MODEL_PATH = "resources/running_example/models/KM3_graph.xmi";
	private static final String CHAIN1_BETTER_THAN_CHAIN2_MODEL_PATH = "resources/running_example/models/KM3_test.xmi";
	private static final String BIG_MUTATION_PATH = "resources/running_example/models/KM3_big_mutation.xmi";
	
	protected static KM3Factory km3Factory;
	protected static Package km3Package;
	
	
	public static void main(String[] args) {
//		createSeed();
//		createGraphSeed();
//		createChain1BetterThanChain2();
		createBigMutation(100);
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
		
		Class class_A = km3Factory.createClass();
		class_A.setName(("A"));
		class_A.setPackage(km3Package);
		class_A.setIsAbstract(false);
		km3Package.getContents().add(class_A);
		Class class_B = km3Factory.createClass();
		class_B.setName(("B"));
		class_B.setPackage(km3Package);
		class_B.setIsAbstract(false);
		km3Package.getContents().add(class_B);
		Class class_C = km3Factory.createClass();
		class_C.setName(("C"));
		class_C.setPackage(km3Package);
		class_C.setIsAbstract(false);
		km3Package.getContents().add(class_C);
		Class class_D = km3Factory.createClass();
		class_D.setName(("D"));
		class_D.setPackage(km3Package);
		class_D.setIsAbstract(false);
		km3Package.getContents().add(class_D);
		Class class_E = km3Factory.createClass();
		class_E.setName(("E"));
		class_E.setPackage(km3Package);
		class_E.setIsAbstract(false);
		km3Package.getContents().add(class_E);
		Class class_F = km3Factory.createClass();
		class_F.setName(("F"));
		class_F.setPackage(km3Package);
		class_F.setIsAbstract(false);
		km3Package.getContents().add(class_F);
		
		Operation getNameOperation = km3Factory.createOperation();
		getNameOperation.setName("getName");
		getNameOperation.setPackage(km3Package);
		getNameOperation.setOwner(rootClass);
		getNameOperation.setType(stringDataType);
		getNameOperation.setLower(1);
		getNameOperation.setUpper(1);
		getNameOperation.setIsOrdered(false);
		getNameOperation.setIsUnique(false);
		km3Package.getContents().add(getNameOperation);
		
		Operation setNameOperation = km3Factory.createOperation();
		setNameOperation.setName("setName");
		setNameOperation.setPackage(km3Package);
		setNameOperation.setOwner(rootClass);
		setNameOperation.setType(stringDataType);
		setNameOperation.setLower(1);
		setNameOperation.setUpper(1);
		setNameOperation.setIsOrdered(false);
		setNameOperation.setIsUnique(false);
		km3Package.getContents().add(setNameOperation);

		
		
		int count = 1;
		while(count < 95) {
			Parameter km3Parameter = km3Factory.createParameter();
			 km3Parameter.setName("p"+count);
			 km3Parameter.setPackage(km3Package);
			 km3Parameter.setOwner(getNameOperation);
			 km3Parameter.setType(stringDataType);
			 km3Parameter.setLower(1);
			 km3Parameter.setUpper(1);
			 km3Parameter.setIsOrdered(false);
			 km3Parameter.setIsUnique(false);
			 km3Package.getContents().add(km3Parameter);
			 
			 if(count < 94) {
				 createOperation(rootClass, stringDataType, false, false);
			 }
			 
			count++;
		}
		
		
		String outputPath = SEED_MODEL_PATH;
		ModelManager.serializeModelInstance(km3Metamodel, outputPath);
		return outputPath;
	}
	
	public static String createChain1BetterThanChain2() {
		KM3Package.eINSTANCE.eClass();
		// Retrieve the default factory singleton
		km3Factory = KM3Factory.eINSTANCE; 
		// create the content of the model via this program
		Metamodel km3Metamodel = km3Factory.createMetamodel();
		km3Metamodel.setLocation("KM3 Metamodel");
		
		km3Package = km3Factory.createPackage();
		km3Package.setName("Package Content");
		km3Package.setMetamodel(km3Metamodel);
		km3Package.setLocation(Utils.generateRandomString(5));
		km3Package.setPackage(km3Package);
//		
		DataType stringDataType = createStringDataType();
		stringDataType.setPackage(km3Package);
		stringDataType.setName("String");
		km3Package.getContents().add(stringDataType);
		
		Class classTest = km3Factory.createClass();
		classTest.setName(("First Class"));
		classTest.setPackage(km3Package);
		classTest.setIsAbstract(true);
		km3Package.getContents().add(classTest);
		
//		Enumeration enumeration = createEnumeration();
		
		int count = 0;
		while(count < 100) {
//			createStringDataType();
			Operation ownerOperation = createOperation(null, stringDataType, false, false);
			createParameter(ownerOperation, stringDataType, false, false);
			
//			createAttribute(null, stringDataType, 1, 1, false, false);
//			createEnumLiteral(enumeration);
//			createOperation(null, stringDataType, false, false);
//			Operation ownerOperation = createOperation(null, stringDataType, false, false);
//			createParameter(ownerOperation , stringDataType, false, false);
			count++;
		}
		
		String outputPath = CHAIN1_BETTER_THAN_CHAIN2_MODEL_PATH;
		ModelManager.serializeModelInstance(km3Metamodel, outputPath);
		return outputPath;
	}
	
	public static String createBigMutation(int numberOfElements) {
		KM3Package.eINSTANCE.eClass();
		// Retrieve the default factory singleton
		km3Factory = KM3Factory.eINSTANCE; 
		// create the content of the model via this program
		Metamodel km3Metamodel = km3Factory.createMetamodel();
		km3Metamodel.setLocation("KM3 Big Mutation");
		
		km3Package = km3Factory.createPackage();
		km3Package.setName("Big Package Content");
		km3Package.setMetamodel(km3Metamodel);
		km3Package.setLocation(Utils.generateRandomString(5));
		km3Package.setPackage(km3Package);
		
		DataType stringDataType = createStringDataType();
		stringDataType.setPackage(km3Package);
		stringDataType.setName("String");
		km3Package.getContents().add(stringDataType);
		
		Class rootClass = createClass(false, null);
		Enumeration km3Enumeration = createEnumeration();
		Operation operation = createOperation(rootClass, stringDataType, false, false);
		
		while(numberOfElements > 0) {
			createClass(false, null);
			createAttribute(rootClass, stringDataType, 1, 1, false, false);
			createEnumeration();
			createEnumLiteral(km3Enumeration);
			createOperation(rootClass, stringDataType, false, false);
			createReference(rootClass, stringDataType, false, null);
			createParameter(operation, stringDataType, false, false);
			createStructuralFeatures(rootClass, stringDataType, false, false);
			numberOfElements--;
		}
		
		String outputPath = BIG_MUTATION_PATH;
		ModelManager.serializeModelInstance(km3Metamodel, outputPath);
		return outputPath;
	}
	
	public static String createGraphSeed() {
		KM3Package.eINSTANCE.eClass();
		// Retrieve the default factory singleton
		km3Factory = KM3Factory.eINSTANCE; 
		// create the content of the model via this program
		Metamodel km3Metamodel = km3Factory.createMetamodel();
		km3Metamodel.setLocation("KM3 Graph");
		
		km3Package = km3Factory.createPackage();
		km3Package.setName("Graph Package Content");
		km3Package.setMetamodel(km3Metamodel);
		km3Package.setLocation(Utils.generateRandomString(5));
		km3Package.setPackage(km3Package);
		
		DataType stringDataType = createStringDataType();
		stringDataType.setPackage(km3Package);
		stringDataType.setName("String");
		km3Package.getContents().add(stringDataType);
		
		Class class_Graph = km3Factory.createClass();
		class_Graph.setName(("Graph"));
		class_Graph.setPackage(km3Package);
		class_Graph.setIsAbstract(true);
		km3Package.getContents().add(class_Graph);
		
		List<Class> supertypes = new ArrayList<Class>();
		supertypes.add(class_Graph);
		
		Class class_Node = km3Factory.createClass();
		class_Node.setName(("Node"));
		class_Node.setPackage(km3Package);
		class_Node.setIsAbstract(false);
		class_Node.getSupertypes().addAll(supertypes);
		km3Package.getContents().add(class_Node);
		
		Attribute nodeAttribute = km3Factory.createAttribute();
		nodeAttribute.setName("name");
		nodeAttribute.setPackage(km3Package);
		nodeAttribute.setLower(1);
		nodeAttribute.setUpper(1);
		nodeAttribute.setIsOrdered(false);
		nodeAttribute.setIsUnique(false);
		nodeAttribute.setType(stringDataType);
		nodeAttribute.setOwner(class_Node);
		
		Class class_Edge = km3Factory.createClass();
		class_Edge.setName(("Edge"));
		class_Edge.setPackage(km3Package);
		class_Edge.setIsAbstract(false);
		class_Edge.getSupertypes().addAll(supertypes);
		km3Package.getContents().add(class_Edge);
		
		Attribute edgeAttribute = km3Factory.createAttribute();
		edgeAttribute.setName("name");
		edgeAttribute.setPackage(km3Package);
		edgeAttribute.setLower(1);
		edgeAttribute.setUpper(1);
		edgeAttribute.setIsOrdered(false);
		edgeAttribute.setIsUnique(false);
		edgeAttribute.setType(stringDataType);
		edgeAttribute.setOwner(class_Edge);
		
		Reference sourceNodeReference = km3Factory.createReference();
		sourceNodeReference.setName("sourceNode");
		sourceNodeReference.setPackage(km3Package);
		sourceNodeReference.setOwner(class_Edge);
		sourceNodeReference.setType(class_Edge);
		sourceNodeReference.setLower(1);
		sourceNodeReference.setUpper(1);
		sourceNodeReference.setIsContainer(false);
		sourceNodeReference.setOpposite(null);
		km3Package.getContents().add(sourceNodeReference);
		
		Reference targetNodeReference = km3Factory.createReference();
		targetNodeReference.setName("targetNode");
		targetNodeReference.setPackage(km3Package);
		targetNodeReference.setOwner(class_Edge);
		targetNodeReference.setType(class_Edge);
		targetNodeReference.setLower(1);
		targetNodeReference.setUpper(1);
		targetNodeReference.setIsContainer(false);
		targetNodeReference.setOpposite(null);
		km3Package.getContents().add(targetNodeReference);
		
		
		Operation getNameOperation = km3Factory.createOperation();
		getNameOperation.setName("getName");
		getNameOperation.setPackage(km3Package);
		getNameOperation.setOwner(class_Graph);
		getNameOperation.setType(stringDataType);
		getNameOperation.setLower(1);
		getNameOperation.setUpper(1);
		getNameOperation.setIsOrdered(false);
		getNameOperation.setIsUnique(false);
		km3Package.getContents().add(getNameOperation);
		
		Operation setNameOperation = km3Factory.createOperation();
		setNameOperation.setName("setName");
		setNameOperation.setPackage(km3Package);
		setNameOperation.setOwner(class_Graph);
		setNameOperation.setType(stringDataType);
		setNameOperation.setLower(1);
		setNameOperation.setUpper(1);
		setNameOperation.setIsOrdered(false);
		setNameOperation.setIsUnique(false);
		km3Package.getContents().add(setNameOperation);
		
		
		
		km3Package = km3Factory.createPackage();
		km3Package.setName("Operations");
		km3Package.setMetamodel(km3Metamodel);
		km3Package.setLocation(Utils.generateRandomString(5));
		km3Package.setPackage(km3Package);
		
		int count = 1;
		while(count < 95) {
			Parameter km3Parameter = km3Factory.createParameter();
			km3Parameter.setName("parameterForGraph"+count+"()");
			km3Parameter.setPackage(km3Package);
			km3Parameter.setOwner(getNameOperation);
			km3Parameter.setType(stringDataType);
			km3Parameter.setLower(1);
			km3Parameter.setUpper(1);
			km3Parameter.setIsOrdered(false);
			km3Parameter.setIsUnique(false);
			km3Package.getContents().add(km3Parameter);
			
			if(count < 94) {
				Operation km3Operation = km3Factory.createOperation();
				 km3Operation.setName("operationForGraph"+count+"()");
				 km3Operation.setPackage(km3Package);
				 km3Operation.setOwner(class_Graph);
				 km3Operation.setType(class_Graph);
				 km3Operation.setLower(1);
				 km3Operation.setUpper(1);
				 km3Operation.setIsOrdered(false);
				 km3Operation.setIsUnique(false);
				 km3Package.getContents().add(km3Operation);
			}
			
			count++;
		}
		
//		int countClass = 1;
//		while(countClass < 5) {
//			createClass(false, null);
//		}
		
		
		String outputPath = GRAPH_MODEL_PATH;
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
