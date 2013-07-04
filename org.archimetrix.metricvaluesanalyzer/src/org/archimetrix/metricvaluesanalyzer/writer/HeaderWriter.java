package org.archimetrix.metricvaluesanalyzer.writer;


import java.io.BufferedWriter;
import java.io.IOException;

import metricvalues.Iteration;
import metricvalues.MetricValuesModel;


public class HeaderWriter
{

   private final BufferedWriter bf;


   public HeaderWriter(final BufferedWriter bf)
   {
      this.bf = bf;
   }


   public void writeHeaderLines(final String inputFile, final MetricValuesModel model, final Iteration iteration) throws IOException
   {
      bf.append("\n");
      writeProjectInfo(bf, model, inputFile);
      writeIterationInfo(bf, model, iteration);
      bf.append(";;InterfaceAdh;InterfaceAccesses;Coupling;AfferentC;EfferentC;IntAccesses;ExtAccesses;PackageM;DirectoryM;TotalTypes;AbstractTypes;Abstractness;Instability;SubsystemComp;DMS;NameRes;SLAQ;");
      bf.append(";Name resemblance;Interface adherence;Subsystem component;HierarchyMapping;MERGE;");
      bf.append(";Name resemblance;Interface adherence;Subsystem component;HierarchyMapping;DMS;COMPOSE");
      bf.append("\n");
   }


   private void writeProjectInfo(final BufferedWriter bf, final MetricValuesModel model, final String inputFile) throws IOException
   {
      bf.append(inputFile);
//      Iteration lastIteration = model.getIterations(model.getIterationsLength() - 1);
//      bf.append(";;Last Resulting components: " + lastIteration.getComponentCandidatesLength() + ";;");
      bf.append(";;;;;");
   }


   private void writeIterationInfo(final BufferedWriter bf, final MetricValuesModel model, final Iteration iteration) throws IOException
   {
      bf.append(";;Iteration " + iteration.getNumber());
      bf.append(";;CurMergeThreshold: " + iteration.getCurMergeThreshold() + ";;;CurCompThreshold: "
            + iteration.getCurCompThreshold() + ";;");
      bf.append("\n");
   }

}
