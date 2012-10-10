/**
 * 
 */
package org.storydriven.modeling.interpreter.adapter.m3;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.storydriven.modeling.interpreter.adapter.SDMainAdapterFactory;

import de.mdelab.sdm.interpreter.common.adapters.m3.IInstanceAdapter;
import de.mdelab.sdm.interpreter.common.adapters.m3.IPropertyAdapter;
import de.mdelab.sdm.interpreter.common.adapters.m3.IPropertyValueIterator;

/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 *
 */
public class SDSetPropertTargetValueIterator implements IPropertyValueIterator
{

   SDMainAdapterFactory mainAdapterFactory;
   SDObjectSetInstanceAdapter instanceAdapter;
   IPropertyAdapter ownedPropertyAdapter, targetPropertyAdapter;
   IInstanceAdapter keyInstanceAdapter;
   
   Iterator<EObject> iterator;
   IPropertyValueIterator currentIter;
   

   public SDSetPropertTargetValueIterator(SDMainAdapterFactory mainAdapterFactory,IInstanceAdapter keyInstanceAdapter,
         SDObjectSetInstanceAdapter instanceAdapter, IPropertyAdapter ownedPropertyAdapter,
         IPropertyAdapter targetPropertyAdapter)
   {
      this.mainAdapterFactory = mainAdapterFactory;
      this.instanceAdapter = instanceAdapter;
      this.keyInstanceAdapter = keyInstanceAdapter;
      this.ownedPropertyAdapter = ownedPropertyAdapter;
      this.targetPropertyAdapter = targetPropertyAdapter;
      iterator = instanceAdapter.getValue().iterator();
   }

   @Override
   public IInstanceAdapter getNext()
   {
      IInstanceAdapter adapter = null;
      //intialize
      if(currentIter == null && iterator.hasNext())
      {
         currentIter = createSingleIterator(iterator.next());
      }
      else if (currentIter == null && !iterator.hasNext())
      {
         return null;
      }
      
      //iterate over one separate iterator
      if((adapter = currentIter.getNext()) != null)
      {
         return adapter;
      }
      
      
      //need next iterator
      while(iterator.hasNext())
      {
         currentIter = createSingleIterator(iterator.next());
         if((adapter = currentIter.getNext()) != null)
         {
            return adapter;
         }
      }

      //all iterators are done
      return null;
   }
   
   private IPropertyValueIterator createSingleIterator(EObject value)
   {
      Map<IPropertyAdapter, IInstanceAdapter> allBoundLinkEnds = Collections.emptyMap();
      IInstanceAdapter adapter = mainAdapterFactory.getSDM3AdapterFactory().getInstanceAdapter(value, mainAdapterFactory.getSDM3AdapterFactory().getClassifierAdapter(value.eClass()));
      
      return adapter.getPropertyTargetIterator(ownedPropertyAdapter, keyInstanceAdapter, targetPropertyAdapter, allBoundLinkEnds);
   }

}
