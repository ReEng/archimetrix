package de.mdelab.sdm.interpreter.common.variables;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import de.mdelab.sdm.interpreter.common.InterpreterManager;
import de.mdelab.sdm.interpreter.common.adapters.m3.IClassifierAdapter;
import de.mdelab.sdm.interpreter.common.adapters.m3.IInstanceAdapter;

/**
 * @author Stephan Hildebrandt
 * @author Sebastian Wätzoldt
 */
public class VariableScope
{
	private InterpreterManager		interpreterManager;

	private Map<String, Variable>	variables;

	public VariableScope(InterpreterManager interpreterManager)
	{
		assert interpreterManager != null;

		this.interpreterManager = interpreterManager;

		this.variables = new HashMap<String, Variable>();
	}

	public Variable createVariable(String name, IClassifierAdapter classifierAdapter, IInstanceAdapter valueAdapter)
	{
		assert name != null;
		assert !"".equals(name);
		assert classifierAdapter != null;

		Variable variable = new Variable(name, classifierAdapter, valueAdapter);

		variables.put(name, variable);

		return variable;
	}

	public Variable getVariable(String name)
	{
		return variables.get(name);
	}

	public Variable deleteVariable(String name)
	{
		return variables.remove(name);
	}

	public Map<String, Variable> getVariables()
	{
		return variables;
	}

	public InterpreterManager getInterpreterManager()
	{
		return interpreterManager;
	}

	public VariableScope createCopy()
	{
		VariableScope variableScope = new VariableScope(interpreterManager);

		variableScope.variables = new HashMap<String, Variable>(variables);

		return variableScope;
	}

	/**
	 * TODO
	 * 
	 * @param variableScopes
	 */
	public void merge(List<VariableScope> variableScopes)
	{
		Map<String, Variable> changedVariables = new HashMap<String, Variable>();

		/*
		 * Iterate through all variables of this variables scope and check
		 * whether it was changed in one of the provided variables scopes.
		 */
		for (Entry<String, Variable> entry : variables.entrySet())
		{
			for (VariableScope variableScope : variableScopes)
			{
				Variable changedVariable = variableScope.getVariable(entry.getKey());

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

	/**
	 * TODO
	 * 
	 * @param variableScope
	 */
	public void merge(VariableScope variableScope)
	{
		List<VariableScope> singleItemList = new ArrayList<VariableScope>();
		singleItemList.add(variableScope);
		merge(singleItemList);
	}

	/**
	 * All old variables in the scope will be overwriten by the variables in the
	 * scope parameter.
	 * 
	 * @param variableScope
	 */
	public void addVariableScope(VariableScope variableScope)
	{
		variables.putAll(variableScope.getVariables());
	}
}
