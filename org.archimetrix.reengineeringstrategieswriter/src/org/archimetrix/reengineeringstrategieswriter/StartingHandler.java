package org.archimetrix.reengineeringstrategieswriter;


import java.io.File;
import java.io.IOException;
import java.util.Collections;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import de.fzi.gast.accesses.accessesPackage;
import de.fzi.gast.functions.functionsPackage;
import de.fzi.gast.statements.statementsPackage;
import de.fzi.gast.types.typesPackage;


public class StartingHandler extends AbstractHandler
{

   private static final String RESOURCE = "/Store12_WithInterfaceViolation/ReengineeringStrategies.ecore";

   private EClass clazz;

   private StrategyWriter writer;


   @Override
   public Object execute(final ExecutionEvent event) throws ExecutionException
   {
      Resource resource = createResource();
      this.clazz = createEClass();
      this.writer = new StrategyWriter();

      createInterfaceViolationReengineeringStrategy(
            "/Store12_WithInterfaceViolation/InterfaceViolationReengineeringStrategy1.sdm",
            "interfaceViolationReengineeringStrategy1");
      createInterfaceViolationReengineeringStrategy(
            "/Store12_WithInterfaceViolation/InterfaceViolationReengineeringStrategy2.sdm",
            "interfaceViolationReengineeringStrategy2");
      createInterfaceViolationReengineeringStrategy(
            "/Store12_WithInterfaceViolation/DistortedInterfaceViolationReengineeringStrategy.sdm",
            "distortedInterfaceViolationReengineeringStrategy");

      EPackage ePackage = EcoreFactory.eINSTANCE.createEPackage();
      ePackage.getEClassifiers().add(this.clazz);
      ePackage.setName("org.reclipse.reengineering");
      resource.getContents().add(ePackage);

      try
      {
         resource.save(Collections.EMPTY_MAP);
      }
      catch (IOException e)
      {
      }

      System.out.println("Reengineering Strategies Writer finished.");
      return null;
   }


   public void createInterfaceViolationReengineeringStrategy(final String sdmPath, final String methodName)
   {
      // all annotated elements can be passed as arguments
      String[] paramNames = { "class1", "class2", "interface", "method2", "call", "castStmt" };
      EClassifier[] paramTypes = { typesPackage.eINSTANCE.getGASTClass(), typesPackage.eINSTANCE.getGASTClass(),
            typesPackage.eINSTANCE.getGASTClass(), functionsPackage.eINSTANCE.getMethod(),
            accessesPackage.eINSTANCE.getFunctionAccess(), statementsPackage.eINSTANCE.getSimpleStatement() };
      this.clazz.getEOperations().add(this.writer.createOperation(sdmPath, methodName, paramNames, paramTypes));
   }


   private EClass createEClass()
   {
      EClass clazz = EcoreFactory.eINSTANCE.createEClass();
      clazz.setName("ReengineeringStrategies");
      return clazz;
   }


   public Resource createResource()
   {
      URI fileURI = URI.createPlatformResourceURI(new File(RESOURCE).getPath(), true);
      URI resourceURI = fileURI;

      ResourceSet resourceSet = new ResourceSetImpl();
      Resource resource = resourceSet.createResource(resourceURI);
      return resource;
   }


}
