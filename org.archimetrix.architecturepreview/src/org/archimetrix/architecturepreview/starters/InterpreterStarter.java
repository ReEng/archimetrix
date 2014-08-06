package org.archimetrix.architecturepreview.starters;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.reclipse.structure.inference.annotations.ASGAnnotation;
import org.storydriven.storydiagrams.activities.Activity;
import org.storydriven.storydiagrams.interpreter.eclipse.StoryDrivenEclipseInterpreter;

//import de.fzi.gast.core.Root;
import de.mdelab.sdm.interpreter.core.SDMException;
import de.mdelab.sdm.interpreter.core.variables.Variable;
//import eu.qimpress.qimpressgast.util.qimpressgastResourceFactoryImpl;


// TODO: This class should be adapted to MoDisco (kdm model). Gast is not used anymore! 


/**
 * This class is responsible for starting the story diagram interpreter in order to execute a
 * reengineering strategy.
 * 
 * @author mcp
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 * 
 */
public class InterpreterStarter {
    /**
     * Extension string for gast file.
     */
    private static final String GAST_FILE_EXTENSION = ".gast";

    /**
     * Suffix for reengineered model file.
     */
    private static final String REENGINEERED_MODEL_FILE_SUFFIX = "_reengineered";

    /**
     * Creates a new instance of the story diagram interpreter and interprets the given
     * reengineering strategy on the model that contains the given bad smell occurrence.
     * 
     * @param badSmell
     *            the annotation that represents the bad smell occurrence to be reengineered
     * @param reengineeringStrategy
     *            a story diagram that specifies a reengineering strategy
     * @return the result object from the interpretation
     */
    public Resource callInterpreter(final ASGAnnotation badSmell, final Activity reengineeringStrategy) {
        List<Variable<EClassifier>> params = createParameters(badSmell);
        startInterpretation(reengineeringStrategy, params);
        Resource newResource = saveTransformedGAST(badSmell);

        return newResource;
    }

    /**
     * Saves the transformed gast model in new gast resource.
     * @param badSmell bad smell annotation
     * @return new gast resource
     */

    private Resource saveTransformedGAST(final ASGAnnotation badSmell) {
        Root root = null;
        EObject element = null;
        for (EList<EObject> annotatedElement : badSmell.getAnnotatedElements().values()) {
            element = annotatedElement.get(0);
            root = getGASTRoot(element);
            if (root != null) {
                break;
            }
        }
        Resource newResource = createNewGASTResource(element);
        newResource.getContents().add(root);
        try {
            newResource.save(null);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return newResource;
    }

    /**
     * Executes the interpretation activity of StoryDriven interpreter.
     * @param reengineeringStrategy the strategy
     * @param params parameters
     * @return executed interpretation as a map object
     */
    private Map<String, Variable<EClassifier>> startInterpretation(final Activity reengineeringStrategy,
            final List<Variable<EClassifier>> params) {
        try {
            StoryDrivenEclipseInterpreter interpreter = new StoryDrivenEclipseInterpreter(getClass().getClassLoader());
            return interpreter.executeActivity(reengineeringStrategy, params);
        } catch (SDMException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Creates the parameters that will be given to the interpreter when executing an the activity.
     * For this, the annotated elements of the given bad smell annotation are used.
     * 
     * @param badSmell
     *            an annotation that represents the bad smell occurrence to be reengineered
     * @return a list of parameters
     */
    private List<Variable<EClassifier>> createParameters(final ASGAnnotation badSmell) {
        List<Variable<EClassifier>> params = new ArrayList<Variable<EClassifier>>();
        for (String key : badSmell.getAnnotatedElements().keySet()) {
            EObject elementFromGAST = badSmell.getAnnotatedElements().get(key).get(0);
            EcoreUtil.resolveAll(elementFromGAST);
            String paramName = "";
            for (Entry<String, EList<EObject>> entry : badSmell.getBoundObjects().entrySet()) {
                if (entry.getValue().get(0) == elementFromGAST) {
                    paramName = entry.getKey();
                    break;
                }
            }
            Variable<EClassifier> parameter = new Variable<EClassifier>(paramName, elementFromGAST.eClass(),
                    elementFromGAST);
            params.add(parameter);
        }
        return params;
    }

    /**
     * Creates new resource.
     * @param element old resource
     * @return new resource
     */
    private Resource createNewGASTResource(final EObject element) {
        String oldFileName = getOldGASTFileName(element);
        String newFileName = oldFileName + REENGINEERED_MODEL_FILE_SUFFIX;
        URI resourceURI = element.eResource().getURI().trimSegments(1).appendSegment(newFileName + GAST_FILE_EXTENSION);

        qimpressgastResourceFactoryImpl resourceFactory = new qimpressgastResourceFactoryImpl();
        Resource newResource = resourceFactory.createResource(resourceURI);

        // Resource newResource = resourceSet.createResource(normalized); // TODO use XMLResource?
        return newResource;
    }

    /**
     * Get method for the old file name.
     * @param element old element
     * @return old file name
     */
    private String getOldGASTFileName(final EObject element) {
        return element.eResource().getURI().lastSegment().split("\\.")[0];
    }

    /**
     * Searches recursively for the GAST root in the GASTModel of the given element.
     * 
     * @param element
     *            an element from the GAST to be searched
     * @return the root of the GAST model
     */
    private Root getGASTRoot(final EObject element) {
        if (element.eContainer() != null) {
            return getGASTRoot(element.eContainer());
        } else {
            if (element instanceof Root) {
                return (Root) element;
            }
        }
        return null;
    }

}
