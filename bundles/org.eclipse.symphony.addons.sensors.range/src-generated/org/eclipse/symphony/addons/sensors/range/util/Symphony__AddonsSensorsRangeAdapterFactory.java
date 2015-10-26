/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.addons.sensors.range.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.symphony.addons.sensors.Sensor;
import org.eclipse.symphony.addons.sensors.fov.FieldOfView;
import org.eclipse.symphony.addons.sensors.fov.RectangularFrustrumFieldOfView;
import org.eclipse.symphony.addons.sensors.range.*;
import org.eclipse.symphony.common.emf.Timed;
import org.eclipse.symphony.common.processors.Monitorable;
import org.eclipse.symphony.common.processors.Processor;
import org.eclipse.symphony.common.topology.AggregateGroupNode;
import org.eclipse.symphony.common.topology.GroupNode;
import org.eclipse.symphony.common.topology.Node;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.symphony.addons.sensors.range.Symphony__AddonsSensorsRangePackage
 * @generated
 */
public class Symphony__AddonsSensorsRangeAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Symphony__AddonsSensorsRangePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__AddonsSensorsRangeAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Symphony__AddonsSensorsRangePackage.eINSTANCE;
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
	protected Symphony__AddonsSensorsRangeSwitch<Adapter> modelSwitch =
		new Symphony__AddonsSensorsRangeSwitch<Adapter>() {
			@Override
			public Adapter caseRayData(RayData object) {
				return createRayDataAdapter();
			}
			@Override
			public Adapter caseRasterScanSettings(RasterScanSettings object) {
				return createRasterScanSettingsAdapter();
			}
			@Override
			public Adapter caseRangeSensor(RangeSensor object) {
				return createRangeSensorAdapter();
			}
			@Override
			public Adapter caseContactSensor(ContactSensor object) {
				return createContactSensorAdapter();
			}
			@Override
			public Adapter caseSimpleRangeSensor(SimpleRangeSensor object) {
				return createSimpleRangeSensorAdapter();
			}
			@Override
			public Adapter caseSimpleSonar(SimpleSonar object) {
				return createSimpleSonarAdapter();
			}
			@Override
			public Adapter caseLineRangeScanner(LineRangeScanner object) {
				return createLineRangeScannerAdapter();
			}
			@Override
			public Adapter caseSimpleLineRangeScanner(SimpleLineRangeScanner object) {
				return createSimpleLineRangeScannerAdapter();
			}
			@Override
			public <InputType> Adapter caseRangeScanner(RangeScanner<InputType> object) {
				return createRangeScannerAdapter();
			}
			@Override
			public <InputType> Adapter caseRangeScannerSimulator(RangeScannerSimulator<InputType> object) {
				return createRangeScannerSimulatorAdapter();
			}
			@Override
			public Adapter caseRasterScanRangeSensor(RasterScanRangeSensor object) {
				return createRasterScanRangeSensorAdapter();
			}
			@Override
			public Adapter caseSimpleRasterScanRangeScanner(SimpleRasterScanRangeScanner object) {
				return createSimpleRasterScanRangeScannerAdapter();
			}
			@Override
			public Adapter caseSimpleRasterScanRangeScannerSimulator(SimpleRasterScanRangeScannerSimulator object) {
				return createSimpleRasterScanRangeScannerSimulatorAdapter();
			}
			@Override
			public Adapter caseRasterScanData(RasterScanData object) {
				return createRasterScanDataAdapter();
			}
			@Override
			public Adapter caseSensorsRangeFacade(SensorsRangeFacade object) {
				return createSensorsRangeFacadeAdapter();
			}
			@Override
			public Adapter caseNode(Node object) {
				return createNodeAdapter();
			}
			@Override
			public Adapter caseFieldOfView(FieldOfView object) {
				return createFieldOfViewAdapter();
			}
			@Override
			public Adapter caseRectangularFrustrumFieldOfView(RectangularFrustrumFieldOfView object) {
				return createRectangularFrustrumFieldOfViewAdapter();
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
			public Adapter caseMonitorable(Monitorable object) {
				return createMonitorableAdapter();
			}
			@Override
			public <I, O> Adapter caseProcessor(Processor<I, O> object) {
				return createProcessorAdapter();
			}
			@Override
			public Adapter caseTimed(Timed object) {
				return createTimedAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.sensors.range.RayData <em>Ray Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.sensors.range.RayData
	 * @generated
	 */
	public Adapter createRayDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.sensors.range.RasterScanSettings <em>Raster Scan Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.sensors.range.RasterScanSettings
	 * @generated
	 */
	public Adapter createRasterScanSettingsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.sensors.range.RangeSensor <em>Range Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.sensors.range.RangeSensor
	 * @generated
	 */
	public Adapter createRangeSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.sensors.range.ContactSensor <em>Contact Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.sensors.range.ContactSensor
	 * @generated
	 */
	public Adapter createContactSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.sensors.range.SimpleRangeSensor <em>Simple Range Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.sensors.range.SimpleRangeSensor
	 * @generated
	 */
	public Adapter createSimpleRangeSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.sensors.range.SimpleSonar <em>Simple Sonar</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.sensors.range.SimpleSonar
	 * @generated
	 */
	public Adapter createSimpleSonarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.sensors.range.LineRangeScanner <em>Line Range Scanner</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.sensors.range.LineRangeScanner
	 * @generated
	 */
	public Adapter createLineRangeScannerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.sensors.range.SimpleLineRangeScanner <em>Simple Line Range Scanner</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.sensors.range.SimpleLineRangeScanner
	 * @generated
	 */
	public Adapter createSimpleLineRangeScannerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.sensors.range.RangeScanner <em>Range Scanner</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.sensors.range.RangeScanner
	 * @generated
	 */
	public Adapter createRangeScannerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.sensors.range.RangeScannerSimulator <em>Range Scanner Simulator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.sensors.range.RangeScannerSimulator
	 * @generated
	 */
	public Adapter createRangeScannerSimulatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.sensors.range.RasterScanRangeSensor <em>Raster Scan Range Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.sensors.range.RasterScanRangeSensor
	 * @generated
	 */
	public Adapter createRasterScanRangeSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.sensors.range.SimpleRasterScanRangeScanner <em>Simple Raster Scan Range Scanner</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.sensors.range.SimpleRasterScanRangeScanner
	 * @generated
	 */
	public Adapter createSimpleRasterScanRangeScannerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.sensors.range.SimpleRasterScanRangeScannerSimulator <em>Simple Raster Scan Range Scanner Simulator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.sensors.range.SimpleRasterScanRangeScannerSimulator
	 * @generated
	 */
	public Adapter createSimpleRasterScanRangeScannerSimulatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.sensors.range.RasterScanData <em>Raster Scan Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.sensors.range.RasterScanData
	 * @generated
	 */
	public Adapter createRasterScanDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.sensors.range.SensorsRangeFacade <em>Sensors Range Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.sensors.range.SensorsRangeFacade
	 * @generated
	 */
	public Adapter createSensorsRangeFacadeAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.sensors.fov.FieldOfView <em>Field Of View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.sensors.fov.FieldOfView
	 * @generated
	 */
	public Adapter createFieldOfViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.sensors.fov.RectangularFrustrumFieldOfView <em>Rectangular Frustrum Field Of View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.sensors.fov.RectangularFrustrumFieldOfView
	 * @generated
	 */
	public Adapter createRectangularFrustrumFieldOfViewAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.common.processors.Monitorable <em>Monitorable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.common.processors.Monitorable
	 * @generated
	 */
	public Adapter createMonitorableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.common.processors.Processor <em>Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.common.processors.Processor
	 * @generated
	 */
	public Adapter createProcessorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.common.emf.Timed <em>Timed</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.common.emf.Timed
	 * @generated
	 */
	public Adapter createTimedAdapter() {
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

} //Symphony__AddonsSensorsRangeAdapterFactory
