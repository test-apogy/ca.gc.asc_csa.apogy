<?xml version="1.0" encoding="UTF-8"?>
<core:SymphonySystem xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:bindings="ca.gc.asc_csa.topology.bindings" xmlns:ca.gc.space.topology="http:///ca/gc/space/topology.ecore" xmlns:core="org.eclipse.symphony.core" xmlns:ecore="ca.gc.asc_csa.eclipse.emf.ecore" xmlns:ecore_1="http://www.eclipse.org/emf/2002/Ecore" xmlns:vehicle="org.eclipse.symphony.addons.vehicle" xmi:id="_aD78wArNEeW4-_ONWXXiAw" name="MobilePlatformSymphonySystem">
  <interfaceClass href="org.eclipse.symphony.examples.mobile_platform#//MobilePlatform"/>
  <typeApiAdapterClass href="org.eclipse.symphony.examples.mobile_platform.symphony#//MobilePlatformSymphonySystemApiAdapter"/>
  <topologyRoot xmi:id="_aD78wQrNEeW4-_ONWXXiAw">
    <originNode xsi:type="ca.gc.space.topology:AggregateGroupNode" xmi:id="_aD78wgrNEeW4-_ONWXXiAw" description="The root node of the mobile platform's topology" nodeId="MOBILE_PLATFORM_SYM_SYS_ROOT">
      <aggregatedChildren xsi:type="ca.gc.space.topology:TransformNode" xmi:id="_aD78wwrNEeW4-_ONWXXiAw" parent="_aD78wgrNEeW4-_ONWXXiAw" description="The required transform to get from the root to the right front wheel axle" nodeId="MOBILE_PLATFORM_SYM_SYS_RIGHT_FRONT_WHEEL_AXLE">
        <aggregatedChildren xsi:type="ca.gc.space.topology:TransformNode" xmi:id="_aD78xArNEeW4-_ONWXXiAw" parent="_aD78wwrNEeW4-_ONWXXiAw" description="The required transformation to get from the mobile platform's front right wheel axle to its respective wheel joint" nodeId="MOBILE_PLATFORM_SYM_SYS_RIGHT_FRONT_WHEEL_JOINT">
          <aggregatedChildren xsi:type="ca.gc.space.topology:TransformNode" xmi:id="_aD78xQrNEeW4-_ONWXXiAw" parent="_aD78xArNEeW4-_ONWXXiAw" description="The required transformation to get from the right front wheel joint to the its respective CAD" nodeId="MOBILE_PLATFORM_SYM_SYS_RIGHT_FRONT_WHEEL_CAD_TRANSFORM">
            <aggregatedChildren xsi:type="ca.gc.space.topology:URLNode" xmi:id="_aD78xgrNEeW4-_ONWXXiAw" parent="_aD78xQrNEeW4-_ONWXXiAw" description="The CAD for the right front wheel" nodeId="MOBILE_PLATFORM_SYM_SYS_RIGHT_FRONT_WHEEL_CAD" url="platform:/plugin/org.eclipse.symphony.examples.mobile_platform.symphony/vrml/CSA_Wheel_Symphony_Scaled.wrl"/>
            <position xmi:id="_aD78xwrNEeW4-_ONWXXiAw"/>
            <rotationMatrix xmi:id="_aD78yArNEeW4-_ONWXXiAw" m00="-1.0" m01="-1.2246467991473532E-16" m10="1.2246467991473532E-16" m11="-1.0"/>
          </aggregatedChildren>
          <position xmi:id="_aD78yQrNEeW4-_ONWXXiAw"/>
          <rotationMatrix xmi:id="_aD78ygrNEeW4-_ONWXXiAw"/>
        </aggregatedChildren>
        <aggregatedChildren xsi:type="vehicle:Wheel" xmi:id="_aD8j0ArNEeW4-_ONWXXiAw" parent="_aD78wwrNEeW4-_ONWXXiAw" description="The mobile platform's right front wheel" nodeId="MOBILE_PLATFORM_SYM_SYS_RIGHT_FRONT_WHEEL" radius="0.38" lenght="0.17">
          <physicalProperties xmi:id="_aD8j0QrNEeW4-_ONWXXiAw">
            <inertiaMatrix xmi:id="_aD8j0grNEeW4-_ONWXXiAw"/>
            <centerOfMassLocation xmi:id="_aD8j0wrNEeW4-_ONWXXiAw"/>
          </physicalProperties>
          <centerOfMassKinematicState xmi:id="_aD8j1ArNEeW4-_ONWXXiAw"/>
        </aggregatedChildren>
        <position xmi:id="_aD8j1QrNEeW4-_ONWXXiAw" x="0.425" y="-0.63" z="0.375"/>
        <rotationMatrix xmi:id="_aD8j1grNEeW4-_ONWXXiAw"/>
      </aggregatedChildren>
      <aggregatedChildren xsi:type="ca.gc.space.topology:TransformNode" xmi:id="_aD8j1wrNEeW4-_ONWXXiAw" parent="_aD78wgrNEeW4-_ONWXXiAw" description="The required transformation to get from the root to the mobile platform's left front wheel axle" nodeId="MOBILE_PLATFORM_SYM_SYS_LEFT_FRONT_WHEEL_AXLE">
        <aggregatedChildren xsi:type="ca.gc.space.topology:TransformNode" xmi:id="_aD8j2ArNEeW4-_ONWXXiAw" parent="_aD8j1wrNEeW4-_ONWXXiAw" description="The required transformation to get from the mobile platform's left front wheel axle to its respective wheel joint" nodeId="MOBILE_PLATFORM_SYM_SYS_LEFT_FRONT_WHEEL_JOINT">
          <aggregatedChildren xsi:type="ca.gc.space.topology:URLNode" xmi:id="_aD8j2QrNEeW4-_ONWXXiAw" parent="_aD8j2ArNEeW4-_ONWXXiAw" description="The CAD for the left front wheel" nodeId="MOBILE_PLATFORM_SYM_SYS_LEFT_FRONT_WHEEL_CAD" url="platform:/plugin/org.eclipse.symphony.examples.mobile_platform.symphony/vrml/CSA_Wheel_Symphony_Scaled.wrl"/>
          <position xmi:id="_aD8j2grNEeW4-_ONWXXiAw"/>
          <rotationMatrix xmi:id="_aD8j2wrNEeW4-_ONWXXiAw"/>
        </aggregatedChildren>
        <aggregatedChildren xsi:type="vehicle:Wheel" xmi:id="_aD8j3ArNEeW4-_ONWXXiAw" parent="_aD8j1wrNEeW4-_ONWXXiAw" description="The mobile platform's left front wheel" nodeId="MOBILE_PLATFORM_SYM_SYS_LEFT_FRONT_WHEEL" radius="0.38" lenght="0.17">
          <physicalProperties xmi:id="_aD8j3QrNEeW4-_ONWXXiAw">
            <inertiaMatrix xmi:id="_aD8j3grNEeW4-_ONWXXiAw"/>
            <centerOfMassLocation xmi:id="_aD8j3wrNEeW4-_ONWXXiAw"/>
          </physicalProperties>
          <centerOfMassKinematicState xmi:id="_aD8j4ArNEeW4-_ONWXXiAw"/>
        </aggregatedChildren>
        <position xmi:id="_aD8j4QrNEeW4-_ONWXXiAw" x="0.425" y="0.63" z="0.375"/>
        <rotationMatrix xmi:id="_aD8j4grNEeW4-_ONWXXiAw"/>
      </aggregatedChildren>
      <aggregatedChildren xsi:type="ca.gc.space.topology:TransformNode" xmi:id="_aD8j4wrNEeW4-_ONWXXiAw" parent="_aD78wgrNEeW4-_ONWXXiAw" description="The required transformation to get from the root to the right rear wheel axle" nodeId="MOBILE_PLATFORM_SYM_SYS_RIGHT_REAR_WHEEL_AXLE">
        <aggregatedChildren xsi:type="ca.gc.space.topology:TransformNode" xmi:id="_aD8j5ArNEeW4-_ONWXXiAw" parent="_aD8j4wrNEeW4-_ONWXXiAw" description="The required transformation to get from the right rear wheel's axle to its respective wheel joint" nodeId="MOBILE_PLATFORM_SYM_SYS_RIGHT_REAR_WHEEL_JOINT">
          <aggregatedChildren xsi:type="ca.gc.space.topology:TransformNode" xmi:id="_aD8j5QrNEeW4-_ONWXXiAw" parent="_aD8j5ArNEeW4-_ONWXXiAw" description="The required transformation to get from the right rear wheel joint to its respective CAD" nodeId="MOBILE_PLATFORM_SYM_SYS_RIGHT_REAR_WHEEL_CAD_TRANSFORM">
            <aggregatedChildren xsi:type="ca.gc.space.topology:URLNode" xmi:id="_aD8j5grNEeW4-_ONWXXiAw" parent="_aD8j5QrNEeW4-_ONWXXiAw" description="The CAD for the right rear wheel" nodeId="MOBILE_PLATFORM_SYM_SYS_RIGHT_REAR_WHEEL_CAD" url="platform:/plugin/org.eclipse.symphony.examples.mobile_platform.symphony/vrml/CSA_Wheel_Symphony_Scaled.wrl"/>
            <position xmi:id="_aD8j5wrNEeW4-_ONWXXiAw"/>
            <rotationMatrix xmi:id="_aD8j6ArNEeW4-_ONWXXiAw" m00="-1.0" m01="-1.2246467991473532E-16" m10="1.2246467991473532E-16" m11="-1.0"/>
          </aggregatedChildren>
          <position xmi:id="_aD8j6QrNEeW4-_ONWXXiAw"/>
          <rotationMatrix xmi:id="_aD8j6grNEeW4-_ONWXXiAw"/>
        </aggregatedChildren>
        <aggregatedChildren xsi:type="vehicle:Wheel" xmi:id="_aD8j6wrNEeW4-_ONWXXiAw" parent="_aD8j4wrNEeW4-_ONWXXiAw" description="The mobile platform's right rear wheel" nodeId="MOBILE_PLATFORM_SYM_SYS_RIGHT_REAR_WHEEL" radius="0.38" lenght="0.17">
          <physicalProperties xmi:id="_aD8j7ArNEeW4-_ONWXXiAw">
            <inertiaMatrix xmi:id="_aD8j7QrNEeW4-_ONWXXiAw"/>
            <centerOfMassLocation xmi:id="_aD8j7grNEeW4-_ONWXXiAw"/>
          </physicalProperties>
          <centerOfMassKinematicState xmi:id="_aD8j7wrNEeW4-_ONWXXiAw"/>
        </aggregatedChildren>
        <position xmi:id="_aD8j8ArNEeW4-_ONWXXiAw" x="-0.425" y="-0.63" z="0.375"/>
        <rotationMatrix xmi:id="_aD8j8QrNEeW4-_ONWXXiAw"/>
      </aggregatedChildren>
      <aggregatedChildren xsi:type="ca.gc.space.topology:TransformNode" xmi:id="_aD8j8grNEeW4-_ONWXXiAw" parent="_aD78wgrNEeW4-_ONWXXiAw" description="The required transformation to go from the root to the left rear wheel axle" nodeId="MOBILE_PLATFORM_SYM_SYS_LEFT_REAR_WHEEL_AXLE">
        <aggregatedChildren xsi:type="ca.gc.space.topology:TransformNode" xmi:id="_aD8j8wrNEeW4-_ONWXXiAw" parent="_aD8j8grNEeW4-_ONWXXiAw" description="The required transformation to go from the left rear wheel axle to its respective wheel joint" nodeId="MOBILE_PLATFORM_SYM_SYS_LEFT_REAR_WHEEL_JOINT">
          <aggregatedChildren xsi:type="ca.gc.space.topology:URLNode" xmi:id="_aD8j9ArNEeW4-_ONWXXiAw" parent="_aD8j8wrNEeW4-_ONWXXiAw" description="The CAD for the left rear wheel" nodeId="MOBILE_PLATFORM_SYM_SYS_LEFT_REAR_WHEEL_CAD" url="platform:/plugin/org.eclipse.symphony.examples.mobile_platform.symphony/vrml/CSA_Wheel_Symphony_Scaled.wrl"/>
          <position xmi:id="_aD8j9QrNEeW4-_ONWXXiAw"/>
          <rotationMatrix xmi:id="_aD8j9grNEeW4-_ONWXXiAw"/>
        </aggregatedChildren>
        <aggregatedChildren xsi:type="vehicle:Wheel" xmi:id="_aD8j9wrNEeW4-_ONWXXiAw" parent="_aD8j8grNEeW4-_ONWXXiAw" description="The mobile platform's left rear wheel" nodeId="MOBILE_PLATFORM_SYM_SYS_LEFT_REAR_WHEEL" radius="0.38" lenght="0.17">
          <physicalProperties xmi:id="_aD8j-ArNEeW4-_ONWXXiAw">
            <inertiaMatrix xmi:id="_aD8j-QrNEeW4-_ONWXXiAw"/>
            <centerOfMassLocation xmi:id="_aD8j-grNEeW4-_ONWXXiAw"/>
          </physicalProperties>
          <centerOfMassKinematicState xmi:id="_aD8j-wrNEeW4-_ONWXXiAw"/>
        </aggregatedChildren>
        <position xmi:id="_aD8j_ArNEeW4-_ONWXXiAw" x="-0.425" y="0.63" z="0.375"/>
        <rotationMatrix xmi:id="_aD8j_QrNEeW4-_ONWXXiAw"/>
      </aggregatedChildren>
      <aggregatedChildren xsi:type="ca.gc.space.topology:TransformNode" xmi:id="_aD8j_grNEeW4-_ONWXXiAw" parent="_aD78wgrNEeW4-_ONWXXiAw" description="The transformation required to go from the root node to the body's CAD" nodeId="MOBILE_PLATFORM_SYM_SYS_BODY_CAD_TRANSFORM">
        <aggregatedChildren xsi:type="ca.gc.space.topology:URLNode" xmi:id="_aD9K4ArNEeW4-_ONWXXiAw" parent="_aD8j_grNEeW4-_ONWXXiAw" description="The CAD of the mobile platform's body" nodeId="MOBILE_PLATFORM_SYM_SYS_BODY_CAD" url="platform:/plugin/org.eclipse.symphony.examples.mobile_platform.symphony/vrml/CSA_Rover_Body_Symphony_scaled.wrl"/>
        <position xmi:id="_aD9K4QrNEeW4-_ONWXXiAw"/>
        <rotationMatrix xmi:id="_aD9K4grNEeW4-_ONWXXiAw"/>
      </aggregatedChildren>
      <aggregatedChildren xsi:type="ca.gc.space.topology:TransformNode" xmi:id="_aD9K4wrNEeW4-_ONWXXiAw" parent="_aD78wgrNEeW4-_ONWXXiAw" description="The required transformation to get from the root to the arm mounting position" nodeId="MOBILE_PLATFORM_SYM_SYS_ARM_MOUNT">
        <position xmi:id="_aD9K5ArNEeW4-_ONWXXiAw" x="0.85" y="0.3" z="0.7"/>
        <rotationMatrix xmi:id="_aD9K5QrNEeW4-_ONWXXiAw"/>
      </aggregatedChildren>
      <aggregatedChildren xsi:type="ca.gc.space.topology:TransformNode" xmi:id="_aD9K5grNEeW4-_ONWXXiAw" parent="_aD78wgrNEeW4-_ONWXXiAw" description="The required transformation to get from the root to the mast centre plate location" nodeId="MOBILE_PLATFORM_SYM_SYS_MAST_CENTRE_PLATE">
        <position xmi:id="_aD9K5wrNEeW4-_ONWXXiAw" x="-0.5" z="1.625"/>
        <rotationMatrix xmi:id="_aD9K6ArNEeW4-_ONWXXiAw"/>
      </aggregatedChildren>
      <aggregatedChildren xsi:type="ca.gc.space.topology:TransformNode" xmi:id="_aD9K6QrNEeW4-_ONWXXiAw" parent="_aD78wgrNEeW4-_ONWXXiAw" description="The required transformation to get from the root to the mast left flat location" nodeId="MOBILE_PLATFORM_SYM_SYS_MAST_LEFT_FLAT">
        <position xmi:id="_aD9K6grNEeW4-_ONWXXiAw" x="-0.5" y="0.6" z="1.6"/>
        <rotationMatrix xmi:id="_aD9K6wrNEeW4-_ONWXXiAw"/>
      </aggregatedChildren>
      <aggregatedChildren xsi:type="ca.gc.space.topology:TransformNode" xmi:id="_aD9K7ArNEeW4-_ONWXXiAw" parent="_aD78wgrNEeW4-_ONWXXiAw" description="The required transformation to get from the root to the mast right flat location" nodeId="MOBILE_PLATFORM_SYM_SYS_MAST_RIGHT_FLAT">
        <position xmi:id="_aD9K7QrNEeW4-_ONWXXiAw" x="-0.5" y="-0.6" z="1.6"/>
        <rotationMatrix xmi:id="_aD9K7grNEeW4-_ONWXXiAw"/>
      </aggregatedChildren>
    </originNode>
  </topologyRoot>
  <bindingSet xmi:id="_aD9K7wrNEeW4-_ONWXXiAw">
    <featureRootsList xmi:id="_aD9K8ArNEeW4-_ONWXXiAw">
      <featureRoots xmi:id="_aD9K8QrNEeW4-_ONWXXiAw">
        <children xsi:type="ecore:TreeFeatureNode" xmi:id="_aD9K8grNEeW4-_ONWXXiAw">
          <structuralFeature xsi:type="ecore_1:EAttribute" href="org.eclipse.symphony.examples.mobile_platform#//MobilePlatform/leftWheelPosition"/>
        </children>
        <children xsi:type="ecore:TreeFeatureNode" xmi:id="_aD9K8wrNEeW4-_ONWXXiAw">
          <structuralFeature xsi:type="ecore_1:EAttribute" href="org.eclipse.symphony.examples.mobile_platform#//MobilePlatform/rightWheelPosition"/>
        </children>
        <sourceClass href="org.eclipse.symphony.examples.mobile_platform#//MobilePlatform"/>
      </featureRoots>
    </featureRootsList>
    <bindingsList xmi:id="_aD9K9ArNEeW4-_ONWXXiAw">
      <bindings xsi:type="bindings:RotationBinding" xmi:id="_aD9K9QrNEeW4-_ONWXXiAw" description="The binding for the mobile platform's left front wheel" name="MOBILE_PLATFORM_SYM_SYS_BIND_LEFT_FRONT_WHEEL_JOINT" featureNode="_aD9K8grNEeW4-_ONWXXiAw" rotationNode="_aD8j2ArNEeW4-_ONWXXiAw" rotationAxis="Y_AXIS" rotationUnits="RADIANS"/>
      <bindings xsi:type="bindings:RotationBinding" xmi:id="_aD9K9grNEeW4-_ONWXXiAw" description="The binding for the mobile platform's left rear wheel" name="MOBILE_PLATFORM_SYM_SYS_BIND_LEFT_REAR_WHEEL_JOINT" featureNode="_aD9K8grNEeW4-_ONWXXiAw" rotationNode="_aD8j8wrNEeW4-_ONWXXiAw" rotationAxis="Y_AXIS" rotationUnits="RADIANS"/>
      <bindings xsi:type="bindings:RotationBinding" xmi:id="_aD9K9wrNEeW4-_ONWXXiAw" description="The binding for the mobile platform's right front wheel" name="MOBILE_PLATFORM_SYM_SYS_BIND_RIGHT_FRONT_WHEEL_JOINT" featureNode="_aD9K8wrNEeW4-_ONWXXiAw" rotationNode="_aD78xArNEeW4-_ONWXXiAw" rotationAxis="Y_AXIS" rotationUnits="RADIANS"/>
      <bindings xsi:type="bindings:RotationBinding" xmi:id="_aD9K-ArNEeW4-_ONWXXiAw" description="The binding for the mobile platform's right rear wheel" name="MOBILE_PLATFORM_SYM_SYS_BIND_RIGHT_REAR_WHEEL_JOINT" featureNode="_aD9K8wrNEeW4-_ONWXXiAw" rotationNode="_aD8j5ArNEeW4-_ONWXXiAw" rotationAxis="Y_AXIS" rotationUnits="RADIANS"/>
    </bindingsList>
  </bindingSet>
  <connectionPointsList xmi:id="_aD9K-QrNEeW4-_ONWXXiAw">
    <connectionPoints xmi:id="_aD9K-grNEeW4-_ONWXXiAw" name="MOBILE_PLATFORM_SYM_SYS_CONNECT_ARM_MOUNT" description="The mobile platform's arm mount connection point" node="_aD9K4wrNEeW4-_ONWXXiAw"/>
    <connectionPoints xmi:id="_aD9K-wrNEeW4-_ONWXXiAw" name="MOBILE_PLATFORM_SYM_SYS_CONNECT_MAST_CENTRE_PLATE" description="The mobile platform's mast centre plate connection point" node="_aD9K5grNEeW4-_ONWXXiAw"/>
    <connectionPoints xmi:id="_aD9K_ArNEeW4-_ONWXXiAw" name="MOBILE_PLATFORM_SYM_SYS_CONNECT_MAST_LEFT_FLAT" description="The mobile platform's mast left flat connection point" node="_aD9K6QrNEeW4-_ONWXXiAw"/>
    <connectionPoints xmi:id="_aD9K_QrNEeW4-_ONWXXiAw" name="MOBILE_PLATFORM_SYM_SYS_CONNECT_MAST_RIGHT_FLAT" description="The mobile platform's mast right flat connection point" node="_aD9K7ArNEeW4-_ONWXXiAw"/>
  </connectionPointsList>
  <assemblyLinksList xmi:id="_aD9K_grNEeW4-_ONWXXiAw"/>
</core:SymphonySystem>
