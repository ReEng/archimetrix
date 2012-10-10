/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.patterns.expressions.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.storydriven.modeling.patterns.expressions.*;
import org.storydriven.modeling.patterns.expressions.AttributeValueExpression;
import org.storydriven.modeling.patterns.expressions.ExpressionsFactory;
import org.storydriven.modeling.patterns.expressions.ExpressionsPackage;
import org.storydriven.modeling.patterns.expressions.ObjectSetSizeExpression;
import org.storydriven.modeling.patterns.expressions.ObjectVariableExpression;
import org.storydriven.modeling.patterns.expressions.PrimitiveVariableExpression;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * @generated
 */
public class ExpressionsFactoryImpl extends EFactoryImpl implements ExpressionsFactory
{
   /**
    * Creates the default factory implementation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public static ExpressionsFactory init ()
   {
      try
      {
         ExpressionsFactory theExpressionsFactory = (ExpressionsFactory) EPackage.Registry.INSTANCE
            .getEFactory("http://ns.storydriven.org/sdm/patterns/expressions/0.1.0");
         if (theExpressionsFactory != null)
         {
            return theExpressionsFactory;
         }
      }
      catch (Exception exception)
      {
         EcorePlugin.INSTANCE.log(exception);
      }
      return new ExpressionsFactoryImpl();
   }

   /**
    * Creates an instance of the factory.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public ExpressionsFactoryImpl ()
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
         case ExpressionsPackage.ATTRIBUTE_VALUE_EXPRESSION:
            return createAttributeValueExpression();
         case ExpressionsPackage.OBJECT_VARIABLE_EXPRESSION:
            return createObjectVariableExpression();
         case ExpressionsPackage.OBJECT_SET_SIZE_EXPRESSION:
            return createObjectSetSizeExpression();
         case ExpressionsPackage.PRIMITIVE_VARIABLE_EXPRESSION:
            return createPrimitiveVariableExpression();
         default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
      }
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public AttributeValueExpression createAttributeValueExpression ()
   {
      AttributeValueExpressionImpl attributeValueExpression = new AttributeValueExpressionImpl();
      return attributeValueExpression;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public ObjectVariableExpression createObjectVariableExpression ()
   {
      ObjectVariableExpressionImpl objectVariableExpression = new ObjectVariableExpressionImpl();
      return objectVariableExpression;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public ObjectSetSizeExpression createObjectSetSizeExpression ()
   {
      ObjectSetSizeExpressionImpl objectSetSizeExpression = new ObjectSetSizeExpressionImpl();
      return objectSetSizeExpression;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public PrimitiveVariableExpression createPrimitiveVariableExpression ()
   {
      PrimitiveVariableExpressionImpl primitiveVariableExpression = new PrimitiveVariableExpressionImpl();
      return primitiveVariableExpression;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public ExpressionsPackage getExpressionsPackage ()
   {
      return (ExpressionsPackage) getEPackage();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @deprecated
    * @generated
    */
   @Deprecated
   public static ExpressionsPackage getPackage ()
   {
      return ExpressionsPackage.eINSTANCE;
   }

} // ExpressionsFactoryImpl
