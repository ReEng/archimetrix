package de.mdelab.sdm.interpreter.common.storyPattern;

import de.mdelab.sdm.interpreter.common.AdapterFactoryFactory;
import de.mdelab.sdm.interpreter.common.storyPattern.adapters.StoryPatternAdapter;
import de.mdelab.sdm.interpreter.common.storyPattern.adapters.StoryPatternAdapterFactory;
import de.mdelab.sdm.interpreter.common.storyPattern.matchingStrategy.SPMatchingStrategy;
import de.mdelab.sdm.interpreter.common.storyPattern.matchingStrategy.SPMatchingStrategyFactory;

public abstract class StoryPatternMatcherFactory extends AdapterFactoryFactory
{
	public SPMatchingStrategyFactory getSPMatchingStrategyFactory()
	{
		return new SPMatchingStrategyFactory();
	}

	public SPMatcher createSPMatcher(StoryPatternAdapter storyPatternAdapter, SPMatchingStrategy matchingStrategy)
	{
		return new SPMatcher(storyPatternAdapter, this, matchingStrategy);
	}

	public abstract StoryPatternAdapterFactory getStoryPatternAdapterFactory();
}
