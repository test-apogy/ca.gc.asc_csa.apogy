/**
 * <copyright>
 * </copyright>
 *
 * $Id: GpsPackageImpl.java,v 1.6.4.2 2015/05/21 15:49:51 pallard Exp $
 */
package org.eclipse.symphony.addons.sensors.gps.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.symphony.addons.sensors.gps.GPSConnection;
import org.eclipse.symphony.addons.sensors.gps.GPSDataInterpreter;
import org.eclipse.symphony.addons.sensors.gps.GPSFacade;
import org.eclipse.symphony.addons.sensors.gps.GPSPoseSensor;
import org.eclipse.symphony.addons.sensors.gps.GPSReading;
import org.eclipse.symphony.addons.sensors.gps.GPSRepository;
import org.eclipse.symphony.addons.sensors.gps.GpsFactory;
import org.eclipse.symphony.addons.sensors.gps.GpsPackage;
import org.eclipse.symphony.addons.sensors.gps.MarkedGPS;
import org.eclipse.symphony.common.geometry.data3d.Data3dPackage;
import org.eclipse.symphony.common.math.MathPackage;
import org.eclipse.symphony.common.obsolete.mrt.CommonPackage;

import ca.gc.space.mrt.sensors.pose.PosePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class GpsPackageImpl extends EPackageImpl implements GpsPackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gpsEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gpsConnectionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gpsDataInterpreterEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gpsReadingEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gpsPoseSensorEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gpsFacadeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass markedGPSEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gpsRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gpS_QUALITYEEnum = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gpS_STATUSEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the
	 * package package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static factory
	 * method {@link #init init()}, which also performs initialization of the
	 * package, or returns the registered package, if one already exists. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.symphony.addons.sensors.gps.GpsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GpsPackageImpl() {
		super(eNS_URI, GpsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model,
	 * and for any others upon which it depends.
	 * 
	 * <p>
	 * This method is used to initialize {@link GpsPackage#eINSTANCE} when that
	 * field is accessed. Clients should not invoke it directly. Instead, they
	 * should simply access that field to obtain the package. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GpsPackage init() {
		if (isInited) return (GpsPackage)EPackage.Registry.INSTANCE.getEPackage(GpsPackage.eNS_URI);

		// Obtain or create and register package
		GpsPackageImpl theGpsPackage = (GpsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GpsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GpsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CommonPackage.eINSTANCE.eClass();
		PosePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theGpsPackage.createPackageContents();

		// Initialize created meta-data
		theGpsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGpsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GpsPackage.eNS_URI, theGpsPackage);
		return theGpsPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGPS() {
		return gpsEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGPS_Connection() {
		return (EReference)gpsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGPS_DataInterpreter() {
		return (EReference)gpsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGPS_Reading() {
		return (EReference)gpsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGPS_Status() {
		return (EAttribute)gpsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGPS_UpdateRate() {
		return (EAttribute)gpsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGPS_LastFailure() {
		return (EAttribute)gpsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGPS_MaxReconnectTime() {
		return (EAttribute)gpsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGPS_SpeedKnots() {
		return (EAttribute)gpsEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGPS_SpeedKmh() {
		return (EAttribute)gpsEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGPSConnection() {
		return gpsConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGPSConnection_Input() {
		return (EAttribute)gpsConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGPSConnection_Output() {
		return (EAttribute)gpsConnectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGPSDataInterpreter() {
		return gpsDataInterpreterEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGPSDataInterpreter_Gps() {
		return (EReference)gpsDataInterpreterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGPSReading() {
		return gpsReadingEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGPSReading_Latitude() {
		return (EAttribute)gpsReadingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGPSReading_Longitude() {
		return (EAttribute)gpsReadingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGPSReading_Elevation() {
		return (EAttribute)gpsReadingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGPSReading_Quality() {
		return (EAttribute)gpsReadingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGPSReading_TimeStamp() {
		return (EAttribute)gpsReadingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGPSReading_NumberOfSatellites() {
		return (EAttribute)gpsReadingEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGPSReading_HorizontalDilutionPos() {
		return (EAttribute)gpsReadingEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGPSReading_MeanSeaLevel() {
		return (EAttribute)gpsReadingEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGPSReading_CheckSum() {
		return (EAttribute)gpsReadingEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGPSPoseSensor() {
		return gpsPoseSensorEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGPSPoseSensor_Gps() {
		return (EReference)gpsPoseSensorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGPSPoseSensor_OriginLatitude() {
		return (EAttribute)gpsPoseSensorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGPSPoseSensor_OriginLongitude() {
		return (EAttribute)gpsPoseSensorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGPSPoseSensor_NeAngle() {
		return (EAttribute)gpsPoseSensorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGPSPoseSensor_OriginElevation() {
		return (EAttribute)gpsPoseSensorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGPSPoseSensor_MaxInitTime() {
		return (EAttribute)gpsPoseSensorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGPSFacade() {
		return gpsFacadeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMarkedGPS() {
		return markedGPSEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMarkedGPS_Marker() {
		return (EReference)markedGPSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGPSRepository() {
		return gpsRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGPSRepository_GpsDevices() {
		return (EReference)gpsRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGPS_QUALITY() {
		return gpS_QUALITYEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGPS_STATUS() {
		return gpS_STATUSEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public GpsFactory getGpsFactory() {
		return (GpsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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

		gpsConnectionEClass = createEClass(GPS_CONNECTION);
		createEAttribute(gpsConnectionEClass, GPS_CONNECTION__INPUT);
		createEAttribute(gpsConnectionEClass, GPS_CONNECTION__OUTPUT);

		gpsDataInterpreterEClass = createEClass(GPS_DATA_INTERPRETER);
		createEReference(gpsDataInterpreterEClass, GPS_DATA_INTERPRETER__GPS);

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

		gpsFacadeEClass = createEClass(GPS_FACADE);

		markedGPSEClass = createEClass(MARKED_GPS);
		createEReference(markedGPSEClass, MARKED_GPS__MARKER);

		gpsRepositoryEClass = createEClass(GPS_REPOSITORY);
		createEReference(gpsRepositoryEClass, GPS_REPOSITORY__GPS_DEVICES);

		// Create enums
		gpS_QUALITYEEnum = createEEnum(GPS_QUALITY);
		gpS_STATUSEEnum = createEEnum(GPS_STATUS);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model. This
	 * method is guarded to have no affect on any invocation but its first. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
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
		MathPackage theMathPackage = (MathPackage)EPackage.Registry.INSTANCE.getEPackage(MathPackage.eNS_URI);
		Data3dPackage theData3dPackage = (Data3dPackage)EPackage.Registry.INSTANCE.getEPackage(Data3dPackage.eNS_URI);
		PosePackage thePosePackage = (PosePackage)EPackage.Registry.INSTANCE.getEPackage(PosePackage.eNS_URI);
		CommonPackage theCommonPackage = (CommonPackage)EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		gpsPoseSensorEClass.getESuperTypes().add(thePosePackage.getPoseSensor());
		gpsPoseSensorEClass.getESuperTypes().add(theCommonPackage.getServer());
		markedGPSEClass.getESuperTypes().add(this.getGPS());

		// Initialize classes and features; add operations and parameters
		initEClass(gpsEClass, org.eclipse.symphony.addons.sensors.gps.GPS.class, "GPS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGPS_Connection(), this.getGPSConnection(), null, "connection", null, 1, 1, org.eclipse.symphony.addons.sensors.gps.GPS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGPS_DataInterpreter(), this.getGPSDataInterpreter(), this.getGPSDataInterpreter_Gps(), "dataInterpreter", null, 0, 1, org.eclipse.symphony.addons.sensors.gps.GPS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGPS_Reading(), this.getGPSReading(), null, "reading", null, 0, 1, org.eclipse.symphony.addons.sensors.gps.GPS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGPS_Status(), this.getGPS_STATUS(), "status", "STOPPED", 0, 1, org.eclipse.symphony.addons.sensors.gps.GPS.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGPS_UpdateRate(), theEcorePackage.getELong(), "updateRate", null, 0, 1, org.eclipse.symphony.addons.sensors.gps.GPS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGPS_LastFailure(), theMathPackage.getException(), "lastFailure", null, 0, 1, org.eclipse.symphony.addons.sensors.gps.GPS.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGPS_MaxReconnectTime(), theEcorePackage.getEInt(), "maxReconnectTime", "10000", 0, 1, org.eclipse.symphony.addons.sensors.gps.GPS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGPS_SpeedKnots(), theEcorePackage.getEDouble(), "speedKnots", null, 0, 1, org.eclipse.symphony.addons.sensors.gps.GPS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGPS_SpeedKmh(), theEcorePackage.getEDouble(), "speedKmh", null, 0, 1, org.eclipse.symphony.addons.sensors.gps.GPS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(gpsEClass, null, "start", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(gpsEClass, null, "stop", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(gpsEClass, null, "reset", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(gpsEClass, theEcorePackage.getEBoolean(), "reconnect", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(gpsConnectionEClass, GPSConnection.class, "GPSConnection", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGPSConnection_Input(), theData3dPackage.getInputStream(), "input", null, 1, 1, GPSConnection.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGPSConnection_Output(), theData3dPackage.getOutputStream(), "output", null, 1, 1, GPSConnection.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(gpsConnectionEClass, null, "reset", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theData3dPackage.getIOException());

		initEClass(gpsDataInterpreterEClass, GPSDataInterpreter.class, "GPSDataInterpreter", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGPSDataInterpreter_Gps(), this.getGPS(), this.getGPS_DataInterpreter(), "gps", null, 0, 1, GPSDataInterpreter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(gpsDataInterpreterEClass, null, "updateGPS", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theData3dPackage.getIOException());

		initEClass(gpsReadingEClass, GPSReading.class, "GPSReading", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGPSReading_Latitude(), ecorePackage.getEDouble(), "latitude", null, 0, 1, GPSReading.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGPSReading_Longitude(), ecorePackage.getEDouble(), "longitude", null, 0, 1, GPSReading.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGPSReading_Elevation(), ecorePackage.getEDouble(), "elevation", null, 0, 1, GPSReading.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGPSReading_Quality(), this.getGPS_QUALITY(), "quality", null, 0, 1, GPSReading.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGPSReading_TimeStamp(), ecorePackage.getEDate(), "timeStamp", null, 0, 1, GPSReading.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGPSReading_NumberOfSatellites(), ecorePackage.getEInt(), "numberOfSatellites", null, 0, 1, GPSReading.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGPSReading_HorizontalDilutionPos(), ecorePackage.getEDouble(), "horizontalDilutionPos", null, 0, 1, GPSReading.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGPSReading_MeanSeaLevel(), ecorePackage.getEDouble(), "meanSeaLevel", null, 0, 1, GPSReading.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGPSReading_CheckSum(), ecorePackage.getEInt(), "checkSum", null, 0, 1, GPSReading.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gpsPoseSensorEClass, GPSPoseSensor.class, "GPSPoseSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGPSPoseSensor_Gps(), this.getMarkedGPS(), null, "gps", null, 1, 3, GPSPoseSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGPSPoseSensor_OriginLatitude(), theEcorePackage.getEDouble(), "originLatitude", "45.518206644445", 1, 1, GPSPoseSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGPSPoseSensor_OriginLongitude(), theEcorePackage.getEDouble(), "originLongitude", "-73.393904468182", 1, 1, GPSPoseSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGPSPoseSensor_NeAngle(), theEcorePackage.getEDouble(), "neAngle", "0.5940676", 1, 1, GPSPoseSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGPSPoseSensor_OriginElevation(), theEcorePackage.getEDouble(), "originElevation", "33.0985", 1, 1, GPSPoseSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGPSPoseSensor_MaxInitTime(), theEcorePackage.getELong(), "maxInitTime", "10000", 0, 1, GPSPoseSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gpsFacadeEClass, GPSFacade.class, "GPSFacade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(gpsFacadeEClass, this.getGPSPoseSensor(), "createGPSPoseSensor", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "originLatitude", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "originLongitude", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(gpsFacadeEClass, this.getMarkedGPS(), "createMarkedGPS", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theData3dPackage.getPositionMarker(), "marker", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(markedGPSEClass, MarkedGPS.class, "MarkedGPS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMarkedGPS_Marker(), theData3dPackage.getPositionMarker(), null, "marker", null, 0, 1, MarkedGPS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gpsRepositoryEClass, GPSRepository.class, "GPSRepository", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGPSRepository_GpsDevices(), this.getGPS(), null, "gpsDevices", null, 0, -1, GPSRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(gpsRepositoryEClass, null, "scanForDevices", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(gpsRepositoryEClass, this.getGPS(), "getGPSById", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "id", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(gpS_QUALITYEEnum, org.eclipse.symphony.addons.sensors.gps.GPS_QUALITY.class, "GPS_QUALITY");
		addEEnumLiteral(gpS_QUALITYEEnum, org.eclipse.symphony.addons.sensors.gps.GPS_QUALITY.GPS_FIX);
		addEEnumLiteral(gpS_QUALITYEEnum, org.eclipse.symphony.addons.sensors.gps.GPS_QUALITY.INVALID);
		addEEnumLiteral(gpS_QUALITYEEnum, org.eclipse.symphony.addons.sensors.gps.GPS_QUALITY.DGPS_FIX);
		addEEnumLiteral(gpS_QUALITYEEnum, org.eclipse.symphony.addons.sensors.gps.GPS_QUALITY.PPS_FIX);
		addEEnumLiteral(gpS_QUALITYEEnum, org.eclipse.symphony.addons.sensors.gps.GPS_QUALITY.RTK);
		addEEnumLiteral(gpS_QUALITYEEnum, org.eclipse.symphony.addons.sensors.gps.GPS_QUALITY.FLOAT_RTK);
		addEEnumLiteral(gpS_QUALITYEEnum, org.eclipse.symphony.addons.sensors.gps.GPS_QUALITY.ESTIMATED);
		addEEnumLiteral(gpS_QUALITYEEnum, org.eclipse.symphony.addons.sensors.gps.GPS_QUALITY.MANUAL_INPUT);
		addEEnumLiteral(gpS_QUALITYEEnum, org.eclipse.symphony.addons.sensors.gps.GPS_QUALITY.SIMULATION);

		initEEnum(gpS_STATUSEEnum, org.eclipse.symphony.addons.sensors.gps.GPS_STATUS.class, "GPS_STATUS");
		addEEnumLiteral(gpS_STATUSEEnum, org.eclipse.symphony.addons.sensors.gps.GPS_STATUS.RUNNING);
		addEEnumLiteral(gpS_STATUSEEnum, org.eclipse.symphony.addons.sensors.gps.GPS_STATUS.STOPPED);
		addEEnumLiteral(gpS_STATUSEEnum, org.eclipse.symphony.addons.sensors.gps.GPS_STATUS.FAILED);
		addEEnumLiteral(gpS_STATUSEEnum, org.eclipse.symphony.addons.sensors.gps.GPS_STATUS.RECONNECTING);
		addEEnumLiteral(gpS_STATUSEEnum, org.eclipse.symphony.addons.sensors.gps.GPS_STATUS.CONNECTING);

		// Create resource
		createResource(eNS_URI);
	}

} // GpsPackageImpl
