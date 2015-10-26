/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.addons.sensors.motion;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.symphony.addons.sensors.SensorsPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.symphony.addons.sensors.motion.MotionFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='Motion' childCreationExtenders='true' extensibleProviderFactory='true' multipleEditorPages='false' copyrightText='Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)' modelName='Motion' suppressGenModelAnnotations='false' modelDirectory='/org.eclipse.symphony.addons.sensors.motion/src-generated' editDirectory='/org.eclipse.symphony.addons.sensors.motion.edit/src-generated' basePackage='org.eclipse.symphony.addons.sensors'"
 * @generated
 */
public interface MotionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "motion";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "org.eclipse.symphony.addons.sensors.motion";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "motion";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MotionPackage eINSTANCE = org.eclipse.symphony.addons.sensors.motion.impl.MotionPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.sensors.motion.impl.SelfMotionSensorImpl <em>Self Motion Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.sensors.motion.impl.SelfMotionSensorImpl
	 * @see org.eclipse.symphony.addons.sensors.motion.impl.MotionPackageImpl#getSelfMotionSensor()
	 * @generated
	 */
	int SELF_MOTION_SENSOR = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_MOTION_SENSOR__PARENT = SensorsPackage.SENSOR__PARENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_MOTION_SENSOR__DESCRIPTION = SensorsPackage.SENSOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_MOTION_SENSOR__NODE_ID = SensorsPackage.SENSOR__NODE_ID;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_MOTION_SENSOR__CHILDREN = SensorsPackage.SENSOR__CHILDREN;

	/**
	 * The feature id for the '<em><b>Aggregated Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_MOTION_SENSOR__AGGREGATED_CHILDREN = SensorsPackage.SENSOR__AGGREGATED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_MOTION_SENSOR__STATUS = SensorsPackage.SENSOR__STATUS;

	/**
	 * The number of structural features of the '<em>Self Motion Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_MOTION_SENSOR_FEATURE_COUNT = SensorsPackage.SENSOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_MOTION_SENSOR___ACCEPT__INODEVISITOR = SensorsPackage.SENSOR___ACCEPT__INODEVISITOR;

	/**
	 * The number of operations of the '<em>Self Motion Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_MOTION_SENSOR_OPERATION_COUNT = SensorsPackage.SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.sensors.motion.impl.AngularVelocitySensorImpl <em>Angular Velocity Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.sensors.motion.impl.AngularVelocitySensorImpl
	 * @see org.eclipse.symphony.addons.sensors.motion.impl.MotionPackageImpl#getAngularVelocitySensor()
	 * @generated
	 */
	int ANGULAR_VELOCITY_SENSOR = 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGULAR_VELOCITY_SENSOR__PARENT = SELF_MOTION_SENSOR__PARENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGULAR_VELOCITY_SENSOR__DESCRIPTION = SELF_MOTION_SENSOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGULAR_VELOCITY_SENSOR__NODE_ID = SELF_MOTION_SENSOR__NODE_ID;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGULAR_VELOCITY_SENSOR__CHILDREN = SELF_MOTION_SENSOR__CHILDREN;

	/**
	 * The feature id for the '<em><b>Aggregated Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGULAR_VELOCITY_SENSOR__AGGREGATED_CHILDREN = SELF_MOTION_SENSOR__AGGREGATED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGULAR_VELOCITY_SENSOR__STATUS = SELF_MOTION_SENSOR__STATUS;

	/**
	 * The feature id for the '<em><b>XAngular Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGULAR_VELOCITY_SENSOR__XANGULAR_VELOCITY = SELF_MOTION_SENSOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>YAngular Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGULAR_VELOCITY_SENSOR__YANGULAR_VELOCITY = SELF_MOTION_SENSOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>ZAngular Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGULAR_VELOCITY_SENSOR__ZANGULAR_VELOCITY = SELF_MOTION_SENSOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Angular Velocity Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGULAR_VELOCITY_SENSOR_FEATURE_COUNT = SELF_MOTION_SENSOR_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGULAR_VELOCITY_SENSOR___ACCEPT__INODEVISITOR = SELF_MOTION_SENSOR___ACCEPT__INODEVISITOR;

	/**
	 * The number of operations of the '<em>Angular Velocity Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGULAR_VELOCITY_SENSOR_OPERATION_COUNT = SELF_MOTION_SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.sensors.motion.impl.LinearAccelerationSensorImpl <em>Linear Acceleration Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.sensors.motion.impl.LinearAccelerationSensorImpl
	 * @see org.eclipse.symphony.addons.sensors.motion.impl.MotionPackageImpl#getLinearAccelerationSensor()
	 * @generated
	 */
	int LINEAR_ACCELERATION_SENSOR = 2;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_ACCELERATION_SENSOR__PARENT = SELF_MOTION_SENSOR__PARENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_ACCELERATION_SENSOR__DESCRIPTION = SELF_MOTION_SENSOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_ACCELERATION_SENSOR__NODE_ID = SELF_MOTION_SENSOR__NODE_ID;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_ACCELERATION_SENSOR__CHILDREN = SELF_MOTION_SENSOR__CHILDREN;

	/**
	 * The feature id for the '<em><b>Aggregated Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_ACCELERATION_SENSOR__AGGREGATED_CHILDREN = SELF_MOTION_SENSOR__AGGREGATED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_ACCELERATION_SENSOR__STATUS = SELF_MOTION_SENSOR__STATUS;

	/**
	 * The feature id for the '<em><b>XAcceleration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_ACCELERATION_SENSOR__XACCELERATION = SELF_MOTION_SENSOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>YAcceleration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_ACCELERATION_SENSOR__YACCELERATION = SELF_MOTION_SENSOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>ZAcceleration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_ACCELERATION_SENSOR__ZACCELERATION = SELF_MOTION_SENSOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Linear Acceleration Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_ACCELERATION_SENSOR_FEATURE_COUNT = SELF_MOTION_SENSOR_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_ACCELERATION_SENSOR___ACCEPT__INODEVISITOR = SELF_MOTION_SENSOR___ACCEPT__INODEVISITOR;

	/**
	 * The number of operations of the '<em>Linear Acceleration Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_ACCELERATION_SENSOR_OPERATION_COUNT = SELF_MOTION_SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.sensors.motion.impl.LinearVelocitySensorImpl <em>Linear Velocity Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.sensors.motion.impl.LinearVelocitySensorImpl
	 * @see org.eclipse.symphony.addons.sensors.motion.impl.MotionPackageImpl#getLinearVelocitySensor()
	 * @generated
	 */
	int LINEAR_VELOCITY_SENSOR = 3;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_VELOCITY_SENSOR__PARENT = SELF_MOTION_SENSOR__PARENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_VELOCITY_SENSOR__DESCRIPTION = SELF_MOTION_SENSOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_VELOCITY_SENSOR__NODE_ID = SELF_MOTION_SENSOR__NODE_ID;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_VELOCITY_SENSOR__CHILDREN = SELF_MOTION_SENSOR__CHILDREN;

	/**
	 * The feature id for the '<em><b>Aggregated Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_VELOCITY_SENSOR__AGGREGATED_CHILDREN = SELF_MOTION_SENSOR__AGGREGATED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_VELOCITY_SENSOR__STATUS = SELF_MOTION_SENSOR__STATUS;

	/**
	 * The feature id for the '<em><b>XVelocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_VELOCITY_SENSOR__XVELOCITY = SELF_MOTION_SENSOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>YVelocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_VELOCITY_SENSOR__YVELOCITY = SELF_MOTION_SENSOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>ZVelocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_VELOCITY_SENSOR__ZVELOCITY = SELF_MOTION_SENSOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Linear Velocity Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_VELOCITY_SENSOR_FEATURE_COUNT = SELF_MOTION_SENSOR_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_VELOCITY_SENSOR___ACCEPT__INODEVISITOR = SELF_MOTION_SENSOR___ACCEPT__INODEVISITOR;

	/**
	 * The number of operations of the '<em>Linear Velocity Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_VELOCITY_SENSOR_OPERATION_COUNT = SELF_MOTION_SENSOR_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.sensors.motion.SelfMotionSensor <em>Self Motion Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Self Motion Sensor</em>'.
	 * @see org.eclipse.symphony.addons.sensors.motion.SelfMotionSensor
	 * @generated
	 */
	EClass getSelfMotionSensor();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.sensors.motion.AngularVelocitySensor <em>Angular Velocity Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Angular Velocity Sensor</em>'.
	 * @see org.eclipse.symphony.addons.sensors.motion.AngularVelocitySensor
	 * @generated
	 */
	EClass getAngularVelocitySensor();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.motion.AngularVelocitySensor#getXAngularVelocity <em>XAngular Velocity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XAngular Velocity</em>'.
	 * @see org.eclipse.symphony.addons.sensors.motion.AngularVelocitySensor#getXAngularVelocity()
	 * @see #getAngularVelocitySensor()
	 * @generated
	 */
	EAttribute getAngularVelocitySensor_XAngularVelocity();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.motion.AngularVelocitySensor#getYAngularVelocity <em>YAngular Velocity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YAngular Velocity</em>'.
	 * @see org.eclipse.symphony.addons.sensors.motion.AngularVelocitySensor#getYAngularVelocity()
	 * @see #getAngularVelocitySensor()
	 * @generated
	 */
	EAttribute getAngularVelocitySensor_YAngularVelocity();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.motion.AngularVelocitySensor#getZAngularVelocity <em>ZAngular Velocity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ZAngular Velocity</em>'.
	 * @see org.eclipse.symphony.addons.sensors.motion.AngularVelocitySensor#getZAngularVelocity()
	 * @see #getAngularVelocitySensor()
	 * @generated
	 */
	EAttribute getAngularVelocitySensor_ZAngularVelocity();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.sensors.motion.LinearAccelerationSensor <em>Linear Acceleration Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Linear Acceleration Sensor</em>'.
	 * @see org.eclipse.symphony.addons.sensors.motion.LinearAccelerationSensor
	 * @generated
	 */
	EClass getLinearAccelerationSensor();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.motion.LinearAccelerationSensor#getXAcceleration <em>XAcceleration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XAcceleration</em>'.
	 * @see org.eclipse.symphony.addons.sensors.motion.LinearAccelerationSensor#getXAcceleration()
	 * @see #getLinearAccelerationSensor()
	 * @generated
	 */
	EAttribute getLinearAccelerationSensor_XAcceleration();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.motion.LinearAccelerationSensor#getYAcceleration <em>YAcceleration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YAcceleration</em>'.
	 * @see org.eclipse.symphony.addons.sensors.motion.LinearAccelerationSensor#getYAcceleration()
	 * @see #getLinearAccelerationSensor()
	 * @generated
	 */
	EAttribute getLinearAccelerationSensor_YAcceleration();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.motion.LinearAccelerationSensor#getZAcceleration <em>ZAcceleration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ZAcceleration</em>'.
	 * @see org.eclipse.symphony.addons.sensors.motion.LinearAccelerationSensor#getZAcceleration()
	 * @see #getLinearAccelerationSensor()
	 * @generated
	 */
	EAttribute getLinearAccelerationSensor_ZAcceleration();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.sensors.motion.LinearVelocitySensor <em>Linear Velocity Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Linear Velocity Sensor</em>'.
	 * @see org.eclipse.symphony.addons.sensors.motion.LinearVelocitySensor
	 * @generated
	 */
	EClass getLinearVelocitySensor();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.motion.LinearVelocitySensor#getXVelocity <em>XVelocity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XVelocity</em>'.
	 * @see org.eclipse.symphony.addons.sensors.motion.LinearVelocitySensor#getXVelocity()
	 * @see #getLinearVelocitySensor()
	 * @generated
	 */
	EAttribute getLinearVelocitySensor_XVelocity();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.motion.LinearVelocitySensor#getYVelocity <em>YVelocity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YVelocity</em>'.
	 * @see org.eclipse.symphony.addons.sensors.motion.LinearVelocitySensor#getYVelocity()
	 * @see #getLinearVelocitySensor()
	 * @generated
	 */
	EAttribute getLinearVelocitySensor_YVelocity();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.motion.LinearVelocitySensor#getZVelocity <em>ZVelocity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ZVelocity</em>'.
	 * @see org.eclipse.symphony.addons.sensors.motion.LinearVelocitySensor#getZVelocity()
	 * @see #getLinearVelocitySensor()
	 * @generated
	 */
	EAttribute getLinearVelocitySensor_ZVelocity();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MotionFactory getMotionFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.sensors.motion.impl.SelfMotionSensorImpl <em>Self Motion Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.sensors.motion.impl.SelfMotionSensorImpl
		 * @see org.eclipse.symphony.addons.sensors.motion.impl.MotionPackageImpl#getSelfMotionSensor()
		 * @generated
		 */
		EClass SELF_MOTION_SENSOR = eINSTANCE.getSelfMotionSensor();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.sensors.motion.impl.AngularVelocitySensorImpl <em>Angular Velocity Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.sensors.motion.impl.AngularVelocitySensorImpl
		 * @see org.eclipse.symphony.addons.sensors.motion.impl.MotionPackageImpl#getAngularVelocitySensor()
		 * @generated
		 */
		EClass ANGULAR_VELOCITY_SENSOR = eINSTANCE.getAngularVelocitySensor();

		/**
		 * The meta object literal for the '<em><b>XAngular Velocity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANGULAR_VELOCITY_SENSOR__XANGULAR_VELOCITY = eINSTANCE.getAngularVelocitySensor_XAngularVelocity();

		/**
		 * The meta object literal for the '<em><b>YAngular Velocity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANGULAR_VELOCITY_SENSOR__YANGULAR_VELOCITY = eINSTANCE.getAngularVelocitySensor_YAngularVelocity();

		/**
		 * The meta object literal for the '<em><b>ZAngular Velocity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANGULAR_VELOCITY_SENSOR__ZANGULAR_VELOCITY = eINSTANCE.getAngularVelocitySensor_ZAngularVelocity();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.sensors.motion.impl.LinearAccelerationSensorImpl <em>Linear Acceleration Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.sensors.motion.impl.LinearAccelerationSensorImpl
		 * @see org.eclipse.symphony.addons.sensors.motion.impl.MotionPackageImpl#getLinearAccelerationSensor()
		 * @generated
		 */
		EClass LINEAR_ACCELERATION_SENSOR = eINSTANCE.getLinearAccelerationSensor();

		/**
		 * The meta object literal for the '<em><b>XAcceleration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINEAR_ACCELERATION_SENSOR__XACCELERATION = eINSTANCE.getLinearAccelerationSensor_XAcceleration();

		/**
		 * The meta object literal for the '<em><b>YAcceleration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINEAR_ACCELERATION_SENSOR__YACCELERATION = eINSTANCE.getLinearAccelerationSensor_YAcceleration();

		/**
		 * The meta object literal for the '<em><b>ZAcceleration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINEAR_ACCELERATION_SENSOR__ZACCELERATION = eINSTANCE.getLinearAccelerationSensor_ZAcceleration();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.sensors.motion.impl.LinearVelocitySensorImpl <em>Linear Velocity Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.sensors.motion.impl.LinearVelocitySensorImpl
		 * @see org.eclipse.symphony.addons.sensors.motion.impl.MotionPackageImpl#getLinearVelocitySensor()
		 * @generated
		 */
		EClass LINEAR_VELOCITY_SENSOR = eINSTANCE.getLinearVelocitySensor();

		/**
		 * The meta object literal for the '<em><b>XVelocity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINEAR_VELOCITY_SENSOR__XVELOCITY = eINSTANCE.getLinearVelocitySensor_XVelocity();

		/**
		 * The meta object literal for the '<em><b>YVelocity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINEAR_VELOCITY_SENSOR__YVELOCITY = eINSTANCE.getLinearVelocitySensor_YVelocity();

		/**
		 * The meta object literal for the '<em><b>ZVelocity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINEAR_VELOCITY_SENSOR__ZVELOCITY = eINSTANCE.getLinearVelocitySensor_ZVelocity();

	}

} //MotionPackage
