package it.univaq.disim.common.graph;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

import it.univaq.disim.business.datamodel.Chain;
import it.univaq.disim.business.datamodel.Transformation;
import it.univaq.disim.demo.ATLZoo;

public class Visit {

//	private static String allNodesPathFile = "resources/complete.txt";
	private static String calculateChainsPathFile = "resources/results/calculated_chains.txt";
	private static String calculateChainsMoreThan2PathFile = "resources/results/calculated_chains_More_2.txt";

//	private static ArrayList<String> tmpChain = new ArrayList<String>();
	private static ArrayList<Transformation> tmpChain = new ArrayList<Transformation>();
//	private static ArrayList<List<String>> chainsList = new ArrayList<List<String>>();
	private static Chain chain = new Chain();
	private static ArrayList<Chain> topChainsList = new ArrayList<Chain>();

	
	
	
	public static void main(String[] args) throws IOException {
		
		List<Transformation> atlZooTransformations = ATLZoo.getTransformations();

		Visit search = new Visit();
//		Graph graph = search.createGraph(allNodesPathFile);
		Graph graph = search.createGraph(atlZooTransformations);

		HashSet<String> allNodes = search.getAllNodes(atlZooTransformations);

		search.visit(allNodes, graph);
		search.writeToFile();
	}
	
	
	

	private HashSet<String> getAllNodes(List<Transformation> transformations) {

		HashSet<String> allNodes = new HashSet<String>();
		for (String metamodel : allNodes) {
			allNodes.add(metamodel);
		}

//		BufferedReader br = null;
//
//		try {
//
//			String sCurrentLine;
//
//			br = new BufferedReader(new FileReader(nodesPathFile));
//
//			while ((sCurrentLine = br.readLine()) != null) {
//				// Line example:
//				// MySQL,MySQL2KM3,KM3,MySQL -> KM3
//				String splitted[] = sCurrentLine.split(",");
//				allNodes.add(splitted[0].trim());
//				allNodes.add(splitted[2].trim());
//			}
//
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				if (br != null)
//					br.close();
//			} catch (IOException ex) {
//				ex.printStackTrace();
//			}
//		}

		return allNodes;

	}

	private Graph createGraph(List<Transformation> transformations) {
		Graph graph = new Graph();
		for (Transformation transformation : transformations) {
			graph.addEdge(transformation.getInputMetamodel(), transformation.getOutputMetamodel());
		}
//		
//		BufferedReader br = null;
//
//		try {
//			String sCurrentLine;
//			br = new BufferedReader(new FileReader(nodesPathFile));
//			while ((sCurrentLine = br.readLine()) != null) {
//				// Line example:
//				// MySQL,MySQL2KM3,KM3,MySQL -> KM3
//				String splitted[] = sCurrentLine.split(",");
//				String splittedChain[] = splitted[3].split(" -> ");
//				if (!splitted[3].equals("None") && splittedChain.length == 2) {
//					graph.addEdge(splitted[0], splitted[2]);
//				}
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				if (br != null)
//					br.close();
//			} catch (IOException ex) {
//				ex.printStackTrace();
//			}
//		}
		return graph;
	}

	
	private void writeToFile() throws IOException {

		FileWriter fw = new FileWriter(calculateChainsPathFile);
		FileWriter fwMaggiore2 = new FileWriter(calculateChainsMoreThan2PathFile);

		for (Chain topChain : topChainsList) {
			for (Transformation transformation : topChain.getTransformations()) {
//				int size = list.size();
				StringBuilder row = new StringBuilder();
				row.append(transformation.getInputMetamodel() + ","+transformation.getATLTransformation()+","+transformation.getOutputMetamodel());
//				for (String string : list) {
//					if (size > 1) {
//						row.append(string + " -> ");
//						// System.out.print(string+" -> ");
//					} else {
//						row.append(string);
//						// System.out.println(string);
//					}
//					size--;
//				}
				// System.out.println(row.toString());
				row.append(System.getProperty("line.separator"));
				fw.write(row.toString());

//				if (topChain.size() > 1) {
//					fwMaggiore2.write(row.toString());
//				}
			}
			// System.out.println("###");
		}
		// System.out.println(topChainsList.size());
		// System.out.println(topChainsList.get(4031).size());

		fw.close();
		fwMaggiore2.close();
		System.out.println("Done!");

	}

	private void visit(HashSet<String> allNodes, Graph graph) {

		for (String startNode : allNodes) {
			for (String endNode : allNodes) {

				if (!endNode.equals(startNode)) { // Avoid 2 equals nodes
					System.out.println("[" + startNode + " to " + endNode + "]");
					LinkedList<String> visited = new LinkedList();
					visited.add(startNode);
					new Visit().depthFirst(graph, visited, endNode);

					topChainsList.add(chain);
					chain = new Chain();

					System.out.println("----------------------------------------------");
				}
			}
		}

	}

	private boolean isModel() {
		return true;
	}

	private void depthFirst(Graph graph, LinkedList<String> visited, String END) {
		LinkedList<String> nodes = graph.adjacentNodes(visited.getLast());

		// examine adjacent nodes
		for (String node : nodes) {
			if (visited.contains(node)) {
				continue;
			}
			if (node.equals(END)) {
				visited.add(node);
				printPath(visited);
			
				chain.setTransformations(tmpChain);
//				chainsList.add(tmpChain);
				tmpChain = new ArrayList<Transformation>();
				visited.removeLast();
				break;
			}
		}
		for (String node : nodes) {
			if (visited.contains(node) || node.equals(END)) {
				continue;
			}
			visited.addLast(node);
			depthFirst(graph, visited, END);
			visited.removeLast();
		}
	}

	private void printPath(LinkedList<String> visited) {

		int size = visited.size();

		for (String node : visited) {
//			tmpChain.add(node);
			Transformation t = new Transformation();
			//TODO da valutare se Metamodel In o Metamodele Out
			t.setInputMetamodel(node);
			tmpChain.add(t);
			System.out.print(node);
			if (size > 1) {
				System.out.print(" -> ");
			}
			size--;
		}
		System.out.println();
	}

}