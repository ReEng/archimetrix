The pattern detection in Reclipse consists of three basic parts:

  1. _Formalization_ of the patterns that are to be detected.
  1. _Generation_ of detection engines (i.e. story diagrams) from the formalized patterns.
  1. _Detection_ of the patterns by executing the generated engines.



In addition to this documentation, you should also have a look at the _Reclipse Help Plug-In (org.reclipse.structure.help)_ that can be found in the Reclipse repository (https://svn-serv.cs.upb.de/reclipse-emf/).

# Pattern Formalization #

Structural patterns can be specified in a graphical DSL using a GEF editor. The patterns show object structures that represent a certain design pattern or design deficiency and that are to be detected in the host graph.

![http://archimetrix.googlecode.com/svn/wiki/images/PatternFormalizationEditor.png](http://archimetrix.googlecode.com/svn/wiki/images/PatternFormalizationEditor.png)

The formalizations consist of the following major parts:

  * **Mandatory, core elements**: Normal objects and links which are displayed in black in the concrete syntax. The objects and links have to be found in the host graph for a pattern occurrence to be present. All constraints on mandatory objects have to hold (except for constraints that are explicitly marked as additional).
  * **Negative elements**: Negative objects and links are crossed out in the concrete syntax (e.g the _publicConstructor_ object in the screenshot above). If these elements are found, that means that no valid pattern occurrence exists at that point of the host graph.
  * **Set fragments**: In some cases, it is necessary to express that a pattern can contain more than one occurrence of a certain object (e.g. more than one concrete startegy in a strategy pattern). This can be achieved by enclosing the group of objects in a set fragment. If only one object should can exist more often than once, a short-hand notation for the set fragment is the (semantically equivalent) "set object" which is displayed with a stacked border. Note that sets may always be empty, i.e. they are realized with a 0..`*` semantics.
  * **Additonal elements**: Sometimes, the existence of certain objects or constraints is not necessary for the existence of a pattern. However, their existence would increase the confidence, that the detected pattern is indeed a true positive. These elements can be marked as additional. Additional objects are displayed with a dashed border, additional constraints are marked by an appended _{additional}_. In the screenshot above, the constraint on the _simpleName_ attribute of the _accessorMethod_ object is marked as additional.
  * **Sub patterns**: Pattern formalizations can make use of sub patterns, similar to method calls. That way, formalizations can be partitioned and reused. Sub patterns are displayed by black ellipses.
  * **The annotation**: If a pattern is detected, a corresponding annotation of the type _"PatternName"Annotation_ is created. In the formalization this is represented by a green ellipse marked with the modifier _create_. This annotation is created together with a new formalization and cannot be altered by the user. The links from the annotation to objects mark the roles of the pattern. An arbitrary number of these role links can be added by the user by drawing links to the objects in question and naming them.

More examples and explanations about the DSL can be found here:
  * [Ph.D. thesis by Jörg Niere (German)](http://ubdok.uni-paderborn.de/servlets/DocumentServlet?id=5163)
  * [Ph.D. thesis by Lothar Wendehals (German)](http://ubdok.uni-paderborn.de/servlets/DocumentServlet?id=5625)
  * [Ph.D. thesis by Matthias Meyer (German)](http://ubdok.uni-paderborn.de/servlets/DocumentServlet?id=11678)
  * Technical report: https://www.hni.uni-paderborn.de/publikationen/publikationen/?tx_hnippview_pi1[publikation]=6951


## Metamodel registration ##
The objects are typed over a EMF metamodel. In the case of Archimetrix, this metamodel is the combination of Source Code Decorator metamodel, SAM metamodel, and GAST metamodel. The registration of metamodels can be accomplished via the extension point _org.reclipse.structure.specification.metamodel_. The registration of the metamodels used in Archimetrix is performed in the plug-in _org.reclipse.gast_.



# Engine Generation #

## Generation Process ##

The picture shows the general process for the generation of detection engines from the pattern formalizations.

![http://archimetrix.googlecode.com/svn/wiki/images/EngineGenerationProcess.png](http://archimetrix.googlecode.com/svn/wiki/images/EngineGenerationProcess.png)

The engines are generated into an Ecore file which is typically named _"catalogName".psc.ecore_. This Ecore file contains two packages:
  * One package for the annotations and
  * one package for the engines.

For every pattern formalization, an annotation class is generated in the annotations package. Objects of these annotation classes are created during the pattern detection and attached to the pattern occurrences in the host graph.

In the engines package, an engine class is created for each to pattern formalization, provided it is not an abstract pattern. (Abstract patterns only define the roles that are played in a pattern but not how they are connected, i.e. they cannot be detected in the host graph but have to be extended by concrete patterns).

The engine class contains three methods:

  1. _annotate_: This is the main method for the detection of a corresponding pattern. It tries to match the core objects of the pattern in the host graph and calls the other methods if necessary.
  1. _findAdditionalElements_: This method is used to find additonal elements of a pattern in the host graph. It is only generated if the pattern contains additional elements.
  1. _findSetFragments_: Tries to find as many instances of the specified set fragments as possible. It is only generated if there are set fragments in the pattern.

## Generation of expressions ##

Originally, the story diagram meta model was devised with a complete sub package for the modeling of expressions. However, this was pretty complicated and noone ever created a working interpreter for that. Therefore, in the current version of the SD metamodel as described in the techreport v0.2 (https://www.hni.uni-paderborn.de/publikationen/publikationen/?tx_hnippview_pi1[publikation]=6886), OCL is used for the evaluation of expression.

The different constraints that can be modeled in Reclipse patterns (e.g. attribute constraints) are translated into OCL constraints by the class _org.reclipse.structure.generator.util.ExpressionsUtil_.

# Pattern Detection #
The following acticity describes the pattern detection process.

![http://archimetrix.googlecode.com/svn/wiki/images/PatternDetectionProcess.png](http://archimetrix.googlecode.com/svn/wiki/images/PatternDetectionProcess.png)

The pattern detection is performed by an _InferenceEngine_ which is configured by an _InferenceStrategy_.

  1. In the current implementation, the default is an _InterpreterInferenceEngine_ which is configured with a _BottomUpStrategy_. This is due to the use of an inference engine that _interprets_ the generated detection engines, i.e. the story diagrams. This is done by first interpreting the most basic story diagrams that do not use other story diagrams and then building on the results of those detections. For example, the simple _Generalization_ pattern would be detected before a _Strategy_ pattern because a strategy pattern makes use of generalization relationships.
  1. The matching is started by identifying all _trigger nodes_ in the host graph. For every pattern formalization, a trigger node is determined automatically by the class _org.reclipse.structure.specification.util.TriggerManager_. If for example, an object of the type GASTClass is chosen as the trigger, the detection of this pattern will start at all the objects of the type GASTClass in the host graph. Each of this objects if the _context_ for one attempt to match a pattern occurrence. Each combination of a context and a pattern that is the starting point for such a matching is called a _ContextPatternPair_.
    1. If a pattern uses sub patterns, one of the sub pattern annotations is always chosen as the trigger because these sub patterns have to be detected first.
    1. Each _InferenceStrategy_ maintains a queue of context pattern pairs. At the beginning of the detection, this queue is filled with context pattern pairs that are built from simple pattern (which do not make use of sub patterns) and their trigger objects. Each time when a pattern occurrence is detected, it is checked whether the annotation of the detected pattern occurrence is the trigger in one of the more complex patterns. If that is the case, a new context pattern pair is created (from the newly created annotation and the complex pattern) and enqueued.
  1. For every pattern, first its mandatory, non-negative core elements are matched. If these cannot be detected, there are no valid occurrences of this pattern in the host graph.
