/**
 * 
 */
package org.storydriven.modeling.interpreter.adapter.m3;

import java.util.ArrayList;
import java.util.Map;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.storydriven.modeling.interpreter.adapter.SDMainAdapterFactory;

import de.mdelab.sdm.interpreter.common.adapters.m3.IClassifierAdapter;
import de.mdelab.sdm.interpreter.common.adapters.m3.IInstanceAdapter;
import de.mdelab.sdm.interpreter.common.adapters.m3.IPropertyAdapter;

/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 *
 */
public class SDBackwardNavigablePropertyAdapter extends SDAssociationEndAdapter
{
   private IClassifierAdapter classifierAdapter;
   private final static String NAME = "[backward-link-navigation]";
   
   public SDBackwardNavigablePropertyAdapter(SDMainAdapterFactory mainAdapterFactory, IClassifierAdapter classifierAdapter)
   {
      super(mainAdapterFactory);
      this.classifierAdapter = classifierAdapter;
   }


   /**
    * @see de.mdelab.sdm.interpreter.common.adapters.m3.IPropertyAdapter#isNavigable()
    */
   @Override
   public boolean isNavigable()
   {
      return true;
   }


   /**
    * @see de.mdelab.sdm.interpreter.common.adapters.m3.IPropertyAdapter#getClassifierAdapter()
    */
   @Override
   public IClassifierAdapter getClassifierAdapter()
   {
      return this.classifierAdapter;
   }


   /**
    * @see de.mdelab.sdm.interpreter.common.adapters.m3.IPropertyAdapter#getName()
    */
   @Override
   public String getName()
   {
      return NAME;
   }


   /**
    * @see org.storydriven.modeling.interpreter.adapter.m3.SDPropertyAdapter#createPropertyTargetIterator(de.mdelab.sdm.interpreter.common.adapters.m3.IInstanceAdapter, org.storydriven.modeling.interpreter.adapter.m3.SDEObjectInstanceAdapter, org.storydriven.modeling.interpreter.adapter.m3.SDPropertyAdapter, java.util.Map)
    */
   @Override
   public SDPropertyValueIterator<? extends SDPropertyAdapter> createPropertyTargetIterator(
         IInstanceAdapter keyInstanceAdapter, SDEObjectInstanceAdapter instanceAdapter,
         SDPropertyAdapter targetProperty, Map<IPropertyAdapter, IInstanceAdapter> otherBoundProperties)
   {
      assert targetProperty instanceof SDEReferenceAdapter;
      return new SDBackwardNavigablePropertyValueIterator(this.getMainAdapterFactory(), keyInstanceAdapter, instanceAdapter, (SDEReferenceAdapter) targetProperty);
   }


   /**
    * @see org.storydriven.modeling.interpreter.adapter.m3.SDPropertyAdapter#getPropertySetValue(de.mdelab.sdm.interpreter.common.adapters.m3.IInstanceAdapter, org.storydriven.modeling.interpreter.adapter.m3.SDEObjectInstanceAdapter, org.storydriven.modeling.interpreter.adapter.m3.SDPropertyAdapter)
    */
   @Override
   public IInstanceAdapter getPropertySetValue(IInstanceAdapter keyInstanceAdapter,
         SDEObjectInstanceAdapter instanceAdapter, SDPropertyAdapter targetProperty)
   {
      //collect all object which reference the instance via opposite reference
      //after collecting those objects, return the set object
      
      EObject linkTargetObject = instanceAdapter.getEObject();
      Resource r = linkTargetObject.eResource();
      ResourceSet rs = r.getResourceSet();
      TreeIterator treeIter = null;
      if(rs != null)
      {
         treeIter = rs.getAllContents();
      }
      else
      {
         treeIter = r.getAllContents();
      }
      
      EClass classifier = (EClass) targetProperty.getClassifierAdapter().getClassifier();
      
      SDPropertyAdapter sourcePropertyAdapter = targetProperty.getOppositePropertyAdapters().get(0);
      ArrayList<EObject> referencingEObjects = new ArrayList<EObject>();
      while(treeIter.hasNext())
      {
         Object o = treeIter.next();
         
         if(classifier.isInstance(o))
         {
            IInstanceAdapter valueAdapter = getMainAdapterFactory().getM3AdapterFactory().getInstanceAdapter(o,
                  getMainAdapterFactory().getM3AdapterFactory().getClassifierAdapter(((EObject)o).eClass()));
            
            if(targetProperty.containsValue(keyInstanceAdapter, valueAdapter, instanceAdapter, sourcePropertyAdapter))
            {
               referencingEObjects.add((EObject) o);
            }
         }
      }
      
      if(!referencingEObjects.isEmpty())
      {
         return getMainAdapterFactory().getM3AdapterFactory().getInstanceAdapter(referencingEObjects,
               getMainAdapterFactory().getM3AdapterFactory().getClassifierAdapter(classifier));
      }
      
      return null;
   }


   /**
    * @see org.storydriven.modeling.interpreter.adapter.m3.SDPropertyAdapter#containsValue(de.mdelab.sdm.interpreter.common.adapters.m3.IInstanceAdapter, de.mdelab.sdm.interpreter.common.adapters.m3.IInstanceAdapter, org.storydriven.modeling.interpreter.adapter.m3.SDInstanceAdapter, org.storydriven.modeling.interpreter.adapter.m3.SDPropertyAdapter)
    */
   @Override
   public boolean containsValue(IInstanceAdapter keyInstanceAdapter, IInstanceAdapter instanceAdapter,
         SDInstanceAdapter valueAdapter, SDPropertyAdapter targetPropertyAdapter)
   {
      SDPropertyAdapter adapter = this.getOppositePropertyAdapters().get(0);
      return adapter.containsValue(keyInstanceAdapter, valueAdapter, (SDInstanceAdapter) instanceAdapter, this);
   }

   /**
    * @see org.storydriven.modeling.interpreter.adapter.m3.SDPropertyAdapter#setValue(de.mdelab.sdm.interpreter.common.adapters.m3.IInstanceAdapter, org.storydriven.modeling.interpreter.adapter.m3.SDEObjectInstanceAdapter, org.storydriven.modeling.interpreter.adapter.m3.SDInstanceAdapter)
    */
   @Override
   public void setValue(IInstanceAdapter keyInstanceAdapter, SDEObjectInstanceAdapter instanceAdapter,
         SDInstanceAdapter valueAdapter)
   {
      throw new UnsupportedOperationException();
   }

   
   /**
    * @see org.storydriven.modeling.interpreter.adapter.m3.SDAssociationEndAdapter#createAssociation(de.mdelab.sdm.interpreter.common.adapters.m3.IInstanceAdapter, org.storydriven.modeling.interpreter.adapter.m3.SDEObjectInstanceAdapter, java.util.Map)
    */
   @Override
   public void createAssociation(IInstanceAdapter keyInstanceAdapter, SDEObjectInstanceAdapter instanceAdapter,
         Map<IPropertyAdapter, IInstanceAdapter> otherAssociationEnds)
   {
      throw new UnsupportedOperationException();
   }


   /**
    * @see org.storydriven.modeling.interpreter.adapter.m3.SDAssociationEndAdapter#destroyAssociation(de.mdelab.sdm.interpreter.common.adapters.m3.IInstanceAdapter, org.storydriven.modeling.interpreter.adapter.m3.SDEObjectInstanceAdapter, java.util.Map)
    */
   @Override
   public void destroyAssociation(IInstanceAdapter keyInstanceAdapter, SDEObjectInstanceAdapter instanceAdapter,
         Map<IPropertyAdapter, IInstanceAdapter> otherAssociationEnds)
   {
      throw new UnsupportedOperationException();
   }

}
