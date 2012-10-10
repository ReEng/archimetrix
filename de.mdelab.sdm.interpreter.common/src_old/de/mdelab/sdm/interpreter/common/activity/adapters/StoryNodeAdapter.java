package de.mdelab.sdm.interpreter.common.activity.adapters;

import de.mdelab.sdm.interpreter.common.activity.tasks.StoryNodeTypeEnum;
import de.mdelab.sdm.interpreter.common.storyPattern.adapters.StoryPatternAdapter;

public abstract class StoryNodeAdapter extends ActivityNodeAdapter
{

	protected StoryNodeAdapter(ActivityAdapterFactory adapterFactory)
	{
		super(adapterFactory);
	}

	/**
	 * 
	 * @return The type of the story node (e.g., for-each).
	 */
	public abstract StoryNodeTypeEnum getStoryNodeType();

	public abstract StoryPatternAdapter getStoryPatternAdapter();
}
