package de.mdelab.sdm.interpreter.common.tasks.notifying.storypatternmatcher;

import de.mdelab.sdm.interpreter.common.adapters.storypattern.IStoryPatternAdapter;
import de.mdelab.sdm.interpreter.common.storypatternmatcher.ForEachStoryPatternMatcher;
import de.mdelab.sdm.interpreter.common.tasks.Task;
import de.mdelab.sdm.interpreter.common.tasks.notifying.INotificationReceiver;
import de.mdelab.sdm.interpreter.common.variables.VariableScope;

/**
 * @author Stephan Hildebrandt
 * @author Sebastian Wätzoldt
 */
public class NotifyingForEachStoryPatternMatcher extends ForEachStoryPatternMatcher
{
	private INotificationReceiver	notificationReceiver;

	public NotifyingForEachStoryPatternMatcher(Task<?> parentTask, VariableScope variableScope, IStoryPatternAdapter storyPatternAdapter,
			INotificationReceiver notificationReceiver)
	{
		super(parentTask, variableScope, storyPatternAdapter);

		assert notificationReceiver != null;
		
		this.notificationReceiver = notificationReceiver;
	}
}
