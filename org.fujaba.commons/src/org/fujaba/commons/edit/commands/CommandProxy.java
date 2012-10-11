/**
 * 
 */
package org.fujaba.commons.edit.commands;

import org.eclipse.gef.commands.Command;

/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 *
 */
public class CommandProxy extends Command
{
   private org.eclipse.emf.common.command.Command command;

   public CommandProxy(org.eclipse.emf.common.command.Command command)
   {
      super();
      this.command = command;
   }

   @Override
   public boolean canExecute()
   {
      return this.command.canExecute();
   }

   @Override
   public boolean canUndo()
   {
      return this.command.canUndo();
   }

   @Override
   public Command chain(Command command)
   {
      return super.chain(command);
   }

   @Override
   public void dispose()
   {
      this.command.dispose();
   }

   @Override
   public void execute()
   {
      this.command.execute();
   }

   @Override
   public String getDebugLabel()
   {
      return super.getDebugLabel();
   }

   @Override
   public String getLabel()
   {
      return this.command.getLabel();
   }

   @Override
   public void redo()
   {
      this.command.redo();
   }

   @Override
   public void setDebugLabel(String label)
   {
      super.setDebugLabel(label);
   }

   @Override
   public void setLabel(String label)
   {
      //ignore
   }

   @Override
   public void undo()
   {
      this.command.undo();
   }
   
   
}
