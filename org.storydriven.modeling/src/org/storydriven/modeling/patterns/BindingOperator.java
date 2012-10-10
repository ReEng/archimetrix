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
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Binding Operator</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * The BindingOperator enum defines all possible operations for object and link variables. An object or link variable may be checked for existence be the story pattern (black object/link variable), it may be created (green object/link variable), or it may be destroyed (red object/link variable).
 * <!-- end-model-doc -->
 * @see org.storydriven.modeling.patterns.PatternsPackage#getBindingOperator()
 * @model
 * @generated
 */
public enum BindingOperator implements Enumerator
{
   /**
    * The '<em><b>CHECK ONLY</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #CHECK_ONLY_VALUE
    * @generated
    * @ordered
    */
   CHECK_ONLY (0, "CHECK_ONLY", "CHECK_ONLY"), /**
                                                * The '<em><b>CREATE</b></em>' literal object.
                                                * <!-- begin-user-doc -->
                                                * <!-- end-user-doc -->
                                                * @see #CREATE_VALUE
                                                * @generated
                                                * @ordered
                                                */
   CREATE (1, "CREATE", "CREATE"),

   /**
    * The '<em><b>DESTROY</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #DESTROY_VALUE
    * @generated
    * @ordered
    */
   DESTROY (2, "DESTROY", "DESTROY");

   /**
    * The '<em><b>CHECK ONLY</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>CHECK ONLY</b></em>' literal object isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * CHECK_ONLY is the default value of this enum. It requires an object or link variable just to be matched by the story pattern.
    * <!-- end-model-doc -->
    * @see #CHECK_ONLY
    * @model
    * @generated
    * @ordered
    */
   public static final int CHECK_ONLY_VALUE = 0;

   /**
    * The '<em><b>CREATE</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>CREATE</b></em>' literal object isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * An object or link variable marked as CREATE will be created by the story pattern.
    * <!-- end-model-doc -->
    * @see #CREATE
    * @model
    * @generated
    * @ordered
    */
   public static final int CREATE_VALUE = 1;

   /**
    * The '<em><b>DESTROY</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>DESTROY</b></em>' literal object isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * An object or link variable marked as DESTROY will be destroyed be the story pattern.
    * <!-- end-model-doc -->
    * @see #DESTROY
    * @model
    * @generated
    * @ordered
    */
   public static final int DESTROY_VALUE = 2;

   /**
    * An array of all the '<em><b>Binding Operator</b></em>' enumerators.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private static final BindingOperator[] VALUES_ARRAY = new BindingOperator[] {CHECK_ONLY, CREATE, DESTROY,};

   /**
    * A public read-only list of all the '<em><b>Binding Operator</b></em>' enumerators.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static final List<BindingOperator> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

   /**
    * Returns the '<em><b>Binding Operator</b></em>' literal with the specified literal value.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static BindingOperator get (String literal)
   {
      for (int i = 0; i < VALUES_ARRAY.length; ++i)
      {
         BindingOperator result = VALUES_ARRAY[i];
         if (result.toString().equals(literal))
         {
            return result;
         }
      }
      return null;
   }

   /**
    * Returns the '<em><b>Binding Operator</b></em>' literal with the specified name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static BindingOperator getByName (String name)
   {
      for (int i = 0; i < VALUES_ARRAY.length; ++i)
      {
         BindingOperator result = VALUES_ARRAY[i];
         if (result.getName().equals(name))
         {
            return result;
         }
      }
      return null;
   }

   /**
    * Returns the '<em><b>Binding Operator</b></em>' literal with the specified integer value.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static BindingOperator get (int value)
   {
      switch (value)
      {
         case CHECK_ONLY_VALUE:
            return CHECK_ONLY;
         case CREATE_VALUE:
            return CREATE;
         case DESTROY_VALUE:
            return DESTROY;
      }
      return null;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private final int value;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private final String name;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private final String literal;

   /**
    * Only this class can construct instances.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private BindingOperator (int value, String name, String literal)
   {
      this.value = value;
      this.name = name;
      this.literal = literal;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public int getValue ()
   {
      return value;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public String getName ()
   {
      return name;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public String getLiteral ()
   {
      return literal;
   }

   /**
    * Returns the literal value of the enumerator, which is its string representation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public String toString ()
   {
      return literal;
   }

} //BindingOperator
