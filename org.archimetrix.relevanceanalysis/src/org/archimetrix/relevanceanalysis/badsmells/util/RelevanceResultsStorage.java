package org.archimetrix.relevanceanalysis.badsmells.util;

import java.util.HashMap;

import org.archimetrix.relevanceanalysis.RelevanceResults;
import org.eclipse.emf.ecore.resource.Resource;
import org.reclipse.structure.inference.annotations.ASGAnnotation;
import org.somox.sourcecodedecorator.ComponentImplementingClassesLink;

/**
 * 
 * @author mcp
 *
 */
public class RelevanceResultsStorage {
    /**
     * Relevance components.
     */
    private static HashMap<Resource, RelevanceResults<ComponentImplementingClassesLink>> relevantComponents =
            new HashMap<Resource, RelevanceResults<ComponentImplementingClassesLink>>();

    /**
     * Relevance deficiencies.
     */
    private static HashMap<Resource, RelevanceResults<ASGAnnotation>> relevantDeficiencies =
            new HashMap<Resource, RelevanceResults<ASGAnnotation>>();

    /**
     * Stores the relevant components.
     * @param resource resource
     * @param results relevance results
     */
    public static void storeRelevantComponents(Resource resource,
            RelevanceResults<ComponentImplementingClassesLink> results) {
        relevantComponents.put(resource, results);
    }

    /**
     * Stores relevant deficiencies.
     * @param resource resource
     * @param results relevance results
     */
    public static void storeRelevantDeficiencies(Resource resource, RelevanceResults<ASGAnnotation> results) {
        relevantDeficiencies.put(resource, results);
    }

    /**
     * Returns relevance components from resource.
     * @param resource resource
     * @return relevance components
     */
    public static RelevanceResults<ComponentImplementingClassesLink> retrieveRelevantComponents(Resource resource) {
        return relevantComponents.get(resource);
    }

    /**
     * Returns relevance deficiencies from resource.
     * @param resource resource
     * @return relevance deficiencies
     */
    public static RelevanceResults<ASGAnnotation> retrieveRelevantDeficiencies(Resource resource) {
        return relevantDeficiencies.get(resource);
    }

}
