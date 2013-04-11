/**
 * 
 */
package org.reclipse.structure.inference.extended;


import java.io.IOException;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.Resource;
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
 * @author Oleg Travkin
 * 
 *          This action takes the generated catalog and modifies the two patterns
 *          "DirectComponentClasses" and "IndirectComponentClasses". It adds an expression to it
 *          that makes sure that these patterns can only be matched for the components selected by
 *          the Archimetrix user. Thus the deficiency detection remains confined to the selected
 *          components.
 */
public class ModifyCatalogAction implements Runnable
{
   Resource psCatalog, target;

   Object[] selectedComponents;


   public ModifyCatalogAction(Resource psCatalog, Resource target, Object[] selectedComponents)
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
      if (expression != null)
      {
         modifyCatalog(catalog, expression);
      }
      
   }


   private void modifyCatalog(PSCatalog catalog, String expression)
   {
      String directComps = "DirectComponentClasses";
      String indirectComps = "IndirectComponentClasses";
      EClass compTypeEClass = StaticstructurePackage.eINSTANCE.getComponentType();
      EAttribute attributeType = IdentifierPackage.eINSTANCE.getIdentifier_Id();
      for (PSPatternSpecification pattern : catalog.getPatternSpecifications())
      {
         if (directComps.equals(pattern.getName()) || indirectComps.equals(pattern.getName()))
         {
            for (PSNode node : pattern.getNodes())
            {
               if (node instanceof PSObject)
               {
                  PSObject o = (PSObject) node;
                  if (compTypeEClass == o.getInstanceOf())
                  {
                     // add attribute expression
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


   private String getSelectionExpression()
   {
      if (this.selectedComponents == null || this.selectedComponents.length == 0)
      {
         return null;
      }

      String expression = "";
      for (Object o : this.selectedComponents)
      {
         ComponentType type = (ComponentType) o;
         String id = type.getId();

         expression += "(" + id + ")|";
      }

      expression = expression.substring(0, expression.length() - 1);

      return expression;
   }
}
