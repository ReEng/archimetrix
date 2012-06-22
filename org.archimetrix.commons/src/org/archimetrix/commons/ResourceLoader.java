package org.archimetrix.commons;


import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMLParserPoolImpl;


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

      Map<Object, Object> options = ress.getLoadOptions();

      options.put(XMLResource.OPTION_DEFER_ATTACHMENT, Boolean.TRUE);
      options.put(XMLResource.OPTION_DEFER_IDREF_RESOLUTION, Boolean.TRUE);
      options.put(XMLResource.OPTION_USE_DEPRECATED_METHODS, Boolean.TRUE);
      options.put(XMLResource.OPTION_USE_PARSER_POOL, new XMLParserPoolImpl());
      options.put(XMLResource.OPTION_USE_XML_NAME_TO_FEATURE_MAP,
            new HashMap<Object, Object>());
      ((ResourceImpl) res)
            .setIntrinsicIDToEObjectMap(new HashMap<String, EObject>());

      try
      {
         res.load(options);
         EcoreUtil.resolveAll(res);
      }
      catch (IOException e)
      {
         e.printStackTrace();
      }

      return res;
   }
}
