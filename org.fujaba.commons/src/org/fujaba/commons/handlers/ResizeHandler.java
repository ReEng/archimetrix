package org.fujaba.commons.handlers;


import java.util.Collections;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CommandStack;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;
import org.fujaba.commons.edit.commands.SetConstraintCommand;
import org.fujaba.commons.edit.parts.AbstractDiagramEditPart;
import org.fujaba.commons.edit.parts.AbstractNodeEditPart;



/**
 * This handler is used to execute the resizing of parts.
 * 
 * @author harka
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 */
public class ResizeHandler extends AbstractHandler
{

   private static final String TO_MINIMUM = "org.fujaba.commons.editor.resize.minimum"; //$NON-NLS-1$

   private static final String USE_COMMAND_STACK = "org.fujaba.commons.editor.resize.commandstack"; //$NON-NLS-1$


   private static List<?> getSelection(ExecutionEvent event)
   {
      ISelection selection = HandlerUtil.getCurrentSelection(event);

      // preconditions
      if (selection.isEmpty() || !(selection instanceof IStructuredSelection))
      {
         return Collections.emptyList();
      }

      return ((IStructuredSelection) selection).toList();
   }


   public Object execute(ExecutionEvent event) throws ExecutionException
   {
      // get parameters
      boolean toMinimum = Boolean.valueOf(event.getParameter(TO_MINIMUM));
      boolean useCommandStack = Boolean.valueOf(event
            .getParameter(USE_COMMAND_STACK));

      // prepare command
      CompoundCommand cc = new CompoundCommand();

      // collect selected elements
      for (Object selected : getSelection(event))
      {
         // add resize command for nodes
         if (selected instanceof AbstractNodeEditPart)
         {
            // add resize commands for children, too
            if (selected instanceof AbstractDiagramEditPart)
            {
               cc.add(getCommands((AbstractDiagramEditPart) selected, toMinimum));

            }

            cc.add(getCommand((AbstractNodeEditPart) selected, toMinimum));
         }
      }

      if (useCommandStack)
      {
         // get command stack
         CommandStack stack = (CommandStack) HandlerUtil.getActiveEditor(event)
               .getAdapter(CommandStack.class);

         if (stack != null)
         {
            stack.execute(cc.unwrap());
         }
      }
      else
      {
         // for views/editors without command stack
         cc.unwrap().execute();
      }

      return null;
   }


   private static Command getCommand(AbstractNodeEditPart part, boolean minimum)
   {
      Dimension dim;
      if (minimum)
      {
         dim = part.getMinimumSize();
      }
      else
      {
         dim = part.getPreferredSize();
      }

      int x = part.getModel().getX();
      int y = part.getModel().getY();

      Rectangle constraint = new Rectangle(x, y, dim.width, dim.height);

      return new SetConstraintCommand(part, constraint);
   }


   public static Command getCommands(AbstractDiagramEditPart selected,
         boolean minimum)
   {
      CompoundCommand cc = new CompoundCommand();

      for (Object child : selected.getChildren())
      {
         // add resize command for nodes
         if (child instanceof AbstractNodeEditPart)
         {
            // add resize commands for children, too
            if (child instanceof AbstractDiagramEditPart)
            {
               cc.add(getCommands((AbstractDiagramEditPart) child, minimum));
            }

            cc.add(getCommand((AbstractNodeEditPart) child, minimum));
         }
      }

      return cc;
   }
}
