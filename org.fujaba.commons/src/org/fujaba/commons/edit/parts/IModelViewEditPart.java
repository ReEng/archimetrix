package org.fujaba.commons.edit.parts;


import org.eclipse.emf.ecore.EObject;
import org.fujaba.commons.notation.DiagramElement;



/**
 * An interface that holds common access methods to the editpart's model and view.
 * 
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 */
public interface IModelViewEditPart
{
   /**
    * @return Returns the View model of this' editpart.
    */
   public DiagramElement getModel();


   /**
    * Fetches the semantic model of this editpart. <br>
    * Equivalent to the call <code>getModel().getElement();</code>
    * 
    * @return Returns the model, which is beneath this' view model.
    */
   public EObject getRealModel();
}
