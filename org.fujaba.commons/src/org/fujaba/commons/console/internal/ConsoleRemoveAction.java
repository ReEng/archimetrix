package org.fujaba.commons.console.internal;


import org.eclipse.jface.action.Action;
import org.eclipse.jface.resource.ImageDescriptor;
import org.fujaba.commons.FujabaCommonsImages;
import org.fujaba.commons.console.ProcessConsoleFactory;


public class ConsoleRemoveAction extends Action
{
   private ProcessConsole console;


   public ConsoleRemoveAction(ProcessConsole console)
   {
      super();

      this.console = console;

      // prepare config
      String text = "Remove Process";
      String key = FujabaCommonsImages.IMG_CONSOLE_REMOVE;
      ImageDescriptor image = FujabaCommonsImages.getDescriptor(key);

      // config
      setText(text);
      setImageDescriptor(image);
      setEnabled(false);
   }


   @Override
   public void run()
   {
      if (console.canRemove())
      {
         ProcessConsoleFactory.remove(console);
      }
   }
}
