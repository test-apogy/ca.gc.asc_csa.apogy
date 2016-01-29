/**
 * Canadian Space Agency 2007.
 *
 * $Id: ApogyAddonsMobilityFactoryImpl.java,v 1.5.4.3 2015/09/22 19:39:42 rlarcheveque Exp $
 */
package ca.gc.asc_csa.apogy.addons.mobility.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import ca.gc.asc_csa.apogy.addons.mobility.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyAddonsMobilityFactoryImpl extends EFactoryImpl implements ApogyAddonsMobilityFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ApogyAddonsMobilityFactory init() {
		try {
			ApogyAddonsMobilityFactory theApogyAddonsMobilityFactory = (ApogyAddonsMobilityFactory)EPackage.Registry.INSTANCE.getEFactory(ApogyAddonsMobilityPackage.eNS_URI);
			if (theApogyAddonsMobilityFactory != null) {
				return theApogyAddonsMobilityFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ApogyAddonsMobilityFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyAddonsMobilityFactoryImpl() {
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
			case ApogyAddonsMobilityPackage.MOBILE_PLATFORM: return createMobilePlatform();
			case ApogyAddonsMobilityPackage.SKID_STEERED_MOBILE_PLATFORM: return createSkidSteeredMobilePlatform();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue)
	{
		switch (eDataType.getClassifierID()) {
			case ApogyAddonsMobilityPackage.MOBILE_PLATFORM_STATUS:
				return createMobilePlatformStatusFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue)
	{
		switch (eDataType.getClassifierID()) {
			case ApogyAddonsMobilityPackage.MOBILE_PLATFORM_STATUS:
				return convertMobilePlatformStatusToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobilePlatform createMobilePlatform() {
		MobilePlatformImpl mobilePlatform = new MobilePlatformImpl();
		return mobilePlatform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SkidSteeredMobilePlatform createSkidSteeredMobilePlatform() {
		SkidSteeredMobilePlatformImpl skidSteeredMobilePlatform = new SkidSteeredMobilePlatformImpl();
		return skidSteeredMobilePlatform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobilePlatformStatus createMobilePlatformStatusFromString(EDataType eDataType, String initialValue) {
		MobilePlatformStatus result = MobilePlatformStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMobilePlatformStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyAddonsMobilityPackage getApogyAddonsMobilityPackage() {
		return (ApogyAddonsMobilityPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ApogyAddonsMobilityPackage getPackage() {
		return ApogyAddonsMobilityPackage.eINSTANCE;
	}

} //ApogyAddonsMobilityFactoryImpl
