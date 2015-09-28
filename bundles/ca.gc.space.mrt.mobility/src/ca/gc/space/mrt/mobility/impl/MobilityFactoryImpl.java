/**
 * Canadian Space Agency 2007.
 *
 * $Id: MobilityFactoryImpl.java,v 1.5.4.3 2015/09/22 19:39:42 rlarcheveque Exp $
 */
package ca.gc.space.mrt.mobility.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ca.gc.space.mrt.mobility.MobilePlateform;
import ca.gc.space.mrt.mobility.MobilePlateformStatus;
import ca.gc.space.mrt.mobility.MobilityFactory;
import ca.gc.space.mrt.mobility.MobilityPackage;
import ca.gc.space.mrt.mobility.SkidSteeredMobilePlateform;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MobilityFactoryImpl extends EFactoryImpl implements MobilityFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Canadian Space Agency 2007.";

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MobilityFactory init() {
		try {
			MobilityFactory theMobilityFactory = (MobilityFactory)EPackage.Registry.INSTANCE.getEFactory(MobilityPackage.eNS_URI);
			if (theMobilityFactory != null) {
				return theMobilityFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MobilityFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobilityFactoryImpl() {
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
			case MobilityPackage.MOBILE_PLATEFORM: return createMobilePlateform();
			case MobilityPackage.SKID_STEERED_MOBILE_PLATEFORM: return createSkidSteeredMobilePlateform();
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
			case MobilityPackage.MOBILE_PLATEFORM_STATUS:
				return createMobilePlateformStatusFromString(eDataType, initialValue);
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
			case MobilityPackage.MOBILE_PLATEFORM_STATUS:
				return convertMobilePlateformStatusToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobilePlateform createMobilePlateform() {
		MobilePlateformImpl mobilePlateform = new MobilePlateformImpl();
		return mobilePlateform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SkidSteeredMobilePlateform createSkidSteeredMobilePlateform() {
		SkidSteeredMobilePlateformImpl skidSteeredMobilePlateform = new SkidSteeredMobilePlateformImpl();
		return skidSteeredMobilePlateform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobilePlateformStatus createMobilePlateformStatusFromString(EDataType eDataType, String initialValue)
	{
		MobilePlateformStatus result = MobilePlateformStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMobilePlateformStatusToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobilityPackage getMobilityPackage() {
		return (MobilityPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MobilityPackage getPackage() {
		return MobilityPackage.eINSTANCE;
	}

} //MobilityFactoryImpl
