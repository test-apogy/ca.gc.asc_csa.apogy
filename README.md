# Background #

**Apogy** exploits the Eclipse platform and modern model based software development tools and techniques such as the Eclipse Modeling Framework (EMF). This approach inherently promotes a highly modular and extendable software architecture that allows customization of functionalities with little effort.

For each system to be controlled, **Apogy** provides a single model that defines: command, telemetry, engineering units, limits, documentation, 3D topology and 3D representation. System assemblies can then be created from these models to build different spacecraft and instrument configurations. The mission target environment can also be defined that includes maps (2D and 3D), locations, annotations as well as location specific and time dependent model of the sky (sun, moon and stars). The framework provides basic operational plan editors that allow, through context switching, the tests and execution of plans in a seamless process.

Teleoperation is supported through flexible hand controller mapping, camera displays with customizable overlays and image filtering, real-time map displays (2D and 3D). **Apogy** maintains rigorously contexts information such as the command and parameter used to generate the plan execution product, timing information and localization. **Apogy** then make use of these informations to provide the overall context of the operations and their products to the engineers and scientists. In the last years, **Apogy** has been used in multiple deployments involving different types of rovers equipped with various sensors and instruments all operated through **Apogy**.  The Canadian Space Agency is in the process to transfer the **Apogy** codebase to Eclipse.* 

![Apogy Overview](/doc/org.eclipse.symphony.doc/resources/main/apogy_overview.jpg "Apogy Overview")

# Installation #
## Notes ##
### History ###
Apogy was previously named Symphony.  It is possible that they are some artifacts that still refer to Symphony.  This will be fixed.
### 3D Acceleration ###
Apogy makes use of 3D.  It is important to install latest & stable version of graphics card 3D drivers.
### Known Bugs ###
* export SWT_GTK3=0
## RCP Installation & Configuration ##
All Apogy RCP applications are based on the same foundation and are packaged the same way.  Apogy RCP applications are self-contained and are packaged in zip format.  Apogy supports the following platform:
* 32-bit Windows
* 64-bit Windows
* 32-bit Linux (GTK)
* 64-bit Linux (GTK) 
### Java Virtual Machine ###
* Ensure a proper Java Runtime Environment (JRE) is installed on your system (1.8 or higher).  You can download JRE from http://www.oracle.com/technetwork/java/javase/downloads/index.html.  
* The virtual machine must be accessible in the PATH.  Type the following commands in a system shell to verify the installed java version.
```
java -version
openjdk version "1.8.0_51"
OpenJDK Runtime Environment (build 1.8.0_51-b16)
OpenJDK 64-Bit Server VM (build 25.51-b03, mixed mode)
```
### Apogy Rich Client Platform Applications ###
* Install Apogy RCP Application
```unzip apogy.product-linux.gtk.x86_64.zip```
* Launch Apogy RCP Application
```
cd apogy;
./apogy (Apogy executable)
```
### Select Workspace ###
The '''Workspace Launcher''' dialog will prompt.  Select the location of the new or the existing workspace.  The workspace will contain the information related to your Apogy session.
## Apogy SDK Installation & Configuration ##
### Eclipse ###
Apogy is based on Eclipse.  The first installation step is the proper installation and configuration of Eclipse.  Eclipse configuration details can be found on https://www.eclipse.org.
### Oomph ###
To install Eclipse platform, we highly recommend to use Eclipse Installer also known as Oomph.
* Get the Eclipse Installer from https://wiki.eclipse.org/Eclipse_Oomph_Installer.
* Extract the archive under '''<ECLIPSE_INSTALLER_HOME>'''.
* Ensure a proper Java Runtime Environment (JRE) is installed on your system (1.8 or higher).  You can download JRE from http://www.oracle.com/technetwork/java/javase/downloads/index.html.
* Copy '''<JRE_HOME>''' directory into '''<ECLIPSE_INSTALLER_HOME>''' directory. You may also use a symbolic link.
```
eclipse;
  configuration
  eclipse
  eclipse.ini
  features
  plugins
  jre      <<<< must include /bin/java
```
* Launch '''<ECLIPSE_INSTALLER_HOME>/eclipse'''
* Select Eclipse Modeling Tools
* Select '''Latest Release (Mars)''' as Product Version
* Select a proper JRE 1.8+ 
* Set the '''Installation Folder''' (e.g. '''<ECLIPSE_HOME>''')
* Click on Install
* Once completed, edit '''<ECLIPSE_HOME>/eclipse.ini''' and change the following lines that set VM memory parameters (see below).
```
Xms256m                              <<<< Replace by -Xms2048m
Xmx1024m                             <<<< Replace by -Xmx2048m
```
* Save your changes.
* Launch the '''<ECLIPSE_HOME>/eclipse'''.
* The '''Workspace Launcher''' dialog will prompt.  Select the location of a new or an existing workspace.  The workspace will contain the information related to your Apogy session.
### Install Eclipse Features ###
#### Eclipse Mars Packages ####
* Install the following packages:
 * Modeling \ EMF - Eclipse Modeling Framework Xcore SDK
#### Sirius Packages ####
* Add the '''Sirius''' P2 Site http://download.eclipse.org/sirius/updates/releases/3.1.1/mars.
* Install the following packages:
 * Sirius/Sirius Core Runtime
 * Sirius/Sirius Runtime Support for Acceleo 3
#### Orbit Packages ####
* Add the '''Orbit''' P2 Site [http://download.eclipse.org/tools/orbit/downloads/drops/R20150821153341/repository/]
* Install the following packages:
 * Orbit Bundles By Name: org.apache.*/org.apache.commons.collections (Be careful select the one that is not the source plugin (1st on top))
 * Orbit Bundles By Name: org.apache.*/org.apache.commons.net
 * Orbit Bundles By Name: org.apache.*/org.apache.commons.pool
#### Nebula Packages ####
* Add the '''Nebula''' P2 Site [http://download.eclipse.org/technology/nebula/snapshot]
* Install the following packages:
 * Nebula Release Individual Widgets/Nebula Gallery Widget
### Install Apogy ###
Apogy is composed of a series of Eclipse features.  The following steps present the way to install them.
#### Third-Party Packages ####
* Clone Apogy Third-Party repository
````
git clone [https://<user>@bitbucket.org/Symphony2Eclipse/org.eclipse.symphony.ots.git]
```
* Create a directory to store a backup of pre-compiled Apogy Third-Party Packages.
```
cd ~
mkdir tmp
```
* Make a temporary copy of '''symphony_ots_repository''', extract the content and launch the executable
```
cp git/org.eclipse.symphony.ots/symphony_ots_repository_0_1.tar.gz ~/tmp
cd ~/tmp
tar -xvf symphony_ots_repository_0_1.tar.gz
cd <ECLIPSE_HOME>
./eclipse
```
* Select the workspace location.
* Add the '''Apogy Third-Party''' Local P2 Site.
* Select and install all the packages.
#### Apogy Packages ####
* Clone Apogy repository
```git clone https://<user>@bitbucket.org/Symphony2Eclipse/org.eclipse.symphony.git
```
### MISC ###
#### ESA Orekit ####
Few '''org.orekit''' fixes are not included in the Apogy Third-Party packages.  
* Import '''org.orekit''' project into the workspace.
#### NASA World Wind ####
The current packaging requires few little steps to ensure proper execution of NASA World Wind packages.
# Import '''gov.nasa.worldwind''' project into the workspace.