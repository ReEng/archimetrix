package de.mdelab.sdm.interpreter.common.activity.tasks;

import de.mdelab.sdm.interpreter.common.activity.adapters.StoryNodeAdapter;
import de.mdelab.sdm.interpreter.common.storyPattern.SPMatcher;
import de.mdelab.sdm.interpreter.common.storyPattern.StoryPatternMatcherFactory;
import de.mdelab.sdm.interpreter.common.tasks.Task;
import de.mdelab.sdm.interpreter.common.tasks.VariablesManager;

public abstract class StoryNodeTask extends ActivityNodeTask<StoryNodeAdapter>
{
	private StoryPatternMatcherFactory	matcherFactory;
	private SPMatcher			spMatcher;

	protected StoryNodeTask(Task<?, ?> parentTask, ActivityTaskFactory taskFactory, VariablesManager variablesManager,
			StoryNodeAdapter adapter)
	{
		super(parentTask, taskFactory, variablesManager, adapter);

		matcherFactory = variablesManager.getSdmInterpreter().getMatcherFactory();
	}

	protected StoryPatternMatcherFactory getMatcherFactory()
	{
		return matcherFactory;
	}

	protected void setMatcherFactory(StoryPatternMatcherFactory matcherFactory)
	{
		this.matcherFactory = matcherFactory;
	}

	protected SPMatcher getSPMatcher()
	{
		return spMatcher;
	}

	public void setSPMatcher(SPMatcher spMatcher)
	{
		this.spMatcher = spMatcher;
	}
}
