package it.univaq.disim.business.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.TreeSet;

import it.univaq.disim.business.calculations.InformationLoss;
import it.univaq.disim.business.datamodel.Chain;
import it.univaq.disim.business.datamodel.Transformation;
import it.univaq.disim.business.datamodel.Vertex;
import it.univaq.disim.common.utils.Utils;


public class ChainController {
	
	private static String tempFolder = "resources/temp/";
	private static String modelExtension = ".xmi";
	private static boolean saveAllTempChainModels = false;
	
	
	public static void main(String[] args) {

	}

	public static float calculateChainCoverage(Chain chain) {
		
		float result = 0;
		int count = 0;
		for (Transformation t : chain.getTransformations()) {
			if(count == 0){
				result = (float) t.getCoverage();
			}else{
				result *= (float) t.getCoverage();
			}
			count++;
		}
		return result;
	}

	public static float calculateChainInformationLoss(Chain chain) {
		
		float result = 0;
		int count = 0;
		String tempInputModel = chain.getInputModel();
		
		ATLTransformationPerformer atlPerformer = new ATLTransformationPerformer();
		
		for (Transformation t : chain.getTransformations()) {
			t.setInputModel(tempInputModel);
			String tempOutputModel = tempFolder + chain.getName() + "_"+Utils.getNameFromPathWithoutExtension(t.getATLTransformation())+ "_"+count + modelExtension;
			t.setOutPath(tempOutputModel);
			atlPerformer.run(t);
			t.setInformationLoss(InformationLoss.informationLoss(t));
			if(count == 0){
				result = (float) t.getInformationLoss();
			}else{
				result *= (float) t.getInformationLoss();
			}
			count++;
			
			if(saveAllTempChainModels) {
//				tempInputModel = tempFolder + Utils.generateRandomString(10) + "_"+count+ modelExtension; //If we want to save 
			}else {
				tempInputModel = tempOutputModel; //We use the same random generated output model to save temporary chain models
			}
		}
		return result;
	}
	
	public static float calculateChainWeight(Chain chain) {
		
		float result = 0;
		int count = 0;
		for (Transformation t : chain.getTransformations()) {
			System.out.println(t.getEdgeWeight());
			if(count == 0){
				result = (float) t.getEdgeWeight();
			}else{
				result += (float) t.getEdgeWeight();
			}
			count++;
		}
		return result;
	}
	
	


	public static boolean checkValidity(List<List<Chain>> permutations) {
		boolean result = true;
		for (List<Chain> list : permutations) {
			result = true;
			Chain graphBestChain = new Chain();
			Chain bestChain = new Chain();
			float minLoss = Integer.MAX_VALUE;
			for (Chain chain : list) {
				if(chain.getInformationLoss() < minLoss){
					bestChain = chain;
					minLoss = chain.getInformationLoss();
				}
			}
			assert(minLoss != Integer.MAX_VALUE);
			
			graphBestChain = dijkstra(list);
			if(!graphBestChain.equals(bestChain)){
				result = false;
			}
			System.out.println(result);
		}
		return result;
	}


	private static Chain dijkstra(List<Chain> list) {

		
		 ArrayList<Vertex> vertexSet = new ArrayList<>();
		 HashMap<String, Vertex> parent = new HashMap<String, Vertex>();
		 NavigableSet<Vertex> q = new TreeSet<>();

		 for (Chain chain : list) {
			 for (Transformation t : chain.getTransformations()) {
				 boolean found = false;
				 for (Vertex vertex : vertexSet) {
					if(vertex.metamodel.equals(t.getInputMetamodel())){
						 found = true;
						 break;
					}
				 }
				 if(!found){
					 Vertex v1 = new Vertex(t.getInputMetamodel());
					 vertexSet.add(v1);
					 if(!parent.containsKey(v1.metamodel)){
						 parent.put(v1.metamodel, null);
					 }
					 if(t.getInputMetamodel().equalsIgnoreCase(chain.getInputMetamodel())){
							v1.dist = 0;
						}
					 if(!q.contains(v1)){
							q.add(v1);
						}
				 }
				 found = false;
				 for (Vertex vertex : vertexSet) {
						if(vertex.metamodel.equals(t.getOutputMetamodel())){
							 found = true;
							 break;
						}
					 }
					 if(!found){
						 Vertex v2 = new Vertex(t.getOutputMetamodel());
						 vertexSet.add(v2);
						 if(!parent.containsKey(v2.metamodel)){
							 parent.put(v2.metamodel, null);
						}
						 if(!q.contains(v2)){
								q.add(v2);
							}
					 }

			 }
		 }
		
		 for (Chain chain : list) {
				for (Transformation t : chain.getTransformations()) {
					for (Vertex vertex : vertexSet) {
						if(vertex.metamodel.equals(t.getInputMetamodel())){
							for (Vertex v : vertexSet) {
								if(v.metamodel.equals(t.getOutputMetamodel())){
									vertex.neighbours.put(v, t.getEdgeWeight());
//									System.out.println(vertex.metamodel+" "+v.metamodel+" "+t.getEdgeWeight());
								}
							}
						}
					}
					
				}
				
			}
		 
		while (!q.isEmpty()) {
	         Vertex u = q.pollFirst(); // vertex with shortest distance (first iteration will return source)
	         if (u.dist == Integer.MAX_VALUE) break; // we can ignore u (and any other remaining vertices) since they are unreachable
	 
	         //look at distances to each neighbour
	         for (Map.Entry<Vertex, Float> a : u.neighbours.entrySet()) {
	            Vertex v = a.getKey(); //the neighbour in this iteration
	 
	            final float alternateDist = u.dist + a.getValue();
	            if (alternateDist < v.dist) { // shorter path to neighbour found
	               q.remove(v);
	               v.dist = alternateDist;
	               v.previous = u;
	               q.add(v);
	               parent.put(v.metamodel, u);
	            } 
	         }
	      }
		
		Chain bestChain = new Chain();
		for (Chain chain : list) {
			for (Transformation tr : chain.getTransformations()) {
				if(tr.getOutputMetamodel().equals(chain.getOutputMetamodel())){
					System.out.println(parent.get(tr.getOutputMetamodel()));
					if(parent.get(tr.getOutputMetamodel()) != null){
						bestChain = chain;
					}
				}
			}
		}
		
		return bestChain;
	}
	
	

}
