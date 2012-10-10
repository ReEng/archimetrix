package org.storydriven.modeling.interpreter.adapter.activity;

import org.storydriven.modeling.ExtendableElement;
import org.storydriven.modeling.interpreter.adapter.SDAdapter;
import org.storydriven.modeling.interpreter.adapter.SDMainAdapterFactory;

import de.mdelab.sdm.interpreter.common.adapters.activity.IActivityAdapter;

public abstract class SDActivityAdapter<ELEMENT_TYPE extends ExtendableElement> extends SDAdapter<ELEMENT_TYPE> implements IActivityAdapter
{

	public SDActivityAdapter(SDMainAdapterFactory mainAdapterFactory)
	{
		super(mainAdapterFactory);
	}

	@Override
	public boolean isAdapterForType(Object type)
	{
		return type == getMainAdapterFactory().getActivityAdapterFactory();
	}

}
