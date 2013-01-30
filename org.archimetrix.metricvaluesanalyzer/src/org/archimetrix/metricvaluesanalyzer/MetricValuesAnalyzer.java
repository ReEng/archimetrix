package org.archimetrix.metricvaluesanalyzer;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import metricvalues.Iteration;
import metricvalues.MetricValuesModel;
import metricvalues.MetricvaluesPackage;

import org.archimetrix.metricvaluesanalyzer.writer.ComponentPairValuesWriter;
import org.archimetrix.metricvaluesanalyzer.writer.HeaderWriter;
import org.archimetrix.metricvaluesanalyzer.writer.ResultingComponentsWriter;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.somox.configuration.SoMoXConfiguration;

import de.fzi.gast.core.corePackage;

import eu.qimpress.sourcecodedecorator.SourceCodeDecoratorPackage;


public class MetricValuesAnalyzer
{

   private final File outputfile;

   private SoMoXConfiguration somoxConfig;

   // 0 = all iterations; 1 = only first iteration; 2 = last iteration with comp cand pairs; 3 =
   // only resulting components
   private final int modus;

   private final boolean append;

   private final String input;

   private String inputFileString;


   public MetricValuesAnalyzer(final boolean append, final int modus, final String input, final String output)
   {
      this.input = input;
      this.append = append;
      this.outputfile = new File(output);
      this.modus = modus;
   }


   public MetricValuesModel loadModel(final String inputFileName)
   {
      MetricvaluesPackage.eINSTANCE.eClass();
      SourceCodeDecoratorPackage.eINSTANCE.eClass();
      corePackage.eINSTANCE.eClass();
      URI uri = URI.createPlatformResourceURI(inputFileName, true);
      ResourceSet metricValuesRess = new ResourceSetImpl();
      URI normalized = metricValuesRess.getURIConverter().normalize(uri);
      Resource resource = metricValuesRess.getResource(normalized, true);

      EcoreUtil.resolveAll(resource);

      return (MetricValuesModel) resource.getContents().get(0);
   }


   public void printResult() throws IOException
   {
      BufferedWriter bf = new BufferedWriter(new FileWriter(this.outputfile, this.append));


      String[] inputFiles = this.input.split(";");
      for (int i = 0; i < inputFiles.length; i++)
      {
         this.inputFileString = inputFiles[i];
         MetricValuesModel model = loadModel(this.inputFileString);

         if (this.modus == 0)
         {
            printAllIterations(bf, model);
         }
         else if (this.modus == 1)
         {
            printFirstIteration(bf, model);
         }
         else if (this.modus == 2)
         {
            printLastIteration(bf, model);
         }
         else if (this.modus == 3)
         {
            HeaderWriter hw = new HeaderWriter(bf);
            hw.writeHeaderLines(this.inputFileString, model, model.getIterations(0));
            ResultingComponentsWriter rw = new ResultingComponentsWriter(bf);
            rw.writeResultingComponents(model);
         }
         
         Activator.getDefault().log("Printed values for file " + inputFiles[i] + ".");
      }

      bf.close();
   }


   /**
    * Prints the last iteration that has component candidate pairs.
    * 
    * @param bf
    * @throws IOException
    */
   private void printLastIteration(final BufferedWriter bf, final MetricValuesModel model) throws IOException
   {
      printOneIteration(bf, MetricValuesHelper.getLastIterationWithCompCandPairs(model), model);
   }


   private void printFirstIteration(final BufferedWriter bf, final MetricValuesModel model) throws IOException
   {
      printOneIteration(bf, model.getIterations(0), model);
   }


   private void printAllIterations(final BufferedWriter bf, final MetricValuesModel model) throws IOException
   {
      for (int i = 0; i < model.getIterations().length; i++)
      {
         printOneIteration(bf, model.getIterations()[i], model);
      }
   }


   private void printOneIteration(final BufferedWriter bf, final Iteration iteration, final MetricValuesModel model) throws IOException
   {
      HeaderWriter hw = new HeaderWriter(bf);
      hw.writeHeaderLines(this.inputFileString, model, iteration);

      ComponentPairValuesWriter cw = new ComponentPairValuesWriter(bf, getSomoxConfig(model));
      cw.writeComponentCandidates(iteration);

      ResultingComponentsWriter rw = new ResultingComponentsWriter(bf);
      rw.writeResultingComponents(model);
   }


   private SoMoXConfiguration getSomoxConfig(final MetricValuesModel model)
   {
      if (this.somoxConfig == null)
      {
         this.somoxConfig = createSoMoXConfig(model);
      }
      return this.somoxConfig;
   }


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
