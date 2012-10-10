package org.storydriven.modeling.interpreter.adapter.m3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.storydriven.modeling.interpreter.adapter.SDMainAdapterFactory;

import de.mdelab.sdm.interpreter.common.adapters.m3.IInstanceAdapter;

public class SDEAttributeValueIterator extends SDPropertyValueIterator<SDEAttributeAdapter>
{
	public SDEAttributeValueIterator(SDMainAdapterFactory mainAdapterFactory, SDEObjectInstanceAdapter instanceAdapter,
			SDEAttributeAdapter propertyAdapter)
	{
		super(mainAdapterFactory, instanceAdapter, propertyAdapter);
	}

	private Iterator<Object>	featureIterator;

	@SuppressWarnings("unchecked")
	@Override
	public IInstanceAdapter getNext()
	{
		if (featureIterator == null)
		{
			if (!getPropertyAdapter().getFeature().isMany())
			{
				List<Object> list = new ArrayList<Object>();
				list.add(getInstanceAdapter().getEObject().eGet(getPropertyAdapter().getFeature()));
				featureIterator = list.iterator();
			}
			else
			{
				((List<Object>) ((EObject) getInstanceAdapter().getValue()).eGet(getPropertyAdapter().getFeature())).iterator();
			}
		}

		if (featureIterator.hasNext())
		{
			return getMainAdapterFactory().getM3AdapterFactory().getInstanceAdapter(featureIterator.next(),
					getMainAdapterFactory().getM3AdapterFactory().getClassifierAdapter(getPropertyAdapter().getFeature()));
		}
		else
		{
			return null;
		}
	}
}
