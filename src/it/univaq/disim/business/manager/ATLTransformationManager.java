package it.univaq.disim.business.manager;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.m2m.atl.core.ATLCoreException;
import org.eclipse.m2m.atl.core.IReferenceModel;
import org.eclipse.m2m.atl.core.ModelFactory;
import org.eclipse.m2m.atl.core.emf.EMFModel;
import org.eclipse.m2m.atl.core.emf.EMFModelFactory;
import org.eclipse.m2m.atl.engine.parser.AtlParser;
import org.eclipse.ocl.OCL;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.expressions.OCLExpression;
import org.eclipse.ocl.helper.OCLHelper;

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
import anatlyzer.atlext.ATL.ATLPackage;
import anatlyzer.atlext.ATL.Binding;
import anatlyzer.atlext.ATL.InPatternElement;
import anatlyzer.atlext.ATL.LazyRule;
import anatlyzer.atlext.ATL.MatchedRule;
import anatlyzer.atlext.ATL.ModuleElement;
import anatlyzer.atlext.ATL.OutPatternElement;
import anatlyzer.atlext.ATL.Rule;
import anatlyzer.atlext.ATL.SimpleInPatternElement;
import anatlyzer.atlext.ATL.SimpleOutPatternElement;
import anatlyzer.atlext.OCL.NavigationOrAttributeCallExp;
import anatlyzer.atlext.OCL.OperationCallExp;
import anatlyzer.atlext.OCL.OperatorCallExp;
import anatlyzer.atlext.OCL.impl.NavigationOrAttributeCallExpImpl;
import it.univaq.disim.business.datamodel.ATLBinding;

public class ATLTransformationManager {

	public static List<MatchedRule> getAllTMatchedRules(ATLModel atlModel) {
		List<MatchedRule> callableMethods = new ArrayList<MatchedRule>();
		
		// System.out.println("EXTRACTING CALLABLE ELEMENTS FROM A ATL MODEL");
		// DEFINE OCL AND HELPER
		OCL<?, EClassifier, ?, ?, ?, EParameter, ?, ?, ?, Constraint, EClass, EObject> ocl;
		OCLHelper<EClassifier, ?, ?, Constraint> helper;
		
		// INSTANCIATE OCL
		ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
		// INSTANCIATE NEW HELPER FROM OCLEXPRESSION
		helper = ocl.createOCLHelper();
		// SET HELPER CONTEXT
		helper.setContext(ATLPackage.eINSTANCE.getModule());
		
		// CREATE OCLEXPRESSION
		OCLExpression<EClassifier> expression = null;
		try {
			expression = helper.createQuery("MatchedRule.allInstances()");
//			OCLExpression<EClassifier> expression = helper.createQuery("MatchedRule.allInstances()->collect(e | e.name)");
			// CREATE QUERY FROM OCLEXPRESSION
			Query<EClassifier, EClass, EObject> query = ocl.createQuery(expression);
			
			// EVALUATE OCL
			HashSet<Object> success = (HashSet<Object>) query.evaluate(atlModel.getRoot());
			
			for (Object object : success) {
				callableMethods.add((MatchedRule) object);
			}
		} catch (ParserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return callableMethods;
	}
	

	public static String getInputMetaclassNameFromMatchedRule(MatchedRule mr) {
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
	
	public static String getInputMetaclassNameFromLazyRule(LazyRule mr) {
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
	
	public static String getOutputMetaclassNameFromRule(Rule mr) {
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
	
	
//	public static List<ATLBinding> getAllOutputBindings(String transformationPath){
//		List<ATLBinding> atlBindings = new ArrayList<ATLBinding>();
//		ATLModel atlModel = ATLTransformationManager.loadATLTransformation(transformationPath);
//		for (MatchedRule rule : ATLTransformationManager.getAllTMatchedRules(atlModel)) {
//			ATLBinding atlBinding = new ATLBinding();
//			atlBinding.setRuleType(rule.getClass().getSimpleName());
//			atlBinding.setRuleName(rule.getName());
//			atlBinding.setMetaclassName(ATLTransformationManager.getOutputMetaclassNameFromRule(rule));
//			EList<Binding> bindings = simpleOutPatternElement.getBindings();
//			for (Binding binding : bindings) {
//				System.out.println("\t\t"+binding.getPropertyName());
//			}
//			atlBinding.setBindings(ATLTransformationManager.getAllOutputBindings(transformationPath));
//		}
//		return atlBindings;
//	}
	
	
	public static List<ATLBinding> getAllBindings(String transformationPath){
		List<ATLBinding> atlBindings = new ArrayList<ATLBinding>();
		
		AtlParser atlParser = new AtlParser();
		ModelFactory modelFactory = new EMFModelFactory();
		IReferenceModel atlMetamodel;
		try {
			atlMetamodel = modelFactory.getBuiltInResource("ATL.ecore");
			EMFModel atlDynModel = (EMFModel) modelFactory.newModel(atlMetamodel);
			atlParser.inject(atlDynModel, transformationPath);
			Resource originalTrafo = atlDynModel.getResource();
			ATLModel atlModel = new ATLModel(originalTrafo, originalTrafo.getURI().toFileString(), true);
			
			
			// DEFINE OCL AND HELPER
			OCL<?, EClassifier, ?, ?, ?, EParameter, ?, ?, ?, Constraint, EClass, EObject> ocl;
			OCLHelper<EClassifier, ?, ?, Constraint> helper;
			
			// INSTANCIATE OCL
			ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
			// INSTANCIATE NEW HELPER FROM OCLEXPRESSION
			helper = ocl.createOCLHelper();
			// SET HELPER CONTEXT
			helper.setContext(ATLPackage.eINSTANCE.getModule());
			
			// CREATE OCLEXPRESSION
			OCLExpression<EClassifier> expression = helper.createQuery("Rule.allInstances()");
			// CREATE QUERY FROM OCLEXPRESSION
			Query<EClassifier, EClass, EObject> query = ocl.createQuery(expression);
			
			// EVALUATE OCL
			HashSet<Object> success = (HashSet<Object>) query.evaluate(atlModel.getRoot());
			for (Object object : success) {
				Rule rule = (Rule) object;
				//Get only Matched and Lazy rules in which we have informations about FROM side
				if(rule instanceof MatchedRule || rule instanceof LazyRule) {
					
//					System.out.println(mR.getName());
					ATLBinding atlBinding = new ATLBinding();
					atlBinding.setRuleType(rule.getClass().getSimpleName());
					atlBinding.setRuleName(rule.getName());
					
					if(rule instanceof MatchedRule) {
						atlBinding.setMetaclassName(getInputMetaclassNameFromMatchedRule((MatchedRule) rule));
					}else if(rule instanceof LazyRule) {
						atlBinding.setMetaclassName(getInputMetaclassNameFromLazyRule((LazyRule) rule));
					}
					
//					System.out.println("["+rule.getClass().getSimpleName()+"] "+rule.getName());
					if(rule.getOutPattern() != null) {
						for(OutPatternElement kk : rule.getOutPattern().getElements()) {
							Set<String> atlRuleBindings = new HashSet<String>();
							EList<Binding> bb = kk.getBindings();
							for (Binding binding : bb) {
//								System.out.println(binding.getValue());
								if(binding.getValue() instanceof NavigationOrAttributeCallExp) {
									NavigationOrAttributeCallExp fromBindingSide = (NavigationOrAttributeCallExp) binding.getValue();
									atlRuleBindings.add(fromBindingSide.getName());
//									System.out.println("\t["+fromBindingSide.getClass().getName()+"]"+binding.getPropertyName() +" = "+ fromBindingSide.getName());
//								} else if(binding.getValue() instanceof CollectionOperationCallExpImpl) {
//									CollectionOperationCallExpImpl fromBindingSide = (CollectionOperationCallExpImpl) binding.getValue();
//									System.out.println("\t["+fromBindingSide.getClass().getName()+"]"+binding.getPropertyName()+" = "+ fromBindingSide.getArguments().get(0));
								} else if(binding.getValue() instanceof NavigationOrAttributeCallExpImpl) {
									NavigationOrAttributeCallExpImpl fromBindingSide = (NavigationOrAttributeCallExpImpl) binding.getValue();
									atlRuleBindings.add(fromBindingSide.getName());
//									System.out.println("\t["+fromBindingSide.getClass().getName()+"]"+binding.getPropertyName()+" = "+ fromBindingSide.getName());
								}
							}
							atlBinding.setBindings(atlRuleBindings);
							
						}
					}
					atlBindings.add(atlBinding);
				}
			}
		} catch (ATLCoreException | ParserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return atlBindings;
	}
	
//	private static void getAllBindingOperatorNames(Binding binding) {
//		System.out.println("\t" + "[" + binding.getValue().eClass() + "] " + binding.getValue().eClass().getName());
//		if (binding.getValue() instanceof OperatorCallExp) {
//			OperationCallExp op = (OperationCallExp) binding.getValue();
//			// System.out.println("\t\t"+op.getOperationName());
//		}
//
//		if (binding.getValue() instanceof NavigationOrAttributeCallExp) {
//			NavigationOrAttributeCallExp nav = (NavigationOrAttributeCallExp) binding.getValue();
//			// System.out.println(nav.getSource().getType());
//		}
//	}
	
	
	
	public static ATLModel loadATLTransformation(String atlTransformation) {
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
	
	public static boolean isValidTransformation(String atlTransformation) {
		boolean result = true;
		ErrorModel errors = ATLTransformationManager.getATLErrors(atlTransformation);
		if(errors.getProblems().size() > 0) {
			result = false;
		}
		return result;
	}
	
	public static ErrorModel getATLErrors(String atlTransformation) {
		ATLModel atlModel = ATLTransformationManager.loadATLTransformation(atlTransformation);
		return atlModel.getErrors();
	}
	
	
	public static String getInTag(String atlTransformation) {
		ATLModel atlModel = ATLTransformationManager.loadATLTransformation(atlTransformation);
		List<ModelInfo> info = ATLUtils.getModelInfo(atlModel);
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
	
	public static String getOutTag(String atlTransformation) {
		ATLModel atlModel = ATLTransformationManager.loadATLTransformation(atlTransformation);
		List<ModelInfo> info = ATLUtils.getModelInfo(atlModel);
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
	
	public static void anATLyzerTest(String atlTransformation) {
		ATLModel atlModel = ATLTransformationManager.loadATLTransformation(atlTransformation);
		List<ModelInfo> info = ATLUtils.getModelInfo(atlModel);
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
		
		ATLModel atlModel = ATLTransformationManager.loadATLTransformation(transformationPath);
		for (MatchedRule rule : ATLTransformationManager.getAllTMatchedRules(atlModel)) {
			System.out.println(rule.getName());
			System.out.println("\t"+ATLTransformationManager.getOutputMetaclassNameFromRule(rule));
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
