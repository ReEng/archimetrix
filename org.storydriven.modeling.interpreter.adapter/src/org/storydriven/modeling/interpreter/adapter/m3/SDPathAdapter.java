/**
 * 
 */
package org.storydriven.modeling.interpreter.adapter.m3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.swing.text.Segment;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.storydriven.modeling.expressions.pathExpressions.ExplicitPathDescription;
import org.storydriven.modeling.expressions.pathExpressions.ImplicitPathDescription;
import org.storydriven.modeling.expressions.pathExpressions.ImplicitPathKind;
import org.storydriven.modeling.expressions.pathExpressions.PathExpression;
import org.storydriven.modeling.expressions.pathExpressions.PathSegment;
import org.storydriven.modeling.expressions.pathExpressions.PathSegmentDescription;
import org.storydriven.modeling.expressions.pathExpressions.RepeatOperator;
import org.storydriven.modeling.expressions.pathExpressions.RestrictionList;
import org.storydriven.modeling.expressions.pathExpressions.TypeRestriction;
import org.storydriven.modeling.expressions.pathbridge.PathExpressionBridge;
import org.storydriven.modeling.interpreter.adapter.SDMainAdapterFactory;
import org.storydriven.modeling.patterns.Path;

import de.mdelab.sdm.interpreter.common.adapters.m3.IClassifierAdapter;
import de.mdelab.sdm.interpreter.common.adapters.m3.IInstanceAdapter;
import de.mdelab.sdm.interpreter.common.adapters.m3.IPropertyAdapter;

/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 *
 */
public class SDPathAdapter extends SDPropertyAdapter
{
   private final static int ALLOWED = 1, NOT_MENTIONED = 0, RESTRICTED = -1;
   private IClassifierAdapter classifierAdapter;
   private Path path;

   public SDPathAdapter(SDMainAdapterFactory mainAdapterFactory,  Path path)
   {
      super(mainAdapterFactory);
      
      assert path != null;
      this.path = path;
   }

   
   /**
    * @see de.mdelab.sdm.interpreter.common.adapters.m3.IPropertyAdapter#getClassifierAdapter()
    */
   @Override
   public IClassifierAdapter getClassifierAdapter()
   {
      
      return classifierAdapter;
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
    * @see de.mdelab.sdm.interpreter.common.adapters.m3.IPropertyAdapter#getName()
    */
   @Override
   public String getName()
   {
      return "[path]";
   }


   /**
    * @see org.storydriven.modeling.interpreter.adapter.m3.SDPropertyAdapter#createPropertyTargetIterator(de.mdelab.sdm.interpreter.common.adapters.m3.IInstanceAdapter, org.storydriven.modeling.interpreter.adapter.m3.SDEObjectInstanceAdapter, org.storydriven.modeling.interpreter.adapter.m3.SDPropertyAdapter, java.util.Map)
    */
   @Override
   public SDPropertyValueIterator<? extends SDPropertyAdapter> createPropertyTargetIterator(
         IInstanceAdapter keyInstanceAdapter, SDEObjectInstanceAdapter instanceAdapter,
         SDPropertyAdapter targetProperty, Map<IPropertyAdapter, IInstanceAdapter> otherBoundProperties)
   {
      List<IInstanceAdapter> results = applyPathMatching(instanceAdapter, targetProperty);
      return new SDAnyListValueIterator(getMainAdapterFactory(), instanceAdapter, this, results);
   }


   /**
    * @see org.storydriven.modeling.interpreter.adapter.m3.SDPropertyAdapter#getPropertySetValue(de.mdelab.sdm.interpreter.common.adapters.m3.IInstanceAdapter, org.storydriven.modeling.interpreter.adapter.m3.SDEObjectInstanceAdapter, org.storydriven.modeling.interpreter.adapter.m3.SDPropertyAdapter)
    */
   @Override
   public IInstanceAdapter getPropertySetValue(IInstanceAdapter keyInstanceAdapter,
         SDEObjectInstanceAdapter instanceAdapter, SDPropertyAdapter targetProperty)
   {
      List<IInstanceAdapter> results = applyPathMatching(instanceAdapter, targetProperty);
      return getMainAdapterFactory().getM3AdapterFactory().getInstanceAdapter(results,
            getMainAdapterFactory().getM3AdapterFactory().getClassifierAdapter(getClassifierAdapter()));
   }


   /**
    * @see org.storydriven.modeling.interpreter.adapter.m3.SDPropertyAdapter#setValue(de.mdelab.sdm.interpreter.common.adapters.m3.IInstanceAdapter, org.storydriven.modeling.interpreter.adapter.m3.SDEObjectInstanceAdapter, org.storydriven.modeling.interpreter.adapter.m3.SDInstanceAdapter)
    */
   @Override
   public void setValue(IInstanceAdapter keyInstanceAdapter, SDEObjectInstanceAdapter instanceAdapter,
         SDInstanceAdapter valueAdapter)
   {
      throw new UnsupportedOperationException("Can not create a path to an object");
   }


   /**
    * @see org.storydriven.modeling.interpreter.adapter.m3.SDPropertyAdapter#containsValue(de.mdelab.sdm.interpreter.common.adapters.m3.IInstanceAdapter, de.mdelab.sdm.interpreter.common.adapters.m3.IInstanceAdapter, org.storydriven.modeling.interpreter.adapter.m3.SDInstanceAdapter, org.storydriven.modeling.interpreter.adapter.m3.SDPropertyAdapter)
    */
   @Override
   public boolean containsValue(IInstanceAdapter keyInstanceAdapter, IInstanceAdapter instanceAdapter,
         SDInstanceAdapter valueAdapter, SDPropertyAdapter targetPropertyAdapter)
   {
      List<IInstanceAdapter> results = applyPathMatching(instanceAdapter, targetPropertyAdapter);
      return results.contains(valueAdapter);
   }
   

   
   
   //-----------------------------------------------------------------------------------------------------------------------
   /**
    * Performing the search for all paths, which can be reached via the given path expression.
    * 
    * @param startNodeAdapter
    * @param targetPropertyAdapter
    * @return A list of reached nodes.
    */
   private List<IInstanceAdapter> applyPathMatching(IInstanceAdapter startNodeAdapter, SDPropertyAdapter targetPropertyAdapter)
   {
      ArrayList<IInstanceAdapter> results = new ArrayList<IInstanceAdapter>();
      PathExpressionBridge bridge = (PathExpressionBridge) path.getPathExpression();
      PathExpression expr = bridge.getPathExpression();
      for(org.storydriven.modeling.expressions.pathExpressions.Path pa : expr.getPathAlternatives())
      {
         List<IInstanceAdapter> tmp = applySearchForPathAlternative(startNodeAdapter, pa);
         results.addAll(tmp);
      }
      
      return results;
   }


   private List<IInstanceAdapter> applySearchForPathAlternative(IInstanceAdapter startNodeAdapter, 
         org.storydriven.modeling.expressions.pathExpressions.Path somePath)
   {
      ArrayList<IInstanceAdapter> results = new ArrayList<IInstanceAdapter>();
      ArrayList<IInstanceAdapter> visited = new ArrayList<IInstanceAdapter>();
      LinkedList<IInstanceAdapter> queue = new LinkedList<IInstanceAdapter>();
      
      queue.offer(startNodeAdapter);
      List<IInstanceAdapter> reached = new ArrayList<IInstanceAdapter>();
      for(PathSegment segment : somePath.getSegments())
      {
         //do this for every link segment and fill the queue with reached node from last iteration
         reached = checkNextSegment(visited, queue, segment);
         
         //add all reached nodes to queue
         for(IInstanceAdapter node : reached)
         {
            queue.offer(node);
         }
      }
      results.addAll(reached);
      return results;
   }


   /**
    * For each segment of the path expression we do a BFS search for nodes that can be reached via this segment type. 
    * This method handles one such segment. 
    * 
    * @param visited A list of nodes, which were already reached during the whole BFS (several BFS runs). 
    * @param queue A filled up queue with nodes from last iteration
    * @param pathSegment The type of links to consider.
    * @return A list of reached nodes.
    */
   private List<IInstanceAdapter> checkNextSegment(ArrayList<IInstanceAdapter> visited, LinkedList<IInstanceAdapter> queue,
         PathSegment pathSegment)
   {
      ArrayList<IInstanceAdapter> intermediateResult = new ArrayList<IInstanceAdapter>();
      RepeatOperator operator = pathSegment.getRepeatOperator(); 

      // *-operator means the nodes themselves are part are reached nodes themselves
      if(operator == RepeatOperator.ARBITRARY)
      { 
         intermediateResult.addAll(queue);
      }
      
      // +-operator
      while(!queue.isEmpty())
      {
         IInstanceAdapter node = queue.pop();
         
         //check neighbors via specified link type
         List<IInstanceAdapter> neighbors = getNodeNeighbors(node, pathSegment);
         for(IInstanceAdapter neighbor : neighbors)
         {
            if(!visited.contains(neighbor))
            {
               //NO_REPEAT: don't search for nodes reachable from the reached nodes
               if(operator != RepeatOperator.NO_REPEAT)
               {
                  queue.offer(neighbor);
               }
               visited.add(neighbor);
               intermediateResult.add(neighbor);
            }
         }
      }
      return intermediateResult;
   }


   /**
    * Reaches out for nodes, which can be reached via the given link segment type.
    * 
    * @param node
    * @param pathSegment
    * @return Returns the reachable nodes in a List
    */
   private List<IInstanceAdapter> getNodeNeighbors(IInstanceAdapter node, PathSegment pathSegment)
   {
      Object c = node.getClassifierAdapter().getClassifier();
      if(!(c instanceof EClass))
      {
         return Collections.emptyList();
      }
      
      EClass classifier = (EClass) c;
      List<IInstanceAdapter> neighbors = new ArrayList<IInstanceAdapter>();
      List<IInstanceAdapter> tmp = null;
      for(PathSegmentDescription desc : pathSegment.getAlternatives())
      {
         if(desc instanceof ExplicitPathDescription)
         {
            ExplicitPathDescription exDesc = (ExplicitPathDescription) desc;
            String name = exDesc.getAssociationName();
            for(EReference ref : classifier.getEAllReferences())
            {
               if(name.equals(ref.getName()))
               {
                  tmp = getFilteredNeighbors(node, ref, exDesc);
                  neighbors.addAll(tmp);
               }
            }
         }
         else if(desc instanceof ImplicitPathDescription)
         {
            ImplicitPathDescription imDesc = (ImplicitPathDescription) desc;
            ImplicitPathKind kind = imDesc.getKind();
            
            for(EReference ref : classifier.getEAllReferences())
            {
               if((kind == ImplicitPathKind.CONTAINMENT_SOURCE && ref.isContainment())       //<>-->
                     || (kind == ImplicitPathKind.CONTAINMENT_TARGET && ref.isContainer())   //<--<>
                     || kind == ImplicitPathKind.ANY)                                        //-->
               {
                  tmp = getFilteredNeighbors(node, ref, imDesc);
                  neighbors.addAll(tmp);
               }
            }
         }
      }
      
      return neighbors;
   }


   private List<IInstanceAdapter> getFilteredNeighbors(IInstanceAdapter node, EReference ref, PathSegmentDescription desc)
   {
      ArrayList<IInstanceAdapter> neighbors = new ArrayList<IInstanceAdapter>();
      //determine property adapter
      SDPropertyAdapter refAdapter = (SDPropertyAdapter) getMainAdapterFactory().getSDM3AdapterFactory()
            .getEStructuralFeaturePropertyAdapter(ref);
      SDPropertyValueIterator<? extends SDPropertyAdapter> iterator = refAdapter.createPropertyTargetIterator(null,
            (SDEObjectInstanceAdapter) node, refAdapter, null);

      //fetch all instances
      IInstanceAdapter instanceAdapter = null;
      while ((instanceAdapter = iterator.getNext()) != null)
      {
         int chkResult = checkTypeRestrictions(desc, instanceAdapter);
         if(chkResult != RESTRICTED)
         {
            neighbors.add(instanceAdapter);
         }
      }
      
      return neighbors;
   }

   
   private int checkTypeRestrictions(PathSegmentDescription desc, IInstanceAdapter instance)
   {
      if(desc.getRestrictionList() == null)
      {
         return ALLOWED;
      }
      
      Object c = instance.getClassifierAdapter().getClassifier();
       if(c instanceof EClass)
       {
          EClass cl = (EClass) c;
          RestrictionList rest = desc.getRestrictionList();
          for(TypeRestriction typeRest : rest.getRestrictions())
          {
             if(cl.getName().equals(typeRest.getTypeName()))
             {
                if(typeRest.isForbidden())
                {
                   return RESTRICTED;
                }
                else
                {
                   return ALLOWED;
                }
             }
          }
       }
      
      return NOT_MENTIONED;
   }
}
