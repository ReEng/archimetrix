package org.archimetrix.relevanceanalysis.badsmells.util;


import org.somox.configuration.SoMoXConfiguration;


/**
 * This class calculates the overall merge metric as it is done in SoMoX (see
 * org.somox.analyzer.simplemodelanalyzer.metrics.MergeIndicationFunction). In contrast to the
 * classes used in SoMoX, the MergeIndicationFunctionCalculator provides access to the results for
 * the clustering strategies that are combined in the overall merge metric (e.g.
 * getHierarchyMappingStrategy or getInterfaceAdherenceStrategy).
 * 
 * @author mcp
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 * 
 */
public class MergeIndicationFunctionCalculator
{

   private final SoMoXConfiguration somoxConfig;

   private double packageMappingWeight, directoryMappingWeight, interfaceAdherenceWeight, subsystemComponentWeight;


   public MergeIndicationFunctionCalculator(final SoMoXConfiguration somoxConfiguration)
   {
      this.somoxConfig = somoxConfiguration;
      getWeightsFromConfiguration();
   }


   private double calculateMaxNameResemblanceWeigth()
   {
      double result = Math.max(this.somoxConfig.getWeightLowCoupling(), this.somoxConfig.getWeightHighCoupling());
      result = Math.max(result, this.somoxConfig.getWeightLowNameResemblance());
      result = Math.max(result, this.somoxConfig.getWeightMidNameResemblance());
      result = Math.max(result, this.somoxConfig.getWeightHighNameResemblance());
      result = Math.max(result, this.somoxConfig.getWeightHighestNameResemblance());

      return result;
   }


   private double calculateNameResemblance(final double nameResemblance, final double coupling)
   {

      // determine nameResemblance
      if (coupling >= 0 && coupling < 0.2)
      {
         return this.somoxConfig.getWeightLowNameResemblance() * nameResemblance;
      }
      else if (coupling >= 0.2 && coupling < 0.7)
      {
         return this.somoxConfig.getWeightMidNameResemblance() * nameResemblance;
      }
      else if (coupling >= 0.7 && coupling < 0.9)
      {
         return this.somoxConfig.getWeightHighNameResemblance() * nameResemblance;
      }
      else
      {
         return this.somoxConfig.getWeightHighestNameResemblance() * nameResemblance;
      }
   }


   private double calculateInterfaceAdherenceWeight(final double coupling, final double interfaceAdherence)
   {
      if (coupling >= 0.3)
      {
         if (interfaceAdherence > 0.0)
         {
            this.interfaceAdherenceWeight = this.somoxConfig.getWeightInterfaceViolationRelevant();
         }
         else
         {
            this.interfaceAdherenceWeight = -1 * this.somoxConfig.getWeightInterfaceViolationIrrelevant();
         }
      }
      else
      {
         this.interfaceAdherenceWeight = 0.0;
      }
      return this.interfaceAdherenceWeight;
   }


   private double calculateSubsystemComponentWeight(final double slaq)
   {
      if (slaq >= 0.5)
      {
         this.subsystemComponentWeight = this.somoxConfig.getWeightHighSLAQ();
      }
      else
      {
         this.subsystemComponentWeight = this.somoxConfig.getWeightLowSLAQ();
      }
      return this.subsystemComponentWeight;
   }


   private void getWeightsFromConfiguration()
   {
      this.packageMappingWeight = this.somoxConfig.getWeightPackageMapping();
      this.directoryMappingWeight = this.somoxConfig.getWeightDirectoryMapping();
   }


   /**
    * Returns the resulting metric value for the name resemblance strategy.
    * 
    * @param nameResemblance metric value
    * @param coupling metric value
    * @return name resemblance double value
    */
   public double getNameResemblanceStrategy(final double nameResemblance, final double coupling)
   {
      return calculateNameResemblance(nameResemblance, coupling);
   }


   /**
    * Returns the resulting metric value for the interface adherence strategy.
    * 
    * @param interfaceAdherence metric value
    * @param coupling metric value
    * @return interface adherence double value
    */
   public double getInterfaceAdherenceStrategy(final double interfaceAdherence, final double coupling)
   {
      return interfaceAdherence * calculateInterfaceAdherenceWeight(coupling, interfaceAdherence);
   }


   /**
    * Returns the resulting metric value for the subsystem component strategy.
    * 
    * @param subsystemComponent metric value
    * @param slaq metric value
    * @return subsystem component double value
    */
   public double getSubsystemComponentStrategy(final double subsystemComponent, final double slaq)
   {
      return subsystemComponent * calculateSubsystemComponentWeight(slaq);
   }


   /**
    * Returns the resulting metric value for the hierarchy mapping strategy.
    * 
    * @param packageMapping metric value
    * @param directoryMapping metric value
    * @return hierarchy mapping double value
    */
   public double getHierarchyMappingStrategy(final double packageMapping, final double directoryMapping)
   {
      return packageMapping * this.packageMappingWeight + directoryMapping * this.directoryMappingWeight;
   }


   /**
    * Returns the overall merge metric value.
    * 
    * @param nameResemblanceStrategy
    * @param interfaceAdherenceStrategy
    * @param subsystemComponentStrategy
    * @param hierarchyMappingStrategy
    * @return merge metric double value
    */
   public double computeOverallDirectedMetricValue(final double nameResemblanceStrategy, final double interfaceAdherenceStrategy,
         final double subsystemComponentStrategy, final double hierarchyMappingStrategy)
   {
      double sum = calculateMaxNameResemblanceWeigth() + this.interfaceAdherenceWeight + this.subsystemComponentWeight
            + this.packageMappingWeight + this.directoryMappingWeight;

      double score = nameResemblanceStrategy - interfaceAdherenceStrategy + subsystemComponentStrategy
            + hierarchyMappingStrategy;

      score = score / sum;

      return score;
   }

}
