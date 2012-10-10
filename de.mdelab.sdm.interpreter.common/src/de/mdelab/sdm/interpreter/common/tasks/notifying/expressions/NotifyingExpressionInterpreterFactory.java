package de.mdelab.sdm.interpreter.common.tasks.notifying.expressions;

import de.mdelab.sdm.interpreter.common.SDMInterpreterException;
import de.mdelab.sdm.interpreter.common.expressions.ExpressionInterpreterFactory;
import de.mdelab.sdm.interpreter.common.expressions.IExpressionInterpreter;
import de.mdelab.sdm.interpreter.common.tasks.notifying.INotificationReceiver;

/**
 * @author Stephan Hildebrandt
 * @author Sebastian Wätzoldt
 */
public class NotifyingExpressionInterpreterFactory extends ExpressionInterpreterFactory
{
	private ExpressionInterpreterFactory	internalExpressionInterpreterFactory;
	private INotificationReceiver			notificationReceiver;

	public NotifyingExpressionInterpreterFactory(ExpressionInterpreterFactory expressionInterpreterFactory,
			INotificationReceiver notificationReceiver)
	{
		assert expressionInterpreterFactory != null;
		assert notificationReceiver != null;

		this.internalExpressionInterpreterFactory = expressionInterpreterFactory;
		this.notificationReceiver = notificationReceiver;
	}

	@Override
	protected IExpressionInterpreter createExpressionInterpreter(String expressionLanguage)
	{
		try
		{
			return new NotifyingExpressionInterpreter(internalExpressionInterpreterFactory.getExpressionInterpreter(expressionLanguage),
					notificationReceiver);
		}
		catch (SDMInterpreterException e)
		{
			return null;
		}
	}

}
