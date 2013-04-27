package org.archimetrix.architecturepreview;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.List;

import org.archimetrix.architecturepreview.starters.InterpreterStarter;
import org.archimetrix.architecturepreview.starters.SoMoXStarter;
import org.archimetrix.architecturepreview.util.SCDMFromAnnotationExtractor;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.ecore.resource.Resource;
import org.reclipse.structure.inference.annotations.ASGAnnotation;
import org.storydriven.storydiagrams.activities.Activity;

import eu.qimpress.samm.staticstructure.Repository;
import org.somox.sourcecodedecorator.SourceCodeDecoratorRepository;


/**
 * This class is responsible for starting the architecture prognosis. This includes starting the
 * story diagram editor, starting a clustering with SoMoX and starting the actual prognosis
 * calculation.
 * 
 * @author mcp
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 * 
 */
public class ArchitecturePreview
{
   private static final int GAST_FILE_NAME_INDEX = 2;

   private static final int PROJECT_NAME_INDEX = 1;

   ArchitecturePreviewCalculator prognosisCalculator;


   /**
    * Starts the architecture prognosis. For this, first a transformation is executed, then a
    * clustering is started and finally the actual calculation is started.
    * 
    * @param badSmellAnnotation the bad smell occurrences that was selected by the user to be
    *           removed
    * @param reengineeringStrategy the reengineering strategy that was selected by the user to
    *           accomplish the removal of the bad smell, represented by a story diagram
    * @param metricValuesFilePath the path to the metric values model created in the initial
    *           clustering, it contains the clustering configuration
    * @return the result of the prognosis calculation
    */
   public List<List<String>> start(final ASGAnnotation badSmellAnnotation, final Activity reengineeringStrategy,
         final String metricValuesFilePath)
   {
      Resource newGASTResource = startTransformation(badSmellAnnotation, reengineeringStrategy);
      SoMoXStarter somoxStarter = startClustering(metricValuesFilePath, newGASTResource);
      startPrognosisCalculation(badSmellAnnotation, somoxStarter);
      return this.prognosisCalculator.start();
   }


   private void startPrognosisCalculation(final ASGAnnotation badSmellAnnotation, SoMoXStarter somoxStarter)
   {
      SourceCodeDecoratorRepository originalSCDM = SCDMFromAnnotationExtractor.getSCDM(badSmellAnnotation);
      SourceCodeDecoratorRepository newSCDM = somoxStarter.loadResultingSCDM();
      this.prognosisCalculator = new ArchitecturePreviewCalculator(originalSCDM, newSCDM);
   }


   private SoMoXStarter startClustering(final String metricValuesFilePath, Resource newGASTResource)
   {
      String[] newGASTURISegments = newGASTResource.getURI().segments();
      String projectName = newGASTURISegments[PROJECT_NAME_INDEX];
      String gastFileName = newGASTURISegments[GAST_FILE_NAME_INDEX];
      // TODO should be adapted by using methods of URI instead of segments and constants, but
      // currently, they return null

      SoMoXStarter somoxStarter = new SoMoXStarter(projectName, gastFileName);
      somoxStarter.callSoMoX(metricValuesFilePath);
      return somoxStarter;
   }


   private Resource startTransformation(final ASGAnnotation badSmellAnnotation, final Activity reengineeringStrategy)
   {
      InterpreterStarter interpreterStarter = new InterpreterStarter();
      Resource newGASTResource = interpreterStarter.callInterpreter(badSmellAnnotation, reengineeringStrategy);
      fixGASTResource(newGASTResource);
      return newGASTResource;
   }


   /**
    * Returns the SAMM of the predicted architecture.
    * 
    * @return the predicted architecture model
    */
   public Repository getNewSammRep()
   {
      return this.prognosisCalculator.getNewSammRep();
   }


   /**
    * Returns the SAMM of the original architecture.
    * 
    * @return the original architecture model
    */
   public Repository getOriginalSammRep()
   {
      return this.prognosisCalculator.getOriginalSammRep();
   }


   private void fixGASTResource(final Resource newGASTResource)
   {
      // FIXME!!
      // This method fixes the error "feature 'version' not found", when opening the transformed
      // GAST in SoMoX, by deleting the version tag in the text file. There should be a better way
      // to solve this problem (seems to be some conflict between XMLResource and XMIResource).
      IPath workspaceLocation = ResourcesPlugin.getWorkspace().getRoot().getLocation();
      StringBuilder location = new StringBuilder();
      location.append(workspaceLocation);
      location.append("/");
      location.append(newGASTResource.getURI().segment(1));
      location.append("/");
      location.append(newGASTResource.getURI().segment(2));
      if (newGASTResource.getURI().segments().length > 3)
      {
         location.append("/");
         location.append(newGASTResource.getURI().segment(3));
      }
      File file = new File(location.toString());
      try
      {
         String stringToDelete = "xmi:version=\"2.0\" xmlns:xmi=\"http://www.omg.org/XMI\" ";
         RandomAccessFile raf = new RandomAccessFile(file, "rws");
         deleteFromRAF(stringToDelete, raf);
         raf.close();
      }
      catch (FileNotFoundException e)
      {
         e.printStackTrace();
      }
      catch (IOException e)
      {
         e.printStackTrace();
      }
   }


   public static void deleteFromRAF(final String value, final RandomAccessFile raf)
   {
      // FIXME: see fixGASTResource
      try
      {
         long position = 0;
         raf.readLine();
         byte[] firstBytes = new byte[11];
         raf.read(firstBytes);
         position = raf.getFilePointer();
         byte[] b = new byte[value.length()];
         raf.read(b);
         byte[] remainingBytes = new byte[(int) (raf.length() - raf.getFilePointer())];
         raf.read(remainingBytes);
         raf.getChannel().truncate(position);
         raf.seek(position);
         raf.write(remainingBytes);
      }
      catch (FileNotFoundException e)
      {
         e.printStackTrace();
      }
      catch (IOException e)
      {
         e.printStackTrace();
      }
   }
}
