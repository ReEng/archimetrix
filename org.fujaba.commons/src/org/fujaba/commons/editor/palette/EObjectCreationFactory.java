/**
 * 
 */
package org.fujaba.commons.editor.palette;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gef.requests.CreationFactory;
import org.fujaba.commons.FujabaCommonsPlugin;
import org.fujaba.commons.utils.Class2EClassRegistry;


/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 *
 */
public class EObjectCreationFactory implements CreationFactory
{
   private EClass type;
   private EObject newObject;


   public EObjectCreationFactory(Class<?> jClass)
   {
      if (jClass == null)
      {
         throw new IllegalArgumentException(
               "The template argument of a creation factory must not be null and it"
                     + " must be assignable from EObject.");
      }

      EClass eClass = Class2EClassRegistry.getEClass(jClass);
      
      if (eClass == null)
      {
         FujabaCommonsPlugin.getDefault().logError("Could not find the corresponding EClass to " + jClass
               +". Please, register one at Class2EClassRegistry in order make your palette work properly.");
      }
      this.type = eClass;
   }


   /**
    * @see org.eclipse.gef.requests.CreationFactory#getNewObject()
    */
   public Object getNewObject()
   {
      if(type != null)
      {
         if(this.newObject == null)
         {
            this.newObject = EcoreUtil.create(type);
         }
         return this.newObject;
      }
      return null;
   }

   /**
    * @see org.eclipse.gef.requests.CreationFactory#getObjectType()
    */
   public Object getObjectType()
   {
      return type.getInstanceClass();
   }
}
