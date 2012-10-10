/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.templates.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.storydriven.modeling.ExtendableElement;
import org.storydriven.modeling.templates.*;
import org.storydriven.modeling.templates.PropertyBinding;
import org.storydriven.modeling.templates.TemplateBinding;
import org.storydriven.modeling.templates.TemplateSignature;
import org.storydriven.modeling.templates.TemplatesPackage;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance hierarchy. It supports the call {@link #doSwitch(EObject) doSwitch(object)} to invoke the
 * <code>caseXXX</code> method for each class of the model, starting with the actual class of the object and proceeding up the inheritance hierarchy until a non-null result is
 * returned, which is the result of the switch. <!-- end-user-doc -->
 * @see org.storydriven.modeling.templates.TemplatesPackage
 * @generated
 */
public class TemplatesSwitch<T>
{
   /**
    * The cached model package
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   protected static TemplatesPackage modelPackage;

   /**
    * Creates an instance of the switch.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public TemplatesSwitch ()
   {
      if (modelPackage == null)
      {
         modelPackage = TemplatesPackage.eINSTANCE;
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
         case TemplatesPackage.TEMPLATE_BINDING:
         {
            TemplateBinding templateBinding = (TemplateBinding) theEObject;
            T result = caseTemplateBinding(templateBinding);
            if (result == null)
               result = caseExtendableElement(templateBinding);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TemplatesPackage.PROPERTY_BINDING:
         {
            PropertyBinding propertyBinding = (PropertyBinding) theEObject;
            T result = casePropertyBinding(propertyBinding);
            if (result == null)
               result = caseExtendableElement(propertyBinding);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TemplatesPackage.TEMPLATE_SIGNATURE:
         {
            TemplateSignature templateSignature = (TemplateSignature) theEObject;
            T result = caseTemplateSignature(templateSignature);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         default:
            return defaultCase(theEObject);
      }
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Template Signature</em>'.
    * <!-- begin-user-doc --> This implementation returns null; returning a non-null
    * result will terminate the switch. <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Template Signature</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseTemplateSignature (TemplateSignature object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Template Binding</em>'.
    * <!-- begin-user-doc --> This implementation returns null; returning a non-null
    * result will terminate the switch. <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Template Binding</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseTemplateBinding (TemplateBinding object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Property Binding</em>'.
    * <!-- begin-user-doc --> This implementation returns null; returning a non-null
    * result will terminate the switch. <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Property Binding</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T casePropertyBinding (PropertyBinding object)
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

} // TemplatesSwitch
