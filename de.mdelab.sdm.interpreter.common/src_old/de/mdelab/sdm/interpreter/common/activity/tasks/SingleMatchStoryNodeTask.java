package de.mdelab.sdm.interpreter.common.activity.tasks;

import de.mdelab.sdm.interpreter.common.activity.adapters.StoryNodeAdapter;
import de.mdelab.sdm.interpreter.common.tasks.Task;
import de.mdelab.sdm.interpreter.common.tasks.VariablesManager;

public class SingleMatchStoryNodeTask extends StoryNodeTask
{
	protected SingleMatchStoryNodeTask(Task<?, ?> parentTask, ActivityTaskFactory taskFactory, VariablesManager variablesManager,
			StoryNodeAdapter adapter)
	{
		super(parentTask, taskFactory, variablesManager, adapter);
	}

	@Override
	protected boolean caseStateReady() throws Exception
	{
		/*
		 * Create new story pattern matcher
		 */
		setSPMatcher(getMatcherFactory().createSPMatcher(getAdapter().getStoryPatternAdapter(),
				getMatcherFactory().getSPMatchingStrategyFactory().createSingleMatchStrategy()));

		getSPMatcher().startMatching(this, getVariablesManager());
		
		return true;
	}

	@Override
	protected boolean caseStateWorking() throws Exception
	{
		assert getSPMatcher().matchingFinished();
		
		System.out.println("Matching finished.");
		
		return false;
	}

	@Override
	protected void caseStateFinishing() throws Exception
	{
		// TODO Auto-generated method stub

	}

	@Override
	protected void caseStateCancelled() throws Exception
	{
		// TODO Auto-generated method stub

	}

}
