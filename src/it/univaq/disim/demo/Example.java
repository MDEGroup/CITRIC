package it.univaq.disim.demo;

import java.util.ArrayList;
import java.util.List;

import it.univaq.disim.business.calculations.Coverage;
import it.univaq.disim.business.controller.ChainController;
import it.univaq.disim.business.datamodel.Chain;
import it.univaq.disim.business.datamodel.Transformation;

public class Example {
	
	private final static String resourcesBasePath = "resources/";
	private final static String runningExampleBasePath = "running_example/";
	private final static String transformationsPath = resourcesBasePath + runningExampleBasePath + "transformations/";
	private final static String metamodelsPath = resourcesBasePath + runningExampleBasePath +"metamodels/";

	
	private static String MM_KM3 = 			metamodelsPath + "KM.ecore";
	private static String MM_EMF = 			metamodelsPath + "Sample.ecore";
	private static String MM_JavaSource = 	metamodelsPath + "JavaSource.ecore";
	private static String MM_XML = 			metamodelsPath + "XML.ecore";
	private static String MM_HTML = 		metamodelsPath + "HTML.ecore";
	private static String MM_Table = 		metamodelsPath + "Table.ecore";
	
	public static String StartMetamodel = MM_KM3;
	public static String EndMetamodel = MM_XML;
	
	
	private static String KM32EMF = 	transformationsPath + "KM32EMF.atl";
//		private static String KM32EMFinTAG = "KM3";
//		private static String KM32EMFOutTAG = "MOF";
	
	private static 	String KM32Java = 	transformationsPath + "km3_2_java.atl";
//		private static String KM32JavaInTag = "KM3";
//		private static String KM32JavaOutTag = "Java";
		
	private static String EMF2Java = 	transformationsPath + "emf2java.atl";
//		private static String EMF2JavaInTag = "EMF";
//		private static String EMF2JavaOutTag = "Java";
		
	private static String KM32XML = 	transformationsPath + "KM32XML.atl";
//		private static 	String KM32XMLInTag = "KM3";
//		private static 	String KM32XMLOutTag = "XML";
		
	private static String Java2Table = 	transformationsPath + "JavaSource2Table.atl";
//		private static 	String Java2TableInTag = "JavaSource";
//		private static 	String Java2TableOutTag = "Table";
		
	private static String Table2HTML = 	transformationsPath + "Table2TabularHTML.atl";
//		private static 	String Table2HTMLInTag = "Table";
//		private static 	String Table2HTMLOutTag = "HTML";
		
	private static String HTML2XML = 	transformationsPath + "HTML2XML.atl";
//		private static 	String HTML2XMLInTag = "HTML";
//		private static 	String HTML2XMLOutTag = "XML";	
		
		

	public static Transformation getKM32EMF() {
		Transformation t_KM32EMF = new Transformation();
		// t_KM32EMF.setInputModel(inputModelName);
		t_KM32EMF.setInputMetamodel(MM_KM3);
		t_KM32EMF.setOutputMetamodel(MM_EMF);
		t_KM32EMF.setATLTransformation(KM32EMF);
//		t_KM32EMF.setInTag(KM32EMFinTAG);
//		t_KM32EMF.setOutTag(KM32EMFOutTAG);
		// t_KM32EMF.setOutPath(outPath_chain_1);
		t_KM32EMF.setCoverage(Coverage.coverage(t_KM32EMF));
//		t_KM32EMF.setInformationLoss(InformationLoss.informationLoss(t_KM32EMF));

		return t_KM32EMF;
	}

	public static Transformation getEMF2Java() {
		Transformation t_EMF2Java = new Transformation();
		// t_EMF2Java.setInputModel(inputModelName);
		t_EMF2Java.setInputMetamodel(MM_EMF);
		t_EMF2Java.setOutputMetamodel(MM_JavaSource);
		t_EMF2Java.setATLTransformation(EMF2Java);
//		t_EMF2Java.setInTag(EMF2JavaInTag);
//		t_EMF2Java.setOutTag(EMF2JavaOutTag);
		// t_EMF2Java.setOutPath(outPath_chain_1);
		t_EMF2Java.setCoverage(Coverage.coverage(t_EMF2Java));
//		t_EMF2Java.setInformationLoss(InformationLoss.informationLoss(t_EMF2Java));
		return t_EMF2Java;
	}

	public static Transformation getJava2Table() {
		Transformation t_Java2Table = new Transformation();
		// t_Java2Table.setInputModel(inputModelName);
		t_Java2Table.setInputMetamodel(MM_JavaSource);
		t_Java2Table.setOutputMetamodel(MM_Table);
		t_Java2Table.setATLTransformation(Java2Table);
//		t_Java2Table.setInTag(Java2TableInTag);
//		t_Java2Table.setOutTag(Java2TableOutTag);
		// t_Java2Table.setOutPath(outPath_chain_1);
		t_Java2Table.setCoverage(Coverage.coverage(t_Java2Table));
//		t_Java2Table.setInformationLoss(InformationLoss.informationLoss(t_Java2Table));
		return t_Java2Table;
	}

	public static Transformation getTable2HTML() {
		Transformation t_Table2HTML = new Transformation();
		// t_Table2HTML.setInputModel(inputModelName);
		t_Table2HTML.setInputMetamodel(MM_Table);
		t_Table2HTML.setOutputMetamodel(MM_HTML);
		t_Table2HTML.setATLTransformation(Table2HTML);
//		t_Table2HTML.setInTag(Table2HTMLInTag);
//		t_Table2HTML.setOutTag(Table2HTMLOutTag);
		// t_Table2HTML.setOutPath(outPath_chain_1);
		t_Table2HTML.setCoverage(Coverage.coverage(t_Table2HTML));
//		t_Table2HTML.setInformationLoss(InformationLoss.informationLoss(t_Table2HTML));
		return t_Table2HTML;
	}

	public static Transformation getHTML2XML() {
		Transformation t_HTML2XML = new Transformation();
		// t_HTML2XML.setInputModel(inputModelName);
		t_HTML2XML.setInputMetamodel(MM_HTML);
		t_HTML2XML.setOutputMetamodel(MM_XML);
		t_HTML2XML.setATLTransformation(HTML2XML);
//		t_HTML2XML.setInTag(HTML2XMLInTag);
//		t_HTML2XML.setOutTag(HTML2XMLOutTag);
		// t_HTML2XML.setOutPath(outPath_chain_1);
		t_HTML2XML.setCoverage(Coverage.coverage(t_HTML2XML));
//		t_HTML2XML.setInformationLoss(InformationLoss.informationLoss(t_HTML2XML));
		return t_HTML2XML;
	}

	public static Transformation getKM32Java() {
		Transformation t_KM32Java = new Transformation();
		// t_KM32Java.setInputModel(inputModelName);
		t_KM32Java.setInputMetamodel(MM_KM3);
		t_KM32Java.setOutputMetamodel(MM_JavaSource);
		t_KM32Java.setATLTransformation(KM32Java);
//		t_KM32Java.setInTag(KM32JavaInTag);
//		t_KM32Java.setOutTag(KM32JavaOutTag);
		// t_KM32Java.setOutPath(outPath_chain_2);
		t_KM32Java.setCoverage(Coverage.coverage(t_KM32Java));
//		t_KM32Java.setInformationLoss(InformationLoss.informationLoss(t_KM32Java));
		return t_KM32Java;
	}

	public static Transformation getKM32XML() {
		Transformation t_KM32XML = new Transformation();
		// t_KM32XML.setInputModel(inputModelName);
		t_KM32XML.setInputMetamodel(MM_KM3);
		t_KM32XML.setOutputMetamodel(MM_XML);
		t_KM32XML.setATLTransformation(KM32XML);
//		t_KM32XML.setInTag(KM32XMLInTag);
//		t_KM32XML.setOutTag(KM32XMLOutTag);
		// t_KM32XML.setOutPath(outPath_chain_3);
		t_KM32XML.setCoverage(Coverage.coverage(t_KM32XML));
//		t_KM32XML.setInformationLoss(InformationLoss.informationLoss(t_KM32XML));
		return t_KM32XML;
	}
	
	
	public static Chain getChain1(String inputModel) {
		List<Transformation> chain1Ts = new ArrayList<Transformation>();
		chain1Ts.add(Example.getKM32EMF());
		chain1Ts.add(Example.getEMF2Java());
		chain1Ts.add(Example.getJava2Table());
		chain1Ts.add(Example.getTable2HTML());
		chain1Ts.add(Example.getHTML2XML());
		Chain chain1 = new Chain();
		chain1.setName("Chain1");
		chain1.setInputModel(inputModel);
		chain1.setInputMetamodel(Example.StartMetamodel);
		chain1.setOutputMetamodel(Example.EndMetamodel);
		chain1.setTransformations(chain1Ts);
		chain1.setCoverage(ChainController.calculateChainCoverage(chain1));
//		chain1.setInformationLoss(ChainController.calculateChainInformationLoss(chain1));
		return chain1;
	}
	
	public static Chain getChain2(String inputModel) {
		List<Transformation> chain2Ts = new ArrayList<Transformation>();
		chain2Ts.add(Example.getKM32Java());
		Chain chain2 = new Chain();
		chain2.setName("Chain2");
		chain2.setInputModel(inputModel);
		chain2.setInputMetamodel(Example.StartMetamodel);
		chain2.setOutputMetamodel(Example.EndMetamodel);
		chain2.setTransformations(chain2Ts);
		chain2.setCoverage(ChainController.calculateChainCoverage(chain2));
//		chain2.setCoverage(ChainController.calculateChainInformationLoss(chain2));
		return chain2;
	}
	
	public static Chain getChain3(String inputModel) {
		List<Transformation> chain3Ts = new ArrayList<Transformation>();
		chain3Ts.add(Example.getKM32Java());
		chain3Ts.add(Example.getJava2Table());
		chain3Ts.add(Example.getTable2HTML());
		chain3Ts.add(Example.getHTML2XML());
		Chain chain3 = new Chain();
		chain3.setName("Chain3");
		chain3.setInputModel(inputModel);
		chain3.setInputMetamodel(Example.StartMetamodel);
		chain3.setOutputMetamodel(Example.EndMetamodel);
		chain3.setTransformations(chain3Ts);
		chain3.setCoverage(ChainController.calculateChainCoverage(chain3));
//		chain3.setInformationLoss(ChainController.calculateChainInformationLoss(chain3));
		return chain3;
	}
	
	public static Chain getChain4(String inputModel) {
		List<Transformation> chain4Ts = new ArrayList<Transformation>();
		chain4Ts.add(Example.getKM32XML());
		Chain chain4 = new Chain();
		chain4.setName("Chain4");
		chain4.setInputModel(inputModel);
		chain4.setInputMetamodel(Example.StartMetamodel);
		chain4.setOutputMetamodel(Example.EndMetamodel);
		chain4.setTransformations(chain4Ts);
		chain4.setCoverage(ChainController.calculateChainCoverage(chain4));
//		chain4.setInformationLoss(ChainController.calculateChainInformationLoss(chain4));
		return chain4;
	}
	
	
	public static void main(String[] args) {
		String inputModel = "resources/mutations/KM3_seed.xmi";
		Chain chain = Example.getChain3(inputModel);
		System.out.println((float) chain.getInformationLoss());
	}
	
}
