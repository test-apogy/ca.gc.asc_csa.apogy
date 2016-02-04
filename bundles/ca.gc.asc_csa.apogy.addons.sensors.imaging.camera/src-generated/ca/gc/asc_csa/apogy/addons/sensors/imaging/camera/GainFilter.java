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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gain Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.GainFilter#getGain <em>Gain</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.GainFilter#getBias <em>Bias</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.ApogyAddonsSensorsImagingCameraPackage#getGainFilter()
 * @model
 * @generated
 */
public interface GainFilter extends ImageFilter
{
  /**
	 * Returns the value of the '<em><b>Gain</b></em>' attribute.
	 * The default value is <code>"50"</code>.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Gain</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Gain</em>' attribute.
	 * @see #setGain(double)
	 * @see ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.ApogyAddonsSensorsImagingCameraPackage#getGainFilter_Gain()
	 * @model default="50" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='FILTER_SETTING'"
	 * @generated
	 */
  double getGain();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.GainFilter#getGain <em>Gain</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gain</em>' attribute.
	 * @see #getGain()
	 * @generated
	 */
  void setGain(double value);

  /**
	 * Returns the value of the '<em><b>Bias</b></em>' attribute.
	 * The default value is <code>"50"</code>.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bias</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Bias</em>' attribute.
	 * @see #setBias(double)
	 * @see ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.ApogyAddonsSensorsImagingCameraPackage#getGainFilter_Bias()
	 * @model default="50" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='FILTER_SETTING'"
	 * @generated
	 */
  double getBias();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.GainFilter#getBias <em>Bias</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bias</em>' attribute.
	 * @see #getBias()
	 * @generated
	 */
  void setBias(double value);

} // GainFilter
