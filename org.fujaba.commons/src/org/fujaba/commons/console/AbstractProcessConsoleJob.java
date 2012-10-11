package org.fujaba.commons.console;


import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.resource.ImageDescriptor;
import org.fujaba.commons.FujabaCommonsImages;
import org.fujaba.commons.console.internal.ProcessConsole;


public abstract class AbstractProcessConsoleJob extends Job
{
   private final ProcessConsole console;


   /**
    * Creates a new console process with the given attributes and connects a new console to it.
    * 
    * @param category The category of the process.
    * @param name The name of the process.
    * @param description The description of the process.
    */
   public AbstractProcessConsoleJob(String category, String name,
         String description)
   {
      this(category, name, description, FujabaCommonsImages
            .getDescriptor(FujabaCommonsImages.IMG_CONSOLE_DEFAULT));
   }


   /**
    * Creates a new console process with the given attributes and connects a new console to it.
    * 
    * @param category The category of the process.
    * @param name The name of the process.
    * @param description The description of the process.
    * @param image An image descriptor for the process.
    */
   public AbstractProcessConsoleJob(String category, String name,
         String description, ImageDescriptor image)
   {
      super(name);
      setUser(true);

      console = (ProcessConsole) ProcessConsoleFactory.createConsole(category,
            name, description, image);
   }


   /**
    * Call this method to abort the process.
    */
   public final void abort()
   {
      console.fireNewState(ProcessConsoleState.ABORTED);
   }


   public void append(String message)
   {
      console.append(message);
   }


   public void append(String message, long time)
   {
      console.append(message, time);
   }


   public void append(String message, long time, String type)
   {
      console.append(message, time, type);
   }


   public void append(String message, String type)
   {
      console.append(message, type);
   }


   @Override
   protected final void canceling()
   {
      abort();
   }


   /**
    * Call this method when the process has been finished.
    */
   public final void finish()
   {
      console.fireNewState(ProcessConsoleState.FINISHED);
   }


   public IProcessConsole getConsole()
   {
      return console;
   }


   /**
    * Checks whether this process has already been aborted.
    * 
    * @return Returns <code>true</code> when aborted, otherwise <code>false</code>.
    */
   public final boolean isAborted()
   {
      return console.getProcessState().equals(ProcessConsoleState.ABORTED);
   }


   /**
    * Checks whether this process is paused at the moment.
    * 
    * @return Returns <code>true</code> when paused, otherwise <code>false</code>.
    */
   public final boolean isPaused()
   {
      return console.getProcessState().equals(ProcessConsoleState.PAUSED);
   }


   @Override
   public final IStatus run(IProgressMonitor monitor)
   {
      console.fireNewState(ProcessConsoleState.RUNNING);

      IStatus result = start(monitor);
      if (result == null)
      {
         result = Status.CANCEL_STATUS;
      }
      return result;
   }


   /**
    * Within this method the job is being processed. When possible, you should check the state of
    * the state of process regularly. For this, check {@link #isPaused()} and {@link #isAborted()}
    * at adequate time.
    * 
    * @param monitor The monitor to be used for reporting progress and responding to cancelation.
    *           The monitor is never <code>null</code>.
    * @return Returns the resulting status of the run.
    */
   public abstract IStatus start(IProgressMonitor monitor);
}
