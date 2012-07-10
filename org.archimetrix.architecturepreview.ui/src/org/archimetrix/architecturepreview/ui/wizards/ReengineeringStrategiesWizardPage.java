package org.archimetrix.architecturepreview.ui.wizards;


import org.archimetrix.architecturepreview.ui.providers.ReengineeringStrategiesWizardPageContentProvider;
import org.archimetrix.architecturepreview.ui.providers.ReengineeringStrategiesWizardPageLabelProvider;
import org.archimetrix.commons.wizards.AbstractTreeViewerPage;
import org.archimetrix.commons.wizards.WizardConstants;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.swt.widgets.Composite;
import org.storydriven.storydiagrams.activities.Activity;
import org.storydriven.storydiagrams.activities.OperationExtension;


/**
 * A wizard page that provides a tree viewer that shows a list of reengineering strategies.
 * 
 * @author mcp
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 * 
 */
public class ReengineeringStrategiesWizardPage extends AbstractTreeViewerPage
{
   private static final String WIZARD_PAGE_DESCRIPTION = "Select the reengineering strategy that shall be used to accomplish the removal of the selected bad smell occurrence.";

   private static final String WIZARD_PAGE_TITLE = "Select Reengineering Strategy";

   private Object strategiesSelection;

   private final ArchitecturePreviewWizard wizard;

   private ReengineeringStrategiesWizardPageContentProvider contentProvider;


   protected ReengineeringStrategiesWizardPage(final ArchitecturePreviewWizard wizard)
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
         this.strategiesSelection = this.selection.getContents();
      }
      this.contentProvider.setAnnotation(this.wizard.getSelectedAnnotation());
      this.viewer.setInput(this.strategiesSelection);
      this.viewer.setSorter(new ViewerSorter());
   }


   @Override
   public void createControl(final Composite parent)
   {
      super.createControl(parent);
      this.contentProvider = new ReengineeringStrategiesWizardPageContentProvider();
      this.viewer.setContentProvider(this.contentProvider);
      this.viewer.setLabelProvider(new ReengineeringStrategiesWizardPageLabelProvider());
   }


   public Activity getSelectedStrategy()
   {
      TreeSelection selection = (TreeSelection) this.viewer.getSelection();
      EOperation op = (EOperation) selection.getFirstElement();
      OperationExtension opExt = (OperationExtension) op
            .getEAnnotation(WizardConstants.STORY_DIAGRAM_ANNOTATION_SOURCE_KEY).getContents().get(0);
      return opExt.getOwnedActivity();
   }


}
