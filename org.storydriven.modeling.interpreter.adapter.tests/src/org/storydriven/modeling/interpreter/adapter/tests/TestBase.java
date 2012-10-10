package org.storydriven.modeling.interpreter.adapter.tests;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import junit.framework.TestCase;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.storydriven.modeling.activities.ActivitiesFactory;
import org.storydriven.modeling.activities.Activity;
import org.storydriven.modeling.activities.ActivityNode;
import org.storydriven.modeling.activities.OperationExtension;
import org.storydriven.modeling.interpreter.adapter.SDMainAdapterFactory;

import de.mdelab.sdm.interpreter.common.MainInterpreterFactory;
import de.mdelab.sdm.interpreter.common.SDMInterpreter;
import de.mdelab.sdm.interpreter.common.SDMInterpreterConstants;
import de.mdelab.sdm.interpreter.common.SDMInterpreterException;
import de.mdelab.sdm.interpreter.common.adapters.IMainAdapterFactory;
import de.mdelab.sdm.interpreter.common.expressions.EclipseBasedExpressionInterpreterFactory;
import de.mdelab.sdm.interpreter.common.expressions.ExpressionInterpreterFactory;
import de.mdelab.sdm.interpreter.common.tasks.notifying.NotifyingMainInterpreterFactory;
import de.mdelab.sdm.interpreter.common.tasks.notifying.OutputStreamNotificationReceiver;
import de.mdelab.sdm.interpreter.common.variables.Parameter;
import de.mdelab.sdm.interpreter.common.variables.Variable;

public abstract class TestBase extends TestCase
{
	public TestBase(String name)
	{
		super(name);
	}

	/**
	 * The fixture for this EMF Classifier Handler test case. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected SDMInterpreter	fixture	= null;

	/**
	 * Sets the fixture for this EMF Classifier Handler test case. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void setFixture(SDMInterpreter fixture)
	{
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this EMF Classifier Handler test case. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected SDMInterpreter getFixture()
	{
		return fixture;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception
	{
		setFixture(new SDMInterpreter(getMainInterpreterFactory(), getMainAdapterFactory(), getClass().getClassLoader()));

	}

	private ExpressionInterpreterFactory getExpressionInterpreterAdapterFactory()
	{
		return new EclipseBasedExpressionInterpreterFactory();
	}

	private IMainAdapterFactory getMainAdapterFactory()
	{
		return new SDMainAdapterFactory();
	}

	private MainInterpreterFactory getMainInterpreterFactory()
	{
		return new NotifyingMainInterpreterFactory(getExpressionInterpreterAdapterFactory(), new OutputStreamNotificationReceiver());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception
	{
		setFixture(null);
		// TODO delete created operation extensions
	}

	protected abstract String getModelFolder();

	public Activity loadActivityDiagram(String modelName) throws IOException
	{
		ResourceSet rs = new ResourceSetImpl();

		Resource r = rs.createResource(URI.createPlatformPluginURI(getModelFolder() + modelName, true));

		r.load(Collections.EMPTY_MAP);

		Activity activity = (Activity) r.getContents().get(0);

		createOperationExtension(activity, modelName);

		return activity;
	}

	public EClass loadClassDiagram(String modelName) throws IOException
   {
      ResourceSet rs = new ResourceSetImpl();

      Resource r = rs.createResource(URI.createPlatformPluginURI(getModelFolder() + modelName, true));

      r.load(Collections.EMPTY_MAP);

      EClass clazz = (EClass) ((EPackage)r.getContents().get(0)).getEClassifiers().get(0);

      return clazz;
   }
	
	private OperationExtension createOperationExtension(Activity activity, String modelName)
	{

		EcoreFactory f = EcoreFactory.eINSTANCE;
		EOperation method = f.createEOperation();

		String name = modelName.split("\\.")[0];
		method.setName(name);
		// method.setEType(value) // TODO

		OperationExtension operation = ActivitiesFactory.eINSTANCE.createOperationExtension();
		operation.setOwnedActivity(activity);
		operation.setOperation(method);

		// TODO
		// activity.getInParameters().addAll(method.getEParameters());
		// if(!operation.getOutParameters().isEmpty())
		// {
		// operation.getOutParameters().get(0).setName("methodReturnValue");
		// activity.getOutParameters().addAll(operation.getOutParameters());
		// }

		return operation;
	}

	protected String getClassModelName()
	{
		return "/org.storydriven.modeling.interpreter.adapter.tests/models/testclassmodels/testClassmodel.ecore";
	}

	protected Map<String, Variable> executeActivityNode(ActivityNode activityNode, List<Parameter> parameter)
			throws SDMInterpreterException
	{
		Map<String, Variable> vars = getFixture().executeActivity(activityNode.eContainer(), parameter);

		assertNoAdapters(activityNode);

		return vars;
	}

	@SuppressWarnings("unchecked")
	protected Map<String, Variable> executeActivityNode(ActivityNode activityNode) throws SDMInterpreterException
	{
		return executeActivityNode(activityNode, Collections.EMPTY_LIST);
	}

	protected void assertNoAdapters(ActivityNode activityNode)
	{
		assertTrue(activityNode.eAdapters().size() <= 1);

		TreeIterator<EObject> it = activityNode.eAllContents();

		while (it.hasNext())
		{
			EObject eObject = it.next();

			assertTrue(eObject.eAdapters().size() <= 1);
		}
	}

	protected void booleanTest(String testName) throws IOException, SDMInterpreterException
	{
		System.out.println("\n\n\nExecuting '" + testName + "'.");

		Activity a = loadActivityDiagram(testName + ".sdm");

		ActivityNode an = a.getOwnedActivityNodes().get(0);

		Map<String, Variable> vars = executeActivityNode(an);

		assertTrue(vars.get(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME).getValueAdapter().getValue().equals(Boolean.TRUE));

		vars = executeActivityNode(an);

		assertTrue(vars.get(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME).getValueAdapter().getValue().equals(Boolean.TRUE));
	}
}
