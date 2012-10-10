/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EcoreFactory;
import org.storydriven.modeling.ExtendableElement;
import org.storydriven.modeling.Extension;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations related to '<em><b>Extendable Element</b></em>' model objects. <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.storydriven.modeling.ExtendableElement#getExtension(org.eclipse.emf.ecore.EClass) <em>Get Extension</em>}</li>
 *   <li>{@link org.storydriven.modeling.ExtendableElement#provideExtension(org.eclipse.emf.ecore.EClass) <em>Provide Extension</em>}</li>
 *   <li>{@link org.storydriven.modeling.ExtendableElement#getAnnotation(java.lang.String) <em>Get Annotation</em>}</li>
 *   <li>{@link org.storydriven.modeling.ExtendableElement#provideAnnotation(java.lang.String) <em>Provide Annotation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExtendableElementOperations
{
   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   protected ExtendableElementOperations ()
   {
      super();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public static Extension getExtension (ExtendableElement extendableElement, EClass type)
   {
      EList<Extension> extensions = extendableElement.getExtensions();
      for (Extension extension: extensions)
      {
         if (type.isInstance(extension))
         {
            return extension;
         }
      }
      return null;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public static Extension provideExtension (ExtendableElement extendableElement, EClass type)
   {
      Extension extension = extendableElement.getExtension(type);
      if (extension == null)
      {
         extension = (Extension) type.getEPackage().getEFactoryInstance().create(type);
         extendableElement.getExtensions().add(extension);
      }
      return extension;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public static EAnnotation getAnnotation (ExtendableElement extendableElement, String source)
   {
      EList<EAnnotation> annotations = extendableElement.getAnnotations();
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
   public static EAnnotation provideAnnotation (ExtendableElement extendableElement, String source)
   {
      EAnnotation annotation = extendableElement.getAnnotation(source);
      if (annotation == null)
      {
         annotation = EcoreFactory.eINSTANCE.createEAnnotation();
         annotation.setSource(source);
         extendableElement.getAnnotations().add(annotation);
      }
      return annotation;
   }

} // ExtendableElementOperations