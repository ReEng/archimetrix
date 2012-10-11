package org.fujaba.commons.console.internal;


import org.eclipse.jface.action.Action;
import org.eclipse.jface.resource.ImageDescriptor;
import org.fujaba.commons.FujabaCommonsImages;
import org.fujaba.commons.console.ProcessConsoleFactory;


public class ConsoleRemoveAllAction extends Action
{
   public static ConsoleRemoveAllAction DEFAULT = new ConsoleRemoveAllAction();


   private ConsoleRemoveAllAction()
   {
      super();

      // prepare config
      String text = "Remove All Ended Processes";
      String key = FujabaCommonsImages.IMG_CONSOLE_REMOVEALL;
      ImageDescriptor image = FujabaCommonsImages.getDescriptor(key);

      // config
      setText(text);
      setImageDescriptor(image);
      setEnabled(false);
   }


   @Override
   public void run()
   {
      ProcessConsoleFactory.removeAll();
   }
}
