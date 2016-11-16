/**
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *  
 *  Contributors:
 *      Pierre Allard (Pierre.Allard@canada.ca), 
 *      Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *      Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *      Olivier L. Larouche (Olivier.LLarouche@canada.ca),
 *      Canadian Space Agency (CSA) - Initial API and implementation
 */
package ca.gc.asc_csa.apogy.core.programs.controllers.ui.impl;

import ca.gc.asc_csa.apogy.core.programs.controllers.ApogyCoreProgramsControllersPackage;

import ca.gc.asc_csa.apogy.core.programs.controllers.ui.ApogyCoreProgramsControllersUIFactory;
import ca.gc.asc_csa.apogy.core.programs.controllers.ui.ApogyCoreProgramsControllersUIPackage;
import ca.gc.asc_csa.apogy.core.programs.controllers.ui.ControllerBindingsSelection;
import ca.gc.asc_csa.apogy.core.programs.controllers.ui.ControllerConfigsPartSelection;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyCoreProgramsControllersUIPackageImpl extends EPackageImpl implements ApogyCoreProgramsControllersUIPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controllerConfigsPartSelectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controllerBindingsSelectionEClass = null;

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
	 * @see ca.gc.asc_csa.apogy.core.programs.controllers.ui.ApogyCoreProgramsControllersUIPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ApogyCoreProgramsControllersUIPackageImpl() {
		super(eNS_URI, ApogyCoreProgramsControllersUIFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ApogyCoreProgramsControllersUIPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ApogyCoreProgramsControllersUIPackage init() {
		if (isInited) return (ApogyCoreProgramsControllersUIPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCoreProgramsControllersUIPackage.eNS_URI);

		// Obtain or create and register package
		ApogyCoreProgramsControllersUIPackageImpl theApogyCoreProgramsControllersUIPackage = (ApogyCoreProgramsControllersUIPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ApogyCoreProgramsControllersUIPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ApogyCoreProgramsControllersUIPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ApogyCoreProgramsControllersPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theApogyCoreProgramsControllersUIPackage.createPackageContents();

		// Initialize created meta-data
		theApogyCoreProgramsControllersUIPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theApogyCoreProgramsControllersUIPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ApogyCoreProgramsControllersUIPackage.eNS_URI, theApogyCoreProgramsControllersUIPackage);
		return theApogyCoreProgramsControllersUIPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControllerConfigsPartSelection() {
		return controllerConfigsPartSelectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControllerConfigsPartSelection_ControllersConfiguration() {
		return (EReference)controllerConfigsPartSelectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControllerBindingsSelection() {
		return controllerBindingsSelectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControllerBindingsSelection_OperationCallControllerBinding() {
		return (EReference)controllerBindingsSelectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCoreProgramsControllersUIFactory getApogyCoreProgramsControllersUIFactory() {
		return (ApogyCoreProgramsControllersUIFactory)getEFactoryInstance();
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
		controllerConfigsPartSelectionEClass = createEClass(CONTROLLER_CONFIGS_PART_SELECTION);
		createEReference(controllerConfigsPartSelectionEClass, CONTROLLER_CONFIGS_PART_SELECTION__CONTROLLERS_CONFIGURATION);

		controllerBindingsSelectionEClass = createEClass(CONTROLLER_BINDINGS_SELECTION);
		createEReference(controllerBindingsSelectionEClass, CONTROLLER_BINDINGS_SELECTION__OPERATION_CALL_CONTROLLER_BINDING);
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
		ApogyCoreProgramsControllersPackage theApogyCoreProgramsControllersPackage = (ApogyCoreProgramsControllersPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCoreProgramsControllersPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(controllerConfigsPartSelectionEClass, ControllerConfigsPartSelection.class, "ControllerConfigsPartSelection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getControllerConfigsPartSelection_ControllersConfiguration(), theApogyCoreProgramsControllersPackage.getControllersConfiguration(), null, "controllersConfiguration", null, 0, 1, ControllerConfigsPartSelection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controllerBindingsSelectionEClass, ControllerBindingsSelection.class, "ControllerBindingsSelection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getControllerBindingsSelection_OperationCallControllerBinding(), theApogyCoreProgramsControllersPackage.getOperationCallControllerBinding(), null, "operationCallControllerBinding", null, 0, 1, ControllerBindingsSelection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ApogyCoreProgramsControllersUIPackageImpl
