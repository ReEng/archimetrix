package org.archimetrix.architecturepreview.ui.providers;


import org.archimetrix.relevanceanalysis.ui.RelevanceAnalysisUIPlugin;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;


/**
 * This class provides the labels of the reengineering strategies table in the
 * ArchitecturePreviewWizard.
 * 
 * @author mcp
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 * 
 */
public class ReengineeringStrategiesWizardPageLabelProvider extends LabelProvider implements ITableLabelProvider
{

   private static final String ICONS_FOLDER = "./icons/reengineering.png";

   private static final String NO_DESCRIPTION_PLACEHOLDER = "no description";

   private static final String REENGINEERING_STRATEGY_DESCRIPTION = "http://reclipse.reengineering.org/strategydescription";


   @Override
   public String getText(final Object element)
   {
      EOperation operation = (EOperation) element;
      EAnnotation eAnnotation = operation.getEAnnotation(REENGINEERING_STRATEGY_DESCRIPTION);
      String strategyDescription = NO_DESCRIPTION_PLACEHOLDER;
      if (eAnnotation != null)
      {
         strategyDescription = eAnnotation.getDetails().get(0).getValue();
      }
      StringBuilder strategyLabel = new StringBuilder(operation.getName());
      strategyLabel.append(" (");
      strategyLabel.append(strategyDescription);
      strategyLabel.append(")");
      return strategyLabel.toString();
   }


   @Override
   public String getColumnText(final Object element, final int columnIndex)
   {
      return "";
   }


   @Override
   public Image getColumnImage(final Object element, final int columnIndex)
   {
      if (columnIndex == 0)
      {
         return getImage(element);
      }
      return null;
   }


   @Override
   public Image getImage(final Object element)
   {
      return RelevanceAnalysisUIPlugin.getImageDescriptor(ICONS_FOLDER).createImage();
   }

}
