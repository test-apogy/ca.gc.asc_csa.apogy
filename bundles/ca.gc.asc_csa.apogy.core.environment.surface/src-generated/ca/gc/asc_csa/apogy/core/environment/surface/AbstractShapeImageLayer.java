/**
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
package ca.gc.asc_csa.apogy.core.environment.surface;

import javax.vecmath.Color3f;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Shape Image Layer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Base class of image map layer that represent a 2D shape.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.surface.AbstractShapeImageLayer#isShapedFilled <em>Shaped Filled</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.surface.AbstractShapeImageLayer#getColor <em>Color</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.surface.AbstractShapeImageLayer#getRequiredResolution <em>Required Resolution</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentPackage#getAbstractShapeImageLayer()
 * @model abstract="true"
 * @generated
 */
public interface AbstractShapeImageLayer extends ImageMapLayer {
	/**
	 * Returns the value of the '<em><b>Shaped Filled</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether or not the shape should be drawn as a filled polygon.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Shaped Filled</em>' attribute.
	 * @see #setShapedFilled(boolean)
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentPackage#getAbstractShapeImageLayer_ShapedFilled()
	 * @model default="false" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Editable' propertyCategory='IMAGE_GENERATION_SETTINGS'"
	 * @generated
	 */
	boolean isShapedFilled();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.surface.AbstractShapeImageLayer#isShapedFilled <em>Shaped Filled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shaped Filled</em>' attribute.
	 * @see #isShapedFilled()
	 * @generated
	 */
	void setShapedFilled(boolean value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * The default value is <code>"0.0,1.0,0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Color to use to draw the polygon and fill it is required.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #setColor(Color3f)
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentPackage#getAbstractShapeImageLayer_Color()
	 * @model default="0.0,1.0,0.0" unique="false" dataType="ca.gc.asc_csa.apogy.core.environment.surface.Color3f"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Editable' propertyCategory='IMAGE_GENERATION_SETTINGS'"
	 * @generated
	 */
	Color3f getColor();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.surface.AbstractShapeImageLayer#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(Color3f value);

	/**
	 * Returns the value of the '<em><b>Required Resolution</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The required resolution, in meters / pixels
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Required Resolution</em>' attribute.
	 * @see #setRequiredResolution(double)
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentPackage#getAbstractShapeImageLayer_RequiredResolution()
	 * @model default="1.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Editable' propertyCategory='IMAGE_GENERATION_SETTINGS' apogy_units='m/pixel'"
	 * @generated
	 */
	double getRequiredResolution();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.surface.AbstractShapeImageLayer#getRequiredResolution <em>Required Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Resolution</em>' attribute.
	 * @see #getRequiredResolution()
	 * @generated
	 */
	void setRequiredResolution(double value);

} // AbstractShapeImageLayer
