package ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.util;
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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import ca.gc.asc_csa.apogy.addons.AbstractTool;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.AbstractTextOverlay;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.AzimuthElevationFOVOverlay;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.AzimuthFeatureReference;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.CameraImageAnnotation;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.CameraNameOverlay;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.CameraOverlay;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.CameraOverlayList;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.CameraTool;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.CameraToolList;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.CameraViewConfiguration;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.CameraViewConfigurationList;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.CameraViewUtilities;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.ContrastAndBrightnessFilter;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.DrawnCameraOverlay;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.EMFFeatureAzimuthElevationFOVOverlay;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.EMFFeatureOverlay;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.EdgeFilter;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.ElevationFeatureReference;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.ExposureFilter;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.FOVOverlay;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.FilterList;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.GainFilter;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.GrayScaleFilter;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.ImageCameraOverlay;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.ImageCountOverlay;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.ImageFilter;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.ImageFrozenOverlay;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.InvertFilter;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.PointerCameraTool;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.RescaleFilter;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.ApogyAddonsSensorsImagingCameraPackage;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.ApogyLogoOverlay;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.ToolTipTextProvider;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.URLImageOverlay;
import ca.gc.asc_csa.apogy.common.emf.Described;
import ca.gc.asc_csa.apogy.common.emf.Named;
import ca.gc.asc_csa.apogy.core.AbsolutePoseProvider;
import ca.gc.asc_csa.apogy.core.PoseProvider;
import ca.gc.asc_csa.apogy.core.invocator.AbstractToolsListContainer;
import ca.gc.asc_csa.apogy.core.invocator.VariableFeatureReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.ApogyAddonsSensorsImagingCameraPackage
 * @generated
 */
public class ApogyAddonsSensorsImagingCameraSwitch<T> extends Switch<T>
{
  /**
	 * The cached model package
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected static ApogyAddonsSensorsImagingCameraPackage modelPackage;

  /**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ApogyAddonsSensorsImagingCameraSwitch()
  {
		if (modelPackage == null) {
			modelPackage = ApogyAddonsSensorsImagingCameraPackage.eINSTANCE;
		}
	}

  /**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
		return ePackage == modelPackage;
	}

  /**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
		switch (classifierID) {
			case ApogyAddonsSensorsImagingCameraPackage.CAMERA_VIEW_UTILITIES: {
				CameraViewUtilities cameraViewUtilities = (CameraViewUtilities)theEObject;
				T result = caseCameraViewUtilities(cameraViewUtilities);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyAddonsSensorsImagingCameraPackage.CAMERA_VIEW_CONFIGURATION_LIST: {
				CameraViewConfigurationList cameraViewConfigurationList = (CameraViewConfigurationList)theEObject;
				T result = caseCameraViewConfigurationList(cameraViewConfigurationList);
				if (result == null) result = caseAbstractToolsListContainer(cameraViewConfigurationList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyAddonsSensorsImagingCameraPackage.CAMERA_VIEW_CONFIGURATION: {
				CameraViewConfiguration cameraViewConfiguration = (CameraViewConfiguration)theEObject;
				T result = caseCameraViewConfiguration(cameraViewConfiguration);
				if (result == null) result = caseVariableFeatureReference(cameraViewConfiguration);
				if (result == null) result = caseAbstractTool(cameraViewConfiguration);
				if (result == null) result = caseNamed(cameraViewConfiguration);
				if (result == null) result = caseDescribed(cameraViewConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyAddonsSensorsImagingCameraPackage.FILTER_LIST: {
				FilterList filterList = (FilterList)theEObject;
				T result = caseFilterList(filterList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyAddonsSensorsImagingCameraPackage.IMAGE_FILTER: {
				ImageFilter imageFilter = (ImageFilter)theEObject;
				T result = caseImageFilter(imageFilter);
				if (result == null) result = caseNamed(imageFilter);
				if (result == null) result = caseDescribed(imageFilter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyAddonsSensorsImagingCameraPackage.GRAY_SCALE_FILTER: {
				GrayScaleFilter grayScaleFilter = (GrayScaleFilter)theEObject;
				T result = caseGrayScaleFilter(grayScaleFilter);
				if (result == null) result = caseImageFilter(grayScaleFilter);
				if (result == null) result = caseNamed(grayScaleFilter);
				if (result == null) result = caseDescribed(grayScaleFilter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyAddonsSensorsImagingCameraPackage.EDGE_FILTER: {
				EdgeFilter edgeFilter = (EdgeFilter)theEObject;
				T result = caseEdgeFilter(edgeFilter);
				if (result == null) result = caseImageFilter(edgeFilter);
				if (result == null) result = caseNamed(edgeFilter);
				if (result == null) result = caseDescribed(edgeFilter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyAddonsSensorsImagingCameraPackage.CONTRAST_AND_BRIGHTNESS_FILTER: {
				ContrastAndBrightnessFilter contrastAndBrightnessFilter = (ContrastAndBrightnessFilter)theEObject;
				T result = caseContrastAndBrightnessFilter(contrastAndBrightnessFilter);
				if (result == null) result = caseImageFilter(contrastAndBrightnessFilter);
				if (result == null) result = caseNamed(contrastAndBrightnessFilter);
				if (result == null) result = caseDescribed(contrastAndBrightnessFilter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyAddonsSensorsImagingCameraPackage.EXPOSURE_FILTER: {
				ExposureFilter exposureFilter = (ExposureFilter)theEObject;
				T result = caseExposureFilter(exposureFilter);
				if (result == null) result = caseImageFilter(exposureFilter);
				if (result == null) result = caseNamed(exposureFilter);
				if (result == null) result = caseDescribed(exposureFilter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyAddonsSensorsImagingCameraPackage.GAIN_FILTER: {
				GainFilter gainFilter = (GainFilter)theEObject;
				T result = caseGainFilter(gainFilter);
				if (result == null) result = caseImageFilter(gainFilter);
				if (result == null) result = caseNamed(gainFilter);
				if (result == null) result = caseDescribed(gainFilter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyAddonsSensorsImagingCameraPackage.INVERT_FILTER: {
				InvertFilter invertFilter = (InvertFilter)theEObject;
				T result = caseInvertFilter(invertFilter);
				if (result == null) result = caseImageFilter(invertFilter);
				if (result == null) result = caseNamed(invertFilter);
				if (result == null) result = caseDescribed(invertFilter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyAddonsSensorsImagingCameraPackage.RESCALE_FILTER: {
				RescaleFilter rescaleFilter = (RescaleFilter)theEObject;
				T result = caseRescaleFilter(rescaleFilter);
				if (result == null) result = caseImageFilter(rescaleFilter);
				if (result == null) result = caseNamed(rescaleFilter);
				if (result == null) result = caseDescribed(rescaleFilter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyAddonsSensorsImagingCameraPackage.CAMERA_IMAGE_ANNOTATION: {
				CameraImageAnnotation cameraImageAnnotation = (CameraImageAnnotation)theEObject;
				T result = caseCameraImageAnnotation(cameraImageAnnotation);
				if (result == null) result = caseNamed(cameraImageAnnotation);
				if (result == null) result = caseDescribed(cameraImageAnnotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyAddonsSensorsImagingCameraPackage.CAMERA_OVERLAY_LIST: {
				CameraOverlayList cameraOverlayList = (CameraOverlayList)theEObject;
				T result = caseCameraOverlayList(cameraOverlayList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyAddonsSensorsImagingCameraPackage.CAMERA_OVERLAY: {
				CameraOverlay cameraOverlay = (CameraOverlay)theEObject;
				T result = caseCameraOverlay(cameraOverlay);
				if (result == null) result = caseCameraImageAnnotation(cameraOverlay);
				if (result == null) result = caseNamed(cameraOverlay);
				if (result == null) result = caseDescribed(cameraOverlay);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyAddonsSensorsImagingCameraPackage.DRAWN_CAMERA_OVERLAY: {
				DrawnCameraOverlay drawnCameraOverlay = (DrawnCameraOverlay)theEObject;
				T result = caseDrawnCameraOverlay(drawnCameraOverlay);
				if (result == null) result = caseCameraOverlay(drawnCameraOverlay);
				if (result == null) result = caseCameraImageAnnotation(drawnCameraOverlay);
				if (result == null) result = caseNamed(drawnCameraOverlay);
				if (result == null) result = caseDescribed(drawnCameraOverlay);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyAddonsSensorsImagingCameraPackage.ABSTRACT_TEXT_OVERLAY: {
				AbstractTextOverlay abstractTextOverlay = (AbstractTextOverlay)theEObject;
				T result = caseAbstractTextOverlay(abstractTextOverlay);
				if (result == null) result = caseDrawnCameraOverlay(abstractTextOverlay);
				if (result == null) result = caseCameraOverlay(abstractTextOverlay);
				if (result == null) result = caseCameraImageAnnotation(abstractTextOverlay);
				if (result == null) result = caseNamed(abstractTextOverlay);
				if (result == null) result = caseDescribed(abstractTextOverlay);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyAddonsSensorsImagingCameraPackage.EMF_FEATURE_OVERLAY: {
				EMFFeatureOverlay emfFeatureOverlay = (EMFFeatureOverlay)theEObject;
				T result = caseEMFFeatureOverlay(emfFeatureOverlay);
				if (result == null) result = caseAbstractTextOverlay(emfFeatureOverlay);
				if (result == null) result = caseDrawnCameraOverlay(emfFeatureOverlay);
				if (result == null) result = caseCameraOverlay(emfFeatureOverlay);
				if (result == null) result = caseCameraImageAnnotation(emfFeatureOverlay);
				if (result == null) result = caseNamed(emfFeatureOverlay);
				if (result == null) result = caseDescribed(emfFeatureOverlay);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyAddonsSensorsImagingCameraPackage.CAMERA_NAME_OVERLAY: {
				CameraNameOverlay cameraNameOverlay = (CameraNameOverlay)theEObject;
				T result = caseCameraNameOverlay(cameraNameOverlay);
				if (result == null) result = caseAbstractTextOverlay(cameraNameOverlay);
				if (result == null) result = caseDrawnCameraOverlay(cameraNameOverlay);
				if (result == null) result = caseCameraOverlay(cameraNameOverlay);
				if (result == null) result = caseCameraImageAnnotation(cameraNameOverlay);
				if (result == null) result = caseNamed(cameraNameOverlay);
				if (result == null) result = caseDescribed(cameraNameOverlay);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyAddonsSensorsImagingCameraPackage.IMAGE_COUNT_OVERLAY: {
				ImageCountOverlay imageCountOverlay = (ImageCountOverlay)theEObject;
				T result = caseImageCountOverlay(imageCountOverlay);
				if (result == null) result = caseAbstractTextOverlay(imageCountOverlay);
				if (result == null) result = caseDrawnCameraOverlay(imageCountOverlay);
				if (result == null) result = caseCameraOverlay(imageCountOverlay);
				if (result == null) result = caseCameraImageAnnotation(imageCountOverlay);
				if (result == null) result = caseNamed(imageCountOverlay);
				if (result == null) result = caseDescribed(imageCountOverlay);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyAddonsSensorsImagingCameraPackage.IMAGE_FROZEN_OVERLAY: {
				ImageFrozenOverlay imageFrozenOverlay = (ImageFrozenOverlay)theEObject;
				T result = caseImageFrozenOverlay(imageFrozenOverlay);
				if (result == null) result = caseAbstractTextOverlay(imageFrozenOverlay);
				if (result == null) result = caseDrawnCameraOverlay(imageFrozenOverlay);
				if (result == null) result = caseCameraOverlay(imageFrozenOverlay);
				if (result == null) result = caseCameraImageAnnotation(imageFrozenOverlay);
				if (result == null) result = caseNamed(imageFrozenOverlay);
				if (result == null) result = caseDescribed(imageFrozenOverlay);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyAddonsSensorsImagingCameraPackage.IMAGE_CAMERA_OVERLAY: {
				ImageCameraOverlay imageCameraOverlay = (ImageCameraOverlay)theEObject;
				T result = caseImageCameraOverlay(imageCameraOverlay);
				if (result == null) result = caseCameraOverlay(imageCameraOverlay);
				if (result == null) result = caseCameraImageAnnotation(imageCameraOverlay);
				if (result == null) result = caseNamed(imageCameraOverlay);
				if (result == null) result = caseDescribed(imageCameraOverlay);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyAddonsSensorsImagingCameraPackage.URL_IMAGE_OVERLAY: {
				URLImageOverlay urlImageOverlay = (URLImageOverlay)theEObject;
				T result = caseURLImageOverlay(urlImageOverlay);
				if (result == null) result = caseImageCameraOverlay(urlImageOverlay);
				if (result == null) result = caseCameraOverlay(urlImageOverlay);
				if (result == null) result = caseCameraImageAnnotation(urlImageOverlay);
				if (result == null) result = caseNamed(urlImageOverlay);
				if (result == null) result = caseDescribed(urlImageOverlay);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyAddonsSensorsImagingCameraPackage.APOGY_LOGO_OVERLAY: {
				ApogyLogoOverlay apogyLogoOverlay = (ApogyLogoOverlay)theEObject;
				T result = caseApogyLogoOverlay(apogyLogoOverlay);
				if (result == null) result = caseImageCameraOverlay(apogyLogoOverlay);
				if (result == null) result = caseCameraOverlay(apogyLogoOverlay);
				if (result == null) result = caseCameraImageAnnotation(apogyLogoOverlay);
				if (result == null) result = caseNamed(apogyLogoOverlay);
				if (result == null) result = caseDescribed(apogyLogoOverlay);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyAddonsSensorsImagingCameraPackage.FOV_OVERLAY: {
				FOVOverlay fovOverlay = (FOVOverlay)theEObject;
				T result = caseFOVOverlay(fovOverlay);
				if (result == null) result = caseDrawnCameraOverlay(fovOverlay);
				if (result == null) result = caseToolTipTextProvider(fovOverlay);
				if (result == null) result = caseCameraOverlay(fovOverlay);
				if (result == null) result = caseCameraImageAnnotation(fovOverlay);
				if (result == null) result = caseNamed(fovOverlay);
				if (result == null) result = caseDescribed(fovOverlay);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyAddonsSensorsImagingCameraPackage.AZIMUTH_ELEVATION_FOV_OVERLAY: {
				AzimuthElevationFOVOverlay azimuthElevationFOVOverlay = (AzimuthElevationFOVOverlay)theEObject;
				T result = caseAzimuthElevationFOVOverlay(azimuthElevationFOVOverlay);
				if (result == null) result = caseFOVOverlay(azimuthElevationFOVOverlay);
				if (result == null) result = caseDrawnCameraOverlay(azimuthElevationFOVOverlay);
				if (result == null) result = caseToolTipTextProvider(azimuthElevationFOVOverlay);
				if (result == null) result = caseCameraOverlay(azimuthElevationFOVOverlay);
				if (result == null) result = caseCameraImageAnnotation(azimuthElevationFOVOverlay);
				if (result == null) result = caseNamed(azimuthElevationFOVOverlay);
				if (result == null) result = caseDescribed(azimuthElevationFOVOverlay);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyAddonsSensorsImagingCameraPackage.EMF_FEATURE_AZIMUTH_ELEVATION_FOV_OVERLAY: {
				EMFFeatureAzimuthElevationFOVOverlay emfFeatureAzimuthElevationFOVOverlay = (EMFFeatureAzimuthElevationFOVOverlay)theEObject;
				T result = caseEMFFeatureAzimuthElevationFOVOverlay(emfFeatureAzimuthElevationFOVOverlay);
				if (result == null) result = caseAzimuthElevationFOVOverlay(emfFeatureAzimuthElevationFOVOverlay);
				if (result == null) result = caseFOVOverlay(emfFeatureAzimuthElevationFOVOverlay);
				if (result == null) result = caseDrawnCameraOverlay(emfFeatureAzimuthElevationFOVOverlay);
				if (result == null) result = caseToolTipTextProvider(emfFeatureAzimuthElevationFOVOverlay);
				if (result == null) result = caseCameraOverlay(emfFeatureAzimuthElevationFOVOverlay);
				if (result == null) result = caseCameraImageAnnotation(emfFeatureAzimuthElevationFOVOverlay);
				if (result == null) result = caseNamed(emfFeatureAzimuthElevationFOVOverlay);
				if (result == null) result = caseDescribed(emfFeatureAzimuthElevationFOVOverlay);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyAddonsSensorsImagingCameraPackage.AZIMUTH_FEATURE_REFERENCE: {
				AzimuthFeatureReference azimuthFeatureReference = (AzimuthFeatureReference)theEObject;
				T result = caseAzimuthFeatureReference(azimuthFeatureReference);
				if (result == null) result = caseVariableFeatureReference(azimuthFeatureReference);
				if (result == null) result = caseNamed(azimuthFeatureReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyAddonsSensorsImagingCameraPackage.ELEVATION_FEATURE_REFERENCE: {
				ElevationFeatureReference elevationFeatureReference = (ElevationFeatureReference)theEObject;
				T result = caseElevationFeatureReference(elevationFeatureReference);
				if (result == null) result = caseVariableFeatureReference(elevationFeatureReference);
				if (result == null) result = caseNamed(elevationFeatureReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyAddonsSensorsImagingCameraPackage.TOOL_TIP_TEXT_PROVIDER: {
				ToolTipTextProvider toolTipTextProvider = (ToolTipTextProvider)theEObject;
				T result = caseToolTipTextProvider(toolTipTextProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyAddonsSensorsImagingCameraPackage.CAMERA_TOOL: {
				CameraTool cameraTool = (CameraTool)theEObject;
				T result = caseCameraTool(cameraTool);
				if (result == null) result = caseCameraImageAnnotation(cameraTool);
				if (result == null) result = caseNamed(cameraTool);
				if (result == null) result = caseDescribed(cameraTool);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyAddonsSensorsImagingCameraPackage.CAMERA_TOOL_LIST: {
				CameraToolList cameraToolList = (CameraToolList)theEObject;
				T result = caseCameraToolList(cameraToolList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyAddonsSensorsImagingCameraPackage.POINTER_CAMERA_TOOL: {
				PointerCameraTool pointerCameraTool = (PointerCameraTool)theEObject;
				T result = casePointerCameraTool(pointerCameraTool);
				if (result == null) result = caseCameraTool(pointerCameraTool);
				if (result == null) result = caseToolTipTextProvider(pointerCameraTool);
				if (result == null) result = caseAbsolutePoseProvider(pointerCameraTool);
				if (result == null) result = caseCameraImageAnnotation(pointerCameraTool);
				if (result == null) result = casePoseProvider(pointerCameraTool);
				if (result == null) result = caseNamed(pointerCameraTool);
				if (result == null) result = caseDescribed(pointerCameraTool);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Camera View Utilities</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Camera View Utilities</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCameraViewUtilities(CameraViewUtilities object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Camera View Configuration List</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Camera View Configuration List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseCameraViewConfigurationList(CameraViewConfigurationList object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Camera View Configuration</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Camera View Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseCameraViewConfiguration(CameraViewConfiguration object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Filter List</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filter List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseFilterList(FilterList object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Image Filter</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseImageFilter(ImageFilter object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Gray Scale Filter</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gray Scale Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseGrayScaleFilter(GrayScaleFilter object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Edge Filter</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Edge Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseEdgeFilter(EdgeFilter object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Contrast And Brightness Filter</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contrast And Brightness Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseContrastAndBrightnessFilter(ContrastAndBrightnessFilter object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Exposure Filter</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exposure Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseExposureFilter(ExposureFilter object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Gain Filter</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gain Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseGainFilter(GainFilter object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Invert Filter</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Invert Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseInvertFilter(InvertFilter object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Rescale Filter</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rescale Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseRescaleFilter(RescaleFilter object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Camera Image Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Camera Image Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCameraImageAnnotation(CameraImageAnnotation object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Camera Overlay List</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Camera Overlay List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseCameraOverlayList(CameraOverlayList object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Camera Overlay</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Camera Overlay</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseCameraOverlay(CameraOverlay object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Drawn Camera Overlay</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Drawn Camera Overlay</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseDrawnCameraOverlay(DrawnCameraOverlay object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Text Overlay</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Text Overlay</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseAbstractTextOverlay(AbstractTextOverlay object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>EMF Feature Overlay</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EMF Feature Overlay</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseEMFFeatureOverlay(EMFFeatureOverlay object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Camera Name Overlay</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Camera Name Overlay</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseCameraNameOverlay(CameraNameOverlay object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Image Count Overlay</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image Count Overlay</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImageCountOverlay(ImageCountOverlay object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Image Frozen Overlay</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image Frozen Overlay</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImageFrozenOverlay(ImageFrozenOverlay object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Image Camera Overlay</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image Camera Overlay</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseImageCameraOverlay(ImageCameraOverlay object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>URL Image Overlay</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>URL Image Overlay</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseURLImageOverlay(URLImageOverlay object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Apogy Logo Overlay</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Apogy Logo Overlay</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseApogyLogoOverlay(ApogyLogoOverlay object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>FOV Overlay</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FOV Overlay</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFOVOverlay(FOVOverlay object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Azimuth Elevation FOV Overlay</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Azimuth Elevation FOV Overlay</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAzimuthElevationFOVOverlay(AzimuthElevationFOVOverlay object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>EMF Feature Azimuth Elevation FOV Overlay</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EMF Feature Azimuth Elevation FOV Overlay</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEMFFeatureAzimuthElevationFOVOverlay(EMFFeatureAzimuthElevationFOVOverlay object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Azimuth Feature Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Azimuth Feature Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAzimuthFeatureReference(AzimuthFeatureReference object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Elevation Feature Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Elevation Feature Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElevationFeatureReference(ElevationFeatureReference object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Tool Tip Text Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tool Tip Text Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToolTipTextProvider(ToolTipTextProvider object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Camera Tool</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Camera Tool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCameraTool(CameraTool object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Camera Tool List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Camera Tool List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCameraToolList(CameraToolList object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Pointer Camera Tool</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pointer Camera Tool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePointerCameraTool(PointerCameraTool object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Tools List Container</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Tools List Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseAbstractToolsListContainer(AbstractToolsListContainer object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Feature Reference</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Feature Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseVariableFeatureReference(VariableFeatureReference object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Named</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseNamed(Named object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Described</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Described</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseDescribed(Described object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Tool</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Tool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseAbstractTool(AbstractTool object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Pose Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pose Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePoseProvider(PoseProvider object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Absolute Pose Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Absolute Pose Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbsolutePoseProvider(AbsolutePoseProvider object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
  @Override
  public T defaultCase(EObject object)
  {
		return null;
	}

} //ApogyAddonsSensorsImagingCameraSwitch
