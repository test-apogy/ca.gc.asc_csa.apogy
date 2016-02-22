/**
 * Canadian Space Agency / Agence spatiale canadienne 2016 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.addons.ros.paths.impl;

import ca.gc.asc_csa.apogy.addons.ros.paths.*;

import nav_msgs.Path;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.ros.message.MessageFactory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyAddonsROSPathsFactoryImpl extends EFactoryImpl implements ApogyAddonsROSPathsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ApogyAddonsROSPathsFactory init() {
		try {
			ApogyAddonsROSPathsFactory theApogyAddonsROSPathsFactory = (ApogyAddonsROSPathsFactory)EPackage.Registry.INSTANCE.getEFactory(ApogyAddonsROSPathsPackage.eNS_URI);
			if (theApogyAddonsROSPathsFactory != null) {
				return theApogyAddonsROSPathsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ApogyAddonsROSPathsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyAddonsROSPathsFactoryImpl() {
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
			case ApogyAddonsROSPathsPackage.APOGY_ADDONS_ROS_PATH_FACADE: return createApogyAddonsROSPathFacade();
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
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ApogyAddonsROSPathsPackage.ROS_PATH:
				return createROSPathFromString(eDataType, initialValue);
			case ApogyAddonsROSPathsPackage.MESSAGE_FACTORY:
				return createMessageFactoryFromString(eDataType, initialValue);
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
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ApogyAddonsROSPathsPackage.ROS_PATH:
				return convertROSPathToString(eDataType, instanceValue);
			case ApogyAddonsROSPathsPackage.MESSAGE_FACTORY:
				return convertMessageFactoryToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyAddonsROSPathFacade createApogyAddonsROSPathFacade() {
		ApogyAddonsROSPathFacadeImpl apogyAddonsROSPathFacade = new ApogyAddonsROSPathFacadeImpl();
		return apogyAddonsROSPathFacade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Path createROSPathFromString(EDataType eDataType, String initialValue) {
		return (Path)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertROSPathToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageFactory createMessageFactoryFromString(EDataType eDataType, String initialValue) {
		return (MessageFactory)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMessageFactoryToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyAddonsROSPathsPackage getApogyAddonsROSPathsPackage() {
		return (ApogyAddonsROSPathsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ApogyAddonsROSPathsPackage getPackage() {
		return ApogyAddonsROSPathsPackage.eINSTANCE;
	}

} //ApogyAddonsROSPathsFactoryImpl
