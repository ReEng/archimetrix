package org.fujaba.commons.figures;


import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Rectangle;


/**
 * @author Florian Klein (fklein@upb.de)
 * @author Last editor: $Author: fklein $
 * @version $Revision: 1333 $ $Date: 2007-02-16 14:37:47 +0100 (Fr, 16 Feb 2007) $
 * 
 * A figure that attaches itself to another figure (the shadow caster) as a shadow decoration. It
 * will copy the exact size, style and shape of the shadow caster's border (in fact, it will use the
 * shadow caster's border object for drawing). It is possible to specify an offset and a delta, i.e.
 * the number of pixels the shadow should grow in each direction. If the shadow caster is not a
 * rectangle, do not set setOpaque(true), as the Shadow cannot imitate the shape of the fill area as
 * it can for the border.
 * 
 * The second possibility is to pass in an arbitrary IFigure as the shadow, which is then scaled and
 * positioned according to offset, delta and the target's bounds. This makes the old dedicated
 * shaped ShadowDecoratorFigures obsolete - simply pass a copy of the target figure to the
 * ShadowDecoratorFigure to achieve an exact copy of anything.
 * 
 * The main advantage compared to 
 * @see de.uni_paderborn.commons4eclipse.gef.figures.ShadowedLineBorderedFigure
 * is that there is no parent container figure. i.e. your EditPart's figure 
 * that the user can select will just be the shadow caster, not also the shadow.
 */
public class ShadowDecoratorFigure extends AttachmentDecoratorFigure
{
   public final static int DEFAULT_OFFSET = 5;

   public final static int DEFAULT_DELTA = 0;

   private int delta = 0;

   private IFigure shadow = null;


   /**
    * Create a shadow 5 pixels up and to the right
    * 
    */
   public ShadowDecoratorFigure(IFigure shadowCaster)
   {
      this(shadowCaster, ShadowDecoratorFigure.DEFAULT_OFFSET,
            -ShadowDecoratorFigure.DEFAULT_OFFSET,
            ShadowDecoratorFigure.DEFAULT_DELTA);
   }


   /**
    * Create a shadow with the provided offset in x and y direction
    * 
    */
   public ShadowDecoratorFigure(IFigure shadowCaster, int offsetX, int offsetY)
   {
      this(shadowCaster, offsetX, offsetY, ShadowDecoratorFigure.DEFAULT_DELTA);
   }


   /**
    * Create a shadow with the provided offset in x and y direction, extended by delta
    */
   public ShadowDecoratorFigure(IFigure shadowCaster, int offsetX, int offsetY,
         int delta)
   {
      super(shadowCaster, offsetX, offsetY);
      this.delta = delta;
      this.setOpaque(false);
   }


   /**
    * Create a shadow with the provided offset, using the provided IFigure for drawing the shadow
    */
   public ShadowDecoratorFigure(IFigure shadowCaster, IFigure shadow,
         int offsetX, int offsetY)
   {
      this(shadowCaster, shadow, offsetX, offsetY,
            ShadowDecoratorFigure.DEFAULT_DELTA);
   }


   /**
    * Create a shadow with the provided offset and delta, using the provided IFigure for drawing the
    * shadow
    */
   public ShadowDecoratorFigure(IFigure shadowCaster, IFigure shadow,
         int offsetX, int offsetY, int delta)
   {
      super(shadowCaster, offsetX, offsetY);
      this.delta = delta;
      this.shadow = shadow;
   }


   /**
    * @see org.eclipse.draw2d.Figure#getBounds() Override getBounds() to always use the translated
    *      and extended bounds of the shadow caster
    */
   @Override
   public Rectangle getBounds()
   {
      if (this.getTarget() != null)
      {
         Rectangle shadowBounds = this.getTarget().getBounds().getCopy();
         shadowBounds.translate(this.getOffsetX(), this.getOffsetY());
         shadowBounds.expand(this.delta, this.delta);
         return shadowBounds;
      }
      return new Rectangle(0, 0, 0, 0);
   }


   /**
    * @see org.eclipse.draw2d.Figure#paint(org.eclipse.draw2d.Graphics)
    */
   @Override
   public void paint(Graphics graphics)
   {
      // No shadow set - use target's border for drawing, fill rectangle if opaque
      if (this.getShadow() == null)
      {
         graphics.pushState();
         try
         {
            graphics.setForegroundColor(this.getTarget().getForegroundColor());
            graphics.setBackgroundColor(this.getTarget().getBackgroundColor());

            this.paintFigure(graphics);
            if (this.getTarget().getBorder() != null)
               this.getTarget().getBorder().paint(this, graphics, NO_INSETS);
         }
         finally
         {
            graphics.popState();
         }
      }
      // paint using shadow
      else
      {
         this.getShadow().setBounds(this.getBounds());
         this.getShadow().paint(graphics);
      }
   }


   /**
    * @return the delta
    */
   public int getDelta()
   {
      return delta;
   }


   /**
    * @param delta the delta to set
    */
   public void setDelta(int delta)
   {
      this.delta = delta;
   }


   /**
    * @return the shadow
    */
   public IFigure getShadow()
   {
      return shadow;
   }


   /**
    * @param shadow the shadow to set
    */
   public void setShadow(IFigure shadow)
   {
      this.shadow = shadow;
   }
}
