package it.univaq.disim.common.algorithm;

import java.util.List;

import org.eclipse.emf.ecore.EPackage;

public class Vertex {
	final private String id;
	final private String name;
	final private List<EPackage> metamodel;
	
	
	public Vertex(String id, String name, List<EPackage> metamodel) {
		this.id = id;
		this.name = name;
		this.metamodel = metamodel;
	}
	
	
	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	public List<EPackage> getMetamodel() {
		return metamodel;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vertex other = (Vertex) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return name;
	}
	
}