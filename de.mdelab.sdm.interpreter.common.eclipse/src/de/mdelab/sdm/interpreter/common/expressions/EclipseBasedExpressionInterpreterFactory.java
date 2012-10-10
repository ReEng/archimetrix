package de.mdelab.sdm.interpreter.common.expressions;

import java.util.HashMap;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;

public class EclipseBasedExpressionInterpreterFactory extends ExpressionInterpreterFactory
{

	private HashMap<String, IConfigurationElement>	availableExpressionInterpreters;

	@Override
	public IExpressionInterpreter createExpressionInterpreter(String expressionLanguage)
	{
		if (availableExpressionInterpreters == null)
		{
			availableExpressionInterpreters = new HashMap<String, IConfigurationElement>();

			/*
			 * Discover available expression interpreters
			 */
			IExtensionRegistry registry = Platform.getExtensionRegistry();
			IConfigurationElement[] configurationElements = registry
					.getConfigurationElementsFor(Constants.EXPRESSION_INTERPRETERS_EXTENSION_POINT_ID);

			for (IConfigurationElement configElement : configurationElements)
			{
				availableExpressionInterpreters.put(configElement.getAttribute(Constants.EXPRESSION_LANGUAGE_ATTRIBUTE_NAME),
						configElement);
			}
		}

		IConfigurationElement expressionInterpreterConfigElement = availableExpressionInterpreters.get(expressionLanguage);

		if (expressionInterpreterConfigElement == null)
		{
			/*
			 * There is no expression interpreter available for this expression
			 * language.
			 */
			return null;
		}
		else
		{
			/*
			 * There is an expression interpreter available. Create a new
			 * instance of it.
			 */
			try
			{
				IExpressionInterpreter expressionInterpreter = (IExpressionInterpreter) expressionInterpreterConfigElement
						.createExecutableExtension(Constants.EXPRESSION_INTERPRETER_CLASS_ATTRIBUTE_NAME);

				return expressionInterpreter;
			}
			catch (CoreException e)
			{
				e.printStackTrace();

				throw new RuntimeException("Could not instantiate expression interpreter for '"
						+ expressionInterpreterConfigElement.getAttribute(Constants.EXPRESSION_LANGUAGE_ATTRIBUTE_NAME), e);
			}
		}
	}

}
