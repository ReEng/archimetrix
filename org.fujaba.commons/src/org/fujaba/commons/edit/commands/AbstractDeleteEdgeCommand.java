package org.fujaba.commons.edit.commands;


import org.fujaba.commons.notation.Edge;
import org.fujaba.commons.notation.Node;


/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 */
public abstract class AbstractDeleteEdgeCommand extends AbstractViewCommand
{

   private Node viewSource;

   private Node viewTarget;


   /**
    * Default constructor.
    * 
    * @param label A label for the command.
    * @param viewParent The (view) edge to delete.
    */
   public AbstractDeleteEdgeCommand(String label, Edge edge)
   {
      super(label, edge.getParent());

      viewElement = edge;
      viewSource = edge.getSource();
      viewTarget = edge.getTarget();
   }


   @Override
   protected void redoView()
   {
      getView().setTarget(null);
      getView().setSource(null);
      viewParent.getEdges().remove(getView());
   }


   @Override
   protected void undoView()
   {
      viewParent.getEdges().add(getView());
      getView().setSource(viewSource);
      getView().setTarget(viewTarget);
   }


   @Override
   protected Edge getView()
   {
      return (Edge) super.getView();
   }
}
