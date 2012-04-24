package org.archimetrix.relevanceanalysis.components.strategies;


import java.util.Set;

import metricvalues.MetricValuesModel;
import eu.qimpress.sourcecodedecorator.ComponentImplementingClassesLink;


/**
 * The class determines the pareto optimal candidates for the component relevance analysis. A
 * solution is called pareto optimal if and only if there is no solution that dominates this
 * solution. A solution y dominates a solution z iff for each i in [1..n], f_i(y)>=f_i(z) and it
 * exists an i in [1..n] such that f_i(y)>f_i(z).
 * 
 * @author mcp
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 * 
 */
public class ParetoOptimalComponentsResultStrategy extends ComponentsResultStrategy
{

   /**
    * Calculates the pareto optimality (1=true, 0=false).
    * 
    * @see org.archimetrix.relevanceanalysis.components.strategies.IComponentsStrategy#getRelevanceValue(eu.qimpress.sourcecodedecorator.ComponentImplementingClassesLink,
    *      metricvalues.MetricValuesModel)
    */
   @Override
   public double getRelevanceValue(final ComponentImplementingClassesLink component,
         final MetricValuesModel metricValuesModel)
   {
      Set<ComponentImplementingClassesLink> components = this.relevanceResults.getRelevanceSubjects();
      for (ComponentImplementingClassesLink otherComponent : components)
      {
         if (isDominatedByOtherComponent(component, otherComponent))
         {
            return 0;
         }
      }
      return 1;
   }


   /**
    * Calculates if a given component is dominated by the other given component by comparing the
    * relevance values from the relevance strategies. Relevance values <0 are ignored because they
    * come from non applicable strategies.
    * 
    * @param component
    * @param otherComponent
    * @return true if the component is dominated by otherComponent, else false 
    */
   public boolean isDominatedByOtherComponent(final ComponentImplementingClassesLink component,
         final ComponentImplementingClassesLink otherComponent)
   {
      boolean greater = false;
      Double[] relevanceValuesForComponent = this.relevanceResults.getRelevanceValues(component);
      for (int i = 0; i < relevanceValuesForComponent.length; i++)
      {
         Double value = relevanceValuesForComponent[i];
         if (value != null && value >= 0)
         {
            Double otherValue = this.relevanceResults.getRelevanceValues(otherComponent)[i];
            if (value > otherValue)
            {
               return false;
            }
            else if (otherValue > value)
            {
               greater = true;
            }
         }
      }
      return greater;
   }


}
