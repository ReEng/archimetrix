package org.fujaba.commons.edit.commands;


import org.fujaba.commons.notation.Edge;
import org.fujaba.commons.notation.Node;
import org.fujaba.commons.notation.NotationFactory;


/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 */
public abstract class AbstractCreateEdgeCommand extends AbstractViewCommand
{
   private Node viewSource;

   private Node viewTarget;


   public AbstractCreateEdgeCommand(String label, Node source)
   {
      super(label, source.getParent());
      viewSource = source;
   }


   public Node getSource()
   {
      return viewSource;
   }


   public Node getTarget()
   {
      return viewTarget;
   }


   public void setSource(Node source)
   {
      this.viewSource = source;
   }


   public void setTarget(Node target)
   {
      this.viewTarget = target;
   }


   @Override
   protected Edge getView()
   {
      return (Edge) viewElement;
   }


   @Override
   protected void redoView()
   {
      if (modelElement == null | viewSource == null | viewTarget == null
            | viewParent == null)
      {
         return;
      }

      // create element
      if (viewElement == null)
      {
         // one time stuff

         viewElement = NotationFactory.eINSTANCE.createEdge();

         getView().setModel(modelElement);
         getView().setPersistent(true);
         getView().setVisible(true);
      }

      // stuff to perform with every redo, this must be also undone in undoView
      viewParent.getEdges().add(getView());
      viewSource.getOutgoing().add(getView());
      viewTarget.getIncoming().add(getView());
   }


   @Override
   protected void undoView()
   {
      viewParent.getEdges().remove(getView());
      viewSource.getOutgoing().remove(getView());
      viewTarget.getIncoming().remove(getView());
   }
}
