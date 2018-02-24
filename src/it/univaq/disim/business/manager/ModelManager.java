package it.univaq.disim.business.manager;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.Diff;
import org.eclipse.emf.compare.EMFCompare;
import org.eclipse.emf.compare.match.DefaultComparisonFactory;
import org.eclipse.emf.compare.match.DefaultEqualityHelperFactory;
import org.eclipse.emf.compare.match.DefaultMatchEngine;
import org.eclipse.emf.compare.match.IComparisonFactory;
import org.eclipse.emf.compare.match.IMatchEngine;
import org.eclipse.emf.compare.match.eobject.IEObjectMatcher;
import org.eclipse.emf.compare.match.impl.MatchEngineFactoryImpl;
import org.eclipse.emf.compare.match.impl.MatchEngineFactoryRegistryImpl;
import org.eclipse.emf.compare.scope.DefaultComparisonScope;
import org.eclipse.emf.compare.scope.IComparisonScope;
import org.eclipse.emf.compare.utils.UseIdentifiers;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;

import it.univaq.disim.business.datamodel.ModelStructuralFeature;
import it.univaq.disim.common.exceptions.MetaModelNotFoundException;
import it.univaq.disim.common.exceptions.ReferenceNonExistingException;
import it.univaq.disim.common.exceptions.WrongAttributeTypeException;

public class ModelManager extends BaseEcoreModelManager {
	
	
	public static Random rn = new Random((int) System.currentTimeMillis());
	
	
	public static void main(String[] args) {
		
		String inputMetamodelPath = "resources/test/CompanyMM.ecore";
		String inputModelPath = "resources/test/company-model.xmi";

		
		
		for (ModelStructuralFeature sf : ModelManager.getAllModelStructuralFeaturesAndReferences(inputModelPath, inputMetamodelPath)) {
			System.out.println(sf.geteClass().getName());
			for (EStructuralFeature sSf : sf.geteStructuralFeatures()) {
				System.out.println("\t"+sSf.getName());
			}
			for (EReference ref : sf.geteReferences()) {
				System.out.println("\t"+ref.getName());
			}
		}
		

	}




	public static Resource loadModel(String modelPath) {
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		Resource resource = resourceSet.getResource(URI.createURI(modelPath), true);
		// Object rootPackage = null;
		// if(!resource.getContents().isEmpty()){
		// rootPackage = (Object) resource.getContents().get(0);
		// }
		// return rootPackage;
		return resource;
	}

//	public static void getAllModelElements(Resource resource) {
//		TreeIterator<EObject> eAllContents = resource.getAllContents();
//		while (eAllContents.hasNext()) {
//			EObject next = eAllContents.next();
//
//			EClass eClass = next.eClass();
//			System.out.println(eClass.getName());
//			if (eClass instanceof EClass) {
//				// CLASS ANNOTATIONS
//				EList<EAnnotation> annotations = next.eClass().getEAnnotations();
//				// System.out.println(annotations.size());
//
//				// CLASS ATTRIBUTES
//				for (EAttribute attribute : eClass.getEAllAttributes()) {
//					String attributeValue = next.eGet(eClass.getEStructuralFeature(attribute.getName())).toString();
//					System.out.println(attributeValue);
//					// System.out.println(attribute.getName());
//				}
//
//				// EClass References
//				// for (EReference reference : eClass.getEAllReferences()) {
//				// EObject value = (EObject) next.eGet(reference);
//				// String key = reference.getName();
//				// EClass referenceTo = (EClass) value.eClass();
//				// System.out.println(referenceTo.getName());
//				// }
//			}
//
//		}
//	}



	public static List<EClass> getAllModelEClasses(Resource resource) {
		List<EClass> result = new ArrayList<EClass>();
		TreeIterator<EObject> eAllContents = resource.getAllContents();
		while (eAllContents.hasNext()) {
			EObject next = eAllContents.next();
			EClass eClass = next.eClass();
			if (eClass instanceof EClass) {
				result.add(eClass);
			}
		}
		return result;
	}

	

	/**
	 * get All Model Structural Features And References
	 * @param Input Model
	 * @param Input Metamodel
	 * @return List<ModelStructuralFeature>
	 */
	public static List<ModelStructuralFeature> getAllModelStructuralFeaturesAndReferences(String inputModel, String inputMetamodel) {
		
		List<ModelStructuralFeature> mmSFList = new ArrayList<ModelStructuralFeature>();
		
		if(inputModel != null) {
			//Register Metamodel in which input model is conform
			ModelManager.registerMetamodel(inputMetamodel);
			//Load the input model as Resource
			Resource modelResource = ModelManager.loadModel(inputModel);
			if (modelResource != null) {
				TreeIterator<EObject> eAllContents = modelResource.getAllContents();
				while (eAllContents.hasNext()) {
					ModelStructuralFeature mmSF = new ModelStructuralFeature();
					EObject next = eAllContents.next();
					EClass eClass = next.eClass();
					mmSF.seteClass(eClass);
					
//				System.out.println(eClass.getName());
					// CLASS STRUCTURAL FEATURES
					
					Set<EStructuralFeature> sFList = new HashSet<EStructuralFeature>();
					for (EStructuralFeature sf : eClass.getEAllAttributes()) {
						sFList.add(sf);
						String sfValue = next.eGet(eClass.getEStructuralFeature(sf.getName())).toString();
						// System.out.println("\t"+sf.getLowerBound()+"-"+sf.getUpperBound());
//					System.out.println("\t[" + sf.getLowerBound() + "/" + sf.getUpperBound() + "] " + "Type->"+ sf.getEType().getName() + " Value: " + sfValue);
						// System.out.println(attribute.getName());
					}
					mmSF.seteStructuralFeatures(sFList);
					
					// EClass References
					Set<EReference> refList = new HashSet<EReference>();
					for (EReference reference : eClass.getEAllReferences()) {
						refList.add(reference);
//					System.out.println("\t[" + reference.getLowerBound() + "/" + reference.getUpperBound()+ "] Reference: " + reference.getName() + "-> class: " + eClass.getName());
						// EObject value = (EObject) next.eGet(reference);
						// String key = reference.getName();
						// EClass referenceTo = (EClass) value.eClass();
					}
					mmSF.seteReferences(refList);
					
					// CLASS ATTRIBUTES
					// for (EAttribute attribute : eClass.getEAllAttributes()) {
					// String attributeValue =
					// next.eGet(eClass.getEStructuralFeature(attribute.getName())).toString();
					// System.out.println("\t"+attributeValue);
					//// System.out.println(attribute.getName());
					// }
					
					// EClass References
					// for (EReference reference : eClass.getEAllReferences()) {
					// if(reference.isContainment()) {
					// System.out.println("Reference: "+reference.getName()+"-> class:
					// "+eClass.getName());
					// }
					//// EObject value = (EObject) next.eGet(reference);
					//// String key = reference.getName();
					//// EClass referenceTo = (EClass) value.eClass();
					// }
					
					// EClass References
					// for (EReference reference : eClass.getEAllReferences()) {
					// EObject value = (EObject) next.eGet(reference);
					// String key = reference.getName();
					// EClass referenceTo = (EClass) value.eClass();
					// System.out.println(referenceTo.getName());
					// }
					
					mmSFList.add(mmSF);
				}
			}
			
		}else {
			System.out.println("Input Model is null!");
		}

		return mmSFList;
	}
	
	public static List<EReference> getEClassReferences(EClass eClass) {
		List<EReference> refList = new ArrayList<EReference>();
		for (EReference reference : eClass.getEAllReferences()) {
			refList.add(reference);
			// System.out.println("\t[" + reference.getLowerBound() + "/" +
			// reference.getUpperBound()+ "] Reference: " + reference.getName() + "-> class:
			// " + eClass.getName());
			// EObject value = (EObject) next.eGet(reference);
			// String key = reference.getName();
			// EClass referenceTo = (EClass) value.eClass();
		}
		return refList;
	}
	
	
	
	
	public static URI createURI(String path) {
		return createURI(path, null);
	}

	public static URI createURI(String path, String cwd) {
		String uriString = path;
		if (uriString.startsWith("platform:/resource/")) {
			// this option depends on org.eclipse.resources return
			// URI.createPlatformResourceURI(ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(uriString)), true);
			return URI.createPlatformResourceURI(
					extract(uriString, "platform:/resource/"), true);
		} else if (uriString.startsWith("platform:/plugin/")) {
			return URI.createPlatformPluginURI(
					extract(uriString, "platform:/plugin/"), true);
		} else if (uriString.startsWith("http:/")) { // to allow loading
														// http:/www.eclipse.org/emf/2002/Ecore,
														// but this is not the
														// general case
			URI u = URI.createURI(path);
			return u;
		}

		if (cwd == null) {
			return URI.createURI(path);
		} else {
			URI uri = URI.createFileURI(new File(path).getAbsolutePath());
			return uri;
		}
	}

	private static String extract(String s, String extract) {
		return s.replaceFirst("^" + extract, "");
	}
	
	public static ResourceSet initializeResource(String modelURI) {
		ResourceSet resourceSet = new ResourceSetImpl();

		int i = modelURI.lastIndexOf('.');
		if (i > 0) {
			String ext = modelURI.substring(i + 1);
			if (!resourceSet.getResourceFactoryRegistry()
					.getExtensionToFactoryMap().containsKey(ext)) {
				resourceSet.getResourceFactoryRegistry()
						.getExtensionToFactoryMap()
						.put(ext, new XMIResourceFactoryImpl());
			}
		}
		return resourceSet;
	}
	
	/**
	 * @param resourceSet
	 *            ResourceSet
	 * @param p
	 *            Package
	 * @return
	 * @throws
	 */
	private static void addSubpackages(ResourceSet resourceSet, EPackage p) {
		for (EPackage subpackage : p.getESubpackages()) {
			if (!resourceSet.getPackageRegistry().containsKey(subpackage.getNsURI()))
				resourceSet.getPackageRegistry().put(subpackage.getNsURI(), subpackage);
			addSubpackages(resourceSet, subpackage);
		}
	}
	
	
	/**
	 * @param model
	 *            Loaded Model
	 * @return ArrayList<EObject> All the objects except root
	 */
	public static ArrayList<EObject> getObjects(Resource model) {

		ArrayList<EObject> objs = new ArrayList<EObject>();

		Iterator<EObject> objects = model.getAllContents();

		while (objects.hasNext()) {
			EObject obj = objects.next();
			if (obj.eContainer() == null) {
				continue;
			} else {
				objs.add(obj);
			}
		}
		return objs;
	}

	/**
	 * @param type
	 *            Name of the wanted object
	 * @param model
	 *            Loaded Model
	 * @return ArrayList<EObject> All the classes or objects of the specified
	 *         type
	 */
	public static ArrayList<EObject> getObjectsOfType(String type,
			Resource model) {

		ArrayList<EObject> objs = new ArrayList<EObject>();
		for (EObject obj : model.getContents()) {
			List<EClass> types = new ArrayList<EClass>();
			types.add(obj.eClass());
			types.addAll(obj.eClass().getEAllSuperTypes());
			for (EClass t : types) { 
				if (type.equals(t.getName())) {
					objs.add(obj);
				}
			}
			
			Iterator<EObject> it = obj.eAllContents();

			while (it.hasNext()) {
				EObject object = it.next();
				// Check the type
				types = new ArrayList<EClass>();
				types.add(object.eClass());
				types.addAll(object.eClass().getEAllSuperTypes());
				for (EClass t : types) { 
					if (type.equals(t.getName())) {
						objs.add(object);
					}
				}
			}
		}
		return objs;
	}
	
	/**
	 * @param type
	 *            Name of the type
	 * @param metaModel
	 *            Loaded MetaModel
	 * @return EObject Class or reference of the specified type
	 */
	public static EObject getObjectOfType(String type, List<EPackage> metaModel) {

		for (EPackage p : metaModel) {
			// For each classifier
			for (EClassifier c : p.getEClassifiers()) {
				// If we are looking for a Class, check its name
				if (c.getName().equals(type)) {
					return c;
				}
				// If we are looking for a Reference, check all references of
				// the classifier
				else {
					if (c instanceof EClass) {
						for (EReference r : ((EClass) c).getEAllReferences()) {
							if (r.getName().equals(type)) {
								return r;
							}
						}
					}
				}
			}
			if (p.getESubpackages() != null) {
				EObject object = getObjectOfType(type, p.getESubpackages());
				if (object != null) {
					return object;
				}
			}
		}

		return null;
	}
	
	/**
	 * @param uri
	 *            uri of the eClass
	 * @param metaModel
	 *            Loaded MetaModel
	 * @return EObject Class or reference of the specified type
	 */
	public static EObject getObjectOfURI(URI uri, List<EPackage> metaModel) {

		for (EPackage p : metaModel) {
			// For each classifier
			for (EClassifier c : p.getEClassifiers()) {
				// If we are looking for a Class, check its name
				if (EcoreUtil.getURI(c).equals(uri)) {
					return c;
				}
				// If we are looking for a Reference, check all references of
				// the classifier
				else {
					if (c instanceof EClass) {
						for (EReference r : ((EClass) c).getEAllReferences()) {
							if (EcoreUtil.getURI(r).equals(uri)) {
								return r;
							}
						}
					}
				}
			}
			if (p.getESubpackages() != null) {
				EObject object = getObjectOfURI(uri, p.getESubpackages());
				if (object != null) {
					return object;
				}
			}
		}

		return null;
	}

	/**
	 * @param metaModel
	 *            Loaded MetaModel
	 * @return EObject Classes
	 */
	public static ArrayList<EObject> getObjectFromMetamodel(
			List<EPackage> metaModel) {

		ArrayList<EObject> ret = new ArrayList<EObject>();

		for (EPackage p : metaModel) {
			// For each classifier
			for (EClassifier c : p.getEClassifiers()) {
				ret.add(c);
			}
			if (p.getESubpackages() != null) {
				ret.addAll(getObjectFromMetamodel(p.getESubpackages()));
			}
		}

		return ret;
	}

	/**
	 * @param model
	 *            Loaded Model
	 * @return ArrayList<EObject> All the classes or objects
	 */
	public static ArrayList<EObject> getAllObjects(Resource model) {

		ArrayList<EObject> objs = new ArrayList<EObject>();

		for (EObject obj : model.getContents()) {
			objs.add(obj);
			
			Iterator<EObject> it = obj.eAllContents();

			while (it.hasNext()) {
				EObject object = it.next();
				objs.add(object);
			}
		}
		return objs;
	}
	
		
	/**
	 * @param metamodel
	 *            Loaded Metamodel
	 * @return ArrayList<EObject> All the classes or objects
	 */
	public static ArrayList<EObject> getAllObjects(List<EPackage> metamodel) {

		ArrayList<EObject> objs = new ArrayList<EObject>();

		for (EPackage p : metamodel) {
			EList<EObject> objects = p.eContents();

			for (EObject object : objects) {
				objs.add(object);
			}
			if (p.getESubpackages() != null) {
				objs.addAll(getAllObjects(p.getESubpackages()));
			}
		}
		return objs;
	}
	
	/**
	 * @param packages
	 *            Loaded Metamodel
	 * @param model
	 *            Loaded Model
	 * @param containing
	 *            Name of the containing Class
	 * @return Parents
	 */
	public static ArrayList<EObject> getParentObjects(List<EPackage> packages, Resource model,
			String containing) {

		ArrayList<EObject> mmobjs = new ArrayList<EObject>();
		ArrayList<EObject> mmparents = new ArrayList<EObject>();
		ArrayList<EObject> parents = new ArrayList<EObject>();
		EObject obj = getObjectOfType(containing, packages);

		if ((containing.equals("EAttribute")
				|| containing.equals("EReference")
				|| containing.equals("EStructuralFeature"))) {
			mmobjs.add(getObjectOfType("EClass", packages));
		}
		else {
			mmobjs = getAllObjects(packages);

		}

		for (EObject mmo : mmobjs) {
			// We search inside the object
			for (EObject mmcont : mmo.eContents()) {
				if (mmcont.eClass().getName().equals(containing)) {
					mmparents.add(mmo);
					break;
				}
				if (mmcont instanceof EReference) {
					EReference ref = (EReference) mmcont;
					ArrayList<EClass> classes = new ArrayList<EClass>();
					classes.add((EClass) obj);
					classes.addAll(((EClass) obj).getEAllSuperTypes());
					for (EClass c : classes) {
						if (ref.getEType().getName().equals(c.getName()) && (ref.isContainment() == true)) {
							mmparents.add(mmo);
							break;
						}
					}
				}
			}
		}

		for (EObject mmp : mmparents) {
			parents.addAll(getObjectsOfType(((EClass) mmp).getName(), model));
		}

		return parents;

	}
	
	/**
	 * @param model
	 *            Loaded Model
	 * @param containing
	 *            Name of the containing Class
	 * @return Parents
	 */
	public static EObject getContainer(Resource model, EObject object) {

		ArrayList<EObject> objs = new ArrayList<EObject>();
		EObject parent = null;
		objs = getAllObjects(model);

		for (EObject obj : objs) {
			// We search inside the object
			for (EObject cont : obj.eContents()) {
				if (EcoreUtil.getURI(cont).equals(EcoreUtil.getURI(object))) {
					parent = obj;
					break;
				}
			}
			if (parent != null) {
				break;
			}
		}

		return parent;

	}
	
	/**
	 * @param model
	 *            Loaded Model
	 * @param containment
	 *            Name of the containment Class
	 * @return Containers
	 */
	public static List<EClass> getContainersList(List<EPackage> packages,
			URI uri, EClass rootClass, Map<EClass, Boolean> map) {

		List<EClass> containers = new ArrayList<EClass>();
		List<EClassifier> classifiers = getContainerTypes(packages, uri);
		if (classifiers.size() > 0) {
			for (EClassifier classifier : classifiers) {
				EClass eClass = (EClass) classifier;
				if (!map.get(eClass)) {
					map.put(eClass, true);
					containers.add(eClass);
					List<EClass> result = getContainersList(packages, EcoreUtil.getURI(eClass), rootClass, map);
					if (result != null) {
						for (EClass ec : result) {
							map.put(ec, true);
							if (!containers.contains(ec)) {
								containers.add(ec);
							}
						}
					}
					if (containers.contains(rootClass)) {
						break;
					}
				}
			}
		}
		return containers;

	}
	
	/**
	 * @param model
	 *            Loaded Model
	 * @param containment
	 *            Name of the containment Class
	 * @return Containers
	 */
	public static ArrayList<EObject> getContainerObjects(Resource model,
			String containment) {

		ArrayList<EObject> objs = new ArrayList<EObject>();
		ArrayList<EObject> containers = new ArrayList<EObject>();

		objs = getAllObjects(model);

		for (EObject o : objs) {
			// We search the references inside the objects
			for (EObject cont : o.eContents()) {
				if (cont instanceof EReference) {
					EReference ref = (EReference) cont;
					if (ref.getEType().getName().equals(containment)) {
						containers.add(o);
						containers.addAll(getContainerObjects(model, ((EClass) o).getName()));
					}
				}
			}
		}

		return containers;

	}
	
	/**
	 * @param model
	 *            Loaded Model
	 * @param container
	 *            Container object
	 * @return Containers
	 */
	public static EObject getContainerObject(Resource model,
			EObject object) {
		
		ArrayList<EObject> objs = getAllObjects(model);
		ArrayList<EClass> types = new ArrayList<EClass>();
		types.add(object.eClass());
		types.addAll(object.eClass().getEAllSuperTypes());
		for (EObject obj : objs) {
			for (EReference ref : obj.eClass().getEAllReferences()) {
				if (ref.isContainment()) {
					for (EClass type : types) {
						if (EcoreUtil.equals(ref.getEReferenceType(), type)) {
							return obj;
						}
					}
				}
			}
		}

		return null;

	}

	/**
	 * @param model
	 *            Loaded Model
	 * @param container
	 *            Container object
	 * @return Containers
	 */
	public static EObject getContainerObject(EObject container,
			EObject object) {
		ArrayList<EClass> types = new ArrayList<EClass>();
		types.add(object.eClass());
		types.addAll(object.eClass().getEAllSuperTypes());

		for (EReference ref : container.eClass().getEAllReferences()) {
			if (ref.isContainment()) {
				for (EClass type : types) {
					if (EcoreUtil.equals(ref.getEReferenceType(), type)) {
						return container;
					}
					else {
						if (container.eGet(ref) != null) {
							EObject nextContainer = null;
							if (container.eGet(ref) instanceof List<?>) {
								List<EObject> list = (List<EObject>) container.eGet(ref);
								if (list.size() > 0) {
									nextContainer = list.get(0);
								}
							}
							else {
								nextContainer = (EObject) container.eGet(ref);
							}
							if (nextContainer != null) {
								EObject ret = getContainerObject(nextContainer, object);
								if (ret != null) {
									return ret;
								}
							}
						}
					}
				}
			}
		}

		return null;

	}

	/**
	 * @param model
	 *            Loaded Model
	 * @return Root object
	 */
	public static EObject getRoot(Resource model) {
		Iterator<EObject> objects = model.getAllContents();

		if (objects.hasNext()) {
			EObject obj = objects.next();
			return obj;
		}
		return null;
	}
	
	/**
	 * @param model
	 *            Loaded Model
	 * @return EObject
	 */
	public static EObject getObject(Resource model, EObject eobj) {
		ArrayList<EObject> objs = getAllObjects(model);

		for (EObject obj : objs) {
			if (EcoreUtil.equals(eobj, obj)) {
				return obj;
			}
		}
		return null;
	}
	
	/**
	 * @param model
	 *            Loaded Model
	 * @return EObject
	 */
	public static EObject getObjectByID(Resource model, String identification) {
		ArrayList<EObject> objs = getAllObjects(model);

		for (EObject obj : objs) {
			if (EcoreUtil.getIdentification(obj).equals(identification)) {
				return obj;
			}
		}
		return null;
	}
	
	/**
	 * @param model
	 *            Loaded Model
	 * @return EObject
	 */
	public static EObject getObjectByURI(Resource model, URI uri) {
		ArrayList<EObject> objs = getAllObjects(model);

		for (EObject obj : objs) {
			if (EcoreUtil.getURI(obj).equals(uri)) {
				return obj;
			}
		}
		return null;
	}

	/**
	 * @param model
	 *            Loaded Model
	 * @return EObject
	 */
	public static EReference getReference(Resource model, EReference eref) {
		ArrayList<EReference> refs = getAllReferences(model);

		for (EReference ref : refs) {
			if (EcoreUtil.equals(eref, ref)) {
				return ref;
			}
		}
		return null;
	}
	
	/**
	 * @param model
	 *            Loaded Model
	 * @return EObject
	 */
	public static List<EReference> getContainmentReferencesOfType(List<EPackage> packages, EObject container, EObject obj) {
		
		List<EReference> refs = new ArrayList<EReference>();
		List<EClass> superTypes = new ArrayList<EClass>();
		superTypes.add(obj.eClass());
		superTypes.addAll(obj.eClass().getEAllSuperTypes());
		for (EReference ref : container.eClass().getEAllReferences()) {
			if (ref.isContainment()) {
				List<EClass> subTypes = new ArrayList<EClass>();
				subTypes.add(ref.getEReferenceType());
				subTypes.addAll(getESubClasses(packages, ref.getEReferenceType()));
				for (EClass subType : subTypes) {
					for (EClass superType : superTypes) {
						if (EcoreUtil.equals(subType, superType)) {
							if (!refs.contains(ref)) refs.add(ref);
						}
					}
				}
			}
		}
		return refs;
	}

	/**
	 * @param object
	 *            Object one wants to explore
	 * @return EList<EAttribute> Attributes of the object
	 */
	public static EList<EAttribute> getAttributes(EObject object) {

		EClass tipo = object.eClass();

		return tipo.getEAllAttributes();
	}

	/**
	 * @param att
	 *            Name of the attribute
	 * @param object
	 *            Object one wants to explore
	 * @return String Value of the attribute named by -att-
	 */
	public static String getStringAttribute(String att, EObject object) {

		EClass tipo = object.eClass();

		for (EStructuralFeature sf : tipo.getEAllAttributes()) {
			if (sf.getName().equals(att)) {
				return (String) object.eGet(sf, true);
			}
		}
		return null;
	}
	
	/**
	 * @param att
	 *            Name of the attribute
	 * @param object
	 *            Object one wants to explore
	 * @return String Value of the attribute named by -att-
	 */
	public static List<String> getStringListAttribute(String att, EObject object) {

		EClass tipo = object.eClass();

		for (EStructuralFeature sf : tipo.getEAllAttributes()) {
			if (sf.getName().equals(att)) {
				return (List<String>) object.eGet(sf, true);
			}
		}
		return null;
	}

	/**
	 * @param att
	 *            Name of the attribute
	 * @param object
	 *            Object one wants to explore
	 * @throws WrongAttributeTypeException
	 */
	public static Object getAttribute(String att, EObject object) {
		if (object != null) {
			EClass tipo = object.eClass();

			for (EStructuralFeature sf : tipo.getEAllAttributes()) {
				if (sf != null) {
					if (sf.getName().equals(att)) {
						return object.eGet(sf);
					}
				}
			}
		}
		return null;
	}
	


	/**
	 * @throws ReferenceNonExistingException
	 */
	public static EObject getReference(String ref, EObject object) throws
		ReferenceNonExistingException {

		EClass tipo = object.eClass();

		for (EStructuralFeature sf : tipo.getEAllReferences()) {
			if (sf != null) {
				if (sf.getName().equals(ref)) {
					return (EObject) object.eGet(sf);
				}
			}
		}
		return null;
	}
	
	/**
	 * @throws ReferenceNonExistingException
	 */
	public static List<EObject> getReferences(String ref, EObject object) throws
		ReferenceNonExistingException {

		EClass tipo = object.eClass();

		for (EStructuralFeature sf : tipo.getEAllReferences()) {
			if (sf != null) {
				if (sf.getName().equals(ref)) {
					return (List<EObject>) object.eGet(sf);
				}
			}
		}
		return null;
	}

	public static void setReference(String ref, EObject object,
			EObject newObject) throws WrongAttributeTypeException,
			ReferenceNonExistingException {

		EClass tipo = object.eClass();
		EObject tarObj = newObject;

		for (EStructuralFeature sf : tipo.getEAllReferences()) {
			if (sf != null) {
				if (sf.getName().equals(ref)) {
					if (tarObj != null) {
						boolean b = false;
						for (EStructuralFeature sfTar : tarObj.eClass()
								.getEAllReferences()) {
							if (sfTar != null) {
								if (sfTar.getName().equals(ref) && sf.isChangeable()) {
									object.eSet(sf, tarObj.eGet(sfTar));
									b = true;
									break;
								}
							}
						}
						if (b == false) {
							try {
								if (((EClass) sf.getEType()).isSuperTypeOf(tarObj.eClass()) && sf.isChangeable()) {
									if (object.eGet(sf) instanceof List<?>) {
										List<EObject> objects = (List<EObject>) object.eGet(sf);
										objects.add(tarObj);
									}
									else {
										object.eSet(sf, tarObj);
									}
								}
							} catch (ClassCastException ex) {
								throw new WrongAttributeTypeException(
										"The reference '"
												+ ref
												+ "' is not of the type '"
												+ tarObj.eClass().getName() + "'");
							}
						}
					} else {
						throw new ReferenceNonExistingException(
								"There is no object for the reference '" + ref
										+ "'");

					}
					// object.eSet(sf, tarObj);
				}
			}
		}
	}

	
	
	
	/**
	 * @param att
	 *            Name of the attribute
	 * @param object
	 *            Object one wants to explore
	 */
	public static void unsetAttribute(String att, EObject object) {
		EClass tipo = object.eClass();

		for (EStructuralFeature sf : tipo.getEAllAttributes()) {
			if (sf.getName().equals(att)) {
				object.eUnset(sf);
			}
		}
	}

	/**
	 * @param att
	 *            Name of the attribute
	 * @param object
	 *            Object one wants to explore
	 */
	public static void unsetReference(String ref, EObject object) {
		EClass tipo = object.eClass();

		for (EStructuralFeature sf : tipo.getEAllReferences()) {
			if (sf.getName().equals(ref)) {
				object.eUnset(sf);
			}
		}
	}

	/**
	 * @param att
	 *            Name of the attribute
	 * @param object
	 *            Object one wants to explore
	 * @param newValue
	 *            Value of the new attribute
	 */
	public static void setStringAttribute(String att, EObject object,
			String newValue) {

		EClass tipo = object.eClass();

		for (EStructuralFeature sf : tipo.getEAllAttributes()) {
			if (sf.getName().equals(att)) {
				object.eSet(sf, newValue);
			}
		}
	}

	/**
	 * @param att
	 *            Name of the attribute
	 * @param object
	 *            Object one wants to explore
	 * @param newValue
	 *            Value of the new attribute
	 */
	public static void setIntAttribute(String att, EObject object,
			int newValue) {

		EClass tipo = object.eClass();

		for (EStructuralFeature sf : tipo.getEAllAttributes()) {
			if (sf.getName().equals(att)) {
				object.eSet(sf, newValue);
			}
		}
	}
	/**
	 * @param att
	 *            Name of the attribute
	 * @param object
	 *            Object one wants to explore
	 * @return Integer Value of the attribute named by -att-
	 */
	public static Integer getIntAttribute(String att, EObject object) {

		EClass tipo = object.eClass();

		for (EStructuralFeature sf : tipo.getEAllAttributes()) {
			if (sf.getName().equals(att)) {
				return (Integer) object.eGet(sf, true);
			}
		}
		return null;
	}
	
	/**
	 * @param att
	 *            Name of the attribute
	 * @param object
	 *            Object one wants to explore
	 * @param newValue
	 *            Value of the new attribute
	 */
	public static void setEEnumAttribute(String att, EObject object,
			EEnum eenum, int newValue) {

		if (newValue < 0) {
			newValue = -newValue;
		}

		EClass tipo = object.eClass();
		
		EEnumLiteral literal = eenum.getELiterals().get(newValue % eenum.getELiterals().size());

		for (EStructuralFeature sf : tipo.getEAllAttributes()) {
			if (sf.getName().equals(att)) {
				object.eSet(sf, literal);
			}
		}
	}
	
	/**
	 * @param att
	 *            Name of the attribute
	 * @param object
	 *            Object one wants to explore
	 * @return Integer Value of the attribute named by -att-
	 */
	public static EEnumLiteral getEEnumAttribute(String att, EObject object, EEnum eenum) {

		EClass tipo = object.eClass();

		for (EStructuralFeature sf : tipo.getEAllAttributes()) {
			if (sf.getName().equals(att)) {
				int value = (int) object.eGet(sf, true);
				return eenum.getEEnumLiteral(value);
			}
		}
		return null;
	}

	/**
	 * @param att
	 *            Name of the attribute
	 * @param object
	 *            Object one wants to explore
	 * @param newValue
	 *            Value of the new attribute
	 */
	public static void setDoubleAttribute(String att, EObject object,
			double newValue) {

		EClass tipo = object.eClass();

		for (EStructuralFeature sf : tipo.getEAllAttributes()) {
			if (sf.getName().equals(att)) {
				object.eSet(sf, newValue);
			}
		}
	}
	
	/**
	 * @param att
	 *            Name of the attribute
	 * @param object
	 *            Object one wants to explore
	 * @return Double Value of the attribute named by -att-
	 */
	public static Double getDoubleAttribute(String att, EObject object) {

		EClass tipo = object.eClass();

		for (EStructuralFeature sf : tipo.getEAllAttributes()) {
			if (sf.getName().equals(att)) {
				return (Double) object.eGet(sf, true);
			}
		}
		return null;
	}
	
	/**
	 * @param att
	 *            Name of the attribute
	 * @param object
	 *            Object one wants to explore
	 * @param newValue
	 *            Value of the new attribute
	 */
	public static void setBooleanAttribute(String att, EObject object,
			boolean newValue) {

		EClass tipo = object.eClass();

		for (EStructuralFeature sf : tipo.getEAllAttributes()) {
			if (sf.getName().equals(att)) {
				object.eSet(sf, newValue);
			}
		}
	}

	/**
	 * @param att
	 *            Name of the attribute
	 * @param object
	 *            Object one wants to explore
	 * @return Boolean Value of the attribute named by -att-
	 */
	public static Boolean getBooleanAttribute(String att, EObject object) {

		EClass tipo = object.eClass();

		for (EStructuralFeature sf : tipo.getEAllAttributes()) {
			if (sf.getName().equals(att)) {
				return (Boolean) object.eGet(sf, true);
			}
		}
		return null;
	}

	/**
	 * @param object
	 *            Object one wants to explore
	 * @return List<EReference> References of the object
	 */
	public static List<EReference> getReferences(EObject object) {

		EClass tipo = object.eClass();

		return tipo.getEAllReferences();
	}

	/**
	 * @param container
	 *            Container object
	 * @param containing
	 *            Name of the containing Object
	 * @return References that contains the containing object
	 * @throws ReferenceNonExistingException
	 */
 	public static ArrayList<EReference> getContainingReferences(
			List<EPackage> metaModel, EObject container, String containing)
			throws ReferenceNonExistingException {
		ArrayList<EReference> contRefs = new ArrayList<EReference>();
		List<EReference> refs = getReferences(container);
		EClass obj = (EClass) getObjectOfType(containing, metaModel);

		for (EReference r : refs) {
			if (r.isChangeable()) {
				if (r.getEType().getName().equals(containing)) {
					if (!contRefs.contains(r)) {
						contRefs.add(r);
					}
				}
				for (EClass c : obj.getEAllSuperTypes()) {
					if (c.getName().equals(r.getEType().getName())) {
						if (!contRefs.contains(r)) {
							contRefs.add(r);
						}
					}
				}
			}
		}

		return contRefs;
	}
 	
 	public static EReference getContainingReference(EClass container, EClass containing) throws ReferenceNonExistingException {
		EReference contRef = null;
		List<EReference> refs = container.getEAllReferences();

		for (EReference r : refs) {
			if (r.isChangeable()) {
				if (r.getEType().getName().equals(containing.getName()) || containing.getEAllSuperTypes().contains(r.getEType())) {
					contRef = r;
					break;
				}
			}
		}

		return contRef;
	}

	/**
	 * @param name
	 *            Name of the reference
	 * @param model
	 *            Loaded Model
	 * @return ArrayList<EStructuralFeature> Specified references of the model
	 */
	public static ArrayList<EStructuralFeature> getAllReferencesByName(
			String name, Resource model) {
		ArrayList<EStructuralFeature> ret = new ArrayList<EStructuralFeature>();
		Iterator<EObject> objetos = model.getAllContents();
		EStructuralFeature sf = null;
		while (objetos.hasNext()) {
			EObject objeto = objetos.next();
			if ((sf = getReferenceByName(name, objeto)) != null)
				ret.add(sf);
		}
		return ret;
	}

	/**
	 * @param model
	 *            Loaded Model
	 * @return ArrayList<EStructuralFeature> References of the model
	 */
	public static ArrayList<EReference> getAllReferences(Resource model) {
		ArrayList<EReference> ret = new ArrayList<EReference>();
		Iterator<EObject> objetos = model.getAllContents();
		while (objetos.hasNext()) {
			EObject objeto = objetos.next();
			List<EReference> refs = getReferences(objeto);
			for (EReference r : refs) {
				if (!ret.contains(r)) {
					ret.add(r);
				}
			}
		}
		return ret;
	}

	/**
	 * @param source
	 *            Source object
	 * @param target
	 *            Target object
	 * @return EReference Specified reference
	 */
	public static EReference getReferenceBetweenObjects(EObject source,
			EObject target) {
		List<EReference> refs = source.eClass().getEAllReferences();

		for (EReference r : refs) {
			if (r.getUpperBound() == 1) {
				if (source.eGet(r, true).equals(target))
					return r;
			} else {
				for (EObject aux : (List<EObject>) source.eGet(r, true)) {
					if (aux != null && target.equals(aux)) {
						return r;
					}
				}
			}
		}
		return null;
	}

	/**
	 * @param name
	 *            Name of the reference
	 * @param object
	 *            Object one wants to explore
	 * @return EStructuralFeature Specified reference
	 */
	public static EStructuralFeature getReferenceByName(String name,
			EObject object) {
		EStructuralFeature sf = null;

		List<EReference> refs = getReferences(object);

		for (EStructuralFeature sf2 : refs) {
			if (sf2.getName().equals(name)) {
				sf = sf2;
			}
		}
		return sf;
	}
	
	/**
	 * @param name
	 *            Name of the reference
	 * @param object
	 *            Object one wants to explore
	 * @return EStructuralFeature Specified reference
	 */
	public static EReference getReferenceByURI(URI uri,
			EClass eClass) {
		List<EReference> refs = eClass.getEAllReferences();
		
		EReference ret = null;

		for (EReference ref : refs) {
			if (EcoreUtil.getURI(ref).equals(uri)) {
				ret = ref;
				break;
			}
		}
		return ret;
	}

	/**
	 * @param name
	 *            Name of the reference
	 * @param object
	 *            Object one wants to explore
	 * @return EStructuralFeature Specified reference
	 */
	public static EStructuralFeature getAttributeByName(String name,
			EObject object) {
		EStructuralFeature sf = null;

		List<EAttribute> atts = getAttributes(object);

		for (EStructuralFeature sf2 : atts) {
			if (sf2.getName().equals(name)) {
				sf = sf2;
			}
		}
		return sf;
	}

	/**
	 * @param model
	 *            Model one wants to output
	 * @param outputURI
	 *            URI of the new created Model
	 */
	public static void saveModel(Resource model, String outputURI) {
		ResourceSet rs = new ResourceSetImpl();
		ResourceSet rs2 = new ResourceSetImpl();
		rs2.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("*", new XMLResourceFactoryImpl());
		Resource resource = rs.createResource(URI.createURI(outputURI));
		resource.getContents().addAll(model.getContents());
		Map<Object, Object> options = new HashMap<Object, Object>();
		options.put(XMLResource.OPTION_SCHEMA_LOCATION, Boolean.TRUE);
		try {
			resource.save(options);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @param model
	 *            Model one wants to output
	 * @param outputURI
	 *            URI of the new created Model
	 */
	public static Resource createModel(String outputURI) {
		ResourceSet rs = new ResourceSetImpl();
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", new XMLResourceFactoryImpl());
		URI uri = URI.createFileURI(outputURI);
		Resource resource = rs.createResource(uri);
		return resource;
	}

	/**
	 * @param model
	 *            Model one wants to output
	 * @param outputURI
	 *            URI of the new created Model
	 */
	public static void createModel(EObject eobj, String outputURI) {
		ResourceSet rs = new ResourceSetImpl();
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", new XMLResourceFactoryImpl());
		URI uri = URI.createFileURI(outputURI);
		Resource resource = rs.createResource(uri);
		Map<Object, Object> saveOptions = ((XMLResource) resource)
				.getDefaultSaveOptions();
		saveOptions.put(XMLResource.OPTION_CONFIGURATION_CACHE, Boolean.TRUE);
		saveOptions.put(XMLResource.OPTION_USE_CACHED_LOOKUP_TABLE,	new ArrayList<Object>());
		saveOptions.put(XMLResource.OPTION_PROCESS_DANGLING_HREF, "DISCARD");
		resource.getContents().add(eobj);
		try {
			resource.save(saveOptions);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
	
	/**
	 * @param model
	 *            Model one wants to output
	 * @param outputURI
	 *            URI of the new created Model
	 */
	public static Resource createAndLoadModel(EObject eobj, String outputURI) {
		ResourceSet rs = new ResourceSetImpl();
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", new XMLResourceFactoryImpl());
		URI uri = URI.createFileURI(outputURI);
		Resource resource = rs.createResource(uri);
		Map<Object, Object> saveOptions = ((XMLResource) resource).getDefaultSaveOptions();
		saveOptions.put(XMLResource.OPTION_CONFIGURATION_CACHE, Boolean.TRUE);
		saveOptions.put(XMLResource.OPTION_USE_CACHED_LOOKUP_TABLE, new ArrayList<Object>());
		resource.getContents().add(eobj);
		try {
			resource.save(saveOptions);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		return resource;
	}

	/**
	 * @param l
	 *            List in order to get the size and index
	 * @return Random number
	 */
	public static int getRandomIndex(List<?> l) {
		if (l.size() <= 1)
			return 0;

		int index = rn.nextInt() % l.size();
		if (index < 0)
			index = index * -1;

		return index;
	}

	public static void saveOutModel(Resource model, String outputURI) {
		URI uri = model.getURI();
		model.setURI(URI.createFileURI(outputURI));
		Map<Object, Object> options = new HashMap<Object, Object>();
		options.put(XMLResource.OPTION_SCHEMA_LOCATION, Boolean.TRUE);
		options.put(XMLResource.OPTION_PROCESS_DANGLING_HREF, "DISCARD");
		try {
			model.save(options);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			model.setURI(uri);
		}
	}

	// ESTHER -----------------------------

	/**
	 * It returns the types that declare some reference to the received type.
	 * 
	 * @param List
	 *            <EPackage> metaModel
	 * @param String
	 *            type
	 */
	public static List<EClassifier> getContainerTypes(List<EPackage> metaModel, URI uri) {
		List<EClassifier> classifiers = new ArrayList<EClassifier>();
		EObject object = getObjectOfURI(uri, metaModel);
		if (object instanceof EClass) {
			EClass classifier = (EClass) object;
			if (classifier != null) {
				for (EPackage p : metaModel) {
					for (EClassifier c : p.getEClassifiers()) {
						if (c instanceof EClass) {
							for (EReference r : ((EClass) c).getEAllReferences()) {
								if (r.isContainment()) { // only containment
									// relations!
									if (r.getEReferenceType().isSuperTypeOf(
											classifier)
											&& !classifiers.contains(c)) {
										classifiers.add(c);
										break;
									}
								}
							}
						}

					}
					for (EPackage sp : p.getESubpackages()) {
						List<EPackage> packages = new ArrayList<EPackage>();
						packages.add(sp);
						List<EClassifier> containerTypes = getContainerTypes(packages, uri);
						for (EClassifier containerType : containerTypes) {
							if (!classifiers.contains(containerType)) {
								classifiers.add(containerType);
							}
						}
					}
				}
			}
		}
		return classifiers;
	}
	

	public static boolean compareModels(Resource model1, Resource model2) {
		IComparisonScope scope = new DefaultComparisonScope(model1, model2,
				null);
		Comparison comparison = EMFCompare.builder().build().compare(scope);

		List<Diff> differences = comparison.getDifferences();

		if (differences.size() == 0) {
			return true;
		}

		return false;
	}
	
	public static boolean compareObjects(EObject ob1, EObject ob2) {
		// note it is necessary to put the resources in a resourceset
		// cause EMF uses the resourceset to compute id's etc.
		final ResourceSet resourceSet = new ResourceSetImpl();
		final Resource resource1 = new XMLResourceImpl(URI.createURI("resource1.xml")); //$NON-NLS-1$
		final Resource resource2 = new XMLResourceImpl(URI.createURI("resource2.xml")); //$NON-NLS-1$
		resourceSet.getResources().add(resource1);
		resourceSet.getResources().add(resource2);
		resource1.getContents().add(ob1);
		resource2.getContents().add(ob2);

		final IEObjectMatcher matcher = DefaultMatchEngine.createDefaultEObjectMatcher(UseIdentifiers.NEVER);
		final IComparisonFactory comparisonFactory = new DefaultComparisonFactory(new DefaultEqualityHelperFactory());
		final IMatchEngine.Factory matchEngineFactory = new MatchEngineFactoryImpl(matcher, comparisonFactory);
		matchEngineFactory.setRanking(20);
		IMatchEngine.Factory.Registry matchEngineRegistry = new MatchEngineFactoryRegistryImpl();
		matchEngineRegistry.add(matchEngineFactory);
		final EMFCompare comparator = EMFCompare.builder().setMatchEngineFactoryRegistry(matchEngineRegistry).build();

		// Compare the two models
		final IComparisonScope scope = new DefaultComparisonScope(resource1, resource2, null);
		final Comparison comparison = comparator.compare(scope);
		final EList<Diff> differences = comparison.getDifferences();
		if (differences.size() == 0) {
			return true;
		}

		return false;
	}

	public static boolean compareListObjects(List<EObject> lob1, List<EObject> lob2) {
		final ResourceSet resourceSet = new ResourceSetImpl();
		final Resource resource1 = new XMLResourceImpl(URI.createURI("resource1.xml")); //$NON-NLS-1$
		final Resource resource2 = new XMLResourceImpl(URI.createURI("resource2.xml")); //$NON-NLS-1$
		resourceSet.getResources().add(resource1);
		resourceSet.getResources().add(resource2);
		resource1.getContents().addAll(lob1);
		resource2.getContents().addAll(lob2);

		final IEObjectMatcher matcher = DefaultMatchEngine.createDefaultEObjectMatcher(UseIdentifiers.NEVER);
		final IComparisonFactory comparisonFactory = new DefaultComparisonFactory(new DefaultEqualityHelperFactory());
		final IMatchEngine.Factory matchEngineFactory = new MatchEngineFactoryImpl(matcher, comparisonFactory);
		matchEngineFactory.setRanking(20);
		IMatchEngine.Factory.Registry matchEngineRegistry = new MatchEngineFactoryRegistryImpl();
		matchEngineRegistry.add(matchEngineFactory);
		final EMFCompare comparator = EMFCompare.builder().setMatchEngineFactoryRegistry(matchEngineRegistry).build();

		// Compare the two models
		final IComparisonScope scope = new DefaultComparisonScope(resource1, resource2,	null);
		final Comparison comparison = comparator.compare(scope);
		final EList<Diff> differences = comparison.getDifferences();
		if (differences.size() == 0) {
			return true;
		}

		return false;
	}
	
	/**
	 * It returns the list of classes defined in a meta-model.
	 */
	public static ArrayList<EClass> getEClasses(List<EPackage> packages) {
		ArrayList<EClass> classes = new ArrayList<EClass>();
		for (EPackage pck : packages) {
			for (EClassifier cl : pck.getEClassifiers()) {
				if (cl instanceof EClass) {
					if (!classes.contains((EClass) cl)) {
						classes.add((EClass) cl);
					}
				}
			}
			if (pck.getESubpackages() != null) {
				List<EClass> subpackageClasses = getEClasses(pck.getESubpackages());
				for (EClass cl : subpackageClasses) {
					if (!classes.contains(cl)) {
						classes.add(cl);
					}
				}
			}
		}
		return classes;
	}
	
	/**
	 * It returns the list of the given class subclasses defined in a meta-model.
	 */
	public static ArrayList<EClass> getESubClasses(List<EPackage> packages, EClass eClass) {
		ArrayList<EClass> subclasses = new ArrayList<EClass>();
		List<EClass> classes = ModelManager.getEClasses(packages);
		for (EClass cl : classes) {
			if (cl.getEAllSuperTypes().contains(eClass)) {
				if (!subclasses.contains(cl)) {
					subclasses.add(cl);
				}
			}
		}
		return subclasses;
	}

	/**
	 * It returns the class identified by the name defined in a meta-model.
	 */
	public static EClass getEClassByName(List<EPackage> packages, String name) {
		for (EPackage pck : packages) {
			for (EClassifier cl : pck.getEClassifiers()) {
				if (cl instanceof EClass) {
					if (cl.getName().equals(name) == true) {
						return (EClass) cl;
					}
				}
			}
			if (pck.getESubpackages() != null) {
				EClass cl = getEClassByName(pck.getESubpackages(), name);
				if (cl != null) {
					return cl;
				}
			}
		}
		return null;
	}
	
	/**
	 * It returns the class identified by the uri defined in a meta-model.
	 */
	public static EClass getEClassByURI(List<EPackage> packages, URI uri) {
		for (EPackage pck : packages) {
			for (EClassifier cl : pck.getEClassifiers()) {
				if (cl instanceof EClass) {
					if (EcoreUtil.getURI(cl).equals(uri)) {
						return (EClass) cl;
					}
				}
			}
			if (pck.getESubpackages() != null) {
				EClass cl = getEClassByURI(pck.getESubpackages(), uri);
				if (cl != null) {
					return cl;
				}
			}
		}
		return null;
	}

	/**
	 * It returns the list of classes defined in a meta-model package.
	 */
	public static EClass getEClassFromEPackage(EPackage pck, String name) {
		for (EClassifier cl : pck.getEClassifiers()) {
			if (cl instanceof EClass) {
				if (cl.getName().equals(name) == true) {
					return (EClass) cl;
				}
			}
		}
		if (pck.getESubpackages() != null) {
			for (EPackage spck : pck.getESubpackages()) {
				EClass cl = getEClassFromEPackage(spck, name);
				if (cl != null) {
					return cl;
				}
			}
		}
		return null;
	}

	/**
	 * It returns the reference by identified its uri defined in a meta-model.
	 */
	public static EReference getEReferenceByURI(EClass eClass, URI uri) {
		for (EReference ref : eClass.getEAllReferences()) {
			if (EcoreUtil.getURI(ref).equals(uri)) {
				return ref;
			}
		}
		return null;
	}
	
	/**
	 * Returns the corresponding object checking whether it is
	 * a proxy object
	 */
	public static EObject getEObject(EObject object, Resource seed) {
		if (object.eIsProxy()) {
			return EcoreUtil.resolve(object, seed);
		}
		return object;
	}
	
	/**
	 * Gets the root EClass
	 */
	public static EClass getRootEClass(List<EPackage> packages) {
		EClass root = null;
		ArrayList<EClass> eclasses = ModelManager.getEClasses(packages);
		for (EClass eclass : eclasses) {
			List<EClassifier> containerTypes = ModelManager.getContainerTypes(packages, EcoreUtil.getURI(eclass));
			if (containerTypes.size() == 0) {
				root = eclass;
				break;
			}
		}
		return root;
	}
	
	/**
	 * Gets the corresponding EPackage
	 */
	public static EPackage getEPackage(List<EPackage> packages, EClass eClass) {
		for (EPackage pck : packages) {
			for (EClassifier cl : pck.getEClassifiers()) {
				if (cl instanceof EClass) {
					if (EcoreUtil.equals((EClass) cl, eClass)) {
						return pck;
					}
				}
			}
			if (pck.getESubpackages() != null) {
				EPackage subpck = getEPackage(pck.getESubpackages(), eClass);
				if (subpck != null) {
					return subpck;
				}
			}
		}
		return null;
	}
	
	/**
	 * Gets the EPackage by its name 
	 */
	public static EPackage getEPackage(List<EPackage> packages, String name) {
		for (EPackage pck : packages) {
			if (pck.getName().equals(name)) {
				return pck;
			}
			if (pck.getESubpackages() != null) {
				EPackage subpck = getEPackage(pck.getESubpackages(), name);
				if (subpck != null) {
					return subpck;
				}
			}
		}
		return null;
	}
	
	/**
	 * Gets the compatible list of EClass for the given type
	 */
	public static List<EClass> getSiblingEClasses(String metamodel, EClass type) {
		List<EClass> sibling = new ArrayList<EClass>();
		try {
			List<EPackage> packages = MetamodelManager.loadMetaModel(metamodel);

			List<EClass> superTypes = type.getESuperTypes();
			sibling.addAll(ModelManager.getESubClasses(packages, type));
			List<EClass> classes = ModelManager.getEClasses(packages);
			for (EClass superType : superTypes) {
				for (EClass cl : classes) {
					List<EClass> clSuperTypes = cl.getESuperTypes();
					for (EClass clSuperType : clSuperTypes) {
						if (EcoreUtil.equals(superType, clSuperType)) {
							if (!sibling.contains(cl) && !EcoreUtil.equals(cl, type)) {
								sibling.add(cl);
								List<EClass> clSubClasses = ModelManager.getESubClasses(packages, cl);
								for (EClass clSubClass : clSubClasses) {
									if (!sibling.contains(clSubClass) && !EcoreUtil.equals(clSubClass, type)) {
										sibling.add(clSubClass);
									}
								}
							}
						}
					}
				}
			}
		} catch (MetaModelNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return sibling;
	}
	
	
	
}
