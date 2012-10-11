package org.fujaba.sdm.ui.editor;

import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.gef.commands.CommandStack;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.views.properties.PropertySheetPage;
import org.fujaba.commons.editor.AbstractSimpleEditorPart;
import org.fujaba.commons.editor.NestedEObjectEditorInput;
import org.fujaba.commons.notation.HierarchicalNode;
import org.fujaba.commons.notation.NotationFactory;
import org.fujaba.sdm.ui.edit.parts.SDMEditPartFactory;
import org.storydriven.modeling.activities.Activity;


public class SDMActivityPage extends AbstractSimpleEditorPart implements IEditingDomainProvider
{
   private SDMEditor parentEditor;

   public SDMActivityPage(SDMEditor parent)
   {
      super();
      this.parentEditor = parent;
   }

   
   @Override
   public Object getAdapter(Class adapter)
   {
      if (adapter.equals(IEditingDomainProvider.class))
      {
         return this;
      }
      return super.getAdapter(adapter);
   }
   
   
   @Override
   public CommandStack getCommandStack()
   {
      return parentEditor.getCommandStack();
   }
   

   @Override
   public EditingDomain getEditingDomain()
   {
      return this.parentEditor.getEditingDomain();
   }


   @Override
   protected void createEditPartFactory()
   {
      this.editPartFactory = new SDMEditPartFactory();
   }


   @Override
   protected Image createEditorImage()
   {
      return ImageDescriptor.getMissingImageDescriptor().createImage();
   }


   @Override
   protected void performSaveAs(IFile file)
   {
      // TODO Auto-generated method stub
      
   }

   @Override
   protected void setInput(IEditorInput input)
   {
      setInputWithNotify(input);
      if (input instanceof NestedEObjectEditorInput)
      {
         NestedEObjectEditorInput pseInput = (NestedEObjectEditorInput) input;
         
         Activity activity = (Activity) pseInput.getModel();
         Iterator<EObject> i = parentEditor.getDiagramResource().getContents().iterator();
         while(i.hasNext())
         {
            EObject o = i.next();
            if(o instanceof HierarchicalNode)
            {
               HierarchicalNode node = (HierarchicalNode) o;
               if(node.getModel() == activity)
               {
                  this.setDiagram(node);
                  break;
               }
            }
         }
         
         if(this.getDiagram() == null)
         {
            DiagramInitializer initializer = new DiagramInitializer(activity);
            this.setDiagram(initializer.init());
            parentEditor.getDiagramResource().getContents().add(this.getDiagram());
         }
      }

      setPartName(input.getName());
   }
   
   /**
    * Customized, such that we can use the generated EMF.edit item providers and do not need to care
    * for manual property specification.
    * 
    * @see org.fujaba.commons.editor.AbstractSimpleEditorPart#getPropertySheetPage()
    */
   @Override
   protected PropertySheetPage getPropertySheetPage()
   {
      return this.parentEditor.getPropertySheetPage();
   }


   @Override
   public Activity getDiagramModel()
   {
      return (Activity) super.getDiagramModel();
   }
}
