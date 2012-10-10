package org.storydriven.modeling.interpreter.adapter.m3;

import org.eclipse.emf.ecore.EObject;
import org.storydriven.modeling.interpreter.adapter.SDMainAdapterFactory;

import de.mdelab.sdm.interpreter.common.adapters.m3.IInstanceAdapter;

public class SDEContainerValueIterator extends SDPropertyValueIterator<SDEContainerPropertyAdapter>
{
	private SDEObjectInstanceAdapter	lastValue;
	private boolean						indirectContainers;

	public SDEContainerValueIterator(SDMainAdapterFactory mainAdapterFactory, SDEObjectInstanceAdapter instanceAdapter,
			SDEContainerPropertyAdapter propertyAdapter, boolean indirectContainers)
	{
		super(mainAdapterFactory, instanceAdapter, propertyAdapter);

		this.indirectContainers = indirectContainers;
	}

	@Override
	public IInstanceAdapter getNext()
	{
		if (lastValue == null)
		{
			assert getInstanceAdapter().getValue() instanceof EObject;

			EObject container = ((EObject) getInstanceAdapter().getValue()).eContainer();

			if (container != null)
			{
				lastValue = (SDEObjectInstanceAdapter) getMainAdapterFactory().getM3AdapterFactory().getInstanceAdapter(container,
						getMainAdapterFactory().getM3AdapterFactory().getClassifierAdapter(container.eClass()));

				return lastValue;
			}
		}
		else if (indirectContainers)
		{
			EObject container = lastValue.getEObject().eContainer();

			if (container != null)
			{
				lastValue = (SDEObjectInstanceAdapter) getMainAdapterFactory().getM3AdapterFactory().getInstanceAdapter(container,
						getMainAdapterFactory().getM3AdapterFactory().getClassifierAdapter(container.eClass()));

				return lastValue;
			}
		}

		return null;
	}
}

