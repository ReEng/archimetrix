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
package org.fujaba.commons.views;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.part.Page;
import org.eclipse.ui.part.PageBook;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;


/**
 * @author    $Author: l3_g5 $
 * @version   $Revision: 1170 $ $Date: 2006-11-16 18:07:01 +0100 (Do, 16 Nov 2006) $
 */
public class MultiOverviewOutlinePage extends Page implements IContentOutlinePage
{
   /**
    * No comment provided by developer, please add a comment to improve documentation.
    */
   private PageBook pageBook;
   /**
    * No comment provided by developer, please add a comment to improve documentation.
    */
   private IContentOutlinePage activePage;


   /**
    * No comment provided by developer, please add a comment to improve documentation.
    *
    * @param parent  No description provided
    */
   @Override
   public void createControl (Composite parent)
   {
      pageBook = new PageBook (parent, SWT.NONE);
      if (activePage != null)
      {
         setActivePage (activePage);
      }
   }


   /**
    * No comment provided by developer, please add a comment to improve documentation.
    */
   @Override
   public void dispose()
   {
      if (pageBook != null)
      {
         pageBook.dispose();
      }
   }


   /**
    * Get the control attribute of the MultiOverviewOutlinePage object
    *
    * @return   The control value
    */
   @Override
   public Control getControl()
   {
      return pageBook;
   }


   /**
    * Sets the focus attribute of the MultiOverviewOutlinePage object
    */
   @Override
   public void setFocus()
   {
      if (activePage != null)
      {
         activePage.setFocus();
      }
   }


   /**
    * Sets the activePage attribute of the MultiOverviewOutlinePage object
    *
    * @param page  The new activePage value
    */
   public void setActivePage (IContentOutlinePage page)
   {
      this.activePage = page;
      if (pageBook == null)
      {
         return;
      }

      Control control = page.getControl();
      if (control == null || control.isDisposed())
      {
         // first time
         page.createControl (pageBook);
         control = page.getControl();
      }
      pageBook.showPage (control);
   }


   /**
    * Sets the defaultPageActive attribute of the MultiOverviewOutlinePage object
    */
   public void setDefaultPageActive()
   {
      if (this.activePage != null)
      {
         this.activePage.dispose();
         this.activePage = null;
      }
   }


   /**
    * Access method for a To N-association.
    *
    * @param listener  The object added.
    */
   public void addSelectionChangedListener (ISelectionChangedListener listener)
   {
   }


   /**
    * Get the selection attribute of the MultiOverviewOutlinePage object
    *
    * @return   The selection value
    */
   public ISelection getSelection()
   {
      return null;
   }


   /**
    * No comment provided by developer, please add a comment to improve documentation.
    *
    * @param listener  No description provided
    */
   public void removeSelectionChangedListener (ISelectionChangedListener listener)
   {
   }


   /**
    * Sets the selection attribute of the MultiOverviewOutlinePage object
    *
    * @param selection  The new selection value
    */
   public void setSelection (ISelection selection)
   {
   }
}

/*
 * $Log$
 * Revision 1.4  2006/11/16 17:07:01  l3_g5
 * improved support for swing diagrams
 *
 * Revision 1.3  2006/05/22 17:11:51  travkin
 * Removed most compile warnings.
 *
 * Revision 1.2  2006/04/11 17:07:11  travkin
 * Changed some javadoc comments.
 *
 */
