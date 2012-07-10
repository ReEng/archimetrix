package org.archimetrix.relevanceanalysis.ui.providers;


import org.archimetrix.relevanceanalysis.RelevanceResults;
import org.archimetrix.relevanceanalysis.ui.views.RelevantBadSmellsView;
import org.reclipse.structure.inference.annotations.ASGAnnotation;


/**
 * The content provider for the table in the Relevant Bad Smells View.
 * 
 * @author mcp
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 * 
 */
public class RelevantBadSmellsViewContentProvider extends AbstractRelevanceAnalysisViewContentProvider
{
   private final RelevantBadSmellsView relevantBadSmellsView;


   public RelevantBadSmellsViewContentProvider(final RelevantBadSmellsView relevantBadSmellsView)
   {
      this.relevantBadSmellsView = relevantBadSmellsView;
   }


   @SuppressWarnings("unchecked")
   @Override
   public Object[] getElements(final Object inputElement)
   {
      RelevanceResults<ASGAnnotation> results = (RelevanceResults<ASGAnnotation>) inputElement;
      this.relevantBadSmellsView.setRelevanceResults(results);
      Object[] elements = results.getRelevanceSubjects().toArray();

      return elements;
   }

}
