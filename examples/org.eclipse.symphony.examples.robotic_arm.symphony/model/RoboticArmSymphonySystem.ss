<?xml version="1.0" encoding="UTF-8"?>
<core:SymphonySystem xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:bindings="org.eclipse.symphony.common.topology.bindings" xmlns:ca.gc.space.topology="http:///ca/gc/space/topology.ecore" xmlns:core="org.eclipse.symphony.core" xmlns:ecore="org.eclipse.symphony.common.emf" xmlns:ecore_1="http://www.eclipse.org/emf/2002/Ecore" xmi:id="_LQwxcArPEeW4-_ONWXXiAw" name="RoboticArmSymphonySystem">
  <interfaceClass href="org.eclipse.symphony.examples.robotic_arm#//RoboticArm"/>
  <typeApiAdapterClass href="org.eclipse.symphony.examples.robotic_arm.symphony#//RoboticArmSymphonySystemApiAdapter"/>
  <topologyRoot xmi:id="_LQwxcQrPEeW4-_ONWXXiAw">
    <originNode xsi:type="ca.gc.space.topology:AggregateGroupNode" xmi:id="_LQwxcgrPEeW4-_ONWXXiAw" description="The root node of the topology for the robotic arm" nodeId="ROBOTIC_ARM_SYM_SYS_ROOT">
      <aggregatedChildren xsi:type="ca.gc.space.topology:URLNode" xmi:id="_LQxYgArPEeW4-_ONWXXiAw" parent="_LQwxcgrPEeW4-_ONWXXiAw" description="The CAD for the base of the robotic arm" nodeId="ROBOTIC_ARM_SYM_SYS_BASE_CAD" url="platform:/plugin/org.eclipse.symphony.examples.robotic_arm.symphony/vrml/CSA_Arm_Symphony_Base_Plate_Scaled.wrl" polygonCount="248" vertexCount="432"/>
      <aggregatedChildren xsi:type="ca.gc.space.topology:TransformNode" xmi:id="_LQxYgQrPEeW4-_ONWXXiAw" parent="_LQwxcgrPEeW4-_ONWXXiAw" description="The required transformation from the root to the robotic arm's turret joint" nodeId="ROBOTIC_ARM_SYM_SYS_TURRET">
        <aggregatedChildren xsi:type="ca.gc.space.topology:TransformNode" xmi:id="_LQxYggrPEeW4-_ONWXXiAw" parent="_LQxYgQrPEeW4-_ONWXXiAw" description="The rotation of the robotic arm's turret joint" nodeId="ROBOTIC_ARM_SYM_SYS_TURRET_JOINT">
          <aggregatedChildren xsi:type="ca.gc.space.topology:TransformNode" xmi:id="_LQxYgwrPEeW4-_ONWXXiAw" parent="_LQxYggrPEeW4-_ONWXXiAw" description="The required transformation from the turret joint to the the shoulder joint" nodeId="ROBOTIC_ARM_SYM_SYS_SHOULDER">
            <aggregatedChildren xsi:type="ca.gc.space.topology:TransformNode" xmi:id="_LQxYhArPEeW4-_ONWXXiAw" parent="_LQxYgwrPEeW4-_ONWXXiAw" description="The rotation of the robotic arm's shoulder joint" nodeId="ROBOTIC_ARM_SYM_SYS_SHOULDER_JOINT">
              <aggregatedChildren xsi:type="ca.gc.space.topology:URLNode" xmi:id="_LQxYhQrPEeW4-_ONWXXiAw" parent="_LQxYhArPEeW4-_ONWXXiAw" description="The CAD for the first part of the robotic arm's boom platform" nodeId="ROBOTIC_ARM_SYM_SYS_BOOM_1_CAD" url="platform:/plugin/org.eclipse.symphony.examples.robotic_arm.symphony/vrml/CSA_Arm_Symphony_Boom1_Scaled.wrl" polygonCount="669" vertexCount="1393"/>
              <aggregatedChildren xsi:type="ca.gc.space.topology:TransformNode" xmi:id="_LQxYhgrPEeW4-_ONWXXiAw" parent="_LQxYhArPEeW4-_ONWXXiAw" description="The required transformation to go from the shoulder joint to the elbow" nodeId="ROBOTIC_ARM_SYM_SYS_ELBOW">
                <aggregatedChildren xsi:type="ca.gc.space.topology:TransformNode" xmi:id="_LQxYhwrPEeW4-_ONWXXiAw" parent="_LQxYhgrPEeW4-_ONWXXiAw" description="The rotation of the robotic arm's elbow joint" nodeId="ROBOTIC_ARM_SYM_SYS_ELBOW_JOINT">
                  <aggregatedChildren xsi:type="ca.gc.space.topology:TransformNode" xmi:id="_LQxYiArPEeW4-_ONWXXiAw" parent="_LQxYhwrPEeW4-_ONWXXiAw" description="The required transformation to go from the elbow joint to the wrist joint" nodeId="ROBOTIC_ARM_SYM_SYS_WRIST">
                    <aggregatedChildren xsi:type="ca.gc.space.topology:TransformNode" xmi:id="_LQxYiQrPEeW4-_ONWXXiAw" parent="_LQxYiArPEeW4-_ONWXXiAw" description="The rotation of the robotic arm's wrist joint" nodeId="ROBOTIC_ARM_SYM_SYS_WRIST_JOINT">
                      <aggregatedChildren xsi:type="ca.gc.space.topology:TransformNode" xmi:id="_LQxYigrPEeW4-_ONWXXiAw" parent="_LQxYiQrPEeW4-_ONWXXiAw" description="The transformation required to go from the wrist joint to the hand's tip" nodeId="ROBOTIC_ARM_SYM_SYS_HAND_TIP">
                        <position xmi:id="_LQxYiwrPEeW4-_ONWXXiAw" y="0.08"/>
                        <rotationMatrix xmi:id="_LQxYjArPEeW4-_ONWXXiAw"/>
                      </aggregatedChildren>
                      <aggregatedChildren xsi:type="ca.gc.space.topology:URLNode" xmi:id="_LQxYjQrPEeW4-_ONWXXiAw" parent="_LQxYiQrPEeW4-_ONWXXiAw" description="The CAD for the robotic arm's hand" nodeId="ROBOTIC_ARM_SYM_SYS_HAND_CAD" url="platform:/plugin/org.eclipse.symphony.examples.robotic_arm.symphony/vrml/CSA_Arm_Symphony_Tip_Scaled.wrl" polygonCount="759" vertexCount="1353"/>
                      <position xmi:id="_LQxYjgrPEeW4-_ONWXXiAw"/>
                      <rotationMatrix xmi:id="_LQxYjwrPEeW4-_ONWXXiAw"/>
                    </aggregatedChildren>
                    <position xmi:id="_LQxYkArPEeW4-_ONWXXiAw" y="1.0"/>
                    <rotationMatrix xmi:id="_LQxYkQrPEeW4-_ONWXXiAw"/>
                  </aggregatedChildren>
                  <aggregatedChildren xsi:type="ca.gc.space.topology:URLNode" xmi:id="_LQxYkgrPEeW4-_ONWXXiAw" parent="_LQxYhwrPEeW4-_ONWXXiAw" description="The CAD for the second part of the robotic arm's boom platform" nodeId="ROBOTIC_ARM_SYM_SYS_BOOM_2_CAD" url="platform:/plugin/org.eclipse.symphony.examples.robotic_arm.symphony/vrml/CSA_Arm_Symphony_Boom2_Scaled.wrl" polygonCount="742" vertexCount="1478"/>
                  <aggregatedChildren xsi:type="ca.gc.space.topology:TransformNode" xmi:id="_LQxYkwrPEeW4-_ONWXXiAw" parent="_LQxYhwrPEeW4-_ONWXXiAw" description="The required transformation to go from the elbow joint to the forearm boom platform" nodeId="ROBOTIC_ARM_SYM_SYS_FOREARM_BOOM_PLATFORM_TRANSFORM">
                    <aggregatedChildren xsi:type="ca.gc.space.topology:TransformNode" xmi:id="_LQxYlArPEeW4-_ONWXXiAw" parent="_LQxYkwrPEeW4-_ONWXXiAw" description="The robotic arm's forearm boom platform" nodeId="ROBOTIC_ARM_SYM_SYS_FOREARM_BOOM_PLATFORM">
                      <position xmi:id="_LQxYlQrPEeW4-_ONWXXiAw" x="-0.04" z="-0.03"/>
                      <rotationMatrix xmi:id="_LQxYlgrPEeW4-_ONWXXiAw" m00="6.123233995736766E-17" m01="1.0" m10="1.0" m11="-6.123233995736766E-17" m12="1.2246467991473532E-16" m20="1.2246467991473532E-16" m21="-7.498798913309288E-33" m22="-1.0"/>
                    </aggregatedChildren>
                    <position xmi:id="_LQxYlwrPEeW4-_ONWXXiAw" y="0.5"/>
                    <rotationMatrix xmi:id="_LQxYmArPEeW4-_ONWXXiAw"/>
                  </aggregatedChildren>
                  <position xmi:id="_LQxYmQrPEeW4-_ONWXXiAw"/>
                  <rotationMatrix xmi:id="_LQxYmgrPEeW4-_ONWXXiAw"/>
                </aggregatedChildren>
                <position xmi:id="_LQxYmwrPEeW4-_ONWXXiAw" x="-0.08" y="0.9"/>
                <rotationMatrix xmi:id="_LQxYnArPEeW4-_ONWXXiAw"/>
              </aggregatedChildren>
              <aggregatedChildren xsi:type="ca.gc.space.topology:TransformNode" xmi:id="_LQxYnQrPEeW4-_ONWXXiAw" parent="_LQxYhArPEeW4-_ONWXXiAw" description="The required transformation to go from the shoulder joint to the boom platform" nodeId="ROBOTIC_ARM_SYM_SYS_BOOM_PLATFORM_TRANSFORM">
                <aggregatedChildren xsi:type="ca.gc.space.topology:TransformNode" xmi:id="_LQxYngrPEeW4-_ONWXXiAw" parent="_LQxYnQrPEeW4-_ONWXXiAw" description="The robotic arm's boom platform" nodeId="ROBOTIC_ARM_SYM_SYS_BOOM_PLATFORM">
                  <position xmi:id="_LQxYnwrPEeW4-_ONWXXiAw" z="0.02"/>
                  <rotationMatrix xmi:id="_LQxYoArPEeW4-_ONWXXiAw"/>
                </aggregatedChildren>
                <position xmi:id="_LQxYoQrPEeW4-_ONWXXiAw" y="0.5"/>
                <rotationMatrix xmi:id="_LQxYogrPEeW4-_ONWXXiAw"/>
              </aggregatedChildren>
              <position xmi:id="_LQxYowrPEeW4-_ONWXXiAw"/>
              <rotationMatrix xmi:id="_LQxYpArPEeW4-_ONWXXiAw"/>
            </aggregatedChildren>
            <position xmi:id="_LQxYpQrPEeW4-_ONWXXiAw" x="0.07" z="0.07"/>
            <rotationMatrix xmi:id="_LQx_kArPEeW4-_ONWXXiAw" m11="6.123233995736766E-17" m12="-1.0" m21="1.0" m22="6.123233995736766E-17"/>
          </aggregatedChildren>
          <aggregatedChildren xsi:type="ca.gc.space.topology:URLNode" xmi:id="_LQx_kQrPEeW4-_ONWXXiAw" parent="_LQxYggrPEeW4-_ONWXXiAw" description="The CAD for the robotic arm's turret joint" nodeId="ROBOTIC_ARM_SYM_SYS_TURRET_CAD" url="platform:/plugin/org.eclipse.symphony.examples.robotic_arm.symphony/vrml/CSA_Arm_Symphony_Base_Scaled.wrl" polygonCount="498" vertexCount="806"/>
          <position xmi:id="_LQx_kgrPEeW4-_ONWXXiAw"/>
          <rotationMatrix xmi:id="_LQx_kwrPEeW4-_ONWXXiAw"/>
        </aggregatedChildren>
        <position xmi:id="_LQx_lArPEeW4-_ONWXXiAw" z="0.08"/>
        <rotationMatrix xmi:id="_LQx_lQrPEeW4-_ONWXXiAw" m00="6.123233995736766E-17" m01="-1.0" m10="1.0" m11="6.123233995736766E-17"/>
      </aggregatedChildren>
    </originNode>
  </topologyRoot>
  <bindingSet xmi:id="_LQx_lgrPEeW4-_ONWXXiAw">
    <featureRootsList xmi:id="_LQx_lwrPEeW4-_ONWXXiAw">
      <featureRoots xmi:id="_LQx_mArPEeW4-_ONWXXiAw">
        <children xsi:type="ecore:TreeFeatureNode" xmi:id="_LQx_mQrPEeW4-_ONWXXiAw">
          <structuralFeature xsi:type="ecore_1:EAttribute" href="org.eclipse.symphony.examples.robotic_arm#//RoboticArm/turretAngle"/>
        </children>
        <children xsi:type="ecore:TreeFeatureNode" xmi:id="_LQx_mgrPEeW4-_ONWXXiAw">
          <structuralFeature xsi:type="ecore_1:EAttribute" href="org.eclipse.symphony.examples.robotic_arm#//RoboticArm/shoulderAngle"/>
        </children>
        <children xsi:type="ecore:TreeFeatureNode" xmi:id="_LQx_mwrPEeW4-_ONWXXiAw">
          <structuralFeature xsi:type="ecore_1:EAttribute" href="org.eclipse.symphony.examples.robotic_arm#//RoboticArm/elbowAngle"/>
        </children>
        <children xsi:type="ecore:TreeFeatureNode" xmi:id="_LQx_nArPEeW4-_ONWXXiAw">
          <structuralFeature xsi:type="ecore_1:EAttribute" href="org.eclipse.symphony.examples.robotic_arm#//RoboticArm/wristAngle"/>
        </children>
        <sourceClass href="org.eclipse.symphony.examples.robotic_arm#//RoboticArm"/>
      </featureRoots>
    </featureRootsList>
    <bindingsList xmi:id="_LQx_nQrPEeW4-_ONWXXiAw">
      <bindings xsi:type="bindings:RotationBinding" xmi:id="_LQx_ngrPEeW4-_ONWXXiAw" description="The binding for the robotic arm's turret joint" name="ROBOTIC_ARM_SYM_SYS_BIND_TURRET_JOINT" featureNode="_LQx_mQrPEeW4-_ONWXXiAw" rotationNode="_LQxYggrPEeW4-_ONWXXiAw" rotationAxis="Z_AXIS"/>
      <bindings xsi:type="bindings:RotationBinding" xmi:id="_LQx_nwrPEeW4-_ONWXXiAw" description="The binding for the robotic arm's shoulder joint" name="ROBOTIC_ARM_SYM_SYS_BIND_SHOULDER_JOINT" featureNode="_LQx_mgrPEeW4-_ONWXXiAw" rotationNode="_LQxYhArPEeW4-_ONWXXiAw" rotationAxis="MINUS_X_AXIS"/>
      <bindings xsi:type="bindings:RotationBinding" xmi:id="_LQx_oArPEeW4-_ONWXXiAw" description="The binding for the robotic arm's elbow joint" name="ROBOTIC_ARM_SYM_SYS_BIND_ELBOW_JOINT" featureNode="_LQx_mwrPEeW4-_ONWXXiAw" rotationNode="_LQxYhwrPEeW4-_ONWXXiAw" rotationAxis="MINUS_X_AXIS"/>
      <bindings xsi:type="bindings:RotationBinding" xmi:id="_LQx_oQrPEeW4-_ONWXXiAw" description="Binds the wrist angle." name="ROBOTIC_ARM_SYM_SYS_BIND_WRIST_JOINT" featureNode="_LQx_nArPEeW4-_ONWXXiAw" rotationNode="_LQxYiQrPEeW4-_ONWXXiAw" rotationAxis="MINUS_X_AXIS"/>
    </bindingsList>
  </bindingSet>
  <connectionPointsList xmi:id="_LQx_ogrPEeW4-_ONWXXiAw">
    <connectionPoints xmi:id="_LQx_owrPEeW4-_ONWXXiAw" name="ROBOTIC_ARM_SYM_SYS_CONNECT_HAND_TIP" description="The connection point located at the tip of the hand of the robotic arm." node="_LQxYigrPEeW4-_ONWXXiAw"/>
    <connectionPoints xmi:id="_LQx_pArPEeW4-_ONWXXiAw" name="ROBOTIC_ARM_SYM_SYS_CONNECT_BOOM_PLATFORM" description="The connection point located on the robotic arm's boom platform" node="_LQxYngrPEeW4-_ONWXXiAw"/>
    <connectionPoints xmi:id="_LQx_pQrPEeW4-_ONWXXiAw" name="ROBOTIC_ARM_SYM_SYS_CONNECT_FOREARM_BOOM_PLATFORM" description="The connection point located on the robotic arm's forearm boom platform." node="_LQxYlArPEeW4-_ONWXXiAw"/>
  </connectionPointsList>
</core:SymphonySystem>
