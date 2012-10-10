package de.mdelab.sdm.interpreter.common.storyPattern.adapters;

import de.mdelab.sdm.interpreter.common.adapters.AdapterFactory;
import de.mdelab.sdm.interpreter.common.storyPattern.StoryPatternMatcherFactory;

public abstract class StoryPatternAdapterFactory extends AdapterFactory
{
	public StoryPatternAdapterFactory(StoryPatternMatcherFactory matcherFactory)
	{
		super(matcherFactory);
	}

	public abstract StoryPatternAdapter getStoryPatternAdapter(Object storyPattern);
}
