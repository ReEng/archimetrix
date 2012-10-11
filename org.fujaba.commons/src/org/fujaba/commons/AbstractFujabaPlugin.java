package org.fujaba.commons;


import org.eclipse.core.runtime.IStatus;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.plugin.AbstractUIPlugin;


/**
 * The activator class controls the plug-in life cycle and support logging of informations, warnings
 * and errors.
 * 
 * @author harka
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 */
public abstract class AbstractFujabaPlugin extends AbstractUIPlugin
{
   /**
    * Caches the image under the given path to the registry of the plug-in when possible.
    * 
    * @param key The key for the image to add.
    * @param path The plug-in specific path of the image.
    * @return Returns <code>true</code> when the image was successfully added, <code>false</code>
    *         otherwise.
    */
   public boolean addImageToCache(String key, String path)
   {
      ImageDescriptor desc = ImageDescriptor.createFromURL(getBundle()
            .getEntry(path));
      if (desc != null)
      {
         getImageRegistry().put(key, desc);
         return true;
      }
      else
      {
         logWarning("The image under '" + path
               + "' could not be cached. It probably does not exist.");
         return false;
      }
   }


   /**
    * Returns the descriptor associated with the given key or <code>null</code> if none.
    * 
    * @param key The key of the image.
    * @return Returns the descriptor.
    */
   public ImageDescriptor getImageDescriptor(String key)
   {
      if (getImageRegistry().getDescriptor(key) == null)
      {
         return ImageDescriptor.getMissingImageDescriptor();
      }
      else
      {
         return getImageRegistry().getDescriptor(key);
      }
   }


   /**
    * Returns the image associated with the given key or <code>null</code> if none.
    * 
    * @param key The key of the image.
    * @return Returns the image.
    */
   public Image getImage(String key)
   {
      if (getImageRegistry().get(key) == null)
      {
         return ImageDescriptor.getMissingImageDescriptor().createImage();
      }
      else
      {
         return getImageRegistry().get(key);
      }
   }


   /**
    * Logs an information message.
    * 
    * @param message The information message.
    */
   public void logInfo(String message)
   {
      logInfo(message, null);
   }


   /**
    * Logs an information message with its related exception.
    * 
    * @param message The information message.
    * @param exception The actual exception or <code>null</code> can be passed.
    */
   public void logInfo(String message, Throwable exception)
   {
      if (message == null && exception != null)
      {
         message = exception.getMessage();
      }

      log(IStatus.INFO, message, exception);
   }


   /**
    * Logs a warning message.
    * 
    * @param message The warning message.
    */
   public void logWarning(String message)
   {
      logWarning(message, null);
   }


   /**
    * Logs a warning message with its related exception.
    * 
    * @param message The warning message.
    * @param exception The actual exception or <code>null</code> can be passed.
    */
   public void logWarning(String message, Throwable exception)
   {
      if (message == null && exception != null)
      {
         message = exception.getMessage();
      }

      log(IStatus.WARNING, message, exception);
   }


   /**
    * Logs an error message.
    * 
    * @param message The error message.
    */
   public void logError(String message)
   {
      logError(message, null);
   }


   /**
    * Logs an error message with its related exception.
    * 
    * @param message The error message.
    * @param exception The actual exception or null can be passed.
    */
   public void logError(String message, Throwable exception)
   {
      if (message == null && exception != null)
      {
         message = exception.getMessage();
      }

      log(IStatus.ERROR, message, exception);
   }


   /**
    * Implement this method with the subclass ID as argument. Use the following code 
    * as a template.
    * <br><br>
    *  getLog().log(new Status(severity, "YOUR ID", message, throwable));
    * @param severity
    * @param message
    * @param throwable
    */
   protected abstract void log(int severity, String message, Throwable throwable);
}
