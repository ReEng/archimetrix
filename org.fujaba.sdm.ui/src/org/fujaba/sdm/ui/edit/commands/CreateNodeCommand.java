/**
 * 
 */
package org.fujaba.sdm.ui.edit.commands;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.fujaba.commons.edit.commands.AbstractCreateNodeCommand;
import org.fujaba.commons.notation.HierarchicalNode;
import org.fujaba.commons.notation.Node;


/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 *
 */
public class CreateNodeCommand extends AbstractCreateNodeCommand
{

   public CreateNodeCommand(HierarchicalNode parent, boolean hierarchical, List<Node> children, EObject model)
   {
      super("create node view", parent, hierarchical, children);
      this.modelElement = model;
   }


   /**
    * @see org.fujaba.commons.edit.commands.AbstractViewCommand#redoModel()
    */
   @Override
   protected void redoModel()
   {
   }


   /**
    * @see org.fujaba.commons.edit.commands.AbstractViewCommand#undoModel()
    */
   @Override
   protected void undoModel()
   {
   }

}
