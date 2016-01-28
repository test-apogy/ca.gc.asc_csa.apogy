/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.addons.sensors.motion;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.apogy.addons.sensors.motion.ApogyAddonsSensorsMotionPackage
 * @generated
 */
public interface ApogyAddonsSensorsMotionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApogyAddonsSensorsMotionFactory eINSTANCE = ca.gc.asc_csa.apogy.addons.sensors.motion.impl.ApogyAddonsSensorsMotionFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Self Motion Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Self Motion Sensor</em>'.
	 * @generated
	 */
	SelfMotionSensor createSelfMotionSensor();

	/**
	 * Returns a new object of class '<em>Angular Velocity Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Angular Velocity Sensor</em>'.
	 * @generated
	 */
	AngularVelocitySensor createAngularVelocitySensor();

	/**
	 * Returns a new object of class '<em>Linear Acceleration Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Linear Acceleration Sensor</em>'.
	 * @generated
	 */
	LinearAccelerationSensor createLinearAccelerationSensor();

	/**
	 * Returns a new object of class '<em>Linear Velocity Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Linear Velocity Sensor</em>'.
	 * @generated
	 */
	LinearVelocitySensor createLinearVelocitySensor();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ApogyAddonsSensorsMotionPackage getApogyAddonsSensorsMotionPackage();

} //ApogyAddonsSensorsMotionFactory
