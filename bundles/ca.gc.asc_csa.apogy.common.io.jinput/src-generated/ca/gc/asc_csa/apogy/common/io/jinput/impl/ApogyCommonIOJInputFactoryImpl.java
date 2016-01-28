/**
 * Copyrights Canadian Space Agency 2012. All rights reserved.
 */
package ca.gc.asc_csa.apogy.common.io.jinput.impl;

import net.java.games.input.Component;
import net.java.games.input.Controller;

import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import ca.gc.asc_csa.apogy.common.io.jinput.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyCommonIOJInputFactoryImpl extends EFactoryImpl implements ApogyCommonIOJInputFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ApogyCommonIOJInputFactory init() {
		try {
			ApogyCommonIOJInputFactory theApogyCommonIOJInputFactory = (ApogyCommonIOJInputFactory)EPackage.Registry.INSTANCE.getEFactory(ApogyCommonIOJInputPackage.eNS_URI);
			if (theApogyCommonIOJInputFactory != null) {
				return theApogyCommonIOJInputFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ApogyCommonIOJInputFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCommonIOJInputFactoryImpl() {
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
			case ApogyCommonIOJInputPackage.ECONTROLLER: return createEController();
			case ApogyCommonIOJInputPackage.ECONTROLLER_ENVIRONMENT: return createEControllerEnvironment();
			case ApogyCommonIOJInputPackage.ECOMPONENT: return createEComponent();
			case ApogyCommonIOJInputPackage.ECOMPONENTS: return createEComponents();
			case ApogyCommonIOJInputPackage.EBUTTON: return createEButton();
			case ApogyCommonIOJInputPackage.EAXIS: return createEAxis();
			case ApogyCommonIOJInputPackage.EKEY: return createEKey();
			case ApogyCommonIOJInputPackage.ECOMPONENT_QUALIFIER: return createEComponentQualifier();
			case ApogyCommonIOJInputPackage.EVIRTUAL_COMPONENT: return createEVirtualComponent();
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
			case ApogyCommonIOJInputPackage.JOB:
				return createJobFromString(eDataType, initialValue);
			case ApogyCommonIOJInputPackage.COMPONENT:
				return createComponentFromString(eDataType, initialValue);
			case ApogyCommonIOJInputPackage.CONTROLLER:
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
			case ApogyCommonIOJInputPackage.JOB:
				return convertJobToString(eDataType, instanceValue);
			case ApogyCommonIOJInputPackage.COMPONENT:
				return convertComponentToString(eDataType, instanceValue);
			case ApogyCommonIOJInputPackage.CONTROLLER:
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
	public ApogyCommonIOJInputPackage getApogyCommonIOJInputPackage() {
		return (ApogyCommonIOJInputPackage)getEPackage();
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
	public static ApogyCommonIOJInputPackage getPackage() {
		return ApogyCommonIOJInputPackage.eINSTANCE;
	}

} //ApogyCommonIOJInputFactoryImpl
