/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core.environment.orbit.earth;

import ca.gc.asc_csa.apogy.core.environment.orbit.Orbit;
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
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLEEarthOrbitPropagator#getOrbitAtEpoch <em>Orbit At Epoch</em>}</li>
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
	 * Returns the value of the '<em><b>Orbit At Epoch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The orbit as defined at the epoch time. This is what is return as this propagator initial orbit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Orbit At Epoch</em>' containment reference.
	 * @see #setOrbitAtEpoch(Orbit)
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage#getTLEEarthOrbitPropagator_OrbitAtEpoch()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' property='Readonly'"
	 * @generated
	 */
	Orbit getOrbitAtEpoch();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLEEarthOrbitPropagator#getOrbitAtEpoch <em>Orbit At Epoch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orbit At Epoch</em>' containment reference.
	 * @see #getOrbitAtEpoch()
	 * @generated
	 */
	void setOrbitAtEpoch(Orbit value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="ca.gc.asc_csa.apogy.core.environment.orbit.earth.OreKitTLEPropagator" unique="false"
	 * @generated
	 */
	TLEPropagator getOreKitTLEPropagator();

} // TLEEarthOrbitPropagator
