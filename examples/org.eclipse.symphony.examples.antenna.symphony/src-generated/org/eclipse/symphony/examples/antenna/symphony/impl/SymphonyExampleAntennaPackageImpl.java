/**
 * Canadian Space Agency / Agence spatiale canadienne Copyright (c) 2015
 */
package org.eclipse.symphony.examples.antenna.symphony.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.symphony.addons.sensors.fov.FovPackage;
import org.eclipse.symphony.core.SymphonyCorePackage;
import org.eclipse.symphony.examples.antenna.symphony.PTUDishAntennaData;
import org.eclipse.symphony.examples.antenna.symphony.PTUDishAntennaSymphonySystemApiAdapter;
import org.eclipse.symphony.examples.antenna.symphony.SymphonyExampleAntennaFactory;
import org.eclipse.symphony.examples.antenna.symphony.SymphonyExampleAntennaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SymphonyExampleAntennaPackageImpl extends EPackageImpl implements SymphonyExampleAntennaPackage
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass ptuDishAntennaSymphonySystemApiAdapterEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass ptuDishAntennaDataEClass = null;

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
	 * @see org.eclipse.symphony.examples.antenna.symphony.SymphonyExampleAntennaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
  private SymphonyExampleAntennaPackageImpl()
  {
		super(eNS_URI, SymphonyExampleAntennaFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SymphonyExampleAntennaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
  public static SymphonyExampleAntennaPackage init()
  {
		if (isInited) return (SymphonyExampleAntennaPackage)EPackage.Registry.INSTANCE.getEPackage(SymphonyExampleAntennaPackage.eNS_URI);

		// Obtain or create and register package
		SymphonyExampleAntennaPackageImpl theSymphonyExampleAntennaPackage = (SymphonyExampleAntennaPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SymphonyExampleAntennaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SymphonyExampleAntennaPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SymphonyCorePackage.eINSTANCE.eClass();
		FovPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSymphonyExampleAntennaPackage.createPackageContents();

		// Initialize created meta-data
		theSymphonyExampleAntennaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSymphonyExampleAntennaPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SymphonyExampleAntennaPackage.eNS_URI, theSymphonyExampleAntennaPackage);
		return theSymphonyExampleAntennaPackage;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getPTUDishAntennaSymphonySystemApiAdapter()
  {
		return ptuDishAntennaSymphonySystemApiAdapterEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getPTUDishAntennaData()
  {
		return ptuDishAntennaDataEClass;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPTUDishAntennaData_Fov() {
		return (EReference)ptuDishAntennaDataEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getPTUDishAntennaData_PanAngle()
  {
		return (EAttribute)ptuDishAntennaDataEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getPTUDishAntennaData_TiltAngle()
  {
		return (EAttribute)ptuDishAntennaDataEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPTUDishAntennaData_TrackingSun() {
		return (EAttribute)ptuDishAntennaDataEClass.getEStructuralFeatures().get(3);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPTUDishAntennaData_Initialized() {
		return (EAttribute)ptuDishAntennaDataEClass.getEStructuralFeatures().get(4);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public SymphonyExampleAntennaFactory getSymphonyExampleAntennaFactory()
  {
		return (SymphonyExampleAntennaFactory)getEFactoryInstance();
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
		ptuDishAntennaSymphonySystemApiAdapterEClass = createEClass(PTU_DISH_ANTENNA_SYMPHONY_SYSTEM_API_ADAPTER);

		ptuDishAntennaDataEClass = createEClass(PTU_DISH_ANTENNA_DATA);
		createEReference(ptuDishAntennaDataEClass, PTU_DISH_ANTENNA_DATA__FOV);
		createEAttribute(ptuDishAntennaDataEClass, PTU_DISH_ANTENNA_DATA__PAN_ANGLE);
		createEAttribute(ptuDishAntennaDataEClass, PTU_DISH_ANTENNA_DATA__TILT_ANGLE);
		createEAttribute(ptuDishAntennaDataEClass, PTU_DISH_ANTENNA_DATA__TRACKING_SUN);
		createEAttribute(ptuDishAntennaDataEClass, PTU_DISH_ANTENNA_DATA__INITIALIZED);
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
		SymphonyCorePackage theSymphonyCorePackage = (SymphonyCorePackage)EPackage.Registry.INSTANCE.getEPackage(SymphonyCorePackage.eNS_URI);
		FovPackage theFovPackage = (FovPackage)EPackage.Registry.INSTANCE.getEPackage(FovPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		ptuDishAntennaSymphonySystemApiAdapterEClass.getESuperTypes().add(theSymphonyCorePackage.getSymphonySystemApiAdapter());
		ptuDishAntennaDataEClass.getESuperTypes().add(theSymphonyCorePackage.getSymphonyInitializationData());

		// Initialize classes, features, and operations; add parameters
		initEClass(ptuDishAntennaSymphonySystemApiAdapterEClass, PTUDishAntennaSymphonySystemApiAdapter.class, "PTUDishAntennaSymphonySystemApiAdapter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ptuDishAntennaDataEClass, PTUDishAntennaData.class, "PTUDishAntennaData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPTUDishAntennaData_Fov(), theFovPackage.getConicalFieldOfView(), null, "fov", null, 1, 1, PTUDishAntennaData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPTUDishAntennaData_PanAngle(), theEcorePackage.getEDouble(), "panAngle", null, 0, 1, PTUDishAntennaData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPTUDishAntennaData_TiltAngle(), theEcorePackage.getEDouble(), "tiltAngle", null, 0, 1, PTUDishAntennaData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPTUDishAntennaData_TrackingSun(), theEcorePackage.getEBoolean(), "trackingSun", "false", 0, 1, PTUDishAntennaData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPTUDishAntennaData_Initialized(), theEcorePackage.getEBoolean(), "initialized", "false", 0, 1, PTUDishAntennaData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "prefix", "SymphonyExampleAntenna",
			 "copyrightText", "Canadian Space Agency / Agence spatiale canadienne Copyright (c) 2015",
			 "modelName", "SymphonyExampleAntenna",
			 "childCreationExtenders", "true",
			 "extensibleProviderFactory", "true",
			 "suppressGenModelAnnotations", "false",
			 "modelDirectory", "/org.eclipse.symphony.examples.antenna.symphony/src-generated",
			 "editDirectory", "/org.eclipse.symphony.examples.antenna.symphony.edit/src-generated",
			 "basePackage", "org.eclipse.symphony.examples.antenna"
		   });	
		addAnnotation
		  (ptuDishAntennaSymphonySystemApiAdapterEClass, 
		   source, 
		   new String[] {
			 "documentation", "This class is the specialized Symphony API adapter, used for connecting\nthe existing PTU dish antenna example, located at\n{@link org.eclipse.symphony.examples.antenna.PTUDishAntenna},\nto Symphony; one can override the well-known callback functions to make\nSymphony perform a variety of useful functions, including initialization,\ndisposal and other features."
		   });	
		addAnnotation
		  (ptuDishAntennaDataEClass, 
		   source, 
		   new String[] {
			 "documentation", "This class specifies the initialization data that Symphony\nshould be interested in when (re)initializing the PTU dish\nantenna with the API Adapter (which in this case is\n{org.eclipse.symphony.examples.antenna.symphony.PTUDishAntennaSymphonySystemApiAdapter})"
		   });	
		addAnnotation
		  (getPTUDishAntennaData_Fov(), 
		   source, 
		   new String[] {
			 "documentation", "This is the dish antenna\'s current field of view (FOV).",
			 "notify", "true",
			 "property", "Editable",
			 "propertyCategory", "Field Of View"
		   });	
		addAnnotation
		  (getPTUDishAntennaData_PanAngle(), 
		   source, 
		   new String[] {
			 "documentation", "This is the current pan angle of the dish antenna\'s\nPan-Tilt Unit (PTU).",
			 "csa_units", "rad",
			 "notify", "true",
			 "property", "Editable",
			 "propertyCategory", "Pan-Tilt Unit"
		   });	
		addAnnotation
		  (getPTUDishAntennaData_TiltAngle(), 
		   source, 
		   new String[] {
			 "documentation", "This is the current tilt angle of the dish antenna\'s\nPan-Tilt Unit (PTU).",
			 "csa_units", "rad",
			 "notify", "true",
			 "property", "Editable",
			 "propertyCategory", "Pan-Tilt Unit"
		   });	
		addAnnotation
		  (getPTUDishAntennaData_TrackingSun(), 
		   source, 
		   new String[] {
			 "documentation", "This is whether or not the dish antenna\'s Pan-Tilt Unit (PTU)\nis tracking the sun",
			 "notify", "true",
			 "property", "Editable",
			 "propertyCategory", "Status"
		   });	
		addAnnotation
		  (getPTUDishAntennaData_Initialized(), 
		   source, 
		   new String[] {
			 "documentation", "This is whether or not the dish antenna has been initialized",
			 "notify", "true",
			 "property", "Editable",
			 "propertyCategory", "Status"
		   });
	}

} //SymphonyExampleAntennaPackageImpl
