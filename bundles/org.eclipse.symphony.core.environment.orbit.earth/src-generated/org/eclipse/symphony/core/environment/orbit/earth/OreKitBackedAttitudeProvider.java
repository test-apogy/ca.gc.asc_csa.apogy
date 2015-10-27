/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.orbit.earth;

import org.eclipse.symphony.core.environment.orbit.AttitudeProvider;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ore Kit Backed Attitude Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A specialization of AttitudeProvider that uses an OreKit org.orekit.attitudes.AttitudeProvider.
 * <!-- end-model-doc -->
 *
 *
 * @see org.eclipse.symphony.core.environment.orbit.earth.Symphony__CoreEnvironmentOrbitEarthPackage#getOreKitBackedAttitudeProvider()
 * @model abstract="true"
 * @generated
 */
public interface OreKitBackedAttitudeProvider extends AttitudeProvider {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.eclipse.symphony.core.environment.orbit.earth.OreKitAttitudeProvider" unique="false"
	 * @generated
	 */
	org.orekit.attitudes.AttitudeProvider getOreKitAttitudeProvider();

} // OreKitBackedAttitudeProvider
