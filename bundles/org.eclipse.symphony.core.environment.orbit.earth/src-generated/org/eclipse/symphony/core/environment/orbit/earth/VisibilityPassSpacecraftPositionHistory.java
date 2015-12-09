/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.orbit.earth;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Visibility Pass Spacecraft Position History</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.VisibilityPassSpacecraftPositionHistory#getTimeInterval <em>Time Interval</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.VisibilityPassSpacecraftPositionHistory#getVisibilityPass <em>Visibility Pass</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.VisibilityPassSpacecraftPositionHistory#getPositions <em>Positions</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.core.environment.orbit.earth.Symphony__CoreEnvironmentOrbitEarthPackage#getVisibilityPassSpacecraftPositionHistory()
 * @model
 * @generated
 */
public interface VisibilityPassSpacecraftPositionHistory extends EObject {
	/**
	 * Returns the value of the '<em><b>Time Interval</b></em>' attribute.
	 * The default value is <code>"30.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time interval separating positions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Interval</em>' attribute.
	 * @see #setTimeInterval(double)
	 * @see org.eclipse.symphony.core.environment.orbit.earth.Symphony__CoreEnvironmentOrbitEarthPackage#getVisibilityPassSpacecraftPositionHistory_TimeInterval()
	 * @model default="30.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' property='Editable' symphony_units='s'"
	 * @generated
	 */
	double getTimeInterval();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.orbit.earth.VisibilityPassSpacecraftPositionHistory#getTimeInterval <em>Time Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Interval</em>' attribute.
	 * @see #getTimeInterval()
	 * @generated
	 */
	void setTimeInterval(double value);

	/**
	 * Returns the value of the '<em><b>Visibility Pass</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.symphony.core.environment.orbit.earth.VisibilityPass#getPositionHistory <em>Position History</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visibility Pass</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The visibility pass containing the position history.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Visibility Pass</em>' container reference.
	 * @see #setVisibilityPass(VisibilityPass)
	 * @see org.eclipse.symphony.core.environment.orbit.earth.Symphony__CoreEnvironmentOrbitEarthPackage#getVisibilityPassSpacecraftPositionHistory_VisibilityPass()
	 * @see org.eclipse.symphony.core.environment.orbit.earth.VisibilityPass#getPositionHistory
	 * @model opposite="positionHistory" transient="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' property='None' children='false'"
	 * @generated
	 */
	VisibilityPass getVisibilityPass();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.orbit.earth.VisibilityPassSpacecraftPositionHistory#getVisibilityPass <em>Visibility Pass</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility Pass</em>' container reference.
	 * @see #getVisibilityPass()
	 * @generated
	 */
	void setVisibilityPass(VisibilityPass value);

	/**
	 * Returns the value of the '<em><b>Positions</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.symphony.core.environment.orbit.earth.VisibilityPassSpacecraftPosition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Positions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The position history.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Positions</em>' containment reference list.
	 * @see org.eclipse.symphony.core.environment.orbit.earth.Symphony__CoreEnvironmentOrbitEarthPackage#getVisibilityPassSpacecraftPositionHistory_Positions()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' property='Readonly' children='true'"
	 * @generated
	 */
	EList<VisibilityPassSpacecraftPosition> getPositions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the VisibilityPassSpacecraftPosition with the highest elevation in the position history.
	 * @return The VisibilityPassSpacecraftPosition with the highest elevation, null if the history position is empty.
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	VisibilityPassSpacecraftPosition getHighestElevationPosition();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the VisibilityPassSpacecraftPosition with the smallest spacecraft cross-track angle in the position history.
	 * @return The VisibilityPassSpacecraftPosition with the smallest spacecraft cross-track angle, null if the history position is empty.
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	VisibilityPassSpacecraftPosition getSmallestSpacecraftCrossTrackAnglePosition();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Force the update of VisibilityPassSpacecraftPositionHistory.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void updateHistory();

} // VisibilityPassSpacecraftPositionHistory
