package it.univaq.disim.business.datamodel;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Transformation {
	
	private int id;
	private String name;
	private String ATLTransformation;
	private String inputModel;
	private String inputMetamodel;
	private String outputMetamodel;
	private String inTag;
	private String outTag;
	private String outPath;
	private float coverage;
	private float informationLoss;
	private float edgeWeight;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getATLTransformation() {
		return ATLTransformation;
	}
	public void setATLTransformation(String modules) {
		this.ATLTransformation = modules;
		this.name = getFileNameFromPath(modules);
	}
	public String getInputModel() {
		return inputModel;
	}
	public void setInputModel(String model_in) {
		this.inputModel = model_in;
	}
	public String getInputMetamodel() {
		return inputMetamodel;
	}
	public void setInputMetamodel(String metamodel_in) {
		this.inputMetamodel = metamodel_in;
	}
	public String getOutputMetamodel() {
		return outputMetamodel;
	}
	public void setOutputMetamodel(String metamodel_out) {
		this.outputMetamodel = metamodel_out;
	}
	public String getInTag() {
		return inTag;
	}
	public void setInTag(String inTag) {
		this.inTag = inTag;
	}
	public String getOutTag() {
		return outTag;
	}
	public void setOutTag(String outTag) {
		this.outTag = outTag;
	}
	public String getOutPath() {
		return outPath;
	}
	public void setOutPath(String outPath) {
		this.outPath = outPath;
	}
	public float getCoverage() {
		return coverage;
	}
	public void setCoverage(float coverage) {
		this.coverage = coverage;
	}
	public float getInformationLoss() {
		return informationLoss;
	}
	public void setInformationLoss(float informationLoss) {
		this.informationLoss = informationLoss;
		assert(this.informationLoss >= 1 && this.informationLoss <= 2);
		this.edgeWeight = (float) (Math.log(informationLoss) / Math.log(2));
		assert(this.edgeWeight >= 0);
	}
	public float getEdgeWeight() {
		return edgeWeight;
	}
	public void setEdgeWeight(float edgeWeight) {
		this.edgeWeight = edgeWeight;
	}
	
	
	private String getFileNameFromPath(String filePath){
		Path p = Paths.get(filePath);
		return p.getFileName().toString();
	}
	
	public boolean isComplete() {
		if(this.getInputMetamodel() != null && 
			this.getInputModel() != null && 
			this.getATLTransformation() != null && 
			this.getOutputMetamodel() != null) {
			return true;
		}else {
			return false;
		}
	}

}
