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


import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.ConnectionLayer;
import org.eclipse.draw2d.FigureCanvas;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.DefaultEditDomain;
import org.eclipse.gef.EditDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.GraphicalViewer;
import org.eclipse.gef.KeyHandler;
import org.eclipse.gef.KeyStroke;
import org.eclipse.gef.LayerConstants;
import org.eclipse.gef.RootEditPart;
import org.eclipse.gef.commands.CommandStack;
import org.eclipse.gef.dnd.TemplateTransferDragSourceListener;
import org.eclipse.gef.dnd.TemplateTransferDropTargetListener;
import org.eclipse.gef.editparts.ScalableFreeformRootEditPart;
import org.eclipse.gef.editparts.ZoomManager;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.requests.CreationFactory;
import org.eclipse.gef.requests.SimpleFactory;
import org.eclipse.gef.ui.actions.ActionRegistry;
import org.eclipse.gef.ui.actions.DeleteAction;
import org.eclipse.gef.ui.actions.PrintAction;
import org.eclipse.gef.ui.actions.RedoAction;
import org.eclipse.gef.ui.actions.SaveAction;
import org.eclipse.gef.ui.actions.UndoAction;
import org.eclipse.gef.ui.actions.ZoomInAction;
import org.eclipse.gef.ui.actions.ZoomOutAction;
import org.eclipse.gef.ui.palette.FlyoutPaletteComposite;
import org.eclipse.gef.ui.palette.PaletteViewer;
import org.eclipse.gef.ui.palette.PaletteViewerProvider;
import org.eclipse.gef.ui.parts.GraphicalEditor;
import org.eclipse.gef.ui.parts.GraphicalViewerKeyHandler;
import org.eclipse.gef.ui.parts.ScrollingGraphicalViewer;
import org.eclipse.gef.ui.parts.SelectionSynchronizer;
import org.eclipse.gef.ui.views.palette.PaletteViewerPage;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.commands.ActionHandler;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.util.TransferDropTargetListener;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.dialogs.SaveAsDialog;
import org.eclipse.ui.handlers.IHandlerService;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.PropertySheetPage;
import org.fujaba.commons.FujabaCommonsPlugin;
import org.fujaba.commons.editor.palette.PaletteFactory;
import org.fujaba.commons.editor.palette.util.PaletteRootPreferenceUtil;
import org.fujaba.commons.extensionpoints.IPaletteExtension;
import org.fujaba.commons.extensionpoints.util.ExtensionpointTools;
import org.fujaba.commons.notation.HierarchicalNode;
import org.fujaba.commons.views.OverviewOutlinePage;



/**
 * @author OliverRohe
 * @author Last editor: $Author: oleg82 $
 * @version $Revision: 1924 $ $Date: 2010-06-29 16:49:42 +0200 (Di, 29 Jun 2010) $
 */
public abstract class AbstractSimpleEditorPart extends AbstractSinglePageEditor
      implements PropertyChangeListener
{

   private DefaultEditDomain editDomain;

   private CommandStack commandStack;

   private GraphicalViewer graphicalViewer;

   private PaletteRoot paletteRoot;

   protected EditPartFactory editPartFactory;

   private DefaultContextMenuProvider contextMenuProvider;

   private HierarchicalNode diagram;

   private EObject diagramModel;

   private CTabItem ctabItem;

   private PaletteViewerProvider provider;

   private FlyoutPaletteComposite splitter;

   private SelectionSynchronizer synchronizer;
   
   private OverviewOutlinePage overviewOutlinePage;


   public String getId()
   {
      return getClass().getName();
   }


   /**
    * @see org.eclipse.ui.IEditorPart#init(org.eclipse.ui.IEditorSite, org.eclipse.ui.IEditorInput)
    */
   @Override
   public void init(IEditorSite site, IEditorInput input)
         throws PartInitException
   {
      // important
      super.init(site, input);

      // initialize Actions
      createActions();

      // create EditPartFactory
      createEditPartFactory();
   }


   /**
    * Implement this method to provide an edit part factory.
    */
   protected abstract void createEditPartFactory();


   /**
    * Create the Actions for the UMLClassDiagramEditor.
    */
   protected void createActions()
   {
      addCommandStackAction(new UndoAction(this));
      addCommandStackAction(new RedoAction(this));
      addEditPartAction(new DeleteAction((IWorkbenchPart) this));
      addEditorAction(new SaveAction(this));
      addAction(new PrintAction(this));
   }


   /**
    * @see org.eclipse.ui.ISaveablePart#isSaveAsAllowed()
    */
   @Override
   public boolean isSaveAsAllowed()
   {
      return true;
   }


   protected void createGraphicalViewer(Composite parent)
   {
      GraphicalViewer viewer = new ScrollingGraphicalViewer();
      viewer.createControl(parent);
      setGraphicalViewer(viewer);
      configureGraphicalViewer();
      hookGraphicalViewer();
      initializeGraphicalViewer();
   }


   /**
    * Hooks the GraphicalViewer to the rest of the Editor. By default, the viewer is added to the
    * SelectionSynchronizer, which can be used to keep 2 or more EditPartViewers in sync. The viewer
    * is also registered as the ISelectionProvider for the Editor's PartSite.
    */
   protected void hookGraphicalViewer()
   {
      getSelectionSynchronizer().addViewer(getGraphicalViewer());
      getSite().setSelectionProvider(getGraphicalViewer());
   }


   protected void setGraphicalViewer(GraphicalViewer viewer)
   {
      getEditDomain().addViewer(viewer);
      this.graphicalViewer = viewer;
   }


   /**
    * Returns the selection syncronizer object. The synchronizer can be used to sync the selection
    * of 2 or more EditPartViewers.
    */
   protected SelectionSynchronizer getSelectionSynchronizer()
   {
      if (this.synchronizer == null)
      {
         this.synchronizer = new SelectionSynchronizer();
      }
      return this.synchronizer;
   }


   /**
    * Creates a new <code>ScalableFreeformRootEditPart</code> for this editor. This method is called
    * by {@link #configureGraphicalViewer()} and can be overriden by subclasses to add/change
    * functionality of the <code>ScalableFreeformRootEditPart</code>.
    * 
    * @return the new <code>ScalableFreeformRootEditPart</code>
    */
   protected ScalableFreeformRootEditPart createRootEditPart()
   {
      return new ScalableFreeformRootEditPart();
   }


   protected void configureGraphicalViewer()
   {
      GraphicalViewer graphicalViewer = getGraphicalViewer();

      // configure the GraphicalViewer
      graphicalViewer.getControl().setBackground(ColorConstants.white);

      ScalableFreeformRootEditPart root = createRootEditPart();

      // Enable anti-aliasing for connection lines
      ConnectionLayer connectionLayer = (ConnectionLayer) root
            .getLayer(LayerConstants.CONNECTION_LAYER);
      connectionLayer.setAntialias(SWT.ON);

      List<String> zoomLevels = new ArrayList<String>(3);
      zoomLevels.add(ZoomManager.FIT_ALL);
      zoomLevels.add(ZoomManager.FIT_WIDTH);
      zoomLevels.add(ZoomManager.FIT_HEIGHT);
      root.getZoomManager().setZoomLevelContributions(zoomLevels);

      IAction zoomIn = new ZoomInAction(root.getZoomManager());
      IAction zoomOut = new ZoomOutAction(root.getZoomManager());
      getActionRegistry().registerAction(zoomIn);
      getActionRegistry().registerAction(zoomOut);
      IHandlerService service = (IHandlerService) getEditorSite().getService(
            IHandlerService.class);
      service.activateHandler(zoomIn.getActionDefinitionId(),
            new ActionHandler(zoomIn));
      service.activateHandler(zoomOut.getActionDefinitionId(),
            new ActionHandler(zoomOut));

      graphicalViewer.setRootEditPart(root);

      getEditDomain().addViewer(graphicalViewer);

      // activate the viewer as selection provider for Eclipse
      getSite().setSelectionProvider(graphicalViewer);

      // initialize the viewer with input
      graphicalViewer.setEditPartFactory(getEditPartFactory());
      graphicalViewer.setContents(getDiagram());

      this.contextMenuProvider = createContextMenuProvider(graphicalViewer,
            getActionRegistry());
      graphicalViewer.setContextMenu(this.contextMenuProvider);
      getSite().registerContextMenu(getId(), this.contextMenuProvider,
            graphicalViewer);
      configureContextMenu(this.contextMenuProvider);

      graphicalViewer.setKeyHandler(new GraphicalViewerKeyHandler(
            graphicalViewer).setParent(getSharedKeyHandler()));

      // If you don't put this line, then moving figures by drag & drop
      // above the left or top limit of the editor window will lead to
      // an infinite loop!
      ((FigureCanvas) graphicalViewer.getControl())
            .setScrollBarVisibility(FigureCanvas.ALWAYS);
   }


   protected DefaultContextMenuProvider createContextMenuProvider(
         GraphicalViewer graphicalViewer, ActionRegistry actionRegistry)
   {
      return new DefaultContextMenuProvider(graphicalViewer, actionRegistry);
   }


   /**
    * Override this method to add additional actions to the context menu. Note that the actions must
    * be registered at the action registry of this editor.
    * 
    * @param contextMenuProvider The context menu provider object used by this editor
    */
   protected void configureContextMenu(
         DefaultContextMenuProvider contextMenuProvider)
   {
   }

   protected KeyHandler sharedKeyHandler;


   protected KeyHandler getSharedKeyHandler()
   {
      if (this.sharedKeyHandler == null)
      {
         this.sharedKeyHandler = new KeyHandler();
         this.sharedKeyHandler.put(KeyStroke.getPressed(SWT.DEL, 127, 0),
               getActionRegistry().getAction(ActionFactory.DELETE.getId()));
      }
      return this.sharedKeyHandler;
   }


   /**
    * @return this editor's EditPartFactory
    */
   protected EditPartFactory getEditPartFactory()
   {
      if (this.editPartFactory == null)
      {
         createEditPartFactory();
      }
      return this.editPartFactory;
   }


   public EditPart getEditPartOfFElement(EObject element)
   {
      return (EditPart) getGraphicalViewer().getEditPartRegistry().get(element);
   }


   public HierarchicalNode getDiagram()
   {
      return this.diagram;
   }


   public void setDiagram(HierarchicalNode diagram)
   {
      this.diagram = diagram;
      this.setDiagramModel(diagram.getModel());
      
      setPartName(getEditorName());
      
      if (this.getGraphicalViewer() != null)
      {
         this.getGraphicalViewer().setContents(diagram);
      }
   }


   protected String getEditorName()
   {
      String name = "Name: ";
      if(diagram.getModel() instanceof ENamedElement)
      {
         ENamedElement elem = (ENamedElement) diagram.getModel();
         name += elem.getName();
      }
      else
      {
         name += "N/A";
      }
      return name;
   }


   public EObject getDiagramModel()
   {
      return this.diagramModel;
   }


   public void setDiagramModel(EObject model)
   {
      this.diagramModel = model;
   }


   /**
    * @return The EditDomain used by this UMLClassDiagramEditor
    */
   public EditDomain getEditDomain()
   {
      if (this.editDomain == null)
      {
         this.editDomain = new DefaultEditDomain(this);

         setEditDomain(this.editDomain);
         // important for the case, that this editor is running in a
         // MultiPageEditor
         // otherwise the editor's dirty state is not properly actualized.
         this.editDomain.setCommandStack(getCommandStack());
      }
      return this.editDomain;
   }


   protected void setEditDomain(DefaultEditDomain ed)
   {
      this.editDomain = ed;
      getEditDomain().setPaletteRoot(getPaletteRoot());
   }


   /**
    * @see de.uni_paderborn.fujaba4eclipse.editor.AbstractSinglePageEditor#getCommandStack()
    */
   @Override
   public CommandStack getCommandStack()
   {
      if (this.commandStack != null)
      {
         return this.commandStack;
      }

      return getEditDomain().getCommandStack();
   }


   public GraphicalViewer getGraphicalViewer()
   {
      return this.graphicalViewer;
   }


   protected DefaultContextMenuProvider getContextMenuProvider()
   {
      return this.contextMenuProvider;
   }


   /**
    * @see org.eclipse.core.runtime.IAdaptable#getAdapter(java.lang.Class)
    */
   @Override
   public Object getAdapter(@SuppressWarnings("rawtypes") Class adapter)
   {
      // we need to handle common GEF elements we created
      if (adapter == GraphicalViewer.class || adapter == EditPartViewer.class)
      {
         return getGraphicalViewer();
      }

      if (adapter == EditDomain.class)
      {
         return getEditDomain();
      }

      if (adapter == ZoomManager.class)
      {
         return ((ScalableFreeformRootEditPart) getGraphicalViewer()
               .getRootEditPart()).getZoomManager();
      }

      if (adapter == IPropertySheetPage.class)
      {
         return getPropertySheetPage();
      }
      
      if (adapter == IContentOutlinePage.class)
      {
         return getOverviewOutlinePage();
      }
      // the super implementation handles the rest
      return super.getAdapter(adapter);
   }

   protected PropertySheetPage propertySheetPage;


   /**
    * Returns the undoable <code>PropertySheetPage</code> for this editor.
    * 
    * @return the undoable <code>PropertySheetPage</code>
    */
   protected IPropertySheetPage getPropertySheetPage()
   {
      if (null == this.propertySheetPage)
      {
         this.propertySheetPage = new PropertySheetPage();
         this.propertySheetPage
               .setRootEntry(new org.eclipse.gef.ui.properties.UndoablePropertySheetEntry(
                     getCommandStack()));
      }
      return this.propertySheetPage;
   }


   public IFile getEditorInputFile()
   {
      if(getEditorInput() instanceof IFileEditorInput)
      {
         ((IFileEditorInput) super.getEditorInput()).getFile();
      }
      return null;
   }


   protected abstract void performSaveAs(IFile file);


   @Override
   public void doSave(IProgressMonitor monitor)
   {
      performSaveAs(this.getEditorInputFile());
      getCommandStack().markSaveLocation();
   }


   /**
    * @see org.eclipse.ui.ISaveablePart#doSaveAs()
    */
   @Override
   public void doSaveAs()
   {
      SaveAsDialog dialog = new SaveAsDialog(getSite().getWorkbenchWindow()
            .getShell());
      dialog.setOriginalFile(getEditorInputFile());
      dialog.open();
      IPath path = dialog.getResult();

      if (path == null)
      {
         return;
      }

      IWorkspace workspace = ResourcesPlugin.getWorkspace();
      final IFile file = workspace.getRoot().getFile(path);

      WorkspaceModifyOperation op = new WorkspaceModifyOperation()
      {
         @Override
         public void execute(final IProgressMonitor monitor)
               throws CoreException
         {
            performSaveAs(file);
         }
      };

      try
      {
         new ProgressMonitorDialog(getSite().getWorkbenchWindow().getShell())
               .run(false, true, op);
         setInput(new FileEditorInput(file));
         getCommandStack().markSaveLocation();
      }
      catch (InvocationTargetException e)
      {
         FujabaCommonsPlugin.getDefault().logError(e.getMessage(), e);
      }
      catch (InterruptedException e)
      {
         FujabaCommonsPlugin.getDefault().logError(e.getMessage(), e);
      }

      getCommandStack().markSaveLocation();
   }


   /**
    * @see org.eclipse.ui.part.WorkbenchPart#setFocus()
    */
   @Override
   public void setFocus()
   {
      GraphicalViewer gv = getGraphicalViewer();
      if (gv != null)
      {
         gv.getControl().setFocus();
      }
   }


   public void setCTabItem(CTabItem ctabItem)
   {
      this.ctabItem = ctabItem;
   }


   public CTabItem getCTabItem()
   {
      return ctabItem;
   }


   /**
    * Runs the editor's event handling asynchronously. An editor's event handling should be
    * implemented in the <code>propertyChangeImpl(PropertyChangeEvent 
    * event)<code> method.
    * 
    * @see java.beans.PropertyChangeListener#propertyChange(java.beans.PropertyChangeEvent)
    */
   public final void propertyChange(final PropertyChangeEvent event)
   {
      Display display = Display.getCurrent();
      if (display == null)
      {
         display = Display.getDefault();
      }
      if (display != null)
      {
         display.asyncExec(new Runnable()
         {
            public void run()
            {
               if (!AbstractSimpleEditorPart.this.isDisposed())
               {
                  propertyChangeImpl(event);
               }
            }
         });
      }
   }


   /**
    * Refreshes the name in the <code>CTabItem</code> of the <code>MainEditor</code> after a change
    * of the diagrams name. Override this method to customize property change behavior.
    */
   public void propertyChangeImpl(PropertyChangeEvent evt)
   {
      if ("name".equals(evt.getPropertyName()))
      {
         if (getCTabItem() != null && !getCTabItem().isDisposed())
         {
            String name = getEditorName();
            getCTabItem().setToolTipText(name);
            getCTabItem().setText(name);
         }
      }
   }


   protected PaletteRoot getPaletteRoot()
   {
      if (this.paletteRoot == null)
      {
         createPalette();
      }
      return this.paletteRoot;
   }


   protected void setPaletteRoot(PaletteRoot value)
   {
      this.paletteRoot = value;
   }


   /**
    * Returns the palette viewer provider that is used to create palettes for the view and the
    * flyout. Creates one if it doesn't already exist.
    * 
    * @return the PaletteViewerProvider that can be used to create PaletteViewers for this editor
    * @see #createPaletteViewerProvider()
    */
   protected final PaletteViewerProvider getPaletteViewerProvider()
   {
      if (this.provider == null)
      {
         this.provider = createPaletteViewerProvider();
      }
      return this.provider;
   }


   // TODO is this necessary in EMF?
   /**
    * Create a transfer drop target listener. When using a CombinedTemplateCreationEntry tool in the
    * palette, this will enable model element creation by dragging from the palette.
    * 
    * @see #createPaletteViewerProvider()
    */
   private TransferDropTargetListener createTransferDropTargetListener()
   {
      return new TemplateTransferDropTargetListener(getGraphicalViewer())
      {
         @Override
         protected CreationFactory getFactory(Object template)
         {
            // by default usage of the 'palettes'-extensionpoint, the template is a FFactoryAdapter
            if (template instanceof CreationFactory)
            {
               return (CreationFactory) template;
            }
            // if (template instanceof Class<?>)
            // {
            // return new FFactoryAdapter(getDiagram().getProject(), (Class<?>) template);
            // }
            return new SimpleFactory(null);
         }
      };
   }


   protected void initializeGraphicalViewer()
   {
      GraphicalViewer graphicalViewer = getGraphicalViewer();
      this.splitter.hookDropTargetListener(graphicalViewer);

      // listen for dropped parts
      graphicalViewer.addDropTargetListener(createTransferDropTargetListener());
   }


   protected abstract Image createEditorImage();


   /**
    * Creates the palette as defined via the {@link IPaletteExtension}point in the manifest
    * (plugin.xml).
    */
   protected void createPalette()
   {
      // search the palette defined for this editor
      String editorClass = getClass().getName();
      IExtensionRegistry registry = Platform.getExtensionRegistry();
      IConfigurationElement[] elements = registry
            .getConfigurationElementsFor(IPaletteExtension.PALETTE_EXTENSION_POINT_ID);
      IConfigurationElement elem = null;
      for (IConfigurationElement element : elements)
      {
         if (editorClass.equals(element.getAttribute("editor")))
         {
            elem = element;
            break;
         }
      }
      // else use deprecated diagramPaletteDrawers-extensionpoint
      if (elem == null)
      {
         // Todo use proper logging mechanism
         FujabaCommonsPlugin
               .getDefault()
               .logWarning(
                     "WARNING: editor '"
                           + editorClass
                           + "' doesn't use "
                           + "the 'palettes'-extensionpoint to define the palette. Please "
                           + "update the editor to use the 'palettes'-extensionpoint.");
         return;
      }
      // create the palette factory
      IPaletteExtension factory = ExtensionpointTools
            .<IPaletteExtension> createFactory(elem, "factory",
                  PaletteFactory.class);
      if (factory == null)
      {
         return;
      }
      // create and set the palette
      PaletteRoot palette = factory.createPalette();
      setPaletteRoot(palette);
   }


   /**
    * @see GraphicalEditor#createPartControl(Composite)
    */
   @Override
   public void createPartControl(Composite parent)
   {
      this.splitter = new FlyoutPaletteComposite(parent, SWT.NONE, getSite()
            .getPage(), getPaletteViewerProvider(), PaletteRootPreferenceUtil
            .getPreferences());
      createGraphicalViewer(this.splitter);
      this.splitter.setGraphicalControl(getGraphicalViewer().getControl());

      setTitleImage(createEditorImage());
   }


   protected PaletteViewerProvider createPaletteViewerProvider()
   {
      return new PaletteViewerProvider(getEditDomain())
      {
         /**
          * @see org.eclipse.gef.ui.palette.PaletteViewerProvider#configurePaletteViewer(org.eclipse.gef.ui.palette.PaletteViewer)
          */
         @Override
         protected void configurePaletteViewer(PaletteViewer viewer)
         {
            super.configurePaletteViewer(viewer);
            // create a drag source listener for this palette viewer
            // together with an appropriate transfer drop target listener,
            // this will enable
            // model element creation by dragging a
            // CombinatedTemplateCreationEntries
            // from the palette into the editor
            // @see ShapesEditor#createTransferDropTargetListener()
            viewer
                  .addDragSourceListener(new TemplateTransferDragSourceListener(
                        viewer));
         }
      };
   }

   protected OverviewOutlinePage getOverviewOutlinePage()
   {
      if (this.overviewOutlinePage == null && getGraphicalViewer() != null)
      {
         RootEditPart rootEditPart = getGraphicalViewer().getRootEditPart();
         if (rootEditPart instanceof ScalableFreeformRootEditPart)
         {
            this.overviewOutlinePage = new OverviewOutlinePage(
                  (ScalableFreeformRootEditPart) rootEditPart);
         }
      }
      return this.overviewOutlinePage;
   }
   


   /**
    * A custom PalettePage that helps GraphicalEditorWithFlyoutPalette keep the two PaletteViewers
    * (one displayed in the editor and the other displayed in the PaletteView) in sync when
    * switching from one to the other (i.e., it helps maintain state across the two viewers).
    * 
    * @author Pratik Shah
    * @version $Revision: 1924 $ $Date: 2010-06-29 16:49:42 +0200 (Di, 29 Jun 2010) $
    * @since 3.0
    */
   protected class CustomPalettePage extends PaletteViewerPage
   {
      public CustomPalettePage(PaletteViewerProvider provider)
      {
         super(provider);
      }


      /**
       * @see org.eclipse.ui.part.IPage#createControl(org.eclipse.swt.widgets.Composite)
       */
      @Override
      public void createControl(Composite parent)
      {
         super.createControl(parent);
         if (splitter != null)
         {
            splitter.setExternalViewer(this.viewer);
         }
      }


      /**
       * @see org.eclipse.ui.part.IPage#dispose()
       */
      @Override
      public void dispose()
      {
         if (splitter != null)
         {
            splitter.setExternalViewer(null);
         }
         super.dispose();
      }


      /**
       * @return the PaletteViewer created and displayed by this page
       */
      public PaletteViewer getPaletteViewer()
      {
         return this.viewer;
      }
   }
}
