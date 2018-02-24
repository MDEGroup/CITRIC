package it.univaq.disim.business.mutator.ecoremutator;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.DynamicEObjectImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.ocl.OCL;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.expressions.OCLExpression;
import org.eclipse.ocl.helper.OCLHelper;
import org.modelversioning.ecoremutator.EcoreMutator;
import org.modelversioning.ecoremutator.IModelProvider;
import org.modelversioning.ecoremutator.mutations.ModelProvider;

import it.univaq.disim.business.manager.BaseEcoreModelManager;
import it.univaq.disim.business.manager.ModelManager;
import it.univaq.disim.business.mutator.ecoremutator.mutations.model.DeleteConcreteClass;
import it.univaq.disim.common.utils.Utils;

public class ModelMutation extends BaseEcoreModelManager{

	private static final int NUMBER_OF_OBJECTS = 1;
	ResourceSet resourceSet = new ResourceSetImpl();
	Resource copiedResource;
	private IModelProvider modelProvider;
	private String inputMetamodelPath;
	private String inputModelPath;

//	private static ResourceSet load_resourceSet = new ResourceSetImpl();
	
	
	

	public ModelMutation(String inputMetamodelPath, String inputModelPath) {
		this.inputMetamodelPath = inputMetamodelPath;
		// register metamodel
		registerMetamodel(this.inputMetamodelPath);

		this.inputModelPath = inputModelPath;
	}

	protected void setUp( int numberOfMutations) {
		String outputModelPath = createOutputFilePathName(inputModelPath, numberOfMutations);
		try {
			Utils.copyFiles(inputModelPath, outputModelPath);
			System.out.println(inputModelPath + " copied into " + outputModelPath);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		Object modelRootPackage = loadModel(outputModelPath);
//		if(modelRootPackage != null){
//			/**
//			 * Load and register Metamodel
//			 */
//			copiedResource = load_resourceSet.getResource(URI.createURI(outputModelPath),true);
//		}
		
		// load sample 1 model
		copiedResource = ModelManager.loadModel(outputModelPath);
		
//		try {
//			for (EClass iterable_element : getModelClassElements(copiedResource)) {
//				System.out.println(iterable_element.getName());
//			}
//		} catch (ParserException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		
		// initialize sample 1 model provider
		modelProvider = new ModelProvider();
		modelProvider.setModelResource(copiedResource);
	}

	private String createOutputFilePathName(String inputModelPath, int iteration) {
		return Utils.getRelativePathRoot(inputModelPath) + Utils.getNameFromPathWithoutExtension(inputModelPath)
				+ "_mutated_"+iteration+"." + Utils.getPathExtension(inputModelPath);
	}

//	public Resource loadMetamodel(String fileURIString) {
//		URI fileURI = URI.createURI(fileURIString, true);
//		return resourceSet.getResource(fileURI, true);
//	}
	
	

	protected void tearDown() throws Exception {
		copiedResource.unload();
	}

	public void mutate(int numberOfMutations) throws IOException {
		
		while(numberOfMutations > 0) {
			setUp(numberOfMutations);
			EcoreMutator ecoreMutator = new EcoreMutator();
//			ecoreMutator.addMutation(new AddEAttributeMutation2(), 1);
			ecoreMutator.addMutation(new DeleteConcreteClass(), 1);
//			ecoreMutator.addMutation(new AddEClassMutation(), 1);
//		 	ecoreMutator.addMutation(new AddEReferenceMutation(), 1);
//			ecoreMutator.addMutation(new AddSuperTypeMutation(), 1);
//			ecoreMutator.addMutation(new AddObjectMutation(), 1);
//			ecoreMutator.addMutation(new AddAnnotationMutation());
//			ecoreMutator.addMutation(new AddObjectMutation());
//			ecoreMutator.addMutation(new DeleteObjectMutation());
//			ecoreMutator.addMutation(new MoveObjectMutation());
//			ecoreMutator.addMutation(new UnsetFeatureMutation()); 
//			ecoreMutator.addMutation(new UpdateFeatureMutation());
			// configure a change tracker
//			ecoreMutator.setTracker(tracker);
			
			
			
			
//			Resource inputResource = loadResource(inputUri);
			// initialize model provider
			IModelProvider modelProvider = new ModelProvider();
			modelProvider.setModelResource(copiedResource);
			// mutate model
			ecoreMutator.mutate(modelProvider, NUMBER_OF_OBJECTS);
			// save output model
			Resource outputResource = resourceSet.createResource(URI.createURI("resources/mutations/bascio.xmi"));
			if(copiedResource.getContents().size() > 0) {
				System.out.println("Resource is not empty!");
				outputResource.getContents().addAll(copiedResource.getContents());
				outputResource.save(Collections.EMPTY_MAP);
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
//			ecoreMutator.mutate(modelProvider, NUMBER_OF_OBJECTS);
//			Resource outputResource = createResource("resources/mutation_test/bascio.xmi");
//			outputResource.getContents().addAll(inputResource.getContents());
//			if(inputResource.getContents().size() > 0) {
//				System.out.println("Resource is not empty!");
//			}
//			outputResource.save(Collections.emptyMap());
//			if(validateObject(copiedResource)) {
//				copiedResource.save(null);
//			}else {
//				//delete copied file
//				deleteCopiedFile(numberOfMutations);
//			}
			
			numberOfMutations--;
		}
		
	}

	
	
	private void deleteCopiedFile(int iteration) {
		String filePathToDelete = Utils.getRelativePathRoot(inputModelPath) + Utils.getNameFromPathWithoutExtension(inputModelPath)+ "_mutated_"+iteration+"." + Utils.getPathExtension(inputModelPath);
		File file = new File(filePathToDelete);

		if(file.delete()){
			System.out.println(file.getName() + " is deleted!");
		}else{
			System.out.println("Delete operation is failed.");
		}
	}

	
		
//		private static List<EClass> getModelClassElements2(Resource r){
//			List<EClass> result = new ArrayList<EClass>();
//			List<EObject> eObject = r.getContents();
//			for (EObject eObject2 : eObject) {
//				if (eObject2 instanceof EPackage) {
//					EPackage p = (EPackage) eObject2;
//					result.addAll(getAllEClasses(p));
//				}
//			}
//			return result;
//		}
		
//		private  Map<EPackage, List<EClass>> packageToModelElementEClasses = new LinkedHashMap<EPackage, List<EClass>>();
//		
//		public  List<EClass> getAllEClasses(EPackage ePackage) {
//			
//			
//			if (packageToModelElementEClasses.containsKey(ePackage)) {
//				return packageToModelElementEClasses.get(ePackage);
//			}
//			if (ePackage == null) {
//				packageToModelElementEClasses.put(ePackage,
//						new LinkedList<EClass>());
//				return packageToModelElementEClasses.get(ePackage);
//			}
//			List<EClass> result = new LinkedList<EClass>();
//			// obtain all EClasses from sub packages
//			for (EPackage subPackage : ePackage.getESubpackages()) {
//				result.addAll(getAllEClasses(subPackage));
//			}
//			// obtain all EClasses that are direct contents of the EPackage
//			for (EClassifier classifier : ePackage.getEClassifiers()) {
//				if (classifier instanceof EClass) {
//					result.add((EClass) classifier);
//				}
//			}
//			// save the result for upcoming method calls
//			packageToModelElementEClasses.put(ePackage, result);
//			return result;
//		}
		
		
		
		
		private static List<EClass> getModelClassElements(Resource resource) throws ParserException {
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
//			OCLExpression<EClassifier> expression = helper.createQuery("MM_A::A.allInstances()");
			OCLExpression<EClassifier> expression = helper.createQuery("MM_A::A.allInstances()");
			// CREATE QUERY FROM OCLEXPRESSION
			Query<EClassifier, EClass, EObject> query = ocl.createQuery(expression);

			Object rootPackage = null;
			if(!resource.getContents().isEmpty()){
				rootPackage = (Object) resource.getContents().get(0);
			}
			
			List<EClass> result = new ArrayList<EClass>();
			
			// EVALUATE OCL
//			int success = (int) query.evaluate(rootPackage);
			HashSet<Object> success = (HashSet<Object>) query.evaluate(rootPackage);
//			List<Object> callableMethods = new ArrayList<Object>();
			for (Object object : success) {
				
				System.out.println(objectToString(object));
				
				DynamicEObjectImpl eClass = (DynamicEObjectImpl)object;
				EClass c = ((DynamicEObjectImpl) eClass).eClass();
//				EClassImpl c = (EClassImpl)object;
				result.add(c);
//				System.out.println("#@#@#@#@#@#-> "+eClass.toString());
//				System.out.println("#@#@#@#@#@#-> "+c.getName());
//				callableMethods.add(object);
			}
//			EObject rootPackage = (EObject) resource.getContents().get(0);
			
//			HashSet<Object> success = (HashSet<Object>) query.evaluate(rootPackage);
//			List<EClass> callableMethods = new ArrayList<EClass>();
//			for (Object object : success) {
//				callableMethods.add((EClass) object);
//			}
			return result;
		}
	
		
		
		 
		
		
	public static void main(String[] args) throws IOException {
//		String inputMetamodelPath = "resources/mutation_test/MM_A.ecore";
//		String inputModelPath = "resources/mutation_test/Model_a_1.xmi";
		String inputMetamodelPath = "resources/mutations/ProjectManagement.ecore";
		String inputModelPath = "resources/mutations/projmanagement.xmi";
		int numberOfMutations = 1;
		ModelMutation gen = new ModelMutation(inputMetamodelPath, inputModelPath);
		gen.mutate(numberOfMutations);

		// String fileURIString_1 = "resources/mutation_test/MM_A.ecore";
		// MyMutator.registerMetamodel(fileURIString_1);
		// Resource test1 = gen.loadResource(fileURIString_1);
		// System.out.println(gen.validateObject(test1));
		//
		// String fileURIString_2 = "resources/mutation_test/MM_A_mutated.ecore";
		// MyMutator.registerMetamodel(fileURIString_2);
		// Resource test2 = gen.loadResource(fileURIString_2);
		// System.out.println(gen.validateObject(test2));
	}

}