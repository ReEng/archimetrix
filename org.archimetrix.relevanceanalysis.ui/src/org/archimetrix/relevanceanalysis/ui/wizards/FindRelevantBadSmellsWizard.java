package org.archimetrix.relevanceanalysis.ui.wizards;

import metricvalues.MetricValuesModel;

import org.archimetrix.commons.ResourceLoader;
import org.archimetrix.relevanceanalysis.AbstractRelevanceAnalysis;
import org.archimetrix.relevanceanalysis.RelevanceResults;
import org.archimetrix.relevanceanalysis.badsmells.RelevantBadSmellsAnalysis;
import org.archimetrix.relevanceanalysis.badsmells.util.RelevanceResultsStorage;
import org.archimetrix.relevanceanalysis.ui.RelevanceAnalysisUIPlugin;
import org.archimetrix.relevanceanalysis.ui.views.RelevantBadSmellsView;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.reclipse.structure.inference.annotations.ASGAnnotation;

/**
 * This class represents the wizard to start the bad smell relevance analysis. It consists of a one
 * page, the FindRelevandBadSmellsWizardPage.
 * 
 * @author mcp
 * 
 */
public class FindRelevantBadSmellsWizard extends Wizard {

    /**
     * job name string.
     */
    private static final String JOB_NAME = "Deficiency Ranking";

    /**
     * This is the job as a subclass.
     *
     */
    private static final class BadSmellRelevanceAnalysisJob extends Job {
        /**
         * metrics value path.
         */
        private final String metricValuesPath;

        /**
         * bad smell path.
         */
        private final String badSmellsPath;

        /**
         * analysis result.
         */
        private Object analysisResult;

        /**
         * the constructor.
         * @param name name
         * @param metricValuesPath metric values path
         * @param badSmellsPath bad smell path
         */
        private BadSmellRelevanceAnalysisJob(final String name, final String metricValuesPath,
                final String badSmellsPath) {
            super(name);
            this.metricValuesPath = metricValuesPath;
            this.badSmellsPath = badSmellsPath;
        }

        @Override
        protected IStatus run(final IProgressMonitor monitor) {
            // TODO: use monitor better
            monitor.beginTask(JOB_NAME, 100);
            Resource badSmellsRes = ResourceLoader.loadResource(this.badSmellsPath);
            Resource metricValuesRes = ResourceLoader.loadResource(this.metricValuesPath);
            AbstractRelevanceAnalysis analysis = new RelevantBadSmellsAnalysis(badSmellsRes.getContents(),
                    (MetricValuesModel) metricValuesRes.getContents().get(0));
            monitor.worked(10);
            analysis.startAnalysis();
            monitor.worked(89);
            RelevanceResults<ASGAnnotation> result = analysis.getResult();
            RelevanceResultsStorage.storeRelevantDeficiencies(badSmellsRes, result);
            this.analysisResult = result;
            monitor.done();
            return Status.OK_STATUS;
        }

        /**
         * Returns the analysis result.
         * @return analysis result
         */
        public Object getAnalysisResult() {
            return this.analysisResult;
        }
    }

    /**
     * wizard title string.
     */
    private static final String WIZARD_TITLE = "Rank Detected Deficiency Occurrences";

    /**
     * Find relevant bad smell wizard page.
     */
    protected FindRelevantBadSmellsWizardPage page;

    /**
     * the constructor.
     */
    public FindRelevantBadSmellsWizard() {
        super();

        setWindowTitle(WIZARD_TITLE);

        IDialogSettings settings = RelevanceAnalysisUIPlugin.getDefault().getDialogSettings();
        IDialogSettings section = settings.getSection(getClass().getCanonicalName());
        if (section == null) {
            section = settings.addNewSection(getClass().getCanonicalName());
        }
        setDialogSettings(section);
    }

    @Override
    public boolean performFinish() {
        storePageSettings();

        final String badSmellsPath = this.page.getBadSmellsFilePath();
        final String metricValuesPath = this.page.getMetricValuesFilePath();

        final BadSmellRelevanceAnalysisJob job = new BadSmellRelevanceAnalysisJob(JOB_NAME, metricValuesPath,
                badSmellsPath);
        job.setUser(true);
        job.schedule();
        job.addJobChangeListener(new JobChangeAdapter() {
            public void done(final org.eclipse.core.runtime.jobs.IJobChangeEvent event) {
                Display.getDefault().asyncExec(new Runnable() {
                    @Override
                    public void run() {
                        Object results = job.getAnalysisResult();
                        showResultView(results);
                    }
                });

            }
        });

        return true;
    }

    /**
     * displays the results view.
     * @param results results
     */
    private void showResultView(final Object results) {
        IWorkbenchPage activePage = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
        try {
            IViewPart relevantBadSmellsView = activePage.showView(RelevantBadSmellsView.ID);
            ((RelevantBadSmellsView) relevantBadSmellsView).setInput(results);
            relevantBadSmellsView.setFocus();
        } catch (PartInitException e) {
            e.printStackTrace();
        }
    }

    /**
     * stores the page settings.
     */
    protected void storePageSettings() {
        this.page.saveSettings();
    }

    @Override
    public void addPages() {
        this.page = new FindRelevantBadSmellsWizardPage(WIZARD_TITLE);
        addPage(this.page);
    }
}
