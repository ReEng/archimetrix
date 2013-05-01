package org.archimetrix.relevanceanalysis.badsmells.util;


import java.util.HashMap;

import org.archimetrix.relevanceanalysis.RelevanceResults;
import org.eclipse.emf.ecore.resource.Resource;
import org.reclipse.structure.inference.annotations.ASGAnnotation;

import org.somox.sourcecodedecorator.ComponentImplementingClassesLink;


public class RelevanceResultsStorage
{
   private static HashMap<Resource, RelevanceResults<ComponentImplementingClassesLink>> relevantComponents = new HashMap<Resource, RelevanceResults<ComponentImplementingClassesLink>>();

   private static HashMap<Resource, RelevanceResults<ASGAnnotation>> relevantDeficiencies = new HashMap<Resource, RelevanceResults<ASGAnnotation>>();


   public static void storeRelevantComponents(Resource resource, RelevanceResults<ComponentImplementingClassesLink> results)
   {
      relevantComponents.put(resource, results);
   }

   public static void storeRelevantDeficiencies(Resource resource, RelevanceResults<ASGAnnotation> results)
   {
      relevantDeficiencies.put(resource, results);
   }
   
   public static RelevanceResults<ComponentImplementingClassesLink> retrieveRelevantComponents(Resource resource)
   {
      return relevantComponents.get(resource);
   }


   public static RelevanceResults<ASGAnnotation> retrieveRelevantDeficiencies(Resource resource)
   {
      return relevantDeficiencies.get(resource);
   }

}
