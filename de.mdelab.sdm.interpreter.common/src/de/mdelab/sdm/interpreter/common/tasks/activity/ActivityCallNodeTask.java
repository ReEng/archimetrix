package de.mdelab.sdm.interpreter.common.tasks.activity;


import java.util.Map;

import de.mdelab.sdm.interpreter.common.MainInterpreterFactory;
import de.mdelab.sdm.interpreter.common.SDMInterpreter;
import de.mdelab.sdm.interpreter.common.SDMInterpreterConstants;
import de.mdelab.sdm.interpreter.common.adapters.activity.IActivityCallNodeAdapter;
//import de.mdelab.sdm.interpreter.common.expressions.EclipseBasedExpressionInterpreterFactory;
import de.mdelab.sdm.interpreter.common.expressions.ExpressionInterpreterFactory;
import de.mdelab.sdm.interpreter.common.tasks.Task;
import de.mdelab.sdm.interpreter.common.tasks.notifying.NotifyingMainInterpreterFactory;
import de.mdelab.sdm.interpreter.common.tasks.notifying.OutputStreamNotificationReceiver;
import de.mdelab.sdm.interpreter.common.variables.Variable;
import de.mdelab.sdm.interpreter.common.variables.VariableScope;


public class ActivityCallNodeTask extends ActivityNodeTask<IActivityCallNodeAdapter>
{
   public ActivityCallNodeTask(Task<?> parentTask, VariableScope variableScope, IActivityCallNodeAdapter adapter)
   {
      super(parentTask, variableScope, adapter);
   }


   @Override
   protected boolean caseStateInitializing() throws Exception
   {
      return false;
   }


   @Override
   protected boolean caseStateWorking() throws Exception
   {
      SDMInterpreter interpreter = new SDMInterpreter(getMainInterpreterFactory(), getAdapter().getAdapterFactory(),
            getClass().getClassLoader());
      Map<String, Variable> vars = interpreter.executeActivity(getAdapter().getCalledActivity(), getAdapter()
            .getParameters(getVariableScope()), 1);
      Variable methodReturnValue = vars.get(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME);
      if (methodReturnValue != null)
      {
         String variableName = getAdapter().getReturnVariableName(this.getVariableScope());
         this.getVariableScope().createVariable(variableName, methodReturnValue.getClassifierAdapter(), methodReturnValue.getValueAdapter());
      }
      return false;
   }


   private MainInterpreterFactory getMainInterpreterFactory()
   {
      return getVariableScope().getInterpreterManager().getMainInterpreterFactory();
   }


   private ExpressionInterpreterFactory getExpressionInterpreterAdapterFactory()
   {
      return getAdapter().getExpressionInterpreterAdapterFactory();
   }


   @Override
   protected void caseStateFinishing() throws Exception
   {
      assert getNextNodeAdapter() != null;

      setNextNodeAdapter(getAdapter().getNextNodeAdapter());
   }


   @Override
   protected void caseStateCancelled() throws Exception
   {
      // Do nothing

   }

}
