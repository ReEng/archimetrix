package org.archimetrix.metricvaluesanalyzer;


import metricvalues.Component;
import metricvalues.Iteration;
import metricvalues.MetricValuesModel;
import de.fzi.gast.types.GASTClass;
import eu.qimpress.samm.staticstructure.ComponentType;
import eu.qimpress.samm.staticstructure.CompositeComponent;
import eu.qimpress.samm.staticstructure.PrimitiveComponent;
//import org.eclipse.gmt.modisco.java.Type;

public class MetricValuesHelper
{
   public static String printComponent(final Component component)
   {
      StringBuilder s = new StringBuilder();
      s.append("<");
      /*for (GASTClass gastClass : component.getClasses())
      {
         s.append(gastClass.getSimpleName() + " ");
      }
      for (Component subComp : component.getSubComponents())
      {
         s.append(printComponent(subComp));
      }*/
      s.append(">");
      return s.toString();
   }


   public static String printComponentType(final ComponentType componentType)
   {
      StringBuilder s = new StringBuilder();
      s.append("<");
      if (componentType instanceof PrimitiveComponent)
      {
         s.append(componentType.getName());
         // PrimitiveComponent primitiveComp = ((PrimitiveComponent)componentType);
         // primitiveComp.getPassiveResources();
      }
      else if (componentType instanceof CompositeComponent)
      {
         // CompositeComponent compComp = ((CompositeComponent) componentType);
         // compComp.getSubcomponents(); // TODO
         s.append(componentType.getName());
      }
      // for (GASTClass gastClass : componentType.getClasses())
      // {
      // s.append(gastClass.getSimpleName() + " ");
      // }
      // for (ComponentCandidate subComp : componentType.getSubComponents())
      // {
      // s.append(printComponentCandidate(subComp));
      // }
      s.append(">");
      return s.toString();
   }


   public static Iteration getLastIterationWithCompCandPairs(final MetricValuesModel model)
   {
      for (int i = model.getIterationsLength() - 1; i >= 0; i--)
      {
         if (model.getIterations(i).getComponentCandidatesLength() >= 1)
         {
            return model.getIterations(i);
         }
      }
      return null;
   }

}
