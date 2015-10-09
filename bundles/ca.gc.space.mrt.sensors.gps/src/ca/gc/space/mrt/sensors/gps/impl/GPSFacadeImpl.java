/**
 * <copyright>
 * </copyright>
 *
 * $Id: GPSFacadeImpl.java,v 1.5.4.2 2015/05/21 15:49:51 pallard Exp $
 */
package ca.gc.space.mrt.sensors.gps.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.symphony.common.geometry.data3d.PositionMarker;

import ca.gc.space.mrt.sensors.gps.GPSFacade;
import ca.gc.space.mrt.sensors.gps.GPSPoseSensor;
import ca.gc.space.mrt.sensors.gps.GpsFactory;
import ca.gc.space.mrt.sensors.gps.GpsPackage;
import ca.gc.space.mrt.sensors.gps.MarkedGPS;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>GPS Facade</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class GPSFacadeImpl extends EObjectImpl implements GPSFacade {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected GPSFacadeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GpsPackage.Literals.GPS_FACADE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public GPSPoseSensor createGPSPoseSensor(double originLatitude,
			double originLongitude) {

		GPSPoseSensor sensor = GpsFactory.eINSTANCE.createGPSPoseSensor();
		sensor.setOriginLatitude(originLatitude);
		sensor.setOriginLongitude(originLongitude);

		return sensor;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public MarkedGPS createMarkedGPS(PositionMarker marker) {
		MarkedGPS markedGPS = GpsFactory.eINSTANCE.createMarkedGPS();

		markedGPS.setMarker(marker);

		return markedGPS;
	}

} // GPSFacadeImpl
