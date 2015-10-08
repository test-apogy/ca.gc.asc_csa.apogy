/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.orbit.earth;

import org.eclipse.symphony.core.environment.GeographicCoordinates;

import ca.gc.asc_csa.eclipse.emf.ecore.Timed;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Corridor Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.CorridorPoint#getLeft <em>Left</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.CorridorPoint#getCenter <em>Center</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.CorridorPoint#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.core.environment.orbit.earth.SymphonyEarthOrbitEnvironmentPackage#getCorridorPoint()
 * @model
 * @generated
 */
public interface CorridorPoint extends Timed {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(GeographicCoordinates)
	 * @see org.eclipse.symphony.core.environment.orbit.earth.SymphonyEarthOrbitEnvironmentPackage#getCorridorPoint_Left()
	 * @model containment="true"
	 * @generated
	 */
	GeographicCoordinates getLeft();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.orbit.earth.CorridorPoint#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(GeographicCoordinates value);

	/**
	 * Returns the value of the '<em><b>Center</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Center</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Center</em>' containment reference.
	 * @see #setCenter(GeographicCoordinates)
	 * @see org.eclipse.symphony.core.environment.orbit.earth.SymphonyEarthOrbitEnvironmentPackage#getCorridorPoint_Center()
	 * @model containment="true"
	 * @generated
	 */
	GeographicCoordinates getCenter();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.orbit.earth.CorridorPoint#getCenter <em>Center</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Center</em>' containment reference.
	 * @see #getCenter()
	 * @generated
	 */
	void setCenter(GeographicCoordinates value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(GeographicCoordinates)
	 * @see org.eclipse.symphony.core.environment.orbit.earth.SymphonyEarthOrbitEnvironmentPackage#getCorridorPoint_Right()
	 * @model containment="true"
	 * @generated
	 */
	GeographicCoordinates getRight();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.orbit.earth.CorridorPoint#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(GeographicCoordinates value);

} // CorridorPoint
