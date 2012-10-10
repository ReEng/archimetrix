/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.patterns.expressions.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.storydriven.modeling.CommentableElement;
import org.storydriven.modeling.ExtendableElement;
import org.storydriven.modeling.TypedElement;
import org.storydriven.modeling.expressions.Expression;
import org.storydriven.modeling.patterns.expressions.*;
import org.storydriven.modeling.patterns.expressions.AttributeValueExpression;
import org.storydriven.modeling.patterns.expressions.ExpressionsPackage;
import org.storydriven.modeling.patterns.expressions.ObjectSetSizeExpression;
import org.storydriven.modeling.patterns.expressions.ObjectVariableExpression;
import org.storydriven.modeling.patterns.expressions.PrimitiveVariableExpression;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance hierarchy. It supports the call {@link #doSwitch(EObject) doSwitch(object)} to invoke the
 * <code>caseXXX</code> method for each class of the model, starting with the actual class of the object and proceeding up the inheritance hierarchy until a non-null result is
 * returned, which is the result of the switch. <!-- end-user-doc -->
 * @see org.storydriven.modeling.patterns.expressions.ExpressionsPackage
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
         case ExpressionsPackage.ATTRIBUTE_VALUE_EXPRESSION:
         {
            AttributeValueExpression attributeValueExpression = (AttributeValueExpression) theEObject;
            T result = caseAttributeValueExpression(attributeValueExpression);
            if (result == null)
               result = caseExpression(attributeValueExpression);
            if (result == null)
               result = caseTypedElement(attributeValueExpression);
            if (result == null)
               result = caseCommentableElement(attributeValueExpression);
            if (result == null)
               result = caseExtendableElement(attributeValueExpression);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case ExpressionsPackage.OBJECT_VARIABLE_EXPRESSION:
         {
            ObjectVariableExpression objectVariableExpression = (ObjectVariableExpression) theEObject;
            T result = caseObjectVariableExpression(objectVariableExpression);
            if (result == null)
               result = caseExpression(objectVariableExpression);
            if (result == null)
               result = caseTypedElement(objectVariableExpression);
            if (result == null)
               result = caseCommentableElement(objectVariableExpression);
            if (result == null)
               result = caseExtendableElement(objectVariableExpression);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case ExpressionsPackage.OBJECT_SET_SIZE_EXPRESSION:
         {
            ObjectSetSizeExpression objectSetSizeExpression = (ObjectSetSizeExpression) theEObject;
            T result = caseObjectSetSizeExpression(objectSetSizeExpression);
            if (result == null)
               result = caseExpression(objectSetSizeExpression);
            if (result == null)
               result = caseTypedElement(objectSetSizeExpression);
            if (result == null)
               result = caseCommentableElement(objectSetSizeExpression);
            if (result == null)
               result = caseExtendableElement(objectSetSizeExpression);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case ExpressionsPackage.PRIMITIVE_VARIABLE_EXPRESSION:
         {
            PrimitiveVariableExpression primitiveVariableExpression = (PrimitiveVariableExpression) theEObject;
            T result = casePrimitiveVariableExpression(primitiveVariableExpression);
            if (result == null)
               result = caseExpression(primitiveVariableExpression);
            if (result == null)
               result = caseTypedElement(primitiveVariableExpression);
            if (result == null)
               result = caseCommentableElement(primitiveVariableExpression);
            if (result == null)
               result = caseExtendableElement(primitiveVariableExpression);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         default:
            return defaultCase(theEObject);
      }
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Attribute Value Expression</em>'.
    * <!-- begin-user-doc --> This implementation returns null; returning a
    * non-null result will terminate the switch. <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Attribute Value Expression</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseAttributeValueExpression (AttributeValueExpression object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Object Variable Expression</em>'.
    * <!-- begin-user-doc --> This implementation returns null; returning a
    * non-null result will terminate the switch. <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Object Variable Expression</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseObjectVariableExpression (ObjectVariableExpression object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Object Set Size Expression</em>'.
    * <!-- begin-user-doc --> This implementation returns null; returning a
    * non-null result will terminate the switch. <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Object Set Size Expression</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseObjectSetSizeExpression (ObjectSetSizeExpression object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Primitive Variable Expression</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Primitive Variable Expression</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T casePrimitiveVariableExpression (PrimitiveVariableExpression object)
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
