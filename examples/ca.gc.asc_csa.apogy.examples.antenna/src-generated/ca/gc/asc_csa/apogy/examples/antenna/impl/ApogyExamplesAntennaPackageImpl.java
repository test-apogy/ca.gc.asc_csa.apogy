package ca.gc.asc_csa.apogy.examples.antenna.impl;
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
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import ca.gc.asc_csa.apogy.addons.sensors.fov.ApogyAddonsSensorsFOVPackage;
import ca.gc.asc_csa.apogy.examples.antenna.Antenna;
import ca.gc.asc_csa.apogy.examples.antenna.DishAntenna;
import ca.gc.asc_csa.apogy.examples.antenna.ApogyExamplesAntennaFactory;
import ca.gc.asc_csa.apogy.examples.antenna.ApogyExamplesAntennaPackage;
import ca.gc.asc_csa.apogy.examples.antenna.PTUDishAntenna;
import ca.gc.asc_csa.apogy.examples.antenna.PTUDishAntennaSimulated;
import ca.gc.asc_csa.apogy.examples.antenna.PTUDishAntennaStub;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyExamplesAntennaPackageImpl extends EPackageImpl implements ApogyExamplesAntennaPackage
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass antennaEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass dishAntennaEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass ptuDishAntennaEClass = null;

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ptuDishAntennaStubEClass = null;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ptuDishAntennaSimulatedEClass = null;

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
	 * @see ca.gc.asc_csa.apogy.examples.antenna.ApogyExamplesAntennaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
  private ApogyExamplesAntennaPackageImpl()
  {
		super(eNS_URI, ApogyExamplesAntennaFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ApogyExamplesAntennaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
  public static ApogyExamplesAntennaPackage init()
  {
		if (isInited) return (ApogyExamplesAntennaPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyExamplesAntennaPackage.eNS_URI);

		// Obtain or create and register package
		ApogyExamplesAntennaPackageImpl theApogyExamplesAntennaPackage = (ApogyExamplesAntennaPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ApogyExamplesAntennaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ApogyExamplesAntennaPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ApogyAddonsSensorsFOVPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theApogyExamplesAntennaPackage.createPackageContents();

		// Initialize created meta-data
		theApogyExamplesAntennaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theApogyExamplesAntennaPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ApogyExamplesAntennaPackage.eNS_URI, theApogyExamplesAntennaPackage);
		return theApogyExamplesAntennaPackage;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getAntenna()
  {
		return antennaEClass;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAntenna_Initialized() {
		return (EAttribute)antennaEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAntenna__Init() {
		return antennaEClass.getEOperations().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getDishAntenna()
  {
		return dishAntennaEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getDishAntenna_Fov()
  {
		return (EReference)dishAntennaEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getPTUDishAntenna()
  {
		return ptuDishAntennaEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getPTUDishAntenna_PanAngle()
  {
		return (EAttribute)ptuDishAntennaEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getPTUDishAntenna_TiltAngle()
  {
		return (EAttribute)ptuDishAntennaEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPTUDishAntenna_TrackingSun() {
		return (EAttribute)ptuDishAntennaEClass.getEStructuralFeatures().get(2);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getPTUDishAntenna__MoveTo__double_double()
  {
		return ptuDishAntennaEClass.getEOperations().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPTUDishAntenna__TrackSun__boolean() {
		return ptuDishAntennaEClass.getEOperations().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPTUDishAntennaStub() {
		return ptuDishAntennaStubEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPTUDishAntennaSimulated() {
		return ptuDishAntennaSimulatedEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyExamplesAntennaFactory getApogyExamplesAntennaFactory() {
		return (ApogyExamplesAntennaFactory)getEFactoryInstance();
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
		antennaEClass = createEClass(ANTENNA);
		createEAttribute(antennaEClass, ANTENNA__INITIALIZED);
		createEOperation(antennaEClass, ANTENNA___INIT);

		dishAntennaEClass = createEClass(DISH_ANTENNA);
		createEReference(dishAntennaEClass, DISH_ANTENNA__FOV);

		ptuDishAntennaEClass = createEClass(PTU_DISH_ANTENNA);
		createEAttribute(ptuDishAntennaEClass, PTU_DISH_ANTENNA__PAN_ANGLE);
		createEAttribute(ptuDishAntennaEClass, PTU_DISH_ANTENNA__TILT_ANGLE);
		createEAttribute(ptuDishAntennaEClass, PTU_DISH_ANTENNA__TRACKING_SUN);
		createEOperation(ptuDishAntennaEClass, PTU_DISH_ANTENNA___MOVE_TO__DOUBLE_DOUBLE);
		createEOperation(ptuDishAntennaEClass, PTU_DISH_ANTENNA___TRACK_SUN__BOOLEAN);

		ptuDishAntennaStubEClass = createEClass(PTU_DISH_ANTENNA_STUB);

		ptuDishAntennaSimulatedEClass = createEClass(PTU_DISH_ANTENNA_SIMULATED);
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
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		ApogyAddonsSensorsFOVPackage theApogyAddonsSensorsFOVPackage = (ApogyAddonsSensorsFOVPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyAddonsSensorsFOVPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		dishAntennaEClass.getESuperTypes().add(this.getAntenna());
		ptuDishAntennaEClass.getESuperTypes().add(this.getDishAntenna());
		ptuDishAntennaStubEClass.getESuperTypes().add(this.getPTUDishAntenna());
		ptuDishAntennaSimulatedEClass.getESuperTypes().add(this.getPTUDishAntenna());

		// Initialize classes, features, and operations; add parameters
		initEClass(antennaEClass, Antenna.class, "Antenna", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAntenna_Initialized(), theEcorePackage.getEBoolean(), "initialized", "false", 0, 1, Antenna.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getAntenna__Init(), theEcorePackage.getEBoolean(), "init", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(dishAntennaEClass, DishAntenna.class, "DishAntenna", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDishAntenna_Fov(), theApogyAddonsSensorsFOVPackage.getConicalFieldOfView(), null, "fov", null, 1, 1, DishAntenna.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ptuDishAntennaEClass, PTUDishAntenna.class, "PTUDishAntenna", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPTUDishAntenna_PanAngle(), theEcorePackage.getEDouble(), "panAngle", null, 0, 1, PTUDishAntenna.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPTUDishAntenna_TiltAngle(), theEcorePackage.getEDouble(), "tiltAngle", null, 0, 1, PTUDishAntenna.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPTUDishAntenna_TrackingSun(), theEcorePackage.getEBoolean(), "trackingSun", "false", 0, 1, PTUDishAntenna.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getPTUDishAntenna__MoveTo__double_double(), null, "moveTo", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "panAngle", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "tiltAngle", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPTUDishAntenna__TrackSun__boolean(), null, "trackSun", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEBoolean(), "track", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(ptuDishAntennaStubEClass, PTUDishAntennaStub.class, "PTUDishAntennaStub", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ptuDishAntennaSimulatedEClass, PTUDishAntennaSimulated.class, "PTUDishAntennaSimulated", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
	}

  /**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void createGenModelAnnotations()
  {
		String source = "http://www.eclipse.org/emf/2002/GenModel";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "documentation", "Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    Pierre Allard (Pierre.Allard@canada.ca),\n    Regent L\'Archeveque (Regent.Larcheveque@canada.ca),\n    Sebastien Gemme (Sebastien.Gemme@canada.ca),\n    Canadian Space Agency (CSA) - Initial API and implementation",
			 "prefix", "ApogyExamplesAntenna",
			 "copyrightText", "Copyright (c) 2015-2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    Pierre Allard (Pierre.Allard@canada.ca), \n    Regent L\'Archeveque (Regent.Larcheveque@canada.ca),\n    Sebastien Gemme (Sebastien.Gemme@canada.ca),\n    Canadian Space Agency (CSA) - Initial API and implementation",
			 "modelName", "ApogyExamplesAntenna",
			 "childCreationExtenders", "true",
			 "extensibleProviderFactory", "true",
			 "suppressGenModelAnnotations", "false",
			 "dynamicTemplates", "true",
			 "templateDirectory", "platform:/plugin/ca.gc.asc_csa.apogy.common.emf.templates",
			 "modelDirectory", "/ca.gc.asc_csa.apogy.examples.antenna/src-generated",
			 "editDirectory", "/ca.gc.asc_csa.apogy.examples.antenna.edit/src-generated",
			 "basePackage", "ca.gc.asc_csa.apogy.examples"
		   });	
		addAnnotation
		  (antennaEClass, 
		   source, 
		   new String[] {
			 "documentation", "This class represents the abstract concept of an antenna."
		   });	
		addAnnotation
		  (getAntenna__Init(), 
		   source, 
		   new String[] {
			 "documentation", "This operation is used to perform the operations\n(if any) required to initialize the antenna\n@return Whether or not the antenna was successfully initialized"
		   });	
		addAnnotation
		  (getAntenna_Initialized(), 
		   source, 
		   new String[] {
			 "documentation", "This is whether or not the antenna has been successfully\ninitialized; initially false\n@see #init()",
			 "children", "false",
			 "notify", "true",
			 "property", "Readonly",
			 "propertyCategory", "Status"
		   });	
		addAnnotation
		  (dishAntennaEClass, 
		   source, 
		   new String[] {
			 "documentation", "This class represents an abstract dish-based variety of antenna,\nwhich has a particular conical field of view (FOV)."
		   });	
		addAnnotation
		  (getDishAntenna_Fov(), 
		   source, 
		   new String[] {
			 "documentation", "This is the (conical) field of view that all dish-based antennas possess",
			 "children", "true",
			 "notify", "true",
			 "property", "Readonly",
			 "propertyCategory", "Field Of View"
		   });	
		addAnnotation
		  (ptuDishAntennaEClass, 
		   source, 
		   new String[] {
			 "documentation", "This class represents an abstract dish-based antenna,\nwhich is mounted upon a pan-tilt unit (PTU).  Naturally,\nthe pan and tilt angles are kept track of and can be changed\naccordingly.  In addition, there is an option for the\nantenna to track the position of the sun in the sky."
		   });	
		addAnnotation
		  (getPTUDishAntenna__MoveTo__double_double(), 
		   source, 
		   new String[] {
			 "documentation", "Command the PTU (and implicitly the antenna) to move to the\nspecified pan and tilt angles.\n\n@param panAngle The target pan angle for the PTU (given in radians.)\n@param tiltAngle The target tilt angle for the PTU (given in radians.)"
		   });	
		addAnnotation
		  ((getPTUDishAntenna__MoveTo__double_double()).getEParameters().get(0), 
		   source, 
		   new String[] {
			 "apogy_units", "rad"
		   });	
		addAnnotation
		  ((getPTUDishAntenna__MoveTo__double_double()).getEParameters().get(1), 
		   source, 
		   new String[] {
			 "apogy_units", "rad"
		   });	
		addAnnotation
		  (getPTUDishAntenna__TrackSun__boolean(), 
		   source, 
		   new String[] {
			 "documentation", "This is used to toggle whether the PTU (and implicitly the\nantenna mounted on it) should be following the sun.  If\ntrue, then the antenna will continue tracking the sun until\nit is told otherwise.\n\t * @param track Whether or not the PTU antenna should be following the sun."
		   });	
		addAnnotation
		  (getPTUDishAntenna_PanAngle(), 
		   source, 
		   new String[] {
			 "documentation", "This is the current pan angle (given in radians) of the\nPTU, that the antenna is attached to.",
			 "children", "false",
			 "notify", "true",
			 "apogy_units", "rad",
			 "property", "Readonly",
			 "propertyCategory", "PTU Angles"
		   });	
		addAnnotation
		  (getPTUDishAntenna_TiltAngle(), 
		   source, 
		   new String[] {
			 "documentation", "This is the current tilt angle (given in radians) of the PTU\nthat the antenna is attached to.",
			 "children", "false",
			 "notify", "true",
			 "apogy_units", "rad",
			 "property", "Readonly",
			 "propertyCategory", "PTU Angles"
		   });	
		addAnnotation
		  (getPTUDishAntenna_TrackingSun(), 
		   source, 
		   new String[] {
			 "documentation", "This is whether or not the PTU antenna should be tracking\nthe sun.",
			 "children", "false",
			 "notify", "true",
			 "property", "Readonly",
			 "propertyCategory", "Tracking"
		   });	
		addAnnotation
		  (ptuDishAntennaStubEClass, 
		   source, 
		   new String[] {
			 "documentation", "This is a specific implementation of the PTU dish antenna, in which\nall operations are stubs and hence, non-functional; the operations\nshould simply log a message, indicating that they were performed."
		   });	
		addAnnotation
		  (ptuDishAntennaSimulatedEClass, 
		   source, 
		   new String[] {
			 "documentation", "This is a simulated implementation of the PTU dish antenna, where all\noperations are executed upon a simulated (i.e. virtual) antenna. While\nthere are no physical components interacted with, it attempts to emulate,\nwherever possible, the actions and results of its real world counterpart(s)."
		   });
	}

} //ApogyExamplesAntennaPackageImpl
