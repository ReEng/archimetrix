package org.archimetrix.architectureprognosis.starters;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.reclipse.interpreter.adapter.extension.ExtendedSDMainAdapterFactory;
import org.reclipse.structure.inference.annotations.ASGAnnotation;
import org.storydriven.modeling.activities.Activity;

import de.fzi.gast.core.Root;
import de.mdelab.sdm.interpreter.common.SDMInterpreter;
import de.mdelab.sdm.interpreter.common.SDMInterpreterException;
import de.mdelab.sdm.interpreter.common.expressions.EclipseBasedExpressionInterpreterFactory;
import de.mdelab.sdm.interpreter.common.tasks.notifying.NotifyingMainInterpreterFactory;
import de.mdelab.sdm.interpreter.common.tasks.notifying.OutputStreamNotificationReceiver;
import de.mdelab.sdm.interpreter.common.variables.Parameter;
import de.mdelab.sdm.interpreter.common.variables.Variable;
import eu.qimpress.qimpressgast.util.qimpressgastResourceFactoryImpl;


/**
 * This class is responsible for starting the story diagram interpreter in order to execute a
 * reengineering strategy.
 * 
 * @author mcp
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 * 
 */
public class InterpreterStarter
{
   private static final String GAST_FILE_EXTENSION = ".gast";

   private static final String REENGINEERED_MODEL_FILE_SUFFIX = "_reengineered";


   /**
    * Creates a new instance of the story diagram interpreter and interprets the given reengineering
    * strategy on the model that contains the given bad smell occurrence.
    * 
    * @param badSmell the annotation that represents the bad smell occurrence to be reengineered
    * @param reengineeringStrategy a story diagram that specifies a reengineering strategy
    * @return
    */
   public Resource callInterpreter(final ASGAnnotation badSmell, final Activity reengineeringStrategy)
   {
      List<Parameter> params = createParameters(badSmell);
      startInterpretation(reengineeringStrategy, params);
      Resource newResource = saveTransformedGAST(badSmell);

      return newResource;
   }


   private Resource saveTransformedGAST(final ASGAnnotation badSmell)
   {
      @SuppressWarnings("unchecked")
      Root root = null;
      EObject element = null;
      for (EList<EObject> annotatedElement : badSmell.getAnnotatedElements().values())
      {
         element = annotatedElement.get(0);
         root = getGASTRoot(element);
         if (root != null)
         {
            break;
         }
      }
      Resource newResource = createNewGASTResource(element);
      newResource.getContents().add(root);
      try
      {
         newResource.save(null);
      }
      catch (IOException e)
      {
         e.printStackTrace();
      }
      return newResource;
   }


   private Map<String, Variable> startInterpretation(final Activity reengineeringStrategy, final List<Parameter> params)
   {
      try
      {
         SDMInterpreter interpreter = new SDMInterpreter(new NotifyingMainInterpreterFactory(
               new EclipseBasedExpressionInterpreterFactory(), new OutputStreamNotificationReceiver()),
               new ExtendedSDMainAdapterFactory(), getClass().getClassLoader());
         return interpreter.executeActivity(reengineeringStrategy, params, 1);
      }
      catch (SDMInterpreterException e)
      {
         e.printStackTrace();
      }
      return null;
   }


   /**
    * Creates the parameters that will be given to the interpreter when executing an the activity.
    * For this, the annotated elements of the given bad smell annotation are used.
    * 
    * @param badSmell an annotation that represents the bad smell occurrence to be reengineered
    * @return a list of parameters
    */
   private List<Parameter> createParameters(final ASGAnnotation badSmell)
   {
      List<Parameter> params = new ArrayList<Parameter>();
      for (String key : badSmell.getAnnotatedElements().keySet())
      {
         EObject elementFromGAST = badSmell.getAnnotatedElements().get(key).get(0);
         EcoreUtil.resolveAll(elementFromGAST);
         String paramName = "";
         for (Entry<String, EList<EObject>> entry : badSmell.getBoundObjects().entrySet())
         {
            if (entry.getValue().get(0) == elementFromGAST)
            {
               paramName = entry.getKey();
               break;
            }
         }
         Parameter parameter = new Parameter(paramName, elementFromGAST.eClass(), elementFromGAST);
         params.add(parameter);
      }
      return params;
   }


   private Resource createNewGASTResource(final EObject element)
   {
      String oldFileName = getOldGASTFileName(element);
      String newFileName = oldFileName + REENGINEERED_MODEL_FILE_SUFFIX;
      URI resourceURI = element.eResource().getURI().trimSegments(1).appendSegment(newFileName + GAST_FILE_EXTENSION);

      qimpressgastResourceFactoryImpl resourceFactory = new qimpressgastResourceFactoryImpl();
      Resource newResource = resourceFactory.createResource(resourceURI);

      // Resource newResource = resourceSet.createResource(normalized); // TODO use XMLResource?
      return newResource;
   }


   private String getOldGASTFileName(final EObject element)
   {
      return element.eResource().getURI().lastSegment().split("\\.")[0];
   }


   /**
    * Searches recursively for the GAST root in the GASTModel of the given element.
    * 
    * @param element an element from the GAST to be searched
    * @return the root of the GAST model
    */
   private Root getGASTRoot(final EObject element)
   {
      if (element.eContainer() != null)
      {
         return getGASTRoot(element.eContainer());
      }
      else
      {
         if (element instanceof Root)
         {
            return (Root) element;
         }
      }
      return null;
   }

}
