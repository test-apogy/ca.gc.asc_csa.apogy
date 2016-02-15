<?xml version="1.0" encoding="UTF-8"?>
<core:ApogySystem xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:bindings="ca.gc.asc_csa.apogy.common.topology.bindings" xmlns:bindings_1="ca.gc.asc_csa.apogy.addons.sensors.fov.bindings" xmlns:fov="ca.gc.asc_csa.apogy.addons.sensors.fov" xmlns:topology="ca.gc.asc_csa.apogy.common.topology" xmlns:core="ca.gc.asc_csa.apogy.core" xmlns:ecore="ca.gc.asc_csa.apogy.common.emf" xmlns:ecore_1="http://www.eclipse.org/emf/2002/Ecore" xmi:id="_1LPEwArOEeW4-_ONWXXiAw" name="PTUCameraApogySystem">
  <interfaceClass href="ca.gc.asc_csa.apogy.examples.camera#//PTUCamera"/>
  <typeApiAdapterClass href="ca.gc.asc_csa.apogy.examples.camera.apogy#//PTUCameraApogySystemApiAdapter"/>
  <topologyRoot xmi:id="_1LPEwQrOEeW4-_ONWXXiAw">
    <originNode xsi:type="topology:AggregateGroupNode" xmi:id="_1LPEwgrOEeW4-_ONWXXiAw" description="The root node of the PTU Camera's topology" nodeId="PTU_CAMERA_SYM_SYS_ROOT">
      <aggregatedChildren xsi:type="topology:URLNode" xmi:id="_1LPEwwrOEeW4-_ONWXXiAw" parent="_1LPEwgrOEeW4-_ONWXXiAw" description="The CAD of the camera base" nodeId="PTU_CAMERA_SYM_SYS_BASE_CAD" url="platform:/plugin/ca.gc.asc_csa.apogy.examples.camera.apogy/vrml/base.wrl"/>
      <aggregatedChildren xsi:type="topology:TransformNode" xmi:id="_1LPExArOEeW4-_ONWXXiAw" parent="_1LPEwgrOEeW4-_ONWXXiAw" description="The transform from the camera base to the pan joint" nodeId="PTU_CAMERA_SYM_SYS_BASE_TO_PAN_JOINT">
        <aggregatedChildren xsi:type="topology:TransformNode" xmi:id="_1LPExQrOEeW4-_ONWXXiAw" parent="_1LPExArOEeW4-_ONWXXiAw" description="The rotation of the pan joint" nodeId="PTU_CAMERA_SYM_SYS_PAN_JOINT">
          <aggregatedChildren xsi:type="topology:URLNode" xmi:id="_1LPExgrOEeW4-_ONWXXiAw" parent="_1LPExQrOEeW4-_ONWXXiAw" description="The CAD of the pan joint" nodeId="PTU_CAMERA_SYM_SYS_PAN_JOINT_CAD" url="platform:/plugin/ca.gc.asc_csa.apogy.examples.camera.apogy/vrml/pan.wrl"/>
          <aggregatedChildren xsi:type="topology:TransformNode" xmi:id="_1LPExwrOEeW4-_ONWXXiAw" parent="_1LPExQrOEeW4-_ONWXXiAw" description="The transform from the pan joint to the tilt joint" nodeId="PTU_CAMERA_SYM_SYS_PAN_TO_TILT_JOINT">
            <aggregatedChildren xsi:type="topology:TransformNode" xmi:id="_1LPEyArOEeW4-_ONWXXiAw" parent="_1LPExwrOEeW4-_ONWXXiAw" description="The tilt joint rotation" nodeId="PTU_CAMERA_SYM_SYS_TILT_JOINT">
              <aggregatedChildren xsi:type="topology:URLNode" xmi:id="_1LPEyQrOEeW4-_ONWXXiAw" parent="_1LPEyArOEeW4-_ONWXXiAw" description="The CAD of the tilt joint" nodeId="PTU_CAMERA_SYM_SYS_TILT_JOINT_CAD" url="platform:/plugin/ca.gc.asc_csa.apogy.examples.camera.apogy/vrml/tilt.wrl"/>
              <aggregatedChildren xsi:type="topology:TransformNode" xmi:id="_1LQS4ArOEeW4-_ONWXXiAw" parent="_1LPEyArOEeW4-_ONWXXiAw" description="The transform from the tilt joint to the camera" nodeId="PTU_CAMERA_SYM_SYS_TILT_JOINT_TO_CAMERA">
                <aggregatedChildren xsi:type="topology:URLNode" xmi:id="_1LQS4QrOEeW4-_ONWXXiAw" parent="_1LQS4ArOEeW4-_ONWXXiAw" description="The CAD of the camera body" nodeId="PTU_CAMERA_SYM_SYS_CAMERA_CAD" url="platform:/plugin/ca.gc.asc_csa.apogy.examples.camera.apogy/vrml/camera.wrl"/>
                <aggregatedChildren xsi:type="topology:TransformNode" xmi:id="_1LQS4grOEeW4-_ONWXXiAw" parent="_1LQS4ArOEeW4-_ONWXXiAw" description="The transform from the camera proper to the lens (implicitly FOV)" nodeId="PTU_CAMERA_SYM_SYS_LENS">
                  <aggregatedChildren xsi:type="topology:URLNode" xmi:id="_1LQ58ArOEeW4-_ONWXXiAw" parent="_1LQS4grOEeW4-_ONWXXiAw" description="The CAD for the camera lens" nodeId="PTU_CAMERA_SYM_SYS_LENS_CAD" url="platform:/plugin/ca.gc.asc_csa.apogy.examples.camera.apogy/vrml/lens.wrl"/>
                  <aggregatedChildren xsi:type="fov:RectangularFrustrumFieldOfView" xmi:id="_1LQ58QrOEeW4-_ONWXXiAw" parent="_1LQS4grOEeW4-_ONWXXiAw" description="The camera's field of view (FOV)" nodeId="PTU_CAMERA_SYM_SYS_FOV" horizontalFieldOfViewAngle="1.9634954084936207" verticalFieldOfViewAngle="0.7853981633974483">
                    <range xmi:id="_1LQ58wrOEeW4-_ONWXXiAw" maximumDistance="5.0"/>
                  </aggregatedChildren>
                  <position xmi:id="_1LQ59ArOEeW4-_ONWXXiAw" x="0.05" z="0.15"/>
                  <rotationMatrix xmi:id="_1LQ59QrOEeW4-_ONWXXiAw" m00="6.123233995736766E-17" m01="-1.0" m10="1.0" m11="6.123233995736766E-17"/>
                </aggregatedChildren>
                <position xmi:id="_1LQ59grOEeW4-_ONWXXiAw" x="0.05"/>
                <rotationMatrix xmi:id="_1LQ59wrOEeW4-_ONWXXiAw"/>
              </aggregatedChildren>
              <position xmi:id="_1LQ5-ArOEeW4-_ONWXXiAw"/>
              <rotationMatrix xmi:id="_1LQ5-QrOEeW4-_ONWXXiAw" m11="6.123233995736766E-17" m12="1.0" m21="-1.0" m22="6.123233995736766E-17"/>
            </aggregatedChildren>
            <position xmi:id="_1LQ5-grOEeW4-_ONWXXiAw" x="0.025" z="0.175"/>
            <rotationMatrix xmi:id="_1LQ5-wrOEeW4-_ONWXXiAw" m11="6.123233995736766E-17" m12="1.0" m21="-1.0" m22="6.123233995736766E-17"/>
          </aggregatedChildren>
          <position xmi:id="_1LQ5_ArOEeW4-_ONWXXiAw"/>
          <rotationMatrix xmi:id="_1LQ5_QrOEeW4-_ONWXXiAw"/>
        </aggregatedChildren>
        <position xmi:id="_1LQ5_grOEeW4-_ONWXXiAw" z="0.05"/>
        <rotationMatrix xmi:id="_1LQ5_wrOEeW4-_ONWXXiAw" m00="6.123233995736766E-17" m01="1.0" m10="-1.0" m11="6.123233995736766E-17"/>
      </aggregatedChildren>
    </originNode>
  </topologyRoot>
  <bindingSet xmi:id="_1LQ6AArOEeW4-_ONWXXiAw">
    <featureRootsList xmi:id="_1LQ6AQrOEeW4-_ONWXXiAw">
      <featureRoots xmi:id="_1LQ6AgrOEeW4-_ONWXXiAw">
        <children xsi:type="ecore:TreeFeatureNode" xmi:id="_1LQ6AwrOEeW4-_ONWXXiAw">
          <structuralFeature xsi:type="ecore_1:EAttribute" href="ca.gc.asc_csa.apogy.addons.actuators#//PanTiltUnit/currentPanAngle"/>
        </children>
        <children xsi:type="ecore:TreeFeatureNode" xmi:id="_1LQ6BArOEeW4-_ONWXXiAw">
          <structuralFeature xsi:type="ecore_1:EAttribute" href="ca.gc.asc_csa.apogy.addons.actuators#//PanTiltUnit/currentTiltAngle"/>
        </children>
        <children xsi:type="ecore:TreeFeatureNode" xmi:id="_1LQ6BQrOEeW4-_ONWXXiAw">
          <structuralFeature xsi:type="ecore_1:EReference" href="ca.gc.asc_csa.apogy.examples.camera.apogy#//Camera/fov"/>
        </children>
        <sourceClass href="ca.gc.asc_csa.apogy.examples.camera.apogy#//PTUCamera"/>
      </featureRoots>
    </featureRootsList>
    <bindingsList xmi:id="_1LQ6BgrOEeW4-_ONWXXiAw">
      <bindings xsi:type="bindings:RotationBinding" xmi:id="_1LQ6BwrOEeW4-_ONWXXiAw" description="The binding for the PTU camera's pan joint" name="PTU_CAMERA_SYM_SYS_BIND_PAN_JOINT" featureNode="_1LQ6AwrOEeW4-_ONWXXiAw" rotationNode="_1LPExQrOEeW4-_ONWXXiAw" rotationAxis="Z_AXIS"/>
      <bindings xsi:type="bindings:RotationBinding" xmi:id="_1LQ6CArOEeW4-_ONWXXiAw" description="The binding for the PTU camera's tilt joint" name="PTU_CAMERA_SYM_SYS_BIND_TILT_JOINT" featureNode="_1LQ6BArOEeW4-_ONWXXiAw" rotationNode="_1LPEyArOEeW4-_ONWXXiAw"/>
      <bindings xsi:type="bindings_1:RectangularFrustrumFieldOfViewBinding" xmi:id="_1LQ6CQrOEeW4-_ONWXXiAw" description="The binding for the PTU camera's field of view (FOV)" name="PTU_CAMERA_SYM_SYS_BIND_FOV" featureNode="_1LQ6BQrOEeW4-_ONWXXiAw" fov="_1LQ58QrOEeW4-_ONWXXiAw"/>
    </bindingsList>
  </bindingSet>
</core:ApogySystem>
