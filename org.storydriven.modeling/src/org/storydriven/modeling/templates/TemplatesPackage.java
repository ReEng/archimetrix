/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.templates;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.storydriven.modeling.SDMPackage;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.storydriven.modeling.templates.TemplatesFactory
 * @model kind="package"
 * @generated
 */
public interface TemplatesPackage extends EPackage
{
   /**
    * The package name.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   String eNAME = "templates";

   /**
    * The package namespace URI.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   String eNS_URI = "http://ns.storydriven.org/sdm/templates/0.1.0";

   /**
    * The package namespace name.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   String eNS_PREFIX = "sdmt";

   /**
    * The singleton instance of the package.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   TemplatesPackage eINSTANCE = org.storydriven.modeling.templates.impl.TemplatesPackageImpl.init();

   /**
    * The meta object id for the '{@link org.storydriven.modeling.templates.impl.TemplateSignatureImpl <em>Template Signature</em>}' class.
    * <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * @see org.storydriven.modeling.templates.impl.TemplateSignatureImpl
    * @see org.storydriven.modeling.templates.impl.TemplatesPackageImpl#getTemplateSignature()
    * @generated
    */
   int TEMPLATE_SIGNATURE = 2;

   /**
    * The meta object id for the '{@link org.storydriven.modeling.templates.impl.TemplateBindingImpl <em>Template Binding</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
    * -->
    * 
    * @see org.storydriven.modeling.templates.impl.TemplateBindingImpl
    * @see org.storydriven.modeling.templates.impl.TemplatesPackageImpl#getTemplateBinding()
    * @generated
    */
   int TEMPLATE_BINDING = 0;

   /**
    * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TEMPLATE_BINDING__ANNOTATION = SDMPackage.EXTENDABLE_ELEMENT__ANNOTATION;

   /**
    * The feature id for the '<em><b>Extension</b></em>' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TEMPLATE_BINDING__EXTENSION = SDMPackage.EXTENDABLE_ELEMENT__EXTENSION;

   /**
    * The feature id for the '<em><b>Bound Parameter</b></em>' reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TEMPLATE_BINDING__BOUND_PARAMETER = SDMPackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Binding Expression</b></em>' containment reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TEMPLATE_BINDING__BINDING_EXPRESSION = SDMPackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 1;

   /**
    * The feature id for the '<em><b>Template</b></em>' container reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TEMPLATE_BINDING__TEMPLATE = SDMPackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 2;

   /**
    * The feature id for the '<em><b>Property Binding</b></em>' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TEMPLATE_BINDING__PROPERTY_BINDING = SDMPackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 3;

   /**
    * The number of structural features of the '<em>Template Binding</em>' class.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TEMPLATE_BINDING_FEATURE_COUNT = SDMPackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 4;

   /**
    * The operation id for the '<em>EClass</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TEMPLATE_BINDING___ECLASS = SDMPackage.EXTENDABLE_ELEMENT___ECLASS;

   /**
    * The operation id for the '<em>EIs Proxy</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TEMPLATE_BINDING___EIS_PROXY = SDMPackage.EXTENDABLE_ELEMENT___EIS_PROXY;

   /**
    * The operation id for the '<em>EResource</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TEMPLATE_BINDING___ERESOURCE = SDMPackage.EXTENDABLE_ELEMENT___ERESOURCE;

   /**
    * The operation id for the '<em>EContainer</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TEMPLATE_BINDING___ECONTAINER = SDMPackage.EXTENDABLE_ELEMENT___ECONTAINER;

   /**
    * The operation id for the '<em>EContaining Feature</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TEMPLATE_BINDING___ECONTAINING_FEATURE = SDMPackage.EXTENDABLE_ELEMENT___ECONTAINING_FEATURE;

   /**
    * The operation id for the '<em>EContainment Feature</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TEMPLATE_BINDING___ECONTAINMENT_FEATURE = SDMPackage.EXTENDABLE_ELEMENT___ECONTAINMENT_FEATURE;

   /**
    * The operation id for the '<em>EContents</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TEMPLATE_BINDING___ECONTENTS = SDMPackage.EXTENDABLE_ELEMENT___ECONTENTS;

   /**
    * The operation id for the '<em>EAll Contents</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TEMPLATE_BINDING___EALL_CONTENTS = SDMPackage.EXTENDABLE_ELEMENT___EALL_CONTENTS;

   /**
    * The operation id for the '<em>ECross References</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TEMPLATE_BINDING___ECROSS_REFERENCES = SDMPackage.EXTENDABLE_ELEMENT___ECROSS_REFERENCES;

   /**
    * The operation id for the '<em>EGet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TEMPLATE_BINDING___EGET__ESTRUCTURALFEATURE = SDMPackage.EXTENDABLE_ELEMENT___EGET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EGet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TEMPLATE_BINDING___EGET__ESTRUCTURALFEATURE_BOOLEAN = SDMPackage.EXTENDABLE_ELEMENT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

   /**
    * The operation id for the '<em>ESet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TEMPLATE_BINDING___ESET__ESTRUCTURALFEATURE_OBJECT = SDMPackage.EXTENDABLE_ELEMENT___ESET__ESTRUCTURALFEATURE_OBJECT;

   /**
    * The operation id for the '<em>EIs Set</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TEMPLATE_BINDING___EIS_SET__ESTRUCTURALFEATURE = SDMPackage.EXTENDABLE_ELEMENT___EIS_SET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EUnset</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TEMPLATE_BINDING___EUNSET__ESTRUCTURALFEATURE = SDMPackage.EXTENDABLE_ELEMENT___EUNSET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EInvoke</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TEMPLATE_BINDING___EINVOKE__EOPERATION_ELIST = SDMPackage.EXTENDABLE_ELEMENT___EINVOKE__EOPERATION_ELIST;

   /**
    * The operation id for the '<em>Get Extension</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TEMPLATE_BINDING___GET_EXTENSION__ECLASS = SDMPackage.EXTENDABLE_ELEMENT___GET_EXTENSION__ECLASS;

   /**
    * The operation id for the '<em>Provide Extension</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TEMPLATE_BINDING___PROVIDE_EXTENSION__ECLASS = SDMPackage.EXTENDABLE_ELEMENT___PROVIDE_EXTENSION__ECLASS;

   /**
    * The operation id for the '<em>Get Annotation</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TEMPLATE_BINDING___GET_ANNOTATION__STRING = SDMPackage.EXTENDABLE_ELEMENT___GET_ANNOTATION__STRING;

   /**
    * The operation id for the '<em>Provide Annotation</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TEMPLATE_BINDING___PROVIDE_ANNOTATION__STRING = SDMPackage.EXTENDABLE_ELEMENT___PROVIDE_ANNOTATION__STRING;

   /**
    * The number of operations of the '<em>Template Binding</em>' class.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TEMPLATE_BINDING_OPERATION_COUNT = SDMPackage.EXTENDABLE_ELEMENT_OPERATION_COUNT + 0;

   /**
    * The meta object id for the '{@link org.storydriven.modeling.templates.impl.PropertyBindingImpl <em>Property Binding</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
    * -->
    * 
    * @see org.storydriven.modeling.templates.impl.PropertyBindingImpl
    * @see org.storydriven.modeling.templates.impl.TemplatesPackageImpl#getPropertyBinding()
    * @generated
    */
   int PROPERTY_BINDING = 1;

   /**
    * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PROPERTY_BINDING__ANNOTATION = SDMPackage.EXTENDABLE_ELEMENT__ANNOTATION;

   /**
    * The feature id for the '<em><b>Extension</b></em>' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PROPERTY_BINDING__EXTENSION = SDMPackage.EXTENDABLE_ELEMENT__EXTENSION;

   /**
    * The feature id for the '<em><b>Bound Property</b></em>' reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PROPERTY_BINDING__BOUND_PROPERTY = SDMPackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Binding Expression</b></em>' containment reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PROPERTY_BINDING__BINDING_EXPRESSION = SDMPackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 1;

   /**
    * The feature id for the '<em><b>Template Binding</b></em>' container reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PROPERTY_BINDING__TEMPLATE_BINDING = SDMPackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 2;

   /**
    * The number of structural features of the '<em>Property Binding</em>' class.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PROPERTY_BINDING_FEATURE_COUNT = SDMPackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 3;

   /**
    * The operation id for the '<em>EClass</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PROPERTY_BINDING___ECLASS = SDMPackage.EXTENDABLE_ELEMENT___ECLASS;

   /**
    * The operation id for the '<em>EIs Proxy</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PROPERTY_BINDING___EIS_PROXY = SDMPackage.EXTENDABLE_ELEMENT___EIS_PROXY;

   /**
    * The operation id for the '<em>EResource</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PROPERTY_BINDING___ERESOURCE = SDMPackage.EXTENDABLE_ELEMENT___ERESOURCE;

   /**
    * The operation id for the '<em>EContainer</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PROPERTY_BINDING___ECONTAINER = SDMPackage.EXTENDABLE_ELEMENT___ECONTAINER;

   /**
    * The operation id for the '<em>EContaining Feature</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PROPERTY_BINDING___ECONTAINING_FEATURE = SDMPackage.EXTENDABLE_ELEMENT___ECONTAINING_FEATURE;

   /**
    * The operation id for the '<em>EContainment Feature</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PROPERTY_BINDING___ECONTAINMENT_FEATURE = SDMPackage.EXTENDABLE_ELEMENT___ECONTAINMENT_FEATURE;

   /**
    * The operation id for the '<em>EContents</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PROPERTY_BINDING___ECONTENTS = SDMPackage.EXTENDABLE_ELEMENT___ECONTENTS;

   /**
    * The operation id for the '<em>EAll Contents</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PROPERTY_BINDING___EALL_CONTENTS = SDMPackage.EXTENDABLE_ELEMENT___EALL_CONTENTS;

   /**
    * The operation id for the '<em>ECross References</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PROPERTY_BINDING___ECROSS_REFERENCES = SDMPackage.EXTENDABLE_ELEMENT___ECROSS_REFERENCES;

   /**
    * The operation id for the '<em>EGet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PROPERTY_BINDING___EGET__ESTRUCTURALFEATURE = SDMPackage.EXTENDABLE_ELEMENT___EGET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EGet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PROPERTY_BINDING___EGET__ESTRUCTURALFEATURE_BOOLEAN = SDMPackage.EXTENDABLE_ELEMENT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

   /**
    * The operation id for the '<em>ESet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PROPERTY_BINDING___ESET__ESTRUCTURALFEATURE_OBJECT = SDMPackage.EXTENDABLE_ELEMENT___ESET__ESTRUCTURALFEATURE_OBJECT;

   /**
    * The operation id for the '<em>EIs Set</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PROPERTY_BINDING___EIS_SET__ESTRUCTURALFEATURE = SDMPackage.EXTENDABLE_ELEMENT___EIS_SET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EUnset</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PROPERTY_BINDING___EUNSET__ESTRUCTURALFEATURE = SDMPackage.EXTENDABLE_ELEMENT___EUNSET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EInvoke</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PROPERTY_BINDING___EINVOKE__EOPERATION_ELIST = SDMPackage.EXTENDABLE_ELEMENT___EINVOKE__EOPERATION_ELIST;

   /**
    * The operation id for the '<em>Get Extension</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PROPERTY_BINDING___GET_EXTENSION__ECLASS = SDMPackage.EXTENDABLE_ELEMENT___GET_EXTENSION__ECLASS;

   /**
    * The operation id for the '<em>Provide Extension</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PROPERTY_BINDING___PROVIDE_EXTENSION__ECLASS = SDMPackage.EXTENDABLE_ELEMENT___PROVIDE_EXTENSION__ECLASS;

   /**
    * The operation id for the '<em>Get Annotation</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PROPERTY_BINDING___GET_ANNOTATION__STRING = SDMPackage.EXTENDABLE_ELEMENT___GET_ANNOTATION__STRING;

   /**
    * The operation id for the '<em>Provide Annotation</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PROPERTY_BINDING___PROVIDE_ANNOTATION__STRING = SDMPackage.EXTENDABLE_ELEMENT___PROVIDE_ANNOTATION__STRING;

   /**
    * The number of operations of the '<em>Property Binding</em>' class.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PROPERTY_BINDING_OPERATION_COUNT = SDMPackage.EXTENDABLE_ELEMENT_OPERATION_COUNT + 0;

   /**
    * The feature id for the '<em><b>Template Binding</b></em>' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TEMPLATE_SIGNATURE__TEMPLATE_BINDING = 0;

   /**
    * The feature id for the '<em><b>Type Parameter</b></em>' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TEMPLATE_SIGNATURE__TYPE_PARAMETER = 1;

   /**
    * The feature id for the '<em><b>Pattern</b></em>' container reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TEMPLATE_SIGNATURE__PATTERN = 2;

   /**
    * The number of structural features of the '<em>Template Signature</em>' class.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TEMPLATE_SIGNATURE_FEATURE_COUNT = 3;

   /**
    * The number of operations of the '<em>Template Signature</em>' class.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TEMPLATE_SIGNATURE_OPERATION_COUNT = 0;

   /**
    * Returns the meta object for class '{@link org.storydriven.modeling.templates.TemplateSignature <em>Template Signature</em>}'.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @return the meta object for class '<em>Template Signature</em>'.
    * @see org.storydriven.modeling.templates.TemplateSignature
    * @generated
    */
   EClass getTemplateSignature ();

   /**
    * Returns the meta object for the containment reference list '{@link org.storydriven.modeling.templates.TemplateSignature#getTypeParameters <em>Type Parameter</em>}'. <!--
    * begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference list '<em>Type Parameter</em>'.
    * @see org.storydriven.modeling.templates.TemplateSignature#getTypeParameters()
    * @see #getTemplateSignature()
    * @generated
    */
   EReference getTemplateSignature_TypeParameter ();

   /**
    * Returns the meta object for the containment reference list '{@link org.storydriven.modeling.templates.TemplateSignature#getTemplateBindings <em>Template Binding</em>}'. <!--
    * begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference list '<em>Template Binding</em>'.
    * @see org.storydriven.modeling.templates.TemplateSignature#getTemplateBindings()
    * @see #getTemplateSignature()
    * @generated
    */
   EReference getTemplateSignature_TemplateBinding ();

   /**
    * Returns the meta object for the container reference '{@link org.storydriven.modeling.templates.TemplateSignature#getPattern <em>Pattern</em>}'.
    * <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * @return the meta object for the container reference '<em>Pattern</em>'.
    * @see org.storydriven.modeling.templates.TemplateSignature#getPattern()
    * @see #getTemplateSignature()
    * @generated
    */
   EReference getTemplateSignature_Pattern ();

   /**
    * Returns the meta object for class '{@link org.storydriven.modeling.templates.TemplateBinding <em>Template Binding</em>}'.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @return the meta object for class '<em>Template Binding</em>'.
    * @see org.storydriven.modeling.templates.TemplateBinding
    * @generated
    */
   EClass getTemplateBinding ();

   /**
    * Returns the meta object for the reference '{@link org.storydriven.modeling.templates.TemplateBinding#getBoundParameter <em>Bound Parameter</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Bound Parameter</em>'.
    * @see org.storydriven.modeling.templates.TemplateBinding#getBoundParameter()
    * @see #getTemplateBinding()
    * @generated
    */
   EReference getTemplateBinding_BoundParameter ();

   /**
    * Returns the meta object for the containment reference '{@link org.storydriven.modeling.templates.TemplateBinding#getBindingExpression <em>Binding Expression</em>}'. <!--
    * begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference '<em>Binding Expression</em>'.
    * @see org.storydriven.modeling.templates.TemplateBinding#getBindingExpression()
    * @see #getTemplateBinding()
    * @generated
    */
   EReference getTemplateBinding_BindingExpression ();

   /**
    * Returns the meta object for the containment reference list '{@link org.storydriven.modeling.templates.TemplateBinding#getPropertyBindings <em>Property Binding</em>}'. <!--
    * begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference list '<em>Property Binding</em>'.
    * @see org.storydriven.modeling.templates.TemplateBinding#getPropertyBindings()
    * @see #getTemplateBinding()
    * @generated
    */
   EReference getTemplateBinding_PropertyBinding ();

   /**
    * Returns the meta object for the container reference '{@link org.storydriven.modeling.templates.TemplateBinding#getTemplate <em>Template</em>}'.
    * <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * @return the meta object for the container reference '<em>Template</em>'.
    * @see org.storydriven.modeling.templates.TemplateBinding#getTemplate()
    * @see #getTemplateBinding()
    * @generated
    */
   EReference getTemplateBinding_Template ();

   /**
    * Returns the meta object for class '{@link org.storydriven.modeling.templates.PropertyBinding <em>Property Binding</em>}'.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @return the meta object for class '<em>Property Binding</em>'.
    * @see org.storydriven.modeling.templates.PropertyBinding
    * @generated
    */
   EClass getPropertyBinding ();

   /**
    * Returns the meta object for the reference '{@link org.storydriven.modeling.templates.PropertyBinding#getBoundProperty <em>Bound Property</em>}'.
    * <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * @return the meta object for the reference '<em>Bound Property</em>'.
    * @see org.storydriven.modeling.templates.PropertyBinding#getBoundProperty()
    * @see #getPropertyBinding()
    * @generated
    */
   EReference getPropertyBinding_BoundProperty ();

   /**
    * Returns the meta object for the containment reference '{@link org.storydriven.modeling.templates.PropertyBinding#getBindingExpression <em>Binding Expression</em>}'. <!--
    * begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference '<em>Binding Expression</em>'.
    * @see org.storydriven.modeling.templates.PropertyBinding#getBindingExpression()
    * @see #getPropertyBinding()
    * @generated
    */
   EReference getPropertyBinding_BindingExpression ();

   /**
    * Returns the meta object for the container reference '{@link org.storydriven.modeling.templates.PropertyBinding#getTemplateBinding <em>Template Binding</em>}'. <!--
    * begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for the container reference '<em>Template Binding</em>'.
    * @see org.storydriven.modeling.templates.PropertyBinding#getTemplateBinding()
    * @see #getPropertyBinding()
    * @generated
    */
   EReference getPropertyBinding_TemplateBinding ();

   /**
    * Returns the factory that creates the instances of the model.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @return the factory that creates the instances of the model.
    * @generated
    */
   TemplatesFactory getTemplatesFactory ();

   /**
    * <!-- begin-user-doc --> Defines literals for the meta objects that represent
    * <ul>
    * <li>each class,</li>
    * <li>each feature of each class,</li>
    * <li>each enum,</li>
    * <li>and each data type</li>
    * </ul>
    * <!-- end-user-doc -->
    * @generated
    */
   interface Literals
   {
      /**
       * The meta object literal for the '{@link org.storydriven.modeling.templates.impl.TemplateSignatureImpl <em>Template Signature</em>}' class.
       * <!-- begin-user-doc --> <!--
       * end-user-doc -->
       * @see org.storydriven.modeling.templates.impl.TemplateSignatureImpl
       * @see org.storydriven.modeling.templates.impl.TemplatesPackageImpl#getTemplateSignature()
       * @generated
       */
      EClass TEMPLATE_SIGNATURE = eINSTANCE.getTemplateSignature();

      /**
       * The meta object literal for the '<em><b>Type Parameter</b></em>' containment reference list feature.
       * <!-- begin-user-doc --> <!-- end-user-doc -->
       * @generated
       */
      EReference TEMPLATE_SIGNATURE__TYPE_PARAMETER = eINSTANCE.getTemplateSignature_TypeParameter();

      /**
       * The meta object literal for the '<em><b>Template Binding</b></em>' containment reference list feature.
       * <!-- begin-user-doc --> <!-- end-user-doc -->
       * @generated
       */
      EReference TEMPLATE_SIGNATURE__TEMPLATE_BINDING = eINSTANCE.getTemplateSignature_TemplateBinding();

      /**
       * The meta object literal for the '<em><b>Pattern</b></em>' container reference feature.
       * <!-- begin-user-doc --> <!-- end-user-doc -->
       * @generated
       */
      EReference TEMPLATE_SIGNATURE__PATTERN = eINSTANCE.getTemplateSignature_Pattern();

      /**
       * The meta object literal for the '{@link org.storydriven.modeling.templates.impl.TemplateBindingImpl <em>Template Binding</em>}' class.
       * <!-- begin-user-doc --> <!--
       * end-user-doc -->
       * @see org.storydriven.modeling.templates.impl.TemplateBindingImpl
       * @see org.storydriven.modeling.templates.impl.TemplatesPackageImpl#getTemplateBinding()
       * @generated
       */
      EClass TEMPLATE_BINDING = eINSTANCE.getTemplateBinding();

      /**
       * The meta object literal for the '<em><b>Bound Parameter</b></em>' reference feature.
       * <!-- begin-user-doc --> <!-- end-user-doc -->
       * @generated
       */
      EReference TEMPLATE_BINDING__BOUND_PARAMETER = eINSTANCE.getTemplateBinding_BoundParameter();

      /**
       * The meta object literal for the '<em><b>Binding Expression</b></em>' containment reference feature.
       * <!-- begin-user-doc --> <!-- end-user-doc -->
       * @generated
       */
      EReference TEMPLATE_BINDING__BINDING_EXPRESSION = eINSTANCE.getTemplateBinding_BindingExpression();

      /**
       * The meta object literal for the '<em><b>Property Binding</b></em>' containment reference list feature.
       * <!-- begin-user-doc --> <!-- end-user-doc -->
       * @generated
       */
      EReference TEMPLATE_BINDING__PROPERTY_BINDING = eINSTANCE.getTemplateBinding_PropertyBinding();

      /**
       * The meta object literal for the '<em><b>Template</b></em>' container reference feature.
       * <!-- begin-user-doc --> <!-- end-user-doc -->
       * @generated
       */
      EReference TEMPLATE_BINDING__TEMPLATE = eINSTANCE.getTemplateBinding_Template();

      /**
       * The meta object literal for the '{@link org.storydriven.modeling.templates.impl.PropertyBindingImpl <em>Property Binding</em>}' class.
       * <!-- begin-user-doc --> <!--
       * end-user-doc -->
       * @see org.storydriven.modeling.templates.impl.PropertyBindingImpl
       * @see org.storydriven.modeling.templates.impl.TemplatesPackageImpl#getPropertyBinding()
       * @generated
       */
      EClass PROPERTY_BINDING = eINSTANCE.getPropertyBinding();

      /**
       * The meta object literal for the '<em><b>Bound Property</b></em>' reference feature.
       * <!-- begin-user-doc --> <!-- end-user-doc -->
       * @generated
       */
      EReference PROPERTY_BINDING__BOUND_PROPERTY = eINSTANCE.getPropertyBinding_BoundProperty();

      /**
       * The meta object literal for the '<em><b>Binding Expression</b></em>' containment reference feature.
       * <!-- begin-user-doc --> <!-- end-user-doc -->
       * @generated
       */
      EReference PROPERTY_BINDING__BINDING_EXPRESSION = eINSTANCE.getPropertyBinding_BindingExpression();

      /**
       * The meta object literal for the '<em><b>Template Binding</b></em>' container reference feature.
       * <!-- begin-user-doc --> <!-- end-user-doc -->
       * @generated
       */
      EReference PROPERTY_BINDING__TEMPLATE_BINDING = eINSTANCE.getPropertyBinding_TemplateBinding();

   }

} // TemplatesPackage
