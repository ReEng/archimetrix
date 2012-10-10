package de.mdelab.sdm.interpreter.common.tasks.notifying;

import de.mdelab.sdm.interpreter.common.MainInterpreterFactory;
import de.mdelab.sdm.interpreter.common.expressions.ExpressionInterpreterFactory;
import de.mdelab.sdm.interpreter.common.storypatternmatcher.StoryPatternMatcherFactory;
import de.mdelab.sdm.interpreter.common.tasks.activity.ActivityTaskFactory;
import de.mdelab.sdm.interpreter.common.tasks.notifying.activity.NotifyingActivityTaskFactory;
import de.mdelab.sdm.interpreter.common.tasks.notifying.expressions.NotifyingExpressionInterpreterFactory;
import de.mdelab.sdm.interpreter.common.tasks.notifying.storypatternmatcher.NotifyingStoryPatternMatcherFactory;

/**
 * @author Stephan Hildebrandt
 * @author Sebastian Wätzoldt
 */
public class NotifyingMainInterpreterFactory extends MainInterpreterFactory
{
	private INotificationReceiver					notificationReceiver;
	private NotifyingExpressionInterpreterFactory	notifyingExpressionInterpreterFactory;

	public NotifyingMainInterpreterFactory(ExpressionInterpreterFactory expressionInterpreterFactory,
			INotificationReceiver notificationReceiver)
	{
		super(expressionInterpreterFactory);

		assert notificationReceiver != null;

		this.notificationReceiver = notificationReceiver;

		notifyingExpressionInterpreterFactory = new NotifyingExpressionInterpreterFactory(expressionInterpreterFactory,
				notificationReceiver);
	}

	@Override
	protected ActivityTaskFactory createActivityTaskFactory()
	{
		return new NotifyingActivityTaskFactory(notificationReceiver);
	}

	public ExpressionInterpreterFactory getExpressionInterpreterFactory()
	{
		return notifyingExpressionInterpreterFactory;
	};
	
	@Override
	protected StoryPatternMatcherFactory createStoryPatternMatcherFactory()
	{
		return new NotifyingStoryPatternMatcherFactory(notificationReceiver);
	}
}
