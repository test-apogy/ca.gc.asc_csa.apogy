/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.addons.sensors.pose.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.symphony.addons.sensors.Sensor;

import org.eclipse.symphony.addons.sensors.pose.*;

import org.eclipse.symphony.common.topology.AggregateGroupNode;
import org.eclipse.symphony.common.topology.GroupNode;
import org.eclipse.symphony.common.topology.Node;
import org.eclipse.symphony.common.topology.PositionNode;
import org.eclipse.symphony.common.topology.RotationNode;
import org.eclipse.symphony.common.topology.TransformNode;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.symphony.addons.sensors.pose.PosePackage
 * @generated
 */
public class PoseAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PosePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PoseAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PosePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PoseSwitch<Adapter> modelSwitch =
		new PoseSwitch<Adapter>() {
			@Override
			public Adapter caseSelfPlaceSensor(SelfPlaceSensor object) {
				return createSelfPlaceSensorAdapter();
			}
			@Override
			public Adapter casePositionSensor(PositionSensor object) {
				return createPositionSensorAdapter();
			}
			@Override
			public Adapter caseSimulatedPositionSensor(SimulatedPositionSensor object) {
				return createSimulatedPositionSensorAdapter();
			}
			@Override
			public Adapter caseOrientationSensor(OrientationSensor object) {
				return createOrientationSensorAdapter();
			}
			@Override
			public Adapter caseInertialMeasurementUnit(InertialMeasurementUnit object) {
				return createInertialMeasurementUnitAdapter();
			}
			@Override
			public Adapter caseSimulatedOrientationSensor(SimulatedOrientationSensor object) {
				return createSimulatedOrientationSensorAdapter();
			}
			@Override
			public Adapter casePoseSensor(PoseSensor object) {
				return createPoseSensorAdapter();
			}
			@Override
			public Adapter caseSimulatedPoseSensor(SimulatedPoseSensor object) {
				return createSimulatedPoseSensorAdapter();
			}
			@Override
			public Adapter casePoseDataLogger(PoseDataLogger object) {
				return createPoseDataLoggerAdapter();
			}
			@Override
			public Adapter caseCSVDataLogger(CSVDataLogger object) {
				return createCSVDataLoggerAdapter();
			}
			@Override
			public Adapter casePoseFacade(PoseFacade object) {
				return createPoseFacadeAdapter();
			}
			@Override
			public Adapter caseNode(Node object) {
				return createNodeAdapter();
			}
			@Override
			public Adapter caseGroupNode(GroupNode object) {
				return createGroupNodeAdapter();
			}
			@Override
			public Adapter caseAggregateGroupNode(AggregateGroupNode object) {
				return createAggregateGroupNodeAdapter();
			}
			@Override
			public Adapter caseSensor(Sensor object) {
				return createSensorAdapter();
			}
			@Override
			public Adapter casePositionNode(PositionNode object) {
				return createPositionNodeAdapter();
			}
			@Override
			public Adapter caseRotationNode(RotationNode object) {
				return createRotationNodeAdapter();
			}
			@Override
			public Adapter caseTransformNode(TransformNode object) {
				return createTransformNodeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.sensors.pose.SelfPlaceSensor <em>Self Place Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.sensors.pose.SelfPlaceSensor
	 * @generated
	 */
	public Adapter createSelfPlaceSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.sensors.pose.PositionSensor <em>Position Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.sensors.pose.PositionSensor
	 * @generated
	 */
	public Adapter createPositionSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.sensors.pose.SimulatedPositionSensor <em>Simulated Position Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.sensors.pose.SimulatedPositionSensor
	 * @generated
	 */
	public Adapter createSimulatedPositionSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.sensors.pose.OrientationSensor <em>Orientation Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.sensors.pose.OrientationSensor
	 * @generated
	 */
	public Adapter createOrientationSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.sensors.pose.InertialMeasurementUnit <em>Inertial Measurement Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.sensors.pose.InertialMeasurementUnit
	 * @generated
	 */
	public Adapter createInertialMeasurementUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.sensors.pose.SimulatedOrientationSensor <em>Simulated Orientation Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.sensors.pose.SimulatedOrientationSensor
	 * @generated
	 */
	public Adapter createSimulatedOrientationSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.sensors.pose.PoseSensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.sensors.pose.PoseSensor
	 * @generated
	 */
	public Adapter createPoseSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.sensors.pose.SimulatedPoseSensor <em>Simulated Pose Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.sensors.pose.SimulatedPoseSensor
	 * @generated
	 */
	public Adapter createSimulatedPoseSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.sensors.pose.PoseDataLogger <em>Data Logger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.sensors.pose.PoseDataLogger
	 * @generated
	 */
	public Adapter createPoseDataLoggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.sensors.pose.CSVDataLogger <em>CSV Data Logger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.sensors.pose.CSVDataLogger
	 * @generated
	 */
	public Adapter createCSVDataLoggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.sensors.pose.PoseFacade <em>Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.sensors.pose.PoseFacade
	 * @generated
	 */
	public Adapter createPoseFacadeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.common.topology.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.common.topology.Node
	 * @generated
	 */
	public Adapter createNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.common.topology.GroupNode <em>Group Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.common.topology.GroupNode
	 * @generated
	 */
	public Adapter createGroupNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.common.topology.AggregateGroupNode <em>Aggregate Group Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.common.topology.AggregateGroupNode
	 * @generated
	 */
	public Adapter createAggregateGroupNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.sensors.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.sensors.Sensor
	 * @generated
	 */
	public Adapter createSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.common.topology.PositionNode <em>Position Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.common.topology.PositionNode
	 * @generated
	 */
	public Adapter createPositionNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.common.topology.RotationNode <em>Rotation Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.common.topology.RotationNode
	 * @generated
	 */
	public Adapter createRotationNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.common.topology.TransformNode <em>Transform Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.common.topology.TransformNode
	 * @generated
	 */
	public Adapter createTransformNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //PoseAdapterFactory
