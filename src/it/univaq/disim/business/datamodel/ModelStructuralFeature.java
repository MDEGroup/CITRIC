package it.univaq.disim.business.datamodel;

import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

public class ModelStructuralFeature {
	private EClass eClass;
	private Set<EReference> eReferences;
	private Set<EStructuralFeature> eStructuralFeatures;
	private Set<String> allEStructuralFeatures;
	private int totalNumberOfStructuralFeatures;
	
	
	public EClass geteClass() {
		return eClass;
	}
	public void seteClass(EClass eClass) {
		this.eClass = eClass;
	}
	public Set<EReference> geteReferences() {
		return eReferences;
	}
	public void seteReferences(Set<EReference> eReferences) {
		this.eReferences = eReferences;
	}
	public Set<EStructuralFeature> geteStructuralFeatures() {
		return eStructuralFeatures;
	}
	public void seteStructuralFeatures(Set<EStructuralFeature> eStructuralFeatures) {
		this.eStructuralFeatures = eStructuralFeatures;
	}
	public Set<String> getAllEStructuralFeatures() {
		return allEStructuralFeatures;
	}
	public void setAllEStructuralFeatures(Set<String> allEStructuralFeatures) {
		this.allEStructuralFeatures = allEStructuralFeatures;
	}
	public int getTotalNumberOfStructuralFeatures() {
		return eStructuralFeatures.size()+eReferences.size();
	}
	public void setTotalNumberOfStructuralFeatures(int totalNumberOfStructuralFeatures) {
		this.totalNumberOfStructuralFeatures = totalNumberOfStructuralFeatures;
	}
	
	
}
