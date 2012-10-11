/**
 * 
 */
package org.fujaba.commons.editor;

import java.util.Iterator;

import org.eclipse.gef.editparts.ZoomManager;
import org.eclipse.gef.ui.actions.ActionRegistry;
import org.eclipse.gef.ui.actions.ZoomComboContributionItem;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.part.EditorActionBarContributor;

/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 *
 */
public class CommonSinglePageEditorActionBarContributor extends
      EditorActionBarContributor
{
   private ZoomComboContributionItem zoomComboContributionItem = null;


   /**
    * @see org.eclipse.ui.part.MultiPageEditorActionBarContributor#setActivePage(org.eclipse.ui.IEditorPart)
    */
   @SuppressWarnings("unchecked")
   @Override
   public void setActiveEditor(IEditorPart activeEditor)
   {
      if (activeEditor != null)
      {
         ActionRegistry registry = (ActionRegistry) activeEditor
               .getAdapter(ActionRegistry.class);
         Iterator<IAction> iter = registry.getActions();
         IActionBars bars = this.getActionBars();
         while (iter.hasNext())
         {
            IAction action = iter.next();
            bars.setGlobalActionHandler(action.getId(), action);
         }

         if (this.zoomComboContributionItem != null)
         {
            this.zoomComboContributionItem
                  .setZoomManager((ZoomManager) activeEditor
                        .getAdapter(ZoomManager.class));
         }

         bars.updateActionBars();
      }
   }


   /**
    * @see org.eclipse.ui.part.EditorActionBarContributor#contributeToToolBar(org.eclipse.jface.action.IToolBarManager)
    */
   @Override
   public void contributeToToolBar(IToolBarManager toolBarManager)
   {
      super.contributeToToolBar(toolBarManager);
      toolBarManager.add(ActionFactory.UNDO.create(this.getPage()
            .getWorkbenchWindow()));
      toolBarManager.add(ActionFactory.REDO.create(this.getPage()
            .getWorkbenchWindow()));

      toolBarManager.add(new Separator());
      String[] zoomStrings = new String[] { ZoomManager.FIT_ALL,
            ZoomManager.FIT_HEIGHT, ZoomManager.FIT_WIDTH };

      this.zoomComboContributionItem = new ZoomComboContributionItem(getPage(),
            zoomStrings);
      toolBarManager.add(this.zoomComboContributionItem);

      toolBarManager.add(new Separator());
   }


   /**
    * @see org.eclipse.ui.part.EditorActionBarContributor#contributeToMenu(org.eclipse.jface.action.IMenuManager)
    */
   @Override
   public void contributeToMenu(IMenuManager menuManager)
   {
      super.contributeToMenu(menuManager);
      MenuManager viewMenu = new MenuManager("View");
      menuManager.insertAfter(IWorkbenchActionConstants.M_EDIT, viewMenu);
   }
}
