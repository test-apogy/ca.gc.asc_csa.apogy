/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.addons.sensors.motion.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ca.gc.asc_csa.apogy.addons.sensors.motion.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyAddonsSensorsMotionFactoryImpl extends EFactoryImpl implements ApogyAddonsSensorsMotionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ApogyAddonsSensorsMotionFactory init() {
		try {
			ApogyAddonsSensorsMotionFactory theApogyAddonsSensorsMotionFactory = (ApogyAddonsSensorsMotionFactory)EPackage.Registry.INSTANCE.getEFactory(ApogyAddonsSensorsMotionPackage.eNS_URI);
			if (theApogyAddonsSensorsMotionFactory != null) {
				return theApogyAddonsSensorsMotionFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ApogyAddonsSensorsMotionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyAddonsSensorsMotionFactoryImpl() {
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
			case ApogyAddonsSensorsMotionPackage.SELF_MOTION_SENSOR: return createSelfMotionSensor();
			case ApogyAddonsSensorsMotionPackage.ANGULAR_VELOCITY_SENSOR: return createAngularVelocitySensor();
			case ApogyAddonsSensorsMotionPackage.LINEAR_ACCELERATION_SENSOR: return createLinearAccelerationSensor();
			case ApogyAddonsSensorsMotionPackage.LINEAR_VELOCITY_SENSOR: return createLinearVelocitySensor();
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
	public ApogyAddonsSensorsMotionPackage getApogyAddonsSensorsMotionPackage() {
		return (ApogyAddonsSensorsMotionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ApogyAddonsSensorsMotionPackage getPackage() {
		return ApogyAddonsSensorsMotionPackage.eINSTANCE;
	}

} //ApogyAddonsSensorsMotionFactoryImpl
