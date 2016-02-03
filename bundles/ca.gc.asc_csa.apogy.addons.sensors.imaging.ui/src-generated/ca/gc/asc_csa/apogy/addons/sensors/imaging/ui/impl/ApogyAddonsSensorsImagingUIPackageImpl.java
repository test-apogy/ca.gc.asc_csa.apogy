package ca.gc.asc_csa.apogy.addons.sensors.imaging.ui.impl;
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
import ca.gc.asc_csa.apogy.addons.sensors.imaging.ui.ImageSnapshotPresentation;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.ui.ApogyAddonsSensorsImagingUIFactory;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.ui.ApogyAddonsSensorsImagingUIPackage;
import ca.gc.asc_csa.apogy.common.topology.ui.ApogyCommonTopologyUIPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyAddonsSensorsImagingUIPackageImpl extends EPackageImpl implements ApogyAddonsSensorsImagingUIPackage
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass imageSnapshotPresentationEClass = null;

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
	 * @see ca.gc.asc_csa.apogy.addons.sensors.imaging.ui.ApogyAddonsSensorsImagingUIPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
  private ApogyAddonsSensorsImagingUIPackageImpl()
  {
		super(eNS_URI, ApogyAddonsSensorsImagingUIFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ApogyAddonsSensorsImagingUIPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
  public static ApogyAddonsSensorsImagingUIPackage init()
  {
		if (isInited) return (ApogyAddonsSensorsImagingUIPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyAddonsSensorsImagingUIPackage.eNS_URI);

		// Obtain or create and register package
		ApogyAddonsSensorsImagingUIPackageImpl theApogyAddonsSensorsImagingUIPackage = (ApogyAddonsSensorsImagingUIPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ApogyAddonsSensorsImagingUIPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ApogyAddonsSensorsImagingUIPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ApogyCommonTopologyUIPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theApogyAddonsSensorsImagingUIPackage.createPackageContents();

		// Initialize created meta-data
		theApogyAddonsSensorsImagingUIPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theApogyAddonsSensorsImagingUIPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ApogyAddonsSensorsImagingUIPackage.eNS_URI, theApogyAddonsSensorsImagingUIPackage);
		return theApogyAddonsSensorsImagingUIPackage;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getImageSnapshotPresentation()
  {
		return imageSnapshotPresentationEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getImageSnapshotPresentation_PresentationMode()
  {
		return (EAttribute)imageSnapshotPresentationEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getImageSnapshotPresentation_Transparency()
  {
		return (EAttribute)imageSnapshotPresentationEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getImageSnapshotPresentation_ImageProjectionVisible()
  {
		return (EAttribute)imageSnapshotPresentationEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageSnapshotPresentation_ImageProjectionOnFOVVisible() {
		return (EAttribute)imageSnapshotPresentationEClass.getEStructuralFeatures().get(3);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyAddonsSensorsImagingUIFactory getApogyAddonsSensorsImagingUIFactory() {
		return (ApogyAddonsSensorsImagingUIFactory)getEFactoryInstance();
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
		imageSnapshotPresentationEClass = createEClass(IMAGE_SNAPSHOT_PRESENTATION);
		createEAttribute(imageSnapshotPresentationEClass, IMAGE_SNAPSHOT_PRESENTATION__PRESENTATION_MODE);
		createEAttribute(imageSnapshotPresentationEClass, IMAGE_SNAPSHOT_PRESENTATION__TRANSPARENCY);
		createEAttribute(imageSnapshotPresentationEClass, IMAGE_SNAPSHOT_PRESENTATION__IMAGE_PROJECTION_VISIBLE);
		createEAttribute(imageSnapshotPresentationEClass, IMAGE_SNAPSHOT_PRESENTATION__IMAGE_PROJECTION_ON_FOV_VISIBLE);
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
		imageSnapshotPresentationEClass.getESuperTypes().add(theApogyCommonTopologyUIPackage.getNodePresentation());

		// Initialize classes, features, and operations; add parameters
		initEClass(imageSnapshotPresentationEClass, ImageSnapshotPresentation.class, "ImageSnapshotPresentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImageSnapshotPresentation_PresentationMode(), theApogyCommonTopologyUIPackage.getMeshPresentationMode(), "presentationMode", null, 0, 1, ImageSnapshotPresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImageSnapshotPresentation_Transparency(), theEcorePackage.getEFloat(), "transparency", null, 0, 1, ImageSnapshotPresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImageSnapshotPresentation_ImageProjectionVisible(), theEcorePackage.getEBoolean(), "imageProjectionVisible", "false", 0, 1, ImageSnapshotPresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImageSnapshotPresentation_ImageProjectionOnFOVVisible(), theEcorePackage.getEBoolean(), "imageProjectionOnFOVVisible", "false", 0, 1, ImageSnapshotPresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ApogyAddonsSensorsImagingUIPackageImpl
