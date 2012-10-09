package org.archimetrix.relevanceanalysis.ui.views;


import org.archimetrix.relevanceanalysis.AbstractRelevanceAnalysis;
import org.archimetrix.relevanceanalysis.badsmells.util.BadSmellOccurrenceUtil;
import org.archimetrix.relevanceanalysis.badsmells.util.RelevanceResultsStorage;
import org.archimetrix.relevanceanalysis.ui.providers.RelevantComponentsViewContentProvider;
import org.archimetrix.relevanceanalysis.ui.providers.RelevantComponentsViewLabelProvider;
import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.TreeColumn;
import org.reclipse.structure.inference.annotations.ASGAnnotation;

import eu.qimpress.sourcecodedecorator.ComponentImplementingClassesLink;
import eu.qimpress.sourcecodedecorator.impl.ComponentImplementingClassesLinkImpl;


/**
 * The Relevant Components View visualizes the results of the Bad Smell Relevance Analysis in a
 * table.
 * 
 * @author mcp
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 * 
 */
public class RelevantComponentsView extends AbstractRelevanceAnalysisView<ComponentImplementingClassesLink>
{

   private static final String COMPLEXITY_COLUMN_TITLE = "Complexity (CPC)";

   private static final String CLOSENESS_TO_THRESHOLD_COLUMN_TITLE = "Closeness To Threshold";
   
   private static final String COMPONENT_COLUMN_TITLE = "Component";

   public static final String ID = "org.archimetrix.relevanceanalysis.ui.relevantComponentsView";

   protected static Object[] selectedComponents;


   public void createProvider()
   {
      this.labelProvider = new RelevantComponentsViewLabelProvider(this);
      this.contentProvider = new RelevantComponentsViewContentProvider(this);
      this.viewer.addSelectionChangedListener(new ISelectionChangedListener()
      {

         @Override
         public void selectionChanged(final SelectionChangedEvent event)
         {
            RelevantComponentsView.selectedComponents = ((TreeSelection) event.getSelection()).toArray();
         }
      });
   }


   @Override
   public void createSorter()
   {
      this.viewer.setSorter(new RelevantComponentsSorter());
   }


   protected void createTreeViewer(final Composite root)
   {
      this.viewer = new TreeViewer(root, SWT.FULL_SELECTION | SWT.MULTI);
      this.viewer.getTree().setLinesVisible(true);
      this.viewer.getTree().setHeaderVisible(true);
      this.viewer.getTree().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
   }


   public void createColumns()
   {
      String[] names = new String[] { COMPONENT_COLUMN_TITLE, CLOSENESS_TO_THRESHOLD_COLUMN_TITLE,
            COMPLEXITY_COLUMN_TITLE, TOTAL_RELEVANCE_COLUMN_TITLE, PARETO_OPTIMALITY_COLUMN_TITLE };
      boolean firstColumn = true;
      for (String name : names)
      {
         TreeColumn tc = new TreeColumn(this.viewer.getTree(), SWT.LEFT);
         tc.setText(name);
         if (firstColumn)
         {
            tc.setWidth(350);
            firstColumn = false;
         }
         else
         {
            tc.pack();
         }
      }
   }


   public static Object[] getSelectedComponents()
   {
      return selectedComponents;
   }

}
