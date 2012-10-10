package de.mdelab.sdm.interpreter.common;

import de.mdelab.sdm.interpreter.common.expressions.adapters.ExpressionAdapter;
import de.mdelab.sdm.interpreter.common.m3.adapters.ClassifierAdapter;
import de.mdelab.sdm.interpreter.common.tasks.VariablesManager;

/**
 * Abstract superclass of all expression interpreters. An expression interpreter
 * evaluates expressions of an expression language. It always belongs to a
 * variables manager from which the expression interpreter gets the values of
 * variables uses in an expression.
 * 
 * @author Stephan Hildebrandt
 * @author Sebastian Wätzoldt
 * 
 * 
 */
public abstract class ExpressionInterpreter
{
	private VariablesManager	variablesManager;

	private SDMInterpreterAdapterFactory	mainAdapterFactory;

	/**
	 * 
	 * @return The variables manager to which this expression interpreter
	 *         belongs.
	 */
	public VariablesManager getVariablesManager()
	{
		return variablesManager;
	}

	/**
	 * Attaches this expression interpreter to a variables manager.
	 * 
	 * @param variablesManager
	 *            The adapter of the new variables manager.
	 */
	protected void setVariablesManager(VariablesManager variablesManager)
	{
		this.variablesManager = variablesManager;
	}

	/**
	 * 
	 * @return The adapter factory to use to create adapters.
	 */
	public SDMInterpreterAdapterFactory getMainAdapterFactory()
	{
		return mainAdapterFactory;
	}

	/**
	 * 
	 * @param adapterFactory
	 *            The adapter factory to use to create adapters.
	 */
	protected void setAdapterFactory(SDMInterpreterAdapterFactory mainAdapterFactory)
	{
		this.mainAdapterFactory = mainAdapterFactory;
	}

	/**
	 * Evaluate an expression.
	 * 
	 * @param expressionAdapter
	 *            The adapter of the expression to evaluate.
	 * @param contextClassifierAdapter
	 *            The adapter of the classifier of the context or null if there
	 *            is no context.
	 * @param contextInstance
	 *            A context instance or null if there is no context.
	 * @return A variable containing the value and the type of the result of the
	 *         expression.
	 * @throws SDMInterpreterException
	 *             if the expression could not be evaluated.
	 */
	public abstract SDMVariable evaluate(ExpressionAdapter expressionAdapter, ClassifierAdapter contextClassifierAdapter,
			Object contextInstance) throws SDMInterpreterException;

}
