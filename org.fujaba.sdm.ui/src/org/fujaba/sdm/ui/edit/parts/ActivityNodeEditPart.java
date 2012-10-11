/**
 * 
 */
package org.fujaba.sdm.ui.edit.parts;

import org.fujaba.commons.edit.parts.AbstractNodeEditPart;
import org.storydriven.modeling.activities.ActivityNode;


/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 *
 */
public abstract class ActivityNodeEditPart extends AbstractNodeEditPart
{
   @Override
   public ActivityNode getRealModel()
   {
      return (ActivityNode) super.getRealModel();
   }
}
