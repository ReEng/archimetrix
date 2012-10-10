package de.mdelab.sdm.interpreter.ocl;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.ecore.OCL.Helper;
import org.eclipse.ocl.ecore.OCLExpression;
import org.eclipse.ocl.types.OCLStandardLibrary;

import de.mdelab.sdm.interpreter.common.SDMInterpreterConstants;
import de.mdelab.sdm.interpreter.common.SDMInterpreterException;
import de.mdelab.sdm.interpreter.common.adapters.expressions.IExpressionAdapter;
import de.mdelab.sdm.interpreter.common.adapters.expressions.IStringExpressionAdapter;
import de.mdelab.sdm.interpreter.common.adapters.m3.IClassifierAdapter;
import de.mdelab.sdm.interpreter.common.adapters.m3.IInstanceAdapter;
import de.mdelab.sdm.interpreter.common.adapters.m3.IM3AdapterFactory;
import de.mdelab.sdm.interpreter.common.expressions.IExpressionInterpreter;
import de.mdelab.sdm.interpreter.common.variables.Variable;
import de.mdelab.sdm.interpreter.common.variables.VariableScope;
import de.mdelab.sdm.interpreter.ocl.environment.CustomOCLEnvironmentFactory;

/**
 * An interpreter for OCL expressions.
 * 
 * @author Stephan Hildebrandt
 */
public class OCLExpressionInterpreter implements IExpressionInterpreter
{
	private OCL							ocl;
	private Helper						helper;
	private CustomOCLEnvironmentFactory	customOCLEnvironmentFactory;

	public OCLExpressionInterpreter()
	{
		customOCLEnvironmentFactory = new CustomOCLEnvironmentFactory();
		ocl = OCL.newInstance(customOCLEnvironmentFactory);
		helper = ocl.createOCLHelper();
	}

	@Override
	public Variable evaluate(IExpressionAdapter expressionAdapter, VariableScope variableScope,
			IClassifierAdapter contextClassifierAdapter, IInstanceAdapter contextInstanceAdapter) throws SDMInterpreterException
	{
		assert expressionAdapter instanceof IStringExpressionAdapter;
		assert contextClassifierAdapter == null || contextClassifierAdapter.getClassifier() instanceof EClassifier;

		customOCLEnvironmentFactory.setVariableScope(variableScope);

		IStringExpressionAdapter stringExpressionAdapter = (IStringExpressionAdapter) expressionAdapter;

		EClassifier contextClassifier = null;

		if (contextClassifierAdapter != null)
		{
			contextClassifier = (EClassifier) contextClassifierAdapter.getClassifier();
		}

		Object contextInstance = null;

		if (contextInstanceAdapter != null)
		{
			contextInstance = contextInstanceAdapter.getValue();
		}

		OCLExpression oclExpression = null;

		if (stringExpressionAdapter.getAST() == null)
		{
			/*
			 * Create the abstract syntax by parsing the string
			 */
			try
			{
				oclExpression = parseExpression(stringExpressionAdapter.getExpressionString(), contextClassifier);
			}
			catch (ParserException e)
			{
				throw new SDMInterpreterException("Could not parse OCL expression '" + stringExpressionAdapter.getExpressionString()
						+ "': " + e.getMessage(), e);
			}

			stringExpressionAdapter.setAST(oclExpression);
		}
		else
		{
			/*
			 * Reuse the abstract syntax tree of the adapter
			 */
			assert stringExpressionAdapter.getAST() instanceof OCLExpression;

			oclExpression = (OCLExpression) stringExpressionAdapter.getAST();
		}

		Object result = ocl.evaluate(contextInstance, oclExpression);

		/*
		 * Here it would be nicer to just compare with the EClass instance of
		 * OclInvalid_Class
		 */
		if (ocl.isInvalid(result))
		{
			throw new SDMInterpreterException("The OCL expression '" + stringExpressionAdapter.getExpressionString()
					+ "' was evaluated to an invalid result.");
		}

		IM3AdapterFactory m3AdaFactory = variableScope.getInterpreterManager().getMainAdapterFactory().getM3AdapterFactory();

		IClassifierAdapter classifierAdapter = m3AdaFactory.getClassifierAdapter(getEcoreStandardType(oclExpression.getType(), ocl));

		return new Variable(SDMInterpreterConstants.INTERNAL_VAR_NAME, classifierAdapter, m3AdaFactory.getInstanceAdapter(result,
				classifierAdapter));
	}

	/**
	 * Return the Ecore type that corresponds to the OCL type.
	 * 
	 * @param oclType
	 * @param ocl
	 * @return
	 */
	protected EClassifier getEcoreStandardType(EClassifier oclType, OCL ocl)
	{
		/*
		 * TODO: Extend this list.
		 */
		OCLStandardLibrary<EClassifier> oclStandardLibrary = ocl.getEnvironment().getOCLStandardLibrary();

		if (oclType == oclStandardLibrary.getBoolean())
		{
			return EcorePackage.Literals.EBOOLEAN;
		}
		else if (oclType == oclStandardLibrary.getInteger())
		{
			return EcorePackage.Literals.EINT;
		}
		else if (oclType == oclStandardLibrary.getReal())
		{
			return EcorePackage.Literals.EDOUBLE;
		}
		else if (oclType == oclStandardLibrary.getString())
		{
			return EcorePackage.Literals.ESTRING;
		}
		else if (oclType == oclStandardLibrary.getUnlimitedNatural())
		{
			return EcorePackage.Literals.ELONG;
		}
		else
		{
			return oclType;
		}

	}

	/**
	 * Parse an OCL expression string.
	 * 
	 * @param expressionString
	 *            The OCL expression string.
	 * @param contextClassifier
	 *            The context classifier or null if there is no context.
	 * @return The expression's AST.
	 * @throws ParserException
	 */
	private OCLExpression parseExpression(String expressionString, EClassifier contextClassifier) throws ParserException
	{
		if (contextClassifier == null)
		{
			/*
			 * TODO: This is more of a hack. Actually, the context should be
			 * null if the constraint is to be evaluated without a context. But
			 * createQuery throws a NullPointerException in this case.
			 * Therefore, the context is set to EObject.
			 */
			contextClassifier = EcorePackage.Literals.EOBJECT;
		}

		helper.setContext(contextClassifier);

		return helper.createQuery(expressionString);
	}

}
