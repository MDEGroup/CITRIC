package it.univaq.disim.business.mutator.ecoremutator;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.modelversioning.ecoremutator.EcoreMutator;
import org.modelversioning.ecoremutator.IModelProvider;
import org.modelversioning.ecoremutator.mutations.ModelProvider;
import org.modelversioning.ecoremutator.tracker.IMutationTracker;

import it.univaq.disim.business.manager.MetamodelManager;
import it.univaq.disim.business.mutator.ecoremutator.mutations.metamodel.AddEAttributeMutation;
import it.univaq.disim.common.utils.Utils;

public class EcoreMetamodelGenerator {

	private static final int NUMBER_OF_OBJECTS = 1;
	ResourceSet resourceSet = new ResourceSetImpl();
	Resource copiedResource;
	private IModelProvider modelProvider;
	private IMutationTracker tracker;
	private String inputModelPath;


	public EcoreMetamodelGenerator(String inputModelPath) {
		this.inputModelPath = inputModelPath;
		// register metamodel
		MetamodelManager.registerMetamodel(this.inputModelPath);
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
		
		// load sample 1 model
		copiedResource = loadResource(outputModelPath);
		// initialize sample 1 model provider
		modelProvider = new ModelProvider();
		modelProvider.setModelResource(copiedResource);
	}

	private String createOutputFilePathName(String inputModelPath, int iteration) {
		return Utils.getRelativePathRoot(inputModelPath) + Utils.getNameFromPathWithoutExtension(inputModelPath)
				+ "_mutated_"+iteration+"." + Utils.getPathExtension(inputModelPath);
	}

	public Resource loadResource(String fileURIString) {
		URI fileURI = URI.createURI(fileURIString, true);
		return resourceSet.getResource(fileURI, true);
	}

	protected void tearDown() throws Exception {
		copiedResource.unload();
	}

	public void mutate(int numberOfMutations) throws IOException {
		
		while(numberOfMutations > 0) {
			setUp(numberOfMutations);
			EcoreMutator ecoreMutator = new EcoreMutator();
			ecoreMutator.addMutation(new AddEAttributeMutation(), 1);
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
			ecoreMutator.mutate(modelProvider, NUMBER_OF_OBJECTS);
//			Resource outputResource = createResource2(outputUri);
//			outputResource.getContents().addAll(inputResource.getContents());
//			if(inputResource.getContents().size() > 0) {
//				System.out.println("Rsource is not empty!");
//			}
//			outputResource.save(Collections.emptyMap());
			if(validateObject(copiedResource)) {
				copiedResource.save(null);
			}else {
				//delete copied file
				deleteCopiedFile(numberOfMutations);
			}
			
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

//	public static void registerMetamodel(String path) {
//		File fileName = new File(path);
//		URI uri = URI.createFileURI(fileName.getAbsolutePath());
//		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
//		ResourceSet rs = new ResourceSetImpl();
//		// enable extended metadata
//		final ExtendedMetaData extendedMetaData = new BasicExtendedMetaData(rs.getPackageRegistry());
//		rs.getLoadOptions().put(XMLResource.OPTION_EXTENDED_META_DATA, extendedMetaData);
//		Resource r = rs.getResource(uri, true);
//		List<EObject> eObject = r.getContents();
//		for (EObject eObject2 : eObject) {
//			if (eObject2 instanceof EPackage) {
//				EPackage p = (EPackage) eObject2;
//				registerSubPackage(p);
//			}
//		}
//		System.out.println(path+" registered!");
//	}
//	
//		
//		private static void registerSubPackage(EPackage p) {
//			EPackage.Registry.INSTANCE.put(p.getNsURI(), p);
//			for (EPackage pack : p.getESubpackages()) {
//				registerSubPackage(pack);
//			}
//		}
	
	
	public static void main(String[] args) throws IOException {
		String inputModelPath = "resources/mutations/MM_A.ecore";
		int numberOfMutations = 50;
		EcoreMetamodelGenerator gen = new EcoreMetamodelGenerator(inputModelPath);
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