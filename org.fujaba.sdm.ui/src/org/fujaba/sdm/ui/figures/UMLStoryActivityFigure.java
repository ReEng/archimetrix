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


import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.draw2d.geometry.Rectangle;
import org.fujaba.commons.figures.LabelFigure;
import org.fujaba.commons.figures.UMLStereotypeFigure;



/**
 * @author Dietrich Travkin (travkin)
 * @version $Revision: 1832 $ $Date: 2009-06-25 17:38:46 +0200 (Do, 25 Jun 2009) $
 */
public class UMLStoryActivityFigure extends AbstractUMLActivityFigure
{
   private final static int FOR_EACH_DELTA = 10;

   private boolean isForEach = false;

   private CompartmentFigure stereotypes = new CompartmentFigure(
         ToolbarLayout.ALIGN_CENTER);

   private boolean stereotypesExist = false;
   
   private LabelFigure label;


   /**
    * UMLStoryActivityFigure constructor
    * 
    */
   public UMLStoryActivityFigure()
   {
      super();
      this.stereotypes.setVisible(false);
      this.stereotypes.setBorder(null);
      add(this.stereotypes);
      
      label = new LabelFigure("some name");
      label.setOpaque (true);
      label.setBounds(new Rectangle(20, 20, 200, 30));
      label.setAutosized(true);
      add(label);
   }


   /**
    * @see org.eclipse.draw2d.Figure#paintFigure(org.eclipse.draw2d.Graphics)
    */
   @Override
   protected void paintFigure(Graphics graphics)
   {
      if (isForEach)
      {
         // ________________
         // |outerRect |
         // ___|____________ |
         // |innerRect |__|
         // | |
         // |______________|
        
         int size = EDGE_RADIUS * 2;

         Rectangle outerRect1 = new Rectangle(getBounds().x + FOR_EACH_DELTA,
               getBounds().y, getBounds().width - FOR_EACH_DELTA,
               getBounds().height - FOR_EACH_DELTA);
         Rectangle outerRect2 = new Rectangle(getBounds().x + FOR_EACH_DELTA,
               getBounds().y, getBounds().width - FOR_EACH_DELTA - 1,
               getBounds().height - FOR_EACH_DELTA - 1);

         graphics.fillRoundRectangle(outerRect1, size - 2, size - 2);
         graphics.drawRoundRectangle(outerRect2, size, size);

         Rectangle innerRect1 = new Rectangle(getBounds().x, getBounds().y
               + FOR_EACH_DELTA, getBounds().width - FOR_EACH_DELTA,
               getBounds().height - FOR_EACH_DELTA);
         Rectangle innerRect2 = new Rectangle(getBounds().x, getBounds().y
               + FOR_EACH_DELTA, getBounds().width - FOR_EACH_DELTA - 1,
               getBounds().height - FOR_EACH_DELTA - 1);

         graphics.fillRoundRectangle(innerRect1, size - 2, size - 2);
         graphics.drawRoundRectangle(innerRect2, size - 2, size - 2);
      }
      else
      {
         super.paintFigure(graphics);
      }
   }


   public void setIsForEach(boolean b)
   {
      isForEach = b;
   }


   /**
    * @see org.eclipse.draw2d.IFigure#getInsets()
    */
   @Override
   public Insets getInsets()
   {
      Insets i = super.getInsets();
      if (isForEach)
      {
         i.top += FOR_EACH_DELTA;
         i.right += FOR_EACH_DELTA;
         return i;
      }
      return i;
   }


   public void removeFromStereotypes(UMLStereotypeFigure stereo)
   {
      this.stereotypes.getContentsPane().remove(stereo);
      if (this.stereotypes.getContentsPane().getChildren().size() == 0)
      {
         this.stereotypes.setVisible(false);
         this.stereotypesExist = false;
      }
   }


   public void addToStereotypes(UMLStereotypeFigure stereotype)
   {
      if (!this.stereotypesExist)
      {
         this.stereotypesExist = true;
         this.stereotypes.setVisible(true);
      }
      this.stereotypes.getContentsPane().add(stereotype);
   }


   public CompartmentFigure getStereotypes()
   {
      return stereotypes;
   }


   public int getStereotypesCount()
   {
      return this.stereotypes.getContentsPane().getChildren().size();
   }
   
   public void setName (String name)
   {
      label.setText (name);
   }

}

/*
 * $Log$
 * Revision 1.7  2007/02/06 15:32:59  mm
 * display stereotypes in story activities [patch by rafald]
 * Revision 1.6 2007/01/15 09:26:51 mtt revoked patch to show
 * stereotypes due to problems concerning the size of the embedded story pattern
 * 
 * Revision 1.4 2006/04/11 17:07:05 travkin Changed some javadoc comments.
 * 
 * Revision 1.3 2006/03/01 16:21:44 lowende Replaced all direct constructor calls of model element
 * by factory calls.
 * 
 */
