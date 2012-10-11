/**
 * 
 */
package org.fujaba.commons.editor.overviewpage;

import java.util.List;

import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.fujaba.commons.editor.AbstractPersistableModelViewMultiPageEditor;
import org.fujaba.commons.identifier.Identifier;


/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 *
 */
public abstract class NestedDiagramsSectionPart extends AbstractDiagramsSectionPart
{
   private EObject rootElement;
   private Button removeButton;
   private Table table;

   public NestedDiagramsSectionPart(AbstractPersistableModelViewMultiPageEditor editor, Composite parent,
         FormToolkit toolkit)
   {
      this(editor, parent, toolkit, null, null, null, null);
   }
   
   public NestedDiagramsSectionPart(AbstractPersistableModelViewMultiPageEditor editor, Composite parent,
         FormToolkit toolkit, String sectionName, String deleteConfirmQuestion, String chooseANameMsg, String newDiagramDefaultName)
   {
      super(editor, parent, toolkit, sectionName, deleteConfirmQuestion, chooseANameMsg, newDiagramDefaultName);
   }


   @Override
   protected void createSectionContent(FormToolkit toolkit)
   {
      getSection().setText(this.sectionName);
      Composite sectionClient = toolkit.createComposite(getSection());
      sectionClient.setLayout(new GridLayout(2, false));

      this.table = toolkit.createTable(sectionClient, SWT.MULTI);
      GridData gridData = new GridData(GridData.FILL_BOTH);
      this.table.setLayoutData(gridData);
      getSection().setClient(sectionClient);

      Composite buttonComposite = new Composite(sectionClient, SWT.NONE);
      buttonComposite.setLayout(new GridLayout());

      GridData data = new GridData();
      data.verticalAlignment = SWT.TOP;
      buttonComposite.setLayoutData(data);

      Button addButton = toolkit.createButton(buttonComposite, "Add...",
            SWT.None);
      addButton.addSelectionListener(new SelectionAdapter()
      {
         @Override
         public void widgetSelected(SelectionEvent e)
         {
            addButtonPressed(e);
         }
      });
      data = new GridData(GridData.FILL_HORIZONTAL);
      data.verticalAlignment = SWT.TOP;
      addButton.setLayoutData(data);

      removeButton = toolkit.createButton(buttonComposite, "Remove", SWT.None);
      removeButton.addSelectionListener(new SelectionAdapter()
      {
         @Override
         public void widgetSelected(SelectionEvent e)
         {
            removeButtonPressed(e);
         }
      });
      data = new GridData(GridData.FILL_HORIZONTAL);
      data.verticalAlignment = SWT.TOP;
      removeButton.setLayoutData(data);
      removeButton.setEnabled(false);
      
      TableSelectionListener listener = new TableSelectionListener(this.table,
            removeButton);
      this.table.addSelectionListener(listener);
      
      Button openButton = toolkit.createButton(buttonComposite, "Open", SWT.None);
      data = new GridData(GridData.FILL_HORIZONTAL);
      data.verticalAlignment = SWT.TOP;
      openButton.setLayoutData(data);
      openButton.setEnabled(false);
      openButton.addSelectionListener(new SelectionAdapter()
      {
         @Override
         public void widgetSelected(SelectionEvent e)
         {
            openButtonPressed();
         }
      });
      
      listener = new TableSelectionListener(this.table,
            openButton);
      this.table.addSelectionListener(listener);
      
      this.table.addMouseListener(new MouseListener()
      {
         
         @Override
         public void mouseUp(MouseEvent e){ }
         
      
         @Override
         public void mouseDown(MouseEvent e){ }
         
      
         @Override
         public void mouseDoubleClick(MouseEvent e)
         {
            openButtonPressed();
         }
      });
   }
   
   
   
   @Override
   protected EObject[] getSelection()
   {
      TableItem[] items = this.table.getSelection();
      EObject[] eItems = new EObject[items.length];
      for (int i = 0; i < items.length; i++)
      {
         eItems[i] = (EObject)items[i].getData();
      }
      return eItems;
   }

   @Override
   public void refresh()
   {
      this.table.removeAll();

      if (this.rootElement != null)
      {
         for (EObject element : getDiagramElements())
         {
            addTreeItem(element);
         }
      }

      super.refresh();
   }
   
   protected abstract List<? extends EObject> getDiagramElements();
   
   protected TableItem addTreeItem(EObject element)
   {
      TableItem item = new TableItem(this.table, SWT.None);
      item.setData(element);

      // set text
      if(element instanceof ENamedElement) {
         item.setText(((ENamedElement) element).getName()); 
      } else if (element instanceof Identifier) {
         item.setText(((Identifier) element).getName());
      } else {
         item.setText(element.toString());
      }

      return item;
   }


   /**
    * Opens a dialog for name selection for the new diagram and calls the {@link #createAddDiagramCommand(String)}
    * afterwards with the chosen name as an argument.
    * 
    * <br><br>
    * Override this if you need some special behavior.
    * @param e
    */
   @Override
   protected void addButtonPressed(SelectionEvent e)
   {
      InputDialog dialog = new InputDialog(getSection().getShell(), "Choose a name", this.chooseANameMsg, this.newDiagramDefaultName, null);
      int pressed = dialog.open();
      if(pressed == InputDialog.OK)
      {
         this.executeCommand(createAddDiagramCommand(dialog.getValue()));
      }
   }

   
   @Override
   protected void removeButtonPressed(SelectionEvent e)
   {
      if(!MessageDialog.openConfirm(getSection().getShell(), "Confirm", this.deleteConfirmQuestion))
      {
         return;  
      }
      
      CompoundCommand cmd = new CompoundCommand();
      TableItem[] items = this.table.getSelection();
      for (int i = 0; i < items.length; i++)
      {
         EObject diagramRoot =  (EObject) items[i].getData();
         Command command = createDeleteDiagramCommandFor(diagramRoot);
         cmd.add(command);
      }
      this.executeCommand(cmd.unwrap());
   }
   
   
   @Override
   protected void openButtonPressed()
   {
      TableItem[] items = this.table.getSelection();
      for (int i = 0; i < items.length; i++)
      {
         EObject diagramRoot =  (EObject) items[i].getData();
         openDiagramFor(diagramRoot);
      }
   }
   
   
   
   
   private class TableSelectionListener extends SelectionAdapter
   {
      private Table table;

      private Button button;


      public TableSelectionListener(Table table, Button button)
      {
         this.table = table;
         this.button = button;
      }


      /**
       * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
       */
      @Override
      public void widgetSelected(SelectionEvent e)
      {
         this.button.setEnabled(this.table.getSelectionCount() > 0);
      }
   }

   @Override
   public boolean setFormInput(Object input)
   {
      if(input instanceof EObject)
      {
         if(this.rootElement != null)
         {
            this.rootElement.eAdapters().remove(this);
         }
         this.rootElement = (EObject) input;
         this.rootElement.eAdapters().add(this);
      }
      return super.setFormInput(input);
   }


   public String getSectionName()
   {
      return this.sectionName;
   }


   public void setSectionName(String sectionName)
   {
      this.sectionName = sectionName;
   }


   public String getDeleteConfirmQuestion()
   {
      return this.deleteConfirmQuestion;
   }


   public void setDeleteConfirmQuestion(String deleteConfirmQuestion)
   {
      this.deleteConfirmQuestion = deleteConfirmQuestion;
   }


   public String getChooseANameMsg()
   {
      return this.chooseANameMsg;
   }


   public void setChooseANameMsg(String chooseANameMsg)
   {
      this.chooseANameMsg = chooseANameMsg;
   }


   public String getNewDiagramDefaultName()
   {
      return this.newDiagramDefaultName;
   }


   public void setNewDiagramDefaultName(String newDiagramDefaultName)
   {
      this.newDiagramDefaultName = newDiagramDefaultName;
   }
}
