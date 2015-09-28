/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.environment;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cartesian Triangular Mesh Height Image Map Layer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  A specialized ImageMapLayer that generate a height map image associated with a CartesianTriangularMeshMapLayer.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.CartesianTriangularMeshHeightImageMapLayer#isAutoScale <em>Auto Scale</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.CartesianTriangularMeshHeightImageMapLayer#getMinimumHeight <em>Minimum Height</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.CartesianTriangularMeshHeightImageMapLayer#getMaximumHeight <em>Maximum Height</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.symphony.environment.SymphonyEnvironmentPackage#getCartesianTriangularMeshHeightImageMapLayer()
 * @model
 * @generated
 */
public interface CartesianTriangularMeshHeightImageMapLayer extends CartesianTriangularMeshDerivedImageMapLayer {
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
	 * @see ca.gc.asc_csa.symphony.environment.SymphonyEnvironmentPackage#getCartesianTriangularMeshHeightImageMapLayer_AutoScale()
	 * @model default="true" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Editable' propertyCategory='IMAGE_GENERATION_SETTINGS'"
	 * @generated
	 */
	boolean isAutoScale();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.symphony.environment.CartesianTriangularMeshHeightImageMapLayer#isAutoScale <em>Auto Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Scale</em>' attribute.
	 * @see #isAutoScale()
	 * @generated
	 */
	void setAutoScale(boolean value);

	/**
	 * Returns the value of the '<em><b>Minimum Height</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The minimum height to use to generate the color scale. This is applicable only if autoScale is true.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Minimum Height</em>' attribute.
	 * @see #setMinimumHeight(double)
	 * @see ca.gc.asc_csa.symphony.environment.SymphonyEnvironmentPackage#getCartesianTriangularMeshHeightImageMapLayer_MinimumHeight()
	 * @model default="0.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Editable' propertyCategory='IMAGE_GENERATION_SETTINGS' csa_units='m'"
	 * @generated
	 */
	double getMinimumHeight();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.symphony.environment.CartesianTriangularMeshHeightImageMapLayer#getMinimumHeight <em>Minimum Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Height</em>' attribute.
	 * @see #getMinimumHeight()
	 * @generated
	 */
	void setMinimumHeight(double value);

	/**
	 * Returns the value of the '<em><b>Maximum Height</b></em>' attribute.
	 * The default value is <code>"50.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum height to use to generate the color scale. This is applicable only if autoScale is true.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Maximum Height</em>' attribute.
	 * @see #setMaximumHeight(double)
	 * @see ca.gc.asc_csa.symphony.environment.SymphonyEnvironmentPackage#getCartesianTriangularMeshHeightImageMapLayer_MaximumHeight()
	 * @model default="50.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Editable' propertyCategory='IMAGE_GENERATION_SETTINGS' csa_units='m'"
	 * @generated
	 */
	double getMaximumHeight();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.symphony.environment.CartesianTriangularMeshHeightImageMapLayer#getMaximumHeight <em>Maximum Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Height</em>' attribute.
	 * @see #getMaximumHeight()
	 * @generated
	 */
	void setMaximumHeight(double value);

} // CartesianTriangularMeshHeightImageMapLayer
