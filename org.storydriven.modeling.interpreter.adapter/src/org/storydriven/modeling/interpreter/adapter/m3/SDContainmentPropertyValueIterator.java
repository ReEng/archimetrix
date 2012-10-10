package org.storydriven.modeling.interpreter.adapter.m3;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.storydriven.modeling.interpreter.adapter.SDMainAdapterFactory;

import de.mdelab.sdm.interpreter.common.adapters.m3.IInstanceAdapter;

public class SDContainmentPropertyValueIterator extends SDPropertyValueIterator<SDContainmentPropertyAdapter>
{
	private TreeIterator<EObject>	iterator;

	public SDContainmentPropertyValueIterator(SDMainAdapterFactory mainAdapterFactory, IInstanceAdapter instanceAdapter,
			SDContainmentPropertyAdapter propertyAdapter)
	{
		super(mainAdapterFactory, (SDEObjectInstanceAdapter) instanceAdapter, propertyAdapter);
	}

	@Override
	public IInstanceAdapter getNext()
	{
		if (iterator == null)
		{
			iterator = getInstanceAdapter().getEObject().eAllContents();
		}

		if (iterator.hasNext())
		{
			EObject eObject = iterator.next();

			return getMainAdapterFactory().getSDM3AdapterFactory().getInstanceAdapter(eObject,
					getMainAdapterFactory().getSDM3AdapterFactory().getClassifierAdapter(eObject.eClass()));
		}
		else
		{
			return null;
		}
	}

}
