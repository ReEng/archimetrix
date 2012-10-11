package org.fujaba.commons.utils;

import java.util.HashMap;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.URIHandlerImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLParserPoolImpl;

/**
 * Use this resource factory as an alternative for XMIResourceFactoryImpl
 * or EcoreResourceFactoryImpl if you want to have ids assigned to your objects
 * ans some handling of several URI kinds like plugin or resource uris.
 * 
 * You have to assign an instance of this class to a resource set. Think about 
 * this, when you save some emf model or when you initialize an an editing domain.
 * 
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 *
 */
public class IDUsingResourceFactory extends ResourceFactoryImpl
{
   /**
    * Constructor for EcoreResourceFactoryImpl.
    */
   public IDUsingResourceFactory()
   {
     super();
   }

   @Override
   public Resource createResource(URI uri)
   {
     XMIResourceImpl result = 
       new XMIResourceImpl(uri)
       {
         @Override
         protected boolean useIDs()
         {
           return true;
         } 
       };
       
     result.setEncoding("UTF-8");
     result.getDefaultSaveOptions().put(XMLResource.OPTION_DEFER_ATTACHMENT, Boolean.TRUE);
     result.getDefaultSaveOptions().put(XMLResource.OPTION_DEFER_IDREF_RESOLUTION, Boolean.TRUE);
     result.getDefaultSaveOptions().put(XMLResource.OPTION_USE_DEPRECATED_METHODS, Boolean.TRUE);
     result.getDefaultSaveOptions().put(XMLResource.OPTION_USE_PARSER_POOL, new XMLParserPoolImpl());
     result.getDefaultSaveOptions().put(XMLResource.OPTION_USE_XML_NAME_TO_FEATURE_MAP, new HashMap<Object, Object>());
     
     result.getDefaultSaveOptions().put(XMLResource.OPTION_USE_ENCODED_ATTRIBUTE_STYLE, Boolean.TRUE);
     result.getDefaultSaveOptions().put(XMLResource.OPTION_LINE_WIDTH, 80);
     result.getDefaultSaveOptions().put(XMLResource.OPTION_URI_HANDLER, new URIHandlerImpl.PlatformSchemeAware());
     result.setIntrinsicIDToEObjectMap(new HashMap<String, EObject>());
     return result;
   }
}
