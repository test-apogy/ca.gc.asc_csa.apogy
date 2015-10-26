/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.addons.sensors.gps;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.symphony.addons.sensors.gps.impl.GPSFacadeImpl;
import org.eclipse.symphony.common.geometry.data3d.PositionMarker;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GPS Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.symphony.addons.sensors.gps.Symphony__AddonsSensorsGPSPackage#getGPSFacade()
 * @model
 * @generated
 */
public interface GPSFacade extends EObject {

	public static final GPSFacade INSTANCE = GPSFacadeImpl.getInstance();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" originLatitudeUnique="false" originLongitudeUnique="false"
	 * @generated
	 */
	GPSPoseSensor createGPSPoseSensor(double originLatitude, double originLongitude);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" markerUnique="false"
	 * @generated
	 */
	MarkedGPS createMarkedGPS(PositionMarker marker);

} // GPSFacade
