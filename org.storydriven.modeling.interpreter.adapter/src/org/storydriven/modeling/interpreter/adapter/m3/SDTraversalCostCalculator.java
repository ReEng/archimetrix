package org.storydriven.modeling.interpreter.adapter.m3;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;

import de.mdelab.sdm.interpreter.common.adapters.m3.IPropertyAdapter;

public class SDTraversalCostCalculator 
{
	
	public int calculateTraversalCost(EObject instance, IPropertyAdapter ownedPropertyAdapter, IPropertyAdapter targetPropertyAdapter)
	{
		if (ownedPropertyAdapter instanceof SDEStructuralFeaturePropertyAdapter<?>)
		{
			return ((SDEStructuralFeaturePropertyAdapter) ownedPropertyAdapter).getTraversalCost(instance);
		}
		else if (ownedPropertyAdapter instanceof SDEContainerPropertyAdapter)
		{
			if (((SDEContainerPropertyAdapter) ownedPropertyAdapter).isIndirectContainment())
			{
				/*
				 * The containment hierarchy may be arbitrarily deep. However,
				 * in general it is probably rather shallow.
				 */
				return 5;
			}
			else
			{
				/*
				 * There is only one direct container which is returned by
				 * eContainer(). This is probably rather inexpensive.
				 */
				return 2;
			}
		}
		else if (ownedPropertyAdapter instanceof SDContainmentPropertyAdapter)
		{
			/*
			 * We can hardly make a guess about the traversal cost of the whole containment hierarchy.
			 */
			return Integer.MAX_VALUE;
		}
		else if (ownedPropertyAdapter instanceof SDMapEntryReferencePropertyAdapter)
		{
			/*
			 * The traversal cost is the number of map entries.
			 */
			int cost = ((EMap<?,?>)instance.eGet(((SDMapEntryReferencePropertyAdapter) ownedPropertyAdapter).geteReference())).size();
			
			if (targetPropertyAdapter instanceof SDMapEntryKeyPropertyAdapter)
			{
				return cost;
			}
			else if (targetPropertyAdapter instanceof SDMapEntryValuePropertyAdapter)
			{
				/*
				 * It is better to match the keys first, therefore increase the cost for values.
				 */
				return cost + 1;
			}
			else
			{
				throw new RuntimeException("Unexpected kind of target property adapter: " + targetPropertyAdapter);
			}
		}
		else if (ownedPropertyAdapter instanceof SDMapEntryValuePropertyAdapter)
      {
		   return 100;
      }
		else if (ownedPropertyAdapter instanceof SDBackwardNavigablePropertyAdapter
		      || ownedPropertyAdapter instanceof SDPathAdapter)
      {
         return 1000000;
      }
		else
		{
			throw new UnsupportedOperationException();
		}
	}
}
