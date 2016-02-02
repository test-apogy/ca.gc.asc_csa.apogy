package ca.gc.asc_csa.apogy.examples.robotic_arm.apogy.impl;
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
import ca.gc.asc_csa.apogy.examples.robotic_arm.ApogyExamplesRoboticArmPackage;
import ca.gc.asc_csa.apogy.examples.robotic_arm.apogy.RoboticArmData;
import ca.gc.asc_csa.apogy.examples.robotic_arm.apogy.RoboticArmApogySystemApiAdapter;
import ca.gc.asc_csa.apogy.examples.robotic_arm.apogy.ApogyExamplesRoboticArmApogyFactory;
import ca.gc.asc_csa.apogy.examples.robotic_arm.apogy.ApogyExamplesRoboticArmApogyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyExamplesRoboticArmApogyPackageImpl extends EPackageImpl implements ApogyExamplesRoboticArmApogyPackage
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass roboticArmApogySystemApiAdapterEClass = null;
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass roboticArmDataEClass = null;
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
	 * @see ca.gc.asc_csa.apogy.examples.robotic_arm.apogy.ApogyExamplesRoboticArmApogyPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
  private ApogyExamplesRoboticArmApogyPackageImpl()
  {
		super(eNS_URI, ApogyExamplesRoboticArmApogyFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ApogyExamplesRoboticArmApogyPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
  public static ApogyExamplesRoboticArmApogyPackage init()
  {
		if (isInited) return (ApogyExamplesRoboticArmApogyPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyExamplesRoboticArmApogyPackage.eNS_URI);

		// Obtain or create and register package
		ApogyExamplesRoboticArmApogyPackageImpl theApogyExamplesRoboticArmApogyPackage = (ApogyExamplesRoboticArmApogyPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ApogyExamplesRoboticArmApogyPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ApogyExamplesRoboticArmApogyPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ApogyCorePackage.eINSTANCE.eClass();
		ApogyExamplesRoboticArmPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theApogyExamplesRoboticArmApogyPackage.createPackageContents();

		// Initialize created meta-data
		theApogyExamplesRoboticArmApogyPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theApogyExamplesRoboticArmApogyPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ApogyExamplesRoboticArmApogyPackage.eNS_URI, theApogyExamplesRoboticArmApogyPackage);
		return theApogyExamplesRoboticArmApogyPackage;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getRoboticArmApogySystemApiAdapter()
  {
		return roboticArmApogySystemApiAdapterEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getRoboticArmData()
  {
		return roboticArmDataEClass;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoboticArmData_Initialized() {
		return (EAttribute)roboticArmDataEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoboticArmData_Speed() {
		return (EAttribute)roboticArmDataEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoboticArmData_TurretAngle() {
		return (EAttribute)roboticArmDataEClass.getEStructuralFeatures().get(2);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getRoboticArmData_ShoulderAngle()
  {
		return (EAttribute)roboticArmDataEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getRoboticArmData_ElbowAngle()
  {
		return (EAttribute)roboticArmDataEClass.getEStructuralFeatures().get(4);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getRoboticArmData_WristAngle()
  {
		return (EAttribute)roboticArmDataEClass.getEStructuralFeatures().get(5);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyExamplesRoboticArmApogyFactory getApogyExamplesRoboticArmApogyFactory() {
		return (ApogyExamplesRoboticArmApogyFactory)getEFactoryInstance();
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
		roboticArmApogySystemApiAdapterEClass = createEClass(ROBOTIC_ARM_APOGY_SYSTEM_API_ADAPTER);

		roboticArmDataEClass = createEClass(ROBOTIC_ARM_DATA);
		createEAttribute(roboticArmDataEClass, ROBOTIC_ARM_DATA__INITIALIZED);
		createEAttribute(roboticArmDataEClass, ROBOTIC_ARM_DATA__SPEED);
		createEAttribute(roboticArmDataEClass, ROBOTIC_ARM_DATA__TURRET_ANGLE);
		createEAttribute(roboticArmDataEClass, ROBOTIC_ARM_DATA__SHOULDER_ANGLE);
		createEAttribute(roboticArmDataEClass, ROBOTIC_ARM_DATA__ELBOW_ANGLE);
		createEAttribute(roboticArmDataEClass, ROBOTIC_ARM_DATA__WRIST_ANGLE);
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
		ApogyExamplesRoboticArmPackage theApogyExamplesRoboticArmPackage = (ApogyExamplesRoboticArmPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyExamplesRoboticArmPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		roboticArmApogySystemApiAdapterEClass.getESuperTypes().add(theApogyCorePackage.getApogySystemApiAdapter());
		roboticArmDataEClass.getESuperTypes().add(theApogyCorePackage.getApogyInitializationData());

		// Initialize classes, features, and operations; add parameters
		initEClass(roboticArmApogySystemApiAdapterEClass, RoboticArmApogySystemApiAdapter.class, "RoboticArmApogySystemApiAdapter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(roboticArmDataEClass, RoboticArmData.class, "RoboticArmData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoboticArmData_Initialized(), theEcorePackage.getEBoolean(), "initialized", "false", 0, 1, RoboticArmData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoboticArmData_Speed(), theApogyExamplesRoboticArmPackage.getMoveSpeedLevel(), "speed", null, 0, 1, RoboticArmData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoboticArmData_TurretAngle(), theEcorePackage.getEDouble(), "turretAngle", null, 0, 1, RoboticArmData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoboticArmData_ShoulderAngle(), theEcorePackage.getEDouble(), "shoulderAngle", null, 0, 1, RoboticArmData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoboticArmData_ElbowAngle(), theEcorePackage.getEDouble(), "elbowAngle", null, 0, 1, RoboticArmData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoboticArmData_WristAngle(), theEcorePackage.getEDouble(), "wristAngle", null, 0, 1, RoboticArmData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ApogyExamplesRoboticArmApogyPackageImpl
