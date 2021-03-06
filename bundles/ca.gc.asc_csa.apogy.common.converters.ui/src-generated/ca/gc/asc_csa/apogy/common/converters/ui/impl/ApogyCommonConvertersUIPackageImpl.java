package ca.gc.asc_csa.apogy.common.converters.ui.impl;
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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.jface.viewers.ISelection;

import ca.gc.asc_csa.apogy.common.converters.ApogyCommonConvertersPackage;

import ca.gc.asc_csa.apogy.common.converters.ui.ApogyCommonConvertersUIFacade;
import ca.gc.asc_csa.apogy.common.converters.ui.ApogyCommonConvertersUIFactory;
import ca.gc.asc_csa.apogy.common.converters.ui.ApogyCommonConvertersUIPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyCommonConvertersUIPackageImpl extends EPackageImpl implements ApogyCommonConvertersUIPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apogyCommonConvertersUIFacadeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType iSelectionEDataType = null;

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
	 * @see ca.gc.asc_csa.apogy.common.converters.ui.ApogyCommonConvertersUIPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ApogyCommonConvertersUIPackageImpl() {
		super(eNS_URI, ApogyCommonConvertersUIFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ApogyCommonConvertersUIPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ApogyCommonConvertersUIPackage init() {
		if (isInited) return (ApogyCommonConvertersUIPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCommonConvertersUIPackage.eNS_URI);

		// Obtain or create and register package
		ApogyCommonConvertersUIPackageImpl theApogyCommonConvertersUIPackage = (ApogyCommonConvertersUIPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ApogyCommonConvertersUIPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ApogyCommonConvertersUIPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theApogyCommonConvertersUIPackage.createPackageContents();

		// Initialize created meta-data
		theApogyCommonConvertersUIPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theApogyCommonConvertersUIPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ApogyCommonConvertersUIPackage.eNS_URI, theApogyCommonConvertersUIPackage);
		return theApogyCommonConvertersUIPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApogyCommonConvertersUIFacade() {
		return apogyCommonConvertersUIFacadeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonConvertersUIFacade__Convert__ISelection_Class() {
		return apogyCommonConvertersUIFacadeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getISelection() {
		return iSelectionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCommonConvertersUIFactory getApogyCommonConvertersUIFactory() {
		return (ApogyCommonConvertersUIFactory)getEFactoryInstance();
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
		apogyCommonConvertersUIFacadeEClass = createEClass(APOGY_COMMON_CONVERTERS_UI_FACADE);
		createEOperation(apogyCommonConvertersUIFacadeEClass, APOGY_COMMON_CONVERTERS_UI_FACADE___CONVERT__ISELECTION_CLASS);

		// Create data types
		iSelectionEDataType = createEDataType(ISELECTION);
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
		ApogyCommonConvertersPackage theApogyCommonConvertersPackage = (ApogyCommonConvertersPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCommonConvertersPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(apogyCommonConvertersUIFacadeEClass, ApogyCommonConvertersUIFacade.class, "ApogyCommonConvertersUIFacade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getApogyCommonConvertersUIFacade__Convert__ISelection_Class(), null, "convert", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getISelection(), "selection", 0, 1, !IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(theEcorePackage.getEJavaClass());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "targetType", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theApogyCommonConvertersPackage.getList());
		g2 = createEGenericType(theEcorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		// Initialize data types
		initEDataType(iSelectionEDataType, ISelection.class, "ISelection", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ApogyCommonConvertersUIPackageImpl
