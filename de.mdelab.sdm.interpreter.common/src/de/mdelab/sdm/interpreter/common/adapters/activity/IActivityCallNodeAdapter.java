package de.mdelab.sdm.interpreter.common.adapters.activity;

import java.util.List;

import de.mdelab.sdm.interpreter.common.adapters.IMainAdapterFactory;
import de.mdelab.sdm.interpreter.common.expressions.ExpressionInterpreterFactory;
import de.mdelab.sdm.interpreter.common.variables.Parameter;
import de.mdelab.sdm.interpreter.common.variables.VariableScope;

public interface IActivityCallNodeAdapter extends IActivityNodeAdapter
{
   public IActivityNodeAdapter getNextNodeAdapterForSuccess();

   public IActivityNodeAdapter getNextNodeAdapterForFailure();
   
   public Object getCalledActivity();

   public List<Parameter> getParameters(VariableScope variableScope);

   public IMainAdapterFactory getAdapterFactory();

   public IActivityNodeAdapter getNextNodeAdapter();

   public ExpressionInterpreterFactory getExpressionInterpreterAdapterFactory();

   public String getReturnVariableName(VariableScope variableScope);
   
}
