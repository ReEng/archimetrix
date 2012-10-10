<?xml version="1.0" encoding="UTF-8"?>
<de.hpi.sam.storyDiagramEcore:ActivityDiagram xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:de.hpi.sam.storyDiagramEcore="http://de/hpi/sam/storyDiagramEcore.ecore" xmlns:de.hpi.sam.storyDiagramEcore.nodes="http://de/hpi/sam/storyDiagramEcore/nodes.ecore" xmlns:de.hpi.sam.storyDiagramEcore.sdm="http://de/hpi/sam/storyDiagramEcore/sdm.ecore" uuid="_c-GEsVB1EeCHCK1ZrpUVGQ">
  <activities uuid="_c-GrwFB1EeCHCK1ZrpUVGQ">
    <nodes xsi:type="de.hpi.sam.storyDiagramEcore.nodes:StoryActionNode" name="4 more than one" uuid="_e7FV0FB1EeCHCK1ZrpUVGQ">
      <storyPatternObjects xsi:type="de.hpi.sam.storyDiagramEcore.sdm:StoryPatternObject" name="root" uuid="_im-YwFB1EeCHCK1ZrpUVGQ" outgoingStoryLinks="_ppWPUFB1EeCHCK1ZrpUVGQ" bindingType="BOUND"/>
      <storyPatternObjects xsi:type="de.hpi.sam.storyDiagramEcore.sdm:StoryPatternObject" name="opt1" uuid="_mDvakFB1EeCHCK1ZrpUVGQ" outgoingStoryLinks="_qKWDkFB1EeCHCK1ZrpUVGQ" incomingStoryLinks="_ppWPUFB1EeCHCK1ZrpUVGQ"/>
      <storyPatternObjects xsi:type="de.hpi.sam.storyDiagramEcore.sdm:StoryPatternObject" name="opt2" uuid="_m2POgFB1EeCHCK1ZrpUVGQ" incomingStoryLinks="_qKWDkFB1EeCHCK1ZrpUVGQ"/>
      <storyPatternLinks xsi:type="de.hpi.sam.storyDiagramEcore.sdm:StoryPatternLink" uuid="_ppWPUFB1EeCHCK1ZrpUVGQ" source="_im-YwFB1EeCHCK1ZrpUVGQ" target="_mDvakFB1EeCHCK1ZrpUVGQ"/>
      <storyPatternLinks xsi:type="de.hpi.sam.storyDiagramEcore.sdm:StoryPatternLink" uuid="_qKWDkFB1EeCHCK1ZrpUVGQ" source="_mDvakFB1EeCHCK1ZrpUVGQ" target="_m2POgFB1EeCHCK1ZrpUVGQ"/>
    </nodes>
    <nodes xsi:type="de.hpi.sam.storyDiagramEcore.nodes:StoryActionNode" name="5 create" uuid="_uxWq8FB1EeCHCK1ZrpUVGQ">
      <storyPatternObjects xsi:type="de.hpi.sam.storyDiagramEcore.sdm:StoryPatternObject" name="root" uuid="_uxXSAFB1EeCHCK1ZrpUVGQ" outgoingStoryLinks="_uxXSAlB1EeCHCK1ZrpUVGQ" bindingType="BOUND"/>
      <storyPatternObjects xsi:type="de.hpi.sam.storyDiagramEcore.sdm:StoryPatternObject" name="opt1" uuid="_uxXSAVB1EeCHCK1ZrpUVGQ" outgoingStoryLinks="_uxXSA1B1EeCHCK1ZrpUVGQ" incomingStoryLinks="_uxXSAlB1EeCHCK1ZrpUVGQ"/>
      <storyPatternObjects xsi:type="de.hpi.sam.storyDiagramEcore.sdm:StoryPatternObject" name="opt2" uuid="_uxXSBFB1EeCHCK1ZrpUVGQ" modifier="CREATE" incomingStoryLinks="_uxXSA1B1EeCHCK1ZrpUVGQ"/>
      <storyPatternLinks xsi:type="de.hpi.sam.storyDiagramEcore.sdm:StoryPatternLink" uuid="_uxXSAlB1EeCHCK1ZrpUVGQ" source="_uxXSAFB1EeCHCK1ZrpUVGQ" target="_uxXSAVB1EeCHCK1ZrpUVGQ"/>
      <storyPatternLinks xsi:type="de.hpi.sam.storyDiagramEcore.sdm:StoryPatternLink" name="" uuid="_uxXSA1B1EeCHCK1ZrpUVGQ" modifier="CREATE" source="_uxXSAVB1EeCHCK1ZrpUVGQ" target="_uxXSBFB1EeCHCK1ZrpUVGQ"/>
    </nodes>
    <nodes xsi:type="de.hpi.sam.storyDiagramEcore.nodes:StoryActionNode" name="6 destroy" uuid="_0pF6ZlB1EeCHCK1ZrpUVGQ">
      <storyPatternObjects xsi:type="de.hpi.sam.storyDiagramEcore.sdm:StoryPatternObject" name="root" uuid="_0pF6aFB1EeCHCK1ZrpUVGQ" outgoingStoryLinks="_0pF6aVB1EeCHCK1ZrpUVGQ" bindingType="BOUND"/>
      <storyPatternObjects xsi:type="de.hpi.sam.storyDiagramEcore.sdm:StoryPatternObject" name="opt1" uuid="_0pF6alB1EeCHCK1ZrpUVGQ" outgoingStoryLinks="_0pGhcFB1EeCHCK1ZrpUVGQ" incomingStoryLinks="_0pF6aVB1EeCHCK1ZrpUVGQ"/>
      <storyPatternObjects xsi:type="de.hpi.sam.storyDiagramEcore.sdm:StoryPatternObject" name="opt2" uuid="_0pF6Z1B1EeCHCK1ZrpUVGQ" modifier="DESTROY" incomingStoryLinks="_0pGhcFB1EeCHCK1ZrpUVGQ"/>
      <storyPatternLinks xsi:type="de.hpi.sam.storyDiagramEcore.sdm:StoryPatternLink" uuid="_0pF6aVB1EeCHCK1ZrpUVGQ" source="_0pF6aFB1EeCHCK1ZrpUVGQ" target="_0pF6alB1EeCHCK1ZrpUVGQ"/>
      <storyPatternLinks xsi:type="de.hpi.sam.storyDiagramEcore.sdm:StoryPatternLink" uuid="_0pGhcFB1EeCHCK1ZrpUVGQ" modifier="DESTROY" source="_0pF6alB1EeCHCK1ZrpUVGQ" target="_0pF6Z1B1EeCHCK1ZrpUVGQ"/>
    </nodes>
    <nodes xsi:type="de.hpi.sam.storyDiagramEcore.nodes:StoryActionNode" name="1 normal" uuid="__8gvZlB1EeCHCK1ZrpUVGQ">
      <storyPatternObjects xsi:type="de.hpi.sam.storyDiagramEcore.sdm:StoryPatternObject" name="root" uuid="__8gvZ1B1EeCHCK1ZrpUVGQ" outgoingStoryLinks="__8hWcVB1EeCHCK1ZrpUVGQ" bindingType="BOUND"/>
      <storyPatternObjects xsi:type="de.hpi.sam.storyDiagramEcore.sdm:StoryPatternObject" name="opt1" uuid="__8hWcFB1EeCHCK1ZrpUVGQ" incomingStoryLinks="__8hWcVB1EeCHCK1ZrpUVGQ"/>
      <storyPatternLinks xsi:type="de.hpi.sam.storyDiagramEcore.sdm:StoryPatternLink" uuid="__8hWcVB1EeCHCK1ZrpUVGQ" source="__8gvZ1B1EeCHCK1ZrpUVGQ" target="__8hWcFB1EeCHCK1ZrpUVGQ"/>
    </nodes>
    <nodes xsi:type="de.hpi.sam.storyDiagramEcore.nodes:StoryActionNode" name="2 create" uuid="_DDoRVFB2EeCHCK1ZrpUVGQ">
      <storyPatternObjects xsi:type="de.hpi.sam.storyDiagramEcore.sdm:StoryPatternObject" name="root" uuid="_DDoRVVB2EeCHCK1ZrpUVGQ" outgoingStoryLinks="_DDoRV1B2EeCHCK1ZrpUVGQ" bindingType="BOUND"/>
      <storyPatternObjects xsi:type="de.hpi.sam.storyDiagramEcore.sdm:StoryPatternObject" name="opt1" uuid="_DDoRVlB2EeCHCK1ZrpUVGQ" modifier="CREATE" incomingStoryLinks="_DDoRV1B2EeCHCK1ZrpUVGQ"/>
      <storyPatternLinks xsi:type="de.hpi.sam.storyDiagramEcore.sdm:StoryPatternLink" uuid="_DDoRV1B2EeCHCK1ZrpUVGQ" modifier="CREATE" source="_DDoRVVB2EeCHCK1ZrpUVGQ" target="_DDoRVlB2EeCHCK1ZrpUVGQ"/>
    </nodes>
    <nodes xsi:type="de.hpi.sam.storyDiagramEcore.nodes:StoryActionNode" name="3 destroy" uuid="_G03uU1B2EeCHCK1ZrpUVGQ">
      <storyPatternObjects xsi:type="de.hpi.sam.storyDiagramEcore.sdm:StoryPatternObject" name="root" uuid="_G03uVFB2EeCHCK1ZrpUVGQ" outgoingStoryLinks="_G03uVlB2EeCHCK1ZrpUVGQ" bindingType="BOUND"/>
      <storyPatternObjects xsi:type="de.hpi.sam.storyDiagramEcore.sdm:StoryPatternObject" name="opt1" uuid="_G03uVVB2EeCHCK1ZrpUVGQ" modifier="DESTROY" incomingStoryLinks="_G03uVlB2EeCHCK1ZrpUVGQ"/>
      <storyPatternLinks xsi:type="de.hpi.sam.storyDiagramEcore.sdm:StoryPatternLink" uuid="_G03uVlB2EeCHCK1ZrpUVGQ" modifier="DESTROY" source="_G03uVFB2EeCHCK1ZrpUVGQ" target="_G03uVVB2EeCHCK1ZrpUVGQ"/>
    </nodes>
  </activities>
</de.hpi.sam.storyDiagramEcore:ActivityDiagram>
