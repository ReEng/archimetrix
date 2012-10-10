package de.mdelab.sdm.interpreter.common.storypatternmatcher.strategies;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import de.mdelab.sdm.interpreter.common.adapters.m3.IInstanceAdapter;
import de.mdelab.sdm.interpreter.common.adapters.storypattern.IStoryPatternLinkAdapter;
import de.mdelab.sdm.interpreter.common.adapters.storypattern.IStoryPatternLinkEndAdapter;
import de.mdelab.sdm.interpreter.common.adapters.storypattern.IStoryPatternObjectAdapter;
import de.mdelab.sdm.interpreter.common.storypatternmatcher.MatchingState;
import de.mdelab.sdm.interpreter.common.variables.VariableScope;

/**
 * @author Stephan Hildebrandt
 * @author Sebastian Wätzoldt
 */
public class MatchingStrategy
{

	public NextBindingInfo getNextLinkEndForBinding(MatchingState matchingState, VariableScope variableScope)
	{

		NextBindingInfo nextBindingInfo = new NextBindingInfo();
		int lowestCardinality = -1;

		/*
		 * Iterate through all unchecked links
		 */
		for (IStoryPatternLinkAdapter l : matchingState.uncheckedSPL)
		{
			IStoryPatternLinkEndAdapter sourceLinkEndAdapter = null;
			List<IStoryPatternLinkEndAdapter> targetLinkEnds = new ArrayList<IStoryPatternLinkEndAdapter>();
			Map<IStoryPatternLinkEndAdapter, Object> otherBoundLinkEnds = new HashMap<IStoryPatternLinkEndAdapter, Object>();

			/*
			 * Find a suitable source object
			 */
			for (IStoryPatternLinkEndAdapter linkEndAdapter : l.getLinkEndAdapters())
			{
				IStoryPatternObjectAdapter s = linkEndAdapter.getStoryPatternObjectAdapter();

				if (matchingState.boundSPO.contains(s))
				{
					/*
					 * If this link end is navigable and we do not have a source
					 * spo yet, use this spo as the source.
					 */
					if (sourceLinkEndAdapter == null && linkEndAdapter.getPropertyAdapter().isNavigable())
					{
						sourceLinkEndAdapter = linkEndAdapter;
					}
					/*
					 * Otherwise, use this spo as another bound link end.
					 */
					else
					{
						otherBoundLinkEnds.put(linkEndAdapter, variableScope.getVariable(s.getName()).getValueAdapter());
					}
				}
				/*
				 * This is a target link end for which we have to find out its
				 * cardinality.
				 */
				else
				{
					targetLinkEnds.add(linkEndAdapter);
				}
			}

			/*
			 * If there is a source link end from where we can navigate, find
			 * the cheapest target link end.
			 */
			if (sourceLinkEndAdapter != null)
			{
				IInstanceAdapter sourceInstanceAdapter = variableScope.getVariable(
						sourceLinkEndAdapter.getStoryPatternObjectAdapter().getName()).getValueAdapter();

				assert sourceInstanceAdapter != null;

				/*
				 * Find target link end with lowest cardinality
				 */
				for (IStoryPatternLinkEndAdapter targetLinkEndAdapter : targetLinkEnds)
				{
					if (targetLinkEndAdapter.getStoryPatternObjectAdapter() != null)
               {
                  int c = sourceInstanceAdapter.getPropertyCardinality(sourceLinkEndAdapter.getPropertyAdapter(),
                        targetLinkEndAdapter.getPropertyAdapter());
                  if (c < lowestCardinality || lowestCardinality < 0)
                  {
                     nextBindingInfo.targetLinkEndAdapter = targetLinkEndAdapter;
                     nextBindingInfo.sourceLinkEndAdapter = sourceLinkEndAdapter;
                     nextBindingInfo.sourceInstanceAdapter = sourceInstanceAdapter;

                     lowestCardinality = c;

                     if (c == 1)
                     {
                        break;
                     }
                  }
               }
				}
			}
		}

		if (nextBindingInfo.targetLinkEndAdapter == null)
		{
			nextBindingInfo = null;
		}

		return nextBindingInfo;
	}
}
