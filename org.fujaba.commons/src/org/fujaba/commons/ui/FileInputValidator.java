package org.fujaba.commons.ui;


import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ui.dialogs.ISelectionStatusValidator;
import org.fujaba.commons.FujabaCommonsPlugin;



/**
 * This selection validator checks the selected {@link IFile files}.
 * 
 * @version $Revision$ $Date$
 * @author Last editor: $Author$
 * @author harka
 */
public class FileInputValidator implements ISelectionStatusValidator
{

   private static final String INVALID = "The selection is not valid.";

   private static final String VALID = "The selection seems to be valid.";

   private final String[] extensions;

   private final int max;


   /**
    * Creates a validator which allows a number of files with one of the selected extensions.
    * 
    * @param extensions The valid file extensions.
    * @param max The maximal number of selected files.
    */
   public FileInputValidator(String[] extensions, int max)
   {
      this.extensions = extensions;
      this.max = max;
   }


   /**
    * Creates a validator which allows a number of files with the selected extension.
    * 
    * @param extensions The valid file extension.
    * @param max The maximal number of selected files.
    */
   public FileInputValidator(String extension, int max)
   {
      this(new String[] { extension }, max);
   }


   /**
    * Creates a validator that allows a number of files to be selected with the any extension.
    * 
    * @param max The maximal number of selected files.
    */
   public FileInputValidator(int max)
   {
      this(WorkbenchFileTreeSelectionDialog.ALL, max);
   }


   /**
    * Creates a validator which allows one file with one of the selected extensions.
    * 
    * @param extensions The valid file extensions.
    */
   public FileInputValidator(String[] extensions)
   {
      this(extensions, 1);
   }


   /**
    * Creates a validator which allows one file with the selected extension.
    * 
    * @param extensions The valid file extension.
    */
   public FileInputValidator(String extension)
   {
      this(new String[] { extension });
   }


   /**
    * Creates a validator that allows one file to be selected with the any extension.
    * 
    * @param id The plug-in ID (to create genuine status).
    */
   public FileInputValidator()
   {
      this(WorkbenchFileTreeSelectionDialog.ALL);
   }


   public IStatus validate(Object[] selection)
   {
      Status valid = new Status(IStatus.OK, FujabaCommonsPlugin.ID, VALID);
      Status invalid = new Status(IStatus.ERROR, FujabaCommonsPlugin.ID,
            INVALID);

      if (selection.length > 0 && selection.length <= max)
      {
         for (Object selected : selection)
         {
            if (selected instanceof IFile)
            {
               if (!isValid(((IFile) selected).getFileExtension()))
               {
                  return invalid;
               }
            }
            else
            {
               return invalid;
            }
         }

         return valid;
      }

      return invalid;
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
