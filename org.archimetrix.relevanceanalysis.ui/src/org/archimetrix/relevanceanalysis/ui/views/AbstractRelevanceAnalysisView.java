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
 * The AbstractRelevanceAnalysisView provides a basic implementation of a view for the relevance
 * analysis.
 * 
 * @author mcp
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 * 
 */
public abstract class AbstractRelevanceAnalysisView<T> extends ViewPart
{

   protected static final String PARETO_OPTIMALITY_COLUMN_TITLE = "Pareto Optimality";

   protected static final String TOTAL_RELEVANCE_COLUMN_TITLE = "Relevance Total";

   protected TreeViewer viewer;

   protected RelevanceResults<T> relevanceResults;

   protected AbstractRelevanceAnalysisViewLabelProvider labelProvider;

   protected AbstractRelevanceAnalysisViewContentProvider contentProvider;


   @Override
   public void createPartControl(final Composite parent)
   {
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


   protected void createTreeViewer(final Composite root)
   {
      this.viewer = new TreeViewer(root, SWT.FULL_SELECTION | SWT.SINGLE);
      this.viewer.getTree().setLinesVisible(true);
      this.viewer.getTree().setHeaderVisible(true);
      this.viewer.getTree().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
   }


   private void createContextMenu()
   {
      MenuManager menuMgr = new MenuManager();

      // Create menu.
      Menu menu = menuMgr.createContextMenu(this.viewer.getControl());
      this.viewer.getControl().setMenu(menu);

      // Register menu for extension.
      getSite().registerContextMenu(menuMgr, this.viewer);
   }


   public void createSorter()
   {
      // no sorter
   }


   public void createFilter()
   {
      // no filter
   }


   abstract public void createProvider();


   abstract public void createColumns();


   public void setInput(final Object input)
   {
      this.viewer.setInput(input);
   }


   @Override
   public void setFocus()
   {
      this.viewer.getControl().setFocus();
   }


   public RelevanceResults<T> getRelevanceResults()
   {
      return this.relevanceResults;
   }


   public void setRelevanceResults(RelevanceResults<T> relevanceResults)
   {
      this.relevanceResults = relevanceResults;
   }


}
