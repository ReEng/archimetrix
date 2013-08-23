package org.archimetrix.architecturepreview.ui.views;

import org.archimetrix.architecturepreview.ui.providers.ArchitecturePreviewViewContentProvider;
import org.archimetrix.architecturepreview.ui.providers.ArchitecturePreviewViewLabelProvider;
import org.archimetrix.architecturepreview.ui.providers.ComponentsTreeContentProvider;
import org.archimetrix.architecturepreview.ui.providers.ComponentsTreeLabelProvider;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.TreeColumn;
import org.eclipse.ui.part.ViewPart;

import de.uka.ipd.sdq.pcm.repository.Repository;

/**
 * This class represents the view that visualizes the results of the architecture prognosis. It
 * contains at table for comparing some general criteria and two tree viewers that show the
 * components of the original and of the predicted architecture.
 * 
 * @author mcp
 * 
 */
public class ArchitecturePreviewView extends ViewPart {
    /**
     * Predicted architecture column title.
     */
    private static final String PREDICTED_ARCHITECTURE_COLUMN_TITLE = "Predicted Architecture";

    /**
     * Original architecture column title.
     */
    private static final String ORIGINAL_ARCHITECTURE_COLUMN_TITLE = "Original Architecture";

    /**
     * ID.
     */
    public static final String ID = "org.archimetrix.architectureprognosis.ui.architecturePrognosisView";

    /**
     * Tree viewer.
     */
    protected TreeViewer viewer;

    /**
     * Architecture Preview view label provider.
     */
    protected ArchitecturePreviewViewLabelProvider labelProvider;

    /**
     * Architecture preview view content provider.
     */
    protected ArchitecturePreviewViewContentProvider contentProvider;

    /**
     * Original components tree.
     */
    private TreeViewer originalComponentsTree;

    /**
     * New components tree.
     */
    private TreeViewer newComponentsTree;

    /**
     * New repository.
     */
    private Repository newSamm;

    /**
     * Original repository.
     */
    private Repository originalSamm;

    @Override
    public void createPartControl(final Composite parent) {
        Composite root = new Composite(parent, SWT.FILL);
        GridLayout rootLayout = new GridLayout(2, true);
        root.setLayout(rootLayout);
        GridData gridData = new GridData();
        this.viewer = new TreeViewer(root, SWT.FULL_SELECTION | SWT.SINGLE);
        this.viewer.getTree().setLinesVisible(true);
        this.viewer.getTree().setHeaderVisible(true);
        this.viewer.setLabelProvider(new ArchitecturePreviewViewLabelProvider());
        this.viewer.setContentProvider(new ArchitecturePreviewViewContentProvider());

        createColumns();
        gridData = createGridData();
        gridData.horizontalSpan = 2;
        this.viewer.getTree().setLayoutData(gridData);

        this.originalComponentsTree = createComponentsTreeViewer(root);
        this.newComponentsTree = createComponentsTreeViewer(root);
        gridData = createGridData();
        this.originalComponentsTree.getTree().setLayoutData(gridData);
        gridData = createGridData();
        this.newComponentsTree.getTree().setLayoutData(gridData);

        // register viewer as selection provider
        getSite().setSelectionProvider(this.viewer);

        createContextMenu();
    }

    /**
     * Creates grid data.
     * @return grid
     */
    private GridData createGridData() {
        GridData gridData = new GridData();
        gridData.horizontalAlignment = GridData.FILL;
        gridData.verticalAlignment = GridData.FILL;
        gridData.grabExcessHorizontalSpace = true;
        gridData.grabExcessVerticalSpace = true;
        return gridData;
    }

    /**
     * Creates components tree viewer.
     * @param root composete root
     * @return viewer
     */
    private TreeViewer createComponentsTreeViewer(final Composite root) {
        TreeViewer viewer = new TreeViewer(root, SWT.FULL_SELECTION | SWT.SINGLE);
        viewer.getTree().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
        viewer.setLabelProvider(new ComponentsTreeLabelProvider(this));
        viewer.setContentProvider(new ComponentsTreeContentProvider());
        return viewer;
    }

    /**
     * Returns new components tree.
     * @return new components tree
     */
    public TreeViewer getNewComponentsTree() {
        return this.newComponentsTree;
    }

    /**
     * Creates columns.
     */
    public void createColumns() {
        String[] names = new String[] { "", ORIGINAL_ARCHITECTURE_COLUMN_TITLE, PREDICTED_ARCHITECTURE_COLUMN_TITLE };
        boolean firstColumn = true;
        for (String name : names) {
            TreeColumn tc = new TreeColumn(this.viewer.getTree(), SWT.LEFT);
            tc.setText(name);
            if (firstColumn) {
                tc.setWidth(250);
                firstColumn = false;
            } else {
                tc.pack();
            }
        }
    }

    /**
     * Creates context menu.
     */
    private void createContextMenu() {
        MenuManager menuMgr = new MenuManager();
        Menu menu = menuMgr.createContextMenu(this.viewer.getControl());
        this.viewer.getControl().setMenu(menu);
        getSite().registerContextMenu(menuMgr, this.viewer);
    }

    /**
     * Sets input.
     * @param input input object
     */
    public void setInput(final Object input) {
        this.viewer.setInput(input);
    }

    /**
     * Sets original components tree input.
     * @param input input repository
     */
    public void setOriginalComponentsTreeInput(final Repository input) {
        this.originalSamm = input;
        this.originalComponentsTree.setInput(input);
    }

    /**
     * Sets new components tree input.
     * @param input repository input
     */
    public void setNewComponentsTreeInput(final Repository input) {
        this.newSamm = input;
        this.newComponentsTree.setInput(input);
    }

    /**
     * Returns new repository.
     * @return new repository
     */
    public Repository getNewSamm() {
        return this.newSamm;
    }

    /**
     * Returns original repository.
     * @return original repository
     */
    public Repository getOriginalSamm() {
        return this.originalSamm;
    }

    @Override
    public void setFocus() {
        this.viewer.getControl().setFocus();
    }

    /**
     * Returns original components tree.
     * @return original components tree
     */
    public TreeViewer getOriginalComponentsTree() {
        return this.originalComponentsTree;
    }

}
