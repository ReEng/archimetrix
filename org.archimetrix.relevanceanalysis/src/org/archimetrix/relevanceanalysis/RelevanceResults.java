package org.archimetrix.relevanceanalysis;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class RelevanceResults<T>
{
   private Map<T, Double[]> relevanceValues = new HashMap<T, Double[]>();

   private int numberOfRelevanceStrategies;


   public int getNumberOfRelevanceStrategies()
   {
      return this.numberOfRelevanceStrategies;
   }


   public RelevanceResults(int numberOfRelevanceStrategies)
   {
      this.numberOfRelevanceStrategies = numberOfRelevanceStrategies;
   }


   public void setRelevanceValue(T relevanceSubject, int relevanceStrategyIndex, Double relevanceValue)
   {
      if (!this.relevanceValues.containsKey(relevanceSubject))
      {
         this.relevanceValues.put(relevanceSubject, new Double[this.numberOfRelevanceStrategies]);
      }
      this.relevanceValues.get(relevanceSubject)[relevanceStrategyIndex] = relevanceValue;
   }


   public Double[] getRelevanceValuesForStrategy(int strategyIndex)
   {
      Double[] values = new Double[this.relevanceValues.keySet().size()];
      int i = 0;
      for (T key : this.relevanceValues.keySet())
      {
         values[i] = this.relevanceValues.get(key)[strategyIndex];
         i++;
      }
      return values;
   }


   public Set<T> getRelevanceSubjects()
   {
      return this.relevanceValues.keySet();
   }


   public Double[] getRelevanceValues(T relevanceSubject)
   {
      return this.relevanceValues.get(relevanceSubject);
   }
}
