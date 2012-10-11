/*
 * The FUJABA ToolSuite for Eclipse project:
 *
 *   FUJABA is the acronym for 'From Uml to Java And Back Again'
 *   and originally aims to provide an environment for round-trip
 *   engineering using UML as visual programming language. During
 *   the last years, the environment has become a base for several
 *   research activities, e.g. distributed software, database
 *   systems, modelling mechanical and electrical systems and
 *   their simulation. Thus, the environment has become a project,
 *   where this source code is part of. Further details are avail-
 *   able via http://www.fujaba.de
 *
 *      Copyright (C) Fujaba Development Group
 *
 *   This library is free software; you can redistribute it and/or
 *   modify it under the terms of the GNU Lesser General Public
 *   License as published by the Free Software Foundation; either
 *   version 2.1 of the License, or (at your option) any later version.
 *
 *   You should have received a copy of the GNU Lesser General Public
 *   License along with this library; if not, write to the Free
 *   Software Foundation, Inc., 59 Temple Place, Suite 330, Boston,
 *   MA 02111-1307, USA or download the license under
 *   http://www.gnu.org/copyleft/lesser.html
 *
 * WARRANTY:
 *
 *   This library is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 *   GNU Lesser General Public License for more details.
 *
 * Contact address:
 *
 *   Fujaba Management Board
 *   Software Engineering Group
 *   University of Paderborn
 *   Warburgerstr. 100
 *   D-33098 Paderborn
 *   Germany
 *
 *   URL  : http://www.fujaba.de
 *   email: info@fujaba.de
 *
 */
package org.fujaba.commons.figures.utils;


import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.ConnectionLocator;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;


/**
 * @author Florian Klein (fklein)
 * @author Last editor: $Author: mvdetten $
 * @version $Revision: 1702 $ $Date: 2009-02-26 10:58:41 +0100 (Do, 26 Feb 2009) $
 * 
 * <pre>
 * A connection locator that provides additional options for
 * placing the label. 
 * 
 * gap - the distance (perpendicular to the connector)
 * offset - controls the direction of the gap
 *    - CLOCKWISE:      the label is clockwise from the connector
 *    - ANTICLOCKWISE:  the label is anti-clockwise from the connector
 *    - LEFT:           the label is always to the left of the connector
 *    - RIGHT:          the label is always to the right of the connector
 *    - ABOVE:          the label is always above the connector
 *    - BELOW:          the label is always below the connector
 *    - INSIDE:         the label is always on the inside (vertically)                      
 *    - OUTSIDE:        the label is always on the outside (vertically)                      
 * reference - relative or absolute reference point. Relative uses the
 *             chopbox point, i.e. the label always points away from the
 *             line. Absolute uses the top left corner
 * referenceOffsetX/Y - relative offset from the reference point.
 *             0.5/0.5 e.g. uses the center. More relevant with
 *             reference:absolute.
 * axisBalance - positive values reduce the movement of the anchor point
 *               on the y-axis and emphasize the x-axis (negative values have
 *               the opposite effect). For a 45° connection between two nodes,
 *               this will keep the label closer to the y-coordinate of the
 *               midpoint, thus preventing it from touching one of the nodes.
 * 
 * Optionally, it will also orient the target figure,
 * provided it is a RotableDecoration.
 * </pre>
 */
public class AdaptiveConnectionLocator extends ConnectionLocator
{
   public final static int OFFSET_CLOCKWISE = 0;

   public final static int OFFSET_ANTICLOCKWISE = 1;

   public final static int OFFSET_LEFT = 2;

   public final static int OFFSET_RIGHT = 3;

   public final static int OFFSET_ABOVE = 4;

   public final static int OFFSET_BELOW = 5;

   public final static int OFFSET_INSIDE = 6;

   public final static int OFFSET_OUTSIDE = 7;


   public final static int REFERENCE_RELATIVE = 0;

   public final static int REFERENCE_ABSOLUTE = 1;


   public final static int ORIENTATION_NONE = 0;

   public final static int ORIENTATION_SOURCE = 1;

   public final static int ORIENTATION_TARGET = 2;


   private int offset = OFFSET_CLOCKWISE;

   private double preciseAlignment = 0.0;

   private int reference = REFERENCE_RELATIVE;

   private double reference_x = 0.0;

   private double reference_y = 0.0;

   private double axisBalance = 0.0;

   private int orientation = ORIENTATION_NONE;


   public AdaptiveConnectionLocator(Connection connection)
   {
      this(connection, MIDDLE, 10, OFFSET_CLOCKWISE);
   }


   public AdaptiveConnectionLocator(Connection connection, int alignment,
         int gap)
   {
      this(connection, alignment, gap, OFFSET_CLOCKWISE);
   }


   public AdaptiveConnectionLocator(Connection connection, int alignment,
         int gap, int offset)
   {
      super(connection);
      this.setAlignment(alignment);
      this.setGap(gap);
      this.setOffset(offset);
   }


   public AdaptiveConnectionLocator(Connection connection,
         double preciseAlignment, int gap)
   {
      this(connection, preciseAlignment, gap, OFFSET_CLOCKWISE);
   }


   public AdaptiveConnectionLocator(Connection connection,
         double preciseAlignment, int gap, int offset)
   {
      super(connection);
      this.setPreciseAlignment(preciseAlignment);
      this.setGap(gap);
      this.setOffset(offset);
   }


   /**
    * @return the preciseAlignment
    */
   public double getPreciseAlignment()
   {
      return preciseAlignment;
   }


   /**
    * @param preciseAlignment the preciseAlignment to set
    */
   public void setPreciseAlignment(double preciseAlignment)
   {
      this.preciseAlignment = preciseAlignment;
      if (preciseAlignment == 0.0)
         super.setAlignment(SOURCE);
      else if (preciseAlignment == 1.0)
         super.setAlignment(TARGET);
      else
         super.setAlignment(MIDDLE);
   }


   @Override
   public void setAlignment(int align)
   {
      super.setAlignment(align);
      if (align == SOURCE)
         preciseAlignment = 0.0;
      else if (align == TARGET)
         preciseAlignment = 1.0;
      else if (align == MIDDLE)
         preciseAlignment = 0.5;
   }


   /**
    * @return the orientation
    */
   public int getOrientation()
   {
      return orientation;
   }


   /**
    * @param orientation the orientation to set
    */
   public void setOrientation(int orientation)
   {
      this.orientation = orientation;
   }


   /**
    * @return the polarity
    */
   public int getOffset()
   {
      return offset;
   }


   /**
    * @param polarity the polarity to set
    */
   public void setOffset(int polarity)
   {
      this.offset = polarity;
   }


   /**
    * @return the axisBalance
    */
   public double getAxisBalance()
   {
      return axisBalance;
   }


   /**
    * @param axisBalance the axisBalance to set
    */
   public void setAxisBalance(double axisBalance)
   {
      this.axisBalance = axisBalance;
   }


   /**
    * @return the reference
    */
   public int getReference()
   {
      return reference;
   }


   /**
    * @param reference the reference to set
    */
   public void setReference(int reference)
   {
      this.reference = reference;
   }


   /**
    * @return the reference_x
    */
   public double getReferenceOffsetX()
   {
      return reference_x;
   }


   /**
    * @param reference_x the reference_x to set
    */
   public void setReferenceOffsetX(double reference_x)
   {
      this.reference_x = reference_x;
   }


   /**
    * @return the reference_y
    */
   public double getReferenceReferenceOffsetY()
   {
      return reference_y;
   }


   /**
    * @param reference_y the reference_y to set
    */
   public void setReferenceReferenceOffsetY(double reference_y)
   {
      this.reference_y = reference_y;
   }


   /**
    * Find the relative position of the anchor on the line Sets p0 and p1 for use in other methods.
    */
   protected Point getAnchorLocation(PointList segments, Point p0, Point p1)
   {
      if (segments.size() > 1)
      {
         // Compute length of line
         double length = 0.0;
         double sectionLengths[] = new double[segments.size()];
         sectionLengths[0] = 0.0;
         segments.getPoint(p0, 0);
         for (int i = 1; i < segments.size(); ++i)
         {
            segments.getPoint(p1, i);
            double section = p0.getDistance(p1);
            length += section;
            sectionLengths[i] = length;
            segments.getPoint(p0, i);
         }
         // Find right segment
         double offset = length * this.preciseAlignment;
         int index;
         for (index = 1; index < segments.size(); ++index)
         {
            if (offset <= sectionLengths[index])
            {
               break;
            }
         }
         // Compute position in segment
         offset -= sectionLengths[index - 1];
         segments.getPoint(p0, index - 1);
         segments.getPoint(p1, index);
         length = p0.getDistance(p1);
         double r = offset / length;
         return new Point(p0.x + r * (p1.x - p0.x), p0.y + r * (p1.y - p0.y));
      }
      return new Point();
   }


   /**
    * @see org.eclipse.draw2d.ConnectionLocator#getLocation(org.eclipse.draw2d.geometry.PointList)
    * 
    * Returns the position of the 'centerpoint' offset from the connector in the right direction
    * 
    * Also sets nx and ny.
    */
   @Override
   public Point getLocation(PointList segments)
   {
      return computeRelocation(null, segments, false);
   }


   /**
    * @param target - attached figure
    * @return the correct position for the attached figure
    */
   public Point getAdaptedLocation(IFigure target)
   {
      return computeRelocation(target, getPoints(), false);
   }


   /**
    * @param target The figure to relocate
    * @see org.eclipse.draw2d.Locator#relocate(org.eclipse.draw2d.IFigure)
    */
   @Override
   public void relocate(IFigure target)
   {
      computeRelocation(target, getPoints(), true);
   }


   private Point computeRelocation(IFigure target, PointList segments,
         boolean relocate)
   {
      Point p0 = new Point();
      Point p1 = new Point();

      // Compute anchor on the line
      Point anchorLocation = getAnchorLocation(segments, p0, p1);
      int dx = p1.x - p0.x;
      int dy = p1.y - p0.y;

      // Set offset based on polarity and quadrant
      int offsetDirection = 1;
      if (dx > 0)
      {
         if (this.offset == OFFSET_BELOW)
         {
            offsetDirection = -1;
         }
         else if (dy > 0 && this.offset == OFFSET_INSIDE)
         {
            offsetDirection = -1;
         }
         else if (dy <= 0 && this.offset == OFFSET_OUTSIDE)
         {
            offsetDirection = -1;
         }
      }
      else
      {
         if (this.offset == OFFSET_ABOVE)
         {
            offsetDirection = -1;
         }
         else if (dy > 0 && this.offset == OFFSET_OUTSIDE)
         {
            offsetDirection = -1;
         }
         else if (dy <= 0 && this.offset == OFFSET_INSIDE)
         {
            offsetDirection = -1;
         }
      }
      if (dy > 0)
      {
         if (this.offset == OFFSET_LEFT)
         {
            offsetDirection = -1;
         }
      }
      else
      {
         if (this.offset == OFFSET_RIGHT)
         {
            offsetDirection = -1;
         }
      }

      // Compute normal
      double ld = Math.sqrt(dx * dx + dy * dy);
      double nx = dy * offsetDirection * this.getGap() / ld;
      double ny = -dx * offsetDirection * this.getGap() / ld;

      // Basic reference point
      double balance = (this.getGap() - Math.abs(Math.abs(nx) - Math.abs(ny)))
            / this.getGap();
      double bfx = (1 + this.getAxisBalance() * balance);
      bfx = (bfx < 0) ? 0 : bfx;
      double bfy = (1 - this.getAxisBalance() * balance);
      bfy = (bfy < 0) ? 0 : bfy;
      double lx = anchorLocation.x + nx * bfx;
      double ly = anchorLocation.y + ny * bfy;

      // Only compute basic adapted reference point
      if (target == null)
      {
         return new Point((int) (0.5 + lx), (int) (0.5 + ly));
      }
      // Compute correct adapted reference point taking figure size into account
      else
      {
         Dimension fd = target.getPreferredSize();

         // Attachment point is relative to top left corner
         double rx = fd.width * this.reference_x;
         double ry = fd.height * this.reference_y;

         if (this.reference == REFERENCE_RELATIVE)
         {
            if (fd.width != 0 && fd.height != 0 && (nx != 0.0 || ny != 0.0))
            {
               // Use chopbox point of normal as attachment point
               double scale = 0.5 / Math.max(Math.abs(nx) / fd.width, Math
                     .abs(ny)
                     / fd.height);
               rx += 0.5 * fd.width - scale * nx;
               ry += 0.5 * fd.height - scale * ny;

               // Check intersection with connector / distance to basic reference point
               double ix = Math.abs(p0.x + (ly - p0.y) * dx / dy - lx);
               double iy = Math.abs(p0.y + (lx - p0.x) * dy / dx - ly);

               // Shift label if it intersects the connector
               double kx = getGap() + ((nx > 0.0) ? rx : fd.width - rx);
               double ky = getGap() + ((ny > 0.0) ? ry : fd.height - ry);

               if (ix < kx)
               {
                  rx -= Math.signum(nx) * (kx - ix);
               }
               if (iy < ky)
               {
                  ry -= Math.signum(ny) * (ky - iy);
               }
            }
         }

         int px = (int) (0.5 + lx - rx);
         int py = (int) (0.5 + ly - ry);

         Point location = new Point(px, py);

         if (relocate)
         {
            target.setBounds(new Rectangle(location.x, location.y, fd.width,
                  fd.height));

            // Orient if requested and possible
            if (this.orientation != ORIENTATION_NONE
                  && target instanceof RotatableDecoration)
            {
               target.setLocation(location); // != set bounds for some reason...

               RotatableDecoration decoration = (RotatableDecoration) target;
               if (this.orientation == ORIENTATION_SOURCE)
               {
                  decoration.setReferencePoint(new Point(p0.x + nx, p0.y + ny));
               }
               else
               {
                  decoration.setReferencePoint(new Point(p1.x + nx, p1.y + ny));
               }
            }
         }
         return location;
      }
   }


   protected PointList getPoints()
   {
      return getConnection().getPoints();
   }
}
