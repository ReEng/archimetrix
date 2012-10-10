package de.mdelab.sdm.interpreter.common.storypatternmatcher;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import de.mdelab.sdm.interpreter.common.SDMInterpreterException;
import de.mdelab.sdm.interpreter.common.adapters.IAdapter;
import de.mdelab.sdm.interpreter.common.adapters.expressions.IExpressionAdapter;
import de.mdelab.sdm.interpreter.common.adapters.m3.IClassifierAdapter;
import de.mdelab.sdm.interpreter.common.adapters.m3.IInstanceAdapter;
import de.mdelab.sdm.interpreter.common.adapters.m3.IPropertyAdapter;
import de.mdelab.sdm.interpreter.common.adapters.m3.IPropertyValueIterator;
import de.mdelab.sdm.interpreter.common.adapters.storypattern.IPropertyAssignmentAdapter;
import de.mdelab.sdm.interpreter.common.adapters.storypattern.IStoryPatternAdapter;
import de.mdelab.sdm.interpreter.common.adapters.storypattern.IStoryPatternLinkAdapter;
import de.mdelab.sdm.interpreter.common.adapters.storypattern.IStoryPatternLinkEndAdapter;
import de.mdelab.sdm.interpreter.common.adapters.storypattern.IStoryPatternObjectAdapter;
import de.mdelab.sdm.interpreter.common.expressions.IExpressionInterpreter;
import de.mdelab.sdm.interpreter.common.storypatternmatcher.strategies.MatchingStrategy;
import de.mdelab.sdm.interpreter.common.storypatternmatcher.strategies.NextBindingInfo;
import de.mdelab.sdm.interpreter.common.tasks.Task;
import de.mdelab.sdm.interpreter.common.variables.Variable;
import de.mdelab.sdm.interpreter.common.variables.VariableScope;

/**
 * @author Stephan Hildebrandt
 * @author Sebastian Wätzoldt
 */
public abstract class StoryPatternMatcher extends Task<VariableScope>
{
	private MatchingStrategy		matchingStrategy;

	private VariableScope			returnVariableScope;

	private MatchingState			matchingState;

	private IStoryPatternAdapter	storyPatternAdapter;

	public StoryPatternMatcher(Task<?> parentTask, VariableScope variableScope, IStoryPatternAdapter storyPatternAdapter)
	{
		/*
		 * We need to work on a copy of the actual variable scope.
		 */
		super(parentTask, variableScope.createCopy());

		assert storyPatternAdapter != null;

		this.storyPatternAdapter = storyPatternAdapter;

		matchingStrategy = variableScope.getInterpreterManager().getMainInterpreterFactory().getPatternMatcherFactory()
				.getMatchingStrategy();
	}

	@Override
	public VariableScope getReturnValue()
	{
		return returnVariableScope;
	}

	@Override
	protected boolean caseStateInitializing() throws Exception
	{
		try
		{
			getVariableScope().getInterpreterManager().getReadLock().lock();

			/*
			 * set up internal data structures
			 */
			matchingState = new MatchingState();

			if (!setupBoundObjects())
			{
				matchingState.matchTransactionStack.clear();
				return false;
			}

			setupMaybeBoundObjects();

			/*
			 * Fill lists of (un)bound SPOs, (un)checked SPLs, optional SPO/SPL
			 * and link ends
			 */
			matchingState.unboundSPO.addAll(storyPatternAdapter.getUnboundStoryPatternObjectAdapters());
			matchingState.unboundOptionalSPO.addAll(storyPatternAdapter.getOptionalStoryPatternObjectAdapters());
			matchingState.uncheckedSPL.addAll(storyPatternAdapter.getUnmodifiedStoryPatternLinkAdapters());
			matchingState.uncheckedSPL.addAll(storyPatternAdapter.getDeletedStoryPatternLinkAdapters());
			matchingState.optionalSPL.addAll(storyPatternAdapter.getOptionalStoryPatternLinkAdapters());
         matchingState.negativeSPO.addAll(storyPatternAdapter.getNegativeStoryPatternObjectAdapters());
         matchingState.negativeSPL.addAll(storyPatternAdapter.getNegativeStoryPatternLinkAdapters());

			for (IStoryPatternLinkAdapter linkAdapter : matchingState.uncheckedSPL)
			{
				matchingState.uncheckedLinkEnds.addAll(linkAdapter.getLinkEndAdapters());
			}

			/*
			 * Fill lists of created SPOs
			 */
			matchingState.createdSPO.addAll(storyPatternAdapter.getCreatedStoryPatternObjectAdapters());
			matchingState.createdSPL.addAll(storyPatternAdapter.getCreatedStoryPatternLinkAdapters());

			/*
			 * Fill lists of deleted SPOs
			 */
			matchingState.deletedSPO.addAll(storyPatternAdapter.getDeletedStoryPatternObjectAdapters());
			matchingState.deletedOptionalSPO.addAll(storyPatternAdapter.getDeletedOptionalStoryPatternObjectAdapters());
			matchingState.deletedSPL.addAll(storyPatternAdapter.getDeletedStoryPatternLinkAdapters());

			/*
			 * Delete variables for all unbound SPOs
			 */
			for (IStoryPatternObjectAdapter spoAdapter : matchingState.unboundSPO)
			{
				getVariableScope().deleteVariable(spoAdapter.getName());
			}

			/*
			 * Create an initial element for the matcher stack.
			 */
			matchingState.matchTransactionStack.push(new Transaction<IAdapter>(null, null, null, TransactionTypeEnum.BINDING_LINK));
		}
		finally
		{
			getVariableScope().getInterpreterManager().getReadLock().unlock();
		}

		return false;
	}

	@Override
	protected boolean caseStateWorking() throws Exception
	{
		/*
		 * start finding a match
		 */
		if (findNextMatch())
		{
			assert matchingState.unboundSPO.isEmpty();
			assert matchingState.uncheckedLinkEnds.isEmpty();
			assert matchingState.uncheckedSPL.isEmpty();

			startOptionalMatching();

			returnVariableScope = getVariableScope();
		}
		else
		{
			assert matchingState.matchTransactionStack.isEmpty();

			returnVariableScope = null;
		}

		return false;
	}

	private void startOptionalMatching() throws SDMInterpreterException
	{

		for (IStoryPatternLinkAdapter optionalSPL : matchingState.optionalSPL)
		{
			for (IStoryPatternLinkEndAdapter lea : optionalSPL.getLinkEndAdapters())
			{
				if (lea.getPropertyAdapter().isNavigable() && matchingState.boundSPO.contains(lea.getStoryPatternObjectAdapter()))
				{

					NextBindingInfo nbi = new NextBindingInfo();
					nbi.sourceInstanceAdapter = getVariableScope().getVariable(lea.getStoryPatternObjectAdapter().getName())
							.getValueAdapter();
					nbi.sourceLinkEndAdapter = lea;
					for (IStoryPatternLinkEndAdapter notLea : optionalSPL.getLinkEndAdapters())
					{
						if (notLea != lea)
						{
							nbi.targetLinkEndAdapter = notLea;
							break;
						}
					}

					findMatchForOptionalSPO(nbi);
					break;
				}
			}
		}// of for each story pattern link adapter
	}

	@Override
	protected void caseStateFinishing() throws Exception
	{
		// Do nothing
	}

	@Override
	protected void caseStateCancelled() throws Exception
	{
		// Do nothing
	}

	public void apply() throws SDMInterpreterException
	{
		assert returnVariableScope != null;

		try
		{
			getVariableScope().getInterpreterManager().getWriteLock().lock();

			deleteObjects();

			createObjects();

			assignFeatureValues();

			/*
			 * Delete all bound optional story pattern object adapter.
			 */
			for (IStoryPatternObjectAdapter optionalSPO : matchingState.boundOptionalSPO)
			{
				getVariableScope().deleteVariable(optionalSPO.getName());
			}
			matchingState.unboundOptionalSPO.addAll(matchingState.boundOptionalSPO);
			matchingState.boundOptionalSPO.clear();
		}
		finally
		{
			getVariableScope().getInterpreterManager().getWriteLock().unlock();
		}
	}

	private boolean setupBoundObjects() throws SDMInterpreterException
	{
		for (IStoryPatternObjectAdapter spo : storyPatternAdapter.getBoundStoryPatternObjectAdapters())
		{
			Variable variable;

			/*
			 * Check if a direct assignment is set
			 */
			if (spo.getAssignmentExpression() != null)
			{
				IExpressionInterpreter expressionInterpreter = getVariableScope().getInterpreterManager().getMainInterpreterFactory()
						.getExpressionInterpreterFactory().getExpressionInterpreter(spo.getAssignmentExpression().getExpressionLanguage());

				Variable result = expressionInterpreter.evaluate(spo.getAssignmentExpression(), getVariableScope(), null, null);

				/*
				 * Check the result.
				 */
				if (result != null)
				{
					/*
					 * Check if the type of the result of the constraint matches
					 * the expected type of the story pattern object.
					 */
					if (spo.getClassifierAdapter().isInstance(result.getValueAdapter()))
					{
						/*
						 * Create a new variable with the name and classifier of
						 * the story pattern object
						 */
						variable = getVariableScope().createVariable(spo.getName(), spo.getClassifierAdapter(), result.getValueAdapter());
					}
					else
					{
						return false;
					}
				}
				else
				{
					throw new SDMInterpreterException("The expression '" + spo.getAssignmentExpression() + "' was evaluated to null.");
				}

			}
			else
			{
				/*
				 * Find the variable for this story pattern object.
				 */
				variable = getVariableScope().getVariable(spo.getName());

				if (variable == null)
				{
					throw new SDMInterpreterException("The variable '" + spo.getName() + "' does not exist.");
				}

				assert variable.getValueAdapter() != null;

				/*
				 * Check that the type of the existing variable matches the type
				 * of the story pattern object.
				 */
				if (!spo.getClassifierAdapter().isInstance(variable.getValueAdapter()))
				{
					throw new SDMInterpreterException("The story pattern object and the variable '" + spo.getName()
							+ "' have incompatible types: story pattern object: " + spo.getClassifierAdapter().getName() + "; variable: "
							+ variable.getValueAdapter().getClassifierAdapter().getName());
				}
			}

			matchingState.addMatchingHistoryEntry(spo, variable.getValueAdapter());

			matchingState.boundInstanceObjects.add(variable.getValueAdapter());
			matchingState.boundSPO.add(spo);

			storyPatternObjectBound(spo, variable.getValueAdapter());
		}

		return true;
	}

	private void setupMaybeBoundObjects()
	{
		Variable variable;

		for (IStoryPatternObjectAdapter spo : storyPatternAdapter.getMaybeBoundStoryPatternObjectAdapters())
		{
			assert spo.getAssignmentExpression() == null;

			variable = getVariableScope().getVariable(spo.getName());

			if (variable != null)
			{
				matchingState.boundInstanceObjects.add(variable.getValueAdapter());
				matchingState.boundSPO.add(spo);
			}
			else
			{
				matchingState.unboundSPO.add(spo);
			}
		}
	}

	private boolean findNextMatch() throws SDMInterpreterException
	{
		if (matchingState.matchTransactionStack.size() == 0)
		{
			/*
			 * All possible matches have already been found.
			 */
			return false;
		}
		else if (matchingState.matchTransactionStack.size() == 1)
		{
			/*
			 * The story pattern matcher was just created. Check the already
			 * bound objects.
			 */
			for (IStoryPatternObjectAdapter spo : matchingState.boundSPO)
			{
				if (!checkLinksOfObject(spo))
				{
					/*
					 * Clear the match transaction stack
					 */
					matchingState.matchTransactionStack.clear();

					return false;
				}
			}

			/*
			 * Check constraints on bound story pattern objects
			 */
			for (IStoryPatternObjectAdapter spo : matchingState.boundSPO)
			{
				if (!checkSPOConstraints(spo))
				{
					/*
					 * Clear the match transaction stack
					 */
					matchingState.matchTransactionStack.clear();

					return false;
				}
			}

			/*
			 * Clear the match transaction stack
			 */
			matchingState.matchTransactionStack.clear();

			/*
			 * Create an initial element for the matcher stack.
			 */
			matchingState.matchTransactionStack.push(new Transaction<IAdapter>(null, null, null, TransactionTypeEnum.BINDING_LINK));
		}

		/*
		 * Find new matches
		 */
		while (matchStoryPatternInternal(0))
		{
			if (checkStoryPatternConstraints())
			{
			   if (checkNegativeElements())
            {
               return true;
            }
			}
		}

		return false;
	}
	

   private boolean checkNegativeElements() throws SDMInterpreterException
   {
      try
      {
         getVariableScope().getInterpreterManager().getReadLock().lock();

         // check negative objects
         for (IStoryPatternObjectAdapter negativeSPO : matchingState.negativeSPO)
         {
            List<IStoryPatternLinkEndAdapter> iStoryPatternLinkEndAdapters = negativeSPO.getLinkEndAdapters();
            for (IStoryPatternLinkEndAdapter iStoryPatternLinkEndAdapter : iStoryPatternLinkEndAdapters)
            {
               List<IStoryPatternLinkEndAdapter> linkEndAdapters = iStoryPatternLinkEndAdapter
                     .getStoryPatternLinkAdapter().getLinkEndAdapters();
               for (IStoryPatternLinkEndAdapter lea : linkEndAdapters)
               {
                  if (matchingState.boundSPO.contains(lea.getStoryPatternObjectAdapter())
                        || matchingState.boundOptionalSPO.contains(lea.getStoryPatternObjectAdapter()))
                  {
                     if (checkLinkToNegativeObject(lea, negativeSPO))
                     {
                        // match for negative object has been found
                        return false;
                     }
                  }
               }
            }
         }

         // check negative links
         for (IStoryPatternLinkAdapter negativeSPL : matchingState.negativeSPL)
         {
            if (checkNegativeLink(negativeSPL))
            {
               // match for negative link has been found
               return false;
            }
         }

         // no negative elements have been found
         return true;
      }
      finally
      {
         getVariableScope().getInterpreterManager().getReadLock().unlock();
      }
   }


   private boolean checkNegativeLink(IStoryPatternLinkAdapter negativeSPL)
   {
      try
      {
         getVariableScope().getInterpreterManager().getReadLock().lock();

         List<IStoryPatternLinkEndAdapter> linkEndAdapters = negativeSPL.getLinkEndAdapters();
//         for (IStoryPatternLinkEndAdapter sourceLinkEndAdapter : linkEndAdapters)
//         {
         IStoryPatternLinkEndAdapter sourceLinkEndAdapter = linkEndAdapters.get(0);
            if (sourceLinkEndAdapter.getPropertyAdapter().isNavigable())
            {
               assert sourceLinkEndAdapter.getStoryPatternObjectAdapter() != null;
               IStoryPatternObjectAdapter sourceSpo = sourceLinkEndAdapter.getStoryPatternObjectAdapter();

               assert sourceSpo != null;
               assert matchingState.boundSPO.contains(sourceSpo);

               Variable sourceVariable = getVariableScope().getVariable(sourceSpo.getName());

               assert sourceVariable != null;
               assert sourceVariable.getValueAdapter() != null;

               if(linkEndAdapters.size() == 2)
               {
                  //normal association
                  
                  IStoryPatternLinkEndAdapter targetLinkEndAdapter = sourceLinkEndAdapter.getStoryPatternLinkAdapter()
                        .getLinkEndAdapters().get(1);
                  
                  IInstanceAdapter targetInstanceAdapter = targetLinkEndAdapter.getInstanceAdapter(getVariableScope());
                  IInstanceAdapter keyValueAdapter = sourceLinkEndAdapter.getKeyInstanceAdapter(getVariableScope());
                  if (sourceVariable.getValueAdapter().propertyContainsInstance(
                        sourceLinkEndAdapter.getPropertyAdapter(), keyValueAdapter, targetInstanceAdapter,
                        targetLinkEndAdapter.getPropertyAdapter()))
                  {
                     return true;
                  }
                        
               }
               else
               {
                  //qualified one
                  
                  IStoryPatternLinkEndAdapter keyLinkEndAdapter = sourceLinkEndAdapter.getStoryPatternLinkAdapter()
                  .getLinkEndAdapters().get(1);
                  
                  IStoryPatternLinkEndAdapter valueLinkEndAdapter = sourceLinkEndAdapter.getStoryPatternLinkAdapter()
                  .getLinkEndAdapters().get(2);
                  
                  
                  IInstanceAdapter keyInstanceAdapter = keyLinkEndAdapter.getInstanceAdapter(getVariableScope());
                  IInstanceAdapter valueInstanceAdapter = valueLinkEndAdapter.getInstanceAdapter(getVariableScope());
                  
                  if (sourceVariable.getValueAdapter().propertyContainsInstance(
                        sourceLinkEndAdapter.getPropertyAdapter(), keyInstanceAdapter, valueInstanceAdapter,
                        valueLinkEndAdapter.getPropertyAdapter()))
                  {
                     return true;
                  }
                  
               }
               
            }
//         }
      }
      finally
      {
         getVariableScope().getInterpreterManager().getReadLock().unlock();
      }
      // no match found for negative link
      return false;
   }
   

   private boolean checkLinkToNegativeObject(IStoryPatternLinkEndAdapter sourceLinkEndAdapter,
         IStoryPatternObjectAdapter negativeSPO) throws SDMInterpreterException
   {
      try
      {
         getVariableScope().getInterpreterManager().getReadLock().lock();

         assert sourceLinkEndAdapter != null;

         IStoryPatternObjectAdapter sourceSpo = sourceLinkEndAdapter.getStoryPatternObjectAdapter();

         assert sourceSpo != null;
         assert matchingState.boundSPO.contains(sourceSpo);

         Variable sourceVariable = getVariableScope().getVariable(sourceSpo.getName());

         assert sourceVariable != null;
         assert sourceVariable.getValueAdapter() != null;
         
         IInstanceAdapter keyInstanceAdapter = sourceLinkEndAdapter.getKeyInstanceAdapter(getVariableScope());

         for (IStoryPatternLinkEndAdapter targetLinkEndAdapter : sourceLinkEndAdapter.getStoryPatternLinkAdapter()
               .getLinkEndAdapters())
         {
            if (targetLinkEndAdapter != sourceLinkEndAdapter)
            {
               Map<IPropertyAdapter, IInstanceAdapter> emptyMap = Collections.emptyMap();
               IPropertyValueIterator propertyTargetIterator = sourceVariable.getValueAdapter()
                     .getPropertyTargetIterator(sourceLinkEndAdapter.getPropertyAdapter(),keyInstanceAdapter,
                           targetLinkEndAdapter.getPropertyAdapter(), emptyMap);

               IInstanceAdapter targetInstanceAdapter = null;
               while ((targetInstanceAdapter = propertyTargetIterator.getNext()) != null)
               {
                  if (sourceVariable.getValueAdapter().propertyContainsInstance(
                        sourceLinkEndAdapter.getPropertyAdapter(), keyInstanceAdapter, targetInstanceAdapter,
                        targetLinkEndAdapter.getPropertyAdapter()))
                  {
                     // check if instance has been bound before
                     if (!matchingState.boundInstanceObjects.contains(targetInstanceAdapter))
                     {
                        // check further constraints
                        if (checkSPOConstraintsForNegativeSPO(negativeSPO, targetInstanceAdapter))
                        {
                           // match found for negative object
                           return true;
                        }
                     }
                  }
               }
            }
         }
      }
      finally
      {
         getVariableScope().getInterpreterManager().getReadLock().unlock();
      }
      // no match found for negative object
      return false;
   }



   private boolean checkSPOConstraintsForNegativeSPO(IStoryPatternObjectAdapter spo,
         IInstanceAdapter targetInstanceAdapter) throws SDMInterpreterException
   {
      try
      {
         getVariableScope().getInterpreterManager().getReadLock().lock();

         for (IExpressionAdapter expression : spo.getConstraintExpressionAdapters())
         {
            IExpressionInterpreter expressionInterpreter = getVariableScope().getInterpreterManager()
                  .getMainInterpreterFactory().getExpressionInterpreterFactory()
                  .getExpressionInterpreter(expression.getExpressionLanguage());

            assert expressionInterpreter != null;

            Variable expressionResult = expressionInterpreter.evaluate(expression, getVariableScope(),
                  spo.getClassifierAdapter(), targetInstanceAdapter);

            assert expressionResult != null;
            assert expressionResult.getValueAdapter().getValue() instanceof Boolean;

            if (expressionResult.getValueAdapter().getValue() == Boolean.FALSE)
            {
               checkStoryPatternObjectConstraintFailed(spo, expression);

               return false;
            }
            else
            {
               checkStoryPatternObjectConstraintSuccessful(spo, expression);
            }
         }

         return true;
      }
      finally
      {
         getVariableScope().getInterpreterManager().getReadLock().unlock();
      }
   }

	private boolean checkStoryPatternConstraints() throws SDMInterpreterException
	{
		try
		{
			getVariableScope().getInterpreterManager().getReadLock().lock();

			for (IExpressionAdapter expressionAdapter : storyPatternAdapter.getStoryPatternConstraintAdapters())
			{
				IExpressionInterpreter expressionInterpreter = getVariableScope().getInterpreterManager().getMainInterpreterFactory()
						.getExpressionInterpreterFactory().getExpressionInterpreter(expressionAdapter.getExpressionLanguage());

				Variable variable = expressionInterpreter.evaluate(expressionAdapter, getVariableScope(), null, null);

				assert variable != null;
				assert variable.getValueAdapter().getValue() instanceof Boolean;

				if (variable.getValueAdapter().getValue() == Boolean.FALSE)
				{
					checkStoryPatternConstraintFailed(storyPatternAdapter, expressionAdapter);

					return false;
				}
				else
				{
					checkStoryPatternConstraintSuccessful(storyPatternAdapter, expressionAdapter);
				}
			}

			return true;
		}
		finally
		{
			getVariableScope().getInterpreterManager().getReadLock().unlock();
		}
	}

	private boolean matchStoryPatternInternal(int stackSize) throws SDMInterpreterException
	{
		if (matchingState.unboundSPO.isEmpty() && !matchingState.matchTransactionStack.isEmpty())
		{
			/*
			 * If there are no unbound story pattern objects, roll back to make
			 * the last bound object unbound again.
			 */
			rollBackToLastBindingLink();

			if (matchingState.matchTransactionStack.isEmpty())
			{
				/*
				 * If the match transaction stack is empty, return true. This
				 * can happen if a story pattern does not contain unbound
				 * objects.
				 */
				return true;
			}
		}

		if (matchingState.matchTransactionStack.isEmpty())
		{
			/*
			 * The match transaction stack has run empty. There are no more
			 * matches for this story pattern.
			 */
			return false;
		}

		boolean match = false;

		NextBindingInfo nextBindingInfo;

		do
		{
			while ((nextBindingInfo = getNextBindingInfo()) != null)
			{
				// Try to find a matching object
				match = findMatchForSPO(nextBindingInfo);

				if (!match)
				{
					break;
				}
			}

			if (!match && matchingState.matchTransactionStack.size() > stackSize)
			{
				rollBackToLastBindingLink();
			}
		}
		while (!match && matchingState.matchTransactionStack.size() > stackSize);

		return match;
	}

	private NextBindingInfo getNextBindingInfo()
	{
		NextBindingInfo nextBindingInfo = null;
		try
		{
			getVariableScope().getInterpreterManager().getReadLock().lock();

			nextBindingInfo = matchingStrategy.getNextLinkEndForBinding(matchingState, getVariableScope());
		}
		finally
		{
			getVariableScope().getInterpreterManager().getReadLock().unlock();

		}

		/*
		 * If there is a link to return, create a transaction for it and return
		 * it.
		 */
		if (nextBindingInfo != null)
		{
			/*
			 * Create a transaction for the target link end
			 */
			{
				Transaction<IStoryPatternLinkEndAdapter> transaction = new Transaction<IStoryPatternLinkEndAdapter>(
						nextBindingInfo.targetLinkEndAdapter, matchingState.uncheckedLinkEnds, matchingState.checkedLinkEnds,
						TransactionTypeEnum.BINDING_LINK);
				transaction.commit();

				matchingState.matchTransactionStack.push(transaction);
			}
		}

		return nextBindingInfo;
	}

	private boolean findMatchForSPO(NextBindingInfo nextBindingInfo) throws SDMInterpreterException
	{
		try
		{
			getVariableScope().getInterpreterManager().getReadLock().lock();

			assert !matchingState.boundSPO.contains(nextBindingInfo.targetLinkEndAdapter.getStoryPatternObjectAdapter());

			int stackSize = matchingState.matchTransactionStack.size();

			/*
			 * Find the first target object that matches.
			 */

			IStoryPatternObjectAdapter targetSpoAdapter = nextBindingInfo.targetLinkEndAdapter.getStoryPatternObjectAdapter();

			matchingStoryPatternObject(nextBindingInfo.sourceLinkEndAdapter.getStoryPatternObjectAdapter(), targetSpoAdapter,
					nextBindingInfo.sourceLinkEndAdapter, nextBindingInfo.targetLinkEndAdapter);

			Map<IPropertyAdapter, IInstanceAdapter> allBoundLinkEnds = null;

			if (nextBindingInfo.sourceLinkEndAdapter.getStoryPatternLinkAdapter().getLinkEndAdapters().size() == 2)
			{
				allBoundLinkEnds = Collections.emptyMap();
			}
			else
			{
				allBoundLinkEnds = getAllBoundLinkEnds(nextBindingInfo.sourceLinkEndAdapter.getStoryPatternLinkAdapter());
			}
			
			ArrayList<IInstanceAdapter> adapters = new ArrayList<IInstanceAdapter>();

			if(nextBindingInfo.targetLinkEndAdapter.getStoryPatternObjectAdapter().isSet())
			{
            IInstanceAdapter keyValueAdapter = nextBindingInfo.sourceLinkEndAdapter
                  .getKeyInstanceAdapter(getVariableScope());

            IInstanceAdapter targetAdapter = nextBindingInfo.sourceInstanceAdapter.getPropertySetValue(
                  nextBindingInfo.sourceLinkEndAdapter.getPropertyAdapter(), keyValueAdapter,
                  nextBindingInfo.sourceInstanceAdapter, nextBindingInfo.targetLinkEndAdapter.getPropertyAdapter());
            if (targetAdapter != null)
            {
               adapters.add(targetAdapter);
            }
			   
			}
			else
			{
            IInstanceAdapter keyValueAdapter = nextBindingInfo.sourceLinkEndAdapter
                  .getKeyInstanceAdapter(getVariableScope());

            IPropertyValueIterator propertyTargetIterator = nextBindingInfo.sourceInstanceAdapter
                  .getPropertyTargetIterator(nextBindingInfo.sourceLinkEndAdapter.getPropertyAdapter(),
                        keyValueAdapter, nextBindingInfo.targetLinkEndAdapter.getPropertyAdapter(), allBoundLinkEnds);
	         IInstanceAdapter targetInstanceAdapter = null;
			   while((targetInstanceAdapter = propertyTargetIterator.getNext()) != null)
			   {
			      adapters.add(targetInstanceAdapter);
			   }
			}
			
			

			for(IInstanceAdapter targetInstanceAdapter : adapters)
			{
				IClassifierAdapter targetClassifierAdapter = targetSpoAdapter.getClassifierAdapter();

				/*
				 * The target object must not be bound to another story pattern
				 * object, the targetSpo must not have been bound to the
				 * targetObject before, and the type of the targetObject must be
				 * correct.
				 */
				if (!matchingState.boundInstanceObjects.contains(targetInstanceAdapter)
						&& !matchingState.matchingHistoryContains(targetSpoAdapter, targetInstanceAdapter)
						&& targetClassifierAdapter.isInstance(targetInstanceAdapter))
				{
					getVariableScope().createVariable(targetSpoAdapter.getName(), targetClassifierAdapter, targetInstanceAdapter);

					assert matchingState.unboundSPO.contains(targetSpoAdapter);
					assert !matchingState.boundSPO.contains(targetSpoAdapter);
					assert !matchingState.boundInstanceObjects.contains(targetInstanceAdapter);

					/*
					 * Transaction for targetSPO
					 */
					{
						Transaction<IStoryPatternObjectAdapter> transaction = new Transaction<IStoryPatternObjectAdapter>(targetSpoAdapter,
								matchingState.unboundSPO, matchingState.boundSPO, TransactionTypeEnum.SPO_MATCHED);
						transaction.commit();
						matchingState.matchTransactionStack.push(transaction);
					}
					/*
					 * Transaction for targetInstanceAdapter
					 */
					{
						Transaction<IInstanceAdapter> transaction = new Transaction<IInstanceAdapter>(targetInstanceAdapter, null,
								matchingState.boundInstanceObjects, TransactionTypeEnum.INSTANCE_OBJECT_MATCHED);
						transaction.commit();
						matchingState.matchTransactionStack.push(transaction);
					}

					/*
					 * Update matchingHistory
					 */
					matchingState.addMatchingHistoryEntry(targetSpoAdapter, targetInstanceAdapter);

					storyPatternObjectBound(targetSpoAdapter, targetInstanceAdapter);

					/*
					 * Create a transaction for the source link end if it has
					 * not been checked yet.
					 */
					if (matchingState.uncheckedLinkEnds.contains(nextBindingInfo.sourceLinkEndAdapter))
					{
						Transaction<IStoryPatternLinkEndAdapter> transaction = new Transaction<IStoryPatternLinkEndAdapter>(
								nextBindingInfo.sourceLinkEndAdapter, matchingState.uncheckedLinkEnds, matchingState.checkedLinkEnds,
								TransactionTypeEnum.LINK_CHECKED);
						transaction.commit();

						matchingState.matchTransactionStack.push(transaction);

						storyPatternLinkEndCheckSuccessful(nextBindingInfo.sourceLinkEndAdapter);
					}

					/*
					 * Check if the all ends of this link end's link are
					 * connected to bound SPOs.
					 */
					IStoryPatternLinkAdapter spl = nextBindingInfo.targetLinkEndAdapter.getStoryPatternLinkAdapter();

					boolean allBound = true;

					for (IStoryPatternLinkEndAdapter linkEnd : spl.getLinkEndAdapters())
					{
						if (matchingState.unboundSPO.contains(linkEnd.getStoryPatternObjectAdapter()))
						{
							allBound = false;
							break;
						}
					}

					/*
					 * If all other link ends are connected to bound objects,
					 * create a transaction to move the story pattern link from
					 * the list of unchecked to the list of checked spl.
					 */
					if (allBound)
					{
						Transaction<IStoryPatternLinkAdapter> transaction = new Transaction<IStoryPatternLinkAdapter>(spl,
								matchingState.uncheckedSPL, matchingState.checkedSPL, TransactionTypeEnum.LINK_CHECKED);
						transaction.commit();

						matchingState.matchTransactionStack.push(transaction);

						storyPatternLinkCheckSuccessful(spl);
					}

					/*
					 * Check links and attributes.
					 */
					if (checkLinksOfObject(targetSpoAdapter) && checkSPOConstraints(targetSpoAdapter))
					{
						matchStoryPatternObjectSuccessful(targetSpoAdapter, targetInstanceAdapter);

						if (matchingState.unboundSPO.isEmpty() || matchStoryPatternInternal(matchingState.matchTransactionStack.size()))
						{
							assert matchingState.unboundSPO.isEmpty() && matchingState.uncheckedSPL.isEmpty();

							return true;
						}
						else
						{
							rollBack(stackSize);

							revokingStoryPatternObjectBinding(targetSpoAdapter, targetInstanceAdapter);
						}
					}
					else
					{
						rollBack(stackSize);

						revokingStoryPatternObjectBinding(targetSpoAdapter, targetInstanceAdapter);
					}
				}
			}

			rollBackToLastBindingLink();

			matchStoryPatternObjectFailed(targetSpoAdapter);
		}
		finally
		{
			getVariableScope().getInterpreterManager().getReadLock().unlock();
		}

		return false;
	}

	private boolean findMatchForOptionalSPO(NextBindingInfo nextBindingInfo) throws SDMInterpreterException
	{
		try
		{
			getVariableScope().getInterpreterManager().getReadLock().lock();

			assert !matchingState.boundOptionalSPO.contains(nextBindingInfo.targetLinkEndAdapter.getStoryPatternObjectAdapter());

			// int stackSize = matchingState.matchTransactionStack.size();

			/*
			 * Find the first target object that matches.
			 */
			IInstanceAdapter targetInstanceAdapter = null;

			IStoryPatternObjectAdapter targetSpoAdapter = nextBindingInfo.targetLinkEndAdapter.getStoryPatternObjectAdapter();

			matchingStoryPatternObject(nextBindingInfo.sourceLinkEndAdapter.getStoryPatternObjectAdapter(), targetSpoAdapter,
					nextBindingInfo.sourceLinkEndAdapter, nextBindingInfo.targetLinkEndAdapter);

			Map<IPropertyAdapter, IInstanceAdapter> allBoundLinkEnds = null;

			if (nextBindingInfo.sourceLinkEndAdapter.getStoryPatternLinkAdapter().getLinkEndAdapters().size() == 2)
			{
				allBoundLinkEnds = Collections.emptyMap();
			}
			else
			{
				allBoundLinkEnds = getAllBoundLinkEnds(nextBindingInfo.sourceLinkEndAdapter.getStoryPatternLinkAdapter());
			}

			IInstanceAdapter keyValueAdapter = nextBindingInfo.sourceLinkEndAdapter.getKeyInstanceAdapter(getVariableScope()); 
         IPropertyValueIterator propertyTargetIterator = nextBindingInfo.sourceInstanceAdapter
               .getPropertyTargetIterator(nextBindingInfo.sourceLinkEndAdapter.getPropertyAdapter(), keyValueAdapter,
                     nextBindingInfo.targetLinkEndAdapter.getPropertyAdapter(), allBoundLinkEnds);

			while ((targetInstanceAdapter = propertyTargetIterator.getNext()) != null)
			{
				IClassifierAdapter targetClassifierAdapter = targetSpoAdapter.getClassifierAdapter();

				/*
				 * The target object must not be bound to another story pattern
				 * object, the targetSpo must not have been bound to the
				 * targetObject before, and the type of the targetObject must be
				 * correct.
				 */
				if (!matchingState.boundInstanceObjects.contains(targetInstanceAdapter)
						&& !matchingState.matchingHistoryContains(targetSpoAdapter, targetInstanceAdapter)
						&& targetClassifierAdapter.isInstance(targetInstanceAdapter))
				{
					getVariableScope().createVariable(targetSpoAdapter.getName(), targetClassifierAdapter, targetInstanceAdapter);

					assert matchingState.unboundOptionalSPO.contains(targetSpoAdapter);
					assert !matchingState.boundOptionalSPO.contains(targetSpoAdapter);
					assert !matchingState.boundInstanceObjects.contains(targetInstanceAdapter);

					storyPatternObjectBound(targetSpoAdapter, targetInstanceAdapter);

					/*
					 * Check links and attributes.
					 */
					if (checkSPOConstraints(targetSpoAdapter))
					{
						matchingState.unboundOptionalSPO.remove(targetSpoAdapter);
						matchingState.boundOptionalSPO.add(targetSpoAdapter);

						matchStoryPatternObjectSuccessful(targetSpoAdapter, targetInstanceAdapter);

						return true;
					}
					else
					{
						// rollBack(stackSize);

						revokingStoryPatternObjectBinding(targetSpoAdapter, targetInstanceAdapter);
					}
				}
			}

			// rollBackToLastBindingLink();

			matchStoryPatternObjectFailed(targetSpoAdapter);
		}
		finally
		{
			getVariableScope().getInterpreterManager().getReadLock().unlock();
		}

		return false;
	}

	protected Map<IPropertyAdapter, IInstanceAdapter> getAllBoundLinkEnds(IStoryPatternLinkAdapter storyPatternLinkAdapter)
	{
		Map<IPropertyAdapter, IInstanceAdapter> resultMap = new HashMap<IPropertyAdapter, IInstanceAdapter>();

		for (IStoryPatternLinkEndAdapter linkEndAdapter : storyPatternLinkAdapter.getLinkEndAdapters())
		{
			if (matchingState.boundSPO.contains(linkEndAdapter.getStoryPatternObjectAdapter()))
			{
				resultMap.put(linkEndAdapter.getPropertyAdapter(),
						getVariableScope().getVariable(linkEndAdapter.getStoryPatternObjectAdapter().getName()).getValueAdapter());
			}
		}

		return resultMap;
	}

	private boolean checkSPOConstraints(IStoryPatternObjectAdapter spo) throws SDMInterpreterException
	{
		try
		{
			getVariableScope().getInterpreterManager().getReadLock().lock();

			for (IExpressionAdapter expression : spo.getConstraintExpressionAdapters())
			{
				IExpressionInterpreter expressionInterpreter = getVariableScope().getInterpreterManager().getMainInterpreterFactory()
						.getExpressionInterpreterFactory().getExpressionInterpreter(expression.getExpressionLanguage());

				assert expressionInterpreter != null;

				Variable instanceVariable = getVariableScope().getVariable(spo.getName());

				assert instanceVariable != null;

				Variable expressionResult = expressionInterpreter.evaluate(expression, getVariableScope(), spo.getClassifierAdapter(),
						instanceVariable.getValueAdapter());

				assert expressionResult != null;
				assert expressionResult.getValueAdapter().getValue() instanceof Boolean;

				if (expressionResult.getValueAdapter().getValue() == Boolean.FALSE)
				{
					checkStoryPatternObjectConstraintFailed(spo, expression);

					return false;
				}
				else
				{
					checkStoryPatternObjectConstraintSuccessful(spo, expression);
				}
			}

			return true;
		}
		finally
		{
			getVariableScope().getInterpreterManager().getReadLock().unlock();
		}
	}

	private boolean checkLinksOfObject(IStoryPatternObjectAdapter spo)
	{
		/*
		 * Check connected link ends
		 */
		for (IStoryPatternLinkEndAdapter linkEndAdapter : spo.getLinkEndAdapters())
		{
			IStoryPatternLinkAdapter link = linkEndAdapter.getStoryPatternLinkAdapter();

			if (matchingState.uncheckedSPL.contains(link))
			{
				for (IStoryPatternLinkEndAdapter lea : linkEndAdapter.getStoryPatternLinkAdapter().getLinkEndAdapters())
				{
					if (lea.getPropertyAdapter().isNavigable() && matchingState.boundSPO.contains(lea.getStoryPatternObjectAdapter()))
					{
						if (!checkLink(lea))
						{
							return false;
						}

						break;
					}
				}
			}
		}

		return true;
	}

	private boolean checkLink(IStoryPatternLinkEndAdapter sourceLinkEndAdapter)
	{
		try
		{
			getVariableScope().getInterpreterManager().getReadLock().lock();

			assert sourceLinkEndAdapter != null;

			IStoryPatternObjectAdapter sourceSpo = sourceLinkEndAdapter.getStoryPatternObjectAdapter();

			assert sourceSpo != null;
			assert matchingState.boundSPO.contains(sourceSpo);

			Variable sourceVariable = getVariableScope().getVariable(sourceSpo.getName());

			assert sourceVariable != null;
			assert sourceVariable.getValueAdapter() != null;

			boolean allEndsChecked = true;
			
			IInstanceAdapter keyValueAdapter = sourceLinkEndAdapter.getKeyInstanceAdapter(getVariableScope()); 

			for (IStoryPatternLinkEndAdapter targetLinkEndAdapter : sourceLinkEndAdapter.getStoryPatternLinkAdapter().getLinkEndAdapters())
			{
				if (targetLinkEndAdapter == sourceLinkEndAdapter)
				{
					// Do nothing yet
				}
				else if (matchingState.uncheckedLinkEnds.contains(targetLinkEndAdapter)
						&& matchingState.boundSPO.contains(targetLinkEndAdapter.getStoryPatternObjectAdapter()))
				{
					IStoryPatternObjectAdapter targetSpo = targetLinkEndAdapter.getStoryPatternObjectAdapter();

					assert targetSpo != null;

					Variable targetVariable = getVariableScope().getVariable(targetSpo.getName());

					assert targetVariable != null;
					assert targetVariable.getValueAdapter() != null;
					
					

               if (sourceVariable.getValueAdapter().propertyContainsInstance(sourceLinkEndAdapter.getPropertyAdapter(),
                     keyValueAdapter, targetVariable.getValueAdapter(), targetLinkEndAdapter.getPropertyAdapter()))
					{
						/*
						 * Create a transaction for the target link end
						 */
						Transaction<IStoryPatternLinkEndAdapter> transaction = new Transaction<IStoryPatternLinkEndAdapter>(
								targetLinkEndAdapter, matchingState.uncheckedLinkEnds, matchingState.checkedLinkEnds,
								TransactionTypeEnum.LINK_CHECKED);
						transaction.commit();

						matchingState.matchTransactionStack.push(transaction);

						storyPatternLinkEndCheckSuccessful(targetLinkEndAdapter);
					}
					else
					{
						storyPatternLinkEndCheckFailed(targetLinkEndAdapter);

						storyPatternLinkCheckFailed(targetLinkEndAdapter.getStoryPatternLinkAdapter());

						return false;
					}
				}
				else
				{
					allEndsChecked = false;
				}
			}

			if (allEndsChecked)
			{
				/*
				 * Create a transaction for the source link end
				 */
				Transaction<IStoryPatternLinkEndAdapter> transaction2 = new Transaction<IStoryPatternLinkEndAdapter>(sourceLinkEndAdapter,
						matchingState.uncheckedLinkEnds, matchingState.checkedLinkEnds, TransactionTypeEnum.LINK_CHECKED);
				transaction2.commit();

				matchingState.matchTransactionStack.push(transaction2);

				storyPatternLinkEndCheckSuccessful(sourceLinkEndAdapter);

				/*
				 * Create a transaction for the link adapter
				 */
				Transaction<IStoryPatternLinkAdapter> transaction = new Transaction<IStoryPatternLinkAdapter>(
						sourceLinkEndAdapter.getStoryPatternLinkAdapter(), matchingState.uncheckedSPL, matchingState.checkedSPL,
						TransactionTypeEnum.LINK_CHECKED);
				transaction.commit();

				matchingState.matchTransactionStack.push(transaction);

				storyPatternLinkCheckSuccessful(sourceLinkEndAdapter.getStoryPatternLinkAdapter());
			}

			return true;
		}
		finally
		{
			getVariableScope().getInterpreterManager().getReadLock().unlock();
		}
	}

	private void deleteObjects()
	{
		/*
		 * At first delete all links in the story pattern.
		 */
		for (IStoryPatternLinkAdapter link : matchingState.deletedSPL)
		{
			IInstanceAdapter sourceInstance = null;
			IPropertyAdapter sourceProperty = null;
			IInstanceAdapter sourceKey = null;

			Map<IPropertyAdapter, IInstanceAdapter> map = new HashMap<IPropertyAdapter, IInstanceAdapter>();

			for (IStoryPatternLinkEndAdapter linkEndAdapter : link.getLinkEndAdapters())
			{
				Variable variable = getVariableScope().getVariable(linkEndAdapter.getStoryPatternObjectAdapter().getName());

				assert variable != null;

				if (sourceInstance == null && linkEndAdapter.getPropertyAdapter().isNavigable())
				{
					sourceInstance = variable.getValueAdapter();
					sourceProperty = linkEndAdapter.getPropertyAdapter();
					sourceKey = linkEndAdapter.getKeyInstanceAdapter(getVariableScope());
				}
				else
				{
					map.put(linkEndAdapter.getPropertyAdapter(), variable.getValueAdapter());
				}
			}

			assert sourceInstance != null;

			beforeInstanceLinkDeleted(link);

			sourceInstance.destroyAssociation(sourceProperty, sourceKey, map);

			afterInstanceLinkDeleted(link);
		}

		// delete optional links
		// TODO nice to have but not necessary!

		// Delete all marked story pattern objects.
		for (IStoryPatternObjectAdapter spo : matchingState.deletedSPO)
		{
			Variable variable = getVariableScope().deleteVariable(spo.getName());

			assert variable != null;

			beforeInstanceObjectDeleted(spo, variable.getValueAdapter());

			variable.getValueAdapter().delete();

			afterInstanceObjectDeleted(spo, variable.getValueAdapter());
		}

		// delete optional story pattern objects
		for (IStoryPatternObjectAdapter spo : matchingState.deletedOptionalSPO)
		{
			if (matchingState.boundOptionalSPO.contains(spo))
			{
				Variable variable = getVariableScope().deleteVariable(spo.getName());

				assert variable != null;

				beforeInstanceObjectDeleted(spo, variable.getValueAdapter());

				variable.getValueAdapter().delete();

				afterInstanceObjectDeleted(spo, variable.getValueAdapter());
			}
		}
	}

	private void createObjects()
	{
		// Create new story pattern objects
		for (IStoryPatternObjectAdapter spo : matchingState.createdSPO)
		{
			if (matchingState.boundOptionalSPO.contains(spo))
			{
				continue;
			}
			IInstanceAdapter instanceAdapter = getVariableScope().getInterpreterManager().getMainAdapterFactory().getM3AdapterFactory()
					.createNewInstance(spo.getClassifierAdapter());

			getVariableScope().createVariable(spo.getName(), spo.getClassifierAdapter(), instanceAdapter);

			instanceObjectCreated(spo);
		}

		// connect story pattern object with new links
		boolean optionalAlreadyExists = false;
		for (IStoryPatternLinkAdapter link : matchingState.createdSPL)
		{
			/*
			 * Check weather the link is already created, if the optional target
			 * story pattern object already exists.
			 */
			for (IStoryPatternLinkEndAdapter lea : link.getLinkEndAdapters())
			{
				if (matchingState.boundOptionalSPO.contains(lea.getStoryPatternObjectAdapter()))
				{
					optionalAlreadyExists = true;
					break;
				}
			}

			if (optionalAlreadyExists)
			{
				optionalAlreadyExists = false;
				continue;
			}
			/*
			 * Create a map that maps link end adapters to instance objects
			 */
			Map<IPropertyAdapter, IInstanceAdapter> map = new HashMap<IPropertyAdapter, IInstanceAdapter>();

			IInstanceAdapter sourceInstance = null;
			IInstanceAdapter sourceKey = null;
			IPropertyAdapter sourceProperty = null;

			for (IStoryPatternLinkEndAdapter linkEndAdapter : link.getLinkEndAdapters())
			{
			   IInstanceAdapter instance = linkEndAdapter.getInstanceAdapter(this.getVariableScope());

				assert instance != null;

				if (sourceInstance == null && linkEndAdapter.getPropertyAdapter().isNavigable())
				{
					sourceInstance = instance;
					sourceProperty = linkEndAdapter.getPropertyAdapter();
					sourceKey = linkEndAdapter.getKeyInstanceAdapter(getVariableScope());
				}
				else
				{
					map.put(linkEndAdapter.getPropertyAdapter(), instance);
				}
			}

			assert sourceInstance != null;

			sourceInstance.createAssociation(sourceProperty, sourceKey, map);

			instanceLinkCreated(link);
		}
	}

	private void assignFeatureValues() throws SDMInterpreterException
	{
		Set<IStoryPatternObjectAdapter> set = new HashSet<IStoryPatternObjectAdapter>();
		set.addAll(matchingState.boundSPO);
		set.addAll(matchingState.unboundSPO);
		set.addAll(matchingState.createdSPO);
		set.addAll(matchingState.boundOptionalSPO);

		Map<IStoryPatternObjectAdapter, Map<IPropertyAdapter, IInstanceAdapter>> newValuesMap = new HashMap<IStoryPatternObjectAdapter, Map<IPropertyAdapter, IInstanceAdapter>>();

		/*
		 * Calculate new attribute values
		 */
		for (IStoryPatternObjectAdapter spo : set)
		{
			if (!spo.getPropertyAssignmentAdapters().isEmpty())
			{
				Variable variable = getVariableScope().getVariable(spo.getName());

				Map<IPropertyAdapter, IInstanceAdapter> map = new HashMap<IPropertyAdapter, IInstanceAdapter>();

				newValuesMap.put(spo, map);

				for (IPropertyAssignmentAdapter featureAssignmentAdapter : spo.getPropertyAssignmentAdapters())
				{
					IExpressionAdapter expressionAdapter = featureAssignmentAdapter.getExpressionAdapter();

					IExpressionInterpreter expressionInterpreter = getVariableScope().getInterpreterManager().getMainInterpreterFactory()
							.getExpressionInterpreterFactory().getExpressionInterpreter(expressionAdapter.getExpressionLanguage());

					Variable expressionResult = expressionInterpreter.evaluate(expressionAdapter, getVariableScope(),
							spo.getClassifierAdapter(), variable.getValueAdapter());

					map.put(featureAssignmentAdapter.getPropertyAdapter(), expressionResult.getValueAdapter());
				}
			}
		}

		/*
		 * assign new attribute values
		 */
		for (Entry<IStoryPatternObjectAdapter, Map<IPropertyAdapter, IInstanceAdapter>> spoEntry : newValuesMap.entrySet())
		{
			for (Entry<IPropertyAdapter, IInstanceAdapter> propertyEntry : spoEntry.getValue().entrySet())
			{
				Variable variable = getVariableScope().getVariable(spoEntry.getKey().getName());
				
				variable.getValueAdapter().setPropertyValue(propertyEntry.getKey(), null, propertyEntry.getValue());

				attributeValueAssignment(spoEntry.getKey(), propertyEntry.getKey(), propertyEntry.getValue());
			}
		}
	}

	/**
	 * Rolls back all transactions of matchTransactions until matchTransactions
	 * has the specified size.
	 * 
	 * @param size
	 */
	private void rollBack(int size)
	{
		while (matchingState.matchTransactionStack.size() > size)
		{
			popFromMatchTransactions();
		}
	}

	/**
	 * Rolls back all transactions of matchTransaction to last transaction which
	 * has it bindingLink attribute set to true. This transaction is rolled back
	 * as well.
	 * 
	 * @throws StoryDiagramInterpreterException
	 */
	protected void rollBackToLastBindingLink()
	{
		Transaction<? extends Object> transaction;

		do
		{
			do
			{
				transaction = popFromMatchTransactions();
			}
			while (transaction.transactionType != TransactionTypeEnum.BINDING_LINK && !matchingState.matchTransactionStack.isEmpty());
		}
		while (!allBoundSposExist());

	}

	private Transaction<? extends Object> popFromMatchTransactions()
	{
		assert !matchingState.matchTransactionStack.isEmpty();
		Transaction<? extends Object> transaction = matchingState.matchTransactionStack.pop();

		switch (transaction.transactionType)
		{
			/*
			 * If a StoryPatternObject was matched, delete its interpreter
			 * variable and the matching history of all other unbound story
			 * pattern objects
			 */
			case SPO_MATCHED:
			{
				IStoryPatternObjectAdapter spo = (IStoryPatternObjectAdapter) transaction.element;

				Variable variable = getVariableScope().deleteVariable(spo.getName());

				/*
				 * Delete the matching history
				 */
				for (IStoryPatternObjectAdapter s : matchingState.unboundSPO)
				{
					matchingState.clearMatchingHistory(s);
				}

				revokingStoryPatternObjectBinding(spo, variable.getValueAdapter());
			}
		}

		transaction.rollBack();

		return transaction;
	}

	private boolean allBoundSposExist()
	{
		for (IStoryPatternObjectAdapter spo : matchingState.boundSPO)
		{
			if (getVariableScope().getVariable(spo.getName()) == null)
			{
				return false;
			}
		}

		return true;
	}

	@Override
	protected void startTask(Task<?> task)
	{
		super.startTask(task);
	}

	/*
	 * The following operations are supposed to be overwritten by subclasses to
	 * be notified of important execution steps.
	 */

	protected void storyPatternLinkCheckSuccessful(IStoryPatternLinkAdapter storyPatternLinkAdapter)
	{
		// Do nothing
	}

	protected void storyPatternLinkCheckFailed(IStoryPatternLinkAdapter storyPatternLinkAdapter)
	{
		// Do nothing
	}

	protected void storyPatternLinkEndCheckSuccessful(IStoryPatternLinkEndAdapter linkEndAdapter)
	{
		// Do nothing
	}

	protected void storyPatternLinkEndCheckFailed(IStoryPatternLinkEndAdapter linkEndAdapter)
	{
		// Do nothing
	}

	protected void matchStoryPatternObjectFailed(IStoryPatternObjectAdapter storyPatternObjectAdapter)
	{
		// Do nothing
	}

	protected void revokingStoryPatternObjectBinding(IStoryPatternObjectAdapter storyPatternObjectAdapter, IInstanceAdapter instanceAdapter)
	{
		// Do nothing
	}

	protected void matchStoryPatternObjectSuccessful(IStoryPatternObjectAdapter storyPatternObjectAdapter, IInstanceAdapter instanceAdapter)
	{
		// Do nothing
	}

	protected void storyPatternObjectBound(IStoryPatternObjectAdapter storyPatternObjectAdapter, IInstanceAdapter instanceAdapter)
	{
		// Do nothing
	}

	protected void matchingStoryPatternObject(IStoryPatternObjectAdapter sourceStoryPatternObjectAdapter,
			IStoryPatternObjectAdapter targetStoryPatternObjectAdapter, IStoryPatternLinkEndAdapter sourceLinkEndAdapter,
			IStoryPatternLinkEndAdapter targetLinkEndAdapter)
	{
		// Do nothing
	}

	protected void checkStoryPatternObjectConstraintSuccessful(IStoryPatternObjectAdapter storyPatternObjectAdapter,
			IExpressionAdapter expressionAdapter)
	{
		// Do nothing
	}

	protected void checkStoryPatternObjectConstraintFailed(IStoryPatternObjectAdapter storyPatternObjectAdapter,
			IExpressionAdapter expressionAdapter)
	{
		// Do nothing
	}

	protected void afterInstanceObjectDeleted(IStoryPatternObjectAdapter storyPatternObjectAdapter, IInstanceAdapter instanceAdapter)
	{
		// Do nothing
	}

	protected void beforeInstanceObjectDeleted(IStoryPatternObjectAdapter storyPatternObjectAdapter, IInstanceAdapter instanceAdapter)
	{
		// Do nothing
	}

	protected void afterInstanceLinkDeleted(IStoryPatternLinkAdapter link)
	{
		// Do nothing
	}

	protected void beforeInstanceLinkDeleted(IStoryPatternLinkAdapter link)
	{
		// Do nothing
	}

	protected void instanceLinkCreated(IStoryPatternLinkAdapter link)
	{
		// Do nothing
	}

	protected void instanceObjectCreated(IStoryPatternObjectAdapter storyPatternObjectAdapter)
	{
		// Do nothing
	}

	protected void attributeValueAssignment(IStoryPatternObjectAdapter storyPatternObjectAdapter, IPropertyAdapter propertyAdapter,
			IInstanceAdapter valueAdapter)
	{
		// Do nothing
	}

	protected void checkStoryPatternConstraintFailed(IStoryPatternAdapter storyPatternAdapter, IExpressionAdapter expressionAdapter)
	{
		// Do nothing
	}

	protected void checkStoryPatternConstraintSuccessful(IStoryPatternAdapter storyPatternAdapter, IExpressionAdapter expressionAdapter)
	{
		// Do nothing
	}
}
