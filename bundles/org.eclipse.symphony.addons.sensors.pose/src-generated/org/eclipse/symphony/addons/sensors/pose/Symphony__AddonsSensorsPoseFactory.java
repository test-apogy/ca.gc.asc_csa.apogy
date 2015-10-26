/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.addons.sensors.pose;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.symphony.addons.sensors.pose.Symphony__AddonsSensorsPosePackage
 * @generated
 */
public interface Symphony__AddonsSensorsPoseFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Symphony__AddonsSensorsPoseFactory eINSTANCE = org.eclipse.symphony.addons.sensors.pose.impl.Symphony__AddonsSensorsPoseFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Self Place Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Self Place Sensor</em>'.
	 * @generated
	 */
	SelfPlaceSensor createSelfPlaceSensor();

	/**
	 * Returns a new object of class '<em>Position Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Position Sensor</em>'.
	 * @generated
	 */
	PositionSensor createPositionSensor();

	/**
	 * Returns a new object of class '<em>Simulated Position Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simulated Position Sensor</em>'.
	 * @generated
	 */
	SimulatedPositionSensor createSimulatedPositionSensor();

	/**
	 * Returns a new object of class '<em>Orientation Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Orientation Sensor</em>'.
	 * @generated
	 */
	OrientationSensor createOrientationSensor();

	/**
	 * Returns a new object of class '<em>Inertial Measurement Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inertial Measurement Unit</em>'.
	 * @generated
	 */
	InertialMeasurementUnit createInertialMeasurementUnit();

	/**
	 * Returns a new object of class '<em>Simulated Orientation Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simulated Orientation Sensor</em>'.
	 * @generated
	 */
	SimulatedOrientationSensor createSimulatedOrientationSensor();

	/**
	 * Returns a new object of class '<em>Pose Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pose Sensor</em>'.
	 * @generated
	 */
	PoseSensor createPoseSensor();

	/**
	 * Returns a new object of class '<em>Simulated Pose Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simulated Pose Sensor</em>'.
	 * @generated
	 */
	SimulatedPoseSensor createSimulatedPoseSensor();

	/**
	 * Returns a new object of class '<em>CSV Data Logger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CSV Data Logger</em>'.
	 * @generated
	 */
	CSVDataLogger createCSVDataLogger();

	/**
	 * Returns a new object of class '<em>Pose Facade</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pose Facade</em>'.
	 * @generated
	 */
	PoseFacade createPoseFacade();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Symphony__AddonsSensorsPosePackage getSymphony__AddonsSensorsPosePackage();

} //Symphony__AddonsSensorsPoseFactory
