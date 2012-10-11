package org.fujaba.commons.console.internal;


import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;
import org.fujaba.commons.console.IProcessConsole;
import org.fujaba.commons.console.IProcessConsoleListener;
import org.fujaba.commons.console.ProcessConsoleFactory;
import org.fujaba.commons.console.ProcessConsoleState;


public class ProcessConsole extends MessageConsole implements IProcessConsole,
      IProcessConsoleListener
{
   private static final String CONSOLE_TYPE = "FujabaProcessConsole"; //$NON-NLS-1$

   private static SimpleDateFormat DATE_FORMATTER;

   private static NumberFormat NUMBER_FORMATTER;


   private static String getName(ProcessConsole console)
   {
      // create it
      StringBuilder name = new StringBuilder();

      // append state
      switch (console.getProcessState())
      {
         case IDLING:
            name.append("<idling> ");
            break;

         case PAUSED:
            name.append("<paused> ");
            break;

         case FINISHED:
            name.append("<finished> ");
            break;

         case ABORTED:
            name.append("<aborted> ");
            break;
      }

      name.append(console.process);
      name.append(" ["); //$NON-NLS-1$
      name.append(console.category);
      name.append("] "); //$NON-NLS-1$
      name.append(console.detail);

      if (console.started > 0)
      {
         // get date
         Date started = new Date(console.started);

         name.append(" ("); //$NON-NLS-1$
         name.append(DateFormat.getDateTimeInstance().format(started));
         name.append(")"); //$NON-NLS-1$
      }

      return name.toString();
   }


   private static String getSeconds(double ms)
   {
      if (NUMBER_FORMATTER == null)
      {
         NUMBER_FORMATTER = NumberFormat.getNumberInstance();

         NUMBER_FORMATTER.setMaximumFractionDigits(3);
         NUMBER_FORMATTER.setMinimumFractionDigits(3);
      }

      return NUMBER_FORMATTER.format(ms / 1000d);
   }


   private static String getTimestamp(long time)
   {
      if (DATE_FORMATTER == null)
      {
         DATE_FORMATTER = new SimpleDateFormat();
         DATE_FORMATTER.applyPattern("HH:mm:ss,SSS");
      }

      return DATE_FORMATTER.format(new Date(time));
   }

   private final String category;

   private final String process;

   private final String detail;

   private ProcessConsoleState state;


   private long started;

   private long paused;


   private long pauseDurance;


   private final MessageConsoleStream stream;


   private final Set<IProcessConsoleListener> listeners;


   public ProcessConsole(String category, String process, String detail,
         ImageDescriptor image)
   {
      super(process, CONSOLE_TYPE, image, true);

      // initialize fields
      this.category = category;
      this.process = process;
      this.detail = detail;

      stream = newMessageStream();
      listeners = new HashSet<IProcessConsoleListener>();
      started = 0;
      paused = 0;
      pauseDurance = 0;

      addListener(this);

      // set initial state
      fireNewState(ProcessConsoleState.IDLING);

      refreshName();
   }


   @Override
   public boolean addListener(IProcessConsoleListener listener)
   {
      return listeners.add(listener);
   }


   public void fireNewState(ProcessConsoleState state)
   {
      for (IProcessConsoleListener listener : listeners)
      {
         listener.newState(state);
      }
   }


   @Override
   protected void dispose()
   {
      listeners.clear();

      super.dispose();
   }


   @Override
   public void append(String message)
   {
      append(message, System.currentTimeMillis(), null);
   }


   @Override
   public void append(String message, long time)
   {
      append(message, time, null);
   }


   @Override
   public void append(String message, long time, String type)
   {
      StringBuilder text = new StringBuilder();

      text.append(getTimestamp(time));

      if (type != null)
      {
         text.append(" ["); //$NON-NLS-1$
         text.append(type);
         text.append("]"); //$NON-NLS-1$
      }

      text.append(" "); //$NON-NLS-1$
      text.append(message);

      stream.println(text.toString());
   }


   @Override
   public void append(String message, String type)
   {
      append(message, System.currentTimeMillis(), type);
   }


   public ProcessConsoleState getProcessState()
   {
      return state;
   }


   public boolean canRemove()
   {
      // only running or paused
      switch (getProcessState())
      {
         case PAUSED:
         case RUNNING:
            return false;

         default:
            return true;
      }
   }


   @Override
   public void newState(ProcessConsoleState state)
   {
      // get current time
      long current = System.currentTimeMillis();

      // prepare text to append
      String text = null;

      // check state
      switch (state)
      {
         case IDLING:
            text = "The process has been created.";
            break;

         case PAUSED:
            paused = current;
            text = "The process has been paused.";
            break;

         case RUNNING:
            if (paused > 0)
            {
               pauseDurance += (current - paused);
               paused = 0;
               text = "The process has been resumed.";
            }
            else if (started == 0)
            {
               ProcessConsoleFactory.showConsole(this);
               started = current;
               text = "The process has been started.";
            }
            break;

         case FINISHED:
            if (pauseDurance > 0)
            {
               String message = "The process has been finished after %1$s seconds (plus %2$s seconds paused).";
               String running = getSeconds((current - started) - pauseDurance);
               String paused = getSeconds(pauseDurance);

               text = String.format(message, running, paused);
            }
            else
            {
               String message = "The process has been finished after %1$s seconds.";
               String running = getSeconds(current - started);

               text = String.format(message, running);
            }

            break;

         case ABORTED:
            if (pauseDurance > 0)
            {
               String message = "The process has been aborted after %1$s seconds (plus %2$s seconds paused).";
               String running = getSeconds((current - started) - pauseDurance);
               String paused = getSeconds(pauseDurance);

               text = String.format(message, running, paused);
            }
            else
            {
               String message = "The process has been aborted after %1$s seconds.";
               String running = getSeconds(current - started);

               text = String.format(message, running);
            }

            break;
      }

      // append the text
      append(text, current);

      // set the new state
      this.state = state;
      refreshName();
   }


   private void refreshName()
   {
      PlatformUI.getWorkbench().getDisplay().asyncExec(new Runnable()
      {
         @Override
         public void run()
         {
            setName(getName(ProcessConsole.this));
         }
      });
   }


   @Override
   public boolean removeListener(IProcessConsoleListener listener)
   {
      return listeners.remove(listener);
   }
}
