/**
 * 
 */
package org.fujaba.commons.figures;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;

/**
 * This class represents a connection which is drawn as a double line.
 * 
 * @author    Dietrich Travkin
 * @author    Last editor: $Author: travkin $
 * @version   $Revision: 1558 $ $Date: 2008-05-06 11:03:58 +0200 (Di, 06 Mai 2008) $
 */
public class DoublePolylineConnection extends PolylineConnection
{
	private int lineDistance = 2;
	private PointList leftLinePointList = null, rightLinePointList = null;
	
   /**
    * Returns the list of points representing the left one (according to the
    * line direction) of the two lines for this DoublePolylineConnection.
    * 
    * @return the list of points representing the left one of the two lines
    * for this DoublePolylineConnection.
    */
   protected PointList getLeftLinePointList()
   {
      return this.leftLinePointList;
   }
   
   /**
    * Returns the list of points representing the right one (according to the
    * line direction) of the two lines for this DoublePolylineConnection.
    * 
    * @return the list of points representing the right one of the two lines
    * for this DoublePolylineConnection.
    */
   protected PointList getRightLinePointList()
   {
      return this.rightLinePointList;
   }  

   /**
	 * Sets the width of the gap between two line segments of this
	 * <code>DoublePolylineConnection</code>.
	 * 
	 * @param distance the width of the gap between two line segments
	 */
	public void setLineDistance(int distance)
	{
		this.lineDistance = distance;
	}
	
	/**
	 * Returns the width of the gap between two line segments of this
	 * <code>DoublePolylineConnection</code>.
	 * 
	 * @return the width of the gap between two line segments
	 */
	public int getLineDistance()
	{
		return this.lineDistance;
	}
	
	/**
	 * @see org.eclipse.draw2d.Polyline#outlineShape(org.eclipse.draw2d.Graphics)
	 */
	@Override
   protected void outlineShape(Graphics g)
	{
		this.updatePointLists();
		g.drawPolyline(this.leftLinePointList);
		g.drawPolyline(this.rightLinePointList);
	}
	
	/**
	 * Re-calculate the points of the line segments and save them in the local point lists.
	 */
	protected void updatePointLists()
	{
		this.translatePointsToCreateADoubleLine(this.getPoints());
	}
	
	/**
	 * The given {@link PointList} is used to create two new ones which represent
	 * a double line instead of a single line.
	 * 
    * @param pointsRepresentingTheSingleLine The {@link PointList} representing a single line.
    */
	protected void translatePointsToCreateADoubleLine(PointList pointsRepresentingTheSingleLine)
   {
	   this.leftLinePointList = pointsRepresentingTheSingleLine.getCopy();
      this.rightLinePointList = pointsRepresentingTheSingleLine.getCopy();
	   
      int distance = this.getLineDistance();
      
      for (int i = 1; i < pointsRepresentingTheSingleLine.size(); i++)
      {
         Point lastPoint = pointsRepresentingTheSingleLine.getPoint(i - 1);
         Point currentPoint = pointsRepresentingTheSingleLine.getPoint(i);

         // vector lastPoint -> currentPoint is (a,b)=(currentPoint.x - lastPoint.x, currentPoint.y
         // - lastPoint.y)
         // the vector length is Math.sqrt(a^2 + b^2)
         double vectorLength = Math.sqrt((currentPoint.x - lastPoint.x)
               * (currentPoint.x - lastPoint.x)
               + (currentPoint.y - lastPoint.y)
               * (currentPoint.y - lastPoint.y));

         // the vector that is orthogonal to (a,b) is (-b,a)=(lastPoint.y - currentPoint.y,
         // currentPoint.x - lastPoint.x)
         // we want a vector with the direction of (-b,a) but with the length of 1/2*distance and
         // thus we divide
         // the vector (-b,a) by its length (then the vector has the length 1) and multiply with
         // (1/2*distance + 1/2*lineWidth) to
         // reach the desired length; the new vector is (deltaX, deltaY)
         double deltaX = (lastPoint.y - currentPoint.y) / vectorLength; // has length = 1
         double deltaY = (currentPoint.x - lastPoint.x) / vectorLength; // has length = 1

         // stretch (deltaX, deltaY) to reach the desired length
         deltaX *= 0.5 * distance + 0.5 * this.getLineWidth();
         deltaY *= 0.5 * distance + 0.5 * this.getLineWidth();

         // the first (left) line of the current double line segment has to be moved in the direction of
         // vector (deltaX, deltaY)
         // and the other (right) in the direction of vector (-deltaX, -deltaY)

         translateLineSegment(this.leftLinePointList, i, lastPoint, currentPoint, deltaX,
               deltaY);
         translateLineSegment(this.rightLinePointList, i, lastPoint, currentPoint,
               -deltaX, -deltaY);
      }
   }
	
	/**
	 * Calculates the start and end point of the line segment that results from translating
	 * the line segment between the given points startPoint and endPoint using the given
	 * delta vector (deltaX, deltaY). Afterwards these calculated points are saved in the
	 * given point list at the indices endPointIndex-1 and endPointIndex. That's the reason
	 * why the given index has to be the index of the given end point in the original point
	 * list of this <code>DoublePolylineConnection</code>. Furthermore the given point list
	 * must not be empty and has to contain the calculated points for indices smaller than
	 * the given end point index.
	 * 
	 * @param translatedPoints the point list that contains the translated points
	 * @param endPointIndex    the index of the given end point in the original point list
	 * @param startPoint       the start point of the original line segment to be translated
	 * @param endPoint         the end point of the original line segment to be translated
	 * @param deltaX           the value that represents the translation in the direction of the x axis
	 * @param deltaY           the value that represents the translation in the direction of the y axis
	 */
	private void translateLineSegment(PointList translatedPoints, int endPointIndex, Point startPoint, Point endPoint, double deltaX, double deltaY)
	{
		double cx, cy, dx, dy; // (cx, cy) is lastPoint translated by (deltaX, deltaY) or (-deltaX, -deltaY)
		// (dx, dy) is currentPoint translated by (deltaX, deltaY) or (-deltaX, -deltaY)
		
		// calculate the points of the current line segment
		cx = Math.round(startPoint.x + deltaX);
		cy = Math.round(startPoint.y + deltaY);
		
		dx = Math.round(endPoint.x + deltaX);
		dy = Math.round(endPoint.y + deltaY);
		
		if (endPointIndex > 1) // not the first double line segment
		{
			double ax, ay, bx, by;
			
			// take the points of the last line segment
			ax = translatedPoints.getPoint(endPointIndex-2).x;
			ay = translatedPoints.getPoint(endPointIndex-2).y;
			
			bx = translatedPoints.getPoint(endPointIndex-1).x;
			by = translatedPoints.getPoint(endPointIndex-1).y;
			
			// calculate the intersection point of the line through (ax,ay) and (bx,by) and the line
			// through (cx,cy) and (dx,dy) and save it in (cx, cy)
			double lambda = (ax*by - ax*cy + ay*cx - ay*bx + bx*cy - by*cx) / ((dx-cx)*(by-ay) - (dy-cy)*(bx-ax));
			cx = Math.round(cx + lambda*(dx-cx));
			cy = Math.round(cy + lambda*(dy-cy));
		}

		// eventually corrects the previously saved point (bx,by)
		translatedPoints.setPoint(new Point(cx, cy), endPointIndex-1);
		// temporarily sets the point (dx,dy) that will be corrected in the next iteration step, if necessary
		translatedPoints.setPoint(new Point(dx, dy), endPointIndex);
	}

	/**
	 * @see org.eclipse.draw2d.PolylineConnection#getBounds()
	 */
	@Override
   public Rectangle getBounds()
	{
		if (this.bounds == null)
		{
			this.updatePointLists();
			this.bounds = this.leftLinePointList.getBounds().getExpanded(this.lineWidth / 2, this.lineWidth / 2);
			Rectangle boundsTemp = this.rightLinePointList.getBounds().getExpanded(this.lineWidth / 2, this.lineWidth / 2);
			this.bounds = this.bounds.union(boundsTemp);
			
			for (int i = 0; i < getChildren().size(); i++)
			{
				IFigure child = (IFigure) getChildren().get(i);
				this.bounds.union(child.getBounds());
			}
		}
		return this.bounds;
	}
}

/*
 * $Log$
 * Revision 1.3  2008/05/06 09:03:57  travkin
 * Added a new GEF figure for connections (suggested by Jörg Holtmann).
 *
 * Revision 1.2  2006/05/20 16:08:15  travkin
 * Removed some compile warnings.
 *
 * Revision 1.1  2006/02/17 19:02:53  travkin
 * Added doubled PolylineConnection, e.g. for PSPaths.
 *
 */