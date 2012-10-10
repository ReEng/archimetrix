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
 * A representation of the literals of the enumeration '<em><b>Link Constraint Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * The LinkConstraintType represents the different uses of LinkConstraints. Objects can be required to have a certain position in their containing collection (FIRST, LAST, INDEX) or a certain ordering relative to each other (DIRECT_SUCCESSOR, INDIRECT_SUCCESSOR).
 * <!-- end-model-doc -->
 * @see org.storydriven.modeling.patterns.PatternsPackage#getLinkConstraintType()
 * @model
 * @generated
 */
public enum LinkConstraintType implements Enumerator
{
   /**
    * The '<em><b>FIRST</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #FIRST_VALUE
    * @generated
    * @ordered
    */
   FIRST (0, "FIRST", "FIRST"),

   /**
    * The '<em><b>LAST</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #LAST_VALUE
    * @generated
    * @ordered
    */
   LAST (1, "LAST", "LAST"),

   /**
    * The '<em><b>DIRECT SUCCESSOR</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #DIRECT_SUCCESSOR_VALUE
    * @generated
    * @ordered
    */
   DIRECT_SUCCESSOR (2, "DIRECT_SUCCESSOR", "DIRECT_SUCCESSOR"),

   /**
    * The '<em><b>INDIRECT SUCCESSOR</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #INDIRECT_SUCCESSOR_VALUE
    * @generated
    * @ordered
    */
   INDIRECT_SUCCESSOR (3, "INDIRECT_SUCCESSOR", "INDIRECT_SUCCESSOR"),

   /**
    * The '<em><b>INDEX</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #INDEX_VALUE
    * @generated
    * @ordered
    */
   INDEX (4, "INDEX", "INDEX");

   /**
    * The '<em><b>FIRST</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>FIRST</b></em>' literal object isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @see #FIRST
    * @model
    * @generated
    * @ordered
    */
   public static final int FIRST_VALUE = 0;

   /**
    * The '<em><b>LAST</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>LAST</b></em>' literal object isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @see #LAST
    * @model
    * @generated
    * @ordered
    */
   public static final int LAST_VALUE = 1;

   /**
    * The '<em><b>DIRECT SUCCESSOR</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>DIRECT SUCCESSOR</b></em>' literal object isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @see #DIRECT_SUCCESSOR
    * @model
    * @generated
    * @ordered
    */
   public static final int DIRECT_SUCCESSOR_VALUE = 2;

   /**
    * The '<em><b>INDIRECT SUCCESSOR</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>INDIRECT SUCCESSOR</b></em>' literal object isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @see #INDIRECT_SUCCESSOR
    * @model
    * @generated
    * @ordered
    */
   public static final int INDIRECT_SUCCESSOR_VALUE = 3;

   /**
    * The '<em><b>INDEX</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>INDEX</b></em>' literal object isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @see #INDEX
    * @model
    * @generated
    * @ordered
    */
   public static final int INDEX_VALUE = 4;

   /**
    * An array of all the '<em><b>Link Constraint Type</b></em>' enumerators.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private static final LinkConstraintType[] VALUES_ARRAY = new LinkConstraintType[] {FIRST, LAST, DIRECT_SUCCESSOR,
         INDIRECT_SUCCESSOR, INDEX,};

   /**
    * A public read-only list of all the '<em><b>Link Constraint Type</b></em>' enumerators.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static final List<LinkConstraintType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

   /**
    * Returns the '<em><b>Link Constraint Type</b></em>' literal with the specified literal value.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static LinkConstraintType get (String literal)
   {
      for (int i = 0; i < VALUES_ARRAY.length; ++i)
      {
         LinkConstraintType result = VALUES_ARRAY[i];
         if (result.toString().equals(literal))
         {
            return result;
         }
      }
      return null;
   }

   /**
    * Returns the '<em><b>Link Constraint Type</b></em>' literal with the specified name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static LinkConstraintType getByName (String name)
   {
      for (int i = 0; i < VALUES_ARRAY.length; ++i)
      {
         LinkConstraintType result = VALUES_ARRAY[i];
         if (result.getName().equals(name))
         {
            return result;
         }
      }
      return null;
   }

   /**
    * Returns the '<em><b>Link Constraint Type</b></em>' literal with the specified integer value.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static LinkConstraintType get (int value)
   {
      switch (value)
      {
         case FIRST_VALUE:
            return FIRST;
         case LAST_VALUE:
            return LAST;
         case DIRECT_SUCCESSOR_VALUE:
            return DIRECT_SUCCESSOR;
         case INDIRECT_SUCCESSOR_VALUE:
            return INDIRECT_SUCCESSOR;
         case INDEX_VALUE:
            return INDEX;
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
   private LinkConstraintType (int value, String name, String literal)
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

} //LinkConstraintType
