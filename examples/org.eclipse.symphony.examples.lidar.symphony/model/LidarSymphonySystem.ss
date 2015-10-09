<?xml version="1.0" encoding="UTF-8"?>
<core:SymphonySystem xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:bindings="org.eclipse.symphony.addons.sensors.fov.bindings" xmlns:org.eclipse.symphony.addons.sensors.fov="http:///ca/gc/space/mrt/sensors/fov/model/fov.ecore" xmlns:org.eclipse.symphony.common.topology="http:///ca/gc/space/topology.ecore" xmlns:core="org.eclipse.symphony.core" xmlns:ecore="ca.gc.asc_csa.eclipse.emf.ecore" xmlns:ecore_1="http://www.eclipse.org/emf/2002/Ecore" xmi:id="_9z1SQArOEeW4-_ONWXXiAw" name="LidarSymphonySystem">
  <interfaceClass href="org.eclipse.symphony.examples.lidar#//Lidar"/>
  <typeApiAdapterClass href="org.eclipse.symphony.examples.lidar.symphony#//LidarSymphonySystemApiAdapter"/>
  <topologyRoot xmi:id="_9z1SQQrOEeW4-_ONWXXiAw">
    <originNode xsi:type="org.eclipse.symphony.common.topology:AggregateGroupNode" xmi:id="_9z1SQgrOEeW4-_ONWXXiAw" description="The root node of the topology for the Lidar unit" nodeId="LIDAR_SYM_SYS_ROOT">
      <aggregatedChildren xsi:type="org.eclipse.symphony.common.topology:TransformNode" xmi:id="_9z1SQwrOEeW4-_ONWXXiAw" parent="_9z1SQgrOEeW4-_ONWXXiAw" description="The transformation required to change from the root to the one suitable for the lidar's CAD" nodeId="LIDAR_SYM_SYS_CAD_TRANSFORM">
        <aggregatedChildren xsi:type="org.eclipse.symphony.common.topology:URLNode" xmi:id="_9z1SRArOEeW4-_ONWXXiAw" parent="_9z1SQwrOEeW4-_ONWXXiAw" description="The CAD for the root of the Lidar unit" nodeId="LIDAR_SYM_SYS_CAD" url="platform:/plugin/org.eclipse.symphony.examples.lidar.symphony/vrml/lidar.wrl"/>
        <aggregatedChildren xsi:type="org.eclipse.symphony.common.topology:TransformNode" xmi:id="_9z1SRQrOEeW4-_ONWXXiAw" parent="_9z1SQwrOEeW4-_ONWXXiAw" description="The transformation required to " nodeId="LIDAR_SYM_SYS_LENS_CAD_TRANSFORM">
          <aggregatedChildren xsi:type="org.eclipse.symphony.addons.sensors.fov:RectangularFrustrumFieldOfView" xmi:id="_9z1SRgrOEeW4-_ONWXXiAw" parent="_9z1SRQrOEeW4-_ONWXXiAw" description="The Lidar unit's field of view (FOV)" nodeId="LIDAR_SYM_SYS_FOV" horizontalFieldOfViewAngle="1.5707963267948966" verticalFieldOfViewAngle="0.7853981633974483">
            <range xmi:id="_9z1SSArOEeW4-_ONWXXiAw" maximumDistance="5.0"/>
          </aggregatedChildren>
          <aggregatedChildren xsi:type="org.eclipse.symphony.common.topology:URLNode" xmi:id="_9z1SSQrOEeW4-_ONWXXiAw" parent="_9z1SRQrOEeW4-_ONWXXiAw" nodeId="LIDAR_LENS_CAD" url="platform:/plugin/org.eclipse.symphony.examples.lidar.symphony/vrml/lens.wrl"/>
          <position xmi:id="_9z1SSgrOEeW4-_ONWXXiAw" x="0.05" z="0.15"/>
          <rotationMatrix xmi:id="_9z1SSwrOEeW4-_ONWXXiAw" m00="6.123233995736766E-17" m01="-1.0" m10="1.0" m11="6.123233995736766E-17"/>
        </aggregatedChildren>
        <position xmi:id="_9z1STArOEeW4-_ONWXXiAw"/>
        <rotationMatrix xmi:id="_9z1STQrOEeW4-_ONWXXiAw" m11="6.123233995736766E-17" m12="1.0" m21="-1.0" m22="6.123233995736766E-17"/>
      </aggregatedChildren>
    </originNode>
  </topologyRoot>
  <bindingSet xmi:id="_9z1STgrOEeW4-_ONWXXiAw">
    <featureRootsList xmi:id="_9z1STwrOEeW4-_ONWXXiAw">
      <featureRoots xmi:id="_9z1SUArOEeW4-_ONWXXiAw">
        <children xsi:type="ecore:TreeFeatureNode" xmi:id="_9z1SUQrOEeW4-_ONWXXiAw">
          <structuralFeature xsi:type="ecore_1:EReference" href="org.eclipse.symphony.examples.lidar#//Lidar/fov"/>
        </children>
        <sourceClass href="org.eclipse.symphony.examples.lidar#//Lidar"/>
      </featureRoots>
    </featureRootsList>
    <bindingsList xmi:id="_9z1SUgrOEeW4-_ONWXXiAw">
      <bindings xsi:type="bindings:RectangularFrustrumFieldOfViewBinding" xmi:id="_9z1SUwrOEeW4-_ONWXXiAw" description="The binding for the Lidar's field of view (FOV)" name="LIDAR_SYM_SYS_BIND_FOV" featureNode="_9z1SUQrOEeW4-_ONWXXiAw" fov="_9z1SRgrOEeW4-_ONWXXiAw"/>
    </bindingsList>
  </bindingSet>
  <connectionPointsList xmi:id="_9z1SVArOEeW4-_ONWXXiAw"/>
</core:SymphonySystem>
