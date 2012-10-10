package org.storydriven.modeling.interpreter.adapter.storypattern.expressions;


import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.storydriven.modeling.interpreter.adapter.SDMainAdapterFactory;
import org.storydriven.modeling.patterns.expressions.AttributeValueExpression;

import de.mdelab.sdm.interpreter.common.SDMInterpreterConstants;
import de.mdelab.sdm.interpreter.common.SDMInterpreterException;
import de.mdelab.sdm.interpreter.common.adapters.m3.IClassifierAdapter;
import de.mdelab.sdm.interpreter.common.adapters.m3.IInstanceAdapter;
import de.mdelab.sdm.interpreter.common.variables.Variable;
import de.mdelab.sdm.interpreter.common.variables.VariableScope;


public class SDAttributeValueExpressionAdapter extends SDPatternsExpressionAdapter<AttributeValueExpression>
{

   public SDAttributeValueExpressionAdapter(SDMainAdapterFactory mainAdapterFactory)
   {
      super(mainAdapterFactory);
   }


   @Override
   public Variable evaluate(IClassifierAdapter contextClassifierAdapter, IInstanceAdapter contextInstanceAdapter,
         VariableScope variableScope) throws SDMInterpreterException
   {

      try
      {
         IClassifierAdapter classifierAdapter = variableScope.getInterpreterManager().getMainAdapterFactory()
               .getM3AdapterFactory().getClassifierAdapter(EcorePackage.Literals.EJAVA_OBJECT);

         IInstanceAdapter instanceAdapter = null;

         if (contextInstanceAdapter != null)
         {
            EAttribute attribute = getElement().getAttribute();
            Variable var = variableScope.getVariable(getElement().getObject().getName());
            Object result = null;
            if (var != null)
            {
               IInstanceAdapter objectInstanceAdapter = var.getValueAdapter();
               result = ((EObject) objectInstanceAdapter.getValue()).eGet(attribute);
            }
            else
            {
               // e.g. for negative object variables
               result = ((EObject) contextInstanceAdapter.getValue()).eGet(attribute);
            }

            instanceAdapter = variableScope.getInterpreterManager().getMainAdapterFactory().getM3AdapterFactory()
                  .getInstanceAdapter(result, classifierAdapter);
         }
         else
         {
            instanceAdapter = variableScope.getInterpreterManager().getMainAdapterFactory().getM3AdapterFactory()
                  .getInstanceAdapter(getElement().getAttribute(), classifierAdapter);
         }

         return new Variable(SDMInterpreterConstants.INTERNAL_VAR_NAME, classifierAdapter, instanceAdapter);
      }
      catch (Exception e)
      {
         e.printStackTrace();

         throw new SDMInterpreterException("Could not evaluate AttributeValueExpression.", e);
      }
   }


}
