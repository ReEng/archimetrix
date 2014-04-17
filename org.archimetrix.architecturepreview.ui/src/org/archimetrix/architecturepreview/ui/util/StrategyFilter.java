package org.archimetrix.architecturepreview.ui.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.archimetrix.architecturepreview.ui.ArchitecturePreviewUIPlugin;
import org.archimetrix.commons.Messages;
import org.eclipse.emf.ecore.EOperation;
import org.reclipse.structure.inference.annotations.ASGAnnotation;

/**
 * Filters the reengineering strategies with regard to the names of available patterns.
 * 
 * FIXME This should be replaced by a new mechanism that determines the right name by adequate
 * annotations in the story diagram model.
 * 
 * @author mcp
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 * 
 */
public class StrategyFilter {
    /**
     * Strategies.
     */
    private Map<String, List<String>> strategies;

    /**
     * Filters the strategies.
     * @param allStrategies all 
     * @param annotation annotation
     * @return filtered strategies
     */
    public List<EOperation> filterStrategies(final List<EOperation> allStrategies, final ASGAnnotation annotation) {
        List<EOperation> filteredStrategies = new ArrayList<EOperation>();
        if (this.strategies == null) {
            this.strategies = getStrategiesMapFromConfig();
        }
        if (annotation != null) {
            String badSmellName = annotation.getPattern().getName();
            List<String> wantedStrategyNames = this.strategies.get(badSmellName);
            for (EOperation strategy : allStrategies) {
                for (String validName : wantedStrategyNames) {
                    if (strategy.getName().equals(validName)) {
                        filteredStrategies.add(strategy);
                    }
                }
            }
        }
        return filteredStrategies;
    }

    /**
     * Returns strategies map.
     * @return strategies map
     */
    private Map<String, List<String>> getStrategiesMapFromConfig() {
        Map<String, List<String>> strategies = new HashMap<String, List<String>>();

        Properties properties = new Properties();
        try {
            InputStream stream = ArchitecturePreviewUIPlugin.getDefault().getBundle()
                    .getEntry(Messages.ConfigConstants_CONFIG_PROPERTIES_FILE).openStream();
            properties.load(stream);
            stream.close();

            addStrategies(strategies, properties, Messages.PatternConstants_ILLEGAL_METHOD_ACCESS_PATTERN);
            addStrategies(strategies, properties, Messages.PatternConstants_ILLEGAL_METHOD_ACCESS_BC_PATTERN);
            addStrategies(strategies, properties, Messages.PatternConstants_DISTORTED_ILLEGAL_METHOD_ACCESS_PATTERN);
            addStrategies(strategies, properties, Messages.PatternConstants_DISTORTED_ILLEGAL_METHOD_ACCESS_BC_PATTERN);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return strategies;
    }

    /**
     * Adds strategies.
     * @param strategies strategies
     * @param properties properties
     * @param badSmellName bad smell name
     */
    private void addStrategies(final Map<String, List<String>> strategies, final Properties properties,
            final String badSmellName) {
        String illegalMethodAccessReengineeringStrategies = properties.getProperty(badSmellName);
        String[] strategyNamesArray = illegalMethodAccessReengineeringStrategies
                .split(Messages.ConfigConstants_PROPERTY_SEPARATOR);
        List<String> illegalMethodAccessStrategiesList = new ArrayList<String>();
        Collections.addAll(illegalMethodAccessStrategiesList, strategyNamesArray);
        strategies.put(badSmellName, illegalMethodAccessStrategiesList);
    }

}
