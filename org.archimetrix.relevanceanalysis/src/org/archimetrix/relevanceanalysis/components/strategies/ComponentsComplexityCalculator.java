package org.archimetrix.relevanceanalysis.components.strategies;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import de.fzi.gast.functions.Method;
import de.fzi.gast.types.GASTClass;
import de.fzi.gast.variables.Field;
import de.fzi.gast.variables.FormalParameter;
import de.fzi.gast.variables.Property;
import eu.qimpress.sourcecodedecorator.ComponentImplementingClassesLink;
import eu.qimpress.sourcecodedecorator.SourceCodeDecoratorRepository;


/**
 * The class helps to calculate the complexity of a component. It is used in the ComplexityStrategy
 * class.
 * 
 * @author mcp
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 * 
 */
public final class ComponentsComplexityCalculator
{
   private static ComponentsComplexityCalculator instance;


   public static ComponentsComplexityCalculator get()
   {
      if (instance == null)
      {
         instance = new ComponentsComplexityCalculator();
      }
      return instance;
   }


   private ComponentsComplexityCalculator()
   {
   }

   private final Map<ComponentImplementingClassesLink, List<GASTClass>> componentClassesMap = new HashMap<ComponentImplementingClassesLink, List<GASTClass>>();

   private final Map<ComponentImplementingClassesLink, List<Method>> componentMethodsMap = new HashMap<ComponentImplementingClassesLink, List<Method>>();

   private final Map<ComponentImplementingClassesLink, List<Property>> componentPropertiesMap = new HashMap<ComponentImplementingClassesLink, List<Property>>();

   private final Map<ComponentImplementingClassesLink, List<FormalParameter>> componentArgumentsMap = new HashMap<ComponentImplementingClassesLink, List<FormalParameter>>();

   private final Map<ComponentImplementingClassesLink, Integer> numberOfGeneralizationsMap = new HashMap<ComponentImplementingClassesLink, Integer>();

   private final Map<ComponentImplementingClassesLink, Integer> numberOfReferencesMap = new HashMap<ComponentImplementingClassesLink, Integer>();

   private List<GASTClass> repositoryClassesList;

   private int maxClassesSize = 0;

   private int maxInterfacesSize = 0;

   private int maxMethodsSize = 0;

   private int maxAttributesSize = 0;

   private int maxArgumentsSize = 0;

   private List<Method> repositoryMethodsList;


   public List<FormalParameter> getAllArguments(final ComponentImplementingClassesLink component)
   {
      if (this.componentArgumentsMap.get(component) == null)
      {
         List<FormalParameter> params = new ArrayList<FormalParameter>();
         List<Method> methods = this.getAllMethods(component);
         for (Method method : methods)
         {
            params.addAll(method.getFormalParameters());
         }
         this.componentArgumentsMap.put(component, params);
         return params;
      }
      else
      {
         return this.componentArgumentsMap.get(component);
      }
   }


   public List<Property> getAllAttributes(final ComponentImplementingClassesLink component)
   {
      if (this.componentPropertiesMap.get(component) == null)
      {
         List<Property> properties = new ArrayList<Property>();
         List<GASTClass> classes = this.getAllClasses(component);
         for (GASTClass gastClass : classes)
         {
            properties.addAll(gastClass.getProperty());
         }
         this.componentPropertiesMap.put(component, properties);
         return properties;
      }
      else
      {
         return this.componentPropertiesMap.get(component);
      }
   }


   public List<Method> getAllMethods(final ComponentImplementingClassesLink component)
   {
      if (this.componentMethodsMap.get(component) == null)
      {
         List<Method> methods = new ArrayList<Method>();
         List<GASTClass> classes = this.getAllClasses(component);
         for (GASTClass gastClass : classes)
         {
            methods.addAll(gastClass.getMethods());
         }
         this.componentMethodsMap.put(component, methods);
         return methods;
      }
      else
      {
         return this.componentMethodsMap.get(component);
      }
   }


   public int getAllInterfacesSize(final ComponentImplementingClassesLink component)
   {
      return component.getProvidedInterfaces().size();
   }


   public List<GASTClass> getAllClasses(final ComponentImplementingClassesLink component)
   {
      if (this.componentClassesMap.get(component) == null)
      {
         List<GASTClass> classes = new ArrayList<GASTClass>();
         for (GASTClass gastClass : component.getImplementingClasses())
         {
            classes.add(gastClass);
         }
         for (ComponentImplementingClassesLink subComp : component.getSubComponents())
         {
            classes.addAll(getAllClasses(subComp));
         }
         this.componentClassesMap.put(component, classes);
         return classes;
      }
      else
      {
         return this.componentClassesMap.get(component);
      }
   }


   public int getMaxClassesSize(final SourceCodeDecoratorRepository repo)
   {
      if (this.maxClassesSize == 0)
      {
         this.maxClassesSize = getAllClasses(repo).size();
      }
      return this.maxClassesSize;
   }


   public int getMaxInterfacesSize(final SourceCodeDecoratorRepository repo)
   {
      if (this.maxInterfacesSize == 0)
      {
         int sum = 0;
         for (ComponentImplementingClassesLink component : repo.getComponentImplementingClassesLink())
         {
            sum += component.getProvidedInterfaces().size();
         }
         this.maxInterfacesSize = sum;
      }
      return this.maxInterfacesSize;
   }


   public int getMaxMethodsSize(final SourceCodeDecoratorRepository repo)
   {
      if (this.maxMethodsSize == 0)
      {
         this.maxMethodsSize = getAllMethods(repo).size();
      }
      return this.maxMethodsSize;
   }


   public int getMaxAttributesSize(final SourceCodeDecoratorRepository repo)
   {
      if (this.maxAttributesSize == 0)
      {
         int sum = 0;
         for (GASTClass gastClass : this.getAllClasses(repo))
         {
            sum += gastClass.getProperty().size();
         }
         this.maxAttributesSize = sum;
      }
      return this.maxAttributesSize;
   }


   public int getMaxArgumentsSize(final SourceCodeDecoratorRepository repo)
   {
      if (this.maxArgumentsSize == 0)
      {
         int sum = 0;
         for (Method method : this.getAllMethods(repo))
         {
            sum += method.getFormalParameters().size();
         }
         this.maxArgumentsSize = sum;
      }
      return this.maxArgumentsSize;
   }


   private List<Method> getAllMethods(final SourceCodeDecoratorRepository repo)
   {
      if (this.repositoryMethodsList == null)
      {
         List<Method> methods = new ArrayList<Method>();
         for (GASTClass gastClass : this.getAllClasses(repo))
         {
            methods.addAll(gastClass.getMethods());
         }
         this.repositoryMethodsList = methods;
      }
      return this.repositoryMethodsList;
   }


   public List<GASTClass> getAllClasses(final SourceCodeDecoratorRepository repo)
   {
      if (this.repositoryClassesList == null)
      {
         List<GASTClass> classes = new ArrayList<GASTClass>();
         List<ComponentImplementingClassesLink> componentImplementingClassesLinks = repo
               .getComponentImplementingClassesLink();
         for (ComponentImplementingClassesLink comp : componentImplementingClassesLinks)
         {
            classes.addAll(this.getAllClasses(comp));
         }
         this.repositoryClassesList = classes;
      }
      return this.repositoryClassesList;
   }


   public double getMaxValuesSum(final SourceCodeDecoratorRepository repo)
   {
      return this.getMaxClassesSize(repo) + this.getMaxInterfacesSize(repo) + this.getMaxMethodsSize(repo)
            + this.getMaxAttributesSize(repo) + this.getMaxArgumentsSize(repo);
   }


   public int getNumberOfGeneralizations(ComponentImplementingClassesLink component)
   {
      if (this.numberOfGeneralizationsMap.get(component) == null)
      {
         int gens = 0;
         for (GASTClass clazz : component.getImplementingClasses())
         {
            for (GASTClass superType : clazz.getSuperTypes())
            {
               if (component.getImplementingClasses().contains(superType))
               {
                  gens++;
               }
            }
         }
         this.numberOfGeneralizationsMap.put(component, gens);
      }
      return this.numberOfGeneralizationsMap.get(component);
   }


   public int getNumberOfReferences(ComponentImplementingClassesLink component)
   {
      if (this.numberOfReferencesMap.get(component) == null)
      {
         int gens = 0;
         for (GASTClass clazz : component.getImplementingClasses())
         {
            for (Field field : clazz.getFields())
            {
               if (component.getImplementingClasses().contains(field.getType()))
               {
                  gens++;
               }
            }
         }
         this.numberOfReferencesMap.put(component, gens);
      }
      return this.numberOfReferencesMap.get(component);
   }


   public double getMaxStaticValuesSum(SourceCodeDecoratorRepository repo)
   {
      int result = 0;
      for (ComponentImplementingClassesLink component : repo.getComponentImplementingClassesLink())
      {
         result += getNumberOfGeneralizations(component);
         result += getNumberOfReferences(component);
      }
      return result;
   }
}
