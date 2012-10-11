package org.fujaba.commons.console.internal;


import org.eclipse.jface.action.Action;
import org.eclipse.jface.resource.ImageDescriptor;
import org.fujaba.commons.FujabaCommonsImages;
import org.fujaba.commons.console.ProcessConsoleState;


public class ConsoleAbortAction extends Action
{
   private ProcessConsole console;


   public ConsoleAbortAction(ProcessConsole console)
   {
      super();

      this.console = console;

      // prepare config
      String text = "Abort Process";
      String key = FujabaCommonsImages.IMG_CONSOLE_ABORT;
      ImageDescriptor image = FujabaCommonsImages.getDescriptor(key);

      // config
      setText(text);
      setImageDescriptor(image);
      setEnabled(false);
   }


   @Override
   public void run()
   {
      console.fireNewState(ProcessConsoleState.ABORTED);
   }
}
