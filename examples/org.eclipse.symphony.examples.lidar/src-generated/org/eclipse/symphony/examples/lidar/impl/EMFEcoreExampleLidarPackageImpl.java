/**
 * Canadian Space Agency / Agence spatiale canadienne Copyright (c) 2015
 */
package org.eclipse.symphony.examples.lidar.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.symphony.addons.sensors.fov.FovPackage;
import org.eclipse.symphony.common.geometry.data3d.Data3dPackage;
import org.eclipse.symphony.examples.lidar.EMFEcoreExampleLidarFactory;
import org.eclipse.symphony.examples.lidar.EMFEcoreExampleLidarPackage;
import org.eclipse.symphony.examples.lidar.Lidar;
import org.eclipse.symphony.examples.lidar.LidarSimulated;
import org.eclipse.symphony.examples.lidar.LidarStub;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EMFEcoreExampleLidarPackageImpl extends EPackageImpl implements EMFEcoreExampleLidarPackage
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass lidarEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass lidarStubEClass = null;

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lidarSimulatedEClass = null;

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
	 * @see org.eclipse.symphony.examples.lidar.EMFEcoreExampleLidarPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
  private EMFEcoreExampleLidarPackageImpl()
  {
		super(eNS_URI, EMFEcoreExampleLidarFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EMFEcoreExampleLidarPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
  public static EMFEcoreExampleLidarPackage init()
  {
		if (isInited) return (EMFEcoreExampleLidarPackage)EPackage.Registry.INSTANCE.getEPackage(EMFEcoreExampleLidarPackage.eNS_URI);

		// Obtain or create and register package
		EMFEcoreExampleLidarPackageImpl theEMFEcoreExampleLidarPackage = (EMFEcoreExampleLidarPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EMFEcoreExampleLidarPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EMFEcoreExampleLidarPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		FovPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theEMFEcoreExampleLidarPackage.createPackageContents();

		// Initialize created meta-data
		theEMFEcoreExampleLidarPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEMFEcoreExampleLidarPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EMFEcoreExampleLidarPackage.eNS_URI, theEMFEcoreExampleLidarPackage);
		return theEMFEcoreExampleLidarPackage;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getLidar()
  {
		return lidarEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getLidar_Fov()
  {
		return (EReference)lidarEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLidar_Initialized() {
		return (EAttribute)lidarEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLidar__Init() {
		return lidarEClass.getEOperations().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getLidar__AcquireScan__double_double()
  {
		return lidarEClass.getEOperations().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getLidar__AcquireScanNonBlocking__double_double()
  {
		return lidarEClass.getEOperations().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getLidarStub()
  {
		return lidarStubEClass;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLidarSimulated() {
		return lidarSimulatedEClass;
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EMFEcoreExampleLidarFactory getEMFEcoreExampleLidarFactory()
  {
		return (EMFEcoreExampleLidarFactory)getEFactoryInstance();
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
		lidarEClass = createEClass(LIDAR);
		createEReference(lidarEClass, LIDAR__FOV);
		createEAttribute(lidarEClass, LIDAR__INITIALIZED);
		createEOperation(lidarEClass, LIDAR___INIT);
		createEOperation(lidarEClass, LIDAR___ACQUIRE_SCAN__DOUBLE_DOUBLE);
		createEOperation(lidarEClass, LIDAR___ACQUIRE_SCAN_NON_BLOCKING__DOUBLE_DOUBLE);

		lidarStubEClass = createEClass(LIDAR_STUB);

		lidarSimulatedEClass = createEClass(LIDAR_SIMULATED);
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
		FovPackage theFovPackage = (FovPackage)EPackage.Registry.INSTANCE.getEPackage(FovPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		Data3dPackage theData3dPackage = (Data3dPackage)EPackage.Registry.INSTANCE.getEPackage(Data3dPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		lidarStubEClass.getESuperTypes().add(this.getLidar());
		lidarSimulatedEClass.getESuperTypes().add(this.getLidar());

		// Initialize classes, features, and operations; add parameters
		initEClass(lidarEClass, Lidar.class, "Lidar", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLidar_Fov(), theFovPackage.getRectangularFrustrumFieldOfView(), null, "fov", null, 1, 1, Lidar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLidar_Initialized(), theEcorePackage.getEBoolean(), "initialized", "false", 0, 1, Lidar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getLidar__Init(), theEcorePackage.getEBoolean(), "init", 0, 1, !IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getLidar__AcquireScan__double_double(), theData3dPackage.getCartesianCoordinatesSet(), "acquireScan", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "horizontalResolution", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "verticalResolution", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getLidar__AcquireScanNonBlocking__double_double(), theData3dPackage.getCartesianCoordinatesSet(), "acquireScanNonBlocking", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "horizontalResolution", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "verticalResolution", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(lidarStubEClass, LidarStub.class, "LidarStub", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lidarSimulatedEClass, LidarSimulated.class, "LidarSimulated", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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
			 "prefix", "EMFEcoreExampleLidar",
			 "childCreationExtenders", "true",
			 "extensibleProviderFactory", "true",
			 "copyrightText", "Canadian Space Agency / Agence spatiale canadienne - Copyright (c) 2015",
			 "modelName", "EMFEcoreExampleLidar",
			 "suppressGenModelAnnotations", "false",
			 "modelDirectory", "/org.eclipse.symphony.examples.lidar/src-generated",
			 "editDirectory", "/org.eclipse.symphony.examples.lidar.edit/src-generated",
			 "basePackage", "ca.gc.asc_csa.eclipse.emf.ecore.examples"
		   });	
		addAnnotation
		  (lidarEClass, 
		   source, 
		   new String[] {
			 "documentation", "This is an abstraction of the Lidar unit, a 3D laser-based range\nfinder which is capable of scanning the environment and returning\na point cloud encompassing the resulting information.  It has a\nfield of view, which determines the subsection of the environment\nthat the unit can scan.  It also can keep track of whether or not\nthe unit was initialized."
		   });	
		addAnnotation
		  (getLidar__Init(), 
		   source, 
		   new String[] {
			 "documentation", "This operation is used to perform the steps necessary to initialize\nthe Lidar unit.\n@return Whether or not the Lidar\'s initialization was successfully completed"
		   });	
		addAnnotation
		  (getLidar__AcquireScan__double_double(), 
		   source, 
		   new String[] {
			 "documentation", "This operation is used to acquire a depth scan of the field of view, with the given\nhorizontal and vertical resolution.\n<p>\nNote: This method operates synchronously and will block until the entire scan has been\n      completed.\n@param horizontalResolution The horizontal angular resolution of the scan (in radians.)\n@param verticalResolution The vertical angular resolution of the scan (in radians.)\n@return The resulting scan with the given horizontal and vertical angular resolution.\n@see #acquireScanNonBlocking(double, double)"
		   });	
		addAnnotation
		  ((getLidar__AcquireScan__double_double()).getEParameters().get(0), 
		   source, 
		   new String[] {
			 "csa_units", "rad"
		   });	
		addAnnotation
		  ((getLidar__AcquireScan__double_double()).getEParameters().get(1), 
		   source, 
		   new String[] {
			 "csa_units", "rad"
		   });	
		addAnnotation
		  (getLidar__AcquireScanNonBlocking__double_double(), 
		   source, 
		   new String[] {
			 "documentation", "This operation is used to acquire a depth scan of the field of view, with the given\nhorizontal and vertical resolution.\n<p>\nNote: This method operates asynchronously and as such, will return immediately, even\n      if the scan is not yet completed.\n@param horizontalResolution The horizontal angular resolution of the scan (in radians.)\n@param verticalResolution The vertical angular resolution of the scan (in radians.)\n@return The resulting scan with the given horizontal and vertical angular resolution.\n@see #acquireScan(double, double)"
		   });	
		addAnnotation
		  ((getLidar__AcquireScanNonBlocking__double_double()).getEParameters().get(0), 
		   source, 
		   new String[] {
			 "csa_units", "rad"
		   });	
		addAnnotation
		  ((getLidar__AcquireScanNonBlocking__double_double()).getEParameters().get(1), 
		   source, 
		   new String[] {
			 "csa_units", "rad"
		   });	
		addAnnotation
		  (getLidar_Fov(), 
		   source, 
		   new String[] {
			 "documentation", "This is the Lidar\'s field of view, which corresponds to a rectangular\nfrustrum with defined limits.",
			 "children", "true",
			 "notify", "true",
			 "property", "Readonly",
			 "propertyCategory", "Field Of View"
		   });	
		addAnnotation
		  (getLidar_Initialized(), 
		   source, 
		   new String[] {
			 "documentation", "This is whether or not the Lidar unit has been been successfully\ninitialized; initially false.\n@see #init()",
			 "children", "false",
			 "notify", "true",
			 "property", "Readonly",
			 "propertyCategory", "Status"
		   });	
		addAnnotation
		  (lidarStubEClass, 
		   source, 
		   new String[] {
			 "documentation", "This is a specific implementation of the Lidar unit, in which\nall operations are stubs and hence, non-functional; the\noperations should simply log a message, indicating that they\nwere performed."
		   });	
		addAnnotation
		  (lidarSimulatedEClass, 
		   source, 
		   new String[] {
			 "documentation", "This is a simulated implementation of the Lidar unit, where all\noperations are executed upon a simulated (i.e. virtual) Lidar.\nWhile there are no physical components interacted with, it attempts\nto emulate, wherever possible, the actions and results of its real\nworld counterpart(s)."
		   });
	}

} //EMFEcoreExampleLidarPackageImpl
