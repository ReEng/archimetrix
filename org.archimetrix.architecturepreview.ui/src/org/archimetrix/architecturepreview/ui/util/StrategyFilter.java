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

import org.archimetrix.architecturepreview.ArchitecturePreviewPlugin;
import org.archimetrix.architecturepreview.ui.ArchitecturePreviewUIPlugin;
import org.archimetrix.commons.ConfigConstants;
import org.archimetrix.commons.PatternConstants;
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
public class StrategyFilter
{
   private Map<String, List<String>> strategies;


   public List<EOperation> filterStrategies(final List<EOperation> allStrategies, final ASGAnnotation annotation)
   {
      List<EOperation> filteredStrategies = new ArrayList<EOperation>();
      if (this.strategies == null)
      {
         this.strategies = getStrategiesMapFromConfig();
      }
      if (annotation != null)
      {
         String badSmellName = annotation.getPattern().getName();
         List<String> wantedStrategyNames = this.strategies.get(badSmellName);
         for (EOperation strategy : allStrategies)
         {
            for (String validName : wantedStrategyNames)
            {
               if (strategy.getName().equals(validName))
               {
                  filteredStrategies.add(strategy);
               }
            }
         }
      }
      return filteredStrategies;
   }


   private Map<String, List<String>> getStrategiesMapFromConfig()
   {
      Map<String, List<String>> strategies = new HashMap<String, List<String>>();

      Properties properties = new Properties();
      try
      {
         InputStream stream = ArchitecturePreviewUIPlugin.getDefault().getBundle()
               .getEntry(ConfigConstants.CONFIG_PROPERTIES_FILE).openStream();
         properties.load(stream);
         stream.close();

         addStrategies(strategies, properties, PatternConstants.ILLEGAL_METHOD_ACCESS_PATTERN);
         addStrategies(strategies, properties, PatternConstants.ILLEGAL_METHOD_ACCESS_BC_PATTERN);
         addStrategies(strategies, properties, PatternConstants.INVALIDATED_ILLEGAL_METHOD_ACCESS_PATTERN);
         addStrategies(strategies, properties, PatternConstants.INVALIDATED_ILLEGAL_METHOD_ACCESS_BC_PATTERN);
      }
      catch (FileNotFoundException e)
      {
         ArchitecturePreviewPlugin.getDefault().logError("Error occurred in StrategyFilter.", e);
      }
      catch (IOException e)
      {
         ArchitecturePreviewPlugin.getDefault().logError("Error occurred in StrategyFilter.", e);
      }
      return strategies;
   }


   private void addStrategies(final Map<String, List<String>> strategies, final Properties properties,
         final String badSmellName)
   {
      String illegalMethodAccessReengineeringStrategies = properties.getProperty(badSmellName);
      String[] strategyNamesArray = illegalMethodAccessReengineeringStrategies
            .split(ConfigConstants.PROPERTY_SEPARATOR);
      List<String> illegalMethodAccessStrategiesList = new ArrayList<String>();
      Collections.addAll(illegalMethodAccessStrategiesList, strategyNamesArray);
      strategies.put(badSmellName, illegalMethodAccessStrategiesList);
   }

}
