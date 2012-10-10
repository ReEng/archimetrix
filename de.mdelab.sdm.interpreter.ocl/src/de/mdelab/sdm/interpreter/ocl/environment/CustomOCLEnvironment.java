package de.mdelab.sdm.interpreter.ocl.environment;

import java.util.Collection;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.ecore.EcoreEnvironment;
import org.eclipse.ocl.expressions.Variable;
import org.eclipse.ocl.parser.AbstractOCLAnalyzer;

import de.mdelab.sdm.interpreter.common.variables.VariableScope;

/**
 * A customized OCL environment that does not store variables locally but
 * retrieves them from a variables manager.
 * 
 * @author Stephan Hildebrandt
 * 
 */
public class CustomOCLEnvironment extends EcoreEnvironment
{
	private VariableScope	variableScope;

	/**
	 * 
	 * @param variableScope
	 *            The adapter of the variables manager from where variables are
	 *            retrieved.
	 */
	protected CustomOCLEnvironment()
	{
		super(EPackage.Registry.INSTANCE);
	}

	@Override
	public boolean addElement(String name, Variable<EClassifier, EParameter> elem, boolean isExplicit)
	{
		throw new UnsupportedOperationException("This is a delegating OCL environment. Adding and deleting variables is not supported.");
	}

	@Override
	public void deleteElement(String name)
	{
		throw new UnsupportedOperationException("This is a delegating OCL environment. Adding and deleting variables is not supported.");
	}

	@Override
	public Collection<Variable<EClassifier, EParameter>> getVariables()
	{
		throw new UnsupportedOperationException("getVariables not implemented yet");
	}

	@Override
	public Variable<EClassifier, EParameter> lookupLocal(String name)
	{
		assert variableScope != null;
		assert name != null;
		assert !"".equals(name);

		/*
		 * Delegate the lookup to the variables manager.
		 */

		de.mdelab.sdm.interpreter.common.variables.Variable variable = variableScope.getVariable(name);

		assert variable == null || variable.getClassifierAdapter().getClassifier() instanceof EClassifier;

		if (variable == null && AbstractOCLAnalyzer.isEscaped(name))
		{
			variable = variableScope.getVariable(AbstractOCLAnalyzer.unescape(name));
		}

		if (variable == null)
		{
			return null;
		}
		else
		{
			Variable<EClassifier, EParameter> var = getOCLFactory().createVariable();
			var.setName(variable.getName());
			var.setType(getOclType((EClassifier) variable.getClassifierAdapter().getClassifier()));

			return var;
		}
	}

	/**
	 * 
	 * @return The adapter of this environment's variables manager.
	 */
	public VariableScope getVariableScope()
	{
		return variableScope;
	}

	public void setVariableScope(VariableScope variableScope)
	{
		this.variableScope = variableScope;
	}

	/**
	 * Map an EClassifier to the appropriate OCL type.
	 * 
	 * @param classifier
	 *            The EClassifier to map.
	 * @return The OCL type or the classifier itself if it does not need to be
	 *         mapped.
	 */
	private EClassifier getOclType(EClassifier classifier)
	{
		assert classifier != null;

		if (classifier.eClass() == EcorePackage.Literals.EDATA_TYPE)
		{
			// EInt, EIntegerObject, EBigInteger, EByte, EByteObject, EShort,
			// EShortObject
			if (EcorePackage.Literals.EINT.getInstanceTypeName().equals(classifier.getInstanceTypeName())
					|| EcorePackage.Literals.EINTEGER_OBJECT.getInstanceTypeName().equals(classifier.getInstanceTypeName())
					|| EcorePackage.Literals.EBIG_INTEGER.getInstanceTypeName().equals(classifier.getInstanceTypeName())
					|| EcorePackage.Literals.EBYTE.getInstanceTypeName().equals(classifier.getInstanceTypeName())
					|| EcorePackage.Literals.EBYTE_OBJECT.getInstanceTypeName().equals(classifier.getInstanceTypeName())
					|| EcorePackage.Literals.ESHORT.getInstanceTypeName().equals(classifier.getInstanceTypeName())
					|| EcorePackage.Literals.ESHORT_OBJECT.getInstanceTypeName().equals(classifier.getInstanceTypeName())
					|| EcorePackage.Literals.ELONG.getInstanceTypeName().equals(classifier.getInstanceTypeName())
					|| EcorePackage.Literals.ELONG_OBJECT.getInstanceTypeName().equals(classifier.getInstanceTypeName()))
			{
				return getOCLStandardLibrary().getInteger();
			}
			// EDouble, EDoubleObject, EFloat, EFloatObject, EBigDecimal
			else if (EcorePackage.Literals.EDOUBLE.getInstanceTypeName().equals(classifier.getInstanceTypeName())
					|| EcorePackage.Literals.EDOUBLE_OBJECT.getInstanceTypeName().equals(classifier.getInstanceTypeName())
					|| EcorePackage.Literals.EFLOAT.getInstanceTypeName().equals(classifier.getInstanceTypeName())
					|| EcorePackage.Literals.EFLOAT_OBJECT.getInstanceTypeName().equals(classifier.getInstanceTypeName()))
			{
				return getOCLStandardLibrary().getReal();
			}
			// EBoolean, EBooleanObject
			else if (EcorePackage.Literals.EBOOLEAN.getInstanceTypeName().equals(classifier.getInstanceTypeName())
					|| EcorePackage.Literals.EBOOLEAN_OBJECT.getInstanceTypeName().equals(classifier.getInstanceTypeName()))
			{
				return getOCLStandardLibrary().getBoolean();
			}
			// EChar, ECharacterObject, EString
			else if (EcorePackage.Literals.ECHAR.getInstanceTypeName().equals(classifier.getInstanceTypeName())
					|| EcorePackage.Literals.ECHARACTER_OBJECT.getInstanceTypeName().equals(classifier.getInstanceTypeName())
					|| EcorePackage.Literals.ESTRING.getInstanceTypeName().equals(classifier.getInstanceTypeName()))
			{
				return getOCLStandardLibrary().getString();
			}
			else
			{
				return classifier;
			}
		}
		else
		{
			return classifier;
		}
	}
}
