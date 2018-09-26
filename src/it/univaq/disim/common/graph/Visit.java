package it.univaq.disim.common.graph;



import java.util.LinkedList;

public class Visit {

    private static final String START = "B";
    private static final String END_NODE = "E";

    public static void main(String[] args) {
    	
    	String endNode = END_NODE;
    	
        // this graph is directional
        Graph graph = new Graph();
        graph.addEdge("A", "B");
        graph.addEdge("A", "C");
        graph.addEdge("B", "A");
        graph.addEdge("B", "D");
        graph.addEdge("B", "E"); // this is the only one-way connection
        graph.addEdge("B", "F");
        graph.addEdge("C", "A");
        graph.addEdge("C", "E");
        graph.addEdge("C", "F");
        graph.addEdge("D", "B");
        graph.addEdge("E", "C");
        graph.addEdge("E", "F");
        graph.addEdge("F", "B");
        graph.addEdge("F", "C");
        graph.addEdge("F", "E");
        LinkedList<String> visited = new LinkedList();
        visited.add(START);
        new Visit().depthFirst(graph, visited, endNode);
    }

    public void depthFirst(Graph graph, LinkedList<String> visited, String END) {
        LinkedList<String> nodes = graph.adjacentNodes(visited.getLast());
        // examine adjacent nodes
        for (String node : nodes) {
            if (visited.contains(node)) {
                continue;
            }
            if (node.equals(END)) {
                visited.add(node);
                printPath(visited);
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
    	int count = visited.size();
        for (String node : visited) {
            System.out.print(node);
            if(count-1 > 0) {
            	System.out.print(" -> ");
            	count--;
            }
        }
        System.out.println();
    }
}