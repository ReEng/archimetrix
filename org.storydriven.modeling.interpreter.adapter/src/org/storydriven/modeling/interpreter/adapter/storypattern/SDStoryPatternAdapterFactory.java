package org.storydriven.modeling.interpreter.adapter.storypattern;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.storydriven.modeling.interpreter.adapter.SDAdapterFactory;
import org.storydriven.modeling.interpreter.adapter.SDMainAdapterFactory;
import org.storydriven.modeling.patterns.AbstractLinkVariable;
import org.storydriven.modeling.patterns.AbstractVariable;
import org.storydriven.modeling.patterns.AttributeAssignment;
import org.storydriven.modeling.patterns.MatchingPattern;
import org.storydriven.modeling.patterns.StoryPattern;

import de.mdelab.sdm.interpreter.common.adapters.m3.IPropertyAdapter;
import de.mdelab.sdm.interpreter.common.adapters.storypattern.IPropertyAssignmentAdapter;
import de.mdelab.sdm.interpreter.common.adapters.storypattern.IStoryPatternAdapter;
import de.mdelab.sdm.interpreter.common.adapters.storypattern.IStoryPatternAdapterFactory;
import de.mdelab.sdm.interpreter.common.adapters.storypattern.IStoryPatternLinkAdapter;
import de.mdelab.sdm.interpreter.common.adapters.storypattern.IStoryPatternObjectAdapter;

public class SDStoryPatternAdapterFactory extends SDAdapterFactory implements IStoryPatternAdapterFactory
{

	protected SDInternalStoryPatternAdapterFactory														internalStoryPatternAdapterFactory;

	private Map<AbstractLinkVariable, Map<IStoryPatternObjectAdapter, SDStoryPatternLinkEndAdapter>>	linkEndAdapters;

	public SDStoryPatternAdapterFactory(SDMainAdapterFactory mainAdapterFactory)
	{
		super(mainAdapterFactory);

		internalStoryPatternAdapterFactory = new SDInternalStoryPatternAdapterFactory(mainAdapterFactory);

		linkEndAdapters = new HashMap<AbstractLinkVariable, Map<IStoryPatternObjectAdapter, SDStoryPatternLinkEndAdapter>>();
	}

	public IStoryPatternAdapter getStoryPatternAdapter(Object storyPattern)
	{
		if (storyPattern instanceof MatchingPattern)
		{
			synchronized (storyPattern)
			{
				IStoryPatternAdapter storyPatternAdapter = (IStoryPatternAdapter) EcoreUtil.getExistingAdapter(
						(MatchingPattern) storyPattern, this);

				if (storyPatternAdapter == null)
				{
					storyPatternAdapter = createMatchingPatternAdapter((MatchingPattern) storyPattern);
				}

				return storyPatternAdapter;
			}
		}
		else if (storyPattern instanceof StoryPattern)
		{
			synchronized (storyPattern)
			{
				IStoryPatternAdapter storyPatternAdapter = (IStoryPatternAdapter) EcoreUtil.getExistingAdapter((StoryPattern) storyPattern,
						this);

				if (storyPatternAdapter == null)
				{
					storyPatternAdapter = createStoryPatternAdapter((StoryPattern) storyPattern);
				}

				return storyPatternAdapter;
			}
		}

		throw new UnsupportedOperationException();
	}

	protected IStoryPatternAdapter createMatchingPatternAdapter(MatchingPattern matchingPattern)
	{
		SDMatchingPatternAdapter matchingPatternAdapter = new SDMatchingPatternAdapter(getMainAdapterFactory());

		matchingPatternAdapter.setTarget(matchingPattern);

		return matchingPatternAdapter;
	}

	protected SDStoryPatternAdapter createStoryPatternAdapter(StoryPattern storyPattern)
	{
		SDStoryPatternAdapter storyPatternAdapter = new SDStoryPatternAdapter(getMainAdapterFactory());

		storyPatternAdapter.setTarget(storyPattern);

		return storyPatternAdapter;
	}

	public IStoryPatternObjectAdapter getStoryPatternObjectAdapter(Object objectVar)
	{
		assert objectVar instanceof AbstractVariable;

		synchronized (objectVar)
		{
			return (IStoryPatternObjectAdapter) internalStoryPatternAdapterFactory.adapt((AbstractVariable) objectVar, this);
		}
	}

	public IStoryPatternLinkAdapter getStoryPatternLinkAdapter(Object linkVar)
	{
		assert linkVar instanceof AbstractLinkVariable;

		synchronized (linkVar)
		{
			return (IStoryPatternLinkAdapter) internalStoryPatternAdapterFactory.adapt((AbstractLinkVariable) linkVar, this);
		}
	}

	public IPropertyAssignmentAdapter getPropertyAssignmentAdapter(Object featureAssignment)
	{
		assert featureAssignment instanceof AttributeAssignment;

		synchronized (featureAssignment)
		{
			return (IPropertyAssignmentAdapter) internalStoryPatternAdapterFactory.adapt((AttributeAssignment) featureAssignment, this);
		}
	}

	@SuppressWarnings("unchecked")
	public SDStoryPatternLinkEndAdapter getStoryPatternLinkEndAdapter(Object linkVar,
			IStoryPatternObjectAdapter targetObjectVariableAdapter, IPropertyAdapter propertyAdapter)
	{
		assert linkVar instanceof AbstractLinkVariable;
		assert targetObjectVariableAdapter instanceof SDObjectVariableAdapter;

		synchronized (linkVar)
		{
			Map<IStoryPatternObjectAdapter, SDStoryPatternLinkEndAdapter> map = linkEndAdapters.get(linkVar);

			if (map == null)
			{
				map = new HashMap<IStoryPatternObjectAdapter, SDStoryPatternLinkEndAdapter>();
				linkEndAdapters.put((AbstractLinkVariable) linkVar, map);
			}

			SDStoryPatternLinkEndAdapter linkEndAdapter = map.get(targetObjectVariableAdapter);

			if (linkEndAdapter == null)
			{
				linkEndAdapter = new SDStoryPatternLinkEndAdapter(getMainAdapterFactory(),
						(SDAbstractLinkVariableAdapter<? extends AbstractLinkVariable>) this.getStoryPatternLinkAdapter(linkVar),
						targetObjectVariableAdapter, propertyAdapter);

				map.put(targetObjectVariableAdapter, linkEndAdapter);
			}

			return linkEndAdapter;
		}
	}
}
