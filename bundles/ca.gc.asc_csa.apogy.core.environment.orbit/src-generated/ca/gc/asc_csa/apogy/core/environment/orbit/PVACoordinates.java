/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.orbit;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.symphony.common.math.Tuple3d;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PVA Coordinates</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines the triplet of Position, Velocity, Acceleration.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.PVACoordinates#getPosition <em>Position</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.PVACoordinates#getVelocity <em>Velocity</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.PVACoordinates#getAcceleration <em>Acceleration</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.PVACoordinates#getAngularVelocity <em>Angular Velocity</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.core.environment.orbit.Symphony__CoreEnvironmentOrbitPackage#getPVACoordinates()
 * @model
 * @generated
 */
public interface PVACoordinates extends EObject {
	/**
	 * Returns the value of the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The position.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Position</em>' containment reference.
	 * @see #setPosition(Tuple3d)
	 * @see org.eclipse.symphony.core.environment.orbit.Symphony__CoreEnvironmentOrbitPackage#getPVACoordinates_Position()
	 * @model containment="true" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel symphony_units='m'"
	 * @generated
	 */
	Tuple3d getPosition();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.orbit.PVACoordinates#getPosition <em>Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' containment reference.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(Tuple3d value);

	/**
	 * Returns the value of the '<em><b>Velocity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Velocity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The velocity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Velocity</em>' containment reference.
	 * @see #setVelocity(Tuple3d)
	 * @see org.eclipse.symphony.core.environment.orbit.Symphony__CoreEnvironmentOrbitPackage#getPVACoordinates_Velocity()
	 * @model containment="true" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel symphony_units='m/s'"
	 * @generated
	 */
	Tuple3d getVelocity();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.orbit.PVACoordinates#getVelocity <em>Velocity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Velocity</em>' containment reference.
	 * @see #getVelocity()
	 * @generated
	 */
	void setVelocity(Tuple3d value);

	/**
	 * Returns the value of the '<em><b>Acceleration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Acceleration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The acceleration.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Acceleration</em>' containment reference.
	 * @see #setAcceleration(Tuple3d)
	 * @see org.eclipse.symphony.core.environment.orbit.Symphony__CoreEnvironmentOrbitPackage#getPVACoordinates_Acceleration()
	 * @model containment="true" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel symphony_units='m/s\262'"
	 * @generated
	 */
	Tuple3d getAcceleration();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.orbit.PVACoordinates#getAcceleration <em>Acceleration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Acceleration</em>' containment reference.
	 * @see #getAcceleration()
	 * @generated
	 */
	void setAcceleration(Tuple3d value);

	/**
	 * Returns the value of the '<em><b>Angular Velocity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Angular Velocity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The angular velocity (spin) of this point as seen from the origin.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Angular Velocity</em>' containment reference.
	 * @see #setAngularVelocity(Tuple3d)
	 * @see org.eclipse.symphony.core.environment.orbit.Symphony__CoreEnvironmentOrbitPackage#getPVACoordinates_AngularVelocity()
	 * @model containment="true" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel symphony_units='rad/s'"
	 * @generated
	 */
	Tuple3d getAngularVelocity();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.orbit.PVACoordinates#getAngularVelocity <em>Angular Velocity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angular Velocity</em>' containment reference.
	 * @see #getAngularVelocity()
	 * @generated
	 */
	void setAngularVelocity(Tuple3d value);

} // PVACoordinates
