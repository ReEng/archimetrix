/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.expressions.pathbridge.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.storydriven.modeling.expressions.pathbridge.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PathbridgeFactoryImpl extends EFactoryImpl implements PathbridgeFactory
{
   /**
    * Creates the default factory implementation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static PathbridgeFactory init()
   {
      try
      {
         PathbridgeFactory thePathbridgeFactory = (PathbridgeFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.storydriven.org/modeling/expressions/pathbridge"); 
         if (thePathbridgeFactory != null)
         {
            return thePathbridgeFactory;
         }
      }
      catch (Exception exception)
      {
         EcorePlugin.INSTANCE.log(exception);
      }
      return new PathbridgeFactoryImpl();
   }

   /**
    * Creates an instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public PathbridgeFactoryImpl()
   {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public EObject create(EClass eClass)
   {
      switch (eClass.getClassifierID())
      {
         case PathbridgePackage.PATH_EXPRESSION_BRIDGE: return createPathExpressionBridge();
         default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
      }
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public PathExpressionBridge createPathExpressionBridge()
   {
      PathExpressionBridgeImpl pathExpressionBridge = new PathExpressionBridgeImpl();
      return pathExpressionBridge;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public PathbridgePackage getPathbridgePackage()
   {
      return (PathbridgePackage)getEPackage();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @deprecated
    * @generated
    */
   @Deprecated
   public static PathbridgePackage getPackage()
   {
      return PathbridgePackage.eINSTANCE;
   }

} //PathbridgeFactoryImpl
