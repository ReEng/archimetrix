/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.fujaba.commons.notation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.fujaba.commons.identifier.IdentifierPackage;


/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * This package containes all relevant elements to represent a diagram graphically.
 * <!-- end-model-doc -->
 * @see org.fujaba.commons.notation.NotationFactory
 * @model kind="package"
 * @generated
 */
public interface NotationPackage extends EPackage
{
   /**
    * The package name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNAME = "notation";

   /**
    * The package namespace URI.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNS_URI = "http://www.fujaba.org/ns/notation";

   /**
    * The package namespace name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNS_PREFIX = "notation";

   /**
    * The singleton instance of the package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   NotationPackage eINSTANCE = org.fujaba.commons.notation.impl.NotationPackageImpl.init();

   /**
    * The meta object id for the '{@link org.fujaba.commons.notation.DiagramElement <em>Diagram Element</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.fujaba.commons.notation.DiagramElement
    * @see org.fujaba.commons.notation.impl.NotationPackageImpl#getDiagramElement()
    * @generated
    */
   int DIAGRAM_ELEMENT = 0;

   /**
    * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int DIAGRAM_ELEMENT__EANNOTATIONS = IdentifierPackage.IDENTIFIER__EANNOTATIONS;

   /**
    * The feature id for the '<em><b>Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int DIAGRAM_ELEMENT__ID = IdentifierPackage.IDENTIFIER__ID;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int DIAGRAM_ELEMENT__NAME = IdentifierPackage.IDENTIFIER__NAME;

   /**
    * The feature id for the '<em><b>Model</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int DIAGRAM_ELEMENT__MODEL = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Visible</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int DIAGRAM_ELEMENT__VISIBLE = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

   /**
    * The feature id for the '<em><b>Persistent</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int DIAGRAM_ELEMENT__PERSISTENT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

   /**
    * The number of structural features of the '<em>Diagram Element</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int DIAGRAM_ELEMENT_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 3;

   /**
    * The meta object id for the '{@link org.fujaba.commons.notation.impl.NodeImpl <em>Node</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.fujaba.commons.notation.impl.NodeImpl
    * @see org.fujaba.commons.notation.impl.NotationPackageImpl#getNode()
    * @generated
    */
   int NODE = 1;

   /**
    * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NODE__EANNOTATIONS = DIAGRAM_ELEMENT__EANNOTATIONS;

   /**
    * The feature id for the '<em><b>Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NODE__ID = DIAGRAM_ELEMENT__ID;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NODE__NAME = DIAGRAM_ELEMENT__NAME;

   /**
    * The feature id for the '<em><b>Model</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NODE__MODEL = DIAGRAM_ELEMENT__MODEL;

   /**
    * The feature id for the '<em><b>Visible</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NODE__VISIBLE = DIAGRAM_ELEMENT__VISIBLE;

   /**
    * The feature id for the '<em><b>Persistent</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NODE__PERSISTENT = DIAGRAM_ELEMENT__PERSISTENT;

   /**
    * The feature id for the '<em><b>Outgoing</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NODE__OUTGOING = DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Incoming</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NODE__INCOMING = DIAGRAM_ELEMENT_FEATURE_COUNT + 1;

   /**
    * The feature id for the '<em><b>Parent</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NODE__PARENT = DIAGRAM_ELEMENT_FEATURE_COUNT + 2;

   /**
    * The feature id for the '<em><b>X</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NODE__X = DIAGRAM_ELEMENT_FEATURE_COUNT + 3;

   /**
    * The feature id for the '<em><b>Y</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NODE__Y = DIAGRAM_ELEMENT_FEATURE_COUNT + 4;

   /**
    * The feature id for the '<em><b>Width</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NODE__WIDTH = DIAGRAM_ELEMENT_FEATURE_COUNT + 5;

   /**
    * The feature id for the '<em><b>Height</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NODE__HEIGHT = DIAGRAM_ELEMENT_FEATURE_COUNT + 6;

   /**
    * The number of structural features of the '<em>Node</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NODE_FEATURE_COUNT = DIAGRAM_ELEMENT_FEATURE_COUNT + 7;

   /**
    * The meta object id for the '{@link org.fujaba.commons.notation.impl.EdgeImpl <em>Edge</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.fujaba.commons.notation.impl.EdgeImpl
    * @see org.fujaba.commons.notation.impl.NotationPackageImpl#getEdge()
    * @generated
    */
   int EDGE = 2;

   /**
    * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EDGE__EANNOTATIONS = DIAGRAM_ELEMENT__EANNOTATIONS;

   /**
    * The feature id for the '<em><b>Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EDGE__ID = DIAGRAM_ELEMENT__ID;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EDGE__NAME = DIAGRAM_ELEMENT__NAME;

   /**
    * The feature id for the '<em><b>Model</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EDGE__MODEL = DIAGRAM_ELEMENT__MODEL;

   /**
    * The feature id for the '<em><b>Visible</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EDGE__VISIBLE = DIAGRAM_ELEMENT__VISIBLE;

   /**
    * The feature id for the '<em><b>Persistent</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EDGE__PERSISTENT = DIAGRAM_ELEMENT__PERSISTENT;

   /**
    * The feature id for the '<em><b>Source</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EDGE__SOURCE = DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Target</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EDGE__TARGET = DIAGRAM_ELEMENT_FEATURE_COUNT + 1;

   /**
    * The feature id for the '<em><b>Parent</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EDGE__PARENT = DIAGRAM_ELEMENT_FEATURE_COUNT + 2;

   /**
    * The feature id for the '<em><b>Source Anchor</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EDGE__SOURCE_ANCHOR = DIAGRAM_ELEMENT_FEATURE_COUNT + 3;

   /**
    * The feature id for the '<em><b>Target Anchor</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EDGE__TARGET_ANCHOR = DIAGRAM_ELEMENT_FEATURE_COUNT + 4;

   /**
    * The feature id for the '<em><b>Bend Points</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EDGE__BEND_POINTS = DIAGRAM_ELEMENT_FEATURE_COUNT + 5;

   /**
    * The number of structural features of the '<em>Edge</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EDGE_FEATURE_COUNT = DIAGRAM_ELEMENT_FEATURE_COUNT + 6;

   /**
    * The meta object id for the '{@link org.fujaba.commons.notation.impl.HierarchicalNodeImpl <em>Hierarchical Node</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.fujaba.commons.notation.impl.HierarchicalNodeImpl
    * @see org.fujaba.commons.notation.impl.NotationPackageImpl#getHierarchicalNode()
    * @generated
    */
   int HIERARCHICAL_NODE = 3;

   /**
    * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int HIERARCHICAL_NODE__EANNOTATIONS = NODE__EANNOTATIONS;

   /**
    * The feature id for the '<em><b>Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int HIERARCHICAL_NODE__ID = NODE__ID;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int HIERARCHICAL_NODE__NAME = NODE__NAME;

   /**
    * The feature id for the '<em><b>Model</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int HIERARCHICAL_NODE__MODEL = NODE__MODEL;

   /**
    * The feature id for the '<em><b>Visible</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int HIERARCHICAL_NODE__VISIBLE = NODE__VISIBLE;

   /**
    * The feature id for the '<em><b>Persistent</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int HIERARCHICAL_NODE__PERSISTENT = NODE__PERSISTENT;

   /**
    * The feature id for the '<em><b>Outgoing</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int HIERARCHICAL_NODE__OUTGOING = NODE__OUTGOING;

   /**
    * The feature id for the '<em><b>Incoming</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int HIERARCHICAL_NODE__INCOMING = NODE__INCOMING;

   /**
    * The feature id for the '<em><b>Parent</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int HIERARCHICAL_NODE__PARENT = NODE__PARENT;

   /**
    * The feature id for the '<em><b>X</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int HIERARCHICAL_NODE__X = NODE__X;

   /**
    * The feature id for the '<em><b>Y</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int HIERARCHICAL_NODE__Y = NODE__Y;

   /**
    * The feature id for the '<em><b>Width</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int HIERARCHICAL_NODE__WIDTH = NODE__WIDTH;

   /**
    * The feature id for the '<em><b>Height</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int HIERARCHICAL_NODE__HEIGHT = NODE__HEIGHT;

   /**
    * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int HIERARCHICAL_NODE__NODES = NODE_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Edges</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int HIERARCHICAL_NODE__EDGES = NODE_FEATURE_COUNT + 1;

   /**
    * The number of structural features of the '<em>Hierarchical Node</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int HIERARCHICAL_NODE_FEATURE_COUNT = NODE_FEATURE_COUNT + 2;

   /**
    * The meta object id for the '{@link org.fujaba.commons.notation.impl.AnchorImpl <em>Anchor</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.fujaba.commons.notation.impl.AnchorImpl
    * @see org.fujaba.commons.notation.impl.NotationPackageImpl#getAnchor()
    * @generated
    */
   int ANCHOR = 4;

   /**
    * The feature id for the '<em><b>X</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ANCHOR__X = 0;

   /**
    * The feature id for the '<em><b>Y</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ANCHOR__Y = 1;

   /**
    * The number of structural features of the '<em>Anchor</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ANCHOR_FEATURE_COUNT = 2;

   /**
    * The meta object id for the '{@link org.fujaba.commons.notation.BendPoint <em>Bend Point</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.fujaba.commons.notation.BendPoint
    * @see org.fujaba.commons.notation.impl.NotationPackageImpl#getBendPoint()
    * @generated
    */
   int BEND_POINT = 5;

   /**
    * The feature id for the '<em><b>Edge</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BEND_POINT__EDGE = 0;

   /**
    * The number of structural features of the '<em>Bend Point</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BEND_POINT_FEATURE_COUNT = 1;

   /**
    * The meta object id for the '{@link org.fujaba.commons.notation.impl.RelativeBendPointImpl <em>Relative Bend Point</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.fujaba.commons.notation.impl.RelativeBendPointImpl
    * @see org.fujaba.commons.notation.impl.NotationPackageImpl#getRelativeBendPoint()
    * @generated
    */
   int RELATIVE_BEND_POINT = 6;

   /**
    * The feature id for the '<em><b>Edge</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RELATIVE_BEND_POINT__EDGE = BEND_POINT__EDGE;

   /**
    * The feature id for the '<em><b>Source X</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RELATIVE_BEND_POINT__SOURCE_X = BEND_POINT_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Source Y</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RELATIVE_BEND_POINT__SOURCE_Y = BEND_POINT_FEATURE_COUNT + 1;

   /**
    * The feature id for the '<em><b>Target X</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RELATIVE_BEND_POINT__TARGET_X = BEND_POINT_FEATURE_COUNT + 2;

   /**
    * The feature id for the '<em><b>Target Y</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RELATIVE_BEND_POINT__TARGET_Y = BEND_POINT_FEATURE_COUNT + 3;

   /**
    * The number of structural features of the '<em>Relative Bend Point</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RELATIVE_BEND_POINT_FEATURE_COUNT = BEND_POINT_FEATURE_COUNT + 4;

   /**
    * The meta object id for the '{@link org.fujaba.commons.notation.impl.AbsoluteBendPointImpl <em>Absolute Bend Point</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.fujaba.commons.notation.impl.AbsoluteBendPointImpl
    * @see org.fujaba.commons.notation.impl.NotationPackageImpl#getAbsoluteBendPoint()
    * @generated
    */
   int ABSOLUTE_BEND_POINT = 7;

   /**
    * The feature id for the '<em><b>Edge</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ABSOLUTE_BEND_POINT__EDGE = BEND_POINT__EDGE;

   /**
    * The feature id for the '<em><b>X</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ABSOLUTE_BEND_POINT__X = BEND_POINT_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Y</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ABSOLUTE_BEND_POINT__Y = BEND_POINT_FEATURE_COUNT + 1;

   /**
    * The number of structural features of the '<em>Absolute Bend Point</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ABSOLUTE_BEND_POINT_FEATURE_COUNT = BEND_POINT_FEATURE_COUNT + 2;


   /**
    * Returns the meta object for class '{@link org.fujaba.commons.notation.DiagramElement <em>Diagram Element</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Diagram Element</em>'.
    * @see org.fujaba.commons.notation.DiagramElement
    * @generated
    */
   EClass getDiagramElement();

   /**
    * Returns the meta object for the reference '{@link org.fujaba.commons.notation.DiagramElement#getModel <em>Model</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Model</em>'.
    * @see org.fujaba.commons.notation.DiagramElement#getModel()
    * @see #getDiagramElement()
    * @generated
    */
   EReference getDiagramElement_Model();

   /**
    * Returns the meta object for the attribute '{@link org.fujaba.commons.notation.DiagramElement#isVisible <em>Visible</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Visible</em>'.
    * @see org.fujaba.commons.notation.DiagramElement#isVisible()
    * @see #getDiagramElement()
    * @generated
    */
   EAttribute getDiagramElement_Visible();

   /**
    * Returns the meta object for the attribute '{@link org.fujaba.commons.notation.DiagramElement#isPersistent <em>Persistent</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Persistent</em>'.
    * @see org.fujaba.commons.notation.DiagramElement#isPersistent()
    * @see #getDiagramElement()
    * @generated
    */
   EAttribute getDiagramElement_Persistent();

   /**
    * Returns the meta object for class '{@link org.fujaba.commons.notation.Node <em>Node</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Node</em>'.
    * @see org.fujaba.commons.notation.Node
    * @generated
    */
   EClass getNode();

   /**
    * Returns the meta object for the reference list '{@link org.fujaba.commons.notation.Node#getOutgoing <em>Outgoing</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference list '<em>Outgoing</em>'.
    * @see org.fujaba.commons.notation.Node#getOutgoing()
    * @see #getNode()
    * @generated
    */
   EReference getNode_Outgoing();

   /**
    * Returns the meta object for the reference list '{@link org.fujaba.commons.notation.Node#getIncoming <em>Incoming</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference list '<em>Incoming</em>'.
    * @see org.fujaba.commons.notation.Node#getIncoming()
    * @see #getNode()
    * @generated
    */
   EReference getNode_Incoming();

   /**
    * Returns the meta object for the container reference '{@link org.fujaba.commons.notation.Node#getParent <em>Parent</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the container reference '<em>Parent</em>'.
    * @see org.fujaba.commons.notation.Node#getParent()
    * @see #getNode()
    * @generated
    */
   EReference getNode_Parent();

   /**
    * Returns the meta object for the attribute '{@link org.fujaba.commons.notation.Node#getX <em>X</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>X</em>'.
    * @see org.fujaba.commons.notation.Node#getX()
    * @see #getNode()
    * @generated
    */
   EAttribute getNode_X();

   /**
    * Returns the meta object for the attribute '{@link org.fujaba.commons.notation.Node#getY <em>Y</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Y</em>'.
    * @see org.fujaba.commons.notation.Node#getY()
    * @see #getNode()
    * @generated
    */
   EAttribute getNode_Y();

   /**
    * Returns the meta object for the attribute '{@link org.fujaba.commons.notation.Node#getWidth <em>Width</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Width</em>'.
    * @see org.fujaba.commons.notation.Node#getWidth()
    * @see #getNode()
    * @generated
    */
   EAttribute getNode_Width();

   /**
    * Returns the meta object for the attribute '{@link org.fujaba.commons.notation.Node#getHeight <em>Height</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Height</em>'.
    * @see org.fujaba.commons.notation.Node#getHeight()
    * @see #getNode()
    * @generated
    */
   EAttribute getNode_Height();

   /**
    * Returns the meta object for class '{@link org.fujaba.commons.notation.Edge <em>Edge</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Edge</em>'.
    * @see org.fujaba.commons.notation.Edge
    * @generated
    */
   EClass getEdge();

   /**
    * Returns the meta object for the reference '{@link org.fujaba.commons.notation.Edge#getSource <em>Source</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Source</em>'.
    * @see org.fujaba.commons.notation.Edge#getSource()
    * @see #getEdge()
    * @generated
    */
   EReference getEdge_Source();

   /**
    * Returns the meta object for the reference '{@link org.fujaba.commons.notation.Edge#getTarget <em>Target</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Target</em>'.
    * @see org.fujaba.commons.notation.Edge#getTarget()
    * @see #getEdge()
    * @generated
    */
   EReference getEdge_Target();

   /**
    * Returns the meta object for the container reference '{@link org.fujaba.commons.notation.Edge#getParent <em>Parent</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the container reference '<em>Parent</em>'.
    * @see org.fujaba.commons.notation.Edge#getParent()
    * @see #getEdge()
    * @generated
    */
   EReference getEdge_Parent();

   /**
    * Returns the meta object for the containment reference '{@link org.fujaba.commons.notation.Edge#getSourceAnchor <em>Source Anchor</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference '<em>Source Anchor</em>'.
    * @see org.fujaba.commons.notation.Edge#getSourceAnchor()
    * @see #getEdge()
    * @generated
    */
   EReference getEdge_SourceAnchor();

   /**
    * Returns the meta object for the containment reference '{@link org.fujaba.commons.notation.Edge#getTargetAnchor <em>Target Anchor</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference '<em>Target Anchor</em>'.
    * @see org.fujaba.commons.notation.Edge#getTargetAnchor()
    * @see #getEdge()
    * @generated
    */
   EReference getEdge_TargetAnchor();

   /**
    * Returns the meta object for the containment reference list '{@link org.fujaba.commons.notation.Edge#getBendPoints <em>Bend Points</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Bend Points</em>'.
    * @see org.fujaba.commons.notation.Edge#getBendPoints()
    * @see #getEdge()
    * @generated
    */
   EReference getEdge_BendPoints();

   /**
    * Returns the meta object for class '{@link org.fujaba.commons.notation.HierarchicalNode <em>Hierarchical Node</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Hierarchical Node</em>'.
    * @see org.fujaba.commons.notation.HierarchicalNode
    * @generated
    */
   EClass getHierarchicalNode();

   /**
    * Returns the meta object for the containment reference list '{@link org.fujaba.commons.notation.HierarchicalNode#getNodes <em>Nodes</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Nodes</em>'.
    * @see org.fujaba.commons.notation.HierarchicalNode#getNodes()
    * @see #getHierarchicalNode()
    * @generated
    */
   EReference getHierarchicalNode_Nodes();

   /**
    * Returns the meta object for the containment reference list '{@link org.fujaba.commons.notation.HierarchicalNode#getEdges <em>Edges</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Edges</em>'.
    * @see org.fujaba.commons.notation.HierarchicalNode#getEdges()
    * @see #getHierarchicalNode()
    * @generated
    */
   EReference getHierarchicalNode_Edges();

   /**
    * Returns the meta object for class '{@link org.fujaba.commons.notation.Anchor <em>Anchor</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Anchor</em>'.
    * @see org.fujaba.commons.notation.Anchor
    * @generated
    */
   EClass getAnchor();

   /**
    * Returns the meta object for the attribute '{@link org.fujaba.commons.notation.Anchor#getX <em>X</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>X</em>'.
    * @see org.fujaba.commons.notation.Anchor#getX()
    * @see #getAnchor()
    * @generated
    */
   EAttribute getAnchor_X();

   /**
    * Returns the meta object for the attribute '{@link org.fujaba.commons.notation.Anchor#getY <em>Y</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Y</em>'.
    * @see org.fujaba.commons.notation.Anchor#getY()
    * @see #getAnchor()
    * @generated
    */
   EAttribute getAnchor_Y();

   /**
    * Returns the meta object for class '{@link org.fujaba.commons.notation.BendPoint <em>Bend Point</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Bend Point</em>'.
    * @see org.fujaba.commons.notation.BendPoint
    * @generated
    */
   EClass getBendPoint();

   /**
    * Returns the meta object for the container reference '{@link org.fujaba.commons.notation.BendPoint#getEdge <em>Edge</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the container reference '<em>Edge</em>'.
    * @see org.fujaba.commons.notation.BendPoint#getEdge()
    * @see #getBendPoint()
    * @generated
    */
   EReference getBendPoint_Edge();

   /**
    * Returns the meta object for class '{@link org.fujaba.commons.notation.RelativeBendPoint <em>Relative Bend Point</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Relative Bend Point</em>'.
    * @see org.fujaba.commons.notation.RelativeBendPoint
    * @generated
    */
   EClass getRelativeBendPoint();

   /**
    * Returns the meta object for the attribute '{@link org.fujaba.commons.notation.RelativeBendPoint#getSourceX <em>Source X</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Source X</em>'.
    * @see org.fujaba.commons.notation.RelativeBendPoint#getSourceX()
    * @see #getRelativeBendPoint()
    * @generated
    */
   EAttribute getRelativeBendPoint_SourceX();

   /**
    * Returns the meta object for the attribute '{@link org.fujaba.commons.notation.RelativeBendPoint#getSourceY <em>Source Y</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Source Y</em>'.
    * @see org.fujaba.commons.notation.RelativeBendPoint#getSourceY()
    * @see #getRelativeBendPoint()
    * @generated
    */
   EAttribute getRelativeBendPoint_SourceY();

   /**
    * Returns the meta object for the attribute '{@link org.fujaba.commons.notation.RelativeBendPoint#getTargetX <em>Target X</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Target X</em>'.
    * @see org.fujaba.commons.notation.RelativeBendPoint#getTargetX()
    * @see #getRelativeBendPoint()
    * @generated
    */
   EAttribute getRelativeBendPoint_TargetX();

   /**
    * Returns the meta object for the attribute '{@link org.fujaba.commons.notation.RelativeBendPoint#getTargetY <em>Target Y</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Target Y</em>'.
    * @see org.fujaba.commons.notation.RelativeBendPoint#getTargetY()
    * @see #getRelativeBendPoint()
    * @generated
    */
   EAttribute getRelativeBendPoint_TargetY();

   /**
    * Returns the meta object for class '{@link org.fujaba.commons.notation.AbsoluteBendPoint <em>Absolute Bend Point</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Absolute Bend Point</em>'.
    * @see org.fujaba.commons.notation.AbsoluteBendPoint
    * @generated
    */
   EClass getAbsoluteBendPoint();

   /**
    * Returns the meta object for the attribute '{@link org.fujaba.commons.notation.AbsoluteBendPoint#getX <em>X</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>X</em>'.
    * @see org.fujaba.commons.notation.AbsoluteBendPoint#getX()
    * @see #getAbsoluteBendPoint()
    * @generated
    */
   EAttribute getAbsoluteBendPoint_X();

   /**
    * Returns the meta object for the attribute '{@link org.fujaba.commons.notation.AbsoluteBendPoint#getY <em>Y</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Y</em>'.
    * @see org.fujaba.commons.notation.AbsoluteBendPoint#getY()
    * @see #getAbsoluteBendPoint()
    * @generated
    */
   EAttribute getAbsoluteBendPoint_Y();

   /**
    * Returns the factory that creates the instances of the model.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the factory that creates the instances of the model.
    * @generated
    */
   NotationFactory getNotationFactory();

   /**
    * <!-- begin-user-doc -->
    * Defines literals for the meta objects that represent
    * <ul>
    *   <li>each class,</li>
    *   <li>each feature of each class,</li>
    *   <li>each enum,</li>
    *   <li>and each data type</li>
    * </ul>
    * <!-- end-user-doc -->
    * @generated
    */
   interface Literals
   {
      /**
       * The meta object literal for the '{@link org.fujaba.commons.notation.DiagramElement <em>Diagram Element</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.fujaba.commons.notation.DiagramElement
       * @see org.fujaba.commons.notation.impl.NotationPackageImpl#getDiagramElement()
       * @generated
       */
      EClass DIAGRAM_ELEMENT = eINSTANCE.getDiagramElement();

      /**
       * The meta object literal for the '<em><b>Model</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference DIAGRAM_ELEMENT__MODEL = eINSTANCE.getDiagramElement_Model();

      /**
       * The meta object literal for the '<em><b>Visible</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute DIAGRAM_ELEMENT__VISIBLE = eINSTANCE.getDiagramElement_Visible();

      /**
       * The meta object literal for the '<em><b>Persistent</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute DIAGRAM_ELEMENT__PERSISTENT = eINSTANCE.getDiagramElement_Persistent();

      /**
       * The meta object literal for the '{@link org.fujaba.commons.notation.impl.NodeImpl <em>Node</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.fujaba.commons.notation.impl.NodeImpl
       * @see org.fujaba.commons.notation.impl.NotationPackageImpl#getNode()
       * @generated
       */
      EClass NODE = eINSTANCE.getNode();

      /**
       * The meta object literal for the '<em><b>Outgoing</b></em>' reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference NODE__OUTGOING = eINSTANCE.getNode_Outgoing();

      /**
       * The meta object literal for the '<em><b>Incoming</b></em>' reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference NODE__INCOMING = eINSTANCE.getNode_Incoming();

      /**
       * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference NODE__PARENT = eINSTANCE.getNode_Parent();

      /**
       * The meta object literal for the '<em><b>X</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute NODE__X = eINSTANCE.getNode_X();

      /**
       * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute NODE__Y = eINSTANCE.getNode_Y();

      /**
       * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute NODE__WIDTH = eINSTANCE.getNode_Width();

      /**
       * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute NODE__HEIGHT = eINSTANCE.getNode_Height();

      /**
       * The meta object literal for the '{@link org.fujaba.commons.notation.impl.EdgeImpl <em>Edge</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.fujaba.commons.notation.impl.EdgeImpl
       * @see org.fujaba.commons.notation.impl.NotationPackageImpl#getEdge()
       * @generated
       */
      EClass EDGE = eINSTANCE.getEdge();

      /**
       * The meta object literal for the '<em><b>Source</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference EDGE__SOURCE = eINSTANCE.getEdge_Source();

      /**
       * The meta object literal for the '<em><b>Target</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference EDGE__TARGET = eINSTANCE.getEdge_Target();

      /**
       * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference EDGE__PARENT = eINSTANCE.getEdge_Parent();

      /**
       * The meta object literal for the '<em><b>Source Anchor</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference EDGE__SOURCE_ANCHOR = eINSTANCE.getEdge_SourceAnchor();

      /**
       * The meta object literal for the '<em><b>Target Anchor</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference EDGE__TARGET_ANCHOR = eINSTANCE.getEdge_TargetAnchor();

      /**
       * The meta object literal for the '<em><b>Bend Points</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference EDGE__BEND_POINTS = eINSTANCE.getEdge_BendPoints();

      /**
       * The meta object literal for the '{@link org.fujaba.commons.notation.impl.HierarchicalNodeImpl <em>Hierarchical Node</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.fujaba.commons.notation.impl.HierarchicalNodeImpl
       * @see org.fujaba.commons.notation.impl.NotationPackageImpl#getHierarchicalNode()
       * @generated
       */
      EClass HIERARCHICAL_NODE = eINSTANCE.getHierarchicalNode();

      /**
       * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference HIERARCHICAL_NODE__NODES = eINSTANCE.getHierarchicalNode_Nodes();

      /**
       * The meta object literal for the '<em><b>Edges</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference HIERARCHICAL_NODE__EDGES = eINSTANCE.getHierarchicalNode_Edges();

      /**
       * The meta object literal for the '{@link org.fujaba.commons.notation.impl.AnchorImpl <em>Anchor</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.fujaba.commons.notation.impl.AnchorImpl
       * @see org.fujaba.commons.notation.impl.NotationPackageImpl#getAnchor()
       * @generated
       */
      EClass ANCHOR = eINSTANCE.getAnchor();

      /**
       * The meta object literal for the '<em><b>X</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute ANCHOR__X = eINSTANCE.getAnchor_X();

      /**
       * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute ANCHOR__Y = eINSTANCE.getAnchor_Y();

      /**
       * The meta object literal for the '{@link org.fujaba.commons.notation.BendPoint <em>Bend Point</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.fujaba.commons.notation.BendPoint
       * @see org.fujaba.commons.notation.impl.NotationPackageImpl#getBendPoint()
       * @generated
       */
      EClass BEND_POINT = eINSTANCE.getBendPoint();

      /**
       * The meta object literal for the '<em><b>Edge</b></em>' container reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference BEND_POINT__EDGE = eINSTANCE.getBendPoint_Edge();

      /**
       * The meta object literal for the '{@link org.fujaba.commons.notation.impl.RelativeBendPointImpl <em>Relative Bend Point</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.fujaba.commons.notation.impl.RelativeBendPointImpl
       * @see org.fujaba.commons.notation.impl.NotationPackageImpl#getRelativeBendPoint()
       * @generated
       */
      EClass RELATIVE_BEND_POINT = eINSTANCE.getRelativeBendPoint();

      /**
       * The meta object literal for the '<em><b>Source X</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute RELATIVE_BEND_POINT__SOURCE_X = eINSTANCE.getRelativeBendPoint_SourceX();

      /**
       * The meta object literal for the '<em><b>Source Y</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute RELATIVE_BEND_POINT__SOURCE_Y = eINSTANCE.getRelativeBendPoint_SourceY();

      /**
       * The meta object literal for the '<em><b>Target X</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute RELATIVE_BEND_POINT__TARGET_X = eINSTANCE.getRelativeBendPoint_TargetX();

      /**
       * The meta object literal for the '<em><b>Target Y</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute RELATIVE_BEND_POINT__TARGET_Y = eINSTANCE.getRelativeBendPoint_TargetY();

      /**
       * The meta object literal for the '{@link org.fujaba.commons.notation.impl.AbsoluteBendPointImpl <em>Absolute Bend Point</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.fujaba.commons.notation.impl.AbsoluteBendPointImpl
       * @see org.fujaba.commons.notation.impl.NotationPackageImpl#getAbsoluteBendPoint()
       * @generated
       */
      EClass ABSOLUTE_BEND_POINT = eINSTANCE.getAbsoluteBendPoint();

      /**
       * The meta object literal for the '<em><b>X</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute ABSOLUTE_BEND_POINT__X = eINSTANCE.getAbsoluteBendPoint_X();

      /**
       * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute ABSOLUTE_BEND_POINT__Y = eINSTANCE.getAbsoluteBendPoint_Y();

   }

} //NotationPackage
