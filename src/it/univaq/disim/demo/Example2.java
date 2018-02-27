package it.univaq.disim.demo;

import java.util.ArrayList;
import java.util.List;

import it.univaq.disim.business.calculations.Coverage;
import it.univaq.disim.business.controller.ChainController;
import it.univaq.disim.business.datamodel.Chain;
import it.univaq.disim.business.datamodel.Transformation;

public class Example2 {
	
	private final static String resourcesBasePath = "resources/";
	private final static String runningExampleBasePath = "example/";
	private final static String transformationsPath = resourcesBasePath + runningExampleBasePath + "transformation/";
	private final static String metamodelsPath = resourcesBasePath + runningExampleBasePath +"metamodels/";

	
	private static String MM_CMS = 			metamodelsPath + "CmsMM.ecore";
	private static String MM_Company = 			metamodelsPath + "CompanyMM.ecore";
	private static String MM_Orgchart = 	metamodelsPath + "Orgchart.ecore";
	private static String MM_ProjectManagement = 			metamodelsPath + "ProjectManagement.ecore";
	
	public static String StartMetamodel = MM_ProjectManagement;
	public static String EndMetamodel = MM_CMS;
	
	
	private static String anotherCompany2CMS = 	transformationsPath + "AnotherCompany2CMS.atl";
//		private static String KM32EMFinTAG = "KM3";
//		private static String KM32EMFOutTAG = "MOF";
	
	private static 	String company2CMS = 	transformationsPath + "Company2CMS.atl";
//		private static String KM32JavaInTag = "KM3";
//		private static String KM32JavaOutTag = "Java";
		
	private static String orgchart2company = 	transformationsPath + "orgchart2company.atl";
//		private static String EMF2JavaInTag = "EMF";
//		private static String EMF2JavaOutTag = "Java";
		
	private static String projectManagement2Company = 	transformationsPath + "ProjectManagement2Company.atl";
//		private static 	String KM32XMLInTag = "KM3";
//		private static 	String KM32XMLOutTag = "XML";
	
	private static String projectManagement2Orgchart = 	transformationsPath + "ProjectManagement2Orgchart.atl";
//		private static 	String KM32XMLInTag = "KM3";
//		private static 	String KM32XMLOutTag = "XML";
		
	
		

	public static Transformation getT1() {
		Transformation t_1 = new Transformation();
		// t_KM32EMF.setInputModel(inputModelName);
		t_1.setInputMetamodel(MM_ProjectManagement);
		t_1.setOutputMetamodel(MM_Company);
		t_1.setATLTransformation(projectManagement2Company);
//		t_KM32EMF.setInTag(KM32EMFinTAG);
//		t_KM32EMF.setOutTag(KM32EMFOutTAG);
		// t_KM32EMF.setOutPath(outPath_chain_1);
		t_1.setCoverage(Coverage.coverage(t_1));
//		t_KM32EMF.setInformationLoss(InformationLoss.informationLoss(t_KM32EMF));

		return t_1;
	}

	public static Transformation getT2() {
		Transformation t_2 = new Transformation();
		// t_EMF2Java.setInputModel(inputModelName);
		t_2.setInputMetamodel(MM_Company);
		t_2.setOutputMetamodel(MM_CMS);
		t_2.setATLTransformation(company2CMS);
//		t_EMF2Java.setInTag(EMF2JavaInTag);
//		t_EMF2Java.setOutTag(EMF2JavaOutTag);
		// t_EMF2Java.setOutPath(outPath_chain_1);
		t_2.setCoverage(Coverage.coverage(t_2));
//		t_EMF2Java.setInformationLoss(InformationLoss.informationLoss(t_EMF2Java));
		return t_2;
	}

	public static Transformation getT3() {
		Transformation t_3 = new Transformation();
		// t_Java2Table.setInputModel(inputModelName);
		t_3.setInputMetamodel(MM_ProjectManagement);
		t_3.setOutputMetamodel(MM_Orgchart);
		t_3.setATLTransformation(projectManagement2Orgchart);
//		t_Java2Table.setInTag(Java2TableInTag);
//		t_Java2Table.setOutTag(Java2TableOutTag);
		// t_Java2Table.setOutPath(outPath_chain_1);
		t_3.setCoverage(Coverage.coverage(t_3));
//		t_Java2Table.setInformationLoss(InformationLoss.informationLoss(t_Java2Table));
		return t_3;
	}

	public static Transformation getT4() {
		Transformation t_4 = new Transformation();
		// t_Table2HTML.setInputModel(inputModelName);
		t_4.setInputMetamodel(MM_Orgchart);
		t_4.setOutputMetamodel(MM_Company);
		t_4.setATLTransformation(orgchart2company);
//		t_Table2HTML.setInTag(Table2HTMLInTag);
//		t_Table2HTML.setOutTag(Table2HTMLOutTag);
		// t_Table2HTML.setOutPath(outPath_chain_1);
		t_4.setCoverage(Coverage.coverage(t_4));
//		t_Table2HTML.setInformationLoss(InformationLoss.informationLoss(t_Table2HTML));
		return t_4;
	}

	public static Transformation getT5() {
		Transformation t_5 = new Transformation();
		// t_HTML2XML.setInputModel(inputModelName);
		t_5.setInputMetamodel(MM_Company);
		t_5.setOutputMetamodel(MM_CMS);
		t_5.setATLTransformation(anotherCompany2CMS);
//		t_HTML2XML.setInTag(HTML2XMLInTag);
//		t_HTML2XML.setOutTag(HTML2XMLOutTag);
		// t_HTML2XML.setOutPath(outPath_chain_1);
		t_5.setCoverage(Coverage.coverage(t_5));
//		t_HTML2XML.setInformationLoss(InformationLoss.informationLoss(t_HTML2XML));
		return t_5;
	}

	
	
	public static Chain getChain1(String inputModel) {
		List<Transformation> chain1Ts = new ArrayList<Transformation>();
		chain1Ts.add(Example2.getT1());
		chain1Ts.add(Example2.getT2());
		Chain chain1 = new Chain();
		chain1.setName("Chain1");
		chain1.setInputModel(inputModel);
		chain1.setInputMetamodel(Example2.StartMetamodel);
		chain1.setOutputMetamodel(Example2.EndMetamodel);
		chain1.setTransformations(chain1Ts);
		chain1.setCoverage(ChainController.calculateChainCoverage(chain1));
//		chain1.setInformationLoss(ChainController.calculateChainInformationLoss(chain1));
		return chain1;
	}
	
	public static Chain getChain2(String inputModel) {
		List<Transformation> chain2Ts = new ArrayList<Transformation>();
		chain2Ts.add(Example2.getT3());
		chain2Ts.add(Example2.getT4());
		chain2Ts.add(Example2.getT5());
		Chain chain2 = new Chain();
		chain2.setName("Chain2");
		chain2.setInputModel(inputModel);
		chain2.setInputMetamodel(Example2.StartMetamodel);
		chain2.setOutputMetamodel(Example2.EndMetamodel);
		chain2.setTransformations(chain2Ts);
		chain2.setCoverage(ChainController.calculateChainCoverage(chain2));
//		chain2.setCoverage(ChainController.calculateChainInformationLoss(chain2));
		return chain2;
	}
	
	
	
	
	public static void main(String[] args) {
		String inputModel = "resources/mutations/KM3_seed.xmi";
		Chain chain = Example2.getChain2(inputModel);
		System.out.println((float) chain.getInformationLoss());
	}
	
}
