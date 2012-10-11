/**
 * 
 */
package org.fujaba.sdm.ui.edit.parts;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.fujaba.commons.notation.DiagramElement;
import org.storydriven.modeling.activities.Activity;
import org.storydriven.modeling.activities.ActivityCallNode;
import org.storydriven.modeling.activities.ActivityEdge;
import org.storydriven.modeling.activities.JunctionNode;
import org.storydriven.modeling.activities.StartNode;
import org.storydriven.modeling.activities.StopNode;
import org.storydriven.modeling.activities.StoryNode;
import org.storydriven.modeling.patterns.AbstractLinkVariable;
import org.storydriven.modeling.patterns.ObjectVariable;
import org.storydriven.modeling.patterns.PrimitiveVariable;


/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 *
 */
public class SDMEditPartFactory implements EditPartFactory
{

   /**
    * @see org.eclipse.gef.EditPartFactory#createEditPart(org.eclipse.gef.EditPart, java.lang.Object)
    */
   @Override
   public EditPart createEditPart(EditPart context, Object model)
   {

      EObject realModel = null;
      DiagramElement view = null;
      EditPart part = null;

      if (model instanceof DiagramElement)
      {
         view = (DiagramElement) model;
         realModel = view.getModel();
      }
      else
      {
         return null;
      }

      if (realModel instanceof Activity)
      {
         part = new ActivityEditPart();
      }
      else if (realModel instanceof StartNode)
      {
         part = new StartNodeEditPart();
      }
      else if (realModel instanceof StopNode)
      {
         part = new StopNodeEditPart();
      }
      else if (realModel instanceof StoryNode)
      {
         part = new StoryNodeEditPart();
      }
      else if (realModel instanceof ActivityCallNode)
      {
         part = new ActivityCallNodeEditPart();
      }
      else if (realModel instanceof JunctionNode)
      {
         part = new JunctionNodeEditPart();
      }
      else if (realModel instanceof ActivityEdge)
      {
         part = new ActivityEdgeEditPart();
      }
      else if (realModel instanceof ObjectVariable)
      {
         part = new ObjectVariableEditPart();
      }
      else if (realModel instanceof AbstractLinkVariable)
      {
         part = new LinkVariableEditPart();
      }
      else if (realModel instanceof PrimitiveVariable)
      {
         part = new PrimitiveVariableEditPart();
      }
      
      

      if (view != null && part != null)
      {
         part.setModel(view);
      }
      return part;
   }

}
