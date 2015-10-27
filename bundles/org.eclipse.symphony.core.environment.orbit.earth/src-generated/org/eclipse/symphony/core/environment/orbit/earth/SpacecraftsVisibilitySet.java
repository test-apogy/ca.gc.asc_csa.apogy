/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.orbit.earth;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.symphony.common.emf.Described;
import org.eclipse.symphony.common.emf.Named;
import org.eclipse.symphony.core.Updatable;
import org.eclipse.symphony.core.environment.orbit.OrbitModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spacecrafts Visibility Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.SpacecraftsVisibilitySet#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.SpacecraftsVisibilitySet#getEndTime <em>End Time</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.SpacecraftsVisibilitySet#getOrbitModels <em>Orbit Models</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.SpacecraftsVisibilitySet#getGroundStations <em>Ground Stations</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.SpacecraftsVisibilitySet#getPasses <em>Passes</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.SpacecraftsVisibilitySet#getGroundStationToVisibilityMap <em>Ground Station To Visibility Map</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.core.environment.orbit.earth.Symphony__CoreEnvironmentOrbitEarthPackage#getSpacecraftsVisibilitySet()
 * @model
 * @generated
 */
public interface SpacecraftsVisibilitySet extends Named, Described, Updatable {
	/**
	 * Returns the value of the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The start time of prediction period.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start Time</em>' attribute.
	 * @see #setStartTime(Date)
	 * @see org.eclipse.symphony.core.environment.orbit.earth.Symphony__CoreEnvironmentOrbitEarthPackage#getSpacecraftsVisibilitySet_StartTime()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' property='Editable' propertyCategory='TIME_PERIOD'"
	 * @generated
	 */
	Date getStartTime();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.orbit.earth.SpacecraftsVisibilitySet#getStartTime <em>Start Time</em>}' attribute.
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
	 * The end time of the prediction period.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End Time</em>' attribute.
	 * @see #setEndTime(Date)
	 * @see org.eclipse.symphony.core.environment.orbit.earth.Symphony__CoreEnvironmentOrbitEarthPackage#getSpacecraftsVisibilitySet_EndTime()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' property='Editable' propertyCategory='TIME_PERIOD'"
	 * @generated
	 */
	Date getEndTime();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.orbit.earth.SpacecraftsVisibilitySet#getEndTime <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Time</em>' attribute.
	 * @see #getEndTime()
	 * @generated
	 */
	void setEndTime(Date value);

	/**
	 * Returns the value of the '<em><b>Orbit Models</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.symphony.core.environment.orbit.OrbitModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The OrbitModel of the Spacecraft(s) to use for visibility calculation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Orbit Models</em>' reference list.
	 * @see org.eclipse.symphony.core.environment.orbit.earth.Symphony__CoreEnvironmentOrbitEarthPackage#getSpacecraftsVisibilitySet_OrbitModels()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel children='true' notify='true' property='Editable'"
	 * @generated
	 */
	EList<OrbitModel> getOrbitModels();

	/**
	 * Returns the value of the '<em><b>Ground Stations</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.symphony.core.environment.orbit.earth.GroundStation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ground station (s) for which to display Spacecraft visibility status.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ground Stations</em>' reference list.
	 * @see org.eclipse.symphony.core.environment.orbit.earth.Symphony__CoreEnvironmentOrbitEarthPackage#getSpacecraftsVisibilitySet_GroundStations()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel children='true' notify='true' property='Editable'"
	 * @generated
	 */
	EList<GroundStation> getGroundStations();

	/**
	 * Returns the value of the '<em><b>Passes</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.symphony.core.environment.orbit.earth.VisibilityPass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Passes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passes</em>' containment reference list.
	 * @see org.eclipse.symphony.core.environment.orbit.earth.Symphony__CoreEnvironmentOrbitEarthPackage#getSpacecraftsVisibilitySet_Passes()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='true' notify='true' property='Readonly'"
	 * @generated
	 */
	EList<VisibilityPass> getPasses();

	/**
	 * Returns the value of the '<em><b>Ground Station To Visibility Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A map that contains the GroundStation to VisibilityPass relationships.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ground Station To Visibility Map</em>' attribute.
	 * @see #setGroundStationToVisibilityMap(Map)
	 * @see org.eclipse.symphony.core.environment.orbit.earth.Symphony__CoreEnvironmentOrbitEarthPackage#getSpacecraftsVisibilitySet_GroundStationToVisibilityMap()
	 * @model unique="false" dataType="org.eclipse.symphony.core.environment.orbit.earth.Map<org.eclipse.symphony.core.environment.orbit.earth.GroundStation, org.eclipse.symphony.core.environment.orbit.earth.List<org.eclipse.symphony.core.environment.orbit.earth.VisibilityPass>>" transient="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='false' notify='true' property='None'"
	 * @generated
	 */
	Map<GroundStation, List<VisibilityPass>> getGroundStationToVisibilityMap();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.orbit.earth.SpacecraftsVisibilitySet#getGroundStationToVisibilityMap <em>Ground Station To Visibility Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ground Station To Visibility Map</em>' attribute.
	 * @see #getGroundStationToVisibilityMap()
	 * @generated
	 */
	void setGroundStationToVisibilityMap(Map<GroundStation, List<VisibilityPass>> value);

} // SpacecraftsVisibilitySet
