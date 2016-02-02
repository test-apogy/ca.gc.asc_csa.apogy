package ca.gc.asc_csa.apogy.common.images;
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

import java.awt.image.BufferedImage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EImage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.images.EImage#getImageContent <em>Image Content</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.common.images.ApogyCommonImagesPackage#getEImage()
 * @model
 * @generated
 */
public interface EImage extends AbstractEImage {
	/**
	 * Returns the value of the '<em><b>Image Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image Content</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Content</em>' attribute.
	 * @see #setImageContent(BufferedImage)
	 * @see ca.gc.asc_csa.apogy.common.images.ApogyCommonImagesPackage#getEImage_ImageContent()
	 * @model unique="false" dataType="ca.gc.asc_csa.apogy.common.images.BufferedImage"
	 * @generated
	 */
	BufferedImage getImageContent();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.images.EImage#getImageContent <em>Image Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Content</em>' attribute.
	 * @see #getImageContent()
	 * @generated
	 */
	void setImageContent(BufferedImage value);

} // EImage
