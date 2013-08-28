package org.archimetrix.architecturepreview.ui.wizards;

import java.util.List;
import java.util.Map;

import org.archimetrix.architecturepreview.ui.ArchitecturePreviewUIPlugin;
import org.archimetrix.architecturepreview.ui.jobs.ArchitecturePreviewJob;
import org.archimetrix.architecturepreview.ui.views.ArchitecturePreviewView;
import org.archimetrix.commons.ResourceLoader;
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
     * Architecture preview wizard title.
     */
    private static final String ARCHITECTURE_PREVIEW_WIZARD_TITLE = "Architecture Preview";

    /**
     * Architecture Preview Wizard Page.
     */
    protected ArchitecturePreviewWizardPage page;
    
    /**
     * Job name.
     */
    private static final String JOB_NAME = "Architecture Preview";

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
     * 
     * @param selectedAnnotation
     *            annotation
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

        final ArchitecturePreviewJob job = new ArchitecturePreviewJob(JOB_NAME, getSelectedAnnotation(),
                this.reengineeringStrategiesPage.getSelectedStrategy(), this.page.getMetricValuesFilePath());
        job.setUser(true);
        job.schedule();
        job.addJobChangeListener(new JobChangeAdapter() {
            public void done(final org.eclipse.core.runtime.jobs.IJobChangeEvent event) {
                Display.getDefault().asyncExec(new Runnable() {
                    @Override
                    public void run() {
                        Map<String, List<String>> results = job.getPreviewResults();
                        showArchitecturePreviewResults(results, job.getNewSammRep(), job.getOriginalSammRep());

                    }
                });

            }
        });
        return true;
    }

    /**
     * Shows Architecture preview results.
     * 
     * @param results
     *            results
     * @param newSAMM
     *            new repository
     * @param oldSAMM
     *            original repository
     */
    private void showArchitecturePreviewResults(final Map<String, List<String>> results, final Repository newSAMM,
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
     * 
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
     * 
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
     * 
     * @param annotation
     *            annotation
     */
    public void setSelectedAnnotation(final ASGAnnotation annotation) {
        this.selectedAnnotation = annotation;
    }

    /**
     * Returns annotation.
     * 
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
