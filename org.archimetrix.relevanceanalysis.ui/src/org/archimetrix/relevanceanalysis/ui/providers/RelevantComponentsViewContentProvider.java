package org.archimetrix.relevanceanalysis.ui.providers;


import org.archimetrix.relevanceanalysis.RelevanceResults;
import org.archimetrix.relevanceanalysis.ui.views.RelevantComponentsView;
import org.somox.sourcecodedecorator.ComponentImplementingClassesLink;


/**
 * The content provider for the table in the Relevant Components View.
 * 
 * @author mcp
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 * 
 */
public class RelevantComponentsViewContentProvider extends AbstractRelevanceAnalysisViewContentProvider
{


   private final RelevantComponentsView relevantComponentsView;


   public RelevantComponentsViewContentProvider(final RelevantComponentsView relevantComponentsView)
   {
      this.relevantComponentsView = relevantComponentsView;
   }


   @SuppressWarnings("unchecked")
   @Override
   public Object[] getElements(final Object inputElement)
   {
      RelevanceResults<ComponentImplementingClassesLink> results = (RelevanceResults<ComponentImplementingClassesLink>) inputElement;
      this.relevantComponentsView.setRelevanceResults(results);
      Object[] elements = results.getRelevanceSubjects().toArray();

      return elements;
   }


}
