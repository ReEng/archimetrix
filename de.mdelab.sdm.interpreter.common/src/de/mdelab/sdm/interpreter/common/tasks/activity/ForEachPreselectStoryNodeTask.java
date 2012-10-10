package de.mdelab.sdm.interpreter.common.tasks.activity;

import java.util.ArrayList;
import java.util.List;

import de.mdelab.sdm.interpreter.common.adapters.activity.IActivityNodeAdapter;
import de.mdelab.sdm.interpreter.common.adapters.activity.IForEachPreselectStoryNodeAdapter;
import de.mdelab.sdm.interpreter.common.storypatternmatcher.StoryPatternMatcher;
import de.mdelab.sdm.interpreter.common.tasks.Task;
import de.mdelab.sdm.interpreter.common.variables.VariableScope;

/**
 * @author Stephan Hildebrandt
 * @author Sebastian Wätzoldt
 */
public class ForEachPreselectStoryNodeTask extends StoryNodeTask<IForEachPreselectStoryNodeAdapter>
{

	private StoryPatternMatcher			storyPatternMatcher;

	private List<ActivityTraversalTask>	forEachBlockTraversalTasks;

	private boolean						matchingFinished;
	private int							finishedChildren;

	public ForEachPreselectStoryNodeTask(Task<?> parentTask, VariableScope variableScope, IForEachPreselectStoryNodeAdapter adapter)
	{
		super(parentTask, variableScope, adapter);

		forEachBlockTraversalTasks = new ArrayList<ActivityTraversalTask>();
		finishedChildren = -1;
	}

	@Override
	protected boolean caseStateInitializing() throws Exception
	{
		storyPatternMatcher = getVariableScope().getInterpreterManager().getMainInterpreterFactory().getPatternMatcherFactory()
				.createForEachStoryPatternMatcher(this, getVariableScope(), getAdapter().getStoryPatternAdapter());

		assert this.storyPatternMatcher != null;

		matchingFinished = false;
		startTask(storyPatternMatcher);

		return true;
	}

	@Override
	protected boolean caseStateWorking() throws Exception
	{
		/*
		 * The working state of this task is separated into three sub states.
		 * 1.) Collect all Matches. 2.) Start children traversal tasks for each
		 * match to execute the for each block (if exists). 3.) Wait until all
		 * started children tasks are done.
		 */
		if (!matchingFinished)
		{
			// first case

			VariableScope variableScope = storyPatternMatcher.getReturnValue();

			if (variableScope == null)
			{
				// no match found
				matchingFinished = true;
				return caseStateWorking();
			}
			else
			{
				// matcher found a match
				storyPatternMatcher.apply();
				
				getVariableScope().addVariableScope(variableScope);
				/*
				 * Create a new traversal task for the for each block.
				 */
				IActivityNodeAdapter forEachAdapter = getAdapter().getNextNodeAdapterForSuccess();
				if (forEachAdapter != null)
				{
					forEachBlockTraversalTasks.add(getVariableScope().getInterpreterManager().getMainInterpreterFactory()
							.getActivityTaskFactory()
							.createActivityTraversalTask(this, getVariableScope().createCopy(), forEachAdapter, getAdapter()));
				}

				/*
				 * Update the variables scope of the matcher, because the next
				 * matching result has to be found with the actual context.
				 */
				storyPatternMatcher.getVariableScope().addVariableScope(variableScope);
				
				//search next match
				startTask(storyPatternMatcher);

				return true;
			}
		}
		else if (finishedChildren < 0)
		// second case
		{
			if (forEachBlockTraversalTasks.isEmpty())
			{
				/*
				 * There is no for each block or the matcher could not found a
				 * valid match. This task can switch to finish state.
				 */

				setNextNodeAdapter(getAdapter().getNextNodeAdapterForFailure());
				return false;
			}
			else
			{
				/*
				 * There exists a for each block. This task has to start a new
				 * traversal task for each match.
				 */
				for (ActivityTraversalTask childTask : forEachBlockTraversalTasks)
				{
					startTask(childTask);
				}

				finishedChildren = 0;
				return true;
			}
		}
		else
		// third case
		{
			assert finishedChildren >= 0 && !forEachBlockTraversalTasks.isEmpty();

			/*
			 * Simply count the finished child tasks.
			 */
			finishedChildren++;

			if (finishedChildren == forEachBlockTraversalTasks.size())
			{
				// All children are done.
				setNextNodeAdapter(getAdapter().getNextNodeAdapterForFailure());
				return false;
			}
			else
			{
				// At least one more child is active.
				return true;
			}
		}
	}

	@Override
	protected void caseStateFinishing() throws Exception
	{
		assert finishedChildren == -1 || finishedChildren == forEachBlockTraversalTasks.size();
		for (ActivityTraversalTask task : forEachBlockTraversalTasks)
		{
			assert task.isDone();
		}
		
		//Do nothing
	}

	@Override
	protected void caseStateCancelled() throws Exception
	{
		if (storyPatternMatcher != null)
		{
			storyPatternMatcher.cancel();
		}

		for (ActivityTraversalTask task : forEachBlockTraversalTasks)
		{
			task.cancel();
		}
	}

}
