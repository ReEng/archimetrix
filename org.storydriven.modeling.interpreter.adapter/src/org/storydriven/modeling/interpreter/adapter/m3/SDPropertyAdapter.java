package org.storydriven.modeling.interpreter.adapter.m3;

import java.util.List;
import java.util.Map;

import org.storydriven.modeling.interpreter.adapter.SDMainAdapterFactory;

import de.mdelab.sdm.interpreter.common.adapters.m3.IInstanceAdapter;
import de.mdelab.sdm.interpreter.common.adapters.m3.IPropertyAdapter;

public abstract class SDPropertyAdapter  implements IPropertyAdapter
{
	private SDMainAdapterFactory			mainAdapterFactory;

	private List<SDPropertyAdapter>	oppositePropertyAdapters;

	public SDPropertyAdapter(SDMainAdapterFactory mainAdapterFactory)
	{
		assert mainAdapterFactory != null;

		this.mainAdapterFactory = mainAdapterFactory;
	}

	protected SDMainAdapterFactory getMainAdapterFactory()
	{
		return mainAdapterFactory;
	}

	public abstract SDPropertyValueIterator<? extends SDPropertyAdapter> createPropertyTargetIterator(
	      IInstanceAdapter keyInstanceAdapter, SDEObjectInstanceAdapter instanceAdapter, SDPropertyAdapter targetProperty,
			Map<IPropertyAdapter, IInstanceAdapter> otherBoundProperties);
	
	public abstract IInstanceAdapter getPropertySetValue(IInstanceAdapter keyInstanceAdapter,
         SDEObjectInstanceAdapter instanceAdapter, SDPropertyAdapter targetProperty);

	public abstract void setValue(IInstanceAdapter keyInstanceAdapter, SDEObjectInstanceAdapter instanceAdapter, SDInstanceAdapter valueAdapter);

	public abstract boolean containsValue(IInstanceAdapter keyInstanceAdapter, IInstanceAdapter instanceAdapter, SDInstanceAdapter valueAdapter,
			SDPropertyAdapter targetPropertyAdapter);

	public List<SDPropertyAdapter> getOppositePropertyAdapters()
	{
		return oppositePropertyAdapters;
	}

	public void setOppositePropertyAdapters(List<SDPropertyAdapter> oppositePropertyAdapters)
	{
		this.oppositePropertyAdapters = oppositePropertyAdapters;
	}
}
