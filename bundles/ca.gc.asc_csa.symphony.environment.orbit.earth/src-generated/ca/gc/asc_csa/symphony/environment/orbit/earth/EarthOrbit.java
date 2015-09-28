/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.environment.orbit.earth;

import ca.gc.asc_csa.symphony.environment.orbit.Orbit;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Earth Orbit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Defines an Orbit around the Earth.
 * <!-- end-model-doc -->
 *
 *
 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.SymphonyEarthOrbitEnvironmentPackage#getEarthOrbit()
 * @model abstract="true"
 * @generated
 */
public interface EarthOrbit extends Orbit {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the underlying OreKit Orbit.
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="ca.gc.asc_csa.symphony.environment.orbit.earth.OreKitOrbit" unique="false"
	 * @generated
	 */
	org.orekit.orbits.Orbit getOreKitOrbit();
} // EarthOrbit
