package org.archimetrix.relevanceanalysis.badsmells.util;


import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.archimetrix.commons.ConfigConstants;
import org.archimetrix.relevanceanalysis.RelevanceAnalysisPlugin;
import org.reclipse.structure.inference.annotations.ASGAnnotation;


/**
 * A helper class for handling bad smell occurrences.
 * 
 * @author mcp
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 * 
 */
public class BadSmellOccurrenceUtil
{
   private static BadSmellOccurrenceUtil instance;


   public static BadSmellOccurrenceUtil get()
   {
      if (instance == null)
      {
         instance = new BadSmellOccurrenceUtil();
      }
      return instance;
   }


   public String getBadSmellName(final ASGAnnotation annotation)
   {
      return annotation.getPattern().getName();
   }


   public boolean isBadSmell(final String annoName)
   {
      for (String name : getAvailableAnnotationNames())
      {
         if (name.equals(annoName))
         {
            return true;
         }
      }
      return false;
   }


   private String[] getAvailableAnnotationNames()
   {
      Properties properties = new Properties();
      try
      {
         InputStream stream = RelevanceAnalysisPlugin.getDefault().getBundle()
               .getEntry(ConfigConstants.CONFIG_PROPERTIES_FILE).openStream();
         properties.load(stream);
         stream.close();

         String propertyString = properties.getProperty(ConfigConstants.RELEVANCEANALYSIS_ANNOTATION_NAMES);
         return propertyString.split(ConfigConstants.PROPERTY_SEPARATOR);
      }
      catch (IOException e)
      {
         RelevanceAnalysisPlugin.getDefault().logError("Error occurred during loading config file.", e);
      }
      return null;
   }


   public List<ASGAnnotation> filterBadSmellOccurrences(final List<ASGAnnotation> occurrences)
   {
      List<ASGAnnotation> filteredBadSmellOccurrences = new ArrayList<ASGAnnotation>();
      for (ASGAnnotation anno : occurrences)
      {
         String annoName = BadSmellOccurrenceUtil.get().getBadSmellName(anno);
         if (BadSmellOccurrenceUtil.get().isBadSmell(annoName))
         {
            filteredBadSmellOccurrences.add(anno);
         }
      }
      return filteredBadSmellOccurrences;
   }
}
