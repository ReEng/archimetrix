package org.reclipse.structure.inference.extended.ui;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.ui.IWorkbench;
import org.reclipse.structure.generator.PrepareDetectionEnginesJob;
import org.reclipse.structure.generator.preparationstrategies.
AbstractEnginePreparationStrategy;
import org.reclipse.structure.inference.extended.
CatalogModifyingGenerateEnginesStrategy;
import org.reclipse.structure.inference.ui.wizards.StartInferenceWizard;

/**
 * This wizard is used to start the deficiency detection in
 * Archimetrix. In addition to the
 * {@link StartInferenceWizard}, it also provides a page to
 * select the components in which
 * deficiencies should be detected.
 * @author Oleg
 * @see StartInferenceWizard
 */
public class StartModifyingCatalogWizard extends StartInferenceWizard {
    /**
     * Component selection wizard page.
     */
    private ComponentSelectionWizardPage componentSelectionPage;
    /**
     * Start modifying catalog wizard pare.
     */
    private StartModifyingCatalogWizardPage mainWizardPage;
    /**
     * Selection page.
     */
    private Object selectionPage;

    /**
     * the constructor.
     * @param workbench workbench
     */
    public StartModifyingCatalogWizard(final IWorkbench workbench) {
        super();
    }

    @Override
    public void addPages() {
        this.mainWizardPage = new StartModifyingCatalogWizardPage(
                "Design Deficiency Detection");
        // this resource set will only be used for selection
        // and generating story diagrams
        // on perform finish call it will be reset again
        this.mainWizardPage.initializeResourceSet();
        this.addPage(this.mainWizardPage);
        // add second page here
        this.componentSelectionPage = new ComponentSelectionWizardPage(
                "Select Components to be analyzed");
        this.addPage(componentSelectionPage);

    }

    /**
     * @param page wizard page
     * @see org.eclipse.jface.wizard.Wizard#getNextPage(
     * org.eclipse.jface.wizard.IWizardPage)
     * @return wizard page
     */
    @Override
    public IWizardPage getNextPage(IWizardPage page) {
        IWizardPage next = super.getNextPage(page);

        ((ComponentSelectionWizardPage) this.selectionPage).setSelection(
                this.page.getCatalogResource());

        this.componentSelectionPage.setSelection(
                this.mainWizardPage.getHostGraphResource());

        return next;
    }

    /**
     * Creates the job that prepares the deficiency detection
     * engines. In Archimetrix, we use the
     * {@link CatalogModifyingGenerateEnginesStrategy} which
     * modifies the catalog - and thus the
     * generated detection engines - such that only the selected
     * components will be considered
     * during the detection.
     * The selection of components is made by the user on
     * the {@link ComponentSelectionWizardPage}.
     * @see org.reclipse.structure.inference.ui.wizards.
     * StartInferenceWizard#createPrepareEnginesJob()
     * @return job
     */
    // @Override
    protected PrepareDetectionEnginesJob createPrepareEnginesJob() {

        Object[] selection = null;
        if (!((ComponentSelectionWizardPage) selectionPage).isAllChecked()) {
            selection = ((ComponentSelectionWizardPage)
                    selectionPage).getCheckedObjects();
        }
        Resource catalog = page.getCatalogResource();
        Resource engines = page.getEnginesResource();
        if (!this.page.isUseExistingEngines()) {
            URI uri = URI.createPlatformResourceURI(
                    catalog.getURI().toPlatformString(false) + ".ecore", true);
            engines = catalog.getResourceSet().createResource(uri);
        }
        AbstractEnginePreparationStrategy strategy =
                new CatalogModifyingGenerateEnginesStrategy(
                mainWizardPage.getCatalogResource(),
                this.componentSelectionPage.getCheckedObjects());

        return new PrepareDetectionEnginesJob(strategy,
                mainWizardPage.getReportLevel());
    }

    @Override
    protected void storePageSettings() {
        super.storePageSettings();
        // TODO: The selectionPage should also store its settings.
    }

}
