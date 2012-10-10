package org.storydriven.modeling.interpreter.calls;

import de.mdelab.sdm.interpreter.common.SDMInterpreterException;
import de.mdelab.sdm.interpreter.common.adapters.expressions.IExpressionAdapter;
import de.mdelab.sdm.interpreter.common.adapters.m3.IClassifierAdapter;
import de.mdelab.sdm.interpreter.common.adapters.m3.IInstanceAdapter;
import de.mdelab.sdm.interpreter.common.expressions.IExpressionInterpreter;
import de.mdelab.sdm.interpreter.common.variables.Variable;
import de.mdelab.sdm.interpreter.common.variables.VariableScope;

public class SDCallsInterpreter implements IExpressionInterpreter
{

	@Override
	public Variable evaluate(IExpressionAdapter expressionAdapter, VariableScope variableScope,
			IClassifierAdapter contextClassifierAdapter, IInstanceAdapter contextInstanceAdapter) throws SDMInterpreterException
	{
		return ((ISDExpressionEvaluator) expressionAdapter).evaluate(contextClassifierAdapter, contextInstanceAdapter, variableScope);
	}

}
