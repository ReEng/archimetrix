package org.storydriven.modeling.interpreter.adapter.tests.activities;


import java.io.IOException;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.storydriven.modeling.activities.Activity;
import org.storydriven.modeling.activities.ActivityNode;
import org.storydriven.modeling.activities.OperationExtension;
import org.storydriven.modeling.interpreter.adapter.tests.TestBase;

import de.mdelab.sdm.interpreter.common.SDMInterpreterConstants;
import de.mdelab.sdm.interpreter.common.SDMInterpreterException;
import de.mdelab.sdm.interpreter.common.variables.Variable;


public class ActivitiesTests extends TestBase
{

   public ActivitiesTests(String name)
   {
      super(name);
   }


   @Override
   protected String getModelFolder()
   {
      return "/org.storydriven.modeling.interpreter.adapter.tests/models/activities/";
   }


   // public void testExceptionFinallyGuards() throws IOException, SDMInterpreterException
   // {
   // System.out.println("\n\n\nExecuting 'testExceptionFinallyGuards'.");
   //
   // Activity a = loadActivityDiagram("testExceptionFinallyGuards.sdm");
   //
   // ActivityNode an = a.getOwnedActivityNodes().get(0);
   //
   // Map<String, Variable> vars = executeActivityNode(an);
   //
   // assertTrue(vars.get(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME).getValueAdapter().getValue()
   // .equals(Boolean.TRUE));
   //
   // vars = executeActivityNode(an);
   //
   // assertTrue(vars.get(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME).getValueAdapter().getValue()
   // .equals(Boolean.TRUE));
   // }


   public void testForEach() throws IOException, SDMInterpreterException
   {
      System.out.println("\n\n\nExecuting 'testForEach'.");

      Activity a = loadActivityDiagram("testForEach.sdm");

      ActivityNode an = a.getOwnedActivityNodes().get(0);

      Map<String, Variable> vars = executeActivityNode(an);

      assertTrue(vars.get(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME).getValueAdapter().getValue()
            .equals(Boolean.TRUE));
      checkForEach(vars);

      vars = executeActivityNode(an);

      assertTrue(vars.get(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME).getValueAdapter().getValue()
            .equals(Boolean.TRUE));
      checkForEach(vars);
   }


   private void checkForEach(Map<String, Variable> vars)
   {
      EObject var = (EObject) vars.get("a").getValueAdapter().getValue();
      EReference elementsRef = (EReference) var.eClass().getEStructuralFeature("elements");
      EList<EObject> refs = (EList<EObject>) var.eGet(elementsRef, true);
      assertTrue(refs.size() == 2);
      for (EObject obj : refs)
      {
         // all b:ClassB elements of var:ClassA have to have a refToC to a c:ClassC
         assertTrue(listContainsObject(obj));
      }
   }


   private boolean listContainsObject(EObject obj)
   {
      EReference toCRef = (EReference) obj.eClass().getEStructuralFeature("refToC");
      EList<EObject> refs = (EList<EObject>) obj.eGet(toCRef, true);
      for (EObject object : refs)
      {
         if (object != null && object.eClass().getName().equals("ClassC"))
         {
            return true;
         }
      }
      return false;
   }


   public void testJunctionNode() throws IOException, SDMInterpreterException
   {
      System.out.println("\n\n\nExecuting 'testJunctionNode'.");

      Activity a = loadActivityDiagram("testJunctionNode.sdm");

      ActivityNode an = a.getOwnedActivityNodes().get(0);

      Map<String, Variable> vars = executeActivityNode(an);

      assertTrue(((EObject) vars.get(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME).getValueAdapter().getValue())
            .eClass().getName().equals("ClassA"));

      vars = executeActivityNode(an);

      assertTrue(((EObject) vars.get(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME).getValueAdapter().getValue())
            .eClass().getName().equals("ClassA"));
   }


   public void testStartStopNode() throws IOException, SDMInterpreterException
   {
      System.out.println("\n\n\nExecuting 'testStartStopNode'.");

      Activity a = loadActivityDiagram("testStartStopNode.sdm");

      ActivityNode an = a.getOwnedActivityNodes().get(0);

      Map<String, Variable> vars = executeActivityNode(an);

      assertTrue(vars.get(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME).getValueAdapter().getValue()
            .equals(Boolean.TRUE));

      vars = executeActivityNode(an);

      assertTrue(vars.get(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME).getValueAdapter().getValue()
            .equals(Boolean.TRUE));
   }
   
 public void testActivityCallNode() throws IOException, SDMInterpreterException
 {
    System.out.println("\n\n\nExecuting 'testActivityCallNode'.");

    EClass clazz = loadClassDiagram("\\..\\testclassmodels\\testClassmodel.ecore");
    
    Activity a = (Activity) ((OperationExtension)clazz.getEOperations().get(0).getEAnnotations().get(0).eContents().get(0)).getOwnedActivity();

    ActivityNode an = a.getOwnedActivityNodes().get(0);

    Map<String, Variable> vars = executeActivityNode(an);

    assertTrue(vars.get(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME).getValueAdapter().getValue()
          .equals(Boolean.TRUE));

    vars = executeActivityNode(an);

    assertTrue(vars.get(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME).getValueAdapter().getValue()
          .equals(Boolean.TRUE));
 }
}
