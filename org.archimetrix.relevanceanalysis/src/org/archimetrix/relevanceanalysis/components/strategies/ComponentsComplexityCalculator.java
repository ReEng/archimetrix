package org.archimetrix.relevanceanalysis.components.strategies;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.gmt.modisco.java.BodyDeclaration;
import org.eclipse.gmt.modisco.java.ClassDeclaration;
import org.eclipse.gmt.modisco.java.FieldDeclaration;
import org.eclipse.gmt.modisco.java.MethodDeclaration;
import org.eclipse.gmt.modisco.java.Type;
import org.eclipse.gmt.modisco.java.VariableDeclaration;
import org.somox.sourcecodedecorator.ComponentImplementingClassesLink;
import org.somox.sourcecodedecorator.SourceCodeDecoratorRepository;


/**
 * The class helps to calculate the complexity of a component. It is used in the ComplexityStrategy
 * class.
 * 
 * @author mcp
 * 
 */
public final class ComponentsComplexityCalculator {
    /**
     * Components complexity calculator.
     */
    private static ComponentsComplexityCalculator instance;

    /**
     * Returns component complexity calculator.
     * @return component complexity calculator
     */
    public static ComponentsComplexityCalculator get() {
        if (instance == null) {
            instance = new ComponentsComplexityCalculator();
        }
        return instance;
    }

    /**
     * the constructor.
     */
    private ComponentsComplexityCalculator() {
    }

    /**
     * Component classes.
     */
    private final Map<ComponentImplementingClassesLink, List<ClassDeclaration>> componentClassesMap =
            new HashMap<ComponentImplementingClassesLink, List<ClassDeclaration>>();

    /**
     * Component methods.
     */
    private final Map<ComponentImplementingClassesLink, List<MethodDeclaration>> componentMethodsMap =
            new HashMap<ComponentImplementingClassesLink, List<MethodDeclaration>>();

    /**
     * Component properties.
     */
    private final Map<ComponentImplementingClassesLink, List<VariableDeclaration>> componentPropertiesMap =
            new HashMap<ComponentImplementingClassesLink, List<VariableDeclaration>>();

    /**
     * Component arguments.
     */
    private final Map<ComponentImplementingClassesLink, List<VariableDeclaration>> componentArgumentsMap =
            new HashMap<ComponentImplementingClassesLink, List<VariableDeclaration>>();

    /**
     * Number of generalizations.
     */
    private final Map<ComponentImplementingClassesLink, Integer> numberOfGeneralizationsMap =
            new HashMap<ComponentImplementingClassesLink, Integer>();

    /**
     * Number of references.
     */
    private final Map<ComponentImplementingClassesLink, Integer> numberOfReferencesMap =
            new HashMap<ComponentImplementingClassesLink, Integer>();

    /**
     * Repository classes.
     */
    private List<ClassDeclaration> repositoryClassesList;

    /**
     * Max classes size.
     */
    private int maxClassesSize = 0;

    /**
     * Max interfaces size.
     */
    private int maxInterfacesSize = 0;

    /**
     * Max methods size.
     */
    private int maxMethodsSize = 0;

    /**
     * Max attributes size.
     */
    private int maxAttributesSize = 0;

    /**
     * Max arguments size.
     */
    private int maxArgumentsSize = 0;

    /**
     * Repository methods.
     */
    private List<MethodDeclaration> repositoryMethodsList;

    /**
     * Returns all arguments.
     * @param component component implementing classes link
     * @return all arguments
     */
    public List<VariableDeclaration> getAllArguments(final ComponentImplementingClassesLink component) {
        if (this.componentArgumentsMap.get(component) == null) {
            List<VariableDeclaration> params = new ArrayList<VariableDeclaration>();
            List<MethodDeclaration> methods = this.getAllMethods(component);
            for (MethodDeclaration method : methods) {
                params.addAll(method.getParameters());
            }
            this.componentArgumentsMap.put(component, params);
            return params;
        } else {
            return this.componentArgumentsMap.get(component);
        }
    }

    /**
     * Returns all attributes.
     * @param component component implementing classes link
     * @return all attributes
     */
    public List<VariableDeclaration> getAllAttributes(final ComponentImplementingClassesLink component) {
        if (this.componentPropertiesMap.get(component) == null) {
            List<VariableDeclaration> properties = new ArrayList<VariableDeclaration>();
            List<ClassDeclaration> classes = this.getAllClasses(component);
            for (ClassDeclaration gastClass : classes) {
                List<BodyDeclaration> bds = gastClass.getBodyDeclarations();
                for (BodyDeclaration bd : bds) {
                    if (bd instanceof FieldDeclaration) {
                        properties.add((VariableDeclaration) bd);
                        }
                }
                // properties.addAll(gastClass.getProperty());
            }
            this.componentPropertiesMap.put(component, properties);
            return properties;
        } else {
            return this.componentPropertiesMap.get(component);
        }
    }

    /**
     * Returns all methods.
     * @param component component implementing classes link
     * @return all methods
     */
    public List<MethodDeclaration> getAllMethods(final ComponentImplementingClassesLink component) {
        if (this.componentMethodsMap.get(component) == null) {
            List<MethodDeclaration> methods = new ArrayList<MethodDeclaration>();
            List<ClassDeclaration> classes = this.getAllClasses(component);
            for (ClassDeclaration gastClass : classes) {
                EList<BodyDeclaration> bds = gastClass.getBodyDeclarations();
                for (BodyDeclaration bd : bds) {
                    if (bd instanceof MethodDeclaration) {
                        methods.add((MethodDeclaration) bd);
                    }
                }
            }
            this.componentMethodsMap.put(component, methods);
            return methods;
        } else {
            return this.componentMethodsMap.get(component);
        }
    }

    /**
     * Returns all interfaces size.
     * @param component component implementing classes link
     * @return all interfaces size
     */
    public int getAllInterfacesSize(final ComponentImplementingClassesLink component) {
        return component.getProvidedInterfaces().size();
    }

    /**
     * Returns all classes.
     * @param component component implementing classes link
     * @return all classes
     */
    public List<ClassDeclaration> getAllClasses(final ComponentImplementingClassesLink component) {
        if (this.componentClassesMap.get(component) == null) {
            List<ClassDeclaration> classes = new ArrayList<ClassDeclaration>();
            for (Type gastClass : component.getImplementingClasses()) {
                classes.add((ClassDeclaration) gastClass);
            }
            for (ComponentImplementingClassesLink subComp : component.getSubComponents()) {
                classes.addAll(getAllClasses(subComp));
            }
            this.componentClassesMap.put(component, classes);
            return classes;
        } else {
            return this.componentClassesMap.get(component);
        }
    }

    /**
     * Returns Max classes size.
     * @param repo source code decorator model
     * @return max classes size
     */
    public int getMaxClassesSize(final SourceCodeDecoratorRepository repo) {
        if (this.maxClassesSize == 0) {
            this.maxClassesSize = getAllClasses(repo).size();
        }
        return this.maxClassesSize;
    }

    /**
     * Returns Max interfaces size.
     * @param repo source code decorator model
     * @return max interfaces size
     */
    public int getMaxInterfacesSize(final SourceCodeDecoratorRepository repo) {
        if (this.maxInterfacesSize == 0) {
            int sum = 0;
            for (ComponentImplementingClassesLink component : repo.getComponentImplementingClassesLink()) {
                sum += component.getProvidedInterfaces().size();
            }
            this.maxInterfacesSize = sum;
        }
        return this.maxInterfacesSize;
    }

    /**
     * Returns Max methods size.
     * @param repo source code decorator model
     * @return max methods size
     */
    public int getMaxMethodsSize(final SourceCodeDecoratorRepository repo) {
        if (this.maxMethodsSize == 0) {
            this.maxMethodsSize = getAllMethods(repo).size();
        }
        return this.maxMethodsSize;
    }

    /**
     * Returns Max attributes size.
     * @param repo source code decorator model
     * @return max attributes size
     */
    public int getMaxAttributesSize(final SourceCodeDecoratorRepository repo) {
        if (this.maxAttributesSize == 0) {
            int sum = 0;
            for (ClassDeclaration gastClass : this.getAllClasses(repo)) {
                List<BodyDeclaration> bds = gastClass.getBodyDeclarations();
                int fields = 0;
                for (BodyDeclaration bd : bds) {
                    if (bd instanceof FieldDeclaration) {
                        fields++;
                    }
                }
                sum += fields;
            }
            this.maxAttributesSize = sum;
        }
        return this.maxAttributesSize;
    }

    /**
     * Returns Max arguments size.
     * @param repo source code decorator model
     * @return max arguments size
     */
    public int getMaxArgumentsSize(final SourceCodeDecoratorRepository repo) {
        if (this.maxArgumentsSize == 0) {
            int sum = 0;
            for (MethodDeclaration method : this.getAllMethods(repo)) {
                sum += method.getParameters().size();
            }
            this.maxArgumentsSize = sum;
        }
        return this.maxArgumentsSize;
    }

    /**
     * Returns all methods.
     * @param repo source code decorator model
     * @return all methods
     */
    private List<MethodDeclaration> getAllMethods(final SourceCodeDecoratorRepository repo) {
        if (this.repositoryMethodsList == null) {
            List<MethodDeclaration> methods = new ArrayList<MethodDeclaration>();
            for (ClassDeclaration gastClass : this.getAllClasses(repo)) {
                List<BodyDeclaration> bds = gastClass.getBodyDeclarations();
                for (BodyDeclaration bd : bds) {
                    if (bd instanceof MethodDeclaration) {
                        methods.add((MethodDeclaration) bd);
                    }
                }
            }
            this.repositoryMethodsList = methods;
        }
        return this.repositoryMethodsList;
    }

    /**
     * Returns all classes.
     * @param repo source code decorator model
     * @return all classes
     */
    public List<ClassDeclaration> getAllClasses(final SourceCodeDecoratorRepository repo) {
        if (this.repositoryClassesList == null) {
            List<ClassDeclaration> classes = new ArrayList<ClassDeclaration>();
            List<ComponentImplementingClassesLink> componentImplementingClassesLinks = repo
                    .getComponentImplementingClassesLink();
            for (ComponentImplementingClassesLink comp : componentImplementingClassesLinks) {
                classes.addAll(this.getAllClasses(comp));
            }
            this.repositoryClassesList = classes;
        }
        return this.repositoryClassesList;
    }

    /**
     * Returns Max values sum.
     * @param repo source code decorator model
     * @return max values sum
     */
    public double getMaxValuesSum(final SourceCodeDecoratorRepository repo) {
        return this.getMaxClassesSize(repo) + this.getMaxInterfacesSize(repo) + this.getMaxMethodsSize(repo)
                + this.getMaxAttributesSize(repo) + this.getMaxArgumentsSize(repo);
    }

    /**
     * Returns number of generalizations.
     * @param component component implementing classes link
     * @return number of generalizations
     */
    public int getNumberOfGeneralizations(ComponentImplementingClassesLink component) {
        if (this.numberOfGeneralizationsMap.get(component) == null) {
            int gens = 0;
            for (Type clazz : component.getImplementingClasses()) {
                if (component.getImplementingClasses().contains(clazz.getClass().getSuperclass())) {
                    gens++;
                    System.out.println("Number of generalizations methid !!! gens: " + gens);
                }

            }
            this.numberOfGeneralizationsMap.put(component, gens);
        }
        System.out.println("Number of generalizations methid !!!");
        return this.numberOfGeneralizationsMap.get(component);
    }

    /**
     * Returns the number of references.
     * @param component component implementing classes link
     * @return number of references
     */
    public int getNumberOfReferences(ComponentImplementingClassesLink component) {
        if (this.numberOfReferencesMap.get(component) == null) {
            int gens = 0;
            for (Type clazz : component.getImplementingClasses()) {
                if (clazz instanceof ClassDeclaration) {
                    List<BodyDeclaration> bds = ((ClassDeclaration) clazz).getBodyDeclarations();
                    for (BodyDeclaration bd : bds) {
                        if (bd instanceof FieldDeclaration) {
                            if (component.getImplementingClasses().contains(((FieldDeclaration) bd).getType())) {
                                gens++;
                            }
                        }
                    }
                }

            }
            this.numberOfReferencesMap.put(component, gens);
        }
        return this.numberOfReferencesMap.get(component);
    }

    /**
     * Returns max static values sum.
     * @param repo source code decorator model
     * @return max static values sum
     */
    public double getMaxStaticValuesSum(SourceCodeDecoratorRepository repo) {
        int result = 0;
        for (ComponentImplementingClassesLink component : repo.getComponentImplementingClassesLink()) {
            result += getNumberOfGeneralizations(component);
            result += getNumberOfReferences(component);
        }
        return result;
    }
}
