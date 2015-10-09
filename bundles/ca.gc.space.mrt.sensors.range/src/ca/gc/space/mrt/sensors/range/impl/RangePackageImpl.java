/**
 * <copyright>
 * </copyright>
 *
 * $Id: RangePackageImpl.java,v 1.7.4.2 2015/05/21 15:50:21 pallard Exp $
 */
package ca.gc.space.mrt.sensors.range.impl;

import java.util.List;

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
import org.eclipse.symphony.addons.sensors.SensorsPackage;
import org.eclipse.symphony.common.geometry.data.DataPackage;
import org.eclipse.symphony.common.geometry.data25d.Data25dPackage;
import org.eclipse.symphony.common.geometry.data3d.Data3dPackage;
import org.eclipse.symphony.common.processors.ProcessorsPackage;
import org.eclipse.symphony.common.topology.TopologyPackage;

import ca.gc.space.mrt.common.CommonPackage;
import ca.gc.space.mrt.sensors.fov.FovPackage;
import ca.gc.space.mrt.sensors.range.ContactSensor;
import ca.gc.space.mrt.sensors.range.LineRangeScanner;
import ca.gc.space.mrt.sensors.range.RangeFactory;
import ca.gc.space.mrt.sensors.range.RangePackage;
import ca.gc.space.mrt.sensors.range.RangeScanner;
import ca.gc.space.mrt.sensors.range.RangeScannerSimulator;
import ca.gc.space.mrt.sensors.range.RangeSensor;
import ca.gc.space.mrt.sensors.range.RasterScanData;
import ca.gc.space.mrt.sensors.range.RasterScanRangeSensor;
import ca.gc.space.mrt.sensors.range.RasterScanSettings;
import ca.gc.space.mrt.sensors.range.RayData;
import ca.gc.space.mrt.sensors.range.SensorsRangeFacade;
import ca.gc.space.mrt.sensors.range.SimpleLineRangeScanner;
import ca.gc.space.mrt.sensors.range.SimpleRangeSensor;
import ca.gc.space.mrt.sensors.range.SimpleRasterScanRangeScanner;
import ca.gc.space.mrt.sensors.range.SimpleRasterScanRangeScannerSimulator;
import ca.gc.space.mrt.sensors.range.SimpleSonar;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RangePackageImpl extends EPackageImpl implements RangePackage
{
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
	private EClass contactSensorEClass = null;

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
	private EClass rayDataEClass = null;

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
	private EClass rangeSensorEClass = null;

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
	private EClass sensorsRangeFacadeEClass = null;

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
	private EDataType listEDataType = null;

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
	 * @see ca.gc.space.mrt.sensors.range.RangePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RangePackageImpl()
	{
		super(eNS_URI, RangeFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RangePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RangePackage init()
	{
		if (isInited) return (RangePackage)EPackage.Registry.INSTANCE.getEPackage(RangePackage.eNS_URI);

		// Obtain or create and register package
		RangePackageImpl theRangePackage = (RangePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RangePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RangePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		Data25dPackage.eINSTANCE.eClass();
		FovPackage.eINSTANCE.eClass();
		CommonPackage.eINSTANCE.eClass();
		SensorsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theRangePackage.createPackageContents();

		// Initialize created meta-data
		theRangePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRangePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RangePackage.eNS_URI, theRangePackage);
		return theRangePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleRangeSensor()
	{
		return simpleRangeSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleRangeSensor_DistanceMeasured()
	{
		return (EAttribute)simpleRangeSensorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContactSensor()
	{
		return contactSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContactSensor_Contacted()
	{
		return (EAttribute)contactSensorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleSonar()
	{
		return simpleSonarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleSonar_EchoDetected()
	{
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
	public EClass getLineRangeScanner()
	{
		return lineRangeScannerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineRangeScanner_AngularResolution()
	{
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
	public EClass getSimpleLineRangeScanner()
	{
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
	public EClass getRasterScanRangeSensor()
	{
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
	public EClass getSimpleRasterScanRangeScanner()
	{
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
	public EClass getRangeSensor()
	{
		return rangeSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRasterScanSettings()
	{
		return rasterScanSettingsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRasterScanSettings_VerticalResolution()
	{
		return (EAttribute)rasterScanSettingsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRasterScanSettings_HorizontalResolution()
	{
		return (EAttribute)rasterScanSettingsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRasterScanSettings_NumberOfPoints()
	{
		return (EAttribute)rasterScanSettingsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSensorsRangeFacade()
	{
		return sensorsRangeFacadeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSensorsRangeFacade__CreateRasterScanSettings__double_double_double_double_int_int() {
		return sensorsRangeFacadeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSensorsRangeFacade__CreateRasterScanSettings__RasterScanSettings() {
		return sensorsRangeFacadeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRasterScanData()
	{
		return rasterScanDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRasterScanData_RasterScanSettings()
	{
		return (EReference)rasterScanDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRasterScanData_ScanData()
	{
		return (EReference)rasterScanDataEClass.getEStructuralFeatures().get(1);
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
	public RangeFactory getRangeFactory()
	{
		return (RangeFactory)getEFactoryInstance();
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
	public void createPackageContents()
	{
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
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

		rayDataEClass = createEClass(RAY_DATA);
		createEAttribute(rayDataEClass, RAY_DATA__ORIGIN);
		createEAttribute(rayDataEClass, RAY_DATA__DIRECTION);

		rasterScanRangeSensorEClass = createEClass(RASTER_SCAN_RANGE_SENSOR);
		createEOperation(rasterScanRangeSensorEClass, RASTER_SCAN_RANGE_SENSOR___GET_SCAN_SETTINGS);

		simpleRasterScanRangeScannerEClass = createEClass(SIMPLE_RASTER_SCAN_RANGE_SCANNER);

		simpleRasterScanRangeScannerSimulatorEClass = createEClass(SIMPLE_RASTER_SCAN_RANGE_SCANNER_SIMULATOR);
		createEAttribute(simpleRasterScanRangeScannerSimulatorEClass, SIMPLE_RASTER_SCAN_RANGE_SCANNER_SIMULATOR__RANGE_NOISE_AMPLITUDE);
		createEAttribute(simpleRasterScanRangeScannerSimulatorEClass, SIMPLE_RASTER_SCAN_RANGE_SCANNER_SIMULATOR__AZIMUTH_NOISE_AMPLITUDE);
		createEAttribute(simpleRasterScanRangeScannerSimulatorEClass, SIMPLE_RASTER_SCAN_RANGE_SCANNER_SIMULATOR__ELEVATION_NOISE_AMPLITUDE);
		createEAttribute(simpleRasterScanRangeScannerSimulatorEClass, SIMPLE_RASTER_SCAN_RANGE_SCANNER_SIMULATOR__HORIZON_DETECTION_ENABLED);

		rasterScanSettingsEClass = createEClass(RASTER_SCAN_SETTINGS);
		createEAttribute(rasterScanSettingsEClass, RASTER_SCAN_SETTINGS__VERTICAL_RESOLUTION);
		createEAttribute(rasterScanSettingsEClass, RASTER_SCAN_SETTINGS__HORIZONTAL_RESOLUTION);
		createEAttribute(rasterScanSettingsEClass, RASTER_SCAN_SETTINGS__NUMBER_OF_POINTS);

		sensorsRangeFacadeEClass = createEClass(SENSORS_RANGE_FACADE);
		createEOperation(sensorsRangeFacadeEClass, SENSORS_RANGE_FACADE___CREATE_RASTER_SCAN_SETTINGS__DOUBLE_DOUBLE_DOUBLE_DOUBLE_INT_INT);
		createEOperation(sensorsRangeFacadeEClass, SENSORS_RANGE_FACADE___CREATE_RASTER_SCAN_SETTINGS__RASTERSCANSETTINGS);

		rasterScanDataEClass = createEClass(RASTER_SCAN_DATA);
		createEReference(rasterScanDataEClass, RASTER_SCAN_DATA__RASTER_SCAN_SETTINGS);
		createEReference(rasterScanDataEClass, RASTER_SCAN_DATA__SCAN_DATA);

		// Create data types
		listEDataType = createEDataType(LIST);
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
	public void initializePackageContents()
	{
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		SensorsPackage theSensorsPackage = (SensorsPackage)EPackage.Registry.INSTANCE.getEPackage(SensorsPackage.eNS_URI);
		FovPackage theFovPackage = (FovPackage)EPackage.Registry.INSTANCE.getEPackage(FovPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		ProcessorsPackage theProcessorsPackage = (ProcessorsPackage)EPackage.Registry.INSTANCE.getEPackage(ProcessorsPackage.eNS_URI);
		Data25dPackage theData25dPackage = (Data25dPackage)EPackage.Registry.INSTANCE.getEPackage(Data25dPackage.eNS_URI);
		TopologyPackage theTopologyPackage = (TopologyPackage)EPackage.Registry.INSTANCE.getEPackage(TopologyPackage.eNS_URI);
		Data3dPackage theData3dPackage = (Data3dPackage)EPackage.Registry.INSTANCE.getEPackage(Data3dPackage.eNS_URI);
		DataPackage theDataPackage = (DataPackage)EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI);
		CommonPackage theCommonPackage = (CommonPackage)EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI);

		// Create type parameters
		ETypeParameter rangeScannerEClass_InputType = addETypeParameter(rangeScannerEClass, "InputType");
		ETypeParameter rangeScannerSimulatorEClass_InputType = addETypeParameter(rangeScannerSimulatorEClass, "InputType");
		addETypeParameter(listEDataType, "T");

		// Set bounds for type parameters

		// Add supertypes to classes
		rangeSensorEClass.getESuperTypes().add(theSensorsPackage.getSensor());
		contactSensorEClass.getESuperTypes().add(this.getRangeSensor());
		simpleRangeSensorEClass.getESuperTypes().add(this.getRangeSensor());
		simpleSonarEClass.getESuperTypes().add(this.getSimpleRangeSensor());
		lineRangeScannerEClass.getESuperTypes().add(this.getRangeSensor());
		simpleLineRangeScannerEClass.getESuperTypes().add(this.getLineRangeScanner());
		EGenericType g1 = createEGenericType(this.getRangeSensor());
		rangeScannerEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theProcessorsPackage.getProcessor());
		EGenericType g2 = createEGenericType(rangeScannerEClass_InputType);
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(theData25dPackage.getVolumetricCoordinatesSet25D());
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
		g1 = createEGenericType(theProcessorsPackage.getProcessor());
		g2 = createEGenericType(this.getRasterScanSettings());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(theData25dPackage.getVolumetricCoordinatesSet25D());
		g1.getETypeArguments().add(g2);
		rasterScanRangeSensorEClass.getEGenericSuperTypes().add(g1);
		simpleRasterScanRangeScannerEClass.getESuperTypes().add(this.getRasterScanRangeSensor());
		g1 = createEGenericType(this.getRangeScannerSimulator());
		g2 = createEGenericType(this.getRasterScanSettings());
		g1.getETypeArguments().add(g2);
		simpleRasterScanRangeScannerSimulatorEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSimpleRasterScanRangeScanner());
		simpleRasterScanRangeScannerSimulatorEClass.getEGenericSuperTypes().add(g1);
		rasterScanSettingsEClass.getESuperTypes().add(theFovPackage.getRectangularFrustrumFieldOfView());
		rasterScanDataEClass.getESuperTypes().add(theTopologyPackage.getAggregateGroupNode());
		rasterScanDataEClass.getESuperTypes().add(theCommonPackage.getTimeTaggedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(rangeSensorEClass, RangeSensor.class, "RangeSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(contactSensorEClass, ContactSensor.class, "ContactSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContactSensor_Contacted(), ecorePackage.getEBoolean(), "contacted", null, 1, 1, ContactSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleRangeSensorEClass, SimpleRangeSensor.class, "SimpleRangeSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimpleRangeSensor_DistanceMeasured(), ecorePackage.getEDouble(), "distanceMeasured", null, 1, 1, SimpleRangeSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleSonarEClass, SimpleSonar.class, "SimpleSonar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimpleSonar_EchoDetected(), ecorePackage.getEBoolean(), "echoDetected", null, 1, 1, SimpleSonar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getSimpleSonar__GetFieldOfView(), theFovPackage.getConicalFieldOfView(), "getFieldOfView", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(lineRangeScannerEClass, LineRangeScanner.class, "LineRangeScanner", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLineRangeScanner_AngularResolution(), theEcorePackage.getEInt(), "angularResolution", null, 1, 1, LineRangeScanner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getLineRangeScanner__GetFieldOfView(), theFovPackage.getCircularSectorFieldOfView(), "getFieldOfView", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(simpleLineRangeScannerEClass, SimpleLineRangeScanner.class, "SimpleLineRangeScanner", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getSimpleLineRangeScanner__AcquireScan(), ecorePackage.getEBoolean(), "acquireScan", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(rangeScannerEClass, RangeScanner.class, "RangeScanner", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rangeScannerSimulatorEClass, RangeScannerSimulator.class, "RangeScannerSimulator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(theTopologyPackage.getContentNode());
		g2 = createEGenericType(theData3dPackage.getCartesianTriangularMesh());
		g1.getETypeArguments().add(g2);
		initEReference(getRangeScannerSimulator_MeshNode(), g1, null, "meshNode", null, 0, 1, RangeScannerSimulator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRangeScannerSimulator_NoiseEnabled(), theEcorePackage.getEBoolean(), "noiseEnabled", null, 0, 1, RangeScannerSimulator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRangeScannerSimulator_TimeCroppingMesh(), theEcorePackage.getELong(), "timeCroppingMesh", null, 0, 1, RangeScannerSimulator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRangeScannerSimulator_TimeFindingIntersections(), theEcorePackage.getELong(), "timeFindingIntersections", null, 0, 1, RangeScannerSimulator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRangeScannerSimulator_TimeGettingSimulatedRays(), theEcorePackage.getELong(), "timeGettingSimulatedRays", null, 0, 1, RangeScannerSimulator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getRangeScannerSimulator__GetCroppedMesh(), theData3dPackage.getCartesianTriangularMesh(), "getCroppedMesh", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getRangeScannerSimulator__GetSimulatedRays(), null, "getSimulatedRays", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theDataPackage.getList());
		g2 = createEGenericType(this.getRayData());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getRangeScannerSimulator__AcquireData(), null, "acquireData", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theProcessorsPackage.getException());

		op = initEOperation(getRangeScannerSimulator__ApplyOrientationNoise__RayData(), this.getRayData(), "applyOrientationNoise", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRayData(), "rayData", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRangeScannerSimulator__ApplyRangeNoise__double_RayData_RayData(), theEcorePackage.getEDouble(), "applyRangeNoise", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "range", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRayData(), "cleanRayData", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRayData(), "noisyRayData", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRangeScannerSimulator__CreateCoordinates25D__RayData_double(), theData25dPackage.getCoordinates25D(), "createCoordinates25D", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRayData(), "rayData", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "range", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(rayDataEClass, RayData.class, "RayData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRayData_Origin(), theData3dPackage.getPoint3d(), "origin", null, 0, 1, RayData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRayData_Direction(), theDataPackage.getVector3d(), "direction", null, 0, 1, RayData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rasterScanRangeSensorEClass, RasterScanRangeSensor.class, "RasterScanRangeSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getRasterScanRangeSensor__GetScanSettings(), this.getRasterScanSettings(), "getScanSettings", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(simpleRasterScanRangeScannerEClass, SimpleRasterScanRangeScanner.class, "SimpleRasterScanRangeScanner", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(simpleRasterScanRangeScannerSimulatorEClass, SimpleRasterScanRangeScannerSimulator.class, "SimpleRasterScanRangeScannerSimulator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimpleRasterScanRangeScannerSimulator_RangeNoiseAmplitude(), theEcorePackage.getEDouble(), "rangeNoiseAmplitude", "0", 0, 1, SimpleRasterScanRangeScannerSimulator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleRasterScanRangeScannerSimulator_AzimuthNoiseAmplitude(), theEcorePackage.getEDouble(), "azimuthNoiseAmplitude", null, 0, 1, SimpleRasterScanRangeScannerSimulator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleRasterScanRangeScannerSimulator_ElevationNoiseAmplitude(), theEcorePackage.getEDouble(), "elevationNoiseAmplitude", null, 0, 1, SimpleRasterScanRangeScannerSimulator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleRasterScanRangeScannerSimulator_HorizonDetectionEnabled(), theEcorePackage.getEBoolean(), "horizonDetectionEnabled", null, 0, 1, SimpleRasterScanRangeScannerSimulator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rasterScanSettingsEClass, RasterScanSettings.class, "RasterScanSettings", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRasterScanSettings_VerticalResolution(), theEcorePackage.getEInt(), "verticalResolution", null, 0, 1, RasterScanSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRasterScanSettings_HorizontalResolution(), theEcorePackage.getEInt(), "horizontalResolution", null, 0, 1, RasterScanSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRasterScanSettings_NumberOfPoints(), theEcorePackage.getEInt(), "numberOfPoints", "0", 0, 1, RasterScanSettings.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(sensorsRangeFacadeEClass, SensorsRangeFacade.class, "SensorsRangeFacade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getSensorsRangeFacade__CreateRasterScanSettings__double_double_double_double_int_int(), this.getRasterScanSettings(), "createRasterScanSettings", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "minimumDistance", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "maximumDistance", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "horizontalFieldOfViewAngle", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "verticalFieldOfViewAngle", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "horizontalResolution", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "verticalResolution", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSensorsRangeFacade__CreateRasterScanSettings__RasterScanSettings(), this.getRasterScanSettings(), "createRasterScanSettings", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRasterScanSettings(), "rasterScanSettings", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(rasterScanDataEClass, RasterScanData.class, "RasterScanData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRasterScanData_RasterScanSettings(), this.getRasterScanSettings(), null, "rasterScanSettings", null, 0, 1, RasterScanData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRasterScanData_ScanData(), theData25dPackage.getVolumetricCoordinatesSet25D(), null, "scanData", null, 0, 1, RasterScanData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(listEDataType, List.class, "List", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //RangePackageImpl
