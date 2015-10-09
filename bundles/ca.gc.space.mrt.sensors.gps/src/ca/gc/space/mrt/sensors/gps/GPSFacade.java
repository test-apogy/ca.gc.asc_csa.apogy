/**
 * <copyright>
 * </copyright>
 *
 * $Id: GPSFacade.java,v 1.3.4.2 2015/05/21 15:49:51 pallard Exp $
 */
package ca.gc.space.mrt.sensors.gps;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.symphony.common.geometry.data3d.PositionMarker;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>GPS Facade</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see ca.gc.space.mrt.sensors.gps.GpsPackage#getGPSFacade()
 * @model
 * @generated
 */
public interface GPSFacade extends EObject {

	public static final GPSFacade INSTANCE = GpsFactory.eINSTANCE
			.createGPSFacade();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	GPSPoseSensor createGPSPoseSensor(double originLatitude,
			double originLongitude);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	MarkedGPS createMarkedGPS(PositionMarker marker);

} // GPSFacade
