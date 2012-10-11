package org.fujaba.commons.edit.commands;


import java.util.List;

import org.eclipse.draw2d.geometry.Rectangle;
import org.fujaba.commons.notation.HierarchicalNode;
import org.fujaba.commons.notation.Node;
import org.fujaba.commons.notation.NotationFactory;



/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 */
public abstract class AbstractCreateNodeCommand extends AbstractViewCommand
{

   private Rectangle bounds;

   private int minWidth = 50;

   private int minHeight = 20;

   private boolean hierarchical;

   private List<Node> viewChildren;


   /**
    * Default constructor.
    * 
    * @param label A label for the command.
    * @param parent The parent (view) element.
    */
   public AbstractCreateNodeCommand(String label, HierarchicalNode parent,
         boolean hierarchical, List<Node> children)
   {
      super(label, parent);
      this.hierarchical = hierarchical;
      this.viewChildren = children;
   }


   @Override
   public void redoView()
   {
      // one time stuff
      if (viewElement == null)
      {
         if (hierarchical)
         {
            viewElement = NotationFactory.eINSTANCE.createHierarchicalNode();
         }
         else
         {
            viewElement = NotationFactory.eINSTANCE.createNode();
         }
         getView().setPersistent(true);
         getView().setVisible(true);

         setBounds();
      }

      // stuff that has to be redone on every undo/redo
      getView().setModel(getModel());
      viewParent.getNodes().add(getView());

      // set new parent
      if (hierarchical && viewChildren != null)
      {
         for (Node child : viewChildren)
         {
            child.setParent((HierarchicalNode) viewElement);
         }
      }
   }


   @Override
   public void undoView()
   {
      viewParent.getNodes().remove(getView());
      getView().setModel(null);

      // set new parent
      if (hierarchical && viewChildren != null)
      {
         for (Node child : viewChildren)
         {
            child.setParent(viewParent);
         }
      }
   }


   private void setBounds()
   {
      if (bounds != null)
      {
         if (getMinHeight() > bounds.height)
         {
            getView().setHeight(getMinHeight());
         }
         else
         {
            getView().setHeight(bounds.height);
         }

         if (getMinWidth() > bounds.width)
         {
            getView().setWidth(getMinWidth());
         }
         else
         {
            getView().setWidth(bounds.width);
         }
         getView().setX(bounds.x);
         getView().setY(bounds.y);
      }
   }


   protected Rectangle getBounds()
   {
      return bounds;
   }


   protected int getMinHeight()
   {
      return minHeight;
   }


   protected int getMinWidth()
   {
      return minWidth;
   }


   @Override
   protected Node getView()
   {
      return (Node) viewElement;
   }


   protected void setBounds(Rectangle bounds)
   {
      this.bounds = bounds;
   }


   protected void setMinHeight(int minHeight)
   {
      this.minHeight = minHeight;
   }


   protected void setMinWidth(int minWidth)
   {
      this.minWidth = minWidth;
   }
}
