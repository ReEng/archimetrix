package org.fujaba.commons.internal.commands;


import org.eclipse.core.commands.AbstractParameterValueConverter;
import org.eclipse.core.commands.ParameterValueConversionException;


public class BooleanConverter extends AbstractParameterValueConverter
{

   @Override
   public Object convertToObject(String parameter)
         throws ParameterValueConversionException
   {
      return Boolean.valueOf(parameter);
   }


   @Override
   public String convertToString(Object parameter)
         throws ParameterValueConversionException
   {
      return String.valueOf(parameter);
   }
}
