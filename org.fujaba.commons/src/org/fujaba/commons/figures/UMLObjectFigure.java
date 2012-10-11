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
package org.fujaba.commons.figures;


import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.SWT;
import org.fujaba.commons.Commons4EclipseFonts;



/**
 * @author Dietrich Travkin (travkin)
 * @author Last editor: $Author: travkin $
 * @version $Revision: 1907 $ $Date: 2009-12-17 11:33:58 +0100 (Do, 17 Dez 2009) $
 */
public class UMLObjectFigure extends
      LineBorderedRectangleWithCompartmentsFigure
{
   public final static String COMPARTMENT_STEREOTYPES = "stereotypes";

   public final static String COMPARTMENT_NAME = "name";

   public final static String COMPARTMENT_ATTR_EXPR = "attributes";

   private LabelFigure myLabel;

   private LabelFigure create_destroy_label;

   private boolean isNegative = false;


   public UMLObjectFigure(String name)
   {
      setBorder(new RectangleBorder(ColorConstants.black, 1));
      setBackgroundColor(ColorConstants.white);
      setForegroundColor(ColorConstants.black);

      addCompartment(COMPARTMENT_STEREOTYPES, SWT.NONE, 0);
      addCompartment(COMPARTMENT_NAME, SWT.LINE_SOLID, 1);
      addCompartment(COMPARTMENT_ATTR_EXPR, SWT.LINE_SOLID, 1);

      this.myLabel = new LabelFigure("", Commons4EclipseFonts
            .getFont(Commons4EclipseFonts.FONT_DEFAULT_BOLD));
      this.myLabel.setUnderlined(true);

      MarginBorder border = new MarginBorder(2, 5, 2, 5);
      this.myLabel.setBorder(border);

      addFigureToCompartment(COMPARTMENT_NAME, this.myLabel);

      this.create_destroy_label = new LabelFigure("");

      setOpaque(true);
   }


   public void addToAttributes(LabelFigure attr)
   {
      attr.setLabelAlignment(PositionConstants.LEFT);
      addFigureToCompartment(COMPARTMENT_ATTR_EXPR, attr);
   }


   public void removeFromAttributes(LabelFigure attr)
   {
      removeFigureFromCompartment(COMPARTMENT_ATTR_EXPR, attr);
   }


   public void addToStereotypes(UMLStereotypeFigure stereotype)
   {
      addFigureToCompartment(COMPARTMENT_STEREOTYPES, stereotype);
   }


   public void removeFromStereotypes(UMLStereotypeFigure stereotype)
   {
      removeFigureFromCompartment(COMPARTMENT_STEREOTYPES, stereotype);
   }


   public String getName()
   {
      return this.myLabel.getText();
   }


   public void setName(String name)
   {
      this.myLabel.setText(name);
   }


   public LabelFigure getLabel()
   {
      return this.myLabel;
   }


   /**
    * @see org.eclipse.draw2d.Figure#paintFigure(org.eclipse.draw2d.Graphics)
    */
   @Override
   public void paint(Graphics graphics)
   {
      super.paint(graphics);

      if (this.isNegative)
      {
         Rectangle bounds = getBounds();
         graphics.drawLine(bounds.x, bounds.y + bounds.height, bounds.x
               + bounds.width, bounds.y);
         graphics.drawLine(bounds.x, bounds.y, bounds.x + bounds.width,
               bounds.y + bounds.height);
      }
   }


   public void setDashedLine(boolean dashedLine)
   {
      if (dashedLine)
      {
         setBorderLineStyle(SWT.LINE_DASH);
      }
      else
      {
         setBorderLineStyle(SWT.LINE_SOLID);
      }
   }


   public void setIsNegative(boolean b)
   {
      this.isNegative = b;
   }


   private ShadowDecoratorFigure shadowDecorator;


   public void setShadowed(boolean shadowed)
   {
      if (shadowed)
      {
         this.shadowDecorator = new ShadowDecoratorFigure(this,
               ShadowDecoratorFigure.DEFAULT_OFFSET,
               -ShadowDecoratorFigure.DEFAULT_OFFSET);
         this.shadowDecorator.setOpaque(true);
      }
      else
      {
         if (this.shadowDecorator != null)
         {
            this.shadowDecorator.removeDecorator();
            this.shadowDecorator = null;
         }
      }
   }


   public void setIsSet(boolean b)
   {
      setShadowed(b);
   }


   /**
    * @see org.eclipse.draw2d.Figure#getMinimumSize(int, int)
    */
   @Override
   public Dimension getMinimumSize(int wHint, int hHint)
   {
      Dimension nameSize = getCompartment(COMPARTMENT_NAME).getPreferredSize(
            wHint, hHint);
      Dimension stereotypeSize = getCompartment(COMPARTMENT_STEREOTYPES)
            .getPreferredSize(wHint, hHint);

      Dimension size = new Dimension(nameSize);
      size.height += stereotypeSize.height;
      size.width = Math.max(nameSize.width, stereotypeSize.width);

      return new Dimension(size.width + 10, size.height + 2);
   }


   /**
    * @see org.eclipse.draw2d.IFigure#getPreferredSize(int, int)
    */
   @Override
   public Dimension getPreferredSize(int wHint, int hHint)
   {
      return super.getPreferredSize(wHint, hHint).getCopy().expand(10, 2);
   }


   public LabelFigure getNameLabel()
   {
      return this.myLabel;
   }


   public LabelFigure getCreateOrDeleteLabel()
   {
      return this.create_destroy_label;
   }


   /**
    * With this Method you can set the <<create>> and <<destroy>>-Label visible or not.
    * 
    * @param visible true=visible, false=not visible
    * 
    */
   public void setCreateOrDeleteLableVisible(boolean visible)
   {
      if (visible == true)
      {
         addFigureToCompartment(COMPARTMENT_NAME, this.create_destroy_label, 0);
      }
      else
      {
         removeFigureFromCompartment(COMPARTMENT_NAME,
               this.create_destroy_label);
      }
   }
}
