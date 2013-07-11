package org.archimetrix.relevanceanalysis.components;


import java.util.ArrayList;
import java.util.List;

import metricvalues.MetricValuesModel;

import org.archimetrix.relevanceanalysis.AbstractRelevanceAnalysis;
import org.archimetrix.relevanceanalysis.RelevanceAnalysisPlugin;
import org.archimetrix.relevanceanalysis.RelevanceResults;
import org.archimetrix.relevanceanalysis.components.strategies.ClosenessToThresholdStrategy;
import org.archimetrix.relevanceanalysis.components.strategies.ComplexityStrategy;
import org.archimetrix.relevanceanalysis.components.strategies.IComponentsStrategy;
import org.archimetrix.relevanceanalysis.components.strategies.ParetoOptimalComponentsResultStrategy;
import org.archimetrix.relevanceanalysis.components.strategies.VectorLengthComponentsResultStrategy;
import org.somox.sourcecodedecorator.ComponentImplementingClassesLink;
import org.somox.sourcecodedecorator.SourceCodeDecoratorRepository;


public class RelevantComponentAnalysis extends AbstractRelevanceAnalysis<ComponentImplementingClassesLink>
{
   private final SourceCodeDecoratorRepository scdModel;

   private List<IComponentsStrategy> relevanceStrategies;


   public RelevantComponentAnalysis(final SourceCodeDecoratorRepository scdModel, final MetricValuesModel model)
   {
      super(model);
      this.scdModel = scdModel;
      initializeRelevanceStrategiesMap();
   }


   private void initializeRelevanceStrategiesMap()
   {
      this.relevanceStrategies = new ArrayList<IComponentsStrategy>();
      this.relevanceStrategies.add(new ClosenessToThresholdStrategy());
      this.relevanceStrategies.add(new ComplexityStrategy());
      this.relevanceValues = new RelevanceResults<ComponentImplementingClassesLink>(this.relevanceStrategies.size()
            + NUMBER_OF_RESULT_STRATEGIES);
   }


   @Override
   public void startAnalysis()
   {
	   RelevanceAnalysisPlugin.getDefault().log("Started Component Relevance Analysis");
	   RelevanceAnalysisPlugin.getDefault().log("Started Component Relevance Analysis");
      for (int i = 0; i < this.relevanceStrategies.size() + AbstractRelevanceAnalysis.NUMBER_OF_RESULT_STRATEGIES; i++)
      {
         calculateRelevanceValuesForStrategy(i);
         RelevanceAnalysisPlugin.getDefault().log(
               "Components Rating: Finished rating for relevance strategy " + (i + 1) + "/"
                     + (this.relevanceStrategies.size() + AbstractRelevanceAnalysis.NUMBER_OF_RESULT_STRATEGIES) + ".");
      }
      RelevanceAnalysisPlugin.getDefault().log("Finished Component Relevance Analysis");
   }


   private void calculateRelevanceValuesForStrategy(final int i)
   {
      for (ComponentImplementingClassesLink link : this.scdModel.getComponentImplementingClassesLink())
      {
         VectorLengthComponentsResultStrategy resultStrategy = new VectorLengthComponentsResultStrategy();
         ParetoOptimalComponentsResultStrategy paretoOptimalResultStrategy = new ParetoOptimalComponentsResultStrategy();
         double relevanceValue = 0;
         if (i < this.relevanceStrategies.size())
         {
            relevanceValue = calculateRelevanceStrategies(i, link);
         }
         else
         {
            relevanceValue = calculateResultStrategies(i, link, resultStrategy, paretoOptimalResultStrategy);
         }
         this.relevanceValues.setRelevanceValue(link, i, relevanceValue);
      }
      RelevanceAnalysisPlugin.getDefault().log("Finished Component Relevance Analysis");
   }


   private double calculateRelevanceStrategies(final int i, final ComponentImplementingClassesLink link)
   {
      return this.relevanceStrategies.get(i).getRelevanceValue(link, this.metricValuesModel);
   }


   private double calculateResultStrategies(final int i, final ComponentImplementingClassesLink link,
         final VectorLengthComponentsResultStrategy resultStrategy,
         final ParetoOptimalComponentsResultStrategy paretoOptimalResultStrategy)
   {
      double relevanceValue;
      if (i == this.relevanceStrategies.size())
      {
         resultStrategy.setRelevanceResults(this.relevanceValues);
         relevanceValue = resultStrategy.getRelevanceValue(link, this.metricValuesModel);
      }
      else
      {
         paretoOptimalResultStrategy.setRelevanceResults(this.relevanceValues);
         relevanceValue = paretoOptimalResultStrategy.getRelevanceValue(link, this.metricValuesModel);
      }
      return relevanceValue;
   }

}
