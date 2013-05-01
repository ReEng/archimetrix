package org.archimetrix.relevanceanalysis.components.strategies;


import metricvalues.MetricValuesModel;
import org.somox.sourcecodedecorator.ComponentImplementingClassesLink;


/**
 * The class determines the length of the vector from the origin for the component relevance
 * analysis.
 * 
 * @author mcp
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 * 
 */
public class VectorLengthComponentsResultStrategy extends ComponentsResultStrategy
{


   @Override
   public double getRelevanceValue(final ComponentImplementingClassesLink component,
         final MetricValuesModel metricValuesModel)
   {
      // calculate the length of the vector from the origin
      double sum = 0;
      Double[] relevanceValues = this.relevanceResults.getRelevanceValues(component);
      int numberOfConsideredStrategies = 0;
      for (Double value : relevanceValues)
      {
         if (value != null && value >= 0)
         {
            numberOfConsideredStrategies++;
            // values <0 are ignored because they come from non applicable strategies
            sum += value * value;
         }
      }
      if (numberOfConsideredStrategies == 0)
      {
         return 1; // maximal relevance for bad smells without relevance strategies
      }
      double length = Math.sqrt(sum);

      // normalize vector
      double normalizedLength = length / Math.sqrt(numberOfConsideredStrategies);
      return normalizedLength;
   }


}
