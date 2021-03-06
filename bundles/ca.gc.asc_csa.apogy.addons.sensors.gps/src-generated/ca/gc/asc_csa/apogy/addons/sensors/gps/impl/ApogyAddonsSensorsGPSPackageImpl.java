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
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import ca.gc.asc_csa.apogy.addons.sensors.gps.GPSConnection;
import ca.gc.asc_csa.apogy.addons.sensors.gps.GPSDataInterpreter;
import ca.gc.asc_csa.apogy.addons.sensors.gps.ApogyAddonsSensorsGPSFacade;
import ca.gc.asc_csa.apogy.addons.sensors.gps.GPSPoseSensor;
import ca.gc.asc_csa.apogy.addons.sensors.gps.GPSQuality;
import ca.gc.asc_csa.apogy.addons.sensors.gps.GPSReading;
import ca.gc.asc_csa.apogy.addons.sensors.gps.GPSRepository;
import ca.gc.asc_csa.apogy.addons.sensors.gps.GPSStatus;
import ca.gc.asc_csa.apogy.addons.sensors.gps.ApogyAddonsSensorsGPSFactory;
import ca.gc.asc_csa.apogy.addons.sensors.gps.ApogyAddonsSensorsGPSPackage;
import ca.gc.asc_csa.apogy.addons.sensors.gps.MarkedGPS;
import ca.gc.asc_csa.apogy.addons.sensors.pose.ApogyAddonsSensorsPosePackage;
import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyAddonsSensorsGPSPackageImpl extends EPackageImpl implements ApogyAddonsSensorsGPSPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gpsConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gpsDataInterpreterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gpsReadingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gpsPoseSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gpsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass markedGPSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gpsRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apogyAddonsSensorsGPSFacadeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gpsStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gpsQualityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType exceptionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType ioExceptionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType inputStreamEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType outputStreamEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dateEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.ApogyAddonsSensorsGPSPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ApogyAddonsSensorsGPSPackageImpl() {
		super(eNS_URI, ApogyAddonsSensorsGPSFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ApogyAddonsSensorsGPSPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ApogyAddonsSensorsGPSPackage init() {
		if (isInited) return (ApogyAddonsSensorsGPSPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyAddonsSensorsGPSPackage.eNS_URI);

		// Obtain or create and register package
		ApogyAddonsSensorsGPSPackageImpl theApogyAddonsSensorsGPSPackage = (ApogyAddonsSensorsGPSPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ApogyAddonsSensorsGPSPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ApogyAddonsSensorsGPSPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ApogyAddonsSensorsPosePackage.eINSTANCE.eClass();
		ApogyCommonEMFPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theApogyAddonsSensorsGPSPackage.createPackageContents();

		// Initialize created meta-data
		theApogyAddonsSensorsGPSPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theApogyAddonsSensorsGPSPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ApogyAddonsSensorsGPSPackage.eNS_URI, theApogyAddonsSensorsGPSPackage);
		return theApogyAddonsSensorsGPSPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGPSConnection() {
		return gpsConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGPSConnection_Input() {
		return (EAttribute)gpsConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGPSConnection_Output() {
		return (EAttribute)gpsConnectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGPSConnection__Reset() {
		return gpsConnectionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGPSDataInterpreter() {
		return gpsDataInterpreterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGPSDataInterpreter_Gps() {
		return (EReference)gpsDataInterpreterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGPSDataInterpreter__UpdateGPS() {
		return gpsDataInterpreterEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGPSReading() {
		return gpsReadingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGPSReading_Latitude() {
		return (EAttribute)gpsReadingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGPSReading_Longitude() {
		return (EAttribute)gpsReadingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGPSReading_Elevation() {
		return (EAttribute)gpsReadingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGPSReading_Quality() {
		return (EAttribute)gpsReadingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGPSReading_TimeStamp() {
		return (EAttribute)gpsReadingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGPSReading_NumberOfSatellites() {
		return (EAttribute)gpsReadingEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGPSReading_HorizontalDilutionPos() {
		return (EAttribute)gpsReadingEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGPSReading_MeanSeaLevel() {
		return (EAttribute)gpsReadingEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGPSReading_CheckSum() {
		return (EAttribute)gpsReadingEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGPSPoseSensor() {
		return gpsPoseSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGPSPoseSensor_Gps() {
		return (EReference)gpsPoseSensorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGPSPoseSensor_OriginLatitude() {
		return (EAttribute)gpsPoseSensorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGPSPoseSensor_OriginLongitude() {
		return (EAttribute)gpsPoseSensorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGPSPoseSensor_NeAngle() {
		return (EAttribute)gpsPoseSensorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGPSPoseSensor_OriginElevation() {
		return (EAttribute)gpsPoseSensorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGPSPoseSensor_MaxInitTime() {
		return (EAttribute)gpsPoseSensorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGPS() {
		return gpsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGPS_Connection() {
		return (EReference)gpsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGPS_DataInterpreter() {
		return (EReference)gpsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGPS_Reading() {
		return (EReference)gpsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGPS_Status() {
		return (EAttribute)gpsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGPS_UpdateRate() {
		return (EAttribute)gpsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGPS_LastFailure() {
		return (EAttribute)gpsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGPS_MaxReconnectTime() {
		return (EAttribute)gpsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGPS_SpeedKnots() {
		return (EAttribute)gpsEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGPS_SpeedKmh() {
		return (EAttribute)gpsEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGPS__Start() {
		return gpsEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGPS__Stop() {
		return gpsEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGPS__Reset() {
		return gpsEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGPS__Reconnect() {
		return gpsEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMarkedGPS() {
		return markedGPSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMarkedGPS_Marker() {
		return (EReference)markedGPSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGPSRepository() {
		return gpsRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGPSRepository_GpsDevices() {
		return (EReference)gpsRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGPSRepository__ScanForDevices() {
		return gpsRepositoryEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGPSRepository__GetGPSById__String() {
		return gpsRepositoryEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApogyAddonsSensorsGPSFacade() {
		return apogyAddonsSensorsGPSFacadeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyAddonsSensorsGPSFacade__CreateGPSPoseSensor__double_double() {
		return apogyAddonsSensorsGPSFacadeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyAddonsSensorsGPSFacade__CreateMarkedGPS__PositionMarker() {
		return apogyAddonsSensorsGPSFacadeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGPSStatus() {
		return gpsStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGPSQuality() {
		return gpsQualityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getException() {
		return exceptionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIOException() {
		return ioExceptionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getInputStream() {
		return inputStreamEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getOutputStream() {
		return outputStreamEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDate() {
		return dateEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyAddonsSensorsGPSFactory getApogyAddonsSensorsGPSFactory() {
		return (ApogyAddonsSensorsGPSFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		gpsConnectionEClass = createEClass(GPS_CONNECTION);
		createEAttribute(gpsConnectionEClass, GPS_CONNECTION__INPUT);
		createEAttribute(gpsConnectionEClass, GPS_CONNECTION__OUTPUT);
		createEOperation(gpsConnectionEClass, GPS_CONNECTION___RESET);

		gpsDataInterpreterEClass = createEClass(GPS_DATA_INTERPRETER);
		createEReference(gpsDataInterpreterEClass, GPS_DATA_INTERPRETER__GPS);
		createEOperation(gpsDataInterpreterEClass, GPS_DATA_INTERPRETER___UPDATE_GPS);

		gpsReadingEClass = createEClass(GPS_READING);
		createEAttribute(gpsReadingEClass, GPS_READING__LATITUDE);
		createEAttribute(gpsReadingEClass, GPS_READING__LONGITUDE);
		createEAttribute(gpsReadingEClass, GPS_READING__ELEVATION);
		createEAttribute(gpsReadingEClass, GPS_READING__QUALITY);
		createEAttribute(gpsReadingEClass, GPS_READING__TIME_STAMP);
		createEAttribute(gpsReadingEClass, GPS_READING__NUMBER_OF_SATELLITES);
		createEAttribute(gpsReadingEClass, GPS_READING__HORIZONTAL_DILUTION_POS);
		createEAttribute(gpsReadingEClass, GPS_READING__MEAN_SEA_LEVEL);
		createEAttribute(gpsReadingEClass, GPS_READING__CHECK_SUM);

		gpsPoseSensorEClass = createEClass(GPS_POSE_SENSOR);
		createEReference(gpsPoseSensorEClass, GPS_POSE_SENSOR__GPS);
		createEAttribute(gpsPoseSensorEClass, GPS_POSE_SENSOR__ORIGIN_LATITUDE);
		createEAttribute(gpsPoseSensorEClass, GPS_POSE_SENSOR__ORIGIN_LONGITUDE);
		createEAttribute(gpsPoseSensorEClass, GPS_POSE_SENSOR__NE_ANGLE);
		createEAttribute(gpsPoseSensorEClass, GPS_POSE_SENSOR__ORIGIN_ELEVATION);
		createEAttribute(gpsPoseSensorEClass, GPS_POSE_SENSOR__MAX_INIT_TIME);

		gpsEClass = createEClass(GPS);
		createEReference(gpsEClass, GPS__CONNECTION);
		createEReference(gpsEClass, GPS__DATA_INTERPRETER);
		createEReference(gpsEClass, GPS__READING);
		createEAttribute(gpsEClass, GPS__STATUS);
		createEAttribute(gpsEClass, GPS__UPDATE_RATE);
		createEAttribute(gpsEClass, GPS__LAST_FAILURE);
		createEAttribute(gpsEClass, GPS__MAX_RECONNECT_TIME);
		createEAttribute(gpsEClass, GPS__SPEED_KNOTS);
		createEAttribute(gpsEClass, GPS__SPEED_KMH);
		createEOperation(gpsEClass, GPS___START);
		createEOperation(gpsEClass, GPS___STOP);
		createEOperation(gpsEClass, GPS___RESET);
		createEOperation(gpsEClass, GPS___RECONNECT);

		markedGPSEClass = createEClass(MARKED_GPS);
		createEReference(markedGPSEClass, MARKED_GPS__MARKER);

		gpsRepositoryEClass = createEClass(GPS_REPOSITORY);
		createEReference(gpsRepositoryEClass, GPS_REPOSITORY__GPS_DEVICES);
		createEOperation(gpsRepositoryEClass, GPS_REPOSITORY___SCAN_FOR_DEVICES);
		createEOperation(gpsRepositoryEClass, GPS_REPOSITORY___GET_GPS_BY_ID__STRING);

		apogyAddonsSensorsGPSFacadeEClass = createEClass(APOGY_ADDONS_SENSORS_GPS_FACADE);
		createEOperation(apogyAddonsSensorsGPSFacadeEClass, APOGY_ADDONS_SENSORS_GPS_FACADE___CREATE_GPS_POSE_SENSOR__DOUBLE_DOUBLE);
		createEOperation(apogyAddonsSensorsGPSFacadeEClass, APOGY_ADDONS_SENSORS_GPS_FACADE___CREATE_MARKED_GPS__POSITIONMARKER);

		// Create enums
		gpsStatusEEnum = createEEnum(GPS_STATUS);
		gpsQualityEEnum = createEEnum(GPS_QUALITY);

		// Create data types
		exceptionEDataType = createEDataType(EXCEPTION);
		ioExceptionEDataType = createEDataType(IO_EXCEPTION);
		inputStreamEDataType = createEDataType(INPUT_STREAM);
		outputStreamEDataType = createEDataType(OUTPUT_STREAM);
		dateEDataType = createEDataType(DATE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		ApogyAddonsSensorsPosePackage theApogyAddonsSensorsPosePackage = (ApogyAddonsSensorsPosePackage)EPackage.Registry.INSTANCE.getEPackage(ApogyAddonsSensorsPosePackage.eNS_URI);
		ApogyCommonEMFPackage theApogyCommonEMFPackage = (ApogyCommonEMFPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCommonEMFPackage.eNS_URI);
		ApogyCommonGeometryData3DPackage theApogyCommonGeometryData3DPackage = (ApogyCommonGeometryData3DPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCommonGeometryData3DPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		gpsPoseSensorEClass.getESuperTypes().add(theApogyAddonsSensorsPosePackage.getPoseSensor());
		gpsPoseSensorEClass.getESuperTypes().add(theApogyCommonEMFPackage.getServer());
		markedGPSEClass.getESuperTypes().add(this.getGPS());

		// Initialize classes, features, and operations; add parameters
		initEClass(gpsConnectionEClass, GPSConnection.class, "GPSConnection", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGPSConnection_Input(), this.getInputStream(), "input", null, 1, 1, GPSConnection.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGPSConnection_Output(), this.getOutputStream(), "output", null, 1, 1, GPSConnection.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getGPSConnection__Reset(), null, "reset", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getIOException());

		initEClass(gpsDataInterpreterEClass, GPSDataInterpreter.class, "GPSDataInterpreter", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGPSDataInterpreter_Gps(), this.getGPS(), this.getGPS_DataInterpreter(), "gps", null, 0, 1, GPSDataInterpreter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getGPSDataInterpreter__UpdateGPS(), null, "updateGPS", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getIOException());

		initEClass(gpsReadingEClass, GPSReading.class, "GPSReading", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGPSReading_Latitude(), theEcorePackage.getEDouble(), "latitude", null, 0, 1, GPSReading.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGPSReading_Longitude(), theEcorePackage.getEDouble(), "longitude", null, 0, 1, GPSReading.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGPSReading_Elevation(), theEcorePackage.getEDouble(), "elevation", null, 0, 1, GPSReading.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGPSReading_Quality(), this.getGPSQuality(), "quality", null, 0, 1, GPSReading.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGPSReading_TimeStamp(), this.getDate(), "timeStamp", null, 0, 1, GPSReading.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGPSReading_NumberOfSatellites(), theEcorePackage.getEInt(), "numberOfSatellites", null, 0, 1, GPSReading.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGPSReading_HorizontalDilutionPos(), theEcorePackage.getEDouble(), "horizontalDilutionPos", null, 0, 1, GPSReading.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGPSReading_MeanSeaLevel(), theEcorePackage.getEDouble(), "meanSeaLevel", null, 0, 1, GPSReading.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGPSReading_CheckSum(), theEcorePackage.getEInt(), "checkSum", null, 0, 1, GPSReading.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gpsPoseSensorEClass, GPSPoseSensor.class, "GPSPoseSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGPSPoseSensor_Gps(), this.getMarkedGPS(), null, "gps", null, 1, -1, GPSPoseSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGPSPoseSensor_OriginLatitude(), theEcorePackage.getEDouble(), "originLatitude", "45.518206644445", 0, 1, GPSPoseSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGPSPoseSensor_OriginLongitude(), theEcorePackage.getEDouble(), "originLongitude", "-73.393904468182", 0, 1, GPSPoseSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGPSPoseSensor_NeAngle(), theEcorePackage.getEDouble(), "neAngle", "0.5940676", 0, 1, GPSPoseSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGPSPoseSensor_OriginElevation(), theEcorePackage.getEDouble(), "originElevation", "33.0985", 0, 1, GPSPoseSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGPSPoseSensor_MaxInitTime(), theEcorePackage.getELong(), "maxInitTime", "10000", 0, 1, GPSPoseSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gpsEClass, ca.gc.asc_csa.apogy.addons.sensors.gps.GPS.class, "GPS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGPS_Connection(), this.getGPSConnection(), null, "connection", null, 0, 1, ca.gc.asc_csa.apogy.addons.sensors.gps.GPS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGPS_DataInterpreter(), this.getGPSDataInterpreter(), this.getGPSDataInterpreter_Gps(), "dataInterpreter", null, 0, 1, ca.gc.asc_csa.apogy.addons.sensors.gps.GPS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGPS_Reading(), this.getGPSReading(), null, "reading", null, 0, 1, ca.gc.asc_csa.apogy.addons.sensors.gps.GPS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGPS_Status(), this.getGPSStatus(), "status", null, 0, 1, ca.gc.asc_csa.apogy.addons.sensors.gps.GPS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGPS_UpdateRate(), theEcorePackage.getELong(), "updateRate", null, 0, 1, ca.gc.asc_csa.apogy.addons.sensors.gps.GPS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGPS_LastFailure(), this.getException(), "lastFailure", null, 0, 1, ca.gc.asc_csa.apogy.addons.sensors.gps.GPS.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGPS_MaxReconnectTime(), theEcorePackage.getEInt(), "maxReconnectTime", "10000", 0, 1, ca.gc.asc_csa.apogy.addons.sensors.gps.GPS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGPS_SpeedKnots(), theEcorePackage.getEDouble(), "speedKnots", null, 0, 1, ca.gc.asc_csa.apogy.addons.sensors.gps.GPS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGPS_SpeedKmh(), theEcorePackage.getEDouble(), "speedKmh", null, 0, 1, ca.gc.asc_csa.apogy.addons.sensors.gps.GPS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getGPS__Start(), null, "start", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getGPS__Stop(), null, "stop", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getGPS__Reset(), null, "reset", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getGPS__Reconnect(), theEcorePackage.getEBoolean(), "reconnect", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(markedGPSEClass, MarkedGPS.class, "MarkedGPS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMarkedGPS_Marker(), theApogyCommonGeometryData3DPackage.getPositionMarker(), null, "marker", null, 0, 1, MarkedGPS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gpsRepositoryEClass, GPSRepository.class, "GPSRepository", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGPSRepository_GpsDevices(), this.getGPS(), null, "gpsDevices", null, 0, -1, GPSRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getGPSRepository__ScanForDevices(), null, "scanForDevices", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getGPSRepository__GetGPSById__String(), this.getGPS(), "getGPSById", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "gpsId", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(apogyAddonsSensorsGPSFacadeEClass, ApogyAddonsSensorsGPSFacade.class, "ApogyAddonsSensorsGPSFacade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getApogyAddonsSensorsGPSFacade__CreateGPSPoseSensor__double_double(), this.getGPSPoseSensor(), "createGPSPoseSensor", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "originLatitude", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "originLongitude", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyAddonsSensorsGPSFacade__CreateMarkedGPS__PositionMarker(), this.getMarkedGPS(), "createMarkedGPS", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCommonGeometryData3DPackage.getPositionMarker(), "marker", 0, 1, !IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(gpsStatusEEnum, GPSStatus.class, "GPSStatus");
		addEEnumLiteral(gpsStatusEEnum, GPSStatus.STOPPED);
		addEEnumLiteral(gpsStatusEEnum, GPSStatus.RUNNING);
		addEEnumLiteral(gpsStatusEEnum, GPSStatus.FAILED);
		addEEnumLiteral(gpsStatusEEnum, GPSStatus.RECONNECTING);
		addEEnumLiteral(gpsStatusEEnum, GPSStatus.CONNECTING);

		initEEnum(gpsQualityEEnum, GPSQuality.class, "GPSQuality");
		addEEnumLiteral(gpsQualityEEnum, GPSQuality.INVALID);
		addEEnumLiteral(gpsQualityEEnum, GPSQuality.GPS_FIX);
		addEEnumLiteral(gpsQualityEEnum, GPSQuality.DGPS_FIX);
		addEEnumLiteral(gpsQualityEEnum, GPSQuality.PPS_FIX);
		addEEnumLiteral(gpsQualityEEnum, GPSQuality.RTK);
		addEEnumLiteral(gpsQualityEEnum, GPSQuality.FLOAT_RTK);
		addEEnumLiteral(gpsQualityEEnum, GPSQuality.ESTIMATED);
		addEEnumLiteral(gpsQualityEEnum, GPSQuality.MANUAL_INPUT);
		addEEnumLiteral(gpsQualityEEnum, GPSQuality.SIMULATION);

		// Initialize data types
		initEDataType(exceptionEDataType, Exception.class, "Exception", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(ioExceptionEDataType, IOException.class, "IOException", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(inputStreamEDataType, InputStream.class, "InputStream", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(outputStreamEDataType, OutputStream.class, "OutputStream", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(dateEDataType, Date.class, "Date", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "documentation", "Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    Pierre Allard (Pierre.Allard@canada.ca),\n    Regent L\'Archeveque (Regent.Larcheveque@canada.ca),\n    Sebastien Gemme (Sebastien.Gemme@canada.ca),\n    Canadian Space Agency (CSA) - Initial API and implementation",
			 "prefix", "ApogyAddonsSensorsGPS",
			 "childCreationExtenders", "true",
			 "extensibleProviderFactory", "true",
			 "multipleEditorPages", "false",
			 "copyrightText", "Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    Pierre Allard (Pierre.Allard@canada.ca), \n    Regent L\'Archeveque (Regent.Larcheveque@canada.ca),\n    Sebastien Gemme (Sebastien.Gemme@canada.ca),\n    Canadian Space Agency (CSA) - Initial API and implementation",
			 "modelName", "ApogyAddonsSensorsGPS",
			 "suppressGenModelAnnotations", "false",
			 "dynamicTemplates", "true",
			 "templateDirectory", "platform:/plugin/ca.gc.asc_csa.apogy.common.emf.templates",
			 "modelDirectory", "/ca.gc.asc_csa.apogy.addons.sensors.gps/src-generated",
			 "editDirectory", "/ca.gc.asc_csa.apogy.addons.sensors.gps.edit/src-generated",
			 "basePackage", "ca.gc.asc_csa.apogy.addons.sensors"
		   });	
		addAnnotation
		  (getGPSConnection__Reset(), 
		   source, 
		   new String[] {
			 "documentation", "Resets the connection: closesand opens the connection again.\nOnce this method completes, new \'input\' and \'output\' objects are available."
		   });	
		addAnnotation
		  (getGPSDataInterpreter__UpdateGPS(), 
		   source, 
		   new String[] {
			 "documentation", "Updates the GPS\'s value according to interpreted values.\n<ul>\n<li>Reads data from the GPS connexion</li>\n<li>Interprete the data</li>\n<li>Update the GPS\'s internal values accordingly</li>\n</ul>"
		   });	
		addAnnotation
		  (getGPSPoseSensor_OriginLatitude(), 
		   source, 
		   new String[] {
			 "documentation", "This is the origin frame\'s latitude.  The default\nvalue is set to \"45.518206644445\", which is the\nMET\'s origin value.",
			 "apogy_units", "deg"
		   });	
		addAnnotation
		  (getGPSPoseSensor_OriginLongitude(), 
		   source, 
		   new String[] {
			 "documentation", "This is the origin frame\'s longitude.  The default\nvalue is set to \"-73.393904468182\", which is the\nvalue which is the MET\'s origin value.",
			 "apogy_units", "deg"
		   });	
		addAnnotation
		  (getGPSPoseSensor_NeAngle(), 
		   source, 
		   new String[] {
			 "documentation", "The angle, in radians, between the Noth East frame (z rotation).\nDefault value is \"0.5940676\", which is the value used for the MET.",
			 "apogy_units", "rad"
		   });	
		addAnnotation
		  (getGPSPoseSensor_MaxInitTime(), 
		   source, 
		   new String[] {
			 "documentation", "While in the initialization stage, maxInitTime is the maximum\ntime we can wait for a valid GPS reading. The value is in\nmilliseconds and its default value is 10 000 ms (10 seconds)."
		   });	
		addAnnotation
		  (getGPS__Start(), 
		   source, 
		   new String[] {
			 "documentation", "Starts the GPS.\nThe GPS starts acquiring data."
		   });	
		addAnnotation
		  (getGPS__Stop(), 
		   source, 
		   new String[] {
			 "documentation", "Stops the acquisition process."
		   });	
		addAnnotation
		  (getGPS__Reset(), 
		   source, 
		   new String[] {
			 "documentation", "Resets the GPS:\n<ul>\n<li>lastFailure is set to <code>null</code></li>\n<li>status is set to GPSStatus.STOPPED</li>\n</ul>"
		   });	
		addAnnotation
		  (getGPS__Reconnect(), 
		   source, 
		   new String[] {
			 "documentation", "Resets the GPS:\n<ul>\n<li>lastFailure is set to <code>null</code></li>\n<li>status is set to GPSStatus.STOPPED</li>\n</ul>"
		   });	
		addAnnotation
		  (getGPS_Reading(), 
		   source, 
		   new String[] {
			 "documentation", "Gets the latest gps reading.  This call is not blocking.\nReturns <code>null</code> if no reading is yet available.\n\nIf the gps\'s state is \'STOPPED\' when this method is called,\na call to \'start()\' is first made."
		   });	
		addAnnotation
		  (getGPS_UpdateRate(), 
		   source, 
		   new String[] {
			 "documentation", "The desired update rate at which we want to acquire data.\nThis can be useful when parsing from a file to simulate the real GPS behavior."
		   });	
		addAnnotation
		  (getGPS_LastFailure(), 
		   source, 
		   new String[] {
			 "documentation", "When the GPS falls into FAILED state, this attribute is set."
		   });	
		addAnnotation
		  (getGPS_MaxReconnectTime(), 
		   source, 
		   new String[] {
			 "documentation", "Maximum time allowed to reconnect the GPS, in milliseconds.\nAfter that time, the GPS falls into \'FAILED\' state."
		   });	
		addAnnotation
		  (getGPS_SpeedKnots(), 
		   source, 
		   new String[] {
			 "documentation", "Current speed in knots."
		   });	
		addAnnotation
		  (getGPS_SpeedKmh(), 
		   source, 
		   new String[] {
			 "documentation", "Current speed in km/h."
		   });
	}

} //ApogyAddonsSensorsGPSPackageImpl
