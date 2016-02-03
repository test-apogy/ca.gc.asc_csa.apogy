package ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.impl;
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

import java.util.List;
import javax.vecmath.Color3f;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.AzimuthElevationFOVOverlay;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.AzimuthFeatureReference;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.CameraNameOverlay;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.CameraOverlayList;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.CameraToolList;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.CameraViewConfiguration;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.CameraViewConfigurationList;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.CameraViewUtilities;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.ContrastAndBrightnessFilter;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.EMFFeatureAzimuthElevationFOVOverlay;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.EMFFeatureOverlay;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.EdgeFilter;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.ElevationFeatureReference;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.ExposureFilter;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.FOVOverlay;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.FilterList;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.GainFilter;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.GrayScaleFilter;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.ImageCountOverlay;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.ImageFrozenOverlay;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.ImageSizePolicy;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.InvertFilter;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.OverlayAlignment;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.PointerCameraTool;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.RescaleFilter;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.ApogyAddonsSensorsImagingCameraFactory;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.ApogyAddonsSensorsImagingCameraPackage;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.ApogyLogoOverlay;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.ToolTipTextProvider;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.URLImageOverlay;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyAddonsSensorsImagingCameraFactoryImpl extends EFactoryImpl implements ApogyAddonsSensorsImagingCameraFactory
{
  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static ApogyAddonsSensorsImagingCameraFactory init()
  {
		try {
			ApogyAddonsSensorsImagingCameraFactory theApogyAddonsSensorsImagingCameraFactory = (ApogyAddonsSensorsImagingCameraFactory)EPackage.Registry.INSTANCE.getEFactory(ApogyAddonsSensorsImagingCameraPackage.eNS_URI);
			if (theApogyAddonsSensorsImagingCameraFactory != null) {
				return theApogyAddonsSensorsImagingCameraFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ApogyAddonsSensorsImagingCameraFactoryImpl();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ApogyAddonsSensorsImagingCameraFactoryImpl()
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
			case ApogyAddonsSensorsImagingCameraPackage.CAMERA_VIEW_UTILITIES: return createCameraViewUtilities();
			case ApogyAddonsSensorsImagingCameraPackage.CAMERA_VIEW_CONFIGURATION_LIST: return createCameraViewConfigurationList();
			case ApogyAddonsSensorsImagingCameraPackage.CAMERA_VIEW_CONFIGURATION: return createCameraViewConfiguration();
			case ApogyAddonsSensorsImagingCameraPackage.FILTER_LIST: return createFilterList();
			case ApogyAddonsSensorsImagingCameraPackage.GRAY_SCALE_FILTER: return createGrayScaleFilter();
			case ApogyAddonsSensorsImagingCameraPackage.EDGE_FILTER: return createEdgeFilter();
			case ApogyAddonsSensorsImagingCameraPackage.CONTRAST_AND_BRIGHTNESS_FILTER: return createContrastAndBrightnessFilter();
			case ApogyAddonsSensorsImagingCameraPackage.EXPOSURE_FILTER: return createExposureFilter();
			case ApogyAddonsSensorsImagingCameraPackage.GAIN_FILTER: return createGainFilter();
			case ApogyAddonsSensorsImagingCameraPackage.INVERT_FILTER: return createInvertFilter();
			case ApogyAddonsSensorsImagingCameraPackage.RESCALE_FILTER: return createRescaleFilter();
			case ApogyAddonsSensorsImagingCameraPackage.CAMERA_OVERLAY_LIST: return createCameraOverlayList();
			case ApogyAddonsSensorsImagingCameraPackage.EMF_FEATURE_OVERLAY: return createEMFFeatureOverlay();
			case ApogyAddonsSensorsImagingCameraPackage.CAMERA_NAME_OVERLAY: return createCameraNameOverlay();
			case ApogyAddonsSensorsImagingCameraPackage.IMAGE_COUNT_OVERLAY: return createImageCountOverlay();
			case ApogyAddonsSensorsImagingCameraPackage.IMAGE_FROZEN_OVERLAY: return createImageFrozenOverlay();
			case ApogyAddonsSensorsImagingCameraPackage.URL_IMAGE_OVERLAY: return createURLImageOverlay();
			case ApogyAddonsSensorsImagingCameraPackage.APOGY_LOGO_OVERLAY: return createApogyLogoOverlay();
			case ApogyAddonsSensorsImagingCameraPackage.FOV_OVERLAY: return createFOVOverlay();
			case ApogyAddonsSensorsImagingCameraPackage.AZIMUTH_ELEVATION_FOV_OVERLAY: return createAzimuthElevationFOVOverlay();
			case ApogyAddonsSensorsImagingCameraPackage.EMF_FEATURE_AZIMUTH_ELEVATION_FOV_OVERLAY: return createEMFFeatureAzimuthElevationFOVOverlay();
			case ApogyAddonsSensorsImagingCameraPackage.AZIMUTH_FEATURE_REFERENCE: return createAzimuthFeatureReference();
			case ApogyAddonsSensorsImagingCameraPackage.ELEVATION_FEATURE_REFERENCE: return createElevationFeatureReference();
			case ApogyAddonsSensorsImagingCameraPackage.TOOL_TIP_TEXT_PROVIDER: return createToolTipTextProvider();
			case ApogyAddonsSensorsImagingCameraPackage.CAMERA_TOOL_LIST: return createCameraToolList();
			case ApogyAddonsSensorsImagingCameraPackage.POINTER_CAMERA_TOOL: return createPointerCameraTool();
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
			case ApogyAddonsSensorsImagingCameraPackage.OVERLAY_ALIGNMENT:
				return createOverlayAlignmentFromString(eDataType, initialValue);
			case ApogyAddonsSensorsImagingCameraPackage.IMAGE_SIZE_POLICY:
				return createImageSizePolicyFromString(eDataType, initialValue);
			case ApogyAddonsSensorsImagingCameraPackage.COLOR3F:
				return createColor3fFromString(eDataType, initialValue);
			case ApogyAddonsSensorsImagingCameraPackage.LIST:
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
			case ApogyAddonsSensorsImagingCameraPackage.OVERLAY_ALIGNMENT:
				return convertOverlayAlignmentToString(eDataType, instanceValue);
			case ApogyAddonsSensorsImagingCameraPackage.IMAGE_SIZE_POLICY:
				return convertImageSizePolicyToString(eDataType, instanceValue);
			case ApogyAddonsSensorsImagingCameraPackage.COLOR3F:
				return convertColor3fToString(eDataType, instanceValue);
			case ApogyAddonsSensorsImagingCameraPackage.LIST:
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
  public ApogyLogoOverlay createApogyLogoOverlay()
  {
		ApogyLogoOverlayImpl apogyLogoOverlay = new ApogyLogoOverlayImpl();
		return apogyLogoOverlay;
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
	public ApogyAddonsSensorsImagingCameraPackage getApogyAddonsSensorsImagingCameraPackage() {
		return (ApogyAddonsSensorsImagingCameraPackage)getEPackage();
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static ApogyAddonsSensorsImagingCameraPackage getPackage()
  {
		return ApogyAddonsSensorsImagingCameraPackage.eINSTANCE;
	}

} //ApogyAddonsSensorsImagingCameraFactoryImpl
