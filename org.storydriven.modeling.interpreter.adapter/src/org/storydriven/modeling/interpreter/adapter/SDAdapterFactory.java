package org.storydriven.modeling.interpreter.adapter;

import de.mdelab.sdm.interpreter.common.adapters.IAdapterFactory;

public class SDAdapterFactory implements IAdapterFactory
{
	private SDMainAdapterFactory	mainAdapterFactory;

	public SDAdapterFactory(SDMainAdapterFactory mainAdapterFactory)
	{
		assert mainAdapterFactory != null;

		this.mainAdapterFactory = mainAdapterFactory;
	}

	protected SDMainAdapterFactory getMainAdapterFactory()
	{
		return mainAdapterFactory;
	}
}
