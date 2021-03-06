<?xml version="1.0" encoding="UTF-8"?>
<core:ApogySystem xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:bindings="ca.gc.asc_csa.apogy.common.topology.bindings" xmlns:fov="ca.gc.asc_csa.apogy.addons.sensors.fov" xmlns:topology="ca.gc.asc_csa.apogy.common.topology" xmlns:core="ca.gc.asc_csa.apogy.core" xmlns:ecore="ca.gc.asc_csa.apogy.common.emf" xmlns:ecore_1="http://www.eclipse.org/emf/2002/Ecore" xmi:id="_sUcqQArOEeW4-_ONWXXiAw" name="PTUDishAntennaApogySystem">
  <interfaceClass href="ca.gc.asc_csa.apogy.examples.antenna#//PTUDishAntenna"/>
  <typeApiAdapterClass href="ca.gc.asc_csa.apogy.examples.antenna.apogy#//PTUDishAntennaApogySystemApiAdapter"/>
  <topologyRoot xmi:id="_sUcqQQrOEeW4-_ONWXXiAw">
    <originNode xsi:type="topology:AggregateGroupNode" xmi:id="_sUcqQgrOEeW4-_ONWXXiAw" nodeId="PTU_DISH_ANTENNA_SYM_SYS_ROOT">
      <aggregatedChildren xsi:type="topology:TransformNode" xmi:id="_sUcqQwrOEeW4-_ONWXXiAw" parent="_sUcqQgrOEeW4-_ONWXXiAw" nodeId="PTU_DISH_ANTENNA_SYM_SYS_BASE_TO_PAN">
        <aggregatedChildren xsi:type="topology:TransformNode" xmi:id="_sUcqRArOEeW4-_ONWXXiAw" parent="_sUcqQwrOEeW4-_ONWXXiAw" nodeId="PTU_DISH_ANTENNA_SYM_SYS_PAN_JOINT">
          <aggregatedChildren xsi:type="topology:TransformNode" xmi:id="_sUcqRQrOEeW4-_ONWXXiAw" parent="_sUcqRArOEeW4-_ONWXXiAw" nodeId="PTU_DISH_ANTENNA_SYM_SYS_PAN_TO_TILT">
            <aggregatedChildren xsi:type="topology:TransformNode" xmi:id="_sUcqRgrOEeW4-_ONWXXiAw" parent="_sUcqRQrOEeW4-_ONWXXiAw" nodeId="PTU_DISH_ANTENNA_SYM_SYS_TILT_JOINT">
              <aggregatedChildren xsi:type="topology:TransformNode" xmi:id="_sUcqRwrOEeW4-_ONWXXiAw" parent="_sUcqRgrOEeW4-_ONWXXiAw" nodeId="PTU_DISH_ANTENNA_SYM_SYS_FOV_TRANSFORM">
                <aggregatedChildren xsi:type="fov:ConicalFieldOfView" xmi:id="_sUdRUArOEeW4-_ONWXXiAw" parent="_sUcqRwrOEeW4-_ONWXXiAw" nodeId="PTU_DISH_ANTENNA_SYM_SYS_FOV" fieldOfViewAngle="0.17453292519943295">
                  <range xmi:id="_sUdRUgrOEeW4-_ONWXXiAw" maximumDistance="100.0"/>
                </aggregatedChildren>
                <position xmi:id="_sUdRUwrOEeW4-_ONWXXiAw" x="0.05" y="-0.032" z="0.125"/>
                <rotationMatrix xmi:id="_sUdRVArOEeW4-_ONWXXiAw" m00="6.123233995736766E-17" m02="1.0" m20="-1.0" m22="6.123233995736766E-17"/>
              </aggregatedChildren>
              <aggregatedChildren xsi:type="topology:URLNode" xmi:id="_sUdRVQrOEeW4-_ONWXXiAw" parent="_sUcqRgrOEeW4-_ONWXXiAw" nodeId="PTU_DISH_ANTENNA_SYM_SYS_PAN_TILT_CAD" url="platform:/plugin/ca.gc.asc_csa.apogy.examples.antenna.apogy/vrml/Gimbal_middle_Scaled.wrl"/>
              <aggregatedChildren xsi:type="topology:TransformNode" xmi:id="_sUdRVgrOEeW4-_ONWXXiAw" parent="_sUcqRgrOEeW4-_ONWXXiAw" description="" nodeId="PTU_DISH_ANTENNA_SYM_SYS_CAD_TRANSFORM">
                <aggregatedChildren xsi:type="topology:URLNode" xmi:id="_sUdRVwrOEeW4-_ONWXXiAw" parent="_sUdRVgrOEeW4-_ONWXXiAw" nodeId="PTU_DISH_ANTENNA_SYM_SYS_DISH_CAD" url="platform:/plugin/ca.gc.asc_csa.apogy.examples.antenna.apogy/vrml/Dish12in_Scaled.wrl"/>
                <position xmi:id="_sUdRWArOEeW4-_ONWXXiAw" x="0.05" y="-0.032" z="0.125"/>
                <rotationMatrix xmi:id="_sUdRWQrOEeW4-_ONWXXiAw" m00="6.123233995736766E-17" m01="1.0" m10="-1.0" m11="6.123233995736766E-17"/>
              </aggregatedChildren>
              <position xmi:id="_sUdRWgrOEeW4-_ONWXXiAw"/>
              <rotationMatrix xmi:id="_sUdRWwrOEeW4-_ONWXXiAw"/>
            </aggregatedChildren>
            <position xmi:id="_sUdRXArOEeW4-_ONWXXiAw" y="0.04" z="0.127"/>
            <rotationMatrix xmi:id="_sUdRXQrOEeW4-_ONWXXiAw"/>
          </aggregatedChildren>
          <aggregatedChildren xsi:type="topology:URLNode" xmi:id="_sUdRXgrOEeW4-_ONWXXiAw" parent="_sUcqRArOEeW4-_ONWXXiAw" nodeId="PTU_DISH_ANTENNA_SYM_SYS_BASE_CAD" url="platform:/plugin/ca.gc.asc_csa.apogy.examples.antenna.apogy/vrml/Gimbal_Base_Scaled.wrl"/>
          <position xmi:id="_sUdRXwrOEeW4-_ONWXXiAw"/>
          <rotationMatrix xmi:id="_sUdRYArOEeW4-_ONWXXiAw"/>
        </aggregatedChildren>
        <position xmi:id="_sUdRYQrOEeW4-_ONWXXiAw" z="0.02"/>
        <rotationMatrix xmi:id="_sUdRYgrOEeW4-_ONWXXiAw"/>
      </aggregatedChildren>
      <aggregatedChildren xsi:type="topology:URLNode" xmi:id="_sUdRYwrOEeW4-_ONWXXiAw" parent="_sUcqQgrOEeW4-_ONWXXiAw" nodeId="PTU_DISH_ANTENNA_SYM_SYS_BASE_PLATE_CAD" url="platform:/plugin/ca.gc.asc_csa.apogy.examples.antenna.apogy/vrml/Gimbal_Base_Plate_Scaled.wrl"/>
    </originNode>
  </topologyRoot>
  <bindingSet xmi:id="_sUdRZArOEeW4-_ONWXXiAw">
    <featureRootsList xmi:id="_sUdRZQrOEeW4-_ONWXXiAw">
      <featureRoots xmi:id="_sUdRZgrOEeW4-_ONWXXiAw">
        <children xsi:type="ecore:TreeFeatureNode" xmi:id="_sUdRZwrOEeW4-_ONWXXiAw">
          <structuralFeature xsi:type="ecore_1:EAttribute" href="ca.gc.asc_csa.apogy.examples.antenna#//PTUDishAntenna/panAngle"/>
        </children>
        <children xsi:type="ecore:TreeFeatureNode" xmi:id="_sUdRaArOEeW4-_ONWXXiAw">
          <structuralFeature xsi:type="ecore_1:EAttribute" href="ca.gc.asc_csa.apogy.examples.antenna#//PTUDishAntenna/tiltAngle"/>
        </children>
        <sourceClass href="ca.gc.asc_csa.apogy.examples.antenna#//PTUDishAntenna"/>
      </featureRoots>
    </featureRootsList>
    <bindingsList xmi:id="_sUdRaQrOEeW4-_ONWXXiAw">
      <bindings xsi:type="bindings:RotationBinding" xmi:id="_sUd4YArOEeW4-_ONWXXiAw" description="The binding for the PTU dish antenna's pan angle" name="PTU_DISH_ANTENNA_SYM_SYS_BIND_PAN_JOINT" featureNode="_sUdRZwrOEeW4-_ONWXXiAw" rotationNode="_sUcqRArOEeW4-_ONWXXiAw" rotationAxis="Z_AXIS"/>
      <bindings xsi:type="bindings:RotationBinding" xmi:id="_sUd4YQrOEeW4-_ONWXXiAw" description="The binding for the PTU dish antenna's tilt joint" name="PTU_DISH_ANTENNA_SYM_SYS_BIND_TILT_JOINT" featureNode="_sUdRaArOEeW4-_ONWXXiAw" rotationNode="_sUcqRgrOEeW4-_ONWXXiAw" rotationAxis="MINUS_Y_AXIS"/>
    </bindingsList>
  </bindingSet>
</core:ApogySystem>
