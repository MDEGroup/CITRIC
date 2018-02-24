package it.univaq.disim.common.utils;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import it.univaq.disim.business.datamodel.Transformation;

public class ReadLaunchConfigurationFiles {

	private String BASE_PATH = null;
	private String LAUNCH_CONFIGURATION_PATH = null;

	public ReadLaunchConfigurationFiles(String basePath, String launchConfigurationPath) {
		this.BASE_PATH = basePath;
		this.LAUNCH_CONFIGURATION_PATH = launchConfigurationPath;
	}

	public static void main(String[] args) {
		String basePath = "resources/ATLZoo";
		String launchConfigurationPath = "resources/ATLZoo/JavaSource2Table/JavaSource2Table.launch";
		ReadLaunchConfigurationFiles reader = new ReadLaunchConfigurationFiles(basePath, launchConfigurationPath);
		Transformation test = reader.getTransformationFromLaunchConfiguration();

		System.out.println(test.getInputMetamodel());
		System.out.println(test.getOutputMetamodel());
		System.out.println(test.getInputModel());
		System.out.println(test.getATLTransformation());

	}

	public Transformation getTransformationFromLaunchConfiguration() {
		Transformation t = new Transformation();
		t.setATLTransformation(BASE_PATH + getTransformationFile());
		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document doc = builder.parse(LAUNCH_CONFIGURATION_PATH);

			XPathFactory xPathfactory = XPathFactory.newInstance();
			XPath xpath = xPathfactory.newXPath();
			// XPathExpression expr = xpath.compile("//configuration/General/add[@key]");
			XPathExpression expr = xpath.compile("/launchConfiguration/mapAttribute/mapEntry");
			NodeList nl = (NodeList) expr.evaluate(doc, XPathConstants.NODESET);

			for (int c = 0; c < nl.getLength(); c++) {
				Node currentItem = nl.item(c);
				Node parent = currentItem.getParentNode();
				if (parent.getAttributes().getNamedItem("key").getNodeValue().equalsIgnoreCase("Path")) {
					String key = currentItem.getAttributes().getNamedItem("key").getNodeValue();
					String value = currentItem.getAttributes().getNamedItem("value").getNodeValue();
					String inTag = getInputMetamodel();
					t.setInTag(inTag);
					String outTag = getOutputMetamodel();
					t.setOutTag(outTag);
					if (key.equalsIgnoreCase("IN")) {
						t.setInputModel(BASE_PATH + value);
					} else if (key.equalsIgnoreCase(inTag)) {
						t.setInputMetamodel(BASE_PATH + value);
					} else if (key.equalsIgnoreCase(outTag)) {
						t.setOutputMetamodel(BASE_PATH + value);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return t;
	}

	private String getInputMetamodel() {
		String result = null;
		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document doc = builder.parse(LAUNCH_CONFIGURATION_PATH);

			XPathFactory xPathfactory = XPathFactory.newInstance();
			XPath xpath = xPathfactory.newXPath();
			// XPathExpression expr = xpath.compile("//configuration/General/add[@key]");
			XPathExpression expr = xpath.compile("/launchConfiguration/mapAttribute/mapEntry");
			NodeList nl = (NodeList) expr.evaluate(doc, XPathConstants.NODESET);

			for (int c = 0; c < nl.getLength(); c++) {
				Node currentItem = nl.item(c);
				Node parent = currentItem.getParentNode();
				if (parent.getAttributes().getNamedItem("key").getNodeValue().equalsIgnoreCase("Input")) {
					// String key = currentItem.getAttributes().getNamedItem("key").getNodeValue();
					String value = currentItem.getAttributes().getNamedItem("value").getNodeValue();
					result = value;
					// System.out.println(key +" - "+value);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	private String getOutputMetamodel() {
		String result = null;
		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document doc = builder.parse(LAUNCH_CONFIGURATION_PATH);

			XPathFactory xPathfactory = XPathFactory.newInstance();
			XPath xpath = xPathfactory.newXPath();
			// XPathExpression expr = xpath.compile("//configuration/General/add[@key]");
			XPathExpression expr = xpath.compile("/launchConfiguration/mapAttribute/mapEntry");
			NodeList nl = (NodeList) expr.evaluate(doc, XPathConstants.NODESET);

			for (int c = 0; c < nl.getLength(); c++) {
				Node currentItem = nl.item(c);
				Node parent = currentItem.getParentNode();
				if (parent.getAttributes().getNamedItem("key").getNodeValue().equalsIgnoreCase("Output")) {
					// String key = currentItem.getAttributes().getNamedItem("key").getNodeValue();
					String value = currentItem.getAttributes().getNamedItem("value").getNodeValue();
					result = value;
					// System.out.println(key +" - "+value);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	private String getTransformationFile() {
		String result = null;
		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document doc = builder.parse(LAUNCH_CONFIGURATION_PATH);

			XPathFactory xPathfactory = XPathFactory.newInstance();
			XPath xpath = xPathfactory.newXPath();
			// XPathExpression expr = xpath.compile("//configuration/General/add[@key]");
			XPathExpression expr = xpath.compile("/launchConfiguration/stringAttribute");
			NodeList nl = (NodeList) expr.evaluate(doc, XPathConstants.NODESET);

			for (int c = 0; c < nl.getLength(); c++) {
				Node currentItem = nl.item(c);
				// Node parent = currentItem.getParentNode();
				if (currentItem.getAttributes().getNamedItem("key").getNodeValue().equalsIgnoreCase("ATL File Name")) {
					// String key = currentItem.getAttributes().getNamedItem("key").getNodeValue();
					String value = currentItem.getAttributes().getNamedItem("value").getNodeValue();
					result = value;
					// System.out.println(key +" - "+value);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}