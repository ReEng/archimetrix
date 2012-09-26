package org.archimetrix.architectureprognosis;


import java.util.ArrayList;
import java.util.List;

import org.archimetrix.architectureprognosis.util.RepositoryLoader;
import org.eclipse.emf.ecore.util.EcoreUtil;

import eu.qimpress.samm.staticstructure.ComponentType;
import eu.qimpress.samm.staticstructure.PrimitiveComponent;
import eu.qimpress.samm.staticstructure.Repository;
import eu.qimpress.sourcecodedecorator.SourceCodeDecoratorRepository;


/**
 * This class controls the architecture prognosis calculations. It collects the required data and
 * transfers it into the format required for the UI.
 * 
 * FIXME: This class should use a better data structure instead of providing exactly what the
 * Architecture View needs so that in the future, other user interfaces also benefit from it. The
 * formatting into the format that is required for the Architecture View should be handled in the
 * according UI plug-in.
 * 
 * @author mcp
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 * 
 */
public class ArchitecturePrognosisCalculator
{
   private static final String TOTAL_COMPONENTS_LINE_TITLE = "Total Number of Components";

   private static final String COMPOSITE_COMPONENTS_LINE_TITLE = "Number of Composite Components";

   private static final String PRIMITIVE_COMPONENTS_LINE_TITLE = "Number of Primitive Components";

   private static final String INTERFACES_LINE_TITLE = "Total Number of Interfaces";

   private static final String MESSAGE_LINE_TITLE = "Total Number of Messages";

   private final Repository originalSammRep;

   private final Repository newSammRep;

   // used to collect the data shown in the line "total components" in the architecture prognosis
   // view
   private List<String> totalComponentsLine;

   // used to collect the data shown in the line "primitive components" in the architecture
   // prognosis view
   private List<String> primitiveComponentsLine;

   // used to collect the data shown in the line "composite components" in the architecture
   // prognosis view
   private List<String> compositeComponentsLine;

   // used to collect the data shown in the line "interfaces" in the architecture prognosis view
   private List<String> interfacesLine;

   // used to collect the data shown in the line "messages" in the architecture prognosis view
   private List<String> messagesLine;

   // contains all lines required for the architecture prognosis view and will be returned when
   // executing the architecture prognosis
   private List<List<String>> allLines;


   /**
    * @param originalSCDM The source code decorator model from the original architecture created in
    *           the clustering.
    * @param newSCDM The source code decorator model from the clustering executed on the
    *           reengineered system.
    */
   public ArchitecturePrognosisCalculator(final SourceCodeDecoratorRepository originalSCDM,
         final SourceCodeDecoratorRepository newSCDM)
   {
      this.originalSammRep = RepositoryLoader.loadSammRep(originalSCDM);
      this.newSammRep = RepositoryLoader.loadSammRep(newSCDM);
      initializeContentsLists();
   }


   public Repository getOriginalSammRep()
   {
      return this.originalSammRep;
   }


   public Repository getNewSammRep()
   {
      return this.newSammRep;
   }


   private void initializeContentsLists()
   {
      this.allLines = new ArrayList<List<String>>();
      this.totalComponentsLine = new ArrayList<String>();
      this.allLines.add(this.totalComponentsLine);
      this.primitiveComponentsLine = new ArrayList<String>();
      this.allLines.add(this.primitiveComponentsLine);
      this.compositeComponentsLine = new ArrayList<String>();
      this.allLines.add(this.compositeComponentsLine);
      this.interfacesLine = new ArrayList<String>();
      this.allLines.add(this.interfacesLine);
      this.messagesLine = new ArrayList<String>();
      this.allLines.add(this.messagesLine);
   }


   /**
    * Starts the architecture prognosis.
    * 
    * @return The data required for the Architecture Prognosis View.
    */
   public List<List<String>> start()
   {
      EcoreUtil.resolveAll(this.originalSammRep);
      List<ComponentType> oldComponentTypes = this.originalSammRep.getComponenttype();
      List<ComponentType> newComponentTypes = this.newSammRep.getComponenttype();

      calcTotalComponents(oldComponentTypes, newComponentTypes);
      calcPrimitiveAndCompositeComponents(oldComponentTypes, newComponentTypes);
      calcInterfaces();
      calcMessages();

      return this.allLines;
   }


   /**
    * Get the number of total messages and transfers it into the format required for the ui.
    */
   private void calcMessages()
   {
      this.messagesLine.add(MESSAGE_LINE_TITLE);
      this.messagesLine.add(String.valueOf(this.originalSammRep.getMessagetype().size()));
      this.messagesLine.add(String.valueOf(this.newSammRep.getMessagetype().size()));
   }


   /**
    * Gets the number of total interfaces and transfers it into the format required for the ui.
    */
   private void calcInterfaces()
   {
      this.interfacesLine.add(INTERFACES_LINE_TITLE);
      this.interfacesLine.add(String.valueOf(this.originalSammRep.getInterface().size()));
      this.interfacesLine.add(String.valueOf(this.newSammRep.getInterface().size()));
   }


   /**
    * Calculates the numbers of primitive and composite components and transfers it into the format
    * required for the ui.
    * 
    * @param oldComponentTypes the components from the original architecture
    * @param newComponentTypes the components from the predicted architecture
    */
   private void calcPrimitiveAndCompositeComponents(final List<ComponentType> oldComponentTypes,
         final List<ComponentType> newComponentTypes)
   {
      int oldPrimitives = countPrimitiveComponents(oldComponentTypes);
      int newPrimitives = countPrimitiveComponents(newComponentTypes);
      
      this.primitiveComponentsLine.add(PRIMITIVE_COMPONENTS_LINE_TITLE);
      this.primitiveComponentsLine.add(String.valueOf(oldPrimitives));
      this.primitiveComponentsLine.add(String.valueOf(newPrimitives));
      
      this.compositeComponentsLine.add(COMPOSITE_COMPONENTS_LINE_TITLE);
      this.compositeComponentsLine.add(String.valueOf(oldComponentTypes.size() - oldPrimitives));
      this.compositeComponentsLine.add(String.valueOf(newComponentTypes.size() - newPrimitives));
   }


   /**
    * Counts the number of primitive components in a list of components.
    * 
    * @param componentTypes a list of components.
    * @return the number of primitive components.
    */
   private int countPrimitiveComponents(final List<ComponentType> componentTypes)
   {
      int primitives = 0;
      for (ComponentType componentType : componentTypes)
      {
         if (componentType instanceof PrimitiveComponent)
         {
            primitives++;
         }
      }
      return primitives;
   }


   /**
    * Get the number of total components and transfers it into the format required for the ui.
    * 
    * @param oldComponentTypes the components from the original architecture
    * @param newComponentTypes the components from the predicted architecture
    */
   private void calcTotalComponents(final List<ComponentType> oldComponentTypes, final List<ComponentType> newComponentTypes)
   {
      this.totalComponentsLine.add(TOTAL_COMPONENTS_LINE_TITLE);
      this.totalComponentsLine.add(String.valueOf(oldComponentTypes.size()));
      this.totalComponentsLine.add(String.valueOf(newComponentTypes.size()));
   }
}
