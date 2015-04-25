

# Download and installation #

The Store Example is available as a zip file from the [download page](http://code.google.com/p/archimetrix/downloads/list).

In order to import the example into your workspace, select _File -> Import_ and choose _General -> Archive File_. Then select the zip file that you downloaded, choose a project into which the example should be extracted and click _Finish_.


# Overview of the example #

![http://archimetrix.googlecode.com/svn/wiki/images/StoreExampleArchitecture.png](http://archimetrix.googlecode.com/svn/wiki/images/StoreExampleArchitecture.png)

The image shows the conceptual architecture of the store example. The system consists of eight components. Its central parts are the two components Accounting and Store. They are complemented by components for typical tasks such as Logistics, Payment, Controlling, Database management, Network infrastructure, and user interface (UI).

The implementation of the store example consists of 10 interfaces and 14 classes which are distributed to eight components.
Because the system does only consist of mock-up code it comprises only 150 LOC.
During the implementation, a number of design deficiencies were deliberately introduced into the system.