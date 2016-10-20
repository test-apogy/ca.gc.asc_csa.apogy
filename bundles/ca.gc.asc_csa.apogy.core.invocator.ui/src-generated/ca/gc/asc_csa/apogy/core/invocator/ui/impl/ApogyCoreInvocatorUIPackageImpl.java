package ca.gc.asc_csa.apogy.core.invocator.ui.impl;
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

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import ca.gc.asc_csa.apogy.core.invocator.ui.ApogyCoreInvocatorUIFacade;
import ca.gc.asc_csa.apogy.core.invocator.ui.ApogyCoreInvocatorUIFactory;
import ca.gc.asc_csa.apogy.core.invocator.ui.ApogyCoreInvocatorUIPackage;
import ca.gc.asc_csa.apogy.core.invocator.ui.NewProgramSettings;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyCoreInvocatorUIPackageImpl extends EPackageImpl implements ApogyCoreInvocatorUIPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass newProgramSettingsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apogyCoreInvocatorUIFacadeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType compoundCommandEDataType = null;

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
	 * @see ca.gc.asc_csa.apogy.core.invocator.ui.ApogyCoreInvocatorUIPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ApogyCoreInvocatorUIPackageImpl() {
		super(eNS_URI, ApogyCoreInvocatorUIFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ApogyCoreInvocatorUIPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ApogyCoreInvocatorUIPackage init() {
		if (isInited) return (ApogyCoreInvocatorUIPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCoreInvocatorUIPackage.eNS_URI);

		// Obtain or create and register package
		ApogyCoreInvocatorUIPackageImpl theApogyCoreInvocatorUIPackage = (ApogyCoreInvocatorUIPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ApogyCoreInvocatorUIPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ApogyCoreInvocatorUIPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ApogyCoreInvocatorPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theApogyCoreInvocatorUIPackage.createPackageContents();

		// Initialize created meta-data
		theApogyCoreInvocatorUIPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theApogyCoreInvocatorUIPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ApogyCoreInvocatorUIPackage.eNS_URI, theApogyCoreInvocatorUIPackage);
		return theApogyCoreInvocatorUIPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNewProgramSettings() {
		return newProgramSettingsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNewProgramSettings_EClass() {
		return (EReference)newProgramSettingsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNewProgramSettings_ProgramSettings() {
		return (EReference)newProgramSettingsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApogyCoreInvocatorUIFacade() {
		return apogyCoreInvocatorUIFacadeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreInvocatorUIFacade__CopyInitializationData__Context_Context() {
		return apogyCoreInvocatorUIFacadeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreInvocatorUIFacade__CopyInitializationData__AbstractTypeImplementation_AbstractTypeImplementation_CompoundCommand() {
		return apogyCoreInvocatorUIFacadeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCompoundCommand() {
		return compoundCommandEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCoreInvocatorUIFactory getApogyCoreInvocatorUIFactory() {
		return (ApogyCoreInvocatorUIFactory)getEFactoryInstance();
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
		newProgramSettingsEClass = createEClass(NEW_PROGRAM_SETTINGS);
		createEReference(newProgramSettingsEClass, NEW_PROGRAM_SETTINGS__ECLASS);
		createEReference(newProgramSettingsEClass, NEW_PROGRAM_SETTINGS__PROGRAM_SETTINGS);

		apogyCoreInvocatorUIFacadeEClass = createEClass(APOGY_CORE_INVOCATOR_UI_FACADE);
		createEOperation(apogyCoreInvocatorUIFacadeEClass, APOGY_CORE_INVOCATOR_UI_FACADE___COPY_INITIALIZATION_DATA__CONTEXT_CONTEXT);
		createEOperation(apogyCoreInvocatorUIFacadeEClass, APOGY_CORE_INVOCATOR_UI_FACADE___COPY_INITIALIZATION_DATA__ABSTRACTTYPEIMPLEMENTATION_ABSTRACTTYPEIMPLEMENTATION_COMPOUNDCOMMAND);

		// Create data types
		compoundCommandEDataType = createEDataType(COMPOUND_COMMAND);
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
		ApogyCoreInvocatorPackage theApogyCoreInvocatorPackage = (ApogyCoreInvocatorPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCoreInvocatorPackage.eNS_URI);
		ApogyCommonEMFPackage theApogyCommonEMFPackage = (ApogyCommonEMFPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCommonEMFPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(newProgramSettingsEClass, NewProgramSettings.class, "NewProgramSettings", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNewProgramSettings_EClass(), theEcorePackage.getEClass(), null, "eClass", null, 0, 1, NewProgramSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNewProgramSettings_ProgramSettings(), theApogyCoreInvocatorPackage.getProgramSettings(), null, "programSettings", null, 0, 1, NewProgramSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(apogyCoreInvocatorUIFacadeEClass, ApogyCoreInvocatorUIFacade.class, "ApogyCoreInvocatorUIFacade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getApogyCoreInvocatorUIFacade__CopyInitializationData__Context_Context(), null, "copyInitializationData", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCoreInvocatorPackage.getContext(), "source", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCoreInvocatorPackage.getContext(), "destination", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, theApogyCommonEMFPackage.getException());

		op = initEOperation(getApogyCoreInvocatorUIFacade__CopyInitializationData__AbstractTypeImplementation_AbstractTypeImplementation_CompoundCommand(), null, "copyInitializationData", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCoreInvocatorPackage.getAbstractTypeImplementation(), "source", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCoreInvocatorPackage.getAbstractTypeImplementation(), "destination", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCompoundCommand(), "command", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, theApogyCommonEMFPackage.getException());

		// Initialize data types
		initEDataType(compoundCommandEDataType, CompoundCommand.class, "CompoundCommand", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ApogyCoreInvocatorUIPackageImpl
