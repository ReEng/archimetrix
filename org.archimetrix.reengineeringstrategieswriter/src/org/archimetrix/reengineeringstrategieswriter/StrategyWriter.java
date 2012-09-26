package org.archimetrix.reengineeringstrategieswriter;


import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.storydriven.modeling.activities.ActivitiesFactory;
import org.storydriven.modeling.activities.Activity;
import org.storydriven.modeling.activities.ActivityNode;
import org.storydriven.modeling.activities.OperationExtension;
import org.storydriven.modeling.activities.StoryNode;
import org.storydriven.modeling.calls.CallsFactory;
import org.storydriven.modeling.calls.ParameterExtension;
import org.storydriven.modeling.calls.expressions.ExpressionsFactory;
import org.storydriven.modeling.calls.expressions.ParameterExpression;
import org.storydriven.modeling.patterns.AbstractVariable;
import org.storydriven.modeling.patterns.BindingState;
import org.storydriven.modeling.patterns.ObjectVariable;
import org.storydriven.modeling.patterns.StoryPattern;


public class StrategyWriter
{


   private static final String ACTIVITY_NODE_PARAM_BIND_PREFIX = "(p)";


   public ParameterExpression createParameterExpression(final EParameter parameter, final ObjectVariable var)
   {
      ParameterExpression expression = ExpressionsFactory.eINSTANCE.createParameterExpression();
      ParameterExtension paramExtension = CallsFactory.eINSTANCE.createParameterExtension();
      paramExtension.setParameter(parameter);
      expression.setParameter(paramExtension);
      return expression;
   }


   public Activity getActivity(final String path)
   {
      ResourceSet rs = new ResourceSetImpl();

      Resource r = rs.createResource(URI.createPlatformResourceURI(path, true));

      try
      {
         r.load(Collections.EMPTY_MAP);
      }
      catch (IOException e)
      {
         e.printStackTrace();
      }

      Activity activity = (Activity) r.getContents().get(0);
      return activity;
   }


   public EOperation createOperation(final String sdmPath, final String methodName, final String[] paramNames, final EClassifier[] paramTypes)
   {
      Activity activity = getActivity(sdmPath);
      EOperation method = EcoreFactory.eINSTANCE.createEOperation();
      method.setName(methodName);
      createParameters(method, paramNames, paramTypes);
      createOperationExtension(activity, method);
      createParameterExpressions(method, paramNames);
      return method;
   }


   public void createOperationExtension(final Activity activity, final EOperation method)
   {
      OperationExtension operation = ActivitiesFactory.eINSTANCE.createOperationExtension();
      operation.setOwnedActivity(EcoreUtil.copy(activity));
      operation.setOperation(method);
   }


   public void createParameterExpressions(final EOperation method, final String[] paramNames)
   {
      OperationExtension opExt = (OperationExtension) method.getEAnnotation("http://ns.storydriven.org/extension")
            .getContents().get(0);
      Activity activity = opExt.getOwnedActivity();
      for (int i = 0; i < activity.getOwnedActivityNodes().size(); i++)
      {
         ActivityNode node = activity.getOwnedActivityNodes().get(i);
         if (node.getName() != null && node.getName().startsWith(ACTIVITY_NODE_PARAM_BIND_PREFIX))
         {
            StoryPattern storyPattern = ((StoryNode) node).getStoryPattern();
            for (AbstractVariable var : storyPattern.getVariables())
            {
               if ((var instanceof ObjectVariable) && (var.getBindingState() == BindingState.BOUND))
               {
                  setBindingExpressionForObjectVariable(method, paramNames, (ObjectVariable) var);
               }
            }
         }
      }
   }


   public void createParameters(final EOperation method, final String[] paramNames, final EClassifier[] paramTypes)
   {
      for (int i = 0; i < paramNames.length; i++)
      {
         EParameter parameter = EcoreFactory.eINSTANCE.createEParameter();
         parameter.setName(paramNames[i]);
         parameter.setEType(paramTypes[i]);
         method.getEParameters().add(parameter);
      }
   }


   public void setBindingExpressionForObjectVariable(final EOperation method, final String[] paramNames, final ObjectVariable var)
   {
      for (int i = 0; i < paramNames.length; i++)
      {
         if (var.getName().equals(paramNames[i]))
         {
            for (EParameter param : method.getEParameters())
            {
               if (param.getName().equals(paramNames[i]))
               {
                  var.setBindingExpression(createParameterExpression(param, var));
               }
            }
            break;
         }
      }
   }

}
