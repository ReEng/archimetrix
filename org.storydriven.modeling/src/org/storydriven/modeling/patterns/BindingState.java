/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.patterns;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '<em><b>Binding State</b></em>', and utility methods for working with them. <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * The BindingState defines whether an object or link variable is already bound to a concrete value or not.
 * <!-- end-model-doc -->
 * @see org.storydriven.modeling.patterns.PatternsPackage#getBindingState()
 * @model
 * @generated
 */
public enum BindingState implements Enumerator
{
   /**
    * The '<em><b>UNBOUND</b></em>' literal object.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see #UNBOUND_VALUE
    * @generated
    * @ordered
    */
   UNBOUND (0, "UNBOUND", "UNBOUND"),

   /**
    * The '<em><b>BOUND</b></em>' literal object.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see #BOUND_VALUE
    * @generated
    * @ordered
    */
   BOUND (1, "BOUND", "BOUND"),

   /**
    * The '<em><b>MAYBE BOUND</b></em>' literal object.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see #MAYBE_BOUND_VALUE
    * @generated
    * @ordered
    */
   MAYBE_BOUND (2, "MAYBE_BOUND", "MAYBE_BOUND");

   /**
    * The '<em><b>UNBOUND</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>UNBOUND</b></em>' literal object isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * UNBOUND is the default value for this enum. If an object or link variable in a story pattern is unbound, a new match has to be obtained for that variable.
    * <!-- end-model-doc -->
    * @see #UNBOUND
    * @model
    * @generated
    * @ordered
    */
   public static final int UNBOUND_VALUE = 0;

   /**
    * The '<em><b>BOUND</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>BOUND</b></em>' literal object isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * A bound variable has already been bound to a concrete value. The concrete value has to be passed either as a parameter or it has to be bound in a previous activity. If, during the execution of a story pattern, a bound variable has no value, the execution of the story pattern fails.
    * <!-- end-model-doc -->
    * @see #BOUND
    * @model
    * @generated
    * @ordered
    */
   public static final int BOUND_VALUE = 1;

   /**
    * The '<em><b>MAYBE BOUND</b></em>' literal value. <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> MAYBE_BOUND: unknown whether the variable is bound or
    * not. If the variable is not bound, an object is matched and bound to the variable. If it is already bound, it is not altered. If the variable is still unbound after this
    * process, the matching fails (except for OPTIONAL variables). <!-- end-model-doc -->
    * 
    * @see #MAYBE_BOUND
    * @model
    * @generated
    * @ordered
    */
   public static final int MAYBE_BOUND_VALUE = 2;

   /**
    * An array of all the '<em><b>Binding State</b></em>' enumerators.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   private static final BindingState[] VALUES_ARRAY = new BindingState[] {UNBOUND, BOUND, MAYBE_BOUND,};

   /**
    * A public read-only list of all the '<em><b>Binding State</b></em>' enumerators.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public static final List<BindingState> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

   /**
    * Returns the '<em><b>Binding State</b></em>' literal with the specified literal value.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public static BindingState get (String literal)
   {
      for (int i = 0; i < VALUES_ARRAY.length; ++i)
      {
         BindingState result = VALUES_ARRAY[i];
         if (result.toString().equals(literal))
         {
            return result;
         }
      }
      return null;
   }

   /**
    * Returns the '<em><b>Binding State</b></em>' literal with the specified name.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public static BindingState getByName (String name)
   {
      for (int i = 0; i < VALUES_ARRAY.length; ++i)
      {
         BindingState result = VALUES_ARRAY[i];
         if (result.getName().equals(name))
         {
            return result;
         }
      }
      return null;
   }

   /**
    * Returns the '<em><b>Binding State</b></em>' literal with the specified integer value.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public static BindingState get (int value)
   {
      switch (value)
      {
         case UNBOUND_VALUE:
            return UNBOUND;
         case BOUND_VALUE:
            return BOUND;
         case MAYBE_BOUND_VALUE:
            return MAYBE_BOUND;
      }
      return null;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   private final int value;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   private final String name;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   private final String literal;

   /**
    * Only this class can construct instances.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   private BindingState (int value, String name, String literal)
   {
      this.value = value;
      this.name = name;
      this.literal = literal;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public int getValue ()
   {
      return value;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public String getName ()
   {
      return name;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public String getLiteral ()
   {
      return literal;
   }

   /**
    * Returns the literal value of the enumerator, which is its string representation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   @Override
   public String toString ()
   {
      return literal;
   }

} // BindingState
