package org.archimetrix.architecturepreview.ui.views;


import org.archimetrix.architecturepreview.ui.providers.ArchitecturePreviewViewContentProvider;
import org.archimetrix.architecturepreview.ui.providers.ArchitecturePreviewViewLabelProvider;
import org.archimetrix.architecturepreview.ui.providers.ComponentsTreeContentProvider;
import org.archimetrix.architecturepreview.ui.providers.ComponentsTreeLabelProvider;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.TreeColumn;
import org.eclipse.ui.part.ViewPart;

import eu.qimpress.samm.staticstructure.Repository;


/**
 * This class represents the view that visualizes the results of the architecture preview. It
 * contains at table for comparing some general criteria and two tree viewers that show the
 * components of the original and of the predicted architecture.
 * 
 * @author mcp
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 * 
 */
public class ArchitecturePreviewView extends ViewPart
{
   private static final String PREDICTED_ARCHITECTURE_COLUMN_TITLE = "Predicted Architecture";

   private static final String ORIGINAL_ARCHITECTURE_COLUMN_TITLE = "Original Architecture";

   public static final String ID = "org.archimetrix.architecturepreview.ui.architecturepreviewview";

   protected TreeViewer viewer;

   protected ArchitecturePreviewViewLabelProvider labelProvider;

   protected ArchitecturePreviewViewContentProvider contentProvider;

   private TreeViewer originalComponentsTree;

   private TreeViewer newComponentsTree;

   private Repository newSamm;

   private Repository originalSamm;


   @Override
   public void createPartControl(final Composite parent)
   {
      Composite root = new Composite(parent, SWT.FILL);
      GridLayout rootLayout = new GridLayout(2, true);
      root.setLayout(rootLayout);
      GridData gridData = new GridData();
      this.viewer = new TreeViewer(root, SWT.FULL_SELECTION | SWT.SINGLE);
      this.viewer.getTree().setLinesVisible(true);
      this.viewer.getTree().setHeaderVisible(true);
      this.viewer.setLabelProvider(new ArchitecturePreviewViewLabelProvider());
      this.viewer.setContentProvider(new ArchitecturePreviewViewContentProvider());

      createColumns();
      gridData = createGridData();
      gridData.horizontalSpan = 2;
      this.viewer.getTree().setLayoutData(gridData);

      this.originalComponentsTree = createComponentsTreeViewer(root);
      this.newComponentsTree = createComponentsTreeViewer(root);
      gridData = createGridData();
      this.originalComponentsTree.getTree().setLayoutData(gridData);
      gridData = createGridData();
      this.newComponentsTree.getTree().setLayoutData(gridData);

      getSite().setSelectionProvider(this.viewer);

      createContextMenu();
   }


   private GridData createGridData()
   {
      GridData gridData = new GridData();
      gridData.horizontalAlignment = GridData.FILL;
      gridData.verticalAlignment = GridData.FILL;
      gridData.grabExcessHorizontalSpace = true;
      gridData.grabExcessVerticalSpace = true;
      return gridData;
   }


   private TreeViewer createComponentsTreeViewer(final Composite root)
   {
      TreeViewer viewer = new TreeViewer(root, SWT.FULL_SELECTION | SWT.SINGLE);
      viewer.getTree().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
      viewer.setLabelProvider(new ComponentsTreeLabelProvider(this));
      viewer.setContentProvider(new ComponentsTreeContentProvider());
      return viewer;
   }


   public TreeViewer getNewComponentsTree()
   {
      return this.newComponentsTree;
   }


   public void createColumns()
   {
      String[] names = new String[] { "", ORIGINAL_ARCHITECTURE_COLUMN_TITLE, PREDICTED_ARCHITECTURE_COLUMN_TITLE };
      boolean firstColumn = true;
      for (String name : names)
      {
         TreeColumn tc = new TreeColumn(this.viewer.getTree(), SWT.LEFT);
         tc.setText(name);
         if (firstColumn)
         {
            tc.setWidth(250);
            firstColumn = false;
         }
         else
         {
            tc.pack();
         }
      }
   }


   private void createContextMenu()
   {
      MenuManager menuMgr = new MenuManager();
      Menu menu = menuMgr.createContextMenu(this.viewer.getControl());
      this.viewer.getControl().setMenu(menu);
      getSite().registerContextMenu(menuMgr, this.viewer);
   }


   public void setInput(final Object input)
   {
      this.viewer.setInput(input);
   }


   public void setOriginalComponentsTreeInput(final Repository input)
   {
      this.originalSamm = input;
      this.originalComponentsTree.setInput(input);
   }


   public void setNewComponentsTreeInput(final Repository input)
   {
      this.newSamm = input;
      this.newComponentsTree.setInput(input);
   }


   public Repository getNewSamm()
   {
      return this.newSamm;
   }


   public Repository getOriginalSamm()
   {
      return this.originalSamm;
   }


   @Override
   public void setFocus()
   {
      this.viewer.getControl().setFocus();
   }


   public TreeViewer getOriginalComponentsTree()
   {
      return this.originalComponentsTree;
   }


}
