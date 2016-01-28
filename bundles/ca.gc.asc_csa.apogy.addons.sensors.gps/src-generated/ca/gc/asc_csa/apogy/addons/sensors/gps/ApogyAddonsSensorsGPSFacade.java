/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.addons.sensors.gps;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.symphony.addons.sensors.gps.impl.Symphony__AddonsSensorsGPSFacadeImpl;
import org.eclipse.symphony.common.geometry.data3d.PositionMarker;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GPS Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.symphony.addons.sensors.gps.Symphony__AddonsSensorsGPSPackage#getSymphony__AddonsSensorsGPSFacade()
 * @model
 * @generated
 */
public interface Symphony__AddonsSensorsGPSFacade extends EObject {

	public static final Symphony__AddonsSensorsGPSFacade INSTANCE = Symphony__AddonsSensorsGPSFacadeImpl.getInstance();

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

} // Symphony__AddonsSensorsGPSFacade
