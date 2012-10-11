package org.fujaba.commons.edit.parts;


import java.util.List;

import org.eclipse.draw2d.ChopboxAnchor;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.ConnectionEditPart;
import org.eclipse.gef.NodeEditPart;
import org.eclipse.gef.Request;
import org.fujaba.commons.figures.LineBorderedRoundedRectangleFigure;
import org.fujaba.commons.notation.Node;
import org.fujaba.commons.notation.NotationPackage;



/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 */
public abstract class AbstractNodeEditPart extends AbstractNodeViewEditPart
      implements NodeEditPart
{

   protected ConnectionAnchor anchor;


   @Override
   protected IFigure createFigure()
   {
      /*
       * this is just a white rectangle figure with a black border overwrite and change this to as
       * you like
       */
      figure = new LineBorderedRoundedRectangleFigure(10, 10);
      figure.setForegroundColor(ColorConstants.black);
      figure.setBounds(new Rectangle(5, 5, 20, 20));

      return figure;
   }


   protected ConnectionAnchor getAnchor()
   {
      if (anchor == null)
      {
         anchor = new ChopboxAnchor(figure);
      }
      return anchor;
   }


   @Override
   public Node getModel()
   {
      return (Node) super.getModel();
   }


   @Override
   protected List<?> getModelSourceConnections()
   {
      return getModel().getOutgoing();
   }


   @Override
   protected List<?> getModelTargetConnections()
   {
      return getModel().getIncoming();
   }


   public ConnectionAnchor getSourceConnectionAnchor(
         ConnectionEditPart connection)
   {
      return getAnchor();
   }


   public ConnectionAnchor getSourceConnectionAnchor(Request request)
   {
      return getAnchor();
   }


   public ConnectionAnchor getTargetConnectionAnchor(
         ConnectionEditPart connection)
   {
      return getAnchor();
   }


   public ConnectionAnchor getTargetConnectionAnchor(Request request)
   {
      return getAnchor();
   }


   @Override
   public void notifyChanged(Notification notification)
   {
      int featureID = notification.getFeatureID(Node.class);
      if (NotationPackage.NODE__X == featureID
            || NotationPackage.NODE__Y == featureID
            || NotationPackage.NODE__WIDTH == featureID
            || NotationPackage.NODE__HEIGHT == featureID
            || NotationPackage.NODE__VISIBLE == featureID
            || NotationPackage.NODE__PARENT == featureID)
      {
         refreshVisuals();
      }
      else if (NotationPackage.NODE__INCOMING == featureID
            || NotationPackage.NODE__OUTGOING == featureID)
      {
         refreshSourceConnections();
         refreshTargetConnections();
      }
   }


   @Override
   protected void refreshVisuals()
   {
      Rectangle rect = new Rectangle();

      if (getModel() != null)
      {
         rect.height = getModel().getHeight();
         rect.width = getModel().getWidth();
         rect.x = getModel().getX();
         rect.y = getModel().getY();
         Dimension min = getMinimumSize();
         if (min != null)
         {
            if (rect.height < min.height)
            {
               rect.height = min.height;
            }
            if (rect.width < min.width)
            {
               rect.width = min.width;
            }
         }
         getFigure().setBounds(rect);
      }

      // change parent constraint to get scroll bars on views
      if (getParent() != null && getParent() instanceof AbstractNodeEditPart)
      {
         ((AbstractNodeEditPart) getParent()).setLayoutConstraint(this,
               getFigure(), rect);
      }
   }


   /**
    * Resizes the part's figure to the preferred size.
    */
   public Dimension getPreferredSize()
   {
      return getFigure().getPreferredSize();
   }


   /**
    * Resizes the part's figure to the minimum size.
    */
   public Dimension getMinimumSize()
   {
      return getFigure().getMinimumSize();
   }
}
