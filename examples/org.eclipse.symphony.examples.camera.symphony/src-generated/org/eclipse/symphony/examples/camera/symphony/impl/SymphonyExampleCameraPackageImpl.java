/**
 * Canadian Space Agency / Agence spatiale canadienne Copyright (c) 2015
 */
package org.eclipse.symphony.examples.camera.symphony.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.symphony.addons.sensors.fov.Symphony__AddonsSensorsFOVPackage;
import org.eclipse.symphony.core.SymphonyCorePackage;
import org.eclipse.symphony.examples.camera.symphony.CameraData;
import org.eclipse.symphony.examples.camera.symphony.CameraSymphonySystemApiAdapter;
import org.eclipse.symphony.examples.camera.symphony.PTUCameraData;
import org.eclipse.symphony.examples.camera.symphony.PTUCameraSymphonySystemApiAdapter;
import org.eclipse.symphony.examples.camera.symphony.SymphonyExampleCameraFactory;
import org.eclipse.symphony.examples.camera.symphony.SymphonyExampleCameraPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SymphonyExampleCameraPackageImpl extends EPackageImpl implements SymphonyExampleCameraPackage
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass cameraSymphonySystemApiAdapterEClass = null;
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass cameraDataEClass = null;
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass ptuCameraSymphonySystemApiAdapterEClass = null;
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass ptuCameraDataEClass = null;
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
	 * @see org.eclipse.symphony.examples.camera.symphony.SymphonyExampleCameraPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
  private SymphonyExampleCameraPackageImpl()
  {
		super(eNS_URI, SymphonyExampleCameraFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SymphonyExampleCameraPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
  public static SymphonyExampleCameraPackage init()
  {
		if (isInited) return (SymphonyExampleCameraPackage)EPackage.Registry.INSTANCE.getEPackage(SymphonyExampleCameraPackage.eNS_URI);

		// Obtain or create and register package
		SymphonyExampleCameraPackageImpl theSymphonyExampleCameraPackage = (SymphonyExampleCameraPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SymphonyExampleCameraPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SymphonyExampleCameraPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SymphonyCorePackage.eINSTANCE.eClass();
		Symphony__AddonsSensorsFOVPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSymphonyExampleCameraPackage.createPackageContents();

		// Initialize created meta-data
		theSymphonyExampleCameraPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSymphonyExampleCameraPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SymphonyExampleCameraPackage.eNS_URI, theSymphonyExampleCameraPackage);
		return theSymphonyExampleCameraPackage;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getCameraSymphonySystemApiAdapter()
  {
		return cameraSymphonySystemApiAdapterEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getCameraData()
  {
		return cameraDataEClass;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCameraData_Fov() {
		return (EReference)cameraDataEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getCameraData_Zoom()
  {
		return (EAttribute)cameraDataEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCameraData_Initialized() {
		return (EAttribute)cameraDataEClass.getEStructuralFeatures().get(2);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getPTUCameraSymphonySystemApiAdapter()
  {
		return ptuCameraSymphonySystemApiAdapterEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getPTUCameraData()
  {
		return ptuCameraDataEClass;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPTUCameraData_PanAngle() {
		return (EAttribute)ptuCameraDataEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPTUCameraData_TiltAngle() {
		return (EAttribute)ptuCameraDataEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public SymphonyExampleCameraFactory getSymphonyExampleCameraFactory()
  {
		return (SymphonyExampleCameraFactory)getEFactoryInstance();
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
		cameraSymphonySystemApiAdapterEClass = createEClass(CAMERA_SYMPHONY_SYSTEM_API_ADAPTER);

		cameraDataEClass = createEClass(CAMERA_DATA);
		createEReference(cameraDataEClass, CAMERA_DATA__FOV);
		createEAttribute(cameraDataEClass, CAMERA_DATA__ZOOM);
		createEAttribute(cameraDataEClass, CAMERA_DATA__INITIALIZED);

		ptuCameraSymphonySystemApiAdapterEClass = createEClass(PTU_CAMERA_SYMPHONY_SYSTEM_API_ADAPTER);

		ptuCameraDataEClass = createEClass(PTU_CAMERA_DATA);
		createEAttribute(ptuCameraDataEClass, PTU_CAMERA_DATA__PAN_ANGLE);
		createEAttribute(ptuCameraDataEClass, PTU_CAMERA_DATA__TILT_ANGLE);
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
		Symphony__AddonsSensorsFOVPackage theSymphony__AddonsSensorsFOVPackage = (Symphony__AddonsSensorsFOVPackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__AddonsSensorsFOVPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		cameraSymphonySystemApiAdapterEClass.getESuperTypes().add(theSymphonyCorePackage.getSymphonySystemApiAdapter());
		cameraDataEClass.getESuperTypes().add(theSymphonyCorePackage.getSymphonyInitializationData());
		ptuCameraSymphonySystemApiAdapterEClass.getESuperTypes().add(theSymphonyCorePackage.getSymphonySystemApiAdapter());
		ptuCameraDataEClass.getESuperTypes().add(this.getCameraData());

		// Initialize classes, features, and operations; add parameters
		initEClass(cameraSymphonySystemApiAdapterEClass, CameraSymphonySystemApiAdapter.class, "CameraSymphonySystemApiAdapter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cameraDataEClass, CameraData.class, "CameraData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCameraData_Fov(), theSymphony__AddonsSensorsFOVPackage.getRectangularFrustrumFieldOfView(), null, "fov", null, 1, 1, CameraData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCameraData_Zoom(), theEcorePackage.getEDouble(), "zoom", null, 0, 1, CameraData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCameraData_Initialized(), theEcorePackage.getEBoolean(), "initialized", "false", 0, 1, CameraData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ptuCameraSymphonySystemApiAdapterEClass, PTUCameraSymphonySystemApiAdapter.class, "PTUCameraSymphonySystemApiAdapter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ptuCameraDataEClass, PTUCameraData.class, "PTUCameraData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPTUCameraData_PanAngle(), theEcorePackage.getEDouble(), "panAngle", null, 0, 1, PTUCameraData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPTUCameraData_TiltAngle(), theEcorePackage.getEDouble(), "tiltAngle", null, 0, 1, PTUCameraData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //SymphonyExampleCameraPackageImpl
