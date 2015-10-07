/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.core.environment;



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cartesian Triangular Mesh Derived Image Map Layer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Asbtract class defining an ImageMapLayer for which the image is derived from a Mesh.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.CartesianTriangularMeshDerivedImageMapLayer#getRequiredResolution <em>Required Resolution</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.CartesianTriangularMeshDerivedImageMapLayer#getCartesianTriangularMeshMapLayer <em>Cartesian Triangular Mesh Map Layer</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.core.environment.SymphonyEnvironmentPackage#getCartesianTriangularMeshDerivedImageMapLayer()
 * @model abstract="true"
 * @generated
 */
public interface CartesianTriangularMeshDerivedImageMapLayer extends ImageMapLayer {
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
	 * @see org.eclipse.symphony.core.environment.SymphonyEnvironmentPackage#getCartesianTriangularMeshDerivedImageMapLayer_RequiredResolution()
	 * @model default="1.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Editable' propertyCategory='IMAGE_GENERATION_SETTINGS' csa_units='m/pixel'"
	 * @generated
	 */
	double getRequiredResolution();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.CartesianTriangularMeshDerivedImageMapLayer#getRequiredResolution <em>Required Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Resolution</em>' attribute.
	 * @see #getRequiredResolution()
	 * @generated
	 */
	void setRequiredResolution(double value);

	/**
	 * Returns the value of the '<em><b>Cartesian Triangular Mesh Map Layer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The map layer containing the mesh for which to generate the slope map.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cartesian Triangular Mesh Map Layer</em>' reference.
	 * @see #setCartesianTriangularMeshMapLayer(CartesianTriangularMeshMapLayer)
	 * @see org.eclipse.symphony.core.environment.SymphonyEnvironmentPackage#getCartesianTriangularMeshDerivedImageMapLayer_CartesianTriangularMeshMapLayer()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel property='Editable' propertyCategory='IMAGE_GENERATION_SETTINGS'"
	 * @generated
	 */
	CartesianTriangularMeshMapLayer getCartesianTriangularMeshMapLayer();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.CartesianTriangularMeshDerivedImageMapLayer#getCartesianTriangularMeshMapLayer <em>Cartesian Triangular Mesh Map Layer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cartesian Triangular Mesh Map Layer</em>' reference.
	 * @see #getCartesianTriangularMeshMapLayer()
	 * @generated
	 */
	void setCartesianTriangularMeshMapLayer(CartesianTriangularMeshMapLayer value);

} // CartesianTriangularMeshDerivedImageMapLayer
