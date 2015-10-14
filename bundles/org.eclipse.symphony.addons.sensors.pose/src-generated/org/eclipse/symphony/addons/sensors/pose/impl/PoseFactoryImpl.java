/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.addons.sensors.pose.impl;

import java.io.IOException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.symphony.addons.sensors.pose.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PoseFactoryImpl extends EFactoryImpl implements PoseFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PoseFactory init() {
		try {
			PoseFactory thePoseFactory = (PoseFactory)EPackage.Registry.INSTANCE.getEFactory(PosePackage.eNS_URI);
			if (thePoseFactory != null) {
				return thePoseFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PoseFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PoseFactoryImpl() {
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
			case PosePackage.SELF_PLACE_SENSOR: return createSelfPlaceSensor();
			case PosePackage.POSITION_SENSOR: return createPositionSensor();
			case PosePackage.SIMULATED_POSITION_SENSOR: return createSimulatedPositionSensor();
			case PosePackage.ORIENTATION_SENSOR: return createOrientationSensor();
			case PosePackage.INERTIAL_MEASUREMENT_UNIT: return createInertialMeasurementUnit();
			case PosePackage.SIMULATED_ORIENTATION_SENSOR: return createSimulatedOrientationSensor();
			case PosePackage.POSE_SENSOR: return createPoseSensor();
			case PosePackage.SIMULATED_POSE_SENSOR: return createSimulatedPoseSensor();
			case PosePackage.CSV_DATA_LOGGER: return createCSVDataLogger();
			case PosePackage.POSE_FACADE: return createPoseFacade();
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
			case PosePackage.EXCEPTION:
				return createExceptionFromString(eDataType, initialValue);
			case PosePackage.IO_EXCEPTION:
				return createIOExceptionFromString(eDataType, initialValue);
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
			case PosePackage.EXCEPTION:
				return convertExceptionToString(eDataType, instanceValue);
			case PosePackage.IO_EXCEPTION:
				return convertIOExceptionToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelfPlaceSensor createSelfPlaceSensor() {
		SelfPlaceSensorImpl selfPlaceSensor = new SelfPlaceSensorImpl();
		return selfPlaceSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionSensor createPositionSensor() {
		PositionSensorImpl positionSensor = new PositionSensorImpl();
		return positionSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimulatedPositionSensor createSimulatedPositionSensor() {
		SimulatedPositionSensorImpl simulatedPositionSensor = new SimulatedPositionSensorImpl();
		return simulatedPositionSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrientationSensor createOrientationSensor() {
		OrientationSensorImpl orientationSensor = new OrientationSensorImpl();
		return orientationSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InertialMeasurementUnit createInertialMeasurementUnit() {
		InertialMeasurementUnitImpl inertialMeasurementUnit = new InertialMeasurementUnitImpl();
		return inertialMeasurementUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimulatedOrientationSensor createSimulatedOrientationSensor() {
		SimulatedOrientationSensorImpl simulatedOrientationSensor = new SimulatedOrientationSensorImpl();
		return simulatedOrientationSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PoseSensor createPoseSensor() {
		PoseSensorImpl poseSensor = new PoseSensorImpl();
		return poseSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimulatedPoseSensor createSimulatedPoseSensor() {
		SimulatedPoseSensorImpl simulatedPoseSensor = new SimulatedPoseSensorImpl();
		return simulatedPoseSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSVDataLogger createCSVDataLogger() {
		CSVDataLoggerImpl csvDataLogger = new CSVDataLoggerImpl();
		return csvDataLogger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PoseFacade createPoseFacade() {
		PoseFacadeImpl poseFacade = new PoseFacadeImpl();
		return poseFacade;
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
	public PosePackage getPosePackage() {
		return (PosePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PosePackage getPackage() {
		return PosePackage.eINSTANCE;
	}

} //PoseFactoryImpl
