/**
 * Canadian Space Agency / Agence spatiale canadienne 2013 Copyrights (c)
 */
package org.eclipse.symphony.addons.sensors.imaging.ui.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.symphony.addons.sensors.imaging.ui.ImageSnapshotPresentation;
import org.eclipse.symphony.addons.sensors.imaging.ui.Symphony__AddonsSensorsImagingUIFactory;
import org.eclipse.symphony.addons.sensors.imaging.ui.Symphony__AddonsSensorsImagingUIPackage;
import org.eclipse.symphony.common.topology.ui.Symphony__CommonTopologyUIPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Symphony__AddonsSensorsImagingUIPackageImpl extends EPackageImpl implements Symphony__AddonsSensorsImagingUIPackage
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
	 * @see org.eclipse.symphony.addons.sensors.imaging.ui.Symphony__AddonsSensorsImagingUIPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
  private Symphony__AddonsSensorsImagingUIPackageImpl()
  {
		super(eNS_URI, Symphony__AddonsSensorsImagingUIFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Symphony__AddonsSensorsImagingUIPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
  public static Symphony__AddonsSensorsImagingUIPackage init()
  {
		if (isInited) return (Symphony__AddonsSensorsImagingUIPackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__AddonsSensorsImagingUIPackage.eNS_URI);

		// Obtain or create and register package
		Symphony__AddonsSensorsImagingUIPackageImpl theSymphony__AddonsSensorsImagingUIPackage = (Symphony__AddonsSensorsImagingUIPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Symphony__AddonsSensorsImagingUIPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Symphony__AddonsSensorsImagingUIPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		Symphony__CommonTopologyUIPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSymphony__AddonsSensorsImagingUIPackage.createPackageContents();

		// Initialize created meta-data
		theSymphony__AddonsSensorsImagingUIPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSymphony__AddonsSensorsImagingUIPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Symphony__AddonsSensorsImagingUIPackage.eNS_URI, theSymphony__AddonsSensorsImagingUIPackage);
		return theSymphony__AddonsSensorsImagingUIPackage;
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
	public Symphony__AddonsSensorsImagingUIFactory getSymphony__AddonsSensorsImagingUIFactory() {
		return (Symphony__AddonsSensorsImagingUIFactory)getEFactoryInstance();
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
		Symphony__CommonTopologyUIPackage theSymphony__CommonTopologyUIPackage = (Symphony__CommonTopologyUIPackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__CommonTopologyUIPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		imageSnapshotPresentationEClass.getESuperTypes().add(theSymphony__CommonTopologyUIPackage.getNodePresentation());

		// Initialize classes, features, and operations; add parameters
		initEClass(imageSnapshotPresentationEClass, ImageSnapshotPresentation.class, "ImageSnapshotPresentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImageSnapshotPresentation_PresentationMode(), theSymphony__CommonTopologyUIPackage.getMeshPresentationMode(), "presentationMode", null, 0, 1, ImageSnapshotPresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImageSnapshotPresentation_Transparency(), theEcorePackage.getEFloat(), "transparency", null, 0, 1, ImageSnapshotPresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImageSnapshotPresentation_ImageProjectionVisible(), theEcorePackage.getEBoolean(), "imageProjectionVisible", "false", 0, 1, ImageSnapshotPresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImageSnapshotPresentation_ImageProjectionOnFOVVisible(), theEcorePackage.getEBoolean(), "imageProjectionOnFOVVisible", "false", 0, 1, ImageSnapshotPresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Symphony__AddonsSensorsImagingUIPackageImpl