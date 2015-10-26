/**
 * Canadian Space Agency / Agence spatiale canadienne - Copyright (c) 2015
 */
package org.eclipse.symphony.examples.camera.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.symphony.addons.actuators.Symphony__AddonsActuatorsPackage;
import org.eclipse.symphony.addons.sensors.fov.Symphony__AddonsSensorsFOVPackage;
import org.eclipse.symphony.addons.sensors.imaging.Symphony__AddonsSensorsImagingPackage;
import org.eclipse.symphony.examples.camera.Camera;
import org.eclipse.symphony.examples.camera.CameraSimulated;
import org.eclipse.symphony.examples.camera.CameraStub;
import org.eclipse.symphony.examples.camera.EMFEcoreExampleCameraFactory;
import org.eclipse.symphony.examples.camera.EMFEcoreExampleCameraPackage;
import org.eclipse.symphony.examples.camera.PTUCamera;
import org.eclipse.symphony.examples.camera.PTUCameraSimulated;
import org.eclipse.symphony.examples.camera.PTUCameraStub;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EMFEcoreExampleCameraPackageImpl extends EPackageImpl implements EMFEcoreExampleCameraPackage
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass cameraEClass = null;

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cameraStubEClass = null;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cameraSimulatedEClass = null;

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass ptuCameraEClass = null;

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ptuCameraStubEClass = null;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ptuCameraSimulatedEClass = null;

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EDataType throwableEDataType = null;

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
	 * @see org.eclipse.symphony.examples.camera.EMFEcoreExampleCameraPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
  private EMFEcoreExampleCameraPackageImpl()
  {
		super(eNS_URI, EMFEcoreExampleCameraFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EMFEcoreExampleCameraPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
  public static EMFEcoreExampleCameraPackage init()
  {
		if (isInited) return (EMFEcoreExampleCameraPackage)EPackage.Registry.INSTANCE.getEPackage(EMFEcoreExampleCameraPackage.eNS_URI);

		// Obtain or create and register package
		EMFEcoreExampleCameraPackageImpl theEMFEcoreExampleCameraPackage = (EMFEcoreExampleCameraPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EMFEcoreExampleCameraPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EMFEcoreExampleCameraPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		Symphony__AddonsSensorsImagingPackage.eINSTANCE.eClass();
		Symphony__AddonsActuatorsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theEMFEcoreExampleCameraPackage.createPackageContents();

		// Initialize created meta-data
		theEMFEcoreExampleCameraPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEMFEcoreExampleCameraPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EMFEcoreExampleCameraPackage.eNS_URI, theEMFEcoreExampleCameraPackage);
		return theEMFEcoreExampleCameraPackage;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getCamera()
  {
		return cameraEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getCamera_Fov()
  {
		return (EReference)cameraEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCamera_Initialized() {
		return (EAttribute)cameraEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCamera_StreamingEnabled() {
		return (EAttribute)cameraEClass.getEStructuralFeatures().get(2);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCamera__Init() {
		return cameraEClass.getEOperations().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCamera__CommandStreaming__boolean() {
		return cameraEClass.getEOperations().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCameraStub() {
		return cameraStubEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCameraSimulated() {
		return cameraSimulatedEClass;
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getPTUCamera()
  {
		return ptuCameraEClass;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPTUCameraStub() {
		return ptuCameraStubEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPTUCameraSimulated() {
		return ptuCameraSimulatedEClass;
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EDataType getThrowable()
  {
		return throwableEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EMFEcoreExampleCameraFactory getEMFEcoreExampleCameraFactory()
  {
		return (EMFEcoreExampleCameraFactory)getEFactoryInstance();
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
		cameraEClass = createEClass(CAMERA);
		createEReference(cameraEClass, CAMERA__FOV);
		createEAttribute(cameraEClass, CAMERA__INITIALIZED);
		createEAttribute(cameraEClass, CAMERA__STREAMING_ENABLED);
		createEOperation(cameraEClass, CAMERA___INIT);
		createEOperation(cameraEClass, CAMERA___COMMAND_STREAMING__BOOLEAN);

		cameraStubEClass = createEClass(CAMERA_STUB);

		cameraSimulatedEClass = createEClass(CAMERA_SIMULATED);

		ptuCameraEClass = createEClass(PTU_CAMERA);

		ptuCameraStubEClass = createEClass(PTU_CAMERA_STUB);

		ptuCameraSimulatedEClass = createEClass(PTU_CAMERA_SIMULATED);

		// Create data types
		throwableEDataType = createEDataType(THROWABLE);
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
		Symphony__AddonsSensorsImagingPackage theSymphony__AddonsSensorsImagingPackage = (Symphony__AddonsSensorsImagingPackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__AddonsSensorsImagingPackage.eNS_URI);
		Symphony__AddonsSensorsFOVPackage theSymphony__AddonsSensorsFOVPackage = (Symphony__AddonsSensorsFOVPackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__AddonsSensorsFOVPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		Symphony__AddonsActuatorsPackage theSymphony__AddonsActuatorsPackage = (Symphony__AddonsActuatorsPackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__AddonsActuatorsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		cameraEClass.getESuperTypes().add(theSymphony__AddonsSensorsImagingPackage.getAbstractCamera());
		cameraEClass.getESuperTypes().add(theSymphony__AddonsSensorsImagingPackage.getZoomable());
		cameraStubEClass.getESuperTypes().add(this.getCamera());
		cameraSimulatedEClass.getESuperTypes().add(this.getCamera());
		ptuCameraEClass.getESuperTypes().add(this.getCamera());
		ptuCameraEClass.getESuperTypes().add(theSymphony__AddonsActuatorsPackage.getPanTiltUnit());
		ptuCameraStubEClass.getESuperTypes().add(this.getCameraStub());
		ptuCameraStubEClass.getESuperTypes().add(this.getPTUCamera());
		ptuCameraSimulatedEClass.getESuperTypes().add(this.getCameraSimulated());
		ptuCameraSimulatedEClass.getESuperTypes().add(this.getPTUCamera());

		// Initialize classes, features, and operations; add parameters
		initEClass(cameraEClass, Camera.class, "Camera", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCamera_Fov(), theSymphony__AddonsSensorsFOVPackage.getRectangularFrustrumFieldOfView(), null, "fov", null, 1, 1, Camera.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCamera_Initialized(), theEcorePackage.getEBoolean(), "initialized", "false", 0, 1, Camera.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCamera_StreamingEnabled(), theEcorePackage.getEBoolean(), "streamingEnabled", "false", 0, 1, Camera.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getCamera__Init(), theEcorePackage.getEBoolean(), "init", 0, 1, !IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getCamera__CommandStreaming__boolean(), theEcorePackage.getEBoolean(), "commandStreaming", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEBoolean(), "streamingEnabled", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(cameraStubEClass, CameraStub.class, "CameraStub", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cameraSimulatedEClass, CameraSimulated.class, "CameraSimulated", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ptuCameraEClass, PTUCamera.class, "PTUCamera", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ptuCameraStubEClass, PTUCameraStub.class, "PTUCameraStub", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ptuCameraSimulatedEClass, PTUCameraSimulated.class, "PTUCameraSimulated", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize data types
		initEDataType(throwableEDataType, Throwable.class, "Throwable", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

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
			 "prefix", "EMFEcoreExampleCamera",
			 "copyrightText", "Canadian Space Agency / Agence spatiale canadienne - Copyright (c) 2015",
			 "modelName", "EMFEcoreExampleCamera",
			 "childCreationExtenders", "true",
			 "extensibleProviderFactory", "true",
			 "suppressGenModelAnnotations", "false",
			 "modelDirectory", "/org.eclipse.symphony.examples.camera/src-generated",
			 "editDirectory", "/org.eclipse.symphony.examples.camera.edit/src-generated",
			 "basePackage", "org.eclipse.symphony.examples"
		   });	
		addAnnotation
		  (cameraEClass, 
		   source, 
		   new String[] {
			 "documentation", "This is the abstract representation of a camera,\nwhich implicitly has a rectangular frustrum as its\nfield of view."
		   });	
		addAnnotation
		  (getCamera__Init(), 
		   source, 
		   new String[] {
			 "documentation", "This operation performs any required initialization\noperations for the camera.  This is typically called\nbefore any other operation.\n@return True if the initialization was successful, false otherwise."
		   });	
		addAnnotation
		  (getCamera__CommandStreaming__boolean(), 
		   source, 
		   new String[] {
			 "documentation", "This operation enables or disables image streaming.\nWhen image streaming is enabled, images are updated at about 1 Hz."
		   });	
		addAnnotation
		  (getCamera_Fov(), 
		   source, 
		   new String[] {
			 "documentation", "The field of view for this particular camera",
			 "notify", "true",
			 "propertyCategory", "Field Of View"
		   });	
		addAnnotation
		  (getCamera_Initialized(), 
		   source, 
		   new String[] {
			 "documentation", "This is whether or not the camera has been\nsuccessfully initialized; initially false\n@see #init()",
			 "children", "false",
			 "notify", "true",
			 "property", "Readonly",
			 "propertyCategory", "Status"
		   });	
		addAnnotation
		  (getCamera_StreamingEnabled(), 
		   source, 
		   new String[] {
			 "documentation", "Whether or not image streaming is enabled.",
			 "children", "false",
			 "notify", "true",
			 "property", "Readonly",
			 "propertyCategory", "Status"
		   });	
		addAnnotation
		  (cameraStubEClass, 
		   source, 
		   new String[] {
			 "documentation", "This is a specific implementation of the camera, in which\nall operations are stubs and hence, non-functional; the\noperations should simply log a message, indicating that they\nwere performed."
		   });	
		addAnnotation
		  (cameraSimulatedEClass, 
		   source, 
		   new String[] {
			 "documentation", "This is a simulated implementation of the camera, where all\noperations are executed upon a simulated (i.e. virtual) camera.\nWhile there are no physical components interacted with, it attempts\nto emulate, wherever possible, the actions and results of its real\nworld counterpart(s)."
		   });	
		addAnnotation
		  (ptuCameraEClass, 
		   source, 
		   new String[] {
			 "documentation", "The abstract definition of a basic camera mounted on a Pan-Tilt Unit (PTU)."
		   });	
		addAnnotation
		  (ptuCameraStubEClass, 
		   source, 
		   new String[] {
			 "documentation", "This is a specific implementation of the PTU camera, in which\nall operations are stubs and hence, non-functional; the\noperations should simply log a message, indicating that they\nwere performed."
		   });	
		addAnnotation
		  (ptuCameraSimulatedEClass, 
		   source, 
		   new String[] {
			 "documentation", "This is a simulated implementation of the PTU camera, where all\noperations are executed upon a simulated (i.e. virtual) PTU camera.\nWhile there are no physical components interacted with, it attempts\nto emulate, wherever possible, the actions and results of its real\nworld counterpart(s)."
		   });
	}

} //EMFEcoreExampleCameraPackageImpl
