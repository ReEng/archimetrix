package org.archimetrix.relevanceanalysis.badsmells;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import metricvalues.Component;
import metricvalues.ComponentCandidate;
import metricvalues.MetricValuesModel;

import org.archimetrix.commons.Messages;
import org.archimetrix.relevanceanalysis.AbstractRelevanceAnalysis;
import org.archimetrix.relevanceanalysis.RelevanceAnalysisPlugin;
import org.archimetrix.relevanceanalysis.RelevanceResults;
import org.archimetrix.relevanceanalysis.badsmells.strategies.BadSmellsResultStrategy;
import org.archimetrix.relevanceanalysis.badsmells.strategies.ClassLocationsStrategy;
import org.archimetrix.relevanceanalysis.badsmells.strategies.DataClassCommunicationStrategy;
import org.archimetrix.relevanceanalysis.badsmells.strategies.ExternalAccessesStrategy;
import org.archimetrix.relevanceanalysis.badsmells.strategies.HigherInterfaceAdherenceStrategy;
import org.archimetrix.relevanceanalysis.badsmells.strategies.IBadSmellsStrategy;
import org.archimetrix.relevanceanalysis.badsmells.strategies.ParetoOptimalBadSmellsResultStrategy;
import org.archimetrix.relevanceanalysis.badsmells.strategies.VectorLengthBadSmellsResultStrategy;
import org.archimetrix.relevanceanalysis.badsmells.util.BadSmellOccurrenceUtil;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmt.modisco.java.ClassDeclaration;
import org.eclipse.gmt.modisco.java.Type;
import org.reclipse.structure.inference.annotations.ASGAnnotation;
//import de.fzi.gast.types.GASTClass;

public class RelevantBadSmellsAnalysis extends AbstractRelevanceAnalysis<ASGAnnotation>
{

   private List<ASGAnnotation> badSmellOccurrences;

   private List<IBadSmellsStrategy> relevanceStrategies;

   private Map<ASGAnnotation, ComponentCandidate> componentCandidates;


   public RelevantBadSmellsAnalysis(final EList<EObject> contents, final MetricValuesModel metricValuesModel)
   {
      super(metricValuesModel);
      initializeRelevanceStrategiesMap();
      initializeAnnotationMaps(contents);
   }


   private void initializeRelevanceStrategiesMap()
   {
      this.relevanceStrategies = new ArrayList<IBadSmellsStrategy>();
      this.relevanceStrategies.add(new ClassLocationsStrategy());
      this.relevanceStrategies.add(new ExternalAccessesStrategy());
      this.relevanceStrategies.add(new HigherInterfaceAdherenceStrategy());
      this.relevanceStrategies.add(new DataClassCommunicationStrategy());
      this.relevanceValues = new RelevanceResults<ASGAnnotation>(this.relevanceStrategies.size()
            + NUMBER_OF_RESULT_STRATEGIES);
   }


   private void initializeAnnotationMaps(final EList<EObject> contents)
   {
      this.badSmellOccurrences = new ArrayList<ASGAnnotation>();
      for (EObject eObject : contents)
      {
         if (eObject instanceof ASGAnnotation)
         {
            ASGAnnotation annotation = (ASGAnnotation) eObject;
            this.badSmellOccurrences.add(annotation);
         }
      }
      this.badSmellOccurrences = BadSmellOccurrenceUtil.get().filterBadSmellOccurrences(this.badSmellOccurrences);
      this.componentCandidates = new HashMap<ASGAnnotation, ComponentCandidate>();
   }


   @Override
   public void startAnalysis()
   {
      for (int i = 0; i < this.relevanceStrategies.size() + AbstractRelevanceAnalysis.NUMBER_OF_RESULT_STRATEGIES; i++)
      {
         calculateRelevanceValuesForStrategy(i);
         RelevanceAnalysisPlugin.getDefault().log(
               "Bad Smell Occurrences Rating: Finished rating for relevance strategy " + (i + 1) + "/"
                     + (this.relevanceStrategies.size() + AbstractRelevanceAnalysis.NUMBER_OF_RESULT_STRATEGIES) + ".");
      }
      
      
   }


   private void calculateRelevanceValuesForStrategy(final int i)
   {
      for (ASGAnnotation annotation : this.badSmellOccurrences)
      {
         ComponentCandidate compCand = getComponentCandidate(annotation);
         if (compCand != null)
         {
            BadSmellsResultStrategy vectorLengthResultStrategy = new VectorLengthBadSmellsResultStrategy();
            ParetoOptimalBadSmellsResultStrategy paretoOptimalResultStrategy = new ParetoOptimalBadSmellsResultStrategy();
            double relevanceValue = 0;
            if (i < this.relevanceStrategies.size())
            {
               relevanceValue = calculateRelevanceStrategies(i, annotation, compCand);
            }
            else
            {
               relevanceValue = calculateResultStrategies(i, annotation, compCand, vectorLengthResultStrategy,
                     paretoOptimalResultStrategy);
            }
            this.relevanceValues.setRelevanceValue(annotation, i, relevanceValue);
         }
      }
   }


   private double calculateRelevanceStrategies(final int i, final ASGAnnotation annotation,
         final ComponentCandidate compCand)
   {
      return this.relevanceStrategies.get(i).getRelevanceValue(annotation, compCand, this.metricValuesModel);
   }


   private double calculateResultStrategies(final int i, final ASGAnnotation annotation,
         final ComponentCandidate compCand, final BadSmellsResultStrategy vectorLengthResultStrategy,
         final ParetoOptimalBadSmellsResultStrategy paretoOptimalResultStrategy)
   {
      double relevanceValue;
      int firstResultStrategyIndex = this.relevanceStrategies.size();
      if (i == firstResultStrategyIndex)
      {
         vectorLengthResultStrategy.setAnnotation(annotation);
         vectorLengthResultStrategy.setRelevanceResults(this.relevanceValues);
         relevanceValue = vectorLengthResultStrategy.getRelevanceValue(annotation, compCand, this.metricValuesModel);
      }
      else
      {
         paretoOptimalResultStrategy.setAnnotation(annotation);
         paretoOptimalResultStrategy.setRelevanceResults(this.relevanceValues);
         relevanceValue = paretoOptimalResultStrategy.getRelevanceValue(annotation, compCand, this.metricValuesModel);
      }
      return relevanceValue;
   }


   private ComponentCandidate getComponentCandidate(final ASGAnnotation annotation)
   {
      ComponentCandidate cc = this.componentCandidates.get(annotation);
      if (cc == null)
      {
         if (BadSmellOccurrenceUtil.get().getBadSmellName(annotation)
               .equals(Messages.PatternConstants_ILLEGAL_METHOD_ACCESS_BC_PATTERN)
               || BadSmellOccurrenceUtil.get().getBadSmellName(annotation)
                     .equals(Messages.PatternConstants_ILLEGAL_METHOD_ACCESS_PATTERN))
         {
            cc = getComponentCandidateAccordingToInterfaceViolationOccurrence(annotation);
         }
         if (BadSmellOccurrenceUtil.get().getBadSmellName(annotation)
               .equals(Messages.PatternConstants_NON_TO_COMMUNICATION_PATTERN_NAME))
         {
            cc = getComponentCandidateAccordingToNonTOCommunicationOccurrence(annotation);
         }
         this.componentCandidates.put(annotation, cc);
      }
      return cc;
   }


   private ComponentCandidate getComponentCandidateAccordingToNonTOCommunicationOccurrence(
         final ASGAnnotation annotation)
   {
      // GASTClass nonTOClass = (GASTClass) annotation.getAnnotatedElements().get("nonTO").get(0);
      ClassDeclaration calledClass = (ClassDeclaration) annotation.getAnnotatedElements().get(Messages.PatternConstants_CALLED_CLASS_ROLE)
            .get(0);
      ClassDeclaration callingClass = (ClassDeclaration) annotation.getAnnotatedElements().get(Messages.PatternConstants_CALLING_CLASS_ROLE)
            .get(0);
      String calledClassName = calledClass.getName();
      String callingClassName = callingClass.getName();
      for (ComponentCandidate compCand : this.metricValuesModel.getIterations(0).getComponentCandidates())
      {
         EcoreUtil.resolveAll(compCand);
         if (componentContainsClass(compCand.getFirstComponent(), callingClassName)
               && componentContainsClass(compCand.getSecondComponent(), calledClassName))
         {
            return compCand;
         }
      }
      return null;
   }


   private ComponentCandidate getComponentCandidateAccordingToInterfaceViolationOccurrence(
         final ASGAnnotation interfaceViolationAnnotation)
   {
	   Type accessingClassObject = (Type) interfaceViolationAnnotation.getAnnotatedElements()
            .get(Messages.PatternConstants_IV_ACCESSING_CLASS_ROLE).get(0);
      String accessingClassName = accessingClassObject.getName();
      Type accessedMethodOwnerObject = (Type) interfaceViolationAnnotation.getAnnotatedElements()
            .get(Messages.PatternConstants_IV_ACCESSED_METHOD_OWNER_ROLE).get(0);
      String accessedMethodOwnerName = accessedMethodOwnerObject.getName();
      for (ComponentCandidate compCand : this.metricValuesModel.getIterations(0).getComponentCandidates())
      {
         EcoreUtil.resolveAll(compCand);
         if (componentContainsClass(compCand.getFirstComponent(), accessingClassName)
               && componentContainsClass(compCand.getSecondComponent(), accessedMethodOwnerName))
         {
            return compCand;
         }
      }
      return null;
   }


   private boolean componentContainsClass(final Component component, final String className)
   {
      EcoreUtil.resolveAll(component);
      for (Type clazz : component.getClasses())
      {
         EcoreUtil.resolveAll(clazz);
         if (clazz.getName().equals(className))
         {
            return true;
         }
      }
      return false;
   }

}
