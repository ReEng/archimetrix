package org.storydriven.modeling.interpreter.adapter.activity;

import org.eclipse.emf.common.notify.Adapter;
import org.storydriven.modeling.interpreter.adapter.SDMainAdapterFactory;
import org.storydriven.modeling.util.SDMAdapterFactory;

public class SDInternalActivityAdapterFactory extends SDMAdapterFactory 
{
	private SDMainAdapterFactory	mainAdapterFactory;

	public SDInternalActivityAdapterFactory(SDMainAdapterFactory mainAdapterFactory)
	{
		assert mainAdapterFactory != null;

		this.mainAdapterFactory = mainAdapterFactory;
	}

	@Override
	public Adapter createExtendableElementAdapter()
	{
		return new SDStoryActivityAdapter(mainAdapterFactory);
	}
	
	@Override
	public Adapter createCommentableElementAdapter()
	{
		return new SDStoryActivityAdapter(mainAdapterFactory);
	}
}
