/**
 * 
 */
package org.fujaba.commons.editor;

import java.util.ArrayList;
import java.util.EventObject;
import java.util.Iterator;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.command.CommandStackListener;
import org.fujaba.commons.edit.commands.CommandProxy;


/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 *
 */
public class CommandStackDelegate implements CommandStack
{

   org.eclipse.gef.commands.CommandStack delegate;
   ArrayList<ListenerWrapper> wrapperList;
   
   
   public CommandStackDelegate(org.eclipse.gef.commands.CommandStack delegate)
   {
      super();
      this.delegate = delegate;
      wrapperList = new ArrayList<ListenerWrapper>();
      if(delegate == null)
      {
         throw new IllegalArgumentException("Argument must not be null");
      }
   }


   /**
    * @see org.eclipse.emf.common.command.CommandStack#addCommandStackListener(org.eclipse.emf.common.command.CommandStackListener)
    */
   public void addCommandStackListener(CommandStackListener listener)
   {
      ListenerWrapper listenerWrapper = new ListenerWrapper(listener);
      this.delegate.addCommandStackListener(listenerWrapper);
      this.wrapperList.add(listenerWrapper);
   }


   /**
    * @see org.eclipse.emf.common.command.CommandStack#canRedo()
    */
   public boolean canRedo()
   {
      return false;
   }


   /**
    * @see org.eclipse.emf.common.command.CommandStack#canUndo()
    */
   public boolean canUndo()
   {
      return false;
   }


   /**
    * @see org.eclipse.emf.common.command.CommandStack#execute(org.eclipse.emf.common.command.Command)
    */
   public void execute(Command command)
   {
      CommandProxy proxy = new CommandProxy(command);
      delegate.execute(proxy);

   }


   /**
    * @see org.eclipse.emf.common.command.CommandStack#flush()
    */
   public void flush()
   {

   }


   /**
    * @see org.eclipse.emf.common.command.CommandStack#getMostRecentCommand()
    */
   public Command getMostRecentCommand()
   {
      return null;
   }


   /**
    * @see org.eclipse.emf.common.command.CommandStack#getRedoCommand()
    */
   public Command getRedoCommand()
   {
      return null;
   }


   /**
    * @see org.eclipse.emf.common.command.CommandStack#getUndoCommand()
    */
   public Command getUndoCommand()
   {
      return null;
   }


   /**
    * @see org.eclipse.emf.common.command.CommandStack#redo()
    */
   public void redo()
   {
//      this.delegate.redo();
      //ignore
   }


   /**
    * @see org.eclipse.emf.common.command.CommandStack#removeCommandStackListener(org.eclipse.emf.common.command.CommandStackListener)
    */
   public void removeCommandStackListener(CommandStackListener listener)
   {
      for (Iterator<ListenerWrapper> iterator = wrapperList.iterator(); iterator.hasNext();)
      {
         ListenerWrapper wrapper = iterator.next();
         if(wrapper.getWrappedListener().equals(listener))
         {
            this.delegate.removeCommandStackListener(wrapper);
            break;
         }
         
      }

   }


   /**
    * @see org.eclipse.emf.common.command.CommandStack#undo()
    */
   public void undo()
   {
//      this.delegate.undo();
      //ignore
   }
   
   private class ListenerWrapper implements org.eclipse.gef.commands.CommandStackListener
   {
      CommandStackListener listener;

      CommandStackListener getWrappedListener()
      {
         return this.listener;
      }

      ListenerWrapper(CommandStackListener listener)
      {
         super();
         this.listener = listener;
      }

      public void commandStackChanged(EventObject event)
      {
         listener.commandStackChanged(event);
         
      }      
   }

}
