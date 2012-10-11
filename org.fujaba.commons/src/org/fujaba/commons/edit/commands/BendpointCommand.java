package org.fujaba.commons.edit.commands;


import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gef.commands.Command;
import org.fujaba.commons.notation.BendPoint;
import org.fujaba.commons.notation.Edge;



/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 */
public abstract class BendpointCommand extends Command
{

   protected Edge model;

   private Dimension sourceDimension;

   private Dimension targetDimension;

   protected BendPoint point;

   protected int index;


   /**
    * Default constructor.
    * 
    * @param model The model element to be commanded.
    * @param name A name for the command.
    */
   public BendpointCommand(Edge model, String name)
   {
      super(name);
      this.model = model;
   }


   @Override
   public boolean canExecute()
   {
      return this.model != null;
   }


   @Override
   public boolean canUndo()
   {
      return this.model != null;
   }


   @Override
   public void execute()
   {
      redo();
   }


   protected Dimension getSourceRelativeDimension()
   {
      return this.sourceDimension;
   }


   protected Dimension getTargetRelativeDimension()
   {
      return this.targetDimension;
   }


   protected int getIndex()
   {
      return this.index;
   }


   protected Edge getConnectionModel()
   {
      return this.model;
   }


   public void setRelativeDimensions(Dimension source, Dimension target)
   {
      this.sourceDimension = source;
      this.targetDimension = target;
   }


   public void setIndex(int i)
   {
      this.index = i;
   }
}
