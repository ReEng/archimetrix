package org.archimetrix.commons.wizards;


import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;


/**
 * The AbstractTreeViewerPage is an adequate super class for
 * wizard pages that consist of a tree
 * viewer.
 *
 * @author mcp
 *
 */
public abstract class AbstractTreeViewerPage extends WizardPage{

/**
 * Tree viewer.
 */
    private TreeViewer viewer;
/**
 * get method the viewer.
 * @return viewer
 */
    public TreeViewer getViewer() {
        return this.viewer;
    }
/**
 * Selected resource.
 */
   private Resource selection;

/**
 * the constructor.
 * @param pageName name of the page (string)
 */
   protected AbstractTreeViewerPage(final String pageName) {
      super(pageName);
   }

/**
 * get method for selected resource.
 * @return selection selected resource
 */
   protected Resource getSelection() {
      return this.selection;
   }

/**
 * Sets the selected resource.
 * @param selection selected resource
 */
   protected void setSelection(final Resource selection) {
      if (this.selection != null && this.selection != selection) {
         // important, otherwise an old resource will be loaded together
         // with the selected resource and also will be analyzed
         this.selection.unload();
         ResourceSet set = this.selection.getResourceSet();
         set.getResources().remove(this.selection);
      }
      this.selection = selection;
   }


   @Override
   public void createControl(final Composite parent) {
      Composite composite = new Composite(parent, parent.getStyle());
      composite.setLayout(new FillLayout());
      this.viewer = new TreeViewer(composite);
      setControl(composite);

   }

}
