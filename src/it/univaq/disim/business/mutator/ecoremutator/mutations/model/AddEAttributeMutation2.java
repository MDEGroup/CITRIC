package it.univaq.disim.business.mutator.ecoremutator.mutations.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.ILog;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.DynamicEObjectImpl;
import org.eclipse.emf.ecore.impl.EReferenceImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.ocl.OCL;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.expressions.OCLExpression;
import org.eclipse.ocl.helper.OCLHelper;
import org.modelversioning.ecoremutator.IModelProvider;
import org.modelversioning.ecoremutator.mutations.Mutation;
import org.modelversioning.ecoremutator.tracker.IMutationTracker;



public class AddEAttributeMutation2 implements Mutation {
	
//	private static IMutationTracker tracker;
	
//	public static void main(String[] args) {
//		String metamodelInput= "resources/metamodels/MM_A.ecore";
//		myMutator.registerMetamodel(metamodelInput);
//		AddEAttributeMutation addition = new AddEAttributeMutation();
//		IModelProvider modelProvider = new ModelProvider();
//		modelProvider.setModelResource(myMutator.loadResource(metamodelInput));
//		addition.mutate(modelProvider, tracker);
//	}

//	@Override
	public boolean mutate(IModelProvider modelProvider, IMutationTracker tracker) {
		boolean success = true;
		

		//TEST
		TreeIterator<EObject> eAllContents = modelProvider.getModelResource().getAllContents();
		while (eAllContents.hasNext()) {
			EObject next = eAllContents.next();

			EClass eClass = next.eClass();
//			System.out.println(eClass.getName());
			
			// EClass References
			for (EReference reference : eClass.getEAllReferences()) {
				if(reference.isContainment()) {
					System.out.println(reference.getName()+"-> class: "+eClass.getName());
				}
//				EObject value = (EObject) next.eGet(reference);
//				String key = reference.getName();
//				EClass referenceTo = (EClass) value.eClass();
				
					EClass bascioClass = EcoreFactory.eINSTANCE.createEClass();
					bascioClass.setName("bascio_"+modelProvider.getRandomString());

					eClass.getEAllSuperTypes().add(bascioClass);
					
					
				EAttribute eAttribute = EcoreFactory.eINSTANCE.createEAttribute();
				eAttribute.setName(modelProvider.getRandomString());
				eAttribute.setEType(EcorePackage.eINSTANCE.getEInt());
				eClass.getEStructuralFeatures().add(eAttribute);
				success = true;
				String message = "Created new EAttribute " + eAttribute.getName() + " and added it to " + eClass.getName(); 
				System.out.println(message);
				
				//CLASS ATTRIBUTES
//				for (EAttribute attribute : eClass.getEAllAttributes()) {
//					String attributeValue = next.eGet(eClass.getEStructuralFeature(attribute.getName())).toString();
//					System.out.println(attributeValue);
////					System.out.println(attribute.getName());
//				}
				
				// EClass References
//				for (EReference reference : eClass.getEAllReferences()) {
//					EObject value = (EObject) next.eGet(reference);
//					String key = reference.getName();
//					EClass referenceTo = (EClass) value.eClass();
//					System.out.println(referenceTo.getName());
//				}
			}
			
		}
		
		
		
		
		
		
//		EObject eClassObject = modelProvider.getRandomEObject(EcorePackage.eINSTANCE.getEClass());
//		System.out.println("#@#@"+eClassObject);
//		if (eClassObject != null && eClassObject instanceof EClass) {
//			EClass eClass = (EClass) eClassObject;
//			EAttribute eAttribute = EcoreFactory.eINSTANCE.createEAttribute();
//			eAttribute.setName(modelProvider.getRandomString());
//			eAttribute.setEType(EcorePackage.eINSTANCE.getEInt());
//			eClass.getEStructuralFeatures().add(eAttribute);
//			success = true;
//			String message = "Created new EAttribute " + eAttribute.getName() + " and added it to " + eClass.getName(); 
//			System.out.println(message);
////			log(IStatus.INFO, message);
////			tracker.track(this.getId(), message, false, toEObjectList(eClass), toFeatureList(null));
//		} else {
//			success = true;
////			String message = "Could not create reference.";
////			System.out.println(message);
////			log(IStatus.INFO, message);
////			log(IStatus.WARNING, message, occurredException);
////			tracker.track(this.getId(), message, false, toEObjectList(null), toFeatureList(null));
//		}

		return success;
	}
	
	
	
	
	
//	public static void getAllModelElements(Resource resource) {
//		TreeIterator<EObject> eAllContents = resource.getAllContents();
//		while (eAllContents.hasNext()) {
//			EObject next = eAllContents.next();
//
//			EClass eClass = next.eClass();
//			System.out.println(eClass.getName());
//			if(eClass instanceof EClass)  {
//				//CLASS ANNOTATIONS
//				EList<EAnnotation> annotations = next.eClass().getEAnnotations();
////				System.out.println(annotations.size());
//				
//				//CLASS ATTRIBUTES
//				for (EAttribute attribute : eClass.getEAllAttributes()) {
//					String attributeValue = next.eGet(eClass.getEStructuralFeature(attribute.getName())).toString();
//					System.out.println(attributeValue);
////					System.out.println(attribute.getName());
//				}
//				
//				// EClass References
////				for (EReference reference : eClass.getEAllReferences()) {
////					EObject value = (EObject) next.eGet(reference);
////					String key = reference.getName();
////					EClass referenceTo = (EClass) value.eClass();
////					System.out.println(referenceTo.getName());
////				}
//			}
//			
//		}
//	}
//	
	
	
	
	private EClass getEClassContainer(String metamodelPath) {
		ResourceSet load_resourceSet = new ResourceSetImpl();
		Resource resource = load_resourceSet.getResource(URI.createURI(metamodelPath),true);
		EObject rootPackage = (EObject)resource.getContents().get(0);
		
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
		OCLExpression<EClassifier> expression = null;
		try {
			expression = helper.createQuery("EReference.allInstances()->select(e | e.container = true)");
		} catch (ParserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// CREATE QUERY FROM OCLEXPRESSION
		Query<EClassifier, EClass, EObject> query = ocl.createQuery(expression);
		
		// EVALUATE OCL
		HashSet<Object> success = (HashSet<Object>) query.evaluate(rootPackage);
		EClass result = null;
		for (Object object : success) {
			EReferenceImpl eRef = (EReferenceImpl) object;
			result = eRef.getEReferenceType();
		}
		
		return result;
	}
	
	
	
	

//	@Override
	public String getId() {
		return "mutation.ecore.addEAttribute";
	}

	public boolean canHandleEditingDomain() {
		return false;
	}

	@Override
	public void setLogger(ILog arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setOptions(Map<Object, Object> arg0) {
		// TODO Auto-generated method stub
		
	}
}