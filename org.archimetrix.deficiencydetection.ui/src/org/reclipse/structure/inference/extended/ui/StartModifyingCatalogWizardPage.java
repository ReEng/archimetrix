package org.reclipse.structure.inference.extended.ui;

import org.reclipse.structure.inference.ui.wizards.StartInferenceWizardPage;

/**
 * @author Oleg
 */
public class StartModifyingCatalogWizardPage extends StartInferenceWizardPage {

    /**
     * the constructor.
     * @param name name
     */
    protected StartModifyingCatalogWizardPage(final String name) {
        super(name);
        setTitle("Design Deficiency Detection");
    }

    @Override
    public boolean canFlipToNextPage() {
        return isPageComplete();
    }

    @Override
    protected String getHostGraphFileExt() {
        return "sourcecodedecorator";
    }

}
