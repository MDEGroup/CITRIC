package it.univaq.disim.business.controller;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.m2m.atl.common.ATLExecutionException;
import org.eclipse.m2m.atl.core.ATLCoreException;
import org.eclipse.m2m.atl.core.IExtractor;
import org.eclipse.m2m.atl.core.IInjector;
import org.eclipse.m2m.atl.core.IModel;
import org.eclipse.m2m.atl.core.IReferenceModel;
import org.eclipse.m2m.atl.core.ModelFactory;
import org.eclipse.m2m.atl.core.emf.EMFExtractor;
import org.eclipse.m2m.atl.core.emf.EMFInjector;
import org.eclipse.m2m.atl.core.emf.EMFModelFactory;
import org.eclipse.m2m.atl.core.launch.ILauncher;
import org.eclipse.m2m.atl.engine.compiler.atl2006.Atl2006Compiler;
import org.eclipse.m2m.atl.engine.emfvm.launch.EMFVMLauncher;

import anatlyzer.atl.analyser.Analyser;
import anatlyzer.atl.errors.Problem;
import anatlyzer.atl.model.ErrorModel;
import it.univaq.disim.business.datamodel.ModelStructuralFeature;
import it.univaq.disim.business.datamodel.Transformation;
import it.univaq.disim.business.manager.ATLTransformationManager;
import it.univaq.disim.business.manager.MetamodelManager;
import it.univaq.disim.business.manager.ModelManager;
import it.univaq.disim.common.exceptions.MetaModelNotFoundException;


public class ATLTransformationPerformer {
	private ATLTransformationManager atlManager;
	private IModel inModel;
	private IModel outModel;

	private IReferenceModel inmodelMetamodel;
	private IReferenceModel outmodelMetamodel;

	private String modules; //The .atl transformation file

	private String inTag;
	private String outTag;

	private Map<String, Object> options;

	public ATLTransformationPerformer() {
		options = new HashMap<String, Object>();
		options.put("supportUML2Stereotypes", "false");
		options.put("printExecutionTime", "true");
		options.put("OPTION_CONTENT_TYPE", "false");
		options.put("allowInterModelReferences", "false");
		options.put("step", "false");
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());

	}
	
	
	
	/**
	 * La funzione e' l'unica ad essere visibile all'esterno ed e' quella che avvia tutto il processo di trasformazione.
	 * @param transformation
	 * @return IModel
	 */
	public IModel run(Transformation transformation) {
		System.out.println("Starting "+transformation.getATLTransformation()+" transformation...");
		
		if(transformation.isComplete()) {
			String model_in = transformation.getInputModel(); 
			String metamodel_in  = transformation.getInputMetamodel();
			String metamodel_out  = transformation.getOutputMetamodel();
			String atlTransformationPath  = transformation.getATLTransformation();
			String inTag  = transformation.getInTag();
			String outTag  = transformation.getOutTag();
			String outPath  = transformation.getOutPath();
			this.atlManager = new ATLTransformationManager(atlTransformationPath);
			
			if(atlManager.isValidTransformation()) {
				try {
					set(model_in, metamodel_in, metamodel_out, atlTransformationPath, inTag, outTag);
					//Eseguiamo la trasformazione
					doTransformation(new NullProgressMonitor());
					//Salviamo il modello creato in un file che ha il nome passato in input con outPath
					IExtractor extractor = new EMFExtractor();
					extractor.extract(outModel, outPath);
					
					//			//Creiamo un oggetto file con il path inserito dall'utente, ovvero ci andiamo a prendere il modello appena creato e salvato
					//			File myTemp = new File(outPath);
					//			//Andiamo a prenderci il contenuto del file (quindi del modello) per esporlo come JSON
					//			String myContent = FileUtils.readFileToString(myTemp);
					
					System.out.println("Transformation "+atlTransformationPath+" executed!");
				} catch (ATLCoreException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				} catch (ATLExecutionException e) {
					e.printStackTrace();
				}
			}else {
				ErrorModel atlErrors = atlManager.getATLErrors();
				System.out.println("The transformation has errors:");
				for (Problem problem : atlErrors.getProblems()) {
					System.out.println(problem.getDescription());
				}
			}
			
		
		}else {
			System.out.println("The transformation object is incomplete! Its impossible to perform the transformation!");
		}
		
		return this.outModel;
	}
	

	/**
	 * La funzione prende tutti i parametri che gli vengono passati in input e li mette nelle variabili della class
	 * usando i tipi propri di ATL.
	 * @param model_in
	 * @param metamodel_in
	 * @param metamodel_out
	 * @param modules
	 * @param inTag
	 * @param outTag
	 * @throws ATLCoreException
	 */
	private void set(String model_in, String metamodel_in, String metamodel_out, String modules, String inTag, String outTag) throws ATLCoreException {
			ModelFactory factory = new EMFModelFactory();
			IInjector injector = new EMFInjector();
			
			this.inmodelMetamodel = factory.newReferenceModel();
			injector.inject(this.inmodelMetamodel,  metamodel_in);
			this.outmodelMetamodel = factory.newReferenceModel();
			injector.inject(this.outmodelMetamodel,  metamodel_out);
			this.outModel = factory.newModel(this.outmodelMetamodel);
			this.inModel = factory.newModel(this.inmodelMetamodel);
			injector.inject(this.inModel,  model_in);
			this.modules = modules;
//			this.inTag = inTag;
//			this.outTag = outTag;
			this.inTag = atlManager.getInTag();
			this.outTag = atlManager.getOutTag();
	}

	/**
	 * Semplice funzione di get che ritorna le opzioni settate dal costruttore all'atto di definizione della classe
	 * @return Map<String, Object> options
	 */
	private Map<String, Object> getOptions() {
		return options;
	}

	/**
	 * La funzione esegue la trasformazione vera e propria utilizzando le variabili della classe gia' settate dal metodo set.
	 * @param monitor
	 * @return Object
	 * @throws ATLCoreException
	 * @throws IOException
	 * @throws ATLExecutionException
	 */
	private Object doTransformation(IProgressMonitor monitor)
			throws ATLCoreException, IOException, ATLExecutionException {
		ILauncher launcher = new EMFVMLauncher();
		List<InputStream> inputStreamsToClose = new ArrayList<InputStream>();
		Map<String, Object> launcherOptions = getOptions();
		launcher.initialize(launcherOptions);
		launcher.addInModel(this.inModel, "IN", this.inTag);
		launcher.addOutModel(this.outModel, "OUT", this.outTag);
		InputStream[] modulesStreams = getModulesList();
		inputStreamsToClose.addAll(Arrays.asList(modulesStreams));
		Object result = launcher.launch("run", monitor, launcherOptions,
				(Object[]) modulesStreams);
		for (InputStream inputStream : inputStreamsToClose) {
			inputStream.close();
		}
		return result;
	}

	/**
	 * La funzione ritorna i moduli che sono presenti nel file della trasformazione. Ogni file di trasformazione (.atl) puo' contenere
	 * piu' moduli al suo interno (ognuno dei ha al suo interno il mapping che effettua la trasformazione). Ognuno di questi moduli al 
	 * suo interno avra' una variabile di IN ed una di OUT per es. Ognuno di questi moduli viene poi salvato separatamente in un file .asm.
	 * @return InputStream[]
	 * @throws IOException
	 */
	private InputStream[] getModulesList() throws IOException  {
		InputStream[] modules = null;
		String[] moduleNames = this.modules.split(",");
		modules = new InputStream[moduleNames.length];
		for (int i = 0; i < moduleNames.length; i++) {
			
			String asmModulePath = new Path(moduleNames[i].trim()).removeFileExtension().addFileExtension("asm").toString();
//			System.out.println(asmModulePath);

			Atl2006Compiler compiler = new Atl2006Compiler();
//			compiler.compile(new FileInputStream(new File(moduleNames[i])), "resources/transformation/juri.asm");
			compiler.compile(new FileInputStream(new File(moduleNames[i])), asmModulePath);
			
			modules[i] = new FileInputStream(asmModulePath);
		}
		return modules;
	}
	
	
	

	public static void main(String[] args) throws IOException, MetaModelNotFoundException {
		ATLTransformationPerformer atlTController = new ATLTransformationPerformer();
//		String atlT = "resources/running_example/transformations/emf2java.atl";
//		String metamodel_in = "resources/running_example/metamodels/Ecore.ecore";
//		String model_in = "resources/running_example/metamodels/Sample.ecore";
		String metamodel_out = "resources/running_example/metamodels/HTML.ecore";
		
		String metamodel_in = "resources/running_example/metamodels/Table.ecore";
		String model_in = "resources/running_example/models/Table.xmi";
		String atlT = "resources/running_example/transformations/Table2TabularHTML.atl";
		MetamodelManager.registerMetamodel(metamodel_in);
//		String inTag = "KM3";
//		String outTag = "MOF";
		String outModelPath = "resources/running_example/models/HTML.xmi";
		
		Transformation t = new Transformation();
		t.setATLTransformation(atlT);
		t.setInputMetamodel(metamodel_in);
		t.setOutputMetamodel(metamodel_out);
		t.setInputModel(model_in);
//		t.setInTag(inTag);
//		t.setOutTag(outTag);
		t.setOutPath(outModelPath);
		
		atlTController.run(t);
	}

}