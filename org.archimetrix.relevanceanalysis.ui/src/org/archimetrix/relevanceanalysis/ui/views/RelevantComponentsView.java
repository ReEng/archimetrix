package org.archimetrix.relevanceanalysis.ui.views;

import org.archimetrix.relevanceanalysis.ui.providers.RelevantComponentsViewContentProvider;
import org.archimetrix.relevanceanalysis.ui.providers.RelevantComponentsViewLabelProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.TreeColumn;
import org.somox.sourcecodedecorator.ComponentImplementingClassesLink;

/**
 * The Relevant Components View visualizes the results of the Bad Smell Relevance Analysis in a
 * table.
 * 
 * @author mcp
 * 
 */
public class RelevantComponentsView extends AbstractRelevanceAnalysisView<ComponentImplementingClassesLink> {

    /**
     * Complexity column title string.
     */
    private static final String COMPLEXITY_COLUMN_TITLE =
            "Complexity (CPC)";

    /**
     * closeness to threshold column title.
     */
    private static final String CLOSENESS_TO_THRESHOLD_COLUMN_TITLE =
            "Closeness To Threshold";

    /**
     * component column title string.
     */
    private static final String COMPONENT_COLUMN_TITLE =
            "Component";

    /**
     * Id.
     */
    public static final String ID =
            "org.archimetrix.relevanceanalysis.ui.relevantComponentsView";

    /**
     * selected components.
     */
    protected static Object[] selectedComponents;

    /**
     * Creates provider.
     */
    public void createProvider() {
        this.labelProvider = new RelevantComponentsViewLabelProvider(this);
        this.contentProvider = new RelevantComponentsViewContentProvider(this);
        this.viewer.addSelectionChangedListener(new ISelectionChangedListener() {

            @Override
            public void selectionChanged(final SelectionChangedEvent event) {
                RelevantComponentsView.selectedComponents = ((TreeSelection) event.getSelection()).toArray();
            }
        });
    }

    @Override
    public void createSorter() {
        this.viewer.setSorter(new RelevantComponentsSorter());
    }

    /**
     * Creates tree viewer.
     * @param root composite root
     */
    protected void createTreeViewer(final Composite root) {
        this.viewer = new TreeViewer(root, SWT.FULL_SELECTION | SWT.MULTI);
        this.viewer.getTree().setLinesVisible(true);
        this.viewer.getTree().setHeaderVisible(true);
        this.viewer.getTree().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
    }

    /**
     * Creates columns.
     */
    public void createColumns() {
        String[] names = new String[] { COMPONENT_COLUMN_TITLE, CLOSENESS_TO_THRESHOLD_COLUMN_TITLE,
                COMPLEXITY_COLUMN_TITLE, TOTAL_RELEVANCE_COLUMN_TITLE, PARETO_OPTIMALITY_COLUMN_TITLE };
        boolean firstColumn = true;
        for (String name : names) {
            TreeColumn tc = new TreeColumn(this.viewer.getTree(), SWT.LEFT);
            tc.setText(name);
            if (firstColumn) {
                tc.setWidth(350);
                firstColumn = false;
            } else {
                tc.pack();
            }
        }
    }

    /**
     * Returns the selected components.
     * @return selected components
     */
    public static Object[] getSelectedComponents() {
        return selectedComponents;
    }

}
