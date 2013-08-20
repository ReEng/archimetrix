package org.archimetrix.architectureprognosis.ui.wizards;


import org.archimetrix.commons.wizards.AbstractWizardPage;
import org.archimetrix.commons.wizards.ResourceSelectionSection;
import org.archimetrix.commons.wizards.WizardConst;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.reclipse.structure.inference.annotations.ASGAnnotation;


/**
 * A wizard page that contains several resource selection sections that are required for the
 * architecture prognosis.
 * 
 * @author mcp
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 * 
 */
public class ArchitecturePrognosisWizardPage extends AbstractWizardPage
{
   private static final String WIZARD_PAGE_DESCRIPTION_LONG = "Select a file with the detected deficiency occurrences and a file with the reengineering strategies.";

   private static final String WIZARD_PAGE_DESCRIPTION_SHORT = "Select a file with reengineering strategies.";

   private static final String WIZARD_PAGE_TITLE = "Architecture Preview";

   private final ASGAnnotation selectedAnnotationFromRelevantBadSmellsView;

   private ResourceSelectionSection metricValuesSection;

   private ResourceSelectionSection badSmellsSection;

   private ResourceSelectionSection reStrategiesSection;


   protected ArchitecturePrognosisWizardPage(final String pageName, final ArchitecturePrognosisWizard wizard,
         final ASGAnnotation selectedAnnotationFromRelevantBadSmellsView)
   {
      super(pageName);
      setTitle(WIZARD_PAGE_TITLE);
      if (selectedAnnotationFromRelevantBadSmellsView != null)
      {
         setDescription(WIZARD_PAGE_DESCRIPTION_SHORT);
      }
      else
      {
         setDescription(WIZARD_PAGE_DESCRIPTION_LONG);
      }
      this.selectedAnnotationFromRelevantBadSmellsView = selectedAnnotationFromRelevantBadSmellsView;
   }


   @Override
   public void createControl(final Composite parent)
   {
      Composite composite = new Composite(parent, SWT.NONE);
      composite.setLayout(new GridLayout());

      createInputsGroup(composite);

      setControl(composite);
      setPageComplete(false);
      loadSettings();

   }


   private void createInputsGroup(final Composite composite)
   {
      Group inputs = this.getResourceSelectionSectionProvider().createInputGroup(composite);

      this.metricValuesSection = this.getResourceSelectionSectionProvider().addMetricValuesResourceSelection(inputs, this);
      if (this.selectedAnnotationFromRelevantBadSmellsView == null)
      {
         // wizard has been called from menu bar and not from the relevant bad smells view, so an
         // additional section to select the bad smells, is required
         this.badSmellsSection = this.getResourceSelectionSectionProvider().addBadSmellsResourceSelection(inputs, this);
      }
      this.reStrategiesSection = this.getResourceSelectionSectionProvider()
            .addReengineeringStrategiesSelection(inputs, this);
   }


   private void loadSettings()
   {
      IDialogSettings s = getDialogSettings();
      if (s != null)
      {
         this.metricValuesSection.getTextField().setText(
               s.get(WizardConst.WizardConstants_SETT_METRIC_VALUES_MODEL) == null ? "" : s
                     .get(WizardConst.WizardConstants_SETT_METRIC_VALUES_MODEL));
         if (this.badSmellsSection != null)
         {
            this.badSmellsSection.getTextField().setText(
                  s.get(WizardConst.WizardConstants_SETT_BAD_SMELLS) == null ? "" : s.get(WizardConst.WizardConstants_SETT_BAD_SMELLS));
         }
         this.reStrategiesSection.getTextField().setText(
               s.get(WizardConst.WizardConstants_SETT_REENGINEERING_STRATEGIES) == null ? "" : s
                     .get(WizardConst.WizardConstants_SETT_REENGINEERING_STRATEGIES));

      }
   }


   @Override
   public void widgetSelected(final SelectionEvent e)
   {
      widgetDefaultSelected(e);
   }


   @Override
   public void widgetDefaultSelected(final SelectionEvent e)
   {
      setPageComplete(isValid());
   }


   @Override
   public void modifyText(final ModifyEvent e)
   {
      if (this.badSmellsSection != null)
      {
         if (e.getSource() == this.badSmellsSection.getTextField())
         {
            this.badSmellsSection.getDialog().setInitialSelection(
                  ResourcesPlugin.getWorkspace().getRoot().findMember(this.badSmellsSection.getTextField().getText()));
         }
      }
      if (e.getSource() == this.metricValuesSection.getTextField())
      {
         this.metricValuesSection.getDialog().setInitialSelection(
               ResourcesPlugin.getWorkspace().getRoot().findMember(this.metricValuesSection.getTextField().getText()));
      }
      else if (e.getSource() == this.reStrategiesSection.getTextField())
      {
         this.reStrategiesSection.getDialog().setInitialSelection(
               ResourcesPlugin.getWorkspace().getRoot().findMember(this.reStrategiesSection.getTextField().getText()));
      }

      setPageComplete(isValid());
   }


   public String getReengineeringStrategiesFilePath()
   {
      return this.reStrategiesSection.getTextField().getText();
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
      if (this.reStrategiesSection.getTextField().getText() == null)
      {
         setErrorMessage(WizardConst.WizardConstants_NO_REENGINEERING_STRATEGIES_ERROR_MESSAGE);
      }
      if (this.metricValuesSection.getTextField().getText() == null)
      {
         setErrorMessage(WizardConst.WizardConstants_NO_METRIC_VALUES_ERROR_MESSAGE);
      }

      if (this.badSmellsSection != null && this.badSmellsSection.getTextField().getText() == null)
      {
         setErrorMessage(WizardConst.WizardConstants_NO_BAD_SMELLS_ERROR_MESSAGE);
      }

      if (this.metricValuesSection.getTextField() != null && this.metricValuesSection.getTextField().getText() != null
            && (this.badSmellsSection == null || this.badSmellsSection.getTextField().getText() != null))
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
         s.put(WizardConst.WizardConstants_SETT_METRIC_VALUES_MODEL, this.metricValuesSection.getTextField().getText());
         s.put(WizardConst.WizardConstants_SETT_REENGINEERING_STRATEGIES, this.reStrategiesSection.getTextField().getText());
         if (this.badSmellsSection != null)
         {
            s.put(WizardConst.WizardConstants_SETT_BAD_SMELLS, this.badSmellsSection.getTextField().getText());
         }
      }
   }


   @Override
   public boolean canFlipToNextPage()
   {
      return isPageComplete();
   }

}
