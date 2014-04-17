package org.archimetrix.architecturepreview.ui.jobs;

import java.util.List;
import java.util.Map;

import org.archimetrix.architecturepreview.ArchitecturePreview;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.reclipse.structure.inference.annotations.ASGAnnotation;
import org.storydriven.storydiagrams.activities.Activity;

import de.uka.ipd.sdq.pcm.repository.Repository;

/**
 * 
 * @author mcp
 * @author Goran Piskachev
 *
 */
public class ArchitecturePreviewJob extends Job {

    
    /**
     * Metric values path.
     */
    private final String metricValuesPath;

    /**
     * Preview results object.
     */
    private Map<String, List<String>> previewResults;

    /**
     * Architecture preview.
     */
    private ArchitecturePreview preview;

    /**
     * Annotation.
     */
    private ASGAnnotation annotation;

    /**
     * Activity.
     */
    private Activity activity;

    /**
     * the constructor.
     * @param name name
     * @param selectedAnnotation annotation
     * @param selectedStrategy strategy
     * @param metricValuesFilePath metric values path
     */
    public ArchitecturePreviewJob(final String name, final ASGAnnotation selectedAnnotation,
            final Activity selectedStrategy, final String metricValuesFilePath) {
        super(name);
        this.annotation = selectedAnnotation;
        this.activity = selectedStrategy;
        this.metricValuesPath = metricValuesFilePath;
    }

    @Override
    protected IStatus run(final IProgressMonitor monitor) {
        // TODO: use monitor better
        monitor.beginTask(super.getName(), 100);
        this.preview = new ArchitecturePreview();
        this.previewResults = this.preview.start(this.annotation, this.activity, this.metricValuesPath);
        monitor.worked(99);
        monitor.done();
        return Status.OK_STATUS;
    }

    /**
     * Returns preview results.
     * @return preview results
     */
    public Map<String, List<String>> getPreviewResults() {
        return this.previewResults;
    }

    /**
     * Returns new repository.
     * @return new repository
     */
    public Repository getNewSammRep() {
        return this.preview.getNewSammRep();
    }

    /**
     * Returns original repository.
     * @return original repository
     */
    public Repository getOriginalSammRep() {
        return this.preview.getOriginalSammRep();
    }
}
