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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cartesian Triangular Mesh Derived Image Map Layer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abstract class defining an ImageMapLayer for which the image is derived from a Mesh.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.surface.CartesianTriangularMeshDerivedImageMapLayer#getRequiredResolution <em>Required Resolution</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.surface.CartesianTriangularMeshDerivedImageMapLayer#getCartesianTriangularMeshMapLayer <em>Cartesian Triangular Mesh Map Layer</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentPackage#getCartesianTriangularMeshDerivedImageMapLayer()
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
	 * The required resolution, in meters / pixels
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Required Resolution</em>' attribute.
	 * @see #setRequiredResolution(double)
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentPackage#getCartesianTriangularMeshDerivedImageMapLayer_RequiredResolution()
	 * @model default="1.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Editable' propertyCategory='IMAGE_GENERATION_SETTINGS' apogy_units='m/pixel'"
	 * @generated
	 */
	double getRequiredResolution();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.surface.CartesianTriangularMeshDerivedImageMapLayer#getRequiredResolution <em>Required Resolution</em>}' attribute.
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
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentPackage#getCartesianTriangularMeshDerivedImageMapLayer_CartesianTriangularMeshMapLayer()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel property='Editable' propertyCategory='IMAGE_GENERATION_SETTINGS'"
	 * @generated
	 */
	CartesianTriangularMeshMapLayer getCartesianTriangularMeshMapLayer();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.surface.CartesianTriangularMeshDerivedImageMapLayer#getCartesianTriangularMeshMapLayer <em>Cartesian Triangular Mesh Map Layer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cartesian Triangular Mesh Map Layer</em>' reference.
	 * @see #getCartesianTriangularMeshMapLayer()
	 * @generated
	 */
	void setCartesianTriangularMeshMapLayer(CartesianTriangularMeshMapLayer value);

} // CartesianTriangularMeshDerivedImageMapLayer
