package it.univaq.disim.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;

import it.univaq.disim.business.datamodel.Transformation;
import it.univaq.disim.business.manager.MetamodelManager;
import it.univaq.disim.business.manager.ModelManager;
import it.univaq.disim.common.exceptions.AbstractCreationException;
import it.univaq.disim.common.exceptions.MetaModelNotFoundException;
import it.univaq.disim.common.exceptions.ObjectNotContainedException;
import it.univaq.disim.common.exceptions.ReferenceNonExistingException;
import it.univaq.disim.common.exceptions.WrongAttributeTypeException;

public class Test {
	
	public static void main(String[] args) throws IOException, MetaModelNotFoundException, ReferenceNonExistingException {

		String metamodel = "resources/mutations/ProjectManagement.ecore";
		MetamodelManager.registerMetamodel(metamodel);
		String outputURI = "resources/mutations/projmanagement.xmi";
		String outputURI2 = "resources/mutations/bascio_mutation2.xmi";
		
		List<EPackage> loadMetaModel = MetamodelManager.loadMetaModel(metamodel);
		Resource model = ModelManager.loadModel(outputURI);
		
		
		
		
		
		
		
		
		
		
		
		
		
//		List<EClass> allModelEClasses = ModelManager.getAllModelEClasses(model);
//		int randomRefIndex = ModelManager.getRandomIndex(allModelEClasses);
//		EClass eClassCandidate = allModelEClasses.get(randomRefIndex);
//		System.out.println(eClassCandidate.getName());
//		System.out.println(EcoreUtil.getIdentification(eClassCandidate));
//
//		Test test = new Test();
//		System.out.println(ModelManager.getAllModelEClasses(model).size());
////		List<EReference> eClassReferences = ModelManager.getEClassReferences(eClassCandidate);
////		for (EReference eReference : eClassReferences) {
////			EClass eClass = Test.getEClassFromReference(eReference);
////			System.out.println("\t"+eClass.getName());
////			for (EReference eReference2 : eClass.getEReferences()) {
////				EcoreUtil.remove(eReference2);
////				System.out.println(eReference2.getEType());
////			}
////			
////		}
////		
////		EcoreUtil.remove(eClassCandidate);
//
//		RemoveObjectMutator rom = new RemoveObjectMutator(model, loadMetaModel, eClassCandidate, new ObSelectionStrategy(metamodel, model), new );
//		rom.mutate();
//		
//		System.out.println(ModelManager.getAllModelEClasses(model).size());
//		List<EClass> allModelEClasses2 = ModelManager.getAllModelEClasses(model2);
//		for (EClass eClass : allModelEClasses2) {
//			System.out.println(eClass);
//		}
		

		
		
		
//		
//		ArrayList<EReference> allReferences = ModelManager.getAllReferences(model);
//		for (EReference eReference : allReferences) {
//			System.out.println(eReference);
//		}
//		System.out.println(allReferences.size());
//		int randomRefIndex = ModelManager.getRandomIndex(allReferences);
//		ModelManager.unsetReference("projects", allReferences.get(randomRefIndex));
//		ArrayList<EReference> allReferences2 = ModelManager.getAllReferences(model);
//		System.out.println(allReferences2.size());
//		
//		
//
//		Test test = new Test();
//		List<EClass> allModelEClasses = ModelManager.getAllModelEClasses(model);
//		int randomIndex = ModelManager.getRandomIndex(allModelEClasses);
//		EClass eClassToDelete = allModelEClasses.get(randomIndex);
//		System.out.println(eClassToDelete.getName());
//		test.delete(model, eClassToDelete);
//		
//	
//		
//		
////		Resource mutated = test.deleteObject(model, eClassToDelete);
//		
//		System.out.println(ModelManager.getAllModelEClasses(model).size());
//		EcoreUtil.remove(eClassToDelete);
//		System.out.println(ModelManager.getAllModelEClasses(model).size());
		
	}
	


}
