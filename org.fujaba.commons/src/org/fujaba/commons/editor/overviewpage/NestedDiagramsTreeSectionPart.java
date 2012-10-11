/**
 * 
 */
package org.fujaba.commons.editor.overviewpage;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IBaseLabelProvider;
import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeNode;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.ViewerComparator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.fujaba.commons.editor.AbstractPersistableModelViewMultiPageEditor;

/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 *
 */
abstract public class NestedDiagramsTreeSectionPart extends AbstractDiagramsSectionPart
{
   private TreeViewer viewer;

   private Button removeButton;

   private Button openButton;

   private Button addButton;

   public NestedDiagramsTreeSectionPart(AbstractPersistableModelViewMultiPageEditor editor, Composite parent,
         FormToolkit toolkit)
   {
      this(editor, parent, toolkit, null, null, null, null);
   }
   

   public NestedDiagramsTreeSectionPart(AbstractPersistableModelViewMultiPageEditor editor, Composite parent,
         FormToolkit toolkit, String sectionName, String deleteConfirmQuestion, String chooseANameMsg,
         String newDiagramDefaultName)
   {
      super(editor, parent, toolkit, sectionName, deleteConfirmQuestion, chooseANameMsg, newDiagramDefaultName);
   }
   
   @Override
   protected void createSectionContent(FormToolkit toolkit)
   {
   // create main composite
      Composite main = toolkit.createComposite(getSection());
      GridLayoutFactory.fillDefaults().numColumns(2).applyTo(main);
      GridDataFactory.fillDefaults().grab(true, true).applyTo(main);

      // create tree
      Tree tree = toolkit.createTree(main, SWT.BORDER | SWT.SINGLE | SWT.NONE);
      GridDataFactory.fillDefaults().grab(true, true).applyTo(tree);

      // create tree viewer
      viewer = new TreeViewer(tree);
      viewer.setLabelProvider(getLabelProvider());
      viewer.setContentProvider(getContentProvider());
      viewer.setComparator(new ViewerComparator());
      viewer.setAutoExpandLevel(TreeViewer.ALL_LEVELS);

      // create buttons
      Composite buttons = toolkit.createComposite(main);
      GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.TOP)
            .applyTo(buttons);
      GridLayoutFactory.fillDefaults().applyTo(buttons);

      addButton = toolkit.createButton(buttons, "Add", SWT.PUSH);
      GridDataFactory.fillDefaults().grab(true, true).applyTo(addButton);

      removeButton = toolkit.createButton(buttons, "Remove", SWT.PUSH);
      removeButton.setEnabled(false);
      GridDataFactory.fillDefaults().grab(true, true).applyTo(removeButton);

      openButton = toolkit.createButton(buttons, "Open", SWT.PUSH);
      openButton.setEnabled(false);
      GridDataFactory.fillDefaults().grab(true, true).applyTo(openButton);

      hookControlListeners();

      getSection().setClient(main);
   }
   
   
   @Override
   protected EObject[] getSelection()
   {
      if (viewer != null && !viewer.getControl().isDisposed() && !viewer.getSelection().isEmpty())
      {
         // get element
         Object selected = ((IStructuredSelection) viewer.getSelection()).getFirstElement();

         // check
         if (selected != null)
         {
            EObject[] items = new EObject[] { (EObject) ((TreeNode) selected).getValue() };
            return items;
         }
      }
      return new EObject[]{};
   }


   private void hookControlListeners()
   {
      // add double click listener
      viewer.addDoubleClickListener(new IDoubleClickListener()
      {
         @Override
         public void doubleClick(DoubleClickEvent event)
         {
            openButtonPressed();
         }
      });

      // add tree viewer listener
      viewer.addSelectionChangedListener(new ISelectionChangedListener()
      {
         @Override
         public void selectionChanged(SelectionChangedEvent e)
         {
            treeSelectionChanged();
         }
      });

      // add button listeners
      addButton.addSelectionListener(new SelectionAdapter()
      {
         @Override
         public void widgetSelected(SelectionEvent e)
         {
            addButtonPressed(e);
         }
      });

      removeButton.addSelectionListener(new SelectionAdapter()
      {
         @Override
         public void widgetSelected(SelectionEvent e)
         {
            removeButtonPressed(e);
         }
      });

      openButton.addSelectionListener(new SelectionAdapter()
      {
         @Override
         public void widgetSelected(SelectionEvent e)
         {
            openButtonPressed();
         }
      });
   }
   
   
   /**
    * Handle change of selected elements e.g. update enabling of buttons.
    */
   protected void treeSelectionChanged()
   {
      // get selection
      EObject[] selected = getSelection();

      // check
      if (selected.length > 0)
      {
         editor.getEditorSite().getSelectionProvider()
               .setSelection(new StructuredSelection(selected));

         // enable the opening button
         openButton.setEnabled(true);

         // check if the elements can be removed
         boolean removable = canRemove(selected);
         String text = null;
         if (!removable)
         {
            text = "The selected pattern is referenced anywhere.";
         }

         removeButton.setEnabled(removable);
         removeButton.setToolTipText(text);
      }
      else
      {
         removeButton.setEnabled(false);
         openButton.setEnabled(false);
      }
   }
   
   @Override
   public void refresh()
   {
      super.refresh();

      // fill tree
      viewer.setInput(getInput());
      viewer.refresh();
   }
   
   /**
    * Creates child element
    * @param type
    * @param parent
    * @return
    */
   abstract protected TreeNode createNode(EObject type, TreeNode parent);


   /**
    * @return an array of elements to display as roots
    */
   abstract protected TreeNode[] getInput();

   
   /**
    * @param selected
    * @return true if selected elements may be removed, false otherwise
    */
   protected boolean canRemove(EObject[] selected)
   {
      return true;
   }
   
   
   abstract protected IBaseLabelProvider getLabelProvider();
   
   abstract protected IContentProvider getContentProvider();
}
