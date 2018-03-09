package it.univaq.disim.test;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import it.univaq.disim.business.calculations.Coverage;
import it.univaq.disim.business.calculations.InformationLoss;
import it.univaq.disim.business.datamodel.Transformation;

public class NavigationTest {
	
	private static List<Map<String, Float>> calculatedCoverage = new ArrayList<Map<String, Float>>();
	
	static void navigateRootFolder(Path path) throws IOException {
		if (Files.isDirectory(path)) {
			Files.walkFileTree(path, new SimpleFileVisitor<Path>() {
				@Override
				public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
						if(checkIfTransformation(file)) {
							calculateTCoverage(file);
						}
					return FileVisitResult.CONTINUE;
				}
			});
		} else {
			if(checkIfTransformation(path)) {
				calculateTCoverage(path);
			}
		}
	}
	
	static void calculateTCoverage(Path file)  {
		String fileName = file.getFileName()+"";
		Map<String, Float> t = new HashMap<String, Float>();
		
		Transformation transformation = new Transformation();
		transformation.setATLTransformation(file.toString());
		transformation.setInputMetamodel("resources/ATLZoo/KM32EMF/Sample.ecore");
//		float coverage = Coverage.coverage(transformation);
		float informationLoss = InformationLoss.informationLoss(transformation);
//		System.out.println("@#@#@->"+coverage);
//		t.put(fileName, coverage);
		calculatedCoverage.add(t);
	}
	
	
	private static boolean checkIfTransformation(Path file) {
		boolean result = false;
		if (file.toString().toLowerCase().endsWith(".atl")) {
			result = true;
		}
		
		return result;
	}
	
	public static void visualizeCoverageList(List<Map<String, Float>> calculatedCoverage) {
		for (Map<String, Float> element : calculatedCoverage) {
			Set mapSet = (Set) element.entrySet();
			Iterator mapIterator = mapSet.iterator();
	        while (mapIterator.hasNext()) {
	                Map.Entry mapEntry = (Map.Entry) mapIterator.next();
	                // getKey Method of HashMap access a key of map
	                String keyValue = (String) mapEntry.getKey();
	                //getValue method returns corresponding key's value
	                Float value = (Float) mapEntry.getValue();
	                System.out.println(keyValue + " [" + value+"]");
	        }
		}
	}
	

	public static void main(String[] args) throws IOException {
		String ATLZooPath = "resources/ATLZoo";
		Path path = Paths.get(ATLZooPath);

		NavigationTest demo = new NavigationTest();
		navigateRootFolder(path);
//		visualizeCoverageList(calculatedCoverage);
//		

//		System.out.println(Coverage.coverage(ATLZoo.atlZoo.get(5)));
		
		
		
		
		
//		String basePath = "resources/chain/MySQL2KM3/";
//		String inputModel = basePath + "Models/euro2004-MySQL.xmi";
//		String MM_A = basePath + "Metamodels/MySQL.ecore";
//		String MM_B = basePath + "Metamodels/KM3.ecore";
//		String A2B = basePath + "Transfos/MySQL2KM3.atl";
//		String inputTag = "MySQL";
//		String outputTag = "KM3";
//		String outputModelPath = "resources/results/test.xmi";
//
//		
//		
//		Transformation t_A2B = new Transformation();
//		t_A2B.setModel_in(inputModel);
//		t_A2B.setMetamodel_in(MM_A);
//		t_A2B.setMetamodel_out(MM_B);
//		t_A2B.setModules(A2B);
//		t_A2B.setInTag(inputTag);
//		t_A2B.setOutTag(outputTag);
//		t_A2B.setOutPath(outputModelPath);
//		t_A2B.setCoverage(Coverage.coverage(t_A2B));
////		t_A2B.setInformationLoss(calculations.informationLoss(t_A2B));
//		
//		
//		System.out.println(t_A2B.getCoverage());

	}

}
