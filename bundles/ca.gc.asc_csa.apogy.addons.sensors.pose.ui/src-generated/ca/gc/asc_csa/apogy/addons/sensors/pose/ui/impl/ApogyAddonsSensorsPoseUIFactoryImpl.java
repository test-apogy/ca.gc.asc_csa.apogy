/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.addons.sensors.pose.ui.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import ca.gc.asc_csa.apogy.addons.sensors.pose.ui.OrientationSensorPresentation;
import ca.gc.asc_csa.apogy.addons.sensors.pose.ui.PoseSensorPresentation;
import ca.gc.asc_csa.apogy.addons.sensors.pose.ui.PositionSensorPresentation;
import ca.gc.asc_csa.apogy.addons.sensors.pose.ui.ApogyAddonsSensorsPoseUIFactory;
import ca.gc.asc_csa.apogy.addons.sensors.pose.ui.ApogyAddonsSensorsPoseUIPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyAddonsSensorsPoseUIFactoryImpl extends EFactoryImpl implements ApogyAddonsSensorsPoseUIFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ApogyAddonsSensorsPoseUIFactory init() {
		try {
			ApogyAddonsSensorsPoseUIFactory theApogyAddonsSensorsPoseUIFactory = (ApogyAddonsSensorsPoseUIFactory)EPackage.Registry.INSTANCE.getEFactory(ApogyAddonsSensorsPoseUIPackage.eNS_URI);
			if (theApogyAddonsSensorsPoseUIFactory != null) {
				return theApogyAddonsSensorsPoseUIFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ApogyAddonsSensorsPoseUIFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyAddonsSensorsPoseUIFactoryImpl() {
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
			case ApogyAddonsSensorsPoseUIPackage.POSITION_SENSOR_PRESENTATION: return createPositionSensorPresentation();
			case ApogyAddonsSensorsPoseUIPackage.ORIENTATION_SENSOR_PRESENTATION: return createOrientationSensorPresentation();
			case ApogyAddonsSensorsPoseUIPackage.POSE_SENSOR_PRESENTATION: return createPoseSensorPresentation();
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
	public ApogyAddonsSensorsPoseUIPackage getApogyAddonsSensorsPoseUIPackage() {
		return (ApogyAddonsSensorsPoseUIPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ApogyAddonsSensorsPoseUIPackage getPackage() {
		return ApogyAddonsSensorsPoseUIPackage.eINSTANCE;
	}

} //ApogyAddonsSensorsPoseUIFactoryImpl
