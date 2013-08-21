package org.archimetrix.architecturepreview.ui.providers;


import java.util.ArrayList;

import org.eclipse.jface.viewers.ITableColorProvider;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;


/**
 * This class provides the labels of the main table in the Architecture Prognosis View. Furthermore
 * it sets the background color if needed.
 * 
 * @author mcp
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 * 
 */
public class ArchitecturePrognosisViewLabelProvider extends LabelProvider implements ITableLabelProvider,
      ITableColorProvider
{

   @SuppressWarnings("unchecked")
   @Override
   public String getColumnText(final Object element, final int columnIndex)
   {
      return ((ArrayList<String>) element).get(columnIndex);
   }


   @Override
   public Color getBackground(final Object element, final int columnIndex)
   {
      if (columnIndex > 0)
      {
         if (!getColumnText(element, 1).equals(getColumnText(element, 2)))
         {
            return Display.getCurrent().getSystemColor(SWT.COLOR_YELLOW);
         }
      }
      return Display.getCurrent().getSystemColor(SWT.COLOR_WHITE);
   }


   @Override
   public Color getForeground(final Object element, final int columnIndex)
   {
      return null;
   }


   @Override
   public Image getColumnImage(final Object element, final int columnIndex)
   {
      return null;
   }
}
