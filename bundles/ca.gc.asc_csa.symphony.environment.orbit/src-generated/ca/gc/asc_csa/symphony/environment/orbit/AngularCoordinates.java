/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.environment.orbit;

import ca.gc.space.math.Matrix3x3;
import ca.gc.space.math.Tuple3d;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Angular Coordinates</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.orbit.AngularCoordinates#getRotation <em>Rotation</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.orbit.AngularCoordinates#getAngularRate <em>Angular Rate</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.orbit.AngularCoordinates#getAngularAcceleration <em>Angular Acceleration</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.symphony.environment.orbit.SymphonyOrbitEnvironmentPackage#getAngularCoordinates()
 * @model
 * @generated
 */
public interface AngularCoordinates extends EObject {
	/**
	 * Returns the value of the '<em><b>Rotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The rotation expressed as a rotation matrix.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rotation</em>' containment reference.
	 * @see #setRotation(Matrix3x3)
	 * @see ca.gc.asc_csa.symphony.environment.orbit.SymphonyOrbitEnvironmentPackage#getAngularCoordinates_Rotation()
	 * @model containment="true"
	 * @generated
	 */
	Matrix3x3 getRotation();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.symphony.environment.orbit.AngularCoordinates#getRotation <em>Rotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rotation</em>' containment reference.
	 * @see #getRotation()
	 * @generated
	 */
	void setRotation(Matrix3x3 value);

	/**
	 * Returns the value of the '<em><b>Angular Rate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The rotation rates, in rad/s
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Angular Rate</em>' containment reference.
	 * @see #setAngularRate(Tuple3d)
	 * @see ca.gc.asc_csa.symphony.environment.orbit.SymphonyOrbitEnvironmentPackage#getAngularCoordinates_AngularRate()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Tuple3d getAngularRate();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.symphony.environment.orbit.AngularCoordinates#getAngularRate <em>Angular Rate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angular Rate</em>' containment reference.
	 * @see #getAngularRate()
	 * @generated
	 */
	void setAngularRate(Tuple3d value);

	/**
	 * Returns the value of the '<em><b>Angular Acceleration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The rotation acceleration, in rad/s²
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Angular Acceleration</em>' containment reference.
	 * @see #setAngularAcceleration(Tuple3d)
	 * @see ca.gc.asc_csa.symphony.environment.orbit.SymphonyOrbitEnvironmentPackage#getAngularCoordinates_AngularAcceleration()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Tuple3d getAngularAcceleration();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.symphony.environment.orbit.AngularCoordinates#getAngularAcceleration <em>Angular Acceleration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angular Acceleration</em>' containment reference.
	 * @see #getAngularAcceleration()
	 * @generated
	 */
	void setAngularAcceleration(Tuple3d value);

} // AngularCoordinates
