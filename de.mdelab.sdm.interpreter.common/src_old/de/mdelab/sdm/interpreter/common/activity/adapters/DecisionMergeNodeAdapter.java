package de.mdelab.sdm.interpreter.common.activity.adapters;

import java.util.Map;

import de.mdelab.sdm.interpreter.common.SDMInterpreterException;
import de.mdelab.sdm.interpreter.common.expressions.adapters.ExpressionAdapter;

/**
 * Superclass of all adapters of decision nodes. It provides operations to
 * access the adapters of possible subsequent nodes.
 * 
 * @author Stephan Hildebrandt
 * @author Sebastian Wätzoldt
 * 
 * 
 */
public abstract class DecisionMergeNodeAdapter extends ActivityNodeAdapter
{
	protected DecisionMergeNodeAdapter(ActivityAdapterFactory adapterFactory)
	{
		super(adapterFactory);
	}

	/**
	 * 
	 * @param variablesManagerAdapter
	 *            Adapter of the variables manager to which scope the activity
	 *            node belongs.
	 * @return A map that contains adapters of all possible subsequent activity
	 *         nodes connected via edges with a boolean condition. The map maps
	 *         the adapter of the condition to the adapter of the activity node.
	 */
	public abstract Map<ExpressionAdapter, ActivityNodeAdapter> getNextNodesForBooleanCases();

	/**
	 * 
	 * @param variablesManagerAdapter
	 *            Adapter of the variables manager to which scope the activity
	 *            node belongs.
	 * @return The adapter of the subsequent activity node for the ELSE case.
	 * @throws SDMInterpreterException
	 */
	public abstract ActivityNodeAdapter getUnconditionalNextNode() throws SDMInterpreterException;
}
