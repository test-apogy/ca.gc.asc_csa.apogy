/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.addons.sensors.pose.ui.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.symphony.addons.sensors.pose.ui.OrientationSensorPresentation;
import org.eclipse.symphony.addons.sensors.pose.ui.PoseSensorPresentation;
import org.eclipse.symphony.addons.sensors.pose.ui.PositionSensorPresentation;
import org.eclipse.symphony.addons.sensors.pose.ui.SensorsPoseUIFactory;
import org.eclipse.symphony.addons.sensors.pose.ui.SensorsPoseUIPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SensorsPoseUIFactoryImpl extends EFactoryImpl implements SensorsPoseUIFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SensorsPoseUIFactory init() {
		try {
			SensorsPoseUIFactory theSensorsPoseUIFactory = (SensorsPoseUIFactory)EPackage.Registry.INSTANCE.getEFactory(SensorsPoseUIPackage.eNS_URI);
			if (theSensorsPoseUIFactory != null) {
				return theSensorsPoseUIFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SensorsPoseUIFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensorsPoseUIFactoryImpl() {
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
			case SensorsPoseUIPackage.POSITION_SENSOR_PRESENTATION: return createPositionSensorPresentation();
			case SensorsPoseUIPackage.ORIENTATION_SENSOR_PRESENTATION: return createOrientationSensorPresentation();
			case SensorsPoseUIPackage.POSE_SENSOR_PRESENTATION: return createPoseSensorPresentation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionSensorPresentation createPositionSensorPresentation() {
		PositionSensorPresentationImpl positionSensorPresentation = new PositionSensorPresentationImpl();
		return positionSensorPresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrientationSensorPresentation createOrientationSensorPresentation() {
		OrientationSensorPresentationImpl orientationSensorPresentation = new OrientationSensorPresentationImpl();
		return orientationSensorPresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PoseSensorPresentation createPoseSensorPresentation() {
		PoseSensorPresentationImpl poseSensorPresentation = new PoseSensorPresentationImpl();
		return poseSensorPresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensorsPoseUIPackage getSensorsPoseUIPackage() {
		return (SensorsPoseUIPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SensorsPoseUIPackage getPackage() {
		return SensorsPoseUIPackage.eINSTANCE;
	}

} //SensorsPoseUIFactoryImpl
