package de.mdelab.sdm.interpreter.common.expressions;

import java.util.HashMap;
import java.util.Map;

import de.mdelab.sdm.interpreter.common.SDMInterpreterException;

/**
 * @author Stephan Hildebrandt
 * @author Sebastian Wätzoldt
 */
public abstract class ExpressionInterpreterFactory
{
	private Map<String, IExpressionInterpreter>	expressionInterpreters;

	public ExpressionInterpreterFactory()
	{
		this.expressionInterpreters = new HashMap<String, IExpressionInterpreter>();
	}

	public IExpressionInterpreter getExpressionInterpreter(String expressionLanguage) throws SDMInterpreterException
	{
		assert expressionLanguage != null;
		assert !"".equals(expressionLanguage);

		IExpressionInterpreter expressionInterpreter = expressionInterpreters.get(expressionLanguage);

		if (expressionInterpreter == null)
		{
			expressionInterpreter = createExpressionInterpreter(expressionLanguage);

			if (expressionInterpreter == null)
			{
				throw new SDMInterpreterException("There is no expression interpreter for expression language '" + expressionLanguage
						+ "'.");
			}
			else
			{
				expressionInterpreters.put(expressionLanguage, expressionInterpreter);
			}
		}

		return expressionInterpreter;
	}

	protected abstract IExpressionInterpreter createExpressionInterpreter(String expressionLanguage);
}
