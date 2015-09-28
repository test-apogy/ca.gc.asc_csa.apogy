/**
 */
package ca.gc.asc_csa.eclipse.emf.ecore.invocator.ui.impl;

import ca.gc.asc_csa.eclipse.emf.ecore.invocator.ui.*;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EMFEcoreInvocatorUiFactoryImpl extends EFactoryImpl implements EMFEcoreInvocatorUiFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EMFEcoreInvocatorUiFactory init() {
		try {
			EMFEcoreInvocatorUiFactory theEMFEcoreInvocatorUiFactory = (EMFEcoreInvocatorUiFactory)EPackage.Registry.INSTANCE.getEFactory(EMFEcoreInvocatorUiPackage.eNS_URI);
			if (theEMFEcoreInvocatorUiFactory != null) {
				return theEMFEcoreInvocatorUiFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EMFEcoreInvocatorUiFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMFEcoreInvocatorUiFactoryImpl() {
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
			case EMFEcoreInvocatorUiPackage.EMF_ECORE_INVOCATOR_UI_FACADE: return createEMFEcoreInvocatorUiFacade();
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
			case EMFEcoreInvocatorUiPackage.COMPOUND_COMMAND:
				return createCompoundCommandFromString(eDataType, initialValue);
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
			case EMFEcoreInvocatorUiPackage.COMPOUND_COMMAND:
				return convertCompoundCommandToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMFEcoreInvocatorUiFacade createEMFEcoreInvocatorUiFacade() {
		EMFEcoreInvocatorUiFacadeImpl emfEcoreInvocatorUiFacade = new EMFEcoreInvocatorUiFacadeImpl();
		return emfEcoreInvocatorUiFacade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompoundCommand createCompoundCommandFromString(EDataType eDataType, String initialValue) {
		return (CompoundCommand)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCompoundCommandToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMFEcoreInvocatorUiPackage getEMFEcoreInvocatorUiPackage() {
		return (EMFEcoreInvocatorUiPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EMFEcoreInvocatorUiPackage getPackage() {
		return EMFEcoreInvocatorUiPackage.eINSTANCE;
	}

} //EMFEcoreInvocatorUiFactoryImpl
