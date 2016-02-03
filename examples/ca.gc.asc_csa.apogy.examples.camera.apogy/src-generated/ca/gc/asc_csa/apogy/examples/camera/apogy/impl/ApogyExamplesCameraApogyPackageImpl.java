package ca.gc.asc_csa.apogy.examples.camera.apogy.impl;
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
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import ca.gc.asc_csa.apogy.addons.sensors.fov.ApogyAddonsSensorsFOVPackage;
import ca.gc.asc_csa.apogy.core.ApogyCorePackage;
import ca.gc.asc_csa.apogy.examples.camera.apogy.CameraData;
import ca.gc.asc_csa.apogy.examples.camera.apogy.CameraApogySystemApiAdapter;
import ca.gc.asc_csa.apogy.examples.camera.apogy.PTUCameraData;
import ca.gc.asc_csa.apogy.examples.camera.apogy.PTUCameraApogySystemApiAdapter;
import ca.gc.asc_csa.apogy.examples.camera.apogy.ApogyExamplesCameraApogyFactory;
import ca.gc.asc_csa.apogy.examples.camera.apogy.ApogyExamplesCameraApogyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyExamplesCameraApogyPackageImpl extends EPackageImpl implements ApogyExamplesCameraApogyPackage
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass cameraApogySystemApiAdapterEClass = null;
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
  private EClass ptuCameraApogySystemApiAdapterEClass = null;
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
	 * @see ca.gc.asc_csa.apogy.examples.camera.apogy.ApogyExamplesCameraApogyPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
  private ApogyExamplesCameraApogyPackageImpl()
  {
		super(eNS_URI, ApogyExamplesCameraApogyFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ApogyExamplesCameraApogyPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
  public static ApogyExamplesCameraApogyPackage init()
  {
		if (isInited) return (ApogyExamplesCameraApogyPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyExamplesCameraApogyPackage.eNS_URI);

		// Obtain or create and register package
		ApogyExamplesCameraApogyPackageImpl theApogyExamplesCameraApogyPackage = (ApogyExamplesCameraApogyPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ApogyExamplesCameraApogyPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ApogyExamplesCameraApogyPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ApogyCorePackage.eINSTANCE.eClass();
		ApogyAddonsSensorsFOVPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theApogyExamplesCameraApogyPackage.createPackageContents();

		// Initialize created meta-data
		theApogyExamplesCameraApogyPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theApogyExamplesCameraApogyPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ApogyExamplesCameraApogyPackage.eNS_URI, theApogyExamplesCameraApogyPackage);
		return theApogyExamplesCameraApogyPackage;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getCameraApogySystemApiAdapter()
  {
		return cameraApogySystemApiAdapterEClass;
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
  public EClass getPTUCameraApogySystemApiAdapter()
  {
		return ptuCameraApogySystemApiAdapterEClass;
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
	public ApogyExamplesCameraApogyFactory getApogyExamplesCameraApogyFactory() {
		return (ApogyExamplesCameraApogyFactory)getEFactoryInstance();
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
		cameraApogySystemApiAdapterEClass = createEClass(CAMERA_APOGY_SYSTEM_API_ADAPTER);

		cameraDataEClass = createEClass(CAMERA_DATA);
		createEReference(cameraDataEClass, CAMERA_DATA__FOV);
		createEAttribute(cameraDataEClass, CAMERA_DATA__ZOOM);
		createEAttribute(cameraDataEClass, CAMERA_DATA__INITIALIZED);

		ptuCameraApogySystemApiAdapterEClass = createEClass(PTU_CAMERA_APOGY_SYSTEM_API_ADAPTER);

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
		ApogyCorePackage theApogyCorePackage = (ApogyCorePackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCorePackage.eNS_URI);
		ApogyAddonsSensorsFOVPackage theApogyAddonsSensorsFOVPackage = (ApogyAddonsSensorsFOVPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyAddonsSensorsFOVPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		cameraApogySystemApiAdapterEClass.getESuperTypes().add(theApogyCorePackage.getApogySystemApiAdapter());
		cameraDataEClass.getESuperTypes().add(theApogyCorePackage.getApogyInitializationData());
		ptuCameraApogySystemApiAdapterEClass.getESuperTypes().add(theApogyCorePackage.getApogySystemApiAdapter());
		ptuCameraDataEClass.getESuperTypes().add(this.getCameraData());

		// Initialize classes, features, and operations; add parameters
		initEClass(cameraApogySystemApiAdapterEClass, CameraApogySystemApiAdapter.class, "CameraApogySystemApiAdapter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cameraDataEClass, CameraData.class, "CameraData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCameraData_Fov(), theApogyAddonsSensorsFOVPackage.getRectangularFrustrumFieldOfView(), null, "fov", null, 1, 1, CameraData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCameraData_Zoom(), theEcorePackage.getEDouble(), "zoom", null, 0, 1, CameraData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCameraData_Initialized(), theEcorePackage.getEBoolean(), "initialized", "false", 0, 1, CameraData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ptuCameraApogySystemApiAdapterEClass, PTUCameraApogySystemApiAdapter.class, "PTUCameraApogySystemApiAdapter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ptuCameraDataEClass, PTUCameraData.class, "PTUCameraData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPTUCameraData_PanAngle(), theEcorePackage.getEDouble(), "panAngle", null, 0, 1, PTUCameraData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPTUCameraData_TiltAngle(), theEcorePackage.getEDouble(), "tiltAngle", null, 0, 1, PTUCameraData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ApogyExamplesCameraApogyPackageImpl
