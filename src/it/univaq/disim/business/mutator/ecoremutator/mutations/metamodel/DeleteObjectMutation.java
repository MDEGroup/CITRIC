package it.univaq.disim.business.mutator.ecoremutator.mutations.metamodel;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.modelversioning.ecoremutator.EcoreMutatorPlugin;
import org.modelversioning.ecoremutator.IModelProvider;
import org.modelversioning.ecoremutator.mutations.Mutation;
import org.modelversioning.ecoremutator.tracker.IMutationTracker;


public class DeleteObjectMutation implements Mutation {
	
	
	/**
	 * Default plug in id.
	 */
	private String pluginId = EcoreMutatorPlugin.PLUGIN_ID;

	/**
	 * The logger of this mutation.
	 */
//	private ILog logger = EcoreMutatorPlugin.getDefault().getLog();

	/**
	 * The options of this mutation.
	 */
	private Map<Object, Object> options = null;

//	protected void log(int severity, String message) {
//		IStatus status = new Status(severity, pluginId, message);
//		this.logger.log(status);
//	}

	/**
	 * Logs the specified <code>message</code> with the specified
	 * <code>exception</code> for the specified <code>severity</code>.
	 * 
	 * @param severity
	 *            to use.
	 * @param message
	 *            to log.
	 * @param exception
	 *            to log.
	 */
//	protected void log(int severity, String message, Throwable exception) {
//		IStatus status = new Status(severity, pluginId, message, exception);
//		this.logger.log(status);
//	}

	/**
	 * Returns the logger to use.
	 * 
	 * @return to use.
	 */
//	protected ILog getLogger() {
//		return this.logger;
//	}


	/**
	 * Returns the option value for the specified <code>key</code>.
	 * 
	 * @param key
	 *            key of the searched option.
	 * @return the value of the option or <code>null</code>.
	 */
	public Object getOptionValue(String key) {
		if (this.options != null) {
			return this.options.get(key);
		}
		return null;
	}

	/**
	 * Returns the option value for the specified <code>key</code>. If no value
	 * is set, this method returns the <code>defaultValue</code>.
	 * 
	 * @param key
	 *            key of the searched option.
	 * @param defaultValue
	 *            default value to return if no value is set.
	 * @return the value of the option or <code>defaultValue</code>.
	 */
	public Object getOptionValue(String key, Object defaultValue) {
		if (this.options != null) {
			return this.options.get(key);
		}
		return defaultValue;
	}

	/**
	 * Creates a list containing the specified <code>eObject</code>.
	 * 
	 * @param eObject
	 *            to add to the created list.
	 * @return a list containing <code>eObject</code>.
	 */
	protected static List<EObject> toEObjectList(EObject eObject) {
		List<EObject> list = new ArrayList<EObject>();
		if (eObject != null) {
			list.add(eObject);
		}
		return list;
	}

	/**
	 * Creates a list containing the specified <code>feature</code>.
	 * 
	 * @param feature
	 *            to add to the created list.
	 * @return a list containing <code>feature</code>.
	 */
	protected static List<EStructuralFeature> toFeatureList(
			EStructuralFeature feature) {
		List<EStructuralFeature> list = new ArrayList<EStructuralFeature>();
		if (feature != null) {
			list.add(feature);
		}
		return list;
	}
	
	
	
	
	

	/**
	 * Option specifying how many percent of the complete model, the object
	 * selected for deletion may contain. Default is 0.
	 */
	public static String DELETE_MAX_MODEL_PERCENTAGE = DeleteObjectMutation.class
			.getCanonicalName()
			+ "DELETE_MAX_MODEL_PERCENTAGE"; //$NON-NLS-1$

	/**
	 * Default value for {@link #DELETE_MAX_MODEL_PERCENTAGE}.
	 */
	private static int default_DELETE_MAX_MODEL_PERCENTAGE = 0;

	/**
	 * {@inheritDoc}
	 * 
	 * Deletes a random leave object.
	 */
	@Override
	public boolean mutate(IModelProvider modelProvider, IMutationTracker tracker) {
		boolean success = false;
		// compute model size to maximally delete
		int perc = (Integer) getOptionValue(DELETE_MAX_MODEL_PERCENTAGE, default_DELETE_MAX_MODEL_PERCENTAGE);
		int size = modelProvider.getModelSize() * perc;
		if (size > 0) {
			size = size / 100;
		}

		// get object to delete
		EObject eObjectToDelete = modelProvider.getRandomEObjectNotContainingMoreObjectsThan(0);
		if (eObjectToDelete != null) {
			// delete
			EcoreUtil.delete(eObjectToDelete, true);
			// track mutation
			System.out.println("Deleted!");
//			tracker.track(this.getId(), "Deleted " + eObjectToDelete.toString(), true, toEObjectList(eObjectToDelete), toFeatureList(null));
			success = true;
		} else {
			System.out.println("Model provider did not return a suitable object to delete.");
//			log(IStatus.WARNING,
//					"Model provider did not return a suitable object to delete.");
//			tracker.track(this.getId(),
//							"Model provider did not return a suitable object to delete.",
//							false, toEObjectList(null), toFeatureList(null));
			success = false;
		}

		return success;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getId() {
		return "mutation.deleteObject";
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
