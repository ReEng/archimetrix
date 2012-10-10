package org.storydriven.modeling.interpreter.adapter.activity;

import org.storydriven.modeling.interpreter.adapter.SDMainAdapterFactory;

import de.mdelab.sdm.interpreter.common.adapters.activity.IForEachFreshMatchStoryNodeAdapter;

public class SDForEachModifyingStoryNodeAdapter extends SDModifyingStoryNodeAdapter implements IForEachFreshMatchStoryNodeAdapter 
{

	public SDForEachModifyingStoryNodeAdapter(SDMainAdapterFactory mainAdapterFactory) 
	{
		super(mainAdapterFactory);
	}

}
