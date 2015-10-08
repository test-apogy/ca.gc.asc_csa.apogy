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
public class JInputFactoryImpl extends EFactoryImpl implements JInputFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyrights Canadian Space Agency 2012. All rights reserved.";

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static JInputFactory init() {
		try {
			JInputFactory theJInputFactory = (JInputFactory)EPackage.Registry.INSTANCE.getEFactory(JInputPackage.eNS_URI);
			if (theJInputFactory != null) {
				return theJInputFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new JInputFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JInputFactoryImpl() {
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
			case JInputPackage.ECONTROLLER: return createEController();
			case JInputPackage.ECONTROLLER_ENVIRONMENT: return createEControllerEnvironment();
			case JInputPackage.ECOMPONENT: return createEComponent();
			case JInputPackage.ECOMPONENTS: return createEComponents();
			case JInputPackage.EBUTTON: return createEButton();
			case JInputPackage.EAXIS: return createEAxis();
			case JInputPackage.EKEY: return createEKey();
			case JInputPackage.ECOMPONENT_QUALIFIER: return createEComponentQualifier();
			case JInputPackage.EVIRTUAL_COMPONENT: return createEVirtualComponent();
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
			case JInputPackage.JOB:
				return createJobFromString(eDataType, initialValue);
			case JInputPackage.COMPONENT:
				return createComponentFromString(eDataType, initialValue);
			case JInputPackage.CONTROLLER:
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
			case JInputPackage.JOB:
				return convertJobToString(eDataType, instanceValue);
			case JInputPackage.COMPONENT:
				return convertComponentToString(eDataType, instanceValue);
			case JInputPackage.CONTROLLER:
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
	 * @generated
	 */
	@Override
	public JInputPackage getJInputPackage() {
		return (JInputPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static JInputPackage getPackage() {
		return JInputPackage.eINSTANCE;
	}

} //JInputFactoryImpl
