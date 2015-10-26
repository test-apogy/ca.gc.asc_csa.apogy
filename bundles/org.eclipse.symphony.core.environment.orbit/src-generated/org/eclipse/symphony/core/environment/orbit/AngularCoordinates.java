/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.orbit;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.symphony.common.math.Matrix3x3;
import org.eclipse.symphony.common.math.Tuple3d;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Angular Coordinates</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.AngularCoordinates#getRotation <em>Rotation</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.AngularCoordinates#getAngularRate <em>Angular Rate</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.AngularCoordinates#getAngularAcceleration <em>Angular Acceleration</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.core.environment.orbit.SymphonyOrbitEnvironmentPackage#getAngularCoordinates()
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
	 * @see org.eclipse.symphony.core.environment.orbit.SymphonyOrbitEnvironmentPackage#getAngularCoordinates_Rotation()
	 * @model containment="true"
	 * @generated
	 */
	Matrix3x3 getRotation();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.orbit.AngularCoordinates#getRotation <em>Rotation</em>}' containment reference.
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
	 * @see org.eclipse.symphony.core.environment.orbit.SymphonyOrbitEnvironmentPackage#getAngularCoordinates_AngularRate()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Tuple3d getAngularRate();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.orbit.AngularCoordinates#getAngularRate <em>Angular Rate</em>}' containment reference.
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
	 * @see org.eclipse.symphony.core.environment.orbit.SymphonyOrbitEnvironmentPackage#getAngularCoordinates_AngularAcceleration()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Tuple3d getAngularAcceleration();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.orbit.AngularCoordinates#getAngularAcceleration <em>Angular Acceleration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angular Acceleration</em>' containment reference.
	 * @see #getAngularAcceleration()
	 * @generated
	 */
	void setAngularAcceleration(Tuple3d value);

} // AngularCoordinates
