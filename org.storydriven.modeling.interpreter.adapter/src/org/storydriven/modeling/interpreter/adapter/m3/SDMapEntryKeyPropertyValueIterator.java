package org.storydriven.modeling.interpreter.adapter.m3;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.storydriven.modeling.interpreter.adapter.SDMainAdapterFactory;

import de.mdelab.sdm.interpreter.common.adapters.m3.IInstanceAdapter;
import de.mdelab.sdm.interpreter.common.adapters.m3.IPropertyAdapter;

public class SDMapEntryKeyPropertyValueIterator extends SDPropertyValueIterator<SDMapEntryReferencePropertyAdapter>
{
	private Iterator<Entry<Object, Object>>	featureIterator;
	private Map<IPropertyAdapter, IInstanceAdapter> otherBoundProperties;

	public SDMapEntryKeyPropertyValueIterator(SDMainAdapterFactory mainAdapterFactory, SDEObjectInstanceAdapter instanceAdapter,
			SDMapEntryReferencePropertyAdapter propertyAdapter, Map<IPropertyAdapter, IInstanceAdapter> otherBoundProperties)
	{
		super(mainAdapterFactory, instanceAdapter, propertyAdapter);
		
		assert otherBoundProperties != null;
		
		this.otherBoundProperties = otherBoundProperties;
	}

	@SuppressWarnings("unchecked")
	@Override
	public IInstanceAdapter getNext()
	{
		if (featureIterator == null)
		{
			featureIterator = ((EMap<Object, Object>) getInstanceAdapter().getEObject().eGet(getPropertyAdapter().geteReference()))
					.iterator();
		}

		if (featureIterator.hasNext())
		{
			EClass mapEntryEClass = (EClass) getPropertyAdapter().geteReference().getEType();

			EClassifier keyClassifier = mapEntryEClass.getEStructuralFeature("key").getEType();

			/*
			 * Check if the value is already bound to an instance object.
			 */
			IInstanceAdapter boundValueInstanceAdapter = otherBoundProperties.get(getPropertyAdapter().getValuePropertyAdapter());

			if (boundValueInstanceAdapter == null)
			{
				/*
				 * There is no bound value. Return the next key of the map.
				 */
				return getMainAdapterFactory().getM3AdapterFactory().getInstanceAdapter(featureIterator.next().getKey(),
						getMainAdapterFactory().getM3AdapterFactory().getClassifierAdapter(keyClassifier));
			}
			else
			{
				/*
				 * The value is already bound. Find the next key that has this
				 * value.
				 */
				Entry<Object, Object> entry;

				do
				{
					entry = featureIterator.next();

					if (entry.getValue() == boundValueInstanceAdapter.getValue())
					{
						return getMainAdapterFactory().getM3AdapterFactory().getInstanceAdapter(entry.getKey(),
								getMainAdapterFactory().getM3AdapterFactory().getClassifierAdapter(keyClassifier));

					}
				}
				while (featureIterator.hasNext());

				/*
				 * There is no key with this value.
				 */
				return null;
			}
		}
		else
		{
			/*
			 * All possible values have already been returned.
			 */
			return null;
		}
	}

}
