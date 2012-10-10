/**
 * 
 */
package org.storydriven.modeling.interpreter.adapter.m3;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.storydriven.modeling.interpreter.adapter.SDMainAdapterFactory;

import de.mdelab.sdm.interpreter.common.adapters.m3.IClassifierAdapter;
import de.mdelab.sdm.interpreter.common.adapters.m3.IInstanceAdapter;
import de.mdelab.sdm.interpreter.common.adapters.m3.IPropertyAdapter;
import de.mdelab.sdm.interpreter.common.adapters.m3.IPropertyValueIterator;

/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 *
 */
public class SDObjectSetInstanceAdapter implements SDInstanceAdapter
{
   private SDMainAdapterFactory  mainAdapterFactory;
   
   private Collection<EObject> elements;

   public SDObjectSetInstanceAdapter(SDMainAdapterFactory mainAdapterFactory)
   {
      this.mainAdapterFactory = mainAdapterFactory;
   }
   

   protected void setValue(Collection<EObject> elements)
   {
      this.elements = elements;
   }
   
   @Override
   public Collection<EObject> getValue()
   {
      return elements;
   }

   @Override
   public IClassifierAdapter getClassifierAdapter()
   {
      throw new UnsupportedOperationException();
   }

   @Override
   public void delete()
   {
      throw new UnsupportedOperationException();
   }

   @Override
   public void setPropertyValue(IPropertyAdapter propertyAdapter,IInstanceAdapter keyInstanceAdapter, IInstanceAdapter valueAdapter)
   {
      throw new UnsupportedOperationException();
   }

   @Override
   public boolean propertyContainsInstance(IPropertyAdapter ownedPropertyAdapter, IInstanceAdapter keyInstanceAdapter, IInstanceAdapter instanceAdapter,
         IPropertyAdapter targetPropertyAdapter)
   {
      assert ownedPropertyAdapter instanceof SDPropertyAdapter;
      assert instanceAdapter instanceof SDInstanceAdapter;
      assert targetPropertyAdapter instanceof SDPropertyAdapter;

      return ((SDPropertyAdapter) ownedPropertyAdapter).containsValue(keyInstanceAdapter, this, (SDInstanceAdapter) instanceAdapter,
            (SDPropertyAdapter) targetPropertyAdapter);
   }

   @Override
   public int getPropertyCardinality(IPropertyAdapter ownedPropertyAdapter, IPropertyAdapter targetPropertyAdapter)
   {
      return 1000;
   }

   @Override
   public IPropertyValueIterator getPropertyTargetIterator(IPropertyAdapter ownedPropertyAdapter, IInstanceAdapter keyInstanceAdapter,
         IPropertyAdapter targetPropertyAdapter, Map<IPropertyAdapter, IInstanceAdapter> otherBoundProperties)
   {
      return new SDSetPropertTargetValueIterator(getMainAdapterFactory(),keyInstanceAdapter,  this, ownedPropertyAdapter, targetPropertyAdapter);
   }

   @Override
   public void createAssociation(IPropertyAdapter ownedPropertyAdapter,IInstanceAdapter keyInstanceAdapter,
         Map<IPropertyAdapter, IInstanceAdapter> otherAssociationEnds)
   {
      throw new UnsupportedOperationException();
   }

   @Override
   public void destroyAssociation(IPropertyAdapter ownedPropertyAdapter,IInstanceAdapter keyInstanceAdapter,
         Map<IPropertyAdapter, IInstanceAdapter> otherAssociationEnds)
   {
      throw new UnsupportedOperationException();
   }


   protected SDMainAdapterFactory getMainAdapterFactory()
   {
      return mainAdapterFactory;
   }


   @Override
   public IInstanceAdapter getPropertySetValue(IPropertyAdapter ownedPropertyAdapter, IInstanceAdapter keyInstanceAdapter,
         IInstanceAdapter instanceAdapter, IPropertyAdapter targetPropertyAdapter)
   {
      throw new UnsupportedOperationException();
   }

}
