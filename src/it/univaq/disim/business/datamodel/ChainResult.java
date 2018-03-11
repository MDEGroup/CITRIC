package it.univaq.disim.business.datamodel;

public class ChainResult {

	private String model;
	private float informationLoss;
	private float weight;
	private long executionTime;
	
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
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
	public long getExecutionTime() {
		return executionTime;
	}
	public void setExecutionTime(long executionTime) {
		this.executionTime = executionTime;
	}
	
	
	
}
