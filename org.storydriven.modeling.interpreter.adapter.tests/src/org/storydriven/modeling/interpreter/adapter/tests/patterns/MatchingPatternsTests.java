package org.storydriven.modeling.interpreter.adapter.tests.patterns;


import java.io.IOException;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.storydriven.modeling.activities.Activity;
import org.storydriven.modeling.activities.ActivityNode;
import org.storydriven.modeling.interpreter.adapter.tests.TestBase;

import de.mdelab.sdm.interpreter.common.SDMInterpreterConstants;
import de.mdelab.sdm.interpreter.common.SDMInterpreterException;
import de.mdelab.sdm.interpreter.common.variables.Variable;


public class MatchingPatternsTests extends TestBase
{

   public MatchingPatternsTests(String name)
   {
      super(name);
   }


   @Override
   protected String getModelFolder()
   {
      return "/org.storydriven.modeling.interpreter.adapter.tests/models/patterns/matching/";
   }


   public void testConstraints() throws IOException, SDMInterpreterException
   {
      System.out.println("\n\n\nExecuting 'testConstraints'.");

      Activity a = loadActivityDiagram("testConstraints.sdm");

      ActivityNode an = a.getOwnedActivityNodes().get(0);

      Map<String, Variable> vars = executeActivityNode(an);

      assertTrue(vars.get(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME).getValueAdapter().getValue()
            .equals(Boolean.TRUE));

      vars = executeActivityNode(an);

      assertTrue(vars.get(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME).getValueAdapter().getValue()
            .equals(Boolean.TRUE));
   }
   
    // public void testContainmentRelation() throws IOException, SDMInterpreterException
    // {
    // System.out.println("\n\n\nExecuting 'testContainmentRelation'.");
    //
    // Activity a = loadActivityDiagram("testContainmentRelation.sdm");
    //
    // ActivityNode an = a.getOwnedActivityNodes().get(0);
    //
    // Map<String, Variable> vars = executeActivityNode(an);
    //
    //
//    assertTrue(vars.get(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME).getValueAdapter().getValue().equals(Boolean.TRUE));
    //
    // vars = executeActivityNode(an);
    //
    //
//    assertTrue(vars.get(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME).getValueAdapter().getValue().equals(Boolean.TRUE));
    // }
   
    public void testMatchingBidirectionalLinkVariable() throws IOException,
    SDMInterpreterException
    {
    System.out.println("\n\n\nExecuting 'testMatchingBidirectionalLinkVariable'.");
   
    Activity a = loadActivityDiagram("testMatchingBidirectionalLinkVariable.sdm");
   
    ActivityNode an = a.getOwnedActivityNodes().get(0);
   
    Map<String, Variable> vars = executeActivityNode(an);
   
    assertTrue(vars.get(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME).getValueAdapter().getValue().equals(Boolean.TRUE));
   
    vars = executeActivityNode(an);
   
    assertTrue(vars.get(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME).getValueAdapter().getValue().equals(Boolean.TRUE));
    }
   
    public void testMatchingFails() throws IOException, SDMInterpreterException
    {
    System.out.println("\n\n\nExecuting 'testMatchingFails'.");
   
    Activity a = loadActivityDiagram("testMatchingFails.sdm");
   
    ActivityNode an = a.getOwnedActivityNodes().get(0);
   
    Map<String, Variable> vars = executeActivityNode(an);
   
    assertTrue(vars.get(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME).getValueAdapter().getValue().equals(Boolean.TRUE));
   
    vars = executeActivityNode(an);
   
    assertTrue(vars.get(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME).getValueAdapter().getValue().equals(Boolean.TRUE));
    }
   
   
    public void testMatchingLinkVariable() throws IOException, SDMInterpreterException
    {
    System.out.println("\n\n\nExecuting 'testMatchingLinkVariable'.");
   
    Activity a = loadActivityDiagram("testMatchingLinkVariable.sdm");
   
    ActivityNode an = a.getOwnedActivityNodes().get(0);
   
    Map<String, Variable> vars = executeActivityNode(an);
   
    assertTrue(vars.get(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME).getValueAdapter().getValue().equals(Boolean.TRUE));
   
    vars = executeActivityNode(an);
   
    assertTrue(vars.get(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME).getValueAdapter().getValue().equals(Boolean.TRUE));
    }
   
    public void testMatchingNegativeObjectVariable() throws IOException, SDMInterpreterException
    {
    System.out.println("\n\n\nExecuting 'testMatchingNegativeObjectVariable'.");
   
    Activity a = loadActivityDiagram("testMatchingNegativeObjectVariable.sdm");
   
    ActivityNode an = a.getOwnedActivityNodes().get(0);
   
    Map<String, Variable> vars = executeActivityNode(an);
   
    assertTrue(vars.get(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME).getValueAdapter().getValue().equals(Boolean.TRUE));
   
    vars = executeActivityNode(an);
   
    assertTrue(vars.get(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME).getValueAdapter().getValue().equals(Boolean.TRUE));
    }
   
    public void testMatchingNegativeLinkVariable() throws IOException, SDMInterpreterException
    {
    System.out.println("\n\n\nExecuting 'testMatchingNegativeLinkVariable'.");
   
    Activity a = loadActivityDiagram("testMatchingNegativeLinkVariable.sdm");
   
    ActivityNode an = a.getOwnedActivityNodes().get(0);
   
    Map<String, Variable> vars = executeActivityNode(an);
   
    assertTrue(vars.get(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME).getValueAdapter().getValue().equals(Boolean.TRUE));
   
    vars = executeActivityNode(an);
   
    assertTrue(vars.get(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME).getValueAdapter().getValue().equals(Boolean.TRUE));
    }
   
    public void testMatchingOptionalObjectVariable() throws IOException, SDMInterpreterException
    {
    System.out.println("\n\n\nExecuting 'testMatchingOptionalObjectVariable'.");
   
    Activity a = loadActivityDiagram("testMatchingOptionalObjectVariable.sdm");
   
    ActivityNode an = a.getOwnedActivityNodes().get(0);
   
    Map<String, Variable> vars = executeActivityNode(an);
   
    assertTrue(vars.get(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME).getValueAdapter().getValue().equals(Boolean.TRUE));
   
    vars = executeActivityNode(an);
   
    assertTrue(vars.get(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME).getValueAdapter().getValue().equals(Boolean.TRUE));
    }
   
    public void testMatchingToManyLinkVariable() throws IOException, SDMInterpreterException
    {
    System.out.println("\n\n\nExecuting 'testMatchingToManyLinkVariable'.");
   
    Activity a = loadActivityDiagram("testMatchingToManyLinkVariable.sdm");
   
    ActivityNode an = a.getOwnedActivityNodes().get(0);
   
    Map<String, Variable> vars = executeActivityNode(an);
   
    assertTrue(vars.get(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME).getValueAdapter().getValue().equals(Boolean.TRUE));
   
    vars = executeActivityNode(an);
   
    assertTrue(vars.get(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME).getValueAdapter().getValue().equals(Boolean.TRUE));
    }
   
    public void testMaybeBoundObjectVariable() throws IOException, SDMInterpreterException
    {
    System.out.println("\n\n\nExecuting 'testMaybeBoundObjectVariable'.");
   
    Activity a = loadActivityDiagram("testMaybeBoundObjectVariable.sdm");
   
    ActivityNode an = a.getOwnedActivityNodes().get(0);
   
    Map<String, Variable> vars = executeActivityNode(an);
   
    assertTrue(vars.get(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME).getValueAdapter().getValue().equals(Boolean.TRUE));
   
    vars = executeActivityNode(an);
   
    assertTrue(vars.get(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME).getValueAdapter().getValue().equals(Boolean.TRUE));
    }
   
    public void testObjectSetSizeExpression() throws IOException, SDMInterpreterException
    {
    System.out.println("\n\n\nExecuting 'testObjectSetSizeExpression'.");
   
    Activity a = loadActivityDiagram("testObjectSetSizeExpression.sdm");
   
    ActivityNode an = a.getOwnedActivityNodes().get(0);
   
    Map<String, Variable> vars = executeActivityNode(an);
   
    assertTrue(vars.get(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME).getValueAdapter().getValue().equals(Boolean.TRUE));
   
    vars = executeActivityNode(an);
   
    assertTrue(vars.get(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME).getValueAdapter().getValue().equals(Boolean.TRUE));
    }

   public void testObjectSetVariable() throws IOException, SDMInterpreterException
   {
      System.out.println("\n\n\nExecuting 'testObjectSetVariable'.");

      Activity a = loadActivityDiagram("testObjectSetVariable.sdm");

      ActivityNode an = a.getOwnedActivityNodes().get(0);

      Map<String, Variable> vars = executeActivityNode(an);

      assertTrue(((EList)vars.get("set1").getValueAdapter().getValue()).size()== 2);

      assertTrue(vars.get(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME).getValueAdapter().getValue()
            .equals(Boolean.TRUE));

      vars = executeActivityNode(an);
      
      assertTrue(((EList)vars.get("set1").getValueAdapter().getValue()).size()== 2);

      assertTrue(vars.get(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME).getValueAdapter().getValue()
            .equals(Boolean.TRUE));
   }

}
