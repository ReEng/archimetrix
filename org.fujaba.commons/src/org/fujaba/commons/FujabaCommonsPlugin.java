package org.fujaba.commons;


import org.eclipse.core.runtime.Status;
import org.osgi.framework.BundleContext;


/**
 * The activator class controls the plug-in life cycle.
 * 
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 */
public class FujabaCommonsPlugin extends AbstractFujabaPlugin
{

   public final static String ID = "org.fujaba.commons";

   /**
    * The shared instance.
    */
   private static FujabaCommonsPlugin instance;


   @Override
   public void start(BundleContext context) throws Exception
   {
      super.start(context);
      instance = this;

      // add images to cache
      addImage(FujabaCommonsImages.IMG_CONSOLE_DEFAULT);
      addImage(FujabaCommonsImages.IMG_CONSOLE_PAUSE);
      addImage(FujabaCommonsImages.IMG_CONSOLE_ABORT);
      addImage(FujabaCommonsImages.IMG_CONSOLE_REMOVE);
      addImage(FujabaCommonsImages.IMG_CONSOLE_REMOVEALL);
   }


   private void addImage(String path)
   {
      addImageToCache(path, path);
   }


   @Override
   public void stop(BundleContext context) throws Exception
   {
      instance = null;
      super.stop(context);
   }


   /**
    * The singleton accessor.
    * 
    * @return Returns the shared instance
    */
   public static FujabaCommonsPlugin getDefault()
   {
      return instance;
   }


   @Override
   protected void log(int severity, String message, Throwable throwable)
   {
      getLog().log(new Status(severity, ID, message, throwable));
   }
}
