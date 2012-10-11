/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.fujaba.commons.notation.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.fujaba.commons.identifier.Identifier;
import org.fujaba.commons.notation.*;



/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.fujaba.commons.notation.NotationPackage
 * @generated
 */
public class NotationSwitch<T>
{
   /**
    * The cached model package
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected static NotationPackage modelPackage;

   /**
    * Creates an instance of the switch.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotationSwitch()
   {
      if (modelPackage == null)
      {
         modelPackage = NotationPackage.eINSTANCE;
      }
   }

   /**
    * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the first non-null result returned by a <code>caseXXX</code> call.
    * @generated
    */
   public T doSwitch(EObject theEObject)
   {
      return doSwitch(theEObject.eClass(), theEObject);
   }

   /**
    * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the first non-null result returned by a <code>caseXXX</code> call.
    * @generated
    */
   protected T doSwitch(EClass theEClass, EObject theEObject)
   {
      if (theEClass.eContainer() == modelPackage)
      {
         return doSwitch(theEClass.getClassifierID(), theEObject);
      }
      else
      {
         List<EClass> eSuperTypes = theEClass.getESuperTypes();
         return
            eSuperTypes.isEmpty() ?
               defaultCase(theEObject) :
               doSwitch(eSuperTypes.get(0), theEObject);
      }
   }

   /**
    * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the first non-null result returned by a <code>caseXXX</code> call.
    * @generated
    */
   protected T doSwitch(int classifierID, EObject theEObject)
   {
      switch (classifierID)
      {
         case NotationPackage.DIAGRAM_ELEMENT:
         {
            DiagramElement diagramElement = (DiagramElement)theEObject;
            T result = caseDiagramElement(diagramElement);
            if (result == null) result = caseIdentifier(diagramElement);
            if (result == null) result = caseEModelElement(diagramElement);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case NotationPackage.NODE:
         {
            Node node = (Node)theEObject;
            T result = caseNode(node);
            if (result == null) result = caseDiagramElement(node);
            if (result == null) result = caseIdentifier(node);
            if (result == null) result = caseEModelElement(node);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case NotationPackage.EDGE:
         {
            Edge edge = (Edge)theEObject;
            T result = caseEdge(edge);
            if (result == null) result = caseDiagramElement(edge);
            if (result == null) result = caseIdentifier(edge);
            if (result == null) result = caseEModelElement(edge);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case NotationPackage.HIERARCHICAL_NODE:
         {
            HierarchicalNode hierarchicalNode = (HierarchicalNode)theEObject;
            T result = caseHierarchicalNode(hierarchicalNode);
            if (result == null) result = caseNode(hierarchicalNode);
            if (result == null) result = caseDiagramElement(hierarchicalNode);
            if (result == null) result = caseIdentifier(hierarchicalNode);
            if (result == null) result = caseEModelElement(hierarchicalNode);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case NotationPackage.ANCHOR:
         {
            Anchor anchor = (Anchor)theEObject;
            T result = caseAnchor(anchor);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case NotationPackage.BEND_POINT:
         {
            BendPoint bendPoint = (BendPoint)theEObject;
            T result = caseBendPoint(bendPoint);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case NotationPackage.RELATIVE_BEND_POINT:
         {
            RelativeBendPoint relativeBendPoint = (RelativeBendPoint)theEObject;
            T result = caseRelativeBendPoint(relativeBendPoint);
            if (result == null) result = caseBendPoint(relativeBendPoint);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case NotationPackage.ABSOLUTE_BEND_POINT:
         {
            AbsoluteBendPoint absoluteBendPoint = (AbsoluteBendPoint)theEObject;
            T result = caseAbsoluteBendPoint(absoluteBendPoint);
            if (result == null) result = caseBendPoint(absoluteBendPoint);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         default: return defaultCase(theEObject);
      }
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Diagram Element</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Diagram Element</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseDiagramElement(DiagramElement object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Node</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseNode(Node object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Edge</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Edge</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseEdge(Edge object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Hierarchical Node</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Hierarchical Node</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseHierarchicalNode(HierarchicalNode object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Anchor</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Anchor</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseAnchor(Anchor object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Bend Point</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Bend Point</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseBendPoint(BendPoint object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Relative Bend Point</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Relative Bend Point</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseRelativeBendPoint(RelativeBendPoint object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Absolute Bend Point</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Absolute Bend Point</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseAbsoluteBendPoint(AbsoluteBendPoint object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>EModel Element</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>EModel Element</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseEModelElement(EModelElement object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Identifier</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Identifier</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseIdentifier(Identifier object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch, but this is the last case anyway.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject)
    * @generated
    */
   public T defaultCase(EObject object)
   {
      return null;
   }

} //NotationSwitch
