package org.fujaba.commons.edit.commands;


import org.fujaba.commons.notation.HierarchicalNode;
import org.fujaba.commons.notation.Node;


/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 */
public abstract class AbstractDeleteNodeCommand extends AbstractViewCommand
{

   /**
    * Default constructor.
    * 
    * @param label A label for the command.
    * @param node The (view) node to delete.
    * @param parent The parent of the (view) node.
    */
   public AbstractDeleteNodeCommand(String label, Node node,
         HierarchicalNode parent)
   {
      super(label, parent);
      viewElement = node;
   }


   @Override
   protected Node getView()
   {
      return (Node) super.getView();
   }


   @Override
   protected void redoView()
   {
      viewParent.getNodes().remove(getView());
      getView().setModel(null);
   }


   @Override
   protected void undoView()
   {
      getView().setModel(modelElement);
      viewParent.getNodes().add(getView());
   }
}
