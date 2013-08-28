package org.archimetrix.relevanceanalysis.ui.views;

import org.archimetrix.relevanceanalysis.ui.providers.RelevantBadSmellsViewContentProvider;
import org.archimetrix.relevanceanalysis.ui.providers.RelevantBadSmellsViewLabelProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.TreeColumn;
import org.reclipse.structure.inference.annotations.ASGAnnotation;

/**
 * The Relevant Bad Smells View visualizes the results of the Bad Smell Relevance Analysis in a
 * table.
 * 
 * @author mcp
 * 
 */
public class RelevantBadSmellsView extends AbstractRelevanceAnalysisView<ASGAnnotation> {
    /**
     * Roles column title string.
     */
    private static final String ROLES_COLUMN_TITLE = "Roles";

    /**
     * Bad smell column title string.
     */
    private static final String BAD_SMELL_COLUMN_TITLE = "Bad Smell";

    /**
     * data class communication column title string.
     */
    private static final String DATA_CLASS_COMMUNICATION_COLUMN_TITLE = "Relevance DCC";

    /**
     * higher interface adherence column title string.
     */
    private static final String HIGHER_INTERFACE_ADHERENCE_COLUMN_TITLE = "Relevance HIA";

    /**
     * number of external accesses column title string.
     */
    private static final String NUMBER_OF_EXTERNAL_ACCESSES_COLUMN_TITLE = "Relevance NEA";

    /**
     * class locations strategy column title string.
     */
    private static final String CLASS_LOCATIONS_STRATEGY_COLUMN_TITLE = "Relevance CL";

    /**
     * ID.
     */
    public static final String ID =
            "org.archimetrix.relevanceanalysis.ui.relevantBadSmellsView";

    /**
     * selected annotation.
     */
    private static ASGAnnotation selectedAnnotation;

    @Override
    public void createProvider() {
        this.labelProvider = new RelevantBadSmellsViewLabelProvider(this);
        this.contentProvider = new RelevantBadSmellsViewContentProvider(this);
        this.viewer.addSelectionChangedListener(new ISelectionChangedListener() {

            @Override
            public void selectionChanged(final SelectionChangedEvent event) {
                RelevantBadSmellsView.selectedAnnotation = (ASGAnnotation) ((TreeSelection) event.getSelection())
                        .getFirstElement();
            }
        });
    }

    @Override
    public void createColumns() {
        String[] names = new String[] { BAD_SMELL_COLUMN_TITLE, ROLES_COLUMN_TITLE,
                CLASS_LOCATIONS_STRATEGY_COLUMN_TITLE, NUMBER_OF_EXTERNAL_ACCESSES_COLUMN_TITLE,
                HIGHER_INTERFACE_ADHERENCE_COLUMN_TITLE, DATA_CLASS_COMMUNICATION_COLUMN_TITLE,
                TOTAL_RELEVANCE_COLUMN_TITLE, PARETO_OPTIMALITY_COLUMN_TITLE };
        for (int i = 0; i < names.length; i++) {
            TreeColumn tc = new TreeColumn(this.viewer.getTree(), SWT.LEFT);
            tc.setText(names[i]);
            switch (i) {
            case 0:
                tc.setWidth(150);
                break;
            case 1:
                tc.setWidth(500);
                break;
            default:
                tc.pack();
                break;
            }
        }
    }

    @Override
    public void createSorter() {
        this.viewer.setSorter(new RelevantDeficienciesSorter());
    }

    /**
     * Returns the selected annotation.
     * @return selected annotation
     */
    public static ASGAnnotation getSelectedAnnotation() {
        return selectedAnnotation;
    }

}
