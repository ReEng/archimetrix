package org.fujaba.commons.console.internal;


import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleConstants;
import org.eclipse.ui.console.IConsolePageParticipant;
import org.eclipse.ui.part.IPageBookViewPage;
import org.fujaba.commons.console.IProcessConsoleListener;
import org.fujaba.commons.console.ProcessConsoleFactory;
import org.fujaba.commons.console.ProcessConsoleState;


public final class ProcessConsoleProvider implements IConsolePageParticipant,
      IProcessConsoleListener
{
   private ConsolePauseAction actionPause;

   private ConsoleAbortAction actionAbort;

   private ConsoleRemoveAction actionRemove;


   private ProcessConsole console;


   @Override
   public void init(IPageBookViewPage page, IConsole console)
   {
      if (console instanceof ProcessConsole)
      {
         // console
         this.console = (ProcessConsole) console;

         // append as listener
         this.console.addListener(this);

         // create actions
         actionPause = new ConsolePauseAction(this.console);
         actionAbort = new ConsoleAbortAction(this.console);
         actionRemove = new ConsoleRemoveAction(this.console);

         // configure toolbar
         String group = IConsoleConstants.LAUNCH_GROUP;
         IToolBarManager mgr = page.getSite().getActionBars()
               .getToolBarManager();
         mgr.appendToGroup(group, actionPause);
         mgr.appendToGroup(group, actionAbort);
         mgr.appendToGroup(group, actionRemove);
         mgr.appendToGroup(group, ConsoleRemoveAllAction.DEFAULT);

         // refresh them
         newState(((ProcessConsole) console).getProcessState());
      }
   }


   @Override
   public void newState(ProcessConsoleState state)
   {
      switch (state)
      {
         case IDLING:
         case ABORTED:
         case FINISHED:
            actionPause.setEnabled(false);
            actionAbort.setEnabled(false);
            actionRemove.setEnabled(true);
            break;

         case PAUSED:
         case RUNNING:
            actionPause.setEnabled(true);
            actionAbort.setEnabled(true);
            actionRemove.setEnabled(false);
            break;

         default:
            break;
      }

      ProcessConsoleFactory.checkRemoveAllState();
   }


   @Override
   public Object getAdapter(@SuppressWarnings("rawtypes") Class adapter)
   {
      return null;
   }


   @Override
   public void dispose()
   {
      console.removeListener(this);

      actionAbort = null;
      actionPause = null;
      actionRemove = null;

      console = null;
   }


   @Override
   public void activated()
   {
      // nothing
   }


   @Override
   public void deactivated()
   {
      // nothing
   }
}
