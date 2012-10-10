package de.mdelab.sdm.interpreter.common.adapters.m3;

import de.mdelab.sdm.interpreter.common.adapters.IAdapterFactory;

/**
 * @author Stephan Hildebrandt
 * @author Sebastian Wätzoldt
 */
public interface IM3AdapterFactory extends IAdapterFactory
{
	public IClassifierAdapter getClassifierAdapter(Object classifier);

	// public IAssociationAdapter getAssociationAdapter(Object association);

	// public IPropertyAdapter getPropertyAdapter(Object feature);

	public IInstanceAdapter createNewInstance(IClassifierAdapter classifierAdapter);

	public IInstanceAdapter getInstanceAdapter(Object instance, IClassifierAdapter classifierAdapter);
}
