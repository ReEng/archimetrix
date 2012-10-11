/**
 * 
 */
package org.fujaba.commons.editor.overviewpage;


import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.forms.SectionPart;
import org.eclipse.ui.forms.widgets.ExpandableComposite;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.fujaba.commons.editor.AbstractPersistableModelViewMultiPageEditor;


/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 * 
 */
abstract public class AbstractDiagramsSectionPart extends SectionPart implements Adapter
{
   protected AbstractPersistableModelViewMultiPageEditor editor;

   protected String sectionName = "Contained Diagrams",
         deleteConfirmQuestion = "Are you sure that you want to delete this diagram?",
         chooseANameMsg = "Choose a name for your new diagram.", newDiagramDefaultName = "New Diagram";


   public AbstractDiagramsSectionPart(AbstractPersistableModelViewMultiPageEditor editor, Composite parent,
         FormToolkit toolkit)
   {
      this(editor, parent, toolkit, null, null, null, null);
   }


   public AbstractDiagramsSectionPart(AbstractPersistableModelViewMultiPageEditor editor, Composite parent,
         FormToolkit toolkit, String sectionName, String deleteConfirmQuestion, String chooseANameMsg,
         String newDiagramDefaultName)
   {
      super(toolkit.createSection(parent, ExpandableComposite.TITLE_BAR | ExpandableComposite.TWISTIE
            | ExpandableComposite.EXPANDED));

      this.editor = editor;
      this.sectionName = sectionName != null ? sectionName : this.sectionName;
      this.deleteConfirmQuestion = deleteConfirmQuestion != null ? deleteConfirmQuestion : this.deleteConfirmQuestion;
      this.chooseANameMsg = chooseANameMsg != null ? chooseANameMsg : this.chooseANameMsg;
      this.newDiagramDefaultName = newDiagramDefaultName != null ? newDiagramDefaultName : this.newDiagramDefaultName;

      createSectionContent(toolkit);
   }


   /**
    * Creates section content e.g. table viewer for diagrams contained in the model file.
    * 
    * @param toolkit
    */
   abstract protected void createSectionContent(FormToolkit toolkit);


   /**
    * Opens a dialog for name selection for the new diagram and calls the
    * {@link #createAddDiagramCommand(String)} afterwards with the chosen name as an argument.
    * 
    * <br>
    * <br>
    * Override this if you need some special behavior.
    * 
    * @param e
    */
   protected void addButtonPressed(SelectionEvent e)
   {
      InputDialog dialog = new InputDialog(getSection().getShell(), "Choose a name", this.chooseANameMsg,
            this.newDiagramDefaultName, null);
      int pressed = dialog.open();
      if (pressed == InputDialog.OK)
      {
         this.executeCommand(createAddDiagramCommand(dialog.getValue()));
      }
   }


   /**
    * Handle removal of selected diagrams.
    * 
    * @param e selection event
    */
   protected void removeButtonPressed(SelectionEvent e)
   {
      if (!MessageDialog.openConfirm(getSection().getShell(), "Confirm", this.deleteConfirmQuestion))
      {
         return;
      }

      CompoundCommand cmd = new CompoundCommand();
      EObject[] items = getSelection();
      for (int i = 0; i < items.length; i++)
      {
         EObject diagramRoot = items[i];
         Command command = createDeleteDiagramCommandFor(diagramRoot);
         cmd.add(command);
      }
      this.executeCommand(cmd.unwrap());
   }


   /**
    * Handle opening of selected diagram elements.
    */
   protected void openButtonPressed()
   {
      EObject[] items = getSelection();
      for (int i = 0; i < items.length; i++)
      {
         EObject diagramRoot = items[i];
         openDiagramFor(diagramRoot);
      }
   }


   /**
    * @return selected elements within the view
    */
   protected abstract EObject[] getSelection();


   /**
    * Executes the given command on the editor's command stack.
    * 
    * @param cmd
    */
   protected void executeCommand(Command cmd)
   {
      editor.getCommandStack().execute(cmd);
   }


   /**
    * Creates and returns a command for creation of a new diagram element.
    * 
    * @param newName command name
    * @return editor specific diagram create command
    */
   protected abstract Command createAddDiagramCommand(String newName);


   /**
    * Create editor specific delete diagram command
    * 
    * @param diagramRoot to be deleted
    * @return created delete command
    */
   protected abstract Command createDeleteDiagramCommandFor(EObject diagramRoot);


   /**
    * Handle opening of a selected diagram element.
    * 
    * @param diagramRoot to be displayed
    */
   protected abstract void openDiagramFor(EObject diagramRoot);


   /**
    * @see org.eclipse.emf.common.notify.Adapter#notifyChanged(org.eclipse.emf.common.notify.Notification)
    */
   @Override
   public void notifyChanged(Notification notification)
   {
      safeRefresh();
   }


   protected void safeRefresh()
   {
      if (Display.getDefault() != null)
      {
         Display.getDefault().asyncExec(new Runnable()
         {
            @Override
            public void run()
            {
               AbstractDiagramsSectionPart.this.refresh();
            }
         });
      }
   }


   /**
    * @see org.eclipse.emf.common.notify.Adapter#getTarget()
    */
   @Override
   public Notifier getTarget()
   {
      return null;
   }


   /**
    * @see org.eclipse.emf.common.notify.Adapter#setTarget(org.eclipse.emf.common.notify.Notifier)
    */
   @Override
   public void setTarget(Notifier newTarget)
   {
   }


   /**
    * @see org.eclipse.emf.common.notify.Adapter#isAdapterForType(java.lang.Object)
    */
   @Override
   public boolean isAdapterForType(Object type)
   {
      return false;
   }

}
