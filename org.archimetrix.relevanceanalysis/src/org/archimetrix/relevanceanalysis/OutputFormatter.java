package org.archimetrix.relevanceanalysis;

import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmt.modisco.java.Type;
import org.reclipse.metamodel.AbstractElementLabeler;
import org.reclipse.structure.inference.annotations.ASGAnnotation;
import org.reclipse.structure.specification.util.ModelHelper;
import org.somox.sourcecodedecorator.ComponentImplementingClassesLink;
//import org.eclipse.gmt.modisco.java.ClassDeclaration;
//import de.fzi.gast.types.GASTClass;

/**
 * This class contains helper methods that return readable strings for given model objects.
 * 
 * @author mcp
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 * 
 */
public class OutputFormatter {
    private static final String ANNOTATED_ELEMENT_SEPARATOR = ", ";

    /**
     * Returns a String that represents the given annotation by its annotated elements.
     * 
     * @param annotation
     *            the annotation to be formatted
     * @return an annotation String
     */
    public static String formatAnnotation(final ASGAnnotation annotation) {
        // EcoreUtil.resolveAll(annotation);
        StringBuilder sb = new StringBuilder();
        sb.append(annotation.getPattern().getName());
        sb.append("(");
        sb.append(formatAnnotatedElements(annotation));
        sb.append(")");
        return sb.toString();
    }

    /**
     * Returns a String with the annotated elements of an ASGAnnotation
     * 
     * @param annotation
     *            the annotation whose annotated elements are to be printed
     * @return a String with the annotated elements of the given annotation
     */
    public static String formatAnnotatedElements(final ASGAnnotation annotation) {
        AbstractElementLabeler labeler = ModelHelper.getMetaModel(annotation.getPattern()).getLabeler();

        StringBuilder sb = new StringBuilder();
        for (Entry<String, EList<EObject>> annotatedElementEntry : annotation.getAnnotatedElements()) {
            final String annotatedElementLabel = labeler.getText(annotatedElementEntry.getValue().get(0));
            sb.append(annotatedElementLabel);
            sb.append(ANNOTATED_ELEMENT_SEPARATOR);
        }
        return sb.toString();
    }

    /**
     * Returns a String with classes and their ratings in the component relevance analysis.
     * Currently only used for debugging.
     * 
     * @param classesLink
     *            a components that contains the classes that are to be printed
     * @param classesMap
     *            a map that contains the rating values
     * @return the rated classes string
     */
    public static String formatRatedClassesString(final ComponentImplementingClassesLink classesLink,
            final Map<String, Integer> classesMap) {
        StringBuilder b = new StringBuilder();
        for (Type gastClass : classesLink.getImplementingClasses()) {
            EcoreUtil.resolveAll(gastClass);
            b.append(classesMap.get(gastClass.getName()));
            b.append(",");
        }
        for (ComponentImplementingClassesLink subComp : classesLink.getSubComponents()) {
            b.append(formatRatedClassesString(subComp, classesMap));
        }
        return b.toString();
    }

}
