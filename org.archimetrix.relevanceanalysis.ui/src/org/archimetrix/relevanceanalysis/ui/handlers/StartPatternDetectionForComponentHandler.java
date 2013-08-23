package org.archimetrix.relevanceanalysis.ui.handlers;

import org.archimetrix.relevanceanalysis.ui.wizards.StartPatternDetectionForComponentWizard;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * Opens the wizard for starting the pattern detection on a selected Component. Is called when the
 * user selects the according entry in the context menu (see plugin.xml).
 * 
 * @author mcp
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 * 
 */
public class StartPatternDetectionForComponentHandler extends AbstractHandler {

    @Override
    public Object execute(final ExecutionEvent event) throws ExecutionException {
        IWorkbench workbench = HandlerUtil.getActiveWorkbenchWindowChecked(event).getWorkbench();
        StartPatternDetectionForComponentWizard wizard = new StartPatternDetectionForComponentWizard(workbench);
        WizardDialog dialog = new WizardDialog(HandlerUtil.getActiveShell(event), wizard);
        dialog.open();
        return null;
    }
}