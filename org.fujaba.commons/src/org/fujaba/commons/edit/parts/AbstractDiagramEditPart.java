package org.fujaba.commons.edit.parts;


import java.util.List;

import org.eclipse.draw2d.AutomaticRouter;
import org.eclipse.draw2d.BendpointConnectionRouter;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.ConnectionLayer;
import org.eclipse.draw2d.ConnectionRouter;
import org.eclipse.draw2d.FanRouter;
import org.eclipse.draw2d.FreeformLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.ScalableFreeformLayeredPane;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.LayerConstants;
import org.fujaba.commons.notation.HierarchicalNode;
import org.fujaba.commons.notation.Node;
import org.fujaba.commons.notation.NotationPackage;



/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 */
public abstract class AbstractDiagramEditPart extends AbstractNodeEditPart
{
   /**
    * Creates and returns the {@link ConnectionRouter} to be used in this diagram's figure. This
    * method is called by the {@link #createFigure()} method to create the router.
    * 
    * @return the router for connections
    */
   protected ConnectionRouter createConnectionRouter()
   {
      AutomaticRouter router = new FanRouter();
      router.setNextRouter(new BendpointConnectionRouter());
      return router;
   }


   /**
    * Creates a {@link ScalableFreeformLayeredPane} to be used as this EditPart's figure.
    * 
    * @see org.eclipse.gef.editparts.AbstractGraphicalEditPart#createFigure()
    */
   @Override
   protected IFigure createFigure()
   {
      ScalableFreeformLayeredPane f = new ScalableFreeformLayeredPane();
      f.setBackgroundColor(ColorConstants.white);
      f.setOpaque(true);
      f.setLayoutManager(new FreeformLayout());

      MarginBorder marginBorder = new MarginBorder(5, 5, 5, 5);
      f.setBorder(marginBorder);

      // set connection router
      ConnectionLayer cLayer = (ConnectionLayer) getLayer(LayerConstants.CONNECTION_LAYER);
      cLayer.setConnectionRouter(createConnectionRouter());

      return f;
   }


   @Override
   public HierarchicalNode getModel()
   {
      return (HierarchicalNode) super.getModel();
   }


   @Override
   protected List<Node> getModelChildren()
   {
      return getModel().getNodes();
   }


   @Override
   public void notifyChanged(Notification notification)
   {
      int fid = notification.getFeatureID(HierarchicalNode.class);
      if (fid == NotationPackage.HIERARCHICAL_NODE__OUTGOING
            || fid == NotationPackage.HIERARCHICAL_NODE__INCOMING)
      {
         refreshSourceConnections();
         refreshTargetConnections();
      }
      else if (fid == NotationPackage.HIERARCHICAL_NODE__PARENT
            || fid == NotationPackage.HIERARCHICAL_NODE__MODEL
            || fid == NotationPackage.HIERARCHICAL_NODE__NODES
            || fid == NotationPackage.HIERARCHICAL_NODE__EDGES)
      {
         refresh();
      }
      else if (fid == NotationPackage.HIERARCHICAL_NODE__VISIBLE
            || fid == NotationPackage.HIERARCHICAL_NODE__X
            || fid == NotationPackage.HIERARCHICAL_NODE__Y
            || fid == NotationPackage.HIERARCHICAL_NODE__WIDTH
            || fid == NotationPackage.HIERARCHICAL_NODE__HEIGHT)
      {
         refreshVisuals();
      }
   }
}
