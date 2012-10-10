package de.mdelab.sdm.interpreter.common.activity.adapters;


/**
 * Superclass of all adapters of activity nodes. This class defines operations
 * to execute a node and to get the next activity node to execute.
 * 
 * @author Stephan Hildebrandt
 * @author Sebastian Wätzoldt
 * 
 * 
 */
public abstract class ActivityNodeAdapter extends ActivityAdapter
{
	/**
	 * 
	 * @param adapterFactory
	 *            The adapter factory that created this adapter.
	 */
	protected ActivityNodeAdapter(ActivityAdapterFactory adapterFactory)
	{
		super(adapterFactory);
	}

	/**
	 * 
	 * @return The name of the activity node.
	 */
	public abstract String getName();

	/**
	 * 
	 * @return The type of the activity node.
	 */
	public abstract Object getNodeType();


}
