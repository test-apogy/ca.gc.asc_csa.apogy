/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.environment.orbit.earth;

import ca.gc.asc_csa.symphony.environment.orbit.AttitudeProvider;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ore Kit Backed Attitude Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * A specialization of AttitudeProvider that uses an OreKit org.orekit.attitudes.AttitudeProvider.
 * <!-- end-model-doc -->
 *
 *
 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.SymphonyEarthOrbitEnvironmentPackage#getOreKitBackedAttitudeProvider()
 * @model abstract="true"
 * @generated
 */
public interface OreKitBackedAttitudeProvider extends AttitudeProvider {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="ca.gc.asc_csa.symphony.environment.orbit.earth.OreKitAttitudeProvider" unique="false"
	 * @generated
	 */
	org.orekit.attitudes.AttitudeProvider getOreKitAttitudeProvider();

} // OreKitBackedAttitudeProvider
