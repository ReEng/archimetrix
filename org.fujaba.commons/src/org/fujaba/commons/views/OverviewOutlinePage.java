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

import org.eclipse.draw2d.LightweightSystem;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.Viewport;
import org.eclipse.draw2d.parts.ScrollableThumbnail;
import org.eclipse.draw2d.parts.Thumbnail;
import org.eclipse.gef.LayerConstants;
import org.eclipse.gef.editparts.ScalableFreeformRootEditPart;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.part.Page;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;


/**
 * <p>
 * This is the implementation of an outline page containing a thumbnail of a root EditPart,
 * e.g. the root EditPart of a diagram editor. The thumbnail of this page is updated automatically.
 * </p>
 * <p>
 * Subclass may override some methods to add behaviour.
 * </p>
 * 
 * @author    DietrichTravkin
 * @author    Last Editor: $Author: travkin $
 * @version   $Revision: 1034 $ $Date: 2006-05-26 19:20:23 +0200 (Fr, 26 Mai 2006) $
 */
public class OverviewOutlinePage extends Page implements IContentOutlinePage
{
   private Canvas overview;
   private ScalableFreeformRootEditPart rootEditPart;
   private Thumbnail thumbnail;


   /**
    * Creates this outline page.
    *
    * @param rootEditPart  the root EditPart for the outline page
    */
   public OverviewOutlinePage (ScalableFreeformRootEditPart rootEditPart)
   {
      super();
      this.rootEditPart = rootEditPart;
   }


   /**
    * Creates the control of this outline page. 
    * 
    * @param parent  the parent {@link Composite}
    * 
    * @see org.eclipse.ui.part.IPage#createControl(org.eclipse.swt.widgets.Composite)
    */
   @Override
   public void createControl (Composite parent)
   {
      this.overview = new Canvas (parent, SWT.NONE);
      LightweightSystem lws = new LightweightSystem (this.overview);

      this.thumbnail = new ScrollableThumbnail ((Viewport) this.rootEditPart.getFigure());
      this.thumbnail.setBorder (new MarginBorder (3));
      this.thumbnail.setSource (this.rootEditPart.getLayer (LayerConstants.PRINTABLE_LAYERS));
      lws.setContents (this.thumbnail);
   }


   /**
    * Disposes this outline page.
    * 
    * @see org.eclipse.ui.part.IPage#dispose()
    */
   @Override
   public void dispose()
   {
      if (this.thumbnail != null)
      {
         this.thumbnail.deactivate();
      }
      super.dispose();
   }


   /**
    * Returns this outline page's {@link Canvas} containing the Thumbnail of the root EditPart.
    * 
    * @return   this outline page's {@link Canvas}
    * 
    * @see org.eclipse.ui.part.IPage#getControl()
    */
   @Override
   public Control getControl()
   {
      return this.overview;
   }


   /**
    * Does nothing. This method can be overriden to add actions to the given action bars.
    * 
    * @param actionBars  the action bars where the action are to be added to
    * 
    * @see org.eclipse.ui.part.IPage#setActionBars(org.eclipse.ui.IActionBars)
    */
   @Override
   public void setActionBars (IActionBars actionBars)
   {
   }


   /**
    * Tries to set focus to this page's {@link Control}.
    * 
    * @see org.eclipse.ui.part.IPage#setFocus()
    */
   @Override
   public void setFocus()
   {
      if (this.getControl() != null)
      {
         this.getControl().setFocus();
      }
   }


   /**
    * Does nothing. Adding {@link ISelectionChangedListener}s is not supported.
    * 
    * @param listener  the {@link ISelectionChangedListener} to add
    * 
    * @see org.eclipse.jface.viewers.ISelectionProvider#addSelectionChangedListener(org.eclipse.jface.viewers.ISelectionChangedListener)
    */
   public void addSelectionChangedListener (ISelectionChangedListener listener)
   {
   }


   /**
    * Returns the empty selection.
    * 
    * @return the empty selection
    * 
    * @see org.eclipse.jface.viewers.ISelectionProvider#getSelection()
    */
   public ISelection getSelection()
   {
      return StructuredSelection.EMPTY;
   }


   /**
    * Does nothing. Adding and removing {@link ISelectionChangedListener}s is not supported.
    * 
    * @param listener  the {@link ISelectionChangedListener} to remove
    * 
    * @see org.eclipse.jface.viewers.ISelectionProvider#removeSelectionChangedListener(org.eclipse.jface.viewers.ISelectionChangedListener)
    */
   public void removeSelectionChangedListener (ISelectionChangedListener listener)
   {
   }


   /**
    * Does nothing. This page has nothing selectable.
    * 
    * @param selection  the new selection
    * 
    * @see org.eclipse.jface.viewers.ISelectionProvider#setSelection(org.eclipse.jface.viewers.ISelection)
    */
   public void setSelection (ISelection selection)
   {
   }
}

/*
 * $Log$
 * Revision 1.3  2006/05/26 17:20:22  travkin
 * Added some javadoc comments.
 *
 * Revision 1.2  2006/05/20 16:08:16  travkin
 * Removed some compile warnings.
 *
 * Revision 1.1  2006/02/15 18:34:21  mm
 * renamed plugin to Commons4Eclipse
 *
 * Revision 1.2  2005/11/23 14:02:34  mm
 * organized imports
 *
 * Revision 1.1  2005/10/17 10:46:18  l3_g5
 * property source moved to app independent and uses extension points now
 *
 * Revision 1.4  2005/08/12 09:39:31  mm
 * FujabaForEclipse runs in Eclipse 3.1 now
 *
 */
