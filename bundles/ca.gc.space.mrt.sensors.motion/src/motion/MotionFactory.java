/**
 * <copyright>
 * </copyright>
 *
 * $Id: MotionFactory.java,v 1.2.4.2 2015/05/21 15:50:26 pallard Exp $
 */
package motion;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see motion.MotionPackage
 * @generated
 */
public interface MotionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MotionFactory eINSTANCE = motion.impl.MotionFactoryImpl.init();

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
	 * Returns a new object of class '<em>Self Motion Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Self Motion Sensor</em>'.
	 * @generated
	 */
	SelfMotionSensor createSelfMotionSensor();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MotionPackage getMotionPackage();

} //MotionFactory
