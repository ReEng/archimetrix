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
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '<em><b>Logic Operator</b></em>', and utility methods for working with them. <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Defines the operators for binary logic expressions. The unary logic expression representing negated expressions is reflected by the NotExpression.
 * <!-- end-model-doc -->
 * @see org.storydriven.modeling.expressions.ExpressionsPackage#getLogicOperator()
 * @model
 * @generated
 */
public enum LogicOperator implements Enumerator
{
   /**
    * The '<em><b>AND</b></em>' literal object.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see #AND_VALUE
    * @generated
    * @ordered
    */
   AND (0, "AND", "AND"),

   /**
    * The '<em><b>OR</b></em>' literal object.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see #OR_VALUE
    * @generated
    * @ordered
    */
   OR (1, "OR", "OR"),

   /**
    * The '<em><b>XOR</b></em>' literal object.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see #XOR_VALUE
    * @generated
    * @ordered
    */
   XOR (2, "XOR", "XOR"), /**
                           * The '<em><b>IMPLY</b></em>' literal object.
                           * <!-- begin-user-doc -->
                           * <!-- end-user-doc -->
                           * @see #IMPLY_VALUE
                           * @generated
                           * @ordered
                           */
   IMPLY (3, "IMPLY", "IMPLY"), /**
                                 * The '<em><b>EQUIVALENT</b></em>' literal object.
                                 * <!-- begin-user-doc -->
                                 * <!-- end-user-doc -->
                                 * @see #EQUIVALENT_VALUE
                                 * @generated
                                 * @ordered
                                 */
   EQUIVALENT (4, "EQUIVALENT", "EQUIVALENT");

   /**
    * The '<em><b>AND</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>AND</b></em>' literal object isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @see #AND
    * @model
    * @generated
    * @ordered
    */
   public static final int AND_VALUE = 0;

   /**
    * The '<em><b>OR</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>OR</b></em>' literal object isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @see #OR
    * @model
    * @generated
    * @ordered
    */
   public static final int OR_VALUE = 1;

   /**
    * The '<em><b>XOR</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>XOR</b></em>' literal object isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @see #XOR
    * @model
    * @generated
    * @ordered
    */
   public static final int XOR_VALUE = 2;

   /**
    * The '<em><b>IMPLY</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>IMPLY</b></em>' literal object isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @see #IMPLY
    * @model
    * @generated
    * @ordered
    */
   public static final int IMPLY_VALUE = 3;

   /**
    * The '<em><b>EQUIVALENT</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>EQUIVALENT</b></em>' literal object isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @see #EQUIVALENT
    * @model
    * @generated
    * @ordered
    */
   public static final int EQUIVALENT_VALUE = 4;

   /**
    * An array of all the '<em><b>Logic Operator</b></em>' enumerators.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   private static final LogicOperator[] VALUES_ARRAY = new LogicOperator[] {AND, OR, XOR, IMPLY, EQUIVALENT,};

   /**
    * A public read-only list of all the '<em><b>Logic Operator</b></em>' enumerators.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public static final List<LogicOperator> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

   /**
    * Returns the '<em><b>Logic Operator</b></em>' literal with the specified literal value.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public static LogicOperator get (String literal)
   {
      for (int i = 0; i < VALUES_ARRAY.length; ++i)
      {
         LogicOperator result = VALUES_ARRAY[i];
         if (result.toString().equals(literal))
         {
            return result;
         }
      }
      return null;
   }

   /**
    * Returns the '<em><b>Logic Operator</b></em>' literal with the specified name.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public static LogicOperator getByName (String name)
   {
      for (int i = 0; i < VALUES_ARRAY.length; ++i)
      {
         LogicOperator result = VALUES_ARRAY[i];
         if (result.getName().equals(name))
         {
            return result;
         }
      }
      return null;
   }

   /**
    * Returns the '<em><b>Logic Operator</b></em>' literal with the specified integer value.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public static LogicOperator get (int value)
   {
      switch (value)
      {
         case AND_VALUE:
            return AND;
         case OR_VALUE:
            return OR;
         case XOR_VALUE:
            return XOR;
         case IMPLY_VALUE:
            return IMPLY;
         case EQUIVALENT_VALUE:
            return EQUIVALENT;
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
   private LogicOperator (int value, String name, String literal)
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

} // LogicOperator
