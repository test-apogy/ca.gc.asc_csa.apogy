**Apogy** is a multi-mission operations and planning software framework. **Apogy** uses Eclipse Modeling Framework models to define the systems being controlled, the environment in which these systems are operated, the operations being carried out and the corresponding data produced during operations.

As an example, integrating a rover in **Apogy** is as simple as creating an EMF model that represent its interface (command and telemetry) and defined its topology (i.e. how the physical components are attached together and how the degrees-of-freedom are mapped to the telemetry). Once these two steps are completed, one can visualize the rover in 3D in its environment (showing cameras field of view in 3D, using the generic 3D tools to measure distance, record trajectory, measure sun angle, etc), create commands  and display telemetry (camera views with overlays, filters and tools, recording and playback of data, etc) without having to write a single line of code ! This means that the operator can already start configuring his/her control station, even if there is no real rover to command at that point. Implementing the necessary interface between the generated EMF classes and the hardware (which is usually straightforward) is all that remain to complete the integration and benefit from the many tools already available  in **Apogy**. 

![Apogy Overview](/doc/ca.gc.asc_csa.apogy.doc/resources/main/apogy_overview.jpg "Apogy Overview")

# Installation #
Description                    | URL            | Status
------------------------------ | -------------  | ---------
Apogy OTS P2 Update Site (ZIP) | [ftp://ftp.asc-csa.gc.ca/users/apogy/pub/apogy_ots/repository/latest/ca.gc.asc_csa.apogy.ots.repository-0.1.0-SNAPSHOT.zip](ftp://ftp.asc-csa.gc.ca/users/apogy/pub/apogy_ots/repository/latest/ca.gc.asc_csa.apogy.ots.repository-0.1.0-SNAPSHOT.zip) | OK
Apogy P2 Update Site (ZIP)     | [ftp://ftp.asc-csa.gc.ca/users/apogy/pub/apogy/repository/latest/ca.gc.asc_csa.apogy.repository-0.5.0-SNAPSHOT.zip](ftp://ftp.asc-csa.gc.ca/users/apogy/pub/apogy/repository/latest/ca.gc.asc_csa.apogy.repository-0.5.0-SNAPSHOT.zip)         | OK
Apogy OTS P2 Update Site       | [ftp://ftp.asc-csa.gc.ca/users/apogy/pub/apogy_ots/repository/latest](ftp://ftp.asc-csa.gc.ca/users/apogy/pub/apogy_ots/repository/latest) | NOT WORKING
Apogy P2 Update Site           | [ftp://ftp.asc-csa.gc.ca/users/apogy/pub/apogy/repository/latest](ftp://ftp.asc-csa.gc.ca/users/apogy/pub/apogy/repository/latest)         | NOT WORKING

# Documentation #
Description                    | URL
------------------------------ | ---
Main Guide                     | [ftp://ftp.asc-csa.gc.ca/users/apogy/pub/doc/main.html](ftp://ftp.asc-csa.gc.ca/users/apogy/pub/doc/main.html)
Installation                   | [ftp://ftp.asc-csa.gc.ca/users/apogy/pub/doc/installation.html](ftp://ftp.asc-csa.gc.ca/users/apogy/pub/doc/installation.html)
Tutorials                      | [ftp://ftp.asc-csa.gc.ca/users/apogy/pub/doc/tutorials.html](ftp://ftp.asc-csa.gc.ca/users/apogy/pub/doc/tutorials.html)
User                    | [ftp://ftp.asc-csa.gc.ca/users/apogy/pub/doc/user.html](ftp://ftp.asc-csa.gc.ca/users/apogy/pub/doc/user.html)
Development                    | [ftp://ftp.asc-csa.gc.ca/users/apogy/pub/doc/dev.html](ftp://ftp.asc-csa.gc.ca/users/apogy/pub/doc/dev.html)
Eclipse Proposal               | [https://projects.eclipse.org/proposals/apogy](https://projects.eclipse.org/proposals/apogy)