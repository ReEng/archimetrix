package de.mdelab.sdm.interpreter.common.tasks.notifying;

import java.util.Map;

import de.mdelab.sdm.interpreter.common.adapters.IAdapter;
import de.mdelab.sdm.interpreter.common.adapters.activity.IActivityFinalNodeAdapter;
import de.mdelab.sdm.interpreter.common.adapters.activity.IActivityNodeAdapter;
import de.mdelab.sdm.interpreter.common.adapters.activity.IForEachFreshMatchStoryNodeAdapter;
import de.mdelab.sdm.interpreter.common.adapters.activity.IForkJoinNodeAdapter;
import de.mdelab.sdm.interpreter.common.adapters.activity.ISingleMatchStoryNodeAdapter;
import de.mdelab.sdm.interpreter.common.adapters.activity.IStoryActivityAdapter;
import de.mdelab.sdm.interpreter.common.adapters.expressions.IExpressionAdapter;
import de.mdelab.sdm.interpreter.common.adapters.m3.IClassifierAdapter;
import de.mdelab.sdm.interpreter.common.adapters.m3.IInstanceAdapter;
import de.mdelab.sdm.interpreter.common.adapters.m3.IPropertyAdapter;
import de.mdelab.sdm.interpreter.common.adapters.storypattern.IStoryPatternAdapter;
import de.mdelab.sdm.interpreter.common.adapters.storypattern.IStoryPatternLinkAdapter;
import de.mdelab.sdm.interpreter.common.adapters.storypattern.IStoryPatternLinkEndAdapter;
import de.mdelab.sdm.interpreter.common.adapters.storypattern.IStoryPatternObjectAdapter;
import de.mdelab.sdm.interpreter.common.tasks.Task;
import de.mdelab.sdm.interpreter.common.tasks.TaskStateEnum;
import de.mdelab.sdm.interpreter.common.variables.Variable;

/**
 * This interface must be implemented by receivers of notifications from
 * notifying adapters.
 * 
 * @author Stephan Hildebrandt
 * @author Sebastian Wätzoldt
 * 
 * 
 */
public interface INotificationReceiver
{
	public void executionCancelled(IAdapter adapter, Throwable exception);

	/**
	 * Called before an activity is executed.
	 * 
	 * @param activityAdapter
	 *            The activity's adapter.
	 */
	public void beforeActivityExecution(IStoryActivityAdapter activityAdapter);

	/**
	 * Called after an activity was executed.
	 * 
	 * @param activityAdapter
	 *            The activity's adapter.
	 * @param returnValue
	 *            The activity's return value.
	 */
	public void afterActivityExecution(IStoryActivityAdapter activityAdapter, Variable returnValue);

	/**
	 * Called before an activity node is executed.
	 * 
	 * @param activityNodeAdapter
	 *            The activity node's adapter.
	 */
	public void beforeActivityNodeExecution(IActivityNodeAdapter activityNodeAdapter);

	/**
	 * Called after an activity node has been executed.
	 * 
	 * @param activityNodeAdapter
	 *            The activity node's adapter.
	 */
	public void afterActivityNodeExecution(IActivityNodeAdapter activityNodeAdapter);

	/**
	 * Called before an activity final node is executed.
	 * 
	 * @param activityFinalNodeAdapter
	 *            The activity final node's adapter.
	 */
	public void beforeActivityFinalNodeExecution(IActivityFinalNodeAdapter activityFinalNodeAdapter);

	/**
	 * Called after an activity final node has been executed.
	 * 
	 * @param activityFinalNodeAdapter
	 *            The activity final node's adapter.
	 * @param returnValue
	 *            The activity final node's return value.
	 */
	public void afterActivityFinalNodeExecution(IActivityFinalNodeAdapter activityFinalNodeAdapter, Variable returnValue);

	/**
	 * Called before an expression is executed.
	 * 
	 * @param expressionAdapter
	 *            The expression's adapter.
	 * @param contextClassifierAdapter
	 *            The context classifier's adapter or null if there is no
	 *            context.
	 * @param contextInstance
	 *            The context instance or null if there is no context.
	 */
	public void beforeExpressionEvaluation(IExpressionAdapter expressionAdapter, IClassifierAdapter contextClassifierAdapter,
			Object contextInstance);

	/**
	 * Called after an expression was executed.
	 * 
	 * @param expressionAdapter
	 *            The expression's adapter.
	 * @param contextClassifierAdapter
	 *            The context classifier's adapter or null if there is no
	 *            context.
	 * @param contextInstance
	 *            The context instance or null if there is no context.
	 * @param result
	 *            The evaluation result of the expression.
	 */
	public void afterExpressionEvaluation(IExpressionAdapter expressionAdapter, IClassifierAdapter contextClassifierAdapter,
			Object contextInstance, Variable result);

	/**
	 * Called before fork/join node is executed.
	 * 
	 * @param activityNodeAdapter
	 *            The fork/join node's adapter.
	 */
	public void beforeForkJoinNodeExecution(IForkJoinNodeAdapter activityNodeAdapter);

	/**
	 * Called after fork/join node has been executed.
	 * 
	 * @param activityNodeAdapter
	 *            The fork/join node's adapter.
	 */
	public void afterForkJoinNodeExecution(IForkJoinNodeAdapter activityNodeAdapter);

	public void beforeFork(IForkJoinNodeAdapter forkJoinNodeAdapter, int forkedThreads);

	public void afterJoin(IForkJoinNodeAdapter forkJoinNodeAdapter, int joinedThreads);

	public void afterTaskStateSwitch(Task<?> task, TaskStateEnum previousState, TaskStateEnum currentState);

	public void startingTask(Task<?> caller, Task<?> callee);

	public void beforeSingleMatchStoryNodeExecution(ISingleMatchStoryNodeAdapter singleMatchStoryNodeAdapter);

	public void afterSingleMatchStoryNodeExecution(ISingleMatchStoryNodeAdapter singleMatchStoryNodeAdapter, boolean successful);

	public void beforeForEachFreshMatchStoryNodeExecution(IForEachFreshMatchStoryNodeAdapter forEachFreshMatchStoryNodeAdapter);

	public void afterForEachFreshMatchStoryNodeExecution(IForEachFreshMatchStoryNodeAdapter forEachFreshMatchStoryNodeAdapter,
			boolean successful);

	public void instanceObjectCreated(IStoryPatternObjectAdapter storyPatternObjectAdapter, IInstanceAdapter instanceAdapter);

	public void attributeValueAssignment(IStoryPatternObjectAdapter storyPatternObjectAdapter, IInstanceAdapter instanceAdapter,
			IPropertyAdapter propertyAdapter, IInstanceAdapter newValueAdapter);

	public void storyPatternObjectBound(IStoryPatternObjectAdapter storyPatternObjectAdapter, IInstanceAdapter instanceAdapter);

	public void beforeInstanceObjectDeleted(IStoryPatternObjectAdapter storyPatternObjectAdapter, IInstanceAdapter instanceAdapter);

	public void afterInstanceObjectDeleted(IStoryPatternObjectAdapter storyPatternObjectAdapter, IInstanceAdapter instanceAdapter);

	public void instanceLinkCreated(IStoryPatternLinkAdapter storyPatternLinkAdapter,
			Map<IStoryPatternLinkEndAdapter, IInstanceAdapter> linkEndBindings);

	public void beforeInstanceLinkDelete(IStoryPatternLinkAdapter storyPatternLinkAdapter,
			Map<IStoryPatternLinkEndAdapter, IInstanceAdapter> linkEndBindings);

	public void afterInstanceLinkDelete(IStoryPatternLinkAdapter storyPatternLinkAdapter,
			Map<IStoryPatternLinkEndAdapter, IInstanceAdapter> linkEndBindings);

	public void checkStoryPatternObjectConstraintSuccessful(IStoryPatternObjectAdapter storyPatternObjectAdapter,
			IInstanceAdapter instanceAdapter, IExpressionAdapter expressionAdapter);

	public void checkStoryPatternObjectConstraintFailed(IStoryPatternObjectAdapter storyPatternObjectAdapter,
			IInstanceAdapter instanceAdapter, IExpressionAdapter expressionAdapter);

	public void checkStoryPatternConstraintSuccessful(IStoryPatternAdapter storyPatternAdapter, IExpressionAdapter expressionAdapter);

	public void checkStoryPatternConstraintFailed(IStoryPatternAdapter storyPatternAdapter, IExpressionAdapter expressionAdapter);
}