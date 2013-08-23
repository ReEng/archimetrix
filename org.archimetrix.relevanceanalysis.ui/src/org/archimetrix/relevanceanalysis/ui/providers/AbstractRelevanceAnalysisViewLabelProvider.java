package org.archimetrix.relevanceanalysis.ui.providers;

import org.eclipse.jface.viewers.ITableColorProvider;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;

/**
 * An abstract label provider for tables used in the relevance analysis ui.
 * 
 * @author mcp
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 * 
 */
public abstract class AbstractRelevanceAnalysisViewLabelProvider extends LabelProvider implements ITableLabelProvider,
        ITableColorProvider {

    protected static final String PARETO_OPTIMAL_FALSE = "false";

    protected static final String PARETO_OPTIMAL_TRUE = "true";

    protected static final String BAD_SMELL_ICON_PATH = "./icons/badSmells.png";

    protected static final String COMPONENTS_ICON_PATH = "./icons/components.png";

    protected static final String INVALID_STRATEGY_VALUE = "-1.0";

    @Override
    public Image getColumnImage(final Object element, final int columnIndex) {
        return null;
    }

    @Override
    public Color getBackground(final Object element, final int columnIndex) {
        return Display.getCurrent().getSystemColor(SWT.COLOR_WHITE);
    }

    @Override
    public Color getForeground(final Object element, final int columnIndex) {
        return Display.getCurrent().getSystemColor(SWT.COLOR_BLACK);
    }

}
