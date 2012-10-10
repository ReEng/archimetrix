package de.mdelab.sdm.interpreter.common.activity.adapters;

import de.mdelab.sdm.interpreter.common.SDMInterpreterException;

/**
 * The superclass of all adapters of activities. It provides operations to
 * access an activity's initial node and to start the execution of an activity.
 * 
 * @author Stephan Hildebrandt
 * @author Sebastian Wätzoldt
 * 
 * 
 */
public abstract class StoryActivityAdapter extends ActivityAdapter
{
	/**
	 * @param adapterFactory
	 *            The adapter factory that created this adapter.
	 */
	protected StoryActivityAdapter(ActivityAdapterFactory adapterFactory)
	{
		super(adapterFactory);
	}

	/**
	 * 
	 * @return The name of the activity.
	 */
	public abstract String getName();

	/**
	 * 
	 * @return An adapter of the initial node of the activity.
	 * @throws SDMInterpreterException
	 *             if the initial node could not be found or no adapter could be
	 *             created for it.
	 */
	public abstract ActivityNodeAdapter getInitialNodeAdapter() throws SDMInterpreterException;
}
