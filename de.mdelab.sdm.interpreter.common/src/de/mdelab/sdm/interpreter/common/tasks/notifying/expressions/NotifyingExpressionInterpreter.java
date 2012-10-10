package de.mdelab.sdm.interpreter.common.tasks.notifying.expressions;

import de.mdelab.sdm.interpreter.common.SDMInterpreterException;
import de.mdelab.sdm.interpreter.common.adapters.expressions.IExpressionAdapter;
import de.mdelab.sdm.interpreter.common.adapters.m3.IClassifierAdapter;
import de.mdelab.sdm.interpreter.common.adapters.m3.IInstanceAdapter;
import de.mdelab.sdm.interpreter.common.expressions.IExpressionInterpreter;
import de.mdelab.sdm.interpreter.common.tasks.notifying.INotificationReceiver;
import de.mdelab.sdm.interpreter.common.variables.Variable;
import de.mdelab.sdm.interpreter.common.variables.VariableScope;

/**
 * @author Stephan Hildebrandt
 * @author Sebastian Wätzoldt
 */
public class NotifyingExpressionInterpreter implements IExpressionInterpreter
{
	private IExpressionInterpreter	internalExpressionInterpreter;
	private INotificationReceiver	notificationReceiver;

	public NotifyingExpressionInterpreter(IExpressionInterpreter expressionInterpreter, INotificationReceiver notificationReceiver)
	{
		assert expressionInterpreter != null;
		assert notificationReceiver != null;

		this.internalExpressionInterpreter = expressionInterpreter;
		this.notificationReceiver = notificationReceiver;
	}

	@Override
	public Variable evaluate(IExpressionAdapter expressionAdapter, VariableScope variableScope,
			IClassifierAdapter contextClassifierAdapter, IInstanceAdapter contextInstanceAdapter) throws SDMInterpreterException
	{
		notificationReceiver.beforeExpressionEvaluation(expressionAdapter, contextClassifierAdapter, contextInstanceAdapter);

		Variable result = internalExpressionInterpreter.evaluate(expressionAdapter, variableScope, contextClassifierAdapter,
				contextInstanceAdapter);

		notificationReceiver.afterExpressionEvaluation(expressionAdapter, contextClassifierAdapter, contextInstanceAdapter, result);

		return result;
	}

}
