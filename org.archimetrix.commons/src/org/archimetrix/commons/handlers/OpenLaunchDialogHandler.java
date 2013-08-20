package org.archimetrix.commons.handlers;


import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.debug.ui.DebugUITools;
import org.eclipse.debug.ui.IDebugUIConstants;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

public class OpenLaunchDialogHandler extends AbstractHandler{

   @Override
   public Object execute(ExecutionEvent event) throws ExecutionException{
      DebugUITools.openLaunchConfigurationDialogOnGroup(
            HandlerUtil.getActiveShell(event), new StructuredSelection(),
            IDebugUIConstants.ID_RUN_LAUNCH_GROUP);
      return null;
   }

}
