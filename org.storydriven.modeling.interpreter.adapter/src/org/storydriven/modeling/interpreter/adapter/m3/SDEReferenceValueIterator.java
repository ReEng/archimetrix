package org.storydriven.modeling.interpreter.adapter.m3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.EMap;
import org.storydriven.modeling.interpreter.adapter.SDMainAdapterFactory;

import de.mdelab.sdm.interpreter.common.adapters.m3.IInstanceAdapter;

public class SDEReferenceValueIterator extends SDPropertyValueIterator<SDEReferenceAdapter>
{

	private Iterator<Object>	featureIterator;
	private IInstanceAdapter keyInstanceAdapter;


   public SDEReferenceValueIterator(SDMainAdapterFactory mainAdapterFactory, IInstanceAdapter keyInstanceAdapter,
         SDEObjectInstanceAdapter instanceAdapter, SDEReferenceAdapter propertyAdapter)
   {
		super(mainAdapterFactory, instanceAdapter, propertyAdapter);
		this.keyInstanceAdapter = keyInstanceAdapter;
	}

	@SuppressWarnings("unchecked")
	@Override
	public IInstanceAdapter getNext()
	{
		if (featureIterator == null)
		{
			if (!getPropertyAdapter().getFeature().isMany())
			{
				List<Object> list = new ArrayList<Object>();
				
				Object value = null;

				if(this.keyInstanceAdapter == null)
				{
				   value = getInstanceAdapter().getEObject().eGet(getPropertyAdapter().getFeature());
				}
				else
				{
				   EMap<Object, Object> map = ((EMap<Object, Object>)getInstanceAdapter().getEObject().eGet(getPropertyAdapter().getFeature()));
				   value = map.get(keyInstanceAdapter.getValue());
				}

				if (value != null)
				{
					list.add(value);
				}

				featureIterator = list.iterator();
			}
			else
			{
			   if(keyInstanceAdapter == null)
			   {
			      featureIterator = ((List<Object>) getInstanceAdapter().getEObject().eGet(getPropertyAdapter().getFeature())).iterator();
			   }
				else
				{
				   EMap<Object, List> map = (EMap<Object, List>) getInstanceAdapter().getEObject().eGet(getPropertyAdapter().getFeature());
				   List list = map.get(keyInstanceAdapter.getValue());
				   if(list != null)
				   {
				      featureIterator = list.iterator();
				   }
				   else
				   {
				      featureIterator = Collections.emptyList().iterator();
				   }
				}
			}
		}

		if (featureIterator.hasNext())
		{
			return getMainAdapterFactory().getM3AdapterFactory().getInstanceAdapter(featureIterator.next(),
					getMainAdapterFactory().getM3AdapterFactory().getClassifierAdapter(getPropertyAdapter().getFeature().getEType()));
		}
		else
		{
			return null;
		}
	}
}
