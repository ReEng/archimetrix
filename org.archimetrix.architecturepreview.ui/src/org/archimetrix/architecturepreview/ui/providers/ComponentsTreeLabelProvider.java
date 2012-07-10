package org.archimetrix.architecturepreview.ui.providers;


import java.util.List;

import org.archimetrix.architecturepreview.ui.ArchitecturePreviewUIPlugin;
import org.archimetrix.architecturepreview.ui.util.ComponentsUtil;
import org.archimetrix.architecturepreview.ui.views.ArchitecturePreviewView;
import org.eclipse.jface.viewers.ITableColorProvider;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Tree;

import de.fzi.gast.types.GASTClass;
import eu.qimpress.samm.staticstructure.ComponentType;
import eu.qimpress.samm.staticstructure.CompositeComponent;
import eu.qimpress.samm.staticstructure.PrimitiveComponent;
import eu.qimpress.samm.staticstructure.Repository;
import eu.qimpress.sourcecodedecorator.ComponentImplementingClassesLink;


/**
 * This class provides the labels for the two component trees in the Architecture Preview View.
 * For the settings of the colors, it uses the ComponentsTreeColorProvider.
 * 
 * @author mcp
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 * 
 */
public class ComponentsTreeLabelProvider extends LabelProvider implements ITableLabelProvider, ITableColorProvider
{

   private static final String GASTCLASS_ICON_PATH = "./icons/class.png";

   private static final String PRIMITIVE_COMPONENT_ICON_PATH = "./icons/primitivecomponent.png";

   private static final String COMPOSITE_COMPONENT_ICON_PATH = "./icons/compositecomponent.png";

   private static final String NOWHERE_STRING = "nowhere";

   private static final String CLASSES_STRING = "classes";

   private static final String COMPONENTS_STRING = "components";

   private final ArchitecturePreviewView architecturePreviewView;

   private Tree newComponentsTree;

   private Tree originalComponentsTree;

   private final ComponentsTreeColorProvider componentsTreeColorProvider;


   public ComponentsTreeLabelProvider(final ArchitecturePreviewView architecturePreviewView)
   {
      this.architecturePreviewView = architecturePreviewView;
      this.componentsTreeColorProvider = new ComponentsTreeColorProvider(this);
   }


   @Override
   public String getText(final Object element)
   {
      if (element instanceof PrimitiveComponent)
      {
         return getTextForPrimitiveComponent(element);
      }
      else if (element instanceof CompositeComponent)
      {
         return getTextForCompositeComponent(element);
      }
      else if (element instanceof GASTClass)
      {
         return getTextForGASTClass(element);
      }
      return null;
   }


   private String getTextForGASTClass(final Object element)
   {
      GASTClass gastClass = (GASTClass) element;
      ComponentType currentComponent = isFromNewArchitecture(gastClass);
      if (currentComponent != null)
      {
         ComponentType originalComponent = getComponentFromOriginalArchitecture(gastClass);
         if (originalComponent != null && !originalComponentAccordsToNewComponent(originalComponent, currentComponent))
         {
            this.componentsTreeColorProvider.layoutBackgroundOfGASTClass(gastClass);
            return gastClass.getQualifiedName() + getOriginalLocationString(gastClass, originalComponent);
         }
      }
      return gastClass.getQualifiedName();
   }


   public Tree getNewComponentsTree()
   {
      if (this.newComponentsTree == null)
      {
         this.newComponentsTree = this.architecturePreviewView.getNewComponentsTree().getTree();
      }
      return this.newComponentsTree;
   }


   private String getTextForCompositeComponent(final Object element)
   {
      CompositeComponent compositeComponent = (CompositeComponent) element;
      setColors(element, compositeComponent);
      return ((ComponentType) element).getName() + getCompositeComponentsSizeDescription(compositeComponent);
   }


   private String getTextForPrimitiveComponent(final Object element)
   {
      PrimitiveComponent primitiveComponent = (PrimitiveComponent) element;
      setColors(element, primitiveComponent);
      return primitiveComponent.getName() + getPrimitiveComponentSizeDescription(primitiveComponent);
   }


   private void setColors(final Object element, final ComponentType component)
   {
      boolean isFromOriginalArchitecture = isFromOriginalArchitecture(component);
      boolean isFromNewArchitecture = isFromNewArchitecture(component);
      ComponentType componentFromNewArchitecture = getComponentFromNewArchitecture(component);
      ComponentType componentFromOriginalArchitecture = getComponentFromOriginalArchitecture(component);
      this.componentsTreeColorProvider
            .layoutRedLines(element, isFromOriginalArchitecture, componentFromNewArchitecture);
      this.componentsTreeColorProvider.layoutGreenLines(element, isFromNewArchitecture,
            componentFromOriginalArchitecture);
      this.componentsTreeColorProvider.layoutBackgroundOfComponents(element, component, isFromOriginalArchitecture,
            isFromNewArchitecture, componentFromNewArchitecture, componentFromOriginalArchitecture);
   }


   public Tree getOriginalComponentsTree()
   {
      if (this.originalComponentsTree == null)
      {
         this.originalComponentsTree = this.architecturePreviewView.getOriginalComponentsTree().getTree();
      }
      return this.originalComponentsTree;
   }


   public boolean componentValuesDiffer(final ComponentType originalComponent, final ComponentType newComponent)
   {
      if (originalComponent instanceof PrimitiveComponent && newComponent instanceof PrimitiveComponent)
      {
         return !getPrimitiveComponentSizeDescription((PrimitiveComponent) originalComponent).equals(
               getPrimitiveComponentSizeDescription((PrimitiveComponent) newComponent));
      }
      else if (originalComponent instanceof CompositeComponent && newComponent instanceof CompositeComponent)
      {
         return !getCompositeComponentsSizeDescription((CompositeComponent) originalComponent).equals(
               getCompositeComponentsSizeDescription((CompositeComponent) newComponent));
      }
      return false;
   }


   private boolean originalComponentAccordsToNewComponent(final ComponentType originalComponent,
         final ComponentType currentComponent)
   {
      if (currentComponent != null && originalComponent != null)
      {
         return ComponentsUtil.get().createShortComponentName(currentComponent)
               .equals(ComponentsUtil.get().createShortComponentName(originalComponent));
      }
      return false;
   }


   private ComponentType isFromNewArchitecture(final GASTClass element)
   {
      Repository newSamm = this.architecturePreviewView.getNewSamm();
      List<ComponentType> components = newSamm.getComponenttype();
      for (ComponentType componentType : components)
      {
         if (componentType instanceof PrimitiveComponent)
         {
            PrimitiveComponent component = ((PrimitiveComponent) componentType);
            ComponentImplementingClassesLink link = ComponentsUtil.get()
                  .getComponentImplementingClassesLinkForComponent(component);
            if (link != null)
            {
               List<GASTClass> classes = link.getImplementingClasses();
               for (GASTClass gastClass : classes)
               {
                  if (gastClass == element)
                  {
                     return component;
                  }
               }
            }
         }
      }
      return null;
   }


   private boolean isFromNewArchitecture(final ComponentType element)
   {
      Repository newSamm = this.architecturePreviewView.getNewSamm();
      if (newSamm != null)
      {
         List<ComponentType> components = newSamm.getComponenttype();
         for (ComponentType componentType : components)
         {
            if (componentType == element)
            {
               return true;
            }
         }
      }
      return false;
   }


   private boolean isFromOriginalArchitecture(final ComponentType element)
   {
      Repository originalSamm = this.architecturePreviewView.getOriginalSamm();
      if (originalSamm != null)
      {
         List<ComponentType> components = originalSamm.getComponenttype();
         for (ComponentType componentType : components)
         {
            if (componentType == element)
            {
               return true;
            }
         }
      }
      return false;
   }


   private String getOriginalLocationString(final GASTClass element, final ComponentType component)
   {
      StringBuilder text = new StringBuilder(" (was ");
      if (component != null)
      {
         text.append("in ");
         String componentName = ComponentsUtil.get().createShortComponentName(component);
         text.append(componentName);
      }
      else
      {
         text.append(NOWHERE_STRING);
      }
      text.append(")");
      return text.toString();
   }


   private ComponentType getComponentFromOriginalArchitecture(final GASTClass element)
   {
      Repository originalSamm = this.architecturePreviewView.getOriginalSamm();
      List<ComponentType> components = originalSamm.getComponenttype();
      for (ComponentType componentType : components)
      {
         if (componentType instanceof PrimitiveComponent)
         {
            PrimitiveComponent component = ((PrimitiveComponent) componentType);
            ComponentImplementingClassesLink link = ComponentsUtil.get()
                  .getComponentImplementingClassesLinkForComponent(component);
            if (link != null)
            {
               List<GASTClass> classes = link.getImplementingClasses();
               for (GASTClass gastClass : classes)
               {
                  if (gastClass.getId().equals(element.getId()))
                  {
                     return component;
                  }
               }
            }
         }
      }
      return null;
   }


   private ComponentType getComponentFromOriginalArchitecture(final ComponentType element)
   {
      Repository originalSamm = this.architecturePreviewView.getOriginalSamm();
      return findComponentInRepo(element, originalSamm);
   }


   private ComponentType getComponentFromNewArchitecture(final ComponentType element)
   {
      Repository newSamm = this.architecturePreviewView.getNewSamm();
      return findComponentInRepo(element, newSamm);
   }


   private ComponentType findComponentInRepo(final ComponentType element, final Repository samm)
   {
      if (samm != null)
      {
         List<ComponentType> components = samm.getComponenttype();
         for (ComponentType componentType : components)
         {
            if (originalComponentAccordsToNewComponent(componentType, element))
            {
               return componentType;
            }
         }
      }
      return null;
   }


   private String getCompositeComponentsSizeDescription(final CompositeComponent element)
   {
      int size = element.getSubcomponents().size();
      return createSizeDescription(size, COMPONENTS_STRING);
   }


   private String getPrimitiveComponentSizeDescription(final PrimitiveComponent element)
   {
      ComponentImplementingClassesLink link = ComponentsUtil.get().getComponentImplementingClassesLinkForComponent(
            element);
      if (link != null)
      {
         int size = link.getImplementingClasses().size();
         return createSizeDescription(size, CLASSES_STRING);
      }
      return "";
   }


   private String createSizeDescription(final int size, final String classification)
   {
      StringBuilder numberOfString = new StringBuilder(" (");
      numberOfString.append(size);
      numberOfString.append(" ");
      numberOfString.append(classification);
      numberOfString.append(")");
      return numberOfString.toString();
   }


   @Override
   public String getColumnText(final Object element, final int columnIndex)
   {
      return null;
   }


   @Override
   public Color getBackground(final Object element, final int columnIndex)
   {
      return this.componentsTreeColorProvider.getBackground(element, columnIndex);
   }


   @Override
   public Color getForeground(final Object element, final int columnIndex)
   {
      return this.componentsTreeColorProvider.getForeground();
   }


   @Override
   public Image getColumnImage(final Object element, final int columnIndex)
   {
      return null;
   }


   @Override
   public Image getImage(final Object element)
   {
      if (element instanceof CompositeComponent)
      {
         return ArchitecturePreviewUIPlugin.getImageDescriptor(COMPOSITE_COMPONENT_ICON_PATH).createImage();
      }
      else if (element instanceof PrimitiveComponent)
      {
         return ArchitecturePreviewUIPlugin.getImageDescriptor(PRIMITIVE_COMPONENT_ICON_PATH).createImage();
      }
      else if (element instanceof GASTClass)
      {
         return ArchitecturePreviewUIPlugin.getImageDescriptor(GASTCLASS_ICON_PATH).createImage();
      }
      return null;
   }

}
