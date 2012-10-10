/**
 * 
 */
package org.storydriven.modeling.interpreter.adapter.m3;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.storydriven.modeling.interpreter.adapter.SDMainAdapterFactory;

import de.mdelab.sdm.interpreter.common.adapters.m3.IInstanceAdapter;

/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 *
 */
public class SDAnyListValueIterator extends SDPropertyValueIterator<SDPathAdapter>
{
   private Iterator<IInstanceAdapter> iter;

   @SuppressWarnings("unchecked")
   public SDAnyListValueIterator(SDMainAdapterFactory mainAdapterFactory, SDEObjectInstanceAdapter instanceAdapter,
         SDPathAdapter propertyAdapter, List<IInstanceAdapter> listToIterateOver)
   {
      super(mainAdapterFactory, instanceAdapter, propertyAdapter);
      
      if(listToIterateOver != null)
      {
         iter = listToIterateOver.iterator();
      }
      else
      {
         iter = Collections.EMPTY_LIST.iterator();
      }
   }

   @Override
   public IInstanceAdapter getNext()
   {
      if(iter.hasNext())
      {
         
         return iter.next();
      }
      
      return null;
   }

}
