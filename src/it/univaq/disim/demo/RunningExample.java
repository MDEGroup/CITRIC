package it.univaq.disim.demo;

import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FilenameUtils;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.m2m.atl.core.ATLCoreException;
import org.eclipse.ocl.ParserException;

import it.univaq.disim.business.calculations.Coverage;
import it.univaq.disim.business.calculations.InformationLoss;
import it.univaq.disim.business.controller.ATLTransformationController;
import it.univaq.disim.business.controller.ChainController;
import it.univaq.disim.business.datamodel.Chain;
import it.univaq.disim.business.datamodel.Transformation;
import it.univaq.disim.business.manager.MetamodelManager;
import it.univaq.disim.business.manager.ModelManager;
import it.univaq.disim.common.utils.CSVUtils;
import it.univaq.disim.common.utils.Utils;

public class RunningExample {

	private static final String STRING_FORMAT = "#.##";
	
	private final static String resourcesBasePath = "resources/";
	private final static String csvFile = resourcesBasePath + "csv/";
	private final static String runningExampleBasePath = "running_example/";
	private final static String transformationsPath = resourcesBasePath + runningExampleBasePath + "transformations/";
	private final static String metamodelsPath = resourcesBasePath + runningExampleBasePath +"metamodels/";
	private final static String baseForModels = "mutations/";
	private final static String baseForResults = "results/";
	
	
	
public static void main(String[] args) throws ATLCoreException, ParserException {
		
		String inputMetamodel = metamodelsPath + "KM.ecore";
		MetamodelManager.registerMetamodel(inputMetamodel);
		
		String inputModel_1 = resourcesBasePath + baseForModels +"KM3_seed.xmi";
		
		
		List<String> inputModels = new ArrayList<String>();
		inputModels.add(inputModel_1);
		
		
		
		List<List<Chain>> listOfListOfChains = new ArrayList<List<Chain>>();
		
		for (String inputModel : inputModels) {
			Resource model = ModelManager.loadModel(inputModel);
			if(model != null){
				List<Chain> chains = calculateChains(inputModel);
				listOfListOfChains.add(chains);
			}
		}
		
		boolean isValid = ChainController.checkValidity(listOfListOfChains);
//		System.out.println(isValid);
		saveToCSV2(listOfListOfChains);
		assert(isValid);
	}

public static List<Chain> calculateChains(String inputModel) throws ATLCoreException, ParserException{
		
		String inputModelName = cleanInputModel(inputModel);
		
		String outPath_chain_1 = resourcesBasePath + baseForResults + inputModelName+"/output_model_chain_1.xmi";
		String outPath_chain_2 = resourcesBasePath + baseForResults + inputModelName+"/output_model_chain_2.xmi";
		String outPath_chain_3 = resourcesBasePath + baseForResults + inputModelName+"/output_model_chain_3.xmi";
		
		
//		ChainController chainController = new ChainController();
//		chainController.executeChain(Example.getChain1());
//		chainController.executeChain(Example.getChain2());
//		chainController.executeChain(Example.getChain3());
//		chainController.executeChain(Example.getChain4());
//		
//		
//		ATLTransformationController myT = null;
//		try {
//			myT = new ATLTransformationController();
//			
//			System.out.println("Esecuzione Catena 1: A2B -> B2C -> C2E");
//			System.out.println("Esecuzione T: A2B");
//			myT.run(t_KM32EMF);
//			t_B2C.setInformationLoss(InformationLoss.informationLoss(t_B2C));
//			
//			System.out.println("Esecuzione T: B2C");
//			myT.run(t_B2C);
//			t_C2E.setInformationLoss(InformationLoss.informationLoss(t_C2E));
//			
//			System.out.println("Esecuzione T: C2E");
//			myT.run(t_C2E);
//			System.out.println("----------------------------------------");
//			
//			System.out.println("Esecuzione Catena 2: A2D -> D2E");
//			System.out.println("Esecuzione T: A2D");
//			t_A2D.setInformationLoss(InformationLoss.informationLoss(t_A2D));
//			myT.run(t_A2D);
//			t_D2E.setInformationLoss(InformationLoss.informationLoss(t_D2E));
//			
//			System.out.println("Esecuzione T: D2E");
//			myT.run(t_D2E);
//			System.out.println("----------------------------------------");
//			
//			System.out.println("Esecuzione Catena 3: A2E");
//			System.out.println("Esecuzione T: A2E");
//			t_A2E.setInformationLoss(InformationLoss.informationLoss(t_A2E));
//			myT.run(t_A2E);
//			
//			System.out.println("----------------------------------------");
//			
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		chain4.setResultModelElements(Calculations.inputModelElements(outPath_chain_1, MM_E));
//		chain4.setResultModelElements(Calculations.inputModelElements(outPath_chain_2, MM_E));
//		chain4.setResultModelElements(Calculations.inputModelElements(outPath_chain_3, MM_E));
//		
//		chain4.setInformationLoss(ChainController.calculateChainInformationLoss(chain4));
//		chain4.setInformationLoss(ChainController.calculateChainInformationLoss(chain4));
//		chain4.setInformationLoss(ChainController.calculateChainInformationLoss(chain4));
//		
//		chain4.setWeight(ChainController.calculateChainWeight(chain4));
//		chain4.setWeight(ChainController.calculateChainWeight(chain4));
//		chain4.setWeight(ChainController.calculateChainWeight(chain4));
//		
//		/**
//		 * Write results on CSV file
//		 */
		 List<Chain> allChains = new ArrayList<Chain>();
//		allChains.add(chain4);
//		allChains.add(chain4);
//		allChains.add(chain4);
		
		
		return allChains;
	}


private static String cleanInputModel(String inputModel) {
	return FilenameUtils.getBaseName(inputModel);
}

private static void saveToCSV2(List<List<Chain>> listOfAllChains){
	
	DecimalFormat df = new DecimalFormat(STRING_FORMAT);
	
	String resultFile = csvFile+"result.csv";
	
	try {
		FileWriter writer = new FileWriter(resultFile);
		
		List<String> header = new ArrayList<String>();
		header.add(" ");
		header.add("Model ID");
		header.add("Instances");
		header.add("IL Chain 1");
		header.add("Weight Chain 1");
		header.add("Chain 1 - Elements in Output Model");
		header.add("IL Chain 2");
		header.add("Weight Chain 2");
		header.add("Chain 2 - Elements in Output Model");
		header.add("IL Chain 3");
		header.add("Weight Chain 3");
		header.add("Chain 3 - Elements in Output Model");
		CSVUtils.writeLine(writer, header);
		
		//Calculate the coverage once
		
		List<String> covLine = new ArrayList<String>();
		covLine.add("COV");
		covLine.add(Utils.getNameFromPathWithoutExtension(listOfAllChains.get(0).get(0).getTransformations().get(0).getInputModel()));
		covLine.add(" - ");
		covLine.add(df.format(listOfAllChains.get(0).get(0).getCoverage()));
		covLine.add(" - ");
		covLine.add(" - ");
		covLine.add(df.format(listOfAllChains.get(0).get(1).getCoverage()));
		covLine.add(" - ");
		covLine.add(" - ");
		covLine.add(df.format(listOfAllChains.get(0).get(2).getCoverage()));
		covLine.add(" - ");
		covLine.add(" - ");
		CSVUtils.writeLine(writer, covLine);

		for (List<Chain> allChains : listOfAllChains) {
			List<String> ilLine = new ArrayList<String>();
			ilLine.add(Utils.getNameFromPathWithoutExtension(allChains.get(0).getTransformations().get(0).getInputModel()));
//			ilLine.add(allChains.get(0).getInputModelElements());
//			ilLine.add(df.format(allChains.get(0).getInformationLoss()));
//			ilLine.add(df.format(allChains.get(0).getWeight()));
//			ilLine.add(allChains.get(0).getResultModelElements());
//			ilLine.add(df.format(allChains.get(1).getInformationLoss()));
//			ilLine.add(df.format(allChains.get(1).getWeight()));
//			ilLine.add(allChains.get(1).getResultModelElements());
//			ilLine.add(df.format(allChains.get(2).getInformationLoss()));
//			ilLine.add(df.format(allChains.get(2).getWeight()));
//			ilLine.add(allChains.get(2).getResultModelElements());
			CSVUtils.writeLine(writer, ilLine);
		}
		
		
		writer.flush();
		writer.close();
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}



}
