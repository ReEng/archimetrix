/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * The modeling package is the root package for the SDM meta-model. It defines several abstract super classes which implement an extension mechanism as well as reoccuring structural features like, e.g., names of elements. The classes in this package are intended to be sub-classed by any meta-model element.
 * <!-- end-model-doc -->
 * @see org.storydriven.modeling.SDMFactory
 * @model kind="package"
 * @generated
 */
public interface SDMPackage extends EPackage
{
   /**
    * The package name.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   String eNAME = "modeling";

   /**
    * The package namespace URI.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   String eNS_URI = "http://ns.storydriven.org/sdm/0.1.0";

   /**
    * The package namespace name.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   String eNS_PREFIX = "sdm";

   /**
    * The package content type ID.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   String eCONTENT_TYPE = "org.storydriven.modeling";

   /**
    * The extension annotation namespace URI.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated NOT
    */
   String EXTENSION_NS_URI = "http://ns.storydriven.org/sdm/extension";

   /**
    * The singleton instance of the package.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   SDMPackage eINSTANCE = org.storydriven.modeling.impl.SDMPackageImpl.init();

   /**
    * The meta object id for the '{@link org.storydriven.modeling.impl.ExtendableElementImpl <em>Extendable Element</em>}' class.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see org.storydriven.modeling.impl.ExtendableElementImpl
    * @see org.storydriven.modeling.impl.SDMPackageImpl#getExtendableElement()
    * @generated
    */
   int EXTENDABLE_ELEMENT = 1;

   /**
    * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXTENDABLE_ELEMENT__ANNOTATION = EcorePackage.EOBJECT_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Extension</b></em>' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXTENDABLE_ELEMENT__EXTENSION = EcorePackage.EOBJECT_FEATURE_COUNT + 1;

   /**
    * The number of structural features of the '<em>Extendable Element</em>' class.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXTENDABLE_ELEMENT_FEATURE_COUNT = EcorePackage.EOBJECT_FEATURE_COUNT + 2;

   /**
    * The operation id for the '<em>EClass</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXTENDABLE_ELEMENT___ECLASS = EcorePackage.EOBJECT___ECLASS;

   /**
    * The operation id for the '<em>EIs Proxy</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXTENDABLE_ELEMENT___EIS_PROXY = EcorePackage.EOBJECT___EIS_PROXY;

   /**
    * The operation id for the '<em>EResource</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXTENDABLE_ELEMENT___ERESOURCE = EcorePackage.EOBJECT___ERESOURCE;

   /**
    * The operation id for the '<em>EContainer</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXTENDABLE_ELEMENT___ECONTAINER = EcorePackage.EOBJECT___ECONTAINER;

   /**
    * The operation id for the '<em>EContaining Feature</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXTENDABLE_ELEMENT___ECONTAINING_FEATURE = EcorePackage.EOBJECT___ECONTAINING_FEATURE;

   /**
    * The operation id for the '<em>EContainment Feature</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXTENDABLE_ELEMENT___ECONTAINMENT_FEATURE = EcorePackage.EOBJECT___ECONTAINMENT_FEATURE;

   /**
    * The operation id for the '<em>EContents</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXTENDABLE_ELEMENT___ECONTENTS = EcorePackage.EOBJECT___ECONTENTS;

   /**
    * The operation id for the '<em>EAll Contents</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXTENDABLE_ELEMENT___EALL_CONTENTS = EcorePackage.EOBJECT___EALL_CONTENTS;

   /**
    * The operation id for the '<em>ECross References</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXTENDABLE_ELEMENT___ECROSS_REFERENCES = EcorePackage.EOBJECT___ECROSS_REFERENCES;

   /**
    * The operation id for the '<em>EGet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXTENDABLE_ELEMENT___EGET__ESTRUCTURALFEATURE = EcorePackage.EOBJECT___EGET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EGet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXTENDABLE_ELEMENT___EGET__ESTRUCTURALFEATURE_BOOLEAN = EcorePackage.EOBJECT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

   /**
    * The operation id for the '<em>ESet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXTENDABLE_ELEMENT___ESET__ESTRUCTURALFEATURE_OBJECT = EcorePackage.EOBJECT___ESET__ESTRUCTURALFEATURE_OBJECT;

   /**
    * The operation id for the '<em>EIs Set</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXTENDABLE_ELEMENT___EIS_SET__ESTRUCTURALFEATURE = EcorePackage.EOBJECT___EIS_SET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EUnset</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXTENDABLE_ELEMENT___EUNSET__ESTRUCTURALFEATURE = EcorePackage.EOBJECT___EUNSET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EInvoke</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXTENDABLE_ELEMENT___EINVOKE__EOPERATION_ELIST = EcorePackage.EOBJECT___EINVOKE__EOPERATION_ELIST;

   /**
    * The operation id for the '<em>Get Extension</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXTENDABLE_ELEMENT___GET_EXTENSION__ECLASS = EcorePackage.EOBJECT_OPERATION_COUNT + 0;

   /**
    * The operation id for the '<em>Provide Extension</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXTENDABLE_ELEMENT___PROVIDE_EXTENSION__ECLASS = EcorePackage.EOBJECT_OPERATION_COUNT + 1;

   /**
    * The operation id for the '<em>Get Annotation</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXTENDABLE_ELEMENT___GET_ANNOTATION__STRING = EcorePackage.EOBJECT_OPERATION_COUNT + 2;

   /**
    * The operation id for the '<em>Provide Annotation</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXTENDABLE_ELEMENT___PROVIDE_ANNOTATION__STRING = EcorePackage.EOBJECT_OPERATION_COUNT + 3;

   /**
    * The number of operations of the '<em>Extendable Element</em>' class.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXTENDABLE_ELEMENT_OPERATION_COUNT = EcorePackage.EOBJECT_OPERATION_COUNT + 4;

   /**
    * The meta object id for the '{@link org.storydriven.modeling.impl.NamedElementImpl <em>Named Element</em>}' class.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see org.storydriven.modeling.impl.NamedElementImpl
    * @see org.storydriven.modeling.impl.SDMPackageImpl#getNamedElement()
    * @generated
    */
   int NAMED_ELEMENT = 5;

   /**
    * The meta object id for the '{@link org.storydriven.modeling.impl.ExtensionImpl <em>Extension</em>}' class.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see org.storydriven.modeling.impl.ExtensionImpl
    * @see org.storydriven.modeling.impl.SDMPackageImpl#getExtension()
    * @generated
    */
   int EXTENSION = 2;

   /**
    * The meta object id for the '{@link org.storydriven.modeling.impl.CommentableElementImpl <em>Commentable Element</em>}' class.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see org.storydriven.modeling.impl.CommentableElementImpl
    * @see org.storydriven.modeling.impl.SDMPackageImpl#getCommentableElement()
    * @generated
    */
   int COMMENTABLE_ELEMENT = 3;

   /**
    * The meta object id for the '{@link org.storydriven.modeling.impl.TypedElementImpl <em>Typed Element</em>}' class.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see org.storydriven.modeling.impl.TypedElementImpl
    * @see org.storydriven.modeling.impl.SDMPackageImpl#getTypedElement()
    * @generated
    */
   int TYPED_ELEMENT = 0;

   /**
    * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TYPED_ELEMENT__ANNOTATION = EXTENDABLE_ELEMENT__ANNOTATION;

   /**
    * The feature id for the '<em><b>Extension</b></em>' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TYPED_ELEMENT__EXTENSION = EXTENDABLE_ELEMENT__EXTENSION;

   /**
    * The feature id for the '<em><b>Type</b></em>' reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TYPED_ELEMENT__TYPE = EXTENDABLE_ELEMENT_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Generic Type</b></em>' containment reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TYPED_ELEMENT__GENERIC_TYPE = EXTENDABLE_ELEMENT_FEATURE_COUNT + 1;

   /**
    * The number of structural features of the '<em>Typed Element</em>' class.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TYPED_ELEMENT_FEATURE_COUNT = EXTENDABLE_ELEMENT_FEATURE_COUNT + 2;

   /**
    * The operation id for the '<em>EClass</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TYPED_ELEMENT___ECLASS = EXTENDABLE_ELEMENT___ECLASS;

   /**
    * The operation id for the '<em>EIs Proxy</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TYPED_ELEMENT___EIS_PROXY = EXTENDABLE_ELEMENT___EIS_PROXY;

   /**
    * The operation id for the '<em>EResource</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TYPED_ELEMENT___ERESOURCE = EXTENDABLE_ELEMENT___ERESOURCE;

   /**
    * The operation id for the '<em>EContainer</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TYPED_ELEMENT___ECONTAINER = EXTENDABLE_ELEMENT___ECONTAINER;

   /**
    * The operation id for the '<em>EContaining Feature</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TYPED_ELEMENT___ECONTAINING_FEATURE = EXTENDABLE_ELEMENT___ECONTAINING_FEATURE;

   /**
    * The operation id for the '<em>EContainment Feature</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TYPED_ELEMENT___ECONTAINMENT_FEATURE = EXTENDABLE_ELEMENT___ECONTAINMENT_FEATURE;

   /**
    * The operation id for the '<em>EContents</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TYPED_ELEMENT___ECONTENTS = EXTENDABLE_ELEMENT___ECONTENTS;

   /**
    * The operation id for the '<em>EAll Contents</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TYPED_ELEMENT___EALL_CONTENTS = EXTENDABLE_ELEMENT___EALL_CONTENTS;

   /**
    * The operation id for the '<em>ECross References</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TYPED_ELEMENT___ECROSS_REFERENCES = EXTENDABLE_ELEMENT___ECROSS_REFERENCES;

   /**
    * The operation id for the '<em>EGet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TYPED_ELEMENT___EGET__ESTRUCTURALFEATURE = EXTENDABLE_ELEMENT___EGET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EGet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TYPED_ELEMENT___EGET__ESTRUCTURALFEATURE_BOOLEAN = EXTENDABLE_ELEMENT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

   /**
    * The operation id for the '<em>ESet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TYPED_ELEMENT___ESET__ESTRUCTURALFEATURE_OBJECT = EXTENDABLE_ELEMENT___ESET__ESTRUCTURALFEATURE_OBJECT;

   /**
    * The operation id for the '<em>EIs Set</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TYPED_ELEMENT___EIS_SET__ESTRUCTURALFEATURE = EXTENDABLE_ELEMENT___EIS_SET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EUnset</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TYPED_ELEMENT___EUNSET__ESTRUCTURALFEATURE = EXTENDABLE_ELEMENT___EUNSET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EInvoke</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TYPED_ELEMENT___EINVOKE__EOPERATION_ELIST = EXTENDABLE_ELEMENT___EINVOKE__EOPERATION_ELIST;

   /**
    * The operation id for the '<em>Get Extension</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TYPED_ELEMENT___GET_EXTENSION__ECLASS = EXTENDABLE_ELEMENT___GET_EXTENSION__ECLASS;

   /**
    * The operation id for the '<em>Provide Extension</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TYPED_ELEMENT___PROVIDE_EXTENSION__ECLASS = EXTENDABLE_ELEMENT___PROVIDE_EXTENSION__ECLASS;

   /**
    * The operation id for the '<em>Get Annotation</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TYPED_ELEMENT___GET_ANNOTATION__STRING = EXTENDABLE_ELEMENT___GET_ANNOTATION__STRING;

   /**
    * The operation id for the '<em>Provide Annotation</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TYPED_ELEMENT___PROVIDE_ANNOTATION__STRING = EXTENDABLE_ELEMENT___PROVIDE_ANNOTATION__STRING;

   /**
    * The number of operations of the '<em>Typed Element</em>' class.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TYPED_ELEMENT_OPERATION_COUNT = EXTENDABLE_ELEMENT_OPERATION_COUNT + 0;

   /**
    * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXTENSION__ANNOTATION = EXTENDABLE_ELEMENT__ANNOTATION;

   /**
    * The feature id for the '<em><b>Extension</b></em>' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXTENSION__EXTENSION = EXTENDABLE_ELEMENT__EXTENSION;

   /**
    * The feature id for the '<em><b>Base</b></em>' reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXTENSION__BASE = EXTENDABLE_ELEMENT_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Model Base</b></em>' reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXTENSION__MODEL_BASE = EXTENDABLE_ELEMENT_FEATURE_COUNT + 1;

   /**
    * The feature id for the '<em><b>Owning Annotation</b></em>' reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXTENSION__OWNING_ANNOTATION = EXTENDABLE_ELEMENT_FEATURE_COUNT + 2;

   /**
    * The feature id for the '<em><b>Extendable Base</b></em>' container reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXTENSION__EXTENDABLE_BASE = EXTENDABLE_ELEMENT_FEATURE_COUNT + 3;

   /**
    * The number of structural features of the '<em>Extension</em>' class.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXTENSION_FEATURE_COUNT = EXTENDABLE_ELEMENT_FEATURE_COUNT + 4;

   /**
    * The operation id for the '<em>EClass</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXTENSION___ECLASS = EXTENDABLE_ELEMENT___ECLASS;

   /**
    * The operation id for the '<em>EIs Proxy</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXTENSION___EIS_PROXY = EXTENDABLE_ELEMENT___EIS_PROXY;

   /**
    * The operation id for the '<em>EResource</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXTENSION___ERESOURCE = EXTENDABLE_ELEMENT___ERESOURCE;

   /**
    * The operation id for the '<em>EContainer</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXTENSION___ECONTAINER = EXTENDABLE_ELEMENT___ECONTAINER;

   /**
    * The operation id for the '<em>EContaining Feature</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXTENSION___ECONTAINING_FEATURE = EXTENDABLE_ELEMENT___ECONTAINING_FEATURE;

   /**
    * The operation id for the '<em>EContainment Feature</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXTENSION___ECONTAINMENT_FEATURE = EXTENDABLE_ELEMENT___ECONTAINMENT_FEATURE;

   /**
    * The operation id for the '<em>EContents</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXTENSION___ECONTENTS = EXTENDABLE_ELEMENT___ECONTENTS;

   /**
    * The operation id for the '<em>EAll Contents</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXTENSION___EALL_CONTENTS = EXTENDABLE_ELEMENT___EALL_CONTENTS;

   /**
    * The operation id for the '<em>ECross References</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXTENSION___ECROSS_REFERENCES = EXTENDABLE_ELEMENT___ECROSS_REFERENCES;

   /**
    * The operation id for the '<em>EGet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXTENSION___EGET__ESTRUCTURALFEATURE = EXTENDABLE_ELEMENT___EGET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EGet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXTENSION___EGET__ESTRUCTURALFEATURE_BOOLEAN = EXTENDABLE_ELEMENT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

   /**
    * The operation id for the '<em>ESet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXTENSION___ESET__ESTRUCTURALFEATURE_OBJECT = EXTENDABLE_ELEMENT___ESET__ESTRUCTURALFEATURE_OBJECT;

   /**
    * The operation id for the '<em>EIs Set</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXTENSION___EIS_SET__ESTRUCTURALFEATURE = EXTENDABLE_ELEMENT___EIS_SET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EUnset</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXTENSION___EUNSET__ESTRUCTURALFEATURE = EXTENDABLE_ELEMENT___EUNSET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EInvoke</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXTENSION___EINVOKE__EOPERATION_ELIST = EXTENDABLE_ELEMENT___EINVOKE__EOPERATION_ELIST;

   /**
    * The operation id for the '<em>Get Extension</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXTENSION___GET_EXTENSION__ECLASS = EXTENDABLE_ELEMENT___GET_EXTENSION__ECLASS;

   /**
    * The operation id for the '<em>Provide Extension</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXTENSION___PROVIDE_EXTENSION__ECLASS = EXTENDABLE_ELEMENT___PROVIDE_EXTENSION__ECLASS;

   /**
    * The operation id for the '<em>Get Annotation</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXTENSION___GET_ANNOTATION__STRING = EXTENDABLE_ELEMENT___GET_ANNOTATION__STRING;

   /**
    * The operation id for the '<em>Provide Annotation</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXTENSION___PROVIDE_ANNOTATION__STRING = EXTENDABLE_ELEMENT___PROVIDE_ANNOTATION__STRING;

   /**
    * The number of operations of the '<em>Extension</em>' class.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXTENSION_OPERATION_COUNT = EXTENDABLE_ELEMENT_OPERATION_COUNT + 0;

   /**
    * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMMENTABLE_ELEMENT__ANNOTATION = EXTENDABLE_ELEMENT__ANNOTATION;

   /**
    * The feature id for the '<em><b>Extension</b></em>' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMMENTABLE_ELEMENT__EXTENSION = EXTENDABLE_ELEMENT__EXTENSION;

   /**
    * The feature id for the '<em><b>Comment</b></em>' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMMENTABLE_ELEMENT__COMMENT = EXTENDABLE_ELEMENT_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>Commentable Element</em>' class.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMMENTABLE_ELEMENT_FEATURE_COUNT = EXTENDABLE_ELEMENT_FEATURE_COUNT + 1;

   /**
    * The operation id for the '<em>EClass</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMMENTABLE_ELEMENT___ECLASS = EXTENDABLE_ELEMENT___ECLASS;

   /**
    * The operation id for the '<em>EIs Proxy</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMMENTABLE_ELEMENT___EIS_PROXY = EXTENDABLE_ELEMENT___EIS_PROXY;

   /**
    * The operation id for the '<em>EResource</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMMENTABLE_ELEMENT___ERESOURCE = EXTENDABLE_ELEMENT___ERESOURCE;

   /**
    * The operation id for the '<em>EContainer</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMMENTABLE_ELEMENT___ECONTAINER = EXTENDABLE_ELEMENT___ECONTAINER;

   /**
    * The operation id for the '<em>EContaining Feature</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMMENTABLE_ELEMENT___ECONTAINING_FEATURE = EXTENDABLE_ELEMENT___ECONTAINING_FEATURE;

   /**
    * The operation id for the '<em>EContainment Feature</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMMENTABLE_ELEMENT___ECONTAINMENT_FEATURE = EXTENDABLE_ELEMENT___ECONTAINMENT_FEATURE;

   /**
    * The operation id for the '<em>EContents</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMMENTABLE_ELEMENT___ECONTENTS = EXTENDABLE_ELEMENT___ECONTENTS;

   /**
    * The operation id for the '<em>EAll Contents</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMMENTABLE_ELEMENT___EALL_CONTENTS = EXTENDABLE_ELEMENT___EALL_CONTENTS;

   /**
    * The operation id for the '<em>ECross References</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMMENTABLE_ELEMENT___ECROSS_REFERENCES = EXTENDABLE_ELEMENT___ECROSS_REFERENCES;

   /**
    * The operation id for the '<em>EGet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMMENTABLE_ELEMENT___EGET__ESTRUCTURALFEATURE = EXTENDABLE_ELEMENT___EGET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EGet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMMENTABLE_ELEMENT___EGET__ESTRUCTURALFEATURE_BOOLEAN = EXTENDABLE_ELEMENT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

   /**
    * The operation id for the '<em>ESet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMMENTABLE_ELEMENT___ESET__ESTRUCTURALFEATURE_OBJECT = EXTENDABLE_ELEMENT___ESET__ESTRUCTURALFEATURE_OBJECT;

   /**
    * The operation id for the '<em>EIs Set</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMMENTABLE_ELEMENT___EIS_SET__ESTRUCTURALFEATURE = EXTENDABLE_ELEMENT___EIS_SET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EUnset</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMMENTABLE_ELEMENT___EUNSET__ESTRUCTURALFEATURE = EXTENDABLE_ELEMENT___EUNSET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EInvoke</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMMENTABLE_ELEMENT___EINVOKE__EOPERATION_ELIST = EXTENDABLE_ELEMENT___EINVOKE__EOPERATION_ELIST;

   /**
    * The operation id for the '<em>Get Extension</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMMENTABLE_ELEMENT___GET_EXTENSION__ECLASS = EXTENDABLE_ELEMENT___GET_EXTENSION__ECLASS;

   /**
    * The operation id for the '<em>Provide Extension</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMMENTABLE_ELEMENT___PROVIDE_EXTENSION__ECLASS = EXTENDABLE_ELEMENT___PROVIDE_EXTENSION__ECLASS;

   /**
    * The operation id for the '<em>Get Annotation</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMMENTABLE_ELEMENT___GET_ANNOTATION__STRING = EXTENDABLE_ELEMENT___GET_ANNOTATION__STRING;

   /**
    * The operation id for the '<em>Provide Annotation</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMMENTABLE_ELEMENT___PROVIDE_ANNOTATION__STRING = EXTENDABLE_ELEMENT___PROVIDE_ANNOTATION__STRING;

   /**
    * The number of operations of the '<em>Commentable Element</em>' class.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMMENTABLE_ELEMENT_OPERATION_COUNT = EXTENDABLE_ELEMENT_OPERATION_COUNT + 0;

   /**
    * The meta object id for the '{@link org.storydriven.modeling.impl.VariableImpl <em>Variable</em>}' class.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see org.storydriven.modeling.impl.VariableImpl
    * @see org.storydriven.modeling.impl.SDMPackageImpl#getVariable()
    * @generated
    */
   int VARIABLE = 4;

   /**
    * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int VARIABLE__ANNOTATION = TYPED_ELEMENT__ANNOTATION;

   /**
    * The feature id for the '<em><b>Extension</b></em>' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int VARIABLE__EXTENSION = TYPED_ELEMENT__EXTENSION;

   /**
    * The feature id for the '<em><b>Type</b></em>' reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int VARIABLE__TYPE = TYPED_ELEMENT__TYPE;

   /**
    * The feature id for the '<em><b>Generic Type</b></em>' containment reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int VARIABLE__GENERIC_TYPE = TYPED_ELEMENT__GENERIC_TYPE;

   /**
    * The feature id for the '<em><b>Variable Name</b></em>' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int VARIABLE__VARIABLE_NAME = TYPED_ELEMENT_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>Variable</em>' class.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int VARIABLE_FEATURE_COUNT = TYPED_ELEMENT_FEATURE_COUNT + 1;

   /**
    * The operation id for the '<em>EClass</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int VARIABLE___ECLASS = TYPED_ELEMENT___ECLASS;

   /**
    * The operation id for the '<em>EIs Proxy</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int VARIABLE___EIS_PROXY = TYPED_ELEMENT___EIS_PROXY;

   /**
    * The operation id for the '<em>EResource</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int VARIABLE___ERESOURCE = TYPED_ELEMENT___ERESOURCE;

   /**
    * The operation id for the '<em>EContainer</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int VARIABLE___ECONTAINER = TYPED_ELEMENT___ECONTAINER;

   /**
    * The operation id for the '<em>EContaining Feature</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int VARIABLE___ECONTAINING_FEATURE = TYPED_ELEMENT___ECONTAINING_FEATURE;

   /**
    * The operation id for the '<em>EContainment Feature</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int VARIABLE___ECONTAINMENT_FEATURE = TYPED_ELEMENT___ECONTAINMENT_FEATURE;

   /**
    * The operation id for the '<em>EContents</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int VARIABLE___ECONTENTS = TYPED_ELEMENT___ECONTENTS;

   /**
    * The operation id for the '<em>EAll Contents</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int VARIABLE___EALL_CONTENTS = TYPED_ELEMENT___EALL_CONTENTS;

   /**
    * The operation id for the '<em>ECross References</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int VARIABLE___ECROSS_REFERENCES = TYPED_ELEMENT___ECROSS_REFERENCES;

   /**
    * The operation id for the '<em>EGet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int VARIABLE___EGET__ESTRUCTURALFEATURE = TYPED_ELEMENT___EGET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EGet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int VARIABLE___EGET__ESTRUCTURALFEATURE_BOOLEAN = TYPED_ELEMENT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

   /**
    * The operation id for the '<em>ESet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int VARIABLE___ESET__ESTRUCTURALFEATURE_OBJECT = TYPED_ELEMENT___ESET__ESTRUCTURALFEATURE_OBJECT;

   /**
    * The operation id for the '<em>EIs Set</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int VARIABLE___EIS_SET__ESTRUCTURALFEATURE = TYPED_ELEMENT___EIS_SET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EUnset</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int VARIABLE___EUNSET__ESTRUCTURALFEATURE = TYPED_ELEMENT___EUNSET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EInvoke</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int VARIABLE___EINVOKE__EOPERATION_ELIST = TYPED_ELEMENT___EINVOKE__EOPERATION_ELIST;

   /**
    * The operation id for the '<em>Get Extension</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int VARIABLE___GET_EXTENSION__ECLASS = TYPED_ELEMENT___GET_EXTENSION__ECLASS;

   /**
    * The operation id for the '<em>Provide Extension</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int VARIABLE___PROVIDE_EXTENSION__ECLASS = TYPED_ELEMENT___PROVIDE_EXTENSION__ECLASS;

   /**
    * The operation id for the '<em>Get Annotation</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int VARIABLE___GET_ANNOTATION__STRING = TYPED_ELEMENT___GET_ANNOTATION__STRING;

   /**
    * The operation id for the '<em>Provide Annotation</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int VARIABLE___PROVIDE_ANNOTATION__STRING = TYPED_ELEMENT___PROVIDE_ANNOTATION__STRING;

   /**
    * The number of operations of the '<em>Variable</em>' class.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int VARIABLE_OPERATION_COUNT = TYPED_ELEMENT_OPERATION_COUNT + 0;

   /**
    * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NAMED_ELEMENT__ANNOTATION = EXTENDABLE_ELEMENT__ANNOTATION;

   /**
    * The feature id for the '<em><b>Extension</b></em>' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NAMED_ELEMENT__EXTENSION = EXTENDABLE_ELEMENT__EXTENSION;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NAMED_ELEMENT__NAME = EXTENDABLE_ELEMENT_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>Named Element</em>' class.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NAMED_ELEMENT_FEATURE_COUNT = EXTENDABLE_ELEMENT_FEATURE_COUNT + 1;

   /**
    * The operation id for the '<em>EClass</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NAMED_ELEMENT___ECLASS = EXTENDABLE_ELEMENT___ECLASS;

   /**
    * The operation id for the '<em>EIs Proxy</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NAMED_ELEMENT___EIS_PROXY = EXTENDABLE_ELEMENT___EIS_PROXY;

   /**
    * The operation id for the '<em>EResource</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NAMED_ELEMENT___ERESOURCE = EXTENDABLE_ELEMENT___ERESOURCE;

   /**
    * The operation id for the '<em>EContainer</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NAMED_ELEMENT___ECONTAINER = EXTENDABLE_ELEMENT___ECONTAINER;

   /**
    * The operation id for the '<em>EContaining Feature</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NAMED_ELEMENT___ECONTAINING_FEATURE = EXTENDABLE_ELEMENT___ECONTAINING_FEATURE;

   /**
    * The operation id for the '<em>EContainment Feature</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NAMED_ELEMENT___ECONTAINMENT_FEATURE = EXTENDABLE_ELEMENT___ECONTAINMENT_FEATURE;

   /**
    * The operation id for the '<em>EContents</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NAMED_ELEMENT___ECONTENTS = EXTENDABLE_ELEMENT___ECONTENTS;

   /**
    * The operation id for the '<em>EAll Contents</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NAMED_ELEMENT___EALL_CONTENTS = EXTENDABLE_ELEMENT___EALL_CONTENTS;

   /**
    * The operation id for the '<em>ECross References</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NAMED_ELEMENT___ECROSS_REFERENCES = EXTENDABLE_ELEMENT___ECROSS_REFERENCES;

   /**
    * The operation id for the '<em>EGet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NAMED_ELEMENT___EGET__ESTRUCTURALFEATURE = EXTENDABLE_ELEMENT___EGET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EGet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NAMED_ELEMENT___EGET__ESTRUCTURALFEATURE_BOOLEAN = EXTENDABLE_ELEMENT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

   /**
    * The operation id for the '<em>ESet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NAMED_ELEMENT___ESET__ESTRUCTURALFEATURE_OBJECT = EXTENDABLE_ELEMENT___ESET__ESTRUCTURALFEATURE_OBJECT;

   /**
    * The operation id for the '<em>EIs Set</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NAMED_ELEMENT___EIS_SET__ESTRUCTURALFEATURE = EXTENDABLE_ELEMENT___EIS_SET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EUnset</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NAMED_ELEMENT___EUNSET__ESTRUCTURALFEATURE = EXTENDABLE_ELEMENT___EUNSET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EInvoke</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NAMED_ELEMENT___EINVOKE__EOPERATION_ELIST = EXTENDABLE_ELEMENT___EINVOKE__EOPERATION_ELIST;

   /**
    * The operation id for the '<em>Get Extension</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NAMED_ELEMENT___GET_EXTENSION__ECLASS = EXTENDABLE_ELEMENT___GET_EXTENSION__ECLASS;

   /**
    * The operation id for the '<em>Provide Extension</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NAMED_ELEMENT___PROVIDE_EXTENSION__ECLASS = EXTENDABLE_ELEMENT___PROVIDE_EXTENSION__ECLASS;

   /**
    * The operation id for the '<em>Get Annotation</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NAMED_ELEMENT___GET_ANNOTATION__STRING = EXTENDABLE_ELEMENT___GET_ANNOTATION__STRING;

   /**
    * The operation id for the '<em>Provide Annotation</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NAMED_ELEMENT___PROVIDE_ANNOTATION__STRING = EXTENDABLE_ELEMENT___PROVIDE_ANNOTATION__STRING;

   /**
    * The number of operations of the '<em>Named Element</em>' class.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NAMED_ELEMENT_OPERATION_COUNT = EXTENDABLE_ELEMENT_OPERATION_COUNT + 0;

   /**
    * Returns the meta object for class '{@link org.storydriven.modeling.NamedElement <em>Named Element</em>}'.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @return the meta object for class '<em>Named Element</em>'.
    * @see org.storydriven.modeling.NamedElement
    * @generated
    */
   EClass getNamedElement ();

   /**
    * Returns the meta object for the attribute '{@link org.storydriven.modeling.NamedElement#getName <em>Name</em>}'.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Name</em>'.
    * @see org.storydriven.modeling.NamedElement#getName()
    * @see #getNamedElement()
    * @generated
    */
   EAttribute getNamedElement_Name ();

   /**
    * Returns the meta object for class '{@link org.storydriven.modeling.ExtendableElement <em>Extendable Element</em>}'.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @return the meta object for class '<em>Extendable Element</em>'.
    * @see org.storydriven.modeling.ExtendableElement
    * @generated
    */
   EClass getExtendableElement ();

   /**
    * Returns the meta object for the containment reference list '{@link org.storydriven.modeling.ExtendableElement#getAnnotations <em>Annotation</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Annotation</em>'.
    * @see org.storydriven.modeling.ExtendableElement#getAnnotations()
    * @see #getExtendableElement()
    * @generated
    */
   EReference getExtendableElement_Annotation ();

   /**
    * Returns the meta object for the containment reference list '{@link org.storydriven.modeling.ExtendableElement#getExtensions <em>Extension</em>}'.
    * <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * @return the meta object for the containment reference list '<em>Extension</em>'.
    * @see org.storydriven.modeling.ExtendableElement#getExtensions()
    * @see #getExtendableElement()
    * @generated
    */
   EReference getExtendableElement_Extension ();

   /**
    * Returns the meta object for the '{@link org.storydriven.modeling.ExtendableElement#getExtension(org.eclipse.emf.ecore.EClass) <em>Get Extension</em>}' operation. <!--
    * begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for the '<em>Get Extension</em>' operation.
    * @see org.storydriven.modeling.ExtendableElement#getExtension(org.eclipse.emf.ecore.EClass)
    * @generated
    */
   EOperation getExtendableElement__GetExtension__EClass ();

   /**
    * Returns the meta object for the '{@link org.storydriven.modeling.ExtendableElement#provideExtension(org.eclipse.emf.ecore.EClass) <em>Provide Extension</em>}' operation. <!--
    * begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for the '<em>Provide Extension</em>' operation.
    * @see org.storydriven.modeling.ExtendableElement#provideExtension(org.eclipse.emf.ecore.EClass)
    * @generated
    */
   EOperation getExtendableElement__ProvideExtension__EClass ();

   /**
    * Returns the meta object for the '{@link org.storydriven.modeling.ExtendableElement#getAnnotation(java.lang.String) <em>Get Annotation</em>}' operation.
    * <!-- begin-user-doc
    * --> <!-- end-user-doc -->
    * @return the meta object for the '<em>Get Annotation</em>' operation.
    * @see org.storydriven.modeling.ExtendableElement#getAnnotation(java.lang.String)
    * @generated
    */
   EOperation getExtendableElement__GetAnnotation__String ();

   /**
    * Returns the meta object for the '{@link org.storydriven.modeling.ExtendableElement#provideAnnotation(java.lang.String) <em>Provide Annotation</em>}' operation. <!--
    * begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for the '<em>Provide Annotation</em>' operation.
    * @see org.storydriven.modeling.ExtendableElement#provideAnnotation(java.lang.String)
    * @generated
    */
   EOperation getExtendableElement__ProvideAnnotation__String ();

   /**
    * Returns the meta object for class '{@link org.storydriven.modeling.Extension <em>Extension</em>}'.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @return the meta object for class '<em>Extension</em>'.
    * @see org.storydriven.modeling.Extension
    * @generated
    */
   EClass getExtension ();

   /**
    * Returns the meta object for the reference '{@link org.storydriven.modeling.Extension#getBase <em>Base</em>}'.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Base</em>'.
    * @see org.storydriven.modeling.Extension#getBase()
    * @see #getExtension()
    * @generated
    */
   EReference getExtension_Base ();

   /**
    * Returns the meta object for the reference '{@link org.storydriven.modeling.Extension#getModelBase <em>Model Base</em>}'.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Model Base</em>'.
    * @see org.storydriven.modeling.Extension#getModelBase()
    * @see #getExtension()
    * @generated
    */
   EReference getExtension_ModelBase ();

   /**
    * Returns the meta object for the reference '{@link org.storydriven.modeling.Extension#getOwningAnnotation <em>Owning Annotation</em>}'.
    * <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * @return the meta object for the reference '<em>Owning Annotation</em>'.
    * @see org.storydriven.modeling.Extension#getOwningAnnotation()
    * @see #getExtension()
    * @generated
    */
   EReference getExtension_OwningAnnotation ();

   /**
    * Returns the meta object for the container reference '{@link org.storydriven.modeling.Extension#getExtendableBase <em>Extendable Base</em>}'.
    * <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * @return the meta object for the container reference '<em>Extendable Base</em>'.
    * @see org.storydriven.modeling.Extension#getExtendableBase()
    * @see #getExtension()
    * @generated
    */
   EReference getExtension_ExtendableBase ();

   /**
    * Returns the meta object for class '{@link org.storydriven.modeling.CommentableElement <em>Commentable Element</em>}'.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @return the meta object for class '<em>Commentable Element</em>'.
    * @see org.storydriven.modeling.CommentableElement
    * @generated
    */
   EClass getCommentableElement ();

   /**
    * Returns the meta object for the attribute '{@link org.storydriven.modeling.CommentableElement#getComment <em>Comment</em>}'.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Comment</em>'.
    * @see org.storydriven.modeling.CommentableElement#getComment()
    * @see #getCommentableElement()
    * @generated
    */
   EAttribute getCommentableElement_Comment ();

   /**
    * Returns the meta object for class '{@link org.storydriven.modeling.TypedElement <em>Typed Element</em>}'.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @return the meta object for class '<em>Typed Element</em>'.
    * @see org.storydriven.modeling.TypedElement
    * @generated
    */
   EClass getTypedElement ();

   /**
    * Returns the meta object for the reference '{@link org.storydriven.modeling.TypedElement#getType <em>Type</em>}'.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Type</em>'.
    * @see org.storydriven.modeling.TypedElement#getType()
    * @see #getTypedElement()
    * @generated
    */
   EReference getTypedElement_Type ();

   /**
    * Returns the meta object for the containment reference '{@link org.storydriven.modeling.TypedElement#getGenericType <em>Generic Type</em>}'.
    * <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * @return the meta object for the containment reference '<em>Generic Type</em>'.
    * @see org.storydriven.modeling.TypedElement#getGenericType()
    * @see #getTypedElement()
    * @generated
    */
   EReference getTypedElement_GenericType ();

   /**
    * Returns the meta object for class '{@link org.storydriven.modeling.Variable <em>Variable</em>}'.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @return the meta object for class '<em>Variable</em>'.
    * @see org.storydriven.modeling.Variable
    * @generated
    */
   EClass getVariable ();

   /**
    * Returns the meta object for the attribute '{@link org.storydriven.modeling.Variable#getVariableName <em>Variable Name</em>}'.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Variable Name</em>'.
    * @see org.storydriven.modeling.Variable#getVariableName()
    * @see #getVariable()
    * @generated
    */
   EAttribute getVariable_VariableName ();

   /**
    * Returns the factory that creates the instances of the model.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @return the factory that creates the instances of the model.
    * @generated
    */
   SDMFactory getSDMFactory ();

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
       * The meta object literal for the '{@link org.storydriven.modeling.impl.NamedElementImpl <em>Named Element</em>}' class.
       * <!-- begin-user-doc --> <!-- end-user-doc -->
       * @see org.storydriven.modeling.impl.NamedElementImpl
       * @see org.storydriven.modeling.impl.SDMPackageImpl#getNamedElement()
       * @generated
       */
      EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

      /**
       * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
       * <!-- begin-user-doc --> <!-- end-user-doc -->
       * @generated
       */
      EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

      /**
       * The meta object literal for the '{@link org.storydriven.modeling.impl.ExtendableElementImpl <em>Extendable Element</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
       * -->
       * 
       * @see org.storydriven.modeling.impl.ExtendableElementImpl
       * @see org.storydriven.modeling.impl.SDMPackageImpl#getExtendableElement()
       * @generated
       */
      EClass EXTENDABLE_ELEMENT = eINSTANCE.getExtendableElement();

      /**
       * The meta object literal for the '<em><b>Annotation</b></em>' containment reference list feature.
       * <!-- begin-user-doc --> <!-- end-user-doc -->
       * @generated
       */
      EReference EXTENDABLE_ELEMENT__ANNOTATION = eINSTANCE.getExtendableElement_Annotation();

      /**
       * The meta object literal for the '<em><b>Extension</b></em>' containment reference list feature.
       * <!-- begin-user-doc --> <!-- end-user-doc -->
       * @generated
       */
      EReference EXTENDABLE_ELEMENT__EXTENSION = eINSTANCE.getExtendableElement_Extension();

      /**
       * The meta object literal for the '<em><b>Get Extension</b></em>' operation.
       * <!-- begin-user-doc --> <!-- end-user-doc -->
       * @generated
       */
      EOperation EXTENDABLE_ELEMENT___GET_EXTENSION__ECLASS = eINSTANCE.getExtendableElement__GetExtension__EClass();

      /**
       * The meta object literal for the '<em><b>Provide Extension</b></em>' operation.
       * <!-- begin-user-doc --> <!-- end-user-doc -->
       * @generated
       */
      EOperation EXTENDABLE_ELEMENT___PROVIDE_EXTENSION__ECLASS = eINSTANCE
         .getExtendableElement__ProvideExtension__EClass();

      /**
       * The meta object literal for the '<em><b>Get Annotation</b></em>' operation.
       * <!-- begin-user-doc --> <!-- end-user-doc -->
       * @generated
       */
      EOperation EXTENDABLE_ELEMENT___GET_ANNOTATION__STRING = eINSTANCE.getExtendableElement__GetAnnotation__String();

      /**
       * The meta object literal for the '<em><b>Provide Annotation</b></em>' operation.
       * <!-- begin-user-doc --> <!-- end-user-doc -->
       * @generated
       */
      EOperation EXTENDABLE_ELEMENT___PROVIDE_ANNOTATION__STRING = eINSTANCE
         .getExtendableElement__ProvideAnnotation__String();

      /**
       * The meta object literal for the '{@link org.storydriven.modeling.impl.ExtensionImpl <em>Extension</em>}' class.
       * <!-- begin-user-doc --> <!-- end-user-doc -->
       * @see org.storydriven.modeling.impl.ExtensionImpl
       * @see org.storydriven.modeling.impl.SDMPackageImpl#getExtension()
       * @generated
       */
      EClass EXTENSION = eINSTANCE.getExtension();

      /**
       * The meta object literal for the '<em><b>Base</b></em>' reference feature.
       * <!-- begin-user-doc --> <!-- end-user-doc -->
       * @generated
       */
      EReference EXTENSION__BASE = eINSTANCE.getExtension_Base();

      /**
       * The meta object literal for the '<em><b>Model Base</b></em>' reference feature.
       * <!-- begin-user-doc --> <!-- end-user-doc -->
       * @generated
       */
      EReference EXTENSION__MODEL_BASE = eINSTANCE.getExtension_ModelBase();

      /**
       * The meta object literal for the '<em><b>Owning Annotation</b></em>' reference feature.
       * <!-- begin-user-doc --> <!-- end-user-doc -->
       * @generated
       */
      EReference EXTENSION__OWNING_ANNOTATION = eINSTANCE.getExtension_OwningAnnotation();

      /**
       * The meta object literal for the '<em><b>Extendable Base</b></em>' container reference feature.
       * <!-- begin-user-doc --> <!-- end-user-doc -->
       * @generated
       */
      EReference EXTENSION__EXTENDABLE_BASE = eINSTANCE.getExtension_ExtendableBase();

      /**
       * The meta object literal for the '{@link org.storydriven.modeling.impl.CommentableElementImpl <em>Commentable Element</em>}' class.
       * <!-- begin-user-doc --> <!--
       * end-user-doc -->
       * @see org.storydriven.modeling.impl.CommentableElementImpl
       * @see org.storydriven.modeling.impl.SDMPackageImpl#getCommentableElement()
       * @generated
       */
      EClass COMMENTABLE_ELEMENT = eINSTANCE.getCommentableElement();

      /**
       * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
       * <!-- begin-user-doc --> <!-- end-user-doc -->
       * @generated
       */
      EAttribute COMMENTABLE_ELEMENT__COMMENT = eINSTANCE.getCommentableElement_Comment();

      /**
       * The meta object literal for the '{@link org.storydriven.modeling.impl.TypedElementImpl <em>Typed Element</em>}' class.
       * <!-- begin-user-doc --> <!-- end-user-doc -->
       * @see org.storydriven.modeling.impl.TypedElementImpl
       * @see org.storydriven.modeling.impl.SDMPackageImpl#getTypedElement()
       * @generated
       */
      EClass TYPED_ELEMENT = eINSTANCE.getTypedElement();

      /**
       * The meta object literal for the '<em><b>Type</b></em>' reference feature.
       * <!-- begin-user-doc --> <!-- end-user-doc -->
       * @generated
       */
      EReference TYPED_ELEMENT__TYPE = eINSTANCE.getTypedElement_Type();

      /**
       * The meta object literal for the '<em><b>Generic Type</b></em>' containment reference feature.
       * <!-- begin-user-doc --> <!-- end-user-doc -->
       * @generated
       */
      EReference TYPED_ELEMENT__GENERIC_TYPE = eINSTANCE.getTypedElement_GenericType();

      /**
       * The meta object literal for the '{@link org.storydriven.modeling.impl.VariableImpl <em>Variable</em>}' class.
       * <!-- begin-user-doc --> <!-- end-user-doc -->
       * @see org.storydriven.modeling.impl.VariableImpl
       * @see org.storydriven.modeling.impl.SDMPackageImpl#getVariable()
       * @generated
       */
      EClass VARIABLE = eINSTANCE.getVariable();

      /**
       * The meta object literal for the '<em><b>Variable Name</b></em>' attribute feature.
       * <!-- begin-user-doc --> <!-- end-user-doc -->
       * @generated
       */
      EAttribute VARIABLE__VARIABLE_NAME = eINSTANCE.getVariable_VariableName();

   }

} // SDMPackage
