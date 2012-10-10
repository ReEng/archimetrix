package org.storydriven.modeling.interpreter.calls;

import de.mdelab.sdm.interpreter.common.SDMInterpreterException;
import de.mdelab.sdm.interpreter.common.adapters.m3.IClassifierAdapter;
import de.mdelab.sdm.interpreter.common.adapters.m3.IInstanceAdapter;
import de.mdelab.sdm.interpreter.common.variables.Variable;
import de.mdelab.sdm.interpreter.common.variables.VariableScope;

/**
 * 
 * Interface for all expression evaluators. For simplicity, the expression
 * adapters' can implement this interface directly.
 * 
 * @author Stephan Hildebrandt
 * 
 */
public interface ISDExpressionEvaluator
{
	/**
	 * Evaluate the expression.
	 * 
	 * @param contextClassifier
	 * @param contextInstance
	 * @param variableScope
	 * @return
	 * @throws SDMInterpreterException
	 */
	public Variable evaluate(IClassifierAdapter contextClassifierAdapter, IInstanceAdapter contextInstanceAdapter,
			VariableScope variableScope) throws SDMInterpreterException;
}
