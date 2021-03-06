package ca.gc.asc_csa.apogy.addons.sensors.pose.util;
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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import ca.gc.asc_csa.apogy.addons.sensors.Sensor;

import ca.gc.asc_csa.apogy.addons.sensors.pose.*;

import ca.gc.asc_csa.apogy.common.topology.AggregateGroupNode;
import ca.gc.asc_csa.apogy.common.topology.GroupNode;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.PositionNode;
import ca.gc.asc_csa.apogy.common.topology.RotationNode;
import ca.gc.asc_csa.apogy.common.topology.TransformNode;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.apogy.addons.sensors.pose.ApogyAddonsSensorsPosePackage
 * @generated
 */
public class ApogyAddonsSensorsPoseSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ApogyAddonsSensorsPosePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyAddonsSensorsPoseSwitch() {
		if (modelPackage == null) {
			modelPackage = ApogyAddonsSensorsPosePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ApogyAddonsSensorsPosePackage.SELF_PLACE_SENSOR: {
				SelfPlaceSensor selfPlaceSensor = (SelfPlaceSensor)theEObject;
				T result = caseSelfPlaceSensor(selfPlaceSensor);
				if (result == null) result = caseSensor(selfPlaceSensor);
				if (result == null) result = caseAggregateGroupNode(selfPlaceSensor);
				if (result == null) result = caseGroupNode(selfPlaceSensor);
				if (result == null) result = caseNode(selfPlaceSensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyAddonsSensorsPosePackage.POSITION_SENSOR: {
				PositionSensor positionSensor = (PositionSensor)theEObject;
				T result = casePositionSensor(positionSensor);
				if (result == null) result = casePositionNode(positionSensor);
				if (result == null) result = caseSelfPlaceSensor(positionSensor);
				if (result == null) result = caseSensor(positionSensor);
				if (result == null) result = caseAggregateGroupNode(positionSensor);
				if (result == null) result = caseGroupNode(positionSensor);
				if (result == null) result = caseNode(positionSensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyAddonsSensorsPosePackage.SIMULATED_POSITION_SENSOR: {
				SimulatedPositionSensor simulatedPositionSensor = (SimulatedPositionSensor)theEObject;
				T result = caseSimulatedPositionSensor(simulatedPositionSensor);
				if (result == null) result = casePositionSensor(simulatedPositionSensor);
				if (result == null) result = casePositionNode(simulatedPositionSensor);
				if (result == null) result = caseSelfPlaceSensor(simulatedPositionSensor);
				if (result == null) result = caseSensor(simulatedPositionSensor);
				if (result == null) result = caseAggregateGroupNode(simulatedPositionSensor);
				if (result == null) result = caseGroupNode(simulatedPositionSensor);
				if (result == null) result = caseNode(simulatedPositionSensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyAddonsSensorsPosePackage.ORIENTATION_SENSOR: {
				OrientationSensor orientationSensor = (OrientationSensor)theEObject;
				T result = caseOrientationSensor(orientationSensor);
				if (result == null) result = caseRotationNode(orientationSensor);
				if (result == null) result = caseSelfPlaceSensor(orientationSensor);
				if (result == null) result = caseSensor(orientationSensor);
				if (result == null) result = caseAggregateGroupNode(orientationSensor);
				if (result == null) result = caseGroupNode(orientationSensor);
				if (result == null) result = caseNode(orientationSensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyAddonsSensorsPosePackage.INERTIAL_MEASUREMENT_UNIT: {
				InertialMeasurementUnit inertialMeasurementUnit = (InertialMeasurementUnit)theEObject;
				T result = caseInertialMeasurementUnit(inertialMeasurementUnit);
				if (result == null) result = caseOrientationSensor(inertialMeasurementUnit);
				if (result == null) result = caseRotationNode(inertialMeasurementUnit);
				if (result == null) result = caseSelfPlaceSensor(inertialMeasurementUnit);
				if (result == null) result = caseSensor(inertialMeasurementUnit);
				if (result == null) result = caseAggregateGroupNode(inertialMeasurementUnit);
				if (result == null) result = caseGroupNode(inertialMeasurementUnit);
				if (result == null) result = caseNode(inertialMeasurementUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyAddonsSensorsPosePackage.SIMULATED_ORIENTATION_SENSOR: {
				SimulatedOrientationSensor simulatedOrientationSensor = (SimulatedOrientationSensor)theEObject;
				T result = caseSimulatedOrientationSensor(simulatedOrientationSensor);
				if (result == null) result = caseOrientationSensor(simulatedOrientationSensor);
				if (result == null) result = caseRotationNode(simulatedOrientationSensor);
				if (result == null) result = caseSelfPlaceSensor(simulatedOrientationSensor);
				if (result == null) result = caseSensor(simulatedOrientationSensor);
				if (result == null) result = caseAggregateGroupNode(simulatedOrientationSensor);
				if (result == null) result = caseGroupNode(simulatedOrientationSensor);
				if (result == null) result = caseNode(simulatedOrientationSensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyAddonsSensorsPosePackage.POSE_SENSOR: {
				PoseSensor poseSensor = (PoseSensor)theEObject;
				T result = casePoseSensor(poseSensor);
				if (result == null) result = caseTransformNode(poseSensor);
				if (result == null) result = casePositionSensor(poseSensor);
				if (result == null) result = caseOrientationSensor(poseSensor);
				if (result == null) result = casePositionNode(poseSensor);
				if (result == null) result = caseRotationNode(poseSensor);
				if (result == null) result = caseSelfPlaceSensor(poseSensor);
				if (result == null) result = caseSensor(poseSensor);
				if (result == null) result = caseAggregateGroupNode(poseSensor);
				if (result == null) result = caseGroupNode(poseSensor);
				if (result == null) result = caseNode(poseSensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyAddonsSensorsPosePackage.SIMULATED_POSE_SENSOR: {
				SimulatedPoseSensor simulatedPoseSensor = (SimulatedPoseSensor)theEObject;
				T result = caseSimulatedPoseSensor(simulatedPoseSensor);
				if (result == null) result = casePoseSensor(simulatedPoseSensor);
				if (result == null) result = caseTransformNode(simulatedPoseSensor);
				if (result == null) result = casePositionSensor(simulatedPoseSensor);
				if (result == null) result = caseOrientationSensor(simulatedPoseSensor);
				if (result == null) result = casePositionNode(simulatedPoseSensor);
				if (result == null) result = caseRotationNode(simulatedPoseSensor);
				if (result == null) result = caseSelfPlaceSensor(simulatedPoseSensor);
				if (result == null) result = caseSensor(simulatedPoseSensor);
				if (result == null) result = caseAggregateGroupNode(simulatedPoseSensor);
				if (result == null) result = caseGroupNode(simulatedPoseSensor);
				if (result == null) result = caseNode(simulatedPoseSensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyAddonsSensorsPosePackage.POSE_DATA_LOGGER: {
				PoseDataLogger poseDataLogger = (PoseDataLogger)theEObject;
				T result = casePoseDataLogger(poseDataLogger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyAddonsSensorsPosePackage.CSV_DATA_LOGGER: {
				CSVDataLogger csvDataLogger = (CSVDataLogger)theEObject;
				T result = caseCSVDataLogger(csvDataLogger);
				if (result == null) result = casePoseDataLogger(csvDataLogger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyAddonsSensorsPosePackage.APOGY_ADDONS_SENSORS_POSE_FACADE: {
				ApogyAddonsSensorsPoseFacade apogyAddonsSensorsPoseFacade = (ApogyAddonsSensorsPoseFacade)theEObject;
				T result = caseApogyAddonsSensorsPoseFacade(apogyAddonsSensorsPoseFacade);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Self Place Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Self Place Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelfPlaceSensor(SelfPlaceSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Position Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Position Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePositionSensor(PositionSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simulated Position Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simulated Position Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimulatedPositionSensor(SimulatedPositionSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Orientation Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Orientation Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrientationSensor(OrientationSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inertial Measurement Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inertial Measurement Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInertialMeasurementUnit(InertialMeasurementUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simulated Orientation Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simulated Orientation Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimulatedOrientationSensor(SimulatedOrientationSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pose Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pose Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePoseSensor(PoseSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simulated Pose Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simulated Pose Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimulatedPoseSensor(SimulatedPoseSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pose Data Logger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pose Data Logger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePoseDataLogger(PoseDataLogger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CSV Data Logger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CSV Data Logger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCSVDataLogger(CSVDataLogger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Facade</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Facade</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApogyAddonsSensorsPoseFacade(ApogyAddonsSensorsPoseFacade object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroupNode(GroupNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aggregate Group Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aggregate Group Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAggregateGroupNode(AggregateGroupNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSensor(Sensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Position Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Position Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePositionNode(PositionNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rotation Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rotation Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRotationNode(RotationNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transform Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transform Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransformNode(TransformNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ApogyAddonsSensorsPoseSwitch
