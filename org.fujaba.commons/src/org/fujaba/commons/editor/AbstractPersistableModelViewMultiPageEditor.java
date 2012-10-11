package org.fujaba.commons.editor;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.dialogs.SaveAsDialog;
import org.eclipse.ui.part.FileEditorInput;
import org.fujaba.commons.FujabaCommonsPlugin;


/**
 * 
 * This multi page editor base class implements basic serialization of model and view of
 * an EMF model. To make this work properly you have to assign the correct
 * diagram and model resources to the corresponding protected attributes.
 * 
 * <br><br>
 * Currently the state of the editor is not stored, but will be stored in future.
 * 
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 */
public abstract class AbstractPersistableModelViewMultiPageEditor extends
      AbstractMultiPageEditor
{

   protected Resource diagramResource, modelResource;


   /**
    * @return The resource containing the diagram or view information.
    */
   public Resource getDiagramResource()
   {
      return this.diagramResource;
   }


   /**
    * @return The resource containing the model.
    */
   public Resource getModelResource()
   {
      return this.modelResource;
   }


   /**
    * @see org.eclipse.ui.part.EditorPart#doSave(org.eclipse.core.runtime.IProgressMonitor)
    */
   @Override
   public void doSave(IProgressMonitor monitor)
   {
      performSaveAs(this.getEditorInputFile());
      getCommandStack().markSaveLocation();
   }


   /**
    * @see org.eclipse.ui.part.EditorPart#doSaveAs()
    */
   @Override
   public void doSaveAs()
   {
      SaveAsDialog dialog = new SaveAsDialog(getSite().getWorkbenchWindow()
            .getShell());
      dialog.setOriginalFile(getEditorInputFile());
      dialog.open();
      IPath path = dialog.getResult();

      if (path == null)
      {
         return;
      }

      IWorkspace workspace = ResourcesPlugin.getWorkspace();
      final IFile file = workspace.getRoot().getFile(path);

      WorkspaceModifyOperation op = new WorkspaceModifyOperation()
      {
         @Override
         public void execute(final IProgressMonitor monitor)
               throws CoreException
         {
            performSaveAs(file);
         }
      };

      try
      {
         new ProgressMonitorDialog(getSite().getWorkbenchWindow().getShell())
               .run(false, true, op);
         setInput(new FileEditorInput(file));
         getCommandStack().markSaveLocation();
      }
      catch (InvocationTargetException e)
      {
         FujabaCommonsPlugin.getDefault().logError(e.getMessage(), e);
      }
      catch (InterruptedException e)
      {
         FujabaCommonsPlugin.getDefault().logError(e.getMessage(), e);
      }

      getCommandStack().markSaveLocation();
   }
   
   protected IFile getEditorInputFile()
   {
      if(getEditorInput() instanceof IFileEditorInput)
      {
         return ((IFileEditorInput) super.getEditorInput()).getFile();
      }
      return null;
   }
   
   /**
    * This method implements the serialization of model and view. The view is stored
    * to provided file object. The model file stays the original file. A save as operation
    * for the model is currently not provided by this implementation.
    * 
    * @param diagramFile the new diagram file
    */
   protected void performSaveAs(IFile diagramFile)
   {
      // Create a resource set.
      ResourceSet resourceSet = editingDomain.getResourceSet();
      
      // Save the contents of the resource to the file system.
      try
      {
         modelResource.save(resourceSet.getLoadOptions());
         diagramResource.save(resourceSet.getLoadOptions());

      }
      catch (IOException e)
      {
         MessageDialog.openError(Display.getCurrent().getActiveShell(),
               "Save Error",
               "During saving of the latest changes an exception occurred: "
                     + e.getMessage() + "\nsee Error Log for Stacktrace");
         FujabaCommonsPlugin.getDefault().logError(e.getMessage(), e);
      }
   }


   /**
    * @see org.eclipse.ui.part.EditorPart#isSaveAsAllowed()
    */
   @Override
   public boolean isSaveAsAllowed()
   {
      return true;
   }

   
   /**
    * @see org.eclipse.ui.IPersistableEditor#restoreState(org.eclipse.ui.IMemento)
    */
   public void restoreState(IMemento memento)
   {
      // FIXME Implement
   }


   /**
    * @see org.eclipse.ui.IPersistable#saveState(org.eclipse.ui.IMemento)
    */
   public void saveState(IMemento memento)
   {
      // FIXME Implements
   }
}
