package org.storydriven.modeling.interpreter.adapter.storypattern;

import java.util.ArrayList;
import java.util.List;

import org.storydriven.modeling.activities.StoryNode;
import org.storydriven.modeling.interpreter.adapter.SDMainAdapterFactory;
import org.storydriven.modeling.patterns.AbstractLinkVariable;
import org.storydriven.modeling.patterns.AbstractVariable;
import org.storydriven.modeling.patterns.BindingOperator;
import org.storydriven.modeling.patterns.BindingSemantics;
import org.storydriven.modeling.patterns.Constraint;
import org.storydriven.modeling.patterns.ObjectVariable;
import org.storydriven.modeling.patterns.PrimitiveVariable;
import org.storydriven.modeling.patterns.StoryPattern;

import de.mdelab.sdm.interpreter.common.adapters.expressions.IExpressionAdapter;
import de.mdelab.sdm.interpreter.common.adapters.storypattern.IStoryPatternAdapter;
import de.mdelab.sdm.interpreter.common.adapters.storypattern.IStoryPatternLinkAdapter;
import de.mdelab.sdm.interpreter.common.adapters.storypattern.IStoryPatternObjectAdapter;

public class SDStoryPatternAdapter extends SDAbstractStoryPatternAdapter<StoryPattern> implements IStoryPatternAdapter
{
	private List<IStoryPatternObjectAdapter>	boundSPO;

	private List<IStoryPatternObjectAdapter>	unboundSPO;

	private List<IStoryPatternObjectAdapter>	maybeBoundSPO;

	private List<IStoryPatternLinkAdapter>		unmodifiedSPL;

	private List<IStoryPatternObjectAdapter>	optionalSPO;

	private List<IStoryPatternLinkAdapter>		optionalSPL;

   private List<IStoryPatternObjectAdapter>  negativeSPO;

   private List<IStoryPatternLinkAdapter>    negativeSPL;

	private List<IStoryPatternObjectAdapter>	createdSPO;

	private List<IStoryPatternLinkAdapter>		createdSPL;

	private List<IStoryPatternObjectAdapter>	deletedSPO;

	private List<IStoryPatternLinkAdapter>		deletedSPL;

	private List<IExpressionAdapter>			storyPatternConstraintAdapters;

	private List<IStoryPatternObjectAdapter>	optionalDeletedSPO;

	public SDStoryPatternAdapter(SDMainAdapterFactory mainAdapterFactory)
	{
		super(mainAdapterFactory);
	}

	@Override
	public List<IStoryPatternObjectAdapter> getBoundStoryPatternObjectAdapters()
	{
		if (boundSPO == null)
		{
			initializeCache();
		}

		return boundSPO;
	}

	@Override
	public List<IStoryPatternObjectAdapter> getUnboundStoryPatternObjectAdapters()
	{
		if (unboundSPO == null)
		{
			initializeCache();
		}

		return unboundSPO;
	}

	@Override
	public List<IStoryPatternObjectAdapter> getMaybeBoundStoryPatternObjectAdapters()
	{
		if (maybeBoundSPO == null)
		{
			initializeCache();
		}

		return maybeBoundSPO;
	}

	@Override
	public List<IStoryPatternLinkAdapter> getUnmodifiedStoryPatternLinkAdapters()
	{
		if (unmodifiedSPL == null)
		{
			initializeCache();
		}

		return unmodifiedSPL;
	}

	private void initializeCache()
	{
		int size = getElement().getVariables().size();

		boundSPO = new ArrayList<IStoryPatternObjectAdapter>(size);
		unboundSPO = new ArrayList<IStoryPatternObjectAdapter>(size);
		maybeBoundSPO = new ArrayList<IStoryPatternObjectAdapter>(size);
		createdSPO = new ArrayList<IStoryPatternObjectAdapter>(size);
		deletedSPO = new ArrayList<IStoryPatternObjectAdapter>(size);
		optionalSPO = new ArrayList<IStoryPatternObjectAdapter>(size);
      negativeSPO = new ArrayList<IStoryPatternObjectAdapter>(size);
		optionalDeletedSPO = new ArrayList<IStoryPatternObjectAdapter>();

		for (AbstractVariable abstractVar : getElement().getVariables())
		{
			IStoryPatternObjectAdapter storyPatternObjectAdapter = getMainAdapterFactory().getSDStoryPatternAdapterFactory()
					.getStoryPatternObjectAdapter(abstractVar);

			if (abstractVar instanceof ObjectVariable
					&& ((ObjectVariable) abstractVar).getBindingSemantics() == BindingSemantics.OPTIONAL)
			{
				optionalSPO.add(storyPatternObjectAdapter);

				switch (((ObjectVariable) abstractVar).getBindingOperator())
				{
					case CREATE:
					{
						createdSPO.add(storyPatternObjectAdapter);
						break;
					}
					case DESTROY:
					{
						optionalDeletedSPO.add(storyPatternObjectAdapter);
						break;
					}
				}
			}
         else if (abstractVar instanceof ObjectVariable
               && ((ObjectVariable) abstractVar).getBindingSemantics() == BindingSemantics.NEGATIVE)
         {
            negativeSPO.add(storyPatternObjectAdapter);
         }
			else
			{

				switch (abstractVar.getBindingState())
				{
					case BOUND:
					{
						assert abstractVar instanceof PrimitiveVariable
								|| ((ObjectVariable) abstractVar).getBindingOperator() != BindingOperator.CREATE;

						boundSPO.add(storyPatternObjectAdapter);
						break;
					}
					case UNBOUND:
					{
						if (abstractVar instanceof PrimitiveVariable
								|| ((ObjectVariable) abstractVar).getBindingOperator() != BindingOperator.CREATE)
						{
							unboundSPO.add(storyPatternObjectAdapter);
						}
						break;
					}
					case MAYBE_BOUND:
					{
						assert abstractVar instanceof PrimitiveVariable
								|| ((ObjectVariable) abstractVar).getBindingOperator() != BindingOperator.CREATE;

						maybeBoundSPO.add(storyPatternObjectAdapter);
						break;
					}
					default:
					{
						assert false;
						break;
					}
				}

				if (abstractVar instanceof ObjectVariable)
				{
					switch (((ObjectVariable) abstractVar).getBindingOperator())
					{
						case CREATE:
						{
							createdSPO.add(storyPatternObjectAdapter);
							break;
						}
						case DESTROY:
						{
							deletedSPO.add(storyPatternObjectAdapter);
							break;
						}
					}
				}
			}
		}

		size = getElement().getLinkVariables().size();

		unmodifiedSPL = new ArrayList<IStoryPatternLinkAdapter>(size);
		createdSPL = new ArrayList<IStoryPatternLinkAdapter>(size);
		deletedSPL = new ArrayList<IStoryPatternLinkAdapter>(size);
		optionalSPL = new ArrayList<IStoryPatternLinkAdapter>(size);
      negativeSPL = new ArrayList<IStoryPatternLinkAdapter>(size);

		for (AbstractLinkVariable link : getElement().getLinkVariables())
		{
			IStoryPatternLinkAdapter storyPatternLinkAdapter = getMainAdapterFactory().getSDStoryPatternAdapterFactory()
					.getStoryPatternLinkAdapter(link);

			if (link.getBindingSemantics() == BindingSemantics.OPTIONAL)
			{
				optionalSPL.add(storyPatternLinkAdapter);
			}
			else if (link.getBindingSemantics() == BindingSemantics.NEGATIVE)
         {
            negativeSPL.add(storyPatternLinkAdapter);
         }
         else if (!(link.getTarget() instanceof ObjectVariable && ((ObjectVariable) link.getTarget())
                     .getBindingSemantics() == BindingSemantics.NEGATIVE))
         {
				switch (link.getBindingOperator())
				{
					case CHECK_ONLY:
					{
						unmodifiedSPL.add(storyPatternLinkAdapter);
						break;
					}
					case CREATE:
					{
						createdSPL.add(storyPatternLinkAdapter);
						break;
					}
					case DESTROY:
					{
						deletedSPL.add(storyPatternLinkAdapter);
						break;
					}
				}
			}
		}

	}

	@Override
	public List<IStoryPatternObjectAdapter> getCreatedStoryPatternObjectAdapters()
	{
		if (createdSPO == null)
		{
			initializeCache();
		}

		return createdSPO;
	}

	@Override
	public List<IStoryPatternLinkAdapter> getCreatedStoryPatternLinkAdapters()
	{
		if (createdSPL == null)
		{
			initializeCache();
		}

		return createdSPL;
	}

	@Override
	public List<IStoryPatternObjectAdapter> getDeletedStoryPatternObjectAdapters()
	{
		if (deletedSPO == null)
		{
			initializeCache();
		}

		return deletedSPO;
	}

	@Override
	public List<IStoryPatternLinkAdapter> getDeletedStoryPatternLinkAdapters()
	{
		if (deletedSPL == null)
		{
			initializeCache();
		}

		return deletedSPL;
	}

	@Override
	public List<IExpressionAdapter> getStoryPatternConstraintAdapters()
	{
		if (storyPatternConstraintAdapters == null)
		{
			storyPatternConstraintAdapters = new ArrayList<IExpressionAdapter>();

			for (Constraint constraint : getElement().getConstraints())
			{
				storyPatternConstraintAdapters.add(getMainAdapterFactory().getSDExpressionsAdapterFactory().getExpressionAdapter(
						constraint.getConstraintExpression()));
			}
		}

		return storyPatternConstraintAdapters;
	}

	@Override
	public String getName()
	{
		if (getElement().eContainer() instanceof StoryNode)
		{
			return ((StoryNode) getElement().eContainer()).getName();
		}
		throw new UnsupportedOperationException("Story Pattern has no name");
	}

	@Override
	public List<IStoryPatternObjectAdapter> getOptionalStoryPatternObjectAdapters()
	{
		if (optionalSPO == null)
		{
			initializeCache();
		}

		return optionalSPO;
	}

	@Override
	public List<IStoryPatternLinkAdapter> getOptionalStoryPatternLinkAdapters()
	{
		if (optionalSPL == null)
		{
			initializeCache();
		}

		return optionalSPL;
	}

	@Override
	public List<IStoryPatternObjectAdapter> getDeletedOptionalStoryPatternObjectAdapters()
	{
		if (optionalDeletedSPO == null)
		{
			initializeCache();
		}

		return optionalDeletedSPO;
	}


   @Override
   public List<IStoryPatternObjectAdapter> getNegativeStoryPatternObjectAdapters()
   {
      if (negativeSPO == null)
      {
         initializeCache();
      }

      return negativeSPO;
   }


   @Override
   public List<IStoryPatternLinkAdapter> getNegativeStoryPatternLinkAdapters()
   {
      if (negativeSPL == null)
      {
         initializeCache();
      }

      return negativeSPL;
   }
}
