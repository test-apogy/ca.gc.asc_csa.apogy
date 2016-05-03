# News #
Release 0.5.14 available 2016.05.03-1800EDT ([Download](https://dl.bintray.com/apogy/Releases/0.5/))
# Background #
**Apogy** is a multi-mission operations and planning software framework. **Apogy** uses Eclipse Modeling Framework models to define the systems being controlled, the environment in which these systems are operated, the operations being carried out and the corresponding data produced during operations.

As an example, integrating a rover in **Apogy** is as simple as creating an EMF model that represent its interface (command and telemetry) and defined its topology (i.e. how the physical components are attached together and how the degrees-of-freedom are mapped to the telemetry). Once these two steps are completed, one can visualize the rover in 3D in its environment (showing cameras field of view in 3D, using the generic 3D tools to measure distance, record trajectory, measure sun angle, etc), create commands  and display telemetry (camera views with overlays, filters and tools, recording and playback of data, etc) without having to write a single line of code ! This means that the operator can already start configuring his/her control station, even if there is no real rover to command at that point. Implementing the necessary interface between the generated EMF classes and the hardware (which is usually straightforward) is all that remain to complete the integration and benefit from the many tools already available  in **Apogy**. 

![Apogy Overview](/doc/ca.gc.asc_csa.apogy.doc/resources/main/apogy_overview.jpg "Apogy Overview")

# Eclipse Update Sites #
Description                    | URL          | Notes
------------------------------ | -------------|-------------------------
Stable                         | [https://dl.bintray.com/apogy/Releases/0.5/](https://dl.bintray.com/apogy/Releases/0.5/) | [Changes](https://bitbucket.org/apogy/ca.gc.asc_csa.apogy/src/master/CHANGES), [Version](https://bitbucket.org/apogy/ca.gc.asc_csa.apogy/src/master/VERSION)
Latest                         | [https://dl.bintray.com/apogy/Develop/0.5/](https://dl.bintray.com/apogy/Develop/0.5/) | 

# Documentation #
Description                    | URL
------------------------------ | ---
Main Guide                     | [ftp://ftp.asc-csa.gc.ca/users/apogy/pub/doc/main.html](ftp://ftp.asc-csa.gc.ca/users/apogy/pub/doc/main.html)
Installation                   | [ftp://ftp.asc-csa.gc.ca/users/apogy/pub/doc/installation.html](ftp://ftp.asc-csa.gc.ca/users/apogy/pub/doc/installation.html)
Simple Way To Start            | [ftp://ftp.asc-csa.gc.ca/users/apogy/pub/doc/simple_way_to_start.html](ftp://ftp.asc-csa.gc.ca/users/apogy/pub/doc/simple_way_to_start.html)
Tutorials                      | [ftp://ftp.asc-csa.gc.ca/users/apogy/pub/doc/tutorials.html](ftp://ftp.asc-csa.gc.ca/users/apogy/pub/doc/tutorials.html)
User                    | [ftp://ftp.asc-csa.gc.ca/users/apogy/pub/doc/user.html](ftp://ftp.asc-csa.gc.ca/users/apogy/pub/doc/user.html)
Development                    | [ftp://ftp.asc-csa.gc.ca/users/apogy/pub/doc/dev.html](ftp://ftp.asc-csa.gc.ca/users/apogy/pub/doc/dev.html)
Eclipse Proposal               | [https://projects.eclipse.org/proposals/apogy](https://projects.eclipse.org/proposals/apogy)
Eclipse Conference 2016 Presentation      | [https://www.eclipsecon.org/na2016/sites/default/files/slides/apogy_eclipsecon2016_0.pdf](https://www.eclipsecon.org/na2016/sites/default/files/slides/apogy_eclipsecon2016_0.pdf)

# Medias #
Description                    | URL
------------------------------ | ---
Eclipse Conference 2016 Speaker Pitch   | https://youtu.be/-zb8EgQdXdc