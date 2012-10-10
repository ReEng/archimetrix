package org.storydriven.modeling.interpreter.adapter.m3;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.ecore.util.EcoreAdapterFactory;
import org.storydriven.modeling.interpreter.adapter.SDMainAdapterFactory;

public class SDInternalM3AdapterFactory extends EcoreAdapterFactory
{
	private SDMainAdapterFactory	mainAdapterFactory;

	public SDInternalM3AdapterFactory(SDMainAdapterFactory mainAdapterFactory)
	{
		assert mainAdapterFactory != null;

		this.mainAdapterFactory = mainAdapterFactory;
	}

	@Override
	public Adapter createENamedElementAdapter()
	{
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	@Override
	public Adapter createEClassifierAdapter()
	{
		return new SDClassifierAdapter(mainAdapterFactory);
	}
}
