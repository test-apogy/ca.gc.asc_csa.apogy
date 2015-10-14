/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.addons.sensors.motion.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.symphony.addons.sensors.motion.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MotionFactoryImpl extends EFactoryImpl implements MotionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MotionFactory init() {
		try {
			MotionFactory theMotionFactory = (MotionFactory)EPackage.Registry.INSTANCE.getEFactory(MotionPackage.eNS_URI);
			if (theMotionFactory != null) {
				return theMotionFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MotionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MotionFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MotionPackage.SELF_MOTION_SENSOR: return createSelfMotionSensor();
			case MotionPackage.ANGULAR_VELOCITY_SENSOR: return createAngularVelocitySensor();
			case MotionPackage.LINEAR_ACCELERATION_SENSOR: return createLinearAccelerationSensor();
			case MotionPackage.LINEAR_VELOCITY_SENSOR: return createLinearVelocitySensor();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelfMotionSensor createSelfMotionSensor() {
		SelfMotionSensorImpl selfMotionSensor = new SelfMotionSensorImpl();
		return selfMotionSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AngularVelocitySensor createAngularVelocitySensor() {
		AngularVelocitySensorImpl angularVelocitySensor = new AngularVelocitySensorImpl();
		return angularVelocitySensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinearAccelerationSensor createLinearAccelerationSensor() {
		LinearAccelerationSensorImpl linearAccelerationSensor = new LinearAccelerationSensorImpl();
		return linearAccelerationSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinearVelocitySensor createLinearVelocitySensor() {
		LinearVelocitySensorImpl linearVelocitySensor = new LinearVelocitySensorImpl();
		return linearVelocitySensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MotionPackage getMotionPackage() {
		return (MotionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MotionPackage getPackage() {
		return MotionPackage.eINSTANCE;
	}

} //MotionFactoryImpl
