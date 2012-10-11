package org.fujaba.commons.edit.parts;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.ConnectionEndpointLocator;
import org.eclipse.draw2d.ConnectionLocator;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.draw2d.RelativeBendpoint;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editpolicies.ConnectionEndpointEditPolicy;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.fujaba.commons.Commons4EclipseFonts;
import org.fujaba.commons.edit.policies.CommonBendPointEditPolicy;
import org.fujaba.commons.figures.utils.AdaptiveConnectionLocator;
import org.fujaba.commons.figures.utils.ConnectionDecorationFactory;
import org.fujaba.commons.notation.BendPoint;
import org.fujaba.commons.notation.Edge;
import org.fujaba.commons.notation.NotationPackage;
import org.fujaba.commons.notation.RelativeBendPoint;



/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 */
public class AbstractEdgeEditPart extends AbstractEdgeViewEditPart
{

   protected ConnectionEndpointLocator leftLocator = null;

   protected ConnectionEndpointLocator rightLocator = null;

   protected Label relationshipLabel;

   protected PolygonDecoration readingDirectionArrow;

   private int readingDirection;

   protected PolylineConnection connection;


   @Override
   protected void createEditPolicies()
   {
      installEditPolicy(EditPolicy.CONNECTION_ENDPOINTS_ROLE,
            new ConnectionEndpointEditPolicy());
      installEditPolicy(EditPolicy.CONNECTION_BENDPOINTS_ROLE,
            new CommonBendPointEditPolicy());
   }


   @Override
   protected IFigure createFigure()
   {
      connection = new PolylineConnection();
      setFigure(connection);

      return figure;
   }


   @Override
   public void notifyChanged(Notification notification)
   {
      int featureID = notification.getFeatureID(Edge.class);
      if (NotationPackage.EDGE__SOURCE_ANCHOR == featureID
            || NotationPackage.EDGE__TARGET_ANCHOR == featureID
            || NotationPackage.EDGE__VISIBLE == featureID
            || NotationPackage.EDGE__BEND_POINTS == featureID)
      {
         refreshBendpoints();
      }
   }


   /**
    * Places a label at the edge with normal text style.
    * 
    * @param text The text to place on the label.
    */
   protected void placeLabel(String text)
   {
      this.placeLabel(text, SWT.NORMAL);
   }


   /**
    * Places a label at the edge with the specified text and style.
    * 
    * @param text The text to place on the label.
    * @param style The text style for the label.
    */
   protected void placeLabel(String text, int style)
   {
      this.placeLabel(text, style, null);
   }


   /**
    * Places a label at the edge with the specified text, style and connection locator.
    * 
    * @param text The text to place on the label.
    * @param style The text style for the label.
    * @param locator An optional custom connection locator.
    */
   protected void placeLabel(String text, int style, ConnectionLocator locator)
   {
      if (relationshipLabel == null)
      {
         if (locator == null)
         {
            locator = new AdaptiveConnectionLocator(connection,
                  ConnectionLocator.MIDDLE, 6,
                  AdaptiveConnectionLocator.OFFSET_ABOVE);
            ((AdaptiveConnectionLocator) locator).setAxisBalance(0.75);
         }

         relationshipLabel = new Label(text);
         relationshipLabel.setTextAlignment(SWT.CENTER);
         connection.add(relationshipLabel, locator);
      }
      else
      {
         relationshipLabel.setText(text);
      }

      Font font = null;
      if (style == SWT.BOLD)
      {
         font = Commons4EclipseFonts
               .getFont(Commons4EclipseFonts.FONT_DEFAULT_BOLD);
      }
      else if (style == SWT.ITALIC)
      {
         font = Commons4EclipseFonts
               .getFont(Commons4EclipseFonts.FONT_DEFAULT_ITALIC);
      }
      else if (style == (SWT.BOLD | SWT.ITALIC))
      {
         font = Commons4EclipseFonts
               .getFont(Commons4EclipseFonts.FONT_DEFAULT_BOLD_ITALIC);
      }
      else
      { // SWT.NORMAL
         font = Commons4EclipseFonts
               .getFont(Commons4EclipseFonts.FONT_DEFAULT_NORMAL);
      }
      relationshipLabel.setFont(font);
   }


   /**
    * This method places the reading direction arrow.
    * 
    * @param toTarget Whether the reading direction is from source to target.
    */
   protected void placeReadingDirectionArrow(boolean toTarget)
   {
      this.placeReadingDirectionArrow(toTarget, ColorConstants.black,
            ColorConstants.black);
   }


   /**
    * This method places the reading direction arrow with customized colors.
    * 
    * @param toTarget Whether the reading direction is from source to target.
    * @param bg The background color.
    * @param fg The foreground color.
    */
   protected void placeReadingDirectionArrow(boolean toTarget, Color bg,
         Color fg)
   {
      int orientation = toTarget ? AdaptiveConnectionLocator.ORIENTATION_TARGET
            : AdaptiveConnectionLocator.ORIENTATION_SOURCE;

      if (readingDirectionArrow == null || readingDirection != orientation)
      {
         readingDirection = orientation;
         AdaptiveConnectionLocator relationshipLocator = new AdaptiveConnectionLocator(
               connection, ConnectionLocator.MIDDLE, 10,
               AdaptiveConnectionLocator.OFFSET_BELOW);
         relationshipLocator.setOrientation(orientation);
         relationshipLocator
               .setReference(AdaptiveConnectionLocator.REFERENCE_ABSOLUTE);
         relationshipLocator.setAxisBalance(0.75);

         if (readingDirectionArrow == null)
         {
            readingDirectionArrow = ConnectionDecorationFactory
                  .createDecoration(
                        ConnectionDecorationFactory.SMALL_CLOSED_ARROW, bg, fg);
         }
         connection.add(readingDirectionArrow, relationshipLocator);
      }

      readingDirectionArrow.setForegroundColor(fg);
      readingDirectionArrow.setBackgroundColor(bg);
   }


   /**
    * Refreshes the bendpoints owned by the EditPart's <code>Edge</code>.
    */
   protected void refreshBendpoints()
   {
      List<BendPoint> bendpoints = getModel().getBendPoints();
      if (bendpoints == null || bendpoints.isEmpty())
      {
         getConnectionFigure().setRoutingConstraint(Collections.emptyList());
         return;
      }

      List<RelativeBendpoint> figureConstraint = new ArrayList<RelativeBendpoint>();

      int index = 0;
      for (BendPoint bp : bendpoints)
      {
         if (bp instanceof RelativeBendPoint)
         {
            RelativeBendPoint wbp = (RelativeBendPoint) bp;
            RelativeBendpoint rbp = new RelativeBendpoint(getConnectionFigure());

            rbp.setRelativeDimensions(
                  new Dimension(wbp.getSourceX(), wbp.getSourceY()),
                  new Dimension(wbp.getTargetX(), wbp.getTargetY()));
            if (bendpoints.size() == 1)
            {
               rbp.setWeight(0.5f);
            }
            else
            {
               rbp.setWeight(index / ((float) bendpoints.size() - 1));
            }
            figureConstraint.add(rbp);
            index++;
         }
      }

      getConnectionFigure().setRoutingConstraint(figureConstraint);
   }


   @Override
   protected void refreshVisuals()
   {
      refreshBendpoints();
   }


   protected void removeLabel()
   {
      if (relationshipLabel != null)
      {
         connection.remove(relationshipLabel);
         relationshipLabel = null;
      }
   }


   protected void removeReadingDirectionArrow()
   {
      if (readingDirectionArrow != null)
      {
         connection.remove(readingDirectionArrow);
         readingDirectionArrow = null;
      }
   }
}
