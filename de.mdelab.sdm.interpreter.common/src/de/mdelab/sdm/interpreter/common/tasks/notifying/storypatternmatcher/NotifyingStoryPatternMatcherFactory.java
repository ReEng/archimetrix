package de.mdelab.sdm.interpreter.common.tasks.notifying.storypatternmatcher;

import de.mdelab.sdm.interpreter.common.adapters.storypattern.IStoryPatternAdapter;
import de.mdelab.sdm.interpreter.common.storypatternmatcher.StoryPatternMatcher;
import de.mdelab.sdm.interpreter.common.storypatternmatcher.StoryPatternMatcherFactory;
import de.mdelab.sdm.interpreter.common.tasks.Task;
import de.mdelab.sdm.interpreter.common.tasks.notifying.INotificationReceiver;
import de.mdelab.sdm.interpreter.common.variables.VariableScope;

/**
 * @author Stephan Hildebrandt
 * @author Sebastian Wätzoldt
 */
public class NotifyingStoryPatternMatcherFactory extends StoryPatternMatcherFactory
{
	private INotificationReceiver	notificationReceiver;

	public NotifyingStoryPatternMatcherFactory(INotificationReceiver notificationReceiver)
	{
		assert notificationReceiver != null;

		this.notificationReceiver = notificationReceiver;
	}

	@Override
	public StoryPatternMatcher createSingleMatchStoryPatternMatcher(Task<?> parentTask, VariableScope variableScope,
			IStoryPatternAdapter storyPatternAdapter)
	{
		return new NotifyingSingleMatchStoryPatternMatcher(parentTask, variableScope, storyPatternAdapter, notificationReceiver);
	}

	@Override
	public StoryPatternMatcher createForEachStoryPatternMatcher(Task<?> parentTask, VariableScope variableScope,
			IStoryPatternAdapter storyPatternAdapter)
	{
		return new NotifyingForEachStoryPatternMatcher(parentTask, variableScope, storyPatternAdapter, notificationReceiver);
	}
}
