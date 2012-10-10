<?xml version="1.0" encoding="ASCII"?>
<workflow:Workflow xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:workflow="http://mdelab/workflow/1.0" xmlns:workflow.components="http://mdelab/workflow/components/1.0" name="workflow">
  <components xsi:type="workflow.components:WorkflowDelegation" name="workflowDelegation" workflowURI="platform:/plugin/de.mdelab.docdsl.generator/workflow/generate.workflow">
    <propertyValues name="inputModelURI" defaultValue="docdsl/toc.docdsl"/>
    <propertyValues name="outputPath" defaultValue="html"/>
    <propertyValues name="imageFolder" defaultValue="img"/>
  </components>
</workflow:Workflow>
