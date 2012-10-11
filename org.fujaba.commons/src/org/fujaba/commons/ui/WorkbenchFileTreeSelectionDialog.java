package org.fujaba.commons.ui;


import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.ui.model.BaseWorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.eclipse.ui.views.navigator.ResourceComparator;


/**
 * This tree selection dialog can be used to select a file from the workbench.
 * 
 * @version $Revision$ $Date$
 * @author Last editor: $Author$
 * @author harka
 */
public class WorkbenchFileTreeSelectionDialog extends
      ElementTreeSelectionDialog
{

   public static final String ALL = "*"; //$NON-NLS-1$


   public WorkbenchFileTreeSelectionDialog(Shell shell, String title,
         String message)
   {
      this(shell, title, message, 1);
   }


   public WorkbenchFileTreeSelectionDialog(Shell shell, String title,
         String message, int max)
   {
      this(shell, title, message, ALL, max);
   }


   public WorkbenchFileTreeSelectionDialog(Shell shell, String title,
         String message, String extension)
   {
      this(shell, title, message, new String[] { extension });
   }


   public WorkbenchFileTreeSelectionDialog(Shell shell, String title,
         String message, String extension, int max)
   {
      this(shell, title, message, new String[] { extension }, max);
   }


   public WorkbenchFileTreeSelectionDialog(Shell shell, String title,
         String message, String[] extensions)
   {
      this(shell, title, message, extensions, 1);
   }


   public WorkbenchFileTreeSelectionDialog(Shell shell, String title,
         String message, String[] extensions, int max)
   {
      super(shell, new WorkbenchLabelProvider(),
            new BaseWorkbenchContentProvider());

      setTitle(title);
      setMessage(message);
      setBlockOnOpen(true);
      setDoubleClickSelects(true);
      setAllowMultiple(false);
      setHelpAvailable(false);

      setInput(ResourcesPlugin.getWorkspace().getRoot());

      setComparator(new ResourceComparator(ResourceComparator.NAME));
      setValidator(new FileInputValidator(extensions, max));
      addFilter(new FileExtensionViewerFilter(extensions));
   }
}
