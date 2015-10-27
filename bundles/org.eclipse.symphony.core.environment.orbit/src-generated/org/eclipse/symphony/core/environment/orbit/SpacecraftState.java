/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.orbit;

import org.eclipse.symphony.common.emf.Timed;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spacecraft State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines a space craft state (position, velocity, acceleration and attitude) at one point in time.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.SpacecraftState#getCoordinates <em>Coordinates</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.SpacecraftState#getAttitude <em>Attitude</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.SpacecraftState#getOrbit <em>Orbit</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.core.environment.orbit.Symphony__CoreEnvironmentOrbitPackage#getSpacecraftState()
 * @model
 * @generated
 */
public interface SpacecraftState extends Timed {
	/**
	 * Returns the value of the '<em><b>Coordinates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coordinates</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The spacecraft PVA coordinates at the specified time.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Coordinates</em>' containment reference.
	 * @see #setCoordinates(TimedStampedPVACoordinates)
	 * @see org.eclipse.symphony.core.environment.orbit.Symphony__CoreEnvironmentOrbitPackage#getSpacecraftState_Coordinates()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Readonly'"
	 * @generated
	 */
	TimedStampedPVACoordinates getCoordinates();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.orbit.SpacecraftState#getCoordinates <em>Coordinates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordinates</em>' containment reference.
	 * @see #getCoordinates()
	 * @generated
	 */
	void setCoordinates(TimedStampedPVACoordinates value);

	/**
	 * Returns the value of the '<em><b>Attitude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attitude</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The spacecraft attitude at the specified time.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Attitude</em>' containment reference.
	 * @see #setAttitude(TimedStampedAngularCoordinates)
	 * @see org.eclipse.symphony.core.environment.orbit.Symphony__CoreEnvironmentOrbitPackage#getSpacecraftState_Attitude()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Readonly'"
	 * @generated
	 */
	TimedStampedAngularCoordinates getAttitude();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.orbit.SpacecraftState#getAttitude <em>Attitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attitude</em>' containment reference.
	 * @see #getAttitude()
	 * @generated
	 */
	void setAttitude(TimedStampedAngularCoordinates value);

	/**
	 * Returns the value of the '<em><b>Orbit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The spacecraft orbit at the specified time.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Orbit</em>' containment reference.
	 * @see #setOrbit(Orbit)
	 * @see org.eclipse.symphony.core.environment.orbit.Symphony__CoreEnvironmentOrbitPackage#getSpacecraftState_Orbit()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Readonly'"
	 * @generated
	 */
	Orbit getOrbit();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.orbit.SpacecraftState#getOrbit <em>Orbit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orbit</em>' containment reference.
	 * @see #getOrbit()
	 * @generated
	 */
	void setOrbit(Orbit value);

} // SpacecraftState
