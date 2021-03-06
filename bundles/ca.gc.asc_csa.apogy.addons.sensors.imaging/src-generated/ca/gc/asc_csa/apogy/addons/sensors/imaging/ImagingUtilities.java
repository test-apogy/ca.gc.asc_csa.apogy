package ca.gc.asc_csa.apogy.addons.sensors.imaging;
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

import java.awt.Color;

import org.eclipse.emf.ecore.EObject;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.impl.ImagingUtilitiesImpl;
import ca.gc.asc_csa.apogy.common.images.AbstractEImage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Imaging Utilities</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ca.gc.asc_csa.apogy.addons.sensors.imaging.ApogyAddonsSensorsImagingPackage#getImagingUtilities()
 * @model
 * @generated
 */
public interface ImagingUtilities extends EObject 
{
	
	/**
	 * @generated_NOT
	 */
	public static ImagingUtilities INSTANCE = ImagingUtilitiesImpl.getInstance();
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the horizontal angular position associated with a specified horizontal pixel position in the image using a linear relationship for a specified ImageSnapshot.
	 * @param imageSnapshot The specified ImageSnapshot.
	 * @param horizontalPixelPosition The horizontal pixel position (positive toward the right).
	 * @return The horizontal angle, in radians.
	 * <!-- end-model-doc -->
	 * @model unique="false" imageSnapshotUnique="false" horizontalPixelPositionUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel apogy_units='rad'"
	 * @generated
	 */
	double linearConvertToHorizontalAngle(ImageSnapshot imageSnapshot, int horizontalPixelPosition);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the vertical angular position associated with a specified vertical pixel position in the image using a linear relationship for a specified ImageSnapshot.
	 * @param imageSnapshot The specified ImageSnapshot.
	 * @param verticalPixelPosition The vertical pixel position (positive toward the bottom of the image).
	 * @return The horizontal angle, in radians.
	 * <!-- end-model-doc -->
	 * @model unique="false" imageSnapshotUnique="false" verticalPixelPositionUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel apogy_units='rad'"
	 * @generated
	 */
	double linearConvertToVerticalAngle(ImageSnapshot imageSnapshot, int verticalPixelPosition);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Creates a transparent overlay showing horizontal and vertical graduated lines over an image to convey elevation and azimuth information.
	 * @param imageWidth The image width, in pixels.
	 * @param imageHeight The image height, in pixels.
	 * @param panAngle PTZ pan angle, in degrees.
	 * @param tiltAngle PTZ tilt angle, in degrees.
	 * @param horizontalFOVAngle Horizontal FOV, in degrees.
	 * @param verticalFOVAngle Vertical FOV, in degrees.
	 * @param azimuthDirection The azimuth direction.
	 * @param elevationDirection The elevation direction.
	 * @param angleInterval The interval, in degrees, for which to display numericals.
	 * @param fontName The name of the font.
	 * @param fontSize The size of the font.
	 * @param positiveColor The color to use for positive values.
	 * @param negativeColor The color to use for negative values.
	 * @param lineWidth The width of the line, in pixels.
	 * @return The image.
	 * <!-- end-model-doc -->
	 * @model unique="false" imageWidthUnique="false"
	 *        imageWidthAnnotation="http://www.eclipse.org/emf/2002/GenModel apogy_units='pixel'" imageHeightUnique="false"
	 *        imageHeightAnnotation="http://www.eclipse.org/emf/2002/GenModel apogy_units='pixel'" panAngleUnique="false"
	 *        panAngleAnnotation="http://www.eclipse.org/emf/2002/GenModel apogy_units='deg'" tiltAngleUnique="false"
	 *        tiltAngleAnnotation="http://www.eclipse.org/emf/2002/GenModel apogy_units='deg'" horizontalFOVAngleUnique="false"
	 *        horizontalFOVAngleAnnotation="http://www.eclipse.org/emf/2002/GenModel apogy_units='deg'" verticalFOVAngleUnique="false"
	 *        verticalFOVAngleAnnotation="http://www.eclipse.org/emf/2002/GenModel apogy_units='deg'" azimuthDirectionUnique="false" elevationDirectionUnique="false" angleIntervalUnique="false"
	 *        angleIntervalAnnotation="http://www.eclipse.org/emf/2002/GenModel apogy_units='deg'" fontNameUnique="false" fontSizeUnique="false" positiveColorDataType="ca.gc.asc_csa.apogy.addons.sensors.imaging.Color" positiveColorUnique="false" negativeColorDataType="ca.gc.asc_csa.apogy.addons.sensors.imaging.Color" negativeColorUnique="false" lineWidthUnique="false"
	 * @generated
	 */
	AbstractEImage getAzimuthElevationOverlay(int imageWidth, int imageHeight, double panAngle, double tiltAngle, double horizontalFOVAngle, double verticalFOVAngle, AzimuthDirection azimuthDirection, ElevationDirection elevationDirection, int angleInterval, String fontName, int fontSize, Color positiveColor, Color negativeColor, int lineWidth);

} // ImagingUtilities
