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
package ca.gc.asc_csa.apogy.workspace.impl;

import ca.gc.asc_csa.apogy.core.ApogyCorePackage;
import ca.gc.asc_csa.apogy.workspace.ApogyWorkspaceFacade;
import ca.gc.asc_csa.apogy.workspace.ApogyWorkspaceFactory;
import ca.gc.asc_csa.apogy.workspace.ApogyWorkspacePackage;
import java.util.List;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyWorkspacePackageImpl extends EPackageImpl implements ApogyWorkspacePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apogyWorkspaceFacadeEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType iProjectEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType listApogyProjectsEDataType = null;
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
	 * @see ca.gc.asc_csa.apogy.workspace.ApogyWorkspacePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ApogyWorkspacePackageImpl() {
		super(eNS_URI, ApogyWorkspaceFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ApogyWorkspacePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ApogyWorkspacePackage init() {
		if (isInited) return (ApogyWorkspacePackage)EPackage.Registry.INSTANCE.getEPackage(ApogyWorkspacePackage.eNS_URI);

		// Obtain or create and register package
		ApogyWorkspacePackageImpl theApogyWorkspacePackage = (ApogyWorkspacePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ApogyWorkspacePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ApogyWorkspacePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ApogyCorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theApogyWorkspacePackage.createPackageContents();

		// Initialize created meta-data
		theApogyWorkspacePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theApogyWorkspacePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ApogyWorkspacePackage.eNS_URI, theApogyWorkspacePackage);
		return theApogyWorkspacePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApogyWorkspaceFacade() {
		return apogyWorkspaceFacadeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApogyWorkspaceFacade_DefaultProjectNamePrefix() {
		return (EAttribute)apogyWorkspaceFacadeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApogyWorkspaceFacade_DefaultSessionFilename() {
		return (EAttribute)apogyWorkspaceFacadeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApogyWorkspaceFacade_DefaultSessionFilenameExtension() {
		return (EAttribute)apogyWorkspaceFacadeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApogyWorkspaceFacade_DefaultSessionFolderName() {
		return (EAttribute)apogyWorkspaceFacadeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyWorkspaceFacade__GetDefaultProjectName() {
		return apogyWorkspaceFacadeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyWorkspaceFacade__CreateApogyProject__String_String() {
		return apogyWorkspaceFacadeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyWorkspaceFacade__GetApogyProjects() {
		return apogyWorkspaceFacadeEClass.getEOperations().get(2);
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
	public EDataType getListApogyProjects() {
		return listApogyProjectsEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyWorkspaceFactory getApogyWorkspaceFactory() {
		return (ApogyWorkspaceFactory)getEFactoryInstance();
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
		apogyWorkspaceFacadeEClass = createEClass(APOGY_WORKSPACE_FACADE);
		createEAttribute(apogyWorkspaceFacadeEClass, APOGY_WORKSPACE_FACADE__DEFAULT_PROJECT_NAME_PREFIX);
		createEAttribute(apogyWorkspaceFacadeEClass, APOGY_WORKSPACE_FACADE__DEFAULT_SESSION_FILENAME);
		createEAttribute(apogyWorkspaceFacadeEClass, APOGY_WORKSPACE_FACADE__DEFAULT_SESSION_FILENAME_EXTENSION);
		createEAttribute(apogyWorkspaceFacadeEClass, APOGY_WORKSPACE_FACADE__DEFAULT_SESSION_FOLDER_NAME);
		createEOperation(apogyWorkspaceFacadeEClass, APOGY_WORKSPACE_FACADE___GET_DEFAULT_PROJECT_NAME);
		createEOperation(apogyWorkspaceFacadeEClass, APOGY_WORKSPACE_FACADE___CREATE_APOGY_PROJECT__STRING_STRING);
		createEOperation(apogyWorkspaceFacadeEClass, APOGY_WORKSPACE_FACADE___GET_APOGY_PROJECTS);

		// Create data types
		iProjectEDataType = createEDataType(IPROJECT);
		listApogyProjectsEDataType = createEDataType(LIST_APOGY_PROJECTS);
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
		ApogyCorePackage theApogyCorePackage = (ApogyCorePackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(apogyWorkspaceFacadeEClass, ApogyWorkspaceFacade.class, "ApogyWorkspaceFacade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getApogyWorkspaceFacade_DefaultProjectNamePrefix(), theEcorePackage.getEString(), "defaultProjectNamePrefix", "Project", 0, 1, ApogyWorkspaceFacade.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApogyWorkspaceFacade_DefaultSessionFilename(), theEcorePackage.getEString(), "defaultSessionFilename", "session", 0, 1, ApogyWorkspaceFacade.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApogyWorkspaceFacade_DefaultSessionFilenameExtension(), theEcorePackage.getEString(), "defaultSessionFilenameExtension", "sym", 0, 1, ApogyWorkspaceFacade.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApogyWorkspaceFacade_DefaultSessionFolderName(), theEcorePackage.getEString(), "defaultSessionFolderName", "Sessions", 0, 1, ApogyWorkspaceFacade.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getApogyWorkspaceFacade__GetDefaultProjectName(), theEcorePackage.getEString(), "getDefaultProjectName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getApogyWorkspaceFacade__CreateApogyProject__String_String(), this.getIProject(), "createApogyProject", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "name", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "description", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, theApogyCorePackage.getException());

		initEOperation(getApogyWorkspaceFacade__GetApogyProjects(), this.getListApogyProjects(), "getApogyProjects", 0, 1, !IS_UNIQUE, IS_ORDERED);

		// Initialize data types
		initEDataType(iProjectEDataType, IProject.class, "IProject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(listApogyProjectsEDataType, List.class, "ListApogyProjects", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS, "java.util.List<org.eclipse.core.resources.IProject>");

		// Create resource
		createResource(eNS_URI);
	}

} //ApogyWorkspacePackageImpl
