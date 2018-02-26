package it.univaq.disim.business.mutator.km3_mutations;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

import it.univaq.disim.business.datamodel.ATLBinding;
import it.univaq.disim.business.datamodel.Chain;
import it.univaq.disim.business.datamodel.ModelStructuralFeature;
import it.univaq.disim.business.datamodel.RuleBinding;
import it.univaq.disim.business.datamodel.Transformation;
import it.univaq.disim.business.manager.ATLTransformationManager;
import it.univaq.disim.business.manager.MetamodelManager;
import it.univaq.disim.common.algorithm.DijkstraAlgorithm;
import it.univaq.disim.common.algorithm.Edge;
import it.univaq.disim.common.algorithm.Graph;
import it.univaq.disim.common.algorithm.Vertex;
import it.univaq.disim.demo.Example;

public class MutationGenerator {
	
	private List<Vertex> nodes;
	private List<Edge> edges;
	private Chain chain;
	
	public MutationGenerator(Chain chain) {
		this.chain = chain;
		this.nodes = getAllNodes();
		this.edges = getAllEdges();
	}
	
	public static void main(String[] args) {
		String inputModel = "resources/mutations/KM3_seed.xmi";
		Chain chain = Example.getChain1(inputModel);
		
		MutationGenerator gen = new MutationGenerator(chain);
//		Vertex source = new Vertex("Table", "Table");
//		Vertex destination = new Vertex("Element", "Element");
//		gen.testExcute(source, destination);
		
		List<Vertex> allInputNodes = gen.getAllInputNodes();
		List<Vertex> allOutputNodes = gen.getAllOutputNodes();
		for (Vertex source : allInputNodes) {
			for (Vertex destination : allOutputNodes) {
				gen.searchPath(source, destination);
			}
		}
		
	}
	
	
	
	public LinkedList<Vertex> searchPath(Vertex source, Vertex destination) {
		Graph graph = new Graph(nodes, edges);
		DijkstraAlgorithm dijkstra = new DijkstraAlgorithm(graph);
		
		dijkstra.execute(source);
		LinkedList<Vertex> path = dijkstra.getPath(destination);
		if(path != null) {
			for (Vertex vertex : path) {
				StringBuilder sb = new StringBuilder();
				sb.append(vertex.getName());
				sb.append(" -> ");
				System.out.println(sb);
			}
		}else {
//			System.out.println("No Path for "+source.getName()+" -> "+destination.getName());
		}
		
		return path;
	}
	
	private void addLane(String laneId, int sourceLocNo, int destLocNo, int duration) {
		Edge lane = new Edge(laneId,nodes.get(sourceLocNo), nodes.get(destLocNo), duration );
		edges.add(lane);
	}
	
//	public static void visitGraph(Chain chain) {
//
//		Visit search = new Visit();
//		Graph graph = generateGraph(chain);
//		
//		HashSet<String> allNodes = getAllNodes(chain);
//
//		search.visit(allNodes, graph);
////		search.writeToFile();
//		
////		HashSet<String> allInputNodes = getAllInputNodes(chain);
////		HashSet<String> allOutputNodes = getAllOutputNodes(chain);
////		for (String inputNode : allInputNodes) {
////			for (String outputNode : allOutputNodes) {
////				if(graph.isConnected(inputNode, outputNode)) {
////					System.out.println(inputNode+" - "+outputNode+" [Connected!]");
////				}else {
//////					System.out.println(inputNode+" - "+outputNode+" [Not Connected!]");
////				}
////				
////			}
////		}
////		System.out.println("-------");
//		
//	}
	
	
	private List<Vertex> getAllInputNodes(){
		List<Vertex> result = new ArrayList<Vertex>();
		Transformation firstT = this.chain.getTransformations().get(0);
			ATLTransformationManager atlManager = new ATLTransformationManager(firstT.getATLTransformation());
			List<ATLBinding> ruleBinding = atlManager.getAllBindings();
			for (ATLBinding atlBinding : ruleBinding) {
				Vertex vertex = new Vertex(atlBinding.getInputMetaclassName(), atlBinding.getInputMetaclassName());
				result.add(vertex);
				for (RuleBinding b : atlBinding.getBindings()) {
					if(b.getInput() != null && b.getOutput() != null) {
						Vertex anotherVertex = new Vertex(atlBinding.getInputMetaclassName()+"_"+b.getInput(), atlBinding.getInputMetaclassName()+"_"+b.getInput());
						result.add(anotherVertex);
					}
				}
			}
		return result;
	}
	
	private  List<Vertex> getAllOutputNodes(){
		List<Vertex> result = new ArrayList<Vertex>();
		Transformation lastT = chain.getTransformations().get(chain.getTransformations().size()-1);
		ATLTransformationManager atlManager = new ATLTransformationManager(lastT.getATLTransformation());
		System.out.println(lastT.getATLTransformation());
		List<ATLBinding> ruleBinding = atlManager.getAllBindings();
		for (ATLBinding atlBinding : ruleBinding) {
			Vertex vertex = new Vertex(atlBinding.getOutputMetaclassName(), atlBinding.getOutputMetaclassName());
			result.add(vertex);
			for (RuleBinding b : atlBinding.getBindings()) {
				if(b.getInput() != null && b.getOutput() != null) {
					Vertex anotherVertex = new Vertex(atlBinding.getOutputMetaclassName()+"_"+b.getOutput(), atlBinding.getOutputMetaclassName()+"_"+b.getOutput());
					result.add(anotherVertex);
				}
			}
		}
		return result;
	}
	
	private List<Vertex> getAllNodes() {
		List<Vertex> result = new ArrayList<Vertex>();
		for (Transformation transformation : chain.getTransformations()) {
			ATLTransformationManager atlManager = new ATLTransformationManager(transformation.getATLTransformation());
			List<ATLBinding> ruleBinding = atlManager.getAllBindings();
			for (ATLBinding atlBinding : ruleBinding) {
				Vertex inputMCVertex = new Vertex(atlBinding.getInputMetaclassName(), atlBinding.getInputMetaclassName());
				result.add(inputMCVertex);
				Vertex outputMCVertex = new Vertex(atlBinding.getOutputMetaclassName(), atlBinding.getOutputMetaclassName());
				result.add(outputMCVertex);
				for (RuleBinding b : atlBinding.getBindings()) {
					if(b.getInput() != null && b.getOutput() != null) {
						String compositeInputVertexName = atlBinding.getInputMetaclassName()+"_"+b.getInput();
						String compositeOutputVertexName = atlBinding.getOutputMetaclassName()+"_"+b.getOutput();
						Vertex inputMCSF = new Vertex(compositeInputVertexName, compositeInputVertexName);
						Vertex outputMCSF = new Vertex(compositeOutputVertexName, compositeOutputVertexName);
						result.add(inputMCSF);
						result.add(outputMCSF);
					}
				}
			}
		}
		return result;
	}
	
	private List<Edge> getAllEdges(){
		List<Edge> result = new ArrayList<Edge>();
		int count = 0;
		for (Transformation transformation : chain.getTransformations()) {
			ATLTransformationManager atlManager = new ATLTransformationManager(transformation.getATLTransformation());
			List<ATLBinding> ruleBinding = atlManager.getAllBindings();
			for (ATLBinding atlBinding : ruleBinding) {
				Vertex source = new Vertex(atlBinding.getInputMetaclassName(), atlBinding.getInputMetaclassName());
				Vertex target = new Vertex(atlBinding.getOutputMetaclassName(), atlBinding.getOutputMetaclassName());
				Edge edge = new Edge("Edge_"+count++, source, target, 1);
				result.add(edge);
				for (RuleBinding b : atlBinding.getBindings()) {
					if(b.getInput() != null && b.getOutput() != null) {
						Vertex source2 = new Vertex(atlBinding.getInputMetaclassName()+"_"+b.getInput(), atlBinding.getInputMetaclassName()+"_"+b.getInput());
						Vertex target2 = new Vertex(atlBinding.getOutputMetaclassName()+"_"+b.getOutput(), atlBinding.getOutputMetaclassName()+"_"+b.getOutput());
						Edge edge2 = new Edge("Edge_"+count++, source2, target2, 1);
						result.add(edge2);
//						nodes.add(new Vertex(atlBinding.getInputMetaclassName()+"_"+b.getInput(), atlBinding.getOutputMetaclassName()+"_"+b.getOutput()));
					}
				}
			}
		}
		return result;
	}

//	private static Graph generateGraph(Chain chain) {
//		Graph graph = new Graph();
//		
//		for (Transformation transformation : chain.getTransformations()) {
//			ATLTransformationManager atlManager = new ATLTransformationManager(transformation.getATLTransformation());
//			System.out.println(transformation.getATLTransformation());
//			List<ATLBinding> ruleBinding = atlManager.getAllBindings();
//			for (ATLBinding atlBinding : ruleBinding) {
//				graph.addEdge(atlBinding.getInputMetaclassName(), atlBinding.getOutputMetaclassName());
//				for (RuleBinding b : atlBinding.getBindings()) {
//					if(b.getInput() != null && b.getOutput() != null) {
//						graph.addEdge(atlBinding.getInputMetaclassName()+"_"+b.getInput(), atlBinding.getOutputMetaclassName()+"_"+b.getOutput());
//					}
//				}
//			}
//		}
//		
//		return graph;
//	}
	
	public static void checkMetamodelElementsCoveage(Chain chain) {
		List<ModelStructuralFeature> allMetamodelStructuralFeaturesAndReferences = MetamodelManager.getAllMetamodelStructuralFeaturesAndReferences(chain.getInputMetamodel());
		List<String> inputMetaclasses = new ArrayList<String>();
		List<String> fullyCovered = new ArrayList<String>();
		for (ModelStructuralFeature msf : allMetamodelStructuralFeaturesAndReferences) {
			inputMetaclasses.add(msf.geteClass().getName());
		}
		
		
		for (Transformation transformation : chain.getTransformations()) {
			String tmpMetaclass = "";
			ATLTransformationManager atlManager = new ATLTransformationManager(transformation.getATLTransformation());
			System.out.println(transformation.getATLTransformation());
			List<ATLBinding> ruleBinding = atlManager.getAllBindings();
			for (ATLBinding atlBinding : ruleBinding) {
				if(inputMetaclasses.contains(atlBinding.getOutputMetaclassName())) {
					fullyCovered.add(atlBinding.getOutputMetaclassName());
				}
				System.out.println("\t"+atlBinding.getInputMetaclassName() +" -> "+atlBinding.getOutputMetaclassName());
				for (RuleBinding b : atlBinding.getBindings()) {
					System.out.println("\t\t"+b.getInput() + " - " +b.getOutput());
				}
			}
		}
		
		
	}

	
}
