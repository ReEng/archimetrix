package org.fujaba.commons.figures;



/**
 * UML 2.0 style stereotype label.
 * 
 * @author Dietrich Travkin (travkin)
 * @version $Revision$ $Date$
 */
public class UMLStereotypeFigure extends LabelFigure
{

   public UMLStereotypeFigure(String name)
   {
      super("\u00ab" + name + "\u00bb");
   }


   /**
    * @see de.uni_paderborn.commons4eclipse.gef.figures.LabelFigure#setName(java.lang.String)
    */
   @Override
   public void setName(String name)
   {
      super.setName("\u00ab" + name + "\u00bb");
   }

}
