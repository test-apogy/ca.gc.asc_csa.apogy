/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package org.eclipse.symphony.addons.sensors.imaging.camera.impl;

import java.util.List;

import javax.vecmath.Color3f;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.symphony.addons.Symphony__AddonsPackage;
import org.eclipse.symphony.addons.sensors.fov.Symphony__AddonsSensorsFOVPackage;
import org.eclipse.symphony.addons.sensors.imaging.Symphony__AddonsSensorsImagingPackage;
import org.eclipse.symphony.addons.sensors.imaging.camera.AbstractTextOverlay;
import org.eclipse.symphony.addons.sensors.imaging.camera.AzimuthElevationFOVOverlay;
import org.eclipse.symphony.addons.sensors.imaging.camera.AzimuthFeatureReference;
import org.eclipse.symphony.addons.sensors.imaging.camera.CameraImageAnnotation;
import org.eclipse.symphony.addons.sensors.imaging.camera.CameraNameOverlay;
import org.eclipse.symphony.addons.sensors.imaging.camera.CameraOverlay;
import org.eclipse.symphony.addons.sensors.imaging.camera.CameraOverlayList;
import org.eclipse.symphony.addons.sensors.imaging.camera.CameraTool;
import org.eclipse.symphony.addons.sensors.imaging.camera.CameraToolList;
import org.eclipse.symphony.addons.sensors.imaging.camera.CameraViewConfiguration;
import org.eclipse.symphony.addons.sensors.imaging.camera.CameraViewConfigurationList;
import org.eclipse.symphony.addons.sensors.imaging.camera.CameraViewUtilities;
import org.eclipse.symphony.addons.sensors.imaging.camera.ContrastAndBrightnessFilter;
import org.eclipse.symphony.addons.sensors.imaging.camera.DrawnCameraOverlay;
import org.eclipse.symphony.addons.sensors.imaging.camera.EMFFeatureAzimuthElevationFOVOverlay;
import org.eclipse.symphony.addons.sensors.imaging.camera.EMFFeatureOverlay;
import org.eclipse.symphony.addons.sensors.imaging.camera.EdgeFilter;
import org.eclipse.symphony.addons.sensors.imaging.camera.ElevationFeatureReference;
import org.eclipse.symphony.addons.sensors.imaging.camera.ExposureFilter;
import org.eclipse.symphony.addons.sensors.imaging.camera.FOVOverlay;
import org.eclipse.symphony.addons.sensors.imaging.camera.FilterList;
import org.eclipse.symphony.addons.sensors.imaging.camera.GainFilter;
import org.eclipse.symphony.addons.sensors.imaging.camera.GrayScaleFilter;
import org.eclipse.symphony.addons.sensors.imaging.camera.ImageCameraOverlay;
import org.eclipse.symphony.addons.sensors.imaging.camera.ImageCountOverlay;
import org.eclipse.symphony.addons.sensors.imaging.camera.ImageFilter;
import org.eclipse.symphony.addons.sensors.imaging.camera.ImageFrozenOverlay;
import org.eclipse.symphony.addons.sensors.imaging.camera.ImageSizePolicy;
import org.eclipse.symphony.addons.sensors.imaging.camera.InvertFilter;
import org.eclipse.symphony.addons.sensors.imaging.camera.OverlayAlignment;
import org.eclipse.symphony.addons.sensors.imaging.camera.PointerCameraTool;
import org.eclipse.symphony.addons.sensors.imaging.camera.RescaleFilter;
import org.eclipse.symphony.addons.sensors.imaging.camera.Symphony__AddonsSensorsImagingCameraFactory;
import org.eclipse.symphony.addons.sensors.imaging.camera.Symphony__AddonsSensorsImagingCameraPackage;
import org.eclipse.symphony.addons.sensors.imaging.camera.SymphonyLogoOverlay;
import org.eclipse.symphony.addons.sensors.imaging.camera.ToolTipTextProvider;
import org.eclipse.symphony.addons.sensors.imaging.camera.URLImageOverlay;
import org.eclipse.symphony.common.emf.Symphony__CommonEMFPackage;
import org.eclipse.symphony.common.images.Symphony__CommonImagesPackage;
import org.eclipse.symphony.core.Symphony__CorePackage;
import org.eclipse.symphony.core.invocator.Symphony__CoreInvocatorPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Symphony__AddonsSensorsImagingCameraPackageImpl extends EPackageImpl implements Symphony__AddonsSensorsImagingCameraPackage
{
  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cameraViewUtilitiesEClass = null;
		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass cameraViewConfigurationListEClass = null;
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass cameraViewConfigurationEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass filterListEClass = null;
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass imageFilterEClass = null;
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass grayScaleFilterEClass = null;
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass edgeFilterEClass = null;
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass contrastAndBrightnessFilterEClass = null;
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass exposureFilterEClass = null;
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass gainFilterEClass = null;
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass invertFilterEClass = null;
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass rescaleFilterEClass = null;
  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cameraImageAnnotationEClass = null;
		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass cameraOverlayListEClass = null;
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass cameraOverlayEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass drawnCameraOverlayEClass = null;
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass abstractTextOverlayEClass = null;
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass emfFeatureOverlayEClass = null;
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass cameraNameOverlayEClass = null;
  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageCountOverlayEClass = null;
		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageFrozenOverlayEClass = null;
		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass imageCameraOverlayEClass = null;
  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass urlImageOverlayEClass = null;
		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass symphonyLogoOverlayEClass = null;
  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fovOverlayEClass = null;
		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass azimuthElevationFOVOverlayEClass = null;
		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emfFeatureAzimuthElevationFOVOverlayEClass = null;
		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass azimuthFeatureReferenceEClass = null;
		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elevationFeatureReferenceEClass = null;
		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toolTipTextProviderEClass = null;
		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cameraToolEClass = null;
		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cameraToolListEClass = null;
		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointerCameraToolEClass = null;
		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EEnum overlayAlignmentEEnum = null;
  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum imageSizePolicyEEnum = null;
		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EDataType color3fEDataType = null;

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType listEDataType = null;

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
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.Symphony__AddonsSensorsImagingCameraPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
  private Symphony__AddonsSensorsImagingCameraPackageImpl()
  {
		super(eNS_URI, Symphony__AddonsSensorsImagingCameraFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Symphony__AddonsSensorsImagingCameraPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
  public static Symphony__AddonsSensorsImagingCameraPackage init()
  {
		if (isInited) return (Symphony__AddonsSensorsImagingCameraPackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__AddonsSensorsImagingCameraPackage.eNS_URI);

		// Obtain or create and register package
		Symphony__AddonsSensorsImagingCameraPackageImpl theSymphony__AddonsSensorsImagingCameraPackage = (Symphony__AddonsSensorsImagingCameraPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Symphony__AddonsSensorsImagingCameraPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Symphony__AddonsSensorsImagingCameraPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		Symphony__AddonsPackage.eINSTANCE.eClass();
		Symphony__AddonsSensorsImagingPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSymphony__AddonsSensorsImagingCameraPackage.createPackageContents();

		// Initialize created meta-data
		theSymphony__AddonsSensorsImagingCameraPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSymphony__AddonsSensorsImagingCameraPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Symphony__AddonsSensorsImagingCameraPackage.eNS_URI, theSymphony__AddonsSensorsImagingCameraPackage);
		return theSymphony__AddonsSensorsImagingCameraPackage;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCameraViewUtilities() {
		return cameraViewUtilitiesEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCameraViewUtilities__GetCameraViewConfigurationIdentifier__CameraViewConfiguration() {
		return cameraViewUtilitiesEClass.getEOperations().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCameraViewUtilities__GetActiveCameraViewConfiguration__String() {
		return cameraViewUtilitiesEClass.getEOperations().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCameraViewUtilities__GetActiveCameraViewConfigurationList() {
		return cameraViewUtilitiesEClass.getEOperations().get(2);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getCameraViewConfigurationList()
  {
		return cameraViewConfigurationListEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getCameraViewConfigurationList_CameraViewConfigurations()
  {
		return (EReference)cameraViewConfigurationListEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getCameraViewConfiguration()
  {
		return cameraViewConfigurationEClass;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCameraViewConfiguration_CameraViewConfigurationList() {
		return (EReference)cameraViewConfigurationEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getCameraViewConfiguration_Camera()
  {
		return (EReference)cameraViewConfigurationEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getCameraViewConfiguration_ImageWidth()
  {
		return (EAttribute)cameraViewConfigurationEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getCameraViewConfiguration_ImageHeight()
  {
		return (EAttribute)cameraViewConfigurationEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCameraViewConfiguration_ImageCount() {
		return (EAttribute)cameraViewConfigurationEClass.getEStructuralFeatures().get(4);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getCameraViewConfiguration_DisplayRectifiedImage()
  {
		return (EAttribute)cameraViewConfigurationEClass.getEStructuralFeatures().get(5);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getCameraViewConfiguration_OverlayList()
  {
		return (EReference)cameraViewConfigurationEClass.getEStructuralFeatures().get(6);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCameraViewConfiguration_ToolList() {
		return (EReference)cameraViewConfigurationEClass.getEStructuralFeatures().get(7);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getCameraViewConfiguration_FilterList()
  {
		return (EReference)cameraViewConfigurationEClass.getEStructuralFeatures().get(8);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCameraViewConfiguration_ImageAutoSaveEnable() {
		return (EAttribute)cameraViewConfigurationEClass.getEStructuralFeatures().get(9);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCameraViewConfiguration_SaveImageWithOverlays() {
		return (EAttribute)cameraViewConfigurationEClass.getEStructuralFeatures().get(10);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCameraViewConfiguration_ImageAutoSaveFolderPath() {
		return (EAttribute)cameraViewConfigurationEClass.getEStructuralFeatures().get(11);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCameraViewConfiguration__GetCameraImageAnnotations() {
		return cameraViewConfigurationEClass.getEOperations().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getFilterList()
  {
		return filterListEClass;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilterList_CameraViewConfiguration() {
		return (EReference)filterListEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getFilterList_ImageFilters()
  {
		return (EReference)filterListEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getImageFilter()
  {
		return imageFilterEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getImageFilter_Enabled()
  {
		return (EAttribute)imageFilterEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getImageFilter__Filter__AbstractCamera_AbstractEImage()
  {
		return imageFilterEClass.getEOperations().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getImageFilter__Dispose() {
		return imageFilterEClass.getEOperations().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getGrayScaleFilter()
  {
		return grayScaleFilterEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getEdgeFilter()
  {
		return edgeFilterEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getContrastAndBrightnessFilter()
  {
		return contrastAndBrightnessFilterEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getContrastAndBrightnessFilter_Contrast()
  {
		return (EAttribute)contrastAndBrightnessFilterEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getContrastAndBrightnessFilter_Brightness()
  {
		return (EAttribute)contrastAndBrightnessFilterEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getExposureFilter()
  {
		return exposureFilterEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getExposureFilter_Exposure()
  {
		return (EAttribute)exposureFilterEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getGainFilter()
  {
		return gainFilterEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getGainFilter_Gain()
  {
		return (EAttribute)gainFilterEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getGainFilter_Bias()
  {
		return (EAttribute)gainFilterEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getInvertFilter()
  {
		return invertFilterEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getRescaleFilter()
  {
		return rescaleFilterEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getRescaleFilter_Scale()
  {
		return (EAttribute)rescaleFilterEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCameraImageAnnotation() {
		return cameraImageAnnotationEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCameraImageAnnotation_Visible() {
		return (EAttribute)cameraImageAnnotationEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCameraImageAnnotation__Dispose() {
		return cameraImageAnnotationEClass.getEOperations().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getCameraOverlayList()
  {
		return cameraOverlayListEClass;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCameraOverlayList_CameraViewConfiguration() {
		return (EReference)cameraOverlayListEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getCameraOverlayList_Overlays()
  {
		return (EReference)cameraOverlayListEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getCameraOverlay()
  {
		return cameraOverlayEClass;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCameraOverlay_CameraOverlayList() {
		return (EReference)cameraOverlayEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getCameraOverlay_OverlayAlignment()
  {
		return (EAttribute)cameraOverlayEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getDrawnCameraOverlay()
  {
		return drawnCameraOverlayEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getDrawnCameraOverlay__ApplyOverlay__AbstractCamera_AbstractEImage_OverlayAlignment_int_int()
  {
		return drawnCameraOverlayEClass.getEOperations().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getAbstractTextOverlay()
  {
		return abstractTextOverlayEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getAbstractTextOverlay_FontName()
  {
		return (EAttribute)abstractTextOverlayEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getAbstractTextOverlay_FontSize()
  {
		return (EAttribute)abstractTextOverlayEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getAbstractTextOverlay_HorizontalOffset()
  {
		return (EAttribute)abstractTextOverlayEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getAbstractTextOverlay_VerticalOffset()
  {
		return (EAttribute)abstractTextOverlayEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getAbstractTextOverlay_TextColor()
  {
		return (EAttribute)abstractTextOverlayEClass.getEStructuralFeatures().get(4);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getAbstractTextOverlay__GetDisplayedString()
  {
		return abstractTextOverlayEClass.getEOperations().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getEMFFeatureOverlay()
  {
		return emfFeatureOverlayEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getEMFFeatureOverlay_VariableFeatureReference()
  {
		return (EReference)emfFeatureOverlayEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getEMFFeatureOverlay_NumberFormat()
  {
		return (EAttribute)emfFeatureOverlayEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMFFeatureOverlay_VariableFeatureReferenceChangeCount() {
		return (EAttribute)emfFeatureOverlayEClass.getEStructuralFeatures().get(2);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getCameraNameOverlay()
  {
		return cameraNameOverlayEClass;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImageCountOverlay() {
		return imageCountOverlayEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageCountOverlay_IndicatorVisible() {
		return (EAttribute)imageCountOverlayEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImageFrozenOverlay() {
		return imageFrozenOverlayEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageFrozenOverlay_Frozen() {
		return (EAttribute)imageFrozenOverlayEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageFrozenOverlay_ExpectedImageUpdatePeriod() {
		return (EAttribute)imageFrozenOverlayEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageFrozenOverlay_FrozenMessage() {
		return (EAttribute)imageFrozenOverlayEClass.getEStructuralFeatures().get(2);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getImageCameraOverlay()
  {
		return imageCameraOverlayEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getImageCameraOverlay__GetOverlay__AbstractCamera_OverlayAlignment_int_int()
  {
		return imageCameraOverlayEClass.getEOperations().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getURLImageOverlay() {
		return urlImageOverlayEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getURLImageOverlay_Url() {
		return (EAttribute)urlImageOverlayEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getURLImageOverlay_ImageSizePolicy() {
		return (EAttribute)urlImageOverlayEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getURLImageOverlay_Image() {
		return (EReference)urlImageOverlayEClass.getEStructuralFeatures().get(2);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getSymphonyLogoOverlay()
  {
		return symphonyLogoOverlayEClass;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFOVOverlay() {
		return fovOverlayEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFOVOverlay_LineWidth() {
		return (EAttribute)fovOverlayEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFOVOverlay_PositiveValuesColor() {
		return (EAttribute)fovOverlayEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFOVOverlay_NegativeValueColor() {
		return (EAttribute)fovOverlayEClass.getEStructuralFeatures().get(2);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFOVOverlay_AngleInterval() {
		return (EAttribute)fovOverlayEClass.getEStructuralFeatures().get(3);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFOVOverlay_FontName() {
		return (EAttribute)fovOverlayEClass.getEStructuralFeatures().get(4);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFOVOverlay_FontSize() {
		return (EAttribute)fovOverlayEClass.getEStructuralFeatures().get(5);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFOVOverlay_AzimuthDirection() {
		return (EAttribute)fovOverlayEClass.getEStructuralFeatures().get(6);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFOVOverlay_ElevationDirection() {
		return (EAttribute)fovOverlayEClass.getEStructuralFeatures().get(7);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAzimuthElevationFOVOverlay() {
		return azimuthElevationFOVOverlayEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAzimuthElevationFOVOverlay__ChangeAzimuth__double() {
		return azimuthElevationFOVOverlayEClass.getEOperations().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAzimuthElevationFOVOverlay__ChangeElevation__double() {
		return azimuthElevationFOVOverlayEClass.getEOperations().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMFFeatureAzimuthElevationFOVOverlay() {
		return emfFeatureAzimuthElevationFOVOverlayEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMFFeatureAzimuthElevationFOVOverlay_AzimuthFeatureReference() {
		return (EReference)emfFeatureAzimuthElevationFOVOverlayEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMFFeatureAzimuthElevationFOVOverlay_ElevationFeatureReference() {
		return (EReference)emfFeatureAzimuthElevationFOVOverlayEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAzimuthFeatureReference() {
		return azimuthFeatureReferenceEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElevationFeatureReference() {
		return elevationFeatureReferenceEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToolTipTextProvider() {
		return toolTipTextProviderEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getToolTipTextProvider__GetToolTipText__AbstractCamera_ImageSnapshot_int_int_int() {
		return toolTipTextProviderEClass.getEOperations().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCameraTool() {
		return cameraToolEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCameraTool_CameraToolList() {
		return (EReference)cameraToolEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCameraTool__InitializeCamera__AbstractCamera() {
		return cameraToolEClass.getEOperations().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCameraTool__UpdateImageSnapshot__ImageSnapshot() {
		return cameraToolEClass.getEOperations().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCameraTool__Dispose() {
		return cameraToolEClass.getEOperations().get(2);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCameraTool__MouseMoved__AbstractEImage_int_int_int() {
		return cameraToolEClass.getEOperations().get(3);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCameraTool__PositionSelected__AbstractEImage_int_int_int() {
		return cameraToolEClass.getEOperations().get(4);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCameraToolList() {
		return cameraToolListEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCameraToolList_CameraViewConfiguration() {
		return (EReference)cameraToolListEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCameraToolList_Tools() {
		return (EReference)cameraToolListEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPointerCameraTool() {
		return pointerCameraToolEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPointerCameraTool_Fov() {
		return (EReference)pointerCameraToolEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointerCameraTool_VectorColor() {
		return (EAttribute)pointerCameraToolEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointerCameraTool_IntersectionDistance() {
		return (EAttribute)pointerCameraToolEClass.getEStructuralFeatures().get(2);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EEnum getOverlayAlignment()
  {
		return overlayAlignmentEEnum;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getImageSizePolicy() {
		return imageSizePolicyEEnum;
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EDataType getColor3f()
  {
		return color3fEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getList() {
		return listEDataType;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__AddonsSensorsImagingCameraFactory getSymphony__AddonsSensorsImagingCameraFactory() {
		return (Symphony__AddonsSensorsImagingCameraFactory)getEFactoryInstance();
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
		cameraViewUtilitiesEClass = createEClass(CAMERA_VIEW_UTILITIES);
		createEOperation(cameraViewUtilitiesEClass, CAMERA_VIEW_UTILITIES___GET_CAMERA_VIEW_CONFIGURATION_IDENTIFIER__CAMERAVIEWCONFIGURATION);
		createEOperation(cameraViewUtilitiesEClass, CAMERA_VIEW_UTILITIES___GET_ACTIVE_CAMERA_VIEW_CONFIGURATION__STRING);
		createEOperation(cameraViewUtilitiesEClass, CAMERA_VIEW_UTILITIES___GET_ACTIVE_CAMERA_VIEW_CONFIGURATION_LIST);

		cameraViewConfigurationListEClass = createEClass(CAMERA_VIEW_CONFIGURATION_LIST);
		createEReference(cameraViewConfigurationListEClass, CAMERA_VIEW_CONFIGURATION_LIST__CAMERA_VIEW_CONFIGURATIONS);

		cameraViewConfigurationEClass = createEClass(CAMERA_VIEW_CONFIGURATION);
		createEReference(cameraViewConfigurationEClass, CAMERA_VIEW_CONFIGURATION__CAMERA_VIEW_CONFIGURATION_LIST);
		createEReference(cameraViewConfigurationEClass, CAMERA_VIEW_CONFIGURATION__CAMERA);
		createEAttribute(cameraViewConfigurationEClass, CAMERA_VIEW_CONFIGURATION__IMAGE_WIDTH);
		createEAttribute(cameraViewConfigurationEClass, CAMERA_VIEW_CONFIGURATION__IMAGE_HEIGHT);
		createEAttribute(cameraViewConfigurationEClass, CAMERA_VIEW_CONFIGURATION__IMAGE_COUNT);
		createEAttribute(cameraViewConfigurationEClass, CAMERA_VIEW_CONFIGURATION__DISPLAY_RECTIFIED_IMAGE);
		createEReference(cameraViewConfigurationEClass, CAMERA_VIEW_CONFIGURATION__OVERLAY_LIST);
		createEReference(cameraViewConfigurationEClass, CAMERA_VIEW_CONFIGURATION__TOOL_LIST);
		createEReference(cameraViewConfigurationEClass, CAMERA_VIEW_CONFIGURATION__FILTER_LIST);
		createEAttribute(cameraViewConfigurationEClass, CAMERA_VIEW_CONFIGURATION__IMAGE_AUTO_SAVE_ENABLE);
		createEAttribute(cameraViewConfigurationEClass, CAMERA_VIEW_CONFIGURATION__SAVE_IMAGE_WITH_OVERLAYS);
		createEAttribute(cameraViewConfigurationEClass, CAMERA_VIEW_CONFIGURATION__IMAGE_AUTO_SAVE_FOLDER_PATH);
		createEOperation(cameraViewConfigurationEClass, CAMERA_VIEW_CONFIGURATION___GET_CAMERA_IMAGE_ANNOTATIONS);

		filterListEClass = createEClass(FILTER_LIST);
		createEReference(filterListEClass, FILTER_LIST__CAMERA_VIEW_CONFIGURATION);
		createEReference(filterListEClass, FILTER_LIST__IMAGE_FILTERS);

		imageFilterEClass = createEClass(IMAGE_FILTER);
		createEAttribute(imageFilterEClass, IMAGE_FILTER__ENABLED);
		createEOperation(imageFilterEClass, IMAGE_FILTER___FILTER__ABSTRACTCAMERA_ABSTRACTEIMAGE);
		createEOperation(imageFilterEClass, IMAGE_FILTER___DISPOSE);

		grayScaleFilterEClass = createEClass(GRAY_SCALE_FILTER);

		edgeFilterEClass = createEClass(EDGE_FILTER);

		contrastAndBrightnessFilterEClass = createEClass(CONTRAST_AND_BRIGHTNESS_FILTER);
		createEAttribute(contrastAndBrightnessFilterEClass, CONTRAST_AND_BRIGHTNESS_FILTER__CONTRAST);
		createEAttribute(contrastAndBrightnessFilterEClass, CONTRAST_AND_BRIGHTNESS_FILTER__BRIGHTNESS);

		exposureFilterEClass = createEClass(EXPOSURE_FILTER);
		createEAttribute(exposureFilterEClass, EXPOSURE_FILTER__EXPOSURE);

		gainFilterEClass = createEClass(GAIN_FILTER);
		createEAttribute(gainFilterEClass, GAIN_FILTER__GAIN);
		createEAttribute(gainFilterEClass, GAIN_FILTER__BIAS);

		invertFilterEClass = createEClass(INVERT_FILTER);

		rescaleFilterEClass = createEClass(RESCALE_FILTER);
		createEAttribute(rescaleFilterEClass, RESCALE_FILTER__SCALE);

		cameraImageAnnotationEClass = createEClass(CAMERA_IMAGE_ANNOTATION);
		createEAttribute(cameraImageAnnotationEClass, CAMERA_IMAGE_ANNOTATION__VISIBLE);
		createEOperation(cameraImageAnnotationEClass, CAMERA_IMAGE_ANNOTATION___DISPOSE);

		cameraOverlayListEClass = createEClass(CAMERA_OVERLAY_LIST);
		createEReference(cameraOverlayListEClass, CAMERA_OVERLAY_LIST__CAMERA_VIEW_CONFIGURATION);
		createEReference(cameraOverlayListEClass, CAMERA_OVERLAY_LIST__OVERLAYS);

		cameraOverlayEClass = createEClass(CAMERA_OVERLAY);
		createEReference(cameraOverlayEClass, CAMERA_OVERLAY__CAMERA_OVERLAY_LIST);
		createEAttribute(cameraOverlayEClass, CAMERA_OVERLAY__OVERLAY_ALIGNMENT);

		drawnCameraOverlayEClass = createEClass(DRAWN_CAMERA_OVERLAY);
		createEOperation(drawnCameraOverlayEClass, DRAWN_CAMERA_OVERLAY___APPLY_OVERLAY__ABSTRACTCAMERA_ABSTRACTEIMAGE_OVERLAYALIGNMENT_INT_INT);

		abstractTextOverlayEClass = createEClass(ABSTRACT_TEXT_OVERLAY);
		createEAttribute(abstractTextOverlayEClass, ABSTRACT_TEXT_OVERLAY__FONT_NAME);
		createEAttribute(abstractTextOverlayEClass, ABSTRACT_TEXT_OVERLAY__FONT_SIZE);
		createEAttribute(abstractTextOverlayEClass, ABSTRACT_TEXT_OVERLAY__HORIZONTAL_OFFSET);
		createEAttribute(abstractTextOverlayEClass, ABSTRACT_TEXT_OVERLAY__VERTICAL_OFFSET);
		createEAttribute(abstractTextOverlayEClass, ABSTRACT_TEXT_OVERLAY__TEXT_COLOR);
		createEOperation(abstractTextOverlayEClass, ABSTRACT_TEXT_OVERLAY___GET_DISPLAYED_STRING);

		emfFeatureOverlayEClass = createEClass(EMF_FEATURE_OVERLAY);
		createEReference(emfFeatureOverlayEClass, EMF_FEATURE_OVERLAY__VARIABLE_FEATURE_REFERENCE);
		createEAttribute(emfFeatureOverlayEClass, EMF_FEATURE_OVERLAY__NUMBER_FORMAT);
		createEAttribute(emfFeatureOverlayEClass, EMF_FEATURE_OVERLAY__VARIABLE_FEATURE_REFERENCE_CHANGE_COUNT);

		cameraNameOverlayEClass = createEClass(CAMERA_NAME_OVERLAY);

		imageCountOverlayEClass = createEClass(IMAGE_COUNT_OVERLAY);
		createEAttribute(imageCountOverlayEClass, IMAGE_COUNT_OVERLAY__INDICATOR_VISIBLE);

		imageFrozenOverlayEClass = createEClass(IMAGE_FROZEN_OVERLAY);
		createEAttribute(imageFrozenOverlayEClass, IMAGE_FROZEN_OVERLAY__FROZEN);
		createEAttribute(imageFrozenOverlayEClass, IMAGE_FROZEN_OVERLAY__EXPECTED_IMAGE_UPDATE_PERIOD);
		createEAttribute(imageFrozenOverlayEClass, IMAGE_FROZEN_OVERLAY__FROZEN_MESSAGE);

		imageCameraOverlayEClass = createEClass(IMAGE_CAMERA_OVERLAY);
		createEOperation(imageCameraOverlayEClass, IMAGE_CAMERA_OVERLAY___GET_OVERLAY__ABSTRACTCAMERA_OVERLAYALIGNMENT_INT_INT);

		urlImageOverlayEClass = createEClass(URL_IMAGE_OVERLAY);
		createEAttribute(urlImageOverlayEClass, URL_IMAGE_OVERLAY__URL);
		createEAttribute(urlImageOverlayEClass, URL_IMAGE_OVERLAY__IMAGE_SIZE_POLICY);
		createEReference(urlImageOverlayEClass, URL_IMAGE_OVERLAY__IMAGE);

		symphonyLogoOverlayEClass = createEClass(SYMPHONY_LOGO_OVERLAY);

		fovOverlayEClass = createEClass(FOV_OVERLAY);
		createEAttribute(fovOverlayEClass, FOV_OVERLAY__LINE_WIDTH);
		createEAttribute(fovOverlayEClass, FOV_OVERLAY__POSITIVE_VALUES_COLOR);
		createEAttribute(fovOverlayEClass, FOV_OVERLAY__NEGATIVE_VALUE_COLOR);
		createEAttribute(fovOverlayEClass, FOV_OVERLAY__ANGLE_INTERVAL);
		createEAttribute(fovOverlayEClass, FOV_OVERLAY__FONT_NAME);
		createEAttribute(fovOverlayEClass, FOV_OVERLAY__FONT_SIZE);
		createEAttribute(fovOverlayEClass, FOV_OVERLAY__AZIMUTH_DIRECTION);
		createEAttribute(fovOverlayEClass, FOV_OVERLAY__ELEVATION_DIRECTION);

		azimuthElevationFOVOverlayEClass = createEClass(AZIMUTH_ELEVATION_FOV_OVERLAY);
		createEOperation(azimuthElevationFOVOverlayEClass, AZIMUTH_ELEVATION_FOV_OVERLAY___CHANGE_AZIMUTH__DOUBLE);
		createEOperation(azimuthElevationFOVOverlayEClass, AZIMUTH_ELEVATION_FOV_OVERLAY___CHANGE_ELEVATION__DOUBLE);

		emfFeatureAzimuthElevationFOVOverlayEClass = createEClass(EMF_FEATURE_AZIMUTH_ELEVATION_FOV_OVERLAY);
		createEReference(emfFeatureAzimuthElevationFOVOverlayEClass, EMF_FEATURE_AZIMUTH_ELEVATION_FOV_OVERLAY__AZIMUTH_FEATURE_REFERENCE);
		createEReference(emfFeatureAzimuthElevationFOVOverlayEClass, EMF_FEATURE_AZIMUTH_ELEVATION_FOV_OVERLAY__ELEVATION_FEATURE_REFERENCE);

		azimuthFeatureReferenceEClass = createEClass(AZIMUTH_FEATURE_REFERENCE);

		elevationFeatureReferenceEClass = createEClass(ELEVATION_FEATURE_REFERENCE);

		toolTipTextProviderEClass = createEClass(TOOL_TIP_TEXT_PROVIDER);
		createEOperation(toolTipTextProviderEClass, TOOL_TIP_TEXT_PROVIDER___GET_TOOL_TIP_TEXT__ABSTRACTCAMERA_IMAGESNAPSHOT_INT_INT_INT);

		cameraToolEClass = createEClass(CAMERA_TOOL);
		createEReference(cameraToolEClass, CAMERA_TOOL__CAMERA_TOOL_LIST);
		createEOperation(cameraToolEClass, CAMERA_TOOL___INITIALIZE_CAMERA__ABSTRACTCAMERA);
		createEOperation(cameraToolEClass, CAMERA_TOOL___UPDATE_IMAGE_SNAPSHOT__IMAGESNAPSHOT);
		createEOperation(cameraToolEClass, CAMERA_TOOL___DISPOSE);
		createEOperation(cameraToolEClass, CAMERA_TOOL___MOUSE_MOVED__ABSTRACTEIMAGE_INT_INT_INT);
		createEOperation(cameraToolEClass, CAMERA_TOOL___POSITION_SELECTED__ABSTRACTEIMAGE_INT_INT_INT);

		cameraToolListEClass = createEClass(CAMERA_TOOL_LIST);
		createEReference(cameraToolListEClass, CAMERA_TOOL_LIST__CAMERA_VIEW_CONFIGURATION);
		createEReference(cameraToolListEClass, CAMERA_TOOL_LIST__TOOLS);

		pointerCameraToolEClass = createEClass(POINTER_CAMERA_TOOL);
		createEReference(pointerCameraToolEClass, POINTER_CAMERA_TOOL__FOV);
		createEAttribute(pointerCameraToolEClass, POINTER_CAMERA_TOOL__VECTOR_COLOR);
		createEAttribute(pointerCameraToolEClass, POINTER_CAMERA_TOOL__INTERSECTION_DISTANCE);

		// Create enums
		overlayAlignmentEEnum = createEEnum(OVERLAY_ALIGNMENT);
		imageSizePolicyEEnum = createEEnum(IMAGE_SIZE_POLICY);

		// Create data types
		color3fEDataType = createEDataType(COLOR3F);
		listEDataType = createEDataType(LIST);
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
		Symphony__CoreInvocatorPackage theSymphony__CoreInvocatorPackage = (Symphony__CoreInvocatorPackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__CoreInvocatorPackage.eNS_URI);
		Symphony__AddonsPackage theSymphony__AddonsPackage = (Symphony__AddonsPackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__AddonsPackage.eNS_URI);
		Symphony__AddonsSensorsImagingPackage theSymphony__AddonsSensorsImagingPackage = (Symphony__AddonsSensorsImagingPackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__AddonsSensorsImagingPackage.eNS_URI);
		Symphony__CommonEMFPackage theSymphony__CommonEMFPackage = (Symphony__CommonEMFPackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__CommonEMFPackage.eNS_URI);
		Symphony__CommonImagesPackage theSymphony__CommonImagesPackage = (Symphony__CommonImagesPackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__CommonImagesPackage.eNS_URI);
		Symphony__CorePackage theSymphony__CorePackage = (Symphony__CorePackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__CorePackage.eNS_URI);
		Symphony__AddonsSensorsFOVPackage theSymphony__AddonsSensorsFOVPackage = (Symphony__AddonsSensorsFOVPackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__AddonsSensorsFOVPackage.eNS_URI);

		// Create type parameters
		addETypeParameter(listEDataType, "T");

		// Set bounds for type parameters

		// Add supertypes to classes
		cameraViewConfigurationListEClass.getESuperTypes().add(theSymphony__CoreInvocatorPackage.getAbstractToolsListContainer());
		cameraViewConfigurationEClass.getESuperTypes().add(theSymphony__CoreInvocatorPackage.getVariableFeatureReference());
		cameraViewConfigurationEClass.getESuperTypes().add(theSymphony__AddonsPackage.getAbstractTool());
		imageFilterEClass.getESuperTypes().add(theSymphony__CommonEMFPackage.getNamed());
		imageFilterEClass.getESuperTypes().add(theSymphony__CommonEMFPackage.getDescribed());
		grayScaleFilterEClass.getESuperTypes().add(this.getImageFilter());
		edgeFilterEClass.getESuperTypes().add(this.getImageFilter());
		contrastAndBrightnessFilterEClass.getESuperTypes().add(this.getImageFilter());
		exposureFilterEClass.getESuperTypes().add(this.getImageFilter());
		gainFilterEClass.getESuperTypes().add(this.getImageFilter());
		invertFilterEClass.getESuperTypes().add(this.getImageFilter());
		rescaleFilterEClass.getESuperTypes().add(this.getImageFilter());
		cameraImageAnnotationEClass.getESuperTypes().add(theSymphony__CommonEMFPackage.getNamed());
		cameraImageAnnotationEClass.getESuperTypes().add(theSymphony__CommonEMFPackage.getDescribed());
		cameraOverlayEClass.getESuperTypes().add(this.getCameraImageAnnotation());
		drawnCameraOverlayEClass.getESuperTypes().add(this.getCameraOverlay());
		abstractTextOverlayEClass.getESuperTypes().add(this.getDrawnCameraOverlay());
		emfFeatureOverlayEClass.getESuperTypes().add(this.getAbstractTextOverlay());
		cameraNameOverlayEClass.getESuperTypes().add(this.getAbstractTextOverlay());
		imageCountOverlayEClass.getESuperTypes().add(this.getAbstractTextOverlay());
		imageFrozenOverlayEClass.getESuperTypes().add(this.getAbstractTextOverlay());
		imageCameraOverlayEClass.getESuperTypes().add(this.getCameraOverlay());
		urlImageOverlayEClass.getESuperTypes().add(this.getImageCameraOverlay());
		symphonyLogoOverlayEClass.getESuperTypes().add(this.getImageCameraOverlay());
		fovOverlayEClass.getESuperTypes().add(this.getDrawnCameraOverlay());
		fovOverlayEClass.getESuperTypes().add(this.getToolTipTextProvider());
		azimuthElevationFOVOverlayEClass.getESuperTypes().add(this.getFOVOverlay());
		emfFeatureAzimuthElevationFOVOverlayEClass.getESuperTypes().add(this.getAzimuthElevationFOVOverlay());
		azimuthFeatureReferenceEClass.getESuperTypes().add(theSymphony__CoreInvocatorPackage.getVariableFeatureReference());
		elevationFeatureReferenceEClass.getESuperTypes().add(theSymphony__CoreInvocatorPackage.getVariableFeatureReference());
		cameraToolEClass.getESuperTypes().add(this.getCameraImageAnnotation());
		pointerCameraToolEClass.getESuperTypes().add(this.getCameraTool());
		pointerCameraToolEClass.getESuperTypes().add(this.getToolTipTextProvider());
		pointerCameraToolEClass.getESuperTypes().add(theSymphony__CorePackage.getAbsolutePoseProvider());

		// Initialize classes, features, and operations; add parameters
		initEClass(cameraViewUtilitiesEClass, CameraViewUtilities.class, "CameraViewUtilities", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getCameraViewUtilities__GetCameraViewConfigurationIdentifier__CameraViewConfiguration(), theEcorePackage.getEString(), "getCameraViewConfigurationIdentifier", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCameraViewConfiguration(), "cameraViewConfiguration", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCameraViewUtilities__GetActiveCameraViewConfiguration__String(), this.getCameraViewConfiguration(), "getActiveCameraViewConfiguration", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "identifier", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getCameraViewUtilities__GetActiveCameraViewConfigurationList(), this.getCameraViewConfigurationList(), "getActiveCameraViewConfigurationList", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(cameraViewConfigurationListEClass, CameraViewConfigurationList.class, "CameraViewConfigurationList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCameraViewConfigurationList_CameraViewConfigurations(), this.getCameraViewConfiguration(), this.getCameraViewConfiguration_CameraViewConfigurationList(), "cameraViewConfigurations", null, 0, -1, CameraViewConfigurationList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cameraViewConfigurationEClass, CameraViewConfiguration.class, "CameraViewConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCameraViewConfiguration_CameraViewConfigurationList(), this.getCameraViewConfigurationList(), this.getCameraViewConfigurationList_CameraViewConfigurations(), "cameraViewConfigurationList", null, 0, 1, CameraViewConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCameraViewConfiguration_Camera(), theSymphony__AddonsSensorsImagingPackage.getAbstractCamera(), null, "camera", null, 0, 1, CameraViewConfiguration.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCameraViewConfiguration_ImageWidth(), theEcorePackage.getEInt(), "imageWidth", "640", 0, 1, CameraViewConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCameraViewConfiguration_ImageHeight(), theEcorePackage.getEInt(), "imageHeight", "480", 0, 1, CameraViewConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCameraViewConfiguration_ImageCount(), theEcorePackage.getEInt(), "imageCount", "0", 0, 1, CameraViewConfiguration.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCameraViewConfiguration_DisplayRectifiedImage(), theEcorePackage.getEBoolean(), "displayRectifiedImage", "true", 0, 1, CameraViewConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCameraViewConfiguration_OverlayList(), this.getCameraOverlayList(), this.getCameraOverlayList_CameraViewConfiguration(), "overlayList", null, 1, 1, CameraViewConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCameraViewConfiguration_ToolList(), this.getCameraToolList(), this.getCameraToolList_CameraViewConfiguration(), "toolList", null, 1, 1, CameraViewConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCameraViewConfiguration_FilterList(), this.getFilterList(), this.getFilterList_CameraViewConfiguration(), "filterList", null, 1, 1, CameraViewConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCameraViewConfiguration_ImageAutoSaveEnable(), theEcorePackage.getEBoolean(), "imageAutoSaveEnable", "false", 0, 1, CameraViewConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCameraViewConfiguration_SaveImageWithOverlays(), theEcorePackage.getEBoolean(), "saveImageWithOverlays", "false", 0, 1, CameraViewConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCameraViewConfiguration_ImageAutoSaveFolderPath(), theEcorePackage.getEString(), "imageAutoSaveFolderPath", null, 0, 1, CameraViewConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getCameraViewConfiguration__GetCameraImageAnnotations(), null, "getCameraImageAnnotations", 0, 1, !IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(this.getList());
		EGenericType g2 = createEGenericType(this.getCameraImageAnnotation());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(filterListEClass, FilterList.class, "FilterList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFilterList_CameraViewConfiguration(), this.getCameraViewConfiguration(), this.getCameraViewConfiguration_FilterList(), "cameraViewConfiguration", null, 0, 1, FilterList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFilterList_ImageFilters(), this.getImageFilter(), null, "imageFilters", null, 0, -1, FilterList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(imageFilterEClass, ImageFilter.class, "ImageFilter", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImageFilter_Enabled(), theEcorePackage.getEBoolean(), "enabled", "true", 0, 1, ImageFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getImageFilter__Filter__AbstractCamera_AbstractEImage(), theSymphony__CommonImagesPackage.getAbstractEImage(), "filter", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSymphony__AddonsSensorsImagingPackage.getAbstractCamera(), "camera", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSymphony__CommonImagesPackage.getAbstractEImage(), "cameraImage", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getImageFilter__Dispose(), null, "dispose", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(grayScaleFilterEClass, GrayScaleFilter.class, "GrayScaleFilter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(edgeFilterEClass, EdgeFilter.class, "EdgeFilter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(contrastAndBrightnessFilterEClass, ContrastAndBrightnessFilter.class, "ContrastAndBrightnessFilter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContrastAndBrightnessFilter_Contrast(), theEcorePackage.getEDouble(), "contrast", "1.0", 0, 1, ContrastAndBrightnessFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContrastAndBrightnessFilter_Brightness(), theEcorePackage.getEDouble(), "brightness", "1.0", 0, 1, ContrastAndBrightnessFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exposureFilterEClass, ExposureFilter.class, "ExposureFilter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExposureFilter_Exposure(), theEcorePackage.getEDouble(), "exposure", "2.5", 0, 1, ExposureFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gainFilterEClass, GainFilter.class, "GainFilter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGainFilter_Gain(), theEcorePackage.getEDouble(), "gain", "50", 0, 1, GainFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGainFilter_Bias(), theEcorePackage.getEDouble(), "bias", "50", 0, 1, GainFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(invertFilterEClass, InvertFilter.class, "InvertFilter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rescaleFilterEClass, RescaleFilter.class, "RescaleFilter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRescaleFilter_Scale(), theEcorePackage.getEDouble(), "scale", "1.0", 0, 1, RescaleFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cameraImageAnnotationEClass, CameraImageAnnotation.class, "CameraImageAnnotation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCameraImageAnnotation_Visible(), theEcorePackage.getEBoolean(), "visible", "true", 0, 1, CameraImageAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getCameraImageAnnotation__Dispose(), null, "dispose", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(cameraOverlayListEClass, CameraOverlayList.class, "CameraOverlayList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCameraOverlayList_CameraViewConfiguration(), this.getCameraViewConfiguration(), this.getCameraViewConfiguration_OverlayList(), "cameraViewConfiguration", null, 0, 1, CameraOverlayList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCameraOverlayList_Overlays(), this.getCameraOverlay(), this.getCameraOverlay_CameraOverlayList(), "overlays", null, 0, -1, CameraOverlayList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cameraOverlayEClass, CameraOverlay.class, "CameraOverlay", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCameraOverlay_CameraOverlayList(), this.getCameraOverlayList(), this.getCameraOverlayList_Overlays(), "cameraOverlayList", null, 0, 1, CameraOverlay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCameraOverlay_OverlayAlignment(), this.getOverlayAlignment(), "overlayAlignment", null, 0, 1, CameraOverlay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(drawnCameraOverlayEClass, DrawnCameraOverlay.class, "DrawnCameraOverlay", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getDrawnCameraOverlay__ApplyOverlay__AbstractCamera_AbstractEImage_OverlayAlignment_int_int(), theSymphony__CommonImagesPackage.getAbstractEImage(), "applyOverlay", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSymphony__AddonsSensorsImagingPackage.getAbstractCamera(), "camera", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSymphony__CommonImagesPackage.getAbstractEImage(), "cameraImage", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getOverlayAlignment(), "overlayAlignment", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "overlayWidth", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "overlayHeight", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(abstractTextOverlayEClass, AbstractTextOverlay.class, "AbstractTextOverlay", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractTextOverlay_FontName(), theEcorePackage.getEString(), "fontName", "SansSerif", 0, 1, AbstractTextOverlay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractTextOverlay_FontSize(), theEcorePackage.getEInt(), "fontSize", "10", 0, 1, AbstractTextOverlay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractTextOverlay_HorizontalOffset(), theEcorePackage.getEInt(), "horizontalOffset", "10", 0, 1, AbstractTextOverlay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractTextOverlay_VerticalOffset(), theEcorePackage.getEInt(), "verticalOffset", "10", 0, 1, AbstractTextOverlay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractTextOverlay_TextColor(), this.getColor3f(), "textColor", "0.0,1.0,0.0", 0, 1, AbstractTextOverlay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getAbstractTextOverlay__GetDisplayedString(), theEcorePackage.getEString(), "getDisplayedString", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(emfFeatureOverlayEClass, EMFFeatureOverlay.class, "EMFFeatureOverlay", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEMFFeatureOverlay_VariableFeatureReference(), theSymphony__CoreInvocatorPackage.getVariableFeatureReference(), null, "variableFeatureReference", null, 1, 1, EMFFeatureOverlay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEMFFeatureOverlay_NumberFormat(), theEcorePackage.getEString(), "numberFormat", "0.00", 0, 1, EMFFeatureOverlay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEMFFeatureOverlay_VariableFeatureReferenceChangeCount(), theEcorePackage.getELong(), "variableFeatureReferenceChangeCount", "0", 0, 1, EMFFeatureOverlay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cameraNameOverlayEClass, CameraNameOverlay.class, "CameraNameOverlay", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(imageCountOverlayEClass, ImageCountOverlay.class, "ImageCountOverlay", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImageCountOverlay_IndicatorVisible(), theEcorePackage.getEBoolean(), "indicatorVisible", "true", 0, 1, ImageCountOverlay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(imageFrozenOverlayEClass, ImageFrozenOverlay.class, "ImageFrozenOverlay", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImageFrozenOverlay_Frozen(), theEcorePackage.getEBoolean(), "frozen", "false", 0, 1, ImageFrozenOverlay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImageFrozenOverlay_ExpectedImageUpdatePeriod(), theEcorePackage.getEDouble(), "expectedImageUpdatePeriod", "1.0", 0, 1, ImageFrozenOverlay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImageFrozenOverlay_FrozenMessage(), theEcorePackage.getEString(), "frozenMessage", "Frozen", 0, 1, ImageFrozenOverlay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(imageCameraOverlayEClass, ImageCameraOverlay.class, "ImageCameraOverlay", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getImageCameraOverlay__GetOverlay__AbstractCamera_OverlayAlignment_int_int(), theSymphony__CommonImagesPackage.getAbstractEImage(), "getOverlay", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSymphony__AddonsSensorsImagingPackage.getAbstractCamera(), "camera", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getOverlayAlignment(), "overlayAlignment", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "overlayWidth", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "overlayHeight", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(urlImageOverlayEClass, URLImageOverlay.class, "URLImageOverlay", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getURLImageOverlay_Url(), theEcorePackage.getEString(), "url", null, 0, 1, URLImageOverlay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getURLImageOverlay_ImageSizePolicy(), this.getImageSizePolicy(), "imageSizePolicy", null, 0, 1, URLImageOverlay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getURLImageOverlay_Image(), theSymphony__CommonImagesPackage.getAbstractEImage(), null, "image", null, 0, 1, URLImageOverlay.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(symphonyLogoOverlayEClass, SymphonyLogoOverlay.class, "SymphonyLogoOverlay", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fovOverlayEClass, FOVOverlay.class, "FOVOverlay", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFOVOverlay_LineWidth(), theEcorePackage.getEInt(), "lineWidth", "2", 0, 1, FOVOverlay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFOVOverlay_PositiveValuesColor(), this.getColor3f(), "positiveValuesColor", "0.0,1.0,0.0", 0, 1, FOVOverlay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFOVOverlay_NegativeValueColor(), this.getColor3f(), "negativeValueColor", "1.0,0.0,0.0", 0, 1, FOVOverlay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFOVOverlay_AngleInterval(), theEcorePackage.getEInt(), "angleInterval", "5", 0, 1, FOVOverlay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFOVOverlay_FontName(), theEcorePackage.getEString(), "fontName", "SansSerif", 0, 1, FOVOverlay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFOVOverlay_FontSize(), theEcorePackage.getEInt(), "fontSize", "10", 0, 1, FOVOverlay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFOVOverlay_AzimuthDirection(), theSymphony__AddonsSensorsImagingPackage.getAzimuthDirection(), "azimuthDirection", null, 0, 1, FOVOverlay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFOVOverlay_ElevationDirection(), theSymphony__AddonsSensorsImagingPackage.getElevationDirection(), "elevationDirection", null, 0, 1, FOVOverlay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(azimuthElevationFOVOverlayEClass, AzimuthElevationFOVOverlay.class, "AzimuthElevationFOVOverlay", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getAzimuthElevationFOVOverlay__ChangeAzimuth__double(), null, "changeAzimuth", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "azimuth", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAzimuthElevationFOVOverlay__ChangeElevation__double(), null, "changeElevation", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "elevation", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(emfFeatureAzimuthElevationFOVOverlayEClass, EMFFeatureAzimuthElevationFOVOverlay.class, "EMFFeatureAzimuthElevationFOVOverlay", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEMFFeatureAzimuthElevationFOVOverlay_AzimuthFeatureReference(), this.getAzimuthFeatureReference(), null, "azimuthFeatureReference", null, 1, 1, EMFFeatureAzimuthElevationFOVOverlay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMFFeatureAzimuthElevationFOVOverlay_ElevationFeatureReference(), this.getElevationFeatureReference(), null, "elevationFeatureReference", null, 1, 1, EMFFeatureAzimuthElevationFOVOverlay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(azimuthFeatureReferenceEClass, AzimuthFeatureReference.class, "AzimuthFeatureReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(elevationFeatureReferenceEClass, ElevationFeatureReference.class, "ElevationFeatureReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(toolTipTextProviderEClass, ToolTipTextProvider.class, "ToolTipTextProvider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getToolTipTextProvider__GetToolTipText__AbstractCamera_ImageSnapshot_int_int_int(), theEcorePackage.getEString(), "getToolTipText", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSymphony__AddonsSensorsImagingPackage.getAbstractCamera(), "camera", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSymphony__AddonsSensorsImagingPackage.getImageSnapshot(), "imageSnapshot", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "mouseButton", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "x", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "y", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(cameraToolEClass, CameraTool.class, "CameraTool", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCameraTool_CameraToolList(), this.getCameraToolList(), this.getCameraToolList_Tools(), "cameraToolList", null, 0, 1, CameraTool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getCameraTool__InitializeCamera__AbstractCamera(), null, "initializeCamera", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSymphony__AddonsSensorsImagingPackage.getAbstractCamera(), "camera", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCameraTool__UpdateImageSnapshot__ImageSnapshot(), null, "updateImageSnapshot", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSymphony__AddonsSensorsImagingPackage.getImageSnapshot(), "imageSnapshot", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getCameraTool__Dispose(), null, "dispose", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCameraTool__MouseMoved__AbstractEImage_int_int_int(), null, "mouseMoved", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSymphony__CommonImagesPackage.getAbstractEImage(), "cameraImage", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "mouseButton", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "x", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "y", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCameraTool__PositionSelected__AbstractEImage_int_int_int(), null, "positionSelected", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSymphony__CommonImagesPackage.getAbstractEImage(), "cameraImage", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "mouseButton", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "x", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "y", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(cameraToolListEClass, CameraToolList.class, "CameraToolList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCameraToolList_CameraViewConfiguration(), this.getCameraViewConfiguration(), this.getCameraViewConfiguration_ToolList(), "cameraViewConfiguration", null, 0, 1, CameraToolList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCameraToolList_Tools(), this.getCameraTool(), this.getCameraTool_CameraToolList(), "tools", null, 0, -1, CameraToolList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pointerCameraToolEClass, PointerCameraTool.class, "PointerCameraTool", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPointerCameraTool_Fov(), theSymphony__AddonsSensorsFOVPackage.getRectangularFrustrumFieldOfView(), null, "fov", null, 0, 1, PointerCameraTool.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPointerCameraTool_VectorColor(), this.getColor3f(), "vectorColor", "0.0,1.0,0.0", 0, 1, PointerCameraTool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPointerCameraTool_IntersectionDistance(), theEcorePackage.getEDouble(), "intersectionDistance", "0.0", 0, 1, PointerCameraTool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(overlayAlignmentEEnum, OverlayAlignment.class, "OverlayAlignment");
		addEEnumLiteral(overlayAlignmentEEnum, OverlayAlignment.CENTER);
		addEEnumLiteral(overlayAlignmentEEnum, OverlayAlignment.LOWER_LEFT_CORNER);
		addEEnumLiteral(overlayAlignmentEEnum, OverlayAlignment.UPPER_LEFT_CORNER);
		addEEnumLiteral(overlayAlignmentEEnum, OverlayAlignment.LOWER_RIGHT_CORNER);
		addEEnumLiteral(overlayAlignmentEEnum, OverlayAlignment.UPPER_RIGHT_CORNER);

		initEEnum(imageSizePolicyEEnum, ImageSizePolicy.class, "ImageSizePolicy");
		addEEnumLiteral(imageSizePolicyEEnum, ImageSizePolicy.FIXED_SIZE);
		addEEnumLiteral(imageSizePolicyEEnum, ImageSizePolicy.ALLOW_RESIZE_VERTICAL);
		addEEnumLiteral(imageSizePolicyEEnum, ImageSizePolicy.ALLOW_RESIZE_HORIZONTAL);
		addEEnumLiteral(imageSizePolicyEEnum, ImageSizePolicy.ALLOW_RESIZE_BOTH);

		// Initialize data types
		initEDataType(color3fEDataType, Color3f.class, "Color3f", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(listEDataType, List.class, "List", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //Symphony__AddonsSensorsImagingCameraPackageImpl
