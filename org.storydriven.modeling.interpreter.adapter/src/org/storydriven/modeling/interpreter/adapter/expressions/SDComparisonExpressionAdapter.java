package org.storydriven.modeling.interpreter.adapter.expressions;

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.storydriven.modeling.expressions.ComparisonExpression;
import org.storydriven.modeling.interpreter.adapter.SDMainAdapterFactory;
import org.storydriven.modeling.patterns.ObjectSetVariable;
//import org.storydriven.modeling.patterns.ObjectSetVariable;

import de.mdelab.sdm.interpreter.common.SDMInterpreterConstants;
import de.mdelab.sdm.interpreter.common.SDMInterpreterException;
import de.mdelab.sdm.interpreter.common.adapters.expressions.IExpressionAdapter;
import de.mdelab.sdm.interpreter.common.adapters.m3.IClassifierAdapter;
import de.mdelab.sdm.interpreter.common.adapters.m3.IInstanceAdapter;
import de.mdelab.sdm.interpreter.common.expressions.IExpressionInterpreter;
//import de.mdelab.sdm.interpreter.common.variables.SetVariable;
import de.mdelab.sdm.interpreter.common.variables.Variable;
import de.mdelab.sdm.interpreter.common.variables.VariableScope;

public class SDComparisonExpressionAdapter extends SDCallsExpressionAdapter<ComparisonExpression>
{
	public SDComparisonExpressionAdapter(SDMainAdapterFactory mainAdapterFactory)
	{
		super(mainAdapterFactory);
	}

	@Override
	public Variable evaluate(IClassifierAdapter contextClassifierAdapter, IInstanceAdapter contextInstanceAdapter,
			VariableScope variableScope) throws SDMInterpreterException
	{
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
		 * Compare values
		 */
		Object operand1 = leftVariable.getValueAdapter().getValue();
		Object operand2 = rightVariable.getValueAdapter().getValue();
		
//		if (!(operand1 instanceof Comparable<?>))
//		{
//			throw new SDMInterpreterException("The type of operand1 ('" + operand1 + "') must implement the Comparable interface.");
//		}
//		else if (!(operand2 instanceof Comparable<?>))
//		{
//			throw new SDMInterpreterException("The type of operand2 ('" + operand2 + "') must implement the Comparable interface.");
//		}

		boolean result = false;

		/*
		 * TODO: Is there a more elegant solution?
		 */
		int i;

		if (operand1 instanceof Number && operand2 instanceof Number)
		{
			/*
			 * If both operands are numbers, cast them to BigDecimals and
			 * compare them
			 */
			i = new BigDecimal(operand1.toString()).compareTo(new BigDecimal(operand2.toString()));

		}
		else if (operand1.getClass() == operand2.getClass())
		{
			/*
			 * Otherwise, we can only compare Comparables of the same type, e.g.
			 * String and String.
			 */
			i = ((Comparable) operand1).compareTo((Comparable) operand2);
		}
		else
		{
			throw new SDMInterpreterException("Cannot compare '" + operand1 + "' and '" + operand2 + "'.");
		}

		switch (getElement().getOperator())
		{
			case EQUAL:
			{
				result = i == 0;
				break;
			}
			case LESS:
			{
				result = i < 0;
				break;
			}
			case LESS_OR_EQUAL:
			{
				result = i <= 0;
				break;
			}
			case GREATER:
			{
				result = i > 0;
				break;
			}
			case GREATER_OR_EQUAL:
			{
				result = i >= 0;
				break;
			}
			case UNEQUAL:
			{
				result = i != 0;
				break;
			}
			case REGULAR_EXPRESSION:
			{
			   result = operand1.toString().matches(operand2.toString());
			   break;
			}
			default:
			{
				throw new UnsupportedOperationException();
			}
		}

		IClassifierAdapter classifierAdapter = getMainAdapterFactory().getM3AdapterFactory().getClassifierAdapter(
				EcorePackage.Literals.EBOOLEAN);

		IInstanceAdapter instanceAdapter = getMainAdapterFactory().getM3AdapterFactory().getInstanceAdapter(result, classifierAdapter);

		return new Variable(SDMInterpreterConstants.INTERNAL_VAR_NAME, classifierAdapter, instanceAdapter);
	}
}
