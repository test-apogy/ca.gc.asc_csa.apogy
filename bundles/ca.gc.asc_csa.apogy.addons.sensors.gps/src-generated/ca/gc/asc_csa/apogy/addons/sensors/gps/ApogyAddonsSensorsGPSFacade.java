/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.addons.sensors.gps;

import org.eclipse.emf.ecore.EObject;
import ca.gc.asc_csa.apogy.addons.sensors.gps.impl.ApogyAddonsSensorsGPSFacadeImpl;
import ca.gc.asc_csa.apogy.common.geometry.data3d.PositionMarker;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GPS Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.ApogyAddonsSensorsGPSPackage#getApogyAddonsSensorsGPSFacade()
 * @model
 * @generated
 */
public interface ApogyAddonsSensorsGPSFacade extends EObject {

	public static final ApogyAddonsSensorsGPSFacade INSTANCE = ApogyAddonsSensorsGPSFacadeImpl.getInstance();

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

} // ApogyAddonsSensorsGPSFacade
