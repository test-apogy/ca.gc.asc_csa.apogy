/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.addons.sensors.gps.impl;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import java.util.Date;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.symphony.addons.sensors.gps.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Symphony__AddonsSensorsGPSFactoryImpl extends EFactoryImpl implements Symphony__AddonsSensorsGPSFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Symphony__AddonsSensorsGPSFactory init() {
		try {
			Symphony__AddonsSensorsGPSFactory theSymphony__AddonsSensorsGPSFactory = (Symphony__AddonsSensorsGPSFactory)EPackage.Registry.INSTANCE.getEFactory(Symphony__AddonsSensorsGPSPackage.eNS_URI);
			if (theSymphony__AddonsSensorsGPSFactory != null) {
				return theSymphony__AddonsSensorsGPSFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Symphony__AddonsSensorsGPSFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__AddonsSensorsGPSFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Symphony__AddonsSensorsGPSPackage.GPS_READING: return createGPSReading();
			case Symphony__AddonsSensorsGPSPackage.GPS_POSE_SENSOR: return createGPSPoseSensor();
			case Symphony__AddonsSensorsGPSPackage.GPS: return createGPS();
			case Symphony__AddonsSensorsGPSPackage.MARKED_GPS: return createMarkedGPS();
			case Symphony__AddonsSensorsGPSPackage.GPS_FACADE: return createGPSFacade();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case Symphony__AddonsSensorsGPSPackage.GPS_STATUS:
				return createGPSStatusFromString(eDataType, initialValue);
			case Symphony__AddonsSensorsGPSPackage.GPS_QUALITY:
				return createGPSQualityFromString(eDataType, initialValue);
			case Symphony__AddonsSensorsGPSPackage.EXCEPTION:
				return createExceptionFromString(eDataType, initialValue);
			case Symphony__AddonsSensorsGPSPackage.IO_EXCEPTION:
				return createIOExceptionFromString(eDataType, initialValue);
			case Symphony__AddonsSensorsGPSPackage.INPUT_STREAM:
				return createInputStreamFromString(eDataType, initialValue);
			case Symphony__AddonsSensorsGPSPackage.OUTPUT_STREAM:
				return createOutputStreamFromString(eDataType, initialValue);
			case Symphony__AddonsSensorsGPSPackage.DATE:
				return createDateFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case Symphony__AddonsSensorsGPSPackage.GPS_STATUS:
				return convertGPSStatusToString(eDataType, instanceValue);
			case Symphony__AddonsSensorsGPSPackage.GPS_QUALITY:
				return convertGPSQualityToString(eDataType, instanceValue);
			case Symphony__AddonsSensorsGPSPackage.EXCEPTION:
				return convertExceptionToString(eDataType, instanceValue);
			case Symphony__AddonsSensorsGPSPackage.IO_EXCEPTION:
				return convertIOExceptionToString(eDataType, instanceValue);
			case Symphony__AddonsSensorsGPSPackage.INPUT_STREAM:
				return convertInputStreamToString(eDataType, instanceValue);
			case Symphony__AddonsSensorsGPSPackage.OUTPUT_STREAM:
				return convertOutputStreamToString(eDataType, instanceValue);
			case Symphony__AddonsSensorsGPSPackage.DATE:
				return convertDateToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GPSReading createGPSReading() {
		GPSReadingImpl gpsReading = new GPSReadingImpl();
		return gpsReading;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GPSPoseSensor createGPSPoseSensor() {
		GPSPoseSensorImpl gpsPoseSensor = new GPSPoseSensorImpl();
		return gpsPoseSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GPS createGPS() {
		GPSImpl gps = new GPSImpl();
		return gps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MarkedGPS createMarkedGPS() {
		MarkedGPSImpl markedGPS = new MarkedGPSImpl();
		return markedGPS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GPSFacade createGPSFacade() {
		GPSFacadeImpl gpsFacade = new GPSFacadeImpl();
		return gpsFacade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GPSStatus createGPSStatusFromString(EDataType eDataType, String initialValue) {
		GPSStatus result = GPSStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGPSStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GPSQuality createGPSQualityFromString(EDataType eDataType, String initialValue) {
		GPSQuality result = GPSQuality.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGPSQualityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exception createExceptionFromString(EDataType eDataType, String initialValue) {
		return (Exception)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExceptionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IOException createIOExceptionFromString(EDataType eDataType, String initialValue) {
		return (IOException)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIOExceptionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputStream createInputStreamFromString(EDataType eDataType, String initialValue) {
		return (InputStream)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInputStreamToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputStream createOutputStreamFromString(EDataType eDataType, String initialValue) {
		return (OutputStream)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOutputStreamToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date createDateFromString(EDataType eDataType, String initialValue) {
		return (Date)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDateToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__AddonsSensorsGPSPackage getSymphony__AddonsSensorsGPSPackage() {
		return (Symphony__AddonsSensorsGPSPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Symphony__AddonsSensorsGPSPackage getPackage() {
		return Symphony__AddonsSensorsGPSPackage.eINSTANCE;
	}

} //Symphony__AddonsSensorsGPSFactoryImpl
