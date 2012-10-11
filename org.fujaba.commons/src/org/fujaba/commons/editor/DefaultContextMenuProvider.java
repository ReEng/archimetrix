/*
 * The FUJABA ToolSuite for Eclipse project:
 *
 *   FUJABA is the acronym for 'From Uml to Java And Back Again'
 *   and originally aims to provide an environment for round-trip
 *   engineering using UML as visual programming language. During
 *   the last years, the environment has become a base for several
 *   research activities, e.g. distributed software, database
 *   systems, modelling mechanical and electrical systems and
 *   their simulation. Thus, the environment has become a project,
 *   where this source code is part of. Further details are avail-
 *   able via http://www.fujaba.de
 *
 *      Copyright (C) Fujaba Development Group
 *
 *   This library is free software; you can redistribute it and/or
 *   modify it under the terms of the GNU Lesser General Public
 *   License as published by the Free Software Foundation; either
 *   version 2.1 of the License, or (at your option) any later version.
 *
 *   You should have received a copy of the GNU Lesser General Public
 *   License along with this library; if not, write to the Free
 *   Software Foundation, Inc., 59 Temple Place, Suite 330, Boston,
 *   MA 02111-1307, USA or download the license under
 *   http://www.gnu.org/copyleft/lesser.html
 *
 * WARRANTY:
 *
 *   This library is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 *   GNU Lesser General Public License for more details.
 *
 * Contact address:
 *
 *   Fujaba Management Board
 *   Software Engineering Group
 *   University of Paderborn
 *   Warburgerstr. 100
 *   D-33098 Paderborn
 *   Germany
 *
 *   URL  : http://www.fujaba.de
 *   email: info@fujaba.de
 *
 */
package org.fujaba.commons.editor;


import java.util.HashMap;
import java.util.HashSet;

import org.eclipse.gef.ContextMenuProvider;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.ui.actions.ActionRegistry;
import org.eclipse.gef.ui.actions.GEFActionConstants;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IContributionItem;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.ui.actions.ActionFactory;


/**
 * The implementation of a context menu provider for Fujaba diagrams. It adds relevant contributions
 * to the popup menu.
 * 
 * @author mvdetten
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 */
public class DefaultContextMenuProvider extends ContextMenuProvider
{

   /**
    * The group identifier for all Fujaba related commands.
    */
   public final static String GROUP_FUJABA = "FUJABA";

   /**
    * The action registry for this menu provider.
    */
   private ActionRegistry actionRegistry;

   /**
    * The map to assign action IDs to group IDs.
    */
   private HashMap<String, String> actionGroupMappings;

   /**
    * Those items will be hidden on the context menus by default.
    */
   private final static String[] defaultExclusionList = {
         "replaceWithMenu", //$NON-NLS-1$
         "compareWithMenu", //$NON-NLS-1$
         "ValidationAction", //$NON-NLS-1$
         "team.main", //$NON-NLS-1$
         "org.eclipse.jst.ws.atk.ui.webservice.category.popupMenu", //$NON-NLS-1$
         "org.eclipse.tptp.platform.analysis.core.ui.internal.actions.MultiAnalysisActionDelegate", //$NON-NLS-1$
         "org.eclipse.debug.ui.contextualLaunch.run.submenu", //$NON-NLS-1$
         "org.eclipse.debug.ui.contextualLaunch.debug.submenu", //$NON-NLS-1$
         "org.eclipse.debug.ui.contextualLaunch.profile.submenu", //$NON-NLS-1$

         "org.eclipse.mylyn.resources.ui.ui.interest.remove.element" //$NON-NLS-1$
   };

   /**
    * All elements on this {@link java.util.Set} will be hidden.
    * 
    * @see #addDefaultExclusions()
    */
   private HashSet<String> exclusionSet;


   /**
    * Default constructor.
    * 
    * @param viewer The edit part viewer for which the context menu provider is created.
    * @param registry The action registry to be used.
    */
   public DefaultContextMenuProvider(EditPartViewer viewer,
         ActionRegistry registry)
   {
      super(viewer);
      actionRegistry = registry;
      actionGroupMappings = new HashMap<String, String>();
      exclusionSet = new HashSet<String>();

      initActionGroupMappings();
      addDefaultExclusions();
   }


   /**
    * Adds the action to the specified group.
    * 
    * @param actionID The action id.
    * @param groupID The group id.
    */
   public void addActionToGroup(String actionID, String groupID)
   {
      actionGroupMappings.put(actionID, groupID);
   }


   /**
    * Initializes the action <--> group mapping.
    */
   protected void initActionGroupMappings()
   {
      addActionToGroup(ActionFactory.DELETE.getId(), GEFActionConstants.GROUP_EDIT);
      addActionToGroup(ActionFactory.UNDO.getId(), GEFActionConstants.GROUP_UNDO);
      addActionToGroup(ActionFactory.REDO.getId(), GEFActionConstants.GROUP_UNDO);
      addActionToGroup(ActionFactory.SAVE.getId(), GEFActionConstants.GROUP_SAVE);
   }


   /**
    * Hides all items from the <code>{@link #exclusionSet}</code>, but allows them anyway as other
    * menu items may depend on it.
    * 
    * @param item The contribution item to be added - may be <code>null</code>.
    * @return Returns <code>true</code> for all items (from super).
    * @see org.eclipse.jface.action.ContributionManager#allowItem(org.eclipse.jface.action.IContributionItem)
    */
   @Override
   protected boolean allowItem(IContributionItem item)
   {
      if ((item.getId() != null && exclusionSet.contains(item.getId())) || !item.isEnabled())
      {
         item.setVisible(false);
      }

      return super.allowItem(item);
   }


   /**
    * Transfers the String array <code>{@link #defaultExclusionList}</code> into the
    * <code>{@link #exclusionSet}</code>.
    */
   protected void addDefaultExclusions()
   {
      for (String item : defaultExclusionList)
      {
         exclusionSet.add(item);
      }
   }


   /**
    * Adds all relevant actions to the menu.
    * 
    * @param menu The menu manager (actually <code>this</code>).
    */
   @Override
   public void buildContextMenu(IMenuManager menu)
   {
      getViewer().flush();

      menu.add(new Separator(GROUP_FUJABA));
      GEFActionConstants.addStandardActionGroups(menu);

      for (String actionId : actionGroupMappings.keySet())
      {
         IAction action = actionRegistry.getAction(actionId);
         if (action != null && action.isEnabled())
         {
            menu.appendToGroup(actionGroupMappings.get(actionId), action);
         }
      }
   }
}
