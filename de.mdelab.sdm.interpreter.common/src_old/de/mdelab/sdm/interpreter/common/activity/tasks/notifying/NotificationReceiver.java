package de.mdelab.sdm.interpreter.common.activity.tasks.notifying;

import de.mdelab.sdm.interpreter.common.SDMVariable;
import de.mdelab.sdm.interpreter.common.activity.adapters.ActivityFinalNodeAdapter;
import de.mdelab.sdm.interpreter.common.activity.adapters.ActivityNodeAdapter;
import de.mdelab.sdm.interpreter.common.activity.adapters.ForkJoinNodeAdapter;
import de.mdelab.sdm.interpreter.common.activity.adapters.StoryActivityAdapter;
import de.mdelab.sdm.interpreter.common.expressions.adapters.ExpressionAdapter;
import de.mdelab.sdm.interpreter.common.m3.adapters.ClassifierAdapter;

/**
 * This interface must be implemented by receivers of notifications from
 * notifying adapters.
 * 
 * @author Stephan Hildebrandt
 * @author Sebastian Wätzoldt
 * 
 * 
 */
public interface NotificationReceiver
{
	/**
	 * Called before an activity is executed.
	 * 
	 * @param activityAdapter
	 *            The activity's adapter.
	 */
	public void beforeActivityExecution(StoryActivityAdapter activityAdapter);

	/**
	 * Called after an activity was executed.
	 * 
	 * @param activityAdapter
	 *            The activity's adapter.
	 * @param returnValue
	 *            The activity's return value.
	 */
	public void afterActivityExecution(StoryActivityAdapter activityAdapter, SDMVariable returnValue);

	/**
	 * Called before an activity node is executed.
	 * 
	 * @param activityNodeAdapter
	 *            The activity node's adapter.
	 */
	public void beforeActivityNodeExecution(ActivityNodeAdapter activityNodeAdapter);

	/**
	 * Called after an activity node has been executed.
	 * 
	 * @param activityNodeAdapter
	 *            The activity node's adapter.
	 */
	public void afterActivityNodeExecution(ActivityNodeAdapter activityNodeAdapter);

	/**
	 * Called before an activity final node is executed.
	 * 
	 * @param activityFinalNodeAdapter
	 *            The activity final node's adapter.
	 */
	public void beforeActivityFinalNodeExecution(ActivityFinalNodeAdapter activityFinalNodeAdapter);

	/**
	 * Called after an activity final node has been executed.
	 * 
	 * @param activityFinalNodeAdapter
	 *            The activity final node's adapter.
	 * @param returnValue
	 *            The activity final node's return value.
	 */
	public void afterActivityFinalNodeExecution(ActivityFinalNodeAdapter activityFinalNodeAdapter, SDMVariable returnValue);

	/**
	 * Called when a variable was created.
	 * 
	 * @param sdmVariable
	 *            The created variable.
	 */
	public void variableCreated(SDMVariable sdmVariable);

	/**
	 * Called when a variable was deleted.
	 * 
	 * @param sdmVariable
	 *            The deleted variable.
	 */
	public void variableDeleted(SDMVariable sdmVariable);

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
	public void beforeExpressionEvaluation(ExpressionAdapter expressionAdapter, ClassifierAdapter contextClassifierAdapter,
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
	public void afterExpressionEvaluation(ExpressionAdapter expressionAdapter, ClassifierAdapter contextClassifierAdapter,
			Object contextInstance, SDMVariable result);

	/**
	 * Called before fork/join node is executed.
	 * 
	 * @param activityNodeAdapter
	 *            The fork/join node's adapter.
	 */
	public void beforeForkJoinNodeExecution(ForkJoinNodeAdapter activityNodeAdapter);

	/**
	 * Called after fork/join node has been executed.
	 * 
	 * @param activityNodeAdapter
	 *            The fork/join node's adapter.
	 */
	public void afterForkJoinNodeExecution(ForkJoinNodeAdapter activityNodeAdapter);

	public void beforeFork(ForkJoinNodeAdapter forkJoinNodeAdapter, int forkedThreads);

	public void afterJoin(ForkJoinNodeAdapter forkJoinNodeAdapter, int joinedThreads);
}
