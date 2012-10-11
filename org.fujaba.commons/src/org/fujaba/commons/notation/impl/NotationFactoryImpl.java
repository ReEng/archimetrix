/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.fujaba.commons.notation.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.fujaba.commons.notation.*;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NotationFactoryImpl extends EFactoryImpl implements NotationFactory
{
   /**
    * Creates the default factory implementation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static NotationFactory init()
   {
      try
      {
         NotationFactory theNotationFactory = (NotationFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.fujaba.org/ns/notation"); 
         if (theNotationFactory != null)
         {
            return theNotationFactory;
         }
      }
      catch (Exception exception)
      {
         EcorePlugin.INSTANCE.log(exception);
      }
      return new NotationFactoryImpl();
   }

   /**
    * Creates an instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotationFactoryImpl()
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
         case NotationPackage.NODE: return createNode();
         case NotationPackage.EDGE: return createEdge();
         case NotationPackage.HIERARCHICAL_NODE: return createHierarchicalNode();
         case NotationPackage.ANCHOR: return createAnchor();
         case NotationPackage.RELATIVE_BEND_POINT: return createRelativeBendPoint();
         case NotationPackage.ABSOLUTE_BEND_POINT: return createAbsoluteBendPoint();
         default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
      }
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Node createNode()
   {
      NodeImpl node = new NodeImpl();
      return node;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Edge createEdge()
   {
      EdgeImpl edge = new EdgeImpl();
      return edge;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public HierarchicalNode createHierarchicalNode()
   {
      HierarchicalNodeImpl hierarchicalNode = new HierarchicalNodeImpl();
      return hierarchicalNode;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Anchor createAnchor()
   {
      AnchorImpl anchor = new AnchorImpl();
      return anchor;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public RelativeBendPoint createRelativeBendPoint()
   {
      RelativeBendPointImpl relativeBendPoint = new RelativeBendPointImpl();
      return relativeBendPoint;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public AbsoluteBendPoint createAbsoluteBendPoint()
   {
      AbsoluteBendPointImpl absoluteBendPoint = new AbsoluteBendPointImpl();
      return absoluteBendPoint;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotationPackage getNotationPackage()
   {
      return (NotationPackage)getEPackage();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @deprecated
    * @generated
    */
   @Deprecated
   public static NotationPackage getPackage()
   {
      return NotationPackage.eINSTANCE;
   }

} //NotationFactoryImpl
