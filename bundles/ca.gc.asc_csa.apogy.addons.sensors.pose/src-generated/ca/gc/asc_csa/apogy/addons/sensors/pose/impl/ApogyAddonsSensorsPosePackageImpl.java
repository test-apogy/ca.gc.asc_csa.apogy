/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.addons.sensors.pose.impl;

import java.io.IOException;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import ca.gc.asc_csa.apogy.addons.sensors.ApogyAddonsSensorsPackage;

import ca.gc.asc_csa.apogy.addons.sensors.pose.CSVDataLogger;
import ca.gc.asc_csa.apogy.addons.sensors.pose.InertialMeasurementUnit;
import ca.gc.asc_csa.apogy.addons.sensors.pose.OrientationSensor;
import ca.gc.asc_csa.apogy.addons.sensors.pose.PoseDataLogger;
import ca.gc.asc_csa.apogy.addons.sensors.pose.ApogyAddonsSensorsPoseFacade;
import ca.gc.asc_csa.apogy.addons.sensors.pose.ApogyAddonsSensorsPoseFactory;
import ca.gc.asc_csa.apogy.addons.sensors.pose.ApogyAddonsSensorsPosePackage;
import ca.gc.asc_csa.apogy.addons.sensors.pose.PoseSensor;
import ca.gc.asc_csa.apogy.addons.sensors.pose.PositionSensor;
import ca.gc.asc_csa.apogy.addons.sensors.pose.SelfPlaceSensor;
import ca.gc.asc_csa.apogy.addons.sensors.pose.SimulatedOrientationSensor;
import ca.gc.asc_csa.apogy.addons.sensors.pose.SimulatedPoseSensor;
import ca.gc.asc_csa.apogy.addons.sensors.pose.SimulatedPositionSensor;

import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DPackage;

import ca.gc.asc_csa.apogy.common.math.ApogyCommonMathPackage;

import ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyAddonsSensorsPosePackageImpl extends EPackageImpl implements ApogyAddonsSensorsPosePackage {
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
	private EClass positionSensorEClass = null;

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
	private EClass orientationSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inertialMeasurementUnitEClass = null;

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
	private EClass poseSensorEClass = null;

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
	private EClass apogyAddonsSensorsPoseFacadeEClass = null;

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
	 * @see ca.gc.asc_csa.apogy.addons.sensors.pose.ApogyAddonsSensorsPosePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ApogyAddonsSensorsPosePackageImpl() {
		super(eNS_URI, ApogyAddonsSensorsPoseFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ApogyAddonsSensorsPosePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ApogyAddonsSensorsPosePackage init() {
		if (isInited) return (ApogyAddonsSensorsPosePackage)EPackage.Registry.INSTANCE.getEPackage(ApogyAddonsSensorsPosePackage.eNS_URI);

		// Obtain or create and register package
		ApogyAddonsSensorsPosePackageImpl theApogyAddonsSensorsPosePackage = (ApogyAddonsSensorsPosePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ApogyAddonsSensorsPosePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ApogyAddonsSensorsPosePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ApogyAddonsSensorsPackage.eINSTANCE.eClass();
		ApogyCommonGeometryData3DPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theApogyAddonsSensorsPosePackage.createPackageContents();

		// Initialize created meta-data
		theApogyAddonsSensorsPosePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theApogyAddonsSensorsPosePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ApogyAddonsSensorsPosePackage.eNS_URI, theApogyAddonsSensorsPosePackage);
		return theApogyAddonsSensorsPosePackage;
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
	public EClass getPositionSensor() {
		return positionSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPositionSensor_PositionCoordinates() {
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
	public EClass getSimulatedPositionSensor() {
		return simulatedPositionSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulatedPositionSensor_XVelocity() {
		return (EAttribute)simulatedPositionSensorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulatedPositionSensor_YVelocity() {
		return (EAttribute)simulatedPositionSensorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulatedPositionSensor_ZVelocity() {
		return (EAttribute)simulatedPositionSensorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulatedPositionSensor_UpdatePeriod() {
		return (EAttribute)simulatedPositionSensorEClass.getEStructuralFeatures().get(3);
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
	public EReference getOrientationSensor_OrientationCoordinates() {
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
	public EClass getSimulatedOrientationSensor() {
		return simulatedOrientationSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulatedOrientationSensor_XAngularVelocity() {
		return (EAttribute)simulatedOrientationSensorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulatedOrientationSensor_YAngularVelocity() {
		return (EAttribute)simulatedOrientationSensorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulatedOrientationSensor_ZAngularVelocity() {
		return (EAttribute)simulatedOrientationSensorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulatedOrientationSensor_UpdatePeriod() {
		return (EAttribute)simulatedOrientationSensorEClass.getEStructuralFeatures().get(3);
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
	public EReference getPoseSensor_Pose() {
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
	public EClass getSimulatedPoseSensor() {
		return simulatedPoseSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulatedPoseSensor_XVelocity() {
		return (EAttribute)simulatedPoseSensorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulatedPoseSensor_YVelocity() {
		return (EAttribute)simulatedPoseSensorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulatedPoseSensor_ZVelocity() {
		return (EAttribute)simulatedPoseSensorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulatedPoseSensor_XAngularVelocity() {
		return (EAttribute)simulatedPoseSensorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulatedPoseSensor_YAngularVelocity() {
		return (EAttribute)simulatedPoseSensorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulatedPoseSensor_ZAngularVelocity() {
		return (EAttribute)simulatedPoseSensorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulatedPoseSensor_UpdatePeriod() {
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
	public EClass getApogyAddonsSensorsPoseFacade() {
		return apogyAddonsSensorsPoseFacadeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyAddonsSensorsPoseFacade__CreateCSVDataLogger__String() {
		return apogyAddonsSensorsPoseFacadeEClass.getEOperations().get(0);
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
	public ApogyAddonsSensorsPoseFactory getApogyAddonsSensorsPoseFactory() {
		return (ApogyAddonsSensorsPoseFactory)getEFactoryInstance();
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
		selfPlaceSensorEClass = createEClass(SELF_PLACE_SENSOR);

		positionSensorEClass = createEClass(POSITION_SENSOR);
		createEReference(positionSensorEClass, POSITION_SENSOR__POSITION_COORDINATES);
		createEOperation(positionSensorEClass, POSITION_SENSOR___RESET_POSITION__CARTESIANPOSITIONCOORDINATES);

		simulatedPositionSensorEClass = createEClass(SIMULATED_POSITION_SENSOR);
		createEAttribute(simulatedPositionSensorEClass, SIMULATED_POSITION_SENSOR__XVELOCITY);
		createEAttribute(simulatedPositionSensorEClass, SIMULATED_POSITION_SENSOR__YVELOCITY);
		createEAttribute(simulatedPositionSensorEClass, SIMULATED_POSITION_SENSOR__ZVELOCITY);
		createEAttribute(simulatedPositionSensorEClass, SIMULATED_POSITION_SENSOR__UPDATE_PERIOD);

		orientationSensorEClass = createEClass(ORIENTATION_SENSOR);
		createEReference(orientationSensorEClass, ORIENTATION_SENSOR__ORIENTATION_COORDINATES);
		createEOperation(orientationSensorEClass, ORIENTATION_SENSOR___RESET_ORIENTATION__CARTESIANORIENTATIONCOORDINATES);
		createEOperation(orientationSensorEClass, ORIENTATION_SENSOR___EXTRACT_ORIENTATION_FROM_MATRIX__MATRIX3X3);

		inertialMeasurementUnitEClass = createEClass(INERTIAL_MEASUREMENT_UNIT);
		createEReference(inertialMeasurementUnitEClass, INERTIAL_MEASUREMENT_UNIT__ANGULAR_VELOCITY);
		createEReference(inertialMeasurementUnitEClass, INERTIAL_MEASUREMENT_UNIT__LINEAR_ACCELERATION);

		simulatedOrientationSensorEClass = createEClass(SIMULATED_ORIENTATION_SENSOR);
		createEAttribute(simulatedOrientationSensorEClass, SIMULATED_ORIENTATION_SENSOR__XANGULAR_VELOCITY);
		createEAttribute(simulatedOrientationSensorEClass, SIMULATED_ORIENTATION_SENSOR__YANGULAR_VELOCITY);
		createEAttribute(simulatedOrientationSensorEClass, SIMULATED_ORIENTATION_SENSOR__ZANGULAR_VELOCITY);
		createEAttribute(simulatedOrientationSensorEClass, SIMULATED_ORIENTATION_SENSOR__UPDATE_PERIOD);

		poseSensorEClass = createEClass(POSE_SENSOR);
		createEReference(poseSensorEClass, POSE_SENSOR__POSE);
		createEReference(poseSensorEClass, POSE_SENSOR__DATA_LOGGER);
		createEOperation(poseSensorEClass, POSE_SENSOR___RESET_POSE__POSE);

		simulatedPoseSensorEClass = createEClass(SIMULATED_POSE_SENSOR);
		createEAttribute(simulatedPoseSensorEClass, SIMULATED_POSE_SENSOR__XVELOCITY);
		createEAttribute(simulatedPoseSensorEClass, SIMULATED_POSE_SENSOR__YVELOCITY);
		createEAttribute(simulatedPoseSensorEClass, SIMULATED_POSE_SENSOR__ZVELOCITY);
		createEAttribute(simulatedPoseSensorEClass, SIMULATED_POSE_SENSOR__XANGULAR_VELOCITY);
		createEAttribute(simulatedPoseSensorEClass, SIMULATED_POSE_SENSOR__YANGULAR_VELOCITY);
		createEAttribute(simulatedPoseSensorEClass, SIMULATED_POSE_SENSOR__ZANGULAR_VELOCITY);
		createEAttribute(simulatedPoseSensorEClass, SIMULATED_POSE_SENSOR__UPDATE_PERIOD);

		poseDataLoggerEClass = createEClass(POSE_DATA_LOGGER);
		createEAttribute(poseDataLoggerEClass, POSE_DATA_LOGGER__OUTPUT_FILE);
		createEOperation(poseDataLoggerEClass, POSE_DATA_LOGGER___LOG_POSE__POSE);

		csvDataLoggerEClass = createEClass(CSV_DATA_LOGGER);

		apogyAddonsSensorsPoseFacadeEClass = createEClass(APOGY_ADDONS_SENSORS_POSE_FACADE);
		createEOperation(apogyAddonsSensorsPoseFacadeEClass, APOGY_ADDONS_SENSORS_POSE_FACADE___CREATE_CSV_DATA_LOGGER__STRING);

		// Create data types
		exceptionEDataType = createEDataType(EXCEPTION);
		ioExceptionEDataType = createEDataType(IO_EXCEPTION);
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
		ApogyAddonsSensorsPackage theApogyAddonsSensorsPackage = (ApogyAddonsSensorsPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyAddonsSensorsPackage.eNS_URI);
		ApogyCommonTopologyPackage theApogyCommonTopologyPackage = (ApogyCommonTopologyPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCommonTopologyPackage.eNS_URI);
		ApogyCommonGeometryData3DPackage theApogyCommonGeometryData3DPackage = (ApogyCommonGeometryData3DPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCommonGeometryData3DPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		ApogyCommonMathPackage theApogyCommonMathPackage = (ApogyCommonMathPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCommonMathPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		selfPlaceSensorEClass.getESuperTypes().add(theApogyAddonsSensorsPackage.getSensor());
		positionSensorEClass.getESuperTypes().add(theApogyCommonTopologyPackage.getPositionNode());
		positionSensorEClass.getESuperTypes().add(this.getSelfPlaceSensor());
		simulatedPositionSensorEClass.getESuperTypes().add(this.getPositionSensor());
		orientationSensorEClass.getESuperTypes().add(theApogyCommonTopologyPackage.getRotationNode());
		orientationSensorEClass.getESuperTypes().add(this.getSelfPlaceSensor());
		inertialMeasurementUnitEClass.getESuperTypes().add(this.getOrientationSensor());
		simulatedOrientationSensorEClass.getESuperTypes().add(this.getOrientationSensor());
		poseSensorEClass.getESuperTypes().add(theApogyCommonTopologyPackage.getTransformNode());
		poseSensorEClass.getESuperTypes().add(this.getPositionSensor());
		poseSensorEClass.getESuperTypes().add(this.getOrientationSensor());
		simulatedPoseSensorEClass.getESuperTypes().add(this.getPoseSensor());
		csvDataLoggerEClass.getESuperTypes().add(this.getPoseDataLogger());

		// Initialize classes, features, and operations; add parameters
		initEClass(selfPlaceSensorEClass, SelfPlaceSensor.class, "SelfPlaceSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(positionSensorEClass, PositionSensor.class, "PositionSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPositionSensor_PositionCoordinates(), theApogyCommonGeometryData3DPackage.getCartesianPositionCoordinates(), null, "positionCoordinates", null, 0, 1, PositionSensor.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getPositionSensor__ResetPosition__CartesianPositionCoordinates(), null, "resetPosition", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCommonGeometryData3DPackage.getCartesianPositionCoordinates(), "newPosition", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());

		initEClass(simulatedPositionSensorEClass, SimulatedPositionSensor.class, "SimulatedPositionSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimulatedPositionSensor_XVelocity(), theEcorePackage.getEDouble(), "xVelocity", null, 0, 1, SimulatedPositionSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulatedPositionSensor_YVelocity(), theEcorePackage.getEDouble(), "yVelocity", null, 0, 1, SimulatedPositionSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulatedPositionSensor_ZVelocity(), theEcorePackage.getEDouble(), "zVelocity", null, 0, 1, SimulatedPositionSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulatedPositionSensor_UpdatePeriod(), theEcorePackage.getEDouble(), "updatePeriod", "1.0", 0, 1, SimulatedPositionSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orientationSensorEClass, OrientationSensor.class, "OrientationSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrientationSensor_OrientationCoordinates(), theApogyCommonGeometryData3DPackage.getCartesianOrientationCoordinates(), null, "orientationCoordinates", null, 0, 1, OrientationSensor.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		op = initEOperation(getOrientationSensor__ResetOrientation__CartesianOrientationCoordinates(), null, "resetOrientation", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCommonGeometryData3DPackage.getCartesianOrientationCoordinates(), "newOrientation", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());

		op = initEOperation(getOrientationSensor__ExtractOrientationFromMatrix__Matrix3x3(), theApogyCommonGeometryData3DPackage.getCartesianOrientationCoordinates(), "extractOrientationFromMatrix", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCommonMathPackage.getMatrix3x3(), "matrix", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(inertialMeasurementUnitEClass, InertialMeasurementUnit.class, "InertialMeasurementUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInertialMeasurementUnit_AngularVelocity(), theApogyCommonMathPackage.getTuple3d(), null, "angularVelocity", null, 0, 1, InertialMeasurementUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInertialMeasurementUnit_LinearAcceleration(), theApogyCommonMathPackage.getTuple3d(), null, "linearAcceleration", null, 0, 1, InertialMeasurementUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simulatedOrientationSensorEClass, SimulatedOrientationSensor.class, "SimulatedOrientationSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimulatedOrientationSensor_XAngularVelocity(), theEcorePackage.getEDouble(), "xAngularVelocity", null, 0, 1, SimulatedOrientationSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulatedOrientationSensor_YAngularVelocity(), theEcorePackage.getEDouble(), "yAngularVelocity", null, 0, 1, SimulatedOrientationSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulatedOrientationSensor_ZAngularVelocity(), theEcorePackage.getEDouble(), "zAngularVelocity", null, 0, 1, SimulatedOrientationSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulatedOrientationSensor_UpdatePeriod(), theEcorePackage.getEDouble(), "updatePeriod", "1.0", 0, 1, SimulatedOrientationSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(poseSensorEClass, PoseSensor.class, "PoseSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPoseSensor_Pose(), theApogyCommonGeometryData3DPackage.getPose(), null, "pose", null, 0, 1, PoseSensor.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPoseSensor_DataLogger(), this.getPoseDataLogger(), null, "dataLogger", null, 0, 1, PoseSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getPoseSensor__ResetPose__Pose(), null, "resetPose", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCommonGeometryData3DPackage.getPose(), "newPose", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());

		initEClass(simulatedPoseSensorEClass, SimulatedPoseSensor.class, "SimulatedPoseSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimulatedPoseSensor_XVelocity(), theEcorePackage.getEDouble(), "xVelocity", null, 0, 1, SimulatedPoseSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulatedPoseSensor_YVelocity(), theEcorePackage.getEDouble(), "yVelocity", null, 0, 1, SimulatedPoseSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulatedPoseSensor_ZVelocity(), theEcorePackage.getEDouble(), "zVelocity", null, 0, 1, SimulatedPoseSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulatedPoseSensor_XAngularVelocity(), theEcorePackage.getEDouble(), "xAngularVelocity", null, 0, 1, SimulatedPoseSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulatedPoseSensor_YAngularVelocity(), theEcorePackage.getEDouble(), "yAngularVelocity", null, 0, 1, SimulatedPoseSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulatedPoseSensor_ZAngularVelocity(), theEcorePackage.getEDouble(), "zAngularVelocity", null, 0, 1, SimulatedPoseSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulatedPoseSensor_UpdatePeriod(), theEcorePackage.getEDouble(), "updatePeriod", "1.0", 0, 1, SimulatedPoseSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(poseDataLoggerEClass, PoseDataLogger.class, "PoseDataLogger", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPoseDataLogger_OutputFile(), theEcorePackage.getEString(), "outputFile", null, 0, 1, PoseDataLogger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getPoseDataLogger__LogPose__Pose(), null, "logPose", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCommonGeometryData3DPackage.getPose(), "pose", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getIOException());

		initEClass(csvDataLoggerEClass, CSVDataLogger.class, "CSVDataLogger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(apogyAddonsSensorsPoseFacadeEClass, ApogyAddonsSensorsPoseFacade.class, "ApogyAddonsSensorsPoseFacade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getApogyAddonsSensorsPoseFacade__CreateCSVDataLogger__String(), this.getCSVDataLogger(), "createCSVDataLogger", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "fileName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		// Initialize data types
		initEDataType(exceptionEDataType, Exception.class, "Exception", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(ioExceptionEDataType, IOException.class, "IOException", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

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
			 "prefix", "ApogyAddonsSensorsPose",
			 "childCreationExtenders", "true",
			 "extensibleProviderFactory", "true",
			 "multipleEditorPages", "false",
			 "copyrightText", "Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)",
			 "modelName", "ApogyAddonsSensorsPose",
			 "suppressGenModelAnnotations", "false",
			 "modelDirectory", "/ca.gc.asc_csa.apogy.addons.sensors.pose/src-generated",
			 "editDirectory", "/ca.gc.asc_csa.apogy.addons.sensors.pose.edit/src-generated",
			 "basePackage", "ca.gc.asc_csa.apogy.addons.sensors"
		   });
	}

} //ApogyAddonsSensorsPosePackageImpl
