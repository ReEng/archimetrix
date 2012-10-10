package de.mdelab.sdm.interpreter.common.storyPattern;

import de.mdelab.sdm.interpreter.common.storyPattern.adapters.StoryPatternAdapter;
import de.mdelab.sdm.interpreter.common.storyPattern.matchingStrategy.SPMatchingStrategy;
import de.mdelab.sdm.interpreter.common.tasks.Task;
import de.mdelab.sdm.interpreter.common.tasks.VariablesManager;

public class SPMatcher
{
	private StoryPatternAdapter	storyPatternAdapter;
	private StoryPatternMatcherFactory	matcherFactory;
	private SPMatchingStrategy	matchingStrategy;

	public SPMatcher(StoryPatternAdapter storyPatternAdapter, StoryPatternMatcherFactory matcherFactory, SPMatchingStrategy matchingStrategy)
	{
		assert storyPatternAdapter != null;
		assert matcherFactory != null;
		assert matchingStrategy != null;

		this.storyPatternAdapter = storyPatternAdapter;
		this.matcherFactory = matcherFactory;
		this.matchingStrategy = matchingStrategy;
	}

	public boolean findNextMatch()
	{
		return false;
	}

	public void startMatching(Task<?, ?> parentTask, VariablesManager variablesManager)
	{

	}

	/**
	 * 
	 * @return True if the pattern matching process has finished.
	 */
	public boolean matchingFinished()
	{
		return false;
	}

	/**
	 * 
	 * @return True if the last pattern matching process has found a match.
	 */
	public boolean matchFound()
	{
		return false;
	}
}
