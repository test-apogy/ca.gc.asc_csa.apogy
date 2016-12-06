package ca.gc.asc_csa.apogy.common.io.jinput.impl;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import ca.gc.asc_csa.apogy.common.io.jinput.ApogyCommonIOJInputFacade;
import net.java.games.input.Component;
import net.java.games.input.Controller;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import ca.gc.asc_csa.apogy.common.io.jinput.EAxis;
import ca.gc.asc_csa.apogy.common.io.jinput.EButton;
import ca.gc.asc_csa.apogy.common.io.jinput.EComponent;
import ca.gc.asc_csa.apogy.common.io.jinput.EComponentQualifier;
import ca.gc.asc_csa.apogy.common.io.jinput.EComponents;
import ca.gc.asc_csa.apogy.common.io.jinput.EController;
import ca.gc.asc_csa.apogy.common.io.jinput.EControllerEnvironment;
import ca.gc.asc_csa.apogy.common.io.jinput.EKey;
import ca.gc.asc_csa.apogy.common.io.jinput.EVirtualComponent;
import ca.gc.asc_csa.apogy.common.io.jinput.ApogyCommonIOJInputFactory;
import ca.gc.asc_csa.apogy.common.io.jinput.ApogyCommonIOJInputPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyCommonIOJInputPackageImpl extends EPackageImpl implements ApogyCommonIOJInputPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apogyCommonIOJInputFacadeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eControllerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eControllerEnvironmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eComponentsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eButtonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eAxisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eKeyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eComponentQualifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eVirtualComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType controllerEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType adapterEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType componentEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType jobEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ca.gc.asc_csa.apogy.common.io.jinput.ApogyCommonIOJInputPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ApogyCommonIOJInputPackageImpl() {
		super(eNS_URI, ApogyCommonIOJInputFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ApogyCommonIOJInputPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ApogyCommonIOJInputPackage init() {
		if (isInited) return (ApogyCommonIOJInputPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCommonIOJInputPackage.eNS_URI);

		// Obtain or create and register package
		ApogyCommonIOJInputPackageImpl theApogyCommonIOJInputPackage = (ApogyCommonIOJInputPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ApogyCommonIOJInputPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ApogyCommonIOJInputPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theApogyCommonIOJInputPackage.createPackageContents();

		// Initialize created meta-data
		theApogyCommonIOJInputPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theApogyCommonIOJInputPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ApogyCommonIOJInputPackage.eNS_URI, theApogyCommonIOJInputPackage);
		return theApogyCommonIOJInputPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApogyCommonIOJInputFacade() {
		return apogyCommonIOJInputFacadeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApogyCommonIOJInputFacade_SelectingComponent() {
		return (EAttribute)apogyCommonIOJInputFacadeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonIOJInputFacade__StartSelectComponent__EComponentQualifier() {
		return apogyCommonIOJInputFacadeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonIOJInputFacade__StopSelectComponent__EComponentQualifier() {
		return apogyCommonIOJInputFacadeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEController() {
		return eControllerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEController_LastPollResult() {
		return (EAttribute)eControllerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEController_Name() {
		return (EAttribute)eControllerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEController_PortNumber() {
		return (EAttribute)eControllerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEController_Type() {
		return (EAttribute)eControllerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEController_PortType() {
		return (EAttribute)eControllerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEController_PojoController() {
		return (EAttribute)eControllerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEController_EComponents() {
		return (EReference)eControllerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEController_ControllerCount() {
		return (EAttribute)eControllerEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEController__Poll() {
		return eControllerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEControllerEnvironment() {
		return eControllerEnvironmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEControllerEnvironment_Supported() {
		return (EAttribute)eControllerEnvironmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEControllerEnvironment_Controllers() {
		return (EReference)eControllerEnvironmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEControllerEnvironment_RefreshRequested() {
		return (EAttribute)eControllerEnvironmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEControllerEnvironment_PollingCount() {
		return (EAttribute)eControllerEnvironmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEControllerEnvironment_PollingJob() {
		return (EAttribute)eControllerEnvironmentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEControllerEnvironment_PollingProblem() {
		return (EAttribute)eControllerEnvironmentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEControllerEnvironment__Refresh() {
		return eControllerEnvironmentEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEControllerEnvironment__StartPolling() {
		return eControllerEnvironmentEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEControllerEnvironment__StopPolling() {
		return eControllerEnvironmentEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEControllerEnvironment__ResolveController__String() {
		return eControllerEnvironmentEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEControllerEnvironment__ResolveEComponent__String_EController() {
		return eControllerEnvironmentEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEControllerEnvironment__ResolveEComponent__EComponentQualifier() {
		return eControllerEnvironmentEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEComponent() {
		return eComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEComponent_DeadZone() {
		return (EAttribute)eComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEComponent_Identifier() {
		return (EAttribute)eComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEComponent_Relative() {
		return (EAttribute)eComponentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEComponent_Analog() {
		return (EAttribute)eComponentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEComponent_Name() {
		return (EAttribute)eComponentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEComponent_PojoComponent() {
		return (EAttribute)eComponentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEComponent_PollData() {
		return (EAttribute)eComponentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEComponent_EComponents() {
		return (EReference)eComponentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEComponents() {
		return eComponentsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEComponents_Components() {
		return (EReference)eComponentsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEComponents_Name() {
		return (EAttribute)eComponentsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEComponents_EController() {
		return (EReference)eComponentsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEButton() {
		return eButtonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEAxis() {
		return eAxisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEKey() {
		return eKeyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEComponentQualifier() {
		return eComponentQualifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEComponentQualifier_EComponentName() {
		return (EAttribute)eComponentQualifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEComponentQualifier_EControllerName() {
		return (EAttribute)eComponentQualifierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEVirtualComponent() {
		return eVirtualComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEVirtualComponent_CurrentValue() {
		return (EAttribute)eVirtualComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getController() {
		return controllerEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAdapter() {
		return adapterEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCommonIOJInputFactory getApogyCommonIOJInputFactory() {
		return (ApogyCommonIOJInputFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getComponent() {
		return componentEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getJob() {
		return jobEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		apogyCommonIOJInputFacadeEClass = createEClass(APOGY_COMMON_IOJ_INPUT_FACADE);
		createEAttribute(apogyCommonIOJInputFacadeEClass, APOGY_COMMON_IOJ_INPUT_FACADE__SELECTING_COMPONENT);
		createEOperation(apogyCommonIOJInputFacadeEClass, APOGY_COMMON_IOJ_INPUT_FACADE___START_SELECT_COMPONENT__ECOMPONENTQUALIFIER);
		createEOperation(apogyCommonIOJInputFacadeEClass, APOGY_COMMON_IOJ_INPUT_FACADE___STOP_SELECT_COMPONENT__ECOMPONENTQUALIFIER);

		eControllerEClass = createEClass(ECONTROLLER);
		createEAttribute(eControllerEClass, ECONTROLLER__LAST_POLL_RESULT);
		createEAttribute(eControllerEClass, ECONTROLLER__NAME);
		createEAttribute(eControllerEClass, ECONTROLLER__PORT_NUMBER);
		createEAttribute(eControllerEClass, ECONTROLLER__TYPE);
		createEAttribute(eControllerEClass, ECONTROLLER__PORT_TYPE);
		createEAttribute(eControllerEClass, ECONTROLLER__POJO_CONTROLLER);
		createEReference(eControllerEClass, ECONTROLLER__ECOMPONENTS);
		createEAttribute(eControllerEClass, ECONTROLLER__CONTROLLER_COUNT);
		createEOperation(eControllerEClass, ECONTROLLER___POLL);

		eControllerEnvironmentEClass = createEClass(ECONTROLLER_ENVIRONMENT);
		createEAttribute(eControllerEnvironmentEClass, ECONTROLLER_ENVIRONMENT__SUPPORTED);
		createEReference(eControllerEnvironmentEClass, ECONTROLLER_ENVIRONMENT__CONTROLLERS);
		createEAttribute(eControllerEnvironmentEClass, ECONTROLLER_ENVIRONMENT__REFRESH_REQUESTED);
		createEAttribute(eControllerEnvironmentEClass, ECONTROLLER_ENVIRONMENT__POLLING_COUNT);
		createEAttribute(eControllerEnvironmentEClass, ECONTROLLER_ENVIRONMENT__POLLING_JOB);
		createEAttribute(eControllerEnvironmentEClass, ECONTROLLER_ENVIRONMENT__POLLING_PROBLEM);
		createEOperation(eControllerEnvironmentEClass, ECONTROLLER_ENVIRONMENT___REFRESH);
		createEOperation(eControllerEnvironmentEClass, ECONTROLLER_ENVIRONMENT___START_POLLING);
		createEOperation(eControllerEnvironmentEClass, ECONTROLLER_ENVIRONMENT___STOP_POLLING);
		createEOperation(eControllerEnvironmentEClass, ECONTROLLER_ENVIRONMENT___RESOLVE_CONTROLLER__STRING);
		createEOperation(eControllerEnvironmentEClass, ECONTROLLER_ENVIRONMENT___RESOLVE_ECOMPONENT__STRING_ECONTROLLER);
		createEOperation(eControllerEnvironmentEClass, ECONTROLLER_ENVIRONMENT___RESOLVE_ECOMPONENT__ECOMPONENTQUALIFIER);

		eComponentEClass = createEClass(ECOMPONENT);
		createEAttribute(eComponentEClass, ECOMPONENT__DEAD_ZONE);
		createEAttribute(eComponentEClass, ECOMPONENT__IDENTIFIER);
		createEAttribute(eComponentEClass, ECOMPONENT__RELATIVE);
		createEAttribute(eComponentEClass, ECOMPONENT__ANALOG);
		createEAttribute(eComponentEClass, ECOMPONENT__NAME);
		createEAttribute(eComponentEClass, ECOMPONENT__POJO_COMPONENT);
		createEAttribute(eComponentEClass, ECOMPONENT__POLL_DATA);
		createEReference(eComponentEClass, ECOMPONENT__ECOMPONENTS);

		eComponentsEClass = createEClass(ECOMPONENTS);
		createEReference(eComponentsEClass, ECOMPONENTS__COMPONENTS);
		createEAttribute(eComponentsEClass, ECOMPONENTS__NAME);
		createEReference(eComponentsEClass, ECOMPONENTS__ECONTROLLER);

		eButtonEClass = createEClass(EBUTTON);

		eAxisEClass = createEClass(EAXIS);

		eKeyEClass = createEClass(EKEY);

		eComponentQualifierEClass = createEClass(ECOMPONENT_QUALIFIER);
		createEAttribute(eComponentQualifierEClass, ECOMPONENT_QUALIFIER__ECOMPONENT_NAME);
		createEAttribute(eComponentQualifierEClass, ECOMPONENT_QUALIFIER__ECONTROLLER_NAME);

		eVirtualComponentEClass = createEClass(EVIRTUAL_COMPONENT);
		createEAttribute(eVirtualComponentEClass, EVIRTUAL_COMPONENT__CURRENT_VALUE);

		// Create data types
		jobEDataType = createEDataType(JOB);
		componentEDataType = createEDataType(COMPONENT);
		controllerEDataType = createEDataType(CONTROLLER);
		adapterEDataType = createEDataType(ADAPTER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		eButtonEClass.getESuperTypes().add(this.getEComponent());
		eAxisEClass.getESuperTypes().add(this.getEComponent());
		eKeyEClass.getESuperTypes().add(this.getEComponent());
		eVirtualComponentEClass.getESuperTypes().add(this.getEComponent());

		// Initialize classes, features, and operations; add parameters
		initEClass(apogyCommonIOJInputFacadeEClass, ApogyCommonIOJInputFacade.class, "ApogyCommonIOJInputFacade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getApogyCommonIOJInputFacade_SelectingComponent(), theEcorePackage.getEBoolean(), "selectingComponent", null, 0, 1, ApogyCommonIOJInputFacade.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getApogyCommonIOJInputFacade__StartSelectComponent__EComponentQualifier(), null, "startSelectComponent", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEComponentQualifier(), "eComponentQualifier", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCommonIOJInputFacade__StopSelectComponent__EComponentQualifier(), null, "stopSelectComponent", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEComponentQualifier(), "eComponentQualifier", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(eControllerEClass, EController.class, "EController", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEController_LastPollResult(), theEcorePackage.getEBoolean(), "lastPollResult", null, 0, 1, EController.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEController_Name(), theEcorePackage.getEString(), "name", "", 0, 1, EController.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEController_PortNumber(), theEcorePackage.getEInt(), "portNumber", null, 0, 1, EController.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getEController_Type(), theEcorePackage.getEString(), "type", null, 0, 1, EController.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getEController_PortType(), theEcorePackage.getEString(), "portType", null, 0, 1, EController.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getEController_PojoController(), this.getController(), "pojoController", null, 0, 1, EController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEController_EComponents(), this.getEComponents(), this.getEComponents_EController(), "eComponents", null, 1, 1, EController.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEController_ControllerCount(), theEcorePackage.getEInt(), "controllerCount", "-1", 0, 1, EController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getEController__Poll(), theEcorePackage.getEBoolean(), "poll", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(eControllerEnvironmentEClass, EControllerEnvironment.class, "EControllerEnvironment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEControllerEnvironment_Supported(), theEcorePackage.getEBoolean(), "supported", null, 0, 1, EControllerEnvironment.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEControllerEnvironment_Controllers(), this.getEController(), null, "controllers", null, 0, -1, EControllerEnvironment.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEControllerEnvironment_RefreshRequested(), theEcorePackage.getEBoolean(), "refreshRequested", "true", 0, 1, EControllerEnvironment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEControllerEnvironment_PollingCount(), theEcorePackage.getELong(), "pollingCount", null, 0, 1, EControllerEnvironment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEControllerEnvironment_PollingJob(), this.getJob(), "pollingJob", null, 0, 1, EControllerEnvironment.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEControllerEnvironment_PollingProblem(), theEcorePackage.getEBoolean(), "pollingProblem", null, 0, 1, EControllerEnvironment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getEControllerEnvironment__Refresh(), null, "refresh", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getEControllerEnvironment__StartPolling(), null, "startPolling", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getEControllerEnvironment__StopPolling(), null, "stopPolling", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEControllerEnvironment__ResolveController__String(), this.getEController(), "resolveController", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "controllerName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEControllerEnvironment__ResolveEComponent__String_EController(), this.getEComponent(), "resolveEComponent", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "componentName", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEController(), "eController", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEControllerEnvironment__ResolveEComponent__EComponentQualifier(), this.getEComponent(), "resolveEComponent", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEComponentQualifier(), "eComponentQualifier", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(eComponentEClass, EComponent.class, "EComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEComponent_DeadZone(), theEcorePackage.getEFloat(), "deadZone", null, 0, 1, EComponent.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getEComponent_Identifier(), theEcorePackage.getEString(), "identifier", null, 0, 1, EComponent.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getEComponent_Relative(), theEcorePackage.getEBoolean(), "relative", null, 0, 1, EComponent.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getEComponent_Analog(), theEcorePackage.getEBoolean(), "analog", null, 0, 1, EComponent.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getEComponent_Name(), theEcorePackage.getEString(), "name", null, 0, 1, EComponent.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getEComponent_PojoComponent(), this.getComponent(), "pojoComponent", null, 0, 1, EComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEComponent_PollData(), theEcorePackage.getEFloat(), "pollData", null, 0, 1, EComponent.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEComponent_EComponents(), this.getEComponents(), this.getEComponents_Components(), "eComponents", null, 0, 1, EComponent.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eComponentsEClass, EComponents.class, "EComponents", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEComponents_Components(), this.getEComponent(), this.getEComponent_EComponents(), "components", null, 0, -1, EComponents.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEComponents_Name(), theEcorePackage.getEString(), "name", "", 0, 1, EComponents.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEComponents_EController(), this.getEController(), this.getEController_EComponents(), "eController", null, 0, 1, EComponents.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eButtonEClass, EButton.class, "EButton", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eAxisEClass, EAxis.class, "EAxis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eKeyEClass, EKey.class, "EKey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eComponentQualifierEClass, EComponentQualifier.class, "EComponentQualifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEComponentQualifier_EComponentName(), theEcorePackage.getEString(), "eComponentName", null, 1, 1, EComponentQualifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEComponentQualifier_EControllerName(), theEcorePackage.getEString(), "eControllerName", null, 1, 1, EComponentQualifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eVirtualComponentEClass, EVirtualComponent.class, "EVirtualComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEVirtualComponent_CurrentValue(), theEcorePackage.getEFloat(), "currentValue", null, 0, 1, EVirtualComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(jobEDataType, Job.class, "Job", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(componentEDataType, Component.class, "Component", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(controllerEDataType, Controller.class, "Controller", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(adapterEDataType, Adapter.class, "Adapter", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "documentation", "Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    Pierre Allard (Pierre.Allard@canada.ca),\n    Regent L\'Archeveque (Regent.Larcheveque@canada.ca),\n    Sebastien Gemme (Sebastien.Gemme@canada.ca),\n    Canadian Space Agency (CSA) - Initial API and implementation",
			 "prefix", "ApogyCommonIOJInput",
			 "childCreationExtenders", "true",
			 "extensibleProviderFactory", "true",
			 "multipleEditorPages", "false",
			 "copyrightText", "Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    Pierre Allard (Pierre.Allard@canada.ca), \n    Regent L\'Archeveque (Regent.Larcheveque@canada.ca),\n    Sebastien Gemme (Sebastien.Gemme@canada.ca),\n    Canadian Space Agency (CSA) - Initial API and implementation",
			 "modelName", "ApogyCommonIOJInput",
			 "suppressGenModelAnnotations", "false",
			 "modelDirectory", "/ca.gc.asc_csa.apogy.common.io.jinput/src-generated",
			 "editDirectory", "/ca.gc.asc_csa.apogy.common.io.jinput.edit/src-generated",
			 "basePackage", "ca.gc.asc_csa.apogy.common.io"
		   });
	}

} //ApogyCommonIOJInputPackageImpl
