/**
 * Canadian Space Agency 2007.
 *
 * $Id: PosePackageImpl.java,v 1.3.4.2 2015/05/21 15:51:31 pallard Exp $
 */
package ca.gc.space.mrt.sensors.pose.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.symphony.common.math.MathPackage;

import ca.gc.space.mrt.common.processors.ProcessorsPackage;
import ca.gc.space.mrt.geometry.data3d.Data3dPackage;
import ca.gc.space.mrt.sensors.pose.CSVDataLogger;
import ca.gc.space.mrt.sensors.pose.InertialMeasurementUnit;
import ca.gc.space.mrt.sensors.pose.OrientationSensor;
import ca.gc.space.mrt.sensors.pose.PoseDataLogger;
import ca.gc.space.mrt.sensors.pose.PoseFacade;
import ca.gc.space.mrt.sensors.pose.PoseFactory;
import ca.gc.space.mrt.sensors.pose.PosePackage;
import ca.gc.space.mrt.sensors.pose.PoseSensor;
import ca.gc.space.mrt.sensors.pose.PositionSensor;
import ca.gc.space.mrt.sensors.pose.SelfPlaceSensor;
import ca.gc.space.mrt.sensors.pose.SimulatedOrientationSensor;
import ca.gc.space.mrt.sensors.pose.SimulatedPoseSensor;
import ca.gc.space.mrt.sensors.pose.SimulatedPositionSensor;
import ca.gc.space.mrt.sensors.sensors.SensorsPackage;
import ca.gc.space.topology.TopologyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PosePackageImpl extends EPackageImpl implements PosePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Canadian Space Agency 2007.";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass positionSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orientationSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass poseSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selfPlaceSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simulatedPositionSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simulatedOrientationSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simulatedPoseSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass poseDataLoggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass csvDataLoggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass poseFacadeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inertialMeasurementUnitEClass = null;

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
	 * @see ca.gc.space.mrt.sensors.pose.PosePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PosePackageImpl() {
		super(eNS_URI, PoseFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PosePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PosePackage init() {
		if (isInited) return (PosePackage)EPackage.Registry.INSTANCE.getEPackage(PosePackage.eNS_URI);

		// Obtain or create and register package
		PosePackageImpl thePosePackage = (PosePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PosePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PosePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		Data3dPackage.eINSTANCE.eClass();
		SensorsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thePosePackage.createPackageContents();

		// Initialize created meta-data
		thePosePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePosePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PosePackage.eNS_URI, thePosePackage);
		return thePosePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPositionSensor() {
		return positionSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPositionSensor_PositionCoordinates()
	{
		return (EReference)positionSensorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPositionSensor__ResetPosition__CartesianPositionCoordinates() {
		return positionSensorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrientationSensor() {
		return orientationSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrientationSensor_OrientationCoordinates()
	{
		return (EReference)orientationSensorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOrientationSensor__ResetOrientation__CartesianOrientationCoordinates() {
		return orientationSensorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOrientationSensor__ExtractOrientationFromMatrix__Matrix3x3() {
		return orientationSensorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPoseSensor() {
		return poseSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPoseSensor_Pose()
	{
		return (EReference)poseSensorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPoseSensor_DataLogger() {
		return (EReference)poseSensorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPoseSensor__ResetPose__Pose() {
		return poseSensorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelfPlaceSensor() {
		return selfPlaceSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimulatedPositionSensor()
	{
		return simulatedPositionSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulatedPositionSensor_XVelocity()
	{
		return (EAttribute)simulatedPositionSensorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulatedPositionSensor_YVelocity()
	{
		return (EAttribute)simulatedPositionSensorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulatedPositionSensor_ZVelocity()
	{
		return (EAttribute)simulatedPositionSensorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulatedPositionSensor_UpdatePeriod()
	{
		return (EAttribute)simulatedPositionSensorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimulatedOrientationSensor()
	{
		return simulatedOrientationSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulatedOrientationSensor_XAngularVelocity()
	{
		return (EAttribute)simulatedOrientationSensorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulatedOrientationSensor_YAngularVelocity()
	{
		return (EAttribute)simulatedOrientationSensorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulatedOrientationSensor_ZAngularVelocity()
	{
		return (EAttribute)simulatedOrientationSensorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulatedOrientationSensor_UpdatePeriod()
	{
		return (EAttribute)simulatedOrientationSensorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimulatedPoseSensor()
	{
		return simulatedPoseSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulatedPoseSensor_UpdatePeriod()
	{
		return (EAttribute)simulatedPoseSensorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulatedPoseSensor_XVelocity()
	{
		return (EAttribute)simulatedPoseSensorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulatedPoseSensor_YVelocity()
	{
		return (EAttribute)simulatedPoseSensorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulatedPoseSensor_ZVelocity()
	{
		return (EAttribute)simulatedPoseSensorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulatedPoseSensor_XAngularVelocity()
	{
		return (EAttribute)simulatedPoseSensorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulatedPoseSensor_YAngularVelocity()
	{
		return (EAttribute)simulatedPoseSensorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulatedPoseSensor_ZAngularVelocity()
	{
		return (EAttribute)simulatedPoseSensorEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPoseDataLogger() {
		return poseDataLoggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPoseDataLogger_OutputFile() {
		return (EAttribute)poseDataLoggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPoseDataLogger__LogPose__Pose() {
		return poseDataLoggerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCSVDataLogger() {
		return csvDataLoggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPoseFacade() {
		return poseFacadeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPoseFacade__CreateCSVDataLogger__String() {
		return poseFacadeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInertialMeasurementUnit() {
		return inertialMeasurementUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInertialMeasurementUnit_AngularVelocity() {
		return (EReference)inertialMeasurementUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInertialMeasurementUnit_LinearAcceleration() {
		return (EReference)inertialMeasurementUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PoseFactory getPoseFactory() {
		return (PoseFactory)getEFactoryInstance();
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
		positionSensorEClass = createEClass(POSITION_SENSOR);
		createEReference(positionSensorEClass, POSITION_SENSOR__POSITION_COORDINATES);
		createEOperation(positionSensorEClass, POSITION_SENSOR___RESET_POSITION__CARTESIANPOSITIONCOORDINATES);

		orientationSensorEClass = createEClass(ORIENTATION_SENSOR);
		createEReference(orientationSensorEClass, ORIENTATION_SENSOR__ORIENTATION_COORDINATES);
		createEOperation(orientationSensorEClass, ORIENTATION_SENSOR___RESET_ORIENTATION__CARTESIANORIENTATIONCOORDINATES);
		createEOperation(orientationSensorEClass, ORIENTATION_SENSOR___EXTRACT_ORIENTATION_FROM_MATRIX__MATRIX3X3);

		poseSensorEClass = createEClass(POSE_SENSOR);
		createEReference(poseSensorEClass, POSE_SENSOR__POSE);
		createEReference(poseSensorEClass, POSE_SENSOR__DATA_LOGGER);
		createEOperation(poseSensorEClass, POSE_SENSOR___RESET_POSE__POSE);

		selfPlaceSensorEClass = createEClass(SELF_PLACE_SENSOR);

		simulatedPositionSensorEClass = createEClass(SIMULATED_POSITION_SENSOR);
		createEAttribute(simulatedPositionSensorEClass, SIMULATED_POSITION_SENSOR__XVELOCITY);
		createEAttribute(simulatedPositionSensorEClass, SIMULATED_POSITION_SENSOR__YVELOCITY);
		createEAttribute(simulatedPositionSensorEClass, SIMULATED_POSITION_SENSOR__ZVELOCITY);
		createEAttribute(simulatedPositionSensorEClass, SIMULATED_POSITION_SENSOR__UPDATE_PERIOD);

		simulatedOrientationSensorEClass = createEClass(SIMULATED_ORIENTATION_SENSOR);
		createEAttribute(simulatedOrientationSensorEClass, SIMULATED_ORIENTATION_SENSOR__XANGULAR_VELOCITY);
		createEAttribute(simulatedOrientationSensorEClass, SIMULATED_ORIENTATION_SENSOR__YANGULAR_VELOCITY);
		createEAttribute(simulatedOrientationSensorEClass, SIMULATED_ORIENTATION_SENSOR__ZANGULAR_VELOCITY);
		createEAttribute(simulatedOrientationSensorEClass, SIMULATED_ORIENTATION_SENSOR__UPDATE_PERIOD);

		simulatedPoseSensorEClass = createEClass(SIMULATED_POSE_SENSOR);
		createEAttribute(simulatedPoseSensorEClass, SIMULATED_POSE_SENSOR__UPDATE_PERIOD);
		createEAttribute(simulatedPoseSensorEClass, SIMULATED_POSE_SENSOR__XVELOCITY);
		createEAttribute(simulatedPoseSensorEClass, SIMULATED_POSE_SENSOR__YVELOCITY);
		createEAttribute(simulatedPoseSensorEClass, SIMULATED_POSE_SENSOR__ZVELOCITY);
		createEAttribute(simulatedPoseSensorEClass, SIMULATED_POSE_SENSOR__XANGULAR_VELOCITY);
		createEAttribute(simulatedPoseSensorEClass, SIMULATED_POSE_SENSOR__YANGULAR_VELOCITY);
		createEAttribute(simulatedPoseSensorEClass, SIMULATED_POSE_SENSOR__ZANGULAR_VELOCITY);

		poseDataLoggerEClass = createEClass(POSE_DATA_LOGGER);
		createEAttribute(poseDataLoggerEClass, POSE_DATA_LOGGER__OUTPUT_FILE);
		createEOperation(poseDataLoggerEClass, POSE_DATA_LOGGER___LOG_POSE__POSE);

		csvDataLoggerEClass = createEClass(CSV_DATA_LOGGER);

		poseFacadeEClass = createEClass(POSE_FACADE);
		createEOperation(poseFacadeEClass, POSE_FACADE___CREATE_CSV_DATA_LOGGER__STRING);

		inertialMeasurementUnitEClass = createEClass(INERTIAL_MEASUREMENT_UNIT);
		createEReference(inertialMeasurementUnitEClass, INERTIAL_MEASUREMENT_UNIT__ANGULAR_VELOCITY);
		createEReference(inertialMeasurementUnitEClass, INERTIAL_MEASUREMENT_UNIT__LINEAR_ACCELERATION);
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
		TopologyPackage theTopologyPackage = (TopologyPackage)EPackage.Registry.INSTANCE.getEPackage(TopologyPackage.eNS_URI);
		Data3dPackage theData3dPackage = (Data3dPackage)EPackage.Registry.INSTANCE.getEPackage(Data3dPackage.eNS_URI);
		ProcessorsPackage theProcessorsPackage = (ProcessorsPackage)EPackage.Registry.INSTANCE.getEPackage(ProcessorsPackage.eNS_URI);
		MathPackage theMathPackage = (MathPackage)EPackage.Registry.INSTANCE.getEPackage(MathPackage.eNS_URI);
		SensorsPackage theSensorsPackage = (SensorsPackage)EPackage.Registry.INSTANCE.getEPackage(SensorsPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		positionSensorEClass.getESuperTypes().add(theTopologyPackage.getPositionNode());
		positionSensorEClass.getESuperTypes().add(this.getSelfPlaceSensor());
		orientationSensorEClass.getESuperTypes().add(theTopologyPackage.getRotationNode());
		orientationSensorEClass.getESuperTypes().add(this.getSelfPlaceSensor());
		poseSensorEClass.getESuperTypes().add(theTopologyPackage.getTransformNode());
		poseSensorEClass.getESuperTypes().add(this.getPositionSensor());
		poseSensorEClass.getESuperTypes().add(this.getOrientationSensor());
		selfPlaceSensorEClass.getESuperTypes().add(theSensorsPackage.getSensor());
		simulatedPositionSensorEClass.getESuperTypes().add(this.getPositionSensor());
		simulatedOrientationSensorEClass.getESuperTypes().add(this.getOrientationSensor());
		simulatedPoseSensorEClass.getESuperTypes().add(this.getPoseSensor());
		csvDataLoggerEClass.getESuperTypes().add(this.getPoseDataLogger());
		inertialMeasurementUnitEClass.getESuperTypes().add(this.getOrientationSensor());

		// Initialize classes, features, and operations; add parameters
		initEClass(positionSensorEClass, PositionSensor.class, "PositionSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPositionSensor_PositionCoordinates(), theData3dPackage.getCartesianPositionCoordinates(), null, "positionCoordinates", null, 0, 1, PositionSensor.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getPositionSensor__ResetPosition__CartesianPositionCoordinates(), null, "resetPosition", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theData3dPackage.getCartesianPositionCoordinates(), "newPosition", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theProcessorsPackage.getException());

		initEClass(orientationSensorEClass, OrientationSensor.class, "OrientationSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrientationSensor_OrientationCoordinates(), theData3dPackage.getCartesianOrientationCoordinates(), null, "orientationCoordinates", null, 0, 1, OrientationSensor.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		op = initEOperation(getOrientationSensor__ResetOrientation__CartesianOrientationCoordinates(), null, "resetOrientation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theData3dPackage.getCartesianOrientationCoordinates(), "newOrientation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theProcessorsPackage.getException());

		op = initEOperation(getOrientationSensor__ExtractOrientationFromMatrix__Matrix3x3(), theData3dPackage.getCartesianOrientationCoordinates(), "extractOrientationFromMatrix", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMathPackage.getMatrix3x3(), "matrix", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(poseSensorEClass, PoseSensor.class, "PoseSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPoseSensor_Pose(), theData3dPackage.getPose(), null, "pose", null, 1, 1, PoseSensor.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPoseSensor_DataLogger(), this.getPoseDataLogger(), null, "dataLogger", null, 0, 1, PoseSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getPoseSensor__ResetPose__Pose(), null, "resetPose", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theData3dPackage.getPose(), "newPose", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theProcessorsPackage.getException());

		initEClass(selfPlaceSensorEClass, SelfPlaceSensor.class, "SelfPlaceSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(simulatedPositionSensorEClass, SimulatedPositionSensor.class, "SimulatedPositionSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimulatedPositionSensor_XVelocity(), theEcorePackage.getEDouble(), "xVelocity", null, 0, 1, SimulatedPositionSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulatedPositionSensor_YVelocity(), theEcorePackage.getEDouble(), "yVelocity", null, 0, 1, SimulatedPositionSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulatedPositionSensor_ZVelocity(), theEcorePackage.getEDouble(), "zVelocity", null, 0, 1, SimulatedPositionSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulatedPositionSensor_UpdatePeriod(), theEcorePackage.getEDouble(), "updatePeriod", "1", 0, 1, SimulatedPositionSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simulatedOrientationSensorEClass, SimulatedOrientationSensor.class, "SimulatedOrientationSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimulatedOrientationSensor_XAngularVelocity(), theEcorePackage.getEDouble(), "xAngularVelocity", null, 0, 1, SimulatedOrientationSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulatedOrientationSensor_YAngularVelocity(), theEcorePackage.getEDouble(), "yAngularVelocity", null, 0, 1, SimulatedOrientationSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulatedOrientationSensor_ZAngularVelocity(), theEcorePackage.getEDouble(), "zAngularVelocity", null, 0, 1, SimulatedOrientationSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulatedOrientationSensor_UpdatePeriod(), theEcorePackage.getEDouble(), "updatePeriod", "1.0", 0, 1, SimulatedOrientationSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simulatedPoseSensorEClass, SimulatedPoseSensor.class, "SimulatedPoseSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimulatedPoseSensor_UpdatePeriod(), theEcorePackage.getEDouble(), "updatePeriod", "1.0", 0, 1, SimulatedPoseSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulatedPoseSensor_XVelocity(), theEcorePackage.getEDouble(), "xVelocity", null, 0, 1, SimulatedPoseSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulatedPoseSensor_YVelocity(), theEcorePackage.getEDouble(), "yVelocity", null, 0, 1, SimulatedPoseSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulatedPoseSensor_ZVelocity(), theEcorePackage.getEDouble(), "zVelocity", null, 0, 1, SimulatedPoseSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulatedPoseSensor_XAngularVelocity(), theEcorePackage.getEDouble(), "xAngularVelocity", null, 0, 1, SimulatedPoseSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulatedPoseSensor_YAngularVelocity(), theEcorePackage.getEDouble(), "yAngularVelocity", null, 0, 1, SimulatedPoseSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulatedPoseSensor_ZAngularVelocity(), theEcorePackage.getEDouble(), "zAngularVelocity", null, 0, 1, SimulatedPoseSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(poseDataLoggerEClass, PoseDataLogger.class, "PoseDataLogger", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPoseDataLogger_OutputFile(), theEcorePackage.getEString(), "outputFile", null, 0, 1, PoseDataLogger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getPoseDataLogger__LogPose__Pose(), null, "logPose", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theData3dPackage.getPose(), "pose", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theData3dPackage.getIOException());

		initEClass(csvDataLoggerEClass, CSVDataLogger.class, "CSVDataLogger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(poseFacadeEClass, PoseFacade.class, "PoseFacade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getPoseFacade__CreateCSVDataLogger__String(), this.getCSVDataLogger(), "createCSVDataLogger", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "fileName", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(inertialMeasurementUnitEClass, InertialMeasurementUnit.class, "InertialMeasurementUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInertialMeasurementUnit_AngularVelocity(), theMathPackage.getTuple3d(), null, "angularVelocity", null, 0, 1, InertialMeasurementUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInertialMeasurementUnit_LinearAcceleration(), theMathPackage.getTuple3d(), null, "linearAcceleration", null, 0, 1, InertialMeasurementUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //PosePackageImpl
