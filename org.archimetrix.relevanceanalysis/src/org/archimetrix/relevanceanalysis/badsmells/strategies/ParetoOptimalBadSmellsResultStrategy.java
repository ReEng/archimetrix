package org.archimetrix.relevanceanalysis.badsmells.strategies;


import java.util.Set;

import metricvalues.ComponentCandidate;
import metricvalues.MetricValuesModel;

import org.archimetrix.relevanceanalysis.badsmells.util.BadSmellOccurrenceUtil;
import org.reclipse.structure.inference.annotations.ASGAnnotation;


/**
 * The class determines the pareto optimal bad smell occurrences for the bad smell relevance
 * analysis. A solution is called pareto optimal if and only if there is no solution that dominates
 * this solution. A solution y dominates a solution z iff for each i in [1..n], f_i(y)>=f_i(z) and
 * it exists an i in [1..n] such that f_i(y)>f_i(z).
 * 
 * @author mcp
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 * 
 */
public class ParetoOptimalBadSmellsResultStrategy extends BadSmellsResultStrategy
{

   /**
    * Calculates the pareto optimality (1=true, 0=false). Only bad smell occurrences of the same
    * type are considered.
    * 
    * @see org.archimetrix.relevanceanalysis.badsmells.strategies.IBadSmellsStrategy#getRelevanceValue(org.reclipse.structure.inference.annotations.ASGAnnotation,
    *      metricvalues.ComponentCandidate, metricvalues.MetricValuesModel)
    */
   @Override
   public double getRelevanceValue(final ASGAnnotation badSmellAnnotation, final ComponentCandidate comp,
         final MetricValuesModel metricValuesModel)
   {
      Set<ASGAnnotation> annotations = this.relevanceResults.getRelevanceSubjects();
      for (ASGAnnotation otherAnnotation : annotations)
      {
         if (BadSmellOccurrenceUtil.get().getBadSmellName(badSmellAnnotation)
               .equals(BadSmellOccurrenceUtil.get().getBadSmellName(otherAnnotation)))
         {
            if (isDominatedByOtherAnnotation(badSmellAnnotation, otherAnnotation))
            {
               return 0;
            }
         }
      }
      return 1;
   }

   /**
    * Calculates if a given annotation is dominated by the other given annotation by comparing the
    * relevance values from the relevance strategies. Relevance values <0 are ignored because they
    * come from non applicable strategies.
    * 
    * @param annotation
    * @param otherAnnotation
    * @return true if the annotation is dominated by otherAnnotation, else false 
    */
   private boolean isDominatedByOtherAnnotation(final ASGAnnotation annotation, final ASGAnnotation otherAnnotation)
   {
      boolean greater = false;
      Double[] relevanceValuesForAnnotation = this.relevanceResults.getRelevanceValues(annotation);
      for (int i = 0; i < relevanceValuesForAnnotation.length; i++)
      {
         Double value = relevanceValuesForAnnotation[i];
         if (value != null && value >= 0)
         {
            Double otherValue = this.relevanceResults.getRelevanceValues(otherAnnotation)[i];
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
