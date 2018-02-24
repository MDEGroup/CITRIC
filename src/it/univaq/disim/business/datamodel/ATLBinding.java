package it.univaq.disim.business.datamodel;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ATLBinding {
	private String ruleType;
	private String ruleName;
	private String metaclassName;
	private Set<String> bindings;
	
	
	
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
	public String getMetaclassName() {
		return metaclassName;
	}
	public void setMetaclassName(String metaclassName) {
		this.metaclassName = metaclassName;
	}
	public Set<String> getBindings() {
		return bindings;
	}
	public void setBindings(Set<String> bindings) {
		this.bindings = bindings;
	}
	
	public static <T> boolean listEqualsIgnoreOrder(List<T> list1, List<T> list2) {
	    return new HashSet<>(list1).equals(new HashSet<>(list2));
	}
}
