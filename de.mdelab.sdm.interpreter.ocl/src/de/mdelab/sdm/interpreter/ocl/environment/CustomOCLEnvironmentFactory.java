package de.mdelab.sdm.interpreter.ocl.environment;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.ocl.Environment;
import org.eclipse.ocl.EvaluationEnvironment;
import org.eclipse.ocl.ecore.CallOperationAction;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.ecore.SendSignalAction;

import de.mdelab.sdm.interpreter.common.variables.VariableScope;

/**
 * A customized OCL environment factory. It produces OCL environments and
 * evaluation environments that do not store variables locally but retrieve them
 * from a variables manager.
 * 
 * @author Stephan Hildebrandt
 * 
 */
public class CustomOCLEnvironmentFactory extends EcoreEnvironmentFactory
{
	private CustomOCLEnvironment			customOCLEnvironment;
	private CustomOCLEvaluationEnvironment	customOCLEvaluationEnvironment;

	public CustomOCLEnvironmentFactory()
	{
		customOCLEnvironment = new CustomOCLEnvironment();
		customOCLEvaluationEnvironment = new CustomOCLEvaluationEnvironment();
	}

	public void setVariableScope(VariableScope variableScope)
	{
		customOCLEnvironment.setVariableScope(variableScope);
		customOCLEvaluationEnvironment.setVariableScope(variableScope);
	}

	@Override
	public Environment<EPackage, EClassifier, EOperation, EStructuralFeature, EEnumLiteral, EParameter, EObject, CallOperationAction, SendSignalAction, Constraint, EClass, EObject> createEnvironment()
	{
		return customOCLEnvironment;
	}

	@Override
	public EvaluationEnvironment<EClassifier, EOperation, EStructuralFeature, EClass, EObject> createEvaluationEnvironment()
	{
		return customOCLEvaluationEnvironment;
	}
}
