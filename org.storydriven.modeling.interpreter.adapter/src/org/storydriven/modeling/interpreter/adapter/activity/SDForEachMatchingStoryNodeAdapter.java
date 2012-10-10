package org.storydriven.modeling.interpreter.adapter.activity;

import org.storydriven.modeling.interpreter.adapter.SDMainAdapterFactory;

import de.mdelab.sdm.interpreter.common.adapters.activity.IForEachFreshMatchStoryNodeAdapter;

public class SDForEachMatchingStoryNodeAdapter extends SDMatchingStoryNodeAdapter implements IForEachFreshMatchStoryNodeAdapter 
{

	public SDForEachMatchingStoryNodeAdapter(SDMainAdapterFactory mainAdapterFactory) 
	{
		super(mainAdapterFactory);
	}

}
