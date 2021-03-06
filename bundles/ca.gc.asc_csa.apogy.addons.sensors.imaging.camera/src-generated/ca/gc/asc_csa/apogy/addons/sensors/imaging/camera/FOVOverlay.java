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

import javax.vecmath.Color3f;

import ca.gc.asc_csa.apogy.addons.sensors.imaging.AzimuthDirection;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.ElevationDirection;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FOV Overlay</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.FOVOverlay#getLineWidth <em>Line Width</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.FOVOverlay#getPositiveValuesColor <em>Positive Values Color</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.FOVOverlay#getNegativeValueColor <em>Negative Value Color</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.FOVOverlay#getAngleInterval <em>Angle Interval</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.FOVOverlay#getFontName <em>Font Name</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.FOVOverlay#getFontSize <em>Font Size</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.FOVOverlay#getAzimuthDirection <em>Azimuth Direction</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.FOVOverlay#getElevationDirection <em>Elevation Direction</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.ApogyAddonsSensorsImagingCameraPackage#getFOVOverlay()
 * @model
 * @generated
 */
public interface FOVOverlay extends DrawnCameraOverlay, ToolTipTextProvider {

	/**
	 * Returns the value of the '<em><b>Line Width</b></em>' attribute.
	 * The default value is <code>"2"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Width</em>' attribute.
	 * @see #setLineWidth(int)
	 * @see ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.ApogyAddonsSensorsImagingCameraPackage#getFOVOverlay_LineWidth()
	 * @model default="2" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='OVERLAY_PROPERTIES'"
	 * @generated
	 */
	int getLineWidth();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.FOVOverlay#getLineWidth <em>Line Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Width</em>' attribute.
	 * @see #getLineWidth()
	 * @generated
	 */
	void setLineWidth(int value);

	/**
	 * Returns the value of the '<em><b>Positive Values Color</b></em>' attribute.
	 * The default value is <code>"0.0,1.0,0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Positive Values Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Positive Values Color</em>' attribute.
	 * @see #setPositiveValuesColor(Color3f)
	 * @see ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.ApogyAddonsSensorsImagingCameraPackage#getFOVOverlay_PositiveValuesColor()
	 * @model default="0.0,1.0,0.0" unique="false" dataType="ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.Color3f"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='OVERLAY_PROPERTIES'"
	 * @generated
	 */
	Color3f getPositiveValuesColor();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.FOVOverlay#getPositiveValuesColor <em>Positive Values Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Positive Values Color</em>' attribute.
	 * @see #getPositiveValuesColor()
	 * @generated
	 */
	void setPositiveValuesColor(Color3f value);

	/**
	 * Returns the value of the '<em><b>Negative Value Color</b></em>' attribute.
	 * The default value is <code>"1.0,0.0,0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Negative Value Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Negative Value Color</em>' attribute.
	 * @see #setNegativeValueColor(Color3f)
	 * @see ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.ApogyAddonsSensorsImagingCameraPackage#getFOVOverlay_NegativeValueColor()
	 * @model default="1.0,0.0,0.0" unique="false" dataType="ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.Color3f"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='OVERLAY_PROPERTIES'"
	 * @generated
	 */
	Color3f getNegativeValueColor();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.FOVOverlay#getNegativeValueColor <em>Negative Value Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Negative Value Color</em>' attribute.
	 * @see #getNegativeValueColor()
	 * @generated
	 */
	void setNegativeValueColor(Color3f value);

	/**
	 * Returns the value of the '<em><b>Angle Interval</b></em>' attribute.
	 * The default value is <code>"5"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  The interval, in degrees, for which to display numericals.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Angle Interval</em>' attribute.
	 * @see #setAngleInterval(int)
	 * @see ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.ApogyAddonsSensorsImagingCameraPackage#getFOVOverlay_AngleInterval()
	 * @model default="5" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='OVERLAY_PROPERTIES' apogy_units='deg'"
	 * @generated
	 */
	int getAngleInterval();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.FOVOverlay#getAngleInterval <em>Angle Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle Interval</em>' attribute.
	 * @see #getAngleInterval()
	 * @generated
	 */
	void setAngleInterval(int value);

	/**
	 * Returns the value of the '<em><b>Font Name</b></em>' attribute.
	 * The default value is <code>"SansSerif"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Name of the font to use.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Font Name</em>' attribute.
	 * @see #setFontName(String)
	 * @see ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.ApogyAddonsSensorsImagingCameraPackage#getFOVOverlay_FontName()
	 * @model default="SansSerif" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='FONT_PROPERTIES'"
	 * @generated
	 */
	String getFontName();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.FOVOverlay#getFontName <em>Font Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Name</em>' attribute.
	 * @see #getFontName()
	 * @generated
	 */
	void setFontName(String value);

	/**
	 * Returns the value of the '<em><b>Font Size</b></em>' attribute.
	 * The default value is <code>"10"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  The font size.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Font Size</em>' attribute.
	 * @see #setFontSize(int)
	 * @see ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.ApogyAddonsSensorsImagingCameraPackage#getFOVOverlay_FontSize()
	 * @model default="10" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='FONT_PROPERTIES'"
	 * @generated
	 */
	int getFontSize();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.FOVOverlay#getFontSize <em>Font Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Size</em>' attribute.
	 * @see #getFontSize()
	 * @generated
	 */
	void setFontSize(int value);

	/**
	 * Returns the value of the '<em><b>Azimuth Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link ca.gc.asc_csa.apogy.addons.sensors.imaging.AzimuthDirection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Azimuth Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  The direction of the azimuth.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Azimuth Direction</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.addons.sensors.imaging.AzimuthDirection
	 * @see #setAzimuthDirection(AzimuthDirection)
	 * @see ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.ApogyAddonsSensorsImagingCameraPackage#getFOVOverlay_AzimuthDirection()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='DIRECTIONS_PROPERTIES'"
	 * @generated
	 */
	AzimuthDirection getAzimuthDirection();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.FOVOverlay#getAzimuthDirection <em>Azimuth Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Azimuth Direction</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.addons.sensors.imaging.AzimuthDirection
	 * @see #getAzimuthDirection()
	 * @generated
	 */
	void setAzimuthDirection(AzimuthDirection value);

	/**
	 * Returns the value of the '<em><b>Elevation Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link ca.gc.asc_csa.apogy.addons.sensors.imaging.ElevationDirection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elevation Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  The direction of the elevation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Elevation Direction</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.addons.sensors.imaging.ElevationDirection
	 * @see #setElevationDirection(ElevationDirection)
	 * @see ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.ApogyAddonsSensorsImagingCameraPackage#getFOVOverlay_ElevationDirection()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='DIRECTIONS_PROPERTIES'"
	 * @generated
	 */
	ElevationDirection getElevationDirection();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.FOVOverlay#getElevationDirection <em>Elevation Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elevation Direction</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.addons.sensors.imaging.ElevationDirection
	 * @see #getElevationDirection()
	 * @generated
	 */
	void setElevationDirection(ElevationDirection value);
} // FOVOverlay
