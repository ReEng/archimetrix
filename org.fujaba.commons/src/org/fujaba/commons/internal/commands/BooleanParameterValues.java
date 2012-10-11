package org.fujaba.commons.internal.commands;


import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.commands.IParameterValues;


public class BooleanParameterValues implements IParameterValues
{

   private final Map<String, Boolean> values;


   public BooleanParameterValues()
   {
      values = new HashMap<String, Boolean>();

      values.put(Boolean.toString(false), Boolean.FALSE);
      values.put(Boolean.toString(true), Boolean.TRUE);
   }


   public Map<String, Boolean> getParameterValues()
   {
      return values;
   }
}
