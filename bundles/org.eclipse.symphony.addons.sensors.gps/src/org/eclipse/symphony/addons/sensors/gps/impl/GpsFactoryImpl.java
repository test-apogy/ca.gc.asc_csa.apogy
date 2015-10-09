/**
 * <copyright>
 * </copyright>
 *
 * $Id: GpsFactoryImpl.java,v 1.6.4.3 2015/09/22 19:39:37 rlarcheveque Exp $
 */
package org.eclipse.symphony.addons.sensors.gps.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.symphony.addons.sensors.gps.GPS;
import org.eclipse.symphony.addons.sensors.gps.GPSFacade;
import org.eclipse.symphony.addons.sensors.gps.GPSPoseSensor;
import org.eclipse.symphony.addons.sensors.gps.GPSReading;
import org.eclipse.symphony.addons.sensors.gps.GPS_QUALITY;
import org.eclipse.symphony.addons.sensors.gps.GPS_STATUS;
import org.eclipse.symphony.addons.sensors.gps.GpsFactory;
import org.eclipse.symphony.addons.sensors.gps.GpsPackage;
import org.eclipse.symphony.addons.sensors.gps.MarkedGPS;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class GpsFactoryImpl extends EFactoryImpl implements GpsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static GpsFactory init() {
		try {
			GpsFactory theGpsFactory = (GpsFactory)EPackage.Registry.INSTANCE.getEFactory(GpsPackage.eNS_URI);
			if (theGpsFactory != null) {
				return theGpsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GpsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public GpsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case GpsPackage.GPS: return createGPS();
			case GpsPackage.GPS_READING: return createGPSReading();
			case GpsPackage.GPS_POSE_SENSOR: return createGPSPoseSensor();
			case GpsPackage.GPS_FACADE: return createGPSFacade();
			case GpsPackage.MARKED_GPS: return createMarkedGPS();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case GpsPackage.GPS_QUALITY:
				return createGPS_QUALITYFromString(eDataType, initialValue);
			case GpsPackage.GPS_STATUS:
				return createGPS_STATUSFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case GpsPackage.GPS_QUALITY:
				return convertGPS_QUALITYToString(eDataType, instanceValue);
			case GpsPackage.GPS_STATUS:
				return convertGPS_STATUSToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public GPS createGPS() {
		GPSImpl gps = new GPSImpl();
		return gps;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public GPSReading createGPSReading() {
		GPSReadingImpl gpsReading = new GPSReadingImpl();
		return gpsReading;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public GPSPoseSensor createGPSPoseSensor() {
		GPSPoseSensorImpl gpsPoseSensor = new GPSPoseSensorImpl();
		return gpsPoseSensor;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public GPSFacade createGPSFacade() {
		GPSFacadeImpl gpsFacade = new GPSFacadeImpl();
		return gpsFacade;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MarkedGPS createMarkedGPS() {
		MarkedGPSImpl markedGPS = new MarkedGPSImpl();
		return markedGPS;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public GPS_QUALITY createGPS_QUALITYFromString(EDataType eDataType,
			String initialValue) {
		GPS_QUALITY result = GPS_QUALITY.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGPS_QUALITYToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public GPS_STATUS createGPS_STATUSFromString(EDataType eDataType,
			String initialValue) {
		GPS_STATUS result = GPS_STATUS.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGPS_STATUSToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public GpsPackage getGpsPackage() {
		return (GpsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GpsPackage getPackage() {
		return GpsPackage.eINSTANCE;
	}

} // GpsFactoryImpl
