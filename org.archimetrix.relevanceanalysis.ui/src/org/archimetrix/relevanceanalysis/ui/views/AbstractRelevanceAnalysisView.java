package org.archimetrix.relevanceanalysis.ui.views;

import org.archimetrix.relevanceanalysis.RelevanceResults;
import org.archimetrix.relevanceanalysis.ui.providers.AbstractRelevanceAnalysisViewContentProvider;
import org.archimetrix.relevanceanalysis.ui.providers.AbstractRelevanceAnalysisViewLabelProvider;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.ui.part.ViewPart;

/**
 *  The AbstractRelevanceAnalysisView provides a basic implementation of a view for the relevance
 * analysis.
 * @author mcp
 *
 * @param <T> t
 */
public abstract class AbstractRelevanceAnalysisView<T> extends ViewPart {

    /**
     * Pareto optimality column title string.
     */
    protected static final String PARETO_OPTIMALITY_COLUMN_TITLE = "Pareto Optimality";

    /**
     * Total relevance column title string.
     */
    protected static final String TOTAL_RELEVANCE_COLUMN_TITLE = "Relevance Total";

    /**
     * Tree viewer.
     */
    protected TreeViewer viewer;

    /**
     * relevance results.
     */
    protected RelevanceResults<T> relevanceResults;

    /**
     * Abstract Relevance Analysis View Label Provider.
     */
    protected AbstractRelevanceAnalysisViewLabelProvider labelProvider;

    /**
     * Abstract Relevance Analysis View Content Provider.
     */
    protected AbstractRelevanceAnalysisViewContentProvider contentProvider;

    @Override
    public void createPartControl(final Composite parent) {
        // root composite
        Composite root = new Composite(parent, SWT.NONE);
        GridLayout rootLayout = new GridLayout();
        rootLayout.horizontalSpacing = 0;
        rootLayout.marginHeight = 0;
        rootLayout.marginWidth = 0;
        rootLayout.verticalSpacing = 0;
        root.setLayout(rootLayout);

        // bad smells table
        createTreeViewer(root);
        createColumns();
        createSorter();
        createFilter();
        createProvider();

        this.viewer.setLabelProvider(this.labelProvider);
        this.viewer.setContentProvider(this.contentProvider);

        // register viewer as selection provider
        getSite().setSelectionProvider(this.viewer);

        createContextMenu();

    }

    /**
     * Creates the tree viewer.
     * @param root composite root element
     */
    protected void createTreeViewer(final Composite root) {
        this.viewer = new TreeViewer(root, SWT.FULL_SELECTION | SWT.SINGLE);
        this.viewer.getTree().setLinesVisible(true);
        this.viewer.getTree().setHeaderVisible(true);
        this.viewer.getTree().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
    }

    /**
     * Creates context menu.
     */
    private void createContextMenu() {
        MenuManager menuMgr = new MenuManager();

        // Create menu.
        Menu menu = menuMgr.createContextMenu(this.viewer.getControl());
        this.viewer.getControl().setMenu(menu);

        // Register menu for extension.
        getSite().registerContextMenu(menuMgr, this.viewer);
    }

    /**
     * no sorter.
     */
    public void createSorter() {
        // no sorter
    }

    /**
     * no filter.
     */
    public void createFilter() {
        // no filter
    }

    /**
     * Creates provider.
     */
    public abstract void createProvider();

    /**
     * Creates columns.
     */
    public abstract void createColumns();

    /**
     * sets input.
     * @param input input object
     */
    public void setInput(final Object input) {
        this.viewer.setInput(input);
    }

    @Override
    public void setFocus() {
        this.viewer.getControl().setFocus();
    }

    /**
     * Returns the relevance results.
     * @return relevance results
     */
    public RelevanceResults<T> getRelevanceResults() {
        return this.relevanceResults;
    }

    /**
     * Sets the relevance results.
     * @param relevanceResults relevance results
     */
    public void setRelevanceResults(RelevanceResults<T> relevanceResults) {
        this.relevanceResults = relevanceResults;
    }

}
