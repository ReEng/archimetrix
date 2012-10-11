/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.fujaba.commons.notation.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.fujaba.commons.identifier.IdentifierPackage;
import org.fujaba.commons.notation.AbsoluteBendPoint;
import org.fujaba.commons.notation.Anchor;
import org.fujaba.commons.notation.BendPoint;
import org.fujaba.commons.notation.DiagramElement;
import org.fujaba.commons.notation.Edge;
import org.fujaba.commons.notation.HierarchicalNode;
import org.fujaba.commons.notation.Node;
import org.fujaba.commons.notation.NotationFactory;
import org.fujaba.commons.notation.NotationPackage;
import org.fujaba.commons.notation.RelativeBendPoint;



/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NotationPackageImpl extends EPackageImpl implements NotationPackage
{
   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass diagramElementEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass nodeEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass edgeEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass hierarchicalNodeEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass anchorEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass bendPointEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass relativeBendPointEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass absoluteBendPointEClass = null;

   /**
    * Creates an instance of the model <b>Package</b>, registered with
    * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
    * package URI value.
    * <p>Note: the correct way to create the package is via the static
    * factory method {@link #init init()}, which also performs
    * initialization of the package, or returns the registered package,
    * if one already exists.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.eclipse.emf.ecore.EPackage.Registry
    * @see org.fujaba.commons.notation.NotationPackage#eNS_URI
    * @see #init()
    * @generated
    */
   private NotationPackageImpl()
   {
      super(eNS_URI, NotationFactory.eINSTANCE);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private static boolean isInited = false;

   /**
    * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
    * 
    * <p>This method is used to initialize {@link NotationPackage#eINSTANCE} when that field is accessed.
    * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #eNS_URI
    * @see #createPackageContents()
    * @see #initializePackageContents()
    * @generated
    */
   public static NotationPackage init()
   {
      if (isInited) return (NotationPackage)EPackage.Registry.INSTANCE.getEPackage(NotationPackage.eNS_URI);

      // Obtain or create and register package
      NotationPackageImpl theNotationPackage = (NotationPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof NotationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new NotationPackageImpl());

      isInited = true;

      // Initialize simple dependencies
      IdentifierPackage.eINSTANCE.eClass();

      // Create package meta-data objects
      theNotationPackage.createPackageContents();

      // Initialize created meta-data
      theNotationPackage.initializePackageContents();

      // Mark meta-data to indicate it can't be changed
      theNotationPackage.freeze();

  
      // Update the registry and return the package
      EPackage.Registry.INSTANCE.put(NotationPackage.eNS_URI, theNotationPackage);
      return theNotationPackage;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getDiagramElement()
   {
      return diagramElementEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getDiagramElement_Model()
   {
      return (EReference)diagramElementEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getDiagramElement_Visible()
   {
      return (EAttribute)diagramElementEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getDiagramElement_Persistent()
   {
      return (EAttribute)diagramElementEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getNode()
   {
      return nodeEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getNode_Outgoing()
   {
      return (EReference)nodeEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getNode_Incoming()
   {
      return (EReference)nodeEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getNode_Parent()
   {
      return (EReference)nodeEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getNode_X()
   {
      return (EAttribute)nodeEClass.getEStructuralFeatures().get(3);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getNode_Y()
   {
      return (EAttribute)nodeEClass.getEStructuralFeatures().get(4);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getNode_Width()
   {
      return (EAttribute)nodeEClass.getEStructuralFeatures().get(5);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getNode_Height()
   {
      return (EAttribute)nodeEClass.getEStructuralFeatures().get(6);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getEdge()
   {
      return edgeEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getEdge_Source()
   {
      return (EReference)edgeEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getEdge_Target()
   {
      return (EReference)edgeEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getEdge_Parent()
   {
      return (EReference)edgeEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getEdge_SourceAnchor()
   {
      return (EReference)edgeEClass.getEStructuralFeatures().get(3);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getEdge_TargetAnchor()
   {
      return (EReference)edgeEClass.getEStructuralFeatures().get(4);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getEdge_BendPoints()
   {
      return (EReference)edgeEClass.getEStructuralFeatures().get(5);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getHierarchicalNode()
   {
      return hierarchicalNodeEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getHierarchicalNode_Nodes()
   {
      return (EReference)hierarchicalNodeEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getHierarchicalNode_Edges()
   {
      return (EReference)hierarchicalNodeEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getAnchor()
   {
      return anchorEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getAnchor_X()
   {
      return (EAttribute)anchorEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getAnchor_Y()
   {
      return (EAttribute)anchorEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getBendPoint()
   {
      return bendPointEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getBendPoint_Edge()
   {
      return (EReference)bendPointEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getRelativeBendPoint()
   {
      return relativeBendPointEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getRelativeBendPoint_SourceX()
   {
      return (EAttribute)relativeBendPointEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getRelativeBendPoint_SourceY()
   {
      return (EAttribute)relativeBendPointEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getRelativeBendPoint_TargetX()
   {
      return (EAttribute)relativeBendPointEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getRelativeBendPoint_TargetY()
   {
      return (EAttribute)relativeBendPointEClass.getEStructuralFeatures().get(3);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getAbsoluteBendPoint()
   {
      return absoluteBendPointEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getAbsoluteBendPoint_X()
   {
      return (EAttribute)absoluteBendPointEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getAbsoluteBendPoint_Y()
   {
      return (EAttribute)absoluteBendPointEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotationFactory getNotationFactory()
   {
      return (NotationFactory)getEFactoryInstance();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private boolean isCreated = false;

   /**
    * Creates the meta-model objects for the package.  This method is
    * guarded to have no affect on any invocation but its first.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void createPackageContents()
   {
      if (isCreated) return;
      isCreated = true;

      // Create classes and their features
      diagramElementEClass = createEClass(DIAGRAM_ELEMENT);
      createEReference(diagramElementEClass, DIAGRAM_ELEMENT__MODEL);
      createEAttribute(diagramElementEClass, DIAGRAM_ELEMENT__VISIBLE);
      createEAttribute(diagramElementEClass, DIAGRAM_ELEMENT__PERSISTENT);

      nodeEClass = createEClass(NODE);
      createEReference(nodeEClass, NODE__OUTGOING);
      createEReference(nodeEClass, NODE__INCOMING);
      createEReference(nodeEClass, NODE__PARENT);
      createEAttribute(nodeEClass, NODE__X);
      createEAttribute(nodeEClass, NODE__Y);
      createEAttribute(nodeEClass, NODE__WIDTH);
      createEAttribute(nodeEClass, NODE__HEIGHT);

      edgeEClass = createEClass(EDGE);
      createEReference(edgeEClass, EDGE__SOURCE);
      createEReference(edgeEClass, EDGE__TARGET);
      createEReference(edgeEClass, EDGE__PARENT);
      createEReference(edgeEClass, EDGE__SOURCE_ANCHOR);
      createEReference(edgeEClass, EDGE__TARGET_ANCHOR);
      createEReference(edgeEClass, EDGE__BEND_POINTS);

      hierarchicalNodeEClass = createEClass(HIERARCHICAL_NODE);
      createEReference(hierarchicalNodeEClass, HIERARCHICAL_NODE__NODES);
      createEReference(hierarchicalNodeEClass, HIERARCHICAL_NODE__EDGES);

      anchorEClass = createEClass(ANCHOR);
      createEAttribute(anchorEClass, ANCHOR__X);
      createEAttribute(anchorEClass, ANCHOR__Y);

      bendPointEClass = createEClass(BEND_POINT);
      createEReference(bendPointEClass, BEND_POINT__EDGE);

      relativeBendPointEClass = createEClass(RELATIVE_BEND_POINT);
      createEAttribute(relativeBendPointEClass, RELATIVE_BEND_POINT__SOURCE_X);
      createEAttribute(relativeBendPointEClass, RELATIVE_BEND_POINT__SOURCE_Y);
      createEAttribute(relativeBendPointEClass, RELATIVE_BEND_POINT__TARGET_X);
      createEAttribute(relativeBendPointEClass, RELATIVE_BEND_POINT__TARGET_Y);

      absoluteBendPointEClass = createEClass(ABSOLUTE_BEND_POINT);
      createEAttribute(absoluteBendPointEClass, ABSOLUTE_BEND_POINT__X);
      createEAttribute(absoluteBendPointEClass, ABSOLUTE_BEND_POINT__Y);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private boolean isInitialized = false;

   /**
    * Complete the initialization of the package and its meta-model.  This
    * method is guarded to have no affect on any invocation but its first.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void initializePackageContents()
   {
      if (isInitialized) return;
      isInitialized = true;

      // Initialize package
      setName(eNAME);
      setNsPrefix(eNS_PREFIX);
      setNsURI(eNS_URI);

      // Obtain other dependent packages
      IdentifierPackage theIdentifierPackage = (IdentifierPackage)EPackage.Registry.INSTANCE.getEPackage(IdentifierPackage.eNS_URI);

      // Create type parameters

      // Set bounds for type parameters

      // Add supertypes to classes
      diagramElementEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
      nodeEClass.getESuperTypes().add(this.getDiagramElement());
      edgeEClass.getESuperTypes().add(this.getDiagramElement());
      hierarchicalNodeEClass.getESuperTypes().add(this.getNode());
      relativeBendPointEClass.getESuperTypes().add(this.getBendPoint());
      absoluteBendPointEClass.getESuperTypes().add(this.getBendPoint());

      // Initialize classes and features; add operations and parameters
      initEClass(diagramElementEClass, DiagramElement.class, "DiagramElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getDiagramElement_Model(), ecorePackage.getEObject(), null, "model", null, 0, 1, DiagramElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEAttribute(getDiagramElement_Visible(), ecorePackage.getEBoolean(), "visible", "true", 1, 1, DiagramElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEAttribute(getDiagramElement_Persistent(), ecorePackage.getEBoolean(), "persistent", "true", 1, 1, DiagramElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getNode_Outgoing(), this.getEdge(), this.getEdge_Source(), "outgoing", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      getNode_Outgoing().getEKeys().add(theIdentifierPackage.getIdentifier_Id());
      initEReference(getNode_Incoming(), this.getEdge(), this.getEdge_Target(), "incoming", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      getNode_Incoming().getEKeys().add(theIdentifierPackage.getIdentifier_Id());
      initEReference(getNode_Parent(), this.getHierarchicalNode(), this.getHierarchicalNode_Nodes(), "parent", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      getNode_Parent().getEKeys().add(theIdentifierPackage.getIdentifier_Id());
      initEAttribute(getNode_X(), ecorePackage.getEInt(), "x", null, 1, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEAttribute(getNode_Y(), ecorePackage.getEInt(), "y", null, 1, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEAttribute(getNode_Width(), ecorePackage.getEInt(), "width", null, 1, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEAttribute(getNode_Height(), ecorePackage.getEInt(), "height", null, 1, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(edgeEClass, Edge.class, "Edge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getEdge_Source(), this.getNode(), this.getNode_Outgoing(), "source", null, 1, 1, Edge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      getEdge_Source().getEKeys().add(theIdentifierPackage.getIdentifier_Id());
      initEReference(getEdge_Target(), this.getNode(), this.getNode_Incoming(), "target", null, 1, 1, Edge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      getEdge_Target().getEKeys().add(theIdentifierPackage.getIdentifier_Id());
      initEReference(getEdge_Parent(), this.getHierarchicalNode(), this.getHierarchicalNode_Edges(), "parent", null, 0, 1, Edge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      getEdge_Parent().getEKeys().add(theIdentifierPackage.getIdentifier_Id());
      initEReference(getEdge_SourceAnchor(), this.getAnchor(), null, "sourceAnchor", null, 0, 1, Edge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getEdge_TargetAnchor(), this.getAnchor(), null, "targetAnchor", null, 0, 1, Edge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getEdge_BendPoints(), this.getBendPoint(), this.getBendPoint_Edge(), "bendPoints", null, 0, -1, Edge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(hierarchicalNodeEClass, HierarchicalNode.class, "HierarchicalNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getHierarchicalNode_Nodes(), this.getNode(), this.getNode_Parent(), "nodes", null, 0, -1, HierarchicalNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      getHierarchicalNode_Nodes().getEKeys().add(theIdentifierPackage.getIdentifier_Id());
      initEReference(getHierarchicalNode_Edges(), this.getEdge(), this.getEdge_Parent(), "edges", null, 0, -1, HierarchicalNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      getHierarchicalNode_Edges().getEKeys().add(theIdentifierPackage.getIdentifier_Id());

      initEClass(anchorEClass, Anchor.class, "Anchor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getAnchor_X(), ecorePackage.getEInt(), "x", null, 1, 1, Anchor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEAttribute(getAnchor_Y(), ecorePackage.getEInt(), "y", null, 1, 1, Anchor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(bendPointEClass, BendPoint.class, "BendPoint", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getBendPoint_Edge(), this.getEdge(), this.getEdge_BendPoints(), "edge", null, 1, 1, BendPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      getBendPoint_Edge().getEKeys().add(theIdentifierPackage.getIdentifier_Id());

      initEClass(relativeBendPointEClass, RelativeBendPoint.class, "RelativeBendPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getRelativeBendPoint_SourceX(), ecorePackage.getEInt(), "sourceX", null, 1, 1, RelativeBendPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEAttribute(getRelativeBendPoint_SourceY(), ecorePackage.getEInt(), "sourceY", null, 1, 1, RelativeBendPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEAttribute(getRelativeBendPoint_TargetX(), ecorePackage.getEInt(), "targetX", null, 1, 1, RelativeBendPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEAttribute(getRelativeBendPoint_TargetY(), ecorePackage.getEInt(), "targetY", null, 1, 1, RelativeBendPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(absoluteBendPointEClass, AbsoluteBendPoint.class, "AbsoluteBendPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getAbsoluteBendPoint_X(), ecorePackage.getEInt(), "x", null, 1, 1, AbsoluteBendPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEAttribute(getAbsoluteBendPoint_Y(), ecorePackage.getEInt(), "y", null, 1, 1, AbsoluteBendPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      // Create resource
      createResource(eNS_URI);
   }

} //NotationPackageImpl
