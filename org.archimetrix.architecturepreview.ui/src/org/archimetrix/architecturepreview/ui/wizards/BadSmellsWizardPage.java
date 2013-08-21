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
   private static final String WIZARD_PAGE_DESCRIPTION = "Select the detected deficiency occurrence you want to remove.";

   public static final String WIZARD_PAGE_TITLE = "Select deficiency occurrence";

   private Object badSmellsSelection;

   private final ArchitecturePrognosisWizard wizard;


   protected BadSmellsWizardPage(final ArchitecturePrognosisWizard wizard)
   {
      super(WIZARD_PAGE_TITLE);
      setTitle(WIZARD_PAGE_TITLE);
      this.wizard = wizard;
      setDescription(WIZARD_PAGE_DESCRIPTION);
   }


   protected void setSelection(final Resource selection)
   {
      super.setSelection(selection);
      if (this.getSelection()!= null)
      {
         this.badSmellsSelection = this.getSelection().getContents();
      }
      this.getViewer().setInput(this.badSmellsSelection);
      this.getViewer().setSorter(new ViewerSorter());
      this.getViewer().addFilter(new ViewerFilter()
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
      this.getViewer().setContentProvider(new BadSmellsWizardPageContentProvider());
      this.getViewer().setLabelProvider(new BadSmellsWizardPageLabelProvider());
      this.getViewer().addSelectionChangedListener(this);
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
