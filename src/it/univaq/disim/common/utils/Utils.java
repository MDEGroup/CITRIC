package it.univaq.disim.common.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.SecureRandom;
import java.text.Collator;
import java.text.DecimalFormat;
import java.util.Arrays;

import org.apache.commons.io.FilenameUtils;

public class Utils {
	
	private static final String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	private static SecureRandom rnd = new SecureRandom();
	
	public static void main(String[] args) {
		System.out.println(Utils.generateRandomString(5));
		
		
		System.out.println(getNameFromPathWithoutExtension("resources/mutation_test/MM_A_mutated.ecore"));
		System.out.println(getPathExtension("resources/mutation_test/MM_A_mutated.ecore"));
		System.out.println(getRelativePathRoot("resources/mutation_test/MM_A_mutated.ecore"));
	}
	
	
	
	public static String getNameFromPathWithoutExtension(String path){
		Path p = Paths.get(path);
		return FilenameUtils.removeExtension(p.getFileName().toString());
	}
	
	public static String getPathExtension(String path){
//		Path p = Paths.get(path);
		return FilenameUtils.getExtension(path);
	}

	public static String getRelativePathRoot(String path){
		StringBuilder sb = new StringBuilder();
		String[] list = path.split(File.separator);
		if(list.length>1) {
			for(int i=0; i<list.length-1;i++) {
				sb.append(list[i]);
				sb.append(File.separator);
			}
		}
		
		return sb.toString();
	}
	
	public static String stringSort(String stringToSort, String split){
		Collator collator = Collator.getInstance();
	    String[] splitted = stringToSort.split(split);
	    Arrays.sort(splitted, collator);
	    String sorted = "";
	    for (int i = 0; i < splitted.length; i++){
	    	if(i < splitted.length-1){
	    		sorted += splitted[i]+", ";
	    	}else{
	    		sorted += splitted[i];
	    	}
	    }
	    return sorted;
	}
	
	public static void copyFiles(String sourcePath, String destPath) throws IOException {
		File source = new File(sourcePath);
		File dest = new File(destPath);
		
	    FileChannel inputChannel = null;
	    FileChannel outputChannel = null;
	    try {
	        inputChannel = new FileInputStream(source).getChannel();
	        outputChannel = new FileOutputStream(dest).getChannel();
	        outputChannel.transferFrom(inputChannel, 0, inputChannel.size());
	    } finally {
	        inputChannel.close();
	        outputChannel.close();
	    }
	}
	
	
	
	public static String generateRandomString(int len) {
		   StringBuilder sb = new StringBuilder( len );
		   for( int i = 0; i < len; i++ ) 
		      sb.append( AB.charAt( rnd.nextInt(AB.length()) ) );
		   return sb.toString();
	}



	public static String getNameFromPath(String path) {
//		Path p = Paths.get(path);
		return FilenameUtils.getName(path);
	}
	
	public static String roundFloatValues(float value, int decimals) {
		if(decimals < 0) {
			decimals = 0;
		}
		DecimalFormat df = new DecimalFormat();
		df.setMaximumFractionDigits(decimals);
		return df.format(value);
	}
	

}
