package org.archimetrix.metricvaluesanalyzer.writer;


import java.io.BufferedWriter;
import java.io.IOException;
import java.text.NumberFormat;

import metricvalues.ComponentCandidate;
import metricvalues.Iteration;
import metricvalues.MetricValue;

import org.archimetrix.metricvaluesanalyzer.Constants;
import org.archimetrix.metricvaluesanalyzer.MetricValuesHelper;
import org.archimetrix.metricvaluesanalyzer.calculation.CompositionIndicationFunctionHelper;
import org.archimetrix.metricvaluesanalyzer.calculation.MergeIndicationFunctionHelper;
import org.somox.configuration.SoMoXConfiguration;


public class ComponentPairValuesWriter
{

   private final BufferedWriter bf;

   private final SoMoXConfiguration somoxConfig;


   public ComponentPairValuesWriter(final BufferedWriter bf, final SoMoXConfiguration somoxConfig)
   {
      this.bf = bf;
      this.somoxConfig = somoxConfig;
   }


   public void writeComponentCandidates(final Iteration iteration) throws IOException
   {
      for (ComponentCandidate compCand : iteration.getComponentCandidatesList())
      {
         bf.append(Constants.CELL_SEPARATOR);
         bf.append(MetricValuesHelper.printComponent(compCand.getFirstComponent()) + ", ");
         bf.append(MetricValuesHelper.printComponent(compCand.getSecondComponent()) + Constants.CELL_SEPARATOR);

         writeMetricAndStrategyValues(bf, compCand);

         bf.append("\n");
      }
   }


   private void writeMetricAndStrategyValues(final BufferedWriter bf, final ComponentCandidate compCand)
         throws IOException
   {
      double nameResemblance = 0;
      double coupling = 0;
      double interfaceAdherence = 0;
      double subsystemComponent = 0;
      double slaq = 0;
      double packageMapping = 0;
      double directoryMapping = 0;
      double dms = 0;
      double interfaceAccesses = 0;
      double intAccesses = 0;
      double extAccesses = 0;
      double instability = 0;
      double afferentCoupling = 0;
      double efferentCoupling = 0;
      double totalTypes = 0;
      double abstractTypes = 0;
      double abstractness = 0;
      double defaultCompositionIndicatingMetric = 0;
      double defaultMergeIndicatingMetric = 0;

      for (int i = 0; i < compCand.getMetricValues().length; i++)
      {
         MetricValue metricValue = compCand.getMetricValues()[i];
         double value = metricValue.getValue();
         if (metricValue.getMetricID().endsWith(".NameResemblance"))
         {
            nameResemblance = value;
         }
         else if (metricValue.getMetricID().endsWith(".Coupling"))
         {
            coupling = value;
         }
         else if (metricValue.getMetricID().endsWith(".AdherenceToInterfaceCommunication"))
         {
            interfaceAdherence = value;
         }
         else if (metricValue.getMetricID().endsWith(".SubsystemComponent"))
         {
            subsystemComponent = value;
         }
         else if (metricValue.getMetricID().endsWith(".SliceLayerArchitectureQuality"))
         {
            slaq = value;
         }
         else if (metricValue.getMetricID().endsWith(".PackageMapping"))
         {
            packageMapping = value;
         }
         else if (metricValue.getMetricID().endsWith(".DirectoryMapping"))
         {
            directoryMapping = value;
         }
         else if (metricValue.getMetricID().endsWith(".DMS"))
         {
            dms = value;
         }
         else if (metricValue.getMetricID().endsWith(".InterfaceAccessesCount"))
         {
            interfaceAccesses = value;
         }
         else if (metricValue.getMetricID().endsWith(".AfferentCoupling"))
         {
            afferentCoupling = value;
         }
         else if (metricValue.getMetricID().endsWith(".EfferentCoupling"))
         {
            efferentCoupling = value;
         }
         else if (metricValue.getMetricID().endsWith(".InternalAccessesCount"))
         {
            intAccesses = value;
         }
         else if (metricValue.getMetricID().endsWith(".ExternalAccessesCount"))
         {
            extAccesses = value;
         }
         else if (metricValue.getMetricID().endsWith(".TotalTypesCount"))
         {
            totalTypes = value;
         }
         else if (metricValue.getMetricID().endsWith(".AbstractTypesCount"))
         {
            abstractTypes = value;
         }
         else if (metricValue.getMetricID().endsWith(".Abstractness"))
         {
            abstractness = value;
         }
         else if (metricValue.getMetricID().endsWith(".Instability"))
         {
            instability = value;
         }
         else if (metricValue.getMetricID().endsWith(".DefaultMergeIndicatingMetric"))
         {
            defaultMergeIndicatingMetric = value;
         }
         else if (metricValue.getMetricID().endsWith(".DefaultCompositionIndicatingMetric"))
         {
            defaultCompositionIndicatingMetric = value;
         }
      }

      NumberFormat nf = NumberFormat.getInstance();
      nf.setMaximumFractionDigits(5);

      bf.append(nf.format(interfaceAdherence)).append(Constants.CELL_SEPARATOR).append(nf.format(interfaceAccesses))
            .append(Constants.CELL_SEPARATOR).append(nf.format(coupling)).append(Constants.CELL_SEPARATOR)
            .append(nf.format(afferentCoupling)).append(Constants.CELL_SEPARATOR).append(nf.format(efferentCoupling))
            .append(Constants.CELL_SEPARATOR).append(nf.format(intAccesses)).append(Constants.CELL_SEPARATOR)
            .append(nf.format(extAccesses)).append(Constants.CELL_SEPARATOR).append(nf.format(packageMapping))
            .append(Constants.CELL_SEPARATOR).append(nf.format(directoryMapping)).append(Constants.CELL_SEPARATOR)
            .append(nf.format(totalTypes)).append(Constants.CELL_SEPARATOR).append(nf.format(abstractTypes))
            .append(Constants.CELL_SEPARATOR).append(nf.format(abstractness)).append(Constants.CELL_SEPARATOR)
            .append(nf.format(instability)).append(Constants.CELL_SEPARATOR).append(nf.format(subsystemComponent))
            .append(Constants.CELL_SEPARATOR).append(nf.format(dms)).append(Constants.CELL_SEPARATOR)
            .append(nf.format(nameResemblance)).append(Constants.CELL_SEPARATOR).append(nf.format(slaq));

      writeMergeStrategyValues(nf, bf, nameResemblance, coupling, interfaceAdherence, subsystemComponent, slaq,
            packageMapping, directoryMapping, defaultMergeIndicatingMetric);

      writeCompositionStrategyValues(nf, bf, nameResemblance, coupling, interfaceAdherence, subsystemComponent, slaq,
            packageMapping, directoryMapping, dms, defaultCompositionIndicatingMetric);
   }


   private void writeCompositionStrategyValues(final NumberFormat nf, final BufferedWriter bf,
         final double nameResemblance, final double coupling, final double interfaceAdherence,
         final double subsystemComponent, final double slaq, final double packageMapping,
         final double directoryMapping, final double dms, final double defaultCompositionIndicatingMetric)
         throws IOException
   {
      CompositionIndicationFunctionHelper cif = new CompositionIndicationFunctionHelper(somoxConfig);
      double nameResemblanceStrategy = cif.getNameResemblanceStrategy(nameResemblance, coupling);
      double interfaceAdherenceStrategy = cif.getInterfaceAdherenceStrategy(interfaceAdherence, coupling);
      double subsystemComponentStrategy = cif.getSubsystemComponentStrategy(subsystemComponent, slaq);
      double hierarchyMappingStrategy = cif.getHierarchyMappingStrategy(packageMapping, directoryMapping);
      double dmsStrategy = cif.getDmsStrategy(dms);

      bf.append(Constants.CELL_SEPARATOR).append(Constants.CELL_SEPARATOR).append(nf.format(nameResemblanceStrategy))
            .append(Constants.CELL_SEPARATOR).append(nf.format(interfaceAdherenceStrategy))
            .append(Constants.CELL_SEPARATOR).append(nf.format(subsystemComponentStrategy))
            .append(Constants.CELL_SEPARATOR).append(nf.format(hierarchyMappingStrategy))
            .append(Constants.CELL_SEPARATOR).append(nf.format(dmsStrategy));
      bf.append(Constants.CELL_SEPARATOR).append(nf.format(defaultCompositionIndicatingMetric));
   }


   private void writeMergeStrategyValues(final NumberFormat nf, final BufferedWriter bf, final double nameResemblance,
         final double coupling, final double interfaceAdherence, final double subsystemComponent, final double slaq,
         final double packageMapping, final double directoryMapping, final double defaultMergeIndicatingMetric)
         throws IOException
   {
      MergeIndicationFunctionHelper mif = new MergeIndicationFunctionHelper(somoxConfig);
      double nameResemblanceStrategy = mif.getNameResemblanceStrategy(nameResemblance, coupling);
      double interfaceAdherenceStrategy = mif.getInterfaceAdherenceStrategy(interfaceAdherence, coupling);
      double subsystemComponentStrategy = mif.getSubsystemComponentStrategy(subsystemComponent, slaq);
      double hierarchyMappingStrategy = mif.getHierarchyMappingStrategy(packageMapping, directoryMapping);

      bf.append(Constants.CELL_SEPARATOR).append(Constants.CELL_SEPARATOR).append(nf.format(nameResemblanceStrategy))
            .append(Constants.CELL_SEPARATOR).append(nf.format(interfaceAdherenceStrategy))
            .append(Constants.CELL_SEPARATOR).append(nf.format(subsystemComponentStrategy))
            .append(Constants.CELL_SEPARATOR).append(nf.format(hierarchyMappingStrategy));
      bf.append(Constants.CELL_SEPARATOR + nf.format(defaultMergeIndicatingMetric));
   }


}
