package ca.gc.asc_csa.apogy.addons.ui.impl;
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
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import ca.gc.asc_csa.apogy.addons.ui.Ruler3dToolNodePresentation;
import ca.gc.asc_csa.apogy.addons.ui.ApogyAddonsUIFactory;
import ca.gc.asc_csa.apogy.addons.ui.ApogyAddonsUIPackage;
import ca.gc.asc_csa.apogy.addons.ui.Trajectory3DToolNodePresentation;
import ca.gc.asc_csa.apogy.common.topology.ui.ApogyCommonTopologyUIPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyAddonsUIPackageImpl extends EPackageImpl implements ApogyAddonsUIPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruler3dToolNodePresentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trajectory3DToolNodePresentationEClass = null;

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
	 * @see ca.gc.asc_csa.apogy.addons.ui.ApogyAddonsUIPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ApogyAddonsUIPackageImpl() {
		super(eNS_URI, ApogyAddonsUIFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ApogyAddonsUIPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ApogyAddonsUIPackage init() {
		if (isInited) return (ApogyAddonsUIPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyAddonsUIPackage.eNS_URI);

		// Obtain or create and register package
		ApogyAddonsUIPackageImpl theApogyAddonsUIPackage = (ApogyAddonsUIPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ApogyAddonsUIPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ApogyAddonsUIPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ApogyCommonTopologyUIPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theApogyAddonsUIPackage.createPackageContents();

		// Initialize created meta-data
		theApogyAddonsUIPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theApogyAddonsUIPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ApogyAddonsUIPackage.eNS_URI, theApogyAddonsUIPackage);
		return theApogyAddonsUIPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuler3dToolNodePresentation() {
		return ruler3dToolNodePresentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrajectory3DToolNodePresentation() {
		return trajectory3DToolNodePresentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyAddonsUIFactory getApogyAddonsUIFactory() {
		return (ApogyAddonsUIFactory)getEFactoryInstance();
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
		ruler3dToolNodePresentationEClass = createEClass(RULER3D_TOOL_NODE_PRESENTATION);

		trajectory3DToolNodePresentationEClass = createEClass(TRAJECTORY3_DTOOL_NODE_PRESENTATION);
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
		ApogyCommonTopologyUIPackage theApogyCommonTopologyUIPackage = (ApogyCommonTopologyUIPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCommonTopologyUIPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		ruler3dToolNodePresentationEClass.getESuperTypes().add(theApogyCommonTopologyUIPackage.getNodePresentation());
		trajectory3DToolNodePresentationEClass.getESuperTypes().add(theApogyCommonTopologyUIPackage.getNodePresentation());

		// Initialize classes, features, and operations; add parameters
		initEClass(ruler3dToolNodePresentationEClass, Ruler3dToolNodePresentation.class, "Ruler3dToolNodePresentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(trajectory3DToolNodePresentationEClass, Trajectory3DToolNodePresentation.class, "Trajectory3DToolNodePresentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ApogyAddonsUIPackageImpl
