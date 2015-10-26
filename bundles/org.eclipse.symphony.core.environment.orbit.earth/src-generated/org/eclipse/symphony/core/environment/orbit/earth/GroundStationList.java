/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.orbit.earth;

import org.eclipse.emf.common.util.EList;
import org.eclipse.symphony.common.emf.Described;
import org.eclipse.symphony.common.emf.Named;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ground Station List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.GroundStationList#getGroundStations <em>Ground Stations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.core.environment.orbit.earth.SymphonyEarthOrbitEnvironmentPackage#getGroundStationList()
 * @model
 * @generated
 */
public interface GroundStationList extends Named, Described {
	/**
	 * Returns the value of the '<em><b>Ground Stations</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.symphony.core.environment.orbit.earth.GroundStation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ground Stations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ground Stations</em>' containment reference list.
	 * @see org.eclipse.symphony.core.environment.orbit.earth.SymphonyEarthOrbitEnvironmentPackage#getGroundStationList_GroundStations()
	 * @model containment="true"
	 * @generated
	 */
	EList<GroundStation> getGroundStations();

} // GroundStationList
