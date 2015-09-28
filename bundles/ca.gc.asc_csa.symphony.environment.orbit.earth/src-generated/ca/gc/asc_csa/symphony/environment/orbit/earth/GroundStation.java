/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.environment.orbit.earth;

import ca.gc.space.math.Matrix3x3;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ground Station</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Defines a ground station and its associated Field Of View.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.orbit.earth.GroundStation#getFieldOfViewOrientation <em>Field Of View Orientation</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.orbit.earth.GroundStation#getElevationMask <em>Elevation Mask</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.SymphonyEarthOrbitEnvironmentPackage#getGroundStation()
 * @model
 * @generated
 */
public interface GroundStation extends EarthSurfaceLocation {
	/**
	 * Returns the value of the '<em><b>Field Of View Orientation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field Of View Orientation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The orientation of the field of view relative to the Ground Station frame.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Field Of View Orientation</em>' containment reference.
	 * @see #setFieldOfViewOrientation(Matrix3x3)
	 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.SymphonyEarthOrbitEnvironmentPackage#getGroundStation_FieldOfViewOrientation()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true'"
	 * @generated
	 */
	Matrix3x3 getFieldOfViewOrientation();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.symphony.environment.orbit.earth.GroundStation#getFieldOfViewOrientation <em>Field Of View Orientation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field Of View Orientation</em>' containment reference.
	 * @see #getFieldOfViewOrientation()
	 * @generated
	 */
	void setFieldOfViewOrientation(Matrix3x3 value);

	/**
	 * Returns the value of the '<em><b>Elevation Mask</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The elevation mask of the Ground Station.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Elevation Mask</em>' containment reference.
	 * @see #setElevationMask(ElevationMask)
	 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.SymphonyEarthOrbitEnvironmentPackage#getGroundStation_ElevationMask()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true'"
	 * @generated
	 */
	ElevationMask getElevationMask();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.symphony.environment.orbit.earth.GroundStation#getElevationMask <em>Elevation Mask</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elevation Mask</em>' containment reference.
	 * @see #getElevationMask()
	 * @generated
	 */
	void setElevationMask(ElevationMask value);

} // GroundStation
