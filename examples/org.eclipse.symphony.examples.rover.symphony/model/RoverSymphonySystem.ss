<?xml version="1.0" encoding="UTF-8"?>
<core:SymphonySystem xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:topology="org.eclipse.symphony.common.topology" xmlns:core="org.eclipse.symphony.core" xmlns:ecore="org.eclipse.symphony.common.emf" xmlns:ecore_1="http://www.eclipse.org/emf/2002/Ecore" xmi:id="_OeyMoArPEeW4-_ONWXXiAw" name="RoverSymphonySystem" poseProvider="_OeyMpArPEeW4-_ONWXXiAw">
  <members xmi:id="_OeyMoQrPEeW4-_ONWXXiAw" name="roboticArm">
    <memberType href="platform:/plugin/ca.gc.asc_csa.symphony.examples.robotic_arm/model/RoboticArmSymphonySystem.ss#_LQwxcArPEeW4-_ONWXXiAw"/>
    <typeFeatureRootNode xmi:id="_OeyMogrPEeW4-_ONWXXiAw">
      <children xsi:type="ecore:TreeFeatureNode" xmi:id="_OeyMowrPEeW4-_ONWXXiAw">
        <structuralFeature xsi:type="ecore_1:EReference" href="org.eclipse.symphony.examples.rover#//Rover/roboticArm"/>
      </children>
      <sourceClass href="org.eclipse.symphony.examples.rover#//Rover"/>
    </typeFeatureRootNode>
  </members>
  <members xmi:id="_OeyMpArPEeW4-_ONWXXiAw" name="mobilePlatform">
    <memberType href="platform:/plugin/ca.gc.asc_csa.symphony.examples.mobile_platform/model/MobilePlatformSymphonySystem.ss#_aD78wArNEeW4-_ONWXXiAw"/>
    <typeFeatureRootNode xmi:id="_OeyMpQrPEeW4-_ONWXXiAw">
      <children xsi:type="ecore:TreeFeatureNode" xmi:id="_OeyzsArPEeW4-_ONWXXiAw">
        <structuralFeature xsi:type="ecore_1:EReference" href="org.eclipse.symphony.examples.rover#//Rover/mobilePlatform"/>
      </children>
      <sourceClass href="org.eclipse.symphony.examples.rover#//Rover"/>
    </typeFeatureRootNode>
  </members>
  <members xmi:id="_OeyzsQrPEeW4-_ONWXXiAw" name="armCamera">
    <memberType href="platform:/plugin/ca.gc.asc_csa.symphony.examples.camera/model/PTUCameraSymphonySystem.ss#_1LPEwArOEeW4-_ONWXXiAw"/>
    <typeFeatureRootNode xmi:id="_OeyzsgrPEeW4-_ONWXXiAw">
      <children xsi:type="ecore:TreeFeatureNode" xmi:id="_OeyzswrPEeW4-_ONWXXiAw">
        <structuralFeature xsi:type="ecore_1:EReference" href="org.eclipse.symphony.examples.rover#//Rover/armCamera"/>
      </children>
      <sourceClass href="org.eclipse.symphony.examples.rover#//Rover"/>
    </typeFeatureRootNode>
  </members>
  <members xmi:id="_OeyztArPEeW4-_ONWXXiAw" name="centerCamera">
    <memberType href="platform:/plugin/ca.gc.asc_csa.symphony.examples.camera/model/PTUCameraSymphonySystem.ss#_1LPEwArOEeW4-_ONWXXiAw"/>
    <typeFeatureRootNode xmi:id="_OeyztQrPEeW4-_ONWXXiAw">
      <children xsi:type="ecore:TreeFeatureNode" xmi:id="_OeyztgrPEeW4-_ONWXXiAw">
        <structuralFeature xsi:type="ecore_1:EReference" href="org.eclipse.symphony.examples.rover#//Rover/centerCamera"/>
      </children>
      <sourceClass href="org.eclipse.symphony.examples.rover#//Rover"/>
    </typeFeatureRootNode>
  </members>
  <interfaceClass href="org.eclipse.symphony.examples.rover#//Rover"/>
  <typeApiAdapterClass href="org.eclipse.symphony.examples.rover.symphony#//RoverSymphonySystemApiAdapter"/>
  <topologyRoot xmi:id="_OeyztwrPEeW4-_ONWXXiAw">
    <originNode xsi:type="topology:AggregateGroupNode" xmi:id="_OeyzuArPEeW4-_ONWXXiAw" description="The root node for the rover" nodeId="ROVER_SYM_SYS_ROOT">
      <aggregatedChildren xsi:type="topology:TransformNode" xmi:id="_OeyzuQrPEeW4-_ONWXXiAw" parent="_OeyzuArPEeW4-_ONWXXiAw" description="The rover's connection point for a mobile platform" nodeId="ROVER_SYM_SYS_MOBILE_PLATFORM">
        <position xmi:id="_OeyzugrPEeW4-_ONWXXiAw"/>
        <rotationMatrix xmi:id="_OeyzuwrPEeW4-_ONWXXiAw"/>
      </aggregatedChildren>
    </originNode>
  </topologyRoot>
  <bindingSet xmi:id="_OeyzvArPEeW4-_ONWXXiAw">
    <featureRootsList xmi:id="_OeyzvQrPEeW4-_ONWXXiAw"/>
    <bindingsList xmi:id="_OeyzvgrPEeW4-_ONWXXiAw"/>
  </bindingSet>
  <connectionPointsList xmi:id="_OeyzvwrPEeW4-_ONWXXiAw">
    <connectionPoints xmi:id="_OeyzwArPEeW4-_ONWXXiAw" name="ROVER_SYM_SYS_CONNECT_MOBILE_PLATFORM" description="The connection point for the mobile platform " node="_OeyzuQrPEeW4-_ONWXXiAw"/>
  </connectionPointsList>
  <assemblyLinksList xmi:id="_OeyzwQrPEeW4-_ONWXXiAw">
    <assemblyLinks xmi:id="_OeyzwgrPEeW4-_ONWXXiAw" name="ROVER_SYM_SYS_LINK_MOBILE_PLATFORM" description="The link from the rover to the mobile platform" subSystemTypeMember="_OeyMpArPEeW4-_ONWXXiAw" parentConnectionPoint="_OeyzwArPEeW4-_ONWXXiAw"/>
    <assemblyLinks xmi:id="_OeyzwwrPEeW4-_ONWXXiAw" name="ROVER_SYM_SYS_LINK_ROBOTIC_ARM" description="The link between the mobile platform and the robotic arm" parentTypeMember="_OeyMpArPEeW4-_ONWXXiAw" subSystemTypeMember="_OeyMoQrPEeW4-_ONWXXiAw">
      <parentConnectionPoint href="platform:/plugin/ca.gc.asc_csa.symphony.examples.mobile_platform/model/MobilePlatformSymphonySystem.ss#_aD9K-grNEeW4-_ONWXXiAw"/>
    </assemblyLinks>
    <assemblyLinks xmi:id="_OeyzxArPEeW4-_ONWXXiAw" name="ROVER_SYM_SYS_LINK_ARM_CAMERA" description="The assembly link between the robotic arm and the arm camera" parentTypeMember="_OeyMoQrPEeW4-_ONWXXiAw" subSystemTypeMember="_OeyzsQrPEeW4-_ONWXXiAw">
      <parentConnectionPoint href="platform:/plugin/ca.gc.asc_csa.symphony.examples.robotic_arm/model/RoboticArmSymphonySystem.ss#_LQx_pQrPEeW4-_ONWXXiAw"/>
    </assemblyLinks>
    <assemblyLinks xmi:id="_OeyzxQrPEeW4-_ONWXXiAw" name="ROVER_SYM_SYS_LINK_SIDE_CAMERA" description="The link between the mobile platform and the side camera" parentTypeMember="_OeyMpArPEeW4-_ONWXXiAw" subSystemTypeMember="_OeyztArPEeW4-_ONWXXiAw">
      <parentConnectionPoint href="platform:/plugin/ca.gc.asc_csa.symphony.examples.mobile_platform/model/MobilePlatformSymphonySystem.ss#_aD9K-wrNEeW4-_ONWXXiAw"/>
    </assemblyLinks>
  </assemblyLinksList>
</core:SymphonySystem>
