<?xml version="1.0" encoding="UTF-8"?>
<core:SymphonySystem xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:bindings="org.eclipse.symphony.addons.sensors.fov.bindings" xmlns:fov="org.eclipse.symphony.addons.sensors.fov" xmlns:topology="org.eclipse.symphony.common.topology" xmlns:core="org.eclipse.symphony.core" xmlns:ecore="org.eclipse.symphony.common.emf" xmlns:ecore_1="http://www.eclipse.org/emf/2002/Ecore" xmi:id="_0AJKoArOEeW4-_ONWXXiAw" name="CameraSymphonySystem">
  <interfaceClass href="org.eclipse.symphony.examples.camera#//Camera"/>
  <typeApiAdapterClass href="org.eclipse.symphony.examples.camera.symphony#//CameraSymphonySystemApiAdapter"/>
  <topologyRoot xmi:id="_0AJKoQrOEeW4-_ONWXXiAw">
    <originNode xsi:type="topology:AggregateGroupNode" xmi:id="_0AJKogrOEeW4-_ONWXXiAw" description="The root node of the Camera's topology" nodeId="CAMERA_SYM_SYS_ROOT">
      <aggregatedChildren xsi:type="topology:TransformNode" xmi:id="_0AJKowrOEeW4-_ONWXXiAw" parent="_0AJKogrOEeW4-_ONWXXiAw" description="The required transformation from the camera root to the body" nodeId="CAMERA_SYM_SYS_ROOT_TO_BODY">
        <aggregatedChildren xsi:type="topology:URLNode" xmi:id="_0AJKpArOEeW4-_ONWXXiAw" parent="_0AJKowrOEeW4-_ONWXXiAw" description="The CAD of the camera's body" nodeId="CAMERA_SYM_SYS_CAMERA_CAD" url="platform:/plugin/org.eclipse.symphony.examples.camera.symphony/vrml/camera.wrl"/>
        <aggregatedChildren xsi:type="topology:TransformNode" xmi:id="_0AJKpQrOEeW4-_ONWXXiAw" parent="_0AJKowrOEeW4-_ONWXXiAw" description="The required transformation from the camera body to its lens" nodeId="CAMERA_SYM_SYS_BODY_TO_LENS">
          <aggregatedChildren xsi:type="topology:URLNode" xmi:id="_0AJKpgrOEeW4-_ONWXXiAw" parent="_0AJKpQrOEeW4-_ONWXXiAw" description="The CAD of the camera lens" nodeId="CAMERA_SYM_SYS_LENS_CAD" url="platform:/plugin/org.eclipse.symphony.examples.camera.symphony/vrml/lens.wrl"/>
          <aggregatedChildren xsi:type="fov:RectangularFrustrumFieldOfView" xmi:id="_0AJxsArOEeW4-_ONWXXiAw" parent="_0AJKpQrOEeW4-_ONWXXiAw" description="The camera's field of view (FOV)" nodeId="CAMERA_SYM_SYS_FOV" horizontalFieldOfViewAngle="1.9634954084936207" verticalFieldOfViewAngle="0.7853981633974483">
            <range xmi:id="_0AJxsgrOEeW4-_ONWXXiAw" maximumDistance="5.0"/>
          </aggregatedChildren>
          <position xmi:id="_0AJxswrOEeW4-_ONWXXiAw" x="0.05" z="0.15"/>
          <rotationMatrix xmi:id="_0AJxtArOEeW4-_ONWXXiAw" m00="6.123233995736766E-17" m01="-1.0" m10="1.0" m11="6.123233995736766E-17"/>
        </aggregatedChildren>
        <position xmi:id="_0AJxtQrOEeW4-_ONWXXiAw"/>
        <rotationMatrix xmi:id="_0AJxtgrOEeW4-_ONWXXiAw" m00="6.123233995736766E-17" m02="1.0" m20="-1.0" m22="6.123233995736766E-17"/>
      </aggregatedChildren>
    </originNode>
  </topologyRoot>
  <bindingSet xmi:id="_0AJxtwrOEeW4-_ONWXXiAw">
    <featureRootsList xmi:id="_0AJxuArOEeW4-_ONWXXiAw">
      <featureRoots xmi:id="_0AJxuQrOEeW4-_ONWXXiAw">
        <children xsi:type="ecore:TreeFeatureNode" xmi:id="_0AJxugrOEeW4-_ONWXXiAw">
          <structuralFeature xsi:type="ecore_1:EReference" href="org.eclipse.symphony.examples.camera.symphony#//Camera/fov"/>
        </children>
        <sourceClass href="org.eclipse.symphony.examples.camera.symphony#//Camera"/>
      </featureRoots>
    </featureRootsList>
    <bindingsList xmi:id="_0AJxuwrOEeW4-_ONWXXiAw">
      <bindings xsi:type="bindings:RectangularFrustrumFieldOfViewBinding" xmi:id="_0AJxvArOEeW4-_ONWXXiAw" description="The binding for the camera's field of view (FOV)" name="CAMERA_SYM_SYS_BIND_FOV" featureNode="_0AJxugrOEeW4-_ONWXXiAw" fov="_0AJxsArOEeW4-_ONWXXiAw"/>
    </bindingsList>
  </bindingSet>
</core:SymphonySystem>
