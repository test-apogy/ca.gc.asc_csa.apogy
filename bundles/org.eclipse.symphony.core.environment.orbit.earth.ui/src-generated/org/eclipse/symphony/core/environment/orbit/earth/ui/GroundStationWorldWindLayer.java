/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.orbit.earth.ui;

import org.eclipse.symphony.core.environment.orbit.earth.GroundStation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ground Station World Wind Layer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.ui.GroundStationWorldWindLayer#getGroundStation <em>Ground Station</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.ui.GroundStationWorldWindLayer#getReferenceAltitude <em>Reference Altitude</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.core.environment.orbit.earth.ui.SymphonyEarthOrbitEnvironmentUIPackage#getGroundStationWorldWindLayer()
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
	 * @see org.eclipse.symphony.core.environment.orbit.earth.ui.SymphonyEarthOrbitEnvironmentUIPackage#getGroundStationWorldWindLayer_GroundStation()
	 * @model
	 * @generated
	 */
	GroundStation getGroundStation();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.orbit.earth.ui.GroundStationWorldWindLayer#getGroundStation <em>Ground Station</em>}' reference.
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
	 * The altitude to which to project the ElevationMask.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference Altitude</em>' attribute.
	 * @see #setReferenceAltitude(double)
	 * @see org.eclipse.symphony.core.environment.orbit.earth.ui.SymphonyEarthOrbitEnvironmentUIPackage#getGroundStationWorldWindLayer_ReferenceAltitude()
	 * @model default="500" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='VISUALS' csa_units='km'"
	 * @generated
	 */
	double getReferenceAltitude();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.orbit.earth.ui.GroundStationWorldWindLayer#getReferenceAltitude <em>Reference Altitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Altitude</em>' attribute.
	 * @see #getReferenceAltitude()
	 * @generated
	 */
	void setReferenceAltitude(double value);

} // GroundStationWorldWindLayer
