package de.mdelab.sdm.interpreter.common.storypatternmatcher;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

import de.mdelab.sdm.interpreter.common.adapters.IAdapter;
import de.mdelab.sdm.interpreter.common.adapters.m3.IInstanceAdapter;
import de.mdelab.sdm.interpreter.common.adapters.storypattern.IStoryPatternLinkAdapter;
import de.mdelab.sdm.interpreter.common.adapters.storypattern.IStoryPatternLinkEndAdapter;
import de.mdelab.sdm.interpreter.common.adapters.storypattern.IStoryPatternObjectAdapter;

/**
 * @author Stephan Hildebrandt
 * @author Sebastian Wätzoldt
 */
public class MatchingState
{
	public Set<IStoryPatternObjectAdapter>							boundSPO;

	public Set<IStoryPatternObjectAdapter>							unboundSPO;
	
	public Set<IStoryPatternObjectAdapter>							unboundOptionalSPO;
	
	public Set<IStoryPatternObjectAdapter> 							boundOptionalSPO;

	public Set<IStoryPatternLinkAdapter>							checkedSPL;

	public Set<IStoryPatternLinkAdapter>							uncheckedSPL;
	
	public Set<IStoryPatternLinkAdapter> 							optionalSPL;

	public Set<IStoryPatternLinkEndAdapter>							checkedLinkEnds;

	public Set<IStoryPatternLinkEndAdapter>							uncheckedLinkEnds;

	public List<IStoryPatternObjectAdapter>							createdSPO;

	public List<IStoryPatternObjectAdapter>							deletedSPO;
	
	public List<IStoryPatternObjectAdapter> 						deletedOptionalSPO;

	public List<IStoryPatternLinkAdapter>							createdSPL;

	public List<IStoryPatternLinkAdapter>							deletedSPL;
	
   public List<IStoryPatternObjectAdapter>                  negativeSPO;

   public List<IStoryPatternLinkAdapter>                  negativeSPL;
   
	private Map<IStoryPatternObjectAdapter, Set<IInstanceAdapter>>	matchingHistory;

	public Set<IInstanceAdapter>									boundInstanceObjects;

	public Stack<Transaction<? extends IAdapter>>					matchTransactionStack;

	public MatchingState()
	{
		boundSPO = new HashSet<IStoryPatternObjectAdapter>();
		unboundSPO = new HashSet<IStoryPatternObjectAdapter>();
		unboundOptionalSPO = new HashSet<IStoryPatternObjectAdapter>();
		boundOptionalSPO = new HashSet<IStoryPatternObjectAdapter>();
		checkedSPL = new HashSet<IStoryPatternLinkAdapter>();
		uncheckedSPL = new HashSet<IStoryPatternLinkAdapter>();
		optionalSPL = new HashSet<IStoryPatternLinkAdapter>();
		checkedLinkEnds = new HashSet<IStoryPatternLinkEndAdapter>();
		uncheckedLinkEnds = new HashSet<IStoryPatternLinkEndAdapter>();
		createdSPO = new ArrayList<IStoryPatternObjectAdapter>();
		deletedSPO = new ArrayList<IStoryPatternObjectAdapter>();
		deletedOptionalSPO = new ArrayList<IStoryPatternObjectAdapter>();
		createdSPL = new ArrayList<IStoryPatternLinkAdapter>();
		deletedSPL = new ArrayList<IStoryPatternLinkAdapter>();
      negativeSPO = new ArrayList<IStoryPatternObjectAdapter>();
      negativeSPL = new ArrayList<IStoryPatternLinkAdapter>();
		matchingHistory = new HashMap<IStoryPatternObjectAdapter, Set<IInstanceAdapter>>();
		boundInstanceObjects = new HashSet<IInstanceAdapter>();
		matchTransactionStack = new Stack<Transaction<? extends IAdapter>>();
	}

	protected void addMatchingHistoryEntry(IStoryPatternObjectAdapter storyPatternObjectAdapter, IInstanceAdapter instanceAdapter)
	{
		Set<IInstanceAdapter> set = matchingHistory.get(storyPatternObjectAdapter);

		if (set == null)
		{
			set = new HashSet<IInstanceAdapter>();
			matchingHistory.put(storyPatternObjectAdapter, set);
		}

		assert !set.contains(instanceAdapter);
		set.add(instanceAdapter);
	}

	protected boolean matchingHistoryContains(IStoryPatternObjectAdapter storyPatternObjectAdapter, IInstanceAdapter instanceAdapter)
	{
		Set<IInstanceAdapter> set = matchingHistory.get(storyPatternObjectAdapter);

		if (set == null)
		{
			return false;
		}
		else
		{
			return set.contains(instanceAdapter);
		}
	}

	protected void clearMatchingHistory(IStoryPatternObjectAdapter storyPatternObjectAdapter)
	{
		Set<IInstanceAdapter> set = matchingHistory.get(storyPatternObjectAdapter);

		if (set != null)
		{
			set.clear();
		}
	}
}
