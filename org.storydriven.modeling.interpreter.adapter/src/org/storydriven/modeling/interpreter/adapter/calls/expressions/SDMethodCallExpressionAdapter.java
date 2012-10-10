package org.storydriven.modeling.interpreter.adapter.calls.expressions;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EParameter;
import org.storydriven.modeling.activities.Activity;
import org.storydriven.modeling.calls.OpaqueCallable;
import org.storydriven.modeling.calls.ParameterBinding;
import org.storydriven.modeling.calls.expressions.MethodCallExpression;
import org.storydriven.modeling.interpreter.adapter.SDMainAdapterFactory;
import org.storydriven.modeling.interpreter.adapter.expressions.SDCallsExpressionAdapter;

import de.mdelab.sdm.interpreter.common.SDMInterpreter;
import de.mdelab.sdm.interpreter.common.SDMInterpreterConstants;
import de.mdelab.sdm.interpreter.common.SDMInterpreterException;
import de.mdelab.sdm.interpreter.common.adapters.expressions.IExpressionAdapter;
import de.mdelab.sdm.interpreter.common.adapters.expressions.IExpressionsAdapterFactory;
import de.mdelab.sdm.interpreter.common.adapters.m3.IClassifierAdapter;
import de.mdelab.sdm.interpreter.common.adapters.m3.IInstanceAdapter;
import de.mdelab.sdm.interpreter.common.expressions.ExpressionInterpreterFactory;
import de.mdelab.sdm.interpreter.common.expressions.IExpressionInterpreter;
import de.mdelab.sdm.interpreter.common.variables.Parameter;
import de.mdelab.sdm.interpreter.common.variables.Variable;
import de.mdelab.sdm.interpreter.common.variables.VariableScope;

public class SDMethodCallExpressionAdapter extends SDCallsExpressionAdapter<MethodCallExpression>
{

	public SDMethodCallExpressionAdapter(SDMainAdapterFactory mainAdapterFactory)
	{
		super(mainAdapterFactory);
	}

	@Override
	public Variable evaluate(IClassifierAdapter contextClassifierAdapter, IInstanceAdapter contextInstanceAdapter,
			VariableScope variableScope) throws SDMInterpreterException
	{
		assert getElement().getCallee() != null;

		try
		{
			/*
			 * Handle opaque callables
			 */
			if (getElement().getCallee() instanceof OpaqueCallable)
			{
				OpaqueCallable opaqueCallable = (OpaqueCallable) getElement().getCallee();

				/*
				 * The name of the opaque callable is the fully qualified method
				 * name. Split it into class and method name.
				 */
				String s = opaqueCallable.getName();

				String className = s.substring(0, s.lastIndexOf('.'));

				String methodName = s.substring(s.lastIndexOf('.') + 1, s.length());

				/*
				 * Get the input parameters of the callable
				 */
				Class<?>[] parameterTypes = new Class<?>[getElement().getOpaqueCallable().getInParameters().size()];
				Object[] parameterValues = new Object[getElement().getOpaqueCallable().getInParameters().size()];

				int index = 0;

				for (EParameter p : opaqueCallable.getInParameters())
				{
					parameterTypes[index] = p.getEType().getInstanceClass();

					/*
					 * Get the value bound to this parameter
					 */
					parameterValues[index] = getParameterValue(p, getElement().getOwnedParameterBindings(), contextClassifierAdapter,
							contextInstanceAdapter, variableScope);
					index++;
				}

				/*
				 * Get the return type
				 */
				assert opaqueCallable.getOutParameters().size() == 1;

				IClassifierAdapter returnTypeAdapter = variableScope.getInterpreterManager().getMainAdapterFactory().getM3AdapterFactory()
						.getClassifierAdapter(opaqueCallable.getOutParameters().get(0).getEType());

				/*
				 * Get the Class object
				 */
				Class<?> clazz = Class.forName(className, true, variableScope.getInterpreterManager().getClassLoader());

				Method method = clazz.getMethod(methodName, parameterTypes);

				/*
				 * Get the instance object
				 */
				Object instanceObject = null;

				if (getElement().getTarget() != null)
				{
					IExpressionAdapter targetExpressionAdapter = variableScope.getInterpreterManager().getMainAdapterFactory()
							.getExpressionsAdapterFactory().getExpressionAdapter(getElement().getTarget());

					IExpressionInterpreter expressionInterpreter = variableScope.getInterpreterManager().getMainInterpreterFactory()
							.getExpressionInterpreterFactory().getExpressionInterpreter(targetExpressionAdapter.getExpressionLanguage());

					Variable targetVariable = expressionInterpreter.evaluate(targetExpressionAdapter, variableScope,
							contextClassifierAdapter, contextInstanceAdapter);

					assert targetVariable != null;

					instanceObject = targetVariable.getValueAdapter().getValue();

				}

				Object returnValue = method.invoke(instanceObject, parameterValues);

				if (!((EClassifier) returnTypeAdapter.getClassifier()).isInstance(returnValue))
				{
					throw new SDMInterpreterException("The return value '" + returnValue
							+ "' is not an instance of the expected return type '" + returnTypeAdapter.getClassifier() + "'.");
				}

				IInstanceAdapter instanceAdapter = variableScope.getInterpreterManager().getMainAdapterFactory().getM3AdapterFactory()
						.getInstanceAdapter(returnValue, returnTypeAdapter);

				return new Variable(SDMInterpreterConstants.INTERNAL_VAR_NAME, returnTypeAdapter, instanceAdapter);
			}
			else if (getElement().getCallee() instanceof Activity)
			{
				Activity activity = (Activity) getElement().getCallee();

				/*
				 * Compile list of parameters
				 */
				List<Parameter> parameters = new ArrayList<Parameter>();

				for (ParameterBinding parameterBinding : getElement().getOwnedParameterBindings())
				{
					assert parameterBinding.getValueExpression() != null;

					IExpressionAdapter expressionAdapter = getMainAdapterFactory().getExpressionsAdapterFactory().getExpressionAdapter(
							parameterBinding.getValueExpression());

					IExpressionInterpreter expressionInterpreter = variableScope.getInterpreterManager().getMainInterpreterFactory()
							.getExpressionInterpreterFactory().getExpressionInterpreter(expressionAdapter.getExpressionLanguage());

					Variable v = expressionInterpreter.evaluate(expressionAdapter, variableScope, contextClassifierAdapter,
							contextInstanceAdapter);

					assert v != null;

					Parameter p = new Parameter(parameterBinding.getParameter().getName(), parameterBinding.getParameter().getEType(), v
							.getValueAdapter().getValue());

					parameters.add(p);
				}

				/*
				 * Get the instance object
				 */
				if (getElement().getTarget() != null)
				{
					IExpressionAdapter targetExpressionAdapter = variableScope.getInterpreterManager().getMainAdapterFactory()
							.getExpressionsAdapterFactory().getExpressionAdapter(getElement().getTarget());

					IExpressionInterpreter expressionInterpreter = variableScope.getInterpreterManager().getMainInterpreterFactory()
							.getExpressionInterpreterFactory().getExpressionInterpreter(targetExpressionAdapter.getExpressionLanguage());

					Variable targetVariable = expressionInterpreter.evaluate(targetExpressionAdapter, variableScope,
							contextClassifierAdapter, contextInstanceAdapter);

					assert targetVariable != null;

					Parameter thisParameter = new Parameter("this", targetVariable.getClassifierAdapter(), targetVariable.getValueAdapter());

					parameters.add(thisParameter);
				}

				/*
				 * Execute the activity
				 */
				SDMInterpreter sdmInterpreter = new SDMInterpreter(variableScope.getInterpreterManager().getMainInterpreterFactory(),
						getMainAdapterFactory(), variableScope.getInterpreterManager().getClassLoader());

				Map<String, Variable> returnValues = sdmInterpreter.executeActivity(activity, parameters);

				Variable returnVariable = returnValues.get(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME);

				if (returnVariable != null)
				{
					return new Variable(SDMInterpreterConstants.INTERNAL_VAR_NAME, returnVariable.getClassifierAdapter(),
							returnVariable.getValueAdapter());
				}
				else
				{
					return null;
				}
			}
			else
			{
				throw new UnsupportedOperationException();
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();

			throw new SDMInterpreterException("Could not evaluate MethodCallExpression.", e);
		}
	}

	private Object getParameterValue(EParameter p, Collection<ParameterBinding> parameterBindings,
			IClassifierAdapter contextClassifierAdapter, IInstanceAdapter contextInstance, VariableScope variableScope)
			throws SDMInterpreterException
	{
		IExpressionsAdapterFactory expressionsAdapterFactory = variableScope.getInterpreterManager().getMainAdapterFactory()
				.getExpressionsAdapterFactory();

		ExpressionInterpreterFactory expressionInterpreterFactory = variableScope.getInterpreterManager().getMainInterpreterFactory()
				.getExpressionInterpreterFactory();
		/*
		 * Iterate through parameter bindings
		 */
		for (ParameterBinding b : parameterBindings)
		{
			if (b.getParameter() == p)
			{
				IExpressionAdapter expressionAdapter = expressionsAdapterFactory.getExpressionAdapter(b.getValueExpression());

				IExpressionInterpreter expressionInterpreter = expressionInterpreterFactory.getExpressionInterpreter(expressionAdapter
						.getExpressionLanguage());

				Variable var = expressionInterpreter.evaluate(expressionAdapter, variableScope, contextClassifierAdapter, contextInstance);

				assert var != null;

				return var.getValueAdapter().getValue();
			}
		}

		throw new SDMInterpreterException("There is no parameter binding for parameter '" + p.getName() + "'.");
	}
}
