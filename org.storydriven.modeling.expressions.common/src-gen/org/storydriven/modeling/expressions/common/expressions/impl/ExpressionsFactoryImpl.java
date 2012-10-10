/**
 * <copyright>
 * </copyright>
 *

 */
package org.storydriven.modeling.expressions.common.expressions.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.storydriven.modeling.expressions.common.expressions.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExpressionsFactoryImpl extends EFactoryImpl implements ExpressionsFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ExpressionsFactory init()
  {
    try
    {
      ExpressionsFactory theExpressionsFactory = (ExpressionsFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.storydriven.org/modeling/expressions/common/Expressions"); 
      if (theExpressionsFactory != null)
      {
        return theExpressionsFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ExpressionsFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpressionsFactoryImpl()
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
      case ExpressionsPackage.LEXPRESSION: return createLExpression();
      case ExpressionsPackage.CEXPRESSION: return createCExpression();
      case ExpressionsPackage.SOME_VALUE: return createSomeValue();
      case ExpressionsPackage.AEXPRESSION: return createAExpression();
      case ExpressionsPackage.NUMBER_VALUE: return createNumberValue();
      case ExpressionsPackage.BOOLEAN_VALUE: return createBooleanValue();
      case ExpressionsPackage.STRING_VALUE: return createStringValue();
      case ExpressionsPackage.VARIABLE: return createVariable();
      case ExpressionsPackage.EQUIVALENT: return createEquivalent();
      case ExpressionsPackage.IMPLY: return createImply();
      case ExpressionsPackage.OR: return createOr();
      case ExpressionsPackage.XOR: return createXor();
      case ExpressionsPackage.AND: return createAnd();
      case ExpressionsPackage.NOT: return createNot();
      case ExpressionsPackage.LESS_OR_EQUAL: return createLessOrEqual();
      case ExpressionsPackage.LESS: return createLess();
      case ExpressionsPackage.GREATER_OR_EQUAL: return createGreaterOrEqual();
      case ExpressionsPackage.GREATER: return createGreater();
      case ExpressionsPackage.EQUAL: return createEqual();
      case ExpressionsPackage.UNEQUAL: return createUnequal();
      case ExpressionsPackage.APPROX: return createApprox();
      case ExpressionsPackage.PLUS: return createPlus();
      case ExpressionsPackage.MINUS: return createMinus();
      case ExpressionsPackage.MULTI: return createMulti();
      case ExpressionsPackage.DIV: return createDiv();
      case ExpressionsPackage.MOD: return createMod();
      case ExpressionsPackage.POW: return createPow();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LExpression createLExpression()
  {
    LExpressionImpl lExpression = new LExpressionImpl();
    return lExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CExpression createCExpression()
  {
    CExpressionImpl cExpression = new CExpressionImpl();
    return cExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SomeValue createSomeValue()
  {
    SomeValueImpl someValue = new SomeValueImpl();
    return someValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AExpression createAExpression()
  {
    AExpressionImpl aExpression = new AExpressionImpl();
    return aExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberValue createNumberValue()
  {
    NumberValueImpl numberValue = new NumberValueImpl();
    return numberValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanValue createBooleanValue()
  {
    BooleanValueImpl booleanValue = new BooleanValueImpl();
    return booleanValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringValue createStringValue()
  {
    StringValueImpl stringValue = new StringValueImpl();
    return stringValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable createVariable()
  {
    VariableImpl variable = new VariableImpl();
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Equivalent createEquivalent()
  {
    EquivalentImpl equivalent = new EquivalentImpl();
    return equivalent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Imply createImply()
  {
    ImplyImpl imply = new ImplyImpl();
    return imply;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Or createOr()
  {
    OrImpl or = new OrImpl();
    return or;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Xor createXor()
  {
    XorImpl xor = new XorImpl();
    return xor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public And createAnd()
  {
    AndImpl and = new AndImpl();
    return and;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Not createNot()
  {
    NotImpl not = new NotImpl();
    return not;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LessOrEqual createLessOrEqual()
  {
    LessOrEqualImpl lessOrEqual = new LessOrEqualImpl();
    return lessOrEqual;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Less createLess()
  {
    LessImpl less = new LessImpl();
    return less;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GreaterOrEqual createGreaterOrEqual()
  {
    GreaterOrEqualImpl greaterOrEqual = new GreaterOrEqualImpl();
    return greaterOrEqual;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Greater createGreater()
  {
    GreaterImpl greater = new GreaterImpl();
    return greater;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Equal createEqual()
  {
    EqualImpl equal = new EqualImpl();
    return equal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Unequal createUnequal()
  {
    UnequalImpl unequal = new UnequalImpl();
    return unequal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Approx createApprox()
  {
    ApproxImpl approx = new ApproxImpl();
    return approx;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Plus createPlus()
  {
    PlusImpl plus = new PlusImpl();
    return plus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Minus createMinus()
  {
    MinusImpl minus = new MinusImpl();
    return minus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Multi createMulti()
  {
    MultiImpl multi = new MultiImpl();
    return multi;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Div createDiv()
  {
    DivImpl div = new DivImpl();
    return div;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mod createMod()
  {
    ModImpl mod = new ModImpl();
    return mod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Pow createPow()
  {
    PowImpl pow = new PowImpl();
    return pow;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpressionsPackage getExpressionsPackage()
  {
    return (ExpressionsPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ExpressionsPackage getPackage()
  {
    return ExpressionsPackage.eINSTANCE;
  }

} //ExpressionsFactoryImpl
