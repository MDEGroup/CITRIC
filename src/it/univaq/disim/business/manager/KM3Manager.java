package it.univaq.disim.business.manager;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.ocl.OCL;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.expressions.OCLExpression;
import org.eclipse.ocl.helper.OCLHelper;

import KM3.Class;
import KM3.KM3Package;
import KM3.Metamodel;
import it.univaq.disim.business.calculations.InformationLoss;
import it.univaq.disim.business.datamodel.ModelStructuralFeature;
import it.univaq.disim.business.datamodel.Transformation;

public class KM3Manager extends BaseEcoreModelManager{
	
	
	public static void main(String[] args) {
		Transformation t = new Transformation();
		String inputMetamodelPath = "resources/running_example/metamodels/KM3.ecore";
		String inputModelPath = "resources/running_example/models/mutations/Class/KM3_name_set.xmi";
//		String inputModelPath = "resources/running_example/models/mutations/Class/KM3_name_unset.xmi";
		String atlTransformation = "resources/running_example/transformations/KM32XML.atl";
		t.setATLTransformation(atlTransformation);
		t.setInputMetamodel(inputMetamodelPath);
		t.setInputModel(inputModelPath);
		
		
		getAllKM3ModelStructuralFeaturesAndReferences(inputModelPath, inputMetamodelPath, false);
		
	}

	
	public static List<Class> getMetamodelStructuralFeatures(Metamodel inputMM){
		
		List<Class> structuralFeaturesList = new ArrayList<Class>();

		// DEFINE OCL AND HELPER
		OCL<?, EClassifier, ?, ?, ?, EParameter, ?, ?, ?, Constraint, EClass, EObject> ocl;
		OCLHelper<EClassifier, ?, ?, Constraint> helper;

		// INSTANCIATE OCL
		ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
		// INSTANCIATE NEW HELPER FROM OCLEXPRESSION
		helper = ocl.createOCLHelper();
		// SET HELPER CONTEXT
		helper.setContext(EcorePackage.eINSTANCE.getEPackage());

		// CREATE OCLEXPRESSION
		OCLExpression<EClassifier> expression;
		try {
			expression = helper.createQuery("KM3::Class.allInstances()");
			// CREATE QUERY FROM OCLEXPRESSION
			Query<EClassifier, EClass, EObject> query = ocl.createQuery(expression);
			
			// EVALUATE OCL
			
			HashSet<Object> success = (HashSet<Object>) query.evaluate(inputMM);
			for (Object object : success) {
				structuralFeaturesList.add((Class) object);
			}
		} catch (ParserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return structuralFeaturesList;
	}
	
	public static List<ModelStructuralFeature> getAllKM3ModelStructuralFeaturesAndReferences(String inputModel, String inputMetamodel, boolean isMeta_Metamodel) {
		
		List<ModelStructuralFeature> mmSFList = new ArrayList<ModelStructuralFeature>();
		
		if(inputModel != null) {
			Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
			Map<String, Object> m = reg.getExtensionToFactoryMap();
			m.put("xmi", new XMIResourceFactoryImpl());
			
			// Obtain a new resource set
			ResourceSet resSet = new ResourceSetImpl();
			EPackage.Registry.INSTANCE.put(KM3Package.eNS_URI, KM3Package.eINSTANCE);
			Resource modelResource = resSet.getResource(URI.createURI(inputModel), true);
			
			Metamodel metamodel = (Metamodel) modelResource.getContents().get(0);
			
			
			TreeIterator<EObject> eAllContents = metamodel.eAllContents();
			while (eAllContents.hasNext()) {
				EObject next = eAllContents.next();
				if(next instanceof Class) {
					Class clazz = (Class) next;
					if(clazz.getSupertypes().size() > 0) {
						ModelStructuralFeature msf = new ModelStructuralFeature();
						msf.seteClass((EClass) clazz);
					}
				}
			}
			
			
			List<Class> lc = KM3Manager.getMetamodelStructuralFeatures(metamodel);
			for (Class clazz : lc) {
				if(clazz.getSupertypes().size() == 0)
					System.out.println("Unset");
			}
			
		}else {
			System.out.println("Input Model is null!");
		}

		return mmSFList;
	}
}
