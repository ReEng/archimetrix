package org.archimetrix.architecturepreview.starters;


import metricvalues.MetricValuesModel;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.somox.analyzer.simplemodelanalyzer.jobs.SimpleModelAnalyzerJob;
import org.somox.configuration.SoMoXConfiguration;
import org.somox.ui.runconfig.ModelAnalyzerConfiguration;

import de.uka.ipd.sdq.workflow.OrderPreservingCompositeJob;
import de.uka.ipd.sdq.workflow.exceptions.JobFailedException;
import de.uka.ipd.sdq.workflow.exceptions.UserCanceledException;
import org.somox.sourcecodedecorator.SourceCodeDecoratorRepository;


/**
 * This class is responsible for starting a clustering with SoMoX.
 * 
 * @author mcp
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 * 
 */
public class SoMoXStarter
{
   private static final String SOURCECODEDECORATOR_FILE_NAME = "/internal_architecture_model.sourcecodedecorator";

   public static final String REENGINEERED_MODEL_FOLDER = "/reengineered_model";

   private final String projectName;

   private final String gastFileName;

   private SoMoXConfiguration somoxConfig;


   public SoMoXStarter(final String projectName, final String gastFileName)
   {
      this.projectName = projectName;
      this.gastFileName = gastFileName;
   }


   /**
    * Loads and returns the source code decorator model of the reengineered system, i.e. the
    * predicted architecture.
    * 
    * @return the source code decorator model that is created during the clustering on the
    *         transformed system.
    */
   public SourceCodeDecoratorRepository loadResultingSCDM()
   {
      StringBuilder path = new StringBuilder();
      path.append(this.somoxConfig.getFileLocations().getProjectName());
      path.append(this.somoxConfig.getFileLocations().getOutputFolder());
      path.append(SOURCECODEDECORATOR_FILE_NAME);
      URI scdmFileUri = URI.createPlatformResourceURI(path.toString(), true);
      ResourceSet scdmRess = new ResourceSetImpl();
      Resource scdmRes = scdmRess.getResource(scdmFileUri, true);
      return (SourceCodeDecoratorRepository) scdmRes.getContents().get(0);
   }


   /**
    * Starts SoMoX with the clustering configuration from a given metric values model.
    * 
    * @param metricValuesFilePath the path to a metric values model ecore file
    */
   public void callSoMoX(final String metricValuesFilePath)
   {
      MetricValuesModel model = loadMetricValuesModel(metricValuesFilePath);
      ModelAnalyzerConfiguration config = new ModelAnalyzerConfiguration();
      SoMoXConfiguration somoxConfiguration = createSoMoXConfig(model);

      config.setSomoxConfiguration(somoxConfiguration);
      OrderPreservingCompositeJob somoxJob = new OrderPreservingCompositeJob();
      try
      {
         somoxJob.add(new SimpleModelAnalyzerJob(config));
         somoxJob.execute(new NullProgressMonitor());
      }
      catch (CoreException e)
      {
         e.printStackTrace();
      }
      catch (JobFailedException e)
      {
         e.printStackTrace();
      }
      catch (UserCanceledException e)
      {
         e.printStackTrace();
      }
   }


   private MetricValuesModel loadMetricValuesModel(final String metricValuesFilePath)
   {
      URI metricValuesFileUri = URI.createPlatformResourceURI(metricValuesFilePath, true);
      ResourceSet metricValuesRess = new ResourceSetImpl();
      URI normalized = metricValuesRess.getURIConverter().normalize(metricValuesFileUri);
      Resource metricValuesRes = metricValuesRess.getResource(normalized, true);
      MetricValuesModel model = (MetricValuesModel) metricValuesRes.getContents().get(0);
      return model;
   }


   /**
    * Creates a SoMoX configuration from a given metric values model.
    * 
    * @param model a metric values model stored during a SoMoX clustering run
    * @return a SoMoX configuration that can be used to start a clustering
    */
   private SoMoXConfiguration createSoMoXConfig(final MetricValuesModel model)
   {
      if (this.somoxConfig == null)
      {
         this.somoxConfig = new SoMoXConfiguration();
         this.somoxConfig.setDefaults();

         this.somoxConfig.setWeightLowCoupling(model.getWeightLowCoupling());
         this.somoxConfig.setWeightHighCoupling(model.getWeightHighCoupling());
         this.somoxConfig.setWeightLowNameResemblance(model.getWeightLowNameResemblance());
         this.somoxConfig.setWeightMidNameResemblance(model.getWeightMidNameResemblance());
         this.somoxConfig.setWeightHighNameResemblance(model.getWeightHighNameResemblance());
         this.somoxConfig.setWeightHighestNameResemblance(model.getWeightHighestNameResemblance());
         this.somoxConfig.setWeightInterfaceViolationRelevant(model.getWeightInterfaceViolationRelevant());
         this.somoxConfig.setWeightInterfaceViolationIrrelevant(model.getWeightInterfaceViolationIrrelevant());
         this.somoxConfig.setWeightHighSLAQ(model.getWeightHighSLAQ());
         this.somoxConfig.setWeightLowSLAQ(model.getWeightLowSLAQ());
         this.somoxConfig.setWeightPackageMapping(model.getWeightPackageMapping());
         this.somoxConfig.setWeightDirectoryMapping(model.getWeightDirectoryMapping());
         this.somoxConfig.setWeightDMS(model.getWeightDMS());

         this.somoxConfig.getClusteringConfig().setMaxMergeClusteringThreshold(model.getMaxMergeThreshold());
         this.somoxConfig.getClusteringConfig().setMinComposeClusteringThreshold(model.getMinCompThreshold());
         this.somoxConfig.getClusteringConfig().setMinMergeClusteringThreshold(model.getMinMergeThreshold());
         this.somoxConfig.getClusteringConfig().setMaxComposeClusteringThreshold(model.getMaxComposeThreshold());
         this.somoxConfig.getClusteringConfig().setClusteringComposeThresholdDecrement(
               model.getComposeThresholdDecrement());
         this.somoxConfig.getClusteringConfig()
               .setClusteringMergeThresholdDecrement(model.getMergeThresholdDecrement());
         this.somoxConfig.setWildcardKey(model.getWildcardKey(), null);
         this.somoxConfig.setExcludedPrefixesForNameResemblance(model.getExcludedPrefixesForNameResemblance());
         this.somoxConfig.setExcludedSuffixesForNameResemblance(model.getExcludedSuffixesForNameResemblance());

         StringBuilder analyserInputFile = new StringBuilder();
         analyserInputFile.append(this.projectName);
         analyserInputFile.append("/");
         analyserInputFile.append(this.gastFileName);
         this.somoxConfig.getFileLocations().setAnalyserInputFile(analyserInputFile.toString());
         this.somoxConfig.getFileLocations().setProjectName(this.projectName);
         this.somoxConfig.getFileLocations().setOutputFolder(REENGINEERED_MODEL_FOLDER);
      }
      return this.somoxConfig;
   }

}
