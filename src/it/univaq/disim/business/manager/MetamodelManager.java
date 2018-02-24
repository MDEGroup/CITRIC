package it.univaq.disim.business.manager;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
import org.eclipse.ocl.OCL;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.expressions.OCLExpression;
import org.eclipse.ocl.helper.OCLHelper;

import anatlyzer.atlext.ATL.MatchedRule;
import it.univaq.disim.business.datamodel.ModelStructuralFeature;
import it.univaq.disim.common.exceptions.MetaModelNotFoundException;

public class MetamodelManager extends BaseEcoreModelManager{
	
	private static ResourceSet load_resourceSet = new ResourceSetImpl();
	
	public static List<ModelStructuralFeature> getAllMetamodelStructuralFeaturesAndReferences(String inputMetamodel) {
		
		List<ModelStructuralFeature> mmSFList = new ArrayList<ModelStructuralFeature>();
		
		ResourceSet load_resourceSet = new ResourceSetImpl();
		Resource resource = load_resourceSet.getResource(URI.createURI(inputMetamodel), true);

		if (resource.isLoaded() && resource.getErrors() != null) {
			TreeIterator<EObject> eAllContents = resource.getAllContents();
			while (eAllContents.hasNext()) {
				
				EObject next = eAllContents.next();
				if (next instanceof EPackage) {
					EPackage ePackage = (EPackage) next;
//					System.out.println("EPackage: "+ePackage.getName());
				} else if (next instanceof EClass) {
					EClass eClass = (EClass) next;
					if(!eClass.isAbstract()) {
						ModelStructuralFeature mmSF = new ModelStructuralFeature();
//						System.out.println("EClass: "+eClass.getName());
						mmSF.seteClass(eClass);
						EList<EStructuralFeature> eStructuralFeatures = eClass.getEAllStructuralFeatures();
						Set<EReference> refList = new HashSet<EReference>();
						Set<EStructuralFeature> sFList = new HashSet<EStructuralFeature>();
						Set<String> allSF = new HashSet<String>();
						for (EStructuralFeature eStructuralFeature : eStructuralFeatures) {
							if(eStructuralFeature instanceof EReference) {
								EReference ref = (EReference) eStructuralFeature;
								refList.add(ref);
								allSF.add(ref.getName());
//								System.out.println("\tRef: "+eStructuralFeature.getName());
							}else {
								EStructuralFeature eSF = eStructuralFeature;
								sFList.add(eSF);
								allSF.add(eSF.getName());
//								System.out.println("\tSF: "+eStructuralFeature.getName());
							}
							
						}
						mmSF.setAllEStructuralFeatures(allSF);
						mmSF.seteReferences(refList);
						mmSF.seteStructuralFeatures(sFList);
						mmSFList.add(mmSF);
					}
				} 

			}
		}
		return mmSFList;
	}
	
	public static List<EStructuralFeature> getMetamodelStructuralFeatures(String inputMM){
		
		Resource resource = load_resourceSet.getResource(URI.createURI(inputMM), true);
		EObject rootPackage = (EObject) resource.getContents().get(0);
		
		List<EStructuralFeature> structuralFeaturesList = new ArrayList<EStructuralFeature>();

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
			expression = helper.createQuery("EStructuralFeature.allInstances()");
			// CREATE QUERY FROM OCLEXPRESSION
			Query<EClassifier, EClass, EObject> query = ocl.createQuery(expression);
			
			// EVALUATE OCL
			
			HashSet<Object> success = (HashSet<Object>) query.evaluate(rootPackage);
			for (Object object : success) {
				structuralFeaturesList.add((EStructuralFeature) object);
			}
			
			
		} catch (ParserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return structuralFeaturesList;
	}
	
	public static List<EClass> getAllMetamodelEClasses(String inputMM) throws ParserException {
		Resource resource = load_resourceSet.getResource(URI.createURI(inputMM), true);
		EObject rootPackage = (EObject) resource.getContents().get(0);

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
		OCLExpression<EClassifier> expression = helper.createQuery("EClass.allInstances()->select(e|e.abstract = false)");
		// CREATE QUERY FROM OCLEXPRESSION
		Query<EClassifier, EClass, EObject> query = ocl.createQuery(expression);

		// EVALUATE OCL
//		int success = (int) query.evaluate(rootPackage);
//		return success;
		HashSet<Object> success = (HashSet<Object>) query.evaluate(rootPackage);
		List<EClass> callableMethods = new ArrayList<EClass>();
		for (Object object : success) {
				callableMethods.add((EClass) object);
		}
		return callableMethods;
	}
	

	public static void main(String[] args) {
		String inputMM = "resources/chain/running_example/KM32EMF/KM3.ecore";
		MetamodelManager.registerMetamodel(inputMM);
		
		System.out.println(MetamodelManager.getMetamodelStructuralFeatures(inputMM).size());
		
		Set<String> listWithoutRipetitions = new HashSet<String>();
		List<ModelStructuralFeature> allMetamodelStructuralFeaturesAndReferences = MetamodelManager.getAllMetamodelStructuralFeaturesAndReferences(inputMM);
		for (ModelStructuralFeature modelStructuralFeature : allMetamodelStructuralFeaturesAndReferences) {
//			System.out.println(modelStructuralFeature.geteClass().getName());
			for (EReference ref : modelStructuralFeature.geteReferences()) {
				System.out.println("\t"+ref.getName());
				listWithoutRipetitions.add(ref.getName());
			}
			for (EStructuralFeature sf : modelStructuralFeature.geteStructuralFeatures()) {
//				System.out.println("\t"+sf.getName());
				listWithoutRipetitions.add(sf.getName());
			}
		}
		System.out.println(listWithoutRipetitions.size());		
		

	}
	
	public static List<EPackage> loadMetaModel (String uri) throws MetaModelNotFoundException {
		List<EPackage> metamodel = null;
		try {
			metamodel = new ArrayList<EPackage>();
			
			// check if it is already registered
			EPackage pck = EPackage.Registry.INSTANCE.getEPackage(uri);
			
			// otherwise
			if (pck==null) {
				EPackage.Registry.INSTANCE.put(uri, EPackage.class);
				if (Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().size() == 0)
					Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());
				
				ResourceSetImpl resourceSet = new ResourceSetImpl();
				Resource        resource    = resourceSet.getResource(URI.createFileURI(uri), true);
				for (EObject obj : resource.getContents()) {
					if (obj instanceof EPackage) {						
						resourceSet.getPackageRegistry().put(((EPackage)obj).getNsURI(), ((EPackage)obj).getEFactoryInstance().getEPackage());
						metamodel.add((EPackage)obj);
					}
				}
			}
			else metamodel.add(pck);

			List<EPackage> subpackages = loadSubpackages(metamodel.get(0));
			for (EPackage spck : subpackages) {
				if (!metamodel.contains(spck)) {
					metamodel.add(spck);
				}
			}
			
		}
		catch (Exception e) {
			throw new MetaModelNotFoundException(uri);
		}
		
		return metamodel;
	}
	
	private static List<EPackage> loadSubpackages(EPackage pck) {
		List<EPackage> subpackages = new ArrayList<EPackage>();
		for (EPackage spck : pck.getESubpackages()) {
			subpackages.add(spck);
			List<EPackage> nextSubpackages = loadSubpackages(spck);
			for (EPackage nspck : nextSubpackages) {
				if (!subpackages.contains(nspck)) {
					subpackages.add(nspck);
				}
			}
		}
		return subpackages;
	}
	
	public void serializeMetaModel(EPackage metamodelEPackage, String outputMetamodelPath) {

		ResourceSet resourceSet = new ResourceSetImpl();

		// Register XML Factory implementation to handle .ecore files
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new XMLResourceFactoryImpl());

		// Create empty resource with the given URI
		Resource resource = resourceSet.createResource(URI.createURI(outputMetamodelPath));

		// Add bookStoreEPackage to contents list of the resource
		resource.getContents().add(metamodelEPackage);

		try {
			// Save the resource
			resource.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
