package it.univaq.disim.business.manager;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.m2m.atl.core.ATLCoreException;
import org.eclipse.m2m.atl.core.IReferenceModel;
import org.eclipse.m2m.atl.core.ModelFactory;
import org.eclipse.m2m.atl.core.emf.EMFModel;
import org.eclipse.m2m.atl.core.emf.EMFModelFactory;
import org.eclipse.m2m.atl.engine.parser.AtlParser;
import org.eclipse.ocl.ParserException;

import anatlyzer.atl.analyser.AnalysisResult;
import anatlyzer.atl.errors.Problem;
import anatlyzer.atl.errors.ProblemStatus;
import anatlyzer.atl.errors.atl_error.LocalProblem;
import anatlyzer.atl.model.ATLModel;
import anatlyzer.atl.model.ErrorModel;
import anatlyzer.atl.tests.api.AnalysisLoader;
import anatlyzer.atl.util.ATLUtils;
import anatlyzer.atl.util.ATLUtils.ModelInfo;
import anatlyzer.atl.util.AnalyserUtils;
import anatlyzer.atlext.ATL.Binding;
import anatlyzer.atlext.ATL.InPatternElement;
import anatlyzer.atlext.ATL.LazyRule;
import anatlyzer.atlext.ATL.MatchedRule;
import anatlyzer.atlext.ATL.OutPatternElement;
import anatlyzer.atlext.ATL.Rule;
import anatlyzer.atlext.ATL.SimpleInPatternElement;
import anatlyzer.atlext.ATL.SimpleOutPatternElement;
import anatlyzer.atlext.OCL.NavigationOrAttributeCallExp;
import anatlyzer.atlext.OCL.impl.IteratorExpImpl;
import anatlyzer.atlext.OCL.impl.NavigationOrAttributeCallExpImpl;
import anatlyzer.atlext.OCL.impl.OperationCallExpImpl;
import anatlyzer.atlext.OCL.impl.VariableExpImpl;
import it.univaq.disim.business.datamodel.ATLBinding;
import it.univaq.disim.business.datamodel.RuleBinding;

public class ATLTransformationManager {
	
	ATLModel atlModel = new ATLModel();
	
	public ATLTransformationManager(String atlTransformationPath) {
		this.atlModel = loadATLTransformation(atlTransformationPath);
	}
	
	
	public ATLModel loadATLTransformation(String atlTransformation) {
		AtlParser atlParser = new AtlParser();
		ModelFactory modelFactory = new EMFModelFactory();
		Resource originalTransformation = null;
		IReferenceModel atlMetamodel = null;
		try {
			atlMetamodel = modelFactory.getBuiltInResource("ATL.ecore");
			EMFModel atlDynModel = (EMFModel) modelFactory.newModel(atlMetamodel);
			atlParser.inject(atlDynModel, atlTransformation);
			originalTransformation = atlDynModel.getResource();
		} catch (ATLCoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ATLModel atlModel = new ATLModel(originalTransformation, originalTransformation.getURI().toFileString(), true);
		return atlModel;
	}

	public List<MatchedRule> getAllMatchedRules() {
		return this.atlModel.allObjectsOf(MatchedRule.class);
	}
	
//	public static List<MatchedRule> getAllMatchedRules(ATLModel atlModel) {
//		List<MatchedRule> callableMethods = new ArrayList<MatchedRule>();
//		
//		// System.out.println("EXTRACTING CALLABLE ELEMENTS FROM A ATL MODEL");
//		// DEFINE OCL AND HELPER
//		OCL<?, EClassifier, ?, ?, ?, EParameter, ?, ?, ?, Constraint, EClass, EObject> ocl;
//		OCLHelper<EClassifier, ?, ?, Constraint> helper;
//		
//		// INSTANCIATE OCL
//		ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
//		// INSTANCIATE NEW HELPER FROM OCLEXPRESSION
//		helper = ocl.createOCLHelper();
//		// SET HELPER CONTEXT
//		helper.setContext(ATLPackage.eINSTANCE.getModule());
//		
//		// CREATE OCLEXPRESSION
//		OCLExpression<EClassifier> expression = null;
//		try {
//			expression = helper.createQuery("MatchedRule.allInstances()");
////			OCLExpression<EClassifier> expression = helper.createQuery("MatchedRule.allInstances()->collect(e | e.name)");
//			// CREATE QUERY FROM OCLEXPRESSION
//			Query<EClassifier, EClass, EObject> query = ocl.createQuery(expression);
//			
//			// EVALUATE OCL
//			HashSet<Object> success = (HashSet<Object>) query.evaluate(atlModel.getRoot());
//			
//			for (Object object : success) {
//				callableMethods.add((MatchedRule) object);
//			}
//		} catch (ParserException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return callableMethods;
//	}
	

	public String getInputMetaclassNameFromMatchedRule(MatchedRule mr) {
		String result = null;
		EList<InPatternElement> elements = mr.getInPattern().getElements();
		for (InPatternElement inPatternElement : elements) {
			if(inPatternElement instanceof SimpleInPatternElement) {
				SimpleInPatternElement simpleInPatternElement = (SimpleInPatternElement) inPatternElement;
				result = simpleInPatternElement.getType().getName();
			}
		}
		return result;
	}
	
	public String getInputMetaclassNameFromLazyRule(LazyRule mr) {
		String result = null;
		EList<InPatternElement> elements = mr.getInPattern().getElements();
		for (InPatternElement inPatternElement : elements) {
			if(inPatternElement instanceof SimpleInPatternElement) {
				SimpleInPatternElement simpleInPatternElement = (SimpleInPatternElement) inPatternElement;
				result = simpleInPatternElement.getType().getName();
			}
		}
		return result;
	}
	
	public String getOutputMetaclassNameFromRule(Rule mr) {
		String result = null;
		EList<OutPatternElement> elements = mr.getOutPattern().getElements();
		for (OutPatternElement outPatternElement : elements) {
			if(outPatternElement instanceof SimpleOutPatternElement) {
				SimpleOutPatternElement simpleOutPatternElement = (SimpleOutPatternElement) outPatternElement;
				result = simpleOutPatternElement.getType().getName();
			}
		}
		return result;
	}
	
	
	
	public List<ATLBinding> getAllBindings(){
		List<ATLBinding> atlBindings = new ArrayList<ATLBinding>();
		
		List<MatchedRule> rules = getAllMatchedRules();
		for (MatchedRule rule : rules) {
			ATLBinding atlBinding = new ATLBinding();
			atlBinding.setRuleName(rule.getName());
			atlBinding.setRuleType(rule.getClass().getName());
			atlBinding.setInputMetaclassName(getInputMetaclassNameFromMatchedRule(rule));
			atlBinding.setOutputMetaclassName(getOutputMetaclassNameFromRule(rule));
			atlBinding.setBindings(getRuleBindings(rule));
			atlBindings.add(atlBinding);
		}
		
		return atlBindings;
	}
	
	
	public List<RuleBinding> getRuleBindings(Rule rule){
		List<RuleBinding> result = new ArrayList<RuleBinding>();
		EList<OutPatternElement> elements = rule.getOutPattern().getElements();
		for (OutPatternElement outPatternElement : elements) {
				EList<Binding> bb = outPatternElement.getBindings();
				for (Binding binding : bb) {
					RuleBinding ruleBinding = new RuleBinding();
//					System.out.println(binding.getValue());
//					System.out.println(binding.getPropertyName());
					if(binding.getValue() instanceof NavigationOrAttributeCallExp) {
						NavigationOrAttributeCallExp fromBindingSide = (NavigationOrAttributeCallExp) binding.getValue();
						ruleBinding.setOutput(binding.getPropertyName());
						ruleBinding.setInput(fromBindingSide.getName());
//						System.out.println("\t["+fromBindingSide+"]"+binding.getPropertyName() +" = "+ fromBindingSide.getName());
					} else if(binding.getValue() instanceof NavigationOrAttributeCallExpImpl) {
						NavigationOrAttributeCallExpImpl fromBindingSide = (NavigationOrAttributeCallExpImpl) binding.getValue();
						ruleBinding.setOutput(binding.getPropertyName());
						ruleBinding.setInput(fromBindingSide.getName());
//						System.out.println("\t["+fromBindingSide+"]"+binding.getPropertyName()+" = "+ fromBindingSide.getName());
					} else if(binding.getValue() instanceof IteratorExpImpl) {
						IteratorExpImpl it = (IteratorExpImpl) binding.getValue();
						if(it.getSource() instanceof NavigationOrAttributeCallExp) {
							NavigationOrAttributeCallExp fromBindingSide = (NavigationOrAttributeCallExp) it.getSource();
							ruleBinding.setOutput(binding.getPropertyName());
							ruleBinding.setInput(fromBindingSide.getName());
						}else {
							ruleBinding.setOutput(binding.getPropertyName());
						}
					}
//					else if(binding.getValue() instanceof OperationCallExpImpl) {
//						OperationCallExpImpl op = (OperationCallExpImpl) binding.getValue();
//						
//						if(op.getSource() instanceof VariableExpImpl) {
//							VariableExpImpl var = (VariableExpImpl) op.getSource();
//							System.out.println("@#@#"+var.getAppliedProperty());
//						}
////						NavigationOrAttributeCallExp fromBindingSide = (NavigationOrAttributeCallExp) op.getSource();
////						ruleBinding.setOutput(binding.getPropertyName());
////						ruleBinding.setInput(fromBindingSide.getName());
					 else {
//						System.out.println(binding.getValue());
						ruleBinding.setOutput(binding.getPropertyName());
					} 
//						else if(binding.getValue() instanceof CollectionOperationCallExpImpl) {
//						CollectionOperationCallExpImpl fromBindingSide = (CollectionOperationCallExpImpl) binding.getValue();
//						System.out.println("\t["+fromBindingSide.getClass().getName()+"]"+binding.getPropertyName()+" = "+ fromBindingSide.getArguments().get(0));
//					}
					result.add(ruleBinding);
				}
		}
		return result;
	}
	
	
	
	
	public boolean isValidTransformation() {
		boolean result = true;
		ErrorModel errors = getATLErrors();
		if(errors.getProblems().size() > 0) {
			result = false;
		}
		return result;
	}
	
	public ErrorModel getATLErrors() {
		return atlModel.getErrors();
	}
	
	
	public String getInTag() {
		List<ModelInfo> info = ATLUtils.getModelInfo(this.atlModel);
		String result = null;
		int count = 0;
		for (ModelInfo modelInfo : info) {
			if(count == 0) {
				result = modelInfo.getMetamodelName();
			}
			count++;
		}
		return result;
	}
	
	public String getOutTag() {
		
		List<ModelInfo> info = ATLUtils.getModelInfo(this.atlModel);
		String result = null;
		int count = 0;
		for (ModelInfo modelInfo : info) {
			if(count == 1) {
				result = modelInfo.getMetamodelName();
			}
			count++;
		}
		return result;
	}
	
	public void anATLyzerTest() {
		List<ModelInfo> info = ATLUtils.getModelInfo(this.atlModel);
		// Resource[] resources = new Resource[info.size()];
		String[] files = new String[info.size()];
		String[] names = new String[info.size()];
		
		int i = 0;
		for (ModelInfo modelInfo : info) {
			names[i] = modelInfo.getMetamodelName();
			files[i] = modelInfo.getURIorPath();
			i++;
			System.out.println("@#@"+modelInfo.getModelName());
			System.out.println(modelInfo.getMetamodelName());
			System.out.println(modelInfo.getURIorPath());
			System.out.println(modelInfo.isInput());
			System.out.println(modelInfo.isOutput());
		}
		// submit...
		/*
		Resource r1 = null; // get r1 from mdeforge 
		Resource r2 = null; // get r2 from mdeforge 
		*/
		AnalysisLoader loader = AnalysisLoader.fromATLModel(atlModel, files, names);
		AnalysisResult result = loader.analyse();
		
		for (Problem problem : result.getProblems()) {
			if ( problem instanceof LocalProblem ) {
				LocalProblem lp = (LocalProblem) problem;
			
				
				System.out.println( lp.getElement() );				
			}
			
			if ( problem.getStatus() == ProblemStatus.WITNESS_REQUIRED ) {
				// launch constraint solver
				
			}
			
			
			System.out.println( AnalyserUtils.getProblemId(problem) );
			System.out.println( AnalyserUtils.getProblemDescription(problem) );
		}
	}
	
	
	
	
	public static void main(String[] args) throws ATLCoreException, ParserException {
//		String transformationPath = "resources/test/Company2CMS.atl";
		String transformationPath = "resources/running_example/transformations/KM32EMF.atl";
		ATLTransformationManager atlManager = new ATLTransformationManager(transformationPath);
		for (MatchedRule string : atlManager.getAllMatchedRules()) {
			System.out.println(string);
		}
		
		
		
//		List<ATLBinding> atlBindings = ATLTransformationManager.getAllBindings(transformationPath);
//		for (ATLBinding atlBinding : atlBindings) {
//			System.out.println("MC: "+atlBinding.getMetaclassName());
//			for (String string : atlBinding.getBindings()) {
//				System.out.println("\t"+string);
//			}
//		}
		
	}
	
}
