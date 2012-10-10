package org.storydriven.modeling.interpreter.adapter.expressions;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.eclipse.emf.ecore.EcorePackage;
import org.storydriven.modeling.expressions.LiteralExpression;
import org.storydriven.modeling.interpreter.adapter.SDMainAdapterFactory;

import de.mdelab.sdm.interpreter.common.SDMInterpreterConstants;
import de.mdelab.sdm.interpreter.common.SDMInterpreterException;
import de.mdelab.sdm.interpreter.common.adapters.m3.IClassifierAdapter;
import de.mdelab.sdm.interpreter.common.adapters.m3.IInstanceAdapter;
import de.mdelab.sdm.interpreter.common.adapters.m3.IM3AdapterFactory;
import de.mdelab.sdm.interpreter.common.variables.Variable;
import de.mdelab.sdm.interpreter.common.variables.VariableScope;

public class SDLiteralExpressionAdapter extends SDCallsExpressionAdapter<LiteralExpression>
{
   private Map<String, Variable>  stringAdapters;

	public SDLiteralExpressionAdapter(SDMainAdapterFactory mainAdapterFactory)
	{
		super(mainAdapterFactory);
		stringAdapters = new ConcurrentHashMap<String, Variable>();
	}

	@Override
	public Variable evaluate(IClassifierAdapter contextClassifierAdapter, IInstanceAdapter contextInstanceAdapter,
			VariableScope variableScope) throws SDMInterpreterException
	{
		assert getElement().getValue() != null;
		assert !"".equals(getElement().getValue());
		assert getElement().getValueType() != null;

		/*
		 * Let EcoreFactory create an Object of the appropriate primitive type
		 */
		if(getElement().getValueType() == EcorePackage.eINSTANCE.getEString())
		{
		   String value = getElement().getValue();
		   Variable v = stringAdapters.get(value);
		   if(v != null)
		   {
		      return v;
		   }
		   else
		   {
		      IM3AdapterFactory m3AdapterFactory = variableScope.getInterpreterManager().getMainAdapterFactory().getM3AdapterFactory();
		      IClassifierAdapter classifierAdapter = m3AdapterFactory.getClassifierAdapter(getElement().getValueType());
		      v = new Variable(SDMInterpreterConstants.INTERNAL_VAR_NAME, classifierAdapter, m3AdapterFactory.getInstanceAdapter(value,
		            classifierAdapter));
		      stringAdapters.put(value, v);
		      return v;
		   }
		}

		Object value = getElement().getValueType().getEPackage().getEFactoryInstance()
				.createFromString(getElement().getValueType(), getElement().getValue());


		IM3AdapterFactory m3AdapterFactory = variableScope.getInterpreterManager().getMainAdapterFactory().getM3AdapterFactory();

		IClassifierAdapter classifierAdapter = m3AdapterFactory.getClassifierAdapter(getElement().getValueType());

		return new Variable(SDMInterpreterConstants.INTERNAL_VAR_NAME, classifierAdapter, m3AdapterFactory.getInstanceAdapter(value,
				classifierAdapter));
	}

}
