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


import java.util.ArrayList;
import java.util.EventObject;
import java.util.Iterator;
import java.util.List;

import org.eclipse.gef.commands.CommandStack;
import org.eclipse.gef.commands.CommandStackListener;
import org.eclipse.gef.ui.actions.ActionRegistry;
import org.eclipse.gef.ui.actions.EditorPartAction;
import org.eclipse.gef.ui.actions.SelectionAction;
import org.eclipse.gef.ui.actions.StackAction;
import org.eclipse.gef.ui.actions.UpdateAction;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.EditorPart;


/**
 * @author Dietrich Travkin (travkin)
 * @author Last editor: $Author: mvdetten $
 * @version $Revision: 1887 $ $Date: 2009-11-13 14:16:49 +0100 (Fr, 13 Nov 2009) $
 */
public abstract class AbstractSinglePageEditor extends EditorPart
{

   /**
    * The <code>ISelectionListener</code> is listening for selection changed events of this editor
    * and is used to update this editor's <code>EditPart</code> actions.
    */
   private ISelectionListener selectionListener;

   /**
    * The <code>CommandStackListener</code> is listening for this editor's
    * <code>CommandStack</code> changes and is used to update this editor's
    * <code>CommandStack</code> actions.
    */
   private CommandStackListener commandStackListener;

   /**
    * The value of <code>isDirty</code> specifies, whether the editor contents are saved or not.
    */
   private boolean isDirty;

   /**
    * The <code>actionRegistry</code> serves as a container for editor actions.
    */
   private ActionRegistry actionRegistry;

   /**
    * <code>editorActionIDs</code> specify the actions that depend and work on the editor.
    */
   private List<String> editorActionIDs = new ArrayList<String>();

   /**
    * <code>commandStackActionIDs</code> specify the actions that depend and work on the
    * <code>CommandStack</code>.
    */
   private List<String> commandStackActionIDs = new ArrayList<String>();
   
   /**
    * 
    * The value of <code>disposed</code> specifies, whether the editor is disposed or not.
    */
   private boolean disposed = false;

   /**
    * <code>editPartActionIDs</code> specify the actions that depend and work on
    * <code>EditPart</code>s.
    */
   private List<String> editPartActionIDs = new ArrayList<String>();


   /**
    * Adds an <code>EditPart</code> action to the editor.
    * <p>
    * <code>EditPart</code> actions are actions that depend and work on the selected
    * <code>EditPart</code>s.
    * </p>
    * 
    * @param action The <code>EditPart</code> action to add.
    */
   protected void addEditPartAction(SelectionAction action)
   {
      addAction(action);
      this.editPartActionIDs.add(action.getId());
   }


   /**
    * Adds a <code>CommandStack</code> action to this editor.
    * <p>
    * <code>CommandStack</code> actions are actions that depend and work on the
    * <code>CommandStack</code>.
    * </p>
    * 
    * @param action The <code>CommandStack</code> action to add.
    */
   protected void addCommandStackAction(StackAction action)
   {
      addAction(action);
      this.commandStackActionIDs.add(action.getId());
   }


   /**
    * Adds an editor action to this editor.
    * <p>
    * Editor actions are actions that depend and work on the editor.
    * </p>
    * 
    * @param action The object added.
    */
   protected void addEditorAction(EditorPartAction action)
   {
      addAction(action);
      this.editorActionIDs.add(action.getId());
   }


   /**
    * Adds an action to this editor's <code>ActionRegistry</code>.
    * <p>
    * Use the more special methods if possible.
    * </p>
    * 
    * @param action The action to add.
    * @see de.uni_paderborn.fujaba4eclipse.editor.AbstractSinglePageEditor#addCommandStackAction(StackAction)
    * @see de.uni_paderborn.fujaba4eclipse.editor.AbstractSinglePageEditor#addEditPartAction(SelectionAction)
    * @see de.uni_paderborn.fujaba4eclipse.editor.AbstractSinglePageEditor#addEditorAction(EditorPartAction)
    */
   protected void addAction(IAction action)
   {
      getActionRegistry().registerAction(action);
   }


   /**
    * Updates the actions specified by the list of action IDs.
    * <p>
    * The Graphical Editing Framework (GEF) provides a set of default actions (redo, undo, delete,
    * print, save). These actions need some special handling to stay up-to-date with the editor, the
    * <code>CommandStack</code> or the <code>EditPart</code>s. The GEF default actions are not
    * implemented as listeners to some events. Instead, they have to be updated manually, which is
    * done by this method.
    * </p>
    * 
    * @param actionIDs The list of IDs of actions to update
    */
   private void updateActions(List<String> actionIDs)
   {
      for (Iterator<String> ids = actionIDs.iterator(); ids.hasNext();)
      {
         IAction action = getActionRegistry().getAction(ids.next());
         if (action != null && action instanceof UpdateAction)
         {
            ((UpdateAction) action).update();
         }
      }
   }


   /**
    * Updates the editor actions.
    * 
    * @see #updateActions(List)
    */
   protected void updateEditorActions()
   {
      updateActions(this.editorActionIDs);
   }


   /**
    * Updates the <code>EditPart</code> actions.
    * 
    * @see #updateActions(List)
    */
   protected void updateEditPartActions()
   {
      updateActions(this.editPartActionIDs);
   }


   /**
    * Updates the <code>CommandStack</code> actions.
    * 
    * @see #updateActions(List)
    */
   protected void updateCommandStackActions()
   {
      updateActions(this.commandStackActionIDs);
   }


   /**
    * @return the <code>ISelectionListener</code> of this editor
    */
   public ISelectionListener getSelectionListener()
   {
      if (this.selectionListener == null)
      {
         this.selectionListener = createSelectionListener();
      }
      return this.selectionListener;
   }


   /**
    * Creates the editor's <code>ISelectionListener</code>. This method can be overridden by
    * subclasses to add further functionality.
    * <p>
    * The <code>ISelectionListener</code> should call the methods {@link #updateEditPartActions()}in
    * its selectionChanged method to update the <code>EditPart</code> actions.
    * </p>
    * 
    * @return a new <code>ISelectionListener</code> for this editor
    */
   protected ISelectionListener createSelectionListener()
   {
      return new ISelectionListener()
      {
         public void selectionChanged(IWorkbenchPart part, ISelection selection)
         {
            updateEditPartActions();
         }
      };
   }


   public void addSelectionListener(ISelectionListener listener)
   {
      getSite().getWorkbenchWindow().getSelectionService()
            .addSelectionListener(listener);
   }


   public void removeSelectionListener(ISelectionListener listener)
   {
      getSite().getWorkbenchWindow().getSelectionService()
            .removeSelectionListener(listener);
   }


   /**
    * @return the CommandStackListener
    */
   protected CommandStackListener getCommandStackListener()
   {
      if (this.commandStackListener == null)
      {
         this.commandStackListener = this.createCommandStackListener();

      }
      return this.commandStackListener;
   }


   /**
    * Creates the editor's <code>CommandStackListener</code>. This method can be overridden by
    * subclasses to add further functionality.
    * <p>
    * The <code>CommandStackListener</code> should call the methods
    * {@link #updateCommandStackActions()}in its commandStackChanged method to update the
    * <code>CommandStack</code> actions.
    * </p>
    * 
    * @return a new <code>ISelectionListener</code> for this editor
    */
   protected CommandStackListener createCommandStackListener()
   {
      return new CommandStackListener()
      {
         public void commandStackChanged(EventObject event)
         {
            updateCommandStackActions();
            setDirty(getCommandStack().isDirty());
         }
      };
   }


   /**
    * Get the commandStack attribute of the AbstractSinglePageEditor object
    * 
    * @return The commandStack value
    */
   public abstract CommandStack getCommandStack();


   /**
    * @return the ActionRegistry of this editor.
    */
   public ActionRegistry getActionRegistry()
   {
      if (this.actionRegistry == null)
      {
         this.actionRegistry = new ActionRegistry();
      }
      return this.actionRegistry;
   }


   /**
    * @see org.eclipse.ui.IEditorPart#init(org.eclipse.ui.IEditorSite, org.eclipse.ui.IEditorInput)
    * @throws PartInitException Exception description not provided
    */
   @Override
   public void init(IEditorSite site, IEditorInput input)
         throws PartInitException
   {
      // store Site and Input
      setSite(site);
      setInput(input);

      // add selection change listener
      addSelectionListener(getSelectionListener());

      // add CommandStackListener
      getCommandStack().addCommandStackListener(getCommandStackListener());
   }


   /**
    * @see org.eclipse.ui.ISaveablePart#isDirty()
    */
   @Override
   public boolean isDirty()
   {
      return this.isDirty;
   }


   /**
    * Sets the dirty attribute of the editor.
    * 
    * @param dirty The new dirty value
    * @see org.eclipse.ui.ISaveablePart#isDirty()
    */
   public final void setDirty(boolean dirty)
   {
      if (this.isDirty != dirty)
      {
         this.isDirty = dirty;
         firePropertyChange(IEditorPart.PROP_DIRTY);
      }
   }


   /**
    * @see org.eclipse.ui.IWorkbenchPart#dispose()
    */
   @Override
   public void dispose()
   {
	  disposed = true;
	  
      // dispose the ActionRegistry (will dispose all actions)
      getActionRegistry().dispose();

      // remove selection listener
      removeSelectionListener(this.getSelectionListener());

      // remove CommandStackListener
      getCommandStack().removeCommandStackListener(getCommandStackListener());

      // important
      super.dispose();
   }


   /**
    * @see org.eclipse.core.runtime.IAdaptable#getAdapter(java.lang.Class)
    */
   @Override
   public Object getAdapter(@SuppressWarnings("rawtypes") Class adapter)
   {
      if (adapter == ActionRegistry.class)
      {
         return getActionRegistry();
      }

      if (adapter == CommandStack.class)
      {
         return getCommandStack();
      }

      // super implementation handles the rest
      return super.getAdapter(adapter);
   }


   /**
    * This method has the same behaviour as <code>WorkbenchPart.firePropertyChange</code> and
    * additionally updates the editor actions.
    * 
    * @see org.eclipse.ui.part.WorkbenchPart#firePropertyChange(int)
    * @see de.uni_paderborn.fujaba4eclipse.editor.AbstractSinglePageEditor#updateActions(List)
    */
   @Override
   protected void firePropertyChange(int propertyID)
   {
      super.firePropertyChange(propertyID);
      updateActions(this.editorActionIDs);
   }

   /**
	 * This method indicates whether the editor is disposed or not.
	 */
	public boolean isDisposed()
	{
		return disposed;
	}
}
