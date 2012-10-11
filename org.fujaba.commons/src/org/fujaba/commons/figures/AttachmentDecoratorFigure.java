package org.fujaba.commons.figures;


import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import org.eclipse.draw2d.FreeformLayer;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.geometry.Rectangle;


/**
 * @author Florian Klein (fklein@upb.de)
 * @author Last editor: $Author: fklein $
 * @version $Revision: 1333 $ $Date: 2007-02-16 14:37:47 +0100 (Fr, 16 Feb 2007) $
 * 
 * A figure that attaches itself to another figure. You can set the relative reference point in the
 * target figure (reference), the relative reference point in the decoration (aligment) and the
 * distance between these reference points (offset). Is isOverlay() is true, the decorator is in
 * front of the target, else behind. The decorator is a freeform figure that grows to accomodate its
 * children.
 * 
 * The decorator will work with any layout. If the underlying layout supports Locator constraints,
 * consider using an AttachToOneSideLocator (de.uni_paderborn.commons4eclipse.gef.locators) instead.
 * 
 * If the AttachmentDecorator is used as the figure of an edit part, do not call removeDecorator(), 
 * but merely disconnect() to remove it, as the EditPart will insist on removing the figure from
 * the parent figure itself.
 */
public class AttachmentDecoratorFigure extends FreeformLayer implements
      PropertyChangeListener
{
   private int offsetX = 0;

   private int offsetY = 0;

   private float referenceX = 0.0f;

   private float referenceY = 0.0f;

   private float alignmentX = 0.0f;

   private float alignmentY = 0.0f;

   private IFigure target = null;

   private boolean parentManagementAutomatic = true;

   private boolean overlay = false;


   /**
    * Create a decorator for target figure
    * 
    * @param target
    */
   public AttachmentDecoratorFigure(IFigure target)
   {
      this(target, 0.0f, 0.0f, 0, 0);
   }


   public AttachmentDecoratorFigure(IFigure target, int offsetX, int offsetY)
   {
      this(target, 0.0f, 0.0f, offsetX, offsetY);
   }


   public AttachmentDecoratorFigure(IFigure target, float referenceX,
         float referenceY)
   {
      this(target, referenceX, referenceY, 0, 0);
   }


   public AttachmentDecoratorFigure(IFigure target, float referenceX,
         float referenceY, int offsetX, int offsetY)
   {
      this.setTarget(target);
      this.setOffsetX(offsetX);
      this.setOffsetY(offsetY);
      this.setReferenceX(referenceX);
      this.setReferenceY(referenceY);
      this.setOpaque(true);
   }


   /**
    * Pass in the symbolic name of the side to attach to (NORTH, NORTH_WEST etc.)
    */
   public AttachmentDecoratorFigure(IFigure target, int side, int offsetX,
         int offsetY)
   {
      this(target, 0.0f, 0.0f, offsetX, offsetY);
      this.setSide(side);
   }


   /**
    * Pass in the symbolic name of the side to attach to (NORTH, NORTH_WEST etc.) Pass in the
    * symbolic name of the alignment of the decoration (NORTH, NORTH_WEST etc.)
    */
   public AttachmentDecoratorFigure(IFigure target, int side, int alignment,
         int offsetX, int offsetY)
   {
      this(target, 0.0f, 0.0f, offsetX, offsetY);
      this.setSide(side);
      this.setAlignment(alignment);
   }


   /**
    * Disconnect decorator from target without removing the figure (as the EditPart mechanism
    * expects to remove the child figure itself)
    */
   public void disconnect()
   {
      if (this.target != null)
         this.target.removePropertyChangeListener(this);
      this.target = null;
   }


   /**
    * 'Speaking' method name for removing decorator - simply calls setTarget(null)
    */
   public void removeDecorator()
   {
      this.setTarget(null);
   }


   /**
    * Draw before or behind target?
    * 
    * @return the overlay
    */
   public boolean isOverlay()
   {
      return overlay;
   }


   /**
    * @param overlay set overlay mode
    */
   public void setOverlay(boolean overlay)
   {
      this.overlay = overlay;
   }


   /**
    * @return the target
    */
   public IFigure getTarget()
   {
      return target;
   }


   /**
    * @return the parentManagementAutomatic flag
    */
   public boolean isParentManagementAutomatic()
   {
      return parentManagementAutomatic;
   }


   /**
    * Automatically set parent to parent of target figure or not - should be disabled if the figure
    * belongs to a model element controlled by its own edit part, as the edit part expects to set
    * and especially unset the parent figure
    * 
    * @param parentManagementAutomatic enable / disable automatic parent management
    */
   public void setParentManagementAutomatic(boolean parentManagementAutomatic)
   {
      this.parentManagementAutomatic = parentManagementAutomatic;
   }


   /**
    * @see java.beans.PropertyChangeListener#propertyChange(java.beans.PropertyChangeEvent)
    */
   public void propertyChange(PropertyChangeEvent event)
   {
      updateParent(); // We are only getting one type of event anyway, so why parse?
   }


   private void updateParent()
   {
      if (isParentManagementAutomatic())
      {
         if (this.getTarget() == null)
         {
            if (this.getParent() != null)
               getParent().remove(this);
         }
         else if (this.getParent() != this.getTarget().getParent())
         {
            if (this.getParent() != null)
               getParent().remove(this);

            if (this.target.getParent() != null)
            {
               if (this.isOverlay())
                  this.target.getParent().add(this);
               else
                  this.target.getParent().add(this, 0);
            }
         }
      }
   }


   /**
    * @param target the target to set
    */
   public void setTarget(IFigure target)
   {
      if (target == this)
      {
         throw new IllegalArgumentException(
               "Target must not be the decorator itself.");
      }

      if (this.target != target)
      {
         if (this.target != null)
            this.target.removePropertyChangeListener(this);
         this.target = target;
         if (this.target != null)
            this.target.addPropertyChangeListener("parent", this);
      }

      updateParent();
   }


   /**
    * Set the side to attach to using the symbolic name (NORTH, NORTH_WEST etc.)
    */
   public void setSide(int side)
   {
      if (side == PositionConstants.NORTH_WEST)
         this.setReference(0.0f, 0.0f);
      else if (side == PositionConstants.NORTH)
         this.setReference(0.5f, 0.0f);
      else if (side == PositionConstants.NORTH_EAST)
         this.setReference(1.0f, 0.0f);
      else if (side == PositionConstants.EAST)
         this.setReference(1.0f, 0.5f);
      else if (side == PositionConstants.SOUTH_EAST)
         this.setReference(1.0f, 1.0f);
      else if (side == PositionConstants.SOUTH)
         this.setReference(0.5f, 1.0f);
      else if (side == PositionConstants.SOUTH_WEST)
         this.setReference(0.0f, 1.0f);
      else if (side == PositionConstants.WEST)
         this.setReference(0.0f, 0.5f);
   }


   /**
    * Set the side of the decorator to attach with using the symbolic name (NORTH, NORTH_WEST etc.)
    */
   public void setAlignment(int side)
   {
      if (side == PositionConstants.NORTH_WEST)
         this.setAlignment(0.0f, 0.0f);
      else if (side == PositionConstants.NORTH)
         this.setAlignment(0.5f, 0.0f);
      else if (side == PositionConstants.NORTH_EAST)
         this.setAlignment(1.0f, 0.0f);
      else if (side == PositionConstants.EAST)
         this.setAlignment(1.0f, 0.5f);
      else if (side == PositionConstants.SOUTH_EAST)
         this.setAlignment(1.0f, 1.0f);
      else if (side == PositionConstants.SOUTH)
         this.setAlignment(0.5f, 1.0f);
      else if (side == PositionConstants.SOUTH_WEST)
         this.setAlignment(0.0f, 1.0f);
      else if (side == PositionConstants.WEST)
         this.setAlignment(0.0f, 0.5f);
   }


   /**
    * Set the absolute offset in pixels from the reference point
    * 
    * @param offsetX
    * @param offsetY
    */
   public void setOffset(int offsetX, int offsetY)
   {
      this.offsetX = offsetX;
      this.offsetY = offsetY;
   }


   /**
    * @return the offsetX
    */
   public int getOffsetX()
   {
      return offsetX;
   }


   /**
    * @param offsetX the offsetX to set
    */
   public void setOffsetX(int offsetX)
   {
      this.offsetX = offsetX;
   }


   /**
    * @return the offsetY
    */
   public int getOffsetY()
   {
      return offsetY;
   }


   /**
    * @param offsetY the offsetY to set
    */
   public void setOffsetY(int offsetY)
   {
      this.offsetY = offsetY;
   }


   /**
    * Set the relative position w.r.t. the target figure, 0.0, 0.0 being the top left, 1.0, 1.0
    * being the bottom right
    * 
    * @param referenceX
    * @param referenceY
    */
   public void setReference(float referenceX, float referenceY)
   {
      this.referenceX = referenceX;
      this.referenceY = referenceY;
   }


   /**
    * @return the referenceX
    */
   public float getReferenceX()
   {
      return referenceX;
   }


   /**
    * @param referenceX the referenceX to set
    */
   public void setReferenceX(float referenceX)
   {
      this.referenceX = referenceX;
   }


   /**
    * @return the referenceY
    */
   public float getReferenceY()
   {
      return referenceY;
   }


   /**
    * @param referenceY the referenceY to set
    */
   public void setReferenceY(float referenceY)
   {
      this.referenceY = referenceY;
   }


   /**
    * Set the relative position of the attachment w.r.t. the decorator figure, 0.0, 0.0 being the
    * top left, 1.0, 1.0 being the bottom right
    * 
    * @param alignmentX
    * @param alignmentY
    */
   public void setAlignment(float connectorX, float connectorY)
   {
      this.alignmentX = connectorX;
      this.alignmentY = connectorY;
   }


   /**
    * @return the alignmentX
    */
   public float getAlignmentX()
   {
      return alignmentX;
   }


   /**
    * @param alignmentX the alignmentX to set
    */
   public void setAlignmentX(float connectorX)
   {
      this.alignmentX = connectorX;
   }


   /**
    * @return the alignmentY
    */
   public float getAlignmentY()
   {
      return alignmentY;
   }


   /**
    * @param alignmentY the alignmentY to set
    */
   public void setAlignmentY(float connectorY)
   {
      this.alignmentY = connectorY;
   }


   /*
    * (non-Javadoc)
    * 
    * @see org.eclipse.draw2d.Figure#getBounds()
    */
   /**
    * Override getBounds() to always use the translated bounds of the decorator target
    */
   @Override
   public Rectangle getBounds()
   {
      if (this.getTarget() == null)
      {
         return new Rectangle(0, 0, 0, 0);
      }

      Rectangle targetBounds = this.getTarget().getBounds().getCopy();
      Rectangle decoratorBounds = super.getFreeformExtent().getCopy();

      decoratorBounds.setLocation(targetBounds.getLocation());
      int relativeX = Math.round(referenceX * targetBounds.width);
      int relativeY = Math.round(referenceY * targetBounds.height);
      decoratorBounds.translate(relativeX, relativeY);
      int innerX = Math.round(alignmentX * decoratorBounds.width);
      int innerY = Math.round(alignmentY * decoratorBounds.height);
      decoratorBounds.translate(-innerX, -innerY);

      decoratorBounds.translate(offsetX, offsetY);

      return decoratorBounds;
   }


   /**
    * No comment provided by developer, please add a comment to improve documentation.
    * 
    * @return No description provided
    */
   @Override
   protected boolean useLocalCoordinates()
   {
      return true;
   }
}
