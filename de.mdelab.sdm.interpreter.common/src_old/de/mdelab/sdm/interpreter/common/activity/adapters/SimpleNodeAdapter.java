package de.mdelab.sdm.interpreter.common.activity.adapters;

import de.mdelab.sdm.interpreter.common.SDMInterpreterException;

public abstract class SimpleNodeAdapter extends ActivityNodeAdapter
{
	protected SimpleNodeAdapter(ActivityAdapterFactory adapterFactory)
	{
		super(adapterFactory);
	}

	/**
	 * 
	 * @param variablesManagerAdapter
	 *            Adapter of the variables manager to which scope the activity
	 *            node belongs.
	 * @return Adapter of the next activity node to be executed.
	 * @throws SDMInterpreterException
	 */
	public abstract ActivityNodeAdapter getNextNode() throws SDMInterpreterException;

}
