package org.archimetrix.metricvaluesanalyzer;


import metricvalues.Component;
import metricvalues.Iteration;
import metricvalues.MetricValuesModel;
import de.fzi.gast.types.GASTClass;
import eu.qimpress.samm.staticstructure.ComponentType;
import eu.qimpress.samm.staticstructure.CompositeComponent;
import eu.qimpress.samm.staticstructure.PrimitiveComponent;


public class MetricValuesHelper
{
   public static String printComponent(final Component component)
   {
      StringBuilder s = new StringBuilder();
      s.append("<");
      for (GASTClass gastClass : component.getClasses())
      {
         s.append(gastClass.getSimpleName() + " ");
      }
      for (Component subComp : component.getSubComponents())
      {
         s.append(printComponent(subComp));
      }
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
      }
      else if (componentType instanceof CompositeComponent)
      {
         s.append(componentType.getName());
      }
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
