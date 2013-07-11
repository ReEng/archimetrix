package org.archimetrix.architectureprognosis.ui.providers;


import java.util.List;

import org.archimetrix.architectureprognosis.ui.ArchitecturePrognosisUIPlugin;
import org.archimetrix.architectureprognosis.ui.util.ComponentsUtil;
import org.archimetrix.architectureprognosis.ui.views.ArchitecturePrognosisView;
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
//import de.fzi.gast.types.GASTClass;
//import eu.qimpress.samm.staticstructure.ComponentType;
//import eu.qimpress.samm.staticstructure.CompositeComponent;
//import eu.qimpress.samm.staticstructure.PrimitiveComponent;
//import eu.qimpress.samm.staticstructure.Repository;


/**
 * This class provides the labels for the two component trees in the Architecture Prognosis View.
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

   private final ArchitecturePrognosisView architecturePrognosisView;

   private Tree newComponentsTree;

   private Tree originalComponentsTree;

   private final ComponentsTreeColorProvider componentsTreeColorProvider;


   public ComponentsTreeLabelProvider(final ArchitecturePrognosisView architecturePrognosisView)
   {
      this.architecturePrognosisView = architecturePrognosisView;
      this.componentsTreeColorProvider = new ComponentsTreeColorProvider(this);
   }


   @Override
   public String getText(final Object element)
   {
      if (element instanceof BasicComponent) // PrimitiveComponent changed to BasicComponent
      {
         return getTextForPrimitiveComponent(element);
      }
      else if (element instanceof CompositeComponent)
      {
         return getTextForCompositeComponent(element);
      }
      else if (element instanceof Type)
      {
         return getTextForGASTClass(element);
      }
      return null;
   }


   private String getTextForGASTClass(final Object element)
   {
      ClassDeclaration gastClass = (ClassDeclaration) element;
      RepositoryComponent currentComponent = isFromNewArchitecture(gastClass); //ComponentType changed to RepositoryComponent
      if (currentComponent != null)
      {
         RepositoryComponent originalComponent = getComponentFromOriginalArchitecture(gastClass);  //ComponentType changed to RepositoryComponent
         if (originalComponent != null && !originalComponentAccordsToNewComponent(originalComponent, currentComponent))
         {
            this.componentsTreeColorProvider.layoutBackgroundOfGASTClass(gastClass);
            return gastClass.getName() + getOriginalLocationString(gastClass, originalComponent);
         }
      }
      return gastClass.getName();
   }


   public Tree getNewComponentsTree()
   {
      if (this.newComponentsTree == null)
      {
         this.newComponentsTree = this.architecturePrognosisView.getNewComponentsTree().getTree();
      }
      return this.newComponentsTree;
   }


   private String getTextForCompositeComponent(final Object element)
   {
      CompositeComponent compositeComponent = (CompositeComponent) element;
      setColors(element, compositeComponent);
      return ((RepositoryComponent) element).getEntityName() + getCompositeComponentsSizeDescription(compositeComponent); //ComponentType changed to RepositoryComponent
   }


   private String getTextForPrimitiveComponent(final Object element)
   {
      BasicComponent primitiveComponent = (BasicComponent) element; // PrimitiveComponent changed to BasicComponent
      setColors(element, primitiveComponent);
      return primitiveComponent.getEntityName() + getPrimitiveComponentSizeDescription(primitiveComponent);
   }


   private void setColors(final Object element, final RepositoryComponent component) //ComponentType changed to RepositoryComponent
   {
      boolean isFromOriginalArchitecture = isFromOriginalArchitecture(component);
      boolean isFromNewArchitecture = isFromNewArchitecture(component);
      RepositoryComponent componentFromNewArchitecture = getComponentFromNewArchitecture(component);  //ComponentType changed to RepositoryComponent
      RepositoryComponent componentFromOriginalArchitecture = getComponentFromOriginalArchitecture(component);  //ComponentType changed to RepositoryComponent
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
         this.originalComponentsTree = this.architecturePrognosisView.getOriginalComponentsTree().getTree();
      }
      return this.originalComponentsTree;
   }


   public boolean componentValuesDiffer(final RepositoryComponent originalComponent, final RepositoryComponent newComponent) //ComponentType changed to RepositoryComponent
   {
      if (originalComponent instanceof BasicComponent && newComponent instanceof BasicComponent) // PrimitiveComponent changed to BasicComponent
      {
         return !getPrimitiveComponentSizeDescription((BasicComponent) originalComponent).equals(
               getPrimitiveComponentSizeDescription((BasicComponent) newComponent));
      }
      else if (originalComponent instanceof CompositeComponent && newComponent instanceof CompositeComponent)
      {
         return !getCompositeComponentsSizeDescription((CompositeComponent) originalComponent).equals(
               getCompositeComponentsSizeDescription((CompositeComponent) newComponent));
      }
      return false;
   }


   private boolean originalComponentAccordsToNewComponent(final RepositoryComponent originalComponent,  //ComponentType changed to RepositoryComponent
         final RepositoryComponent currentComponent)
   {
      if (currentComponent != null && originalComponent != null)
      {
         return ComponentsUtil.get().createShortComponentName(currentComponent)
               .equals(ComponentsUtil.get().createShortComponentName(originalComponent));
      }
      return false;
   }


   private RepositoryComponent isFromNewArchitecture(final Type element)
   {
      Repository newSamm = this.architecturePrognosisView.getNewSamm();
      List<RepositoryComponent> components = newSamm.getComponents__Repository();
      for (RepositoryComponent componentType : components)
      {
         if (componentType instanceof BasicComponent)
         {
            BasicComponent component = ((BasicComponent) componentType);
            ComponentImplementingClassesLink link = ComponentsUtil.get()
                  .getComponentImplementingClassesLinkForComponent(component);
            if (link != null)
            {
               List<Type> classes = link.getImplementingClasses();
               for (Type gastClass : classes)
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


   private boolean isFromNewArchitecture(final RepositoryComponent element)
   {
      Repository newSamm = this.architecturePrognosisView.getNewSamm();
      if (newSamm != null)
      {
         List<RepositoryComponent> components = newSamm.getComponents__Repository();
         for (RepositoryComponent componentType : components)
         {
            if (componentType == element)
            {
               return true;
            }
         }
      }
      return false;
   }


   private boolean isFromOriginalArchitecture(final RepositoryComponent element)
   {
      Repository originalSamm = this.architecturePrognosisView.getOriginalSamm();
      if (originalSamm != null)
      {
         List<RepositoryComponent> components = originalSamm.getComponents__Repository();
         for (RepositoryComponent componentType : components)
         {
            if (componentType == element)
            {
               return true;
            }
         }
      }
      return false;
   }


   private String getOriginalLocationString(final Type element, final RepositoryComponent component)
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


   private RepositoryComponent getComponentFromOriginalArchitecture(final Type element)
   {
      Repository originalSamm = this.architecturePrognosisView.getOriginalSamm();
      List<RepositoryComponent> components = originalSamm.getComponents__Repository();
      for (RepositoryComponent componentType : components)
      {
         if (componentType instanceof BasicComponent)
         {
            BasicComponent component = ((BasicComponent) componentType);
            ComponentImplementingClassesLink link = ComponentsUtil.get()
                  .getComponentImplementingClassesLinkForComponent(component);
            if (link != null)
            {
               List<Type> classes = link.getImplementingClasses();
               for (Type gastClass : classes)
               {
                  if (gastClass.getName().equals(element.getName()))
                  {
                     return component;
                  }
               }
            }
         }
      }
      return null;
   }


   private RepositoryComponent getComponentFromOriginalArchitecture(final RepositoryComponent element)
   {
      Repository originalSamm = this.architecturePrognosisView.getOriginalSamm();
      return findComponentInRepo(element, originalSamm);
   }


   private RepositoryComponent getComponentFromNewArchitecture(final RepositoryComponent element)
   {
      Repository newSamm = this.architecturePrognosisView.getNewSamm();
      return findComponentInRepo(element, newSamm);
   }


   private RepositoryComponent findComponentInRepo(final RepositoryComponent element, final Repository samm)
   {
      if (samm != null)
      {
         List<RepositoryComponent> components = samm.getComponents__Repository();
         for (RepositoryComponent componentType : components)
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
      int size = element.getAssemblyContexts__ComposedStructure().size(); // count the components in the Composite component???? 
      return createSizeDescription(size, COMPONENTS_STRING);
   }


   private String getPrimitiveComponentSizeDescription(final BasicComponent element)
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

// TODO: use Format Method!!
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
         return ArchitecturePrognosisUIPlugin.getImageDescriptor(COMPOSITE_COMPONENT_ICON_PATH).createImage();
      }
      else if (element instanceof BasicComponent)
      {
         return ArchitecturePrognosisUIPlugin.getImageDescriptor(PRIMITIVE_COMPONENT_ICON_PATH).createImage();
      }
      else if (element instanceof Type)
      {
         return ArchitecturePrognosisUIPlugin.getImageDescriptor(GASTCLASS_ICON_PATH).createImage();
      }
      return null;
   }

}
