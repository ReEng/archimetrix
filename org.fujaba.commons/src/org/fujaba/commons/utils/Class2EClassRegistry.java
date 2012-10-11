/**
 * 
 */
package org.fujaba.commons.utils;

import java.util.HashMap;

import org.eclipse.emf.ecore.EClass;

/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 *
 */
public abstract class Class2EClassRegistry
{
   private static HashMap<Class<?>, EClass> map = new HashMap<Class<?>, EClass>();
   
   public static void registerClass(Class<?> jClass, EClass eClass)
   {
      if(map.containsKey(jClass))
      {
         return;
      }
      else
      {
         map.put(jClass, eClass);
      }
   }
   
   public static EClass getEClass(Class<?> jClass)
   {
      if(map.containsKey(jClass))
      {
         return map.get(jClass);
      }
      return null;
   }
   
   
   public static boolean isRegistered(Class<?> jClass)
   {
      return map.containsKey(jClass) && map.get(jClass) != null;
   }
}
