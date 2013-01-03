package org.archimetrix.relevanceanalysis;


import metricvalues.MetricValuesModel;


/**
 * An abstract super class for relevance analyses.
 * 
 * @author mcp
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 * 
 */
public abstract class AbstractRelevanceAnalysis<T>
{

   public static final int NUMBER_OF_RESULT_STRATEGIES = 2;


   protected MetricValuesModel metricValuesModel;

   protected RelevanceResults<T> relevanceValues;


   public AbstractRelevanceAnalysis(final MetricValuesModel model)
   {
      this.metricValuesModel = model;
   }


   public abstract void startAnalysis();


   public RelevanceResults<T> getResult()
   {
      return relevanceValues;
   }
}
