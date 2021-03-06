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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Text Overlay</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.AbstractTextOverlay#getFontName <em>Font Name</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.AbstractTextOverlay#getFontSize <em>Font Size</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.AbstractTextOverlay#getHorizontalOffset <em>Horizontal Offset</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.AbstractTextOverlay#getVerticalOffset <em>Vertical Offset</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.AbstractTextOverlay#getTextColor <em>Text Color</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.ApogyAddonsSensorsImagingCameraPackage#getAbstractTextOverlay()
 * @model abstract="true"
 * @generated
 */
public interface AbstractTextOverlay extends DrawnCameraOverlay
{
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
	 * @see ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.ApogyAddonsSensorsImagingCameraPackage#getAbstractTextOverlay_FontName()
	 * @model default="SansSerif" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='FONT_PROPERTIES'"
	 * @generated
	 */
  String getFontName();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.AbstractTextOverlay#getFontName <em>Font Name</em>}' attribute.
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
	 * @see ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.ApogyAddonsSensorsImagingCameraPackage#getAbstractTextOverlay_FontSize()
	 * @model default="10" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='FONT_PROPERTIES'"
	 * @generated
	 */
  int getFontSize();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.AbstractTextOverlay#getFontSize <em>Font Size</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Size</em>' attribute.
	 * @see #getFontSize()
	 * @generated
	 */
  void setFontSize(int value);

  /**
	 * Returns the value of the '<em><b>Horizontal Offset</b></em>' attribute.
	 * The default value is <code>"10"</code>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  The minimum distance of text to image left or right edge, in pixel.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Horizontal Offset</em>' attribute.
	 * @see #setHorizontalOffset(int)
	 * @see ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.ApogyAddonsSensorsImagingCameraPackage#getAbstractTextOverlay_HorizontalOffset()
	 * @model default="10" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='OVERLAY_POSITION_PROPERTIES'"
	 * @generated
	 */
  int getHorizontalOffset();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.AbstractTextOverlay#getHorizontalOffset <em>Horizontal Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Horizontal Offset</em>' attribute.
	 * @see #getHorizontalOffset()
	 * @generated
	 */
  void setHorizontalOffset(int value);

  /**
	 * Returns the value of the '<em><b>Vertical Offset</b></em>' attribute.
	 * The default value is <code>"10"</code>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  The minimum distance of text to image upper or lower edge, in pixel.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vertical Offset</em>' attribute.
	 * @see #setVerticalOffset(int)
	 * @see ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.ApogyAddonsSensorsImagingCameraPackage#getAbstractTextOverlay_VerticalOffset()
	 * @model default="10" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='OVERLAY_POSITION_PROPERTIES'"
	 * @generated
	 */
  int getVerticalOffset();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.AbstractTextOverlay#getVerticalOffset <em>Vertical Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vertical Offset</em>' attribute.
	 * @see #getVerticalOffset()
	 * @generated
	 */
  void setVerticalOffset(int value);

  /**
	 * Returns the value of the '<em><b>Text Color</b></em>' attribute.
	 * The default value is <code>"0.0,1.0,0.0"</code>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  The text color.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Text Color</em>' attribute.
	 * @see #setTextColor(Color3f)
	 * @see ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.ApogyAddonsSensorsImagingCameraPackage#getAbstractTextOverlay_TextColor()
	 * @model default="0.0,1.0,0.0" unique="false" dataType="ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.Color3f"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='FONT_PROPERTIES'"
	 * @generated
	 */
  Color3f getTextColor();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.AbstractTextOverlay#getTextColor <em>Text Color</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Color</em>' attribute.
	 * @see #getTextColor()
	 * @generated
	 */
  void setTextColor(Color3f value);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the string that will be displayed in the screen.
	 * Sub-classes should overload this method.
	 * @return The string to display.
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
  String getDisplayedString();

} // AbstractTextOverlay
