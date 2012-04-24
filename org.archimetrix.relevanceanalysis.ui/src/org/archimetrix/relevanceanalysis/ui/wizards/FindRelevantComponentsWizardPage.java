package org.archimetrix.relevanceanalysis.ui.wizards;


import org.archimetrix.commons.wizards.AbstractWizardPage;
import org.archimetrix.commons.wizards.ResourceSelectionSection;
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
 * A wizard page that is used in the FindRelevantComponentsWizard. It contains input sections for
 * the source code decoratormodel and a metric values model.
 * 
 * @author mcp
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 * 
 */
public class FindRelevantComponentsWizardPage extends AbstractWizardPage
{

   private static final String PAGE_DESCRIPTION = "Select the file with the source code decorator model of the program to be analyzed and a file with the metric values to start a relevance analysis.";

   private ResourceSelectionSection scdSection;

   private ResourceSelectionSection metricValuesSection;


   protected FindRelevantComponentsWizardPage(final String pageName)
   {
      super(pageName);
      setDescription(PAGE_DESCRIPTION);
   }


   @Override
   public void createControl(final Composite parent)
   {
      Composite composite = new Composite(parent, SWT.NONE);
      composite.setLayout(new GridLayout());

      Group inputs = this.resourceSelectionSectionProvider.createInputGroup(composite);
      this.scdSection = this.resourceSelectionSectionProvider.createSourceCodeDecoratorResourceSelection(inputs, this);
      this.metricValuesSection = this.resourceSelectionSectionProvider.createMetricValuesResourceSelection(inputs, this);

      setControl(composite);
      setPageComplete(false);
      loadSettings();

   }


   private void loadSettings()
   {
      IDialogSettings s = getDialogSettings();
      if (s != null)
      {
         this.scdSection.getTextField().setText(
               s.get(WizardConstants.SETT_SCDM) == null ? "" : s.get(WizardConstants.SETT_SCDM));
         this.metricValuesSection.getTextField().setText(
               s.get(WizardConstants.SETT_METRIC_VALUES_MODEL) == null ? "" : s
                     .get(WizardConstants.SETT_METRIC_VALUES_MODEL));

      }
   }


   @Override
   public void modifyText(final ModifyEvent e)
   {
      IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
      if (e.getSource() == this.metricValuesSection.getTextField())
      {
         this.metricValuesSection.getDialog().setInitialSelection(
               workspaceRoot.findMember(this.metricValuesSection.getTextField().getText()));
      }
      else if (e.getSource() == this.scdSection.getTextField())
      {
         this.scdSection.getDialog().setInitialSelection(
               workspaceRoot.findMember(this.scdSection.getTextField().getText()));
      }

      setPageComplete(isValid());
   }


   public String getMetricValuesFilePath()
   {
      return this.metricValuesSection.getTextField().getText();
   }


   public String getSCDFilePath()
   {
      return this.scdSection.getTextField().getText();
   }


   protected boolean isValid()
   {
      if (this.metricValuesSection.getTextField().getText() == null)
      {
         setErrorMessage(WizardConstants.NO_METRIC_VALUES_ERROR_MESSAGE);
      }
      if (this.scdSection.getTextField().getText() == null)
      {
         setErrorMessage(WizardConstants.NO_SCD_ERROR_MESSAGE);
      }

      if (this.metricValuesSection.getTextField().getText() != null && this.scdSection.getTextField().getText() != null)
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
         s.put(WizardConstants.SETT_SCDM, this.scdSection.getTextField().getText());
         s.put(WizardConstants.SETT_METRIC_VALUES_MODEL, this.metricValuesSection.getTextField().getText());
      }
   }

}
