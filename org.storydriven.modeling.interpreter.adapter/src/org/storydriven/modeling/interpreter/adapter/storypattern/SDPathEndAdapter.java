/**
 * 
 */
package org.storydriven.modeling.interpreter.adapter.storypattern;

import org.storydriven.modeling.interpreter.adapter.SDMainAdapterFactory;
import org.storydriven.modeling.patterns.AbstractLinkVariable;
import org.storydriven.modeling.patterns.Path;

import de.mdelab.sdm.interpreter.common.adapters.m3.IInstanceAdapter;
import de.mdelab.sdm.interpreter.common.adapters.m3.IPropertyAdapter;
import de.mdelab.sdm.interpreter.common.adapters.storypattern.IStoryPatternObjectAdapter;
import de.mdelab.sdm.interpreter.common.variables.VariableScope;

/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 *
 */
public class SDPathEndAdapter extends SDAbstractLinkVariableEndAdapter<Path>
{

   public SDPathEndAdapter(SDMainAdapterFactory mainAdapterFactory,
         SDAbstractLinkVariableAdapter<? extends AbstractLinkVariable> storyPatternLinkAdapter,
         IStoryPatternObjectAdapter targetStoryPatternObjectAdapter, IPropertyAdapter propertyAdapter)
   {
      super(mainAdapterFactory, storyPatternLinkAdapter, targetStoryPatternObjectAdapter, propertyAdapter);
   }

   @Override
   public IInstanceAdapter getInstanceAdapter(VariableScope variableScope)
   {
      IStoryPatternObjectAdapter spo = this.getStoryPatternObjectAdapter();
      IInstanceAdapter instance = null;
      if (spo != null)
      {
         instance = variableScope.getVariable(spo.getName()).getValueAdapter();
      }

      return instance;
   }

   @Override
   public IInstanceAdapter getKeyInstanceAdapter(VariableScope variableScope)
   {
      //a Path is never qualified
      return null;
   }

}
