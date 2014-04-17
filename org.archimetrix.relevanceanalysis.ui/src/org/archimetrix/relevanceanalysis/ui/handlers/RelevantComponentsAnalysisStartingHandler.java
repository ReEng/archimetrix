package org.archimetrix.relevanceanalysis.ui.handlers;

import org.archimetrix.relevanceanalysis.ui.wizards.FindRelevantComponentsWizard;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * Opens the wizard for starting the Component Relevance Analysis. Is called when the user selects
 * the according entry in the menu bar (see plugin.xml).
 * 
 * @author mcp
 * 
 */
public class RelevantComponentsAnalysisStartingHandler extends AbstractHandler {

    @Override
    public Object execute(final ExecutionEvent event) throws ExecutionException {
        FindRelevantComponentsWizard wizard = new FindRelevantComponentsWizard();
        WizardDialog dialog = new WizardDialog(HandlerUtil.getActiveShell(event), wizard);
        dialog.open();
        return null;
    }
}