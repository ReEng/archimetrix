package org.archimetrix.architecturepreview.ui.wizards;


import org.archimetrix.architecturepreview.ui.providers.BadSmellsWizardPageContentProvider;
import org.archimetrix.architecturepreview.ui.providers.BadSmellsWizardPageLabelProvider;
import org.archimetrix.commons.wizards.AbstractTreeViewerPage;
import org.archimetrix.relevanceanalysis.badsmells.util.BadSmellOccurrenceUtil;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.swt.widgets.Composite;
import org.reclipse.structure.inference.annotations.ASGAnnotation;


/**
 * A wizard page that provides a tree viewer that shows a list of bad smell occurrences.
 * 
 * @author mcp
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 * 
 */
public class BadSmellsWizardPage extends AbstractTreeViewerPage implements ISelectionChangedListener
{
   private static final String WIZARD_PAGE_DESCRIPTION = "Select the detected bad smell occurrence you want to remove.";

   public static final String WIZARD_PAGE_TITLE = "Select Bad Smell";

   private Object badSmellsSelection;

   private final ArchitecturePreviewWizard wizard;


   protected BadSmellsWizardPage(final ArchitecturePreviewWizard wizard)
   {
      super(WIZARD_PAGE_TITLE);
      setTitle(WIZARD_PAGE_TITLE);
      this.wizard = wizard;
      setDescription(WIZARD_PAGE_DESCRIPTION);
   }


   protected void setSelection(final Resource selection)
   {
      super.setSelection(selection);
      if (this.selection != null)
      {
         this.badSmellsSelection = this.selection.getContents();
      }
      this.viewer.setInput(this.badSmellsSelection);
      this.viewer.setSorter(new ViewerSorter());
      this.viewer.addFilter(new ViewerFilter()
      {
         @Override
         public boolean select(final Viewer viewer, final Object parentElement, final Object element)
         {
            return BadSmellOccurrenceUtil.get().isBadSmell(((ASGAnnotation) element).getPattern().getName());
         }
      });
   }


   @Override
   public void createControl(final Composite parent)
   {
      super.createControl(parent);
      this.viewer.setContentProvider(new BadSmellsWizardPageContentProvider());
      this.viewer.setLabelProvider(new BadSmellsWizardPageLabelProvider());
      this.viewer.addSelectionChangedListener(this);
   }


   @Override
   public void selectionChanged(final SelectionChangedEvent event)
   {
      ASGAnnotation annotation = ((ASGAnnotation) ((TreeSelection) event.getSelection()).getFirstElement());
      if (annotation != null)
      {
         this.wizard.setSelectedAnnotation(annotation);
      }
   }


}
