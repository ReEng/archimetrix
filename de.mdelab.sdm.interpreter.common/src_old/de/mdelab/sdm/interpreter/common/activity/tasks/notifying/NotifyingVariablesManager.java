package de.mdelab.sdm.interpreter.common.activity.tasks.notifying;

import java.util.concurrent.ExecutorService;

import de.mdelab.sdm.interpreter.common.SDMInterpreter;
import de.mdelab.sdm.interpreter.common.SDMInterpreterException;
import de.mdelab.sdm.interpreter.common.SDMVariable;
import de.mdelab.sdm.interpreter.common.activity.tasks.ActivityTaskFactory;
import de.mdelab.sdm.interpreter.common.expressions.adapters.ExpressionAdapter;
import de.mdelab.sdm.interpreter.common.m3.adapters.ClassifierAdapter;
import de.mdelab.sdm.interpreter.common.tasks.VariablesManager;

public class NotifyingVariablesManager extends VariablesManager
{
	private NotificationReceiver	notificationReceiver;

	public NotifyingVariablesManager(SDMInterpreter sdmInterpreter, ActivityTaskFactory taskFactory, ClassLoader classLoader,
			ExecutorService executorService, NotificationReceiver notificationReceiver)
	{
		super(sdmInterpreter, taskFactory, classLoader, executorService);

		assert notificationReceiver != null;

		this.notificationReceiver = notificationReceiver;
	}

	@Override
	public SDMVariable createVariable(String name, ClassifierAdapter classifierAdapter, Object value)
	{
		SDMVariable sdmVariable = super.createVariable(name, classifierAdapter, value);

		notificationReceiver.variableCreated(sdmVariable);

		return sdmVariable;
	}

	@Override
	public SDMVariable deleteVariable(String name)
	{
		SDMVariable sdmVariable = super.deleteVariable(name);

		notificationReceiver.variableDeleted(sdmVariable);

		return sdmVariable;
	}

	@Override
	public SDMVariable evaluateExpression(ExpressionAdapter expressionAdapter, ClassifierAdapter contextClassifierAdapter,
			Object contextInstance) throws SDMInterpreterException
	{
		notificationReceiver.beforeExpressionEvaluation(expressionAdapter, contextClassifierAdapter, contextInstance);

		SDMVariable result = super.evaluateExpression(expressionAdapter, contextClassifierAdapter, contextInstance);

		notificationReceiver.afterExpressionEvaluation(expressionAdapter, contextClassifierAdapter, contextInstance, result);

		return result;
	}
}
