/**
 * 
 */
package org.reclipse.structure.inference.extended.ui;

import java.util.ArrayList;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;

import de.uka.ipd.sdq.pcm.repository.RepositoryComponent;

//import eu.qimpress.samm.staticstructure.ComponentType;

/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 *
 */
public class FilteringAdapterFactoryContentProvider extends AdapterFactoryContentProvider
{

   private final static String DUMMY = "SoMoX System-Level Dummy Component";
   public FilteringAdapterFactoryContentProvider(AdapterFactory adapterFactory)
   {
      super(adapterFactory);
   }

   @Override
   public Object[] getElements(Object object)
   {
      Object[] result = super.getElements(object);
      ArrayList<Object> list = new ArrayList<Object>();
      if(result != null)
      {
         for(Object o : result)
         {
            if(o instanceof RepositoryComponent)
            {
               if(!DUMMY.equals(((RepositoryComponent) o).getEntityName()))
               {
                  list.add(o);
               }
            }
         }
      }
      return list.toArray();
   }

   @Override
   public Object[] getChildren(Object object)
   {
//      return super.getChildren(object);
      return null;
   }

   @Override
   public boolean hasChildren(Object object)
   {
//      return super.hasChildren(object);
      return false;
   }

}
