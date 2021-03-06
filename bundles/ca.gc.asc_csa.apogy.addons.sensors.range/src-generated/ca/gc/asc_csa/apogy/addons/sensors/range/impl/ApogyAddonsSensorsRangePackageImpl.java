package ca.gc.asc_csa.apogy.addons.sensors.range.impl;
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

import java.util.List;
import javax.vecmath.Point3d;
import javax.vecmath.Vector3d;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import ca.gc.asc_csa.apogy.addons.sensors.ApogyAddonsSensorsPackage;
import ca.gc.asc_csa.apogy.addons.sensors.fov.ApogyAddonsSensorsFOVPackage;
import ca.gc.asc_csa.apogy.addons.sensors.range.ContactSensor;
import ca.gc.asc_csa.apogy.addons.sensors.range.LineRangeScanner;
import ca.gc.asc_csa.apogy.addons.sensors.range.ApogyAddonsSensorsRangeFactory;
import ca.gc.asc_csa.apogy.addons.sensors.range.ApogyAddonsSensorsRangePackage;
import ca.gc.asc_csa.apogy.addons.sensors.range.RangeScanner;
import ca.gc.asc_csa.apogy.addons.sensors.range.RangeScannerSimulator;
import ca.gc.asc_csa.apogy.addons.sensors.range.RangeSensor;
import ca.gc.asc_csa.apogy.addons.sensors.range.RasterScanData;
import ca.gc.asc_csa.apogy.addons.sensors.range.RasterScanRangeSensor;
import ca.gc.asc_csa.apogy.addons.sensors.range.RasterScanSettings;
import ca.gc.asc_csa.apogy.addons.sensors.range.RayData;
import ca.gc.asc_csa.apogy.addons.sensors.range.SimpleLineRangeScanner;
import ca.gc.asc_csa.apogy.addons.sensors.range.SimpleRangeSensor;
import ca.gc.asc_csa.apogy.addons.sensors.range.SimpleRasterScanRangeScanner;
import ca.gc.asc_csa.apogy.addons.sensors.range.SimpleRasterScanRangeScannerSimulator;
import ca.gc.asc_csa.apogy.addons.sensors.range.SimpleSonar;
import ca.gc.asc_csa.apogy.addons.sensors.range.ApogyAddonsSensorsRangeFacade;
import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage;
import ca.gc.asc_csa.apogy.common.geometry.data25d.ApogyCommonGeometryData25DPackage;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DPackage;
import ca.gc.asc_csa.apogy.common.processors.ApogyCommonProcessorsPackage;
import ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyAddonsSensorsRangePackageImpl extends EPackageImpl implements ApogyAddonsSensorsRangePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rayDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rasterScanSettingsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rangeSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contactSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleRangeSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleSonarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lineRangeScannerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleLineRangeScannerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rangeScannerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rangeScannerSimulatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rasterScanRangeSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleRasterScanRangeScannerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleRasterScanRangeScannerSimulatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rasterScanDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apogyAddonsSensorsRangeFacadeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType listEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType point3dEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType vector3dEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType exceptionEDataType = null;

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
	 * @see ca.gc.asc_csa.apogy.addons.sensors.range.ApogyAddonsSensorsRangePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ApogyAddonsSensorsRangePackageImpl() {
		super(eNS_URI, ApogyAddonsSensorsRangeFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ApogyAddonsSensorsRangePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ApogyAddonsSensorsRangePackage init() {
		if (isInited) return (ApogyAddonsSensorsRangePackage)EPackage.Registry.INSTANCE.getEPackage(ApogyAddonsSensorsRangePackage.eNS_URI);

		// Obtain or create and register package
		ApogyAddonsSensorsRangePackageImpl theApogyAddonsSensorsRangePackage = (ApogyAddonsSensorsRangePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ApogyAddonsSensorsRangePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ApogyAddonsSensorsRangePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ApogyAddonsSensorsFOVPackage.eINSTANCE.eClass();
		ApogyAddonsSensorsPackage.eINSTANCE.eClass();
		ApogyCommonGeometryData25DPackage.eINSTANCE.eClass();
		ApogyCommonEMFPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theApogyAddonsSensorsRangePackage.createPackageContents();

		// Initialize created meta-data
		theApogyAddonsSensorsRangePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theApogyAddonsSensorsRangePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ApogyAddonsSensorsRangePackage.eNS_URI, theApogyAddonsSensorsRangePackage);
		return theApogyAddonsSensorsRangePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRayData() {
		return rayDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRayData_Origin() {
		return (EAttribute)rayDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRayData_Direction() {
		return (EAttribute)rayDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRasterScanSettings() {
		return rasterScanSettingsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRasterScanSettings_VerticalResolution() {
		return (EAttribute)rasterScanSettingsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRasterScanSettings_HorizontalResolution() {
		return (EAttribute)rasterScanSettingsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRasterScanSettings_NumberOfPoints() {
		return (EAttribute)rasterScanSettingsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRangeSensor() {
		return rangeSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContactSensor() {
		return contactSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContactSensor_Contacted() {
		return (EAttribute)contactSensorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleRangeSensor() {
		return simpleRangeSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleRangeSensor_DistanceMeasured() {
		return (EAttribute)simpleRangeSensorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleSonar() {
		return simpleSonarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleSonar_EchoDetected() {
		return (EAttribute)simpleSonarEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSimpleSonar__GetFieldOfView() {
		return simpleSonarEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLineRangeScanner() {
		return lineRangeScannerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineRangeScanner_AngularResolution() {
		return (EAttribute)lineRangeScannerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLineRangeScanner__GetFieldOfView() {
		return lineRangeScannerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleLineRangeScanner() {
		return simpleLineRangeScannerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSimpleLineRangeScanner__AcquireScan() {
		return simpleLineRangeScannerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRangeScanner() {
		return rangeScannerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRangeScannerSimulator() {
		return rangeScannerSimulatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRangeScannerSimulator_MeshNode() {
		return (EReference)rangeScannerSimulatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRangeScannerSimulator_NoiseEnabled() {
		return (EAttribute)rangeScannerSimulatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRangeScannerSimulator_TimeCroppingMesh() {
		return (EAttribute)rangeScannerSimulatorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRangeScannerSimulator_TimeFindingIntersections() {
		return (EAttribute)rangeScannerSimulatorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRangeScannerSimulator_TimeGettingSimulatedRays() {
		return (EAttribute)rangeScannerSimulatorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRangeScannerSimulator__GetCroppedMesh() {
		return rangeScannerSimulatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRangeScannerSimulator__GetSimulatedRays() {
		return rangeScannerSimulatorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRangeScannerSimulator__AcquireData() {
		return rangeScannerSimulatorEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRangeScannerSimulator__ApplyOrientationNoise__RayData() {
		return rangeScannerSimulatorEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRangeScannerSimulator__ApplyRangeNoise__double_RayData_RayData() {
		return rangeScannerSimulatorEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRangeScannerSimulator__CreateCoordinates25D__RayData_double() {
		return rangeScannerSimulatorEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRasterScanRangeSensor() {
		return rasterScanRangeSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRasterScanRangeSensor__GetScanSettings() {
		return rasterScanRangeSensorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleRasterScanRangeScanner() {
		return simpleRasterScanRangeScannerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleRasterScanRangeScannerSimulator() {
		return simpleRasterScanRangeScannerSimulatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleRasterScanRangeScannerSimulator_RangeNoiseAmplitude() {
		return (EAttribute)simpleRasterScanRangeScannerSimulatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleRasterScanRangeScannerSimulator_AzimuthNoiseAmplitude() {
		return (EAttribute)simpleRasterScanRangeScannerSimulatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleRasterScanRangeScannerSimulator_ElevationNoiseAmplitude() {
		return (EAttribute)simpleRasterScanRangeScannerSimulatorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleRasterScanRangeScannerSimulator_HorizonDetectionEnabled() {
		return (EAttribute)simpleRasterScanRangeScannerSimulatorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRasterScanData() {
		return rasterScanDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRasterScanData_RasterScanSettings() {
		return (EReference)rasterScanDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRasterScanData_ScanData() {
		return (EReference)rasterScanDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApogyAddonsSensorsRangeFacade() {
		return apogyAddonsSensorsRangeFacadeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyAddonsSensorsRangeFacade__CreateRasterScanSettings__double_double_double_double_int_int() {
		return apogyAddonsSensorsRangeFacadeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyAddonsSensorsRangeFacade__CreateRasterScanSettings__RasterScanSettings() {
		return apogyAddonsSensorsRangeFacadeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getList() {
		return listEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPoint3d() {
		return point3dEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getVector3d() {
		return vector3dEDataType;
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
	public ApogyAddonsSensorsRangeFactory getApogyAddonsSensorsRangeFactory() {
		return (ApogyAddonsSensorsRangeFactory)getEFactoryInstance();
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
		rayDataEClass = createEClass(RAY_DATA);
		createEAttribute(rayDataEClass, RAY_DATA__ORIGIN);
		createEAttribute(rayDataEClass, RAY_DATA__DIRECTION);

		rasterScanSettingsEClass = createEClass(RASTER_SCAN_SETTINGS);
		createEAttribute(rasterScanSettingsEClass, RASTER_SCAN_SETTINGS__VERTICAL_RESOLUTION);
		createEAttribute(rasterScanSettingsEClass, RASTER_SCAN_SETTINGS__HORIZONTAL_RESOLUTION);
		createEAttribute(rasterScanSettingsEClass, RASTER_SCAN_SETTINGS__NUMBER_OF_POINTS);

		rangeSensorEClass = createEClass(RANGE_SENSOR);

		contactSensorEClass = createEClass(CONTACT_SENSOR);
		createEAttribute(contactSensorEClass, CONTACT_SENSOR__CONTACTED);

		simpleRangeSensorEClass = createEClass(SIMPLE_RANGE_SENSOR);
		createEAttribute(simpleRangeSensorEClass, SIMPLE_RANGE_SENSOR__DISTANCE_MEASURED);

		simpleSonarEClass = createEClass(SIMPLE_SONAR);
		createEAttribute(simpleSonarEClass, SIMPLE_SONAR__ECHO_DETECTED);
		createEOperation(simpleSonarEClass, SIMPLE_SONAR___GET_FIELD_OF_VIEW);

		lineRangeScannerEClass = createEClass(LINE_RANGE_SCANNER);
		createEAttribute(lineRangeScannerEClass, LINE_RANGE_SCANNER__ANGULAR_RESOLUTION);
		createEOperation(lineRangeScannerEClass, LINE_RANGE_SCANNER___GET_FIELD_OF_VIEW);

		simpleLineRangeScannerEClass = createEClass(SIMPLE_LINE_RANGE_SCANNER);
		createEOperation(simpleLineRangeScannerEClass, SIMPLE_LINE_RANGE_SCANNER___ACQUIRE_SCAN);

		rangeScannerEClass = createEClass(RANGE_SCANNER);

		rangeScannerSimulatorEClass = createEClass(RANGE_SCANNER_SIMULATOR);
		createEReference(rangeScannerSimulatorEClass, RANGE_SCANNER_SIMULATOR__MESH_NODE);
		createEAttribute(rangeScannerSimulatorEClass, RANGE_SCANNER_SIMULATOR__NOISE_ENABLED);
		createEAttribute(rangeScannerSimulatorEClass, RANGE_SCANNER_SIMULATOR__TIME_CROPPING_MESH);
		createEAttribute(rangeScannerSimulatorEClass, RANGE_SCANNER_SIMULATOR__TIME_FINDING_INTERSECTIONS);
		createEAttribute(rangeScannerSimulatorEClass, RANGE_SCANNER_SIMULATOR__TIME_GETTING_SIMULATED_RAYS);
		createEOperation(rangeScannerSimulatorEClass, RANGE_SCANNER_SIMULATOR___GET_CROPPED_MESH);
		createEOperation(rangeScannerSimulatorEClass, RANGE_SCANNER_SIMULATOR___GET_SIMULATED_RAYS);
		createEOperation(rangeScannerSimulatorEClass, RANGE_SCANNER_SIMULATOR___ACQUIRE_DATA);
		createEOperation(rangeScannerSimulatorEClass, RANGE_SCANNER_SIMULATOR___APPLY_ORIENTATION_NOISE__RAYDATA);
		createEOperation(rangeScannerSimulatorEClass, RANGE_SCANNER_SIMULATOR___APPLY_RANGE_NOISE__DOUBLE_RAYDATA_RAYDATA);
		createEOperation(rangeScannerSimulatorEClass, RANGE_SCANNER_SIMULATOR___CREATE_COORDINATES25_D__RAYDATA_DOUBLE);

		rasterScanRangeSensorEClass = createEClass(RASTER_SCAN_RANGE_SENSOR);
		createEOperation(rasterScanRangeSensorEClass, RASTER_SCAN_RANGE_SENSOR___GET_SCAN_SETTINGS);

		simpleRasterScanRangeScannerEClass = createEClass(SIMPLE_RASTER_SCAN_RANGE_SCANNER);

		simpleRasterScanRangeScannerSimulatorEClass = createEClass(SIMPLE_RASTER_SCAN_RANGE_SCANNER_SIMULATOR);
		createEAttribute(simpleRasterScanRangeScannerSimulatorEClass, SIMPLE_RASTER_SCAN_RANGE_SCANNER_SIMULATOR__RANGE_NOISE_AMPLITUDE);
		createEAttribute(simpleRasterScanRangeScannerSimulatorEClass, SIMPLE_RASTER_SCAN_RANGE_SCANNER_SIMULATOR__AZIMUTH_NOISE_AMPLITUDE);
		createEAttribute(simpleRasterScanRangeScannerSimulatorEClass, SIMPLE_RASTER_SCAN_RANGE_SCANNER_SIMULATOR__ELEVATION_NOISE_AMPLITUDE);
		createEAttribute(simpleRasterScanRangeScannerSimulatorEClass, SIMPLE_RASTER_SCAN_RANGE_SCANNER_SIMULATOR__HORIZON_DETECTION_ENABLED);

		rasterScanDataEClass = createEClass(RASTER_SCAN_DATA);
		createEReference(rasterScanDataEClass, RASTER_SCAN_DATA__RASTER_SCAN_SETTINGS);
		createEReference(rasterScanDataEClass, RASTER_SCAN_DATA__SCAN_DATA);

		apogyAddonsSensorsRangeFacadeEClass = createEClass(APOGY_ADDONS_SENSORS_RANGE_FACADE);
		createEOperation(apogyAddonsSensorsRangeFacadeEClass, APOGY_ADDONS_SENSORS_RANGE_FACADE___CREATE_RASTER_SCAN_SETTINGS__DOUBLE_DOUBLE_DOUBLE_DOUBLE_INT_INT);
		createEOperation(apogyAddonsSensorsRangeFacadeEClass, APOGY_ADDONS_SENSORS_RANGE_FACADE___CREATE_RASTER_SCAN_SETTINGS__RASTERSCANSETTINGS);

		// Create data types
		listEDataType = createEDataType(LIST);
		point3dEDataType = createEDataType(POINT3D);
		vector3dEDataType = createEDataType(VECTOR3D);
		exceptionEDataType = createEDataType(EXCEPTION);
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
		ApogyAddonsSensorsFOVPackage theApogyAddonsSensorsFOVPackage = (ApogyAddonsSensorsFOVPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyAddonsSensorsFOVPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		ApogyAddonsSensorsPackage theApogyAddonsSensorsPackage = (ApogyAddonsSensorsPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyAddonsSensorsPackage.eNS_URI);
		ApogyCommonProcessorsPackage theApogyCommonProcessorsPackage = (ApogyCommonProcessorsPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCommonProcessorsPackage.eNS_URI);
		ApogyCommonGeometryData25DPackage theApogyCommonGeometryData25DPackage = (ApogyCommonGeometryData25DPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCommonGeometryData25DPackage.eNS_URI);
		ApogyCommonTopologyPackage theApogyCommonTopologyPackage = (ApogyCommonTopologyPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCommonTopologyPackage.eNS_URI);
		ApogyCommonGeometryData3DPackage theApogyCommonGeometryData3DPackage = (ApogyCommonGeometryData3DPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCommonGeometryData3DPackage.eNS_URI);
		ApogyCommonEMFPackage theApogyCommonEMFPackage = (ApogyCommonEMFPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCommonEMFPackage.eNS_URI);

		// Create type parameters
		ETypeParameter rangeScannerEClass_InputType = addETypeParameter(rangeScannerEClass, "InputType");
		ETypeParameter rangeScannerSimulatorEClass_InputType = addETypeParameter(rangeScannerSimulatorEClass, "InputType");
		addETypeParameter(listEDataType, "T");

		// Set bounds for type parameters

		// Add supertypes to classes
		rasterScanSettingsEClass.getESuperTypes().add(theApogyAddonsSensorsFOVPackage.getRectangularFrustrumFieldOfView());
		rangeSensorEClass.getESuperTypes().add(theApogyAddonsSensorsPackage.getSensor());
		contactSensorEClass.getESuperTypes().add(this.getRangeSensor());
		simpleRangeSensorEClass.getESuperTypes().add(this.getRangeSensor());
		simpleSonarEClass.getESuperTypes().add(this.getSimpleRangeSensor());
		lineRangeScannerEClass.getESuperTypes().add(this.getRangeSensor());
		simpleLineRangeScannerEClass.getESuperTypes().add(this.getLineRangeScanner());
		EGenericType g1 = createEGenericType(this.getRangeSensor());
		rangeScannerEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theApogyCommonProcessorsPackage.getProcessor());
		EGenericType g2 = createEGenericType(rangeScannerEClass_InputType);
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(theApogyCommonGeometryData25DPackage.getVolumetricCoordinatesSet25D());
		g1.getETypeArguments().add(g2);
		rangeScannerEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getRangeScanner());
		g2 = createEGenericType(rangeScannerSimulatorEClass_InputType);
		g1.getETypeArguments().add(g2);
		rangeScannerSimulatorEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getRangeScanner());
		g2 = createEGenericType(this.getRasterScanSettings());
		g1.getETypeArguments().add(g2);
		rasterScanRangeSensorEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theApogyCommonProcessorsPackage.getProcessor());
		g2 = createEGenericType(this.getRasterScanSettings());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(theApogyCommonGeometryData25DPackage.getVolumetricCoordinatesSet25D());
		g1.getETypeArguments().add(g2);
		rasterScanRangeSensorEClass.getEGenericSuperTypes().add(g1);
		simpleRasterScanRangeScannerEClass.getESuperTypes().add(this.getRasterScanRangeSensor());
		g1 = createEGenericType(this.getRangeScannerSimulator());
		g2 = createEGenericType(this.getRasterScanSettings());
		g1.getETypeArguments().add(g2);
		simpleRasterScanRangeScannerSimulatorEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSimpleRasterScanRangeScanner());
		simpleRasterScanRangeScannerSimulatorEClass.getEGenericSuperTypes().add(g1);
		rasterScanDataEClass.getESuperTypes().add(theApogyCommonTopologyPackage.getAggregateGroupNode());
		rasterScanDataEClass.getESuperTypes().add(theApogyCommonEMFPackage.getTimed());

		// Initialize classes, features, and operations; add parameters
		initEClass(rayDataEClass, RayData.class, "RayData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRayData_Origin(), this.getPoint3d(), "origin", null, 0, 1, RayData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRayData_Direction(), this.getVector3d(), "direction", null, 0, 1, RayData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rasterScanSettingsEClass, RasterScanSettings.class, "RasterScanSettings", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRasterScanSettings_VerticalResolution(), theEcorePackage.getEInt(), "verticalResolution", null, 0, 1, RasterScanSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRasterScanSettings_HorizontalResolution(), theEcorePackage.getEInt(), "horizontalResolution", null, 0, 1, RasterScanSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRasterScanSettings_NumberOfPoints(), theEcorePackage.getEInt(), "numberOfPoints", null, 0, 1, RasterScanSettings.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(rangeSensorEClass, RangeSensor.class, "RangeSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(contactSensorEClass, ContactSensor.class, "ContactSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContactSensor_Contacted(), theEcorePackage.getEBoolean(), "contacted", null, 0, 1, ContactSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleRangeSensorEClass, SimpleRangeSensor.class, "SimpleRangeSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimpleRangeSensor_DistanceMeasured(), theEcorePackage.getEDouble(), "distanceMeasured", null, 0, 1, SimpleRangeSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleSonarEClass, SimpleSonar.class, "SimpleSonar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimpleSonar_EchoDetected(), theEcorePackage.getEBoolean(), "echoDetected", null, 0, 1, SimpleSonar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getSimpleSonar__GetFieldOfView(), theApogyAddonsSensorsFOVPackage.getConicalFieldOfView(), "getFieldOfView", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(lineRangeScannerEClass, LineRangeScanner.class, "LineRangeScanner", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLineRangeScanner_AngularResolution(), theEcorePackage.getEInt(), "angularResolution", null, 0, 1, LineRangeScanner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getLineRangeScanner__GetFieldOfView(), theApogyAddonsSensorsFOVPackage.getCircularSectorFieldOfView(), "getFieldOfView", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(simpleLineRangeScannerEClass, SimpleLineRangeScanner.class, "SimpleLineRangeScanner", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getSimpleLineRangeScanner__AcquireScan(), theEcorePackage.getEBoolean(), "acquireScan", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(rangeScannerEClass, RangeScanner.class, "RangeScanner", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rangeScannerSimulatorEClass, RangeScannerSimulator.class, "RangeScannerSimulator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(theApogyCommonTopologyPackage.getContentNode());
		g2 = createEGenericType(theApogyCommonGeometryData3DPackage.getCartesianTriangularMesh());
		g1.getETypeArguments().add(g2);
		initEReference(getRangeScannerSimulator_MeshNode(), g1, null, "meshNode", null, 0, 1, RangeScannerSimulator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRangeScannerSimulator_NoiseEnabled(), theEcorePackage.getEBoolean(), "noiseEnabled", null, 0, 1, RangeScannerSimulator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRangeScannerSimulator_TimeCroppingMesh(), theEcorePackage.getELong(), "timeCroppingMesh", null, 0, 1, RangeScannerSimulator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRangeScannerSimulator_TimeFindingIntersections(), theEcorePackage.getELong(), "timeFindingIntersections", null, 0, 1, RangeScannerSimulator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRangeScannerSimulator_TimeGettingSimulatedRays(), theEcorePackage.getELong(), "timeGettingSimulatedRays", null, 0, 1, RangeScannerSimulator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getRangeScannerSimulator__GetCroppedMesh(), theApogyCommonGeometryData3DPackage.getCartesianTriangularMesh(), "getCroppedMesh", 0, 1, !IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getRangeScannerSimulator__GetSimulatedRays(), null, "getSimulatedRays", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getRayData());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getRangeScannerSimulator__AcquireData(), null, "acquireData", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());

		op = initEOperation(getRangeScannerSimulator__ApplyOrientationNoise__RayData(), this.getRayData(), "applyOrientationNoise", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRayData(), "rayData", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRangeScannerSimulator__ApplyRangeNoise__double_RayData_RayData(), theEcorePackage.getEDouble(), "applyRangeNoise", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "range", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRayData(), "cleanRayData", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRayData(), "noisyRayData", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRangeScannerSimulator__CreateCoordinates25D__RayData_double(), theApogyCommonGeometryData25DPackage.getCoordinates25D(), "createCoordinates25D", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRayData(), "rayData", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "range", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(rasterScanRangeSensorEClass, RasterScanRangeSensor.class, "RasterScanRangeSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getRasterScanRangeSensor__GetScanSettings(), this.getRasterScanSettings(), "getScanSettings", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(simpleRasterScanRangeScannerEClass, SimpleRasterScanRangeScanner.class, "SimpleRasterScanRangeScanner", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(simpleRasterScanRangeScannerSimulatorEClass, SimpleRasterScanRangeScannerSimulator.class, "SimpleRasterScanRangeScannerSimulator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimpleRasterScanRangeScannerSimulator_RangeNoiseAmplitude(), theEcorePackage.getEDouble(), "rangeNoiseAmplitude", "0.0", 0, 1, SimpleRasterScanRangeScannerSimulator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleRasterScanRangeScannerSimulator_AzimuthNoiseAmplitude(), theEcorePackage.getEDouble(), "azimuthNoiseAmplitude", "0.0", 0, 1, SimpleRasterScanRangeScannerSimulator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleRasterScanRangeScannerSimulator_ElevationNoiseAmplitude(), theEcorePackage.getEDouble(), "elevationNoiseAmplitude", "0.0", 0, 1, SimpleRasterScanRangeScannerSimulator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleRasterScanRangeScannerSimulator_HorizonDetectionEnabled(), theEcorePackage.getEBoolean(), "horizonDetectionEnabled", null, 0, 1, SimpleRasterScanRangeScannerSimulator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rasterScanDataEClass, RasterScanData.class, "RasterScanData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRasterScanData_RasterScanSettings(), this.getRasterScanSettings(), null, "rasterScanSettings", null, 0, 1, RasterScanData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRasterScanData_ScanData(), theApogyCommonGeometryData25DPackage.getVolumetricCoordinatesSet25D(), null, "scanData", null, 0, 1, RasterScanData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(apogyAddonsSensorsRangeFacadeEClass, ApogyAddonsSensorsRangeFacade.class, "ApogyAddonsSensorsRangeFacade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getApogyAddonsSensorsRangeFacade__CreateRasterScanSettings__double_double_double_double_int_int(), this.getRasterScanSettings(), "createRasterScanSettings", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "minimumDistance", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "maximumDistance", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "horizontalFieldOfViewAngle", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "verticalFieldOfViewAngle", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "horizontalResolution", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "verticalResolution", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyAddonsSensorsRangeFacade__CreateRasterScanSettings__RasterScanSettings(), this.getRasterScanSettings(), "createRasterScanSettings", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRasterScanSettings(), "rasterScanSettings", 0, 1, !IS_UNIQUE, IS_ORDERED);

		// Initialize data types
		initEDataType(listEDataType, List.class, "List", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(point3dEDataType, Point3d.class, "Point3d", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(vector3dEDataType, Vector3d.class, "Vector3d", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(exceptionEDataType, Exception.class, "Exception", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

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
			 "prefix", "ApogyAddonsSensorsRange",
			 "childCreationExtenders", "true",
			 "extensibleProviderFactory", "true",
			 "multipleEditorPages", "false",
			 "copyrightText", "Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    Pierre Allard (Pierre.Allard@canada.ca), \n    Regent L\'Archeveque (Regent.Larcheveque@canada.ca),\n    Sebastien Gemme (Sebastien.Gemme@canada.ca),\n    Canadian Space Agency (CSA) - Initial API and implementation",
			 "modelName", "ApogyAddonsSensorsRange",
			 "suppressGenModelAnnotations", "false",
			 "dynamicTemplates", "true",
			 "templateDirectory", "platform:/plugin/ca.gc.asc_csa.apogy.common.emf.templates",
			 "modelDirectory", "/ca.gc.asc_csa.apogy.addons.sensors.range/src-generated",
			 "editDirectory", "/ca.gc.asc_csa.apogy.addons.sensors.range.edit/src-generated",
			 "basePackage", "ca.gc.asc_csa.apogy.addons.sensors"
		   });	
		addAnnotation
		  (getSimpleSonar_EchoDetected(), 
		   source, 
		   new String[] {
			 "documentation", "A field of view that is defined by one angle."
		   });	
		addAnnotation
		  (getSimpleLineRangeScanner__AcquireScan(), 
		   source, 
		   new String[] {
			 "documentation", "Method that performs the acquisition of one scan.\nUpon successful completion of the scan acquisition,\nthe scanData should be updated with the latest scan\nand the method should return true. If the acquisition\nfails to complete properly, false should be returned."
		   });	
		addAnnotation
		  (getRangeScannerSimulator__GetCroppedMesh(), 
		   source, 
		   new String[] {
			 "documentation", "Method that takes the mesh node and crops it to get only the part of\nthe terrain that falls within the field of view of the sensor. This\nmethod is abstract and must be overridden."
		   });	
		addAnnotation
		  (getRangeScannerSimulator__GetSimulatedRays(), 
		   source, 
		   new String[] {
			 "documentation", "Method that returns the list of Ray Data that will be used to specify\nthe position and direction of the simulated laser rays. This method is\nabstract and must be overridden."
		   });	
		addAnnotation
		  (getRangeScannerSimulator__ApplyOrientationNoise__RayData(), 
		   source, 
		   new String[] {
			 "documentation", "Method that applies orientation noise on the original ray data. This\nmethod is abstract and should be overridden."
		   });	
		addAnnotation
		  (getRangeScannerSimulator__ApplyRangeNoise__double_RayData_RayData(), 
		   source, 
		   new String[] {
			 "documentation", "Method that applies range noise on the actual measured range. This\nmethod is abstract and should be overridden."
		   });	
		addAnnotation
		  (getRangeScannerSimulator__CreateCoordinates25D__RayData_double(), 
		   source, 
		   new String[] {
			 "documentation", "Method that construct the Coordinates25D from ray data and range.\nThis Coordinates25D is then added to the simulated point cloud.\nThis method is abstract and should be overridden."
		   });	
		addAnnotation
		  (getRangeScannerSimulator_MeshNode(), 
		   source, 
		   new String[] {
			 "documentation", "The ContentNode where the simulated terrain mesh is found.\nNote that a topology path between this node and the\nRangeScannerSimulator must exist (both the RangeScannerSimulator\nand terrain mesh must be part of the same topology)."
		   });	
		addAnnotation
		  (getRangeScannerSimulator_NoiseEnabled(), 
		   source, 
		   new String[] {
			 "documentation", "Flag indicating whether or not noise is to be applied to the\nsimulated results. Setting this flag to true will enable the\ncalls to the applyOrientationNoise() and applyRangeNoise() methods."
		   });	
		addAnnotation
		  (getRangeScannerSimulator_TimeCroppingMesh(), 
		   source, 
		   new String[] {
			 "documentation", "The time (in milliseconds) required by the getCroppedMesh() method."
		   });	
		addAnnotation
		  (getRangeScannerSimulator_TimeFindingIntersections(), 
		   source, 
		   new String[] {
			 "documentation", "The time (in milliseconds) required to find the intersection between\nthe simulated rays and the terrain mesh."
		   });	
		addAnnotation
		  (getRangeScannerSimulator_TimeGettingSimulatedRays(), 
		   source, 
		   new String[] {
			 "documentation", "The time (in milliseconds) required by the getSimulatedRays() method."
		   });	
		addAnnotation
		  (getSimpleRasterScanRangeScannerSimulator_HorizonDetectionEnabled(), 
		   source, 
		   new String[] {
			 "documentation", "Enables the detection of the horizon to speed up processing.\nHorizon detection stop the elevation scanning motion when one\nmissing return is detected. Note that enabling this feature\ncould lead to incomplete results when the terrain includes overhangs."
		   });
	}

} //ApogyAddonsSensorsRangePackageImpl
