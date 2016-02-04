package ca.gc.asc_csa.apogy.addons.sensors.pose.impl;
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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ca.gc.asc_csa.apogy.addons.sensors.pose.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyAddonsSensorsPoseFactoryImpl extends EFactoryImpl implements ApogyAddonsSensorsPoseFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ApogyAddonsSensorsPoseFactory init() {
		try {
			ApogyAddonsSensorsPoseFactory theApogyAddonsSensorsPoseFactory = (ApogyAddonsSensorsPoseFactory)EPackage.Registry.INSTANCE.getEFactory(ApogyAddonsSensorsPosePackage.eNS_URI);
			if (theApogyAddonsSensorsPoseFactory != null) {
				return theApogyAddonsSensorsPoseFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ApogyAddonsSensorsPoseFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyAddonsSensorsPoseFactoryImpl() {
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
			case ApogyAddonsSensorsPosePackage.SELF_PLACE_SENSOR: return createSelfPlaceSensor();
			case ApogyAddonsSensorsPosePackage.POSITION_SENSOR: return createPositionSensor();
			case ApogyAddonsSensorsPosePackage.SIMULATED_POSITION_SENSOR: return createSimulatedPositionSensor();
			case ApogyAddonsSensorsPosePackage.ORIENTATION_SENSOR: return createOrientationSensor();
			case ApogyAddonsSensorsPosePackage.INERTIAL_MEASUREMENT_UNIT: return createInertialMeasurementUnit();
			case ApogyAddonsSensorsPosePackage.SIMULATED_ORIENTATION_SENSOR: return createSimulatedOrientationSensor();
			case ApogyAddonsSensorsPosePackage.POSE_SENSOR: return createPoseSensor();
			case ApogyAddonsSensorsPosePackage.SIMULATED_POSE_SENSOR: return createSimulatedPoseSensor();
			case ApogyAddonsSensorsPosePackage.CSV_DATA_LOGGER: return createCSVDataLogger();
			case ApogyAddonsSensorsPosePackage.APOGY_ADDONS_SENSORS_POSE_FACADE: return createApogyAddonsSensorsPoseFacade();
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
			case ApogyAddonsSensorsPosePackage.EXCEPTION:
				return createExceptionFromString(eDataType, initialValue);
			case ApogyAddonsSensorsPosePackage.IO_EXCEPTION:
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
			case ApogyAddonsSensorsPosePackage.EXCEPTION:
				return convertExceptionToString(eDataType, instanceValue);
			case ApogyAddonsSensorsPosePackage.IO_EXCEPTION:
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
	public ApogyAddonsSensorsPoseFacade createApogyAddonsSensorsPoseFacade() {
		ApogyAddonsSensorsPoseFacadeImpl apogyAddonsSensorsPoseFacade = new ApogyAddonsSensorsPoseFacadeImpl();
		return apogyAddonsSensorsPoseFacade;
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
	public ApogyAddonsSensorsPosePackage getApogyAddonsSensorsPosePackage() {
		return (ApogyAddonsSensorsPosePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ApogyAddonsSensorsPosePackage getPackage() {
		return ApogyAddonsSensorsPosePackage.eINSTANCE;
	}

} //ApogyAddonsSensorsPoseFactoryImpl
