package org.archimetrix.commons;


import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;


/**
 * Provides helper methods for loading resources.
 * 
 * @author mcp
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 * 
 */
public class ResourceLoader
{

   /**
    * Returns an EMF resource from a file that lies behind the given path.
    * 
    * @param path that specifies the location of the resource to be returned
    * @return a resource
    */
   public static Resource loadResource(final String path)
   {
      if (path.isEmpty())
      {
         return null;
      }
      URI uri = URI.createPlatformResourceURI(path, true);
      ResourceSet ress = new ResourceSetImpl();
      Resource res = ress.getResource(uri, true);
      return res;
   }
}
