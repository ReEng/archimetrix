package de.mdelab.sdm.interpreter.common.adapters.activity;

/**
 * @author Stephan Hildebrandt
 * @author Sebastian Wätzoldt
 */
public interface ISimpleNodeAdapter extends IActivityNodeAdapter
{
	public IActivityNodeAdapter getNextNodeAdapter();
}
