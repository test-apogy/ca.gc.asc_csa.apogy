/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package org.eclipse.symphony.addons.sensors.imaging.camera.impl;

import java.util.List;

import javax.vecmath.Color3f;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.symphony.addons.sensors.imaging.camera.AzimuthElevationFOVOverlay;
import org.eclipse.symphony.addons.sensors.imaging.camera.AzimuthFeatureReference;
import org.eclipse.symphony.addons.sensors.imaging.camera.CameraNameOverlay;
import org.eclipse.symphony.addons.sensors.imaging.camera.CameraOverlayList;
import org.eclipse.symphony.addons.sensors.imaging.camera.CameraToolList;
import org.eclipse.symphony.addons.sensors.imaging.camera.CameraViewConfiguration;
import org.eclipse.symphony.addons.sensors.imaging.camera.CameraViewConfigurationList;
import org.eclipse.symphony.addons.sensors.imaging.camera.CameraViewUtilities;
import org.eclipse.symphony.addons.sensors.imaging.camera.ContrastAndBrightnessFilter;
import org.eclipse.symphony.addons.sensors.imaging.camera.EMFFeatureAzimuthElevationFOVOverlay;
import org.eclipse.symphony.addons.sensors.imaging.camera.EMFFeatureOverlay;
import org.eclipse.symphony.addons.sensors.imaging.camera.EdgeFilter;
import org.eclipse.symphony.addons.sensors.imaging.camera.ElevationFeatureReference;
import org.eclipse.symphony.addons.sensors.imaging.camera.ExposureFilter;
import org.eclipse.symphony.addons.sensors.imaging.camera.FOVOverlay;
import org.eclipse.symphony.addons.sensors.imaging.camera.FilterList;
import org.eclipse.symphony.addons.sensors.imaging.camera.GainFilter;
import org.eclipse.symphony.addons.sensors.imaging.camera.GrayScaleFilter;
import org.eclipse.symphony.addons.sensors.imaging.camera.ImageCountOverlay;
import org.eclipse.symphony.addons.sensors.imaging.camera.ImageFrozenOverlay;
import org.eclipse.symphony.addons.sensors.imaging.camera.ImageSizePolicy;
import org.eclipse.symphony.addons.sensors.imaging.camera.InvertFilter;
import org.eclipse.symphony.addons.sensors.imaging.camera.OverlayAlignment;
import org.eclipse.symphony.addons.sensors.imaging.camera.PointerCameraTool;
import org.eclipse.symphony.addons.sensors.imaging.camera.RescaleFilter;
import org.eclipse.symphony.addons.sensors.imaging.camera.SymphonyCameraToolsFactory;
import org.eclipse.symphony.addons.sensors.imaging.camera.SymphonyCameraToolsPackage;
import org.eclipse.symphony.addons.sensors.imaging.camera.SymphonyLogoOverlay;
import org.eclipse.symphony.addons.sensors.imaging.camera.ToolTipTextProvider;
import org.eclipse.symphony.addons.sensors.imaging.camera.URLImageOverlay;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SymphonyCameraToolsFactoryImpl extends EFactoryImpl implements SymphonyCameraToolsFactory
{
  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static SymphonyCameraToolsFactory init()
  {
		try {
			SymphonyCameraToolsFactory theSymphonyCameraToolsFactory = (SymphonyCameraToolsFactory)EPackage.Registry.INSTANCE.getEFactory(SymphonyCameraToolsPackage.eNS_URI);
			if (theSymphonyCameraToolsFactory != null) {
				return theSymphonyCameraToolsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SymphonyCameraToolsFactoryImpl();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public SymphonyCameraToolsFactoryImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public EObject create(EClass eClass)
  {
		switch (eClass.getClassifierID()) {
			case SymphonyCameraToolsPackage.CAMERA_VIEW_UTILITIES: return createCameraViewUtilities();
			case SymphonyCameraToolsPackage.CAMERA_VIEW_CONFIGURATION_LIST: return createCameraViewConfigurationList();
			case SymphonyCameraToolsPackage.CAMERA_VIEW_CONFIGURATION: return createCameraViewConfiguration();
			case SymphonyCameraToolsPackage.FILTER_LIST: return createFilterList();
			case SymphonyCameraToolsPackage.GRAY_SCALE_FILTER: return createGrayScaleFilter();
			case SymphonyCameraToolsPackage.EDGE_FILTER: return createEdgeFilter();
			case SymphonyCameraToolsPackage.CONTRAST_AND_BRIGHTNESS_FILTER: return createContrastAndBrightnessFilter();
			case SymphonyCameraToolsPackage.EXPOSURE_FILTER: return createExposureFilter();
			case SymphonyCameraToolsPackage.GAIN_FILTER: return createGainFilter();
			case SymphonyCameraToolsPackage.INVERT_FILTER: return createInvertFilter();
			case SymphonyCameraToolsPackage.RESCALE_FILTER: return createRescaleFilter();
			case SymphonyCameraToolsPackage.CAMERA_OVERLAY_LIST: return createCameraOverlayList();
			case SymphonyCameraToolsPackage.EMF_FEATURE_OVERLAY: return createEMFFeatureOverlay();
			case SymphonyCameraToolsPackage.CAMERA_NAME_OVERLAY: return createCameraNameOverlay();
			case SymphonyCameraToolsPackage.IMAGE_COUNT_OVERLAY: return createImageCountOverlay();
			case SymphonyCameraToolsPackage.IMAGE_FROZEN_OVERLAY: return createImageFrozenOverlay();
			case SymphonyCameraToolsPackage.URL_IMAGE_OVERLAY: return createURLImageOverlay();
			case SymphonyCameraToolsPackage.SYMPHONY_LOGO_OVERLAY: return createSymphonyLogoOverlay();
			case SymphonyCameraToolsPackage.FOV_OVERLAY: return createFOVOverlay();
			case SymphonyCameraToolsPackage.AZIMUTH_ELEVATION_FOV_OVERLAY: return createAzimuthElevationFOVOverlay();
			case SymphonyCameraToolsPackage.EMF_FEATURE_AZIMUTH_ELEVATION_FOV_OVERLAY: return createEMFFeatureAzimuthElevationFOVOverlay();
			case SymphonyCameraToolsPackage.AZIMUTH_FEATURE_REFERENCE: return createAzimuthFeatureReference();
			case SymphonyCameraToolsPackage.ELEVATION_FEATURE_REFERENCE: return createElevationFeatureReference();
			case SymphonyCameraToolsPackage.TOOL_TIP_TEXT_PROVIDER: return createToolTipTextProvider();
			case SymphonyCameraToolsPackage.CAMERA_TOOL_LIST: return createCameraToolList();
			case SymphonyCameraToolsPackage.POINTER_CAMERA_TOOL: return createPointerCameraTool();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
		switch (eDataType.getClassifierID()) {
			case SymphonyCameraToolsPackage.OVERLAY_ALIGNMENT:
				return createOverlayAlignmentFromString(eDataType, initialValue);
			case SymphonyCameraToolsPackage.IMAGE_SIZE_POLICY:
				return createImageSizePolicyFromString(eDataType, initialValue);
			case SymphonyCameraToolsPackage.COLOR3F:
				return createColor3fFromString(eDataType, initialValue);
			case SymphonyCameraToolsPackage.LIST:
				return createListFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
		switch (eDataType.getClassifierID()) {
			case SymphonyCameraToolsPackage.OVERLAY_ALIGNMENT:
				return convertOverlayAlignmentToString(eDataType, instanceValue);
			case SymphonyCameraToolsPackage.IMAGE_SIZE_POLICY:
				return convertImageSizePolicyToString(eDataType, instanceValue);
			case SymphonyCameraToolsPackage.COLOR3F:
				return convertColor3fToString(eDataType, instanceValue);
			case SymphonyCameraToolsPackage.LIST:
				return convertListToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CameraViewUtilities createCameraViewUtilities() {
		CameraViewUtilitiesImpl cameraViewUtilities = new CameraViewUtilitiesImpl();
		return cameraViewUtilities;
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public CameraViewConfigurationList createCameraViewConfigurationList()
  {
		CameraViewConfigurationListImpl cameraViewConfigurationList = new CameraViewConfigurationListImpl();
		return cameraViewConfigurationList;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public CameraViewConfiguration createCameraViewConfiguration()
  {
		CameraViewConfigurationImpl cameraViewConfiguration = new CameraViewConfigurationImpl();
		return cameraViewConfiguration;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public FilterList createFilterList()
  {
		FilterListImpl filterList = new FilterListImpl();
		return filterList;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public GrayScaleFilter createGrayScaleFilter()
  {
		GrayScaleFilterImpl grayScaleFilter = new GrayScaleFilterImpl();
		return grayScaleFilter;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EdgeFilter createEdgeFilter()
  {
		EdgeFilterImpl edgeFilter = new EdgeFilterImpl();
		return edgeFilter;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ContrastAndBrightnessFilter createContrastAndBrightnessFilter()
  {
		ContrastAndBrightnessFilterImpl contrastAndBrightnessFilter = new ContrastAndBrightnessFilterImpl();
		return contrastAndBrightnessFilter;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ExposureFilter createExposureFilter()
  {
		ExposureFilterImpl exposureFilter = new ExposureFilterImpl();
		return exposureFilter;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public GainFilter createGainFilter()
  {
		GainFilterImpl gainFilter = new GainFilterImpl();
		return gainFilter;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public InvertFilter createInvertFilter()
  {
		InvertFilterImpl invertFilter = new InvertFilterImpl();
		return invertFilter;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public RescaleFilter createRescaleFilter()
  {
		RescaleFilterImpl rescaleFilter = new RescaleFilterImpl();
		return rescaleFilter;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public CameraOverlayList createCameraOverlayList()
  {
		CameraOverlayListImpl cameraOverlayList = new CameraOverlayListImpl();
		return cameraOverlayList;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EMFFeatureOverlay createEMFFeatureOverlay()
  {
		EMFFeatureOverlayImpl emfFeatureOverlay = new EMFFeatureOverlayImpl();
		return emfFeatureOverlay;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public CameraNameOverlay createCameraNameOverlay()
  {
		CameraNameOverlayImpl cameraNameOverlay = new CameraNameOverlayImpl();
		return cameraNameOverlay;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageCountOverlay createImageCountOverlay() {
		ImageCountOverlayImpl imageCountOverlay = new ImageCountOverlayImpl();
		return imageCountOverlay;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageFrozenOverlay createImageFrozenOverlay() {
		ImageFrozenOverlayImpl imageFrozenOverlay = new ImageFrozenOverlayImpl();
		return imageFrozenOverlay;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URLImageOverlay createURLImageOverlay() {
		URLImageOverlayImpl urlImageOverlay = new URLImageOverlayImpl();
		return urlImageOverlay;
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public SymphonyLogoOverlay createSymphonyLogoOverlay()
  {
		SymphonyLogoOverlayImpl symphonyLogoOverlay = new SymphonyLogoOverlayImpl();
		return symphonyLogoOverlay;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FOVOverlay createFOVOverlay() {
		FOVOverlayImpl fovOverlay = new FOVOverlayImpl();
		return fovOverlay;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AzimuthElevationFOVOverlay createAzimuthElevationFOVOverlay() {
		AzimuthElevationFOVOverlayImpl azimuthElevationFOVOverlay = new AzimuthElevationFOVOverlayImpl();
		return azimuthElevationFOVOverlay;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMFFeatureAzimuthElevationFOVOverlay createEMFFeatureAzimuthElevationFOVOverlay() {
		EMFFeatureAzimuthElevationFOVOverlayImpl emfFeatureAzimuthElevationFOVOverlay = new EMFFeatureAzimuthElevationFOVOverlayImpl();
		return emfFeatureAzimuthElevationFOVOverlay;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AzimuthFeatureReference createAzimuthFeatureReference() {
		AzimuthFeatureReferenceImpl azimuthFeatureReference = new AzimuthFeatureReferenceImpl();
		return azimuthFeatureReference;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElevationFeatureReference createElevationFeatureReference() {
		ElevationFeatureReferenceImpl elevationFeatureReference = new ElevationFeatureReferenceImpl();
		return elevationFeatureReference;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToolTipTextProvider createToolTipTextProvider() {
		ToolTipTextProviderImpl toolTipTextProvider = new ToolTipTextProviderImpl();
		return toolTipTextProvider;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CameraToolList createCameraToolList() {
		CameraToolListImpl cameraToolList = new CameraToolListImpl();
		return cameraToolList;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PointerCameraTool createPointerCameraTool() {
		PointerCameraToolImpl pointerCameraTool = new PointerCameraToolImpl();
		return pointerCameraTool;
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public OverlayAlignment createOverlayAlignmentFromString(EDataType eDataType, String initialValue)
  {
		OverlayAlignment result = OverlayAlignment.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertOverlayAlignmentToString(EDataType eDataType, Object instanceValue)
  {
		return instanceValue == null ? null : instanceValue.toString();
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageSizePolicy createImageSizePolicyFromString(EDataType eDataType, String initialValue) {
		ImageSizePolicy result = ImageSizePolicy.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImageSizePolicyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

		/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public Color3f createColor3fFromString(EDataType eDataType, String initialValue)
  {
	  Color3f color3f = new Color3f();
	  
	  String[] values = initialValue.split(",");
	  
	  color3f.x = Float.parseFloat(values[0]);
	  color3f.y = Float.parseFloat(values[1]);
	  color3f.z = Float.parseFloat(values[2]);

	  return color3f;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public String convertColor3fToString(EDataType eDataType, Object instanceValue)
  {
	  Color3f color3f = (Color3f) instanceValue;
	  
	  String string = color3f.x + "," + color3f.y + "," + color3f.z;
	  
	  return string;
  }

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<?> createListFromString(EDataType eDataType, String initialValue) {
		return (List<?>)super.createFromString(initialValue);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertListToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public SymphonyCameraToolsPackage getSymphonyCameraToolsPackage()
  {
		return (SymphonyCameraToolsPackage)getEPackage();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static SymphonyCameraToolsPackage getPackage()
  {
		return SymphonyCameraToolsPackage.eINSTANCE;
	}

} //SymphonyCameraToolsFactoryImpl
