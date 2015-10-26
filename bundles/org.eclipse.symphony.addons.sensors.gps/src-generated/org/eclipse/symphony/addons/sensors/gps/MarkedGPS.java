/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.addons.sensors.gps;

import org.eclipse.symphony.common.geometry.data3d.PositionMarker;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Marked GPS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.sensors.gps.MarkedGPS#getMarker <em>Marker</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.addons.sensors.gps.GpsPackage#getMarkedGPS()
 * @model
 * @generated
 */
public interface MarkedGPS extends GPS {
	/**
	 * Returns the value of the '<em><b>Marker</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Marker</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Marker</em>' containment reference.
	 * @see #setMarker(PositionMarker)
	 * @see org.eclipse.symphony.addons.sensors.gps.GpsPackage#getMarkedGPS_Marker()
	 * @model containment="true"
	 * @generated
	 */
	PositionMarker getMarker();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.sensors.gps.MarkedGPS#getMarker <em>Marker</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Marker</em>' containment reference.
	 * @see #getMarker()
	 * @generated
	 */
	void setMarker(PositionMarker value);

} // MarkedGPS
