package de.mdelab.sdm.interpreter.common;

import de.mdelab.sdm.interpreter.common.activity.adapters.ActivityAdapterFactory;

public abstract class SDMInterpreterAdapterFactory extends AdapterFactoryFactory
{
	public abstract ActivityAdapterFactory getActivityAdapterFactory();
}
