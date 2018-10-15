package it.univaq.disim.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import org.eclipse.ocl.ParserException;

import it.univaq.disim.business.calculations.InformationLoss;
import it.univaq.disim.business.controller.ATLTransformationPerformer;
import it.univaq.disim.business.datamodel.ChainResult;
import it.univaq.disim.business.datamodel.Transformation;
import it.univaq.disim.common.exceptions.MetaModelNotFoundException;
import it.univaq.disim.common.exceptions.ReferenceNonExistingException;
import it.univaq.disim.common.utils.Utils;
import it.univaq.disim.demo.RunningExample;

public class ChainDetector {

	private static String baseResourcePath = "resources/running_example/";
	private static String baseResultPath = "models/mutations/results/";
	private static boolean PERFORM_TRANSFORMATIONS = false;
	private static boolean PERFORM_INFORMATION_LOSS_CALCULATION = true;

	
	public static void main(String[] args)
			throws IOException, MetaModelNotFoundException, ReferenceNonExistingException, ParserException {
		
		String modelInstance_seed = baseResourcePath + "models/Sample-km3/sample-km3.xmi";
		run(modelInstance_seed);

	}

	public static void run(String inputModel) {
		ChainResult resultChain1 = new ChainResult();
		ChainResult resultChain2 = new ChainResult();
		ChainResult resultChain3 = new ChainResult();

		printChains();

		resultChain1 = testChain1(inputModel);
		resultChain2 = testChain2(inputModel);
		resultChain3 = testChain3(inputModel);

		System.out.println("RESULTS:");
		System.out.println("CHAIN 1:");
		System.out.println(
				Utils.getNameFromPath(resultChain1.getModel()) + " - IL = " + resultChain1.getInformationLoss() / 5
						+ " - Weight = " + resultChain1.getWeight() + " Exec. time: " + resultChain1.getExecutionTime()
						+ " millisec (" + resultChain1.getExecutionTime() / 1000 + " sec) [Best Chain!]");
		System.out.println("CHAIN 2:");
		System.out.println(Utils.getNameFromPath(resultChain2.getModel()) + " - IL = "
				+ resultChain2.getInformationLoss() / 4 + " - Weight = " + resultChain2.getWeight() + " Exec. time: "
				+ resultChain2.getExecutionTime() + " millisec (" + resultChain2.getExecutionTime() / 1000 + " sec)");
		System.out.println("CHAIN 3:");
		System.out.println(Utils.getNameFromPath(resultChain3.getModel()) + " -  IL = TOT - Weight = "
				+ resultChain3.getWeight() + " Exec. time: " + resultChain3.getExecutionTime() + " millisec ("
				+ resultChain3.getExecutionTime() / 1000 + " sec)");

	}

	public static ChainResult testChain1(String modelInstance) {

		long inizio = System.currentTimeMillis();

		float informationLoss = 0;
		float edgeWeight = 0;

		ATLTransformationPerformer perfomer = new ATLTransformationPerformer();

		System.out.println("KM3 -> EMF");
		Transformation km32emf = RunningExample.getKM32EMF();
		km32emf.setInputModel(modelInstance);
		if (PERFORM_INFORMATION_LOSS_CALCULATION) {
			km32emf.setInformationLoss(InformationLoss.informationLoss(km32emf));
		}
		String emfOuputModel = baseResourcePath + baseResultPath + "C1/EMF/out-EMF.xmi";
		km32emf.setOutPath(emfOuputModel);
		if (PERFORM_TRANSFORMATIONS) {
			perfomer.run(km32emf);
		}
		informationLoss = (float) km32emf.getInformationLoss();
		System.out.println("Partial IL: " + informationLoss);
		edgeWeight = (float) km32emf.getEdgeWeight();
		System.out.println("Partial EDGE WEIGHT: " + edgeWeight);
		System.out.println("Edge Weight: " + km32emf.getEdgeWeight());
		System.out.println("------------------------------------------------------------");

		System.out.println("EMF -> JavaSource");
		String emfModelInstance = baseResourcePath + "models/Sample.ecore";
		Transformation emf2Java = RunningExample.getEMF2Java();
		emf2Java.setInputModel(emfModelInstance);
		if (PERFORM_INFORMATION_LOSS_CALCULATION) {
			emf2Java.setInformationLoss(InformationLoss.informationLoss(emf2Java));
		}
		String javaOutputModel = baseResourcePath + baseResultPath + "C1/JavaSource/out-JavaSource.xmi";
		emf2Java.setOutPath(javaOutputModel);
		// if(PERFORM_TRANSFORMATIONS) {
		// perfomer.run(km32emf);
		// }
		informationLoss *= (float) emf2Java.getInformationLoss();
		System.out.println("Partial IL: " + informationLoss);
		edgeWeight += (float) emf2Java.getEdgeWeight();
		System.out.println("Partial EDGE WEIGHT: " + edgeWeight);
		System.out.println("Edge Weight: " + emf2Java.getEdgeWeight());
		System.out.println("------------------------------------------------------------");

		System.out.println("JavaSource -> Table");
		String javaModelInstance = baseResourcePath + "models/JavaSource.xmi";
		Transformation java2Table = RunningExample.getJava2Table();
		java2Table.setInputModel(javaModelInstance);
		String tableOutputModel = baseResourcePath + baseResultPath + "C1/Table/out-Table.xmi";
		java2Table.setOutPath(tableOutputModel);
		if (PERFORM_TRANSFORMATIONS) {
			perfomer.run(java2Table);
		}
		if (PERFORM_INFORMATION_LOSS_CALCULATION) {
			java2Table.setInformationLoss(InformationLoss.informationLoss(java2Table));
		}
		informationLoss *= (float) java2Table.getInformationLoss();
		System.out.println("Partial IL: " + informationLoss);
		edgeWeight += (float) java2Table.getEdgeWeight();
		System.out.println("Partial EDGE WEIGHT: " + edgeWeight);
		System.out.println("Edge Weight: " + java2Table.getEdgeWeight());
		System.out.println("------------------------------------------------------------");

		System.out.println("Table -> HTML");
		String tableModelInstance = baseResourcePath + "models/Table.xmi";
		Transformation table2html = RunningExample.getTable2HTML();
		table2html.setInputModel(tableModelInstance);
		String htmlOutputModel = baseResourcePath + baseResultPath + "C1/TabularHTML/out-TabularHTML.xmi";
		table2html.setOutPath(htmlOutputModel);
		if (PERFORM_TRANSFORMATIONS) {
			perfomer.run(table2html);
		}
		if (PERFORM_INFORMATION_LOSS_CALCULATION) {
			table2html.setInformationLoss(InformationLoss.informationLoss(table2html));
		}
		informationLoss *= (float) table2html.getInformationLoss();
		System.out.println("Partial IL: " + informationLoss);
		edgeWeight += (float) table2html.getEdgeWeight();
		System.out.println("Partial EDGE WEIGHT: " + edgeWeight);
		System.out.println("Edge Weight: " + table2html.getEdgeWeight());
		System.out.println("------------------------------------------------------------");

		System.out.println("HTML -> XML");
		String htmlModelInstance = baseResourcePath + "models/HTML.xmi";
		Transformation html2xml = RunningExample.getHTML2XML();
		html2xml.setInputModel(htmlModelInstance);
		String xmlOutputModel = baseResourcePath + baseResultPath + "C1/XML/out-XML.xmi";
		html2xml.setOutPath(xmlOutputModel);
		if (PERFORM_TRANSFORMATIONS) {
			perfomer.run(html2xml);
		}
		if (PERFORM_INFORMATION_LOSS_CALCULATION) {
			html2xml.setInformationLoss(InformationLoss.informationLoss(html2xml));
		}
		informationLoss *= (float) html2xml.getInformationLoss();
		System.out.println("Partial IL: " + informationLoss);
		edgeWeight += (float) html2xml.getEdgeWeight();
		System.out.println("Partial EDGE WEIGHT: " + edgeWeight);
		System.out.println("Edge Weight: " + html2xml.getEdgeWeight());
		System.out.println("------------------------------------------------------------");

		// modelChain1 = modelInstance;
		// informationLossChain1 = informationLoss;
		// weightChain1 = edgeWeight;

		ChainResult result = new ChainResult();
		result.setInformationLoss(informationLoss);
		result.setWeight(edgeWeight);
		result.setModel(modelInstance);

		long fine = System.currentTimeMillis();
		long time = (fine - inizio);
		result.setExecutionTime(time);

		return result;
	}

	public static ChainResult testChain2(String modelInstance) {
		ATLTransformationPerformer perfomer = new ATLTransformationPerformer();

		long inizio = System.currentTimeMillis();

		float informationLoss = 0;
		float edgeWeight = 0;

		System.out.println("KM3 -> JavaSource");
		Transformation km32Java = RunningExample.getKM32Java();
		km32Java.setInputModel(modelInstance);
		if (PERFORM_INFORMATION_LOSS_CALCULATION) {
			km32Java.setInformationLoss(InformationLoss.informationLoss(km32Java));
		}
		String javaOutputModel2 = baseResourcePath + baseResultPath + "C2/JavaSource/out-JavaSource.xmi";
		km32Java.setOutPath(javaOutputModel2);
		if (PERFORM_TRANSFORMATIONS) {
			perfomer.run(km32Java);
		}
		informationLoss = (float) km32Java.getInformationLoss();
		System.out.println("Partial IL: " + informationLoss);
		edgeWeight = (float) km32Java.getEdgeWeight();
		System.out.println("Partial EDGE WEIGHT: " + edgeWeight);
		System.out.println("Edge Weight: " + km32Java.getEdgeWeight());
		System.out.println("------------------------------------------------------------");

		System.out.println("JavaSource -> Table");
		String javaModelInstance = baseResourcePath + "models/JavaSource.xmi";
		Transformation java2Table = RunningExample.getJava2Table();
		java2Table.setInputModel(javaModelInstance);
		String tableOutputModel = baseResourcePath + baseResultPath + "C2/Table/out-Table.xmi";
		java2Table.setOutPath(tableOutputModel);
		if (PERFORM_TRANSFORMATIONS) {
			perfomer.run(java2Table);
		}
		if (PERFORM_INFORMATION_LOSS_CALCULATION) {
			java2Table.setInformationLoss(InformationLoss.informationLoss(java2Table));
		}
		informationLoss *= (float) java2Table.getInformationLoss();
		System.out.println("Partial IL: " + informationLoss);
		edgeWeight += (float) java2Table.getEdgeWeight();
		System.out.println("Partial EDGE WEIGHT: " + edgeWeight);
		System.out.println("Edge Weight: " + java2Table.getEdgeWeight());
		System.out.println("------------------------------------------------------------");

		System.out.println("Table -> HTML");
		String tableModelInstance = baseResourcePath + "models/Table.xmi";
		Transformation table2html = RunningExample.getTable2HTML();
		table2html.setInputModel(tableModelInstance);
		String htmlOutputModel = baseResourcePath + baseResultPath + "C2/TabularHTML/out-TabularHTML.xmi";
		table2html.setOutPath(htmlOutputModel);
		if (PERFORM_TRANSFORMATIONS) {
			perfomer.run(table2html);
		}
		if (PERFORM_INFORMATION_LOSS_CALCULATION) {
			table2html.setInformationLoss(InformationLoss.informationLoss(table2html));
		}
		informationLoss *= (float) table2html.getInformationLoss();
		System.out.println("Partial IL: " + informationLoss);
		edgeWeight += (float) table2html.getEdgeWeight();
		System.out.println("Partial EDGE WEIGHT: " + edgeWeight);
		System.out.println("Edge Weight: " + table2html.getEdgeWeight());
		System.out.println("------------------------------------------------------------");

		System.out.println("HTML -> XML");
		String htmlModelInstance = baseResourcePath + "models/HTML.xmi";
		Transformation html2xml = RunningExample.getHTML2XML();
		html2xml.setInputModel(htmlModelInstance);
		String xmlOutputModel = baseResourcePath + baseResultPath + "C2/XML/out-XML.xmi";
		html2xml.setOutPath(xmlOutputModel);
		if (PERFORM_TRANSFORMATIONS) {
			perfomer.run(html2xml);
		}
		if (PERFORM_INFORMATION_LOSS_CALCULATION) {
			html2xml.setInformationLoss(InformationLoss.informationLoss(html2xml));
		}
		informationLoss *= (float) html2xml.getInformationLoss();
		System.out.println("Partial IL: " + informationLoss);
		edgeWeight += (float) html2xml.getEdgeWeight();
		System.out.println("Partial EDGE WEIGHT: " + edgeWeight);
		System.out.println("Edge Weight: " + html2xml.getEdgeWeight());
		System.out.println("------------------------------------------------------------");

		// modelChain2 = modelInstance;
		// informationLossChain2 = informationLoss;
		// weightChain2 = edgeWeight;
		//
		ChainResult result = new ChainResult();
		result.setInformationLoss(informationLoss);
		result.setWeight(edgeWeight);
		result.setModel(modelInstance);

		long fine = System.currentTimeMillis();
		long time = (fine - inizio);
		result.setExecutionTime(time);

		return result;
	}

	public static ChainResult testChain3(String modelInstance) {
		ATLTransformationPerformer perfomer = new ATLTransformationPerformer();

		long inizio = System.currentTimeMillis();
		float informationLoss = 0;

		System.out.println("KM3 -> XML");
		Transformation km32xml = RunningExample.getKM32XML();
		km32xml.setInputModel(modelInstance);
		if (PERFORM_INFORMATION_LOSS_CALCULATION) {
			km32xml.setInformationLoss(InformationLoss.informationLoss(km32xml));
		}
		String xmlOuputModel = baseResourcePath + baseResultPath + "C3/XML/out-XML.xmi";
		km32xml.setOutPath(xmlOuputModel);
		if (PERFORM_TRANSFORMATIONS) {
			perfomer.run(km32xml);
		}
		informationLoss = (float) km32xml.getInformationLoss();
		System.out.println("Partial IL: " + informationLoss);
		System.out.println("Edge Weight: " + km32xml.getEdgeWeight());
		System.out.println("------------------------------------------------------------");

		// modelChain3 = modelInstance;
		// informationLossChain3 = informationLoss;
		// weightChain3 = km32xml.getEdgeWeight();

		ChainResult result = new ChainResult();
		result.setInformationLoss(informationLoss);
		result.setWeight(km32xml.getEdgeWeight());
		result.setModel(modelInstance);

		long fine = System.currentTimeMillis();
		long time = (fine - inizio);
		result.setExecutionTime(time);

		return result;
	}

	private static void printChains() {
		System.out.println("3 Chains found:");
		System.out.println("\n Chain 1: KM3 -> EMF -> JavaSource -> Table -> HTML -> XML");
		System.out.println("\n Chain 2: KM3 -> JavaSource -> Table -> HTML -> XML");
		System.out.println("\n Chain 3: KM3 -> XML");
		System.out.println();
	}

	public static void testAll(String modelInstance) {
		ATLTransformationPerformer perfomer = new ATLTransformationPerformer();

		System.out.println("KM3 -> XML");
		Transformation km32xml = RunningExample.getKM32XML();
		km32xml.setInputModel(modelInstance);
		km32xml.setInformationLoss(InformationLoss.informationLoss(km32xml));
		String xmlOuputModel = baseResourcePath + "models/out-"
				+ Utils.getNameFromPathWithoutExtension(km32xml.getOutputMetamodel()) + ".xmi";
		km32xml.setOutPath(xmlOuputModel);
		perfomer.run(km32xml);
		System.out.println("------------------------------------------------------------");

		System.out.println("KM3 -> EMF");
		Transformation km32emf = RunningExample.getKM32EMF();
		km32emf.setInputModel(modelInstance);
		km32emf.setInformationLoss(InformationLoss.informationLoss(km32emf));
		String emfOuputModel = baseResourcePath + "models/out-"
				+ Utils.getNameFromPathWithoutExtension(km32emf.getOutputMetamodel()) + ".xmi";
		km32emf.setOutPath(emfOuputModel);
		perfomer.run(km32emf);
		System.out.println("------------------------------------------------------------");

		System.out.println("EMF -> JavaSource");
		String emfModelInstance = baseResourcePath + "models/Sample.ecore";
		Transformation emf2Java = RunningExample.getEMF2Java();
		emf2Java.setInputModel(emfModelInstance);
		emf2Java.setInformationLoss(InformationLoss.informationLoss(emf2Java));
		String javaOutputModel = baseResourcePath + "models/out-"
				+ Utils.getNameFromPathWithoutExtension(emf2Java.getOutputMetamodel()) + ".xmi";
		emf2Java.setOutPath(javaOutputModel);
		perfomer.run(emf2Java);
		System.out.println("------------------------------------------------------------");

		System.out.println("KM3 -> JavaSource");
		Transformation km32Java = RunningExample.getKM32Java();
		km32Java.setInputModel(modelInstance);
		km32Java.setInformationLoss(InformationLoss.informationLoss(km32Java));
		String javaOutputModel2 = baseResourcePath + "models/out-"
				+ Utils.getNameFromPathWithoutExtension(km32Java.getOutputMetamodel()) + ".xmi";
		km32Java.setOutPath(javaOutputModel2);
		perfomer.run(km32Java);
		System.out.println("------------------------------------------------------------");

		System.out.println("JavaSource -> Table");
		String javaModelInstance = baseResourcePath + "models/out-km32javasource.xmi";
		Transformation java2Table = RunningExample.getJava2Table();
		java2Table.setInputModel(javaModelInstance);
		String tableOutputModel = baseResourcePath + "models/out-"
				+ Utils.getNameFromPathWithoutExtension(java2Table.getOutputMetamodel()) + ".xmi";
		java2Table.setOutPath(tableOutputModel);
		perfomer.run(java2Table);
		java2Table.setInformationLoss(InformationLoss.informationLoss(java2Table));

		System.out.println("------------------------------------------------------------");
		System.out.println("Table -> HTML");
		String tableModelInstance = baseResourcePath + "models/Table.xmi";
		Transformation table2html = RunningExample.getTable2HTML();
		table2html.setInputModel(tableModelInstance);
		String htmlOutputModel = baseResourcePath + "models/out-"
				+ Utils.getNameFromPathWithoutExtension(table2html.getOutputMetamodel()) + ".xmi";
		table2html.setOutPath(htmlOutputModel);
		perfomer.run(table2html);
		table2html.setInformationLoss(InformationLoss.informationLoss(table2html));
		System.out.println("------------------------------------------------------------");

		System.out.println("HTML -> XML");
		String htmlModelInstance = baseResourcePath + "models/HTML.xmi";
		Transformation html2xml = RunningExample.getHTML2XML();
		html2xml.setInputModel(htmlModelInstance);
		String xmlOutputModel = baseResourcePath + "models/out-"
				+ Utils.getNameFromPathWithoutExtension(html2xml.getOutputMetamodel()) + ".xmi";
		html2xml.setOutPath(xmlOutputModel);
		perfomer.run(html2xml);
		html2xml.setInformationLoss(InformationLoss.informationLoss(html2xml));
		System.out.println("------------------------------------------------------------");

	}

}
