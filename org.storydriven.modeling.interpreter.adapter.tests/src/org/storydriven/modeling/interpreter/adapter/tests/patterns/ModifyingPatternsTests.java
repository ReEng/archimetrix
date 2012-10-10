package org.storydriven.modeling.interpreter.adapter.tests.patterns;


import java.io.IOException;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.storydriven.modeling.activities.Activity;
import org.storydriven.modeling.activities.ActivityNode;
import org.storydriven.modeling.interpreter.adapter.tests.TestBase;

import de.mdelab.sdm.interpreter.common.SDMInterpreterConstants;
import de.mdelab.sdm.interpreter.common.SDMInterpreterException;
import de.mdelab.sdm.interpreter.common.variables.Variable;


public class ModifyingPatternsTests extends TestBase
{

   public ModifyingPatternsTests(String name)
   {
      super(name);
   }


   @Override
   protected String getModelFolder()
   {
      return "/org.storydriven.modeling.interpreter.adapter.tests/models/patterns/modifying/";
   }


   public void testAttributeAssignment() throws IOException, SDMInterpreterException
   {
      System.out.println("\n\n\nExecuting 'testAttributeAssignment'.");

      Activity a = loadActivityDiagram("testAttributeAssignment.sdm");

      ActivityNode an = a.getOwnedActivityNodes().get(0);

      Map<String, Variable> vars = executeActivityNode(an);

      EObject obj = (EObject) vars.get("var").getValueAdapter().getValue();

      EAttribute attr = null;
      EList<EAttribute> attributes = obj.eClass().getEAllAttributes();
      for (EAttribute attribute : attributes)
      {
         if (attribute.getName().equals("attr"))
         {
            attr = attribute;
         }
      }

      assertTrue(obj.eGet(attr, true).equals("newValue"));

      vars = executeActivityNode(an);

      assertTrue(obj.eGet(attr, true).equals("newValue"));
   }


   public void testCreateObjectVariable() throws IOException, SDMInterpreterException
   {
      System.out.println("\n\n\nExecuting 'testCreateObjectVariable'.");

      Activity a = loadActivityDiagram("testCreateObjectVariable.sdm");

      ActivityNode an = a.getOwnedActivityNodes().get(0);

      Map<String, Variable> vars = executeActivityNode(an);

      assertTrue(((EObject) vars.get(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME).getValueAdapter().getValue())
            .eClass().getName().equals("ClassA"));

      vars = executeActivityNode(an);

      assertTrue(((EObject) vars.get(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME).getValueAdapter().getValue())
            .eClass().getName().equals("ClassA"));
   }


   public void testDestroyObjectVariable() throws IOException, SDMInterpreterException
   {
      System.out.println("\n\n\nExecuting 'testDestroyObjectVariable'.");

      Activity a = loadActivityDiagram("testDestroyObjectVariable.sdm");

      ActivityNode an = a.getOwnedActivityNodes().get(0);

      Map<String, Variable> vars = executeActivityNode(an);

      assertTrue(vars.get(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME).getValueAdapter().getValue()
            .equals(Boolean.TRUE));

      checkDestroyedReference(vars);

      vars = executeActivityNode(an);

      assertTrue(vars.get(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME).getValueAdapter().getValue()
            .equals(Boolean.TRUE));

      checkDestroyedReference(vars);
   }


   private void checkDestroyedReference(Map<String, Variable> vars)
   {
      EObject varA = (EObject) vars.get("varA").getValueAdapter().getValue();

      EReference ref = null;
      EList<EReference> references = varA.eClass().getEAllReferences();
      for (EReference eReference : references)
      {
         if (eReference.getName().equals("toOneRef"))
         {
            ref = eReference;
         }
      }

      assertTrue(varA.eGet(ref, true) == null);
   }


   public void testOptionalCreateObjectVariable() throws IOException, SDMInterpreterException
   {
      System.out.println("\n\n\nExecuting 'testOptionalCreateObjectVariable'.");

      Activity a = loadActivityDiagram("testOptionalCreateObjectVariable.sdm");

      ActivityNode an = a.getOwnedActivityNodes().get(0);

      Map<String, Variable> vars = executeActivityNode(an);

      assertTrue(((EObject) vars.get(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME).getValueAdapter().getValue())
            .eClass().getName().equals("ClassA"));

      vars = executeActivityNode(an);

      assertTrue(((EObject) vars.get(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME).getValueAdapter().getValue())
            .eClass().getName().equals("ClassA"));
   }

}
