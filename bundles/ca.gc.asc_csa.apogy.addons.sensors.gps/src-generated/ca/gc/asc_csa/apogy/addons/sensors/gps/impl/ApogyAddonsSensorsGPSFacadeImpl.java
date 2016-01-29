/**
 * <copyright>
 * </copyright>
 *
 * $Id: ApogyAddonsSensorsGPSFacadeImpl.java,v 1.5.4.2 2015/05/21 15:49:51 pallard Exp $
 */
package ca.gc.asc_csa.apogy.addons.sensors.gps.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import ca.gc.asc_csa.apogy.addons.sensors.gps.ApogyAddonsSensorsGPSFacade;
import ca.gc.asc_csa.apogy.addons.sensors.gps.GPSPoseSensor;
import ca.gc.asc_csa.apogy.addons.sensors.gps.ApogyAddonsSensorsGPSFactory;
import ca.gc.asc_csa.apogy.addons.sensors.gps.ApogyAddonsSensorsGPSPackage;
import ca.gc.asc_csa.apogy.addons.sensors.gps.MarkedGPS;
import ca.gc.asc_csa.apogy.common.geometry.data3d.PositionMarker;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>GPS Facade</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class ApogyAddonsSensorsGPSFacadeImpl extends MinimalEObjectImpl.Container implements ApogyAddonsSensorsGPSFacade
{
	private static ApogyAddonsSensorsGPSFacade instance = null;
	
	public static ApogyAddonsSensorsGPSFacade getInstance()
	{
		if (instance == null)
		{
			instance = new ApogyAddonsSensorsGPSFacadeImpl();
		}
		
		return instance;
	}
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ApogyAddonsSensorsGPSFacadeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyAddonsSensorsGPSPackage.Literals.APOGY_ADDONS_SENSORS_GPS_FACADE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public GPSPoseSensor createGPSPoseSensor(double originLatitude,
			double originLongitude) {

		GPSPoseSensor sensor = ApogyAddonsSensorsGPSFactory.eINSTANCE.createGPSPoseSensor();
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
		MarkedGPS markedGPS = ApogyAddonsSensorsGPSFactory.eINSTANCE.createMarkedGPS();

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
			case ApogyAddonsSensorsGPSPackage.APOGY_ADDONS_SENSORS_GPS_FACADE___CREATE_GPS_POSE_SENSOR__DOUBLE_DOUBLE:
				return createGPSPoseSensor((Double)arguments.get(0), (Double)arguments.get(1));
			case ApogyAddonsSensorsGPSPackage.APOGY_ADDONS_SENSORS_GPS_FACADE___CREATE_MARKED_GPS__POSITIONMARKER:
				return createMarkedGPS((PositionMarker)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} // ApogyAddonsSensorsGPSFacadeImpl
