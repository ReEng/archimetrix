package de.mdelab.sdm.interpreter.common.adapters;

import de.mdelab.sdm.interpreter.common.AdapterFactoryFactory;


public abstract class AdapterFactory
{
	private AdapterFactoryFactory	parentFactory;

	public AdapterFactory(AdapterFactoryFactory parentFactory)
	{
		this.parentFactory = parentFactory;
	}

	public AdapterFactoryFactory getParentFactory()
	{
		return parentFactory;
	}



}
