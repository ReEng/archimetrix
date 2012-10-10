package de.mdelab.sdm.interpreter.common.adapters.activity;

import java.util.Collection;

import de.mdelab.sdm.interpreter.common.SDMInterpreterException;

/**
 * @author Stephan Hildebrandt
 * @author Sebastian Wätzoldt
 */
public interface IForkJoinNodeAdapter extends IActivityNodeAdapter
{
	public Collection<IActivityNodeAdapter> getNextNodeAdapters();

	public IForkJoinNodeAdapter getCorrespondingJoinNodeAdapter() throws SDMInterpreterException;
}
