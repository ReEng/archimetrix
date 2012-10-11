package org.fujaba.commons.edit.commands;


import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.commands.Command;
import org.fujaba.commons.notation.DiagramElement;
import org.fujaba.commons.notation.HierarchicalNode;



/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 */
public abstract class AbstractViewCommand extends Command
{
   protected HierarchicalNode viewParent;

   protected DiagramElement viewElement;

   protected EObject modelElement;
   
   private boolean aborted = false;


   /**
    * Default constructor.
    * 
    * @param label The label for the command.
    * @param viewParent The parent of the view element to command.
    */
   public AbstractViewCommand(String label, HierarchicalNode viewParent)
   {
      super(label);
      this.viewParent = viewParent;
   }


   @Override
   public boolean canExecute()
   {
      return viewParent != null;
   }


   @Override
   public boolean canUndo()
   {
      return modelElement != null && viewElement != null;
   }


   @Override
   public final void execute()
   {
      redo();
   }


   @Override
   public final void redo()
   {
      redoModel();
      if(!isAborted())
      {
         redoView();
      }
   }


   @Override
   public final void undo()
   {
      if(!isAborted())
      {
         undoView();
      }
      undoModel();
   }


   protected EObject getModel()
   {
      return modelElement;
   }


   protected DiagramElement getView()
   {
      return viewElement;
   }
   
   protected void abort()
   {
      aborted = true;
   }
   
   protected boolean isAborted()
   {
      return aborted;
   }


   protected abstract void redoModel();


   protected abstract void redoView();


   protected abstract void undoModel();


   protected abstract void undoView();
}
