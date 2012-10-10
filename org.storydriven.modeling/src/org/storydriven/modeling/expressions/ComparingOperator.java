/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.expressions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '<em><b>Comparing Operator</b></em>', and utility methods for working with them. <!-- end-user-doc
 * --> <!-- begin-model-doc --> Defines the operators for comparing expressions. <!-- end-model-doc -->
 * 
 * @see org.storydriven.modeling.expressions.ExpressionsPackage#getComparingOperator()
 * @model
 * @generated
 */
public enum ComparingOperator implements Enumerator
{
   /**
    * The '<em><b>LESS</b></em>' literal object.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see #LESS_VALUE
    * @generated
    * @ordered
    */
   LESS (0, "LESS", "LESS"),

   /**
    * The '<em><b>LESS OR EQUAL</b></em>' literal object.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see #LESS_OR_EQUAL_VALUE
    * @generated
    * @ordered
    */
   LESS_OR_EQUAL (1, "LESS_OR_EQUAL", "LESS_OR_EQUAL"),

   /**
    * The '<em><b>EQUAL</b></em>' literal object.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see #EQUAL_VALUE
    * @generated
    * @ordered
    */
   EQUAL (2, "EQUAL", "EQUAL"),

   /**
    * The '<em><b>GREATER OR EQUAL</b></em>' literal object.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see #GREATER_OR_EQUAL_VALUE
    * @generated
    * @ordered
    */
   GREATER_OR_EQUAL (3, "GREATER_OR_EQUAL", "GREATER_OR_EQUAL"),

   /**
    * The '<em><b>GREATER</b></em>' literal object.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see #GREATER_VALUE
    * @generated
    * @ordered
    */
   GREATER (4, "GREATER", "GREATER"),

   /**
    * The '<em><b>UNEQUAL</b></em>' literal object.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see #UNEQUAL_VALUE
    * @generated
    * @ordered
    */
   UNEQUAL (5, "UNEQUAL", "UNEQUAL"), /**
                                       * The '<em><b>REGULAR EXPRESSION</b></em>' literal object.
                                       * <!-- begin-user-doc -->
                                       * <!-- end-user-doc -->
                                       * @see #REGULAR_EXPRESSION_VALUE
                                       * @generated
                                       * @ordered
                                       */
   REGULAR_EXPRESSION (6, "REGULAR_EXPRESSION", "REGULAR_EXPRESSION");

   /**
    * The '<em><b>LESS</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>LESS</b></em>' literal object isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @see #LESS
    * @model
    * @generated
    * @ordered
    */
   public static final int LESS_VALUE = 0;

   /**
    * The '<em><b>LESS OR EQUAL</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>LESS OR EQUAL</b></em>' literal object isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @see #LESS_OR_EQUAL
    * @model
    * @generated
    * @ordered
    */
   public static final int LESS_OR_EQUAL_VALUE = 1;

   /**
    * The '<em><b>EQUAL</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>EQUAL</b></em>' literal object isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @see #EQUAL
    * @model
    * @generated
    * @ordered
    */
   public static final int EQUAL_VALUE = 2;

   /**
    * The '<em><b>GREATER OR EQUAL</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>GREATER OR EQUAL</b></em>' literal object isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @see #GREATER_OR_EQUAL
    * @model
    * @generated
    * @ordered
    */
   public static final int GREATER_OR_EQUAL_VALUE = 3;

   /**
    * The '<em><b>GREATER</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>GREATER</b></em>' literal object isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @see #GREATER
    * @model
    * @generated
    * @ordered
    */
   public static final int GREATER_VALUE = 4;

   /**
    * The '<em><b>UNEQUAL</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>UNEQUAL</b></em>' literal object isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @see #UNEQUAL
    * @model
    * @generated
    * @ordered
    */
   public static final int UNEQUAL_VALUE = 5;

   /**
    * The '<em><b>REGULAR EXPRESSION</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * For comparison of a String with a regular expression.
    * <!-- end-model-doc -->
    * @see #REGULAR_EXPRESSION
    * @model
    * @generated
    * @ordered
    */
   public static final int REGULAR_EXPRESSION_VALUE = 6;

   /**
    * An array of all the '<em><b>Comparing Operator</b></em>' enumerators.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   private static final ComparingOperator[] VALUES_ARRAY = new ComparingOperator[] {LESS, LESS_OR_EQUAL, EQUAL,
         GREATER_OR_EQUAL, GREATER, UNEQUAL, REGULAR_EXPRESSION,};

   /**
    * A public read-only list of all the '<em><b>Comparing Operator</b></em>' enumerators.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public static final List<ComparingOperator> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

   /**
    * Returns the '<em><b>Comparing Operator</b></em>' literal with the specified literal value.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public static ComparingOperator get (String literal)
   {
      for (int i = 0; i < VALUES_ARRAY.length; ++i)
      {
         ComparingOperator result = VALUES_ARRAY[i];
         if (result.toString().equals(literal))
         {
            return result;
         }
      }
      return null;
   }

   /**
    * Returns the '<em><b>Comparing Operator</b></em>' literal with the specified name.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public static ComparingOperator getByName (String name)
   {
      for (int i = 0; i < VALUES_ARRAY.length; ++i)
      {
         ComparingOperator result = VALUES_ARRAY[i];
         if (result.getName().equals(name))
         {
            return result;
         }
      }
      return null;
   }

   /**
    * Returns the '<em><b>Comparing Operator</b></em>' literal with the specified integer value.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public static ComparingOperator get (int value)
   {
      switch (value)
      {
         case LESS_VALUE:
            return LESS;
         case LESS_OR_EQUAL_VALUE:
            return LESS_OR_EQUAL;
         case EQUAL_VALUE:
            return EQUAL;
         case GREATER_OR_EQUAL_VALUE:
            return GREATER_OR_EQUAL;
         case GREATER_VALUE:
            return GREATER;
         case UNEQUAL_VALUE:
            return UNEQUAL;
         case REGULAR_EXPRESSION_VALUE:
            return REGULAR_EXPRESSION;
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
   private ComparingOperator (int value, String name, String literal)
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

} // ComparingOperator
