package org.archimetrix.architectureprognosis.ui.handler;


import org.archimetrix.architectureprognosis.ui.wizards.ArchitecturePrognosisWizard;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.handlers.HandlerUtil;


/**
 * Opens the wizard for starting the architecture prognosis. Is called when the user selects the
 * according entry in the menu bar (see plugin.xml).
 * 
 * @author mcp
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 * 
 */
public class ArchitecturePrognosisStartingHandler extends AbstractHandler
{

   @Override
   public Object execute(final ExecutionEvent event) throws ExecutionException
   {
      ArchitecturePrognosisWizard wizard = new ArchitecturePrognosisWizard();
      WizardDialog dialog = new WizardDialog(HandlerUtil.getActiveShell(event), wizard);
      dialog.open();
      return null;
   }
}