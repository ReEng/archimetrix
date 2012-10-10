/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.expressions.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.storydriven.modeling.expressions.*;
import org.storydriven.modeling.expressions.ArithmeticExpression;
import org.storydriven.modeling.expressions.ArithmeticOperator;
import org.storydriven.modeling.expressions.BinaryLogicExpression;
import org.storydriven.modeling.expressions.ComparingOperator;
import org.storydriven.modeling.expressions.ComparisonExpression;
import org.storydriven.modeling.expressions.ExpressionsFactory;
import org.storydriven.modeling.expressions.ExpressionsPackage;
import org.storydriven.modeling.expressions.LiteralExpression;
import org.storydriven.modeling.expressions.LogicOperator;
import org.storydriven.modeling.expressions.NotExpression;
import org.storydriven.modeling.expressions.TextualExpression;

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
            .getEFactory("http://ns.storydriven.org/sdm/expressions/0.1.0");
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
         case ExpressionsPackage.TEXTUAL_EXPRESSION:
            return createTextualExpression();
         case ExpressionsPackage.LITERAL_EXPRESSION:
            return createLiteralExpression();
         case ExpressionsPackage.NOT_EXPRESSION:
            return createNotExpression();
         case ExpressionsPackage.COMPARISON_EXPRESSION:
            return createComparisonExpression();
         case ExpressionsPackage.ARITHMETIC_EXPRESSION:
            return createArithmeticExpression();
         case ExpressionsPackage.BINARY_LOGIC_EXPRESSION:
            return createBinaryLogicExpression();
         default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
      }
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   @Override
   public Object createFromString (EDataType eDataType, String initialValue)
   {
      switch (eDataType.getClassifierID())
      {
         case ExpressionsPackage.LOGIC_OPERATOR:
            return createLogicOperatorFromString(eDataType, initialValue);
         case ExpressionsPackage.COMPARING_OPERATOR:
            return createComparingOperatorFromString(eDataType, initialValue);
         case ExpressionsPackage.ARITHMETIC_OPERATOR:
            return createArithmeticOperatorFromString(eDataType, initialValue);
         default:
            throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
      }
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   @Override
   public String convertToString (EDataType eDataType, Object instanceValue)
   {
      switch (eDataType.getClassifierID())
      {
         case ExpressionsPackage.LOGIC_OPERATOR:
            return convertLogicOperatorToString(eDataType, instanceValue);
         case ExpressionsPackage.COMPARING_OPERATOR:
            return convertComparingOperatorToString(eDataType, instanceValue);
         case ExpressionsPackage.ARITHMETIC_OPERATOR:
            return convertArithmeticOperatorToString(eDataType, instanceValue);
         default:
            throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
      }
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public TextualExpression createTextualExpression ()
   {
      TextualExpressionImpl textualExpression = new TextualExpressionImpl();
      return textualExpression;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public LiteralExpression createLiteralExpression ()
   {
      LiteralExpressionImpl literalExpression = new LiteralExpressionImpl();
      return literalExpression;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public NotExpression createNotExpression ()
   {
      NotExpressionImpl notExpression = new NotExpressionImpl();
      return notExpression;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public ComparisonExpression createComparisonExpression ()
   {
      ComparisonExpressionImpl comparisonExpression = new ComparisonExpressionImpl();
      return comparisonExpression;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public ArithmeticExpression createArithmeticExpression ()
   {
      ArithmeticExpressionImpl arithmeticExpression = new ArithmeticExpressionImpl();
      return arithmeticExpression;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public BinaryLogicExpression createBinaryLogicExpression ()
   {
      BinaryLogicExpressionImpl binaryLogicExpression = new BinaryLogicExpressionImpl();
      return binaryLogicExpression;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public LogicOperator createLogicOperatorFromString (EDataType eDataType, String initialValue)
   {
      LogicOperator result = LogicOperator.get(initialValue);
      if (result == null)
         throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
            + eDataType.getName() + "'");
      return result;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public String convertLogicOperatorToString (EDataType eDataType, Object instanceValue)
   {
      return instanceValue == null ? null : instanceValue.toString();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public ComparingOperator createComparingOperatorFromString (EDataType eDataType, String initialValue)
   {
      ComparingOperator result = ComparingOperator.get(initialValue);
      if (result == null)
         throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
            + eDataType.getName() + "'");
      return result;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public String convertComparingOperatorToString (EDataType eDataType, Object instanceValue)
   {
      return instanceValue == null ? null : instanceValue.toString();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public ArithmeticOperator createArithmeticOperatorFromString (EDataType eDataType, String initialValue)
   {
      ArithmeticOperator result = ArithmeticOperator.get(initialValue);
      if (result == null)
         throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
            + eDataType.getName() + "'");
      return result;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public String convertArithmeticOperatorToString (EDataType eDataType, Object instanceValue)
   {
      return instanceValue == null ? null : instanceValue.toString();
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
