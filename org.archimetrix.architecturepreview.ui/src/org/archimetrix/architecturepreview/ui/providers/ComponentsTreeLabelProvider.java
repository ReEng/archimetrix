package org.archimetrix.architecturepreview.ui.providers;

import java.util.List;

import org.archimetrix.architecturepreview.ui.ArchitecturePreviewUIPlugin;
import org.archimetrix.architecturepreview.ui.util.ComponentsUtil;
import org.archimetrix.architecturepreview.ui.views.ArchitecturePreviewView;
import org.eclipse.gmt.modisco.java.ClassDeclaration;
import org.eclipse.gmt.modisco.java.Type;
import org.eclipse.jface.viewers.ITableColorProvider;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Tree;
import org.somox.sourcecodedecorator.ComponentImplementingClassesLink;

import de.uka.ipd.sdq.pcm.repository.BasicComponent;
import de.uka.ipd.sdq.pcm.repository.CompositeComponent;
import de.uka.ipd.sdq.pcm.repository.Repository;
import de.uka.ipd.sdq.pcm.repository.RepositoryComponent;

/**
 * This class provides the labels for the two component trees in the Architecture Prognosis View.
 * For the settings of the colors, it uses the ComponentsTreeColorProvider.
 * 
 * @author mcp
 * 
 */
public class ComponentsTreeLabelProvider extends LabelProvider implements ITableLabelProvider, ITableColorProvider {

    /**
     * Gast class icon path.
     */
    private static final String GASTCLASS_ICON_PATH = "./icons/class.png";

    /**
     * Primitive component icon path.
     */
    private static final String PRIMITIVE_COMPONENT_ICON_PATH = "./icons/primitivecomponent.png";

    /**
     * Composite component path.
     */
    private static final String COMPOSITE_COMPONENT_ICON_PATH = "./icons/compositecomponent.png";

    /**
     * String: nowhere.
     */
    private static final String NOWHERE_STRING = "nowhere";

    /**
     * String: classes.
     */
    private static final String CLASSES_STRING = "classes";

    /**
     * String: components.
     */
    private static final String COMPONENTS_STRING = "components";

    /**
     * Architecture preview view.
     */
    private final ArchitecturePreviewView architecturePreviewView;

    /**
     * New Components tree.
     */
    private Tree newComponentsTree;

    /**
     * Original components tree.
     */
    private Tree originalComponentsTree;

    /**
     * Components tree color provider.
     */
    private final ComponentsTreeColorProvider componentsTreeColorProvider;

    /**
     * the constructor.
     * @param architecturePreviewView architecture preview view
     */
    public ComponentsTreeLabelProvider(final ArchitecturePreviewView architecturePreviewView) {
        this.architecturePreviewView = architecturePreviewView;
        this.componentsTreeColorProvider = new ComponentsTreeColorProvider(this);
    }

    @Override
    public String getText(final Object element) {
        if (element instanceof BasicComponent) // PrimitiveComponent changed to BasicComponent
        {
            return getTextForPrimitiveComponent(element);
        } else if (element instanceof CompositeComponent) {
            return getTextForCompositeComponent(element);
        } else if (element instanceof Type) {
            return getTextForGASTClass(element);
        }
        return null;
    }

    /**
     * Returns gast class name.
     * @param element element
     * @return name
     */
    private String getTextForGASTClass(final Object element) {
        ClassDeclaration gastClass = (ClassDeclaration) element;
        RepositoryComponent currentComponent = isFromNewArchitecture(gastClass); // ComponentType
                                                                                 // changed to
                                                                                 // RepositoryComponent
        if (currentComponent != null) {
            RepositoryComponent originalComponent = getComponentFromOriginalArchitecture(gastClass); // ComponentType
                                                                                                     // changed
                                                                                                     // to
                                                                                                     // RepositoryComponent
            if (originalComponent != null
                    && !originalComponentAccordsToNewComponent(originalComponent, currentComponent)) {
                this.componentsTreeColorProvider.layoutBackgroundOfGASTClass(gastClass);
                return gastClass.getName() + getOriginalLocationString(gastClass, originalComponent);
            }
        }
        return gastClass.getName();
    }

    /**
     * Returns new components tree.
     * @return new components tree
     */
    public Tree getNewComponentsTree() {
        if (this.newComponentsTree == null) {
            this.newComponentsTree = this.architecturePreviewView.getNewComponentsTree().getTree();
        }
        return this.newComponentsTree;
    }

    /**
     * Returns text for composite component.
     * @param element element
     * @return text
     */
    private String getTextForCompositeComponent(final Object element) {
        CompositeComponent compositeComponent = (CompositeComponent) element;
        setColors(element, compositeComponent);
        return ((RepositoryComponent) element).getEntityName()
                + getCompositeComponentsSizeDescription(compositeComponent); // ComponentType
                                                                             // changed to
                                                                             // RepositoryComponent
    }

    /**
     * Returns text for primitive component.
     * @param element element
     * @return text
     */
    private String getTextForPrimitiveComponent(final Object element) {
        BasicComponent primitiveComponent = (BasicComponent) element; // PrimitiveComponent changed
                                                                      // to BasicComponent
        setColors(element, primitiveComponent);
        return primitiveComponent.getEntityName() + getPrimitiveComponentSizeDescription(primitiveComponent);
    }

    /**
     * Sets the colors.
     * @param element element
     * @param component repository component
     */
    private void setColors(final Object element, final RepositoryComponent component) // ComponentType
                                                                                      // changed to
                                                                                      // RepositoryComponent
    {
        boolean isFromOriginalArchitecture = isFromOriginalArchitecture(component);
        boolean isFromNewArchitecture = isFromNewArchitecture(component);
        RepositoryComponent componentFromNewArchitecture = getComponentFromNewArchitecture(component); // ComponentType
                                                                                                       // changed
                                                                                                       // to
                                                                                                       // RepositoryComponent
        RepositoryComponent componentFromOriginalArchitecture = getComponentFromOriginalArchitecture(component); // ComponentType
                                                                                                                 // changed
                                                                                                                 // to
                                                                                                                 // RepositoryComponent
        this.componentsTreeColorProvider.layoutRedLines(element, isFromOriginalArchitecture,
                componentFromNewArchitecture);
        this.componentsTreeColorProvider.layoutGreenLines(element, isFromNewArchitecture,
                componentFromOriginalArchitecture);
        this.componentsTreeColorProvider.layoutBackgroundOfComponents(element, component, isFromOriginalArchitecture,
                isFromNewArchitecture, componentFromNewArchitecture, componentFromOriginalArchitecture);
    }

    /**
     * Returns original components tree.
     * @return original components tree
     */
    public Tree getOriginalComponentsTree() {
        if (this.originalComponentsTree == null) {
            this.originalComponentsTree = this.architecturePreviewView.getOriginalComponentsTree().getTree();
        }
        return this.originalComponentsTree;
    }

    /**
     * Checks if component values differ.
     * @param originalComponent original component
     * @param newComponent new component
     * @return bool decision value
     */
    public boolean componentValuesDiffer(final RepositoryComponent originalComponent,
            final RepositoryComponent newComponent) // ComponentType changed to RepositoryComponent
    {
        if (originalComponent instanceof BasicComponent && newComponent instanceof BasicComponent) // PrimitiveComponent
                                                                                                   // changed
                                                                                                   // to
                                                                                                   // BasicComponent
        {
            return !getPrimitiveComponentSizeDescription((BasicComponent) originalComponent).equals(
                    getPrimitiveComponentSizeDescription((BasicComponent) newComponent));
        } else if (originalComponent instanceof CompositeComponent && newComponent instanceof CompositeComponent) {
            return !getCompositeComponentsSizeDescription((CompositeComponent) originalComponent).equals(
                    getCompositeComponentsSizeDescription((CompositeComponent) newComponent));
        }
        return false;
    }

    /**
     * Checks if original component accords to new component.
     * @param originalComponent original component
     * @param currentComponent new component
     * @return bool decision value
     */
    private boolean originalComponentAccordsToNewComponent(final RepositoryComponent originalComponent, // ComponentType
                                                                                                        // changed
                                                                                                        // to
                                                                                                        // RepositoryComponent
            final RepositoryComponent currentComponent) {
        if (currentComponent != null && originalComponent != null) {
            return ComponentsUtil.get().createShortComponentName(currentComponent)
                    .equals(ComponentsUtil.get().createShortComponentName(originalComponent));
        }
        return false;
    }

    /**
     * Checks if element is from new architecture.
     * @param element element to be checked
     * @return bool decision value
     */
    private RepositoryComponent isFromNewArchitecture(final Type element) {
        Repository newSamm = this.architecturePreviewView.getNewSamm();
        List<RepositoryComponent> components = newSamm.getComponents__Repository();
        for (RepositoryComponent componentType : components) {
            if (componentType instanceof BasicComponent) {
                BasicComponent component = ((BasicComponent) componentType);
                ComponentImplementingClassesLink link = ComponentsUtil.get()
                        .getComponentImplementingClassesLinkForComponent(component);
                if (link != null) {
                    List<Type> classes = link.getImplementingClasses();
                    for (Type gastClass : classes) {
                        if (gastClass == element) {
                            return component;
                        }
                    }
                }
            }
        }
        return null;
    }

    /**
     * Checks if element is from new architecture.
     * @param element element to be checked
     * @return bool decision value
     */
    private boolean isFromNewArchitecture(final RepositoryComponent element) {
        Repository newSamm = this.architecturePreviewView.getNewSamm();
        if (newSamm != null) {
            List<RepositoryComponent> components = newSamm.getComponents__Repository();
            for (RepositoryComponent componentType : components) {
                if (componentType == element) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Checks if element is from original architecture.
     * @param element element to be checked
     * @return bool decision value
     */
    private boolean isFromOriginalArchitecture(final RepositoryComponent element) {
        Repository originalSamm = this.architecturePreviewView.getOriginalSamm();
        if (originalSamm != null) {
            List<RepositoryComponent> components = originalSamm.getComponents__Repository();
            for (RepositoryComponent componentType : components) {
                if (componentType == element) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Returns original location .
     * @param element element
     * @param component repository component
     * @return original location string
     */
    private String getOriginalLocationString(final Type element, final RepositoryComponent component) {
        StringBuilder text = new StringBuilder(" (was ");
        if (component != null) {
            text.append("in ");
            String componentName = ComponentsUtil.get().createShortComponentName(component);
            text.append(componentName);
        } else {
            text.append(NOWHERE_STRING);
        }
        text.append(")");
        return text.toString();
    }

    /**
     * Returns component from original architecture.
     * @param element element
     * @return repository component
     */
    private RepositoryComponent getComponentFromOriginalArchitecture(final Type element) {
        Repository originalSamm = this.architecturePreviewView.getOriginalSamm();
        List<RepositoryComponent> components = originalSamm.getComponents__Repository();
        for (RepositoryComponent componentType : components) {
            if (componentType instanceof BasicComponent) {
                BasicComponent component = ((BasicComponent) componentType);
                ComponentImplementingClassesLink link = ComponentsUtil.get()
                        .getComponentImplementingClassesLinkForComponent(component);
                if (link != null) {
                    List<Type> classes = link.getImplementingClasses();
                    for (Type gastClass : classes) {
                        if (gastClass.getName().equals(element.getName())) {
                            return component;
                        }
                    }
                }
            }
        }
        return null;
    }

    /**
     * Returns component from original architecture.
     * @param element element
     * @return repository component
     */
    private RepositoryComponent getComponentFromOriginalArchitecture(final RepositoryComponent element) {
        Repository originalSamm = this.architecturePreviewView.getOriginalSamm();
        return findComponentInRepo(element, originalSamm);
    }

    /**
     * Returns component from new architecture.
     * @param element element
     * @return repository component
     */
    private RepositoryComponent getComponentFromNewArchitecture(final RepositoryComponent element) {
        Repository newSamm = this.architecturePreviewView.getNewSamm();
        return findComponentInRepo(element, newSamm);
    }

    /**
     * Returns component from repository.
     * @param element element
     * @param samm repository
     * @return repository component
     */
    private RepositoryComponent findComponentInRepo(final RepositoryComponent element, final Repository samm) {
        if (samm != null) {
            List<RepositoryComponent> components = samm.getComponents__Repository();
            for (RepositoryComponent componentType : components) {
                if (originalComponentAccordsToNewComponent(componentType, element)) {
                    return componentType;
                }
            }
        }
        return null;
    }

    /**
     * Returns composite components size description.
     * @param element element
     * @return description
     */
    private String getCompositeComponentsSizeDescription(final CompositeComponent element) {
        int size = element.getAssemblyContexts__ComposedStructure().size(); // count the components
                                                                            // in the Composite
                                                                            // component????
        return createSizeDescription(size, COMPONENTS_STRING);
    }

    /**
     * Returns primitive component size description.
     * @param element element
     * @return description
     */
    private String getPrimitiveComponentSizeDescription(final BasicComponent element) {
        ComponentImplementingClassesLink link = ComponentsUtil.get().getComponentImplementingClassesLinkForComponent(
                element);
        if (link != null) {
            int size = link.getImplementingClasses().size();
            return createSizeDescription(size, CLASSES_STRING);
        }
        return "";
    }

    // TODO: use Format Method!!
    /**
     * Returns size description.
     * @param size size
     * @param classification classification
     * @return description
     */
    private String createSizeDescription(final int size, final String classification) {
        StringBuilder numberOfString = new StringBuilder(" (");
        numberOfString.append(size);
        numberOfString.append(" ");
        numberOfString.append(classification);
        numberOfString.append(")");
        return numberOfString.toString();
    }

    @Override
    public String getColumnText(final Object element, final int columnIndex) {
        return null;
    }

    @Override
    public Color getBackground(final Object element, final int columnIndex) {
        return this.componentsTreeColorProvider.getBackground(element, columnIndex);
    }

    @Override
    public Color getForeground(final Object element, final int columnIndex) {
        return this.componentsTreeColorProvider.getForeground();
    }

    @Override
    public Image getColumnImage(final Object element, final int columnIndex) {
        return null;
    }

    @Override
    public Image getImage(final Object element) {
        if (element instanceof CompositeComponent) {
            return ArchitecturePreviewUIPlugin.getImageDescriptor(COMPOSITE_COMPONENT_ICON_PATH).createImage();
        } else if (element instanceof BasicComponent) {
            return ArchitecturePreviewUIPlugin.getImageDescriptor(PRIMITIVE_COMPONENT_ICON_PATH).createImage();
        } else if (element instanceof Type) {
            return ArchitecturePreviewUIPlugin.getImageDescriptor(GASTCLASS_ICON_PATH).createImage();
        }
        return null;
    }

}
