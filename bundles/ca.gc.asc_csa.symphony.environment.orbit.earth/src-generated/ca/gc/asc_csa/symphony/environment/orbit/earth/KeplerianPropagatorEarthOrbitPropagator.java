/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.environment.orbit.earth;

import org.orekit.propagation.analytical.KeplerianPropagator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Keplerian Propagator Earth Orbit Propagator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Simple keplerian orbit propagator for Earth orbits.
 * <!-- end-model-doc -->
 *
 *
 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.SymphonyEarthOrbitEnvironmentPackage#getKeplerianPropagatorEarthOrbitPropagator()
 * @model
 * @generated
 */
public interface KeplerianPropagatorEarthOrbitPropagator extends EarthOrbitPropagator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gets the underlying OreKit KeplerianPropagator used to do computations.
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="ca.gc.asc_csa.symphony.environment.orbit.earth.OreKitKeplerianPropagator" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' property='Readonly'"
	 * @generated
	 */
	KeplerianPropagator getOreKitKeplerianPropagator();

} // KeplerianPropagatorEarthOrbitPropagator
