package org.storydriven.modeling.interpreter.adapter.expressions;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EcorePackage;
import org.storydriven.modeling.expressions.ArithmeticExpression;
import org.storydriven.modeling.interpreter.adapter.SDMainAdapterFactory;

import de.mdelab.sdm.interpreter.common.SDMInterpreterConstants;
import de.mdelab.sdm.interpreter.common.SDMInterpreterException;
import de.mdelab.sdm.interpreter.common.adapters.expressions.IExpressionAdapter;
import de.mdelab.sdm.interpreter.common.adapters.m3.IClassifierAdapter;
import de.mdelab.sdm.interpreter.common.adapters.m3.IInstanceAdapter;
import de.mdelab.sdm.interpreter.common.expressions.IExpressionInterpreter;
import de.mdelab.sdm.interpreter.common.variables.Variable;
import de.mdelab.sdm.interpreter.common.variables.VariableScope;

public class SDArithmeticExpressionAdapter extends SDCallsExpressionAdapter<ArithmeticExpression>
{
	private final List<EDataType>	classifierSizeList;

	public SDArithmeticExpressionAdapter(SDMainAdapterFactory mainAdapterFactory)
	{
		super(mainAdapterFactory);

		classifierSizeList = new ArrayList<EDataType>();

		classifierSizeList.add(EcorePackage.Literals.ESHORT);
		classifierSizeList.add(EcorePackage.Literals.ESHORT_OBJECT);
		classifierSizeList.add(EcorePackage.Literals.EBYTE);
		classifierSizeList.add(EcorePackage.Literals.EBYTE_OBJECT);
		classifierSizeList.add(EcorePackage.Literals.EINT);
		classifierSizeList.add(EcorePackage.Literals.EINTEGER_OBJECT);
		classifierSizeList.add(EcorePackage.Literals.EFLOAT);
		classifierSizeList.add(EcorePackage.Literals.EFLOAT_OBJECT);
		classifierSizeList.add(EcorePackage.Literals.ELONG);
		classifierSizeList.add(EcorePackage.Literals.ELONG_OBJECT);
		classifierSizeList.add(EcorePackage.Literals.EDOUBLE);
		classifierSizeList.add(EcorePackage.Literals.EDOUBLE_OBJECT);
	}

	@Override
	public Variable evaluate(IClassifierAdapter contextClassifierAdapter, IInstanceAdapter contextInstanceAdapter,
			VariableScope variableScope) throws SDMInterpreterException
	{
		assert getElement().getLeftExpression() != null;
		assert getElement().getRightExpression() != null;

		/*
		 * Evaluate left expression
		 */
		IExpressionAdapter leftExpressionAdapter = getMainAdapterFactory().getExpressionsAdapterFactory().getExpressionAdapter(
				getElement().getLeftExpression());

		IExpressionInterpreter expressionInterpreter = variableScope.getInterpreterManager().getMainInterpreterFactory()
				.getExpressionInterpreterFactory().getExpressionInterpreter(leftExpressionAdapter.getExpressionLanguage());

		Variable leftVariable = expressionInterpreter.evaluate(leftExpressionAdapter, variableScope, contextClassifierAdapter,
				contextInstanceAdapter);

		/*
		 * Evaluate right expression
		 */
		IExpressionAdapter rightExpressionAdapter = getMainAdapterFactory().getExpressionsAdapterFactory().getExpressionAdapter(
				getElement().getRightExpression());

		expressionInterpreter = variableScope.getInterpreterManager().getMainInterpreterFactory().getExpressionInterpreterFactory()
				.getExpressionInterpreter(rightExpressionAdapter.getExpressionLanguage());

		Variable rightVariable = expressionInterpreter.evaluate(rightExpressionAdapter, variableScope, contextClassifierAdapter,
				contextInstanceAdapter);

		/*
		 * Map everything to BigDecimal
		 */
		BigDecimal operand1 = new BigDecimal(leftVariable.getValueAdapter().getValue().toString());
		BigDecimal operand2 = new BigDecimal(rightVariable.getValueAdapter().getValue().toString());

		BigDecimal result;

		/*
		 * perform the operation
		 */
		switch (getElement().getOperator())
		{
			case PLUS:
			{
				result = operand1.add(operand2);
				break;
			}
			case MINUS:
			{
				result = operand1.subtract(operand2);
				break;
			}
			case TIMES:
			{
				result = operand1.multiply(operand2);
				break;
			}
			case DIVIDE:
			{
				result = operand1.divide(operand2);
				break;
			}
			case MODULO:
			{
				result = operand1.remainder(operand2);
				break;
			}
			case EXP:
			{
				result = operand1.pow(operand2.intValueExact());
				break;
			}
			default:
			{
				throw new UnsupportedOperationException();
			}
		}

		/*
		 * The return classifier is the largest of the two operand classifiers
		 */
		IClassifierAdapter classifierAdapter = getMainAdapterFactory().getM3AdapterFactory().getClassifierAdapter(
				classifierSizeList.get(Math.max(classifierSizeList.indexOf(leftVariable.getClassifierAdapter().getClassifier()),
						classifierSizeList.indexOf(rightVariable.getClassifierAdapter().getClassifier()))));

		Object finalResult;

		if (classifierAdapter.getClassifier() == EcorePackage.Literals.EBYTE
				|| classifierAdapter.getClassifier() == EcorePackage.Literals.EBYTE_OBJECT)
		{
			finalResult = result.byteValue();
		}
		else if (classifierAdapter.getClassifier() == EcorePackage.Literals.EINT
				|| classifierAdapter.getClassifier() == EcorePackage.Literals.EINTEGER_OBJECT)
		{
			finalResult = result.intValue();
		}
		else if (classifierAdapter.getClassifier() == EcorePackage.Literals.EDOUBLE
				|| classifierAdapter.getClassifier() == EcorePackage.Literals.EDOUBLE_OBJECT)
		{
			finalResult = result.doubleValue();
		}
		else if (classifierAdapter.getClassifier() == EcorePackage.Literals.EFLOAT
				|| classifierAdapter.getClassifier() == EcorePackage.Literals.EFLOAT_OBJECT)
		{
			finalResult = result.floatValue();
		}
		else if (classifierAdapter.getClassifier() == EcorePackage.Literals.ELONG
				|| classifierAdapter.getClassifier() == EcorePackage.Literals.ELONG_OBJECT)
		{
			finalResult = result.longValue();
		}
		else if (classifierAdapter.getClassifier() == EcorePackage.Literals.ESHORT
				|| classifierAdapter.getClassifier() == EcorePackage.Literals.ESHORT_OBJECT)
		{
			finalResult = result.shortValue();
		}
		else
		{
			throw new UnsupportedOperationException();
		}

		IInstanceAdapter instanceAdapter = getMainAdapterFactory().getM3AdapterFactory().getInstanceAdapter(finalResult, classifierAdapter);

		return new Variable(SDMInterpreterConstants.INTERNAL_VAR_NAME, classifierAdapter, instanceAdapter);
	}
}
