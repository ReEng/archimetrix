package org.storydriven.modeling.interpreter.adapter.expressions;

import org.eclipse.emf.ecore.EcorePackage;
import org.storydriven.modeling.expressions.BinaryLogicExpression;
import org.storydriven.modeling.interpreter.adapter.SDMainAdapterFactory;

import de.mdelab.sdm.interpreter.common.SDMInterpreterConstants;
import de.mdelab.sdm.interpreter.common.SDMInterpreterException;
import de.mdelab.sdm.interpreter.common.adapters.expressions.IExpressionAdapter;
import de.mdelab.sdm.interpreter.common.adapters.m3.IClassifierAdapter;
import de.mdelab.sdm.interpreter.common.adapters.m3.IInstanceAdapter;
import de.mdelab.sdm.interpreter.common.expressions.IExpressionInterpreter;
import de.mdelab.sdm.interpreter.common.variables.Variable;
import de.mdelab.sdm.interpreter.common.variables.VariableScope;

public class SDBinaryLogicExpressionAdapter extends SDCallsExpressionAdapter<BinaryLogicExpression>
{

	public SDBinaryLogicExpressionAdapter(SDMainAdapterFactory mainAdapterFactory)
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

		boolean operand1 = (Boolean) leftVariable.getValueAdapter().getValue();
		boolean operand2 = (Boolean) rightVariable.getValueAdapter().getValue();

		/*
		 * Compare values
		 */
		boolean result = false;

		switch (getElement().getOperator())
		{
			case AND:
			{
				result = operand1 && operand2;
				break;
			}
			case OR:
			{
				result = operand1 || operand2;
				break;
			}
			case EQUIVALENT:
			{
				result = operand1 && operand2 || !operand1 && !operand2;
				break;
			}
			case IMPLY:
			{
				result = operand1 && operand2 || !operand1;
				break;
			}
			case XOR:
			{
				result = operand1 && !operand2 || !operand1 && operand2;
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
