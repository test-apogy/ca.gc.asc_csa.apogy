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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract EImage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.images.AbstractEImage#getWidth <em>Width</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.images.AbstractEImage#getHeight <em>Height</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.common.images.ApogyCommonImagesPackage#getAbstractEImage()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface AbstractEImage extends EObject {
	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(int)
	 * @see ca.gc.asc_csa.apogy.common.images.ApogyCommonImagesPackage#getAbstractEImage_Width()
	 * @model default="-1" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='IMAGE_INFORMATION'"
	 * @generated
	 */
	int getWidth();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.images.AbstractEImage#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(int value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(int)
	 * @see ca.gc.asc_csa.apogy.common.images.ApogyCommonImagesPackage#getAbstractEImage_Height()
	 * @model default="-1" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='IMAGE_INFORMATION'"
	 * @generated
	 */
	int getHeight();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.images.AbstractEImage#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.common.images.BufferedImage" unique="false"
	 * @generated
	 */
	BufferedImage asBufferedImage();

} // AbstractEImage
