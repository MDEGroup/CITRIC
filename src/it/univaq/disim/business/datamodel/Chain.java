package it.univaq.disim.business.datamodel;

import java.util.List;

public class Chain {
	
	private String name;
	private String inputMetamodel;
	private String outputMetamodel;
	private List<Transformation> transformations;
	private float coverage;
	private float informationLoss;
	private float weight;
	private String inputModel;
	private String resultModel;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Transformation> getTransformations() {
		return transformations;
	}
	public String getInputMetamodel() {
		return inputMetamodel;
	}
	public void setInputMetamodel(String inputMetamodel) {
		this.inputMetamodel = inputMetamodel;
	}
	public void setTransformations(List<Transformation> transformations) {
		this.transformations = transformations;
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
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public String getOutputMetamodel() {
		return outputMetamodel;
	}
	public void setOutputMetamodel(String outputMetamodel) {
		this.outputMetamodel = outputMetamodel;
	}
	public String getInputModel() {
		return inputModel;
	}
	public void setInputModel(String inputModel) {
		this.inputModel = inputModel;
	}
	public String getResultModel() {
		return resultModel;
	}
	public void setResultModel(String resultModel) {
		this.resultModel = resultModel;
	}
	

}
