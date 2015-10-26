/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.core.environment;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rectangle Shape Image Layer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * An image map layer representing an ellipse.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.RectangleShapeImageLayer#getRectangleWidth <em>Rectangle Width</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.RectangleShapeImageLayer#getRectangleHeight <em>Rectangle Height</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.RectangleShapeImageLayer#isShowCenterLines <em>Show Center Lines</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.core.environment.SymphonyEnvironmentPackage#getRectangleShapeImageLayer()
 * @model
 * @generated
 */
public interface RectangleShapeImageLayer extends AbstractShapeImageLayer {
	/**
	 * Returns the value of the '<em><b>Rectangle Width</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rectangle Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rectangle Width</em>' attribute.
	 * @see #setRectangleWidth(double)
	 * @see org.eclipse.symphony.core.environment.SymphonyEnvironmentPackage#getRectangleShapeImageLayer_RectangleWidth()
	 * @model default="1.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Editable' propertyCategory='RECTANGLE_SETTINGS' csa_units='m'"
	 * @generated
	 */
	double getRectangleWidth();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.RectangleShapeImageLayer#getRectangleWidth <em>Rectangle Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rectangle Width</em>' attribute.
	 * @see #getRectangleWidth()
	 * @generated
	 */
	void setRectangleWidth(double value);

	/**
	 * Returns the value of the '<em><b>Rectangle Height</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rectangle Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rectangle Height</em>' attribute.
	 * @see #setRectangleHeight(double)
	 * @see org.eclipse.symphony.core.environment.SymphonyEnvironmentPackage#getRectangleShapeImageLayer_RectangleHeight()
	 * @model default="1.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Editable' propertyCategory='RECTANGLE_SETTINGS' csa_units='m'"
	 * @generated
	 */
	double getRectangleHeight();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.RectangleShapeImageLayer#getRectangleHeight <em>Rectangle Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rectangle Height</em>' attribute.
	 * @see #getRectangleHeight()
	 * @generated
	 */
	void setRectangleHeight(double value);

	/**
	 * Returns the value of the '<em><b>Show Center Lines</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Show Center Lines</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show Center Lines</em>' attribute.
	 * @see #setShowCenterLines(boolean)
	 * @see org.eclipse.symphony.core.environment.SymphonyEnvironmentPackage#getRectangleShapeImageLayer_ShowCenterLines()
	 * @model default="true" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Editable' propertyCategory='RECTANGLE_SETTINGS'"
	 * @generated
	 */
	boolean isShowCenterLines();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.RectangleShapeImageLayer#isShowCenterLines <em>Show Center Lines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show Center Lines</em>' attribute.
	 * @see #isShowCenterLines()
	 * @generated
	 */
	void setShowCenterLines(boolean value);

} // RectangleShapeImageLayer
