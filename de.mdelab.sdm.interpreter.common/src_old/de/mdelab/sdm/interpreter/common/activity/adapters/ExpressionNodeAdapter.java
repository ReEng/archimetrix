package de.mdelab.sdm.interpreter.common.activity.adapters;

import java.util.List;

import de.mdelab.sdm.interpreter.common.expressions.adapters.ExpressionAdapter;

/**
 * Superclass of adapters of expression nodes. It provides operations to get an
 * adapter of the expression node's expressions.
 * 
 * @author Stephan Hildebrandt
 * @author Sebastian Wätzoldt
 * 
 * 
 */
public abstract class ExpressionNodeAdapter extends SimpleNodeAdapter
{
	protected ExpressionNodeAdapter(ActivityAdapterFactory adapterFactory)
	{
		super(adapterFactory);
	}

	/**
	 * 
	 * @param variablesManagerAdapter
	 *            Adapter of the variables manager to which scope this activity
	 *            node belongs.
	 * @return A list of expression adapters of all expressions of the
	 *         expression node.
	 */
	public abstract List<ExpressionAdapter> getExpressionAdapters();

}
