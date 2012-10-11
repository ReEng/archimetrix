/**
 * 
 */
package org.fujaba.commons.editor;

import java.util.HashMap;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.gef.DefaultEditDomain;
import org.eclipse.gef.EditDomain;
import org.eclipse.gef.commands.CommandStack;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IPersistableEditor;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;
import org.fujaba.commons.views.MultiOverviewOutlinePage;


/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 *
 */
public abstract class AbstractMultiPageEditor extends FormEditor implements IEditingDomainProvider,
      IPersistableEditor
{
   protected EditDomain editDomain;
   protected EditingDomain editingDomain;
   protected MultiOverviewOutlinePage outlinePage;
   private HashMap<EObject, NestedEObjectEditorInput> editorInputMap = new HashMap<EObject, NestedEObjectEditorInput>();

   /**
    * @see org.eclipse.emf.edit.domain.IEditingDomainProvider#getEditingDomain()
    */
   public EditingDomain getEditingDomain()
   {
      return this.editingDomain;
   }

   /**
    * Implement this method to initialize the editing domain. This method should be
    * called within the constructor of a subclass. 
    */
   protected abstract void initializeEditingDomain();
   
   
   /**
    * Feel free to override this method if you need special behavior.
    * 
    * @return the edit domain which is used be GEF.
    */
   public EditDomain getEditDomain()
   {
      if (editDomain == null)
      {
         editDomain = new DefaultEditDomain(this);
      }
      return editDomain;
   }
   
   /**
    * @return the editor's command stack
    */
   public CommandStack getCommandStack()
   {
      return this.getEditDomain().getCommandStack();
   }
   
   /**
    * Tests for uncommitted changes on the command stack after the last save operation. 
    * 
    * @return false if no uncommitted changes exist, true otherwise
    * @see org.eclipse.ui.forms.editor.FormEditor#isDirty()
    */
   @Override
   public boolean isDirty()
   {
      return getCommandStack().isDirty();
   }
   
   protected MultiOverviewOutlinePage getOverviewOutlinePage()
   {
      if (this.outlinePage == null)
      {
         this.outlinePage = new MultiOverviewOutlinePage();
      }
      return this.outlinePage;
   }
   
   /**
    * Causes the outline page to update after a page change.
    * Therefore, should be called on every page change
    * @param editor the currently active editor
    */
   protected void updateContentOutline(IEditorPart editor)
   {      
      if (outlinePage != null)
      {
         if(editor == null)
         {
            outlinePage.setDefaultPageActive();
            return;
         }
         IContentOutlinePage page = (IContentOutlinePage) editor
               .getAdapter(IContentOutlinePage.class);
         if (page != null)
         {
            outlinePage.setActivePage(page);
         }
         else
         {
            outlinePage.setDefaultPageActive();
         }
      }
   }


   /**
    * @see org.eclipse.ui.forms.editor.FormEditor#pageChange(int)
    */
   @Override
   protected void pageChange(int newPageIndex)
   {
      super.pageChange(newPageIndex);
      updateContentOutline(getActiveEditor());
   }
   
   
   /**
    * Searches the nested editor that handles the given input. If such an editor is found then the
    * page index is returned, otherwise -1.
    * 
    * @param input the input of the nested editor
    * @return page index of the editor or -1, if no editor found
    */
   public int findEditor(IEditorInput input)
   {
      int size = this.getPageCount();
      for (int i = 0; i < size; i++)
      {
         IEditorPart e;
         try
         {
            e = this.getEditor(i);
            if (e != null)
            {
               if (e.getEditorInput().equals(input))
               {
                  return i;
               }
            }
         }
         catch (IllegalArgumentException ex)
         {
            e = null;
         }
      }

      return -1;
   }
   
   
   /**
    * 
    * This is a convenience method. It enables additional pages to close 
    * and must be called on new page creation.
    *  
    * @param pageIndex the index of the new page
    * @param page the page it self
    */
   protected void setTabsToCloseable(int pageIndex, AbstractSimpleEditorPart page)
   {
      CTabItem item = (((CTabFolder) getContainer()).getItem(pageIndex));
      Control parent = item.getControl();
      item.dispose();
      item = this.createItem(parent);
      item.setData(page);
      (page).setCTabItem(item);
   }
   
   /**
    * Creates a closeable tab item instead of the default non-closeable.
    * @param control
    * @return
    */
   protected CTabItem createItem(Control control)
   {
      CTabItem item = new CTabItem((CTabFolder) getContainer(), SWT.CLOSE);
      item.setControl(control);
      return item;
   }
   
   
   /**
    * @see org.eclipse.core.runtime.IAdaptable#getAdapter(java.lang.Class)
    */
   @Override
   public Object getAdapter(@SuppressWarnings("rawtypes") Class adapter)
   {

      if (adapter == EditDomain.class)
      {
         return getEditDomain();
      }
      else if (adapter == IContentOutlinePage.class)
      {
         return getOverviewOutlinePage();
      }
      else
      {
         return super.getAdapter(adapter);
      }
   }
   
   /**
    * Fetches the editor input corresponding to the given EObject. If there none, 
    * one is created and stored in a HashMap. 
    * @param nestedEditorInput the EObject representing the nested editor input
    * @return the corresponding instance of NestedEObjectEditorInput
    */
   protected IEditorInput provideEditorInput(EObject nestedEditorInput)
   {
      if(editorInputMap.get(nestedEditorInput) != null)
      {
         return editorInputMap.get(nestedEditorInput);
      }
      
      NestedEObjectEditorInput input = new NestedEObjectEditorInput(nestedEditorInput);
      editorInputMap.put(nestedEditorInput, input);
      return input;
   }
}
