/**
 * 
 */
package org.fujaba.sdm.ui.editor;


import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gef.commands.Command;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IBaseLabelProvider;
import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.jface.viewers.TreeNode;
import org.eclipse.jface.viewers.TreeNodeContentProvider;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.fujaba.commons.editor.overviewpage.NestedDiagramsTreeSectionPart;
import org.fujaba.commons.properties.TreeNodeLabelProvider;
import org.storydriven.modeling.activities.OperationExtension;


/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 *
 */
public class SDMTreeSectionPart extends NestedDiagramsTreeSectionPart
{
   private Resource root;

   private SDMTreeSectionPart(SDMEditor editor,
         Composite parent, FormToolkit toolkit)
   {
      super(editor, parent, toolkit);

      // set section data
      getSection().setText("Pattern Specifications contained in this catalog");
   }


   public SDMTreeSectionPart(SDMEditor editor,
         IManagedForm mForm)
   {
      this(editor, mForm.getForm().getBody(), mForm.getToolkit());
   }


   @Override
   protected TreeNode createNode(EObject type, TreeNode parent)
   {
      // create node
      TreeNode node = new TreeNode(type);

      // set the nodes parent
      node.setParent(parent);

      // get children
      List<EObject> children = new ArrayList<EObject>();
      if(type instanceof EPackage)
      {
         EPackage p = (EPackage) type;
         children.addAll(p.getESubpackages());
         children.addAll(p.getEClassifiers());
      }
      else if(type instanceof EClass)
      {
         EClass c = (EClass) type;
         children.addAll(c.getEOperations());
      }

      // create children array
      TreeNode[] childrenNodes = new TreeNode[children.size()];

      // collect the children
      int i = 0;
      for (EObject child : children)
      {
         childrenNodes[i] = createNode(child, node);
         i++;
      }

      // set the children
      node.setChildren(childrenNodes);

      return node;
   }


   @Override
   protected TreeNode[] getInput()
   {
      // create root node list
      List<TreeNode> roots = new ArrayList<TreeNode>();

      
      // go through the patterns
      for (EObject o : root.getContents())
      {
            // add the pattern node
         roots.add(createNode(o, null));
      }

      // set settings
      return roots.toArray(new TreeNode[roots.size()]);
   }


   @Override
   public void notifyChanged(Notification notification)
   {
      // get feature
      Object feature = notification.getFeature();
      if (feature != null)
      {
         // check for changing feature
         refresh();
      }
   }


   @Override
   public boolean setFormInput(Object input)
   {
      if (input instanceof Resource)
      {
         // remove existing listeners
         if (root != null)
         {
            // remove from catalog
            root.eAdapters().remove(this);
         }

         // set new model
         root = (Resource)input;

         // add listeners
         if (!root.eAdapters().contains(this))
         {
            // add to catalog
            root.eAdapters().add(this);
         }

         return true;
      }

      return super.setFormInput(input);
   }


   @Override
   protected Command createAddDiagramCommand(String newName)
   {
      // TODO Auto-generated method stub
      return null;
   }


   @Override
   protected Command createDeleteDiagramCommandFor(EObject diagramRoot)
   {
      // TODO Auto-generated method stub
      return null;
   }


   @Override
   protected void openDiagramFor(EObject diagramRoot)
   {
      EObject[] selected = getSelection();
      for (int i = 0; i < selected.length; i++)
      {
         if (selected[i] instanceof EOperation)
         {
            EOperation eop = (EOperation) selected[i];
            EAnnotation anno = eop.getEAnnotation("http://ns.storydriven.org/extension");
            if(anno != null)
            {
               OperationExtension ext = (OperationExtension) anno.getContents().get(0);
               ((SDMEditor) this.editor).addPageFor(ext.getOwnedActivity());
            }
            else
            {
               MessageDialog.openInformation(this.getManagedForm().getForm().getShell(), "No story diagram found",
                     "The selected EOperation is not formalized by a story diagram.");
            }
         }
      }
   }


   @Override
   protected IBaseLabelProvider getLabelProvider()
   {
      return new TreeNodeLabelProvider(((SDMEditor)this.editor).getEditingDomain().getAdapterFactory());
   }


   @Override
   protected IContentProvider getContentProvider()
   {
      return new TreeNodeContentProvider();
   }
}
