/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui;

import ca.gc.asc_csa.apogy.core.environment.orbit.earth.GroundStation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ground Station World Wind Layer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.GroundStationWorldWindLayer#getGroundStation <em>Ground Station</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.GroundStationWorldWindLayer#getReferenceAltitude <em>Reference Altitude</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.ApogyCoreEnvironmentOrbitEarthUIPackage#getGroundStationWorldWindLayer()
 * @model
 * @generated
 */
public interface GroundStationWorldWindLayer extends EarthSurfaceLocationWorldWindLayer {
	/**
	 * Returns the value of the '<em><b>Ground Station</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ground Station</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ground Station</em>' reference.
	 * @see #setGroundStation(GroundStation)
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.ApogyCoreEnvironmentOrbitEarthUIPackage#getGroundStationWorldWindLayer_GroundStation()
	 * @model
	 * @generated
	 */
	GroundStation getGroundStation();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.GroundStationWorldWindLayer#getGroundStation <em>Ground Station</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ground Station</em>' reference.
	 * @see #getGroundStation()
	 * @generated
	 */
	void setGroundStation(GroundStation value);

	/**
	 * Returns the value of the '<em><b>Reference Altitude</b></em>' attribute.
	 * The default value is <code>"500"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The altitude to which to project
	 * the ElevationMask.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference Altitude</em>' attribute.
	 * @see #setReferenceAltitude(double)
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.ApogyCoreEnvironmentOrbitEarthUIPackage#getGroundStationWorldWindLayer_ReferenceAltitude()
	 * @model default="500" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='VISUALS' apogy_units='km'"
	 * @generated
	 */
	double getReferenceAltitude();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.GroundStationWorldWindLayer#getReferenceAltitude <em>Reference Altitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Altitude</em>' attribute.
	 * @see #getReferenceAltitude()
	 * @generated
	 */
	void setReferenceAltitude(double value);

} // GroundStationWorldWindLayer