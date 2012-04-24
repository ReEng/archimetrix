package org.archimetrix.inference.ui;


import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.handlers.HandlerUtil;


/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 */
public class GeneratingInferenceHandler extends AbstractHandler
{
   @Override
   public Object execute(ExecutionEvent event) throws ExecutionException
   {
      StartModifyingCatalogWizard wizard = new StartModifyingCatalogWizard();

      new WizardDialog(HandlerUtil.getActiveShell(event), wizard).open();

      return null;
   }
}
