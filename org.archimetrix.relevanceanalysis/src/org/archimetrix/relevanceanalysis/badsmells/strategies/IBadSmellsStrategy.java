package org.archimetrix.relevanceanalysis.badsmells.strategies;


import metricvalues.ComponentCandidate;
import metricvalues.MetricValuesModel;

import org.reclipse.structure.inference.annotations.ASGAnnotation;


/**
 * This interface should be implemented by relevance strategies of the bad smell relevance analysis.
 * 
 * @author mcp
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 * 
 */
public interface IBadSmellsStrategy
{

   public double getRelevanceValue(ASGAnnotation badSmellAnnotation, ComponentCandidate comp,
         MetricValuesModel metricValuesModel);

}
