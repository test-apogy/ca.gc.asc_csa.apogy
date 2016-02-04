package ca.gc.asc_csa.apogy.common.geometry.data25d.ui.impl;
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
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import ca.gc.asc_csa.apogy.common.geometry.data25d.ApogyCommonGeometryData25DPackage;
import ca.gc.asc_csa.apogy.common.geometry.data25d.ui.ApogyCommonGeometryData25DUIFactory;
import ca.gc.asc_csa.apogy.common.geometry.data25d.ui.ApogyCommonGeometryData25DUIPackage;
import ca.gc.asc_csa.apogy.common.geometry.data25d.ui.VolumetricCoordinatesSet25DPresentation;
import ca.gc.asc_csa.apogy.common.topology.ui.ApogyCommonTopologyUIPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyCommonGeometryData25DUIPackageImpl extends EPackageImpl implements ApogyCommonGeometryData25DUIPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass volumetricCoordinatesSet25DPresentationEClass = null;

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
	 * @see ca.gc.asc_csa.apogy.common.geometry.data25d.ui.ApogyCommonGeometryData25DUIPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ApogyCommonGeometryData25DUIPackageImpl() {
		super(eNS_URI, ApogyCommonGeometryData25DUIFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ApogyCommonGeometryData25DUIPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ApogyCommonGeometryData25DUIPackage init() {
		if (isInited) return (ApogyCommonGeometryData25DUIPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCommonGeometryData25DUIPackage.eNS_URI);

		// Obtain or create and register package
		ApogyCommonGeometryData25DUIPackageImpl theApogyCommonGeometryData25DUIPackage = (ApogyCommonGeometryData25DUIPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ApogyCommonGeometryData25DUIPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ApogyCommonGeometryData25DUIPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ApogyCommonTopologyUIPackage.eINSTANCE.eClass();
		ApogyCommonGeometryData25DPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theApogyCommonGeometryData25DUIPackage.createPackageContents();

		// Initialize created meta-data
		theApogyCommonGeometryData25DUIPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theApogyCommonGeometryData25DUIPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ApogyCommonGeometryData25DUIPackage.eNS_URI, theApogyCommonGeometryData25DUIPackage);
		return theApogyCommonGeometryData25DUIPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVolumetricCoordinatesSet25DPresentation() {
		return volumetricCoordinatesSet25DPresentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVolumetricCoordinatesSet25DPresentation_PointsCloud() {
		return (EReference)volumetricCoordinatesSet25DPresentationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCommonGeometryData25DUIFactory getApogyCommonGeometryData25DUIFactory() {
		return (ApogyCommonGeometryData25DUIFactory)getEFactoryInstance();
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
		volumetricCoordinatesSet25DPresentationEClass = createEClass(VOLUMETRIC_COORDINATES_SET25_DPRESENTATION);
		createEReference(volumetricCoordinatesSet25DPresentationEClass, VOLUMETRIC_COORDINATES_SET25_DPRESENTATION__POINTS_CLOUD);
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
		ApogyCommonGeometryData25DPackage theApogyCommonGeometryData25DPackage = (ApogyCommonGeometryData25DPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCommonGeometryData25DPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		volumetricCoordinatesSet25DPresentationEClass.getESuperTypes().add(theApogyCommonTopologyUIPackage.getNodePresentation());

		// Initialize classes, features, and operations; add parameters
		initEClass(volumetricCoordinatesSet25DPresentationEClass, VolumetricCoordinatesSet25DPresentation.class, "VolumetricCoordinatesSet25DPresentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVolumetricCoordinatesSet25DPresentation_PointsCloud(), theApogyCommonGeometryData25DPackage.getVolumetricCoordinatesSet25D(), null, "pointsCloud", null, 0, 1, VolumetricCoordinatesSet25DPresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ApogyCommonGeometryData25DUIPackageImpl
