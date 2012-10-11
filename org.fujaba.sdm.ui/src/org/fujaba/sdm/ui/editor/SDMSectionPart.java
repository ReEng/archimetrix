package org.fujaba.sdm.ui.editor;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.gef.commands.Command;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.fujaba.commons.editor.overviewpage.NestedDiagramsSectionPart;
import org.fujaba.sdm.ui.SdmUiPlugin;
import org.storydriven.modeling.activities.OperationExtension;


public class SDMSectionPart extends NestedDiagramsSectionPart
{
   
   private EPackage pack;
   private final static String SECTION_NAME = "Pattern specifications belonging to this catalog";
   private final static String DELETE_CONFIRM_QUESTION = "Do you really want to delete this pattern specification?";
   private final static String CHOOSE_A_NAME_MESSAGE = "Choose a name for the new pattern specification.";
   private final static String DEFAULT_NAME = "NewPattern";

   public SDMSectionPart(SDMEditor editor, Composite parent,
         FormToolkit toolkit)
   {
      super(editor, parent, toolkit, SECTION_NAME, DELETE_CONFIRM_QUESTION, CHOOSE_A_NAME_MESSAGE, DEFAULT_NAME);
      this.pack = editor.getPackage();
   }

   @Override
   protected List<EOperation> getDiagramElements()
   {
      List<EOperation> operations = new ArrayList<EOperation>();
      for(EClassifier classy : this.pack.getEClassifiers())
      {
         if(classy instanceof EClass)
         {
            EClass c = (EClass) classy;
            operations.addAll(c.getEOperations());
         }
      }
      return operations;
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
      if(diagramRoot instanceof EOperation)
      {
         try
         {
            EAnnotation anno = ((EOperation)diagramRoot).getEAnnotations().get(0);
            OperationExtension ext = (OperationExtension) anno.getContents().get(0);
            ((SDMEditor)this.editor).addPageFor(ext.getOwnedActivity());
         }
         catch (Exception e)
         {
            SdmUiPlugin.getDefault().logError("Could not open activity diagram for EOperation.", e);
         }

      }
   }
   
   
   @Override
   protected TableItem addTreeItem(EObject element)
   {
      TableItem item = super.addTreeItem(element);
      EOperation operation = (EOperation) element;
      EClass owner = operation.getEContainingClass();
      String returnType = " void ";
      if(operation.getEType() != null)
      {
         returnType = operation.getEType().getName();
      }
      String treeItemDescription = owner.getName() + "." + operation.getName() + "(";
      for (int index = 0; index < operation.getEParameters().size(); index++)
      {
         EParameter param = operation.getEParameters().get(index);
         treeItemDescription += param.getEType().getName() + " " + param.getName();

         if (index != operation.getEParameters().size() - 1)
         {
            treeItemDescription += ", ";
         }
      }

      treeItemDescription += ")";
      treeItemDescription += "    --->   " + returnType;  
      item.setText(treeItemDescription);
      return item;
   }
}
