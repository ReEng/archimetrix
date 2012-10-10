/**
 * 
 */
package org.storydriven.modeling.interpreter.adapter.storypattern;

import org.eclipse.emf.common.notify.Notifier;
import org.storydriven.modeling.interpreter.adapter.SDMainAdapterFactory;
import org.storydriven.modeling.patterns.ObjectSetVariable;

/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 *
 */
public class SDObjectSetVariableAdapter extends SDObjectVariableAdapter
{

   public SDObjectSetVariableAdapter(SDMainAdapterFactory mainAdapterFactory)
   {
      super(mainAdapterFactory);
   }

   @Override
   public void setTarget(Notifier newTarget)
   {
      super.setTarget(newTarget);
   }

   @Override
   protected ObjectSetVariable getElement()
   {
      return (ObjectSetVariable) super.getElement();
   }

}
