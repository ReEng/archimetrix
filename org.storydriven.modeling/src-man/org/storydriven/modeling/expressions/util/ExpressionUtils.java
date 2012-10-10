package org.storydriven.modeling.expressions.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;

public class ExpressionUtils
{
   public static final String EXPRESSION_LANGUAGES_EXTENSION_POINT_ID = "org.storydriven.modeling.expressionLanguagesExtension";

   public static final String EXPRESSION_LANGUAGES_EXPRESSION_LANGUAGE_ATTRIBUTE_NAME = "expressionLanguage";
   public static final String EXPRESSION_LANGUAGES_VERSION_ATTRIBUTE_NAME = "version";
   public static final String EXPRESSION_SOURCE_VIEWER_ATTRIBUTE_NAME = "sourceViewerProvider";

   private static Map<String, List<String>> expressionLanguages = null;
   private static Map<String, String> sourceViewerProviders = null;

   private static int amountLanguages = 0;
   private static int maximumAmountVersions = 0;

   public static int getAmountLanguages ()
   {
      if (amountLanguages == 0)
      {
         initializeExpressionLanguageCollection();
      }
      return amountLanguages;
   }

   public static int getMaximumAmountVersions ()
   {
      if (maximumAmountVersions == 0)
      {
         int maximum = 0;
         for (String aLanguage: expressionLanguages.keySet())
         {
            if (expressionLanguages.get(aLanguage).size() > maximum)
            {
               maximum = expressionLanguages.get(aLanguage).size();
            }
         }
         maximumAmountVersions = maximum;
      }
      return maximumAmountVersions;
   }

   public static List<String> getAvailableExpressionLanguages ()
   {
      if (expressionLanguages == null)
      {
         initializeExpressionLanguageCollection();
      }
      return new ArrayList<String>(expressionLanguages.keySet());
   }

   public static List<String> getAvailableExpressionLanguageVersions (String language)
   {
      if (expressionLanguages.containsKey(language))
      {
         return expressionLanguages.get(language);
      }
      else
      {
         return new ArrayList<String>();
      }
   }

   public static void initializeExpressionLanguageCollection ()
   {
      expressionLanguages = new HashMap<String, List<String>>();
      sourceViewerProviders = new HashMap<String, String>();

      if (Platform.getExtensionRegistry() != null)
      {
         IConfigurationElement[] configurationElements = Platform.getExtensionRegistry().getConfigurationElementsFor(
            EXPRESSION_LANGUAGES_EXTENSION_POINT_ID);

         for (IConfigurationElement configurationElement: configurationElements)
         {
            String s = configurationElement.getAttribute(EXPRESSION_LANGUAGES_EXPRESSION_LANGUAGE_ATTRIBUTE_NAME);
            String v = configurationElement.getAttribute(EXPRESSION_LANGUAGES_VERSION_ATTRIBUTE_NAME);

            if (s != null && !("".equals(s)))
            {
               if (!expressionLanguages.containsKey(s))
               {
                  List<String> newVersionsList = new ArrayList<String>();
                  newVersionsList.add(v);
                  expressionLanguages.put(s, newVersionsList);

                  amountLanguages += 1;
               }
               else
               {
                  expressionLanguages.get(s).add(v);

               }
            }
         }
      }
   }

}
