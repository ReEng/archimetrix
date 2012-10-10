package de.mdelab.sdm.interpreter.common;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;

import de.mdelab.sdm.interpreter.common.activity.tasks.ActivityTaskFactory;
import de.mdelab.sdm.interpreter.common.storyPattern.StoryPatternMatcherFactory;
import de.mdelab.sdm.interpreter.common.tasks.VariablesManager;

/**
 * The EclipseBasedSDMInterpreter uses Eclipse's extension point mechanism to
 * discover expression interpreters.
 * 
 * @author Stephan Hildebrandt
 * @author Sebastian Wätzoldt
 * 
 */
public class EclipseBasedSDMInterpreter extends SDMInterpreter
{
	/**
	 * Create a new Eclipse-based SDM interpreter. The Eclipse-based interpreter
	 * discovers expression interpreters via Eclipse's extension point
	 * mechanism.
	 * 
	 * @param interpreterAdapterFactory
	 *            This adapter factory creates the adapters to access the actual
	 *            story diagram model.
	 * @param taskFactory
	 *            This task factory is used to create tasks.
	 * @param classLoader
	 *            This class loader is used to invoke Java methods via
	 *            reflection.
	 */
	public EclipseBasedSDMInterpreter(SDMInterpreterAdapterFactory interpreterAdapterFactory, StoryPatternMatcherFactory matcherFactory,
			ClassLoader classLoader, ActivityTaskFactory taskFactory)
	{
		super(interpreterAdapterFactory, matcherFactory, taskFactory, classLoader);

		availableExpressionInterpreters = new HashMap<String, IConfigurationElement>();

		/*
		 * Discover available expression interpreters
		 */
		IExtensionRegistry registry = Platform.getExtensionRegistry();
		IConfigurationElement[] configurationElements = registry
				.getConfigurationElementsFor(SDMInterpreterConstants.EXPRESSION_INTERPRETERS_EXTENSION_POINT_ID);

		for (IConfigurationElement configElement : configurationElements)
		{
			availableExpressionInterpreters.put(configElement.getAttribute(SDMInterpreterConstants.EXPRESSION_LANGUAGE_ATTRIBUTE_NAME),
					configElement);
		}

	}

	/*
	 * A map of all expression interpreters registered via the expression
	 * interpreter extension point.
	 */
	private Map<String, IConfigurationElement>	availableExpressionInterpreters;

	@Override
	public ExpressionInterpreter createExpressionInterpreter(String expressionLanguage, VariablesManager variablesManager)
	{
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
				ExpressionInterpreter expressionInterpreter = (ExpressionInterpreter) expressionInterpreterConfigElement
						.createExecutableExtension(SDMInterpreterConstants.EXPRESSION_INTERPRETER_CLASS_ATTRIBUTE_NAME);

				expressionInterpreter.setVariablesManager(variablesManager);
				expressionInterpreter.setAdapterFactory(getInterpreterAdapterFactory());

				return expressionInterpreter;
			}
			catch (CoreException e)
			{
				e.printStackTrace();

				throw new RuntimeException("Could not instantiate expression interpreter for '"
						+ expressionInterpreterConfigElement.getAttribute(SDMInterpreterConstants.EXPRESSION_LANGUAGE_ATTRIBUTE_NAME), e);
			}
		}
	}
}
