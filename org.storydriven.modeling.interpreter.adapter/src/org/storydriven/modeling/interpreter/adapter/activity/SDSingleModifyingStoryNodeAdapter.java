package org.storydriven.modeling.interpreter.adapter.activity;

import org.storydriven.modeling.interpreter.adapter.SDMainAdapterFactory;

import de.mdelab.sdm.interpreter.common.adapters.activity.ISingleMatchStoryNodeAdapter;

public class SDSingleModifyingStoryNodeAdapter extends SDModifyingStoryNodeAdapter implements ISingleMatchStoryNodeAdapter 
{

	public SDSingleModifyingStoryNodeAdapter(SDMainAdapterFactory mainAdapterFactory) 
	{
		super(mainAdapterFactory);
	}

}
