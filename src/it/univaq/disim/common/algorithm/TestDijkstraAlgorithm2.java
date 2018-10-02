package it.univaq.disim.common.algorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class TestDijkstraAlgorithm2 {

	
	public static void main(String[] args) {
		List<Vertex> nodes = new ArrayList<Vertex>();
		List<Edge> edges = new ArrayList<Edge>();
//		for (int i = 0; i < 11; i++) {
//			Vertex location = new Vertex("Node_" + i, "Node_" + i);
//			nodes.add(location);
//		}

		Vertex KM3 = new Vertex("Vertex_KM3", "KM3");
		Vertex EMF = new Vertex("Vertex_EMF", "EMF");
		Vertex JavaSource = new Vertex("Vertex_JavaSource", "JavaSource");
		Vertex Table = new Vertex("Vertex_Table", "Table");
		Vertex HTML = new Vertex("Vertex_HTML", "HTML");
		Vertex XML = new Vertex("Vertex_XML", "XML");
		
		nodes.add(KM3);
		nodes.add(EMF);
		nodes.add(JavaSource);
		nodes.add(Table);
		nodes.add(HTML);
		nodes.add(XML);
		
		Edge KM3_to_JavaSource = new Edge("KM3_to_JavaSource", KM3, JavaSource, 85);
		Edge KM3_to_EMF = new Edge("KM3_to_EMF", KM3, EMF, 85);
		Edge JavaSource_to_Table = new Edge("JavaSource_to_Table", JavaSource, Table, 85);
		Edge Table_to_HTML = new Edge("Table_to_HTML", Table, HTML, 85);
		Edge HTML_to_XML = new Edge("HTML_to_XML", HTML, XML, 85);
		Edge KM3_to_XML = new Edge("KM3_to_XML", KM3, XML, 85);

		edges.add(KM3_to_JavaSource);
		edges.add(KM3_to_EMF);
		edges.add(JavaSource_to_Table);
		edges.add(Table_to_HTML);
		edges.add(HTML_to_XML);
		edges.add(KM3_to_XML);

		// Lets check from location Loc_1 to Loc_10
		Graph graph = new Graph(nodes, edges);
		DijkstraAlgorithm dijkstra = new DijkstraAlgorithm(graph);
		dijkstra.execute(KM3);
		LinkedList<Vertex> path = dijkstra.getPath(XML);
		dijkstra.execute(XML);
		
//		assertNotNull(path);
//		assertTrue(path.size() > 0);
		
		for (Vertex vertex : path) {
			System.out.println(vertex);
		}
	}
	
	


}