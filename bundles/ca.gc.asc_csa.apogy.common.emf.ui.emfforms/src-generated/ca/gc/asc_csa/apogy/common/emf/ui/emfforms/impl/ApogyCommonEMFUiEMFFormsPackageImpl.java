/**
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
package ca.gc.asc_csa.apogy.common.emf.ui.emfforms.impl;

import ca.gc.asc_csa.apogy.common.emf.ui.emfforms.ApogyCommonEMFUiEMFFormsFacade;
import ca.gc.asc_csa.apogy.common.emf.ui.emfforms.ApogyCommonEMFUiEMFFormsFactory;
import ca.gc.asc_csa.apogy.common.emf.ui.emfforms.ApogyCommonEMFUiEMFFormsPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.swt.widgets.Composite;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyCommonEMFUiEMFFormsPackageImpl extends EPackageImpl implements ApogyCommonEMFUiEMFFormsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apogyCommonEMFUiEMFFormsFacadeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType compositeEDataType = null;

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
	 * @see ca.gc.asc_csa.apogy.common.emf.ui.emfforms.ApogyCommonEMFUiEMFFormsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ApogyCommonEMFUiEMFFormsPackageImpl() {
		super(eNS_URI, ApogyCommonEMFUiEMFFormsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ApogyCommonEMFUiEMFFormsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ApogyCommonEMFUiEMFFormsPackage init() {
		if (isInited) return (ApogyCommonEMFUiEMFFormsPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCommonEMFUiEMFFormsPackage.eNS_URI);

		// Obtain or create and register package
		ApogyCommonEMFUiEMFFormsPackageImpl theApogyCommonEMFUiEMFFormsPackage = (ApogyCommonEMFUiEMFFormsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ApogyCommonEMFUiEMFFormsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ApogyCommonEMFUiEMFFormsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theApogyCommonEMFUiEMFFormsPackage.createPackageContents();

		// Initialize created meta-data
		theApogyCommonEMFUiEMFFormsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theApogyCommonEMFUiEMFFormsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ApogyCommonEMFUiEMFFormsPackage.eNS_URI, theApogyCommonEMFUiEMFFormsPackage);
		return theApogyCommonEMFUiEMFFormsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApogyCommonEMFUiEMFFormsFacade() {
		return apogyCommonEMFUiEMFFormsFacadeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonEMFUiEMFFormsFacade__CreateEMFForms__Composite_EObject() {
		return apogyCommonEMFUiEMFFormsFacadeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonEMFUiEMFFormsFacade__CreateEMFForms__Composite_EObject_boolean() {
		return apogyCommonEMFUiEMFFormsFacadeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getComposite() {
		return compositeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCommonEMFUiEMFFormsFactory getApogyCommonEMFUiEMFFormsFactory() {
		return (ApogyCommonEMFUiEMFFormsFactory)getEFactoryInstance();
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
		apogyCommonEMFUiEMFFormsFacadeEClass = createEClass(APOGY_COMMON_EMF_UI_EMF_FORMS_FACADE);
		createEOperation(apogyCommonEMFUiEMFFormsFacadeEClass, APOGY_COMMON_EMF_UI_EMF_FORMS_FACADE___CREATE_EMF_FORMS__COMPOSITE_EOBJECT);
		createEOperation(apogyCommonEMFUiEMFFormsFacadeEClass, APOGY_COMMON_EMF_UI_EMF_FORMS_FACADE___CREATE_EMF_FORMS__COMPOSITE_EOBJECT_BOOLEAN);

		// Create data types
		compositeEDataType = createEDataType(COMPOSITE);
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

		// Initialize classes, features, and operations; add parameters
		initEClass(apogyCommonEMFUiEMFFormsFacadeEClass, ApogyCommonEMFUiEMFFormsFacade.class, "ApogyCommonEMFUiEMFFormsFacade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getApogyCommonEMFUiEMFFormsFacade__CreateEMFForms__Composite_EObject(), null, "createEMFForms", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getComposite(), "parent", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEObject(), "eObject", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCommonEMFUiEMFFormsFacade__CreateEMFForms__Composite_EObject_boolean(), null, "createEMFForms", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getComposite(), "parent", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEObject(), "eObject", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEBoolean(), "readOnly", 0, 1, !IS_UNIQUE, IS_ORDERED);

		// Initialize data types
		initEDataType(compositeEDataType, Composite.class, "Composite", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ApogyCommonEMFUiEMFFormsPackageImpl
