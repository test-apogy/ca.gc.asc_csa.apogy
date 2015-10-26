/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.addons.sensors.pose.impl;

import java.io.IOException;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.symphony.addons.sensors.Symphony__AddonsSensorsPackage;

import org.eclipse.symphony.addons.sensors.pose.CSVDataLogger;
import org.eclipse.symphony.addons.sensors.pose.InertialMeasurementUnit;
import org.eclipse.symphony.addons.sensors.pose.OrientationSensor;
import org.eclipse.symphony.addons.sensors.pose.PoseDataLogger;
import org.eclipse.symphony.addons.sensors.pose.PoseFacade;
import org.eclipse.symphony.addons.sensors.pose.Symphony__AddonsSensorsPoseFactory;
import org.eclipse.symphony.addons.sensors.pose.Symphony__AddonsSensorsPosePackage;
import org.eclipse.symphony.addons.sensors.pose.PoseSensor;
import org.eclipse.symphony.addons.sensors.pose.PositionSensor;
import org.eclipse.symphony.addons.sensors.pose.SelfPlaceSensor;
import org.eclipse.symphony.addons.sensors.pose.SimulatedOrientationSensor;
import org.eclipse.symphony.addons.sensors.pose.SimulatedPoseSensor;
import org.eclipse.symphony.addons.sensors.pose.SimulatedPositionSensor;

import org.eclipse.symphony.common.geometry.data3d.Symphony__CommonGeometryData3DPackage;

import org.eclipse.symphony.common.math.Symphony__CommonMathPackage;

import org.eclipse.symphony.common.topology.Symphony__CommonTopologyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Symphony__AddonsSensorsPosePackageImpl extends EPackageImpl implements Symphony__AddonsSensorsPosePackage {
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
	private EClass poseFacadeEClass = null;

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
	 * @see org.eclipse.symphony.addons.sensors.pose.Symphony__AddonsSensorsPosePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Symphony__AddonsSensorsPosePackageImpl() {
		super(eNS_URI, Symphony__AddonsSensorsPoseFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Symphony__AddonsSensorsPosePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Symphony__AddonsSensorsPosePackage init() {
		if (isInited) return (Symphony__AddonsSensorsPosePackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__AddonsSensorsPosePackage.eNS_URI);

		// Obtain or create and register package
		Symphony__AddonsSensorsPosePackageImpl theSymphony__AddonsSensorsPosePackage = (Symphony__AddonsSensorsPosePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Symphony__AddonsSensorsPosePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Symphony__AddonsSensorsPosePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		Symphony__AddonsSensorsPackage.eINSTANCE.eClass();
		Symphony__CommonGeometryData3DPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSymphony__AddonsSensorsPosePackage.createPackageContents();

		// Initialize created meta-data
		theSymphony__AddonsSensorsPosePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSymphony__AddonsSensorsPosePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Symphony__AddonsSensorsPosePackage.eNS_URI, theSymphony__AddonsSensorsPosePackage);
		return theSymphony__AddonsSensorsPosePackage;
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
	public Symphony__AddonsSensorsPoseFactory getSymphony__AddonsSensorsPoseFactory() {
		return (Symphony__AddonsSensorsPoseFactory)getEFactoryInstance();
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

		poseFacadeEClass = createEClass(POSE_FACADE);
		createEOperation(poseFacadeEClass, POSE_FACADE___CREATE_CSV_DATA_LOGGER__STRING);

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
		Symphony__AddonsSensorsPackage theSymphony__AddonsSensorsPackage = (Symphony__AddonsSensorsPackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__AddonsSensorsPackage.eNS_URI);
		Symphony__CommonTopologyPackage theSymphony__CommonTopologyPackage = (Symphony__CommonTopologyPackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__CommonTopologyPackage.eNS_URI);
		Symphony__CommonGeometryData3DPackage theSymphony__CommonGeometryData3DPackage = (Symphony__CommonGeometryData3DPackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__CommonGeometryData3DPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		Symphony__CommonMathPackage theSymphony__CommonMathPackage = (Symphony__CommonMathPackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__CommonMathPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		selfPlaceSensorEClass.getESuperTypes().add(theSymphony__AddonsSensorsPackage.getSensor());
		positionSensorEClass.getESuperTypes().add(theSymphony__CommonTopologyPackage.getPositionNode());
		positionSensorEClass.getESuperTypes().add(this.getSelfPlaceSensor());
		simulatedPositionSensorEClass.getESuperTypes().add(this.getPositionSensor());
		orientationSensorEClass.getESuperTypes().add(theSymphony__CommonTopologyPackage.getRotationNode());
		orientationSensorEClass.getESuperTypes().add(this.getSelfPlaceSensor());
		inertialMeasurementUnitEClass.getESuperTypes().add(this.getOrientationSensor());
		simulatedOrientationSensorEClass.getESuperTypes().add(this.getOrientationSensor());
		poseSensorEClass.getESuperTypes().add(theSymphony__CommonTopologyPackage.getTransformNode());
		poseSensorEClass.getESuperTypes().add(this.getPositionSensor());
		poseSensorEClass.getESuperTypes().add(this.getOrientationSensor());
		simulatedPoseSensorEClass.getESuperTypes().add(this.getPoseSensor());
		csvDataLoggerEClass.getESuperTypes().add(this.getPoseDataLogger());

		// Initialize classes, features, and operations; add parameters
		initEClass(selfPlaceSensorEClass, SelfPlaceSensor.class, "SelfPlaceSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(positionSensorEClass, PositionSensor.class, "PositionSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPositionSensor_PositionCoordinates(), theSymphony__CommonGeometryData3DPackage.getCartesianPositionCoordinates(), null, "positionCoordinates", null, 0, 1, PositionSensor.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getPositionSensor__ResetPosition__CartesianPositionCoordinates(), null, "resetPosition", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSymphony__CommonGeometryData3DPackage.getCartesianPositionCoordinates(), "newPosition", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());

		initEClass(simulatedPositionSensorEClass, SimulatedPositionSensor.class, "SimulatedPositionSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimulatedPositionSensor_XVelocity(), theEcorePackage.getEDouble(), "xVelocity", null, 0, 1, SimulatedPositionSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulatedPositionSensor_YVelocity(), theEcorePackage.getEDouble(), "yVelocity", null, 0, 1, SimulatedPositionSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulatedPositionSensor_ZVelocity(), theEcorePackage.getEDouble(), "zVelocity", null, 0, 1, SimulatedPositionSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulatedPositionSensor_UpdatePeriod(), theEcorePackage.getEDouble(), "updatePeriod", "1.0", 0, 1, SimulatedPositionSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orientationSensorEClass, OrientationSensor.class, "OrientationSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrientationSensor_OrientationCoordinates(), theSymphony__CommonGeometryData3DPackage.getCartesianOrientationCoordinates(), null, "orientationCoordinates", null, 0, 1, OrientationSensor.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		op = initEOperation(getOrientationSensor__ResetOrientation__CartesianOrientationCoordinates(), null, "resetOrientation", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSymphony__CommonGeometryData3DPackage.getCartesianOrientationCoordinates(), "newOrientation", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());

		op = initEOperation(getOrientationSensor__ExtractOrientationFromMatrix__Matrix3x3(), theSymphony__CommonGeometryData3DPackage.getCartesianOrientationCoordinates(), "extractOrientationFromMatrix", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSymphony__CommonMathPackage.getMatrix3x3(), "matrix", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(inertialMeasurementUnitEClass, InertialMeasurementUnit.class, "InertialMeasurementUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInertialMeasurementUnit_AngularVelocity(), theSymphony__CommonMathPackage.getTuple3d(), null, "angularVelocity", null, 0, 1, InertialMeasurementUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInertialMeasurementUnit_LinearAcceleration(), theSymphony__CommonMathPackage.getTuple3d(), null, "linearAcceleration", null, 0, 1, InertialMeasurementUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simulatedOrientationSensorEClass, SimulatedOrientationSensor.class, "SimulatedOrientationSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimulatedOrientationSensor_XAngularVelocity(), theEcorePackage.getEDouble(), "xAngularVelocity", null, 0, 1, SimulatedOrientationSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulatedOrientationSensor_YAngularVelocity(), theEcorePackage.getEDouble(), "yAngularVelocity", null, 0, 1, SimulatedOrientationSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulatedOrientationSensor_ZAngularVelocity(), theEcorePackage.getEDouble(), "zAngularVelocity", null, 0, 1, SimulatedOrientationSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulatedOrientationSensor_UpdatePeriod(), theEcorePackage.getEDouble(), "updatePeriod", "1.0", 0, 1, SimulatedOrientationSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(poseSensorEClass, PoseSensor.class, "PoseSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPoseSensor_Pose(), theSymphony__CommonGeometryData3DPackage.getPose(), null, "pose", null, 0, 1, PoseSensor.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPoseSensor_DataLogger(), this.getPoseDataLogger(), null, "dataLogger", null, 0, 1, PoseSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getPoseSensor__ResetPose__Pose(), null, "resetPose", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSymphony__CommonGeometryData3DPackage.getPose(), "newPose", 0, 1, !IS_UNIQUE, IS_ORDERED);
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
		addEParameter(op, theSymphony__CommonGeometryData3DPackage.getPose(), "pose", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getIOException());

		initEClass(csvDataLoggerEClass, CSVDataLogger.class, "CSVDataLogger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(poseFacadeEClass, PoseFacade.class, "PoseFacade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getPoseFacade__CreateCSVDataLogger__String(), this.getCSVDataLogger(), "createCSVDataLogger", 0, 1, !IS_UNIQUE, IS_ORDERED);
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
			 "prefix", "Symphony__AddonsSensorsPose",
			 "childCreationExtenders", "true",
			 "extensibleProviderFactory", "true",
			 "multipleEditorPages", "false",
			 "copyrightText", "Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)",
			 "modelName", "Symphony__AddonsSensorsPose",
			 "suppressGenModelAnnotations", "false",
			 "modelDirectory", "/org.eclipse.symphony.addons.sensors.pose/src-generated",
			 "editDirectory", "/org.eclipse.symphony.addons.sensors.pose.edit/src-generated",
			 "basePackage", "org.eclipse.symphony.addons.sensors"
		   });
	}

} //Symphony__AddonsSensorsPosePackageImpl
