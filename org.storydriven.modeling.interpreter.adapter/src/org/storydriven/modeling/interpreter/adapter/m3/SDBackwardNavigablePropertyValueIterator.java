/**
 * 
 */
package org.storydriven.modeling.interpreter.adapter.m3;


import java.util.ArrayList;
import java.util.Iterator;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.storydriven.modeling.interpreter.adapter.SDMainAdapterFactory;

import de.mdelab.sdm.interpreter.common.adapters.m3.IInstanceAdapter;


/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 * 
 */
public class SDBackwardNavigablePropertyValueIterator extends SDPropertyValueIterator<SDEReferenceAdapter>
{

   private IInstanceAdapter keyInstanceAdapter;
   private Iterator<EObject> iterator;


   public SDBackwardNavigablePropertyValueIterator(SDMainAdapterFactory mainAdapterFactory,
         IInstanceAdapter keyInstanceAdapter, SDEObjectInstanceAdapter instanceAdapter,
         SDEReferenceAdapter sourcePropertyAdapter)
   {
      super(mainAdapterFactory, instanceAdapter, sourcePropertyAdapter);
      this.keyInstanceAdapter = keyInstanceAdapter;
   }


   /**
    * @see de.mdelab.sdm.interpreter.common.adapters.m3.IPropertyValueIterator#getNext()
    */
   @Override
   public IInstanceAdapter getNext()
   {
      if(iterator == null)
      {
         EObject linkTargetObject = getInstanceAdapter().getEObject();
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
         
         EClass classifier = (EClass) getPropertyAdapter().getClassifierAdapter().getClassifier();
         SDEObjectInstanceAdapter targetInstance = getInstanceAdapter();
         SDPropertyAdapter sourcePropertyAdapter = getPropertyAdapter();
         SDPropertyAdapter targetPropertyAdapter = sourcePropertyAdapter.getOppositePropertyAdapters().get(0);
         ArrayList<EObject> referencingEObjects = new ArrayList<EObject>();
         while(treeIter.hasNext())
         {
            Object o = treeIter.next();
            
            if(classifier.isInstance(o))
            {
               IInstanceAdapter valueAdapter = getMainAdapterFactory().getM3AdapterFactory().getInstanceAdapter(o,
                     getMainAdapterFactory().getM3AdapterFactory().getClassifierAdapter(((EObject)o).eClass()));
               
               if(sourcePropertyAdapter.containsValue(this.keyInstanceAdapter, valueAdapter, targetInstance, targetPropertyAdapter))
               {
                  referencingEObjects.add((EObject) o);
               }
            }
         }
         
         iterator = referencingEObjects.iterator();
      }
      
      if(iterator.hasNext())
      {
         EObject object = iterator.next();
         return getMainAdapterFactory().getM3AdapterFactory().getInstanceAdapter(object,
               getMainAdapterFactory().getM3AdapterFactory().getClassifierAdapter(object.eClass()));
      }
      return null;
   }

}
