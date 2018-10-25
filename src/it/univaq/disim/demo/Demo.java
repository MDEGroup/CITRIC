package it.univaq.disim.demo;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import it.univaq.disim.business.datamodel.Chain;
import it.univaq.disim.business.datamodel.Transformation;
import it.univaq.disim.business.manager.ATLTransformationManager;
import it.univaq.disim.common.graph.Graph;
import it.univaq.disim.common.utils.Utils;
import it.univaq.disim.test.ChainDetector;

public class Demo {
	

	private static List<Transformation> transformationList = new ArrayList<Transformation>();
	private static List<List<String>> chainList = new ArrayList<List<String>>();
	static List<String> chainNames = new ArrayList<String>();

	
	
	
	public static void main(String[] args) {
		// RESOURCE FOLDER
		String resourceFolder = "resources/demo"; 
		// INPUT METAMODEL
		String inputMetamodelPath = "resources/demo/metamodels/KM3.ecore"; 
		// OUTPUT METAMODEL
		String outputMetamodelPath = "resources/demo/metamodels/XML.ecore";
		// INPUT MODEL
		String inputModelPath = "resources/demo/models/sample-km3.xmi"; 

		/*
		 * Perform DEMO Chain Discovery into the provided resource folder
		 */
		demoChainsDiscovery(resourceFolder, inputMetamodelPath, 
				outputMetamodelPath, inputModelPath);
		
		ChainDetector.run(inputModelPath);
	}

	
	
	
	
	private static List<Chain> demoChainsDiscovery(String resourceFolder, 
			String inputMetamodelPath, String outputMetamodelPath, String inputModelPath) {

		System.out.println("----------------------------------");
		System.out.println("Navigate Resource Folder...");
		System.out.println("----------------------------------");
		Path resourceFolderPath = Paths.get(resourceFolder);
		try {
			navigateRootFolder(resourceFolderPath);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String inputMetamodelName = Utils.getNameFromPathWithoutExtension(inputMetamodelPath);
		String outputMetamodelName = Utils.getNameFromPathWithoutExtension(outputMetamodelPath);

		System.out.println("----------------------------------");
		System.out.println("Graph creation...");
		System.out.println("----------------------------------");
		createGraph(inputMetamodelName, outputMetamodelName);

		return null;
	}

	static void navigateRootFolder(Path path) throws IOException {
		if (Files.isDirectory(path)) {
			Files.walkFileTree(path, new SimpleFileVisitor<Path>() {
				@Override
				public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
					checkArtifactType(file);
					return FileVisitResult.CONTINUE;
				}
			});
		} else {
			checkArtifactType(path);
		}
	}

	private static void createGraph(String startNode, String endNode) {

		// this graph is directional
		Graph graph = new Graph();

		for (Transformation t : transformationList) {
			graph.addEdge(t.getInTag(), t.getOutTag());
		}

		LinkedList<String> visited = new LinkedList();
		visited.add(startNode);
		detectAllChainsInDepthFirst(graph, visited, endNode);

//		printChains();

	}

	private static void checkArtifactType(Path path) {

		String artifactPath = path.toString();
		System.out.println(artifactPath);

		if (Utils.getPathExtension(artifactPath).equalsIgnoreCase("atl")) {
			ATLTransformationManager manager = new ATLTransformationManager(artifactPath);

			Transformation t = new Transformation();
			String inputMetamodel = manager.getInTag();
			String outputMetamodel = manager.getOutTag();
			if (inputMetamodel.equalsIgnoreCase("MOF") || inputMetamodel.equalsIgnoreCase("EMF")) {
				inputMetamodel = "EMF";
			}
			if (outputMetamodel.equalsIgnoreCase("MOF") || outputMetamodel.equalsIgnoreCase("EMF")) {
				outputMetamodel = "EMF";
			}
			if (inputMetamodel.equalsIgnoreCase("Java")) {
				inputMetamodel = "JavaSource";
			}
			if (outputMetamodel.equalsIgnoreCase("Java")) {
				outputMetamodel = "JavaSource";
			}
			t.setInTag(inputMetamodel);
			t.setOutTag(outputMetamodel);
			transformationList.add(t);
		}

	}

	private static void detectAllChainsInDepthFirst(Graph graph, LinkedList<String> visited, String END) {
		LinkedList<String> nodes = graph.adjacentNodes(visited.getLast());
		// examine adjacent nodes
		for (String node : nodes) {
			if (visited.contains(node)) {
				continue;
			}
			if (node.equals(END)) {
				visited.add(node);
				getChain(visited);
				visited.removeLast();
				break;
			}
		}
		for (String node : nodes) {
			if (visited.contains(node) || node.equals(END)) {
				continue;
			}
			visited.addLast(node);
			detectAllChainsInDepthFirst(graph, visited, END);
			visited.removeLast();
		}
	}

	private static void getChain(LinkedList<String> visited) {
		List<String> chain = new ArrayList<String>();
		for (String string : visited) {
			chain.add(string);
		}
		chainList.add(chain);
	}

	private static void printChains() {
		int i = 1;
		for (List<String> chain : chainList) {
			System.out.print("Chain " + i++ + ": ");
			int count = chain.size();
			for (String string : chain) {
				System.out.print(string);
				if (count - 1 > 0) {
					System.out.print(" -> ");
				}
				count--;
			}
			System.out.println();
		}
	}

	private static Chain demoBestChainSelection(List<Chain> allChains) {
		// TODO Auto-generated method stub
		return null;
	}

	private static void demoChainInformationLossCalculation(List<Chain> allChains, String inputModelPath) {
		// TODO Auto-generated method stub

	}

	private static void demoChainCoverageCalculation(List<Chain> allChains) {
		// TODO Auto-generated method stub

	}

	// public static void demoInformationLoss() {
	// Transformation t = new Transformation();
	// String inputMetamodelPath = "resources/running_example/metamodels/KM3.ecore";
	// String inputModelPath =
	// "resources/running_example/models/mutations/KM3/Class/KM3_name_set.xmi";
	//// String inputModelPath =
	// "resources/running_example/models/mutations/KM3/Class/KM3_name_unset.xmi";
	// String atlTransformation =
	// "resources/running_example/transformations/KM32XML.atl";
	// t.setATLTransformation(atlTransformation);
	// t.setInputMetamodel(inputMetamodelPath);
	// t.setInputModel(inputModelPath);
	//
	// InformationLoss.informationLoss(t);
	// }
	//
	// public static void demoCoverage() {
	// String atl = "resources/running_example/transformations/emf2java.atl";
	// String inputMM = "resources/running_example/metamodels/Ecore.ecore";
	//
	// Transformation t = new Transformation();
	// t.setATLTransformation(atl);
	// t.setInputMetamodel(inputMM);
	// t.isMeta_Metamodel(true);
	// Coverage.coverage(t);
	// }
	//
	// public static void demoMutations() {
	// EvaluateMutation.evaluateMutations();
	// }
	//
	// public static void demoRunningExample() {
	// String inputModel = "resources/running_example/models/KM3_seed.xmi";
	// List<String> inputModels = new ArrayList<String>();
	// inputModels.add(inputModel);
	// RunningExample.testRunningExampleChain3(inputModels);
	// }

}
