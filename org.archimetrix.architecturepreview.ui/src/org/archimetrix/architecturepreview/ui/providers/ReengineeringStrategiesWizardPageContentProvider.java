package org.archimetrix.architecturepreview.ui.providers;


import java.util.List;

import org.archimetrix.architecturepreview.ui.util.StrategyFilter;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.reclipse.structure.inference.annotations.ASGAnnotation;


/**
 * This class provides the content of the reengineering strategies table in the
 * ArchitecturePreviewWizard. It makes use of the StrategyFilter to filter reengineering
 * strategies to be presented to the user.
 * 
 * @author mcp
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 * 
 */
public class ReengineeringStrategiesWizardPageContentProvider implements ITreeContentProvider
{

   private StrategyFilter filter;

   private ASGAnnotation annotation;


   @SuppressWarnings("unchecked")
   @Override
   public Object[] getElements(final Object inputElement)
   {
      List<EPackage> list = (List<EPackage>) inputElement;
      EPackage ePackage = list.get(0);
      EClass clazz = (EClass) ePackage.getEClassifiers().get(0);
      List<EOperation> allStrategies = clazz.getEOperations();
      if (this.filter == null)
      {
         this.filter = new StrategyFilter();
      }
      List<EOperation> filteredStrategies = this.filter.filterStrategies(allStrategies, this.annotation);
      if (filteredStrategies == null)
      {
         return allStrategies.toArray();
      }
      return filteredStrategies.toArray();
   }


   @Override
   public void dispose()
   {
   }


   @Override
   public void inputChanged(final Viewer viewer, final Object oldInput, final Object newInput)
   {
   }


   @Override
   public Object[] getChildren(final Object parentElement)
   {
      return null;
   }


   @Override
   public Object getParent(final Object element)
   {
      return null;
   }


   @Override
   public boolean hasChildren(final Object element)
   {
      return false;
   }


   public void setAnnotation(final ASGAnnotation annotation)
   {
      this.annotation = annotation;
   }

}
