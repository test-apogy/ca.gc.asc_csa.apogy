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

import org.eclipse.emf.common.util.EList;

import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMesh;
import ca.gc.asc_csa.apogy.common.images.AbstractEImage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cartesian Triangular Mesh Map Layer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abstract base class of all Cartesian Triangular Mesh Map Layers
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.surface.CartesianTriangularMeshMapLayer#isMeshIsDirty <em>Mesh Is Dirty</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.surface.CartesianTriangularMeshMapLayer#getMapLayerPresentations <em>Map Layer Presentations</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.surface.CartesianTriangularMeshMapLayer#getTextureImage <em>Texture Image</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.surface.CartesianTriangularMeshMapLayer#getCartesianTriangularMeshMapLayerNode <em>Cartesian Triangular Mesh Map Layer Node</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentPackage#getCartesianTriangularMeshMapLayer()
 * @model
 * @generated
 */
public interface CartesianTriangularMeshMapLayer extends AbstractMapLayer {
	/**
	 * Returns the value of the '<em><b>Mesh Is Dirty</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether of not the current mesh needs to be refreshed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mesh Is Dirty</em>' attribute.
	 * @see #setMeshIsDirty(boolean)
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentPackage#getCartesianTriangularMeshMapLayer_MeshIsDirty()
	 * @model default="true" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='None' propertyCategory='TRIANGULAR_MESH'"
	 * @generated
	 */
	boolean isMeshIsDirty();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.surface.CartesianTriangularMeshMapLayer#isMeshIsDirty <em>Mesh Is Dirty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mesh Is Dirty</em>' attribute.
	 * @see #isMeshIsDirty()
	 * @generated
	 */
	void setMeshIsDirty(boolean value);

	/**
	 * Returns the value of the '<em><b>Map Layer Presentations</b></em>' containment reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.apogy.core.environment.surface.MapLayerPresentation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of map layer presentation associated with this CartesianTriangularMeshMapLayer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Map Layer Presentations</em>' containment reference list.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentPackage#getCartesianTriangularMeshMapLayer_MapLayerPresentations()
	 * @model containment="true"
	 * @generated
	 */
	EList<MapLayerPresentation> getMapLayerPresentations();

	/**
	 * Returns the value of the '<em><b>Texture Image</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The texture currently displayed on top of the mesh layer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Texture Image</em>' reference.
	 * @see #setTextureImage(AbstractEImage)
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentPackage#getCartesianTriangularMeshMapLayer_TextureImage()
	 * @model transient="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='true' property='None'"
	 * @generated
	 */
	AbstractEImage getTextureImage();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.surface.CartesianTriangularMeshMapLayer#getTextureImage <em>Texture Image</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Texture Image</em>' reference.
	 * @see #getTextureImage()
	 * @generated
	 */
	void setTextureImage(AbstractEImage value);

	/**
	 * Returns the value of the '<em><b>Cartesian Triangular Mesh Map Layer Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The node representing this layer in the topology.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cartesian Triangular Mesh Map Layer Node</em>' reference.
	 * @see #setCartesianTriangularMeshMapLayerNode(CartesianTriangularMeshMapLayerNode)
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentPackage#getCartesianTriangularMeshMapLayer_CartesianTriangularMeshMapLayerNode()
	 * @model transient="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='None'"
	 * @generated
	 */
	CartesianTriangularMeshMapLayerNode getCartesianTriangularMeshMapLayerNode();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.surface.CartesianTriangularMeshMapLayer#getCartesianTriangularMeshMapLayerNode <em>Cartesian Triangular Mesh Map Layer Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cartesian Triangular Mesh Map Layer Node</em>' reference.
	 * @see #getCartesianTriangularMeshMapLayerNode()
	 * @generated
	 */
	void setCartesianTriangularMeshMapLayerNode(CartesianTriangularMeshMapLayerNode value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Operation that returns the CartesianTriangularMesh associated with this layer.
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	CartesianTriangularMesh getCurrentMesh();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Forces the texture image projected onto the mesh to be updated.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void forceUpdateTextureImage();

} // CartesianTriangularMeshMapLayer
