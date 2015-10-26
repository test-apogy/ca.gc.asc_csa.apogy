/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.addons.sensors.range;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.symphony.addons.sensors.range.Symphony__AddonsSensorsRangePackage
 * @generated
 */
public interface Symphony__AddonsSensorsRangeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Symphony__AddonsSensorsRangeFactory eINSTANCE = org.eclipse.symphony.addons.sensors.range.impl.Symphony__AddonsSensorsRangeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Ray Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ray Data</em>'.
	 * @generated
	 */
	RayData createRayData();

	/**
	 * Returns a new object of class '<em>Raster Scan Settings</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Raster Scan Settings</em>'.
	 * @generated
	 */
	RasterScanSettings createRasterScanSettings();

	/**
	 * Returns a new object of class '<em>Range Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Range Sensor</em>'.
	 * @generated
	 */
	RangeSensor createRangeSensor();

	/**
	 * Returns a new object of class '<em>Contact Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contact Sensor</em>'.
	 * @generated
	 */
	ContactSensor createContactSensor();

	/**
	 * Returns a new object of class '<em>Simple Range Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Range Sensor</em>'.
	 * @generated
	 */
	SimpleRangeSensor createSimpleRangeSensor();

	/**
	 * Returns a new object of class '<em>Simple Sonar</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Sonar</em>'.
	 * @generated
	 */
	SimpleSonar createSimpleSonar();

	/**
	 * Returns a new object of class '<em>Line Range Scanner</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Line Range Scanner</em>'.
	 * @generated
	 */
	LineRangeScanner createLineRangeScanner();

	/**
	 * Returns a new object of class '<em>Simple Line Range Scanner</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Line Range Scanner</em>'.
	 * @generated
	 */
	SimpleLineRangeScanner createSimpleLineRangeScanner();

	/**
	 * Returns a new object of class '<em>Range Scanner</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Range Scanner</em>'.
	 * @generated
	 */
	<InputType> RangeScanner<InputType> createRangeScanner();

	/**
	 * Returns a new object of class '<em>Raster Scan Range Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Raster Scan Range Sensor</em>'.
	 * @generated
	 */
	RasterScanRangeSensor createRasterScanRangeSensor();

	/**
	 * Returns a new object of class '<em>Simple Raster Scan Range Scanner</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Raster Scan Range Scanner</em>'.
	 * @generated
	 */
	SimpleRasterScanRangeScanner createSimpleRasterScanRangeScanner();

	/**
	 * Returns a new object of class '<em>Simple Raster Scan Range Scanner Simulator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Raster Scan Range Scanner Simulator</em>'.
	 * @generated
	 */
	SimpleRasterScanRangeScannerSimulator createSimpleRasterScanRangeScannerSimulator();

	/**
	 * Returns a new object of class '<em>Raster Scan Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Raster Scan Data</em>'.
	 * @generated
	 */
	RasterScanData createRasterScanData();

	/**
	 * Returns a new object of class '<em>Sensors Range Facade</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sensors Range Facade</em>'.
	 * @generated
	 */
	SensorsRangeFacade createSensorsRangeFacade();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Symphony__AddonsSensorsRangePackage getSymphony__AddonsSensorsRangePackage();

} //Symphony__AddonsSensorsRangeFactory
