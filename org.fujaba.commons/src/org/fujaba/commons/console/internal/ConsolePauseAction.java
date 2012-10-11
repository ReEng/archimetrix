package org.fujaba.commons.console.internal;


import org.eclipse.jface.action.Action;
import org.eclipse.jface.resource.ImageDescriptor;
import org.fujaba.commons.FujabaCommonsImages;
import org.fujaba.commons.console.ProcessConsoleState;


public class ConsolePauseAction extends Action
{
   private ProcessConsole console;


   public ConsolePauseAction(ProcessConsole console)
   {
      super();

      this.console = console;

      // prepare config
      String text = "Pause Process";
      String key = FujabaCommonsImages.IMG_CONSOLE_PAUSE;
      ImageDescriptor image = FujabaCommonsImages.getDescriptor(key);

      // config
      setText(text);
      setChecked(false);
      setImageDescriptor(image);
      setEnabled(false);
   }


   @Override
   public void run()
   {
      if (isChecked())
      {
         console.fireNewState(ProcessConsoleState.PAUSED);
      }
      else
      {
         console.fireNewState(ProcessConsoleState.RUNNING);
      }
   }
}
