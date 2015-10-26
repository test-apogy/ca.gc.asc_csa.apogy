/**
 * Canadian Space Agency 2007.
 *
 * $Id: Symphony__AddonsMobilityFactoryImpl.java,v 1.5.4.3 2015/09/22 19:39:42 rlarcheveque Exp $
 */
package org.eclipse.symphony.addons.mobility.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.symphony.addons.mobility.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Symphony__AddonsMobilityFactoryImpl extends EFactoryImpl implements Symphony__AddonsMobilityFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Symphony__AddonsMobilityFactory init() {
		try {
			Symphony__AddonsMobilityFactory theSymphony__AddonsMobilityFactory = (Symphony__AddonsMobilityFactory)EPackage.Registry.INSTANCE.getEFactory(Symphony__AddonsMobilityPackage.eNS_URI);
			if (theSymphony__AddonsMobilityFactory != null) {
				return theSymphony__AddonsMobilityFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Symphony__AddonsMobilityFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__AddonsMobilityFactoryImpl() {
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
			case Symphony__AddonsMobilityPackage.MOBILE_PLATFORM: return createMobilePlatform();
			case Symphony__AddonsMobilityPackage.SKID_STEERED_MOBILE_PLATFORM: return createSkidSteeredMobilePlatform();
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
			case Symphony__AddonsMobilityPackage.MOBILE_PLATFORM_STATUS:
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
			case Symphony__AddonsMobilityPackage.MOBILE_PLATFORM_STATUS:
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
	public Symphony__AddonsMobilityPackage getSymphony__AddonsMobilityPackage() {
		return (Symphony__AddonsMobilityPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Symphony__AddonsMobilityPackage getPackage() {
		return Symphony__AddonsMobilityPackage.eINSTANCE;
	}

} //Symphony__AddonsMobilityFactoryImpl
