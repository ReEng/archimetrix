package org.archimetrix.metricvaluesanalyzer;


import metricvalues.Component;
import metricvalues.Iteration;
import metricvalues.MetricValuesModel;

import de.uka.ipd.sdq.pcm.repository.BasicComponent;
import de.uka.ipd.sdq.pcm.repository.RepositoryComponent;
//import eu.qimpress.samm.staticstructure.ComponentType;
//import eu.qimpress.samm.staticstructure.CompositeComponent;
//import eu.qimpress.samm.staticstructure.PrimitiveComponent;
//import org.eclipse.gmt.modisco.java.Type;
import de.uka.ipd.sdq.pcm.repository.CompositeComponent;

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


   public static String printComponentType(final RepositoryComponent comp) // ComponentType changed to RepositoryComponent (also possible RepositoryComponent)
   {
      StringBuilder s = new StringBuilder();
      s.append("<");
      if (comp instanceof BasicComponent) //PrimitiveComponent changed to BasicComponent
      {
         s.append(comp.getEntityName());
          //BasicComponent primitiveComp = ((BasicComponent)componentType);
          //primitiveComp.getPassiveResources();
      }
      else if (comp instanceof CompositeComponent)
      {
          //CompositeComponent compComp = ((CompositeComponent) componentType);
          //compComp.getSubcomponents(); // TODO
         s.append(comp.getEntityName());
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
