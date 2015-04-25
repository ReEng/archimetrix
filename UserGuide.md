

# User Guide #

This page contains a short user guide for Archimetrix.
You can also have a look at the [Archimetrix Screencast](Screencast.md).

The user guide explains the typical Archimetrix workflow by means of the [Store Example](StoreExample.md).
The session follows the Archimetrix process and illustrates the steps with snapshots from the tool.

In order to use Archimetrix, make sure to open the _Archimetrix perspective_.

## 1. Architecture Reconstruction ##

The architecture reconstruction process consists of two steps.
  * Parsing the source code into a generalized abstract syntax tree (GAST) with the parser SISSy.
  * Reconstructing the architecture from the GAST with SoMoX.

### a. Parsing the source code ###
First, the source code of the system under analysis has to be parsed.
As described above, Archimetrix uses SISSy for this task.
SISSy is able to parse Java, C++, and Delphi code and creates an instance of the GAST meta model from it.

SISSy can be started by selecting _Archimetrix -> Extract GAST_ from the menu bar.
This will bring up the _Run Configurations_ dialog.
In this dialog, select _Launch SISSy_ and click on _New launch configuration_.

Before the GAST can be extracted, several properties have to be configured.
  * On the first configuration page, you have to specify where SISSy can find the source code of the system. For this add the source folder of the system to the _Input Paths_, either by clicking on _File System..._ or _Workspace..._. In case of the Store Example, the source code lies in the folder `StoreExample/src`.
  * Next, go to the _Database Settings_ page. SISSy puts all the parsed information into a database before creating the GAST from it. If you have no dedicated database available, select _DERBY_ as the database driver. You also have to specify the _Derby DB Filesystem Base-Path_ where the database information can be stored.
  * Finally, you have to tell SISSy what to do with the GAST. go to the _GAST Output_ page. Tick the _Write GAST output file_ check box. Then specify the path where the GAST file should be saved.
  * Start the GAST extraction by clicking on _Run_.

### b. Reconstructing the software architecture ###
In this step, the GAST is the input for the initial architecture reconstruction step.
The architecture reconstruction is accomplished by SoMoX.
SISSy can be started by selecting _Archimetrix -> Start Architecture Reconstruction_ from the menu bar.
This will bring up the _Run Configurations_ dialog.
In this dialog, select _Launch SoMoX_ and click on _New launch configuration_.

Before the reconstruction is started, SoMoX has to be configured.
  * On the _General_ configuration page, select the project in which the reconstructed architecture model will be stored. In addition, you have to specify the GAST of the system.
  * The metric weights on the _SoMoX Configuration_ page allow, for example, to specify which properties the clustering should focus on. For example, you can put a greater emphasis on the coupling or the name resemblance during the architecture reconstruction. The concrete values are dependent on the system under analysis and have to be determined by the software architect. SoMoX also provides a set of empirically determined default values.
  * On the _Blacklist_ tab of the _SoMoX Configuration_ page, tick the check box of the `java` package.

The following screenshot shows the configuration of the metric weights for the reconstruction of the Store Example architecture.

![http://archimetrix.googlecode.com/svn/wiki/images/SomoxConfig.png](http://archimetrix.googlecode.com/svn/wiki/images/SomoxConfig.png)

As a result of the architecture reconstruction, several models are created in the `models` sub folder of the specified project.
Two of these models are shown here.

![http://archimetrix.googlecode.com/svn/wiki/images/ReconstructedComponents2.png](http://archimetrix.googlecode.com/svn/wiki/images/ReconstructedComponents2.png)

This model shows the reconstructed components, the interfaces with their operations and the detected data types.
For example, the diagram shows in the upper left that the reconstructed component `<PC No.18 ProductsListView>` provides the `IListView` interface with its `createListEntry` operation.
This interface is required by component `<CC No.3>`.
In addition, `PC No.18` requires the interface `ISearch`.

![http://archimetrix.googlecode.com/svn/wiki/images/ReconstructedArchitecture2.png](http://archimetrix.googlecode.com/svn/wiki/images/ReconstructedArchitecture2.png)

Another reconstructed model places an emphasis on the connection of the reconstructed components by visualizing the model as a component diagram.
In this diagram, the interface operations and data types are omitted.
Instead, the connectors between the components are shown.
The reconstructed components are contained in one large component called `SoMoX Reverse Engineered System` representing the system boundary.

## 2. Component Relevance Analysis ##

The second step of the process is the component relevance analysis.
To start it, select _Archimetrix -> Start Architecture Reconstruction_ from the menu bar.

![http://archimetrix.googlecode.com/svn/wiki/images/RelevanceAnalysisConfiguration.png](http://archimetrix.googlecode.com/svn/wiki/images/RelevanceAnalysisConfiguration.png)

For the relevance analysis, you have to specify two inputs:
  * The source code decorator model created by SoMoX. It is typically called `internal_architecture_model.sourcecodedecorator`.
  * The metric values that were measured during the architecture reconstruction. The default name is `metricValues2.ecore2`.
After having specified these values, you can start the relevance analysis by clicking on _Finish_.

The results of this analysis are shown in a special tabular overview.

![http://archimetrix.googlecode.com/svn/wiki/images/screen_relevantComponentsView2.png](http://archimetrix.googlecode.com/svn/wiki/images/screen_relevantComponentsView2.png)

The view consists of five columns.
The first column contains the name of the component in question.
(The names are automatically generated and assigned by SoMoX.)
The following columns show the concrete metric values that were calculated for that component during the relevance analysis.
These are the values of the single relevance metrics (Closeness To Threshold, Complexity) as well as of the aggregated value.
The last column indicates if the relevance value of the component is Pareto optimal with respect to the other components.
Pareto optimal (i.e.\ very relevant) components are also highlighted in yellow.


## 3. Design Deficiency Detection ##

The components for which the deficiency detection is executed can be selected by the software architect.
Typically, he will choose a subset of those components that were identified as the most relevant in the relevance analysis.
The selection can be performed in two different ways: in the _Relevant Components View_ or in the _Structural Patterns Detection Dialog_.

### a. Starting the deficiency detection from the Relevant Components View ###

The deficiency detection can be started directly from the _Relevant Components View_.
Right-click on the component in which you want to detect the deficiencies and select _Start Deficiency Detection on this component_.

![http://archimetrix.googlecode.com/svn/wiki/images/screenSelectComponentsForDetection1.png](http://archimetrix.googlecode.com/svn/wiki/images/screenSelectComponentsForDetection1.png)

In the following dialog, you can then select the deficiency catalog that shall be used.
For the Store Example, the catalog is called `ComponentBasedBadSmellCatalog.psc`.
Click on _Finish_ to start the detection.

### b. Starting the deficiency detection from the Structural Patterns Detection Dialog. ###

The deficiency detection can also be started independently from the relevance analysis.
From the menu bar, select _Archimetrix -> Detect Design Deficiencies_.
The figure shows the selection dialogue for the reconstructed components.

In the appearing dialog, two inputs have to be chosen:
  * For _Pattern Specifications_, select the deficiency catalog that is to be used in the detection. For the Store Example, the catalog is called `ComponentBasedBadSmellCatalog.psc`.
  * For _Host Graph Model_, select the source code decorator model. In the Store Example, it is called `internal_architecture_model.sourcecodedecorator`.
Click _Next >_.

On the next page, you can choose the components in which the detection should search for deficiencies.
In contrast to starting the detection from the _Relevant Components View_, you can also select more than one component in this dialog.

![http://archimetrix.googlecode.com/svn/wiki/images/screenSelectComponentsForDetection2.png](http://archimetrix.googlecode.com/svn/wiki/images/screenSelectComponentsForDetection2.png)

Click _Finish_ to start the detection.

### c. Inspecting the detection results ###

The detected deficiency occurrences are presented in a list in the _Annotations View_.

![http://archimetrix.googlecode.com/svn/wiki/images/screenDetectedOccurrences.png](http://archimetrix.googlecode.com/svn/wiki/images/screenDetectedOccurrences.png)

The different detected deficiency occurrences (and their auxiliary patterns) are grouped by their type.
The detected deficiency occurrences can also be inspected individually.
Archimetrix offers three different views for the visualization of detection results: the _Abstract Syntax Tree Matchings View_, the _Host Graph View_, and the _Pattern Matchings View_.
The views can be opened by selecting _Window -> Show View -> Other..._ from the menu bar and then selecting the desired view from the _Structural Inference_ category.

![http://archimetrix.googlecode.com/svn/wiki/images/screenDetectedIV.png](http://archimetrix.googlecode.com/svn/wiki/images/screenDetectedIV.png)

The figure shows the host graph view of a detected occurrence of an Interface Violation deficiency.
It shows the section of the GAST which is involved in this deficiency occurrence.
It is layouted similar to the deficiency formalisation in order to facilitate its interpretation by the software architect.
In addition, it also shows selected attribute values of the elements from the host graph, e.g. the names of the objects.

### d. Storing the detection results ###

The detection results can be stored in a file.
To do this, open the _Annotations View_ and click on the ![http://archimetrix.googlecode.com/svn/wiki/images/export.gif](http://archimetrix.googlecode.com/svn/wiki/images/export.gif) _Save Annotations_ button.
Stored detection results can also be loaded again by clicking on the ![http://archimetrix.googlecode.com/svn/wiki/images/import.gif](http://archimetrix.googlecode.com/svn/wiki/images/import.gif) _Load Annotations_ button and selecting a previously saved annotations file.

## 4. Design Deficiency Ranking ##
In the next step, the detected deficiency occurrences are ranked in order to identify the occurrences that are the most critical.
This is accomplished by the deficiency ranking.
It can be performed by selecting _Archimetrix -> Find Relevant Deficiencies_ from the menu bar.

![http://archimetrix.googlecode.com/svn/wiki/images/DeficiencyRankingConfiguration.png](http://archimetrix.googlecode.com/svn/wiki/images/DeficiencyRankingConfiguration.png)

The two inputs for the ranking are:
  * A file with the detected deficiency occurrences. The typical suffix of these files is `.psa`.
  * The metric values that were measured during the architecture reconstruction (the same values that are used in the component relevance analysis).
Click _Finish_ to start the deficiency ranking.

The results of the deficiency ranking are presented in a tabular view similar to the relevance analysis results.

![http://archimetrix.googlecode.com/svn/wiki/images/screen_relevantBadSmellsView2.png](http://archimetrix.googlecode.com/svn/wiki/images/screen_relevantBadSmellsView2.png)

The first column shows the name of the deficiency while the second column states the elements (classes and methods) that play the different roles of the deficiency.
Columns three and four show the particular ranking values while the fifth column presents the aggregated rank of the deficiency occurrence.
The last column states if the deficiency occurrence is Pareto optimal with respect to the other occurrences.
Again, the Pareto optimal deficiencies are highlighted in yellow.
Those are the most critical deficiency occurrences that should be removed first.

## 5. Automatic Deficiency Removal and Architecture Preview ##

After the detected deficiency occurrences have been ranked, the software architect can remove them according to their severity.
He can either remove the deficiency manually by changing the source code of the system.
In that case, he has to begin the next cycle of the Archimetrix process with parsing the changed source code into a new GAST.
He can also use automatic model transformations to remove the deficiencies.
In the current implementation, Story Diagrams are used for this purpose.
If such an automatic transformation is used to remove a deficiency occurrence, the architect can preview the effect that the removal has on the system under analysis.

This example presents the automatic removal of one deficiency occurrence through the application of a removal strategy.
For this, the software architect first has to select the deficiency occurrence that is to be removed.
In the _Relevant Deficiencies View_, right-click on the deficiency occurrence for which the architecture preview should be performed and select _View Architecture Preview for this Deficiency Occurrence_ from the context menu.

![http://archimetrix.googlecode.com/svn/wiki/images/screenStartArchitecturePreview.png](http://archimetrix.googlecode.com/svn/wiki/images/screenStartArchitecturePreview.png)

Archimetrix then shows the automatic removal strategies that are applicable to this type of deficiency.

![http://archimetrix.googlecode.com/svn/wiki/images/reengineering_startegies_wizard_page.png](http://archimetrix.googlecode.com/svn/wiki/images/reengineering_startegies_wizard_page.png)

The architectural changes that are to be expected are shown in the _Architecture Preview View_.

![http://archimetrix.googlecode.com/svn/wiki/images/screen_architecturePreviewView2.png](http://archimetrix.googlecode.com/svn/wiki/images/screen_architecturePreviewView2.png)

The architecture preview consists of two parts.
The upper part contains general information about the original architecture and the previewed architecture.
This information includes the number of components in the architecture, divided into primitive and composite components, and the number of interfaces.
Value changes between the two architectures are emphasized in yellow.

The lower part lists all the components of the original architecture (left) and the previewed architecture (right), respectively.
Components that exist unchanged in both versions of the architecture are not marked.
Components that existed in the original architecture but no longer exist in the previewed architecture are marked red.
These components are no longer reconstructed as they were before the reengineering.
Components which still exist but which contain different components and classes than before are marked yellow.
Finally, components which did not exist in the original architecture but are newly reconstructed after reengineering are marked green.

After the architecture preview is shown, the reengineering can be executed by applying the automated removal strategy.
This will remove the selected deficiency occurrence by transforming the GAST of the system.