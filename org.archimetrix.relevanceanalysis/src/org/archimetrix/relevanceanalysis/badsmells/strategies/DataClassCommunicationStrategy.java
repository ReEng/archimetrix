package org.archimetrix.relevanceanalysis.badsmells.strategies;


import metricvalues.ComponentCandidate;
import metricvalues.MetricValuesModel;

import org.archimetrix.commons.PatternConstants;
import org.archimetrix.relevanceanalysis.badsmells.util.BadSmellOccurrenceUtil;
import org.eclipse.emf.common.util.EList;
import org.eclipse.gmt.modisco.java.BodyDeclaration;
import org.eclipse.gmt.modisco.java.ClassDeclaration;
import org.eclipse.gmt.modisco.java.FieldDeclaration;
import org.eclipse.gmt.modisco.java.MethodDeclaration;
import org.reclipse.structure.inference.annotations.ASGAnnotation;
//import de.fzi.gast.functions.Method;
//import de.fzi.gast.types.GASTClass;
//import de.fzi.gast.variables.Field;
//import org.eclipse.gmt.modisco.java.Type;

/**
 * This class calculates the relevance value for the relevance strategy "Data Class Communication"
 * (see [Pla11], Chapter 4).
 * 
 * @author mcp
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 * 
 */
public class DataClassCommunicationStrategy extends BadSmellsRelevanceStrategy
{

   private static final String VOID = "void";

   private static final String SETTER_PREFIX = "set";

   private static final String GETTER_PREFIX = "get";


   @Override
   public double getRelevanceValue(final ASGAnnotation badSmellAnnotation, final ComponentCandidate compCand,
         final MetricValuesModel metricValuesModel)
   {
      BadSmellOccurrenceUtil badSmellHelper = BadSmellOccurrenceUtil.get();
      if (!applicable(badSmellHelper.getBadSmellName(badSmellAnnotation)))
      {
         return -1;
      }
      if (compCand == null)
      {
         return 0; // no component candidate because clustering identified data class
      }
      double relevanceValue = 1 - toIsDataClass(badSmellAnnotation);
      return relevanceValue;
   }


   private double toIsDataClass(final ASGAnnotation badSmellAnnotation)
   {
      ClassDeclaration nonTOClass = getTOFromNonTOCommPattern(badSmellAnnotation);
      int numberOfFields = getNumberOfFields(nonTOClass);
      int numberOfMethods = getNumberOfMethods(nonTOClass);
      if (numberOfFields == 0 || numberOfMethods == 0)
      {
         return 0;
      }
      return 1 - sumOfNonAndMissingAccessors(nonTOClass, numberOfFields) / numberOfMethods;
   }


   private int getNumberOfFields(ClassDeclaration nonTOClass)
   {
      int numberOfFields = 0;
      // only non-static fields are of interest
      EList<BodyDeclaration> bdeclarations = nonTOClass.getBodyDeclarations();
      for (BodyDeclaration bd : bdeclarations)
      {
    	  if(bd instanceof FieldDeclaration)
    		  numberOfFields++;
      }
      
      //for (FieldDeclaration field : nonTOClass.getFields())
      {
      //   if (!field.isStatic())
         {
      //      numberOfFields++;
         }
      }
      return numberOfFields;
   }
   
   private int getNumberOfMethods(ClassDeclaration nonTOClass)
   {
      int numberOfMethods = 0;
      EList<BodyDeclaration> bdeclarations = nonTOClass.getBodyDeclarations();
      for (BodyDeclaration bd : bdeclarations)
      {
    	  if(bd instanceof MethodDeclaration)
    		  numberOfMethods++;
      }
      return numberOfMethods;
   }


   private double sumOfNonAndMissingAccessors(ClassDeclaration nonTOClass, int numberOfFields)
   {
      int numberOfSetters = 0;
      int numberOfGetters = 0;
      int numberOfNonAccessors = 0;
      
      EList<BodyDeclaration> bdeclarations = nonTOClass.getBodyDeclarations();
      for (BodyDeclaration method : bdeclarations)
      {
    	  if(method instanceof MethodDeclaration)
    	  {
    		  if (isGetter((MethodDeclaration)method))
    	         {
    	            numberOfGetters++;
    	         }
    	         else if (isSetter((MethodDeclaration)method))
    	         {
    	            numberOfSetters++;
    	         }
    	         else
    	         {
    	            numberOfNonAccessors++;
    	         }
    	  }
      }

      int numberOfMissingAccessors = Math.abs(2 * numberOfFields - numberOfGetters - numberOfSetters);
      return numberOfNonAccessors + numberOfMissingAccessors;
   }


   private boolean isSetter(final MethodDeclaration method)
   {
      if (method.getName().startsWith(SETTER_PREFIX))
      {
         if (method.getParameters().size() == 1)
         {
            if (method.getReturnType().getQualifier().getClass().getSimpleName().equals(VOID))
            {
               return true;
            }
         }
      }
      return false;
   }


   private boolean isGetter(final MethodDeclaration method)
   {
      if (method.getName().startsWith(GETTER_PREFIX))
      {
         if (method.getParameters().size() == 0)
         {
            return true;
         }
      }
      return false;
   }


   private ClassDeclaration getTOFromNonTOCommPattern(final ASGAnnotation annotation)
   {
      return (ClassDeclaration) annotation.getAnnotatedElements().get(PatternConstants.NON_TO_ROLE).get(0);
   }


   @Override
   public boolean applicable(final String badSmellName)
   {
      if (badSmellName.equals(PatternConstants.NON_TO_COMMUNICATION_PATTERN_NAME))
      {
         return true;
      }
      return false;
   }

}
