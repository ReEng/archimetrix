package de.mdelab.sdm.interpreter.common.tasks.activity;

import de.mdelab.sdm.interpreter.common.adapters.activity.ISingleMatchStoryNodeAdapter;
import de.mdelab.sdm.interpreter.common.storypatternmatcher.StoryPatternMatcher;
import de.mdelab.sdm.interpreter.common.tasks.Task;
import de.mdelab.sdm.interpreter.common.variables.VariableScope;

/**
 * @author Stephan Hildebrandt
 * @author Sebastian Wätzoldt
 */
public class SingleMatchStoryNodeTask extends StoryNodeTask<ISingleMatchStoryNodeAdapter>
{

	private StoryPatternMatcher	storyPatternMatcher;

	public SingleMatchStoryNodeTask(Task<?> parentTask, VariableScope variableScope, ISingleMatchStoryNodeAdapter adapter)
	{
		super(parentTask, variableScope, adapter);
	}

	@Override
	protected boolean caseStateInitializing() throws Exception
	{
		storyPatternMatcher = getVariableScope().getInterpreterManager().getMainInterpreterFactory().getPatternMatcherFactory()
				.createSingleMatchStoryPatternMatcher(this, getVariableScope(), getAdapter().getStoryPatternAdapter());

		assert this.storyPatternMatcher != null;

		startTask(storyPatternMatcher);

		return true;
	}

	@Override
	protected boolean caseStateWorking() throws Exception
	{
		VariableScope variableScope = storyPatternMatcher.getReturnValue();

		if (variableScope == null)
		{
			// no match found
			setNextNodeAdapter(getAdapter().getNextNodeAdapterForFailure());
		}
		else
		{
			// matcher found a match
			storyPatternMatcher.apply();

			getVariableScope().addVariableScope(variableScope);
			setNextNodeAdapter(getAdapter().getNextNodeAdapterForSuccess());
		}

		storyPatternMatcher = null;

		return false;
	}

	@Override
	protected void caseStateFinishing() throws Exception
	{
		// Do nothing
	}

	@Override
	protected void caseStateCancelled() throws Exception
	{
		if (storyPatternMatcher != null)
		{
			storyPatternMatcher.cancel();
		}
	}

}
