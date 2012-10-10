/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.expressions.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.storydriven.modeling.CommentableElement;
import org.storydriven.modeling.ExtendableElement;
import org.storydriven.modeling.TypedElement;
import org.storydriven.modeling.expressions.*;
import org.storydriven.modeling.expressions.ArithmeticExpression;
import org.storydriven.modeling.expressions.BinaryExpression;
import org.storydriven.modeling.expressions.BinaryLogicExpression;
import org.storydriven.modeling.expressions.ComparisonExpression;
import org.storydriven.modeling.expressions.Expression;
import org.storydriven.modeling.expressions.ExpressionsPackage;
import org.storydriven.modeling.expressions.LiteralExpression;
import org.storydriven.modeling.expressions.NotExpression;
import org.storydriven.modeling.expressions.TextualExpression;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides an adapter <code>createXXX</code> method for each class of the model. <!-- end-user-doc -->
 * @see org.storydriven.modeling.expressions.ExpressionsPackage
 * @generated
 */
public class ExpressionsAdapterFactory extends AdapterFactoryImpl
{
   /**
    * The cached model package.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   protected static ExpressionsPackage modelPackage;

   /**
    * Creates an instance of the adapter factory.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public ExpressionsAdapterFactory ()
   {
      if (modelPackage == null)
      {
         modelPackage = ExpressionsPackage.eINSTANCE;
      }
   }

   /**
    * Returns whether this factory is applicable for the type of the object.
    * <!-- begin-user-doc --> This implementation returns <code>true</code> if the object is either the
    * model's package or is an instance object of the model. <!-- end-user-doc -->
    * @return whether this factory is applicable for the type of the object.
    * @generated
    */
   @Override
   public boolean isFactoryForType (Object object)
   {
      if (object == modelPackage)
      {
         return true;
      }
      if (object instanceof EObject)
      {
         return ((EObject) object).eClass().getEPackage() == modelPackage;
      }
      return false;
   }

   /**
    * The switch that delegates to the <code>createXXX</code> methods.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   protected ExpressionsSwitch<Adapter> modelSwitch = new ExpressionsSwitch<Adapter>()
   {
      @Override
      public Adapter caseTextualExpression (TextualExpression object)
      {
         return createTextualExpressionAdapter();
      }

      @Override
      public Adapter caseLiteralExpression (LiteralExpression object)
      {
         return createLiteralExpressionAdapter();
      }

      @Override
      public Adapter caseNotExpression (NotExpression object)
      {
         return createNotExpressionAdapter();
      }

      @Override
      public Adapter caseBinaryExpression (BinaryExpression object)
      {
         return createBinaryExpressionAdapter();
      }

      @Override
      public Adapter caseComparisonExpression (ComparisonExpression object)
      {
         return createComparisonExpressionAdapter();
      }

      @Override
      public Adapter caseArithmeticExpression (ArithmeticExpression object)
      {
         return createArithmeticExpressionAdapter();
      }

      @Override
      public Adapter caseBinaryLogicExpression (BinaryLogicExpression object)
      {
         return createBinaryLogicExpressionAdapter();
      }

      @Override
      public Adapter caseExpression (Expression object)
      {
         return createExpressionAdapter();
      }

      @Override
      public Adapter caseExtendableElement (ExtendableElement object)
      {
         return createExtendableElementAdapter();
      }

      @Override
      public Adapter caseTypedElement (TypedElement object)
      {
         return createTypedElementAdapter();
      }

      @Override
      public Adapter caseCommentableElement (CommentableElement object)
      {
         return createCommentableElementAdapter();
      }

      @Override
      public Adapter defaultCase (EObject object)
      {
         return createEObjectAdapter();
      }
   };

   /**
    * Creates an adapter for the <code>target</code>.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @param target the object to adapt.
    * @return the adapter for the <code>target</code>.
    * @generated
    */
   @Override
   public Adapter createAdapter (Notifier target)
   {
      return modelSwitch.doSwitch((EObject) target);
   }

   /**
    * Creates a new adapter for an object of class '{@link org.storydriven.modeling.expressions.Expression <em>Expression</em>}'.
    * <!-- begin-user-doc --> This default
    * implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.storydriven.modeling.expressions.Expression
    * @generated
    */
   public Adapter createExpressionAdapter ()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.storydriven.modeling.expressions.TextualExpression <em>Textual Expression</em>}'.
    * <!-- begin-user-doc --> This
    * default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.storydriven.modeling.expressions.TextualExpression
    * @generated
    */
   public Adapter createTextualExpressionAdapter ()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.storydriven.modeling.expressions.LiteralExpression <em>Literal Expression</em>}'.
    * <!-- begin-user-doc --> This
    * default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.storydriven.modeling.expressions.LiteralExpression
    * @generated
    */
   public Adapter createLiteralExpressionAdapter ()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.storydriven.modeling.expressions.NotExpression <em>Not Expression</em>}'.
    * <!-- begin-user-doc --> This default
    * implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.storydriven.modeling.expressions.NotExpression
    * @generated
    */
   public Adapter createNotExpressionAdapter ()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.storydriven.modeling.expressions.BinaryExpression <em>Binary Expression</em>}'.
    * <!-- begin-user-doc --> This default
    * implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.storydriven.modeling.expressions.BinaryExpression
    * @generated
    */
   public Adapter createBinaryExpressionAdapter ()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.storydriven.modeling.expressions.ComparisonExpression <em>Comparison Expression</em>}'.
    * <!-- begin-user-doc --> This
    * default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.storydriven.modeling.expressions.ComparisonExpression
    * @generated
    */
   public Adapter createComparisonExpressionAdapter ()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.storydriven.modeling.expressions.ArithmeticExpression <em>Arithmetic Expression</em>}'.
    * <!-- begin-user-doc --> This
    * default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.storydriven.modeling.expressions.ArithmeticExpression
    * @generated
    */
   public Adapter createArithmeticExpressionAdapter ()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.storydriven.modeling.expressions.BinaryLogicExpression <em>Binary Logic Expression</em>}'. <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc
    * -->
    * 
    * @return the new adapter.
    * @see org.storydriven.modeling.expressions.BinaryLogicExpression
    * @generated
    */
   public Adapter createBinaryLogicExpressionAdapter ()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.storydriven.modeling.ExtendableElement <em>Extendable Element</em>}'.
    * <!-- begin-user-doc --> This default
    * implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.storydriven.modeling.ExtendableElement
    * @generated
    */
   public Adapter createExtendableElementAdapter ()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.storydriven.modeling.TypedElement <em>Typed Element</em>}'.
    * <!-- begin-user-doc --> This default implementation
    * returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.storydriven.modeling.TypedElement
    * @generated
    */
   public Adapter createTypedElementAdapter ()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.storydriven.modeling.CommentableElement <em>Commentable Element</em>}'.
    * <!-- begin-user-doc --> This default
    * implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.storydriven.modeling.CommentableElement
    * @generated
    */
   public Adapter createCommentableElementAdapter ()
   {
      return null;
   }

   /**
    * Creates a new adapter for the default case.
    * <!-- begin-user-doc --> This default implementation returns null. <!-- end-user-doc -->
    * @return the new adapter.
    * @generated
    */
   public Adapter createEObjectAdapter ()
   {
      return null;
   }

} // ExpressionsAdapterFactory
