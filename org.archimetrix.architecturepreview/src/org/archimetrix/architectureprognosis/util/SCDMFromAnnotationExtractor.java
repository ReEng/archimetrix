package org.archimetrix.architectureprognosis.util;


import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.reclipse.structure.inference.annotations.ASGAnnotation;

import eu.qimpress.sourcecodedecorator.ComponentImplementingClassesLink;
import eu.qimpress.sourcecodedecorator.SourceCodeDecoratorRepository;


/**
 * This class can be used to get a source code decorator model out from a bad smell annotation.
 * 
 * @author mcp
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 * 
 */
public class SCDMFromAnnotationExtractor
{

   private static final String INDIRECT_COMPONENT_CLASSES_SPEC_NAME = "IndirectComponentClasses";

   private static final String DIRECT_COMPONENT_CLASSES_SPEC_NAME = "DirectComponentClasses";

   private static final String LINK_QUALIFIER = "link";


   /**
    * Gets the source code decorator model from a bad smell annotation.
    * 
    * @param anno an annotation of a pattern specified with the source code decorator meta model
    * @return the according source code decorator repository
    */
   public static SourceCodeDecoratorRepository getSCDM(final ASGAnnotation anno)
   {
      ASGAnnotation componentAnno = getComponentAnno(anno);
      ComponentImplementingClassesLink link = (ComponentImplementingClassesLink) (componentAnno
            .getAnnotatedElements().get(LINK_QUALIFIER)).get(0);
      return (SourceCodeDecoratorRepository) link.eContainer();
   }


   /**
    * Gets an annotation that represents direct or indirect component classes out of another
    * annotation.
    * 
    * @param anno an annotation of a pattern specified with the source code decorator meta model
    * @return a component classes annotation
    */
   private static ASGAnnotation getComponentAnno(final ASGAnnotation anno)
   {
      for (EList<EObject> boundObject : anno.getBoundObjects().values())
      {
         EObject eObject = boundObject.get(0);
         EcoreUtil.resolveAll(eObject);
         if (eObject instanceof ASGAnnotation)
         {
            ASGAnnotation subAnno = ((ASGAnnotation) eObject);
            if (subAnno.getPattern().getName().equals(DIRECT_COMPONENT_CLASSES_SPEC_NAME)
                  || (subAnno.getPattern().getName().equals(INDIRECT_COMPONENT_CLASSES_SPEC_NAME)))
            {
               return subAnno;
            }
         }
      }
      return null;
   }
}
