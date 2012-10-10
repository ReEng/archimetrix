/**
 * 
 */
package org.storydriven.modeling.interpreter.adapter.storypattern;

import java.util.ArrayList;
import java.util.List;

import org.storydriven.modeling.interpreter.adapter.SDMainAdapterFactory;
import org.storydriven.modeling.interpreter.adapter.m3.SDM3AdapterFactory;
import org.storydriven.modeling.interpreter.adapter.m3.SDPropertyAdapter;
import org.storydriven.modeling.patterns.Path;

import de.mdelab.sdm.interpreter.common.adapters.m3.IClassifierAdapter;
import de.mdelab.sdm.interpreter.common.adapters.storypattern.IStoryPatternLinkEndAdapter;
import de.mdelab.sdm.interpreter.common.adapters.storypattern.IStoryPatternObjectAdapter;

/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 *
 */
public class SDPathVariableAdapter extends SDAbstractLinkVariableAdapter<Path>
{
   
   protected List<IStoryPatternLinkEndAdapter> linkEndAdapters;

   public SDPathVariableAdapter(SDMainAdapterFactory mainAdapterFactory)
   {
      super(mainAdapterFactory);
   }

   @Override
   public List<IStoryPatternLinkEndAdapter> getLinkEndAdapters()
   {
      if (linkEndAdapters == null)
      {
         if (getElement() != null)
         {
            createLinkEndAdapters();
         }
      }

      return linkEndAdapters;
   }

   private void createLinkEndAdapters()
   {
      linkEndAdapters = new ArrayList<IStoryPatternLinkEndAdapter>();
      SDStoryPatternAdapterFactory storyPatternAdapterFactory = getMainAdapterFactory()
            .getSDStoryPatternAdapterFactory();
      SDM3AdapterFactory sdM3AdapterFactory = getMainAdapterFactory().getSDM3AdapterFactory();

      IStoryPatternObjectAdapter sourceSPOAdapter = storyPatternAdapterFactory
            .getStoryPatternObjectAdapter(getElement().getSource());

      SDPropertyAdapter sourcePropertyAdapter = sdM3AdapterFactory.getPathAdapter(getElement());

      SDStoryPatternLinkEndAdapter sourceLinkEndAdapter = storyPatternAdapterFactory.getStoryPatternLinkEndAdapter(
            getElement(), sourceSPOAdapter, sourcePropertyAdapter);
      linkEndAdapters.add(sourceLinkEndAdapter);
      
      // create non-navigable target link end
      IStoryPatternObjectAdapter targetSPOAdapter = storyPatternAdapterFactory
            .getStoryPatternObjectAdapter(getElement().getTarget());
      IClassifierAdapter targetClassifierAdapter = sdM3AdapterFactory.getClassifierAdapter(getElement()
            .getTarget().getType());

      SDPropertyAdapter targetPropertyAdapter = sdM3AdapterFactory.getNonNavigablePropertyAdapter(targetClassifierAdapter,
            sourcePropertyAdapter);

      SDStoryPatternLinkEndAdapter targetLinkEndAdapter = storyPatternAdapterFactory.getStoryPatternLinkEndAdapter(
            getElement(), targetSPOAdapter, targetPropertyAdapter);

      linkEndAdapters.add(targetLinkEndAdapter);
      
      
      /*
       * Set cross references between adapters
       */
      List<SDPropertyAdapter> oppositePropertyAdapters = new ArrayList<SDPropertyAdapter>(1);
      oppositePropertyAdapters.add(targetPropertyAdapter);

      sourcePropertyAdapter.setOppositePropertyAdapters(oppositePropertyAdapters);

      oppositePropertyAdapters = new ArrayList<SDPropertyAdapter>(1);
      oppositePropertyAdapters.add(sourcePropertyAdapter);

      targetPropertyAdapter.setOppositePropertyAdapters(oppositePropertyAdapters);
   }
}
