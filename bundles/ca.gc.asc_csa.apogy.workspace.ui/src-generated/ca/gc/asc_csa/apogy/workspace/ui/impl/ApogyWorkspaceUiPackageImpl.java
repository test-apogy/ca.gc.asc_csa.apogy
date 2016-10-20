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
package ca.gc.asc_csa.apogy.workspace.ui.impl;

import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage;
import ca.gc.asc_csa.apogy.workspace.ui.ApogyWorkspaceUiFacade;
import ca.gc.asc_csa.apogy.workspace.ui.ApogyWorkspaceUiFactory;
import ca.gc.asc_csa.apogy.workspace.ui.ApogyWorkspaceUiPackage;
import ca.gc.asc_csa.apogy.workspace.ui.NewProjectSettings;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyWorkspaceUiPackageImpl extends EPackageImpl implements ApogyWorkspaceUiPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apogyWorkspaceUiFacadeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass newProjectSettingsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType iProjectEDataType = null;

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
	 * @see ca.gc.asc_csa.apogy.workspace.ui.ApogyWorkspaceUiPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ApogyWorkspaceUiPackageImpl() {
		super(eNS_URI, ApogyWorkspaceUiFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ApogyWorkspaceUiPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ApogyWorkspaceUiPackage init() {
		if (isInited) return (ApogyWorkspaceUiPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyWorkspaceUiPackage.eNS_URI);

		// Obtain or create and register package
		ApogyWorkspaceUiPackageImpl theApogyWorkspaceUiPackage = (ApogyWorkspaceUiPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ApogyWorkspaceUiPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ApogyWorkspaceUiPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ApogyCommonEMFPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theApogyWorkspaceUiPackage.createPackageContents();

		// Initialize created meta-data
		theApogyWorkspaceUiPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theApogyWorkspaceUiPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ApogyWorkspaceUiPackage.eNS_URI, theApogyWorkspaceUiPackage);
		return theApogyWorkspaceUiPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApogyWorkspaceUiFacade() {
		return apogyWorkspaceUiFacadeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNewProjectSettings() {
		return newProjectSettingsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNewProjectSettings__ApplyDefaultValues() {
		return newProjectSettingsEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIProject() {
		return iProjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyWorkspaceUiFactory getApogyWorkspaceUiFactory() {
		return (ApogyWorkspaceUiFactory)getEFactoryInstance();
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
		apogyWorkspaceUiFacadeEClass = createEClass(APOGY_WORKSPACE_UI_FACADE);

		newProjectSettingsEClass = createEClass(NEW_PROJECT_SETTINGS);
		createEOperation(newProjectSettingsEClass, NEW_PROJECT_SETTINGS___APPLY_DEFAULT_VALUES);

		// Create data types
		iProjectEDataType = createEDataType(IPROJECT);
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
		ApogyCommonEMFPackage theApogyCommonEMFPackage = (ApogyCommonEMFPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCommonEMFPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		newProjectSettingsEClass.getESuperTypes().add(theApogyCommonEMFPackage.getNamed());
		newProjectSettingsEClass.getESuperTypes().add(theApogyCommonEMFPackage.getDescribed());

		// Initialize classes, features, and operations; add parameters
		initEClass(apogyWorkspaceUiFacadeEClass, ApogyWorkspaceUiFacade.class, "ApogyWorkspaceUiFacade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(newProjectSettingsEClass, NewProjectSettings.class, "NewProjectSettings", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getNewProjectSettings__ApplyDefaultValues(), null, "applyDefaultValues", 0, 1, !IS_UNIQUE, IS_ORDERED);

		// Initialize data types
		initEDataType(iProjectEDataType, IProject.class, "IProject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ApogyWorkspaceUiPackageImpl
