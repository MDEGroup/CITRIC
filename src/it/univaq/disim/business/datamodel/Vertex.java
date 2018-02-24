package it.univaq.disim.business.datamodel;

import java.util.HashMap;
import java.util.Map;

/** One vertex of the graph, complete with mappings to neighbouring vertices */
public class Vertex implements Comparable<Vertex>{
	public final String metamodel;
	public float dist = Float.MAX_VALUE; // MAX_VALUE assumed to be infinity
	public Vertex previous = null;
	public final Map<Vertex, Float> neighbours = new HashMap<>();

	public Vertex(String name)
	{
		this.metamodel = name;
	}

	private void printPath()
	{
		if (this == this.previous)
		{
			System.out.printf("%s", this.metamodel);
		}
		else if (this.previous == null)
		{
			System.out.printf("%s(unreached)", this.metamodel);
		}
		else
		{
			this.previous.printPath();
			System.out.printf(" -> %s(%d)", this.metamodel, this.dist);
		}
	}

	public int compareTo(Vertex other)
	{
		if (dist == other.dist)
			return metamodel.compareTo(other.metamodel);

		return Float.compare(dist, other.dist);
	}

	@Override public String toString()
	{
		return "(" + metamodel + ", " + dist + ")";
	}
}