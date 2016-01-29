/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core.environment.orbit.earth;

import org.orekit.propagation.analytical.tle.TLEPropagator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TLE Earth Orbit Propagator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLEEarthOrbitPropagator#getTle <em>Tle</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage#getTLEEarthOrbitPropagator()
 * @model
 * @generated
 */
public interface TLEEarthOrbitPropagator extends EarthOrbitPropagator {
	/**
	 * Returns the value of the '<em><b>Tle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Two-Line Elements used by this propagator.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tle</em>' containment reference.
	 * @see #setTle(TLE)
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage#getTLEEarthOrbitPropagator_Tle()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TLE getTle();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLEEarthOrbitPropagator#getTle <em>Tle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tle</em>' containment reference.
	 * @see #getTle()
	 * @generated
	 */
	void setTle(TLE value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="ca.gc.asc_csa.apogy.core.environment.orbit.earth.OreKitTLEPropagator" unique="false"
	 * @generated
	 */
	TLEPropagator getOreKitTLEPropagator();

} // TLEEarthOrbitPropagator
