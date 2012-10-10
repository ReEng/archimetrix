package org.storydriven.modeling.interpreter.adapter.m3;

import org.eclipse.emf.common.notify.Notifier;
import org.storydriven.modeling.interpreter.adapter.SDAdapter;
import org.storydriven.modeling.interpreter.adapter.SDMainAdapterFactory;

public class SDM3Adapter<ELEMENT_TYPE extends Notifier> extends SDAdapter<ELEMENT_TYPE>
{

	public SDM3Adapter(SDMainAdapterFactory mainAdapterFactory)
	{
		super(mainAdapterFactory);
	}

	@Override
	public boolean isAdapterForType(Object type)
	{
		return type == getMainAdapterFactory().getM3AdapterFactory();
	}
}
