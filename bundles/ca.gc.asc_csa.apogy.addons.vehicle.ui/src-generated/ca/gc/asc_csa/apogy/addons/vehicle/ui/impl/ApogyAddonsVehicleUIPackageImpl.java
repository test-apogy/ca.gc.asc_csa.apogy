package ca.gc.asc_csa.apogy.addons.vehicle.ui.impl;
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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import ca.gc.asc_csa.apogy.addons.vehicle.ui.LanderSphericalFootPresentation;
import ca.gc.asc_csa.apogy.addons.vehicle.ui.PhysicalWheelPresentation;
import ca.gc.asc_csa.apogy.addons.vehicle.ui.ApogyAddonsVehicleUIFactory;
import ca.gc.asc_csa.apogy.addons.vehicle.ui.ApogyAddonsVehicleUIPackage;
import ca.gc.asc_csa.apogy.addons.vehicle.ui.ThrusterPresentation;
import ca.gc.asc_csa.apogy.common.topology.ui.ApogyCommonTopologyUIPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyAddonsVehicleUIPackageImpl extends EPackageImpl implements ApogyAddonsVehicleUIPackage
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass physicalWheelPresentationEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass landerSphericalFootPresentationEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass thrusterPresentationEClass = null;

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
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.ui.ApogyAddonsVehicleUIPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
  private ApogyAddonsVehicleUIPackageImpl()
  {
		super(eNS_URI, ApogyAddonsVehicleUIFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ApogyAddonsVehicleUIPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
  public static ApogyAddonsVehicleUIPackage init()
  {
		if (isInited) return (ApogyAddonsVehicleUIPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyAddonsVehicleUIPackage.eNS_URI);

		// Obtain or create and register package
		ApogyAddonsVehicleUIPackageImpl theApogyAddonsVehicleUIPackage = (ApogyAddonsVehicleUIPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ApogyAddonsVehicleUIPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ApogyAddonsVehicleUIPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ApogyCommonTopologyUIPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theApogyAddonsVehicleUIPackage.createPackageContents();

		// Initialize created meta-data
		theApogyAddonsVehicleUIPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theApogyAddonsVehicleUIPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ApogyAddonsVehicleUIPackage.eNS_URI, theApogyAddonsVehicleUIPackage);
		return theApogyAddonsVehicleUIPackage;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getPhysicalWheelPresentation()
  {
		return physicalWheelPresentationEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getLanderSphericalFootPresentation()
  {
		return landerSphericalFootPresentationEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getThrusterPresentation()
  {
		return thrusterPresentationEClass;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThrusterPresentation_PlumeEnvelopeVisible() {
		return (EAttribute)thrusterPresentationEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThrusterPresentation_PlumeEnvelopeLength() {
		return (EAttribute)thrusterPresentationEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyAddonsVehicleUIFactory getApogyAddonsVehicleUIFactory() {
		return (ApogyAddonsVehicleUIFactory)getEFactoryInstance();
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
  public void createPackageContents()
  {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		physicalWheelPresentationEClass = createEClass(PHYSICAL_WHEEL_PRESENTATION);

		landerSphericalFootPresentationEClass = createEClass(LANDER_SPHERICAL_FOOT_PRESENTATION);

		thrusterPresentationEClass = createEClass(THRUSTER_PRESENTATION);
		createEAttribute(thrusterPresentationEClass, THRUSTER_PRESENTATION__PLUME_ENVELOPE_VISIBLE);
		createEAttribute(thrusterPresentationEClass, THRUSTER_PRESENTATION__PLUME_ENVELOPE_LENGTH);
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
  public void initializePackageContents()
  {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ApogyCommonTopologyUIPackage theApogyCommonTopologyUIPackage = (ApogyCommonTopologyUIPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCommonTopologyUIPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		physicalWheelPresentationEClass.getESuperTypes().add(theApogyCommonTopologyUIPackage.getNodePresentation());
		landerSphericalFootPresentationEClass.getESuperTypes().add(theApogyCommonTopologyUIPackage.getNodePresentation());
		thrusterPresentationEClass.getESuperTypes().add(theApogyCommonTopologyUIPackage.getNodePresentation());

		// Initialize classes, features, and operations; add parameters
		initEClass(physicalWheelPresentationEClass, PhysicalWheelPresentation.class, "PhysicalWheelPresentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(landerSphericalFootPresentationEClass, LanderSphericalFootPresentation.class, "LanderSphericalFootPresentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(thrusterPresentationEClass, ThrusterPresentation.class, "ThrusterPresentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getThrusterPresentation_PlumeEnvelopeVisible(), theEcorePackage.getEBoolean(), "plumeEnvelopeVisible", "false", 0, 1, ThrusterPresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThrusterPresentation_PlumeEnvelopeLength(), theEcorePackage.getEDouble(), "plumeEnvelopeLength", "1.0", 0, 1, ThrusterPresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ApogyAddonsVehicleUIPackageImpl
