/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.orbit.earth;

import org.orekit.propagation.analytical.KeplerianPropagator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Keplerian Earth Orbit Propagator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Simple keplerian orbit propagator for Earth orbits.
 * <!-- end-model-doc -->
 *
 *
 * @see org.eclipse.symphony.core.environment.orbit.earth.Symphony__CoreEnvironmentOrbitEarthPackage#getKeplerianEarthOrbitPropagator()
 * @model
 * @generated
 */
public interface KeplerianEarthOrbitPropagator extends EarthOrbitPropagator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gets the underlying OreKit KeplerianPropagator used to do computations.
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="org.eclipse.symphony.core.environment.orbit.earth.OreKitKeplerianPropagator" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' property='Readonly'"
	 * @generated
	 */
	KeplerianPropagator getOreKitKeplerianPropagator();

} // KeplerianEarthOrbitPropagator
