package org.storydriven.modeling.interpreter.adapter.m3;

import org.storydriven.modeling.interpreter.adapter.SDMainAdapterFactory;

import de.mdelab.sdm.interpreter.common.adapters.m3.IPropertyValueIterator;

public abstract class SDPropertyValueIterator<PROPERTY_ADAPTER_TYPE extends SDPropertyAdapter> implements IPropertyValueIterator
{
	private SDMainAdapterFactory	mainAdapterFactory;
	private SDEObjectInstanceAdapter		instanceAdapter;
	private PROPERTY_ADAPTER_TYPE	propertyAdapter;

	public SDPropertyValueIterator(SDMainAdapterFactory mainAdapterFactory, SDEObjectInstanceAdapter instanceAdapter,
			PROPERTY_ADAPTER_TYPE propertyAdapter)
	{
		assert mainAdapterFactory != null;
		assert instanceAdapter != null;
		assert propertyAdapter != null;

		this.mainAdapterFactory = mainAdapterFactory;
		this.instanceAdapter = instanceAdapter;
		this.propertyAdapter = propertyAdapter;
	}

	protected SDMainAdapterFactory getMainAdapterFactory()
	{
		return mainAdapterFactory;
	}

	protected SDEObjectInstanceAdapter getInstanceAdapter()
	{
		return instanceAdapter;
	}

	protected PROPERTY_ADAPTER_TYPE getPropertyAdapter()
	{
		return propertyAdapter;
	}
}

