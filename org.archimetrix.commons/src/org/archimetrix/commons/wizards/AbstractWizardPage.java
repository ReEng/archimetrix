package org.archimetrix.commons.wizards;


import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;


/**
 * A super class for the wizard pages used in archimetrix. Implements a ModifyListener and a
 * SelectionListener.
 * 
 * @author mcp
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 * 
 */
public abstract class AbstractWizardPage extends WizardPage implements ModifyListener, SelectionListener
{

   public ResourceSelectionSectionProvider resourceSelectionSectionProvider;


   protected AbstractWizardPage(final String pageName)
   {
      super(pageName);
      this.setTitle(pageName);
      this.resourceSelectionSectionProvider = new ResourceSelectionSectionProvider();
   }


   @Override
   public void widgetSelected(final SelectionEvent e)
   {
      widgetDefaultSelected(e);
   }


   @Override
   public void widgetDefaultSelected(final SelectionEvent e)
   {
      setPageComplete(isValid());
   }


   protected abstract boolean isValid();
}
