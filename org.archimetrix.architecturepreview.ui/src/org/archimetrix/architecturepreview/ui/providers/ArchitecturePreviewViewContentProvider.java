package org.archimetrix.architecturepreview.ui.providers;


import java.util.List;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;


/**
 * This class provides the content of the main table in the Architecture Preview View.
 * 
 * @author mcp
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 * 
 */
public class ArchitecturePreviewViewContentProvider implements ITreeContentProvider
{


   @SuppressWarnings("unchecked")
   @Override
   public Object[] getElements(final Object inputElement)
   {
      return ((List<List<String>>) inputElement).toArray();
   }


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
