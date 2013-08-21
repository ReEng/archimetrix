package org.archimetrix.architecturepreview;

import java.util.ArrayList;
import java.util.List;

import org.somox.sourcecodedecorator.SourceCodeDecoratorRepository;

/**
 * This class aggregates all data from ArchitecturePreviewDataFormatHelper
 * into one object which is used for the ui.
 * @author Goran Piskachev
 *
 */
public class UIDataFormatter {

    
    /**
     * Data object that contains all lines required 
     * for the architecture preview view and will be returned when
     * executing the architecture preview.
     */
    private List<List<String>> allLines;
    
    /**
     * DataFormatHelper, which contains all required lists for the ui.
     */
    private ArchitecturePreviewDataFormatHelper dataHelper;
    
    /**
     * Get method for the ArchitecturePreviewDataFormatHelper.
     * @return ArchitecturePreviewDataFormatHelper
     */
    public ArchitecturePreviewDataFormatHelper getArchitecturePreviewDataFormatHelper() {
        return dataHelper;
    }

    /**
     * Get method for the date object with all lists.
     * 
     * @return The data required for the Architecture Preview View.
     */
    public List<List<String>> getDataForArchitecturePreview() {
        return this.allLines;
    }
    
    /**
     * The constructor.
     * @param originalSCDM
     *            The source code decorator model from the original 
     *            architecture created in the clustering.
     * @param newSCDM
     *            The source code decorator model from the clustering 
     *            executed on the reengineered system.
     */
    public UIDataFormatter(final SourceCodeDecoratorRepository originalSCDM,
            final SourceCodeDecoratorRepository newSCDM) {
        dataHelper = new ArchitecturePreviewDataFormatHelper(originalSCDM, newSCDM);
        aggregateListData();
    }
    
    /**
     * Gets all lists from the data helper and adds them in to the data object.
     */
    private void aggregateListData() {
        this.allLines = new ArrayList<List<String>>();
        this.allLines.add(dataHelper.getTotalComponentsLine());
        this.allLines.add(dataHelper.getPrimitiveComponentsLine());
        this.allLines.add(dataHelper.getCompositeComponentsLine());
        this.allLines.add(dataHelper.getInterfacesLine());
        this.allLines.add(dataHelper.getMessagesLine());
    }
    
}
