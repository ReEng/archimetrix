package org.archimetrix.relevanceanalysis.ui.wizards;


import org.archimetrix.commons.wizards.AbstractWizardPage;
import org.archimetrix.commons.wizards.ResourceSelectionSection;
import org.archimetrix.commons.wizards.ResourceSelectionSectionProvider;
import org.archimetrix.commons.wizards.WizardConstants;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;


/**
 * A wizard page that is used in the FindRelevantComponentsWizard. It contains input sections for a
 * bad smells file and a metric values file.
 * 
 * @author mcp
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 * 
 */
public class FindRelevantBadSmellsWizardPage extends AbstractWizardPage
{

   private static final String WIZARD_PAGE_DESCRIPTION = "Select a file with the detected bad smells and a file with the metric values to start a relevance analysis.";

   private ResourceSelectionSection metricValuesSection;

   private ResourceSelectionSection badSmellsSection;


   protected FindRelevantBadSmellsWizardPage(final String pageName)
   {
      super(pageName);
      setDescription(WIZARD_PAGE_DESCRIPTION);
   }


   @Override
   public void createControl(final Composite parent)
   {
      Composite composite = new Composite(parent, SWT.NONE);
      composite.setLayout(new GridLayout());

      ResourceSelectionSectionProvider sectionProvider = new ResourceSelectionSectionProvider();
      Group inputs = sectionProvider.createInputGroup(composite);
      this.badSmellsSection = sectionProvider.createBadSmellsResourceSelection(inputs, this);
      this.metricValuesSection = sectionProvider.createMetricValuesResourceSelection(inputs, this);

      setControl(composite);

      setPageComplete(false);
      loadSettings();

   }


   private void loadSettings()
   {
      IDialogSettings s = getDialogSettings();
      if (s != null)
      {
         this.badSmellsSection.getTextField().setText(
               s.get(WizardConstants.SETT_BAD_SMELLS) == null ? "" : s.get(WizardConstants.SETT_BAD_SMELLS));
         this.metricValuesSection.getTextField().setText(
               s.get(WizardConstants.SETT_METRIC_VALUES_MODEL) == null ? "" : s
                     .get(WizardConstants.SETT_METRIC_VALUES_MODEL));

      }
   }


   @Override
   public void modifyText(final ModifyEvent e)
   {
      IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
      if (e.getSource() == this.badSmellsSection.getTextField())
      {
         this.badSmellsSection.getDialog().setInitialSelection(
               workspaceRoot.findMember(this.badSmellsSection.getTextField().getText()));
      }
      else if (e.getSource() == this.metricValuesSection.getTextField())
      {
         this.metricValuesSection.getDialog().setInitialSelection(
               workspaceRoot.findMember(this.metricValuesSection.getTextField().getText()));
      }

      setPageComplete(isValid());
   }


   public String getBadSmellsFilePath()
   {
      return this.badSmellsSection.getTextField().getText();
   }


   public String getMetricValuesFilePath()
   {
      return this.metricValuesSection.getTextField().getText();
   }


   @Override
   protected boolean isValid()
   {
      String badSmellsText = this.badSmellsSection.getTextField().getText();
      if (badSmellsText == null)
      {
         setErrorMessage(WizardConstants.NO_BAD_SMELLS_ERROR_MESSAGE);
      }
      String metricValuesText = this.metricValuesSection.getTextField().getText();
      if (metricValuesText == null)
      {
         setErrorMessage(WizardConstants.NO_METRIC_VALUES_ERROR_MESSAGE);
      }

      if (badSmellsText != null && metricValuesText != null)
      {
         setErrorMessage(null);
         return true;
      }

      return false;
   }


   public void saveSettings()
   {
      IDialogSettings s = getDialogSettings();
      if (s != null)
      {
         s.put(WizardConstants.SETT_BAD_SMELLS, this.badSmellsSection.getTextField().getText());
         s.put(WizardConstants.SETT_METRIC_VALUES_MODEL, this.metricValuesSection.getTextField().getText());
      }
   }


}
