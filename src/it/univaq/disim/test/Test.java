package it.univaq.disim.test;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
import org.eclipse.m2m.atl.common.ATLExecutionException;
import org.eclipse.ocl.ParserException;

import anatlyzer.atlext.ATL.MatchedRule;
import it.univaq.disim.business.calculations.Coverage;
import it.univaq.disim.business.calculations.InformationLoss;
import it.univaq.disim.business.controller.ATLTransformationPerformer;
import it.univaq.disim.business.datamodel.RuleBinding;
import it.univaq.disim.business.datamodel.Transformation;
import it.univaq.disim.business.manager.ATLTransformationManager;
import it.univaq.disim.business.manager.MetamodelManager;
import it.univaq.disim.business.manager.ModelManager;
import it.univaq.disim.common.exceptions.AbstractCreationException;
import it.univaq.disim.common.exceptions.MetaModelNotFoundException;
import it.univaq.disim.common.exceptions.ObjectNotContainedException;
import it.univaq.disim.common.exceptions.ReferenceNonExistingException;
import it.univaq.disim.common.exceptions.WrongAttributeTypeException;
import it.univaq.disim.common.utils.Utils;
import it.univaq.disim.demo.Example;

public class Test {
	
	public static void main(String[] args) throws IOException, MetaModelNotFoundException, ReferenceNonExistingException, ParserException {

//		String metamodelPath = "resources/running_example/metamodels/KM.ecore";
//		String modelPath = "resources/mutations/KM3_seed.xmi";
//		MetamodelManager.registerMetamodel(metamodelPath);
		String atlTransformationPath1 = Example.getKM32Java().getATLTransformation();
		String atlTransformationPath2 = Example.getKM32EMF().getATLTransformation();
		String atlTransformationPath3 = Example.getKM32XML().getATLTransformation();
		String atlTransformationPath4 = Example.getTable2HTML().getATLTransformation();
		String atlTransformationPath5 = Example.getJava2Table().getATLTransformation();
		String atlTransformationPath6 = Example.getEMF2Java().getATLTransformation();
		String atlTransformationPath7 = Example.getHTML2XML().getATLTransformation();

//		
//
//		System.out.println("-----------------------------------------");
//		System.out.println("METAMODEL--------------------------------");
//		System.out.println("-----------------------------------------");
//		List<EPackage> metamodel = MetamodelManager.loadMetaModel(metamodelPath);
//		Resource model = ModelManager.loadModel(modelPath);
		
//		for (EPackage ePackage : metamodel) {
//			List<EClass> allMetamodelEClasses = MetamodelManager.getAllMetamodelEClasses(metamodelPath);
//			for (EClass eClass : allMetamodelEClasses) {
//				System.out.println(eClass.getName());
//				for (EStructuralFeature sf : eClass.getEStructuralFeatures()) {
//					System.out.println("\t"+sf.getName());
//				}
//			}
//			System.out.println(ePackage.getName());
//		}
//		
//		System.out.println("-----------------------------------------");
//		System.out.println("MODEL------------------------------------");
//		System.out.println("-----------------------------------------");
//		
//		List<EClass> allModelEClasses = ModelManager.getAllModelEClasses(model);
//		for (EClass eClass : allModelEClasses) {
//			System.out.println(eClass.getName());
//			for (EStructuralFeature sf : eClass.getEStructuralFeatures()) {
//				System.out.println("\t"+sf.getName());
//			}
//		}
//		
//		
//		
		System.out.println("-----------------------------------------");
		System.out.println("TRANSFORMATION--"+Utils.getNameFromPath(atlTransformationPath7));
		System.out.println("-----------------------------------------");
		ATLTransformationManager atlManager = new ATLTransformationManager(atlTransformationPath7);
		List<MatchedRule> allMatchedRules = atlManager.getAllMatchedRules();
//		allMatchedRules.sort(Comparator.comparing(MatchedRule::getName()));
		Collections.sort(allMatchedRules, new Comparator<MatchedRule>() {
		    @Override
		    public int compare(MatchedRule lhs, MatchedRule rhs) {
		        // -1 - less than, 1 - greater than, 0 - equal, all inversed for descending
		        return lhs.getName().compareToIgnoreCase(rhs.getName());
		    }
		});
		
		for (MatchedRule rule : allMatchedRules) {
			System.out.println(rule.getName());
			for (RuleBinding rBinding : atlManager.getRuleBindings(rule)) {
				System.out.println("\t"+rBinding.getInput() + " -> "+rBinding.getOutput());
			}
		}
		
//		Transformation t = new Transformation();
//		String inputMetamodelPath = "resources/running_example/metamodels/KM.ecore";
//		String inputModelPath = "resources/running_example/models/KM3_seed.xmi";
//		String atlTransformation = "resources/running_example/transformations/km3_2_java.atl";
////		String atlTransformation = "resources/running_example/transformations/KM32EMF.atl";
////		String atlTransformation = "resources/running_example/transformations/KM32XML.atl";
//		t.setATLTransformation(atlTransformation);
//		t.setInputMetamodel(inputMetamodelPath);
//		t.setInputModel(inputModelPath);
		
//		InformationLoss.informationLoss(t);
//		Coverage.coverage(t);
		String km3ModelInstance = "resources/running_example/models/KM3_seed.xmi";
		
		Transformation km32Java = Example.getKM32Java();
		km32Java.setInputModel(km3ModelInstance);
		km32Java.setInformationLoss(InformationLoss.informationLoss(km32Java));
		
		Transformation km32xml = Example.getKM32XML();
		km32xml.setInputModel(km3ModelInstance);
		km32xml.setInformationLoss(InformationLoss.informationLoss(km32xml));
		
		Transformation km32emf = Example.getKM32EMF();
		km32emf.setInputModel(km3ModelInstance);
		km32emf.setInformationLoss(InformationLoss.informationLoss(km32emf));
		
//		String emfModelInstance = "resources/running_example/models/java-out-fromEMF.xmi";
		String emfModelInstance = "resources/running_example/models/Sample.ecore";
		Transformation emf2Java = Example.getEMF2Java();
		emf2Java.setInputModel(emfModelInstance);
//		emf2Java.setInformationLoss(InformationLoss.informationLoss(emf2Java));
		
		String javaModelInstance = "resources/running_example/models/javaSource.xmi";
		Transformation java2Table = Example.getJava2Table();
		java2Table.setInputModel(javaModelInstance);
		java2Table.setInformationLoss(InformationLoss.informationLoss(java2Table));
		
//		String tableModelInstance = "resources/running_example/models/java-out.xmi";
		String tableModelInstance = "resources/running_example/models/Table.xmi";
		Transformation table2html = Example.getTable2HTML();
		table2html.setInputModel(tableModelInstance);
		table2html.setInformationLoss(InformationLoss.informationLoss(table2html));
		
		String htmlModelInstance = "resources/running_example/models/HTML.xmi";
		Transformation html2xml = Example.getHTML2XML();
		html2xml.setInputModel(htmlModelInstance);
		html2xml.setInformationLoss(InformationLoss.informationLoss(html2xml));
		
//		ATLTransformationPerformer perfomer = new ATLTransformationPerformer();
//		perfomer.run(t);
		
	}
	


}
