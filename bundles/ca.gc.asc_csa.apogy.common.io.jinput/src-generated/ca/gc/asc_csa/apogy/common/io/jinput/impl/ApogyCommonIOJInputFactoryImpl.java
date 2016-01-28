/**
 * Copyrights Canadian Space Agency 2012. All rights reserved.
 */
package org.eclipse.symphony.common.io.jinput.impl;

import net.java.games.input.Component;
import net.java.games.input.Controller;

import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.symphony.common.io.jinput.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Symphony__CommonIOJInputFactoryImpl extends EFactoryImpl implements Symphony__CommonIOJInputFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Symphony__CommonIOJInputFactory init() {
		try {
			Symphony__CommonIOJInputFactory theSymphony__CommonIOJInputFactory = (Symphony__CommonIOJInputFactory)EPackage.Registry.INSTANCE.getEFactory(Symphony__CommonIOJInputPackage.eNS_URI);
			if (theSymphony__CommonIOJInputFactory != null) {
				return theSymphony__CommonIOJInputFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Symphony__CommonIOJInputFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__CommonIOJInputFactoryImpl() {
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
			case Symphony__CommonIOJInputPackage.ECONTROLLER: return createEController();
			case Symphony__CommonIOJInputPackage.ECONTROLLER_ENVIRONMENT: return createEControllerEnvironment();
			case Symphony__CommonIOJInputPackage.ECOMPONENT: return createEComponent();
			case Symphony__CommonIOJInputPackage.ECOMPONENTS: return createEComponents();
			case Symphony__CommonIOJInputPackage.EBUTTON: return createEButton();
			case Symphony__CommonIOJInputPackage.EAXIS: return createEAxis();
			case Symphony__CommonIOJInputPackage.EKEY: return createEKey();
			case Symphony__CommonIOJInputPackage.ECOMPONENT_QUALIFIER: return createEComponentQualifier();
			case Symphony__CommonIOJInputPackage.EVIRTUAL_COMPONENT: return createEVirtualComponent();
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
			case Symphony__CommonIOJInputPackage.JOB:
				return createJobFromString(eDataType, initialValue);
			case Symphony__CommonIOJInputPackage.COMPONENT:
				return createComponentFromString(eDataType, initialValue);
			case Symphony__CommonIOJInputPackage.CONTROLLER:
				return createControllerFromString(eDataType, initialValue);
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
			case Symphony__CommonIOJInputPackage.JOB:
				return convertJobToString(eDataType, instanceValue);
			case Symphony__CommonIOJInputPackage.COMPONENT:
				return convertComponentToString(eDataType, instanceValue);
			case Symphony__CommonIOJInputPackage.CONTROLLER:
				return convertControllerToString(eDataType, instanceValue);
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
	public EController createEController() {
		EControllerImpl eController = new EControllerImpl();
		return eController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EControllerEnvironment createEControllerEnvironment() {
		EControllerEnvironmentImpl eControllerEnvironment = new EControllerEnvironmentImpl();
		return eControllerEnvironment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EComponent createEComponent() {
		EComponentImpl eComponent = new EComponentImpl();
		return eComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EComponents createEComponents() {
		EComponentsImpl eComponents = new EComponentsImpl();
		return eComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EButton createEButton() {
		EButtonImpl eButton = new EButtonImpl();
		return eButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAxis createEAxis() {
		EAxisImpl eAxis = new EAxisImpl();
		return eAxis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EKey createEKey() {
		EKeyImpl eKey = new EKeyImpl();
		return eKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EComponentQualifier createEComponentQualifier() {
		EComponentQualifierImpl eComponentQualifier = new EComponentQualifierImpl();
		return eComponentQualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EVirtualComponent createEVirtualComponent() {
		EVirtualComponentImpl eVirtualComponent = new EVirtualComponentImpl();
		return eVirtualComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Controller createControllerFromString(EDataType eDataType, String initialValue) {
		return (Controller)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertControllerToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__CommonIOJInputPackage getSymphony__CommonIOJInputPackage() {
		return (Symphony__CommonIOJInputPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component createComponentFromString(EDataType eDataType, String initialValue) {
		return (Component)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertComponentToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Job createJobFromString(EDataType eDataType, String initialValue) {
		return (Job)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJobToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Symphony__CommonIOJInputPackage getPackage() {
		return Symphony__CommonIOJInputPackage.eINSTANCE;
	}

} //Symphony__CommonIOJInputFactoryImpl
