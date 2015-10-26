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
import org.eclipse.symphony.addons.sensors.pose.ui.Symphony__AddonsSensorsPoseUIFactory;
import org.eclipse.symphony.addons.sensors.pose.ui.Symphony__AddonsSensorsPoseUIPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Symphony__AddonsSensorsPoseUIFactoryImpl extends EFactoryImpl implements Symphony__AddonsSensorsPoseUIFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Symphony__AddonsSensorsPoseUIFactory init() {
		try {
			Symphony__AddonsSensorsPoseUIFactory theSymphony__AddonsSensorsPoseUIFactory = (Symphony__AddonsSensorsPoseUIFactory)EPackage.Registry.INSTANCE.getEFactory(Symphony__AddonsSensorsPoseUIPackage.eNS_URI);
			if (theSymphony__AddonsSensorsPoseUIFactory != null) {
				return theSymphony__AddonsSensorsPoseUIFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Symphony__AddonsSensorsPoseUIFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__AddonsSensorsPoseUIFactoryImpl() {
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
			case Symphony__AddonsSensorsPoseUIPackage.POSITION_SENSOR_PRESENTATION: return createPositionSensorPresentation();
			case Symphony__AddonsSensorsPoseUIPackage.ORIENTATION_SENSOR_PRESENTATION: return createOrientationSensorPresentation();
			case Symphony__AddonsSensorsPoseUIPackage.POSE_SENSOR_PRESENTATION: return createPoseSensorPresentation();
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
	public Symphony__AddonsSensorsPoseUIPackage getSymphony__AddonsSensorsPoseUIPackage() {
		return (Symphony__AddonsSensorsPoseUIPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Symphony__AddonsSensorsPoseUIPackage getPackage() {
		return Symphony__AddonsSensorsPoseUIPackage.eINSTANCE;
	}

} //Symphony__AddonsSensorsPoseUIFactoryImpl
