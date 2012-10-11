/**
 * 
 */
package org.fujaba.sdm.ui.edit.commands;

import org.eclipse.emf.ecore.EObject;
import org.fujaba.commons.edit.commands.AbstractCreateEdgeCommand;
import org.fujaba.commons.notation.Node;


/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 *
 */
public class CreateEdgeCommand extends AbstractCreateEdgeCommand
{

   public CreateEdgeCommand(Node source, EObject model)
   {
      super("create edge view", source);
      this.modelElement = model;
   }


   /**
    * @see org.fujaba.commons.edit.commands.AbstractViewCommand#redoModel()
    */
   @Override
   protected void redoModel()
   {
      // TODO Auto-generated method stub

   }


   /**
    * @see org.fujaba.commons.edit.commands.AbstractViewCommand#undoModel()
    */
   @Override
   protected void undoModel()
   {
      // TODO Auto-generated method stub

   }

}
