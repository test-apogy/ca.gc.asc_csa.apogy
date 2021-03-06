package ca.gc.asc_csa.apogy.core.environment;
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
 * A representation of the model object '<em><b>Image Map Layer Presentation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Presentation properties associated to an Image Layer.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.ImageMapLayerPresentation#getAlpha <em>Alpha</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage#getImageMapLayerPresentation()
 * @model
 * @generated
 */
public interface ImageMapLayerPresentation extends MapLayerPresentation, RectangularRegionImage {
	/**
	 * Returns the value of the '<em><b>Alpha</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The alpha to use to display this layer, from fully opaque (1.0f) to fully transparent (0.0f).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alpha</em>' attribute.
	 * @see #setAlpha(float)
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage#getImageMapLayerPresentation_Alpha()
	 * @model default="1.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' propertyCategory='PRESENTATION_SETTINGS'"
	 * @generated
	 */
	float getAlpha();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.ImageMapLayerPresentation#getAlpha <em>Alpha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alpha</em>' attribute.
	 * @see #getAlpha()
	 * @generated
	 */
	void setAlpha(float value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Operation that return the Image Map Layer to which this presentation is associated.
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	ImageMapLayer getImageMapLayer();

} // ImageMapLayerPresentation
