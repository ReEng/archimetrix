package org.archimetrix.relevanceanalysis.badsmells.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.archimetrix.commons.Messages;
import org.archimetrix.relevanceanalysis.RelevanceAnalysisPlugin;
import org.reclipse.structure.inference.annotations.ASGAnnotation;

/**
 * A helper class for handling bad smell occurrences.
 * 
 * @author mcp
 * 
 */
public class BadSmellOccurrenceUtil {
    /**
     * Bad smell occurrence util.
     */
    private static BadSmellOccurrenceUtil instance;

    /**
     * Returns the bad smell occurrence util.
     * @return bad smell occurrence util
     */
    public static BadSmellOccurrenceUtil get() {
        if (instance == null) {
            instance = new BadSmellOccurrenceUtil();
        }
        return instance;
    }

    /**
     * Returns the bad smell name.
     * @param annotation annotation
     * @return name
     */
    public String getBadSmellName(final ASGAnnotation annotation) {
        return annotation.getPattern().getName();
    }

    /**
     * Checks if the annoName is Bed smell.
     * @param annoName annotation name
     * @return decision bool value
     */
    public boolean isBadSmell(final String annoName) {
        for (String name : getAvailableAnnotationNames()) {
            if (name.equals(annoName)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Returns available annotation names.
     * @return list of annotation names
     */
    private String[] getAvailableAnnotationNames() {
        Properties properties = new Properties();
        try {
            InputStream stream = RelevanceAnalysisPlugin.getDefault().getBundle()
                    .getEntry(Messages.ConfigConstants_CONFIG_PROPERTIES_FILE).openStream();
            properties.load(stream);
            stream.close();

            String propertyString = properties.getProperty(Messages.ConfigConstants_RELEVANCEANALYSIS_ANNOTATION_NAMES);
            return propertyString.split(Messages.ConfigConstants_PROPERTY_SEPARATOR);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Filters the bad smell occurrences.
     * @param occurrences list of annotation occurrences
     * @return filtered list
     */
    public List<ASGAnnotation> filterBadSmellOccurrences(final List<ASGAnnotation> occurrences) {
        List<ASGAnnotation> filteredBadSmellOccurrences = new ArrayList<ASGAnnotation>();
        for (ASGAnnotation anno : occurrences) {
            String annoName = BadSmellOccurrenceUtil.get().getBadSmellName(anno);
            if (BadSmellOccurrenceUtil.get().isBadSmell(annoName)) {
                filteredBadSmellOccurrences.add(anno);
            }
        }
        return filteredBadSmellOccurrences;
    }
}
