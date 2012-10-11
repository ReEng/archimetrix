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


import org.eclipse.jface.action.ICoolBarManager;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IStatusLineManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.part.MultiPageEditorActionBarContributor;



/**
 * Delegation to CommonSinglePageEditorActionBarContributor.
 * The only difference lies in the setActiveEditor() method, which
 * is implemented in the super class. The implemented behavior of 
 * setActivePage matches exactly the behavior of the delegation's
 * setActiveEditor method.
 * 
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 *
 */
public class CommonMultiPageEditorActionBarContributor extends
      MultiPageEditorActionBarContributor
{
   CommonSinglePageEditorActionBarContributor delegation;

   public CommonMultiPageEditorActionBarContributor()
   {
      super();
      delegation = new CommonSinglePageEditorActionBarContributor();
   }
   

   @Override
   public void setActivePage(IEditorPart activeEditor)
   {
      delegation.setActiveEditor(activeEditor);
   }

   @Override
   public void contributeToCoolBar(ICoolBarManager coolBarManager)
   {
      delegation.contributeToCoolBar(coolBarManager);
   }

   @Override
   public void contributeToMenu(IMenuManager menuManager)
   {
      delegation.contributeToMenu(menuManager);
   }

   @Override
   public void contributeToStatusLine(IStatusLineManager statusLineManager)
   {
      delegation.contributeToStatusLine(statusLineManager);
   }

   @Override
   public void contributeToToolBar(IToolBarManager toolBarManager)
   {
      delegation.contributeToToolBar(toolBarManager);
   }

   @Override
   public void dispose()
   {
      delegation.dispose();
   }

   @Override
   public IActionBars getActionBars()
   {
      return delegation.getActionBars();
   }

   @Override
   public IWorkbenchPage getPage()
   {
      return delegation.getPage();
   }

   @Override
   public void init(IActionBars bars, IWorkbenchPage page)
   {
      delegation.init(bars, page);
   }

   @Override
   public void init(IActionBars bars)
   {
      delegation.init(bars);
   }
}