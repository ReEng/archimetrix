package org.archimetrix.architecturepreview;

import java.util.ArrayList;
import java.util.List;

import org.archimetrix.architecturepreview.util.RepositoryLoader;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.somox.sourcecodedecorator.SourceCodeDecoratorRepository;

import de.uka.ipd.sdq.pcm.repository.BasicComponent;
import de.uka.ipd.sdq.pcm.repository.Repository;
import de.uka.ipd.sdq.pcm.repository.RepositoryComponent;

/**
 * This class collects, calculates and stores data
 * which can be used by other classes. 
 * 
 * @author mcp
 * @author Goran Piskachev
 * 
 */
public class ArchitecturePreviewDataFormatHelper {

    /**
     * The original Samm repository.
     */
    private final Repository originalSammRep;

    /**
     * The new Samm repository.
     */
    private final Repository newSammRep;

    /**
     * used to collect the data shown in the line "total components"
     * in the architecture preview view.
     */
    private List<String> totalComponentsLine;

    /**
     * used to collect the data shown in the line "primitive components"
     * in the architecture preview view.
     */
    private List<String> primitiveComponentsLine;

    /**
     * used to collect the data shown in the line "composite components"
     * in the architecture preview view.
     */
    private List<String> compositeComponentsLine;
 
    /**
     * used to collect the data shown in the line "interfaces"
     * in the architecture preview view.
     */
    private List<String> interfacesLine;
  
    /**
     * used to collect the data shown in the line "messages"
     * in the architecture preview view.
     */
    private List<String> messagesLine;

    /**
     * Get method for all component list.
     * @return list of strings of all components
     */
    public List<String> getTotalComponentsLine() {
        return this.totalComponentsLine;
    }
    
    /**
     * Get method for primitive component list.
     * @return list of strings of primitive components
     */
    public List<String> getPrimitiveComponentsLine() {
        return this.primitiveComponentsLine;
    }
    
    /**
     * Get method for composite component list.
     * @return list of strings of composite components
     */
    public List<String> getCompositeComponentsLine() {
        return this.compositeComponentsLine;
    }
    
    /**
     * Get method for interfaces list.
     * @return list of strings of interfaces
     */
    public List<String> getInterfacesLine() {
        return this.interfacesLine;
    }
    
    /**
     * Get method for messages list.
     * @return list of strings of messages
     */
    public List<String> getMessagesLine() {
        return this.messagesLine;
    }
    
    /**
     * The Constructor.
     * @param originalSCDM
     *            The source code decorator model from the original 
     *            architecture created in the clustering.
     * @param newSCDM
     *            The source code decorator model from the clustering 
     *            executed on the reengineered system.
     */
    public ArchitecturePreviewDataFormatHelper(final SourceCodeDecoratorRepository originalSCDM,
            final SourceCodeDecoratorRepository newSCDM) {
        this.originalSammRep = RepositoryLoader.loadSammRep(originalSCDM);
        this.newSammRep = RepositoryLoader.loadSammRep(newSCDM);
        initializeContentsLists();
        calculate();
    }
    
    /**
     * Get method for original samm repository.
     * @return original samm repository
     */
    public Repository getOriginalSammRep() {
        return this.originalSammRep;
    }
    
    /**
     * Get method for new samm repository.
     * @return new samm repository
     */
    public Repository getNewSammRep() {
        return this.newSammRep;
    }
    
    /**
     * Initialisation of all lists.
     */
    private void initializeContentsLists() {

        this.totalComponentsLine = new ArrayList<String>();
        this.primitiveComponentsLine = new ArrayList<String>();
        this.compositeComponentsLine = new ArrayList<String>();
        this.interfacesLine = new ArrayList<String>();
        this.messagesLine = new ArrayList<String>();
    }

    /**
     * Calculates the architecture preview lists.
     */
    public void calculate() {
        EcoreUtil.resolveAll(this.originalSammRep);
        List<RepositoryComponent> oldComponentTypes = this.originalSammRep.getComponents__Repository();
        List<RepositoryComponent> newComponentTypes = this.newSammRep.getComponents__Repository();

        calcTotalComponents(oldComponentTypes, newComponentTypes);
        calcPrimitiveComponents(oldComponentTypes, newComponentTypes);
        calcCompositeComponents(oldComponentTypes, newComponentTypes);
        calcInterfaces();
        calcMessages();

    }

    /**
     * Gets the number of total messages and transfers it into
     * the format required for the ui.
     */
    private void calcMessages() {
        this.messagesLine.add(Messages.ArchitecturePreviewCalculator_MESSAGE_LINE_TITLE);
        this.messagesLine.add(String.valueOf(this.originalSammRep.getDataTypes__Repository().size()));
        this.messagesLine.add(String.valueOf(this.newSammRep.getDataTypes__Repository().size()));
    }

    /**
     * Gets the number of total interfaces and transfers it into
     * the format required for the ui.
     */
    private void calcInterfaces() {
        this.interfacesLine.add(Messages.ArchitecturePreviewCalculator_INTERFACES_LINE_TITLE);
        this.interfacesLine.add(String.valueOf(this.originalSammRep.getInterfaces__Repository().size()));
        this.interfacesLine.add(String.valueOf(this.newSammRep.getInterfaces__Repository().size()));
    }

    /**
     * Calculates the numbers of composite 
     * components and transfers it into the format
     * required for the ui.
     * 
     * @param oldComponentTypes
     *            the components from the original architecture
     * @param newComponentTypes
     *            the components from the predicted architecture
     */
    private void calcCompositeComponents(final List<RepositoryComponent> oldComponentTypes,
            final List<RepositoryComponent> newComponentTypes) {
        int oldPrimitives = countPrimitiveComponents(oldComponentTypes);
        int newPrimitives = countPrimitiveComponents(newComponentTypes);

        this.compositeComponentsLine.add(Messages.ArchitecturePreviewCalculator_COMPOSITE_COMPONENTS_LINE_TITLE);
        this.compositeComponentsLine.add(String.valueOf(oldComponentTypes.size() - oldPrimitives));
        this.compositeComponentsLine.add(String.valueOf(newComponentTypes.size() - newPrimitives));
    }
    
    /**
     * Calculates the numbers of primitive 
     * components and transfers it into the format
     * required for the ui.
     * 
     * @param oldComponentTypes
     *            the components from the original architecture
     * @param newComponentTypes
     *            the components from the predicted architecture
     */
    private void calcPrimitiveComponents(final List<RepositoryComponent> oldComponentTypes,
            final List<RepositoryComponent> newComponentTypes) {

        int oldPrimitives = countPrimitiveComponents(oldComponentTypes);
        int newPrimitives = countPrimitiveComponents(newComponentTypes);

        this.primitiveComponentsLine.add(Messages.ArchitecturePreviewCalculator_PRIMITIVE_COMPONENTS_LINE_TITLE);
        this.primitiveComponentsLine.add(String.valueOf(oldPrimitives));
        this.primitiveComponentsLine.add(String.valueOf(newPrimitives));
    }

    /**
     * Counts the number of primitive components in a 
     * list of components.
     * 
     * @param componentTypes
     *            a list of components.
     * @return the number of primitive components.
     */
    private int countPrimitiveComponents(final List<RepositoryComponent> componentTypes) {
        int primitives = 0;
        for (RepositoryComponent componentType : componentTypes) {
            if (componentType instanceof BasicComponent) {
                primitives++;
            }
        }
        return primitives;
    }

    /**
     * Get the number of total components and transfers it 
     * into the format required for the ui.
     * 
     * @param oldComponentTypes
     *            the components from the original architecture
     * @param newComponentTypes
     *            the components from the predicted architecture
     */
    private void calcTotalComponents(final List<RepositoryComponent> oldComponentTypes,
            final List<RepositoryComponent> newComponentTypes) {
        this.totalComponentsLine.add(Messages.ArchitecturePreviewCalculator_TOTAL_COMPONENTS_LINE_TITLE);
        this.totalComponentsLine.add(String.valueOf(oldComponentTypes.size()));
        this.totalComponentsLine.add(String.valueOf(newComponentTypes.size()));
       
    }
}
