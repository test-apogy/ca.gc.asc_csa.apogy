/**
 * Canadian Space Agency / Agence spatiale canadienne 2013 Copyrights (c)
 */
package org.eclipse.symphony.addons.sensors.imaging.impl;

import java.awt.Color;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.symphony.addons.sensors.Symphony__AddonsSensorsPackage;
import org.eclipse.symphony.addons.sensors.fov.Symphony__AddonsSensorsFOVPackage;
import org.eclipse.symphony.addons.sensors.imaging.AbstractCamera;
import org.eclipse.symphony.addons.sensors.imaging.AzimuthDirection;
import org.eclipse.symphony.addons.sensors.imaging.ElevationDirection;
import org.eclipse.symphony.addons.sensors.imaging.ImageSnapshot;
import org.eclipse.symphony.addons.sensors.imaging.ImagingUtilities;
import org.eclipse.symphony.addons.sensors.imaging.Symphony__AddonsSensorsImagingFactory;
import org.eclipse.symphony.addons.sensors.imaging.Symphony__AddonsSensorsImagingPackage;
import org.eclipse.symphony.addons.sensors.imaging.RectifiedImageSnapshot;
import org.eclipse.symphony.addons.sensors.imaging.Zoomable;
import org.eclipse.symphony.common.emf.Symphony__CommonEMFPackage;
import org.eclipse.symphony.common.images.Symphony__CommonImagesPackage;
import org.eclipse.symphony.common.topology.Symphony__CommonTopologyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Symphony__AddonsSensorsImagingPackageImpl extends EPackageImpl implements Symphony__AddonsSensorsImagingPackage
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass abstractCameraEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass imageSnapshotEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass rectifiedImageSnapshotEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass zoomableEClass = null;

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imagingUtilitiesEClass = null;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum azimuthDirectionEEnum = null;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum elevationDirectionEEnum = null;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType colorEDataType = null;

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
	 * @see org.eclipse.symphony.addons.sensors.imaging.Symphony__AddonsSensorsImagingPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
  private Symphony__AddonsSensorsImagingPackageImpl()
  {
		super(eNS_URI, Symphony__AddonsSensorsImagingFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Symphony__AddonsSensorsImagingPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
  public static Symphony__AddonsSensorsImagingPackage init()
  {
		if (isInited) return (Symphony__AddonsSensorsImagingPackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__AddonsSensorsImagingPackage.eNS_URI);

		// Obtain or create and register package
		Symphony__AddonsSensorsImagingPackageImpl theSymphony__AddonsSensorsImagingPackage = (Symphony__AddonsSensorsImagingPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Symphony__AddonsSensorsImagingPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Symphony__AddonsSensorsImagingPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		Symphony__AddonsSensorsPackage.eINSTANCE.eClass();
		Symphony__CommonEMFPackage.eINSTANCE.eClass();
		Symphony__AddonsSensorsFOVPackage.eINSTANCE.eClass();
		Symphony__CommonImagesPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSymphony__AddonsSensorsImagingPackage.createPackageContents();

		// Initialize created meta-data
		theSymphony__AddonsSensorsImagingPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSymphony__AddonsSensorsImagingPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Symphony__AddonsSensorsImagingPackage.eNS_URI, theSymphony__AddonsSensorsImagingPackage);
		return theSymphony__AddonsSensorsImagingPackage;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getAbstractCamera()
  {
		return abstractCameraEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getAbstractCamera_LatestImageSnapshot()
  {
		return (EReference)abstractCameraEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getAbstractCamera__TakeSnapshot()
  {
		return abstractCameraEClass.getEOperations().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getAbstractCamera__GetFieldOfView()
  {
		return abstractCameraEClass.getEOperations().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getImageSnapshot()
  {
		return imageSnapshotEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getImageSnapshot_FieldOfView()
  {
		return (EReference)imageSnapshotEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getImageSnapshot_Image()
  {
		return (EReference)imageSnapshotEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getImageSnapshot__ConvertToHorizontalAngle__int() {
		return imageSnapshotEClass.getEOperations().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getImageSnapshot__ConvertToVerticalAngle__int() {
		return imageSnapshotEClass.getEOperations().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getRectifiedImageSnapshot()
  {
		return rectifiedImageSnapshotEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getRectifiedImageSnapshot__GetRectifiedImage()
  {
		return rectifiedImageSnapshotEClass.getEOperations().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getZoomable()
  {
		return zoomableEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getZoomable_CurrentZoom()
  {
		return (EAttribute)zoomableEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getZoomable_CommandedZoom()
  {
		return (EAttribute)zoomableEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getZoomable__CommandZoom__double()
  {
		return zoomableEClass.getEOperations().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getZoomable__GetMinimumZoom()
  {
		return zoomableEClass.getEOperations().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getZoomable__GetMaximumZoom()
  {
		return zoomableEClass.getEOperations().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImagingUtilities() {
		return imagingUtilitiesEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getImagingUtilities__LinearConvertToHorizontalAngle__ImageSnapshot_int() {
		return imagingUtilitiesEClass.getEOperations().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getImagingUtilities__LinearConvertToVerticalAngle__ImageSnapshot_int() {
		return imagingUtilitiesEClass.getEOperations().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getImagingUtilities__GetAzimuthElevationOverlay__int_int_double_double_double_double_AzimuthDirection_ElevationDirection_int_String_int_Color_Color_int() {
		return imagingUtilitiesEClass.getEOperations().get(2);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAzimuthDirection() {
		return azimuthDirectionEEnum;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getElevationDirection() {
		return elevationDirectionEEnum;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getColor() {
		return colorEDataType;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__AddonsSensorsImagingFactory getSymphony__AddonsSensorsImagingFactory() {
		return (Symphony__AddonsSensorsImagingFactory)getEFactoryInstance();
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
		abstractCameraEClass = createEClass(ABSTRACT_CAMERA);
		createEReference(abstractCameraEClass, ABSTRACT_CAMERA__LATEST_IMAGE_SNAPSHOT);
		createEOperation(abstractCameraEClass, ABSTRACT_CAMERA___TAKE_SNAPSHOT);
		createEOperation(abstractCameraEClass, ABSTRACT_CAMERA___GET_FIELD_OF_VIEW);

		imageSnapshotEClass = createEClass(IMAGE_SNAPSHOT);
		createEReference(imageSnapshotEClass, IMAGE_SNAPSHOT__FIELD_OF_VIEW);
		createEReference(imageSnapshotEClass, IMAGE_SNAPSHOT__IMAGE);
		createEOperation(imageSnapshotEClass, IMAGE_SNAPSHOT___CONVERT_TO_HORIZONTAL_ANGLE__INT);
		createEOperation(imageSnapshotEClass, IMAGE_SNAPSHOT___CONVERT_TO_VERTICAL_ANGLE__INT);

		rectifiedImageSnapshotEClass = createEClass(RECTIFIED_IMAGE_SNAPSHOT);
		createEOperation(rectifiedImageSnapshotEClass, RECTIFIED_IMAGE_SNAPSHOT___GET_RECTIFIED_IMAGE);

		zoomableEClass = createEClass(ZOOMABLE);
		createEAttribute(zoomableEClass, ZOOMABLE__CURRENT_ZOOM);
		createEAttribute(zoomableEClass, ZOOMABLE__COMMANDED_ZOOM);
		createEOperation(zoomableEClass, ZOOMABLE___COMMAND_ZOOM__DOUBLE);
		createEOperation(zoomableEClass, ZOOMABLE___GET_MINIMUM_ZOOM);
		createEOperation(zoomableEClass, ZOOMABLE___GET_MAXIMUM_ZOOM);

		imagingUtilitiesEClass = createEClass(IMAGING_UTILITIES);
		createEOperation(imagingUtilitiesEClass, IMAGING_UTILITIES___LINEAR_CONVERT_TO_HORIZONTAL_ANGLE__IMAGESNAPSHOT_INT);
		createEOperation(imagingUtilitiesEClass, IMAGING_UTILITIES___LINEAR_CONVERT_TO_VERTICAL_ANGLE__IMAGESNAPSHOT_INT);
		createEOperation(imagingUtilitiesEClass, IMAGING_UTILITIES___GET_AZIMUTH_ELEVATION_OVERLAY__INT_INT_DOUBLE_DOUBLE_DOUBLE_DOUBLE_AZIMUTHDIRECTION_ELEVATIONDIRECTION_INT_STRING_INT_COLOR_COLOR_INT);

		// Create enums
		azimuthDirectionEEnum = createEEnum(AZIMUTH_DIRECTION);
		elevationDirectionEEnum = createEEnum(ELEVATION_DIRECTION);

		// Create data types
		colorEDataType = createEDataType(COLOR);
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
		Symphony__AddonsSensorsPackage theSymphony__AddonsSensorsPackage = (Symphony__AddonsSensorsPackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__AddonsSensorsPackage.eNS_URI);
		Symphony__CommonEMFPackage theSymphony__CommonEMFPackage = (Symphony__CommonEMFPackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__CommonEMFPackage.eNS_URI);
		Symphony__AddonsSensorsFOVPackage theSymphony__AddonsSensorsFOVPackage = (Symphony__AddonsSensorsFOVPackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__AddonsSensorsFOVPackage.eNS_URI);
		Symphony__CommonTopologyPackage theSymphony__CommonTopologyPackage = (Symphony__CommonTopologyPackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__CommonTopologyPackage.eNS_URI);
		Symphony__CommonImagesPackage theSymphony__CommonImagesPackage = (Symphony__CommonImagesPackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__CommonImagesPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		abstractCameraEClass.getESuperTypes().add(theSymphony__AddonsSensorsPackage.getSensor());
		abstractCameraEClass.getESuperTypes().add(theSymphony__CommonEMFPackage.getNamed());
		imageSnapshotEClass.getESuperTypes().add(theSymphony__CommonTopologyPackage.getGroupNode());
		imageSnapshotEClass.getESuperTypes().add(theSymphony__CommonEMFPackage.getTimed());
		rectifiedImageSnapshotEClass.getESuperTypes().add(this.getImageSnapshot());

		// Initialize classes, features, and operations; add parameters
		initEClass(abstractCameraEClass, AbstractCamera.class, "AbstractCamera", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractCamera_LatestImageSnapshot(), this.getImageSnapshot(), null, "latestImageSnapshot", null, 0, 1, AbstractCamera.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getAbstractCamera__TakeSnapshot(), this.getImageSnapshot(), "takeSnapshot", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getAbstractCamera__GetFieldOfView(), theSymphony__AddonsSensorsFOVPackage.getRectangularFrustrumFieldOfView(), "getFieldOfView", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(imageSnapshotEClass, ImageSnapshot.class, "ImageSnapshot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImageSnapshot_FieldOfView(), theSymphony__AddonsSensorsFOVPackage.getRectangularFrustrumFieldOfView(), null, "fieldOfView", null, 0, 1, ImageSnapshot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImageSnapshot_Image(), theSymphony__CommonImagesPackage.getAbstractEImage(), null, "image", null, 0, 1, ImageSnapshot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getImageSnapshot__ConvertToHorizontalAngle__int(), theEcorePackage.getEDouble(), "convertToHorizontalAngle", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "horizontalPixelPosition", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getImageSnapshot__ConvertToVerticalAngle__int(), theEcorePackage.getEDouble(), "convertToVerticalAngle", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "verticalPixelPosition", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(rectifiedImageSnapshotEClass, RectifiedImageSnapshot.class, "RectifiedImageSnapshot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getRectifiedImageSnapshot__GetRectifiedImage(), theSymphony__CommonImagesPackage.getAbstractEImage(), "getRectifiedImage", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(zoomableEClass, Zoomable.class, "Zoomable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getZoomable_CurrentZoom(), theEcorePackage.getEDouble(), "currentZoom", "1.0", 0, 1, Zoomable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getZoomable_CommandedZoom(), theEcorePackage.getEDouble(), "commandedZoom", "1.0", 0, 1, Zoomable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getZoomable__CommandZoom__double(), theEcorePackage.getEBoolean(), "commandZoom", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "newZoom", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getZoomable__GetMinimumZoom(), theEcorePackage.getEDouble(), "getMinimumZoom", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getZoomable__GetMaximumZoom(), theEcorePackage.getEDouble(), "getMaximumZoom", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(imagingUtilitiesEClass, ImagingUtilities.class, "ImagingUtilities", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getImagingUtilities__LinearConvertToHorizontalAngle__ImageSnapshot_int(), theEcorePackage.getEDouble(), "linearConvertToHorizontalAngle", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getImageSnapshot(), "imageSnapshot", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "horizontalPixelPosition", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getImagingUtilities__LinearConvertToVerticalAngle__ImageSnapshot_int(), theEcorePackage.getEDouble(), "linearConvertToVerticalAngle", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getImageSnapshot(), "imageSnapshot", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "verticalPixelPosition", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getImagingUtilities__GetAzimuthElevationOverlay__int_int_double_double_double_double_AzimuthDirection_ElevationDirection_int_String_int_Color_Color_int(), theSymphony__CommonImagesPackage.getAbstractEImage(), "getAzimuthElevationOverlay", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "imageWidth", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "imageHeight", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "panAngle", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "tiltAngle", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "horizontalFOVAngle", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "verticalFOVAngle", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAzimuthDirection(), "azimuthDirection", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getElevationDirection(), "elevationDirection", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "angleInterval", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "fontName", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "fontSize", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getColor(), "positiveColor", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getColor(), "negativeColor", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "lineWidth", 0, 1, !IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(azimuthDirectionEEnum, AzimuthDirection.class, "AzimuthDirection");
		addEEnumLiteral(azimuthDirectionEEnum, AzimuthDirection.POSITIVE_TOWARD_LEFT);
		addEEnumLiteral(azimuthDirectionEEnum, AzimuthDirection.POSITIVE_TOWARD_RIGHT);

		initEEnum(elevationDirectionEEnum, ElevationDirection.class, "ElevationDirection");
		addEEnumLiteral(elevationDirectionEEnum, ElevationDirection.POSITIVE_UP);
		addEEnumLiteral(elevationDirectionEEnum, ElevationDirection.POSITIVE_DOWN);

		// Initialize data types
		initEDataType(colorEDataType, Color.class, "Color", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //Symphony__AddonsSensorsImagingPackageImpl
