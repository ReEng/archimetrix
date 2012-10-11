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


import org.eclipse.draw2d.AbstractBorder;
import org.eclipse.draw2d.BorderLayout;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Layer;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.geometry.Insets;


/**
 * @author mm
 * @author Last editor: $Author: lowende $
 * @version $Revision: 1127 $ $Date: 2006-10-11 14:06:02 +0200 (Mi, 11 Okt 2006) $
 */
public class CompartmentFigure extends Figure
{

   private IFigure contentsPane;


   public CompartmentFigure(int alignment)
   {
      ToolbarLayout layout = new ToolbarLayout();
      layout.setMinorAlignment(alignment);
      layout.setStretchMinorAxis(false);

      this.contentsPane = new Layer();
      this.contentsPane.setLayoutManager(layout);

      this.setLayoutManager(new BorderLayout());
      this.add(this.contentsPane, BorderLayout.CENTER);
      this.setBorder(new CompartmentFigureBorder());
   }


   public CompartmentFigure()
   {
      this(ToolbarLayout.ALIGN_TOPLEFT);
   }


   public IFigure getContentsPane()
   {
      return this.contentsPane;
   }


   public static class CompartmentFigureBorder extends AbstractBorder
   {

      /**
       * @see org.eclipse.draw2d.Border#getInsets(org.eclipse.draw2d.IFigure)
       */
      public Insets getInsets(IFigure figure)
      {
         return new Insets(1, 0, 1, 0);
      }


      /**
       * @see org.eclipse.draw2d.Border#paint(org.eclipse.draw2d.IFigure,
       *      org.eclipse.draw2d.Graphics, org.eclipse.draw2d.geometry.Insets)
       */
      public void paint(IFigure figure, Graphics graphics, Insets insets)
      {
         graphics.drawLine(getPaintRectangle(figure, insets).getTopLeft(),
               tempRect.getTopRight());
      }
   }

}
