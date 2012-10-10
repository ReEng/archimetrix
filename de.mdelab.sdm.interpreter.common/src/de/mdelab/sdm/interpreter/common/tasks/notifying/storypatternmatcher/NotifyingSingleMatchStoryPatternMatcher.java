package de.mdelab.sdm.interpreter.common.tasks.notifying.storypatternmatcher;

import java.util.HashMap;
import java.util.Map;

import de.mdelab.sdm.interpreter.common.adapters.expressions.IExpressionAdapter;
import de.mdelab.sdm.interpreter.common.adapters.m3.IInstanceAdapter;
import de.mdelab.sdm.interpreter.common.adapters.m3.IPropertyAdapter;
import de.mdelab.sdm.interpreter.common.adapters.storypattern.IStoryPatternAdapter;
import de.mdelab.sdm.interpreter.common.adapters.storypattern.IStoryPatternLinkAdapter;
import de.mdelab.sdm.interpreter.common.adapters.storypattern.IStoryPatternLinkEndAdapter;
import de.mdelab.sdm.interpreter.common.adapters.storypattern.IStoryPatternObjectAdapter;
import de.mdelab.sdm.interpreter.common.storypatternmatcher.SingleMatchStoryPatternMatcher;
import de.mdelab.sdm.interpreter.common.tasks.Task;
import de.mdelab.sdm.interpreter.common.tasks.TaskStateEnum;
import de.mdelab.sdm.interpreter.common.tasks.notifying.INotificationReceiver;
import de.mdelab.sdm.interpreter.common.variables.VariableScope;

/**
 * @author Stephan Hildebrandt
 * @author Sebastian Wätzoldt
 */
public class NotifyingSingleMatchStoryPatternMatcher extends SingleMatchStoryPatternMatcher
{
	private INotificationReceiver	notificationReceiver;

	public NotifyingSingleMatchStoryPatternMatcher(Task<?> parentTask, VariableScope variableScope,
			IStoryPatternAdapter storyPatternAdapter, INotificationReceiver notificationReceiver)
	{
		super(parentTask, variableScope, storyPatternAdapter);

		assert notificationReceiver != null;

		this.notificationReceiver = notificationReceiver;
	}

	@Override
	protected void switchToNextState()
	{
		TaskStateEnum previousState = getTaskState();

		super.switchToNextState();

		notificationReceiver.afterTaskStateSwitch(this, previousState, getTaskState());
	}

	@Override
	protected void startTask(Task<?> task)
	{
		notificationReceiver.startingTask(this, task);
		super.startTask(task);
	}

	@Override
	protected void instanceObjectCreated(IStoryPatternObjectAdapter storyPatternObjectAdapter)
	{
		notificationReceiver.instanceObjectCreated(storyPatternObjectAdapter,
				getVariableScope().getVariable(storyPatternObjectAdapter.getName()).getValueAdapter());
	}

	@Override
	protected void beforeInstanceObjectDeleted(IStoryPatternObjectAdapter storyPatternObjectAdapter, IInstanceAdapter instanceAdapter)
	{
		notificationReceiver.beforeInstanceObjectDeleted(storyPatternObjectAdapter, instanceAdapter);
	}

	@Override
	protected void afterInstanceObjectDeleted(IStoryPatternObjectAdapter storyPatternObjectAdapter, IInstanceAdapter instanceAdapter)
	{
		notificationReceiver.afterInstanceObjectDeleted(storyPatternObjectAdapter, instanceAdapter);
	}

	@Override
	protected void attributeValueAssignment(IStoryPatternObjectAdapter storyPatternObjectAdapter, IPropertyAdapter propertyAdapter,
			IInstanceAdapter valueAdapter)
	{
		notificationReceiver.attributeValueAssignment(storyPatternObjectAdapter,
				getVariableScope().getVariable(storyPatternObjectAdapter.getName()).getValueAdapter(), propertyAdapter, valueAdapter);
	}

	@Override
	protected void storyPatternObjectBound(IStoryPatternObjectAdapter storyPatternObjectAdapter, IInstanceAdapter instanceAdapter)
	{
		notificationReceiver.storyPatternObjectBound(storyPatternObjectAdapter, instanceAdapter);
	}

	@Override
	protected void instanceLinkCreated(IStoryPatternLinkAdapter storyPatternLinkAdapter)
	{
		Map<IStoryPatternLinkEndAdapter, IInstanceAdapter> map = new HashMap<IStoryPatternLinkEndAdapter, IInstanceAdapter>();

		for (IStoryPatternLinkEndAdapter linkEnd : storyPatternLinkAdapter.getLinkEndAdapters())
		{
			map.put(linkEnd, linkEnd.getInstanceAdapter(this.getVariableScope()));
		}

		notificationReceiver.instanceLinkCreated(storyPatternLinkAdapter, map);
	}
	
	@Override
	protected void beforeInstanceLinkDeleted(IStoryPatternLinkAdapter storyPatternLinkAdapter)
	{
		Map<IStoryPatternLinkEndAdapter, IInstanceAdapter> map = new HashMap<IStoryPatternLinkEndAdapter, IInstanceAdapter>();

		for (IStoryPatternLinkEndAdapter linkEnd : storyPatternLinkAdapter.getLinkEndAdapters())
		{
			map.put(linkEnd, getVariableScope().getVariable(linkEnd.getStoryPatternObjectAdapter().getName()).getValueAdapter());
		}

		notificationReceiver.beforeInstanceLinkDelete(storyPatternLinkAdapter, map);
	}
	
	@Override
	protected void afterInstanceLinkDeleted(IStoryPatternLinkAdapter storyPatternLinkAdapter)
	{
		Map<IStoryPatternLinkEndAdapter, IInstanceAdapter> map = new HashMap<IStoryPatternLinkEndAdapter, IInstanceAdapter>();

		for (IStoryPatternLinkEndAdapter linkEnd : storyPatternLinkAdapter.getLinkEndAdapters())
		{
			map.put(linkEnd, getVariableScope().getVariable(linkEnd.getStoryPatternObjectAdapter().getName()).getValueAdapter());
		}

		notificationReceiver.afterInstanceLinkDelete(storyPatternLinkAdapter, map);
	}
	
	@Override
	protected void checkStoryPatternObjectConstraintSuccessful(IStoryPatternObjectAdapter storyPatternObjectAdapter,
			IExpressionAdapter expressionAdapter)
	{
		notificationReceiver.checkStoryPatternObjectConstraintSuccessful(storyPatternObjectAdapter, getVariableScope().getVariable(storyPatternObjectAdapter.getName()).getValueAdapter(), expressionAdapter);
	}
	
	@Override
	protected void checkStoryPatternObjectConstraintFailed(IStoryPatternObjectAdapter storyPatternObjectAdapter,
			IExpressionAdapter expressionAdapter)
	{
		notificationReceiver.checkStoryPatternObjectConstraintFailed(storyPatternObjectAdapter, getVariableScope().getVariable(storyPatternObjectAdapter.getName()).getValueAdapter(), expressionAdapter);
	}
	
	@Override
	protected void checkStoryPatternConstraintSuccessful(IStoryPatternAdapter storyPatternAdapter, IExpressionAdapter expressionAdapter)
	{
		notificationReceiver.checkStoryPatternConstraintSuccessful(storyPatternAdapter, expressionAdapter);
	}
	
	@Override
	protected void checkStoryPatternConstraintFailed(IStoryPatternAdapter storyPatternAdapter, IExpressionAdapter expressionAdapter)
	{
		notificationReceiver.checkStoryPatternConstraintFailed(storyPatternAdapter, expressionAdapter);
	}
}
