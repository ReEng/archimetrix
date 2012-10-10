package de.mdelab.sdm.interpreter.common.tasks;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ExecutorService;

import de.mdelab.sdm.interpreter.common.ExpressionInterpreter;
import de.mdelab.sdm.interpreter.common.SDMInterpreter;
import de.mdelab.sdm.interpreter.common.SDMInterpreterException;
import de.mdelab.sdm.interpreter.common.SDMVariable;
import de.mdelab.sdm.interpreter.common.expressions.adapters.ExpressionAdapter;
import de.mdelab.sdm.interpreter.common.m3.adapters.ClassifierAdapter;

/**
 * The variables manager stores a map of all available variables and expression
 * interpreters, and holds references to the SDM interpreter, its adapter
 * factory and class loader.
 * 
 * @author Stephan Hildebrandt
 * @author Sebastian Wätzoldt
 * 
 * 
 */
public class VariablesManager
{
	private SDMInterpreter						sdmInterpreter;

	private Map<String, SDMVariable>			variables;

	private Map<String, ExpressionInterpreter>	expressionInterpreters;

	private ClassLoader							classLoader;

	private ExecutorService						executorService;

	private TaskFactory							taskFactory;

	/**
	 * 
	 * @param sdmInterpreter
	 *            The SDM interpreter to which this variable manager belongs.
	 * @param adapterFactory
	 *            The SDM interpreter's adapter factory.
	 * @param classLoader
	 *            The SDM interpreter's class loader.
	 */
	protected VariablesManager(SDMInterpreter sdmInterpreter, TaskFactory taskFactory, ClassLoader classLoader,
			ExecutorService executorService)
	{
		assert sdmInterpreter != null;
		assert taskFactory != null;
		assert classLoader != null;
		assert executorService != null;

		this.sdmInterpreter = sdmInterpreter;

		this.variables = new HashMap<String, SDMVariable>();

		this.expressionInterpreters = new HashMap<String, ExpressionInterpreter>();

		this.classLoader = classLoader;

		this.executorService = executorService;

		this.taskFactory = taskFactory;
	}

	/**
	 * 
	 * @return A map of all available expression interpreters.
	 */
	public Map<String, ExpressionInterpreter> getExpressionInterpreters()
	{
		return expressionInterpreters;
	}

	/**
	 * 
	 * @return A map of all variables of the variables manager.
	 */
	public Map<String, SDMVariable> getVariables()
	{
		return variables;
	}

	/**
	 * 
	 * @return The SDM interpreter's class loader.
	 */
	public ClassLoader getClassLoader()
	{
		return classLoader;
	}

	public ExecutorService getThreadPoolExecutorService()
	{
		return executorService;
	}

	/**
	 * Evaluate an expression using the expression interpreter appropriate for
	 * the expression language.
	 * 
	 * @param expressionAdapter
	 *            An adapter of the expression to evaluate.
	 * @param contextClassifierAdapter
	 *            An adapter of the context classifier or null if there is no
	 *            context.
	 * @param contextInstance
	 *            An instance of the context or null if there is no context.
	 * @return A variable containing the type and value of the evaluation
	 *         result.
	 * @throws SDMInterpreterException
	 */
	public SDMVariable evaluateExpression(ExpressionAdapter expressionAdapter, ClassifierAdapter contextClassifierAdapter,
			Object contextInstance) throws SDMInterpreterException
	{
		assert contextInstance == null || contextClassifierAdapter != null;

		/*
		 * Get the expression language
		 */
		String expressionLanguage = expressionAdapter.getExpressionLanguage();

		assert expressionLanguage != null;
		assert !"".equals(expressionLanguage);

		/*
		 * Check if this variablesManager has already an expression interpreter
		 * for this language.
		 */
		ExpressionInterpreter expressionInterpreter = expressionInterpreters.get(expressionAdapter.getExpressionLanguage());

		if (expressionInterpreter == null)
		{
			/*
			 * There is no expression interpreter instantiated, yet. Do so now.
			 */
			expressionInterpreter = sdmInterpreter.createExpressionInterpreter(expressionAdapter.getExpressionLanguage(), this);

			if (expressionInterpreter == null)
			{
				/*
				 * There is no expression interpreter for this language.
				 */
				throw new SDMInterpreterException("There is no expression interpreter for expression language '"
						+ expressionAdapter.getExpressionLanguage() + "'.");
			}

			/*
			 * Add the new expression interpreter to variables manager's list.
			 */
			expressionInterpreters.put(expressionLanguage, expressionInterpreter);
		}

		/*
		 * Evaluate the expression and return the result
		 */
		return expressionInterpreter.evaluate(expressionAdapter, contextClassifierAdapter, contextInstance);
	}

	/**
	 * Create a new variable and add it to the variables manager's list of
	 * variables.
	 * 
	 * @param name
	 *            The name of the variable.
	 * @param classifierAdapter
	 *            An adapter of the classifier of the variable.
	 * @param value
	 *            The variable's value.
	 * @return The new variable.
	 */
	public SDMVariable createVariable(String name, ClassifierAdapter classifierAdapter, Object value)
	{
		assert name != null;
		assert !"".equals(name);
		assert classifierAdapter != null;

		SDMVariable sdmVariable = new SDMVariable(name, classifierAdapter, value);

		variables.put(name, sdmVariable);

		return sdmVariable;
	}

	/**
	 * Remove the variable with the specified name from the variables manager's
	 * list of variables.
	 * 
	 * @param name
	 *            Name of the variable to delete.
	 * @return The deleted variable or null if the variable does not exist.
	 */
	public SDMVariable deleteVariable(String name)
	{
		return variables.remove(name);
	}

	/**
	 * Get a variable from the variables manager's list of variables.
	 * 
	 * @param name
	 *            The name of the variable.
	 * @return The variable or null if it does not exist.
	 */
	public SDMVariable getVariable(String name)
	{
		return variables.get(name);
	}

	public void submitTask(Task<?, ?> task)
	{
		executorService.submit(task);
	}

	public void addException(Throwable exception)
	{
		sdmInterpreter.addException(exception);
	}

	public SDMInterpreter getSdmInterpreter()
	{
		return sdmInterpreter;
	}

	public VariablesManager createCopy()
	{
		VariablesManager newVariablesManager = taskFactory.createVariablesManager(sdmInterpreter, classLoader, executorService);

		newVariablesManager.variables = new HashMap<String, SDMVariable>(variables);

		return newVariablesManager;
	}

	public void merge(List<VariablesManager> variablesManagers)
	{
		Map<String, SDMVariable> changedVariables = new HashMap<String, SDMVariable>();

		/*
		 * Iterate through all variables of this variables manager and check
		 * whether it was changed in one of the provided variables managers.
		 */
		for (Entry<String, SDMVariable> entry : variables.entrySet())
		{
			for (VariablesManager variablesManager : variablesManagers)
			{
				SDMVariable changedVariable = variablesManager.getVariable(entry.getKey());

				if (changedVariable != null && changedVariable != entry.getValue())
				{
					changedVariables.put(entry.getKey(), changedVariable);
				}
			}
		}

		/*
		 * Put all changed variables into this variables manager's variables
		 * list
		 */
		variables.putAll(changedVariables);
	}
}
