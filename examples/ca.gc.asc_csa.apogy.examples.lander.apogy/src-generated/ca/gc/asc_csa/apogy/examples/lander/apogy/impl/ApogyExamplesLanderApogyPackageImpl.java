package ca.gc.asc_csa.apogy.examples.lander.apogy.impl;
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
import ca.gc.asc_csa.apogy.core.ApogyCorePackage;
import ca.gc.asc_csa.apogy.examples.lander.ApogyExamplesLanderPackage;
import ca.gc.asc_csa.apogy.examples.lander.apogy.LanderData;
import ca.gc.asc_csa.apogy.examples.lander.apogy.LanderApogySystemApiAdapter;
import ca.gc.asc_csa.apogy.examples.lander.apogy.ApogyExamplesLanderApogyFactory;
import ca.gc.asc_csa.apogy.examples.lander.apogy.ApogyExamplesLanderApogyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyExamplesLanderApogyPackageImpl extends EPackageImpl implements ApogyExamplesLanderApogyPackage
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass landerApogySystemApiAdapterEClass = null;

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass landerDataEClass = null;

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
	 * @see ca.gc.asc_csa.apogy.examples.lander.apogy.ApogyExamplesLanderApogyPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
  private ApogyExamplesLanderApogyPackageImpl()
  {
		super(eNS_URI, ApogyExamplesLanderApogyFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ApogyExamplesLanderApogyPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
  public static ApogyExamplesLanderApogyPackage init()
  {
		if (isInited) return (ApogyExamplesLanderApogyPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyExamplesLanderApogyPackage.eNS_URI);

		// Obtain or create and register package
		ApogyExamplesLanderApogyPackageImpl theApogyExamplesLanderApogyPackage = (ApogyExamplesLanderApogyPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ApogyExamplesLanderApogyPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ApogyExamplesLanderApogyPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ApogyExamplesLanderPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theApogyExamplesLanderApogyPackage.createPackageContents();

		// Initialize created meta-data
		theApogyExamplesLanderApogyPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theApogyExamplesLanderApogyPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ApogyExamplesLanderApogyPackage.eNS_URI, theApogyExamplesLanderApogyPackage);
		return theApogyExamplesLanderApogyPackage;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getLanderApogySystemApiAdapter()
  {
		return landerApogySystemApiAdapterEClass;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLanderData() {
		return landerDataEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLanderData_Initialized() {
		return (EAttribute)landerDataEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLanderData_Disposed() {
		return (EAttribute)landerDataEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLanderData_FlyingEnabled() {
		return (EAttribute)landerDataEClass.getEStructuralFeatures().get(2);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLanderData_LegAExtension() {
		return (EAttribute)landerDataEClass.getEStructuralFeatures().get(3);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLanderData_LegBExtension() {
		return (EAttribute)landerDataEClass.getEStructuralFeatures().get(4);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLanderData_LegCExtension() {
		return (EAttribute)landerDataEClass.getEStructuralFeatures().get(5);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLanderData_CurrThrustLevel() {
		return (EAttribute)landerDataEClass.getEStructuralFeatures().get(6);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLanderData_MinThrustLevel() {
		return (EAttribute)landerDataEClass.getEStructuralFeatures().get(7);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLanderData_MaxThrustLevel() {
		return (EAttribute)landerDataEClass.getEStructuralFeatures().get(8);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLanderData_XAngularVelocity() {
		return (EAttribute)landerDataEClass.getEStructuralFeatures().get(9);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLanderData_YAngularVelocity() {
		return (EAttribute)landerDataEClass.getEStructuralFeatures().get(10);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyExamplesLanderApogyFactory getApogyExamplesLanderApogyFactory() {
		return (ApogyExamplesLanderApogyFactory)getEFactoryInstance();
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
		landerApogySystemApiAdapterEClass = createEClass(LANDER_APOGY_SYSTEM_API_ADAPTER);

		landerDataEClass = createEClass(LANDER_DATA);
		createEAttribute(landerDataEClass, LANDER_DATA__INITIALIZED);
		createEAttribute(landerDataEClass, LANDER_DATA__DISPOSED);
		createEAttribute(landerDataEClass, LANDER_DATA__FLYING_ENABLED);
		createEAttribute(landerDataEClass, LANDER_DATA__LEG_AEXTENSION);
		createEAttribute(landerDataEClass, LANDER_DATA__LEG_BEXTENSION);
		createEAttribute(landerDataEClass, LANDER_DATA__LEG_CEXTENSION);
		createEAttribute(landerDataEClass, LANDER_DATA__CURR_THRUST_LEVEL);
		createEAttribute(landerDataEClass, LANDER_DATA__MIN_THRUST_LEVEL);
		createEAttribute(landerDataEClass, LANDER_DATA__MAX_THRUST_LEVEL);
		createEAttribute(landerDataEClass, LANDER_DATA__XANGULAR_VELOCITY);
		createEAttribute(landerDataEClass, LANDER_DATA__YANGULAR_VELOCITY);
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
		ApogyCorePackage theApogyCorePackage = (ApogyCorePackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCorePackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		ApogyExamplesLanderPackage theApogyExamplesLanderPackage = (ApogyExamplesLanderPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyExamplesLanderPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		landerApogySystemApiAdapterEClass.getESuperTypes().add(theApogyCorePackage.getApogySystemApiAdapter());
		landerDataEClass.getESuperTypes().add(theApogyCorePackage.getApogyInitializationData());

		// Initialize classes, features, and operations; add parameters
		initEClass(landerApogySystemApiAdapterEClass, LanderApogySystemApiAdapter.class, "LanderApogySystemApiAdapter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(landerDataEClass, LanderData.class, "LanderData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLanderData_Initialized(), theEcorePackage.getEBoolean(), "initialized", "false", 0, 1, LanderData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLanderData_Disposed(), theEcorePackage.getEBoolean(), "disposed", "false", 0, 1, LanderData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLanderData_FlyingEnabled(), theEcorePackage.getEBoolean(), "flyingEnabled", "false", 0, 1, LanderData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLanderData_LegAExtension(), theApogyExamplesLanderPackage.getLanderLegExtension(), "legAExtension", null, 0, 1, LanderData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLanderData_LegBExtension(), theApogyExamplesLanderPackage.getLanderLegExtension(), "legBExtension", null, 0, 1, LanderData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLanderData_LegCExtension(), theApogyExamplesLanderPackage.getLanderLegExtension(), "legCExtension", null, 0, 1, LanderData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLanderData_CurrThrustLevel(), theEcorePackage.getEDouble(), "currThrustLevel", "0.0", 0, 1, LanderData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLanderData_MinThrustLevel(), theEcorePackage.getEDouble(), "minThrustLevel", "0.0", 0, 1, LanderData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLanderData_MaxThrustLevel(), theEcorePackage.getEDouble(), "maxThrustLevel", "0.0", 0, 1, LanderData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLanderData_XAngularVelocity(), theEcorePackage.getEDouble(), "xAngularVelocity", "0.0", 0, 1, LanderData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLanderData_YAngularVelocity(), theEcorePackage.getEDouble(), "yAngularVelocity", "0.0", 0, 1, LanderData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ApogyExamplesLanderApogyPackageImpl
