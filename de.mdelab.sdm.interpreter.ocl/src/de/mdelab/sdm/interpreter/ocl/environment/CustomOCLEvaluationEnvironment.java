package de.mdelab.sdm.interpreter.ocl.environment;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.ocl.ecore.EcoreEvaluationEnvironment;
import org.eclipse.ocl.parser.AbstractOCLAnalyzer;

import de.mdelab.sdm.interpreter.common.variables.Variable;
import de.mdelab.sdm.interpreter.common.variables.VariableScope;

/**
 * A customized OCL evaluation environment that does not store variables locally
 * but retrieves them from a variables manager.
 * 
 * @author Stephan Hildebrandt
 * 
 */
public class CustomOCLEvaluationEnvironment extends EcoreEvaluationEnvironment
{
	private VariableScope		variableScope;

	/*
	 * This map stores temporary variables like 'self'.
	 */
	private Map<String, Object>	localValues;

	/**
	 * 
	 * @param variableScope
	 *            The adapter of the variables manager from where variables are
	 *            retrieved.
	 */
	public CustomOCLEvaluationEnvironment()
	{
		localValues = new HashMap<String, Object>();
	}

	@Override
	public void add(String name, Object value)
	{
		localValues.put(name, value);
	}

	@Override
	public Object remove(String name)
	{
		return localValues.remove(name);
	}

	@Override
	public Object getValueOf(String name)
	{
		assert variableScope != null;

		if (localValues.containsKey(name))
		{
			return localValues.get(name);
		}

		Variable variable = variableScope.getVariable(name);

		if (variable == null && AbstractOCLAnalyzer.isEscaped(name))
		{
			variable = variableScope.getVariable(AbstractOCLAnalyzer.unescape(name));
		}

		if (variable == null)
		{
			return null;
		}
		else
		{
			return variable.getValueAdapter().getValue();
		}
	}

	/**
	 * 
	 * @return The adapter of the variables manager from where variables are
	 *         retrieved.
	 */
	public VariableScope getVariableScope()
	{
		return variableScope;
	}

	public void setVariableScope(VariableScope variableScope)
	{
		this.variableScope = variableScope;
	}

	@Override
	public void replace(String name, Object value)
	{
		localValues.put(name, value);
	}

}
