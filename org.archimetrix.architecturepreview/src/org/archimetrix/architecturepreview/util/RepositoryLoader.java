package org.archimetrix.architecturepreview.util;


import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import eu.qimpress.samm.staticstructure.Repository;
import org.somox.sourcecodedecorator.SourceCodeDecoratorRepository;


/**
 * This class loads a SAMM repository that belongs to a given SCDM.
 * 
 * @author mcp
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 * 
 */
public class RepositoryLoader
{
   /**
    * Loads the SAMM that belongs to the given SCD model.
    * 
    * @param scdm a source code decorator model
    * @return a SAMM repository
    */
   public static Repository loadSammRep(final SourceCodeDecoratorRepository scdm)
   {
      Repository rep = (Repository) scdm.getComponentImplementingClassesLink().get(0).getComponent().eContainer();
      if (rep != null)
      {
         return rep;
      }
      // FIXME Check if there are still cases, where the following is needed. If yes, the path
      // should be configurable.
      String path = scdm.eResource().getURI().path().replace("/resource", "")
            .replace("sourcecodedecorator", "samm_repository");
      URI sammFileUri = URI.createPlatformResourceURI(path, true);
      ResourceSet sammRess = new ResourceSetImpl();
      Resource sammRes = sammRess.getResource(sammFileUri, true);
      return (Repository) sammRes.getContents().get(0);
   }
}
