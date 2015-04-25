# Archimetrix - Iterative Architecture Recovery and Reengineering #

Archimetrix is a tool-supported reengineering process that combines different reverse engineering approaches to enable an iterative recovery and reengineering of component-based software architectures. It is developed by the [Software Engineering Group at the University of Paderborn](http://www.hni.uni-paderborn.de/swt/).

## Overview ##

![http://archimetrix.googlecode.com/svn/wiki/images/process.png](http://archimetrix.googlecode.com/svn/wiki/images/process.png)

Archimetrix combines clustering-based architecture reconstruction and pattern detection techniques to recover the architecture of a software system from source code. While the clustering extracts a software architecture based on source code metrics, the pattern detection is used to detect design deficiencies in the architecture which influence the architecture reconstruction negatively. Archimetrix supports the reengineer by identifying components that are especially relevant for the detection of design deficiencies. It also ranks the detected deficiencies so the reengineer can focus on the important problems. Once the deficiencies are removed, the clustering can be used again to get a clearer view of the now improved software architecture.

Archimetrix currently offers the following features:

  * Analysis of Java, C++, and Delphi code
  * Recovery of a component-based architecture from the code
  * Identification of components that are likely to contain deficiencies
  * Detection of design deficiencies
  * Ranking of deficiencies by their negative impact on the recovered architecture
  * Recommendation and automated execution of reengineering strategies to remove bad smells
  * Preview of the influence of selected reengineering strategies on the architecture.