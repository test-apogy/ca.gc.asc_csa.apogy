/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.orbit.earth;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.symphony.core.environment.orbit.OrbitModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Visibility Pass</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Class that defines a visibility pass.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.VisibilityPass#getOrbitModel <em>Orbit Model</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.VisibilityPass#getSurfaceLocation <em>Surface Location</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.VisibilityPass#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.VisibilityPass#getEndTime <em>End Time</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.VisibilityPass#getPositionHistory <em>Position History</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.VisibilityPass#getDuration <em>Duration</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.core.environment.orbit.earth.SymphonyEarthOrbitEnvironmentPackage#getVisibilityPass()
 * @model
 * @generated
 */
public interface VisibilityPass extends EObject {
	/**
	 * Returns the value of the '<em><b>Orbit Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Orbit Model that was used to compute the visibility.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Orbit Model</em>' reference.
	 * @see #setOrbitModel(OrbitModel)
	 * @see org.eclipse.symphony.core.environment.orbit.earth.SymphonyEarthOrbitEnvironmentPackage#getVisibilityPass_OrbitModel()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' property='Readonly'"
	 * @generated
	 */
	OrbitModel getOrbitModel();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.orbit.earth.VisibilityPass#getOrbitModel <em>Orbit Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orbit Model</em>' reference.
	 * @see #getOrbitModel()
	 * @generated
	 */
	void setOrbitModel(OrbitModel value);

	/**
	 * Returns the value of the '<em><b>Surface Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Surface Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The surface locations.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Surface Location</em>' reference.
	 * @see #setSurfaceLocation(EarthSurfaceLocation)
	 * @see org.eclipse.symphony.core.environment.orbit.earth.SymphonyEarthOrbitEnvironmentPackage#getVisibilityPass_SurfaceLocation()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' property='Readonly'"
	 * @generated
	 */
	EarthSurfaceLocation getSurfaceLocation();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.orbit.earth.VisibilityPass#getSurfaceLocation <em>Surface Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Surface Location</em>' reference.
	 * @see #getSurfaceLocation()
	 * @generated
	 */
	void setSurfaceLocation(EarthSurfaceLocation value);

	/**
	 * Returns the value of the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The start time of the pass.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start Time</em>' attribute.
	 * @see #setStartTime(Date)
	 * @see org.eclipse.symphony.core.environment.orbit.earth.SymphonyEarthOrbitEnvironmentPackage#getVisibilityPass_StartTime()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' property='Readonly'"
	 * @generated
	 */
	Date getStartTime();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.orbit.earth.VisibilityPass#getStartTime <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Time</em>' attribute.
	 * @see #getStartTime()
	 * @generated
	 */
	void setStartTime(Date value);

	/**
	 * Returns the value of the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The end time of the pass.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End Time</em>' attribute.
	 * @see #setEndTime(Date)
	 * @see org.eclipse.symphony.core.environment.orbit.earth.SymphonyEarthOrbitEnvironmentPackage#getVisibilityPass_EndTime()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' property='Readonly'"
	 * @generated
	 */
	Date getEndTime();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.orbit.earth.VisibilityPass#getEndTime <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Time</em>' attribute.
	 * @see #getEndTime()
	 * @generated
	 */
	void setEndTime(Date value);

	/**
	 * Returns the value of the '<em><b>Position History</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.symphony.core.environment.orbit.earth.VisibilityPassSpacecraftPositionHistory#getVisibilityPass <em>Visibility Pass</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position History</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The end time of the pass.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Position History</em>' containment reference.
	 * @see #setPositionHistory(VisibilityPassSpacecraftPositionHistory)
	 * @see org.eclipse.symphony.core.environment.orbit.earth.SymphonyEarthOrbitEnvironmentPackage#getVisibilityPass_PositionHistory()
	 * @see org.eclipse.symphony.core.environment.orbit.earth.VisibilityPassSpacecraftPositionHistory#getVisibilityPass
	 * @model opposite="visibilityPass" containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' property='Readonly' children='true'"
	 * @generated
	 */
	VisibilityPassSpacecraftPositionHistory getPositionHistory();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.orbit.earth.VisibilityPass#getPositionHistory <em>Position History</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position History</em>' containment reference.
	 * @see #getPositionHistory()
	 * @generated
	 */
	void setPositionHistory(VisibilityPassSpacecraftPositionHistory value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Pass duration, in seconds.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(double)
	 * @see org.eclipse.symphony.core.environment.orbit.earth.SymphonyEarthOrbitEnvironmentPackage#getVisibilityPass_Duration()
	 * @model unique="false" transient="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel csa_unit='s'"
	 * @generated
	 */
	double getDuration();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.orbit.earth.VisibilityPass#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(double value);

} // VisibilityPass
