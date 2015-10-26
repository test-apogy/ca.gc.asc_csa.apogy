/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.orbit.earth;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>URL Based TLE Earth Orbit Propagator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.URLBasedTLEEarthOrbitPropagator#getTleURL <em>Tle URL</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.core.environment.orbit.earth.SymphonyEarthOrbitEnvironmentPackage#getURLBasedTLEEarthOrbitPropagator()
 * @model
 * @generated
 */
public interface URLBasedTLEEarthOrbitPropagator extends TLEEarthOrbitPropagator {
	/**
	 * Returns the value of the '<em><b>Tle URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The URl pointing to the source of the TLE.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tle URL</em>' attribute.
	 * @see #setTleURL(String)
	 * @see org.eclipse.symphony.core.environment.orbit.earth.SymphonyEarthOrbitEnvironmentPackage#getURLBasedTLEEarthOrbitPropagator_TleURL()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Editable' propertyCategory='TLE_RAW_DATA' notify='true'"
	 * @generated
	 */
	String getTleURL();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.orbit.earth.URLBasedTLEEarthOrbitPropagator#getTleURL <em>Tle URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tle URL</em>' attribute.
	 * @see #getTleURL()
	 * @generated
	 */
	void setTleURL(String value);

} // URLBasedTLEEarthOrbitPropagator
