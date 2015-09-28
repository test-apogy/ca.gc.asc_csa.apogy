/**
 * <copyright>
 * </copyright>
 *
 * $Id: MarkedGPS.java,v 1.2.4.2 2015/05/21 15:49:51 pallard Exp $
 */
package ca.gc.space.mrt.sensors.gps;

import ca.gc.space.mrt.geometry.data3d.PositionMarker;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Marked GPS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.space.mrt.sensors.gps.MarkedGPS#getMarker <em>Marker</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.space.mrt.sensors.gps.GpsPackage#getMarkedGPS()
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
	 * @see ca.gc.space.mrt.sensors.gps.GpsPackage#getMarkedGPS_Marker()
	 * @model containment="true"
	 * @generated
	 */
	PositionMarker getMarker();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.sensors.gps.MarkedGPS#getMarker <em>Marker</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Marker</em>' containment reference.
	 * @see #getMarker()
	 * @generated
	 */
	void setMarker(PositionMarker value);

} // MarkedGPS
