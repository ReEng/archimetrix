package org.fujaba.commons.console;


import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleFactory;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.IConsoleView;
import org.fujaba.commons.console.internal.ConsoleRemoveAllAction;
import org.fujaba.commons.console.internal.ProcessConsole;


public final class ProcessConsoleFactory implements IConsoleFactory
{
   private static final List<ProcessConsole> CONSOLES = new ArrayList<ProcessConsole>();


   /**
    * Removes the given console.
    * 
    * @param console The console to remove.
    * @return Returns <code>true</code> on success, otherwise <code>false</code>.
    */
   public static boolean remove(ProcessConsole console)
   {
      if (console.canRemove())
      {
         // remove from cache
         CONSOLES.remove(console);

         // remove from managed consoles
         IConsoleManager manager = ConsolePlugin.getDefault()
               .getConsoleManager();
         manager.removeConsoles(new IConsole[] { console });

         // recheck state
         checkRemoveAllState();

         return true;
      }

      return false;
   }


   public static IProcessConsole createConsole(String category, String name,
         String description, ImageDescriptor image)
   {
      // get manager
      IConsoleManager manager = ConsolePlugin.getDefault().getConsoleManager();

      // create console
      ProcessConsole console = new ProcessConsole(category, name, description,
            image);

      // add it
      CONSOLES.add(console);
      manager.addConsoles(new IConsole[] { console });

      return console;
   }


   public static boolean showConsole(ProcessConsole console)
   {
      // get manager
      IConsoleManager manager = ConsolePlugin.getDefault().getConsoleManager();

      // search for existing console
      for (IConsole existing : manager.getConsoles())
      {
         if (existing.equals(console))
         {
            // show it and abort
            manager.showConsoleView(console);
            return true;
         }
      }

      return false;
   }


   public static void removeAll()
   {
      // get manager
      IConsoleManager manager = ConsolePlugin.getDefault().getConsoleManager();

      // go through all existing console
      for (IConsole console : manager.getConsoles())
      {
         // check console type
         if (console instanceof ProcessConsole)
         {
            remove((ProcessConsole) console);
         }
      }
   }


   @Override
   public void openConsole()
   {
      IWorkbench workbench = PlatformUI.getWorkbench();
      if (workbench != null)
      {
         IWorkbenchWindow window = workbench.getActiveWorkbenchWindow();
         if (window != null)
         {
            IWorkbenchPage page = window.getActivePage();
            if (page != null)
            {
               IWorkbenchPart part = page.getActivePart();
               if (part instanceof IConsoleView)
               {
                  IConsole console = ((IConsoleView) part).getConsole();

                  if (console instanceof ProcessConsole)
                  {
                     // show console
                     showConsole((ProcessConsole) console);
                  }
                  else
                  {
                     // show last added console
                     if (!CONSOLES.isEmpty())
                     {
                        showConsole(CONSOLES.get(CONSOLES.size() - 1));
                     }
                  }
               }
            }
         }
      }
   }


   public static void checkRemoveAllState()
   {
      boolean foundOne = false;

      for (ProcessConsole console : CONSOLES)
      {
         if (console.canRemove())
         {
            if (foundOne)
            {
               ConsoleRemoveAllAction.DEFAULT.setEnabled(true);
               return;
            }

            foundOne = true;
         }
      }

      ConsoleRemoveAllAction.DEFAULT.setEnabled(false);
   }
}
