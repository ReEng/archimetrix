<?xml version="1.0" encoding="UTF-8"?>
<org.reclipse.structure:PSCatalog xmi:version="2.0"
    xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xmlns:org.reclipse.structure="org.reclipse.structure" name="Component based catalog">
  <eAnnotations source="org.reclipse.structure.specification.ui">
    <details key="org.reclipse.structure.specification.metamodel" value="eu.qimpress.sourcecodedecorator"/>
  </eAnnotations>
  <patternSpecifications name="DirectComponentClasses" superPattern="#//Component">
    <connections xsi:type="org.reclipse.structure:PSLink" name="link1" weight="1.0"
        source="#//DirectComponentClasses/cLink" target="#//DirectComponentClasses/comp"
        instanceOf="http://qimpress.eu/sourcecodedecorator/1.0#//ComponentImplementingClassesLink/component"/>
    <connections xsi:type="org.reclipse.structure:PSLink" name="link2" weight="1.0"
        source="#//DirectComponentClasses/cLink" target="#//DirectComponentClasses/cl"
        instanceOf="http://qimpress.eu/sourcecodedecorator/1.0#//ComponentImplementingClassesLink/implementingClasses"/>
    <connections xsi:type="org.reclipse.structure:PSLink" name="annotatedElement"
        weight="1.0" source="#//DirectComponentClasses/@nodes.0" target="#//DirectComponentClasses/comp"
        qualifier="component" instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="org.reclipse.structure:PSLink" name="annotatedElement"
        weight="1.0" source="#//DirectComponentClasses/@nodes.0" target="#//DirectComponentClasses/cLink"
        qualifier="link" instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="org.reclipse.structure:PSLink" name="annotatedElement"
        weight="1.0" source="#//DirectComponentClasses/@nodes.0" target="#//DirectComponentClasses/cl"
        qualifier="classes" instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <nodes xsi:type="org.reclipse.structure:PSAnnotation" weight="1.0" outgoing="#//DirectComponentClasses/annotatedElement #//DirectComponentClasses/annotatedElement.1 #//DirectComponentClasses/annotatedElement.2"
        type="#//DirectComponentClasses"/>
    <nodes xsi:type="org.reclipse.structure:PSObject" name="cLink" weight="1.0" outgoing="#//DirectComponentClasses/link1 #//DirectComponentClasses/link2"
        incoming="#//DirectComponentClasses/annotatedElement.1" instanceOf="http://qimpress.eu/sourcecodedecorator/1.0#//ComponentImplementingClassesLink"/>
    <nodes xsi:type="org.reclipse.structure:PSObject" name="comp" weight="1.0" incoming="#//DirectComponentClasses/link1 #//DirectComponentClasses/annotatedElement"
        instanceOf="http://q-impress.eu/samm/staticstructure#//ComponentType"/>
    <nodes xsi:type="org.reclipse.structure:PSObject" name="cl" weight="1.0" modifier="SET"
        incoming="#//DirectComponentClasses/link2 #//DirectComponentClasses/annotatedElement.2"
        instanceOf="http://www.fzi.de/gast/types#//GASTClass"/>
  </patternSpecifications>
  <patternSpecifications name="Component" subPatterns="#//DirectComponentClasses #//IndirectComponentClasses"
      abstract="true">
    <connections xsi:type="org.reclipse.structure:PSLink" name="annotatedElement"
        weight="1.0" source="#//Component/@nodes.0" target="#//Component/comp" qualifier="component"
        instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="org.reclipse.structure:PSLink" name="annotatedElement"
        weight="1.0" source="#//Component/@nodes.0" target="#//Component/cl" qualifier="classes"
        instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="org.reclipse.structure:PSLink" name="annotatedElement"
        weight="1.0" source="#//Component/@nodes.0" target="#//Component/obj3" qualifier="link"
        instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <nodes xsi:type="org.reclipse.structure:PSAnnotation" weight="1.0" outgoing="#//Component/annotatedElement #//Component/annotatedElement.1 #//Component/annotatedElement.2"
        type="#//Component"/>
    <nodes xsi:type="org.reclipse.structure:PSObject" name="comp" weight="1.0" incoming="#//Component/annotatedElement"
        instanceOf="http://q-impress.eu/samm/staticstructure#//ComponentType"/>
    <nodes xsi:type="org.reclipse.structure:PSObject" name="cl" weight="1.0" modifier="SET"
        incoming="#//Component/annotatedElement.1" instanceOf="http://www.fzi.de/gast/types#//GASTClass"/>
    <nodes xsi:type="org.reclipse.structure:PSObject" name="obj3" weight="1.0" incoming="#//Component/annotatedElement.2"
        instanceOf="http://q-impress.eu/sourcecodedecorator#//ComponentImplementingClassesLink"/>
  </patternSpecifications>
  <patternSpecifications name="DirectComposition" superPattern="#//Composition">
    <connections xsi:type="org.reclipse.structure:PSLink" name="link3" weight="1.0"
        source="#//DirectComposition/parent" target="#//DirectComposition/subComps"
        instanceOf="http://q-impress.eu/sourcecodedecorator#//ComponentImplementingClassesLink/subComponents"/>
    <connections xsi:type="org.reclipse.structure:PSLink" name="annotatedElement"
        weight="1.0" source="#//DirectComposition/@nodes.0" target="#//DirectComposition/parent"
        qualifier="parentComponent" instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="org.reclipse.structure:PSLink" name="annotatedElement"
        weight="1.0" source="#//DirectComposition/@nodes.0" target="#//DirectComposition/subComps"
        qualifier="subComponents" instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <nodes xsi:type="org.reclipse.structure:PSAnnotation" weight="1.0" outgoing="#//DirectComposition/annotatedElement #//DirectComposition/annotatedElement.1"
        type="#//DirectComposition"/>
    <nodes xsi:type="org.reclipse.structure:PSObject" name="parent" weight="1.0" outgoing="#//DirectComposition/link3"
        incoming="#//DirectComposition/annotatedElement" instanceOf="http://q-impress.eu/sourcecodedecorator#//ComponentImplementingClassesLink"/>
    <nodes xsi:type="org.reclipse.structure:PSObject" name="subComps" weight="1.0"
        modifier="SET" incoming="#//DirectComposition/link3 #//DirectComposition/annotatedElement.1"
        instanceOf="http://q-impress.eu/sourcecodedecorator#//ComponentImplementingClassesLink"/>
  </patternSpecifications>
  <patternSpecifications name="Composition" subPatterns="#//DirectComposition #//IndirectComposition"
      abstract="true">
    <connections xsi:type="org.reclipse.structure:PSLink" name="annotatedElement"
        weight="1.0" source="#//Composition/@nodes.0" target="#//Composition/parent"
        qualifier="parentComponent" instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="org.reclipse.structure:PSLink" name="annotatedElement"
        weight="1.0" source="#//Composition/@nodes.0" target="#//Composition/subComps"
        qualifier="subComponents" instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <nodes xsi:type="org.reclipse.structure:PSAnnotation" weight="1.0" outgoing="#//Composition/annotatedElement #//Composition/annotatedElement.1"
        type="#//Composition"/>
    <nodes xsi:type="org.reclipse.structure:PSObject" name="parent" weight="1.0" incoming="#//Composition/annotatedElement"
        instanceOf="http://q-impress.eu/sourcecodedecorator#//ComponentImplementingClassesLink"/>
    <nodes xsi:type="org.reclipse.structure:PSObject" name="subComps" weight="1.0"
        modifier="SET" incoming="#//Composition/annotatedElement.1" instanceOf="http://q-impress.eu/sourcecodedecorator#//ComponentImplementingClassesLink"/>
  </patternSpecifications>
  <patternSpecifications name="IndirectComposition" superPattern="#//Composition">
    <connections xsi:type="org.reclipse.structure:PSLink" name="annotatedElement"
        weight="1.0" source="#//IndirectComposition/@nodes.0" target="#//IndirectComposition/parent"
        qualifier="parentComponent" instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="org.reclipse.structure:PSLink" name="annotatedElement"
        weight="1.0" source="#//IndirectComposition/@nodes.0" target="#//IndirectComposition/subComps"
        qualifier="subComponents" instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="org.reclipse.structure:PSLink" name="link5" weight="1.0"
        source="#//IndirectComposition/cc" target="#//IndirectComposition/parent"
        qualifier="parentComponent" instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="org.reclipse.structure:PSLink" name="link6" weight="1.0"
        source="#//IndirectComposition/cc" target="#//IndirectComposition/intermediateLink"
        qualifier="subComponents" instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="org.reclipse.structure:PSLink" name="link6" weight="1.0"
        source="#//IndirectComposition/dc" target="#//IndirectComposition/intermediateLink"
        qualifier="parentComponent" instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="org.reclipse.structure:PSLink" name="link6" weight="1.0"
        source="#//IndirectComposition/dc" target="#//IndirectComposition/subComps"
        qualifier="subComponents" instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <nodes xsi:type="org.reclipse.structure:PSAnnotation" weight="1.0" outgoing="#//IndirectComposition/annotatedElement #//IndirectComposition/annotatedElement.1"
        type="#//IndirectComposition"/>
    <nodes xsi:type="org.reclipse.structure:PSObject" name="parent" weight="1.0" incoming="#//IndirectComposition/annotatedElement #//IndirectComposition/link5"
        instanceOf="http://q-impress.eu/sourcecodedecorator#//ComponentImplementingClassesLink"/>
    <nodes xsi:type="org.reclipse.structure:PSObject" name="subComps" weight="1.0"
        modifier="SET" incoming="#//IndirectComposition/annotatedElement.1 #//IndirectComposition/link6.2"
        instanceOf="http://q-impress.eu/sourcecodedecorator#//ComponentImplementingClassesLink"/>
    <nodes xsi:type="org.reclipse.structure:PSAnnotation" name="cc" weight="1.0" outgoing="#//IndirectComposition/link5 #//IndirectComposition/link6"
        type="#//Composition"/>
    <nodes xsi:type="org.reclipse.structure:PSObject" name="intermediateLink" weight="1.0"
        incoming="#//IndirectComposition/link6 #//IndirectComposition/link6.1" instanceOf="http://q-impress.eu/sourcecodedecorator#//ComponentImplementingClassesLink"/>
    <nodes xsi:type="org.reclipse.structure:PSAnnotation" name="dc" weight="1.0" outgoing="#//IndirectComposition/link6.1 #//IndirectComposition/link6.2"
        type="#//DirectComposition"/>
  </patternSpecifications>
  <patternSpecifications name="IndirectComponentClasses" superPattern="#//Component">
    <connections xsi:type="org.reclipse.structure:PSLink" name="link3" weight="1.0"
        source="#//IndirectComponentClasses/someSubComp" target="#//IndirectComponentClasses/cl"
        instanceOf="http://q-impress.eu/sourcecodedecorator#//ComponentImplementingClassesLink/implementingClasses"/>
    <connections xsi:type="org.reclipse.structure:PSLink" name="link6" weight="1.0"
        source="#//IndirectComponentClasses/cLink" target="#//IndirectComponentClasses/comp"
        instanceOf="http://q-impress.eu/sourcecodedecorator#//ComponentImplementingClassesLink/component"/>
    <connections xsi:type="org.reclipse.structure:PSLink" name="annotatedElement"
        weight="1.0" source="#//IndirectComponentClasses/@nodes.0" target="#//IndirectComponentClasses/comp"
        qualifier="component" instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="org.reclipse.structure:PSLink" name="annotatedElement"
        weight="1.0" source="#//IndirectComponentClasses/@nodes.0" target="#//IndirectComponentClasses/cLink"
        qualifier="link" instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="org.reclipse.structure:PSLink" name="annotatedElement"
        weight="1.0" source="#//IndirectComponentClasses/@nodes.0" target="#//IndirectComponentClasses/cl"
        qualifier="classes" instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="org.reclipse.structure:PSLink" name="link7" weight="1.0"
        source="#//IndirectComponentClasses/cc" target="#//IndirectComponentClasses/cLink"
        qualifier="parentComponent" instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="org.reclipse.structure:PSLink" name="link7" weight="1.0"
        source="#//IndirectComponentClasses/cc" target="#//IndirectComponentClasses/someSubComp"
        qualifier="subComponents" instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <nodes xsi:type="org.reclipse.structure:PSAnnotation" weight="1.0" outgoing="#//IndirectComponentClasses/annotatedElement #//IndirectComponentClasses/annotatedElement.1 #//IndirectComponentClasses/annotatedElement.2"
        type="#//IndirectComponentClasses"/>
    <nodes xsi:type="org.reclipse.structure:PSObject" name="cLink" weight="1.0" outgoing="#//IndirectComponentClasses/link6"
        incoming="#//IndirectComponentClasses/annotatedElement.1 #//IndirectComponentClasses/link7"
        instanceOf="http://q-impress.eu/sourcecodedecorator#//ComponentImplementingClassesLink"/>
    <nodes xsi:type="org.reclipse.structure:PSAnnotation" name="cc" weight="1.0" parents="#//IndirectComponentClasses/frag2"
        outgoing="#//IndirectComponentClasses/link7 #//IndirectComponentClasses/link7.1"
        type="#//Composition"/>
    <nodes xsi:type="org.reclipse.structure:PSObject" name="someSubComp" weight="1.0"
        parents="#//IndirectComponentClasses/frag1" outgoing="#//IndirectComponentClasses/link3"
        incoming="#//IndirectComponentClasses/link7.1" instanceOf="http://q-impress.eu/sourcecodedecorator#//ComponentImplementingClassesLink"/>
    <nodes xsi:type="org.reclipse.structure:PSObject" name="cl" weight="1.0" parents="#//IndirectComponentClasses/frag1"
        modifier="SET" incoming="#//IndirectComponentClasses/link3 #//IndirectComponentClasses/annotatedElement.2"
        instanceOf="http://www.fzi.de/gast/types#//GASTClass"/>
    <nodes xsi:type="org.reclipse.structure:PSObject" name="comp" weight="1.0" incoming="#//IndirectComponentClasses/link6 #//IndirectComponentClasses/annotatedElement"
        instanceOf="http://q-impress.eu/samm/staticstructure#//ComponentType"/>
    <combinedFragments name="frag1" weight="1.0" children="#//IndirectComponentClasses/someSubComp #//IndirectComponentClasses/cl"
        kind="SET"/>
    <combinedFragments name="frag2" weight="1.0" children="#//IndirectComponentClasses/cc"
        kind="SET"/>
  </patternSpecifications>
  <patternSpecifications name="IllegalMethodAccess">
    <connections xsi:type="org.reclipse.structure:PSLink" name="link1" weight="1.0"
        source="#//IllegalMethodAccess/class1" target="#//IllegalMethodAccess/method1"
        instanceOf="http://www.fzi.de/gast/types#//GASTClass/methods"/>
    <connections xsi:type="org.reclipse.structure:PSLink" name="link2" weight="1.0"
        source="#//IllegalMethodAccess/class2" target="#//IllegalMethodAccess/method2"
        instanceOf="http://www.fzi.de/gast/types#//GASTClass/methods"/>
    <connections xsi:type="org.reclipse.structure:PSLink" name="link3" weight="1.0"
        source="#//IllegalMethodAccess/call" target="#//IllegalMethodAccess/method2"
        instanceOf="http://www.fzi.de/gast/accesses#//Access/accessedTarget"/>
    <connections xsi:type="org.reclipse.structure:PSLink" name="link4" weight="1.0"
        source="#//IllegalMethodAccess/method1" target="#//IllegalMethodAccess/call"
        instanceOf="http://www.fzi.de/gast/functions#//Function/accesses"/>
    <connections xsi:type="org.reclipse.structure:PSLink" name="link5" weight="1.0"
        source="#//IllegalMethodAccess/compAnno" target="#//IllegalMethodAccess/class1"
        qualifier="classes" instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="org.reclipse.structure:PSLink" name="annotatedElement"
        weight="1.0" source="#//IllegalMethodAccess/@nodes.0" target="#//IllegalMethodAccess/class1"
        qualifier="accessingClass" instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="org.reclipse.structure:PSLink" name="annotatedElement"
        weight="1.0" source="#//IllegalMethodAccess/@nodes.0" target="#//IllegalMethodAccess/class2"
        qualifier="accessedMethodOwner" instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="org.reclipse.structure:PSLink" name="annotatedElement"
        weight="1.0" source="#//IllegalMethodAccess/@nodes.0" target="#//IllegalMethodAccess/method2"
        qualifier="accessedMethod" instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="org.reclipse.structure:PSLink" name="link13" weight="1.0"
        source="#//IllegalMethodAccess/method2" target="#//IllegalMethodAccess/decl"
        instanceOf="http://www.fzi.de/gast/types#//Member/overriddenMember"/>
    <connections xsi:type="org.reclipse.structure:PSLink" name="link10" weight="1.0"
        source="#//IllegalMethodAccess/class2" target="#//IllegalMethodAccess/implements"
        instanceOf="http://www.fzi.de/gast/types#//GASTClass/inheritanceTypeAccesses"/>
    <connections xsi:type="org.reclipse.structure:PSLink" name="link11" weight="1.0"
        source="#//IllegalMethodAccess/implements" target="#//IllegalMethodAccess/interface"
        instanceOf="http://www.fzi.de/gast/accesses#//Access/accessedClass"/>
    <connections xsi:type="org.reclipse.structure:PSLink" name="annotatedElement"
        weight="1.0" source="#//IllegalMethodAccess/@nodes.0" target="#//IllegalMethodAccess/interface"
        qualifier="implementedInterface" instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="org.reclipse.structure:PSLink" name="link14" weight="1.0"
        source="#//IllegalMethodAccess/var1" target="#//IllegalMethodAccess/interface"
        instanceOf="http://www.fzi.de/gast/variables#//Variable/type"/>
    <connections xsi:type="org.reclipse.structure:PSLink" name="link15" weight="1.0"
        source="#//IllegalMethodAccess/castStmt" target="#//IllegalMethodAccess/varAccess2"
        instanceOf="http://www.fzi.de/gast/statements#//Statement/accesses"/>
    <connections xsi:type="org.reclipse.structure:PSLink" name="link16" weight="1.0"
        source="#//IllegalMethodAccess/castStmt" target="#//IllegalMethodAccess/cast"
        instanceOf="http://www.fzi.de/gast/statements#//Statement/accesses"/>
    <connections xsi:type="org.reclipse.structure:PSLink" name="link17" weight="1.0"
        source="#//IllegalMethodAccess/cast" target="#//IllegalMethodAccess/class2"
        instanceOf="http://www.fzi.de/gast/accesses#//Access/accessedClass"/>
    <connections xsi:type="org.reclipse.structure:PSLink" name="link18" weight="1.0"
        source="#//IllegalMethodAccess/castStmt" target="#//IllegalMethodAccess/varAccess1"
        instanceOf="http://www.fzi.de/gast/statements#//Statement/accesses"/>
    <connections xsi:type="org.reclipse.structure:PSLink" name="link18" weight="1.0"
        source="#//IllegalMethodAccess/varAccess1" target="#//IllegalMethodAccess/var1"
        instanceOf="http://www.fzi.de/gast/accesses#//Access/accessedTarget"/>
    <connections xsi:type="org.reclipse.structure:PSLink" name="link19" weight="1.0"
        source="#//IllegalMethodAccess/varAccess2" target="#//IllegalMethodAccess/var2"
        instanceOf="http://www.fzi.de/gast/accesses#//Access/accessedTarget"/>
    <connections xsi:type="org.reclipse.structure:PSLink" name="link20" weight="1.0"
        source="#//IllegalMethodAccess/var2" target="#//IllegalMethodAccess/class2"
        instanceOf="http://www.fzi.de/gast/variables#//Variable/type"/>
    <connections xsi:type="org.reclipse.structure:PSLink" name="link23" weight="1.0"
        source="#//IllegalMethodAccess/method1" target="#//IllegalMethodAccess/castStmt"
        instanceOf="http://www.fzi.de/gast/functions#//Function/allStatements"/>
    <connections xsi:type="org.reclipse.structure:PSLink" name="annotatedElement"
        weight="1.0" source="#//IllegalMethodAccess/@nodes.0" target="#//IllegalMethodAccess/call"
        qualifier="functionAccess" instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="org.reclipse.structure:PSLink" name="annotatedElement"
        weight="1.0" source="#//IllegalMethodAccess/@nodes.0" target="#//IllegalMethodAccess/castStmt"
        qualifier="castStmt" instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <nodes xsi:type="org.reclipse.structure:PSAnnotation" weight="1.0" outgoing="#//IllegalMethodAccess/annotatedElement #//IllegalMethodAccess/annotatedElement.1 #//IllegalMethodAccess/annotatedElement.2 #//IllegalMethodAccess/annotatedElement.3 #//IllegalMethodAccess/annotatedElement.4 #//IllegalMethodAccess/annotatedElement.5"
        type="#//IllegalMethodAccess"/>
    <nodes xsi:type="org.reclipse.structure:PSObject" name="class1" weight="1.0" outgoing="#//IllegalMethodAccess/link1"
        incoming="#//IllegalMethodAccess/link5 #//IllegalMethodAccess/annotatedElement"
        instanceOf="http://www.fzi.de/gast/types#//GASTClass"/>
    <nodes xsi:type="org.reclipse.structure:PSObject" name="class2" weight="1.0" outgoing="#//IllegalMethodAccess/link2 #//IllegalMethodAccess/link10"
        incoming="#//IllegalMethodAccess/annotatedElement.1 #//IllegalMethodAccess/link17 #//IllegalMethodAccess/link20"
        instanceOf="http://www.fzi.de/gast/types#//GASTClass">
      <nodeConstraints xsi:type="org.reclipse.structure:PSAttributeConstraint" weight="1.0"
          valueExpression="[^(java)].*" operator="REGULAR_EXPRESSION" attribute="http://www.fzi.de/gast/types#//GASTType/qualifiedName"/>
      <nodeConstraints xsi:type="org.reclipse.structure:PSAttributeConstraint" weight="1.0"
          valueExpression="NORMAL" operator="EQUAL" attribute="http://www.fzi.de/gast/core#//ModelElement/status"/>
      <nodeConstraints xsi:type="org.reclipse.structure:PSAttributeConstraint" weight="1.0"
          valueExpression="false" operator="EQUAL" attribute="http://www.fzi.de/gast/types#//GASTClass/interface"/>
    </nodes>
    <nodes xsi:type="org.reclipse.structure:PSObject" name="method1" weight="1.0"
        outgoing="#//IllegalMethodAccess/link4 #//IllegalMethodAccess/link23" incoming="#//IllegalMethodAccess/link1"
        instanceOf="http://www.fzi.de/gast/functions#//Method"/>
    <nodes xsi:type="org.reclipse.structure:PSObject" name="method2" weight="1.0"
        outgoing="#//IllegalMethodAccess/link13" incoming="#//IllegalMethodAccess/link2 #//IllegalMethodAccess/link3 #//IllegalMethodAccess/annotatedElement.2"
        instanceOf="http://www.fzi.de/gast/functions#//Method"/>
    <nodes xsi:type="org.reclipse.structure:PSObject" name="call" weight="1.0" outgoing="#//IllegalMethodAccess/link3"
        incoming="#//IllegalMethodAccess/link4 #//IllegalMethodAccess/annotatedElement.4"
        instanceOf="http://www.fzi.de/gast/accesses#//FunctionAccess"/>
    <nodes xsi:type="org.reclipse.structure:PSAnnotation" name="compAnno" weight="1.0"
        outgoing="#//IllegalMethodAccess/link5" type="#//Component"/>
    <nodes xsi:type="org.reclipse.structure:PSObject" name="decl" weight="1.0" modifier="NEGATIVE"
        incoming="#//IllegalMethodAccess/link13" instanceOf="http://www.fzi.de/gast/functions#//Method"/>
    <nodes xsi:type="org.reclipse.structure:PSObject" name="interface" weight="1.0"
        incoming="#//IllegalMethodAccess/link11 #//IllegalMethodAccess/annotatedElement.3 #//IllegalMethodAccess/link14"
        instanceOf="http://www.fzi.de/gast/types#//GASTClass">
      <nodeConstraints xsi:type="org.reclipse.structure:PSAttributeConstraint" weight="1.0"
          valueExpression="true" operator="EQUAL" attribute="http://www.fzi.de/gast/types#//GASTClass/interface"/>
    </nodes>
    <nodes xsi:type="org.reclipse.structure:PSObject" name="implements" weight="1.0"
        outgoing="#//IllegalMethodAccess/link11" incoming="#//IllegalMethodAccess/link10"
        instanceOf="http://www.fzi.de/gast/accesses#//InheritanceTypeAccess"/>
    <nodes xsi:type="org.reclipse.structure:PSObject" name="var1" weight="1.0" outgoing="#//IllegalMethodAccess/link14"
        incoming="#//IllegalMethodAccess/link18.1" instanceOf="http://www.fzi.de/gast/variables#//LocalVariable"/>
    <nodes xsi:type="org.reclipse.structure:PSObject" name="castStmt" weight="1.0"
        outgoing="#//IllegalMethodAccess/link15 #//IllegalMethodAccess/link16 #//IllegalMethodAccess/link18"
        incoming="#//IllegalMethodAccess/link23 #//IllegalMethodAccess/annotatedElement.5"
        instanceOf="http://www.fzi.de/gast/statements#//SimpleStatement"/>
    <nodes xsi:type="org.reclipse.structure:PSObject" name="varAccess2" weight="1.0"
        outgoing="#//IllegalMethodAccess/link19" incoming="#//IllegalMethodAccess/link15"
        instanceOf="http://www.fzi.de/gast/accesses#//VariableAccess"/>
    <nodes xsi:type="org.reclipse.structure:PSObject" name="cast" weight="1.0" outgoing="#//IllegalMethodAccess/link17"
        incoming="#//IllegalMethodAccess/link16" instanceOf="http://www.fzi.de/gast/accesses#//CastTypeAccess"/>
    <nodes xsi:type="org.reclipse.structure:PSObject" name="varAccess1" weight="1.0"
        outgoing="#//IllegalMethodAccess/link18.1" incoming="#//IllegalMethodAccess/link18"
        instanceOf="http://www.fzi.de/gast/accesses#//VariableAccess"/>
    <nodes xsi:type="org.reclipse.structure:PSObject" name="var2" weight="1.0" outgoing="#//IllegalMethodAccess/link20"
        incoming="#//IllegalMethodAccess/link19" instanceOf="http://www.fzi.de/gast/variables#//LocalVariable"/>
  </patternSpecifications>
  <patternSpecifications name="IllegalVariableAccess">
    <connections xsi:type="org.reclipse.structure:PSLink" name="link1" weight="1.0"
        source="#//IllegalVariableAccess/fOwner" target="#//IllegalVariableAccess/aField"
        instanceOf="http://www.fzi.de/gast/types#//GASTClass/fields"/>
    <connections xsi:type="org.reclipse.structure:PSLink" name="link2" weight="1.0"
        source="#//IllegalVariableAccess/fAccess" target="#//IllegalVariableAccess/aField"
        instanceOf="http://www.fzi.de/gast/accesses#//Access/accessedTarget"/>
    <connections xsi:type="org.reclipse.structure:PSLink" name="link3" weight="1.0"
        source="#//IllegalVariableAccess/method1" target="#//IllegalVariableAccess/fAccess"
        instanceOf="http://www.fzi.de/gast/functions#//Function/accesses"/>
    <connections xsi:type="org.reclipse.structure:PSLink" name="link4" weight="1.0"
        source="#//IllegalVariableAccess/class1" target="#//IllegalVariableAccess/method1"
        instanceOf="http://www.fzi.de/gast/types#//GASTClass/methods"/>
    <connections xsi:type="org.reclipse.structure:PSLink" name="link6" weight="1.0"
        source="#//IllegalVariableAccess/compAnno" target="#//IllegalVariableAccess/class1"
        qualifier="classes" instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="org.reclipse.structure:PSLink" name="annotatedElement"
        weight="1.0" source="#//IllegalVariableAccess/@nodes.0" target="#//IllegalVariableAccess/class1"
        qualifier="accessingClass" instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="org.reclipse.structure:PSLink" name="annotatedElement"
        weight="1.0" source="#//IllegalVariableAccess/@nodes.0" target="#//IllegalVariableAccess/aField"
        qualifier="accessedField" instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="org.reclipse.structure:PSLink" name="annotatedElement"
        weight="1.0" source="#//IllegalVariableAccess/@nodes.0" target="#//IllegalVariableAccess/fOwner"
        qualifier="fieldOwner" instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="org.reclipse.structure:PSLink" name="link11" weight="1.0"
        source="#//IllegalVariableAccess/class1" target="#//IllegalVariableAccess/fOwner"
        negative="true" instanceOf="http://www.fzi.de/gast/types#//GASTClass/superTypes"/>
    <nodes xsi:type="org.reclipse.structure:PSAnnotation" weight="1.0" outgoing="#//IllegalVariableAccess/annotatedElement #//IllegalVariableAccess/annotatedElement.1 #//IllegalVariableAccess/annotatedElement.2"
        type="#//IllegalVariableAccess"/>
    <nodes xsi:type="org.reclipse.structure:PSObject" name="class1" weight="1.0" outgoing="#//IllegalVariableAccess/link4 #//IllegalVariableAccess/link11"
        incoming="#//IllegalVariableAccess/link6 #//IllegalVariableAccess/annotatedElement"
        instanceOf="http://www.fzi.de/gast/types#//GASTClass"/>
    <nodes xsi:type="org.reclipse.structure:PSObject" name="fOwner" weight="1.0" outgoing="#//IllegalVariableAccess/link1"
        incoming="#//IllegalVariableAccess/annotatedElement.2 #//IllegalVariableAccess/link11"
        instanceOf="http://www.fzi.de/gast/types#//GASTClass"/>
    <nodes xsi:type="org.reclipse.structure:PSObject" name="method1" weight="1.0"
        outgoing="#//IllegalVariableAccess/link3" incoming="#//IllegalVariableAccess/link4"
        instanceOf="http://www.fzi.de/gast/functions#//Method"/>
    <nodes xsi:type="org.reclipse.structure:PSObject" name="fAccess" weight="1.0"
        outgoing="#//IllegalVariableAccess/link2" incoming="#//IllegalVariableAccess/link3"
        instanceOf="http://www.fzi.de/gast/accesses#//VariableAccess"/>
    <nodes xsi:type="org.reclipse.structure:PSObject" name="aField" weight="1.0" incoming="#//IllegalVariableAccess/link1 #//IllegalVariableAccess/link2 #//IllegalVariableAccess/annotatedElement.1"
        instanceOf="http://www.fzi.de/gast/variables#//Field"/>
    <nodes xsi:type="org.reclipse.structure:PSAnnotation" name="compAnno" weight="1.0"
        outgoing="#//IllegalVariableAccess/link6" type="#//Component"/>
  </patternSpecifications>
  <patternSpecifications name="InheritanceBetweenComponents">
    <connections xsi:type="org.reclipse.structure:PSLink" name="link2" weight="1.0"
        source="#//InheritanceBetweenComponents/comp" target="#//InheritanceBetweenComponents/subClass"
        qualifier="classes" instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="org.reclipse.structure:PSLink" name="link2" weight="1.0"
        source="#//InheritanceBetweenComponents/comp" target="#//InheritanceBetweenComponents/superClass"
        qualifier="classes" negative="true" instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="org.reclipse.structure:PSLink" name="link3" weight="1.0"
        source="#//InheritanceBetweenComponents/subClass" target="#//InheritanceBetweenComponents/superClass"
        instanceOf="http://www.fzi.de/gast/types#//GASTClass/superTypes"/>
    <connections xsi:type="org.reclipse.structure:PSLink" name="annotatedElement"
        weight="1.0" source="#//InheritanceBetweenComponents/@nodes.0" target="#//InheritanceBetweenComponents/subClass"
        qualifier="subClass" instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="org.reclipse.structure:PSLink" name="annotatedElement"
        weight="1.0" source="#//InheritanceBetweenComponents/@nodes.0" target="#//InheritanceBetweenComponents/superClass"
        qualifier="superClass" instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="org.reclipse.structure:PSLink" name="link6" weight="1.0"
        source="#//InheritanceBetweenComponents/comp" target="#//InheritanceBetweenComponents/obj3"
        qualifier="link" instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="org.reclipse.structure:PSLink" name="link7" weight="1.0"
        source="#//InheritanceBetweenComponents/obj3" target="#//InheritanceBetweenComponents/obj4"
        instanceOf="http://q-impress.eu/sourcecodedecorator#//ComponentImplementingClassesLink/providedInterfaces"/>
    <connections xsi:type="org.reclipse.structure:PSLink" name="link8" weight="1.0"
        source="#//InheritanceBetweenComponents/obj4" target="#//InheritanceBetweenComponents/superClass"
        negative="true" instanceOf="http://q-impress.eu/sourcecodedecorator#//InterfaceSourceCodeLink/gastClass"/>
    <nodes xsi:type="org.reclipse.structure:PSAnnotation" weight="1.0" outgoing="#//InheritanceBetweenComponents/annotatedElement #//InheritanceBetweenComponents/annotatedElement.1"
        type="#//InheritanceBetweenComponents"/>
    <nodes xsi:type="org.reclipse.structure:PSObject" name="subClass" weight="1.0"
        outgoing="#//InheritanceBetweenComponents/link3" incoming="#//InheritanceBetweenComponents/link2 #//InheritanceBetweenComponents/annotatedElement"
        instanceOf="http://www.fzi.de/gast/types#//GASTClass"/>
    <nodes xsi:type="org.reclipse.structure:PSObject" name="superClass" weight="1.0"
        incoming="#//InheritanceBetweenComponents/link2.1 #//InheritanceBetweenComponents/link3 #//InheritanceBetweenComponents/annotatedElement.1 #//InheritanceBetweenComponents/link8"
        instanceOf="http://www.fzi.de/gast/types#//GASTClass">
      <nodeConstraints xsi:type="org.reclipse.structure:PSAttributeConstraint" weight="1.0"
          valueExpression="[^(java)].*" operator="REGULAR_EXPRESSION" attribute="http://www.fzi.de/gast/types#//GASTType/qualifiedName"/>
      <nodeConstraints xsi:type="org.reclipse.structure:PSAttributeConstraint" weight="1.0"
          valueExpression="NORMAL" operator="EQUAL" attribute="http://www.fzi.de/gast/core#//ModelElement/status"/>
    </nodes>
    <nodes xsi:type="org.reclipse.structure:PSAnnotation" name="comp" weight="1.0"
        outgoing="#//InheritanceBetweenComponents/link2 #//InheritanceBetweenComponents/link2.1 #//InheritanceBetweenComponents/link6"
        type="#//Component"/>
    <nodes xsi:type="org.reclipse.structure:PSObject" name="obj3" weight="1.0" outgoing="#//InheritanceBetweenComponents/link7"
        incoming="#//InheritanceBetweenComponents/link6" instanceOf="http://q-impress.eu/sourcecodedecorator#//ComponentImplementingClassesLink"/>
    <nodes xsi:type="org.reclipse.structure:PSObject" name="obj4" weight="1.0" modifier="SET"
        outgoing="#//InheritanceBetweenComponents/link8" incoming="#//InheritanceBetweenComponents/link7"
        instanceOf="http://q-impress.eu/sourcecodedecorator#//InterfaceSourceCodeLink"/>
  </patternSpecifications>
  <patternSpecifications name="UndercoverTransferObject">
    <connections xsi:type="org.reclipse.structure:PSLink" name="link1" weight="1.0"
        source="#//UndercoverTransferObject/ucTO" target="#//UndercoverTransferObject/attr"
        instanceOf="http://www.fzi.de/gast/types#//GASTClass/fields"/>
    <connections xsi:type="org.reclipse.structure:PSLink" name="link3" weight="1.0"
        source="#//UndercoverTransferObject/ucTO" target="#//UndercoverTransferObject/getter"
        instanceOf="http://www.fzi.de/gast/types#//GASTClass/methods"/>
    <connections xsi:type="org.reclipse.structure:PSLink" name="annotatedElement"
        weight="1.0" source="#//UndercoverTransferObject/@nodes.0" target="#//UndercoverTransferObject/ucTO"
        qualifier="undercoverTO" instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="org.reclipse.structure:PSLink" name="link7" weight="1.0"
        source="#//UndercoverTransferObject/setter" target="#//UndercoverTransferObject/writeAcces"
        instanceOf="http://www.fzi.de/gast/functions#//Function/accesses"/>
    <connections xsi:type="org.reclipse.structure:PSLink" name="link8" weight="1.0"
        source="#//UndercoverTransferObject/writeAcces" target="#//UndercoverTransferObject/attr"
        instanceOf="http://www.fzi.de/gast/accesses#//Access/accessedTarget"/>
    <connections xsi:type="org.reclipse.structure:PSLink" name="link9" weight="1.0"
        source="#//UndercoverTransferObject/ucTO" target="#//UndercoverTransferObject/setter"
        instanceOf="http://www.fzi.de/gast/types#//GASTClass/methods"/>
    <connections xsi:type="org.reclipse.structure:PSLink" name="link11" weight="1.0"
        source="#//UndercoverTransferObject/getter" target="#//UndercoverTransferObject/returnAccess"
        instanceOf="http://www.fzi.de/gast/functions#//Function/returnTypeDeclaration"/>
    <connections xsi:type="org.reclipse.structure:PSLink" name="link9" weight="1.0"
        source="#//UndercoverTransferObject/attr" target="#//UndercoverTransferObject/returnType"
        instanceOf="http://www.fzi.de/gast/variables#//Variable/type"/>
    <connections xsi:type="org.reclipse.structure:PSLink" name="link10" weight="1.0"
        source="#//UndercoverTransferObject/returnAccess" target="#//UndercoverTransferObject/returnType"
        instanceOf="http://www.fzi.de/gast/accesses#//TypeAccess/targetType"/>
    <connections xsi:type="org.reclipse.structure:PSLink" name="link11" weight="1.0"
        source="#//UndercoverTransferObject/getter" target="#//UndercoverTransferObject/returnAccess"
        instanceOf="http://www.fzi.de/gast/functions#//Function/returnTypeDeclaration"/>
    <connections xsi:type="org.reclipse.structure:PSLink" name="link12" weight="1.0"
        source="#//UndercoverTransferObject/returnAccess" target="#//UndercoverTransferObject/attr"
        instanceOf="http://www.fzi.de/gast/accesses#//Access/accessedTarget"/>
    <nodes xsi:type="org.reclipse.structure:PSAnnotation" weight="1.0" outgoing="#//UndercoverTransferObject/annotatedElement"
        type="#//UndercoverTransferObject"/>
    <nodes xsi:type="org.reclipse.structure:PSObject" name="ucTO" weight="1.0" outgoing="#//UndercoverTransferObject/link1 #//UndercoverTransferObject/link3 #//UndercoverTransferObject/link9"
        incoming="#//UndercoverTransferObject/annotatedElement" instanceOf="http://www.fzi.de/gast/types#//GASTClass"/>
    <nodes xsi:type="org.reclipse.structure:PSObject" name="attr" weight="1.0" parents="#//UndercoverTransferObject/frag1"
        outgoing="#//UndercoverTransferObject/link9.1" incoming="#//UndercoverTransferObject/link1 #//UndercoverTransferObject/link8 #//UndercoverTransferObject/link12"
        instanceOf="http://www.fzi.de/gast/variables#//Field"/>
    <nodes xsi:type="org.reclipse.structure:PSObject" name="getter" weight="1.0" parents="#//UndercoverTransferObject/frag1"
        outgoing="#//UndercoverTransferObject/link11 #//UndercoverTransferObject/link11.1"
        incoming="#//UndercoverTransferObject/link3" instanceOf="http://www.fzi.de/gast/functions#//Method">
      <nodeConstraints xsi:type="org.reclipse.structure:PSAttributeConstraint" weight="1.0"
          valueExpression="get.*" operator="EQUAL" attribute="http://www.fzi.de/gast/core#//NamedModelElement/simpleName"/>
    </nodes>
    <nodes xsi:type="org.reclipse.structure:PSObject" name="setter" weight="1.0" parents="#//UndercoverTransferObject/frag1"
        outgoing="#//UndercoverTransferObject/link7" incoming="#//UndercoverTransferObject/link9"
        instanceOf="http://www.fzi.de/gast/functions#//Method">
      <nodeConstraints xsi:type="org.reclipse.structure:PSAttributeConstraint" weight="1.0"
          valueExpression="set.*" operator="EQUAL" attribute="http://www.fzi.de/gast/core#//NamedModelElement/simpleName"/>
    </nodes>
    <nodes xsi:type="org.reclipse.structure:PSObject" name="writeAcces" weight="1.0"
        parents="#//UndercoverTransferObject/frag1" outgoing="#//UndercoverTransferObject/link8"
        incoming="#//UndercoverTransferObject/link7" instanceOf="http://www.fzi.de/gast/accesses#//VariableAccess">
      <nodeConstraints xsi:type="org.reclipse.structure:PSAttributeConstraint" weight="1.0"
          valueExpression="true" operator="EQUAL" attribute="http://www.fzi.de/gast/accesses#//VariableAccess/write"/>
    </nodes>
    <nodes xsi:type="org.reclipse.structure:PSObject" name="returnAccess" weight="1.0"
        parents="#//UndercoverTransferObject/frag1" outgoing="#//UndercoverTransferObject/link10 #//UndercoverTransferObject/link12"
        incoming="#//UndercoverTransferObject/link11 #//UndercoverTransferObject/link11.1"
        instanceOf="http://www.fzi.de/gast/accesses#//DeclarationTypeAccess"/>
    <nodes xsi:type="org.reclipse.structure:PSObject" name="returnType" weight="1.0"
        parents="#//UndercoverTransferObject/frag1" incoming="#//UndercoverTransferObject/link9.1 #//UndercoverTransferObject/link10"
        instanceOf="http://www.fzi.de/gast/types#//GASTClass">
      <nodeConstraints xsi:type="org.reclipse.structure:PSAttributeConstraint" weight="1.0"
          valueExpression="true" operator="EQUAL" attribute="http://www.fzi.de/gast/types#//GASTClass/primitive"/>
    </nodes>
    <combinedFragments name="frag1" weight="1.0" children="#//UndercoverTransferObject/returnAccess #//UndercoverTransferObject/attr #//UndercoverTransferObject/getter #//UndercoverTransferObject/setter #//UndercoverTransferObject/writeAcces #//UndercoverTransferObject/returnType"
        kind="SET"/>
  </patternSpecifications>
  <patternSpecifications name="NonTOCommunication">
    <connections xsi:type="org.reclipse.structure:PSLink" name="link3" weight="1.0"
        source="#//NonTOCommunication/call" target="#//NonTOCommunication/calledMethod"
        instanceOf="http://www.fzi.de/gast/accesses#//Access/accessedTarget"/>
    <connections xsi:type="org.reclipse.structure:PSLink" name="link4" weight="1.0"
        source="#//NonTOCommunication/calledMethod" target="#//NonTOCommunication/parameter"
        instanceOf="http://www.fzi.de/gast/functions#//Function/formalParameters"/>
    <connections xsi:type="org.reclipse.structure:PSLink" name="link5" weight="1.0"
        source="#//NonTOCommunication/parameter" target="#//NonTOCommunication/paramType"
        instanceOf="http://www.fzi.de/gast/variables#//Variable/type"/>
    <connections xsi:type="org.reclipse.structure:PSLink" name="link4" weight="1.0"
        source="#//NonTOCommunication/callingClass" target="#//NonTOCommunication/call"
        instanceOf="http://www.fzi.de/gast/types#//GASTClass/allAccesses"/>
    <connections xsi:type="org.reclipse.structure:PSLink" name="link5" weight="1.0"
        source="#//NonTOCommunication/comp" target="#//NonTOCommunication/callingClass"
        qualifier="classes" instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="org.reclipse.structure:PSLink" name="annotatedElement"
        weight="1.0" source="#//NonTOCommunication/@nodes.0" target="#//NonTOCommunication/callingClass"
        qualifier="callingClass" instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="org.reclipse.structure:PSLink" name="annotatedElement"
        weight="1.0" source="#//NonTOCommunication/@nodes.0" target="#//NonTOCommunication/calledMethod"
        qualifier="calledMethod" instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="org.reclipse.structure:PSLink" name="annotatedElement"
        weight="1.0" source="#//NonTOCommunication/@nodes.0" target="#//NonTOCommunication/paramType"
        qualifier="nonTO" instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="org.reclipse.structure:PSLink" name="link10" weight="1.0"
        source="#//NonTOCommunication/mOwner" target="#//NonTOCommunication/calledMethod"
        instanceOf="http://www.fzi.de/gast/types#//GASTClass/methods"/>
    <connections xsi:type="org.reclipse.structure:PSLink" name="link11" weight="1.0"
        source="#//NonTOCommunication/comp2" target="#//NonTOCommunication/mOwner"
        qualifier="classes" instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <nodes xsi:type="org.reclipse.structure:PSAnnotation" weight="1.0" outgoing="#//NonTOCommunication/annotatedElement #//NonTOCommunication/annotatedElement.1 #//NonTOCommunication/annotatedElement.2"
        type="#//NonTOCommunication"/>
    <nodes xsi:type="org.reclipse.structure:PSObject" name="callingClass" weight="1.0"
        outgoing="#//NonTOCommunication/link4.1" incoming="#//NonTOCommunication/link5.1 #//NonTOCommunication/annotatedElement"
        instanceOf="http://www.fzi.de/gast/types#//GASTClass"/>
    <nodes xsi:type="org.reclipse.structure:PSObject" name="call" weight="1.0" outgoing="#//NonTOCommunication/link3"
        incoming="#//NonTOCommunication/link4.1" instanceOf="http://www.fzi.de/gast/accesses#//FunctionAccess"/>
    <nodes xsi:type="org.reclipse.structure:PSObject" name="calledMethod" weight="1.0"
        outgoing="#//NonTOCommunication/link4" incoming="#//NonTOCommunication/link3 #//NonTOCommunication/annotatedElement.1 #//NonTOCommunication/link10"
        instanceOf="http://www.fzi.de/gast/functions#//Method"/>
    <nodes xsi:type="org.reclipse.structure:PSObject" name="parameter" weight="1.0"
        outgoing="#//NonTOCommunication/link5" incoming="#//NonTOCommunication/link4"
        instanceOf="http://www.fzi.de/gast/variables#//FormalParameter"/>
    <nodes xsi:type="org.reclipse.structure:PSObject" name="paramType" weight="1.0"
        incoming="#//NonTOCommunication/link5 #//NonTOCommunication/annotatedElement.2"
        instanceOf="http://www.fzi.de/gast/types#//GASTClass">
      <nodeConstraints xsi:type="org.reclipse.structure:PSAttributeConstraint" weight="1.0"
          valueExpression=".*[^(TO)]" operator="REGULAR_EXPRESSION" attribute="http://www.fzi.de/gast/core#//NamedModelElement/simpleName"/>
      <nodeConstraints xsi:type="org.reclipse.structure:PSAttributeConstraint" weight="1.0"
          valueExpression="false" operator="EQUAL" attribute="http://www.fzi.de/gast/types#//GASTClass/primitive"/>
    </nodes>
    <nodes xsi:type="org.reclipse.structure:PSAnnotation" name="comp" weight="1.0"
        outgoing="#//NonTOCommunication/link5.1" type="#//Component"/>
    <nodes xsi:type="org.reclipse.structure:PSObject" name="mOwner" weight="1.0" outgoing="#//NonTOCommunication/link10"
        incoming="#//NonTOCommunication/link11" instanceOf="http://www.fzi.de/gast/types#//GASTClass"/>
    <nodes xsi:type="org.reclipse.structure:PSAnnotation" name="comp2" weight="1.0"
        outgoing="#//NonTOCommunication/link11" type="#//Component"/>
    <constraints name="different components" weight="1.0" expression="comp &lt;> comp2"/>
  </patternSpecifications>
  <patternSpecifications name="UnauthorizedCall">
    <connections xsi:type="org.reclipse.structure:PSLink" name="link2" weight="1.0"
        source="#//UnauthorizedCall/comp" target="#//UnauthorizedCall/callingClass"
        qualifier="classes" instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="org.reclipse.structure:PSLink" name="link5" weight="1.0"
        source="#//UnauthorizedCall/compLink" target="#//UnauthorizedCall/required"
        instanceOf="http://q-impress.eu/sourcecodedecorator#//ComponentImplementingClassesLink/requiredInterfaces"/>
    <connections xsi:type="org.reclipse.structure:PSLink" name="link6" weight="1.0"
        source="#//UnauthorizedCall/required" target="#//UnauthorizedCall/calleeSuperType"
        negative="true" instanceOf="http://q-impress.eu/sourcecodedecorator#//InterfaceSourceCodeLink/gastClass"/>
    <connections xsi:type="org.reclipse.structure:PSLink" name="link7" weight="1.0"
        source="#//UnauthorizedCall/callee" target="#//UnauthorizedCall/calleeSuperType"
        instanceOf="http://www.fzi.de/gast/types#//GASTClass/superTypes"/>
    <connections xsi:type="org.reclipse.structure:PSLink" name="link8" weight="1.0"
        source="#//UnauthorizedCall/call" target="#//UnauthorizedCall/calledMethod"
        instanceOf="http://www.fzi.de/gast/accesses#//FunctionAccess/targetFunction"/>
    <connections xsi:type="org.reclipse.structure:PSLink" name="link9" weight="1.0"
        source="#//UnauthorizedCall/callee" target="#//UnauthorizedCall/calledMethod"
        instanceOf="http://www.fzi.de/gast/types#//GASTClass/methods"/>
    <connections xsi:type="org.reclipse.structure:PSLink" name="link10" weight="1.0"
        source="#//UnauthorizedCall/required" target="#//UnauthorizedCall/callee"
        negative="true" instanceOf="http://q-impress.eu/sourcecodedecorator#//InterfaceSourceCodeLink/gastClass"/>
    <connections xsi:type="org.reclipse.structure:PSLink" name="annotatedElement"
        weight="1.0" source="#//UnauthorizedCall/@nodes.0" target="#//UnauthorizedCall/callingClass"
        qualifier="callingClass" instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="org.reclipse.structure:PSLink" name="annotatedElement"
        weight="1.0" source="#//UnauthorizedCall/@nodes.0" target="#//UnauthorizedCall/callee"
        qualifier="callee" instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="org.reclipse.structure:PSLink" name="link15" weight="1.0"
        source="#//UnauthorizedCall/comp" target="#//UnauthorizedCall/callee" qualifier="classes"
        negative="true" instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="org.reclipse.structure:PSLink" name="link16" weight="1.0"
        source="#//UnauthorizedCall/calledMethod" target="#//UnauthorizedCall/callee"
        instanceOf="http://www.fzi.de/gast/functions#//Method/surroundingClass"/>
    <connections xsi:type="org.reclipse.structure:PSLink" name="link14" weight="1.0"
        source="#//UnauthorizedCall/comp" target="#//UnauthorizedCall/compLink" qualifier="link"
        instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="org.reclipse.structure:PSLink" name="link13" weight="1.0"
        source="#//UnauthorizedCall/callingClass" target="#//UnauthorizedCall/obj8"
        instanceOf="http://www.fzi.de/gast/types#//GASTClass/methods"/>
    <connections xsi:type="org.reclipse.structure:PSLink" name="link14" weight="1.0"
        source="#//UnauthorizedCall/obj8" target="#//UnauthorizedCall/call" instanceOf="http://www.fzi.de/gast/functions#//Function/accesses"/>
    <connections xsi:type="org.reclipse.structure:PSLink" name="link15" weight="1.0"
        source="#//UnauthorizedCall/anno3" target="#//UnauthorizedCall/callee" qualifier="classes"
        instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="org.reclipse.structure:PSLink" name="annotatedElement"
        weight="1.0" source="#//UnauthorizedCall/@nodes.0" target="#//UnauthorizedCall/calledMethod"
        qualifier="calledMethod" instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <nodes xsi:type="org.reclipse.structure:PSAnnotation" weight="1.0" outgoing="#//UnauthorizedCall/annotatedElement #//UnauthorizedCall/annotatedElement.1 #//UnauthorizedCall/annotatedElement.2"
        type="#//UnauthorizedCall"/>
    <nodes xsi:type="org.reclipse.structure:PSObject" name="callingClass" weight="1.0"
        outgoing="#//UnauthorizedCall/link13" incoming="#//UnauthorizedCall/link2 #//UnauthorizedCall/annotatedElement"
        instanceOf="http://www.fzi.de/gast/types#//GASTClass"/>
    <nodes xsi:type="org.reclipse.structure:PSObject" name="calleeSuperType" weight="1.0"
        incoming="#//UnauthorizedCall/link6 #//UnauthorizedCall/link7" instanceOf="http://www.fzi.de/gast/types#//GASTClass"/>
    <nodes xsi:type="org.reclipse.structure:PSAnnotation" name="comp" weight="1.0"
        outgoing="#//UnauthorizedCall/link2 #//UnauthorizedCall/link15 #//UnauthorizedCall/link14"
        type="#//Component"/>
    <nodes xsi:type="org.reclipse.structure:PSObject" name="call" weight="1.0" outgoing="#//UnauthorizedCall/link8"
        incoming="#//UnauthorizedCall/link14.1" instanceOf="http://www.fzi.de/gast/accesses#//FunctionAccess"/>
    <nodes xsi:type="org.reclipse.structure:PSObject" name="compLink" weight="1.0"
        outgoing="#//UnauthorizedCall/link5" incoming="#//UnauthorizedCall/link14"
        instanceOf="http://q-impress.eu/sourcecodedecorator#//ComponentImplementingClassesLink"/>
    <nodes xsi:type="org.reclipse.structure:PSObject" name="required" weight="1.0"
        outgoing="#//UnauthorizedCall/link6 #//UnauthorizedCall/link10" incoming="#//UnauthorizedCall/link5"
        instanceOf="http://q-impress.eu/sourcecodedecorator#//InterfaceSourceCodeLink"/>
    <nodes xsi:type="org.reclipse.structure:PSObject" name="callee" weight="1.0" outgoing="#//UnauthorizedCall/link7 #//UnauthorizedCall/link9"
        incoming="#//UnauthorizedCall/link10 #//UnauthorizedCall/annotatedElement.1 #//UnauthorizedCall/link15 #//UnauthorizedCall/link16 #//UnauthorizedCall/link15.1"
        instanceOf="http://www.fzi.de/gast/types#//GASTClass">
      <nodeConstraints xsi:type="org.reclipse.structure:PSAttributeConstraint" weight="1.0"
          valueExpression="NORMAL" operator="EQUAL" attribute="http://www.fzi.de/gast/core#//ModelElement/status"/>
    </nodes>
    <nodes xsi:type="org.reclipse.structure:PSObject" name="calledMethod" weight="1.0"
        outgoing="#//UnauthorizedCall/link16" incoming="#//UnauthorizedCall/link8 #//UnauthorizedCall/link9 #//UnauthorizedCall/annotatedElement.2"
        instanceOf="http://www.fzi.de/gast/functions#//Method"/>
    <nodes xsi:type="org.reclipse.structure:PSObject" name="obj8" weight="1.0" outgoing="#//UnauthorizedCall/link14.1"
        incoming="#//UnauthorizedCall/link13" instanceOf="http://www.fzi.de/gast/functions#//Method"/>
    <nodes xsi:type="org.reclipse.structure:PSAnnotation" name="anno3" weight="1.0"
        outgoing="#//UnauthorizedCall/link15.1" type="#//Component"/>
  </patternSpecifications>
  <patternSpecifications name="NonTOCommunication2">
    <connections xsi:type="org.reclipse.structure:PSLink" name="link1" weight="1.0"
        source="#//NonTOCommunication2/comp" target="#//NonTOCommunication2/callingClass"
        qualifier="classes" instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="org.reclipse.structure:PSLink" name="link2" weight="1.0"
        source="#//NonTOCommunication2/callingClass" target="#//NonTOCommunication2/call"
        instanceOf="http://www.fzi.de/gast/types#//GASTClass/allAccesses"/>
    <connections xsi:type="org.reclipse.structure:PSLink" name="link3" weight="1.0"
        source="#//NonTOCommunication2/call" target="#//NonTOCommunication2/calledMethod"
        instanceOf="http://www.fzi.de/gast/accesses#//Access/accessedTarget"/>
    <connections xsi:type="org.reclipse.structure:PSLink" name="link4" weight="1.0"
        source="#//NonTOCommunication2/calledMethod" target="#//NonTOCommunication2/parameter"
        instanceOf="http://www.fzi.de/gast/functions#//Function/formalParameters"/>
    <connections xsi:type="org.reclipse.structure:PSLink" name="link5" weight="1.0"
        source="#//NonTOCommunication2/parameter" target="#//NonTOCommunication2/paramType"
        instanceOf="http://www.fzi.de/gast/variables#//Variable/type"/>
    <connections xsi:type="org.reclipse.structure:PSLink" name="link6" weight="1.0"
        source="#//NonTOCommunication2/someCompInterface" target="#//NonTOCommunication2/paramType"
        instanceOf="http://qimpress.eu/sourcecodedecorator/1.0#//InterfaceSourceCodeLink/gastClass"/>
    <connections xsi:type="org.reclipse.structure:PSLink" name="annotatedElement"
        weight="1.0" source="#//NonTOCommunication2/@nodes.0" target="#//NonTOCommunication2/callingClass"
        qualifier="callingClass" instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="org.reclipse.structure:PSLink" name="annotatedElement"
        weight="1.0" source="#//NonTOCommunication2/@nodes.0" target="#//NonTOCommunication2/calledMethod"
        qualifier="calledMethod" instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="org.reclipse.structure:PSLink" name="annotatedElement"
        weight="1.0" source="#//NonTOCommunication2/@nodes.0" target="#//NonTOCommunication2/paramType"
        qualifier="nonTO" instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="org.reclipse.structure:PSLink" name="link10" weight="1.0"
        source="#//NonTOCommunication2/comp2" target="#//NonTOCommunication2/mOwner"
        qualifier="classes" instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="org.reclipse.structure:PSLink" name="link11" weight="1.0"
        source="#//NonTOCommunication2/mOwner" target="#//NonTOCommunication2/calledMethod"
        instanceOf="http://www.fzi.de/gast/types#//GASTClass/methods"/>
    <connections xsi:type="org.reclipse.structure:PSLink" name="link12" weight="1.0"
        source="#//NonTOCommunication2/calledMethod" target="#//NonTOCommunication2/mOwner"
        instanceOf="http://www.fzi.de/gast/functions#//Method/surroundingClass"/>
    <nodes xsi:type="org.reclipse.structure:PSAnnotation" weight="1.0" outgoing="#//NonTOCommunication2/annotatedElement #//NonTOCommunication2/annotatedElement.1 #//NonTOCommunication2/annotatedElement.2"
        type="#//NonTOCommunication2"/>
    <nodes xsi:type="org.reclipse.structure:PSAnnotation" name="comp" weight="1.0"
        outgoing="#//NonTOCommunication2/link1" type="#//Component"/>
    <nodes xsi:type="org.reclipse.structure:PSObject" name="callingClass" weight="1.0"
        outgoing="#//NonTOCommunication2/link2" incoming="#//NonTOCommunication2/link1 #//NonTOCommunication2/annotatedElement"
        instanceOf="http://www.fzi.de/gast/types#//GASTClass"/>
    <nodes xsi:type="org.reclipse.structure:PSObject" name="call" weight="1.0" outgoing="#//NonTOCommunication2/link3"
        incoming="#//NonTOCommunication2/link2" instanceOf="http://www.fzi.de/gast/accesses#//FunctionAccess"/>
    <nodes xsi:type="org.reclipse.structure:PSObject" name="calledMethod" weight="1.0"
        outgoing="#//NonTOCommunication2/link4 #//NonTOCommunication2/link12" incoming="#//NonTOCommunication2/link3 #//NonTOCommunication2/annotatedElement.1 #//NonTOCommunication2/link11"
        instanceOf="http://www.fzi.de/gast/functions#//Method"/>
    <nodes xsi:type="org.reclipse.structure:PSObject" name="parameter" weight="1.0"
        outgoing="#//NonTOCommunication2/link5" incoming="#//NonTOCommunication2/link4"
        instanceOf="http://www.fzi.de/gast/variables#//FormalParameter"/>
    <nodes xsi:type="org.reclipse.structure:PSObject" name="paramType" weight="1.0"
        incoming="#//NonTOCommunication2/link5 #//NonTOCommunication2/link6 #//NonTOCommunication2/annotatedElement.2"
        instanceOf="http://www.fzi.de/gast/types#//GASTClass"/>
    <nodes xsi:type="org.reclipse.structure:PSObject" name="someCompInterface" weight="1.0"
        outgoing="#//NonTOCommunication2/link6" instanceOf="http://qimpress.eu/sourcecodedecorator/1.0#//InterfaceSourceCodeLink"/>
    <nodes xsi:type="org.reclipse.structure:PSObject" name="mOwner" weight="1.0" outgoing="#//NonTOCommunication2/link11"
        incoming="#//NonTOCommunication2/link10 #//NonTOCommunication2/link12" instanceOf="http://www.fzi.de/gast/types#//GASTClass"/>
    <nodes xsi:type="org.reclipse.structure:PSAnnotation" name="comp2" weight="1.0"
        outgoing="#//NonTOCommunication2/link10" type="#//Component"/>
    <constraints name="different components" weight="1.0" expression="comp &lt;> comp2"/>
  </patternSpecifications>
</org.reclipse.structure:PSCatalog>
