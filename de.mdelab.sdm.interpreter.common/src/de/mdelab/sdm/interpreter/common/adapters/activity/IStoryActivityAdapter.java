package de.mdelab.sdm.interpreter.common.adapters.activity;

import de.mdelab.sdm.interpreter.common.SDMInterpreterException;

/**
 * @author Stephan Hildebrandt
 * @author Sebastian Wätzoldt
 */
public interface IStoryActivityAdapter extends IActivityAdapter
{
	public IActivityNodeAdapter getInitialNodeAdapter() throws SDMInterpreterException;
}
