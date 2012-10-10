package org.storydriven.modeling.interpreter.adapter.expressions;

import org.storydriven.modeling.expressions.NotExpression;
import org.storydriven.modeling.interpreter.adapter.SDMainAdapterFactory;

import de.mdelab.sdm.interpreter.common.SDMInterpreterConstants;
import de.mdelab.sdm.interpreter.common.SDMInterpreterException;
import de.mdelab.sdm.interpreter.common.adapters.expressions.IExpressionAdapter;
import de.mdelab.sdm.interpreter.common.adapters.m3.IClassifierAdapter;
import de.mdelab.sdm.interpreter.common.adapters.m3.IInstanceAdapter;
import de.mdelab.sdm.interpreter.common.expressions.IExpressionInterpreter;
import de.mdelab.sdm.interpreter.common.variables.Variable;
import de.mdelab.sdm.interpreter.common.variables.VariableScope;

public class SDNotExpressionAdapter extends SDCallsExpressionAdapter<NotExpression>
{

	public SDNotExpressionAdapter(SDMainAdapterFactory mainAdapterFactory)
	{
		super(mainAdapterFactory);
	}

	@Override
	public Variable evaluate(IClassifierAdapter contextClassifierAdapter, IInstanceAdapter contextInstanceAdapter,
			VariableScope variableScope) throws SDMInterpreterException
	{
		assert getElement().getNegatedExpression() != null;

		/*
		 * Get an adapter for the negated expression
		 */
		IExpressionAdapter negatedExpressionAdapter = getMainAdapterFactory().getExpressionsAdapterFactory().getExpressionAdapter(
				getElement().getNegatedExpression());

		/*
		 * Evaluate the negated expression
		 */
		IExpressionInterpreter expressionInterpreter = variableScope.getInterpreterManager().getMainInterpreterFactory()
				.getExpressionInterpreterFactory().getExpressionInterpreter(negatedExpressionAdapter.getExpressionLanguage());

		Variable resultVariable = expressionInterpreter.evaluate(negatedExpressionAdapter, variableScope, contextClassifierAdapter,
				contextInstanceAdapter);

		assert resultVariable.getValueAdapter().getValue() instanceof Boolean;

		Variable returnVariable = new Variable(SDMInterpreterConstants.INTERNAL_VAR_NAME, resultVariable.getClassifierAdapter(),
				getMainAdapterFactory().getM3AdapterFactory().getInstanceAdapter(
						new Boolean(!((Boolean) resultVariable.getValueAdapter().getValue())), resultVariable.getClassifierAdapter()));

		return returnVariable;
	}
}
