package org.reclipse.structure.inference.extended.ui;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * @author Oleg
 */
public class GeneratingInferenceHandler extends AbstractHandler {

    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
        IWorkbench workbench = HandlerUtil.getActiveWorkbenchWindowChecked(
                event).getWorkbench();
        StartModifyingCatalogWizard wizard = new StartModifyingCatalogWizard(
                workbench);
        WizardDialog dialog = new WizardDialog(HandlerUtil.getActiveShell(
                event), wizard);
        dialog.open();
        return null;
    }

}
