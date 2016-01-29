/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core.environment.orbit.earth;

import ca.gc.asc_csa.apogy.core.environment.orbit.TimedStampedPVACoordinates;
import org.orekit.orbits.CartesianOrbit;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cartesian Earth Orbit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.CartesianEarthOrbit#getPvaCoordinates <em>Pva Coordinates</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage#getCartesianEarthOrbit()
 * @model
 * @generated
 */
public interface CartesianEarthOrbit extends EarthOrbit {
	/**
	 * Returns the value of the '<em><b>Pva Coordinates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pva Coordinates</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pva Coordinates</em>' containment reference.
	 * @see #setPvaCoordinates(TimedStampedPVACoordinates)
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage#getCartesianEarthOrbit_PvaCoordinates()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TimedStampedPVACoordinates getPvaCoordinates();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.CartesianEarthOrbit#getPvaCoordinates <em>Pva Coordinates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pva Coordinates</em>' containment reference.
	 * @see #getPvaCoordinates()
	 * @generated
	 */
	void setPvaCoordinates(TimedStampedPVACoordinates value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="ca.gc.asc_csa.apogy.core.environment.orbit.earth.OreKitCartesianOrbit" unique="false"
	 * @generated
	 */
	CartesianOrbit getOreKitCartesianOrbit();

} // CartesianEarthOrbit
