package org.archimetrix.architecturepreview.ui.providers;


import org.archimetrix.relevanceanalysis.OutputFormatter;
import org.archimetrix.relevanceanalysis.ui.RelevanceAnalysisUIPlugin;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.reclipse.structure.inference.annotations.ASGAnnotation;


/**
 * This class provides the labels of the bad smells tree in the ArchitecturePreviewWizard.
 * 
 * @author mcp
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 * 
 */
public class BadSmellsWizardPageLabelProvider extends LabelProvider implements ITableLabelProvider
{


   private static final String BAD_SMELLS_ICON_PATH = "./icons/badSmells.png";


   @Override
   public String getText(final Object element)
   {
      ASGAnnotation annotation = (ASGAnnotation) element;
      return OutputFormatter.formatAnnotation(annotation);
   }


   @Override
   public String getColumnText(final Object element, final int columnIndex)
   {
      return "";
   }


   @Override
   public Image getImage(final Object element)
   {
      return RelevanceAnalysisUIPlugin.getImageDescriptor(BAD_SMELLS_ICON_PATH).createImage();
   }


   @Override
   public Image getColumnImage(final Object element, final int columnIndex)
   {
      return null;
   }


}
