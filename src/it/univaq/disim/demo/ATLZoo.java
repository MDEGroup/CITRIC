package it.univaq.disim.demo;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.io.FilenameUtils;

import it.univaq.disim.business.datamodel.Transformation;
import it.univaq.disim.business.manager.ATLTransformationManager;
import it.univaq.disim.common.utils.ReadLaunchConfigurationFiles;

public class ATLZoo {
	
	public static List<Transformation> atlZoo = new ArrayList<Transformation>();
	public static List<String> atlZooTransformations = new ArrayList<String>();
	private static String basePath = "resources/ATLZoo";
	private static List<String> ATL_TRANSFORMATION_EXT = Arrays.asList(".atl");
	private static List<String> MM_EXT = Arrays.asList(".ecore");
//	private static String resultPath = "resources/results/";
	
	
	
	private static String getZooProjectRootFromATL(Path atlPath) {
		String[] tmp = atlPath.toString().split("/");
		String projectPath = "";
		if(tmp.length > 3) {
			 projectPath = tmp[2];
		}
		return basePath+"/"+projectPath;
	}
	
	public static void searchMetamodelsFromTransformation(Path ATLFile) {
//		String fileName = file.getFileName()+"";
//		String fileNameWithOutExt = FilenameUtils.removeExtension(fileName);
//		String[] splitted = fileNameWithOutExt.split("2");
//		if(splitted.length == 2) {
//			System.out.println("["+getZooProjectRoot(file)+"] "+file.getParent()+ "@#@#@# "+fileName +" -> "+ splitted[0] + " - "+ splitted[1]);
//		}
		
		Path projectPath = Paths.get(getZooProjectRootFromATL(ATLFile));
		try {
			constructATLZooMetamodels(projectPath, ATLFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		Transformation t = new Transformation();
//		t.setMetamodel_in(mm_in);
//		t.setMetamodel_out(mm_out);
//		t.setModules(atl_in);
//		t.setModel_in(model_in);
//		t.setOutPath(model_out);
//		t.setInTag(tag_in);
//		t.setOutTag(tag_out);
//		atlZoo.add(t);
		
	}
	
	static void constructATLZooBindings(Path ATLZooPath) throws IOException {
		if (Files.isDirectory(ATLZooPath)) {
			Files.walkFileTree(ATLZooPath, new SimpleFileVisitor<Path>() {
				@Override
				public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
					if(checkIfLaunchConfiguration(file)) {
						getTransformationFromLaunchConfiguration(file);
					}else if(checkIfTransformation(file)) {
						searchMetamodelsFromTransformation(file);
					}
					return FileVisitResult.CONTINUE;
				}
			});
		} else {
			if(checkIfLaunchConfiguration(ATLZooPath)) {
				getTransformationFromLaunchConfiguration(ATLZooPath);
			}else if(checkIfTransformation(ATLZooPath)) {
				searchMetamodelsFromTransformation(ATLZooPath);
			}
		}
	}
	
	public static void getTransformationFromLaunchConfiguration(Path launchConfigurationPath) {
		ReadLaunchConfigurationFiles r = new ReadLaunchConfigurationFiles(basePath, launchConfigurationPath.toString());
		atlZoo.add(r.getTransformationFromLaunchConfiguration());
	}
	
	private static void createBindingBetweenATLandInputMetamodel(Path metamodelPath, Path transformationPath) {
		String transformationFileName = transformationPath.getFileName()+"";
		String transformationFileNameWithOutExt = FilenameUtils.removeExtension(transformationFileName);
		String metamodelFileName = metamodelPath.getFileName()+"";
		String metamodelFileNameWithOutExt = FilenameUtils.removeExtension(metamodelFileName);
		String[] splittedTransformationName = transformationFileNameWithOutExt.split("2");
		if(splittedTransformationName[0].equalsIgnoreCase(metamodelFileNameWithOutExt)) {
			System.out.println("Binding: [MM] "+metamodelPath.toString()+" - [ATL] "+transformationPath.toString());
			Transformation t = new Transformation();
			t.setInputMetamodel(metamodelPath.toString());
			t.setATLTransformation(transformationPath.toString());
			atlZoo.add(t);
		}
	}
	
	static void constructATLZooMetamodels(Path projectPath, final Path transformationPath) throws IOException {
		if (Files.isDirectory(projectPath)) {
			Files.walkFileTree(projectPath, new SimpleFileVisitor<Path>() {
				@Override
				public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
						if(checkIfMetamodel(file)) {
//							aTLZooBindings(file);
							createBindingBetweenATLandInputMetamodel(file, transformationPath);
//							System.out.println(file);
						}
					return FileVisitResult.CONTINUE;
				}
			});
		} else {
			if(checkIfMetamodel(projectPath)) {
				System.out.println(projectPath);
			}
		}
	}
	
	private static boolean checkIfTransformation(Path file) {
		boolean result = false;
		for (String ext : ATL_TRANSFORMATION_EXT) {
			if (file.toString().toLowerCase().endsWith(ext)) {
				result = true;
			}
		}
		return result;
	}
	
	private static boolean checkIfMetamodel(Path file) {
		boolean result = false;
		for (String ext : MM_EXT) {
			if (file.toString().toLowerCase().endsWith(ext)) {
				result = true;
			}
		}
		return result;
	}

	
	private static boolean checkIfLaunchConfiguration(Path file) {
		boolean result = false;
		if (file.toString().toLowerCase().endsWith(".launch")) {
			result = true;
		}
		
		return result;
	}
	
	
	
	/**
	 * Test
	 * @throws IOException 
	 */
	public static void getOnlyATLTransformations(Path ATLZooPath) throws IOException {
		if (Files.isDirectory(ATLZooPath)) {
			Files.walkFileTree(ATLZooPath, new SimpleFileVisitor<Path>() {
				@Override
				public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
					if(checkIfTransformation(file)) {
						atlZooTransformations.add(file.toString());
					}
					return FileVisitResult.CONTINUE;
				}
			});
		} else {
			if(checkIfTransformation(ATLZooPath)) {
				searchMetamodelsFromTransformation(ATLZooPath);
			}
		}
	}
	
	
	
	
	public static void main(String[] args) {
		Path ATLZooPath = Paths.get(basePath+"/");
//		try {
//			constructATLZooBindings(ATLZooPath);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		System.out.println("-----------------------------");
//		System.out.println("STARTING COVERAGE CALCULATION");
//		System.out.println("-----------------------------");
//		
//		
//		for (Transformation t : atlZoo) {
//			System.out.println("["+Coverage.coverage(t)+"] "+t.getModules());
//		}
		
		try {
//			getOnlyATLTransformations(ATLZooPath);
			constructATLZooBindings(ATLZooPath);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println(atlZooTransformations.size());
		for (Transformation t : getTransformations()) {
			System.out.println(t.getInputMetamodel() +" - "+t.getATLTransformation()+ " - " +t.getOutputMetamodel() + " - "+ t.getInputModel());
		}
		
	}

	public static List<Transformation> getTransformations() {
		return atlZoo;
	}


}
