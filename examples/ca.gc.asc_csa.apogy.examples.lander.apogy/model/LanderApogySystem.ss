<?xml version="1.0" encoding="UTF-8"?>
<core:SymphonySystem xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:bindings="org.eclipse.symphony.common.topology.bindings" xmlns:topology="org.eclipse.symphony.common.topology" xmlns:core="org.eclipse.symphony.core" xmlns:ecore="org.eclipse.symphony.common.emf" xmlns:ecore_1="http://www.eclipse.org/emf/2002/Ecore" xmlns:vehicle="org.eclipse.symphony.addons.vehicle" xmi:id="_6dMtoArOEeW4-_ONWXXiAw" name="LanderSymphonySystem">
  <interfaceClass href="org.eclipse.symphony.examples.lander#//Lander"/>
  <typeApiAdapterClass href="org.eclipse.symphony.examples.lander.symphony#//LanderSymphonySystemApiAdapter"/>
  <topologyRoot xmi:id="_6dMtoQrOEeW4-_ONWXXiAw">
    <originNode xsi:type="topology:AggregateGroupNode" xmi:id="_6dMtogrOEeW4-_ONWXXiAw" description="The base of the lander" nodeId="LANDER_SYM_SYS_ROOT">
      <aggregatedChildren xsi:type="topology:TransformNode" xmi:id="_6dMtowrOEeW4-_ONWXXiAw" parent="_6dMtogrOEeW4-_ONWXXiAw" description="The transformation from the base (root) to the omni antenna" nodeId="LANDER_SYM_SYS_OMNI_ANTENNA">
        <position xmi:id="_6dMtpArOEeW4-_ONWXXiAw" z="0.5"/>
        <rotationMatrix xmi:id="_6dMtpQrOEeW4-_ONWXXiAw"/>
      </aggregatedChildren>
      <aggregatedChildren xsi:type="topology:TransformNode" xmi:id="_6dMtpgrOEeW4-_ONWXXiAw" parent="_6dMtogrOEeW4-_ONWXXiAw" description="The transformation from the base (root) to the CAD for the lander" nodeId="LANDER_SYM_SYS_CAD_TRANSFORM">
        <aggregatedChildren xsi:type="topology:URLNode" xmi:id="_6dNUsArOEeW4-_ONWXXiAw" parent="_6dMtpgrOEeW4-_ONWXXiAw" description="The CAD of the lander" nodeId="LANDER_SYM_SYS_LANDER_CAD" url="platform:/plugin/org.eclipse.symphony.examples.lander.symphony/vrml/lander.wrl"/>
        <position xmi:id="_6dNUsQrOEeW4-_ONWXXiAw"/>
        <rotationMatrix xmi:id="_6dNUsgrOEeW4-_ONWXXiAw" m11="6.123233995736766E-17" m12="1.0" m21="-1.0" m22="6.123233995736766E-17"/>
      </aggregatedChildren>
      <aggregatedChildren xsi:type="topology:TransformNode" xmi:id="_6dNUswrOEeW4-_ONWXXiAw" parent="_6dMtogrOEeW4-_ONWXXiAw" description="The transformation from the base (root) to the lander's leg 'A'" nodeId="LANDER_SYM_SYS_LEG_A">
        <aggregatedChildren xsi:type="topology:TransformNode" xmi:id="_6dNUtArOEeW4-_ONWXXiAw" parent="_6dNUswrOEeW4-_ONWXXiAw" description="The transformation for the joint for leg 'A' of the lander" nodeId="LANDER_SYM_SYS_LEG_A_JOINT">
          <aggregatedChildren xsi:type="vehicle:LanderSphericalFoot" xmi:id="_6dNUtQrOEeW4-_ONWXXiAw" parent="_6dNUtArOEeW4-_ONWXXiAw" description="The foot of the lander's leg 'A'" nodeId="LANDER_SYM_SYS_LEG_A_FOOT">
            <physicalProperties xmi:id="_6dNUtgrOEeW4-_ONWXXiAw">
              <inertiaMatrix xmi:id="_6dNUtwrOEeW4-_ONWXXiAw"/>
              <centerOfMassLocation xmi:id="_6dNUuArOEeW4-_ONWXXiAw"/>
            </physicalProperties>
          </aggregatedChildren>
          <position xmi:id="_6dNUuQrOEeW4-_ONWXXiAw"/>
          <rotationMatrix xmi:id="_6dNUugrOEeW4-_ONWXXiAw"/>
        </aggregatedChildren>
        <position xmi:id="_6dNUuwrOEeW4-_ONWXXiAw" y="0.64" z="0.04"/>
        <rotationMatrix xmi:id="_6dNUvArOEeW4-_ONWXXiAw"/>
      </aggregatedChildren>
      <aggregatedChildren xsi:type="topology:TransformNode" xmi:id="_6dNUvQrOEeW4-_ONWXXiAw" parent="_6dMtogrOEeW4-_ONWXXiAw" description="The transformation from the base (root) to the lander's leg 'B'" nodeId="LANDER_SYM_SYS_LEG_B">
        <aggregatedChildren xsi:type="topology:TransformNode" xmi:id="_6dNUvgrOEeW4-_ONWXXiAw" parent="_6dNUvQrOEeW4-_ONWXXiAw" description="The transformation for the joint for leg 'B' of the lander" nodeId="LANDER_SYM_SYS_LEG_B_JOINT">
          <aggregatedChildren xsi:type="vehicle:LanderSphericalFoot" xmi:id="_6dNUvwrOEeW4-_ONWXXiAw" parent="_6dNUvgrOEeW4-_ONWXXiAw" description="The foot of the lander's leg 'B'" nodeId="LANDER_SYM_SYS_LEG_B_FOOT">
            <physicalProperties xmi:id="_6dNUwArOEeW4-_ONWXXiAw">
              <inertiaMatrix xmi:id="_6dNUwQrOEeW4-_ONWXXiAw"/>
              <centerOfMassLocation xmi:id="_6dNUwgrOEeW4-_ONWXXiAw"/>
            </physicalProperties>
          </aggregatedChildren>
          <position xmi:id="_6dNUwwrOEeW4-_ONWXXiAw"/>
          <rotationMatrix xmi:id="_6dNUxArOEeW4-_ONWXXiAw"/>
        </aggregatedChildren>
        <position xmi:id="_6dNUxQrOEeW4-_ONWXXiAw" x="0.554" y="-0.32" z="0.04"/>
        <rotationMatrix xmi:id="_6dNUxgrOEeW4-_ONWXXiAw"/>
      </aggregatedChildren>
      <aggregatedChildren xsi:type="topology:TransformNode" xmi:id="_6dNUxwrOEeW4-_ONWXXiAw" parent="_6dMtogrOEeW4-_ONWXXiAw" description="The transformation from the base (root) to the lander's leg 'C'" nodeId="LANDER_SYM_SYS_LEG_C">
        <aggregatedChildren xsi:type="topology:TransformNode" xmi:id="_6dNUyArOEeW4-_ONWXXiAw" parent="_6dNUxwrOEeW4-_ONWXXiAw" description="The transformation for the joint for leg 'C' of the lander" nodeId="LANDER_SYM_SYS_LEG_C_JOINT">
          <aggregatedChildren xsi:type="vehicle:LanderSphericalFoot" xmi:id="_6dNUyQrOEeW4-_ONWXXiAw" parent="_6dNUyArOEeW4-_ONWXXiAw" description="The foot of the lander's leg 'C'" nodeId="LANDER_SYM_SYS_LEG_C_FOOT">
            <physicalProperties xmi:id="_6dNUygrOEeW4-_ONWXXiAw">
              <inertiaMatrix xmi:id="_6dNUywrOEeW4-_ONWXXiAw"/>
              <centerOfMassLocation xmi:id="_6dNUzArOEeW4-_ONWXXiAw"/>
            </physicalProperties>
          </aggregatedChildren>
          <position xmi:id="_6dNUzQrOEeW4-_ONWXXiAw"/>
          <rotationMatrix xmi:id="_6dNUzgrOEeW4-_ONWXXiAw"/>
        </aggregatedChildren>
        <position xmi:id="_6dNUzwrOEeW4-_ONWXXiAw" x="-0.554" y="-0.32" z="0.04"/>
        <rotationMatrix xmi:id="_6dNU0ArOEeW4-_ONWXXiAw"/>
      </aggregatedChildren>
      <aggregatedChildren xsi:type="topology:TransformNode" xmi:id="_6dNU0QrOEeW4-_ONWXXiAw" parent="_6dMtogrOEeW4-_ONWXXiAw" description="The transformation from the base (root) to the thruster" nodeId="LANDER_SYM_SYS_THRUSTER_TRANSFORM">
        <aggregatedChildren xsi:type="vehicle:Thruster" xmi:id="_6dNU0grOEeW4-_ONWXXiAw" parent="_6dNU0QrOEeW4-_ONWXXiAw" description="The lander's actual thruster " nodeId="LANDER_SYM_SYS_THRUSTER"/>
        <position xmi:id="_6dNU0wrOEeW4-_ONWXXiAw" z="0.3"/>
        <rotationMatrix xmi:id="_6dNU1ArOEeW4-_ONWXXiAw" m11="-1.0" m12="-1.2246467991473532E-16" m21="1.2246467991473532E-16" m22="-1.0"/>
      </aggregatedChildren>
    </originNode>
  </topologyRoot>
  <bindingSet xmi:id="_6dNU1QrOEeW4-_ONWXXiAw">
    <featureRootsList xmi:id="_6dNU1grOEeW4-_ONWXXiAw">
      <featureRoots xmi:id="_6dNU1wrOEeW4-_ONWXXiAw">
        <children xsi:type="ecore:TreeFeatureNode" xmi:id="_6dNU2ArOEeW4-_ONWXXiAw">
          <structuralFeature xsi:type="ecore_1:EAttribute" href="org.eclipse.symphony.examples.lander#//Lander/legAPosition"/>
        </children>
        <children xsi:type="ecore:TreeFeatureNode" xmi:id="_6dNU2QrOEeW4-_ONWXXiAw">
          <structuralFeature xsi:type="ecore_1:EAttribute" href="org.eclipse.symphony.examples.lander#//Lander/legBPosition"/>
        </children>
        <children xsi:type="ecore:TreeFeatureNode" xmi:id="_6dNU2grOEeW4-_ONWXXiAw">
          <structuralFeature xsi:type="ecore_1:EAttribute" href="org.eclipse.symphony.examples.lander#//Lander/legCPosition"/>
        </children>
        <children xsi:type="ecore:TreeFeatureNode" xmi:id="_6dNU2wrOEeW4-_ONWXXiAw">
          <structuralFeature xsi:type="ecore_1:EReference" href="org.eclipse.symphony.examples.lander#//Lander/thruster"/>
        </children>
        <sourceClass href="org.eclipse.symphony.examples.lander#//Lander"/>
      </featureRoots>
    </featureRootsList>
    <bindingsList xmi:id="_6dNU3ArOEeW4-_ONWXXiAw">
      <bindings xsi:type="bindings:TranslationBinding" xmi:id="_6dNU3QrOEeW4-_ONWXXiAw" description="The binding for the extension position of the lander's leg 'A'" name="LANDER_SYM_SYS_BIND_LEG_A_EXTENSION_POSITION" featureNode="_6dNU2ArOEeW4-_ONWXXiAw" positionNode="_6dNUtArOEeW4-_ONWXXiAw" translationAxis="MINUS_Z_AXIS"/>
      <bindings xsi:type="bindings:TranslationBinding" xmi:id="_6dNU3grOEeW4-_ONWXXiAw" description="The binding for the extension position of the lander's leg 'B'" name="LANDER_SYM_SYS_BIND_LEG_B_EXTENSION_POSITION" featureNode="_6dNU2QrOEeW4-_ONWXXiAw" positionNode="_6dNUvgrOEeW4-_ONWXXiAw" translationAxis="MINUS_Z_AXIS"/>
      <bindings xsi:type="bindings:TranslationBinding" xmi:id="_6dNU3wrOEeW4-_ONWXXiAw" description="The binding for the extension position of the lander's leg 'C'" name="LANDER_SYM_SYS_BIND_LEG_C_EXTENSION_POSITION" featureNode="_6dNU2grOEeW4-_ONWXXiAw" positionNode="_6dNUyArOEeW4-_ONWXXiAw" translationAxis="MINUS_Z_AXIS"/>
      <bindings xsi:type="vehicle:ThrusterBinding" xmi:id="_6dNU4ArOEeW4-_ONWXXiAw" description="The binding for the lander's thruster" name="LANDER_SYM_SYS_BIND_THRUSTER" featureNode="_6dNU2wrOEeW4-_ONWXXiAw" thruster="_6dNU0grOEeW4-_ONWXXiAw"/>
    </bindingsList>
  </bindingSet>
  <connectionPointsList xmi:id="_6dNU4QrOEeW4-_ONWXXiAw">
    <connectionPoints xmi:id="_6dN7wArOEeW4-_ONWXXiAw" name="LANDER_SYM_SYS_CONNECT_OMNI_ANTENNA" description="The connection point for a omni antenna" node="_6dMtowrOEeW4-_ONWXXiAw"/>
  </connectionPointsList>
</core:SymphonySystem>
