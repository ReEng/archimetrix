package org.fujaba.commons.edit.commands;


import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.commands.Command;
import org.fujaba.commons.edit.parts.AbstractNodeViewEditPart;



/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 */
public class SetConstraintCommand extends Command
{

   private AbstractNodeViewEditPart editpart;

   private Rectangle newBounds;

   private Rectangle oldBounds;


   public SetConstraintCommand(AbstractNodeViewEditPart part,
         Rectangle constraint)
   {
      super("set constraint");

      editpart = part;

      // TODO only working for Nodes here, have to consider other stuff in future
      int x = part.getModel().getX();
      int y = part.getModel().getY();
      int width = part.getModel().getWidth();
      int height = part.getModel().getHeight();

      oldBounds = new Rectangle(x, y, width, height);
      newBounds = constraint;
   }


   @Override
   public boolean canExecute()
   {
      return editpart != null && editpart.getModel() != null;
   }


   @Override
   public boolean canUndo()
   {
      return oldBounds != null;
   }


   @Override
   public void redo()
   {
      editpart.getModel().setX(newBounds.x);
      editpart.getModel().setY(newBounds.y);
      editpart.getModel().setWidth(newBounds.width);
      editpart.getModel().setHeight(newBounds.height);
   }


   @Override
   public void undo()
   {
      editpart.getModel().setX(oldBounds.x);
      editpart.getModel().setY(oldBounds.y);
      editpart.getModel().setWidth(oldBounds.width);
      editpart.getModel().setHeight(oldBounds.height);
   }


   @Override
   public void execute()
   {
      redo();
   }
}
