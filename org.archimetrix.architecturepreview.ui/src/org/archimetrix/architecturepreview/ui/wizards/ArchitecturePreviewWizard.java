package org.archimetrix.architecturepreview.ui.wizards;

import java.util.List;

import org.archimetrix.architecturepreview.ArchitecturePreview;
import org.archimetrix.architecturepreview.ui.ArchitecturePreviewUIPlugin;
import org.archimetrix.architecturepreview.ui.views.ArchitecturePreviewView;
import org.archimetrix.commons.ResourceLoader;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.reclipse.structure.inference.annotations.ASGAnnotation;
import org.somox.sourcecodedecorator.SourceCodeDecoratorPackage;
import org.storydriven.storydiagrams.activities.Activity;

import de.uka.ipd.sdq.pcm.repository.Repository;

/**
 * The wizard that starts the architecture preview. It can be opened per menu bar or via a context
 * menu on a selected bad smell occurrence in the Relevant Bad Smells View.
 * 
 * @author mcp
 * 
 */
public class ArchitecturePreviewWizard extends Wizard {

    /**
     * Job subclass.
     * @author mcp
     *
     */
    private static final class ArchitecturePrognosisJob extends Job {
        /**
         * Metric values path.
         */
        private final String metricValuesPath;

        /**
         * Preview results object.
         */
        private List<List<String>> previewResults;

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
        public ArchitecturePrognosisJob(final String name, final ASGAnnotation selectedAnnotation,
                final Activity selectedStrategy, final String metricValuesFilePath) {
            super(name);
            this.annotation = selectedAnnotation;
            this.activity = selectedStrategy;
            this.metricValuesPath = metricValuesFilePath;
        }

        @Override
        protected IStatus run(final IProgressMonitor monitor) {
            // TODO: use monitor better
            monitor.beginTask(JOB_NAME, 100);
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
        public List<List<String>> getPreviewResults() {
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

    /**
     * Archtecture preview wizard title.
     */
    private static final String ARCHITECTURE_PREVIEW_WIZARD_TITLE = "Architecture Preview";

    /**
     * Job name.
     */
    private static final String JOB_NAME = "Architecture Preview";

    /**
     * Architecture Preview Wizard Page.
     */
    protected ArchitecturePreviewWizardPage page;

    /**
     * Bad Smells Wizard Page.
     */
    protected BadSmellsWizardPage badSmellsPage;

    /**
     * Reengineering Strategies Wizard Page.
     */
    protected ReengineeringStrategiesWizardPage reengineeringStrategiesPage;

    /**
     * Selected annotation.
     */
    private ASGAnnotation selectedAnnotation;

    /**
     * Selected annotation from relevant bad smell view.
     */
    private final ASGAnnotation selectedAnnotationFromRelevantBadSmellsView;

    /**
     * Deficiencies resource.
     */
    private Resource deficienciesResource;

    /**
     * Strategies resource.
     */
    private Resource reengineeringStrategiesResource;

    /**
     * the constructor.
     */
    public ArchitecturePreviewWizard() {
        this(null);
    }

    /**
     * the constructor.
     * @param selectedAnnotation annotation
     */
    public ArchitecturePreviewWizard(final ASGAnnotation selectedAnnotation) {
        super();

        // registers the source code decorator package, if it has not been done before
        SourceCodeDecoratorPackage.eINSTANCE.eClass();

        setWindowTitle(ARCHITECTURE_PREVIEW_WIZARD_TITLE);

        this.selectedAnnotationFromRelevantBadSmellsView = selectedAnnotation;
        setDialogSettings();
    }

    /**
     * Sets dialog settings.
     */
    private void setDialogSettings() {
        IDialogSettings settings = ArchitecturePreviewUIPlugin.getDefault().getDialogSettings();
        IDialogSettings section = settings.getSection(getClass().getCanonicalName());
        if (section == null) {
            section = settings.addNewSection(getClass().getCanonicalName());
        }
        setDialogSettings(section);
    }

    @Override
    public boolean performFinish() {
        storePageSettings();

        final ArchitecturePrognosisJob job = new ArchitecturePrognosisJob(JOB_NAME, getSelectedAnnotation(),
                this.reengineeringStrategiesPage.getSelectedStrategy(), this.page.getMetricValuesFilePath());
        job.setUser(true);
        job.schedule();
        job.addJobChangeListener(new JobChangeAdapter() {
            public void done(final org.eclipse.core.runtime.jobs.IJobChangeEvent event) {
                Display.getDefault().asyncExec(new Runnable() {
                    @Override
                    public void run() {
                        List<List<String>> results = job.getPreviewResults();
                        showArchitecturePreviewResults(results, job.getNewSammRep(), job.getOriginalSammRep());

                    }
                });

            }
        });
        return true;
    }

    /**
     * Shows Architecture preview results.
     * @param results results
     * @param newSAMM new repository
     * @param oldSAMM original repository
     */
    private void showArchitecturePreviewResults(final List<List<String>> results, final Repository newSAMM,
            final Repository oldSAMM) {
        IWorkbenchPage activePage = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
        try {
            ArchitecturePreviewView architecturePrognosisView = (ArchitecturePreviewView) activePage
                    .showView(ArchitecturePreviewView.ID);
            architecturePrognosisView.setInput(results);
            architecturePrognosisView.setNewComponentsTreeInput(newSAMM);
            architecturePrognosisView.setOriginalComponentsTreeInput(oldSAMM);
            architecturePrognosisView.setFocus();
        } catch (PartInitException e) {
            e.printStackTrace();
        }
    }

    /**
     * Saves page settings.
     */
    protected void storePageSettings() {
        this.page.saveSettings();
    }

    @Override
    public IWizardPage getNextPage(final IWizardPage page) {
        IWizardPage next = super.getNextPage(page);
        if (next instanceof BadSmellsWizardPage) {
            if (selectedAnnotationFromRelevantBadSmellsView == null) {
                Resource badSmellsRes = getBadSmellsResource();
                this.badSmellsPage.setSelection(badSmellsRes);
            }
        } else if (next instanceof ReengineeringStrategiesWizardPage) {
            Resource reengineeringStrategiesRes = getReengineeringStrategiesResource();
            this.reengineeringStrategiesPage.setSelection(reengineeringStrategiesRes);
        }
        return next;
    }

    /**
     * Returns Bad smell resource.
     * @return bad smell resource
     */
    public Resource getBadSmellsResource() {
        if (this.deficienciesResource == null) {
            String badSmellsFilePath = this.page.getBadSmellsFilePath();
            deficienciesResource = ResourceLoader.loadResource(badSmellsFilePath);
        }
        return deficienciesResource;
    }

    /**
     * Returns strategies resource.
     * @return strategies resource
     */
    public Resource getReengineeringStrategiesResource() {
        if (this.reengineeringStrategiesResource == null) {
            String reengineeringStrategysFilePath = this.page.getReengineeringStrategiesFilePath();
            reengineeringStrategiesResource = ResourceLoader.loadResource(reengineeringStrategysFilePath);
        }
        return reengineeringStrategiesResource;
    }

    @Override
    public void addPages() {
        this.page = new ArchitecturePreviewWizardPage(ARCHITECTURE_PREVIEW_WIZARD_TITLE, this,
                this.selectedAnnotationFromRelevantBadSmellsView);
        addPage(this.page);
        if (this.selectedAnnotationFromRelevantBadSmellsView == null) {
            this.badSmellsPage = new BadSmellsWizardPage(this);
            addPage(this.badSmellsPage);
        }
        this.reengineeringStrategiesPage = new ReengineeringStrategiesWizardPage(this);
        addPage(this.reengineeringStrategiesPage);
    }

    /**
     * Sets annotation.
     * @param annotation annotation
     */
    public void setSelectedAnnotation(final ASGAnnotation annotation) {
        this.selectedAnnotation = annotation;
    }

    /**
     * Returns annotation.
     * @return annotation
     */
    public ASGAnnotation getSelectedAnnotation() {
        if (this.selectedAnnotation != null) {
            return this.selectedAnnotation;
        } else {
            return this.selectedAnnotationFromRelevantBadSmellsView;
        }
    }
}
