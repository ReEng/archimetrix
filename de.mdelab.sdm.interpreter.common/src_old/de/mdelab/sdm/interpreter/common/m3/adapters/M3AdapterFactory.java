package de.mdelab.sdm.interpreter.common.m3.adapters;

import de.mdelab.sdm.interpreter.common.SDMInterpreterAdapterFactory;
import de.mdelab.sdm.interpreter.common.adapters.AdapterFactory;

public abstract class M3AdapterFactory extends AdapterFactory
{

	public M3AdapterFactory(SDMInterpreterAdapterFactory mainAdapterFactory)
	{
		super(mainAdapterFactory);

		assert mainAdapterFactory != null;
	}

	public abstract ClassifierAdapter getClassifierAdapter(Object classifier);

}
