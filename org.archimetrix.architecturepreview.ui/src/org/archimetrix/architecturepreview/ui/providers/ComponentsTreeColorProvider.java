package org.archimetrix.architecturepreview.ui.providers;

import org.eclipse.gmt.modisco.java.ClassDeclaration;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;

import de.uka.ipd.sdq.pcm.repository.RepositoryComponent;


/**
 * The ComponentsTreeColorProvider is responsible for coloring the original component tree and the
 * predicted components tree in the Architecture Prognosis View.
 * 
 * @author mcp
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 * 
 */
public class ComponentsTreeColorProvider {

    /**
     * Display object.
     */
    private Display display;

    /**
     * Tree label provider.
     */
    private final ComponentsTreeLabelProvider componentsTreeLabelProvider;

    /**
     * The constructor.
     * @param componentsTreeLabelProvider Tree label provider
     */
    public ComponentsTreeColorProvider(final ComponentsTreeLabelProvider componentsTreeLabelProvider) {
        this.componentsTreeLabelProvider = componentsTreeLabelProvider;
    }

    /**
     * Sets red background color to element.
     * @param element element
     * @param isFromOriginalArchitecture whether elements is from original architecture
     * @param componentFromNewArchitecture repository component
     */
    public void layoutRedLines(final Object element, final boolean isFromOriginalArchitecture,
            final RepositoryComponent componentFromNewArchitecture) // ComponentType changed to
                                                                    // RepositoryComponent
    {
        if (isFromOriginalArchitecture && componentFromNewArchitecture == null) {
            TreeItem item = getItem(this.componentsTreeLabelProvider.getOriginalComponentsTree(), element);
            if (item != null) {
                item.setBackground(makeRedColor());
            }
        }
    }

    /**
     * Sets green colov to element.
     * @param element element
     * @param isFromNewArchitecture whether element is from original architecture
     * @param componentFromOriginalArchitecture repository component
     */
    public void layoutGreenLines(final Object element, final boolean isFromNewArchitecture,
            final RepositoryComponent componentFromOriginalArchitecture) {
        if (isFromNewArchitecture && componentFromOriginalArchitecture == null) {
            Tree originalComponentsTree = this.componentsTreeLabelProvider.getOriginalComponentsTree();
            TreeItem item = getItem(originalComponentsTree, element);
            if (item != null) {
                item.setBackground(makeGreenColor());
            }
        }
    }

    /**
     * Returns yellow color.
     * @return yellow color
     */
    private Color makeYellowColor() {
        return getDisplay().getSystemColor(SWT.COLOR_YELLOW);
    }

    /**
     * Returns red color.
     * @return red color
     */
    private Color makeRedColor() {
        return new Color(getDisplay(), 255, 127, 80);
    }

    /**
     * Returns green color.
     * @return green color
     */
    private Color makeGreenColor() {
        return new Color(getDisplay(), 152, 251, 152);
    }

    /**
     * Get method for display.
     * @return display
     */
    public Display getDisplay() {
        if (this.display == null) {
            this.display = Display.getCurrent();
        }
        return this.display;
    }

    /**
     * Sets color to background of the components.
     * @param element element
     * @param component repository component
     * @param isFromOriginalArchitecture whether element is from original architecture
     * @param isFromNewArchitecture whether element is from new architecture
     * @param componentFromNewArchitecture component from new architecture
     * @param componentFromOriginalArchitecture component from old architecture
     */
    public void layoutBackgroundOfComponents(final Object element, final RepositoryComponent component,
            final boolean isFromOriginalArchitecture, final boolean isFromNewArchitecture,
            final RepositoryComponent componentFromNewArchitecture,
            final RepositoryComponent componentFromOriginalArchitecture) {
        Tree tree = null;
        if (isFromOriginalArchitecture
                && this.componentsTreeLabelProvider.componentValuesDiffer(component, componentFromNewArchitecture)) {
            tree = this.componentsTreeLabelProvider.getOriginalComponentsTree();
        } else {
            if (isFromNewArchitecture
                    && this.componentsTreeLabelProvider.componentValuesDiffer(componentFromOriginalArchitecture,
                            component)) {
                tree = this.componentsTreeLabelProvider.getNewComponentsTree();
            }
        }
        if (tree != null) {
            TreeItem item = getItem(tree, element);
            if (item != null) {
                item.setBackground(makeYellowColor());
            }
        }
    }

    /**
     * Sets background color of tree item.
     * @param gastClass gast class
     */
    public void layoutBackgroundOfGASTClass(final ClassDeclaration gastClass) {
        Tree tree = this.componentsTreeLabelProvider.getNewComponentsTree();
        TreeItem item = getItem(tree, gastClass);
        if (item != null) {
            item.setBackground(makeYellowColor());
        }
    }

    /**
     * Returns item from tree.
     * @param tree tree
     * @param object object
     * @return item tree
     */
    private TreeItem getItem(final Tree tree, final Object object) {
        for (TreeItem item : tree.getItems()) {
            TreeItem resultItem = getItem(object, item);
            if (resultItem != null) {
                return resultItem;
            }
        }
        return null;
    }

    /**
     * Returns item from tree.
     * @param object object
     * @param item item
     * @return tree item
     */
    private TreeItem getItem(final Object object, final TreeItem item) {
        if (item.getData() == object) {
            return item;
        } else {
            for (TreeItem childItem : item.getItems()) {
                TreeItem resultItem = getItem(object, childItem);
                if (resultItem != null) {
                    return resultItem;
                }
            }
        }
        return null;
    }

    // TODO: to use system colors

    /**
     * Returns the background color.
     * @param element element
     * @param columnIndex column index
     * @return color
     */
    public Color getBackground(final Object element, final int columnIndex) {
        if (columnIndex == 2) {
            if (!this.componentsTreeLabelProvider.getColumnText(element, columnIndex).equals(
                    this.componentsTreeLabelProvider.getColumnText(element, columnIndex - 1))) {
                return makeYellowColor();
            }
        }
        return getDisplay().getSystemColor(SWT.COLOR_WHITE);
    }

    /**
     * Returns foreground color.
     * @return color
     */
    public Color getForeground() {
        return getDisplay().getSystemColor(SWT.COLOR_BLACK);
    }

}
