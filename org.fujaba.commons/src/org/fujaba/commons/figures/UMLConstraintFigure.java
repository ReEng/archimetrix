package org.fujaba.commons.figures;



/**
 * UML 2.0 constraint.
 * 
 * @author Dietrich Travkin (travkin)
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 */
public class UMLConstraintFigure extends LabelFigure
{
   /**
    *Constructor for class UMLConstraintFigure
    * 
    * @param name The contraint name.
    */
   public UMLConstraintFigure(String name)
   {
      super("{ " + name + " }");
   }


   /**
    * Sets the text attribute of the UMLConstraintFigure object.
    * 
    * @param text The new text value.
    */
   @Override
   public void setText(String text)
   {
      super.setText("{ " + text + " }");
   }
}
