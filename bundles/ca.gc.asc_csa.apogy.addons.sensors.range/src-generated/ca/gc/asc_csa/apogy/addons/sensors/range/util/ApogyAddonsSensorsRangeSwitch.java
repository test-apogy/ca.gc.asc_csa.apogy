/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.addons.sensors.range.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import ca.gc.asc_csa.apogy.addons.sensors.Sensor;
import ca.gc.asc_csa.apogy.addons.sensors.fov.FieldOfView;
import ca.gc.asc_csa.apogy.addons.sensors.fov.RectangularFrustrumFieldOfView;
import ca.gc.asc_csa.apogy.addons.sensors.range.*;
import ca.gc.asc_csa.apogy.common.emf.Timed;
import ca.gc.asc_csa.apogy.common.processors.Monitorable;
import ca.gc.asc_csa.apogy.common.processors.Processor;
import ca.gc.asc_csa.apogy.common.topology.AggregateGroupNode;
import ca.gc.asc_csa.apogy.common.topology.GroupNode;
import ca.gc.asc_csa.apogy.common.topology.Node;

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
 * @see ca.gc.asc_csa.apogy.addons.sensors.range.ApogyAddonsSensorsRangePackage
 * @generated
 */
public class ApogyAddonsSensorsRangeSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ApogyAddonsSensorsRangePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyAddonsSensorsRangeSwitch() {
		if (modelPackage == null) {
			modelPackage = ApogyAddonsSensorsRangePackage.eINSTANCE;
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
			case ApogyAddonsSensorsRangePackage.RAY_DATA: {
				RayData rayData = (RayData)theEObject;
				T result = caseRayData(rayData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyAddonsSensorsRangePackage.RASTER_SCAN_SETTINGS: {
				RasterScanSettings rasterScanSettings = (RasterScanSettings)theEObject;
				T result = caseRasterScanSettings(rasterScanSettings);
				if (result == null) result = caseRectangularFrustrumFieldOfView(rasterScanSettings);
				if (result == null) result = caseFieldOfView(rasterScanSettings);
				if (result == null) result = caseNode(rasterScanSettings);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyAddonsSensorsRangePackage.RANGE_SENSOR: {
				RangeSensor rangeSensor = (RangeSensor)theEObject;
				T result = caseRangeSensor(rangeSensor);
				if (result == null) result = caseSensor(rangeSensor);
				if (result == null) result = caseAggregateGroupNode(rangeSensor);
				if (result == null) result = caseGroupNode(rangeSensor);
				if (result == null) result = caseNode(rangeSensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyAddonsSensorsRangePackage.CONTACT_SENSOR: {
				ContactSensor contactSensor = (ContactSensor)theEObject;
				T result = caseContactSensor(contactSensor);
				if (result == null) result = caseRangeSensor(contactSensor);
				if (result == null) result = caseSensor(contactSensor);
				if (result == null) result = caseAggregateGroupNode(contactSensor);
				if (result == null) result = caseGroupNode(contactSensor);
				if (result == null) result = caseNode(contactSensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyAddonsSensorsRangePackage.SIMPLE_RANGE_SENSOR: {
				SimpleRangeSensor simpleRangeSensor = (SimpleRangeSensor)theEObject;
				T result = caseSimpleRangeSensor(simpleRangeSensor);
				if (result == null) result = caseRangeSensor(simpleRangeSensor);
				if (result == null) result = caseSensor(simpleRangeSensor);
				if (result == null) result = caseAggregateGroupNode(simpleRangeSensor);
				if (result == null) result = caseGroupNode(simpleRangeSensor);
				if (result == null) result = caseNode(simpleRangeSensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyAddonsSensorsRangePackage.SIMPLE_SONAR: {
				SimpleSonar simpleSonar = (SimpleSonar)theEObject;
				T result = caseSimpleSonar(simpleSonar);
				if (result == null) result = caseSimpleRangeSensor(simpleSonar);
				if (result == null) result = caseRangeSensor(simpleSonar);
				if (result == null) result = caseSensor(simpleSonar);
				if (result == null) result = caseAggregateGroupNode(simpleSonar);
				if (result == null) result = caseGroupNode(simpleSonar);
				if (result == null) result = caseNode(simpleSonar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyAddonsSensorsRangePackage.LINE_RANGE_SCANNER: {
				LineRangeScanner lineRangeScanner = (LineRangeScanner)theEObject;
				T result = caseLineRangeScanner(lineRangeScanner);
				if (result == null) result = caseRangeSensor(lineRangeScanner);
				if (result == null) result = caseSensor(lineRangeScanner);
				if (result == null) result = caseAggregateGroupNode(lineRangeScanner);
				if (result == null) result = caseGroupNode(lineRangeScanner);
				if (result == null) result = caseNode(lineRangeScanner);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyAddonsSensorsRangePackage.SIMPLE_LINE_RANGE_SCANNER: {
				SimpleLineRangeScanner simpleLineRangeScanner = (SimpleLineRangeScanner)theEObject;
				T result = caseSimpleLineRangeScanner(simpleLineRangeScanner);
				if (result == null) result = caseLineRangeScanner(simpleLineRangeScanner);
				if (result == null) result = caseRangeSensor(simpleLineRangeScanner);
				if (result == null) result = caseSensor(simpleLineRangeScanner);
				if (result == null) result = caseAggregateGroupNode(simpleLineRangeScanner);
				if (result == null) result = caseGroupNode(simpleLineRangeScanner);
				if (result == null) result = caseNode(simpleLineRangeScanner);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyAddonsSensorsRangePackage.RANGE_SCANNER: {
				RangeScanner<?> rangeScanner = (RangeScanner<?>)theEObject;
				T result = caseRangeScanner(rangeScanner);
				if (result == null) result = caseRangeSensor(rangeScanner);
				if (result == null) result = caseProcessor(rangeScanner);
				if (result == null) result = caseSensor(rangeScanner);
				if (result == null) result = caseMonitorable(rangeScanner);
				if (result == null) result = caseAggregateGroupNode(rangeScanner);
				if (result == null) result = caseGroupNode(rangeScanner);
				if (result == null) result = caseNode(rangeScanner);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyAddonsSensorsRangePackage.RANGE_SCANNER_SIMULATOR: {
				RangeScannerSimulator<?> rangeScannerSimulator = (RangeScannerSimulator<?>)theEObject;
				T result = caseRangeScannerSimulator(rangeScannerSimulator);
				if (result == null) result = caseRangeScanner(rangeScannerSimulator);
				if (result == null) result = caseRangeSensor(rangeScannerSimulator);
				if (result == null) result = caseProcessor(rangeScannerSimulator);
				if (result == null) result = caseSensor(rangeScannerSimulator);
				if (result == null) result = caseMonitorable(rangeScannerSimulator);
				if (result == null) result = caseAggregateGroupNode(rangeScannerSimulator);
				if (result == null) result = caseGroupNode(rangeScannerSimulator);
				if (result == null) result = caseNode(rangeScannerSimulator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyAddonsSensorsRangePackage.RASTER_SCAN_RANGE_SENSOR: {
				RasterScanRangeSensor rasterScanRangeSensor = (RasterScanRangeSensor)theEObject;
				T result = caseRasterScanRangeSensor(rasterScanRangeSensor);
				if (result == null) result = caseRangeScanner(rasterScanRangeSensor);
				if (result == null) result = caseRangeSensor(rasterScanRangeSensor);
				if (result == null) result = caseProcessor(rasterScanRangeSensor);
				if (result == null) result = caseSensor(rasterScanRangeSensor);
				if (result == null) result = caseMonitorable(rasterScanRangeSensor);
				if (result == null) result = caseAggregateGroupNode(rasterScanRangeSensor);
				if (result == null) result = caseGroupNode(rasterScanRangeSensor);
				if (result == null) result = caseNode(rasterScanRangeSensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyAddonsSensorsRangePackage.SIMPLE_RASTER_SCAN_RANGE_SCANNER: {
				SimpleRasterScanRangeScanner simpleRasterScanRangeScanner = (SimpleRasterScanRangeScanner)theEObject;
				T result = caseSimpleRasterScanRangeScanner(simpleRasterScanRangeScanner);
				if (result == null) result = caseRasterScanRangeSensor(simpleRasterScanRangeScanner);
				if (result == null) result = caseRangeScanner(simpleRasterScanRangeScanner);
				if (result == null) result = caseRangeSensor(simpleRasterScanRangeScanner);
				if (result == null) result = caseProcessor(simpleRasterScanRangeScanner);
				if (result == null) result = caseSensor(simpleRasterScanRangeScanner);
				if (result == null) result = caseMonitorable(simpleRasterScanRangeScanner);
				if (result == null) result = caseAggregateGroupNode(simpleRasterScanRangeScanner);
				if (result == null) result = caseGroupNode(simpleRasterScanRangeScanner);
				if (result == null) result = caseNode(simpleRasterScanRangeScanner);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyAddonsSensorsRangePackage.SIMPLE_RASTER_SCAN_RANGE_SCANNER_SIMULATOR: {
				SimpleRasterScanRangeScannerSimulator simpleRasterScanRangeScannerSimulator = (SimpleRasterScanRangeScannerSimulator)theEObject;
				T result = caseSimpleRasterScanRangeScannerSimulator(simpleRasterScanRangeScannerSimulator);
				if (result == null) result = caseRangeScannerSimulator(simpleRasterScanRangeScannerSimulator);
				if (result == null) result = caseSimpleRasterScanRangeScanner(simpleRasterScanRangeScannerSimulator);
				if (result == null) result = caseRasterScanRangeSensor(simpleRasterScanRangeScannerSimulator);
				if (result == null) result = caseRangeScanner(simpleRasterScanRangeScannerSimulator);
				if (result == null) result = caseRangeSensor(simpleRasterScanRangeScannerSimulator);
				if (result == null) result = caseProcessor(simpleRasterScanRangeScannerSimulator);
				if (result == null) result = caseSensor(simpleRasterScanRangeScannerSimulator);
				if (result == null) result = caseMonitorable(simpleRasterScanRangeScannerSimulator);
				if (result == null) result = caseAggregateGroupNode(simpleRasterScanRangeScannerSimulator);
				if (result == null) result = caseGroupNode(simpleRasterScanRangeScannerSimulator);
				if (result == null) result = caseNode(simpleRasterScanRangeScannerSimulator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyAddonsSensorsRangePackage.RASTER_SCAN_DATA: {
				RasterScanData rasterScanData = (RasterScanData)theEObject;
				T result = caseRasterScanData(rasterScanData);
				if (result == null) result = caseAggregateGroupNode(rasterScanData);
				if (result == null) result = caseTimed(rasterScanData);
				if (result == null) result = caseGroupNode(rasterScanData);
				if (result == null) result = caseNode(rasterScanData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyAddonsSensorsRangePackage.APOGY_ADDONS_SENSORS_RANGE_FACADE: {
				ApogyAddonsSensorsRangeFacade apogyAddonsSensorsRangeFacade = (ApogyAddonsSensorsRangeFacade)theEObject;
				T result = caseApogyAddonsSensorsRangeFacade(apogyAddonsSensorsRangeFacade);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ray Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ray Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRayData(RayData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Raster Scan Settings</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Raster Scan Settings</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRasterScanSettings(RasterScanSettings object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Range Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Range Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRangeSensor(RangeSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contact Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contact Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContactSensor(ContactSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Range Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Range Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleRangeSensor(SimpleRangeSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Sonar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Sonar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleSonar(SimpleSonar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Line Range Scanner</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line Range Scanner</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLineRangeScanner(LineRangeScanner object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Line Range Scanner</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Line Range Scanner</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleLineRangeScanner(SimpleLineRangeScanner object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Range Scanner</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Range Scanner</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <InputType> T caseRangeScanner(RangeScanner<InputType> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Range Scanner Simulator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Range Scanner Simulator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <InputType> T caseRangeScannerSimulator(RangeScannerSimulator<InputType> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Raster Scan Range Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Raster Scan Range Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRasterScanRangeSensor(RasterScanRangeSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Raster Scan Range Scanner</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Raster Scan Range Scanner</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleRasterScanRangeScanner(SimpleRasterScanRangeScanner object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Raster Scan Range Scanner Simulator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Raster Scan Range Scanner Simulator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleRasterScanRangeScannerSimulator(SimpleRasterScanRangeScannerSimulator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Raster Scan Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Raster Scan Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRasterScanData(RasterScanData object) {
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
	public T caseApogyAddonsSensorsRangeFacade(ApogyAddonsSensorsRangeFacade object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Field Of View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field Of View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFieldOfView(FieldOfView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rectangular Frustrum Field Of View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rectangular Frustrum Field Of View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRectangularFrustrumFieldOfView(RectangularFrustrumFieldOfView object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Monitorable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Monitorable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMonitorable(Monitorable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Processor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Processor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <I, O> T caseProcessor(Processor<I, O> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timed</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timed</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimed(Timed object) {
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

} //ApogyAddonsSensorsRangeSwitch
