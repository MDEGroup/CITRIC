package it.univaq.disim.business.mutator.km3_mutations;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import KM3.Attribute;
import KM3.Class;
import KM3.DataType;
import KM3.EnumLiteral;
import KM3.Enumeration;
import KM3.KM3Factory;
import KM3.KM3Package;
import KM3.Metamodel;
import KM3.Package;
import it.univaq.disim.Test;
import it.univaq.disim.business.manager.ModelManager;

public class Seed {
	
public static void main(String[] args) throws IOException {
		
		
		String outputPath = "resources/mutations/KM3_seed.xmi";
		Resource model = Seed.createSeedModel(outputPath);
		List<EClass> allModelEClasses = ModelManager.getAllModelEClasses(model);
		
		for (EClass eClass : allModelEClasses) {
			System.out.println(eClass.getName());
		}

	}
	
	
	public static Resource createSeedModel(String outputPath) {
		KM3Package.eINSTANCE.eClass();
        // Retrieve the default factory singleton
		KM3Factory km3Factory = KM3Factory.eINSTANCE; 
		
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
	    
			return Test.serializeModelInstance(km3Metamodel, outputPath); 
			
	}
	public static Resource serializeModelInstance(EObject km3EObject, String outputPath) {
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("xmi", new XMIResourceFactoryImpl());

        // Obtain a new resource set
        ResourceSet resSet = new ResourceSetImpl();

        // create a resource
        Resource resource = resSet.createResource(URI.createURI(outputPath));
        // Get the first model element and cast it to the right type, in my
        // example everything is hierarchical included in this first node
        resource.getContents().add(km3EObject);

        // now save the content.
        try {
            resource.save(Collections.EMPTY_MAP);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        return resource;
	}

}
