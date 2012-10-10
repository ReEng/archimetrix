package de.mdelab.sdm.interpreter.common.adapters.activity;

import de.mdelab.sdm.interpreter.common.adapters.IAdapterFactory;

/**
 * @author Stephan Hildebrandt
 * @author Sebastian Wätzoldt
 */
public interface IActivityAdapterFactory extends IAdapterFactory
{
	public IStoryActivityAdapter getStoryActivityAdapter(Object storyActivity);

	// public IActivityNodeAdapter getActivityNodeAdapter(Object activityNode);
}
