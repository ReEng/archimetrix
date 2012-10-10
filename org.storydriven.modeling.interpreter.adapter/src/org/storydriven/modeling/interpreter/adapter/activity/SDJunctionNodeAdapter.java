package org.storydriven.modeling.interpreter.adapter.activity;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.storydriven.modeling.activities.ActivityEdge;
import org.storydriven.modeling.activities.JunctionNode;
import org.storydriven.modeling.activities.EdgeGuard;
import org.storydriven.modeling.interpreter.adapter.SDMainAdapterFactory;

import de.mdelab.sdm.interpreter.common.SDMInterpreterException;
import de.mdelab.sdm.interpreter.common.adapters.activity.IActivityDecisionMergeNodeAdapter;
import de.mdelab.sdm.interpreter.common.adapters.activity.IActivityNodeAdapter;
import de.mdelab.sdm.interpreter.common.adapters.expressions.IExpressionAdapter;

public class SDJunctionNodeAdapter extends SDActivityNodeAdapter<JunctionNode> implements IActivityDecisionMergeNodeAdapter
{

	public SDJunctionNodeAdapter(SDMainAdapterFactory mainAdapterFactory)
	{
		super(mainAdapterFactory);
	}
	
//	for MergeNodes
//	@Override
//	public Map<IExpressionAdapter, IActivityNodeAdapter> getNextNodesForBooleanCases()
//	{
//		return Collections.emptyMap();
//	}
	
	@Override
	public Map<IExpressionAdapter, IActivityNodeAdapter> getNextNodesForBooleanCases()
	{
		if(getElement().getOutgoings().size() == 1)
			// node is MergeNode
			return Collections.emptyMap();
		
		Map<IExpressionAdapter, IActivityNodeAdapter> returnMap = new HashMap<IExpressionAdapter, IActivityNodeAdapter>();
		
		for (ActivityEdge edge : getElement().getOutgoings())
		{
			if (edge.getGuard() == EdgeGuard.BOOL)
			{
				assert edge.getTarget() != null;
				assert edge.getGuardExpression() != null;
				
				if(edge.getTarget() != getElement())
					returnMap.put(getMainAdapterFactory().getSDExpressionsAdapterFactory().getExpressionAdapter(edge.getGuardExpression()),
							getMainAdapterFactory().getSDActivityAdapterFactory().getActivityNodeAdapter(edge.getTarget()));
			}
		}

		assert returnMap.size() > 0;

		return returnMap;
	}
	

//	for MergeNodes
//	@Override
//	public IActivityNodeAdapter getUnconditionalNextNode() throws SDMInterpreterException
//	{
//		assert getElement().getOutgoings().size() == 1;
//		assert getElement().getOutgoings().get(0).getTarget() != null;
//
//		return getMainAdapterFactory().getSDActivityAdapterFactory().getActivityNodeAdapter(getElement().getOutgoings().get(0).getTarget());
//	}
	
	@Override
	public IActivityNodeAdapter getUnconditionalNextNode() throws SDMInterpreterException
	{
		assert !getElement().getOutgoings().isEmpty();
		
		if(getElement().getOutgoings().size() == 1)
		{
			// node is MergeNode
			assert getElement().getOutgoings().get(0).getTarget() != null;
		
			return getMainAdapterFactory().getSDActivityAdapterFactory().getActivityNodeAdapter(getElement().getOutgoings().get(0).getTarget());
		}
		
		for (ActivityEdge edge : getElement().getOutgoings())
		{
			if (edge.getGuard() == EdgeGuard.ELSE)
			{
				assert edge.getTarget() != null;

				return getMainAdapterFactory().getSDActivityAdapterFactory().getActivityNodeAdapter(edge.getTarget());
			}
		}

		throw new SDMInterpreterException("There is no activity edge with guard type 'ELSE'.");
	}



}
