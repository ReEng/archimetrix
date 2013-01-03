package org.archimetrix.relevanceanalysis.badsmells.strategies;


/**
 * A super class for relevance strategies of the bad smell relevance analysis.
 * 
 * @author mcp
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 * 
 */
public abstract class BadSmellsRelevanceStrategy implements IBadSmellsStrategy
{
   public abstract boolean applicable(String badSmellName);
}
