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
import it.univaq.disim.business.datamodel.Chain;
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
	
	private static String baseResourcePath = "resources/running_example/";
	private static String baseResultPath = "results/";
	
	public static void main(String[] args) throws IOException, MetaModelNotFoundException, ReferenceNonExistingException, ParserException {
		String modelInstance_1 = baseResourcePath + "models/KM3_seed.xmi";
		String modelInstance_2 = baseResourcePath+ "models/sample-KM3.xmi";
		String modelInstance_3 = baseResourcePath+ "models/mutations/KM3_1.xmi";
		List<String> modelInstances = new ArrayList<String>();
		modelInstances.add(modelInstance_1);
//		modelInstances.add(modelInstance_2);
//		modelInstances.add(modelInstance_3);
		
		for (String model : modelInstances) {
			System.out.println("IL("+model+") = "+(float) testChain1(model));
			System.out.println("IL("+model+") = "+(float) testChain2(model));
			System.out.println("IL("+model+") = "+(float) testChain3(model));
		}
		
	}
	
	public static float testChain1(String modelInstance) {
		
		float informationLoss = 0;
		
		ATLTransformationPerformer perfomer = new ATLTransformationPerformer();
		
		System.out.println("KM3 -> EMF");
		Transformation km32emf = Example.getKM32EMF();
		km32emf.setInputModel(modelInstance);
		km32emf.setInformationLoss(InformationLoss.informationLoss(km32emf));
		String emfOuputModel = baseResourcePath + baseResultPath + "C1/out-EMF.xmi";
		km32emf.setOutPath(emfOuputModel);
		perfomer.run(km32emf);
		informationLoss = (float) km32emf.getInformationLoss();
		
		System.out.println("------------------------------------------------------------");
		
		System.out.println("EMF -> JavaSource");
		String emfModelInstance = baseResourcePath + "models/Sample.ecore";
		Transformation emf2Java = Example.getEMF2Java();
		emf2Java.setInputModel(emfModelInstance);
		emf2Java.setInformationLoss(InformationLoss.informationLoss(emf2Java));
		String javaOutputModel = baseResourcePath + baseResultPath + "C1/out-JavaSource.xmi";
		emf2Java.setOutPath(javaOutputModel);
//		perfomer.run(emf2Java);
		informationLoss *= (float) emf2Java.getInformationLoss();
		System.out.println("------------------------------------------------------------");
		
		System.out.println("JavaSource -> Table");
		String javaModelInstance = baseResourcePath + baseResultPath + "C1/out-JavaSource.xmi";
		Transformation java2Table = Example.getJava2Table();
		java2Table.setInputModel(javaModelInstance);
		String tableOutputModel = baseResourcePath + baseResultPath + "C1/out-Table.xmi";
		java2Table.setOutPath(tableOutputModel);
		perfomer.run(java2Table);
		java2Table.setInformationLoss(InformationLoss.informationLoss(java2Table));
		informationLoss *= (float) java2Table.getInformationLoss();
		System.out.println("------------------------------------------------------------");
		
		System.out.println("Table -> HTML");
		String tableModelInstance = baseResourcePath + "models/Table.xmi";
		Transformation table2html = Example.getTable2HTML();
		table2html.setInputModel(tableModelInstance);
		String htmlOutputModel = baseResourcePath + baseResultPath + "C1/out-TabularHTML.xmi";
		table2html.setOutPath(htmlOutputModel);
		perfomer.run(table2html);
		table2html.setInformationLoss(InformationLoss.informationLoss(table2html));
		informationLoss *= (float) table2html.getInformationLoss();
		System.out.println("------------------------------------------------------------");

		System.out.println("HTML -> XML");
		String htmlModelInstance = baseResourcePath + "models/HTML.xmi";
		Transformation html2xml = Example.getHTML2XML();
		html2xml.setInputModel(htmlModelInstance);
		String xmlOutputModel = baseResourcePath + baseResultPath + "C1/out-XML.xmi";
		html2xml.setOutPath(xmlOutputModel);
		perfomer.run(html2xml);
		html2xml.setInformationLoss(InformationLoss.informationLoss(html2xml));
		informationLoss *= (float) html2xml.getInformationLoss();
		System.out.println("------------------------------------------------------------");
		
		
		return informationLoss;
	}
	

	
	public static float testChain2(String modelInstance) {
		ATLTransformationPerformer perfomer = new ATLTransformationPerformer();
		
		float informationLoss = 0;
		
		System.out.println("KM3 -> JavaSource");
		Transformation km32Java = Example.getKM32Java();
		km32Java.setInputModel(modelInstance);
		km32Java.setInformationLoss(InformationLoss.informationLoss(km32Java));
		String javaOutputModel2 = baseResourcePath + baseResultPath + "C2/out-JavaSource.xmi";
		km32Java.setOutPath(javaOutputModel2);
		perfomer.run(km32Java);
		System.out.println("------------------------------------------------------------");
		
//		System.out.println("KM3 -> EMF");
//		Transformation km32emf = Example.getKM32EMF();
//		km32emf.setInputModel(modelInstance);
//		km32emf.setInformationLoss(InformationLoss.informationLoss(km32emf));
//		String emfOuputModel = baseResourcePath + baseResultPath + "C2/out-EMF.xmi";
//		km32emf.setOutPath(emfOuputModel);
//		perfomer.run(km32emf);
//		informationLoss = (float) km32emf.getInformationLoss();
//		System.out.println("------------------------------------------------------------");
//		
//		System.out.println("EMF -> JavaSource");
//		String emfModelInstance = baseResourcePath + "models/Sample.ecore";
//		Transformation emf2Java = Example.getEMF2Java();
//		emf2Java.setInputModel(emfModelInstance);
//		emf2Java.setInformationLoss(InformationLoss.informationLoss(emf2Java));
//		String javaOutputModel = baseResourcePath + baseResultPath + "C2/out-JavaSource.xmi";
//		emf2Java.setOutPath(javaOutputModel);
////		perfomer.run(emf2Java);
//		informationLoss *= (float) emf2Java.getInformationLoss();
//		System.out.println("------------------------------------------------------------");
		
		System.out.println("JavaSource -> Table");
		String javaModelInstance = baseResourcePath + baseResultPath + "C2/out-JavaSource.xmi";
		Transformation java2Table = Example.getJava2Table();
		java2Table.setInputModel(javaModelInstance);
		String tableOutputModel = baseResourcePath + baseResultPath + "C2/out-Table.xmi";
		java2Table.setOutPath(tableOutputModel);
		perfomer.run(java2Table);
		java2Table.setInformationLoss(InformationLoss.informationLoss(java2Table));
		informationLoss *= (float) java2Table.getInformationLoss();
		System.out.println("------------------------------------------------------------");

		System.out.println("Table -> HTML");
		String tableModelInstance = baseResourcePath + "models/Table.xmi";
		Transformation table2html = Example.getTable2HTML();
		table2html.setInputModel(tableModelInstance);
		String htmlOutputModel = baseResourcePath + baseResultPath + "C2/out-HTML.xmi";
		table2html.setOutPath(htmlOutputModel);
		perfomer.run(table2html);
		table2html.setInformationLoss(InformationLoss.informationLoss(table2html));
		informationLoss *= (float) table2html.getInformationLoss();
		System.out.println("------------------------------------------------------------");

		System.out.println("HTML -> XML");
		String htmlModelInstance = baseResourcePath + "models/HTML.xmi";
		Transformation html2xml = Example.getHTML2XML();
		html2xml.setInputModel(htmlModelInstance);
		String xmlOutputModel = baseResourcePath + baseResultPath + "C2/out-XML.xmi";
		html2xml.setOutPath(xmlOutputModel);
		perfomer.run(html2xml);
		html2xml.setInformationLoss(InformationLoss.informationLoss(html2xml));
		informationLoss *= (float) html2xml.getInformationLoss();
		System.out.println("------------------------------------------------------------");
		
		return informationLoss;
	}
	
	public static float testChain3(String modelInstance) {
		ATLTransformationPerformer perfomer = new ATLTransformationPerformer();
		
		float informationLoss = 0;
		
		System.out.println("KM3 -> XML");
		Transformation km32xml = Example.getKM32XML();
		km32xml.setInputModel(modelInstance);
		km32xml.setInformationLoss(InformationLoss.informationLoss(km32xml));
		String xmlOuputModel = baseResourcePath + baseResultPath + "C3/out-XML.xmi";
		km32xml.setOutPath(xmlOuputModel);
		perfomer.run(km32xml);
		informationLoss = (float) km32xml.getInformationLoss();
		System.out.println("------------------------------------------------------------");
		
		return informationLoss;
	}
	
	public static void testAll(String modelInstance) {
		ATLTransformationPerformer perfomer = new ATLTransformationPerformer();
		
		System.out.println("KM3 -> XML");
		Transformation km32xml = Example.getKM32XML();
		km32xml.setInputModel(modelInstance);
		km32xml.setInformationLoss(InformationLoss.informationLoss(km32xml));
		String xmlOuputModel = baseResourcePath + "models/out-"+Utils.getNameFromPathWithoutExtension(km32xml.getOutputMetamodel())+".xmi";
		km32xml.setOutPath(xmlOuputModel);
		perfomer.run(km32xml);
		System.out.println("------------------------------------------------------------");
		
		
		System.out.println("KM3 -> EMF");
		Transformation km32emf = Example.getKM32EMF();
		km32emf.setInputModel(modelInstance);
		km32emf.setInformationLoss(InformationLoss.informationLoss(km32emf));
		String emfOuputModel = baseResourcePath + "models/out-"+Utils.getNameFromPathWithoutExtension(km32emf.getOutputMetamodel())+".xmi";
		km32emf.setOutPath(emfOuputModel);
		perfomer.run(km32emf);
		System.out.println("------------------------------------------------------------");
		
		System.out.println("EMF -> JavaSource");
		String emfModelInstance = baseResourcePath + "models/Sample.ecore";
		Transformation emf2Java = Example.getEMF2Java();
		emf2Java.setInputModel(emfModelInstance);
		emf2Java.setInformationLoss(InformationLoss.informationLoss(emf2Java));
		String javaOutputModel = baseResourcePath + "models/out-"+Utils.getNameFromPathWithoutExtension(emf2Java.getOutputMetamodel())+".xmi";
		emf2Java.setOutPath(javaOutputModel);
		perfomer.run(emf2Java);
		System.out.println("------------------------------------------------------------");
		
			System.out.println("KM3 -> JavaSource");
			Transformation km32Java = Example.getKM32Java();
			km32Java.setInputModel(modelInstance);
			km32Java.setInformationLoss(InformationLoss.informationLoss(km32Java));
			String javaOutputModel2 = baseResourcePath + "models/out-"+Utils.getNameFromPathWithoutExtension(km32Java.getOutputMetamodel())+".xmi";
			km32Java.setOutPath(javaOutputModel2);
			perfomer.run(km32Java);
			System.out.println("------------------------------------------------------------");
		
			
		System.out.println("JavaSource -> Table");
		String javaModelInstance = baseResourcePath + "models/out-km32javasource.xmi";
		Transformation java2Table = Example.getJava2Table();
		java2Table.setInputModel(javaModelInstance);
		String tableOutputModel = baseResourcePath + "models/out-"+Utils.getNameFromPathWithoutExtension(java2Table.getOutputMetamodel())+".xmi";
		java2Table.setOutPath(tableOutputModel);
		perfomer.run(java2Table);
		java2Table.setInformationLoss(InformationLoss.informationLoss(java2Table));
		
		System.out.println("------------------------------------------------------------");
		System.out.println("Table -> HTML");
		String tableModelInstance = baseResourcePath + "models/Table.xmi";
		Transformation table2html = Example.getTable2HTML();
		table2html.setInputModel(tableModelInstance);
		String htmlOutputModel = baseResourcePath + "models/out-"+Utils.getNameFromPathWithoutExtension(table2html.getOutputMetamodel())+".xmi";
		table2html.setOutPath(htmlOutputModel);
		perfomer.run(table2html);
		table2html.setInformationLoss(InformationLoss.informationLoss(table2html));
		System.out.println("------------------------------------------------------------");

		System.out.println("HTML -> XML");
		String htmlModelInstance = baseResourcePath + "models/HTML.xmi";
		Transformation html2xml = Example.getHTML2XML();
		html2xml.setInputModel(htmlModelInstance);
		String xmlOutputModel = baseResourcePath + "models/out-"+Utils.getNameFromPathWithoutExtension(html2xml.getOutputMetamodel())+".xmi";
		html2xml.setOutPath(xmlOutputModel);
		perfomer.run(html2xml);
		html2xml.setInformationLoss(InformationLoss.informationLoss(html2xml));
		System.out.println("------------------------------------------------------------");
		
		
	}


}
