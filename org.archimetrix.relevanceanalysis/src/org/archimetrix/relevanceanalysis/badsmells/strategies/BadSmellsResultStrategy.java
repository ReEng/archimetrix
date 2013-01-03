package org.archimetrix.relevanceanalysis.badsmells.strategies;


import org.archimetrix.relevanceanalysis.RelevanceResults;
import org.reclipse.structure.inference.annotations.ASGAnnotation;


/**
 * A super class for result strategies of the bad smell relevance analysis.
 * 
 * @author mcp
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 * 
 */
public abstract class BadSmellsResultStrategy implements IBadSmellsStrategy
{
   private ASGAnnotation annotation;


   public ASGAnnotation getAnnotation()
   {
      return this.annotation;
   }


   public void setAnnotation(final ASGAnnotation annotation)
   {
      this.annotation = annotation;
   }


   protected RelevanceResults<ASGAnnotation> relevanceResults;


   public void setRelevanceResults(RelevanceResults<ASGAnnotation> relevanceResults)
   {
      this.relevanceResults = relevanceResults;
   }

}
