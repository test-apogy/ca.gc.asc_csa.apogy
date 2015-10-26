/**
 * <copyright>
 * </copyright>
 *
 * $Id: GPSFacadeImpl.java,v 1.5.4.2 2015/05/21 15:49:51 pallard Exp $
 */
package org.eclipse.symphony.addons.sensors.gps.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.symphony.addons.sensors.gps.GPSFacade;
import org.eclipse.symphony.addons.sensors.gps.GPSPoseSensor;
import org.eclipse.symphony.addons.sensors.gps.Symphony__AddonsSensorsGPSFactory;
import org.eclipse.symphony.addons.sensors.gps.Symphony__AddonsSensorsGPSPackage;
import org.eclipse.symphony.addons.sensors.gps.MarkedGPS;
import org.eclipse.symphony.common.geometry.data3d.PositionMarker;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>GPS Facade</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class GPSFacadeImpl extends MinimalEObjectImpl.Container implements GPSFacade
{
	private static GPSFacade instance = null;
	
	public static GPSFacade getInstance()
	{
		if (instance == null)
		{
			instance = new GPSFacadeImpl();
		}
		
		return instance;
	}
	
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
		return Symphony__AddonsSensorsGPSPackage.Literals.GPS_FACADE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public GPSPoseSensor createGPSPoseSensor(double originLatitude,
			double originLongitude) {

		GPSPoseSensor sensor = Symphony__AddonsSensorsGPSFactory.eINSTANCE.createGPSPoseSensor();
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
		MarkedGPS markedGPS = Symphony__AddonsSensorsGPSFactory.eINSTANCE.createMarkedGPS();

		markedGPS.setMarker(marker);

		return markedGPS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case Symphony__AddonsSensorsGPSPackage.GPS_FACADE___CREATE_GPS_POSE_SENSOR__DOUBLE_DOUBLE:
				return createGPSPoseSensor((Double)arguments.get(0), (Double)arguments.get(1));
			case Symphony__AddonsSensorsGPSPackage.GPS_FACADE___CREATE_MARKED_GPS__POSITIONMARKER:
				return createMarkedGPS((PositionMarker)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} // GPSFacadeImpl
