package it.univaq.disim.business.manager;

import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.DynamicEObjectImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.util.FeatureMap.Entry;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public abstract class BaseEcoreModelManager {

	/**
	 * Set of all EClasses that are contained in EPackages that are currently
	 * registered in the EPackage registry.
	 * 
	 * @see #getAllEClasses()
	 */
	private static List<EClass> allEClasses;
	private static Map<EPackage, List<EClass>> packageToModelElementEClasses = new LinkedHashMap<EPackage, List<EClass>>();
	/**
	 * Set of all EPackages that are currently registered in the EPackage registry
	 * and not contained in any other package.
	 * 
	 * @see #getAllRootEPackages()
	 */
	private Set<EPackage> rootModelPackages;

	/**
	 * Map that maps EReferences to all possible EClasses that can be contained when
	 * using them.
	 * 
	 * @see #getAllEContainments(EReference)
	 */
	private static Map<EReference, List<EClass>> allEContainments = new LinkedHashMap<EReference, List<EClass>>();

	/**
	 * Map that maps EClasses to their subclasses.
	 * 
	 * @see #getAllSubEClasses(EClass)
	 */
	private static Map<EClass, List<EClass>> eClassToSubEClasses = new LinkedHashMap<EClass, List<EClass>>();

	/**
	 * Iterates over all registered EPackages in order to retrieve all available
	 * EClasses, excluding abstract classes and interfaces, and returns them as a
	 * Set.
	 * 
	 * @return a set of all EClasses that are contained in registered EPackages
	 * @see Registry
	 */
	public static List<EClass> getAllEClasses() {
		// were all EClasses computed before?
		if (allEClasses != null) {
			return allEClasses;
		}
		allEClasses = new LinkedList<EClass>();
		Registry registry = EPackage.Registry.INSTANCE;
		// for all registered EPackages
		for (java.util.Map.Entry<String, Object> entry : registry.entrySet()) {
			EPackage ePackage = registry.getEPackage(entry.getKey());
			for (EClass eClass : getAllEClasses(ePackage)) {
				// no abstracts or interfaces
				if (canHaveInstance(eClass)) {
					allEClasses.add(eClass);
				}
			}
		}
		return allEClasses;
	}

	public static List<EClass> getAllEClasses(EPackage ePackage) {
		if (packageToModelElementEClasses.containsKey(ePackage)) {
			return packageToModelElementEClasses.get(ePackage);
		}
		if (ePackage == null) {
			packageToModelElementEClasses.put(ePackage, new LinkedList<EClass>());
			return packageToModelElementEClasses.get(ePackage);
		}
		List<EClass> result = new LinkedList<EClass>();
		// obtain all EClasses from sub packages
		for (EPackage subPackage : ePackage.getESubpackages()) {
			result.addAll(getAllEClasses(subPackage));
		}
		// obtain all EClasses that are direct contents of the EPackage
		for (EClassifier classifier : ePackage.getEClassifiers()) {
			if (classifier instanceof EClass) {
				result.add((EClass) classifier);
			}
		}
		// save the result for upcoming method calls
		packageToModelElementEClasses.put(ePackage, result);
		return result;
	}

	/**
	 * Returns whether <code>eClass</code> can be instantiated or not. An EClass can
	 * be instantiated, if it is neither an interface nor abstract.
	 * 
	 * @param eClass
	 *            the EClass in question
	 * @return whether <code>eClass</code> can be instantiated or not.
	 */
	public static boolean canHaveInstance(EClass eClass) {
		return !eClass.isInterface() && !eClass.isAbstract();
	}

	/**
	 * Returns the EPackage to the specified <code>nsURI</code>.
	 * 
	 * @param nsURI
	 *            the NsUri of the EPackage to get
	 * @return the EPackage belonging to <code>nsURI</code>
	 * @see Registry#getEPackage(String)
	 */
	public static EPackage getEPackageFromNsURI(String nsURI) {
		return EPackage.Registry.INSTANCE.getEPackage(nsURI);
	}
	
	public static EPackage getEPackage(Resource resource) {
		EPackage ePackage = null;
		for (EObject eobj : resource.getContents()) {
			System.out.println(eobj);
			if(eobj instanceof EPackage) {
				ePackage =  (EPackage) eobj;
			}
		}
		return ePackage;
	}

	/**
	 * Returns all EPackages on the root level that are currently registered in the
	 * registry.
	 * 
	 * @return a Set of all root EPackages
	 * @see Registry
	 */
	public Set<EPackage> getAllRootEPackages() {
		// were the root packages computed before?
		if (rootModelPackages != null) {
			return rootModelPackages;
		}
		rootModelPackages = new LinkedHashSet<EPackage>();
		Registry registry = EPackage.Registry.INSTANCE;

		for (java.util.Map.Entry<String, Object> entry : registry.entrySet()) {
			EPackage ePackage = registry.getEPackage(entry.getKey());
			// is the current EPackage a root package?
			if (ePackage.getESuperPackage() == null) {
				rootModelPackages.add(ePackage);
			}
		}
		return rootModelPackages;
	}

	/**
	 * Returns all possible EClasses, excluding abstract classes and interfaces,
	 * that can be contained when using <code>reference</code>.
	 * 
	 * @param reference
	 *            the EReference to get containable EClasses for
	 * @return a set of all EClasses that can be contained when using
	 *         <code>reference</code>
	 */
	public static List<EClass> getAllEContainments(EReference reference) {
		if (allEContainments.containsKey(reference)) {
			return allEContainments.get(reference);
		}
		if (reference == null) {
			allEContainments.put(reference, new LinkedList<EClass>());
			return allEContainments.get(reference);
		}
		List<EClass> result = new LinkedList<EClass>();
		EClass referenceType = reference.getEReferenceType();
		// no abstracts or interfaces
		if (canHaveInstance(referenceType)) {
			result.add(referenceType);
		}
		// 'referenceType: EObject' allows all kinds of EObjects
		if (EcorePackage.eINSTANCE.getEObject().equals(referenceType)) {
			return getAllEClasses();
		}
		// all sub EClasses can be referenced as well
		result.addAll(getAllSubEClasses(referenceType));
		// save the result for upcoming method calls
		allEContainments.put(reference, result);
		return result;
	}

	/**
	 * Returns all subclasses of an EClass, excluding abstract classes and
	 * interfaces.
	 * 
	 * @param eClass
	 *            the EClass to get subclasses for
	 * @return all subclasses of <code>eClass</code>
	 */
	public static List<EClass> getAllSubEClasses(EClass eClass) {
		if (eClassToSubEClasses.containsKey(eClass)) {
			return eClassToSubEClasses.get(eClass);
		}
		if (eClass == null) {
			eClassToSubEClasses.put(eClass, new LinkedList<EClass>());
			return eClassToSubEClasses.get(eClass);
		}
		List<EClass> allEClasses = getAllEClasses();
		List<EClass> result = new LinkedList<EClass>();
		for (EClass possibleSubClass : allEClasses) {
			// is the EClass really a subClass, while not being abstract or an
			// interface?
			if (eClass.isSuperTypeOf(possibleSubClass) && canHaveInstance(possibleSubClass)) {
				result.add(possibleSubClass);
			}
		}
		// save the result for upcoming method calls
		eClassToSubEClasses.put(eClass, result);
		return result;
	}

	public static boolean validateObject(Resource resource) {
		EObject eo = resource.getContents().get(0);
		Diagnostic diagnostic = Diagnostician.INSTANCE.validate(eo);
		if (diagnostic.getSeverity() == Diagnostic.ERROR || diagnostic.getSeverity() == Diagnostic.WARNING) {
			System.err.println(diagnostic.getMessage());
			for (Iterator i = diagnostic.getChildren().iterator(); i.hasNext();) {
				Diagnostic childDiagnostic = (Diagnostic) i.next();
				switch (childDiagnostic.getSeverity()) {
				case Diagnostic.ERROR:
				case Diagnostic.WARNING:
					System.err.println("\t" + childDiagnostic.getMessage());
				}
			}
			return false;
		}
		return true;
	}

	public static void registerMetamodel(String path) {
		File fileName = new File(path);
		URI uri = URI.createFileURI(fileName.getAbsolutePath());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
		ResourceSet rs = new ResourceSetImpl();
		// enable extended metadata
		final ExtendedMetaData extendedMetaData = new BasicExtendedMetaData(rs.getPackageRegistry());
		rs.getLoadOptions().put(XMLResource.OPTION_EXTENDED_META_DATA, extendedMetaData);
		Resource r = rs.getResource(uri, true);
		List<EObject> eObject = r.getContents();
		for (EObject eObject2 : eObject) {
			if (eObject2 instanceof EPackage) {
				EPackage p = (EPackage) eObject2;
				registerSubPackage(p);
			}
		}
		System.out.println(path + " registered!");
	}

	private static void registerSubPackage(EPackage p) {
		EPackage.Registry.INSTANCE.put(p.getNsURI(), p);
		for (EPackage pack : p.getESubpackages()) {
			registerSubPackage(pack);
		}
	}

	public static EPackage getResourceEPackage(Resource resource) {
		EObject rootPackage = (EObject) resource.getContents().get(0);
		return (EPackage) rootPackage;
	}

	public static String objectToString(Object object) {
		if (object instanceof String) {
			return "'" + object + "'";
		}
		if (object instanceof DynamicEObjectImpl) {
			EClass eclass = ((DynamicEObjectImpl) object).eClass();
			if (eclass != null) {
				String type = eclass.getName();
				EPackage epackage = eclass.getEPackage();
				while (epackage != null) {
					type = epackage.getName() + "." + type;
					epackage = epackage.getESuperPackage();
				}
				String args = "";
				for (EAttribute att : eclass.getEAllAttributes()) {
					args = args + ", " + att.getName() + "=" + objectToString(((DynamicEObjectImpl) object).eGet(att));
				}
				return type + "@" + Integer.toHexString(object.hashCode()) + " (dynamic" + args + ")";
			}
		}
		// object could be null
		return String.valueOf(object);
	}
}
