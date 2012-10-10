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
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '<em><b>Binding Semantics</b></em>', and utility methods for working with them. <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * The binding semantics defines which kind of match will be obtained for the object or link variable.
 * <!-- end-model-doc -->
 * @see org.storydriven.modeling.patterns.PatternsPackage#getBindingSemantics()
 * @model
 * @generated
 */
public enum BindingSemantics implements Enumerator
{
   /**
    * The '<em><b>MANDATORY</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #MANDATORY_VALUE
    * @generated
    * @ordered
    */
   MANDATORY (0, "MANDATORY", "MANDATORY"), /**
                                             * The '<em><b>NEGATIVE</b></em>' literal object.
                                             * <!-- begin-user-doc --> <!-- end-user-doc -->
                                             * @see #NEGATIVE_VALUE
                                             * @generated
                                             * @ordered
                                             */
   NEGATIVE (1, "NEGATIVE", "NEGATIVE"),

   /**
    * The '<em><b>OPTIONAL</b></em>' literal object.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see #OPTIONAL_VALUE
    * @generated
    * @ordered
    */
   OPTIONAL (2, "OPTIONAL", "OPTIONAL");

   /**
    * The '<em><b>MANDATORY</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>MANDATORY</b></em>' literal object isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * For a mandatory object or link variable, a match has to be found for a pattern to be successfully applied.
    * <!-- end-model-doc -->
    * @see #MANDATORY
    * @model
    * @generated
    * @ordered
    */
   public static final int MANDATORY_VALUE = 0;

   /**
    * The '<em><b>NEGATIVE</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>NEGATIVE</b></em>' literal object isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * If an object or link variable is marked as NEGATIVE, no match may be found for that object or link variable. If a match can be found, the execution of the story pattern fails.
    * <!-- end-model-doc -->
    * @see #NEGATIVE
    * @model
    * @generated
    * @ordered
    */
   public static final int NEGATIVE_VALUE = 1;

   /**
    * The '<em><b>OPTIONAL</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>OPTIONAL</b></em>' literal object isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * For an OPTIONAL object or link variable, the matching tries to find a match. If no match can be found, this does not affect the success of the pattern application. If a match can be found, the respective object or link is bound to the variable.
    * <!-- end-model-doc -->
    * @see #OPTIONAL
    * @model
    * @generated
    * @ordered
    */
   public static final int OPTIONAL_VALUE = 2;

   /**
    * An array of all the '<em><b>Binding Semantics</b></em>' enumerators.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   private static final BindingSemantics[] VALUES_ARRAY = new BindingSemantics[] {MANDATORY, NEGATIVE, OPTIONAL,};

   /**
    * A public read-only list of all the '<em><b>Binding Semantics</b></em>' enumerators.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public static final List<BindingSemantics> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

   /**
    * Returns the '<em><b>Binding Semantics</b></em>' literal with the specified literal value.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public static BindingSemantics get (String literal)
   {
      for (int i = 0; i < VALUES_ARRAY.length; ++i)
      {
         BindingSemantics result = VALUES_ARRAY[i];
         if (result.toString().equals(literal))
         {
            return result;
         }
      }
      return null;
   }

   /**
    * Returns the '<em><b>Binding Semantics</b></em>' literal with the specified name.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public static BindingSemantics getByName (String name)
   {
      for (int i = 0; i < VALUES_ARRAY.length; ++i)
      {
         BindingSemantics result = VALUES_ARRAY[i];
         if (result.getName().equals(name))
         {
            return result;
         }
      }
      return null;
   }

   /**
    * Returns the '<em><b>Binding Semantics</b></em>' literal with the specified integer value.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public static BindingSemantics get (int value)
   {
      switch (value)
      {
         case MANDATORY_VALUE:
            return MANDATORY;
         case NEGATIVE_VALUE:
            return NEGATIVE;
         case OPTIONAL_VALUE:
            return OPTIONAL;
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
   private BindingSemantics (int value, String name, String literal)
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

} // BindingSemantics
