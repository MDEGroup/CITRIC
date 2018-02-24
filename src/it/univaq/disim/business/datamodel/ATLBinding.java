package it.univaq.disim.business.datamodel;

import java.util.HashSet;
import java.util.List;

public class ATLBinding {
	private String ruleType;
	private String ruleName;
	private String inputMetaclassName;
	private String outputMetaclassName;
	private List<RuleBinding> bindings;
	
	
	
	public String getRuleType() {
		return ruleType;
	}
	public void setRuleType(String ruleType) {
		this.ruleType = ruleType;
	}
	public String getRuleName() {
		return ruleName;
	}
	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
	}
	public String getInputMetaclassName() {
		return inputMetaclassName;
	}
	public void setInputMetaclassName(String inputMetaclassName) {
		this.inputMetaclassName = inputMetaclassName;
	}
	
	public String getOutputMetaclassName() {
		return outputMetaclassName;
	}
	public void setOutputMetaclassName(String outputMetaclassName) {
		this.outputMetaclassName = outputMetaclassName;
	}
	public List<RuleBinding> getBindings() {
		return bindings;
	}
	public void setBindings(List<RuleBinding> bindings) {
		this.bindings = bindings;
	}
	
	public static <T> boolean listEqualsIgnoreOrder(List<T> list1, List<T> list2) {
	    return new HashSet<>(list1).equals(new HashSet<>(list2));
	}
}
