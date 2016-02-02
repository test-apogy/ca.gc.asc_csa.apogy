package ca.gc.asc_csa.apogy.addons.sensors.imaging.camera;
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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.ApogyAddonsSensorsImagingCameraPackage
 * @generated
 */
public interface ApogyAddonsSensorsImagingCameraFactory extends EFactory
{
  /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  ApogyAddonsSensorsImagingCameraFactory eINSTANCE = ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.impl.ApogyAddonsSensorsImagingCameraFactoryImpl.init();

  /**
	 * Returns a new object of class '<em>Camera View Utilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Camera View Utilities</em>'.
	 * @generated
	 */
	CameraViewUtilities createCameraViewUtilities();

		/**
	 * Returns a new object of class '<em>Camera View Configuration List</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Camera View Configuration List</em>'.
	 * @generated
	 */
  CameraViewConfigurationList createCameraViewConfigurationList();

  /**
	 * Returns a new object of class '<em>Camera View Configuration</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Camera View Configuration</em>'.
	 * @generated
	 */
  CameraViewConfiguration createCameraViewConfiguration();

  /**
	 * Returns a new object of class '<em>Filter List</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Filter List</em>'.
	 * @generated
	 */
  FilterList createFilterList();

  /**
	 * Returns a new object of class '<em>Gray Scale Filter</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gray Scale Filter</em>'.
	 * @generated
	 */
  GrayScaleFilter createGrayScaleFilter();

  /**
	 * Returns a new object of class '<em>Edge Filter</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Edge Filter</em>'.
	 * @generated
	 */
  EdgeFilter createEdgeFilter();

  /**
	 * Returns a new object of class '<em>Contrast And Brightness Filter</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contrast And Brightness Filter</em>'.
	 * @generated
	 */
  ContrastAndBrightnessFilter createContrastAndBrightnessFilter();

  /**
	 * Returns a new object of class '<em>Exposure Filter</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exposure Filter</em>'.
	 * @generated
	 */
  ExposureFilter createExposureFilter();

  /**
	 * Returns a new object of class '<em>Gain Filter</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gain Filter</em>'.
	 * @generated
	 */
  GainFilter createGainFilter();

  /**
	 * Returns a new object of class '<em>Invert Filter</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Invert Filter</em>'.
	 * @generated
	 */
  InvertFilter createInvertFilter();

  /**
	 * Returns a new object of class '<em>Rescale Filter</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rescale Filter</em>'.
	 * @generated
	 */
  RescaleFilter createRescaleFilter();

  /**
	 * Returns a new object of class '<em>Camera Overlay List</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Camera Overlay List</em>'.
	 * @generated
	 */
  CameraOverlayList createCameraOverlayList();

  /**
	 * Returns a new object of class '<em>EMF Feature Overlay</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>EMF Feature Overlay</em>'.
	 * @generated
	 */
  EMFFeatureOverlay createEMFFeatureOverlay();

  /**
	 * Returns a new object of class '<em>Camera Name Overlay</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Camera Name Overlay</em>'.
	 * @generated
	 */
  CameraNameOverlay createCameraNameOverlay();

  /**
	 * Returns a new object of class '<em>Image Count Overlay</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Image Count Overlay</em>'.
	 * @generated
	 */
	ImageCountOverlay createImageCountOverlay();

		/**
	 * Returns a new object of class '<em>Image Frozen Overlay</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Image Frozen Overlay</em>'.
	 * @generated
	 */
	ImageFrozenOverlay createImageFrozenOverlay();

		/**
	 * Returns a new object of class '<em>URL Image Overlay</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>URL Image Overlay</em>'.
	 * @generated
	 */
	URLImageOverlay createURLImageOverlay();

		/**
	 * Returns a new object of class '<em>Apogy Logo Overlay</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Apogy Logo Overlay</em>'.
	 * @generated
	 */
  ApogyLogoOverlay createApogyLogoOverlay();

  /**
	 * Returns a new object of class '<em>FOV Overlay</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FOV Overlay</em>'.
	 * @generated
	 */
	FOVOverlay createFOVOverlay();

		/**
	 * Returns a new object of class '<em>Azimuth Elevation FOV Overlay</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Azimuth Elevation FOV Overlay</em>'.
	 * @generated
	 */
	AzimuthElevationFOVOverlay createAzimuthElevationFOVOverlay();

		/**
	 * Returns a new object of class '<em>EMF Feature Azimuth Elevation FOV Overlay</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EMF Feature Azimuth Elevation FOV Overlay</em>'.
	 * @generated
	 */
	EMFFeatureAzimuthElevationFOVOverlay createEMFFeatureAzimuthElevationFOVOverlay();

		/**
	 * Returns a new object of class '<em>Azimuth Feature Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Azimuth Feature Reference</em>'.
	 * @generated
	 */
	AzimuthFeatureReference createAzimuthFeatureReference();

		/**
	 * Returns a new object of class '<em>Elevation Feature Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Elevation Feature Reference</em>'.
	 * @generated
	 */
	ElevationFeatureReference createElevationFeatureReference();

		/**
	 * Returns a new object of class '<em>Tool Tip Text Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tool Tip Text Provider</em>'.
	 * @generated
	 */
	ToolTipTextProvider createToolTipTextProvider();

		/**
	 * Returns a new object of class '<em>Camera Tool List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Camera Tool List</em>'.
	 * @generated
	 */
	CameraToolList createCameraToolList();

		/**
	 * Returns a new object of class '<em>Pointer Camera Tool</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pointer Camera Tool</em>'.
	 * @generated
	 */
	PointerCameraTool createPointerCameraTool();

		/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ApogyAddonsSensorsImagingCameraPackage getApogyAddonsSensorsImagingCameraPackage();

} //ApogyAddonsSensorsImagingCameraFactory
