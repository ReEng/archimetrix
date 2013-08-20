package org.archimetrix.commons.wizards;


import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;


/**
 * A super class for the wizard pages used in archimetrix.
 * Implements a ModifyListener and a
 * SelectionListener.
 *
 * @author mcp
 */
public abstract class AbstractWizardPage extends WizardPage
implements ModifyListener, SelectionListener {
/**
 * Provider for resource selection section.
 */
   private ResourceSelectionSectionProvider resourceSelectionSectionProvider;
/**
 * Get method for resourceSelectionSectionProvider.
 * @return resourceSelectionSectionProvider resourceSelectionSectionProvider
 */
   public ResourceSelectionSectionProvider
   getResourceSelectionSectionProvider() {
       return this.resourceSelectionSectionProvider;
   }
/**
 * the constructor.
 * @param pageName the name of the page
 */
   protected AbstractWizardPage(final String pageName) {
      super(pageName);
      this.setTitle(pageName);
      this.resourceSelectionSectionProvider =
              new ResourceSelectionSectionProvider();
   }


   @Override
   public void widgetSelected(final SelectionEvent e) {
      widgetDefaultSelected(e);
   }


   @Override
   public void widgetDefaultSelected(final SelectionEvent e) {
      setPageComplete(isValid());
   }


   protected abstract boolean isValid();
}
