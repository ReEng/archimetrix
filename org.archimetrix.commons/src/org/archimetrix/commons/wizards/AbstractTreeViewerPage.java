package org.archimetrix.commons.wizards;


import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;


/**
 * The AbstractTreeViewerPage is an adequate super class for wizard pages that consist of a tree
 * viewer.
 * 
 * @author mcp
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 * 
 */
public abstract class AbstractTreeViewerPage extends WizardPage
{
   protected TreeViewer viewer;

   protected Resource selection;


   protected AbstractTreeViewerPage(final String pageName)
   {
      super(pageName);
   }


   protected Resource getSelection()
   {
      return this.selection;
   }


   protected void setSelection(final Resource selection)
   {
      if (this.selection != null && this.selection != selection)
      {
         // important, otherwise an old resource will be loaded together
         // with the selected resource and also will be analyzed
         this.selection.unload();
         ResourceSet set = this.selection.getResourceSet();
         set.getResources().remove(this.selection);
      }
      this.selection = selection;
   }


   @Override
   public void createControl(final Composite parent)
   {
      Composite composite = new Composite(parent, parent.getStyle());
      composite.setLayout(new FillLayout());
      this.viewer = new TreeViewer(composite);
      setControl(composite);

   }

}
