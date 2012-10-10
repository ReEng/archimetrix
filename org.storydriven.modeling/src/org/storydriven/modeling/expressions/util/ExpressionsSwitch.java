/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.expressions.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
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
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance hierarchy. It supports the call {@link #doSwitch(EObject) doSwitch(object)} to invoke the
 * <code>caseXXX</code> method for each class of the model, starting with the actual class of the object and proceeding up the inheritance hierarchy until a non-null result is
 * returned, which is the result of the switch. <!-- end-user-doc -->
 * @see org.storydriven.modeling.expressions.ExpressionsPackage
 * @generated
 */
public class ExpressionsSwitch<T>
{
   /**
    * The cached model package
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   protected static ExpressionsPackage modelPackage;

   /**
    * Creates an instance of the switch.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public ExpressionsSwitch ()
   {
      if (modelPackage == null)
      {
         modelPackage = ExpressionsPackage.eINSTANCE;
      }
   }

   /**
    * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @return the first non-null result returned by a <code>caseXXX</code> call.
    * @generated
    */
   public T doSwitch (EObject theEObject)
   {
      return doSwitch(theEObject.eClass(), theEObject);
   }

   /**
    * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @return the first non-null result returned by a <code>caseXXX</code> call.
    * @generated
    */
   protected T doSwitch (EClass theEClass, EObject theEObject)
   {
      if (theEClass.eContainer() == modelPackage)
      {
         return doSwitch(theEClass.getClassifierID(), theEObject);
      }
      else
      {
         List<EClass> eSuperTypes = theEClass.getESuperTypes();
         return eSuperTypes.isEmpty() ? defaultCase(theEObject) : doSwitch(eSuperTypes.get(0), theEObject);
      }
   }

   /**
    * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @return the first non-null result returned by a <code>caseXXX</code> call.
    * @generated
    */
   protected T doSwitch (int classifierID, EObject theEObject)
   {
      switch (classifierID)
      {
         case ExpressionsPackage.TEXTUAL_EXPRESSION:
         {
            TextualExpression textualExpression = (TextualExpression) theEObject;
            T result = caseTextualExpression(textualExpression);
            if (result == null)
               result = caseExpression(textualExpression);
            if (result == null)
               result = caseTypedElement(textualExpression);
            if (result == null)
               result = caseCommentableElement(textualExpression);
            if (result == null)
               result = caseExtendableElement(textualExpression);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case ExpressionsPackage.LITERAL_EXPRESSION:
         {
            LiteralExpression literalExpression = (LiteralExpression) theEObject;
            T result = caseLiteralExpression(literalExpression);
            if (result == null)
               result = caseExpression(literalExpression);
            if (result == null)
               result = caseTypedElement(literalExpression);
            if (result == null)
               result = caseCommentableElement(literalExpression);
            if (result == null)
               result = caseExtendableElement(literalExpression);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case ExpressionsPackage.NOT_EXPRESSION:
         {
            NotExpression notExpression = (NotExpression) theEObject;
            T result = caseNotExpression(notExpression);
            if (result == null)
               result = caseExpression(notExpression);
            if (result == null)
               result = caseTypedElement(notExpression);
            if (result == null)
               result = caseCommentableElement(notExpression);
            if (result == null)
               result = caseExtendableElement(notExpression);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case ExpressionsPackage.BINARY_EXPRESSION:
         {
            BinaryExpression binaryExpression = (BinaryExpression) theEObject;
            T result = caseBinaryExpression(binaryExpression);
            if (result == null)
               result = caseExpression(binaryExpression);
            if (result == null)
               result = caseTypedElement(binaryExpression);
            if (result == null)
               result = caseCommentableElement(binaryExpression);
            if (result == null)
               result = caseExtendableElement(binaryExpression);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case ExpressionsPackage.COMPARISON_EXPRESSION:
         {
            ComparisonExpression comparisonExpression = (ComparisonExpression) theEObject;
            T result = caseComparisonExpression(comparisonExpression);
            if (result == null)
               result = caseBinaryExpression(comparisonExpression);
            if (result == null)
               result = caseExpression(comparisonExpression);
            if (result == null)
               result = caseTypedElement(comparisonExpression);
            if (result == null)
               result = caseCommentableElement(comparisonExpression);
            if (result == null)
               result = caseExtendableElement(comparisonExpression);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case ExpressionsPackage.ARITHMETIC_EXPRESSION:
         {
            ArithmeticExpression arithmeticExpression = (ArithmeticExpression) theEObject;
            T result = caseArithmeticExpression(arithmeticExpression);
            if (result == null)
               result = caseBinaryExpression(arithmeticExpression);
            if (result == null)
               result = caseExpression(arithmeticExpression);
            if (result == null)
               result = caseTypedElement(arithmeticExpression);
            if (result == null)
               result = caseCommentableElement(arithmeticExpression);
            if (result == null)
               result = caseExtendableElement(arithmeticExpression);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case ExpressionsPackage.BINARY_LOGIC_EXPRESSION:
         {
            BinaryLogicExpression binaryLogicExpression = (BinaryLogicExpression) theEObject;
            T result = caseBinaryLogicExpression(binaryLogicExpression);
            if (result == null)
               result = caseBinaryExpression(binaryLogicExpression);
            if (result == null)
               result = caseExpression(binaryLogicExpression);
            if (result == null)
               result = caseTypedElement(binaryLogicExpression);
            if (result == null)
               result = caseCommentableElement(binaryLogicExpression);
            if (result == null)
               result = caseExtendableElement(binaryLogicExpression);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case ExpressionsPackage.EXPRESSION:
         {
            Expression expression = (Expression) theEObject;
            T result = caseExpression(expression);
            if (result == null)
               result = caseTypedElement(expression);
            if (result == null)
               result = caseCommentableElement(expression);
            if (result == null)
               result = caseExtendableElement(expression);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         default:
            return defaultCase(theEObject);
      }
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
    * <!-- begin-user-doc --> This implementation returns null; returning a non-null result
    * will terminate the switch. <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseExpression (Expression object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Textual Expression</em>'.
    * <!-- begin-user-doc --> This implementation returns null; returning a non-null
    * result will terminate the switch. <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Textual Expression</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseTextualExpression (TextualExpression object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Literal Expression</em>'.
    * <!-- begin-user-doc --> This implementation returns null; returning a non-null
    * result will terminate the switch. <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Literal Expression</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseLiteralExpression (LiteralExpression object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Not Expression</em>'.
    * <!-- begin-user-doc --> This implementation returns null; returning a non-null
    * result will terminate the switch. <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Not Expression</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseNotExpression (NotExpression object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Binary Expression</em>'.
    * <!-- begin-user-doc --> This implementation returns null; returning a non-null
    * result will terminate the switch. <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Binary Expression</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseBinaryExpression (BinaryExpression object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Comparison Expression</em>'.
    * <!-- begin-user-doc --> This implementation returns null; returning a
    * non-null result will terminate the switch. <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Comparison Expression</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseComparisonExpression (ComparisonExpression object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Arithmetic Expression</em>'.
    * <!-- begin-user-doc --> This implementation returns null; returning a
    * non-null result will terminate the switch. <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Arithmetic Expression</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseArithmeticExpression (ArithmeticExpression object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Binary Logic Expression</em>'.
    * <!-- begin-user-doc --> This implementation returns null; returning a
    * non-null result will terminate the switch. <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Binary Logic Expression</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseBinaryLogicExpression (BinaryLogicExpression object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Extendable Element</em>'.
    * <!-- begin-user-doc --> This implementation returns null; returning a non-null
    * result will terminate the switch. <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Extendable Element</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseExtendableElement (ExtendableElement object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Typed Element</em>'.
    * <!-- begin-user-doc --> This implementation returns null; returning a non-null
    * result will terminate the switch. <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Typed Element</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseTypedElement (TypedElement object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Commentable Element</em>'.
    * <!-- begin-user-doc --> This implementation returns null; returning a non-null
    * result will terminate the switch. <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Commentable Element</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseCommentableElement (CommentableElement object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
    * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
    * terminate the switch, but this is the last case anyway. <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject)
    * @generated
    */
   public T defaultCase (EObject object)
   {
      return null;
   }

} // ExpressionsSwitch
