/**
 * 
 */
package org.reclipse.structure.inference.extended;

import java.io.File;
import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.Resource;
import org.reclipse.structure.generator.PSGenerator;
import org.reclipse.structure.inference.annotations.AnnotationsPackage;
import org.reclipse.structure.specification.OperatorType;
import org.reclipse.structure.specification.PSAttributeConstraint;
import org.reclipse.structure.specification.PSCatalog;
import org.reclipse.structure.specification.PSNode;
import org.reclipse.structure.specification.PSObject;
import org.reclipse.structure.specification.PSPatternSpecification;
import org.reclipse.structure.specification.SpecificationFactory;

import eu.qimpress.identifier.IdentifierPackage;
import eu.qimpress.samm.staticstructure.ComponentType;
import eu.qimpress.samm.staticstructure.StaticstructurePackage;

/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 *
 */
public class ModifyCatalogAndGenerateAlgorithmsAction implements Runnable
{
   Resource psCatalog, target;
   Object[] selectedComponents;

   public ModifyCatalogAndGenerateAlgorithmsAction(Resource psCatalog, Resource target, Object[] selectedComponents)
   {
      super();
      this.psCatalog = psCatalog;
      this.target = target;
      this.selectedComponents = selectedComponents;
   }

   /**
    * @see org.eclipse.jface.operation.IRunnableWithProgress#run(org.eclipse.core.runtime.IProgressMonitor)
    */
   @Override
   public void run()
   {
      PSGenerator gen = new PSGenerator(null);
      
      AnnotationsPackage.eINSTANCE.getNsURI();
      
      try
      {
         psCatalog.load(null);
      }
      catch (IOException e)
      {
         e.printStackTrace();
      }
      
      PSCatalog catalog = (PSCatalog) psCatalog.getContents().get(0);
      
      String expression = getSelectionExpression();
      if(expression != null)
      {
         modifyCatalog(catalog, expression);
      }
      
      gen.addToElementsToProcess(catalog);
//      activateConsole(gen);
      String fileString = target.getURI().toPlatformString(false);
      target.unload();
      String wsLocation = ResourcesPlugin.getWorkspace().getRoot().getLocation().toOSString();
      String filePath = wsLocation + fileString;
      File file = new File(filePath);
      gen.setOutputTo(file);
      
      if (Status.OK_STATUS != gen.start(null))
      {
         if(gen.getException() != null && gen.getException().getMessage()== null)
         {
            String message = gen.getException().toString();
            gen.append(message);
         }
      }
      
      
      try
      {
         IFile f = ResourcesPlugin.getWorkspace().getRoot().getFileForLocation(Path.fromOSString(filePath));
         if(f != null)
         {
            f.refreshLocal(IResource.DEPTH_ZERO, null);
         }
         else
         {
            ResourcesPlugin.getWorkspace().getRoot().refreshLocal(IResource.DEPTH_INFINITE, null);
         }
      }
      catch (CoreException e)
      {
         e.printStackTrace();
      }
   }

   private void modifyCatalog(PSCatalog catalog, String expression)
   {
      String directComps = "DirectComponentClasses";
      String indirectComps = "IndirectComponentClasses";
      EClass compTypeEClass = StaticstructurePackage.eINSTANCE.getComponentType();
      EAttribute attributeType = IdentifierPackage.eINSTANCE.getIdentifier_Id();
      for(PSPatternSpecification pattern : catalog.getPatternSpecifications())
      {
         if(directComps.equals(pattern.getName())
               || indirectComps.equals(pattern.getName()))
         {
            for(PSNode node : pattern.getNodes())
            {
               if(node instanceof PSObject)
               {
                  PSObject o = (PSObject) node;
                  if(compTypeEClass == o.getInstanceOf())
                  {
                     //add attribute expression
                     PSAttributeConstraint constraint = SpecificationFactory.eINSTANCE.createPSAttributeConstraint();
                     constraint.setAttribute(attributeType);
                     constraint.setNode(o);
                     constraint.setOperator(OperatorType.REGULAR_EXPRESSION);
                     constraint.setValueExpression(expression);
                  }
               }
            }
         }
      }
      
   }

//   protected void activateConsole(PSGenerator gen)
//   {
//      try
//      {
//         IViewPart consoleView = GeneratorUIActivator.getDefault()
//               .getWorkbench().getActiveWorkbenchWindow().getActivePage()
//               .showView("org.reclipse.generator.ui.console");
//
//         if (consoleView != null && consoleView instanceof GeneratorConsoleView)
//         {
//            ((GeneratorConsoleView) consoleView).setInput(gen);
//         }
//      }
//      catch (PartInitException e)
//      {
//      }
//   }
   
   private String getSelectionExpression()
   {
      if(this.selectedComponents == null
            || this.selectedComponents.length == 0)
      {
         return null;
      }
      
      String expression = "";
      for(Object o : this.selectedComponents)
      {
         ComponentType type = (ComponentType) o;
         String id = type.getId();
         
         expression += "("+ id +")|";
      }
      
      expression = expression.substring(0, expression.length()-1);
      
      return expression;
   }
}
