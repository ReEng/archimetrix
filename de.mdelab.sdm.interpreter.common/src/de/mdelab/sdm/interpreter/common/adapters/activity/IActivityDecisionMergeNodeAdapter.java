package de.mdelab.sdm.interpreter.common.adapters.activity;

import java.util.Map;

import de.mdelab.sdm.interpreter.common.SDMInterpreterException;
import de.mdelab.sdm.interpreter.common.adapters.expressions.IExpressionAdapter;

/**
 * @author Stephan Hildebrandt
 * @author Sebastian Wätzoldt
 */
public interface IActivityDecisionMergeNodeAdapter extends IActivityNodeAdapter
{
	public Map<IExpressionAdapter, IActivityNodeAdapter> getNextNodesForBooleanCases();

	public IActivityNodeAdapter getUnconditionalNextNode() throws SDMInterpreterException;
}
