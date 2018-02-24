package it.univaq.disim.business.calculations;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import org.eclipse.emf.common.util.EList;
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

import anatlyzer.atl.model.ATLModel;
import anatlyzer.atlext.ATL.ATLPackage;
import anatlyzer.atlext.ATL.Binding;
import anatlyzer.atlext.ATL.CalledRule;
import anatlyzer.atlext.ATL.MatchedRule;
import anatlyzer.atlext.ATL.OutPatternElement;
import anatlyzer.atlext.OCL.impl.OperationCallExpImpl;

public class MetricCalculation{
	
	private static List<String> ATL_TRANSFORMATION_EXT = Arrays.asList(".atl");
	private static List<String> TRANSFORMATION_WITHOUT_GUARDS = new ArrayList<String>();
	
	private static List<String> TRANSFORMATIONS = new ArrayList<String>();
	protected static int COUNT_TRANSFORMATIONS_MATCHED_RULES = 0;
	protected static int COUNT_TRANSFORMATIONS_MATCHED_RULES_WITHOUT_GUARDS = 0;

	public static void main(String[] args) {
		String transformationModule = "resources/ATLZoo/";
		Path tPath = Paths.get(transformationModule);
		
		System.out.println("Calculating...");
		try {
			navigateFolder(tPath);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		System.out.println("Number of Transformations = "+TRANSFORMATIONS.size());
//		System.out.println("Number of Transformations Without Guards = "+TRANSFORMATION_WITHOUT_GUARDS.size());
//		System.out.println((TRANSFORMATION_WITHOUT_GUARDS.size()*100)/TRANSFORMATIONS.size() + "%");
//		System.out.println("-------------------");
//		System.out.println("Number of Transformations Matched Rules = "+COUNT_TRANSFORMATIONS_MATCHED_RULES);
//		System.out.println("Number of Transformations Matched Rules Without Guards = "+COUNT_TRANSFORMATIONS_MATCHED_RULES_WITHOUT_GUARDS);
//		System.out.println((COUNT_TRANSFORMATIONS_MATCHED_RULES_WITHOUT_GUARDS*100)/COUNT_TRANSFORMATIONS_MATCHED_RULES + "%");
		
//		for (String path : TRANSFORMATION_WITHOUT_GUARDS) {
//			System.out.println(path);
//		}
		
	}
	
	

	
	private static boolean checkIfTransformation(Path file) {
		boolean result = false;
		for (String ext : ATL_TRANSFORMATION_EXT) {
			if (file.toString().toLowerCase().endsWith(ext)) {
				result = true;
				TRANSFORMATIONS.add(file.toString());
			}
		}
		return result;
	}
	
	public static void navigateFolder(Path ATLZooPath) throws IOException{
		if (Files.isDirectory(ATLZooPath)) {
			Files.walkFileTree(ATLZooPath, new SimpleFileVisitor<Path>() {
				@Override
				public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
					if(checkIfTransformation(file)) {
						evaluateATLTransformation(file);
					}
					return FileVisitResult.CONTINUE;
				}
			});
		} else {
			if(checkIfTransformation(ATLZooPath)) {
				evaluateATLTransformation(ATLZooPath);
			}
		}
	}
	
	private static void evaluateATLTransformation(Path file) {
		AtlParser atlParser = new AtlParser();
		ModelFactory modelFactory = new EMFModelFactory();
		IReferenceModel atlMetamodel;
		try {
			atlMetamodel = modelFactory.getBuiltInResource("ATL.ecore");
			EMFModel atlDynModel = (EMFModel) modelFactory.newModel(atlMetamodel);
			atlParser.inject(atlDynModel, file.toString());
			Resource originalTrafo = atlDynModel.getResource();
			
			ATLModel atlModel = new ATLModel(originalTrafo, originalTrafo.getURI().toFileString(), true);
			// @@@@@@@ UNCOMMENT TO SERIALIZE TRANSFORMATION
			// serialize(atlModel.getRoot(), outputFolder + "PN2PNML.atl.ecore");
			if(calculateTRules(file) == 0) {
				TRANSFORMATION_WITHOUT_GUARDS.add(file.toString());
			}
			
//			getAllOCLOperationName(atlModel, file);
			if(checkifImperativeTransformation(atlModel) == 0) {
				System.out.println(file);
			}
//			HashMap<Object, OclType> callableElementsContextType = new HashMap<Object, OclType>();
		} catch (ATLCoreException | ParserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
//	private static void calculateOCLExpressions(Path file) {
//		
//		AtlParser atlParser = new AtlParser();
//		ModelFactory modelFactory = new EMFModelFactory();
//		IReferenceModel atlMetamodel;
//		try {
//			atlMetamodel = modelFactory.getBuiltInResource("ATL.ecore");
//			EMFModel atlDynModel = (EMFModel) modelFactory.newModel(atlMetamodel);
//			atlParser.inject(atlDynModel, file.toString());
//			Resource originalTrafo = atlDynModel.getResource();
//			
//			ATLModel atlModel = new ATLModel(originalTrafo, originalTrafo.getURI().toFileString(), true);
//			// @@@@@@@ UNCOMMENT TO SERIALIZE TRANSFORMATION
//			// serialize(atlModel.getRoot(), outputFolder + "PN2PNML.atl.ecore");
//			getAllOCLOperationName(atlModel, file);
////			HashMap<Object, OclType> callableElementsContextType = new HashMap<Object, OclType>();
//		} catch (ATLCoreException | ParserException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}

	
	private static int calculateTRules(Path file) {

		int callables = 0;
		AtlParser atlParser = new AtlParser();
		ModelFactory modelFactory = new EMFModelFactory();
		IReferenceModel atlMetamodel;
		try {
			atlMetamodel = modelFactory.getBuiltInResource("ATL.ecore");
			EMFModel atlDynModel = (EMFModel) modelFactory.newModel(atlMetamodel);
			atlParser.inject(atlDynModel, file.toString());
			Resource originalTrafo = atlDynModel.getResource();
			
			ATLModel atlModel = new ATLModel(originalTrafo, originalTrafo.getURI().toFileString(), true);
			// @@@@@@@ UNCOMMENT TO SERIALIZE TRANSFORMATION
			// serialize(atlModel.getRoot(), outputFolder + "PN2PNML.atl.ecore");
			callables = countHowManyRulesInTransformatioHaveGuards(atlModel);
			
//			HashMap<Object, OclType> callableElementsContextType = new HashMap<Object, OclType>();
		} catch (ATLCoreException | ParserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		return callables;
	}
	
	public static int checkifImperativeTransformation(ATLModel atlModel) throws ParserException {
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
		OCLExpression<EClassifier> expression = helper.createQuery("CalledRule.allInstances()");
		// CREATE QUERY FROM OCLEXPRESSION
		Query<EClassifier, EClass, EObject> query = ocl.createQuery(expression);
		int count = 0;
		// EVALUATE OCL
		HashSet<Object> success = (HashSet<Object>) query.evaluate(atlModel.getRoot());
		for (Object object : success) {
			if (object instanceof CalledRule) {
				CalledRule cR = (CalledRule) object;
				count++;
//				System.out.println("\t"+cR.getName());
			}
		}
		return count;
	}

	private static int countHowManyRulesInTransformatioHaveGuards(ATLModel atlModel) throws ParserException {
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
		OCLExpression<EClassifier> expression = helper.createQuery("MatchedRule.allInstances()");
//		OCLExpression<EClassifier> expression = helper.createQuery("MatchedRule.allInstances()->collect(i | i.inPattern.elements->select(j | j.type.oclIsTypeOf(ATL!OclModelElement))->collect(k | k.type.name))->size()");
		// CREATE QUERY FROM OCLEXPRESSION
		Query<EClassifier, EClass, EObject> query = ocl.createQuery(expression);
		int count = 0;
		// EVALUATE OCL
		HashSet<Object> success = (HashSet<Object>) query.evaluate(atlModel.getRoot());
//		System.out.println(success);
		for (Object object : success) {
			if (object instanceof MatchedRule) {
				COUNT_TRANSFORMATIONS_MATCHED_RULES++;
				MatchedRule mR = (MatchedRule) object;
				if(mR.getOutPattern() != null) {
					for(OutPatternElement kk : mR.getOutPattern().getElements()) {
						EList<Binding> bb;
						bb= kk.getBindings();
						if(bb.size() > 0) {
							count++;
						}else {
							COUNT_TRANSFORMATIONS_MATCHED_RULES_WITHOUT_GUARDS++;
						}
					}
				}
			} 
		}
		// System.out.println("EXTRACTED CALLABLE ELEMENTS FROM A ATL MODEL");
		return count;
	}
	
	
//	private static void getAllMatchedRules(ATLModel atlModel) throws ParserException {
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
//		OCLExpression<EClassifier> expression = helper.createQuery("MatchedRule.allInstances()");
//		// CREATE QUERY FROM OCLEXPRESSION
//		Query<EClassifier, EClass, EObject> query = ocl.createQuery(expression);
//
//		// EVALUATE OCL
//		HashSet<Object> success = (HashSet<Object>) query.evaluate(atlModel.getRoot());
//		
//		for (Object object : success) {
//			if (object instanceof MatchedRule) {
//				MatchedRule mR = (MatchedRule) object;
//				ALL_MATCHED_RULES.add(mR);
//			} 
//		}
//		// System.out.println("EXTRACTED CALLABLE ELEMENTS FROM A ATL MODEL");
//	}
	
	
	public static void getAllOCLOperationName(ATLModel atlModel, Path filePath) throws ParserException {
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
				OCLExpression<EClassifier> expression = helper.createQuery("MatchedRule.allInstances()");
				// CREATE QUERY FROM OCLEXPRESSION
				Query<EClassifier, EClass, EObject> query = ocl.createQuery(expression);

				// EVALUATE OCL
				HashSet<Object> success = (HashSet<Object>) query.evaluate(atlModel.getRoot());
		
				for (Object object : success) {
					if (object instanceof MatchedRule) {
						MatchedRule mR = (MatchedRule) object;
//						System.out.println("\t"+mR.getName());
							if(mR.getInPattern() != null && mR.getInPattern().getFilter() != null) {
								if(mR.getInPattern().getFilter() instanceof OperationCallExpImpl) {
									OperationCallExpImpl opCallExp = (OperationCallExpImpl) mR.getInPattern().getFilter();
									System.out.println(filePath.getFileName()+";"+mR.getName()+";"+opCallExp.getOperationName());
								}else {
									System.out.println(filePath.getFileName()+";"+mR.getName()+";null");
//									System.out.println(mR.getInPattern().getFilter());
								}
//								OCLExpression oclExp = (OCLExpression) mR.getInPattern().getFilter();
//								System.out.println(oclExp.getType());
//								for(OutPatternElement kk : matchedRule.getOutPattern().getElements()) {
//									EList<Binding> bb = kk.getBindings();
//									for (Binding binding : bb) {
////										System.out.println("\t"+binding.getValue().eClass().getName());
//									}
//								}
					} 
				}
		
		
		}
	}
	
	
}
