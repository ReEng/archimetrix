/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.storydriven.modeling.*;
import org.storydriven.modeling.SDMFactory;
import org.storydriven.modeling.SDMPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * @generated
 */
public class SDMFactoryImpl extends EFactoryImpl implements SDMFactory
{
   /**
    * Creates the default factory implementation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public static SDMFactory init ()
   {
      try
      {
         SDMFactory theSDMFactory = (SDMFactory) EPackage.Registry.INSTANCE
            .getEFactory("http://ns.storydriven.org/sdm/0.1.0");
         if (theSDMFactory != null)
         {
            return theSDMFactory;
         }
      }
      catch (Exception exception)
      {
         EcorePlugin.INSTANCE.log(exception);
      }
      return new SDMFactoryImpl();
   }

   /**
    * Creates an instance of the factory.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public SDMFactoryImpl ()
   {
      super();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   @Override
   public EObject create (EClass eClass)
   {
      switch (eClass.getClassifierID())
      {
         default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
      }
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public SDMPackage getSDMPackage ()
   {
      return (SDMPackage) getEPackage();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @deprecated
    * @generated
    */
   @Deprecated
   public static SDMPackage getPackage ()
   {
      return SDMPackage.eINSTANCE;
   }

} // SDMFactoryImpl
