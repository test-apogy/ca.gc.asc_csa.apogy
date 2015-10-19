/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.core.environment;

import javax.vecmath.Color3f;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Shape Image Layer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Base class of image map layer that represent a 2D shape.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.AbstractShapeImageLayer#isShapedFilled <em>Shaped Filled</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.AbstractShapeImageLayer#getColor <em>Color</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.AbstractShapeImageLayer#getRequiredResolution <em>Required Resolution</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.core.environment.SymphonyEnvironmentPackage#getAbstractShapeImageLayer()
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
	 * Wether or not the shape should be drawn as a filled polygon.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Shaped Filled</em>' attribute.
	 * @see #setShapedFilled(boolean)
	 * @see org.eclipse.symphony.core.environment.SymphonyEnvironmentPackage#getAbstractShapeImageLayer_ShapedFilled()
	 * @model default="false" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Editable' propertyCategory='IMAGE_GENERATION_SETTINGS'"
	 * @generated
	 */
	boolean isShapedFilled();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.AbstractShapeImageLayer#isShapedFilled <em>Shaped Filled</em>}' attribute.
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
	 * @see org.eclipse.symphony.core.environment.SymphonyEnvironmentPackage#getAbstractShapeImageLayer_Color()
	 * @model default="0.0,1.0,0.0" unique="false" dataType="org.eclipse.symphony.core.environment.Color3f"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Editable' propertyCategory='IMAGE_GENERATION_SETTINGS'"
	 * @generated
	 */
	Color3f getColor();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.AbstractShapeImageLayer#getColor <em>Color</em>}' attribute.
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
	 *  The required resolution, in meters / pixels
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Required Resolution</em>' attribute.
	 * @see #setRequiredResolution(double)
	 * @see org.eclipse.symphony.core.environment.SymphonyEnvironmentPackage#getAbstractShapeImageLayer_RequiredResolution()
	 * @model default="1.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Editable' propertyCategory='IMAGE_GENERATION_SETTINGS' csa_units='m/pixel'"
	 * @generated
	 */
	double getRequiredResolution();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.AbstractShapeImageLayer#getRequiredResolution <em>Required Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Resolution</em>' attribute.
	 * @see #getRequiredResolution()
	 * @generated
	 */
	void setRequiredResolution(double value);

} // AbstractShapeImageLayer
