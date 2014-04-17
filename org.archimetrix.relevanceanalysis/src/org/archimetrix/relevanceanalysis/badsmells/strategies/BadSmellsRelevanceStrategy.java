package org.archimetrix.relevanceanalysis.badsmells.strategies;

/**
 * A super class for relevance strategies of the bad smell relevance analysis.
 * 
 * @author mcp
 * 
 */
public abstract class BadSmellsRelevanceStrategy implements IBadSmellsStrategy {
    /**
     * 
     * @param badSmellName name
     * @return bool
     */
    public abstract boolean applicable(String badSmellName);
}
