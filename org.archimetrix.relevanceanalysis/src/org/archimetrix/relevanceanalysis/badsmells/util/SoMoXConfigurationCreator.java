package org.archimetrix.relevanceanalysis.badsmells.util;


import metricvalues.MetricValuesModel;

import org.somox.configuration.SoMoXConfiguration;


/**
 * The SoMoXConfigurationCreator creates a SoMoX configuration from a given metric values model.
 * 
 * @author mcp
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 * 
 */
public class SoMoXConfigurationCreator
{
   public static SoMoXConfiguration createSoMoXConfig(final MetricValuesModel model)
   {
      SoMoXConfiguration somoxConfig = new SoMoXConfiguration();
      somoxConfig.setWeightLowCoupling(model.getWeightLowCoupling());
      somoxConfig.setWeightHighCoupling(model.getWeightHighCoupling());
      somoxConfig.setWeightLowNameResemblance(model.getWeightLowNameResemblance());
      somoxConfig.setWeightMidNameResemblance(model.getWeightMidNameResemblance());
      somoxConfig.setWeightHighNameResemblance(model.getWeightHighNameResemblance());
      somoxConfig.setWeightHighestNameResemblance(model.getWeightHighestNameResemblance());
      somoxConfig.setWeightInterfaceViolationRelevant(model.getWeightInterfaceViolationRelevant());
      somoxConfig.setWeightInterfaceViolationIrrelevant(model.getWeightInterfaceViolationIrrelevant());
      somoxConfig.setWeightHighSLAQ(model.getWeightHighSLAQ());
      somoxConfig.setWeightLowSLAQ(model.getWeightLowSLAQ());
      somoxConfig.setWeightPackageMapping(model.getWeightPackageMapping());
      somoxConfig.setWeightDirectoryMapping(model.getWeightDirectoryMapping());
      somoxConfig.setWeightDMS(model.getWeightDMS());
      return somoxConfig;
   }
}
