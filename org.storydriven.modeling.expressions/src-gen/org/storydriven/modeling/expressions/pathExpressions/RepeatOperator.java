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
 * A representation of the literals of the enumeration '<em><b>Repeat Operator</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.storydriven.modeling.expressions.pathExpressions.PathExpressionsPackage#getRepeatOperator()
 * @model
 * @generated
 */
public enum RepeatOperator implements Enumerator
{
  /**
   * The '<em><b>NO REPEAT</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NO_REPEAT_VALUE
   * @generated
   * @ordered
   */
  NO_REPEAT(0, "NO_REPEAT", "NO_REPEAT"),

  /**
   * The '<em><b>AT LEAST ONCE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #AT_LEAST_ONCE_VALUE
   * @generated
   * @ordered
   */
  AT_LEAST_ONCE(1, "AT_LEAST_ONCE", "+"),

  /**
   * The '<em><b>ARBITRARY</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ARBITRARY_VALUE
   * @generated
   * @ordered
   */
  ARBITRARY(2, "ARBITRARY", "*");

  /**
   * The '<em><b>NO REPEAT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>NO REPEAT</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NO_REPEAT
   * @model
   * @generated
   * @ordered
   */
  public static final int NO_REPEAT_VALUE = 0;

  /**
   * The '<em><b>AT LEAST ONCE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>AT LEAST ONCE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #AT_LEAST_ONCE
   * @model literal="+"
   * @generated
   * @ordered
   */
  public static final int AT_LEAST_ONCE_VALUE = 1;

  /**
   * The '<em><b>ARBITRARY</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ARBITRARY</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ARBITRARY
   * @model literal="*"
   * @generated
   * @ordered
   */
  public static final int ARBITRARY_VALUE = 2;

  /**
   * An array of all the '<em><b>Repeat Operator</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final RepeatOperator[] VALUES_ARRAY =
    new RepeatOperator[]
    {
      NO_REPEAT,
      AT_LEAST_ONCE,
      ARBITRARY,
    };

  /**
   * A public read-only list of all the '<em><b>Repeat Operator</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<RepeatOperator> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Repeat Operator</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static RepeatOperator get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      RepeatOperator result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Repeat Operator</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static RepeatOperator getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      RepeatOperator result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Repeat Operator</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static RepeatOperator get(int value)
  {
    switch (value)
    {
      case NO_REPEAT_VALUE: return NO_REPEAT;
      case AT_LEAST_ONCE_VALUE: return AT_LEAST_ONCE;
      case ARBITRARY_VALUE: return ARBITRARY;
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
  private RepeatOperator(int value, String name, String literal)
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
  
} //RepeatOperator
