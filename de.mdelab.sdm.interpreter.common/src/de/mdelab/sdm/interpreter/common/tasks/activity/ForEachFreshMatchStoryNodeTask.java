package de.mdelab.sdm.interpreter.common.tasks.activity;

import de.mdelab.sdm.interpreter.common.adapters.activity.IActivityNodeAdapter;
import de.mdelab.sdm.interpreter.common.adapters.activity.IForEachFreshMatchStoryNodeAdapter;
import de.mdelab.sdm.interpreter.common.storypatternmatcher.StoryPatternMatcher;
import de.mdelab.sdm.interpreter.common.tasks.Task;
import de.mdelab.sdm.interpreter.common.variables.VariableScope;

/**
 * @author Stephan Hildebrandt
 * @author Sebastian Wätzoldt
 */
public class ForEachFreshMatchStoryNodeTask extends StoryNodeTask<IForEachFreshMatchStoryNodeAdapter>
{
	private StoryPatternMatcher		storyPatternMatcher;

	private ActivityTraversalTask	activityTraversalTask;

	public ForEachFreshMatchStoryNodeTask(Task<?> parentTask, VariableScope variableScope, IForEachFreshMatchStoryNodeAdapter adapter)
	{
		super(parentTask, variableScope, adapter);
	}

	@Override
	protected boolean caseStateInitializing() throws Exception
	{
		storyPatternMatcher = getVariableScope().getInterpreterManager().getMainInterpreterFactory().getPatternMatcherFactory()
				.createForEachStoryPatternMatcher(this, getVariableScope(), getAdapter().getStoryPatternAdapter());

		assert this.storyPatternMatcher != null;

		startTask(storyPatternMatcher);

		return true;
	}

	@Override
	protected boolean caseStateWorking() throws Exception
	{
		/*
		 * First the task must decide weather a children traversal task or the
		 * matcher is done.
		 */
		if (activityTraversalTask == null)
		{
			/*
			 * The matcher task activates this task: -> Match Found: Start a new
			 * traversal task if for each block exists. Otherwise, find the next
			 * Match. -> No Match: Execution of this task is done.
			 */

			VariableScope variableScope = storyPatternMatcher.getReturnValue();

			if (variableScope == null)
			{
				// no match found
				setNextNodeAdapter(getAdapter().getNextNodeAdapterForFailure());
				return false;
			}
			else
			{
				// matcher found a match
				storyPatternMatcher.apply();

				getVariableScope().addVariableScope(variableScope);

				IActivityNodeAdapter forEachAdapter = getAdapter().getNextNodeAdapterForSuccess();

				if (forEachAdapter != null)
				{
					/*
					 * There exists a for each block. This task has to start a
					 * new traversal task.
					 */
					activityTraversalTask = getVariableScope().getInterpreterManager().getMainInterpreterFactory().getActivityTaskFactory()
							.createActivityTraversalTask(this, getVariableScope(), forEachAdapter, getAdapter());

					startTask(activityTraversalTask);
				}
				else
				{
					/*
					 * There is no for each block. So, this task tries to find
					 * the next match.
					 */
					startNewMatchingProcess();
				}

				return true;

			}
		}
		else
		// Activity traversal task is done!
		{
			assert activityTraversalTask.isDone();

			activityTraversalTask = null;

			if (getVariableScope().getInterpreterManager().isFinalNodeReached())
			{
				return false;
			}
			else
			{
				/*
				 * The child activity traversal task activates its parent, so
				 * the story node task tries to find the next match.
				 */
				startNewMatchingProcess();

				return true;
			}
		}
	}

	private void startNewMatchingProcess()
	{
		/*
		 * Update the variables scope of the matcher, because the next matching
		 * result has to be found with the actual context.
		 */
		storyPatternMatcher.getVariableScope().addVariableScope(getVariableScope());

		startTask(storyPatternMatcher);
	}

	@Override
	protected void caseStateFinishing() throws Exception
	{
		assert activityTraversalTask == null;

		// Do nothing
	}

	@Override
	protected void caseStateCancelled() throws Exception
	{
		if (storyPatternMatcher != null)
		{
			storyPatternMatcher.cancel();
		}

		if (activityTraversalTask != null)
		{
			activityTraversalTask.cancel();
		}
	}

}
