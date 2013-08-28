package org.archimetrix.architecturepreview;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.List;

import org.archimetrix.architecturepreview.starters.InterpreterStarter;
import org.archimetrix.architecturepreview.starters.SoMoXStarter;
import org.archimetrix.architecturepreview.util.SCDMFromAnnotationExtractor;
import org.eclipse.emf.ecore.resource.Resource;
import org.reclipse.structure.inference.annotations.ASGAnnotation;
import org.somox.sourcecodedecorator.SourceCodeDecoratorRepository;
import org.storydriven.storydiagrams.activities.Activity;

import de.uka.ipd.sdq.pcm.repository.Repository;

/**
 * This class is responsible for starting the architecture preview. This includes starting the story
 * diagram editor, starting a clustering with SoMoX and starting the actual preview calculation.
 * 
 * @author mcp
 * 
 */
public class ArchitecturePreview {
    /**
     * Gast file name index.
     */
    private static final int GAST_FILE_NAME_INDEX = 2;

    /**
     * Project name index.
     */
    private static final int PROJECT_NAME_INDEX = 1;

    /**
     * Contains the formatted strings for the UI.
     */
    private UIDataFormatter uiDataFormatter;

    /**
     * Starts the architecture preview. For this, first a transformation is executed, then a
     * clustering is started and finally the actual calculation is started.
     * 
     * @param badSmellAnnotation
     *            the bad smell occurrences that was selected by the user to be removed
     * @param reengineeringStrategy
     *            the reengineering strategy that was selected by the user to accomplish the removal
     *            of the bad smell, represented by a story diagram
     * @param metricValuesFilePath
     *            the path to the metric values model created in the initial clustering, it contains
     *            the clustering configuration
     * @return the result of the preview calculation
     */
    public List<List<String>> start(final ASGAnnotation badSmellAnnotation, final Activity reengineeringStrategy,
            final String metricValuesFilePath) {

        Resource newGASTResource = startTransformation(badSmellAnnotation, reengineeringStrategy);
        SoMoXStarter somoxStarter = startClustering(metricValuesFilePath, newGASTResource);
        startPrognosisCalculation(badSmellAnnotation, somoxStarter);
        return this.uiDataFormatter.getDataForArchitecturePreview();
    }

    /**
     * Loads the SCDM objects and creates the dataFormatter object which prepares the strings for the UI.
     * @param badSmellAnnotation bas smell annotation
     * @param somoxStarter clustering results from SoMoX
     */
    private void startPrognosisCalculation(final ASGAnnotation badSmellAnnotation, SoMoXStarter somoxStarter) {
        SourceCodeDecoratorRepository originalSCDM = SCDMFromAnnotationExtractor.getSCDM(badSmellAnnotation);
        SourceCodeDecoratorRepository newSCDM = somoxStarter.loadResultingSCDM();
        this.uiDataFormatter = new UIDataFormatter(originalSCDM, newSCDM);
    }

    /**
     * Calls SoMoX which will execute the clustering.
     * @param metricValuesFilePath the path of the file with the metrics for the clustering.
     * @param newGASTResource the resource that will be clustered by SoMoX
     * @return clustering results as SoMoXStarter object
     */
    private SoMoXStarter startClustering(final String metricValuesFilePath, Resource newGASTResource) {
        String[] newGASTURISegments = newGASTResource.getURI().segments();
        String projectName = newGASTURISegments[PROJECT_NAME_INDEX];
        String gastFileName = newGASTURISegments[GAST_FILE_NAME_INDEX];
        // TODO should be adapted by using methods of URI instead of segments and constants, but
        // currently, they return null

        SoMoXStarter somoxStarter = new SoMoXStarter(projectName, gastFileName);
        somoxStarter.callSoMoX(metricValuesFilePath);
        return somoxStarter;
    }

    /**
     * Starts the transformation for reengineering. 
     * @param badSmellAnnotation bad smell annotation
     * @param reengineeringStrategy activity for reengineering 
     * @return resulting model from the transformation
     */
    private Resource startTransformation(final ASGAnnotation badSmellAnnotation, final Activity reengineeringStrategy) {
        InterpreterStarter interpreterStarter = new InterpreterStarter();
        Resource newGASTResource = interpreterStarter.callInterpreter(badSmellAnnotation, reengineeringStrategy);
     //   fixGASTResource(newGASTResource);
        return newGASTResource;
    }

    /**
     * Returns the SAMM of the predicted architecture.
     * 
     * @return the predicted architecture model
     */
    public Repository getNewSammRep() {
        return this.uiDataFormatter.getArchitecturePreviewDataFormatHelper().getNewSammRep();
    }

    /**
     * Returns the SAMM of the original architecture.
     * 
     * @return the original architecture model
     */
    public Repository getOriginalSammRep() {
        return this.uiDataFormatter.getArchitecturePreviewDataFormatHelper().getOriginalSammRep();
    }

 /*   // TODO: review this !!
    private void fixGASTResource(final Resource newGASTResource) {
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
        if (newGASTResource.getURI().segments().length > 3) {
            location.append("/");
            location.append(newGASTResource.getURI().segment(3));
        }
        File file = new File(location.toString());
        try {
            String stringToDelete = "xmi:version=\"2.0\" xmlns:xmi=\"http://www.omg.org/XMI\" ";
            RandomAccessFile raf = new RandomAccessFile(file, "rws");
            deleteFromRAF(stringToDelete, raf);
            raf.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
*/
    public static void deleteFromRAF(final String value, final RandomAccessFile raf) {
        // FIXME: see fixGASTResource
        try {
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
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
