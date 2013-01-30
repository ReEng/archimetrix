package org.archimetrix.relevanceanalysis.ui.views;

import org.archimetrix.relevanceanalysis.RelevanceResults;
import org.archimetrix.relevanceanalysis.badsmells.strategies.IBadSmellsStrategy;
import org.archimetrix.relevanceanalysis.badsmells.util.RelevanceResultsStorage;
import org.archimetrix.relevanceanalysis.components.strategies.IComponentsStrategy;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerSorter;
import org.reclipse.structure.inference.annotations.ASGAnnotation;

public class RelevantDeficienciesSorter extends ViewerSorter
{
   @Override
   public int compare(final Viewer viewer, final Object e1, final Object e2)
   {
      ASGAnnotation a1 = (ASGAnnotation) e1;
      ASGAnnotation a2 = (ASGAnnotation) e2;

      RelevanceResults<ASGAnnotation> relevanceResults = RelevanceResultsStorage.retrieveRelevantDeficiencies(a1.eResource());
      
      if (relevanceResults != null)
      {
         // The last elements in the arrays are the total relevance values.
         Double totalRankA1 = relevanceResults.getRelevanceValues(a1)[IBadSmellsStrategy.NO_OF_RANKING_METRICS];
         Double totalRankA2 = relevanceResults.getRelevanceValues(a2)[IBadSmellsStrategy.NO_OF_RANKING_METRICS];
         // Multiply comparison by -1 to ensure a reverse sorting order.
         return -1 * totalRankA1.compareTo(totalRankA2);
      }
      
      return 0;
   };
}
