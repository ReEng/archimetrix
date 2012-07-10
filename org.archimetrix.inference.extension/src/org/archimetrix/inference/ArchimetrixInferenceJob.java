package org.archimetrix.inference;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMLParserPoolImpl;
import org.fujaba.commons.console.AbstractProcessConsoleJob;
import org.fujaba.commons.console.ReportLevel;
import org.reclipse.structure.generator.Generator;
import org.reclipse.structure.generator.GeneratorConstants;
import org.reclipse.structure.inference.InferenceEngine;
import org.reclipse.structure.inference.InterpreterInferenceEngine;
import org.reclipse.structure.inference.evaluation.SimilarityEvaluator;
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


public class ArchimetrixInferenceJob extends AbstractProcessConsoleJob
{
   private final ResourceSet resourceSet;

   private final InferenceEngine inferenceEngine;

   private final String catalogPath;

   private final String hostPath;

   private final String enginesPath;

   private final Collection<? extends Object> selectedComponents;


   public ArchimetrixInferenceJob(String catalogPath, String hostPath, String enginesPath,
         Collection<? extends Object> selectedComponents, ReportLevel reportLevel)
   {
      super("Archimetrix", "Inference", catalogPath, reportLevel);

      this.catalogPath = catalogPath;
      this.hostPath = hostPath;
      this.enginesPath = enginesPath;
      this.selectedComponents = selectedComponents;

      resourceSet = new ResourceSetImpl();

      inferenceEngine = new InterpreterInferenceEngine(this);
      inferenceEngine.setAnnotationEvaluator(new SimilarityEvaluator());
      inferenceEngine.setSearchForAdditionalElements(true);
   }


   @Override
   public IStatus start(IProgressMonitor monitor)
   {
      monitor.beginTask(getName(), IProgressMonitor.UNKNOWN);

      // search catalog
      PSCatalog catalog = null;

      // create resource
      Resource catalogResource = resourceSet.createResource(URI.createPlatformResourceURI(catalogPath, true));

      // load
      task("Loading catalog input resource");
      try
      {
         catalogResource.load(resourceSet.getLoadOptions());
         debug("Catalog input resource loaded.");
      }
      catch (IOException e)
      {
         e.printStackTrace();
         return error("The catalog input resource could not be loaded: " + e.getLocalizedMessage());
      }

      // go through contents
      for (EObject content : catalogResource.getContents())
      {
         if (content instanceof PSCatalog)
         {
            catalog = (PSCatalog) content;
            break;
         }
      }

      String expression = getSelectionExpression();
      if (expression != null)
      {
         modifyCatalog(catalog, expression);
      }

      // check
      if (catalog == null)
      {
         return error("The catalog input resource does not contain a valid catalog!");
      }

      // search annotations and engines packages
      EPackage annotationsPackage = null;
      EPackage enginesPackage = null;

      // prepare content to insert the generated packages into
      Collection<EObject> contents = new ArrayList<EObject>();

      // start generation
      Generator generator = new Generator(this);
      generator.generate(contents, catalog);

      // go through contents
      for (EObject content : contents)
      {
         if (content instanceof EPackage)
         {
            EPackage pack = (EPackage) content;

            if (GeneratorConstants.PACKAGE_URI.equals(pack.getNsURI()))
            {
               enginesPackage = (EPackage) content;
            }
            else if ("http://ns.reclipse.org/structure/generation/annotations".equals(pack.getNsURI()))
            {
               annotationsPackage = (EPackage) content;
            }
         }
      }

      // check for existence of both packages
      if (enginesPackage == null || annotationsPackage == null)
      {
         return error("There are no valid engines available!");
      }

      // search host
      Collection<EObject> host = null;

      // create resource
      Resource hostResource = resourceSet.createResource(URI.createPlatformResourceURI(hostPath, true));

      // load
      task("Loading host graph resource");
      try
      {
         hostResource.load(getLoadOptions(hostResource));

         // this call is very heavy, but otherwise some parts of the model may not be analyzed
         debug("Resolving all proxies on the host graph resource.");
         EcoreUtil.resolveAll(hostResource.getResourceSet());
         info("Host graph resource loaded.");
      }
      catch (IOException e)
      {
         e.printStackTrace();
         return error("The host graph input resource could not be loaded: " + e.getLocalizedMessage());
      }

      // go through contents
      host = hostResource.getContents();

      // save the generated engines
      URI outputURI = URI.createPlatformResourceURI(catalogPath, true).appendFileExtension("ecore");
      Resource outputResource = null;

      // try to get existing resource
      task("Preparing output resource");
      try
      {
         outputResource = resourceSet.getResource(outputURI, true);
         outputResource.getContents().clear();
         debug("Existing resource found, it will be overwritten.");
      }
      catch (WrappedException e)
      {
         debug("Creating new output resource...");
      }

      if (outputResource == null)
      {
         try
         {
            outputResource = resourceSet.createResource(outputURI);
            outputResource.save(Collections.emptyMap());
            outputResource.load(resourceSet.getLoadOptions());
            debug("New output resource has been created.");
         }
         catch (WrappedException e)
         {
            return error("Could not create output resource: " + e.exception().getLocalizedMessage());
         }
         catch (IOException io)
         {
            return error("Could not create output resource: " + io.getLocalizedMessage());
         }
      }

      // check for existence
      if (outputResource == null || !outputResource.isLoaded())
      {
         return error("Output resource could not be loaded!");
      }

      // add the generated packages
      outputResource.getContents().add(annotationsPackage);
      outputResource.getContents().add(enginesPackage);

      // save resources
      task("Saving generated resource");
      try
      {
         outputResource.save(Collections.emptyMap());
         debug("Output resource has been saved.");
      }
      catch (IOException e)
      {
         e.printStackTrace();
         return error("Could not save output resource:" + e.getLocalizedMessage());
      }

      // create, configure and start engine
      inferenceEngine.setCatalog(catalog);
      inferenceEngine.setHost(host);
      inferenceEngine.setEnginePackage(enginesPackage);

      return inferenceEngine.start(monitor);
   }


   private String getSelectionExpression()
   {
      if (selectedComponents == null || selectedComponents.isEmpty())
      {
         return null;
      }

      String expression = "";
      for (Object o : selectedComponents)
      {
         ComponentType type = (ComponentType) o;
         String id = type.getId();

         expression += "(" + id + ")|";
      }

      expression = expression.substring(0, expression.length() - 1);

      return expression;
   }


   private void modifyCatalog(PSCatalog catalog, String expression)
   {
      String directComps = "DirectComponentClasses";
      String indirectComps = "IndirectComponentClasses";
      EClass compTypeEClass = StaticstructurePackage.Literals.COMPONENT_TYPE;
      EAttribute attributeType = IdentifierPackage.Literals.IDENTIFIER__ID;

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


   private static Map<Object, Object> getLoadOptions(Resource resource)
   {
      Map<Object, Object> options = resource.getResourceSet().getLoadOptions();

      options.put(XMLResource.OPTION_DEFER_ATTACHMENT, Boolean.TRUE);
      options.put(XMLResource.OPTION_DEFER_IDREF_RESOLUTION, Boolean.TRUE);
      options.put(XMLResource.OPTION_USE_DEPRECATED_METHODS, Boolean.TRUE);
      options.put(XMLResource.OPTION_USE_PARSER_POOL, new XMLParserPoolImpl());
      options.put(XMLResource.OPTION_USE_XML_NAME_TO_FEATURE_MAP, new HashMap<Object, Object>());
      ((ResourceImpl) resource).setIntrinsicIDToEObjectMap(new HashMap<String, EObject>());

      return options;
   }


   public InferenceEngine getEngine()
   {
      return inferenceEngine;
   }
}
