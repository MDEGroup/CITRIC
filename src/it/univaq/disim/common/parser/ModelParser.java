package it.univaq.disim.common.parser;



import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.common.util.URI;


public class ModelParser {
	
	
	
//	public boolean checkIsModel(String modelExampleFilePath) throws Exception{
//		
//		/*
//		 * Root node attributes
//		 * 
//		 * METAMODEL:
//		 * <xmi:XMI xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:ecore="http://www.eclipse.org/emf/2002/Ecore">
//		 * 
//		 * MODEL(with ecore extension):
//		 * <BibTeXFile xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns="BibTeX">
//		 */
//		
//		boolean result = false;
//		
//		String attributeName = getAttributeName(modelExampleFilePath);
//		
//		if(attributeName.equals(ecoreTagName)){
//			result = true;
//		}
//		
//		return result;
//	}
	
//	public boolean isValid(String filePath) {
//		
//			try {
//				EcoreFactory factory = EcoreFactory.eINSTANCE;
//				ResourceSet resourceSet = new ResourceSetImpl();
//				resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
//				File temp = new File(filePath);
//				Resource resource = resourceSet.createResource(URI.createFileURI(temp.getAbsolutePath()));
//				resource.load(null);
//				EcoreUtil.resolveAll(resourceSet);
//				EObject eo = (EObject) resource.getContents().get(0);
//				Diagnostic diagnostic = Diagnostician.INSTANCE.validate(eo);
//				if (diagnostic.getSeverity() == Diagnostic.ERROR){
//					System.out.println("FALSE");
//					return false;
//				}else{
//					System.out.println("TRUE");
//					return true;
//				}
//			} catch (Exception e) {
//				return false;
//			}
//	
//	}
	
	
	
	public boolean isMetamodel(String modelFilePath) throws Exception {
		
		/*
		 * Root node attributes
		 * 
		 * METAMODEL:
		 * <xmi:XMI xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:ecore="http://www.eclipse.org/emf/2002/Ecore">
		 * 
		 * MODEL(with ecore extension):
		 * <BibTeXFile xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns="BibTeX">
		 */
		
		boolean result = false;
		
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document document = db.parse(new File(modelFilePath));
        Node rootElement = document.getChildNodes().item(0); //Get Root Element
        Node ecoreAttribute = rootElement.getAttributes().getNamedItem("xmlns:ecore");
        
        if(ecoreAttribute != null){
        	result = true;
        }

        return result;
	}
	
	public String getAttributeName(String modelExampleFilePath) throws Exception {
		
		String attributeResult = null;
		
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document document = db.parse(new File(modelExampleFilePath));
//        NodeList nodeList = document.getElementsByTagName("BibTeXFile");
        Node rootElement = document.getChildNodes().item(0); //Get Root Element
        Node ecoreAttribute = rootElement.getAttributes().getNamedItem("xmlns");
        
     
        attributeResult = ecoreAttribute.getNodeValue();
        
//        for(int x=0,size= nodeList.getLength(); x<size; x++) {
//        	attributeResult = nodeList.item(x).getAttributes().getNamedItem("xmlns").getNodeValue();
////            System.out.println(nodeList.item(x).getAttributes().getNamedItem("xmlns").getNodeValue());
//        }
        
        return attributeResult;
	}
	
    public static void main(String[] args) throws Exception {
    	
//    	String exampleFilePath = "resources/examples/bibtex-example.ecore";
    		String exampleFilePath = "resources/ATLZoo/Book2Publication/Book/Book.ecore";
    	
        ModelParser mp = new ModelParser();
        
        boolean result = mp.isMetamodel(exampleFilePath);
        System.out.println(result);
    }
}
