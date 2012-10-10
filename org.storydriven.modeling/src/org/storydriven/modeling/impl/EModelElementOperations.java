package org.storydriven.modeling.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.storydriven.modeling.Extension;
import org.storydriven.modeling.SDMPackage;

/**
 * @author <a href="mailto:reckord@yatta-solutions.com">Carsten Reckord</a> (original author)
 * @author $Author$ (last change)
 * @version $Revision$
 */
public class EModelElementOperations
{
   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public static EAnnotation getAnnotation (EModelElement annotatedElement, String source)
   {
      EList<EAnnotation> annotations = annotatedElement.getEAnnotations();
      if (source == null)
      {
         for (EAnnotation annotation: annotations)
         {
            if (annotation.getSource() == null)
            {
               return annotation;
            }
         }
      }
      else
      {
         for (EAnnotation annotation: annotations)
         {
            if (source.equals(annotation.getSource()))
            {
               return annotation;
            }
         }
      }
      return null;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public static EAnnotation provideAnnotation (EModelElement annotatedElement, String source)
   {
      EAnnotation annotation = annotatedElement.getEAnnotation(source);
      if (annotation == null)
      {
         annotation = EcoreFactory.eINSTANCE.createEAnnotation();
         annotation.setSource(source);
         annotatedElement.getEAnnotations().add(annotation);
      }
      return annotation;
   }

   public static Extension getExtension (EModelElement baseElement, EClass extensionType)
   {
      EAnnotation annotation = getAnnotation(baseElement, SDMPackage.EXTENSION_NS_URI);
      return annotation == null ? null : getContainedExtension(annotation, extensionType);
   }

   public static Extension getContainedExtension (EAnnotation annotation, EClass extensionType)
   {
      for (EObject eObject: annotation.getContents())
      {
         if (extensionType.isInstance(eObject))
         {
            return (Extension) eObject;
         }
      }
      return null;
   }

   public static Extension provideExtension (EModelElement baseElement, EClass extensionType)
   {
      EAnnotation annotation = provideAnnotation(baseElement, SDMPackage.EXTENSION_NS_URI);
      return provideContainedExtension(annotation, extensionType);
   }

   public static Extension provideContainedExtension (EAnnotation annotation, EClass extensionType)
   {
      Extension extension = getContainedExtension(annotation, extensionType);
      if (extension == null)
      {
         extension = (Extension) EcoreUtil.create(extensionType);
         annotation.getContents().add(extension);
      }
      return extension;
   }
}
