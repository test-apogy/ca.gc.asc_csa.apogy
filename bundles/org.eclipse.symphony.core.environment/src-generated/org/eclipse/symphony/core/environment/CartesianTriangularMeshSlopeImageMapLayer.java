/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.core.environment;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cartesian Triangular Mesh Slope Image Map Layer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A specialized ImageMapLayer that generate a slope map image associated with a CartesianTriangularMeshMapLayer.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.CartesianTriangularMeshSlopeImageMapLayer#isAutoScale <em>Auto Scale</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.CartesianTriangularMeshSlopeImageMapLayer#getMinimumSlope <em>Minimum Slope</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.CartesianTriangularMeshSlopeImageMapLayer#getMaximumSlope <em>Maximum Slope</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.core.environment.SymphonyEnvironmentPackage#getCartesianTriangularMeshSlopeImageMapLayer()
 * @model
 * @generated
 */
public interface CartesianTriangularMeshSlopeImageMapLayer extends CartesianTriangularMeshDerivedImageMapLayer {

	/**
	 * Returns the value of the '<em><b>Auto Scale</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auto Scale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Wether or not to use autoscalling to generate the color scale.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Auto Scale</em>' attribute.
	 * @see #setAutoScale(boolean)
	 * @see org.eclipse.symphony.core.environment.SymphonyEnvironmentPackage#getCartesianTriangularMeshSlopeImageMapLayer_AutoScale()
	 * @model default="true" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Editable' propertyCategory='IMAGE_GENERATION_SETTINGS'"
	 * @generated
	 */
	boolean isAutoScale();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.CartesianTriangularMeshSlopeImageMapLayer#isAutoScale <em>Auto Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Scale</em>' attribute.
	 * @see #isAutoScale()
	 * @generated
	 */
	void setAutoScale(boolean value);

	/**
	 * Returns the value of the '<em><b>Minimum Slope</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum Slope</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The minimum slope to use to generate the color scale. This is applicable only if autoScale is true.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Minimum Slope</em>' attribute.
	 * @see #setMinimumSlope(double)
	 * @see org.eclipse.symphony.core.environment.SymphonyEnvironmentPackage#getCartesianTriangularMeshSlopeImageMapLayer_MinimumSlope()
	 * @model default="0.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Editable' propertyCategory='IMAGE_GENERATION_SETTINGS' csa_units='deg'"
	 * @generated
	 */
	double getMinimumSlope();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.CartesianTriangularMeshSlopeImageMapLayer#getMinimumSlope <em>Minimum Slope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Slope</em>' attribute.
	 * @see #getMinimumSlope()
	 * @generated
	 */
	void setMinimumSlope(double value);

	/**
	 * Returns the value of the '<em><b>Maximum Slope</b></em>' attribute.
	 * The default value is <code>"50.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum Slope</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum slope to use to generate the color scale. This is applicable only if autoScale is true.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Maximum Slope</em>' attribute.
	 * @see #setMaximumSlope(double)
	 * @see org.eclipse.symphony.core.environment.SymphonyEnvironmentPackage#getCartesianTriangularMeshSlopeImageMapLayer_MaximumSlope()
	 * @model default="50.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Editable' propertyCategory='IMAGE_GENERATION_SETTINGS' csa_units='deg'"
	 * @generated
	 */
	double getMaximumSlope();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.CartesianTriangularMeshSlopeImageMapLayer#getMaximumSlope <em>Maximum Slope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Slope</em>' attribute.
	 * @see #getMaximumSlope()
	 * @generated
	 */
	void setMaximumSlope(double value);

} // CartesianTriangularMeshSlopeImageMapLayer
