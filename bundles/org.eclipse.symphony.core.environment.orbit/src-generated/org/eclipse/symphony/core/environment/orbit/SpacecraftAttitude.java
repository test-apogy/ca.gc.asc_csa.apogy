/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.orbit;

import org.eclipse.symphony.common.emf.Timed;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spacecraft Attitude</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * This class represents the rotation between a reference frame and the satellite frame, as well as the spin of the satellite (axis and rotation rate).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.SpacecraftAttitude#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.SpacecraftAttitude#getReferenceFrame <em>Reference Frame</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.core.environment.orbit.SymphonyOrbitEnvironmentPackage#getSpacecraftAttitude()
 * @model
 * @generated
 */
public interface SpacecraftAttitude extends Timed {

	/**
	 * Returns the value of the '<em><b>Orientation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orientation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orientation</em>' containment reference.
	 * @see #setOrientation(TimedStampedAngularCoordinates)
	 * @see org.eclipse.symphony.core.environment.orbit.SymphonyOrbitEnvironmentPackage#getSpacecraftAttitude_Orientation()
	 * @model containment="true"
	 * @generated
	 */
	TimedStampedAngularCoordinates getOrientation();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.orbit.SpacecraftAttitude#getOrientation <em>Orientation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientation</em>' containment reference.
	 * @see #getOrientation()
	 * @generated
	 */
	void setOrientation(TimedStampedAngularCoordinates value);

	/**
	 * Returns the value of the '<em><b>Reference Frame</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Frame</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Frame</em>' containment reference.
	 * @see #setReferenceFrame(AbstractFrame)
	 * @see org.eclipse.symphony.core.environment.orbit.SymphonyOrbitEnvironmentPackage#getSpacecraftAttitude_ReferenceFrame()
	 * @model containment="true"
	 * @generated
	 */
	AbstractFrame getReferenceFrame();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.orbit.SpacecraftAttitude#getReferenceFrame <em>Reference Frame</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Frame</em>' containment reference.
	 * @see #getReferenceFrame()
	 * @generated
	 */
	void setReferenceFrame(AbstractFrame value);
} // SpacecraftAttitude
