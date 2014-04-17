package org.archimetrix.commons;

import java.util.HashMap;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

/**
 * Provides helper methods for loading resources.
 * @author mcp
 */
public class ResourceLoader {

    /**
     * The Hash map.
     */
    private static final HashMap<URI, Resource> RESOURCECACHE;

    static {
        RESOURCECACHE = new HashMap<URI, Resource>();
        }

    /**
     *  Returns an EMF resource from a file that lies behind the given path.
     *  @param path
     *             that specifies the location of the resource to be returned
     *             @return a resource or null if the path is empty
     */
    public static Resource loadResource(final String path) {
        if (path.isEmpty()) {
            return null;
            }

        URI uri = URI.createPlatformResourceURI(path, true);
        Resource resource = RESOURCECACHE.get(uri);

        if (resource == null) {
            resource = loadResourceFrom(uri);
            }
        return resource;
        }
/**
 * Loads the resource from a given URI.
 * @param uri the uri
 * @return resource
 */
    private static Resource loadResourceFrom(final URI uri) {
        Resource resource;
        ResourceSet ress = new ResourceSetImpl();
        resource = ress.getResource(uri, true);
        RESOURCECACHE.put(uri, resource);
        return resource;
        }
    }
