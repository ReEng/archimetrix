There are two ways to obtain a copy of Archimetrix: Either you install a bundled-up, ready-to-use feature into your Eclipse workbench, or you piece a development version together from different sources. This page describes first the user installation and, after that, the development installation.



# User Installation #

If you only want to try out Archimetrix without actively developing it, there is an Eclipse feature of Archimetrix available for easy installation. Before you install the Archimetrix feature, you need to install few more more steps, as follows

  * (1) Download and install the [Eclipse Modeling Tools (Luna)](https://www.eclipse.org/downloads/index-developer.php) by choosing the your target OS.
  * (2) Select Help -> Install New Software... and from the category Modelling under Eclipse Luna update site install MoDisco SDK and QVT Operational SDK.
  * (3) Select Help -> Install New Software... and install Palladio from the nightly build [site](https://sdqweb.ipd.kit.edu/eclipse/palladio/nightly/).
  * (4) Select Help -> Install New Software... and install SoMoX from the nightly build [site](https://sdqweb.ipd.kit.edu/eclipse/somox/nightly/).
  * (5) Select Help -> Install New Software... and install Reclipse from the [updatesite](https://reclipse-emf.googlecode.com/svn/trunk/org.reclipse.updatesite/).
  * (6) Select Help -> Install New Software... and install Archimetrix from our [update site](https://archimetrix.googlecode.com/svn/branches/ArchimetrixForKepler/org.archimetrix.updatesite/).


### Run Archimetrix ###

Now, you can run Archimetrix as an Eclipse application by creating a new Eclipse instance in the Run configurations. We recommend the following VM arguments: -Xmx1024m -XX:MaxPermSize=512m.

# Developer Installation #

In order to set up Eclipse Luna environment to develop Archimetrix, you need to execute the following steps

  * (1) Download and install the [Eclipse Modeling Tools (Luna)](https://www.eclipse.org/downloads/index-developer.php) by choosing the your target OS.
  * (2) Select Help -> Install New Software... and from the category Modelling under Eclipse Luna update site install MoDisco SDK, and QVT Operational SDK.
  * (3) Select Help -> Install New Software... and install Palladio from the nightly build [site](https://sdqweb.ipd.kit.edu/eclipse/palladio/nightly/).
  * (4) Check out all projects of SoMoX from the trunk folder of [SoMoX repository](https://svnserver.informatik.kit.edu/i43/svn/code/SoMoX/Core/trunk/) (anonymous, anonymous). Alternatively, you may install SoMoX from the nightly build [site](https://sdqweb.ipd.kit.edu/eclipse/somox/nightly/).
  * (5) Check out the required projects (see figure bellow) from [Story diagrams repository](https://svn.codespot.com/a/eclipselabs.org/sdm-commons/). Alternatively, you may install Story diagrams from the nightly build [site](https://sdqweb.ipd.kit.edu/eclipse/storydiagraminterpreter/nightly/).

![http://archimetrix.googlecode.com/svn/wiki/images/plugins/SDPlugins.png](http://archimetrix.googlecode.com/svn/wiki/images/plugins/SDPlugins.png)

  * (6) Check out the required projects (see figure bellow) from
[Reclipse repository](https://reclipse-emf.googlecode.com/svn/trunk/). Alternatively, you may install Reclipse following the installation instructions from [Reclipse project page](https://code.google.com/p/reclipse-emf/).

![http://archimetrix.googlecode.com/svn/wiki/images/plugins/ReclipsePlugins.png](http://archimetrix.googlecode.com/svn/wiki/images/plugins/ReclipsePlugins.png)

  * (7) Finally, check out the projects from [Archimetrix repository](https://archimetrix.googlecode.com/svn/branches/ArchimetrixForKepler/).

![http://archimetrix.googlecode.com/svn/wiki/images/plugins/ArchimetrixPlugins.png](http://archimetrix.googlecode.com/svn/wiki/images/plugins/ArchimetrixPlugins.png)

  * Remark: When you want to want to work with GAST metamodel you need to first install it. Select Help -> Install New Software... and install Gast model  feature from the [update site](http://sissy.sourceforge.net/SISSy_Nightly).

### Run Archimetrix ###

Now, you can run Archimetrix as an Eclipse application by creating a new Eclipse instance in the Run configurations. We recommend the following VM arguments: -Xmx1024m -XX:MaxPermSize=512m.