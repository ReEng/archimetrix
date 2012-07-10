package org.archimetrix.relevanceanalysis.ui.providers;


import org.archimetrix.relevanceanalysis.AbstractRelevanceAnalysis;
import org.archimetrix.relevanceanalysis.OutputFormatter;
import org.archimetrix.relevanceanalysis.badsmells.util.BadSmellOccurrenceUtil;
import org.archimetrix.relevanceanalysis.ui.RelevanceAnalysisUIPlugin;
import org.archimetrix.relevanceanalysis.ui.views.RelevantBadSmellsView;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;
import org.reclipse.structure.inference.annotations.ASGAnnotation;


/**
 * The label provider for the table in the Relevant Bad Smells View.
 * 
 * @author mcp
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 * 
 */
public class RelevantBadSmellsViewLabelProvider extends AbstractRelevanceAnalysisViewLabelProvider
{

   private final RelevantBadSmellsView relevantBadSmellsView;


   public RelevantBadSmellsViewLabelProvider(final RelevantBadSmellsView relevantBadSmellsView)
   {
      this.relevantBadSmellsView = relevantBadSmellsView;
   }


   @Override
   public String getColumnText(final Object element, final int columnIndex)
   {
      String text;
      ASGAnnotation annotation = (ASGAnnotation) element;
      int lastColumn = this.relevantBadSmellsView.getRelevanceResults().getNumberOfRelevanceStrategies()+1;
      switch (columnIndex)
      {
         case 0:
            text = annotation.getPattern().getName();
            break;
         case 1:
            text = OutputFormatter.formatAnnotatedElements(annotation);
            break;
         default:
            if (columnIndex == lastColumn)
            {
               text = getParetoRelevanceValueString(columnIndex - 2, annotation);
            }
            else
            {
               text = getRelevanceValueString(columnIndex - 2, annotation);
            }
      }
      if (text.equals(INVALID_STRATEGY_VALUE))
      {
         text = "";
      }
      return text;
   }


   private String getParetoRelevanceValueString(final int index, final ASGAnnotation annotation)
   {
      Double value = getRelevanceValueFromMap(index, annotation);
      if (value == 1.0)
      {
         return PARETO_OPTIMAL_TRUE;
      }
      return PARETO_OPTIMAL_FALSE;
   }


   public String getRelevanceValueString(final int index, final ASGAnnotation annotation)
   {
      Double value = getRelevanceValueFromMap(index, annotation);
      return value.toString();
   }


   public Double getRelevanceValueFromMap(final int index, final ASGAnnotation annotation)
   {
      if (this.relevantBadSmellsView.getRelevanceResults().getRelevanceValues(annotation).length > 0)
      {
         return this.relevantBadSmellsView.getRelevanceResults().getRelevanceValues(annotation)[index];
      }
      return 0d;
   }


   @Override
   public Color getBackground(final Object element, final int columnIndex)
   {
      Display display = Display.getCurrent();
      if (getRelevanceValueFromMap(
            this.relevantBadSmellsView.getRelevanceResults().getNumberOfRelevanceStrategies() - 1,
            ((ASGAnnotation) element)) == 1.0)
      {
         return display.getSystemColor(SWT.COLOR_YELLOW);
      }
      int lastColumn = this.relevantBadSmellsView.getRelevanceResults().getNumberOfRelevanceStrategies() + 1;
      Double relevanceValueFromMap = getRelevanceValueFromMap(this.relevantBadSmellsView.getRelevanceResults()
            .getNumberOfRelevanceStrategies() - 2, (ASGAnnotation) element);
      if (columnIndex == lastColumn - 1 && isHighestRelevanceValue(relevanceValueFromMap, ((ASGAnnotation) element)))
      {
         return display.getSystemColor(SWT.COLOR_YELLOW);
      }
      return display.getSystemColor(SWT.COLOR_WHITE);
   }


   private boolean isHighestRelevanceValue(final Double relevanceValue, final ASGAnnotation currentAnno)
   {
      return relevanceValue.equals(getMaxRelevanceValue(currentAnno));
   }


   private Double getMaxRelevanceValue(final ASGAnnotation currentAnno)
   {
      Double max = -1.0;
      for (ASGAnnotation badSmellAnno : this.relevantBadSmellsView.getRelevanceResults().getRelevanceSubjects())
      {
         if (BadSmellOccurrenceUtil.get().getBadSmellName(badSmellAnno)
               .equals(BadSmellOccurrenceUtil.get().getBadSmellName(currentAnno)))
         {
            Double value = this.relevantBadSmellsView.getRelevanceResults().getRelevanceValues(badSmellAnno)[this.relevantBadSmellsView
                  .getRelevanceResults().getNumberOfRelevanceStrategies()
                  - AbstractRelevanceAnalysis.NUMBER_OF_RESULT_STRATEGIES];
            if (value >= max)
            {
               max = value;
            }
         }
      }
      return max;
   }


   @Override
   public Image getColumnImage(final Object element, final int columnIndex)
   {
      if (columnIndex == 0)
      {
         return RelevanceAnalysisUIPlugin.getImageDescriptor(BAD_SMELL_ICON_PATH).createImage();
      }
      return null;
   }
}
