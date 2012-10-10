package de.mdelab.sdm.interpreter.common.expressions;

import de.mdelab.sdm.interpreter.common.SDMInterpreterException;
import de.mdelab.sdm.interpreter.common.adapters.expressions.IExpressionAdapter;
import de.mdelab.sdm.interpreter.common.adapters.m3.IClassifierAdapter;
import de.mdelab.sdm.interpreter.common.adapters.m3.IInstanceAdapter;
import de.mdelab.sdm.interpreter.common.variables.Variable;
import de.mdelab.sdm.interpreter.common.variables.VariableScope;

/**
 * @author Stephan Hildebrandt
 * @author Sebastian Wätzoldt
 */
public interface IExpressionInterpreter
{
	public abstract Variable evaluate(IExpressionAdapter expressionAdapter, VariableScope variableScope,
			IClassifierAdapter contextClassifierAdapter, IInstanceAdapter contextInstance) throws SDMInterpreterException;
}
