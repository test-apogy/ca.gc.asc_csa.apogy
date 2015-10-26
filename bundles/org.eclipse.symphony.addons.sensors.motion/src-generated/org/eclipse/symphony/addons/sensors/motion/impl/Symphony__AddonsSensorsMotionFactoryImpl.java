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
public class Symphony__AddonsSensorsMotionFactoryImpl extends EFactoryImpl implements Symphony__AddonsSensorsMotionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Symphony__AddonsSensorsMotionFactory init() {
		try {
			Symphony__AddonsSensorsMotionFactory theSymphony__AddonsSensorsMotionFactory = (Symphony__AddonsSensorsMotionFactory)EPackage.Registry.INSTANCE.getEFactory(Symphony__AddonsSensorsMotionPackage.eNS_URI);
			if (theSymphony__AddonsSensorsMotionFactory != null) {
				return theSymphony__AddonsSensorsMotionFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Symphony__AddonsSensorsMotionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__AddonsSensorsMotionFactoryImpl() {
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
			case Symphony__AddonsSensorsMotionPackage.SELF_MOTION_SENSOR: return createSelfMotionSensor();
			case Symphony__AddonsSensorsMotionPackage.ANGULAR_VELOCITY_SENSOR: return createAngularVelocitySensor();
			case Symphony__AddonsSensorsMotionPackage.LINEAR_ACCELERATION_SENSOR: return createLinearAccelerationSensor();
			case Symphony__AddonsSensorsMotionPackage.LINEAR_VELOCITY_SENSOR: return createLinearVelocitySensor();
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
	public Symphony__AddonsSensorsMotionPackage getSymphony__AddonsSensorsMotionPackage() {
		return (Symphony__AddonsSensorsMotionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Symphony__AddonsSensorsMotionPackage getPackage() {
		return Symphony__AddonsSensorsMotionPackage.eINSTANCE;
	}

} //Symphony__AddonsSensorsMotionFactoryImpl
