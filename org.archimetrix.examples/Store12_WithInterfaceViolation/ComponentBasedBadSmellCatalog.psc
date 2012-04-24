<?xml version="1.0" encoding="UTF-8"?>
<specification:PSCatalog xmi:version="2.0"
    xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xmlns:specification="http://www.reclipse.org/ns/specification" id="_Y6Q7cauREeComqG0tdmjrg"
    name="Component-Based Bad Smell Catalog" metamodel="eu.qimpress.sourcecodedecorator">
  <patternSpecifications id="_Y6RigKuREeComqG0tdmjrg" name="Component" subPatterns="#_10DUwKuSEeComqG0tdmjrg #_2AVrAKuXEeComqG0tdmjrg"
      abstract="true">
    <connections xsi:type="specification:PSLink" id="_pS9ywKuSEeComqG0tdmjrg" name="annotatedElement"
        source="#_Y6SwoKuREeComqG0tdmjrg" target="#_jyozMKuREeComqG0tdmjrg" qualifier="classes"
        instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="specification:PSLink" id="_pkH0MKuSEeComqG0tdmjrg" name="annotatedElement"
        source="#_Y6SwoKuREeComqG0tdmjrg" target="#_ktX9IKuREeComqG0tdmjrg" qualifier="link"
        instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="specification:PSLink" id="_qBfssKuSEeComqG0tdmjrg" name="annotatedElement"
        source="#_Y6SwoKuREeComqG0tdmjrg" target="#_kM8woKuREeComqG0tdmjrg" qualifier="component"
        instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <nodes xsi:type="specification:PSAnnotation" id="_Y6SwoKuREeComqG0tdmjrg" outgoing="#_pS9ywKuSEeComqG0tdmjrg #_pkH0MKuSEeComqG0tdmjrg #_qBfssKuSEeComqG0tdmjrg"
        type="#_Y6RigKuREeComqG0tdmjrg"/>
    <nodes xsi:type="specification:PSObject" id="_jyozMKuREeComqG0tdmjrg" name="cl"
        modifier="SET" incoming="#_pS9ywKuSEeComqG0tdmjrg" instanceOf="http://www.fzi.de/gast/types#//GASTClass"/>
    <nodes xsi:type="specification:PSObject" id="_kM8woKuREeComqG0tdmjrg" name="comp"
        incoming="#_qBfssKuSEeComqG0tdmjrg" instanceOf="http://q-impress.eu/samm/staticstructure#//ComponentType"/>
    <nodes xsi:type="specification:PSObject" id="_ktX9IKuREeComqG0tdmjrg" name="clink"
        incoming="#_pkH0MKuSEeComqG0tdmjrg" instanceOf="http://q-impress.eu/sourcecodedecorator#//ComponentImplementingClassesLink"/>
  </patternSpecifications>
  <patternSpecifications id="_10DUwKuSEeComqG0tdmjrg" name="DirectComponentClasses"
      superPattern="#_Y6RigKuREeComqG0tdmjrg">
    <connections xsi:type="specification:PSLink" id="_6lS2MKuSEeComqG0tdmjrg" name="annotatedElement"
        source="#_10GYEKuSEeComqG0tdmjrg" target="#_5PYMIKuSEeComqG0tdmjrg" qualifier="classes"
        instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="specification:PSLink" id="_6xHrsKuSEeComqG0tdmjrg" name="annotatedElement"
        source="#_10GYEKuSEeComqG0tdmjrg" target="#_54urIKuSEeComqG0tdmjrg" qualifier="link"
        instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="specification:PSLink" id="_7TIzoKuSEeComqG0tdmjrg" name="annotatedElement"
        source="#_10GYEKuSEeComqG0tdmjrg" target="#_5mRCIKuSEeComqG0tdmjrg" qualifier="component"
        instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="specification:PSLink" id="_7kissKuSEeComqG0tdmjrg" name="link4"
        source="#_54urIKuSEeComqG0tdmjrg" target="#_5mRCIKuSEeComqG0tdmjrg" instanceOf="http://q-impress.eu/sourcecodedecorator#//ComponentImplementingClassesLink/component"/>
    <connections xsi:type="specification:PSLink" id="_7_aDwKuSEeComqG0tdmjrg" name="link5"
        source="#_54urIKuSEeComqG0tdmjrg" target="#_5PYMIKuSEeComqG0tdmjrg" instanceOf="http://q-impress.eu/sourcecodedecorator#//ComponentImplementingClassesLink/implementingClasses"/>
    <nodes xsi:type="specification:PSAnnotation" id="_10GYEKuSEeComqG0tdmjrg" outgoing="#_6lS2MKuSEeComqG0tdmjrg #_6xHrsKuSEeComqG0tdmjrg #_7TIzoKuSEeComqG0tdmjrg"
        type="#_10DUwKuSEeComqG0tdmjrg"/>
    <nodes xsi:type="specification:PSObject" id="_5PYMIKuSEeComqG0tdmjrg" name="cl"
        modifier="SET" incoming="#_6lS2MKuSEeComqG0tdmjrg #_7_aDwKuSEeComqG0tdmjrg"
        instanceOf="http://www.fzi.de/gast/types#//GASTClass"/>
    <nodes xsi:type="specification:PSObject" id="_5mRCIKuSEeComqG0tdmjrg" name="comp"
        incoming="#_7TIzoKuSEeComqG0tdmjrg #_7kissKuSEeComqG0tdmjrg" instanceOf="http://q-impress.eu/samm/staticstructure#//ComponentType"/>
    <nodes xsi:type="specification:PSObject" id="_54urIKuSEeComqG0tdmjrg" name="cLink"
        outgoing="#_7kissKuSEeComqG0tdmjrg #_7_aDwKuSEeComqG0tdmjrg" incoming="#_6xHrsKuSEeComqG0tdmjrg"
        instanceOf="http://q-impress.eu/sourcecodedecorator#//ComponentImplementingClassesLink"/>
  </patternSpecifications>
  <patternSpecifications id="_ZvExoKuTEeComqG0tdmjrg" name="Composition" subPatterns="#_xQi34KuTEeComqG0tdmjrg #_0JK_8KuVEeComqG0tdmjrg"
      abstract="true">
    <connections xsi:type="specification:PSLink" id="_jG-8MKuTEeComqG0tdmjrg" name="annotatedElement"
        source="#_ZvExoauTEeComqG0tdmjrg" target="#_chDKAKuTEeComqG0tdmjrg" qualifier="parentComponent"
        instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="specification:PSLink" id="_jYYOMKuTEeComqG0tdmjrg" name="annotatedElement"
        source="#_ZvExoauTEeComqG0tdmjrg" target="#_cyYKkKuTEeComqG0tdmjrg" qualifier="subComponents"
        instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <nodes xsi:type="specification:PSAnnotation" id="_ZvExoauTEeComqG0tdmjrg" outgoing="#_jG-8MKuTEeComqG0tdmjrg #_jYYOMKuTEeComqG0tdmjrg"
        type="#_ZvExoKuTEeComqG0tdmjrg"/>
    <nodes xsi:type="specification:PSObject" id="_chDKAKuTEeComqG0tdmjrg" name="parent"
        incoming="#_jG-8MKuTEeComqG0tdmjrg" instanceOf="http://q-impress.eu/sourcecodedecorator#//ComponentImplementingClassesLink"/>
    <nodes xsi:type="specification:PSObject" id="_cyYKkKuTEeComqG0tdmjrg" name="subComps"
        modifier="SET" incoming="#_jYYOMKuTEeComqG0tdmjrg" instanceOf="http://q-impress.eu/sourcecodedecorator#//ComponentImplementingClassesLink"/>
  </patternSpecifications>
  <patternSpecifications id="_xQi34KuTEeComqG0tdmjrg" name="DirectComposition" superPattern="#_ZvExoKuTEeComqG0tdmjrg">
    <connections xsi:type="specification:PSLink" id="_5aSmMKuTEeComqG0tdmjrg" name="annotatedElement"
        source="#_xQi34auTEeComqG0tdmjrg" target="#_zFsboKuTEeComqG0tdmjrg" qualifier="parentComponent"
        instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="specification:PSLink" id="_5tlVoKuTEeComqG0tdmjrg" name="annotatedElement"
        source="#_xQi34auTEeComqG0tdmjrg" target="#_zYFMIKuTEeComqG0tdmjrg" qualifier="subComponents"
        instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="specification:PSLink" id="_5-6WMKuTEeComqG0tdmjrg" name="link3"
        source="#_zFsboKuTEeComqG0tdmjrg" target="#_zYFMIKuTEeComqG0tdmjrg" instanceOf="http://q-impress.eu/sourcecodedecorator#//ComponentImplementingClassesLink/subComponents"/>
    <nodes xsi:type="specification:PSAnnotation" id="_xQi34auTEeComqG0tdmjrg" outgoing="#_5aSmMKuTEeComqG0tdmjrg #_5tlVoKuTEeComqG0tdmjrg"
        type="#_xQi34KuTEeComqG0tdmjrg"/>
    <nodes xsi:type="specification:PSObject" id="_zFsboKuTEeComqG0tdmjrg" name="parent"
        outgoing="#_5-6WMKuTEeComqG0tdmjrg" incoming="#_5aSmMKuTEeComqG0tdmjrg" instanceOf="http://q-impress.eu/sourcecodedecorator#//ComponentImplementingClassesLink"/>
    <nodes xsi:type="specification:PSObject" id="_zYFMIKuTEeComqG0tdmjrg" name="subComps"
        modifier="SET" incoming="#_5tlVoKuTEeComqG0tdmjrg #_5-6WMKuTEeComqG0tdmjrg"
        instanceOf="http://q-impress.eu/sourcecodedecorator#//ComponentImplementingClassesLink"/>
  </patternSpecifications>
  <patternSpecifications id="_0JK_8KuVEeComqG0tdmjrg" name="IndirectComposition" superPattern="#_ZvExoKuTEeComqG0tdmjrg">
    <connections xsi:type="specification:PSLink" id="_FaZasKuXEeComqG0tdmjrg" name="annotatedElement"
        source="#_0JK_8auVEeComqG0tdmjrg" target="#_27MboKuVEeComqG0tdmjrg" qualifier="parentComponent"
        instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="specification:PSLink" id="_FsyLMKuXEeComqG0tdmjrg" name="annotatedElement"
        source="#_0JK_8auVEeComqG0tdmjrg" target="#_3iaMoKuVEeComqG0tdmjrg" qualifier="subComponents"
        instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="specification:PSLink" id="_F4TesKuXEeComqG0tdmjrg" name="link3"
        source="#_4N0hIKuVEeComqG0tdmjrg" target="#_3iaMoKuVEeComqG0tdmjrg" qualifier="subComponents"
        instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="specification:PSLink" id="_GLdEMKuXEeComqG0tdmjrg" name="link4"
        source="#_4N0hIKuVEeComqG0tdmjrg" target="#_3MNTIKuVEeComqG0tdmjrg" qualifier="parentComponent"
        instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="specification:PSLink" id="_GYHnMKuXEeComqG0tdmjrg" name="link5"
        source="#_35OKIKuVEeComqG0tdmjrg" target="#_3MNTIKuVEeComqG0tdmjrg" qualifier="subComponents"
        instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="specification:PSLink" id="_GowEMKuXEeComqG0tdmjrg" name="link6"
        source="#_35OKIKuVEeComqG0tdmjrg" target="#_27MboKuVEeComqG0tdmjrg" qualifier="parentComponent"
        instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <nodes xsi:type="specification:PSAnnotation" id="_0JK_8auVEeComqG0tdmjrg" outgoing="#_FaZasKuXEeComqG0tdmjrg #_FsyLMKuXEeComqG0tdmjrg"
        type="#_0JK_8KuVEeComqG0tdmjrg"/>
    <nodes xsi:type="specification:PSObject" id="_27MboKuVEeComqG0tdmjrg" name="parent"
        incoming="#_FaZasKuXEeComqG0tdmjrg #_GowEMKuXEeComqG0tdmjrg" instanceOf="http://q-impress.eu/sourcecodedecorator#//ComponentImplementingClassesLink"/>
    <nodes xsi:type="specification:PSObject" id="_3MNTIKuVEeComqG0tdmjrg" name="intermediateLink"
        incoming="#_GLdEMKuXEeComqG0tdmjrg #_GYHnMKuXEeComqG0tdmjrg" instanceOf="http://q-impress.eu/sourcecodedecorator#//ComponentImplementingClassesLink"/>
    <nodes xsi:type="specification:PSObject" id="_3iaMoKuVEeComqG0tdmjrg" name="subComps"
        modifier="SET" incoming="#_FsyLMKuXEeComqG0tdmjrg #_F4TesKuXEeComqG0tdmjrg"
        instanceOf="http://q-impress.eu/sourcecodedecorator#//ComponentImplementingClassesLink"/>
    <nodes xsi:type="specification:PSAnnotation" id="_35OKIKuVEeComqG0tdmjrg" name="cc"
        outgoing="#_GYHnMKuXEeComqG0tdmjrg #_GowEMKuXEeComqG0tdmjrg" type="#_ZvExoKuTEeComqG0tdmjrg"/>
    <nodes xsi:type="specification:PSAnnotation" id="_4N0hIKuVEeComqG0tdmjrg" name="dc"
        outgoing="#_F4TesKuXEeComqG0tdmjrg #_GLdEMKuXEeComqG0tdmjrg" type="#_xQi34KuTEeComqG0tdmjrg"/>
  </patternSpecifications>
  <patternSpecifications id="_2AVrAKuXEeComqG0tdmjrg" name="IndirectComponentClasses"
      superPattern="#_Y6RigKuREeComqG0tdmjrg">
    <connections xsi:type="specification:PSLink" id="_siW4MKuYEeComqG0tdmjrg" name="link1"
        source="#_5JnwIKuXEeComqG0tdmjrg" target="#_4xC4EKuXEeComqG0tdmjrg" instanceOf="http://q-impress.eu/sourcecodedecorator#//ComponentImplementingClassesLink/component"/>
    <connections xsi:type="specification:PSLink" id="_tD2bsKuYEeComqG0tdmjrg" name="link2"
        source="#_6SGbIKuXEeComqG0tdmjrg" target="#_5JnwIKuXEeComqG0tdmjrg" qualifier="parentComponent"
        instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="specification:PSLink" id="_tavRsKuYEeComqG0tdmjrg" name="link3"
        source="#_6SGbIKuXEeComqG0tdmjrg" target="#_5gILoKuXEeComqG0tdmjrg" qualifier="subComponents"
        instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="specification:PSLink" id="_t53dsKuYEeComqG0tdmjrg" name="link4"
        source="#_5gILoKuXEeComqG0tdmjrg" target="#_5_BuIKuXEeComqG0tdmjrg" instanceOf="http://q-impress.eu/sourcecodedecorator#//ComponentImplementingClassesLink/implementingClasses"/>
    <connections xsi:type="specification:PSLink" id="_xmEpsKuYEeComqG0tdmjrg" name="annotatedElement"
        source="#_2AWSEKuXEeComqG0tdmjrg" target="#_4xC4EKuXEeComqG0tdmjrg" qualifier="component"
        instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="specification:PSLink" id="_xyvMsKuYEeComqG0tdmjrg" name="annotatedElement"
        source="#_2AWSEKuXEeComqG0tdmjrg" target="#_5JnwIKuXEeComqG0tdmjrg" qualifier="link"
        instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="specification:PSLink" id="_yFvBMKuYEeComqG0tdmjrg" name="annotatedElement"
        source="#_2AWSEKuXEeComqG0tdmjrg" target="#_5_BuIKuXEeComqG0tdmjrg" qualifier="classes"
        instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <nodes xsi:type="specification:PSAnnotation" id="_2AWSEKuXEeComqG0tdmjrg" outgoing="#_xmEpsKuYEeComqG0tdmjrg #_xyvMsKuYEeComqG0tdmjrg #_yFvBMKuYEeComqG0tdmjrg"
        type="#_2AVrAKuXEeComqG0tdmjrg"/>
    <nodes xsi:type="specification:PSObject" id="_4xC4EKuXEeComqG0tdmjrg" name="comp"
        incoming="#_siW4MKuYEeComqG0tdmjrg #_xmEpsKuYEeComqG0tdmjrg" instanceOf="http://q-impress.eu/samm/staticstructure#//ComponentType"/>
    <nodes xsi:type="specification:PSObject" id="_5JnwIKuXEeComqG0tdmjrg" name="cLink"
        outgoing="#_siW4MKuYEeComqG0tdmjrg" incoming="#_tD2bsKuYEeComqG0tdmjrg #_xyvMsKuYEeComqG0tdmjrg"
        instanceOf="http://q-impress.eu/sourcecodedecorator#//ComponentImplementingClassesLink"/>
    <nodes xsi:type="specification:PSObject" id="_5gILoKuXEeComqG0tdmjrg" name="someSubComp"
        parents="#_DvzPMKuZEeComqG0tdmjrg" outgoing="#_t53dsKuYEeComqG0tdmjrg" incoming="#_tavRsKuYEeComqG0tdmjrg"
        instanceOf="http://q-impress.eu/sourcecodedecorator#//ComponentImplementingClassesLink"/>
    <nodes xsi:type="specification:PSObject" id="_5_BuIKuXEeComqG0tdmjrg" name="cl"
        parents="#_DvzPMKuZEeComqG0tdmjrg" modifier="SET" incoming="#_t53dsKuYEeComqG0tdmjrg #_yFvBMKuYEeComqG0tdmjrg"
        instanceOf="http://www.fzi.de/gast/types#//GASTClass"/>
    <nodes xsi:type="specification:PSAnnotation" id="_6SGbIKuXEeComqG0tdmjrg" name="cc"
        parents="#_E6zCsKuZEeComqG0tdmjrg" outgoing="#_tD2bsKuYEeComqG0tdmjrg #_tavRsKuYEeComqG0tdmjrg"
        type="#_ZvExoKuTEeComqG0tdmjrg"/>
    <combinedFragments id="_DvzPMKuZEeComqG0tdmjrg" name="frag1" children="#_5gILoKuXEeComqG0tdmjrg #_5_BuIKuXEeComqG0tdmjrg"
        kind="SET"/>
    <combinedFragments id="_E6zCsKuZEeComqG0tdmjrg" name="frag2" children="#_6SGbIKuXEeComqG0tdmjrg"
        kind="SET"/>
  </patternSpecifications>
  <patternSpecifications id="_iF_xkKuZEeComqG0tdmjrg" name="IllegalMethodAccess">
    <connections xsi:type="specification:PSLink" id="_V266sKubEeComqG0tdmjrg" name="link1"
        source="#_pVZ-kKuZEeComqG0tdmjrg" target="#_kiBvIKuZEeComqG0tdmjrg" qualifier="classes"
        instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="specification:PSLink" id="_WIsnMKubEeComqG0tdmjrg" name="link2"
        source="#_kiBvIKuZEeComqG0tdmjrg" target="#_k-dMcKuZEeComqG0tdmjrg" instanceOf="http://www.fzi.de/gast/types#//GASTClass/methods"/>
    <connections xsi:type="specification:PSLink" id="_WecNsKubEeComqG0tdmjrg" name="link3"
        source="#_k-dMcKuZEeComqG0tdmjrg" target="#_lVmhIKuZEeComqG0tdmjrg" instanceOf="http://www.fzi.de/gast/functions#//Function/allStatements"/>
    <connections xsi:type="specification:PSLink" id="_WwhcMKubEeComqG0tdmjrg" name="link4"
        source="#_lVmhIKuZEeComqG0tdmjrg" target="#_lrRPIKuZEeComqG0tdmjrg" instanceOf="http://www.fzi.de/gast/statements#//Statement/accesses"/>
    <connections xsi:type="specification:PSLink" id="_Xe1TsKubEeComqG0tdmjrg" name="link6"
        source="#_lVmhIKuZEeComqG0tdmjrg" target="#_nBuEsKuZEeComqG0tdmjrg" instanceOf="http://www.fzi.de/gast/statements#//Statement/accesses"/>
    <connections xsi:type="specification:PSLink" id="_YQk5sKubEeComqG0tdmjrg" name="link8"
        source="#_lrRPIKuZEeComqG0tdmjrg" target="#_nwLGIKuZEeComqG0tdmjrg" instanceOf="http://www.fzi.de/gast/accesses#//Access/accessedTarget"/>
    <connections xsi:type="specification:PSLink" id="_Yf_OsKubEeComqG0tdmjrg" name="link9"
        source="#_nwLGIKuZEeComqG0tdmjrg" target="#_oK89oKuZEeComqG0tdmjrg" instanceOf="http://www.fzi.de/gast/variables#//Variable/type"/>
    <connections xsi:type="specification:PSLink" id="_Y5PcMKubEeComqG0tdmjrg" name="link10"
        source="#_oc9ToKuZEeComqG0tdmjrg" target="#_oK89oKuZEeComqG0tdmjrg" instanceOf="http://www.fzi.de/gast/accesses#//Access/accessedClass"/>
    <connections xsi:type="specification:PSLink" id="_ZRlDsKubEeComqG0tdmjrg" name="link11"
        source="#_ovzXIKuZEeComqG0tdmjrg" target="#_oc9ToKuZEeComqG0tdmjrg" instanceOf="http://www.fzi.de/gast/types#//GASTClass/inheritanceTypeAccesses"/>
    <connections xsi:type="specification:PSLink" id="_ZwLEMKubEeComqG0tdmjrg" name="link12"
        source="#_ovzXIKuZEeComqG0tdmjrg" target="#_qR6qIKuZEeComqG0tdmjrg" instanceOf="http://www.fzi.de/gast/types#//GASTClass/methods"/>
    <connections xsi:type="specification:PSLink" id="_Z_47MKubEeComqG0tdmjrg" name="link13"
        source="#_qR6qIKuZEeComqG0tdmjrg" target="#_qof-IKuZEeComqG0tdmjrg" instanceOf="http://www.fzi.de/gast/types#//Member/overriddenMember"/>
    <connections xsi:type="specification:PSLink" id="_aWxxMKubEeComqG0tdmjrg" name="link14"
        source="#_mJBiIKuZEeComqG0tdmjrg" target="#_qR6qIKuZEeComqG0tdmjrg" instanceOf="http://www.fzi.de/gast/accesses#//Access/accessedTarget"/>
    <connections xsi:type="specification:PSLink" id="_a7PwMKubEeComqG0tdmjrg" name="link15"
        source="#_k-dMcKuZEeComqG0tdmjrg" target="#_mJBiIKuZEeComqG0tdmjrg" instanceOf="http://www.fzi.de/gast/functions#//Function/accesses"/>
    <connections xsi:type="specification:PSLink" id="_bkEDsKubEeComqG0tdmjrg" name="annotatedElement"
        source="#_iF_xkauZEeComqG0tdmjrg" target="#_ovzXIKuZEeComqG0tdmjrg" qualifier="accessedMethodOwner"
        instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="specification:PSLink" id="_b6MEsKubEeComqG0tdmjrg" name="annotatedElement"
        source="#_iF_xkauZEeComqG0tdmjrg" target="#_kiBvIKuZEeComqG0tdmjrg" qualifier="accessingClass"
        instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="specification:PSLink" id="_cU5DsKubEeComqG0tdmjrg" name="annotatedElement"
        source="#_iF_xkauZEeComqG0tdmjrg" target="#_lVmhIKuZEeComqG0tdmjrg" qualifier="castStmt"
        instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="specification:PSLink" id="_cjT6MKubEeComqG0tdmjrg" name="annotatedElement"
        source="#_iF_xkauZEeComqG0tdmjrg" target="#_mJBiIKuZEeComqG0tdmjrg" qualifier="functionAccess"
        instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="specification:PSLink" id="_c7gXwKubEeComqG0tdmjrg" name="annotatedElement"
        source="#_iF_xkauZEeComqG0tdmjrg" target="#_qR6qIKuZEeComqG0tdmjrg" qualifier="accessedMethod"
        instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="specification:PSLink" id="_dT1YMKubEeComqG0tdmjrg" name="annotatedElement"
        source="#_iF_xkauZEeComqG0tdmjrg" target="#_oK89oKuZEeComqG0tdmjrg" qualifier="implementedInterface"
        instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="specification:PSLink" id="_wAWhsKubEeComqG0tdmjrg" name="link23"
        source="#_nBuEsKuZEeComqG0tdmjrg" target="#_ovzXIKuZEeComqG0tdmjrg" instanceOf="http://www.fzi.de/gast/accesses#//Access/accessedClass"/>
    <connections xsi:type="specification:PSLink" id="_Bqz7QNI-EeCC1PiDUkaN3Q" name="annotatedElement"
        source="#_iF_xkauZEeComqG0tdmjrg" target="#_k-dMcKuZEeComqG0tdmjrg" qualifier="accessingMethod"
        instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <nodes xsi:type="specification:PSAnnotation" id="_iF_xkauZEeComqG0tdmjrg" outgoing="#_bkEDsKubEeComqG0tdmjrg #_b6MEsKubEeComqG0tdmjrg #_cU5DsKubEeComqG0tdmjrg #_cjT6MKubEeComqG0tdmjrg #_c7gXwKubEeComqG0tdmjrg #_dT1YMKubEeComqG0tdmjrg #_Bqz7QNI-EeCC1PiDUkaN3Q"
        type="#_iF_xkKuZEeComqG0tdmjrg"/>
    <nodes xsi:type="specification:PSObject" id="_kiBvIKuZEeComqG0tdmjrg" name="class1"
        outgoing="#_WIsnMKubEeComqG0tdmjrg" incoming="#_V266sKubEeComqG0tdmjrg #_b6MEsKubEeComqG0tdmjrg"
        instanceOf="http://www.fzi.de/gast/types#//GASTClass"/>
    <nodes xsi:type="specification:PSObject" id="_k-dMcKuZEeComqG0tdmjrg" name="method1"
        outgoing="#_WecNsKubEeComqG0tdmjrg #_a7PwMKubEeComqG0tdmjrg" incoming="#_WIsnMKubEeComqG0tdmjrg #_Bqz7QNI-EeCC1PiDUkaN3Q"
        instanceOf="http://www.fzi.de/gast/functions#//Method"/>
    <nodes xsi:type="specification:PSObject" id="_lVmhIKuZEeComqG0tdmjrg" name="castStmt"
        outgoing="#_WwhcMKubEeComqG0tdmjrg #_Xe1TsKubEeComqG0tdmjrg" incoming="#_WecNsKubEeComqG0tdmjrg #_cU5DsKubEeComqG0tdmjrg"
        instanceOf="http://www.fzi.de/gast/statements#//SimpleStatement"/>
    <nodes xsi:type="specification:PSObject" id="_lrRPIKuZEeComqG0tdmjrg" name="varAccess1"
        outgoing="#_YQk5sKubEeComqG0tdmjrg" incoming="#_WwhcMKubEeComqG0tdmjrg" instanceOf="http://www.fzi.de/gast/accesses#//VariableAccess"/>
    <nodes xsi:type="specification:PSObject" id="_mJBiIKuZEeComqG0tdmjrg" name="call"
        outgoing="#_aWxxMKubEeComqG0tdmjrg" incoming="#_a7PwMKubEeComqG0tdmjrg #_cjT6MKubEeComqG0tdmjrg"
        instanceOf="http://www.fzi.de/gast/accesses#//FunctionAccess"/>
    <nodes xsi:type="specification:PSObject" id="_nBuEsKuZEeComqG0tdmjrg" name="cast"
        outgoing="#_wAWhsKubEeComqG0tdmjrg" incoming="#_Xe1TsKubEeComqG0tdmjrg" instanceOf="http://www.fzi.de/gast/accesses#//CastTypeAccess"/>
    <nodes xsi:type="specification:PSObject" id="_nwLGIKuZEeComqG0tdmjrg" name="var1"
        outgoing="#_Yf_OsKubEeComqG0tdmjrg" incoming="#_YQk5sKubEeComqG0tdmjrg" instanceOf="http://www.fzi.de/gast/variables#//Variable"/>
    <nodes xsi:type="specification:PSObject" id="_oK89oKuZEeComqG0tdmjrg" name="interface"
        incoming="#_Yf_OsKubEeComqG0tdmjrg #_Y5PcMKubEeComqG0tdmjrg #_dT1YMKubEeComqG0tdmjrg"
        instanceOf="http://www.fzi.de/gast/types#//GASTClass">
      <nodeConstraints xsi:type="specification:PSAttributeConstraint" id="_K5rKAKubEeComqG0tdmjrg"
          valueExpression="true" operator="EQUAL" attribute="http://www.fzi.de/gast/types#//GASTClass/interface"/>
    </nodes>
    <nodes xsi:type="specification:PSObject" id="_oc9ToKuZEeComqG0tdmjrg" name="implements"
        outgoing="#_Y5PcMKubEeComqG0tdmjrg" incoming="#_ZRlDsKubEeComqG0tdmjrg" instanceOf="http://www.fzi.de/gast/accesses#//InheritanceTypeAccess"/>
    <nodes xsi:type="specification:PSObject" id="_ovzXIKuZEeComqG0tdmjrg" name="class2"
        outgoing="#_ZRlDsKubEeComqG0tdmjrg #_ZwLEMKubEeComqG0tdmjrg" incoming="#_bkEDsKubEeComqG0tdmjrg #_wAWhsKubEeComqG0tdmjrg"
        instanceOf="http://www.fzi.de/gast/types#//GASTClass">
      <nodeConstraints xsi:type="specification:PSAttributeConstraint" id="_elIdcKuaEeComqG0tdmjrg"
          valueExpression="false" operator="EQUAL" attribute="http://www.fzi.de/gast/types#//GASTClass/interface"/>
      <nodeConstraints xsi:type="specification:PSAttributeConstraint" id="_e5u0cKuaEeComqG0tdmjrg"
          valueExpression="NORMAL" operator="EQUAL" attribute="http://www.fzi.de/gast/core#//ModelElement/status"/>
      <nodeConstraints xsi:type="specification:PSAttributeConstraint" id="_fJcEYKuaEeComqG0tdmjrg"
          valueExpression="[^(java)].*" operator="REGULAR_EXPRESSION" attribute="http://www.fzi.de/gast/types#//GASTType/qualifiedName"/>
    </nodes>
    <nodes xsi:type="specification:PSAnnotation" id="_pVZ-kKuZEeComqG0tdmjrg" name="compAnno"
        outgoing="#_V266sKubEeComqG0tdmjrg" type="#_Y6RigKuREeComqG0tdmjrg"/>
    <nodes xsi:type="specification:PSObject" id="_qR6qIKuZEeComqG0tdmjrg" name="method2"
        outgoing="#_Z_47MKubEeComqG0tdmjrg" incoming="#_ZwLEMKubEeComqG0tdmjrg #_aWxxMKubEeComqG0tdmjrg #_c7gXwKubEeComqG0tdmjrg"
        instanceOf="http://www.fzi.de/gast/functions#//Method"/>
    <nodes xsi:type="specification:PSObject" id="_qof-IKuZEeComqG0tdmjrg" name="decl"
        modifier="NEGATIVE" incoming="#_Z_47MKubEeComqG0tdmjrg" instanceOf="http://www.fzi.de/gast/functions#//Method"/>
  </patternSpecifications>
  <patternSpecifications id="_vt3OEKucEeComqG0tdmjrg" name="InheritanceBetweenComponents">
    <connections xsi:type="specification:PSLink" id="_FufzsKudEeComqG0tdmjrg" name="annotatedElement"
        source="#_vt3OEaucEeComqG0tdmjrg" target="#_12jqoKucEeComqG0tdmjrg" qualifier="subClass"
        instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="specification:PSLink" id="_F_grMKudEeComqG0tdmjrg" name="annotatedElement"
        source="#_vt3OEaucEeComqG0tdmjrg" target="#_2nxFIKucEeComqG0tdmjrg" qualifier="superClass"
        instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="specification:PSLink" id="_GWoKsKudEeComqG0tdmjrg" name="link3"
        source="#_2NmRoKucEeComqG0tdmjrg" target="#_12jqoKucEeComqG0tdmjrg" qualifier="classes"
        instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="specification:PSLink" id="_GpFzsKudEeComqG0tdmjrg" name="link4"
        source="#_12jqoKucEeComqG0tdmjrg" target="#_2nxFIKucEeComqG0tdmjrg" instanceOf="http://www.fzi.de/gast/types#//GASTClass/superTypes"/>
    <connections xsi:type="specification:PSLink" id="_G0nuQKudEeComqG0tdmjrg" name="link5"
        source="#_2NmRoKucEeComqG0tdmjrg" target="#_2nxFIKucEeComqG0tdmjrg" qualifier="classes"
        negative="true" instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="specification:PSLink" id="_HQ1wMKudEeComqG0tdmjrg" name="link6"
        source="#_3VBMsKucEeComqG0tdmjrg" target="#_2nxFIKucEeComqG0tdmjrg" qualifier=""
        instanceOf="http://q-impress.eu/sourcecodedecorator#//InterfaceSourceCodeLink/gastClass"/>
    <connections xsi:type="specification:PSLink" id="_HffQMKudEeComqG0tdmjrg" name="link7"
        source="#_2_MGoKucEeComqG0tdmjrg" target="#_3VBMsKucEeComqG0tdmjrg" instanceOf="http://q-impress.eu/sourcecodedecorator#//ComponentImplementingClassesLink/providedInterfaces"/>
    <connections xsi:type="specification:PSLink" id="_HxlFwKudEeComqG0tdmjrg" name="link8"
        source="#_2NmRoKucEeComqG0tdmjrg" target="#_2_MGoKucEeComqG0tdmjrg" qualifier="link"
        instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <nodes xsi:type="specification:PSAnnotation" id="_vt3OEaucEeComqG0tdmjrg" outgoing="#_FufzsKudEeComqG0tdmjrg #_F_grMKudEeComqG0tdmjrg"
        type="#_vt3OEKucEeComqG0tdmjrg"/>
    <nodes xsi:type="specification:PSObject" id="_12jqoKucEeComqG0tdmjrg" name="subClass"
        outgoing="#_GpFzsKudEeComqG0tdmjrg" incoming="#_FufzsKudEeComqG0tdmjrg #_GWoKsKudEeComqG0tdmjrg"
        instanceOf="http://www.fzi.de/gast/types#//GASTClass"/>
    <nodes xsi:type="specification:PSAnnotation" id="_2NmRoKucEeComqG0tdmjrg" name="comp"
        outgoing="#_GWoKsKudEeComqG0tdmjrg #_G0nuQKudEeComqG0tdmjrg #_HxlFwKudEeComqG0tdmjrg"
        type="#_Y6RigKuREeComqG0tdmjrg"/>
    <nodes xsi:type="specification:PSObject" id="_2nxFIKucEeComqG0tdmjrg" name="superClass"
        incoming="#_F_grMKudEeComqG0tdmjrg #_GpFzsKudEeComqG0tdmjrg #_G0nuQKudEeComqG0tdmjrg #_HQ1wMKudEeComqG0tdmjrg"
        instanceOf="http://www.fzi.de/gast/types#//GASTClass">
      <nodeConstraints xsi:type="specification:PSAttributeConstraint" id="_h45z8KudEeComqG0tdmjrg"
          valueExpression="NORMAL" operator="EQUAL" attribute="http://www.fzi.de/gast/core#//ModelElement/status"/>
      <nodeConstraints xsi:type="specification:PSAttributeConstraint" id="__ihc0KugEeComqG0tdmjrg"
          valueExpression="false" operator="EQUAL" attribute="http://www.fzi.de/gast/types#//GASTClass/interface"/>
    </nodes>
    <nodes xsi:type="specification:PSObject" id="_2_MGoKucEeComqG0tdmjrg" name="c2cLink"
        parents="#_RR9ckKutEeCjGePqNfOZ-A" outgoing="#_HffQMKudEeComqG0tdmjrg" incoming="#_HxlFwKudEeComqG0tdmjrg"
        instanceOf="http://q-impress.eu/sourcecodedecorator#//ComponentImplementingClassesLink"/>
    <nodes xsi:type="specification:PSObject" id="_3VBMsKucEeComqG0tdmjrg" name="providedInterface"
        parents="#_RR9ckKutEeCjGePqNfOZ-A" outgoing="#_HQ1wMKudEeComqG0tdmjrg" incoming="#_HffQMKudEeComqG0tdmjrg"
        instanceOf="http://q-impress.eu/sourcecodedecorator#//InterfaceSourceCodeLink"/>
    <combinedFragments id="_RR9ckKutEeCjGePqNfOZ-A" name="frag1" children="#_2_MGoKucEeComqG0tdmjrg #_3VBMsKucEeComqG0tdmjrg"
        kind="NEGATIVE"/>
  </patternSpecifications>
  <patternSpecifications id="_6trVIKudEeComqG0tdmjrg" name="NonTOCommunication">
    <connections xsi:type="specification:PSLink" id="_l2ToMKueEeComqG0tdmjrg" name="annotatedElement"
        source="#_6trVIaudEeComqG0tdmjrg" target="#_-14goKudEeComqG0tdmjrg" qualifier="callingClass"
        instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="specification:PSLink" id="_mHUfsKueEeComqG0tdmjrg" name="annotatedElement"
        source="#_6trVIaudEeComqG0tdmjrg" target="#__pJwoKudEeComqG0tdmjrg" qualifier="calledMethod"
        instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="specification:PSLink" id="_mccbIKueEeComqG0tdmjrg" name="annotatedElement"
        source="#_6trVIaudEeComqG0tdmjrg" target="#_BFAqoKueEeComqG0tdmjrg" qualifier="nonTO"
        instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="specification:PSLink" id="_msoMMKueEeComqG0tdmjrg" name="link4"
        source="#_A1rOIKueEeComqG0tdmjrg" target="#_BFAqoKueEeComqG0tdmjrg" instanceOf="http://www.fzi.de/gast/variables#//Variable/type"/>
    <connections xsi:type="specification:PSLink" id="_m8plMKueEeComqG0tdmjrg" name="link5"
        source="#__pJwoKudEeComqG0tdmjrg" target="#_A1rOIKueEeComqG0tdmjrg" instanceOf="http://www.fzi.de/gast/functions#//Function/formalParameters"/>
    <connections xsi:type="specification:PSLink" id="_nSocQKueEeComqG0tdmjrg" name="link6"
        source="#_AFOBkKueEeComqG0tdmjrg" target="#__pJwoKudEeComqG0tdmjrg" instanceOf="http://www.fzi.de/gast/types#//GASTClass/methods"/>
    <connections xsi:type="specification:PSLink" id="_n3CJ0KueEeComqG0tdmjrg" name="link7"
        source="#__WdeIKudEeComqG0tdmjrg" target="#__pJwoKudEeComqG0tdmjrg" instanceOf="http://www.fzi.de/gast/accesses#//Access/accessedTarget"/>
    <connections xsi:type="specification:PSLink" id="_oKn0MKueEeComqG0tdmjrg" name="link8"
        source="#_-14goKudEeComqG0tdmjrg" target="#__WdeIKudEeComqG0tdmjrg" instanceOf="http://www.fzi.de/gast/types#//GASTClass/allAccesses"/>
    <connections xsi:type="specification:PSLink" id="_oeE7sKueEeComqG0tdmjrg" name="link9"
        source="#_-akdoKudEeComqG0tdmjrg" target="#_-14goKudEeComqG0tdmjrg" qualifier="classes"
        instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="specification:PSLink" id="_0A6FsKueEeComqG0tdmjrg" name="link10"
        source="#_AbqysKueEeComqG0tdmjrg" target="#_AFOBkKueEeComqG0tdmjrg" qualifier="classes"
        instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="specification:PSLink" id="_h8-4ALIGEeCSBYRzhxdPIQ" name="annotatedElement"
        source="#_6trVIaudEeComqG0tdmjrg" target="#_AFOBkKueEeComqG0tdmjrg" qualifier="calledClass"
        instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="specification:PSLink" id="_fS5HENU2EeCOSvCxQ0HiYA" name="annotatedElement"
        source="#_6trVIaudEeComqG0tdmjrg" target="#__WdeIKudEeComqG0tdmjrg" qualifier="functionAccess"
        instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <nodes xsi:type="specification:PSAnnotation" id="_6trVIaudEeComqG0tdmjrg" outgoing="#_l2ToMKueEeComqG0tdmjrg #_mHUfsKueEeComqG0tdmjrg #_mccbIKueEeComqG0tdmjrg #_h8-4ALIGEeCSBYRzhxdPIQ #_fS5HENU2EeCOSvCxQ0HiYA"
        type="#_6trVIKudEeComqG0tdmjrg"/>
    <nodes xsi:type="specification:PSAnnotation" id="_-akdoKudEeComqG0tdmjrg" name="comp"
        outgoing="#_oeE7sKueEeComqG0tdmjrg" type="#_Y6RigKuREeComqG0tdmjrg"/>
    <nodes xsi:type="specification:PSObject" id="_-14goKudEeComqG0tdmjrg" name="callingClass"
        outgoing="#_oKn0MKueEeComqG0tdmjrg" incoming="#_l2ToMKueEeComqG0tdmjrg #_oeE7sKueEeComqG0tdmjrg"
        instanceOf="http://www.fzi.de/gast/types#//GASTClass"/>
    <nodes xsi:type="specification:PSObject" id="__WdeIKudEeComqG0tdmjrg" name="call"
        outgoing="#_n3CJ0KueEeComqG0tdmjrg" incoming="#_oKn0MKueEeComqG0tdmjrg #_fS5HENU2EeCOSvCxQ0HiYA"
        instanceOf="http://www.fzi.de/gast/accesses#//FunctionAccess"/>
    <nodes xsi:type="specification:PSObject" id="__pJwoKudEeComqG0tdmjrg" name="calledMethod"
        outgoing="#_m8plMKueEeComqG0tdmjrg" incoming="#_mHUfsKueEeComqG0tdmjrg #_nSocQKueEeComqG0tdmjrg #_n3CJ0KueEeComqG0tdmjrg"
        instanceOf="http://www.fzi.de/gast/functions#//Method"/>
    <nodes xsi:type="specification:PSObject" id="_AFOBkKueEeComqG0tdmjrg" name="mOwner"
        outgoing="#_nSocQKueEeComqG0tdmjrg" incoming="#_0A6FsKueEeComqG0tdmjrg #_h8-4ALIGEeCSBYRzhxdPIQ"
        instanceOf="http://www.fzi.de/gast/types#//GASTClass"/>
    <nodes xsi:type="specification:PSAnnotation" id="_AbqysKueEeComqG0tdmjrg" name="comp2"
        outgoing="#_0A6FsKueEeComqG0tdmjrg" type="#_Y6RigKuREeComqG0tdmjrg"/>
    <nodes xsi:type="specification:PSObject" id="_A1rOIKueEeComqG0tdmjrg" name="parameter"
        outgoing="#_msoMMKueEeComqG0tdmjrg" incoming="#_m8plMKueEeComqG0tdmjrg" instanceOf="http://www.fzi.de/gast/variables#//FormalParameter"/>
    <nodes xsi:type="specification:PSObject" id="_BFAqoKueEeComqG0tdmjrg" name="paramType"
        incoming="#_mccbIKueEeComqG0tdmjrg #_msoMMKueEeComqG0tdmjrg" instanceOf="http://www.fzi.de/gast/types#//GASTClass">
      <nodeConstraints xsi:type="specification:PSAttributeConstraint" id="_ZhdycKueEeComqG0tdmjrg"
          valueExpression="NORMAL" operator="EQUAL" attribute="http://www.fzi.de/gast/core#//ModelElement/status"/>
      <nodeConstraints xsi:type="specification:PSAttributeConstraint" id="_Z9r0YKueEeComqG0tdmjrg"
          valueExpression=".*[^(TO)]" operator="REGULAR_EXPRESSION" attribute="http://www.fzi.de/gast/core#//NamedModelElement/simpleName"/>
      <nodeConstraints xsi:type="specification:PSAttributeConstraint" id="_aU-TAKueEeComqG0tdmjrg"
          valueExpression="false" operator="EQUAL" attribute="http://www.fzi.de/gast/types#//GASTClass/primitive"/>
    </nodes>
  </patternSpecifications>
  <patternSpecifications id="_MzfOgKufEeComqG0tdmjrg" name="UndercoverTransferObject">
    <connections xsi:type="specification:PSLink" id="_u-QOsKufEeComqG0tdmjrg" name="annotatedElement"
        source="#_MzfOgaufEeComqG0tdmjrg" target="#_On7noKufEeComqG0tdmjrg" qualifier="undercoverTO"
        instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="specification:PSLink" id="_vZfZMKufEeComqG0tdmjrg" name="link2"
        source="#_PGmgoKufEeComqG0tdmjrg" target="#_On7noKufEeComqG0tdmjrg" qualifier="classes"
        instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="specification:PSLink" id="_vuPhMKufEeComqG0tdmjrg" name="link3"
        source="#_On7noKufEeComqG0tdmjrg" target="#_P-cuoKufEeComqG0tdmjrg" instanceOf="http://www.fzi.de/gast/types#//GASTClass/fields"/>
    <connections xsi:type="specification:PSLink" id="_wM2IwKufEeComqG0tdmjrg" name="link4"
        source="#_On7noKufEeComqG0tdmjrg" target="#_Psv6oKufEeComqG0tdmjrg" instanceOf="http://www.fzi.de/gast/types#//GASTClass/methods"/>
    <connections xsi:type="specification:PSLink" id="_w2RgQKufEeComqG0tdmjrg" name="link5"
        source="#_On7noKufEeComqG0tdmjrg" target="#_QSvjoKufEeComqG0tdmjrg" instanceOf="http://www.fzi.de/gast/types#//GASTClass/methods"/>
    <connections xsi:type="specification:PSLink" id="_xOrZMKufEeComqG0tdmjrg" name="link6"
        source="#_QSvjoKufEeComqG0tdmjrg" target="#_RXovIKufEeComqG0tdmjrg" instanceOf="http://www.fzi.de/gast/functions#//Function/returnTypeDeclaration"/>
    <connections xsi:type="specification:PSLink" id="_xf66MKufEeComqG0tdmjrg" name="link7"
        source="#_RXovIKufEeComqG0tdmjrg" target="#_Q8fEMKufEeComqG0tdmjrg" instanceOf="http://www.fzi.de/gast/accesses#//TypeAccess/targetType"/>
    <connections xsi:type="specification:PSLink" id="_yHScMKufEeComqG0tdmjrg" name="link8"
        source="#_P-cuoKufEeComqG0tdmjrg" target="#_Q8fEMKufEeComqG0tdmjrg" instanceOf="http://www.fzi.de/gast/variables#//Variable/type"/>
    <connections xsi:type="specification:PSLink" id="_ygdxMKufEeComqG0tdmjrg" name="link9"
        source="#_QoB3IKufEeComqG0tdmjrg" target="#_P-cuoKufEeComqG0tdmjrg" instanceOf="http://www.fzi.de/gast/accesses#//Access/accessedTarget"/>
    <connections xsi:type="specification:PSLink" id="_yzKqwKufEeComqG0tdmjrg" name="link10"
        source="#_Psv6oKufEeComqG0tdmjrg" target="#_QoB3IKufEeComqG0tdmjrg" instanceOf="http://www.fzi.de/gast/functions#//Function/accesses"/>
    <nodes xsi:type="specification:PSAnnotation" id="_MzfOgaufEeComqG0tdmjrg" outgoing="#_u-QOsKufEeComqG0tdmjrg"
        type="#_MzfOgKufEeComqG0tdmjrg"/>
    <nodes xsi:type="specification:PSObject" id="_On7noKufEeComqG0tdmjrg" name="ucTO"
        outgoing="#_vuPhMKufEeComqG0tdmjrg #_wM2IwKufEeComqG0tdmjrg #_w2RgQKufEeComqG0tdmjrg"
        incoming="#_u-QOsKufEeComqG0tdmjrg #_vZfZMKufEeComqG0tdmjrg" instanceOf="http://www.fzi.de/gast/types#//GASTClass"/>
    <nodes xsi:type="specification:PSAnnotation" id="_PGmgoKufEeComqG0tdmjrg" name="comp"
        outgoing="#_vZfZMKufEeComqG0tdmjrg" type="#_Y6RigKuREeComqG0tdmjrg"/>
    <nodes xsi:type="specification:PSObject" id="_Psv6oKufEeComqG0tdmjrg" name="setter"
        parents="#_zCzCMKufEeComqG0tdmjrg" outgoing="#_yzKqwKufEeComqG0tdmjrg" incoming="#_wM2IwKufEeComqG0tdmjrg"
        instanceOf="http://www.fzi.de/gast/functions#//Method">
      <nodeConstraints xsi:type="specification:PSAttributeConstraint" id="_DWFqgKugEeComqG0tdmjrg"
          valueExpression="set.*" operator="REGULAR_EXPRESSION" attribute="http://www.fzi.de/gast/core#//NamedModelElement/simpleName"/>
    </nodes>
    <nodes xsi:type="specification:PSObject" id="_P-cuoKufEeComqG0tdmjrg" name="attr"
        parents="#_zCzCMKufEeComqG0tdmjrg" outgoing="#_yHScMKufEeComqG0tdmjrg" incoming="#_vuPhMKufEeComqG0tdmjrg #_ygdxMKufEeComqG0tdmjrg"
        instanceOf="http://www.fzi.de/gast/variables#//Field"/>
    <nodes xsi:type="specification:PSObject" id="_QSvjoKufEeComqG0tdmjrg" name="getter"
        parents="#_zCzCMKufEeComqG0tdmjrg" outgoing="#_xOrZMKufEeComqG0tdmjrg" incoming="#_w2RgQKufEeComqG0tdmjrg"
        instanceOf="http://www.fzi.de/gast/functions#//Method">
      <nodeConstraints xsi:type="specification:PSAttributeConstraint" id="_HHFP4KugEeComqG0tdmjrg"
          valueExpression="get.*" operator="REGULAR_EXPRESSION" attribute="http://www.fzi.de/gast/core#//NamedModelElement/simpleName"/>
    </nodes>
    <nodes xsi:type="specification:PSObject" id="_QoB3IKufEeComqG0tdmjrg" name="writeAccess"
        parents="#_zCzCMKufEeComqG0tdmjrg" outgoing="#_ygdxMKufEeComqG0tdmjrg" incoming="#_yzKqwKufEeComqG0tdmjrg"
        instanceOf="http://www.fzi.de/gast/accesses#//VariableAccess">
      <nodeConstraints xsi:type="specification:PSAttributeConstraint" id="_RZM_8KugEeComqG0tdmjrg"
          valueExpression="true" operator="EQUAL" attribute="http://www.fzi.de/gast/accesses#//VariableAccess/write"/>
    </nodes>
    <nodes xsi:type="specification:PSObject" id="_Q8fEMKufEeComqG0tdmjrg" name="returnType"
        parents="#_zCzCMKufEeComqG0tdmjrg" incoming="#_xf66MKufEeComqG0tdmjrg #_yHScMKufEeComqG0tdmjrg"
        instanceOf="http://www.fzi.de/gast/types#//GASTClass">
      <nodeConstraints xsi:type="specification:PSAttributeConstraint" id="_NU5dAKugEeComqG0tdmjrg"
          valueExpression="true" operator="EQUAL" attribute="http://www.fzi.de/gast/types#//GASTClass/primitive"/>
    </nodes>
    <nodes xsi:type="specification:PSObject" id="_RXovIKufEeComqG0tdmjrg" name="returnAccess"
        parents="#_zCzCMKufEeComqG0tdmjrg" outgoing="#_xf66MKufEeComqG0tdmjrg" incoming="#_xOrZMKufEeComqG0tdmjrg"
        instanceOf="http://www.fzi.de/gast/accesses#//DeclarationTypeAccess"/>
    <combinedFragments id="_zCzCMKufEeComqG0tdmjrg" name="frag1" children="#_Psv6oKufEeComqG0tdmjrg #_P-cuoKufEeComqG0tdmjrg #_QSvjoKufEeComqG0tdmjrg #_QoB3IKufEeComqG0tdmjrg #_Q8fEMKufEeComqG0tdmjrg #_RXovIKufEeComqG0tdmjrg"
        kind="SET"/>
  </patternSpecifications>
  <patternSpecifications id="_UC_qYK0ZEeCRsqPI-sgkpQ" name="IllegalVariableAccess">
    <connections xsi:type="specification:PSLink" id="_1SYAYK0ZEeCRsqPI-sgkpQ" name="link1"
        source="#_lzeCYK0ZEeCRsqPI-sgkpQ" target="#_ZvViIK0ZEeCRsqPI-sgkpQ" qualifier="component"
        instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="specification:PSLink" id="_2z0lAK0ZEeCRsqPI-sgkpQ" name="link2"
        source="#_lzeCYK0ZEeCRsqPI-sgkpQ" target="#_Xv_gkK0ZEeCRsqPI-sgkpQ" qualifier="classes"
        instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="specification:PSLink" id="_3CG4oK0ZEeCRsqPI-sgkpQ" name="link3"
        source="#_lzeCYK0ZEeCRsqPI-sgkpQ" target="#_YFQl8K0ZEeCRsqPI-sgkpQ" qualifier="classes"
        instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="specification:PSLink" id="_3ZA8wK0ZEeCRsqPI-sgkpQ" name="link4"
        source="#_Xv_gkK0ZEeCRsqPI-sgkpQ" target="#_YdEB8K0ZEeCRsqPI-sgkpQ" instanceOf="http://www.fzi.de/gast/types#//GASTClass/methods"/>
    <connections xsi:type="specification:PSLink" id="_3ucaMK0ZEeCRsqPI-sgkpQ" name="link5"
        source="#_YdEB8K0ZEeCRsqPI-sgkpQ" target="#_YuB2IK0ZEeCRsqPI-sgkpQ" instanceOf="http://www.fzi.de/gast/functions#//Function/accesses"/>
    <connections xsi:type="specification:PSLink" id="_3__dMK0ZEeCRsqPI-sgkpQ" name="link6"
        source="#_YuB2IK0ZEeCRsqPI-sgkpQ" target="#_Y-_DQK0ZEeCRsqPI-sgkpQ" instanceOf="http://www.fzi.de/gast/accesses#//Access/accessedTarget"/>
    <connections xsi:type="specification:PSLink" id="_4d5hMK0ZEeCRsqPI-sgkpQ" name="link7"
        source="#_YFQl8K0ZEeCRsqPI-sgkpQ" target="#_Y-_DQK0ZEeCRsqPI-sgkpQ" instanceOf="http://www.fzi.de/gast/types#//Member/overriddenMember"/>
    <connections xsi:type="specification:PSLink" id="_5BTwQK0ZEeCRsqPI-sgkpQ" name="annotatedElement"
        source="#_UDlgQK0ZEeCRsqPI-sgkpQ" target="#_Xv_gkK0ZEeCRsqPI-sgkpQ" qualifier="accessingClass"
        instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="specification:PSLink" id="_5P4-0K0ZEeCRsqPI-sgkpQ" name="annotatedElement"
        source="#_UDlgQK0ZEeCRsqPI-sgkpQ" target="#_YdEB8K0ZEeCRsqPI-sgkpQ" qualifier="accessingMethod"
        instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="specification:PSLink" id="_5dumgK0ZEeCRsqPI-sgkpQ" name="annotatedElement"
        source="#_UDlgQK0ZEeCRsqPI-sgkpQ" target="#_Y-_DQK0ZEeCRsqPI-sgkpQ" qualifier="accessingField"
        instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="specification:PSLink" id="_5qhFUK0ZEeCRsqPI-sgkpQ" name="annotatedElement"
        source="#_UDlgQK0ZEeCRsqPI-sgkpQ" target="#_YFQl8K0ZEeCRsqPI-sgkpQ" qualifier="fieldOwner"
        instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <nodes xsi:type="specification:PSAnnotation" id="_UDlgQK0ZEeCRsqPI-sgkpQ" outgoing="#_5BTwQK0ZEeCRsqPI-sgkpQ #_5P4-0K0ZEeCRsqPI-sgkpQ #_5dumgK0ZEeCRsqPI-sgkpQ #_5qhFUK0ZEeCRsqPI-sgkpQ"
        type="#_UC_qYK0ZEeCRsqPI-sgkpQ"/>
    <nodes xsi:type="specification:PSObject" id="_Xv_gkK0ZEeCRsqPI-sgkpQ" name="class1"
        outgoing="#_3ZA8wK0ZEeCRsqPI-sgkpQ" incoming="#_2z0lAK0ZEeCRsqPI-sgkpQ #_5BTwQK0ZEeCRsqPI-sgkpQ"
        instanceOf="http://www.fzi.de/gast/types#//GASTClass"/>
    <nodes xsi:type="specification:PSObject" id="_YFQl8K0ZEeCRsqPI-sgkpQ" name="class2"
        outgoing="#_4d5hMK0ZEeCRsqPI-sgkpQ" incoming="#_3CG4oK0ZEeCRsqPI-sgkpQ #_5qhFUK0ZEeCRsqPI-sgkpQ"
        instanceOf="http://www.fzi.de/gast/types#//GASTClass">
      <nodeConstraints xsi:type="specification:PSAttributeConstraint" id="_pZ6SsK0bEeCRsqPI-sgkpQ"
          valueExpression="false" operator="EQUAL" attribute="http://www.fzi.de/gast/types#//Member/final"/>
    </nodes>
    <nodes xsi:type="specification:PSObject" id="_YdEB8K0ZEeCRsqPI-sgkpQ" name="method1"
        outgoing="#_3ucaMK0ZEeCRsqPI-sgkpQ" incoming="#_3ZA8wK0ZEeCRsqPI-sgkpQ #_5P4-0K0ZEeCRsqPI-sgkpQ"
        instanceOf="http://www.fzi.de/gast/functions#//Method"/>
    <nodes xsi:type="specification:PSObject" id="_YuB2IK0ZEeCRsqPI-sgkpQ" name="fAccess"
        outgoing="#_3__dMK0ZEeCRsqPI-sgkpQ" incoming="#_3ucaMK0ZEeCRsqPI-sgkpQ" instanceOf="http://www.fzi.de/gast/accesses#//VariableAccess"/>
    <nodes xsi:type="specification:PSObject" id="_Y-_DQK0ZEeCRsqPI-sgkpQ" name="aField"
        incoming="#_3__dMK0ZEeCRsqPI-sgkpQ #_4d5hMK0ZEeCRsqPI-sgkpQ #_5dumgK0ZEeCRsqPI-sgkpQ"
        instanceOf="http://www.fzi.de/gast/variables#//Field"/>
    <nodes xsi:type="specification:PSObject" id="_ZvViIK0ZEeCRsqPI-sgkpQ" name="compType"
        incoming="#_1SYAYK0ZEeCRsqPI-sgkpQ" instanceOf="http://q-impress.eu/samm/staticstructure#//PrimitiveComponent"/>
    <nodes xsi:type="specification:PSAnnotation" id="_lzeCYK0ZEeCRsqPI-sgkpQ" name="compAnno"
        outgoing="#_1SYAYK0ZEeCRsqPI-sgkpQ #_2z0lAK0ZEeCRsqPI-sgkpQ #_3CG4oK0ZEeCRsqPI-sgkpQ"
        type="#_Y6RigKuREeComqG0tdmjrg"/>
  </patternSpecifications>
  <patternSpecifications id="__9IdcK0aEeCRsqPI-sgkpQ" name="IllegalVariableAccessBetweenComponents">
    <connections xsi:type="specification:PSLink" id="_TnAnEK0bEeCRsqPI-sgkpQ" name="link1"
        source="#_B-ROwK0bEeCRsqPI-sgkpQ" target="#_EQ9DEK0bEeCRsqPI-sgkpQ" qualifier="classes"
        negative="true" instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="specification:PSLink" id="_T14wkK0bEeCRsqPI-sgkpQ" name="link2"
        source="#_B-ROwK0bEeCRsqPI-sgkpQ" target="#_Em-WYK0bEeCRsqPI-sgkpQ" qualifier="classes"
        instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="specification:PSLink" id="_UC-xYK0bEeCRsqPI-sgkpQ" name="link3"
        source="#_CNldIK0bEeCRsqPI-sgkpQ" target="#_EQ9DEK0bEeCRsqPI-sgkpQ" qualifier="classes"
        instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="specification:PSLink" id="_UO4fYK0bEeCRsqPI-sgkpQ" name="link4"
        source="#_CNldIK0bEeCRsqPI-sgkpQ" target="#_Em-WYK0bEeCRsqPI-sgkpQ" qualifier="classes"
        negative="true" instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="specification:PSLink" id="_UfsikK0bEeCRsqPI-sgkpQ" name="link5"
        source="#_EQ9DEK0bEeCRsqPI-sgkpQ" target="#_Em-WYK0bEeCRsqPI-sgkpQ" negative="true"
        instanceOf="http://www.fzi.de/gast/types#//GASTClass/superTypes"/>
    <connections xsi:type="specification:PSLink" id="_YxSTkK0bEeCRsqPI-sgkpQ" name="link6"
        source="#_EQ9DEK0bEeCRsqPI-sgkpQ" target="#_E53dMK0bEeCRsqPI-sgkpQ" instanceOf="http://www.fzi.de/gast/types#//GASTClass/methods"/>
    <connections xsi:type="specification:PSLink" id="_Y8JfwK0bEeCRsqPI-sgkpQ" name="link7"
        source="#_E53dMK0bEeCRsqPI-sgkpQ" target="#_FPS6oK0bEeCRsqPI-sgkpQ" instanceOf="http://www.fzi.de/gast/functions#//Function/accesses"/>
    <connections xsi:type="specification:PSLink" id="_ZJ1WcK0bEeCRsqPI-sgkpQ" name="link8"
        source="#_FPS6oK0bEeCRsqPI-sgkpQ" target="#_Fg_uoK0bEeCRsqPI-sgkpQ" instanceOf="http://www.fzi.de/gast/accesses#//Access/accessedTarget"/>
    <connections xsi:type="specification:PSLink" id="_ZXEhMK0bEeCRsqPI-sgkpQ" name="link9"
        source="#_Em-WYK0bEeCRsqPI-sgkpQ" target="#_Fg_uoK0bEeCRsqPI-sgkpQ" instanceOf="http://www.fzi.de/gast/types#//GASTClass/fields"/>
    <connections xsi:type="specification:PSLink" id="_ZrAw4K0bEeCRsqPI-sgkpQ" name="annotatedElement"
        source="#__9Idca0aEeCRsqPI-sgkpQ" target="#_EQ9DEK0bEeCRsqPI-sgkpQ" qualifier="accessingClass"
        instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="specification:PSLink" id="_Z3gUwK0bEeCRsqPI-sgkpQ" name="annotatedElement"
        source="#__9Idca0aEeCRsqPI-sgkpQ" target="#_E53dMK0bEeCRsqPI-sgkpQ" qualifier="accessingMethod"
        instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="specification:PSLink" id="_aFo3YK0bEeCRsqPI-sgkpQ" name="annotatedElement"
        source="#__9Idca0aEeCRsqPI-sgkpQ" target="#_Fg_uoK0bEeCRsqPI-sgkpQ" qualifier="accessedField"
        instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="specification:PSLink" id="_aSb9QK0bEeCRsqPI-sgkpQ" name="annotatedElement"
        source="#__9Idca0aEeCRsqPI-sgkpQ" target="#_Em-WYK0bEeCRsqPI-sgkpQ" qualifier="fieldOwner"
        instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <nodes xsi:type="specification:PSAnnotation" id="__9Idca0aEeCRsqPI-sgkpQ" outgoing="#_ZrAw4K0bEeCRsqPI-sgkpQ #_Z3gUwK0bEeCRsqPI-sgkpQ #_aFo3YK0bEeCRsqPI-sgkpQ #_aSb9QK0bEeCRsqPI-sgkpQ"
        type="#__9IdcK0aEeCRsqPI-sgkpQ"/>
    <nodes xsi:type="specification:PSAnnotation" id="_B-ROwK0bEeCRsqPI-sgkpQ" name="comp2"
        outgoing="#_TnAnEK0bEeCRsqPI-sgkpQ #_T14wkK0bEeCRsqPI-sgkpQ" type="#_Y6RigKuREeComqG0tdmjrg"/>
    <nodes xsi:type="specification:PSAnnotation" id="_CNldIK0bEeCRsqPI-sgkpQ" name="comp1"
        outgoing="#_UC-xYK0bEeCRsqPI-sgkpQ #_UO4fYK0bEeCRsqPI-sgkpQ" type="#_Y6RigKuREeComqG0tdmjrg"/>
    <nodes xsi:type="specification:PSObject" id="_EQ9DEK0bEeCRsqPI-sgkpQ" name="class1"
        outgoing="#_UfsikK0bEeCRsqPI-sgkpQ #_YxSTkK0bEeCRsqPI-sgkpQ" incoming="#_TnAnEK0bEeCRsqPI-sgkpQ #_UC-xYK0bEeCRsqPI-sgkpQ #_ZrAw4K0bEeCRsqPI-sgkpQ"
        instanceOf="http://www.fzi.de/gast/types#//GASTClass"/>
    <nodes xsi:type="specification:PSObject" id="_Em-WYK0bEeCRsqPI-sgkpQ" name="class2"
        outgoing="#_ZXEhMK0bEeCRsqPI-sgkpQ" incoming="#_T14wkK0bEeCRsqPI-sgkpQ #_UO4fYK0bEeCRsqPI-sgkpQ #_UfsikK0bEeCRsqPI-sgkpQ #_aSb9QK0bEeCRsqPI-sgkpQ"
        instanceOf="http://www.fzi.de/gast/types#//GASTClass"/>
    <nodes xsi:type="specification:PSObject" id="_E53dMK0bEeCRsqPI-sgkpQ" name="method1"
        outgoing="#_Y8JfwK0bEeCRsqPI-sgkpQ" incoming="#_YxSTkK0bEeCRsqPI-sgkpQ #_Z3gUwK0bEeCRsqPI-sgkpQ"
        instanceOf="http://www.fzi.de/gast/functions#//Method"/>
    <nodes xsi:type="specification:PSObject" id="_FPS6oK0bEeCRsqPI-sgkpQ" name="access"
        outgoing="#_ZJ1WcK0bEeCRsqPI-sgkpQ" incoming="#_Y8JfwK0bEeCRsqPI-sgkpQ" instanceOf="http://www.fzi.de/gast/accesses#//VariableAccess"/>
    <nodes xsi:type="specification:PSObject" id="_Fg_uoK0bEeCRsqPI-sgkpQ" name="field"
        incoming="#_ZJ1WcK0bEeCRsqPI-sgkpQ #_ZXEhMK0bEeCRsqPI-sgkpQ #_aFo3YK0bEeCRsqPI-sgkpQ"
        instanceOf="http://www.fzi.de/gast/variables#//Field"/>
  </patternSpecifications>
  <patternSpecifications id="_DYTuYK0cEeCRsqPI-sgkpQ" name="UnauthorizedCall">
    <connections xsi:type="specification:PSLink" id="_qGv4oK0dEeCRsqPI-sgkpQ" name="link1"
        source="#_cYsNMK0dEeCRsqPI-sgkpQ" target="#_c4YZ4K0dEeCRsqPI-sgkpQ" qualifier="classes"
        instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="specification:PSLink" id="_qYAnwK0dEeCRsqPI-sgkpQ" name="link2"
        source="#_c4YZ4K0dEeCRsqPI-sgkpQ" target="#_dI47EK0dEeCRsqPI-sgkpQ" instanceOf="http://www.fzi.de/gast/types#//GASTClass/allAccesses"/>
    <connections xsi:type="specification:PSLink" id="_qkztoK0dEeCRsqPI-sgkpQ" name="link3"
        source="#_dI47EK0dEeCRsqPI-sgkpQ" target="#_dfp1QK0dEeCRsqPI-sgkpQ" instanceOf="http://www.fzi.de/gast/accesses#//Access/accessedTarget"/>
    <connections xsi:type="specification:PSLink" id="_rAxQ4K0dEeCRsqPI-sgkpQ" name="link4"
        source="#_dfp1QK0dEeCRsqPI-sgkpQ" target="#_d1hXkK0dEeCRsqPI-sgkpQ" instanceOf="http://www.fzi.de/gast/functions#//Function/localClasses"/>
    <connections xsi:type="specification:PSLink" id="_ruvxMK0dEeCRsqPI-sgkpQ" name="link5"
        source="#_cYsNMK0dEeCRsqPI-sgkpQ" target="#_d1hXkK0dEeCRsqPI-sgkpQ" qualifier="classes"
        negative="true" instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="specification:PSLink" id="_sWwzcK0dEeCRsqPI-sgkpQ" name="link6"
        source="#_cYsNMK0dEeCRsqPI-sgkpQ" target="#_ebBRUK0dEeCRsqPI-sgkpQ" qualifier="link"
        instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="specification:PSLink" id="_sxF_AK0dEeCRsqPI-sgkpQ" name="link7"
        source="#_cYsNMK0dEeCRsqPI-sgkpQ" target="#_e5XaMK0dEeCRsqPI-sgkpQ" qualifier="link"
        instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="specification:PSLink" id="_tRFGoK0dEeCRsqPI-sgkpQ" name="link8"
        source="#_ebBRUK0dEeCRsqPI-sgkpQ" target="#_eqMVwK0dEeCRsqPI-sgkpQ" instanceOf="http://q-impress.eu/sourcecodedecorator#//ComponentImplementingClassesLink/requiredInterfaces"/>
    <connections xsi:type="specification:PSLink" id="_thJi8K0dEeCRsqPI-sgkpQ" name="link9"
        source="#_eqMVwK0dEeCRsqPI-sgkpQ" target="#_d1hXkK0dEeCRsqPI-sgkpQ" instanceOf="http://q-impress.eu/sourcecodedecorator#//InterfaceSourceCodeLink/gastClass"/>
    <connections xsi:type="specification:PSLink" id="_tvuxgK0dEeCRsqPI-sgkpQ" name="link10"
        source="#_e5XaMK0dEeCRsqPI-sgkpQ" target="#_fNAH4K0dEeCRsqPI-sgkpQ" instanceOf="http://q-impress.eu/sourcecodedecorator#//ComponentImplementingClassesLink/providedInterfaces"/>
    <connections xsi:type="specification:PSLink" id="_t-dKAK0dEeCRsqPI-sgkpQ" name="link11"
        source="#_fNAH4K0dEeCRsqPI-sgkpQ" target="#_d1hXkK0dEeCRsqPI-sgkpQ" instanceOf="http://q-impress.eu/sourcecodedecorator#//InterfaceSourceCodeLink/gastClass"/>
    <connections xsi:type="specification:PSLink" id="_ctUKgLONEeCYXbSFcuLI5w" name="annotatedElement"
        source="#_DYTuYa0cEeCRsqPI-sgkpQ" target="#_c4YZ4K0dEeCRsqPI-sgkpQ" qualifier="callingClass"
        instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="specification:PSLink" id="_dJizgLONEeCYXbSFcuLI5w" name="annotatedElement"
        source="#_DYTuYa0cEeCRsqPI-sgkpQ" target="#_dfp1QK0dEeCRsqPI-sgkpQ" qualifier="calledMethod"
        instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="specification:PSLink" id="_dogncLONEeCYXbSFcuLI5w" name="annotatedElement"
        source="#_DYTuYa0cEeCRsqPI-sgkpQ" target="#_d1hXkK0dEeCRsqPI-sgkpQ" qualifier="callee"
        instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <nodes xsi:type="specification:PSAnnotation" id="_DYTuYa0cEeCRsqPI-sgkpQ" outgoing="#_ctUKgLONEeCYXbSFcuLI5w #_dJizgLONEeCYXbSFcuLI5w #_dogncLONEeCYXbSFcuLI5w"
        type="#_DYTuYK0cEeCRsqPI-sgkpQ"/>
    <nodes xsi:type="specification:PSAnnotation" id="_cYsNMK0dEeCRsqPI-sgkpQ" name="comp"
        outgoing="#_qGv4oK0dEeCRsqPI-sgkpQ #_ruvxMK0dEeCRsqPI-sgkpQ #_sWwzcK0dEeCRsqPI-sgkpQ #_sxF_AK0dEeCRsqPI-sgkpQ"
        type="#_Y6RigKuREeComqG0tdmjrg"/>
    <nodes xsi:type="specification:PSObject" id="_c4YZ4K0dEeCRsqPI-sgkpQ" name="obj1"
        outgoing="#_qYAnwK0dEeCRsqPI-sgkpQ" incoming="#_qGv4oK0dEeCRsqPI-sgkpQ #_ctUKgLONEeCYXbSFcuLI5w"
        instanceOf="http://www.fzi.de/gast/types#//GASTClass"/>
    <nodes xsi:type="specification:PSObject" id="_dI47EK0dEeCRsqPI-sgkpQ" name="obj2"
        outgoing="#_qkztoK0dEeCRsqPI-sgkpQ" incoming="#_qYAnwK0dEeCRsqPI-sgkpQ" instanceOf="http://www.fzi.de/gast/accesses#//FunctionAccess"/>
    <nodes xsi:type="specification:PSObject" id="_dfp1QK0dEeCRsqPI-sgkpQ" name="obj3"
        outgoing="#_rAxQ4K0dEeCRsqPI-sgkpQ" incoming="#_qkztoK0dEeCRsqPI-sgkpQ #_dJizgLONEeCYXbSFcuLI5w"
        instanceOf="http://www.fzi.de/gast/functions#//Method"/>
    <nodes xsi:type="specification:PSObject" id="_d1hXkK0dEeCRsqPI-sgkpQ" name="obj4"
        incoming="#_rAxQ4K0dEeCRsqPI-sgkpQ #_ruvxMK0dEeCRsqPI-sgkpQ #_thJi8K0dEeCRsqPI-sgkpQ #_t-dKAK0dEeCRsqPI-sgkpQ #_dogncLONEeCYXbSFcuLI5w"
        instanceOf="http://www.fzi.de/gast/types#//GASTClass">
      <nodeConstraints xsi:type="specification:PSAttributeConstraint" id="_3RZ8EK0dEeCRsqPI-sgkpQ"
          valueExpression="NORMAL" operator="EQUAL" attribute="http://www.fzi.de/gast/core#//ModelElement/status"/>
      <nodeConstraints xsi:type="specification:PSAttributeConstraint" id="_7Nk2sK0dEeCRsqPI-sgkpQ"
          valueExpression=".*[^(TO)(Event)]" operator="REGULAR_EXPRESSION" attribute="http://www.fzi.de/gast/core#//NamedModelElement/simpleName"/>
    </nodes>
    <nodes xsi:type="specification:PSObject" id="_ebBRUK0dEeCRsqPI-sgkpQ" name="obj5"
        parents="#_1M_0UK0dEeCRsqPI-sgkpQ" outgoing="#_tRFGoK0dEeCRsqPI-sgkpQ" incoming="#_sWwzcK0dEeCRsqPI-sgkpQ"
        instanceOf="http://q-impress.eu/sourcecodedecorator#//ComponentImplementingClassesLink"/>
    <nodes xsi:type="specification:PSObject" id="_eqMVwK0dEeCRsqPI-sgkpQ" name="obj6"
        parents="#_1M_0UK0dEeCRsqPI-sgkpQ" outgoing="#_thJi8K0dEeCRsqPI-sgkpQ" incoming="#_tRFGoK0dEeCRsqPI-sgkpQ"
        instanceOf="http://q-impress.eu/sourcecodedecorator#//InterfaceSourceCodeLink"/>
    <nodes xsi:type="specification:PSObject" id="_e5XaMK0dEeCRsqPI-sgkpQ" name="obj7"
        parents="#_1yo4AK0dEeCRsqPI-sgkpQ" outgoing="#_tvuxgK0dEeCRsqPI-sgkpQ" incoming="#_sxF_AK0dEeCRsqPI-sgkpQ"
        instanceOf="http://q-impress.eu/sourcecodedecorator#//ComponentImplementingClassesLink"/>
    <nodes xsi:type="specification:PSObject" id="_fNAH4K0dEeCRsqPI-sgkpQ" name="obj8"
        parents="#_1yo4AK0dEeCRsqPI-sgkpQ" outgoing="#_t-dKAK0dEeCRsqPI-sgkpQ" incoming="#_tvuxgK0dEeCRsqPI-sgkpQ"
        instanceOf="http://q-impress.eu/sourcecodedecorator#//InterfaceSourceCodeLink"/>
    <combinedFragments id="_1M_0UK0dEeCRsqPI-sgkpQ" name="frag1" children="#_ebBRUK0dEeCRsqPI-sgkpQ #_eqMVwK0dEeCRsqPI-sgkpQ"
        kind="NEGATIVE"/>
    <combinedFragments id="_1yo4AK0dEeCRsqPI-sgkpQ" name="frag2" children="#_e5XaMK0dEeCRsqPI-sgkpQ #_fNAH4K0dEeCRsqPI-sgkpQ"
        kind="NEGATIVE"/>
  </patternSpecifications>
  <patternSpecifications id="_bk_DMMkHEeC1QJpbhhnLBA" name="IllegalMethodAccessBetweenComponents">
    <connections xsi:type="specification:PSLink" id="_xSf4gMkHEeC1QJpbhhnLBA" name="link1"
        source="#_prgR8MkHEeC1QJpbhhnLBA" target="#_p7cycMkHEeC1QJpbhhnLBA" instanceOf="http://www.fzi.de/gast/functions#//Function/accesses"/>
    <connections xsi:type="specification:PSLink" id="_xeUuAMkHEeC1QJpbhhnLBA" name="link2"
        source="#_p7cycMkHEeC1QJpbhhnLBA" target="#_qKBZ8MkHEeC1QJpbhhnLBA" instanceOf="http://www.fzi.de/gast/accesses#//Access/accessedTarget"/>
    <connections xsi:type="specification:PSLink" id="_1AhpcMkHEeC1QJpbhhnLBA" name="link3"
        source="#_e2hscMkHEeC1QJpbhhnLBA" target="#_qKBZ8MkHEeC1QJpbhhnLBA" instanceOf="http://www.fzi.de/gast/types#//GASTClass/methods"/>
    <connections xsi:type="specification:PSLink" id="_1Tm9gMkHEeC1QJpbhhnLBA" name="link4"
        source="#_emlL8MkHEeC1QJpbhhnLBA" target="#_prgR8MkHEeC1QJpbhhnLBA" instanceOf="http://www.fzi.de/gast/types#//GASTClass/methods"/>
    <connections xsi:type="specification:PSLink" id="_4zdIgMkHEeC1QJpbhhnLBA" name="link5"
        source="#_mxRVcMkHEeC1QJpbhhnLBA" target="#_emlL8MkHEeC1QJpbhhnLBA" qualifier="classes"
        negative="true" instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="specification:PSLink" id="_5AzoAMkHEeC1QJpbhhnLBA" name="link6"
        source="#_mxRVcMkHEeC1QJpbhhnLBA" target="#_e2hscMkHEeC1QJpbhhnLBA" qualifier="classes"
        instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="specification:PSLink" id="_5N7eAMkHEeC1QJpbhhnLBA" name="link7"
        source="#_mDfpcMkHEeC1QJpbhhnLBA" target="#_emlL8MkHEeC1QJpbhhnLBA" qualifier="classes"
        instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="specification:PSLink" id="_5dye8MkHEeC1QJpbhhnLBA" name="link8"
        source="#_mDfpcMkHEeC1QJpbhhnLBA" target="#_e2hscMkHEeC1QJpbhhnLBA" qualifier="classes"
        negative="true" instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="specification:PSLink" id="_7w4i8MkHEeC1QJpbhhnLBA" name="annotatedElement"
        source="#_blCGgMkHEeC1QJpbhhnLBA" target="#_emlL8MkHEeC1QJpbhhnLBA" qualifier="accessingClass"
        instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="specification:PSLink" id="_788pAMkHEeC1QJpbhhnLBA" name="annotatedElement"
        source="#_blCGgMkHEeC1QJpbhhnLBA" target="#_e2hscMkHEeC1QJpbhhnLBA" qualifier="accessedMethodOwner"
        instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="specification:PSLink" id="_8KIwcMkHEeC1QJpbhhnLBA" name="annotatedElement"
        source="#_blCGgMkHEeC1QJpbhhnLBA" target="#_qKBZ8MkHEeC1QJpbhhnLBA" qualifier="accessedMethod"
        instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="specification:PSLink" id="_8VcBgMkHEeC1QJpbhhnLBA" name="annotatedElement"
        source="#_blCGgMkHEeC1QJpbhhnLBA" target="#_prgR8MkHEeC1QJpbhhnLBA" qualifier="accessingMethod"
        instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="specification:PSLink" id="_KTYjEMkIEeC1QJpbhhnLBA" name="link13"
        source="#_qKBZ8MkHEeC1QJpbhhnLBA" target="#_IoBNcMkIEeC1QJpbhhnLBA" instanceOf="http://www.fzi.de/gast/types#//Member/overriddenMember"/>
    <connections xsi:type="specification:PSLink" id="_ae1kYMkQEeC1QJpbhhnLBA" name="link14"
        source="#_e2hscMkHEeC1QJpbhhnLBA" target="#_T8Nk4MkQEeC1QJpbhhnLBA" instanceOf="http://www.fzi.de/gast/types#//GASTClass/inheritanceTypeAccesses"/>
    <connections xsi:type="specification:PSLink" id="_a-918MkQEeC1QJpbhhnLBA" name="link15"
        source="#_prgR8MkHEeC1QJpbhhnLBA" target="#_UfG2kMkQEeC1QJpbhhnLBA" instanceOf="http://www.fzi.de/gast/functions#//Function/allStatements"/>
    <connections xsi:type="specification:PSLink" id="_kftzcMkQEeC1QJpbhhnLBA" name="link16"
        source="#_T8Nk4MkQEeC1QJpbhhnLBA" target="#_hckykMkQEeC1QJpbhhnLBA" instanceOf="http://www.fzi.de/gast/accesses#//Access/accessedClass"/>
    <connections xsi:type="specification:PSLink" id="_Wl_jMMkTEeC1QJpbhhnLBA" name="link17"
        source="#_UfG2kMkQEeC1QJpbhhnLBA" target="#_TmtHkMkTEeC1QJpbhhnLBA" instanceOf="http://www.fzi.de/gast/statements#//Statement/accesses"/>
    <connections xsi:type="specification:PSLink" id="_W9So4MkTEeC1QJpbhhnLBA" name="link18"
        source="#_TmtHkMkTEeC1QJpbhhnLBA" target="#_e2hscMkHEeC1QJpbhhnLBA" instanceOf="http://www.fzi.de/gast/accesses#//Access/accessedClass"/>
    <connections xsi:type="specification:PSLink" id="_krAOEMlrEeC1QJpbhhnLBA" name="link22"
        source="#_gGGfgMlrEeC1QJpbhhnLBA" target="#_ity6gMlrEeC1QJpbhhnLBA" instanceOf="http://www.fzi.de/gast/accesses#//Access/accessedTarget"/>
    <connections xsi:type="specification:PSLink" id="_kfapIMlrEeC1QJpbhhnLBA" name="link21"
        source="#_UfG2kMkQEeC1QJpbhhnLBA" target="#_gGGfgMlrEeC1QJpbhhnLBA" instanceOf="http://www.fzi.de/gast/statements#//Statement/accesses"/>
    <connections xsi:type="specification:PSLink" id="_VQo3YMmjEeC1QJpbhhnLBA" name="link21"
        source="#_ity6gMlrEeC1QJpbhhnLBA" target="#_hckykMkQEeC1QJpbhhnLBA" instanceOf="http://www.fzi.de/gast/variables#//Variable/type"/>
    <connections xsi:type="specification:PSLink" id="_1kqGANFyEeC_59bveAUrew" name="annotatedElement"
        source="#_blCGgMkHEeC1QJpbhhnLBA" target="#_p7cycMkHEeC1QJpbhhnLBA" qualifier="functionAccess"
        instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="specification:PSLink" id="_6FcwoNFyEeC_59bveAUrew" name="annotatedElement"
        source="#_blCGgMkHEeC1QJpbhhnLBA" target="#_hckykMkQEeC1QJpbhhnLBA" qualifier="implementedInterface"
        instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="specification:PSLink" id="_1S900NI9EeCC1PiDUkaN3Q" name="annotatedElement"
        source="#_blCGgMkHEeC1QJpbhhnLBA" target="#_UfG2kMkQEeC1QJpbhhnLBA" qualifier="castStmt"
        instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <nodes xsi:type="specification:PSAnnotation" id="_blCGgMkHEeC1QJpbhhnLBA" outgoing="#_7w4i8MkHEeC1QJpbhhnLBA #_788pAMkHEeC1QJpbhhnLBA #_8KIwcMkHEeC1QJpbhhnLBA #_8VcBgMkHEeC1QJpbhhnLBA #_1kqGANFyEeC_59bveAUrew #_6FcwoNFyEeC_59bveAUrew #_1S900NI9EeCC1PiDUkaN3Q"
        type="#_bk_DMMkHEeC1QJpbhhnLBA"/>
    <nodes xsi:type="specification:PSObject" id="_emlL8MkHEeC1QJpbhhnLBA" name="class1"
        outgoing="#_1Tm9gMkHEeC1QJpbhhnLBA" incoming="#_4zdIgMkHEeC1QJpbhhnLBA #_5N7eAMkHEeC1QJpbhhnLBA #_7w4i8MkHEeC1QJpbhhnLBA"
        instanceOf="http://www.fzi.de/gast/types#//GASTClass"/>
    <nodes xsi:type="specification:PSObject" id="_e2hscMkHEeC1QJpbhhnLBA" name="class2"
        outgoing="#_1AhpcMkHEeC1QJpbhhnLBA #_ae1kYMkQEeC1QJpbhhnLBA" incoming="#_5AzoAMkHEeC1QJpbhhnLBA #_5dye8MkHEeC1QJpbhhnLBA #_788pAMkHEeC1QJpbhhnLBA #_W9So4MkTEeC1QJpbhhnLBA"
        instanceOf="http://www.fzi.de/gast/types#//GASTClass">
      <nodeConstraints xsi:type="specification:PSAttributeConstraint" id="_EEXxMMkKEeC1QJpbhhnLBA"
          valueExpression="[^(java)].*" operator="REGULAR_EXPRESSION" attribute="http://www.fzi.de/gast/types#//GASTType/qualifiedName"/>
      <nodeConstraints xsi:type="specification:PSAttributeConstraint" id="_LHD7YMkLEeC1QJpbhhnLBA"
          valueExpression="false" operator="EQUAL" attribute="http://www.fzi.de/gast/types#//GASTClass/interface"/>
      <nodeConstraints xsi:type="specification:PSAttributeConstraint" id="_s36KQMkMEeC1QJpbhhnLBA"
          valueExpression="NORMAL" operator="EQUAL" attribute="http://www.fzi.de/gast/core#//ModelElement/status"/>
    </nodes>
    <nodes xsi:type="specification:PSAnnotation" id="_mDfpcMkHEeC1QJpbhhnLBA" name="comp1"
        outgoing="#_5N7eAMkHEeC1QJpbhhnLBA #_5dye8MkHEeC1QJpbhhnLBA" type="#_Y6RigKuREeComqG0tdmjrg"/>
    <nodes xsi:type="specification:PSAnnotation" id="_mxRVcMkHEeC1QJpbhhnLBA" name="comp2"
        outgoing="#_4zdIgMkHEeC1QJpbhhnLBA #_5AzoAMkHEeC1QJpbhhnLBA" type="#_Y6RigKuREeComqG0tdmjrg"/>
    <nodes xsi:type="specification:PSObject" id="_prgR8MkHEeC1QJpbhhnLBA" name="method1"
        outgoing="#_xSf4gMkHEeC1QJpbhhnLBA #_a-918MkQEeC1QJpbhhnLBA" incoming="#_1Tm9gMkHEeC1QJpbhhnLBA #_8VcBgMkHEeC1QJpbhhnLBA"
        instanceOf="http://www.fzi.de/gast/functions#//Method"/>
    <nodes xsi:type="specification:PSObject" id="_p7cycMkHEeC1QJpbhhnLBA" name="call"
        outgoing="#_xeUuAMkHEeC1QJpbhhnLBA" incoming="#_xSf4gMkHEeC1QJpbhhnLBA #_1kqGANFyEeC_59bveAUrew"
        instanceOf="http://www.fzi.de/gast/accesses#//FunctionAccess"/>
    <nodes xsi:type="specification:PSObject" id="_qKBZ8MkHEeC1QJpbhhnLBA" name="method2"
        outgoing="#_KTYjEMkIEeC1QJpbhhnLBA" incoming="#_xeUuAMkHEeC1QJpbhhnLBA #_1AhpcMkHEeC1QJpbhhnLBA #_8KIwcMkHEeC1QJpbhhnLBA"
        instanceOf="http://www.fzi.de/gast/functions#//Method"/>
    <nodes xsi:type="specification:PSObject" id="_IoBNcMkIEeC1QJpbhhnLBA" name="method3"
        modifier="NEGATIVE" incoming="#_KTYjEMkIEeC1QJpbhhnLBA" instanceOf="http://www.fzi.de/gast/functions#//Method"/>
    <nodes xsi:type="specification:PSObject" id="_T8Nk4MkQEeC1QJpbhhnLBA" name="implements"
        outgoing="#_kftzcMkQEeC1QJpbhhnLBA" incoming="#_ae1kYMkQEeC1QJpbhhnLBA" instanceOf="http://www.fzi.de/gast/accesses#//InheritanceTypeAccess"/>
    <nodes xsi:type="specification:PSObject" id="_UfG2kMkQEeC1QJpbhhnLBA" name="castStmt"
        outgoing="#_Wl_jMMkTEeC1QJpbhhnLBA #_kfapIMlrEeC1QJpbhhnLBA" incoming="#_a-918MkQEeC1QJpbhhnLBA #_1S900NI9EeCC1PiDUkaN3Q"
        instanceOf="http://www.fzi.de/gast/statements#//SimpleStatement"/>
    <nodes xsi:type="specification:PSObject" id="_hckykMkQEeC1QJpbhhnLBA" name="interface"
        incoming="#_kftzcMkQEeC1QJpbhhnLBA #_VQo3YMmjEeC1QJpbhhnLBA #_6FcwoNFyEeC_59bveAUrew"
        instanceOf="http://www.fzi.de/gast/types#//GASTClass">
      <nodeConstraints xsi:type="specification:PSAttributeConstraint" id="_nHTgwMkQEeC1QJpbhhnLBA"
          valueExpression="true" operator="EQUAL" attribute="http://www.fzi.de/gast/types#//GASTClass/interface"/>
    </nodes>
    <nodes xsi:type="specification:PSObject" id="_TmtHkMkTEeC1QJpbhhnLBA" name="cast"
        outgoing="#_W9So4MkTEeC1QJpbhhnLBA" incoming="#_Wl_jMMkTEeC1QJpbhhnLBA" instanceOf="http://www.fzi.de/gast/accesses#//CastTypeAccess"/>
    <nodes xsi:type="specification:PSObject" id="_ity6gMlrEeC1QJpbhhnLBA" name="var2"
        outgoing="#_VQo3YMmjEeC1QJpbhhnLBA" incoming="#_krAOEMlrEeC1QJpbhhnLBA" instanceOf="http://www.fzi.de/gast/variables#//Variable"/>
    <nodes xsi:type="specification:PSObject" id="_gGGfgMlrEeC1QJpbhhnLBA" name="varAccess2"
        outgoing="#_krAOEMlrEeC1QJpbhhnLBA" incoming="#_kfapIMlrEeC1QJpbhhnLBA" instanceOf="http://www.fzi.de/gast/accesses#//VariableAccess"/>
  </patternSpecifications>
  <patternSpecifications id="__oFpUNqzEeCP-NMelokDfw" name="IllegalMethodAccess_Distorted">
    <connections xsi:type="specification:PSLink" id="_jF6z4Nq0EeCP-NMelokDfw" name="link1"
        source="#_gMER4Nq0EeCP-NMelokDfw" target="#_CRAzYNq0EeCP-NMelokDfw" qualifier="classes"
        instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="specification:PSLink" id="_jRX18Nq0EeCP-NMelokDfw" name="link2"
        source="#_CRAzYNq0EeCP-NMelokDfw" target="#_CpWa4Nq0EeCP-NMelokDfw" instanceOf="http://www.fzi.de/gast/types#//GASTClass/methods"/>
    <connections xsi:type="specification:PSLink" id="_jdbU8Nq0EeCP-NMelokDfw" name="link3"
        source="#_CpWa4Nq0EeCP-NMelokDfw" target="#_D_j_4Nq0EeCP-NMelokDfw" instanceOf="http://www.fzi.de/gast/functions#//Function/allStatements"/>
    <connections xsi:type="specification:PSLink" id="_l3_58Nq0EeCP-NMelokDfw" name="link4"
        source="#_D_j_4Nq0EeCP-NMelokDfw" target="#_Tdiw0Nq0EeCP-NMelokDfw" instanceOf="http://www.fzi.de/gast/statements#//Statement/accesses"/>
    <connections xsi:type="specification:PSLink" id="_mJPa8Nq0EeCP-NMelokDfw" name="link5"
        source="#_CpWa4Nq0EeCP-NMelokDfw" target="#_C9Vt4Nq0EeCP-NMelokDfw" instanceOf="http://www.fzi.de/gast/functions#//Function/accesses"/>
    <connections xsi:type="specification:PSLink" id="_mUOi8Nq0EeCP-NMelokDfw" name="link6"
        source="#_C9Vt4Nq0EeCP-NMelokDfw" target="#_DRex4Nq0EeCP-NMelokDfw" instanceOf="http://www.fzi.de/gast/accesses#//Access/accessedTarget"/>
    <connections xsi:type="specification:PSLink" id="_oFDnYNq0EeCP-NMelokDfw" name="link7"
        source="#_D_j_4Nq0EeCP-NMelokDfw" target="#_YkFz4Nq0EeCP-NMelokDfw" instanceOf="http://www.fzi.de/gast/statements#//Statement/accesses"/>
    <connections xsi:type="specification:PSLink" id="_oOSb4Nq0EeCP-NMelokDfw" name="link8"
        source="#_YkFz4Nq0EeCP-NMelokDfw" target="#_bIHP0Nq0EeCP-NMelokDfw" instanceOf="http://www.fzi.de/gast/accesses#//Access/accessedTarget"/>
    <connections xsi:type="specification:PSLink" id="_oYb2YNq0EeCP-NMelokDfw" name="link9"
        source="#_bIHP0Nq0EeCP-NMelokDfw" target="#_Dudo0Nq0EeCP-NMelokDfw" instanceOf="http://www.fzi.de/gast/variables#//Variable/type"/>
    <connections xsi:type="specification:PSLink" id="_pb43cNq0EeCP-NMelokDfw" name="link10"
        source="#_DfSkYNq0EeCP-NMelokDfw" target="#_IeWfYNq0EeCP-NMelokDfw" instanceOf="http://www.fzi.de/gast/types#//GASTClass/inheritanceTypeAccesses"/>
    <connections xsi:type="specification:PSLink" id="_pqFEcNq0EeCP-NMelokDfw" name="link11"
        source="#_IeWfYNq0EeCP-NMelokDfw" target="#_Dudo0Nq0EeCP-NMelokDfw" instanceOf="http://www.fzi.de/gast/accesses#//Access/accessedClass"/>
    <connections xsi:type="specification:PSLink" id="_r8RJgNq0EeCP-NMelokDfw" name="link12"
        source="#_DfSkYNq0EeCP-NMelokDfw" target="#_DRex4Nq0EeCP-NMelokDfw" instanceOf="http://www.fzi.de/gast/types#//GASTClass/methods"/>
    <connections xsi:type="specification:PSLink" id="_sHoE8Nq0EeCP-NMelokDfw" name="link13"
        source="#_DRex4Nq0EeCP-NMelokDfw" target="#_da6Y4Nq0EeCP-NMelokDfw" instanceOf="http://www.fzi.de/gast/types#//Member/overriddenMember"/>
    <connections xsi:type="specification:PSLink" id="_uU2KcNq0EeCP-NMelokDfw" name="link14"
        source="#_Tdiw0Nq0EeCP-NMelokDfw" target="#_DfSkYNq0EeCP-NMelokDfw" instanceOf="http://www.fzi.de/gast/accesses#//Access/accessedClass"/>
    <connections xsi:type="specification:PSLink" id="_wNAl8Nq0EeCP-NMelokDfw" name="annotatedElement"
        source="#__oKh0NqzEeCP-NMelokDfw" target="#_DfSkYNq0EeCP-NMelokDfw" qualifier="accessedMethodOwner"
        instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="specification:PSLink" id="_wb-PANq0EeCP-NMelokDfw" name="annotatedElement"
        source="#__oKh0NqzEeCP-NMelokDfw" target="#_CRAzYNq0EeCP-NMelokDfw" qualifier="accessingClass"
        instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="specification:PSLink" id="_0Ngm8Nq0EeCP-NMelokDfw" name="annotatedElement"
        source="#__oKh0NqzEeCP-NMelokDfw" target="#_CpWa4Nq0EeCP-NMelokDfw" qualifier="accessingMethod"
        instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="specification:PSLink" id="_0eXtcNq0EeCP-NMelokDfw" name="annotatedElement"
        source="#__oKh0NqzEeCP-NMelokDfw" target="#_D_j_4Nq0EeCP-NMelokDfw" qualifier="castStmt"
        instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="specification:PSLink" id="_4iEzcNq0EeCP-NMelokDfw" name="annotatedElement"
        source="#__oKh0NqzEeCP-NMelokDfw" target="#_C9Vt4Nq0EeCP-NMelokDfw" qualifier="functionAccess"
        instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="specification:PSLink" id="_4uSDcNq0EeCP-NMelokDfw" name="annotatedElement"
        source="#__oKh0NqzEeCP-NMelokDfw" target="#_DRex4Nq0EeCP-NMelokDfw" qualifier="accessedMethod"
        instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="specification:PSLink" id="_49FUcNq0EeCP-NMelokDfw" name="annotatedElement"
        source="#__oKh0NqzEeCP-NMelokDfw" target="#_Dudo0Nq0EeCP-NMelokDfw" qualifier="implementedInterface"
        instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <nodes xsi:type="specification:PSAnnotation" id="__oKh0NqzEeCP-NMelokDfw" outgoing="#_wNAl8Nq0EeCP-NMelokDfw #_wb-PANq0EeCP-NMelokDfw #_0Ngm8Nq0EeCP-NMelokDfw #_0eXtcNq0EeCP-NMelokDfw #_4iEzcNq0EeCP-NMelokDfw #_4uSDcNq0EeCP-NMelokDfw #_49FUcNq0EeCP-NMelokDfw"
        type="#__oFpUNqzEeCP-NMelokDfw"/>
    <nodes xsi:type="specification:PSObject" id="_CRAzYNq0EeCP-NMelokDfw" name="class1"
        outgoing="#_jRX18Nq0EeCP-NMelokDfw" incoming="#_jF6z4Nq0EeCP-NMelokDfw #_wb-PANq0EeCP-NMelokDfw"
        instanceOf="http://www.fzi.de/gast/types#//GASTClass"/>
    <nodes xsi:type="specification:PSObject" id="_CpWa4Nq0EeCP-NMelokDfw" name="method1"
        outgoing="#_jdbU8Nq0EeCP-NMelokDfw #_mJPa8Nq0EeCP-NMelokDfw" incoming="#_jRX18Nq0EeCP-NMelokDfw #_0Ngm8Nq0EeCP-NMelokDfw"
        instanceOf="http://www.fzi.de/gast/functions#//Method"/>
    <nodes xsi:type="specification:PSObject" id="_C9Vt4Nq0EeCP-NMelokDfw" name="call"
        outgoing="#_mUOi8Nq0EeCP-NMelokDfw" incoming="#_mJPa8Nq0EeCP-NMelokDfw #_4iEzcNq0EeCP-NMelokDfw"
        instanceOf="http://www.fzi.de/gast/accesses#//FunctionAccess"/>
    <nodes xsi:type="specification:PSObject" id="_DRex4Nq0EeCP-NMelokDfw" name="method2"
        outgoing="#_sHoE8Nq0EeCP-NMelokDfw" incoming="#_mUOi8Nq0EeCP-NMelokDfw #_r8RJgNq0EeCP-NMelokDfw #_4uSDcNq0EeCP-NMelokDfw"
        instanceOf="http://www.fzi.de/gast/functions#//Method"/>
    <nodes xsi:type="specification:PSObject" id="_DfSkYNq0EeCP-NMelokDfw" name="class2"
        outgoing="#_pb43cNq0EeCP-NMelokDfw #_r8RJgNq0EeCP-NMelokDfw" incoming="#_uU2KcNq0EeCP-NMelokDfw #_wNAl8Nq0EeCP-NMelokDfw"
        instanceOf="http://www.fzi.de/gast/types#//GASTClass">
      <nodeConstraints xsi:type="specification:PSAttributeConstraint" id="_CS3_INq1EeCP-NMelokDfw"
          valueExpression="false" operator="EQUAL" attribute="http://www.fzi.de/gast/types#//GASTClass/interface"/>
      <nodeConstraints xsi:type="specification:PSAttributeConstraint" id="_CnjOoNq1EeCP-NMelokDfw"
          valueExpression="NORMAL" operator="EQUAL" attribute="http://www.fzi.de/gast/core#//ModelElement/status"/>
      <nodeConstraints xsi:type="specification:PSAttributeConstraint" id="_C6ZSINq1EeCP-NMelokDfw"
          valueExpression="[^(java)].*" operator="REGULAR_EXPRESSION" attribute="http://www.fzi.de/gast/core#//NamedModelElement/simpleName"/>
    </nodes>
    <nodes xsi:type="specification:PSObject" id="_Dudo0Nq0EeCP-NMelokDfw" name="interface"
        incoming="#_oYb2YNq0EeCP-NMelokDfw #_pqFEcNq0EeCP-NMelokDfw #_49FUcNq0EeCP-NMelokDfw"
        instanceOf="http://www.fzi.de/gast/types#//GASTClass">
      <nodeConstraints xsi:type="specification:PSAttributeConstraint" id="_AcrSgNq1EeCP-NMelokDfw"
          valueExpression="true" operator="EQUAL" attribute="http://www.fzi.de/gast/types#//GASTClass/interface"/>
    </nodes>
    <nodes xsi:type="specification:PSObject" id="_D_j_4Nq0EeCP-NMelokDfw" name="castStmt"
        outgoing="#_l3_58Nq0EeCP-NMelokDfw #_oFDnYNq0EeCP-NMelokDfw" incoming="#_jdbU8Nq0EeCP-NMelokDfw #_0eXtcNq0EeCP-NMelokDfw"
        instanceOf="http://www.fzi.de/gast/statements#//SimpleStatement"/>
    <nodes xsi:type="specification:PSObject" id="_IeWfYNq0EeCP-NMelokDfw" name="implements"
        outgoing="#_pqFEcNq0EeCP-NMelokDfw" incoming="#_pb43cNq0EeCP-NMelokDfw" instanceOf="http://www.fzi.de/gast/accesses#//InheritanceTypeAccess"/>
    <nodes xsi:type="specification:PSObject" id="_Tdiw0Nq0EeCP-NMelokDfw" name="cast"
        outgoing="#_uU2KcNq0EeCP-NMelokDfw" incoming="#_l3_58Nq0EeCP-NMelokDfw" instanceOf="http://www.fzi.de/gast/accesses#//CastTypeAccess"/>
    <nodes xsi:type="specification:PSObject" id="_YkFz4Nq0EeCP-NMelokDfw" name="varAccess1"
        outgoing="#_oOSb4Nq0EeCP-NMelokDfw" incoming="#_oFDnYNq0EeCP-NMelokDfw" instanceOf="http://www.fzi.de/gast/accesses#//VariableAccess"/>
    <nodes xsi:type="specification:PSObject" id="_bIHP0Nq0EeCP-NMelokDfw" name="var1"
        outgoing="#_oYb2YNq0EeCP-NMelokDfw" incoming="#_oOSb4Nq0EeCP-NMelokDfw" instanceOf="http://www.fzi.de/gast/variables#//Variable"/>
    <nodes xsi:type="specification:PSObject" id="_da6Y4Nq0EeCP-NMelokDfw" name="decl"
        incoming="#_sHoE8Nq0EeCP-NMelokDfw" instanceOf="http://www.fzi.de/gast/functions#//Method"/>
    <nodes xsi:type="specification:PSAnnotation" id="_gMER4Nq0EeCP-NMelokDfw" name="compAnno"
        outgoing="#_jF6z4Nq0EeCP-NMelokDfw" type="#_Y6RigKuREeComqG0tdmjrg"/>
  </patternSpecifications>
  <patternSpecifications id="_QKoZINq1EeCP-NMelokDfw" name="IllegalMethodAccessBetweenComponent_Distorted">
    <connections xsi:type="specification:PSLink" id="_ramxcNq1EeCP-NMelokDfw" name="link1"
        source="#_RlOu4Nq1EeCP-NMelokDfw" target="#_TNOAYNq1EeCP-NMelokDfw" instanceOf="http://www.fzi.de/gast/types#//GASTClass/methods"/>
    <connections xsi:type="specification:PSLink" id="_rn4YcNq1EeCP-NMelokDfw" name="link2"
        source="#_TNOAYNq1EeCP-NMelokDfw" target="#_iW6jYNq1EeCP-NMelokDfw" instanceOf="http://www.fzi.de/gast/functions#//Function/allStatements"/>
    <connections xsi:type="specification:PSLink" id="_rzUzcNq1EeCP-NMelokDfw" name="link3"
        source="#_iW6jYNq1EeCP-NMelokDfw" target="#_jF1e4Nq1EeCP-NMelokDfw" instanceOf="http://www.fzi.de/gast/statements#//Statement/accesses"/>
    <connections xsi:type="specification:PSLink" id="_sNV18Nq1EeCP-NMelokDfw" name="link4"
        source="#_TNOAYNq1EeCP-NMelokDfw" target="#_U6tc8Nq1EeCP-NMelokDfw" instanceOf="http://www.fzi.de/gast/functions#//Function/accesses"/>
    <connections xsi:type="specification:PSLink" id="_sWWA8Nq1EeCP-NMelokDfw" name="link5"
        source="#_U6tc8Nq1EeCP-NMelokDfw" target="#_WSNbYNq1EeCP-NMelokDfw" instanceOf="http://www.fzi.de/gast/accesses#//Access/accessedTarget"/>
    <connections xsi:type="specification:PSLink" id="_uElrcNq1EeCP-NMelokDfw" name="link6"
        source="#_WSNbYNq1EeCP-NMelokDfw" target="#_b00vYNq1EeCP-NMelokDfw" instanceOf="http://www.fzi.de/gast/types#//Member/overriddenMember"/>
    <connections xsi:type="specification:PSLink" id="_uWhI8Nq1EeCP-NMelokDfw" name="link7"
        source="#_XZ7RYNq1EeCP-NMelokDfw" target="#_aauI4Nq1EeCP-NMelokDfw" instanceOf="http://www.fzi.de/gast/types#//GASTClass/inheritanceTypeAccesses"/>
    <connections xsi:type="specification:PSLink" id="_ukZz8Nq1EeCP-NMelokDfw" name="link8"
        source="#_aauI4Nq1EeCP-NMelokDfw" target="#_Y4Ji4Nq1EeCP-NMelokDfw" instanceOf="http://www.fzi.de/gast/accesses#//Access/accessedClass"/>
    <connections xsi:type="specification:PSLink" id="_wU79cNq1EeCP-NMelokDfw" name="link9"
        source="#_jF1e4Nq1EeCP-NMelokDfw" target="#_f3TtYNq1EeCP-NMelokDfw" instanceOf="http://www.fzi.de/gast/accesses#//Access/accessedTarget"/>
    <connections xsi:type="specification:PSLink" id="_wg_ccNq1EeCP-NMelokDfw" name="link10"
        source="#_f3TtYNq1EeCP-NMelokDfw" target="#_Y4Ji4Nq1EeCP-NMelokDfw" instanceOf="http://www.fzi.de/gast/variables#//Variable/type"/>
    <connections xsi:type="specification:PSLink" id="_w1qr8Nq1EeCP-NMelokDfw" name="link11"
        source="#_iW6jYNq1EeCP-NMelokDfw" target="#_iq-u4Nq1EeCP-NMelokDfw" instanceOf="http://www.fzi.de/gast/statements#//Statement/accesses"/>
    <connections xsi:type="specification:PSLink" id="_xETk4Nq1EeCP-NMelokDfw" name="link12"
        source="#_iq-u4Nq1EeCP-NMelokDfw" target="#_XZ7RYNq1EeCP-NMelokDfw" instanceOf="http://www.fzi.de/gast/accesses#//Access/accessedClass"/>
    <connections xsi:type="specification:PSLink" id="_0dwM8Nq1EeCP-NMelokDfw" name="link13"
        source="#_XZ7RYNq1EeCP-NMelokDfw" target="#_WSNbYNq1EeCP-NMelokDfw" instanceOf="http://www.fzi.de/gast/types#//GASTClass/methods"/>
    <connections xsi:type="specification:PSLink" id="_0t2ecNq1EeCP-NMelokDfw" name="link14"
        source="#_oTKfYNq1EeCP-NMelokDfw" target="#_XZ7RYNq1EeCP-NMelokDfw" qualifier="classes"
        negative="true" instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="specification:PSLink" id="_0559cNq1EeCP-NMelokDfw" name="link15"
        source="#_oTKfYNq1EeCP-NMelokDfw" target="#_RlOu4Nq1EeCP-NMelokDfw" qualifier="classes"
        instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="specification:PSLink" id="_1XvI8Nq1EeCP-NMelokDfw" name="link16"
        source="#_nv_g4Nq1EeCP-NMelokDfw" target="#_XZ7RYNq1EeCP-NMelokDfw" qualifier="classes"
        instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="specification:PSLink" id="_1mYo8Nq1EeCP-NMelokDfw" name="link17"
        source="#_nv_g4Nq1EeCP-NMelokDfw" target="#_RlOu4Nq1EeCP-NMelokDfw" qualifier="classes"
        negative="true" instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="specification:PSLink" id="_52JN8Nq1EeCP-NMelokDfw" name="annotatedElement"
        source="#_QKoZIdq1EeCP-NMelokDfw" target="#_RlOu4Nq1EeCP-NMelokDfw" qualifier="accessingClass"
        instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="specification:PSLink" id="_6D4H8Nq1EeCP-NMelokDfw" name="annotatedElement"
        source="#_QKoZIdq1EeCP-NMelokDfw" target="#_TNOAYNq1EeCP-NMelokDfw" qualifier="accessingMethod"
        instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="specification:PSLink" id="_6WpS8Nq1EeCP-NMelokDfw" name="annotatedElement"
        source="#_QKoZIdq1EeCP-NMelokDfw" target="#_XZ7RYNq1EeCP-NMelokDfw" qualifier="accessedMethodOwner"
        instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="specification:PSLink" id="_6i2i8Nq1EeCP-NMelokDfw" name="annotatedElement"
        source="#_QKoZIdq1EeCP-NMelokDfw" target="#_WSNbYNq1EeCP-NMelokDfw" qualifier="accessedMethod"
        instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="specification:PSLink" id="_60yAcNq1EeCP-NMelokDfw" name="annotatedElement"
        source="#_QKoZIdq1EeCP-NMelokDfw" target="#_Y4Ji4Nq1EeCP-NMelokDfw" qualifier="implementedInterface"
        instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="specification:PSLink" id="_7FadcNq1EeCP-NMelokDfw" name="annotatedElement"
        source="#_QKoZIdq1EeCP-NMelokDfw" target="#_U6tc8Nq1EeCP-NMelokDfw" qualifier="functionAccess"
        instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <connections xsi:type="specification:PSLink" id="_7a_r4Nq1EeCP-NMelokDfw" name="annotatedElement"
        source="#_QKoZIdq1EeCP-NMelokDfw" target="#_iW6jYNq1EeCP-NMelokDfw" qualifier="castStmt"
        instanceOf="http://org.reclipse.structure.inference.annotations#//ASGAnnotation/annotatedElements"/>
    <nodes xsi:type="specification:PSAnnotation" id="_QKoZIdq1EeCP-NMelokDfw" outgoing="#_52JN8Nq1EeCP-NMelokDfw #_6D4H8Nq1EeCP-NMelokDfw #_6WpS8Nq1EeCP-NMelokDfw #_6i2i8Nq1EeCP-NMelokDfw #_60yAcNq1EeCP-NMelokDfw #_7FadcNq1EeCP-NMelokDfw #_7a_r4Nq1EeCP-NMelokDfw"
        type="#_QKoZINq1EeCP-NMelokDfw"/>
    <nodes xsi:type="specification:PSObject" id="_RlOu4Nq1EeCP-NMelokDfw" name="class1"
        outgoing="#_ramxcNq1EeCP-NMelokDfw" incoming="#_0559cNq1EeCP-NMelokDfw #_1mYo8Nq1EeCP-NMelokDfw #_52JN8Nq1EeCP-NMelokDfw"
        instanceOf="http://www.fzi.de/gast/types#//GASTClass"/>
    <nodes xsi:type="specification:PSObject" id="_TNOAYNq1EeCP-NMelokDfw" name="method1"
        outgoing="#_rn4YcNq1EeCP-NMelokDfw #_sNV18Nq1EeCP-NMelokDfw" incoming="#_ramxcNq1EeCP-NMelokDfw #_6D4H8Nq1EeCP-NMelokDfw"
        instanceOf="http://www.fzi.de/gast/functions#//Method"/>
    <nodes xsi:type="specification:PSObject" id="_U6tc8Nq1EeCP-NMelokDfw" name="call"
        outgoing="#_sWWA8Nq1EeCP-NMelokDfw" incoming="#_sNV18Nq1EeCP-NMelokDfw #_7FadcNq1EeCP-NMelokDfw"
        instanceOf="http://www.fzi.de/gast/accesses#//FunctionAccess"/>
    <nodes xsi:type="specification:PSObject" id="_WSNbYNq1EeCP-NMelokDfw" name="method2"
        outgoing="#_uElrcNq1EeCP-NMelokDfw" incoming="#_sWWA8Nq1EeCP-NMelokDfw #_0dwM8Nq1EeCP-NMelokDfw #_6i2i8Nq1EeCP-NMelokDfw"
        instanceOf="http://www.fzi.de/gast/functions#//Method"/>
    <nodes xsi:type="specification:PSObject" id="_XZ7RYNq1EeCP-NMelokDfw" name="class2"
        outgoing="#_uWhI8Nq1EeCP-NMelokDfw #_0dwM8Nq1EeCP-NMelokDfw" incoming="#_xETk4Nq1EeCP-NMelokDfw #_0t2ecNq1EeCP-NMelokDfw #_1XvI8Nq1EeCP-NMelokDfw #_6WpS8Nq1EeCP-NMelokDfw"
        instanceOf="http://www.fzi.de/gast/types#//GASTClass"/>
    <nodes xsi:type="specification:PSObject" id="_Y4Ji4Nq1EeCP-NMelokDfw" name="interface"
        incoming="#_ukZz8Nq1EeCP-NMelokDfw #_wg_ccNq1EeCP-NMelokDfw #_60yAcNq1EeCP-NMelokDfw"
        instanceOf="http://www.fzi.de/gast/types#//GASTClass"/>
    <nodes xsi:type="specification:PSObject" id="_aauI4Nq1EeCP-NMelokDfw" name="implements"
        outgoing="#_ukZz8Nq1EeCP-NMelokDfw" incoming="#_uWhI8Nq1EeCP-NMelokDfw" instanceOf="http://www.fzi.de/gast/accesses#//InheritanceTypeAccess"/>
    <nodes xsi:type="specification:PSObject" id="_b00vYNq1EeCP-NMelokDfw" name="decl"
        incoming="#_uElrcNq1EeCP-NMelokDfw" instanceOf="http://www.fzi.de/gast/functions#//Method"/>
    <nodes xsi:type="specification:PSObject" id="_f3TtYNq1EeCP-NMelokDfw" name="var1"
        outgoing="#_wg_ccNq1EeCP-NMelokDfw" incoming="#_wU79cNq1EeCP-NMelokDfw" instanceOf="http://www.fzi.de/gast/variables#//Variable"/>
    <nodes xsi:type="specification:PSObject" id="_iW6jYNq1EeCP-NMelokDfw" name="castStmt"
        outgoing="#_rzUzcNq1EeCP-NMelokDfw #_w1qr8Nq1EeCP-NMelokDfw" incoming="#_rn4YcNq1EeCP-NMelokDfw #_7a_r4Nq1EeCP-NMelokDfw"
        instanceOf="http://www.fzi.de/gast/statements#//SimpleStatement"/>
    <nodes xsi:type="specification:PSObject" id="_iq-u4Nq1EeCP-NMelokDfw" name="cast"
        outgoing="#_xETk4Nq1EeCP-NMelokDfw" incoming="#_w1qr8Nq1EeCP-NMelokDfw" instanceOf="http://www.fzi.de/gast/accesses#//CastTypeAccess"/>
    <nodes xsi:type="specification:PSObject" id="_jF1e4Nq1EeCP-NMelokDfw" name="varAccess1"
        outgoing="#_wU79cNq1EeCP-NMelokDfw" incoming="#_rzUzcNq1EeCP-NMelokDfw" instanceOf="http://www.fzi.de/gast/accesses#//VariableAccess"/>
    <nodes xsi:type="specification:PSAnnotation" id="_nv_g4Nq1EeCP-NMelokDfw" name="comp2"
        outgoing="#_1XvI8Nq1EeCP-NMelokDfw #_1mYo8Nq1EeCP-NMelokDfw" type="#_Y6RigKuREeComqG0tdmjrg"/>
    <nodes xsi:type="specification:PSAnnotation" id="_oTKfYNq1EeCP-NMelokDfw" name="comp1"
        outgoing="#_0t2ecNq1EeCP-NMelokDfw #_0559cNq1EeCP-NMelokDfw" type="#_Y6RigKuREeComqG0tdmjrg"/>
  </patternSpecifications>
</specification:PSCatalog>
