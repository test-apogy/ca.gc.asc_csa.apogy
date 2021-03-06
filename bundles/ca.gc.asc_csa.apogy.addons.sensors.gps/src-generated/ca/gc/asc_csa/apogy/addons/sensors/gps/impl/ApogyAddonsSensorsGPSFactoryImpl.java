package ca.gc.asc_csa.apogy.addons.sensors.gps.impl;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

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

import ca.gc.asc_csa.apogy.addons.sensors.gps.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyAddonsSensorsGPSFactoryImpl extends EFactoryImpl implements ApogyAddonsSensorsGPSFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ApogyAddonsSensorsGPSFactory init() {
		try {
			ApogyAddonsSensorsGPSFactory theApogyAddonsSensorsGPSFactory = (ApogyAddonsSensorsGPSFactory)EPackage.Registry.INSTANCE.getEFactory(ApogyAddonsSensorsGPSPackage.eNS_URI);
			if (theApogyAddonsSensorsGPSFactory != null) {
				return theApogyAddonsSensorsGPSFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ApogyAddonsSensorsGPSFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyAddonsSensorsGPSFactoryImpl() {
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
			case ApogyAddonsSensorsGPSPackage.GPS_READING: return createGPSReading();
			case ApogyAddonsSensorsGPSPackage.GPS_POSE_SENSOR: return createGPSPoseSensor();
			case ApogyAddonsSensorsGPSPackage.GPS: return createGPS();
			case ApogyAddonsSensorsGPSPackage.MARKED_GPS: return createMarkedGPS();
			case ApogyAddonsSensorsGPSPackage.APOGY_ADDONS_SENSORS_GPS_FACADE: return createApogyAddonsSensorsGPSFacade();
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
			case ApogyAddonsSensorsGPSPackage.GPS_STATUS:
				return createGPSStatusFromString(eDataType, initialValue);
			case ApogyAddonsSensorsGPSPackage.GPS_QUALITY:
				return createGPSQualityFromString(eDataType, initialValue);
			case ApogyAddonsSensorsGPSPackage.EXCEPTION:
				return createExceptionFromString(eDataType, initialValue);
			case ApogyAddonsSensorsGPSPackage.IO_EXCEPTION:
				return createIOExceptionFromString(eDataType, initialValue);
			case ApogyAddonsSensorsGPSPackage.INPUT_STREAM:
				return createInputStreamFromString(eDataType, initialValue);
			case ApogyAddonsSensorsGPSPackage.OUTPUT_STREAM:
				return createOutputStreamFromString(eDataType, initialValue);
			case ApogyAddonsSensorsGPSPackage.DATE:
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
			case ApogyAddonsSensorsGPSPackage.GPS_STATUS:
				return convertGPSStatusToString(eDataType, instanceValue);
			case ApogyAddonsSensorsGPSPackage.GPS_QUALITY:
				return convertGPSQualityToString(eDataType, instanceValue);
			case ApogyAddonsSensorsGPSPackage.EXCEPTION:
				return convertExceptionToString(eDataType, instanceValue);
			case ApogyAddonsSensorsGPSPackage.IO_EXCEPTION:
				return convertIOExceptionToString(eDataType, instanceValue);
			case ApogyAddonsSensorsGPSPackage.INPUT_STREAM:
				return convertInputStreamToString(eDataType, instanceValue);
			case ApogyAddonsSensorsGPSPackage.OUTPUT_STREAM:
				return convertOutputStreamToString(eDataType, instanceValue);
			case ApogyAddonsSensorsGPSPackage.DATE:
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
	public ApogyAddonsSensorsGPSFacade createApogyAddonsSensorsGPSFacade() {
		ApogyAddonsSensorsGPSFacadeImpl apogyAddonsSensorsGPSFacade = new ApogyAddonsSensorsGPSFacadeImpl();
		return apogyAddonsSensorsGPSFacade;
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
	public ApogyAddonsSensorsGPSPackage getApogyAddonsSensorsGPSPackage() {
		return (ApogyAddonsSensorsGPSPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ApogyAddonsSensorsGPSPackage getPackage() {
		return ApogyAddonsSensorsGPSPackage.eINSTANCE;
	}

} //ApogyAddonsSensorsGPSFactoryImpl
