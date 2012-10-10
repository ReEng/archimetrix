package de.mdelab.sdm.interpreter.common.activity.adapters;

import java.util.Collection;

import de.mdelab.sdm.interpreter.common.SDMInterpreterException;

public abstract class ForkJoinNodeAdapter extends ActivityNodeAdapter
{
	protected ForkJoinNodeAdapter(ActivityAdapterFactory adapterFactory)
	{
		super(adapterFactory);
	}

	public abstract Collection<ActivityNodeAdapter> getNextNodes();

	public abstract ActivityNodeAdapter getCorrespondingNodeAdapter() throws SDMInterpreterException;
}
