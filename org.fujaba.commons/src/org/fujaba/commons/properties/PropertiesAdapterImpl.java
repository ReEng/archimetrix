package org.fujaba.commons.properties;


import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;


/**
 * This EMF listener receives an event and then handles this event in the UI thread.
 */
public abstract class PropertiesAdapterImpl extends AdapterImpl
{
   @Override
   public final void notifyChanged(Notification msg)
   {
      if (Display.getCurrent() != PlatformUI.getWorkbench().getDisplay())
      {
         syncNotifyChanged(msg);
      }
      else
      {
         safeNotifyChanged(msg);
      }
   }


   /**
    * Handles the event notification in the UI thread.
    * 
    * @param msg The event notification.
    */
   private void syncNotifyChanged(final Notification msg)
   {
      PlatformUI.getWorkbench().getDisplay().syncExec(new Runnable()
      {
         @Override
         public void run()
         {
            safeNotifyChanged(msg);
         }
      });
   }


   /**
    * This method is called when an event occurred on the model objects. This method is always
    * called in the UI thread.
    * 
    * @param msg The event notification.
    */
   protected abstract void safeNotifyChanged(Notification msg);
}
