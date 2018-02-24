package it.univaq.disim.business.mutator.ecoremutator.mutations.metamodel;

import java.util.Map;

import org.eclipse.core.runtime.ILog;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.modelversioning.ecoremutator.IModelProvider;
import org.modelversioning.ecoremutator.mutations.Mutation;
import org.modelversioning.ecoremutator.tracker.IMutationTracker;



public class AddEAttributeMutation implements Mutation {
	
//	private static IMutationTracker tracker;
	
//	public static void main(String[] args) {
//		String metamodelInput= "resources/metamodels/MM_A.ecore";
//		myMutator.registerMetamodel(metamodelInput);
//		AddEAttributeMutation addition = new AddEAttributeMutation();
//		IModelProvider modelProvider = new ModelProvider();
//		modelProvider.setModelResource(myMutator.loadResource(metamodelInput));
//		addition.mutate(modelProvider, tracker);
//	}

	/**
	 * {@inheritDoc}
	 * 
	 * Adds a random {@link EClass}.
	 */
//	@Override
	public boolean mutate(IModelProvider modelProvider, IMutationTracker tracker) {
		boolean success = false;
		Exception occurredException = null;

		EObject eClassObject = modelProvider.getRandomEObject(EcorePackage.eINSTANCE.getEClass());
		System.out.println(eClassObject);
		if (eClassObject != null && eClassObject instanceof EClass) {
			EClass eClass = (EClass) eClassObject;
			EAttribute eAttribute = EcoreFactory.eINSTANCE.createEAttribute();
			eAttribute.setName(modelProvider.getRandomString());
			eAttribute.setEType(EcorePackage.eINSTANCE.getEInt());
			eClass.getEStructuralFeatures().add(eAttribute);
			success = true;
			String message = "Created new EAttribute " + eAttribute.getName() + " and added it to " + eClass.getName();
			System.out.println(message);
//			log(IStatus.INFO, message);
//			tracker.track(this.getId(), message, false, toEObjectList(eClass), toFeatureList(null));
		} else {
			success = false;
//			String message = "Could not create reference.";
//			System.out.println(message);
//			log(IStatus.INFO, message);
//			log(IStatus.WARNING, message, occurredException);
//			tracker.track(this.getId(), message, false, toEObjectList(null), toFeatureList(null));
		}

		return success;
	}

	/**
	 * {@inheritDoc}
	 */
//	@Override
	public String getId() {
		return "mutation.ecore.addEAttribute";
	}

	/**
	 * {@inheritDoc}
	 */
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