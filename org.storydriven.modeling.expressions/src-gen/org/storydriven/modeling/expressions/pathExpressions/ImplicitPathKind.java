/**
 * <copyright>
 * </copyright>
 *

 */
package org.storydriven.modeling.expressions.pathExpressions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Implicit Path Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.storydriven.modeling.expressions.pathExpressions.PathExpressionsPackage#getImplicitPathKind()
 * @model
 * @generated
 */
public enum ImplicitPathKind implements Enumerator
{
  /**
   * The '<em><b>ANY</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ANY_VALUE
   * @generated
   * @ordered
   */
  ANY(0, "ANY", "-->"),

  /**
   * The '<em><b>CONTAINMENT SOURCE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CONTAINMENT_SOURCE_VALUE
   * @generated
   * @ordered
   */
  CONTAINMENT_SOURCE(1, "CONTAINMENT_SOURCE", "<>-->"),

  /**
   * The '<em><b>CONTAINMENT TARGET</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CONTAINMENT_TARGET_VALUE
   * @generated
   * @ordered
   */
  CONTAINMENT_TARGET(2, "CONTAINMENT_TARGET", "--><>");

  /**
   * The '<em><b>ANY</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ANY</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ANY
   * @model literal="-->"
   * @generated
   * @ordered
   */
  public static final int ANY_VALUE = 0;

  /**
   * The '<em><b>CONTAINMENT SOURCE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>CONTAINMENT SOURCE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CONTAINMENT_SOURCE
   * @model literal="<>-->"
   * @generated
   * @ordered
   */
  public static final int CONTAINMENT_SOURCE_VALUE = 1;

  /**
   * The '<em><b>CONTAINMENT TARGET</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>CONTAINMENT TARGET</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CONTAINMENT_TARGET
   * @model literal="--><>"
   * @generated
   * @ordered
   */
  public static final int CONTAINMENT_TARGET_VALUE = 2;

  /**
   * An array of all the '<em><b>Implicit Path Kind</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final ImplicitPathKind[] VALUES_ARRAY =
    new ImplicitPathKind[]
    {
      ANY,
      CONTAINMENT_SOURCE,
      CONTAINMENT_TARGET,
    };

  /**
   * A public read-only list of all the '<em><b>Implicit Path Kind</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<ImplicitPathKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Implicit Path Kind</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ImplicitPathKind get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ImplicitPathKind result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Implicit Path Kind</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ImplicitPathKind getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ImplicitPathKind result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Implicit Path Kind</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ImplicitPathKind get(int value)
  {
    switch (value)
    {
      case ANY_VALUE: return ANY;
      case CONTAINMENT_SOURCE_VALUE: return CONTAINMENT_SOURCE;
      case CONTAINMENT_TARGET_VALUE: return CONTAINMENT_TARGET;
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
  private ImplicitPathKind(int value, String name, String literal)
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
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
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
  public String toString()
  {
    return literal;
  }
  
} //ImplicitPathKind
