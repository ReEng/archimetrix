package org.archimetrix.relevanceanalysis.ui.providers;


import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;


/**
 * An abstract content provider for the tree viewers used in the relevance analysis ui.
 * 
 * @author mcp
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 * 
 */
public abstract class AbstractRelevanceAnalysisViewContentProvider implements ITreeContentProvider
{

   @Override
   public void dispose()
   {
   }


   @Override
   public void inputChanged(final Viewer viewer, final Object oldInput, final Object newInput)
   {
   }


   @Override
   public Object[] getChildren(final Object parentElement)
   {
      return null;
   }


   @Override
   public Object getParent(final Object element)
   {
      return null;
   }


   @Override
   public boolean hasChildren(final Object element)
   {
      return false;
   }

}
