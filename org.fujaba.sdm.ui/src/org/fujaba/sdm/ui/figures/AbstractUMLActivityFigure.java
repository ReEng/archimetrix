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
package org.fujaba.sdm.ui.figures;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.FreeformLayer;
import org.eclipse.draw2d.FreeformLayout;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.draw2d.geometry.Rectangle;
import org.fujaba.commons.figures.NodeFigure;



/**
 * @author    Dietrich Travkin (travkin)
 * @author    Last editor: $Author: travkin $
 * @version   $Revision: 1832 $ $Date: 2009-06-25 17:38:46 +0200 (Do, 25 Jun 2009) $
 */
public class AbstractUMLActivityFigure extends NodeFigure
{

   /**
    * No comment provided by developer, please add a comment to improve documentation.
    */
   public final static int EDGE_RADIUS = 15;

   /**
    * No comment provided by developer, please add a comment to improve documentation.
    */
   protected IFigure pane;


   /**
    * Constructor for class UMLClassFigure
    */
   public AbstractUMLActivityFigure()
   {
//      UMLActivityLayout layout = new UMLActivityLayout();
      setLayoutManager (new XYLayout());
      this.setBackgroundColor (ColorConstants.white);
      this.setForegroundColor (ColorConstants.black);
      this.setOpaque (true);
      this.setAntialias(true);
   }


   /**
    * Sets the contentsPane attribute of the AbstractUMLActivityFigure object
    *
    * @param figure  The new contentsPane value
    */
   public void setContentsPane (IFigure figure)
   {
      if (pane != null)
      {
         remove (pane);
      }
      pane = figure;
      add (pane);
   }


   /**
    * Get the contentsPane attribute of the UMLStoryActivityFigure object
    *
    * @return   The contentsPane value
    */
   public IFigure getContentsPane()
   {
      if (pane == null)
      {
         pane = new FreeformLayer();
         pane.setLayoutManager (new FreeformLayout());

         this.add (pane);
      }
      return pane;
   }


   /**
    * No comment provided by developer, please add a comment to improve documentation.
    *
    * @return   No description provided
    */
   @Override
   protected boolean useLocalCoordinates()
   {
      return true;
   }


   /**
    * Get the insets attribute of the AbstractUMLActivityFigure object
    *
    * @return   The insets value
    */
   @Override
   public Insets getInsets()
   {
      return new Insets (EDGE_RADIUS / 2, EDGE_RADIUS / 2, EDGE_RADIUS / 2, EDGE_RADIUS / 2);
   }


   /**
    * No comment provided by developer, please add a comment to improve documentation.
    *
    * @param graphics  No description provided
    */
   @Override
   protected void paintFigure (Graphics graphics)
   {
      if (isOpaque())
      {
         int size = EDGE_RADIUS * 2;
         Rectangle rect = new Rectangle (getBounds().x, getBounds().y, getBounds().width - 1, getBounds().height - 1);

         graphics.fillRoundRectangle (this.getBounds(), size, size);

         graphics.drawRoundRectangle (rect, size, size);
      }
   }


   /**
    * @param wHint  No description provided
    * @param hHint  No description provided
    * @return       The minimumSize value
    * @see          org.eclipse.draw2d.IFigure#getMinimumSize(int, int)
    */
   @Override
   public Dimension getMinimumSize (int wHint, int hHint)
   {
      return getPreferredSize (wHint, hHint);
   }
}

/*
 * $Log$
 * Revision 1.5  2006/05/22 17:11:34  travkin
 * Removed most compile warnings.
 *
 * Revision 1.4  2006/04/11 17:07:05  travkin
 * Changed some javadoc comments.
 *
 */
