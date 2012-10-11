package org.fujaba.commons.providers;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.ui.views.properties.IPropertySource;
import org.fujaba.commons.edit.parts.IModelViewEditPart;


/**
 * Fetches generated item property descriptors for from EMF.edit plug-ins.
 * This class is customized for selection of IModelViewEditParts, such that 
 * the correct property descriptor is fetched and editing of properties 
 * within the properties view is possible.
 * 
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 *
 */
public class ModelViewAdapterFactoryContentProvider extends
      AdapterFactoryContentProvider
{

   public ModelViewAdapterFactoryContentProvider(AdapterFactory adapterFactory)
   {
      super(adapterFactory);
   }

   @Override
   public IPropertySource getPropertySource(Object object)
   {
      if(object instanceof IModelViewEditPart)
      {
         return super.getPropertySource(((IModelViewEditPart)object).getRealModel());
      }
      return super.getPropertySource(object);
   }
}
