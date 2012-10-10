package de.mdelab.sdm.interpreter.common.adapters.m3;

/**
 * @author Stephan Hildebrandt
 * @author Sebastian Wätzoldt
 */
public interface IPropertyAdapter extends IM3Adapter
{
	public boolean isNavigable();

	public IClassifierAdapter getClassifierAdapter();

	public String getName();
}
