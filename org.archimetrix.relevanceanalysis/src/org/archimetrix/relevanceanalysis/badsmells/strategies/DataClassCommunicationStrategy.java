package org.archimetrix.relevanceanalysis.badsmells.strategies;

import metricvalues.ComponentCandidate;
import metricvalues.MetricValuesModel;

import org.archimetrix.commons.Messages;
import org.archimetrix.relevanceanalysis.badsmells.util.BadSmellOccurrenceUtil;
import org.eclipse.emf.common.util.EList;
import org.eclipse.gmt.modisco.java.BodyDeclaration;
import org.eclipse.gmt.modisco.java.ClassDeclaration;
import org.eclipse.gmt.modisco.java.FieldDeclaration;
import org.eclipse.gmt.modisco.java.MethodDeclaration;
import org.reclipse.structure.inference.annotations.ASGAnnotation;


/**
 * This class calculates the relevance value for the relevance strategy "Data Class Communication"
 * (see [Pla11], Chapter 4).
 * 
 * @author mcp
 * 
 */
public class DataClassCommunicationStrategy extends BadSmellsRelevanceStrategy {

    /**
     * void string.
     */
    private static final String VOID = "void";

    /**
     * setter prefix.
     */
    private static final String SETTER_PREFIX = "set";

    /**
     * getter prefix.
     */
    private static final String GETTER_PREFIX = "get";

    @Override
    public double getRelevanceValue(final ASGAnnotation badSmellAnnotation, final ComponentCandidate compCand,
            final MetricValuesModel metricValuesModel) {
        BadSmellOccurrenceUtil badSmellHelper = BadSmellOccurrenceUtil.get();
        if (!applicable(badSmellHelper.getBadSmellName(badSmellAnnotation))) {
            return -1;
        }
        if (compCand == null) {
            return 0; // no component candidate because clustering identified data class
        }
        double relevanceValue = 1 - toIsDataClass(badSmellAnnotation);
        return relevanceValue;
    }

     /**
      * 
      * @param badSmellAnnotation bad smell annotation
      * @return sum of accessors
      */
    private double toIsDataClass(final ASGAnnotation badSmellAnnotation) {
        ClassDeclaration nonTOClass = getTOFromNonTOCommPattern(badSmellAnnotation);
        int numberOfFields = getNumberOfFields(nonTOClass);
        int numberOfMethods = getNumberOfMethods(nonTOClass);
        if (numberOfFields == 0 || numberOfMethods == 0) {
            return 0;
        }
        return 1 - sumOfNonAndMissingAccessors(nonTOClass, numberOfFields) / numberOfMethods;
    }

    /**
     * Returns number of fields.
     * @param nonTOClass class to be analysed
     * @return number of fields
     */
    private int getNumberOfFields(ClassDeclaration nonTOClass) {
        int numberOfFields = 0;
        // only non-static fields are of interest
        EList<BodyDeclaration> bdeclarations = nonTOClass.getBodyDeclarations();
        for (BodyDeclaration bd : bdeclarations) {
            if (bd instanceof FieldDeclaration) {
                numberOfFields++;
            }
        }

        // for (FieldDeclaration field : nonTOClass.getFields())
        
            // if (!field.isStatic())
            
                // numberOfFields++;
            
        
        return numberOfFields;
    }

    /**
     * Returns number of methods.
     * @param nonTOClass class to be analysed
     * @return number of methods
     */
    private int getNumberOfMethods(ClassDeclaration nonTOClass) {
        int numberOfMethods = 0;
        EList<BodyDeclaration> bdeclarations = nonTOClass.getBodyDeclarations();
        for (BodyDeclaration bd : bdeclarations) {
            if (bd instanceof MethodDeclaration) {
                numberOfMethods++;
            }
        }
        return numberOfMethods;
    }

    /**
     * Returns the sum of non and missing accessors.
     * @param nonTOClass class to be analysed
     * @param numberOfFields number of fields
     * @return sum of non and missing accessors
     */
    private double sumOfNonAndMissingAccessors(ClassDeclaration nonTOClass, int numberOfFields) {
        int numberOfSetters = 0;
        int numberOfGetters = 0;
        int numberOfNonAccessors = 0;

        EList<BodyDeclaration> bdeclarations = nonTOClass.getBodyDeclarations();
        for (BodyDeclaration method : bdeclarations) {
            if (method instanceof MethodDeclaration) {
                if (isGetter((MethodDeclaration) method)) {
                    numberOfGetters++;
                } else if (isSetter((MethodDeclaration) method)) {
                    numberOfSetters++;
                } else {
                    numberOfNonAccessors++;
                }
            }
        }

        int numberOfMissingAccessors = Math.abs(2 * numberOfFields - numberOfGetters - numberOfSetters);
        return numberOfNonAccessors + numberOfMissingAccessors;
    }

    /**
     * Checks if the method is setter.
     * @param method method to be checked
     * @return decision bool value
     */
    private boolean isSetter(final MethodDeclaration method) {
        if (method.getName().startsWith(SETTER_PREFIX)) {
            if (method.getParameters().size() == 1) {
                if (method.getReturnType().getQualifier().getClass().getSimpleName().equals(VOID)) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Checks if the method is getter.
     * @param method method to be checked
     * @return decision bool value
     */
    private boolean isGetter(final MethodDeclaration method) {
        if (method.getName().startsWith(GETTER_PREFIX)) {
            if (method.getParameters().size() == 0) {
                return true;
            }
        }
        return false;
    }

    /**
     * Returns toFromNonToComm Pattern.
     * @param annotation annotation
     * @return the pattern
     */
    private ClassDeclaration getTOFromNonTOCommPattern(final ASGAnnotation annotation) {
        return (ClassDeclaration) annotation.getAnnotatedElements().get(Messages.PatternConstants_NON_TO_ROLE).get(0);
    }

    @Override
    public boolean applicable(final String badSmellName) {
        if (badSmellName.equals(Messages.PatternConstants_NON_TO_COMMUNICATION_PATTERN_NAME)) {
            return true;
        }
        return false;
    }

}
