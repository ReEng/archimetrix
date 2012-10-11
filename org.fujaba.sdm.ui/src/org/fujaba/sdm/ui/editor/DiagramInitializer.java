/**
 * 
 */
package org.fujaba.sdm.ui.editor;

import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.fujaba.commons.notation.Edge;
import org.fujaba.commons.notation.HierarchicalNode;
import org.fujaba.commons.notation.Node;
import org.fujaba.commons.notation.NotationFactory;
import org.storydriven.modeling.activities.Activity;
import org.storydriven.modeling.activities.ActivityCallNode;
import org.storydriven.modeling.activities.ActivityEdge;
import org.storydriven.modeling.activities.ActivityNode;
import org.storydriven.modeling.activities.StoryNode;
import org.storydriven.modeling.patterns.AbstractLinkVariable;
import org.storydriven.modeling.patterns.AbstractVariable;


/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 *
 */
public class DiagramInitializer
{
   private HierarchicalNode diagramNode;
   private Activity activity;
   
   private int perRow = 4;
   private int objectHeight = 30;
   private int objectWidth = 50;
   
   
   public DiagramInitializer(Activity activity)
   {
      super();
      this.diagramNode = NotationFactory.eINSTANCE.createHierarchicalNode();
      this.activity = activity;
   }
   
   public HierarchicalNode init()
   {
      this.diagramNode.setModel(activity);
      createNodes();
      createEdges();
      return this.diagramNode;
   }

   private void createEdges()
   {
      Iterator<ActivityEdge> i = this.activity.getOwnedActivityEdges().iterator();
      while (i.hasNext())
      {
         ActivityEdge activityEdge = i.next();
         Edge edge = NotationFactory.eINSTANCE.createEdge();
         edge.setModel(activityEdge);
         edge.setSource(findNode(this.diagramNode, activityEdge.getSource()));
         edge.setTarget(findNode(this.diagramNode, activityEdge.getTarget()));
         edge.setParent(this.diagramNode);
      }
      
   }
   
   private Node findNode(HierarchicalNode searchNode, EObject actNode)
   {
      for(Node node : searchNode.getNodes())
      {
         if(node.getModel() == actNode)
         {
            return node;
         }
      }
      return null;
   }

   private void createNodes()
   {
      Iterator<ActivityNode> i = this.activity.getOwnedActivityNodes().iterator();
      int perRow = 4;
      int currentRow = 0, currentColumn = 0;
      int currentRowWidth = 0, currentColumnHeight = 50;
      int maxRowHeight = 0;
      
      while (i.hasNext())
      {
         ActivityNode activityNode = i.next();
         Node nodeView = null;
         if(activityNode instanceof StoryNode)
         {
            HierarchicalNode node = NotationFactory.eINSTANCE.createHierarchicalNode();
            computeNodeSize(node, activityNode);
            nodeView = node;
            
            createStoryPattern(node, (StoryNode) activityNode);
         }
         else
         {
            nodeView = NotationFactory.eINSTANCE.createNode();
            
            computeNodeSize(nodeView, activityNode);
         }
         nodeView.setParent(this.diagramNode);
         
         nodeView.setX(currentRowWidth);
         currentRowWidth += (nodeView.getWidth() + 50);
         currentColumn++;

         nodeView.setY(currentColumnHeight);
         nodeView.setModel(activityNode);
         if(currentColumnHeight + nodeView.getHeight() > maxRowHeight)
         {
            maxRowHeight = currentColumnHeight + nodeView.getHeight();
         }
         
         if(currentColumn == perRow)
         {
            currentColumn = 0;
            currentRow++;
            currentRowWidth = 0;
            currentColumnHeight += 250;
            if(maxRowHeight + 50 > currentColumnHeight)
            {
               currentColumnHeight = maxRowHeight + 50;
            }
            maxRowHeight = 0;
         }
      }
   }
   
   private void computeNodeSize(Node node, ActivityNode act)
   {
      if(act instanceof StoryNode)
      {
         StoryNode sn = (StoryNode) act;
         int nodeCnt = sn.getStoryPattern().getVariables().size();
         int rows = nodeCnt / perRow;
         int height = objectHeight + 30;
         height = rows < 1 ? height*2 : height*2*(rows+1);
         int width = 4*objectWidth + 40;
         if(nodeCnt != 0)
         {
            width = nodeCnt < perRow ? width*nodeCnt : width*perRow;
         }
         
         node.setWidth(width);
         node.setHeight(height);
      }
      else if(act instanceof ActivityCallNode)
      {
         node.setHeight(60);
         node.setWidth(250);
      }
      else
      {
         node.setHeight(30);
         node.setWidth(30);
      }
   }

   private void createStoryPattern(HierarchicalNode node, StoryNode storyNode)
   {
      createSPObjects(node, storyNode);
      createSPLinks(node, storyNode);
      
   }
   
   private void createSPObjects(HierarchicalNode node, StoryNode storyNode)
   {
      int currentRow = 0, currentColumn = 0;
      for(AbstractVariable var : storyNode.getStoryPattern().getVariables())
      {
         HierarchicalNode newNode = NotationFactory.eINSTANCE.createHierarchicalNode();
         newNode.setWidth(objectWidth);
         newNode.setHeight(objectHeight);
         newNode.setX(currentColumn *(4*objectWidth + 40));
         newNode.setY(currentRow * (objectHeight + 40)+ 40);
         newNode.setParent(node);
         newNode.setModel(var);
         
         currentColumn++;
         
         if(currentColumn == 3)
         {
            currentColumn = 0;
            currentRow++;
         }
      }
   }
   
   private void createSPLinks(HierarchicalNode node, StoryNode storyNode)
   {
      for(AbstractLinkVariable var : storyNode.getStoryPattern().getLinkVariables())
      {
         Edge edge = NotationFactory.eINSTANCE.createEdge();
         Node source = findNode(node, var.getSource());
         Node target = findNode(node, var.getTarget());
         edge.setModel(var);
         edge.setSource(source);
         edge.setTarget(target);
         edge.setParent(node);
      }
   }
}
