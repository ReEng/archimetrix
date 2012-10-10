package org.storydriven.modeling.interpreter.adapter.storypattern;


import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EReference;
import org.storydriven.modeling.interpreter.adapter.SDMainAdapterFactory;
import org.storydriven.modeling.interpreter.adapter.m3.SDM3AdapterFactory;
import org.storydriven.modeling.interpreter.adapter.m3.SDMapEntryReferencePropertyAdapter;
import org.storydriven.modeling.interpreter.adapter.m3.SDPropertyAdapter;
import org.storydriven.modeling.patterns.LinkVariable;

import de.mdelab.sdm.interpreter.common.adapters.m3.IClassifierAdapter;
import de.mdelab.sdm.interpreter.common.adapters.storypattern.IStoryPatternLinkEndAdapter;
import de.mdelab.sdm.interpreter.common.adapters.storypattern.IStoryPatternObjectAdapter;


public class SDLinkVariableAdapter extends SDAbstractLinkVariableAdapter<LinkVariable>
{
   protected List<IStoryPatternLinkEndAdapter> linkEndAdapters;


   public SDLinkVariableAdapter(SDMainAdapterFactory mainAdapterFactory)
   {
      super(mainAdapterFactory);
   }


   @Override
   public List<IStoryPatternLinkEndAdapter> getLinkEndAdapters()
   {
      if (linkEndAdapters == null)
      {
         if (getElement().getQualifierExpression() != null)
         {
            createQualifiedLinkEndAdapters();
         }
         else
         {
            createLinkEndAdapters();
         }
      }

      return linkEndAdapters;
   }


   protected void createQualifiedLinkEndAdapters()
   {
      linkEndAdapters = new ArrayList<IStoryPatternLinkEndAdapter>(3);

      SDStoryPatternAdapterFactory storyPatternAdapterFactory = getMainAdapterFactory()
            .getSDStoryPatternAdapterFactory();
      SDM3AdapterFactory sdM3AdapterFactory = getMainAdapterFactory().getSDM3AdapterFactory();

      EReference mapEntryReference = getElement().getTargetEnd();

      /*
       * add source link end adapter
       */

      SDMapEntryReferencePropertyAdapter sourcePropertyAdapter = sdM3AdapterFactory
            .getMapEntryReferencePropertyAdapter(mapEntryReference);

      SDStoryPatternLinkEndAdapter sourceLinkEndAdapter = storyPatternAdapterFactory.getStoryPatternLinkEndAdapter(
            getElement(), storyPatternAdapterFactory.getStoryPatternObjectAdapter(getElement().getSource()),
            sourcePropertyAdapter);

      linkEndAdapters.add(sourceLinkEndAdapter);

      /*
       * get key and value types
       */
      EClass mapEntryEClass = (EClass) mapEntryReference.getEType();

      EClassifier keyClassifier = mapEntryEClass.getEStructuralFeature("key").getEType();

      /*
       * add map entry key link end adapter
       */
      IClassifierAdapter keyClassifierAdapter = sdM3AdapterFactory.getClassifierAdapter(keyClassifier);

      SDPropertyAdapter keyPropertyAdapter = sdM3AdapterFactory.getMapEntryKeyPropertyAdapter(keyClassifierAdapter,
            sourcePropertyAdapter);

      SDStoryPatternLinkEndAdapter keyLinkEndAdapter = storyPatternAdapterFactory.getStoryPatternLinkEndAdapter(
            getElement(), null, keyPropertyAdapter);
      keyLinkEndAdapter.setTarget(this.getElement());

      linkEndAdapters.add(keyLinkEndAdapter);

      /*
       * Create lists of the opposite property adapters
       */
      List<SDPropertyAdapter> referenceOppositePropertyAdapters = new ArrayList<SDPropertyAdapter>(2);
      referenceOppositePropertyAdapters.add(keyPropertyAdapter);

      List<SDPropertyAdapter> keyOppositePropertyAdapters = new ArrayList<SDPropertyAdapter>(2);
      keyOppositePropertyAdapters.add(sourcePropertyAdapter);

      /*
       * add map entry value link end adapter
       */
      if (getElement().getTarget() != null)
      {
         EClassifier valueClassifier = mapEntryEClass.getEStructuralFeature("value").getEType();

         IClassifierAdapter valueClassifierAdapter = sdM3AdapterFactory.getClassifierAdapter(valueClassifier);

         SDPropertyAdapter valuePropertyAdapter = sdM3AdapterFactory.getMapEntryValuePropertyAdapter(
               valueClassifierAdapter, sourcePropertyAdapter);

         SDStoryPatternLinkEndAdapter valueLinkEndAdapter = storyPatternAdapterFactory.getStoryPatternLinkEndAdapter(
               getElement(), storyPatternAdapterFactory.getStoryPatternObjectAdapter(getElement().getTarget()),
               valuePropertyAdapter);

         linkEndAdapters.add(valueLinkEndAdapter);

         /*
          * Set cross references between adapters
          */
         List<SDPropertyAdapter> valueOppositePropertyAdapters = new ArrayList<SDPropertyAdapter>(2);
         valueOppositePropertyAdapters.add(sourcePropertyAdapter);
         valueOppositePropertyAdapters.add(keyPropertyAdapter);

         valuePropertyAdapter.setOppositePropertyAdapters(valueOppositePropertyAdapters);

         referenceOppositePropertyAdapters.add(valuePropertyAdapter);
         keyOppositePropertyAdapters.add(valuePropertyAdapter);
      }

      /*
       * Set cross references between adapters
       */
      sourcePropertyAdapter.setOppositePropertyAdapters(referenceOppositePropertyAdapters);

      keyPropertyAdapter.setOppositePropertyAdapters(keyOppositePropertyAdapters);

   }


   protected void createLinkEndAdapters()
   {
      linkEndAdapters = new ArrayList<IStoryPatternLinkEndAdapter>();

      SDStoryPatternAdapterFactory storyPatternAdapterFactory = getMainAdapterFactory()
            .getSDStoryPatternAdapterFactory();
      SDM3AdapterFactory sdM3AdapterFactory = getMainAdapterFactory().getSDM3AdapterFactory();

      /*
       * add source link end adapter
       */
      IStoryPatternObjectAdapter sourceSPOAdapter = storyPatternAdapterFactory
            .getStoryPatternObjectAdapter(getElement().getSource());

      SDPropertyAdapter sourcePropertyAdapter = (SDPropertyAdapter) sdM3AdapterFactory
            .getEStructuralFeaturePropertyAdapter(getElement().getTargetEnd());

      SDStoryPatternLinkEndAdapter sourceLinkEndAdapter = storyPatternAdapterFactory.getStoryPatternLinkEndAdapter(
            getElement(), sourceSPOAdapter, sourcePropertyAdapter);

      linkEndAdapters.add(sourceLinkEndAdapter);

      /*
       * add target link end adapter
       */
      IStoryPatternObjectAdapter targetSPOAdapter = storyPatternAdapterFactory
            .getStoryPatternObjectAdapter(getElement().getTarget());

      SDPropertyAdapter targetPropertyAdapter;

      if (getElement().getSourceEnd() instanceof EReference)
      {

         /*
          * This is a bidirectional reference, create a property adapter for the opposite direction
          */

         targetPropertyAdapter = (SDPropertyAdapter) sdM3AdapterFactory
               .getEStructuralFeaturePropertyAdapter(getElement().getSourceEnd());
      }
      else
      {
         /*
          * There is no opposite reference, create a non-navigable property adapter
          */
         IClassifierAdapter targetClassifierAdapter = sdM3AdapterFactory.getClassifierAdapter(getElement()
               .getTargetEnd().getEType());

         targetPropertyAdapter = sdM3AdapterFactory.getNonNavigablePropertyAdapter(targetClassifierAdapter,
               sourcePropertyAdapter);
      }

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
