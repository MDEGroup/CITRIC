package it.univaq.disim.business.mutator.ecoremutator.mutations.model;

import java.util.Map;

import org.eclipse.core.runtime.ILog;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.modelversioning.ecoremutator.IModelProvider;
import org.modelversioning.ecoremutator.mutations.Mutation;
import org.modelversioning.ecoremutator.tracker.IMutationTracker;

public class DeleteConcreteClass implements Mutation{
	
	
	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean mutate(IModelProvider modelProvider, IMutationTracker tracker) {
		boolean success = false;
	
		EObject eObjectToDelete = modelProvider.getAllStructuralFeatures().get(0);
		if (eObjectToDelete != null) {
			// delete
			EClass eClass = (EClass) eObjectToDelete;
			EList<EStructuralFeature> eStructuralFeatures = eClass.getEStructuralFeatures();
			System.out.println(eClass.getName()+": "+eStructuralFeatures);
			EcoreUtil.delete(eObjectToDelete, true);
			// track mutation
			
			System.out.println("Deleted!");
		success = true;
	} else {
		System.out.println("Model provider did not return a suitable object to delete.");
		success = false;
	}
		return success;
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
