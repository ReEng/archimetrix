/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.patterns.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.storydriven.modeling.CommentableElement;
import org.storydriven.modeling.ExtendableElement;
import org.storydriven.modeling.NamedElement;
import org.storydriven.modeling.TypedElement;
import org.storydriven.modeling.Variable;
import org.storydriven.modeling.patterns.*;
import org.storydriven.modeling.patterns.AbstractLinkVariable;
import org.storydriven.modeling.patterns.AbstractVariable;
import org.storydriven.modeling.patterns.AttributeAssignment;
import org.storydriven.modeling.patterns.Constraint;
import org.storydriven.modeling.patterns.ContainerVariable;
import org.storydriven.modeling.patterns.ContainmentRelation;
import org.storydriven.modeling.patterns.LinkConstraint;
import org.storydriven.modeling.patterns.LinkVariable;
import org.storydriven.modeling.patterns.MatchingPattern;
import org.storydriven.modeling.patterns.ObjectSetVariable;
import org.storydriven.modeling.patterns.ObjectVariable;
import org.storydriven.modeling.patterns.Path;
import org.storydriven.modeling.patterns.PatternsPackage;
import org.storydriven.modeling.patterns.PrimitiveVariable;
import org.storydriven.modeling.patterns.StoryPattern;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides an adapter <code>createXXX</code> method for each class of the model. <!-- end-user-doc -->
 * @see org.storydriven.modeling.patterns.PatternsPackage
 * @generated
 */
public class PatternsAdapterFactory extends AdapterFactoryImpl
{
   /**
    * The cached model package.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   protected static PatternsPackage modelPackage;

   /**
    * Creates an instance of the adapter factory.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public PatternsAdapterFactory ()
   {
      if (modelPackage == null)
      {
         modelPackage = PatternsPackage.eINSTANCE;
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
   protected PatternsSwitch<Adapter> modelSwitch = new PatternsSwitch<Adapter>()
   {
      @Override
      public Adapter caseObjectVariable (ObjectVariable object)
      {
         return createObjectVariableAdapter();
      }

      @Override
      public Adapter caseAbstractVariable (AbstractVariable object)
      {
         return createAbstractVariableAdapter();
      }

      @Override
      public Adapter caseConstraint (Constraint object)
      {
         return createConstraintAdapter();
      }

      @Override
      public Adapter caseAbstractLinkVariable (AbstractLinkVariable object)
      {
         return createAbstractLinkVariableAdapter();
      }

      @Override
      public Adapter caseLinkConstraint (LinkConstraint object)
      {
         return createLinkConstraintAdapter();
      }

      @Override
      public Adapter caseAttributeAssignment (AttributeAssignment object)
      {
         return createAttributeAssignmentAdapter();
      }

      @Override
      public Adapter caseObjectSetVariable (ObjectSetVariable object)
      {
         return createObjectSetVariableAdapter();
      }

      @Override
      public Adapter casePrimitiveVariable (PrimitiveVariable object)
      {
         return createPrimitiveVariableAdapter();
      }

      @Override
      public Adapter casePath (Path object)
      {
         return createPathAdapter();
      }

      @Override
      public Adapter caseLinkVariable (LinkVariable object)
      {
         return createLinkVariableAdapter();
      }

      @Override
      public Adapter caseContainmentRelation (ContainmentRelation object)
      {
         return createContainmentRelationAdapter();
      }

      @Override
      public Adapter caseMatchingPattern (MatchingPattern object)
      {
         return createMatchingPatternAdapter();
      }

      @Override
      public Adapter caseContainerVariable (ContainerVariable object)
      {
         return createContainerVariableAdapter();
      }

      @Override
      public Adapter caseStoryPattern (StoryPattern object)
      {
         return createStoryPatternAdapter();
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
      public Adapter caseVariable (Variable object)
      {
         return createVariableAdapter();
      }

      @Override
      public Adapter caseNamedElement (NamedElement object)
      {
         return createNamedElementAdapter();
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
    * Creates a new adapter for an object of class '{@link org.storydriven.modeling.patterns.AttributeAssignment <em>Attribute Assignment</em>}'.
    * <!-- begin-user-doc --> This
    * default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.storydriven.modeling.patterns.AttributeAssignment
    * @generated
    */
   public Adapter createAttributeAssignmentAdapter ()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.storydriven.modeling.patterns.ObjectVariable <em>Object Variable</em>}'.
    * <!-- begin-user-doc --> This default
    * implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.storydriven.modeling.patterns.ObjectVariable
    * @generated
    */
   public Adapter createObjectVariableAdapter ()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.storydriven.modeling.patterns.AbstractVariable <em>Abstract Variable</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.storydriven.modeling.patterns.AbstractVariable
    * @generated
    */
   public Adapter createAbstractVariableAdapter ()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.storydriven.modeling.patterns.AbstractLinkVariable <em>Abstract Link Variable</em>}'.
    * <!-- begin-user-doc --> This
    * default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.storydriven.modeling.patterns.AbstractLinkVariable
    * @generated
    */
   public Adapter createAbstractLinkVariableAdapter ()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.storydriven.modeling.patterns.LinkConstraint <em>Link Constraint</em>}'.
    * <!-- begin-user-doc --> This default
    * implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.storydriven.modeling.patterns.LinkConstraint
    * @generated
    */
   public Adapter createLinkConstraintAdapter ()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.storydriven.modeling.patterns.Constraint <em>Constraint</em>}'.
    * <!-- begin-user-doc --> This default implementation
    * returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.storydriven.modeling.patterns.Constraint
    * @generated
    */
   public Adapter createConstraintAdapter ()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.storydriven.modeling.patterns.Path <em>Path</em>}'.
    * <!-- begin-user-doc --> This default implementation returns null
    * so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.storydriven.modeling.patterns.Path
    * @generated
    */
   public Adapter createPathAdapter ()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.storydriven.modeling.patterns.LinkVariable <em>Link Variable</em>}'.
    * <!-- begin-user-doc --> This default
    * implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.storydriven.modeling.patterns.LinkVariable
    * @generated
    */
   public Adapter createLinkVariableAdapter ()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.storydriven.modeling.patterns.ContainmentRelation <em>Containment Relation</em>}'.
    * <!-- begin-user-doc --> This
    * default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.storydriven.modeling.patterns.ContainmentRelation
    * @generated
    */
   public Adapter createContainmentRelationAdapter ()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.storydriven.modeling.patterns.MatchingPattern <em>Matching Pattern</em>}'.
    * <!-- begin-user-doc --> This default
    * implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.storydriven.modeling.patterns.MatchingPattern
    * @generated
    */
   public Adapter createMatchingPatternAdapter ()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.storydriven.modeling.patterns.PrimitiveVariable <em>Primitive Variable</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.storydriven.modeling.patterns.PrimitiveVariable
    * @generated
    */
   public Adapter createPrimitiveVariableAdapter ()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.storydriven.modeling.patterns.ContainerVariable <em>Container Variable</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.storydriven.modeling.patterns.ContainerVariable
    * @generated
    */
   public Adapter createContainerVariableAdapter ()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.storydriven.modeling.patterns.ObjectSetVariable <em>Object Set Variable</em>}'.
    * <!-- begin-user-doc --> This default
    * implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.storydriven.modeling.patterns.ObjectSetVariable
    * @generated
    */
   public Adapter createObjectSetVariableAdapter ()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.storydriven.modeling.patterns.StoryPattern <em>Story Pattern</em>}'.
    * <!-- begin-user-doc --> This default
    * implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.storydriven.modeling.patterns.StoryPattern
    * @generated
    */
   public Adapter createStoryPatternAdapter ()
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
    * Creates a new adapter for an object of class '{@link org.storydriven.modeling.Variable <em>Variable</em>}'.
    * <!-- begin-user-doc --> This default implementation returns null
    * so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.storydriven.modeling.Variable
    * @generated
    */
   public Adapter createVariableAdapter ()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.storydriven.modeling.NamedElement <em>Named Element</em>}'.
    * <!-- begin-user-doc --> This default implementation
    * returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.storydriven.modeling.NamedElement
    * @generated
    */
   public Adapter createNamedElementAdapter ()
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

} // PatternsAdapterFactory
