/**
 * 
 */
package org.storydriven.modeling.interpreter.adapter.storypattern;

import org.storydriven.modeling.interpreter.adapter.SDMainAdapterFactory;
import org.storydriven.modeling.patterns.AbstractLinkVariable;

import de.mdelab.sdm.interpreter.common.adapters.m3.IPropertyAdapter;
import de.mdelab.sdm.interpreter.common.adapters.storypattern.IStoryPatternLinkEndAdapter;
import de.mdelab.sdm.interpreter.common.adapters.storypattern.IStoryPatternObjectAdapter;

/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 *
 */
public abstract class SDAbstractLinkVariableEndAdapter<ELEMENT_TYPE extends AbstractLinkVariable> extends
      SDAbstractStoryPatternAdapter<ELEMENT_TYPE> implements IStoryPatternLinkEndAdapter
{

   private SDAbstractLinkVariableAdapter<? extends AbstractLinkVariable> storyPatternLinkAdapter;

   private IStoryPatternObjectAdapter targetStoryPatternObjectAdapter;

   private IPropertyAdapter propertyAdapter;


   public SDAbstractLinkVariableEndAdapter(SDMainAdapterFactory mainAdapterFactory,
         SDAbstractLinkVariableAdapter<? extends AbstractLinkVariable> storyPatternLinkAdapter,
         IStoryPatternObjectAdapter targetStoryPatternObjectAdapter, IPropertyAdapter propertyAdapter)
   {
      super(mainAdapterFactory);

      assert storyPatternLinkAdapter != null;
      assert targetStoryPatternObjectAdapter != null;
      assert propertyAdapter != null;

      this.storyPatternLinkAdapter = storyPatternLinkAdapter;
      this.targetStoryPatternObjectAdapter = targetStoryPatternObjectAdapter;
      this.propertyAdapter = propertyAdapter;
   }


   @Override
   public SDAbstractLinkVariableAdapter<? extends AbstractLinkVariable> getStoryPatternLinkAdapter()
   {
      return storyPatternLinkAdapter;
   }


   @Override
   public IStoryPatternObjectAdapter getStoryPatternObjectAdapter()
   {
      return targetStoryPatternObjectAdapter;
   }


   @Override
   public IPropertyAdapter getPropertyAdapter()
   {
      return propertyAdapter;
   }

}
