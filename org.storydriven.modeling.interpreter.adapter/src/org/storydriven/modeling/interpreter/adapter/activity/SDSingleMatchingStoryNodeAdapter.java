package org.storydriven.modeling.interpreter.adapter.activity;

import org.storydriven.modeling.interpreter.adapter.SDMainAdapterFactory;

import de.mdelab.sdm.interpreter.common.adapters.activity.ISingleMatchStoryNodeAdapter;

public class SDSingleMatchingStoryNodeAdapter extends SDMatchingStoryNodeAdapter implements ISingleMatchStoryNodeAdapter
{
	
	public SDSingleMatchingStoryNodeAdapter(SDMainAdapterFactory mainAdapterFactory) 
	{
		super(mainAdapterFactory);
	}

}
