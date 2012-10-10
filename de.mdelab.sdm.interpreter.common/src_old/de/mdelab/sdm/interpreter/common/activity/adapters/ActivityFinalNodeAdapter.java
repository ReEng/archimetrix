package de.mdelab.sdm.interpreter.common.activity.adapters;

import de.mdelab.sdm.interpreter.common.expressions.adapters.ExpressionAdapter;

/**
 * Superclass of all adapters of activity final nodes. Provides an operation to
 * get the return value expression of the final node.
 * 
 * @author Stephan Hildebrandt
 * @author Sebastian Wätzoldt
 * 
 */
public abstract class ActivityFinalNodeAdapter extends ActivityNodeAdapter
{
	/**
	 * 
	 * @param adapterFactory
	 *            The adapter factory that created this adapter.
	 */
	protected ActivityFinalNodeAdapter(ActivityAdapterFactory adapterFactory)
	{
		super(adapterFactory);
	}

	/**
	 * 
	 * @return The adapter of the return value expression of the final node.
	 */
	public abstract ExpressionAdapter getReturnValueExpressionAdapter();
}
