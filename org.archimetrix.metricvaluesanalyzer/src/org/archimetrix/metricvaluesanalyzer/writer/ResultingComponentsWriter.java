package org.archimetrix.metricvaluesanalyzer.writer;


import java.io.BufferedWriter;
import java.io.IOException;

import metricvalues.MetricValuesModel;

import org.archimetrix.metricvaluesanalyzer.Constants;
import org.archimetrix.metricvaluesanalyzer.MetricValuesHelper;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import eu.qimpress.samm.staticstructure.ComponentType;
import eu.qimpress.samm.staticstructure.Repository;


public class ResultingComponentsWriter
{

   private final BufferedWriter bf;


   public ResultingComponentsWriter(final BufferedWriter bf)
   {
      this.bf = bf;
   }


   private Repository loadSamm(final URI uri)
   {
      ResourceSet sammRess = new ResourceSetImpl();
      URI normalized = sammRess.getURIConverter().normalize(uri);
      Resource resource = sammRess.getResource(normalized, true);

      EcoreUtil.resolveAll(resource);

      return (Repository) resource.getContents().get(0);
   }


   public void writeResultingComponents(final MetricValuesModel model) throws IOException
   {
      String modelUriString = model.eResource().getURI().toString();
      modelUriString = modelUriString.substring(0, modelUriString.lastIndexOf("/"));
      modelUriString += "/internal_architecture_model.samm_repository";
      Repository samm = loadSamm(URI.createURI(modelUriString));

      this.bf.append(";Last Resulting Components:  ");
      for (ComponentType comp : samm.getComponenttype())
      {
         this.bf.append(MetricValuesHelper.printComponentType(comp));
         this.bf.append(" ,  ");
      }
      this.bf.append(Constants.LINE_SEPARATOR);
   }


}
