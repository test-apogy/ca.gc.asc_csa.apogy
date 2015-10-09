/**
 * <copyright>
 * </copyright>
 *
 * $Id: RangeFactory.java,v 1.3.4.2 2015/05/21 15:50:22 pallard Exp $
 */
package org.eclipse.symphony.addons.sensors.range;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.symphony.addons.sensors.range.RangePackage
 * @generated
 */
public interface RangeFactory extends EFactory
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RangeFactory eINSTANCE = org.eclipse.symphony.addons.sensors.range.impl.RangeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Simple Range Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Range Sensor</em>'.
	 * @generated
	 */
	SimpleRangeSensor createSimpleRangeSensor();

	/**
	 * Returns a new object of class '<em>Contact Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contact Sensor</em>'.
	 * @generated
	 */
	ContactSensor createContactSensor();

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
	 * Returns a new object of class '<em>Scanner</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scanner</em>'.
	 * @generated
	 */
	<InputType> RangeScanner<InputType> createRangeScanner();

	/**
	 * Returns a new object of class '<em>Ray Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ray Data</em>'.
	 * @generated
	 */
	RayData createRayData();

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
	 * Returns a new object of class '<em>Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sensor</em>'.
	 * @generated
	 */
	RangeSensor createRangeSensor();

	/**
	 * Returns a new object of class '<em>Raster Scan Settings</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Raster Scan Settings</em>'.
	 * @generated
	 */
	RasterScanSettings createRasterScanSettings();

	/**
	 * Returns a new object of class '<em>Sensors Range Facade</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sensors Range Facade</em>'.
	 * @generated
	 */
	SensorsRangeFacade createSensorsRangeFacade();

	/**
	 * Returns a new object of class '<em>Raster Scan Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Raster Scan Data</em>'.
	 * @generated
	 */
	RasterScanData createRasterScanData();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RangePackage getRangePackage();

} //RangeFactory
