package org.fujaba.commons.ui;


import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;


/**
 * This viewer filter shows files only when they have adequate extensions.
 * 
 * @version $Revision$ $Date$
 * @author Last editor: $Author$
 * @author harka
 */
public class FileExtensionViewerFilter extends ViewerFilter
{

   private final String[] extensions;


   public FileExtensionViewerFilter(String[] extensions)
   {
      this.extensions = extensions;
   }


   public FileExtensionViewerFilter(String extension)
   {
      this(new String[] { extension });
   }


   public FileExtensionViewerFilter()
   {
      this(WorkbenchFileTreeSelectionDialog.ALL);
   }


   @Override
   public boolean select(Viewer viewer, Object parent, Object element)
   {
      if (element instanceof IContainer)
      {
         return hasValidFileInside((IContainer) element);
      }

      // when it is a file check file extension
      if (element instanceof IFile)
      {
         return isValid(((IFile) element).getFileExtension());
      }

      return false;
   }


   private boolean hasValidFileInside(IContainer element)
   {
      if (element.isAccessible() && !element.isHidden())
      {
         try
         {
            for (IResource child : element.members())
            {
               if (child instanceof IContainer)
               {
                  if (hasValidFileInside((IContainer) child))
                  {
                     return true;
                  }
               }

               // when it is a file check file extension
               if (child instanceof IFile)
               {
                  if (isValid(((IFile) child).getFileExtension()))
                  {
                     return true;
                  }
               }
            }
         }
         catch (CoreException e)
         {
            return false;
         }
      }

      return false;
   }


   private boolean isValid(String extension)
   {
      // check if there is a valid extension
      for (String valid : extensions)
      {
         if (valid.equals(WorkbenchFileTreeSelectionDialog.ALL))
         {
            return true;
         }

         if (extension != null)
         {
            if (extension.equalsIgnoreCase(valid))
            {
               return true;
            }
         }
      }

      return false;
   }
}
