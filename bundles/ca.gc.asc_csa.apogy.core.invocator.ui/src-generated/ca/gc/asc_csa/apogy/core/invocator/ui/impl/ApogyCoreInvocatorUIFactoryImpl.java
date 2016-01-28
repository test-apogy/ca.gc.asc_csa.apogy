/**
 */
package org.eclipse.symphony.core.invocator.ui.impl;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.symphony.core.invocator.ui.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Symphony__CoreInvocatorUIFactoryImpl extends EFactoryImpl implements Symphony__CoreInvocatorUIFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Symphony__CoreInvocatorUIFactory init() {
		try {
			Symphony__CoreInvocatorUIFactory theSymphony__CoreInvocatorUIFactory = (Symphony__CoreInvocatorUIFactory)EPackage.Registry.INSTANCE.getEFactory(Symphony__CoreInvocatorUIPackage.eNS_URI);
			if (theSymphony__CoreInvocatorUIFactory != null) {
				return theSymphony__CoreInvocatorUIFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Symphony__CoreInvocatorUIFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__CoreInvocatorUIFactoryImpl() {
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
			case Symphony__CoreInvocatorUIPackage.SYMPHONY_CORE_INVOCATOR_UI_FACADE: return createSymphony__CoreInvocatorUIFacade();
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
			case Symphony__CoreInvocatorUIPackage.COMPOUND_COMMAND:
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
			case Symphony__CoreInvocatorUIPackage.COMPOUND_COMMAND:
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
	public Symphony__CoreInvocatorUIFacade createSymphony__CoreInvocatorUIFacade() {
		Symphony__CoreInvocatorUIFacadeImpl symphony__CoreInvocatorUIFacade = new Symphony__CoreInvocatorUIFacadeImpl();
		return symphony__CoreInvocatorUIFacade;
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
	public Symphony__CoreInvocatorUIPackage getSymphony__CoreInvocatorUIPackage() {
		return (Symphony__CoreInvocatorUIPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Symphony__CoreInvocatorUIPackage getPackage() {
		return Symphony__CoreInvocatorUIPackage.eINSTANCE;
	}

} //Symphony__CoreInvocatorUIFactoryImpl
