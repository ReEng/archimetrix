package org.archimetrix.reengineeringstrategieswriter;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.storydriven.core.expressions.ExpressionsFactory;
import org.storydriven.core.expressions.TextualExpression;
import org.storydriven.storydiagrams.activities.ActivitiesFactory;
import org.storydriven.storydiagrams.activities.Activity;
import org.storydriven.storydiagrams.activities.ActivityNode;
import org.storydriven.storydiagrams.activities.OperationExtension;
import org.storydriven.storydiagrams.activities.StoryNode;
import org.storydriven.storydiagrams.patterns.AbstractVariable;
import org.storydriven.storydiagrams.patterns.BindingState;
import org.storydriven.storydiagrams.patterns.ObjectVariable;
import org.storydriven.storydiagrams.patterns.StoryPattern;

/**
 * 
 * @author unknown
 *
 */
public class StrategyWriter {

    /**
     * parameter prefix.
     */
    private static final String ACTIVITY_NODE_PARAM_BIND_PREFIX = "(p)";

    /**
     * Return activity.
     * @param path path
     * @return activity
     */
    public Activity getActivity(final String path) {
        ResourceSet rs = new ResourceSetImpl();

        Resource r = rs.createResource(URI.createPlatformResourceURI(path, true));

        try {
            r.load(Collections.EMPTY_MAP);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Activity activity = (Activity) r.getContents().get(0);
        return activity;
    }

    /**
     * Creates operation.
     * @param sdmPath sdm path
     * @param methodName method name
     * @param paramNames parameters
     * @param paramTypes parameter types
     * @return operation
     */
    public EOperation createOperation(final String sdmPath,
            final String methodName, final String[] paramNames,
            final EClassifier[] paramTypes) {
        Activity activity = getActivity(sdmPath);
        EOperation method = EcoreFactory.eINSTANCE.createEOperation();
        method.setName(methodName);
        createParameters(method, paramNames, paramTypes);
        createOperationExtension(activity, method);
        createParameterExpressions(method, paramNames);
        return method;
    }

    /**
     * Creates operation extension.
     * @param activity activity
     * @param method method
     */
    public void createOperationExtension(final Activity activity, final EOperation method) {
        OperationExtension operation = ActivitiesFactory.eINSTANCE.createOperationExtension();
        operation.setOwnedActivity(EcoreUtil.copy(activity));
        operation.setOperation(method);
    }

    /**
     * Creates parameter expressions.
     * @param method method
     * @param paramNames parameters
     */
    public void createParameterExpressions(final EOperation method, final String[] paramNames) {
        OperationExtension opExt = (OperationExtension) method.getEAnnotation("http://ns.storydriven.org/extension")
                .getContents().get(0);
        Activity activity = opExt.getOwnedActivity();
        for (int i = 0; i < activity.getOwnedActivityNodes().size(); i++) {
            ActivityNode node = activity.getOwnedActivityNodes().get(i);
            if (node.getName() != null && node.getName().startsWith(ACTIVITY_NODE_PARAM_BIND_PREFIX)) {
                StoryPattern storyPattern = ((StoryNode) node).getStoryPattern();
                for (AbstractVariable var : storyPattern.getVariables()) {
                    if ((var instanceof ObjectVariable) && (var.getBindingState() == BindingState.BOUND)) {
                        setBindingExpressionForObjectVariable(method, paramNames, (ObjectVariable) var);
                    }
                }
            }
        }
    }

    /**
     * Creates parameters. 
     * @param method method
     * @param paramNames parameters
     * @param paramTypes parameter types
     */
    public void createParameters(final EOperation method, final String[] paramNames, final EClassifier[] paramTypes) {
        for (int i = 0; i < paramNames.length; i++) {
            EParameter parameter = EcoreFactory.eINSTANCE.createEParameter();
            parameter.setName(paramNames[i]);
            parameter.setEType(paramTypes[i]);
            method.getEParameters().add(parameter);
        }
    }

    /**
     * Sets expression for object variable.
     * @param method method
     * @param paramNames parameters
     * @param var variable
     */
    public void setBindingExpressionForObjectVariable(final EOperation method, final String[] paramNames,
            final ObjectVariable var) {
        for (int i = 0; i < paramNames.length; i++) {
            if (var.getName().equals(paramNames[i])) {
                for (EParameter param : method.getEParameters()) {
                    if (param.getName().equals(paramNames[i])) {
                        var.setBindingExpression(createParameterExpression(param));
                    }
                }
                break;
            }
        }
    }

    /**
     * Creates parameter expression.
     * @param parameter parameter
     * @return expression
     */
    public TextualExpression createParameterExpression(final EParameter parameter) {
        TextualExpression expr = ExpressionsFactory.eINSTANCE.createTextualExpression();

        expr.setLanguage("OCL");
        expr.setLanguageVersion("1.0");
        expr.setExpressionText(parameter.getName());

        return expr;
    }

}
