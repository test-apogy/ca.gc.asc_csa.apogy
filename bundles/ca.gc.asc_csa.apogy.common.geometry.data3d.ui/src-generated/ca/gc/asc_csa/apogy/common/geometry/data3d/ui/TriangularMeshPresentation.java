package ca.gc.asc_csa.apogy.common.geometry.data3d.ui;
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

import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMesh;
import ca.gc.asc_csa.apogy.common.images.AbstractEImage;
import ca.gc.asc_csa.apogy.common.topology.ui.MeshPresentationMode;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Triangular Mesh Presentation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ui.TriangularMeshPresentation#getMesh <em>Mesh</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ui.TriangularMeshPresentation#getPointSize <em>Point Size</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ui.TriangularMeshPresentation#getNumberOfPoints <em>Number Of Points</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ui.TriangularMeshPresentation#getNumberOfPolygons <em>Number Of Polygons</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ui.TriangularMeshPresentation#getPresentationMode <em>Presentation Mode</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ui.TriangularMeshPresentation#getTransparency <em>Transparency</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ui.TriangularMeshPresentation#isUseShading <em>Use Shading</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ui.TriangularMeshPresentation#getTextureImage <em>Texture Image</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ui.ApogyCommonGeometryData3DUIPackage#getTriangularMeshPresentation()
 * @model
 * @generated
 */
public interface TriangularMeshPresentation extends NodePresentation {
	/**
	 * Returns the value of the '<em><b>Mesh</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mesh</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mesh</em>' reference.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ui.ApogyCommonGeometryData3DUIPackage#getTriangularMeshPresentation_Mesh()
	 * @model transient="true" changeable="false" derived="true"
	 * @generated
	 */
	CartesianTriangularMesh getMesh();

	/**
	 * Returns the value of the '<em><b>Point Size</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Point Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Point Size</em>' attribute.
	 * @see #setPointSize(int)
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ui.ApogyCommonGeometryData3DUIPackage#getTriangularMeshPresentation_PointSize()
	 * @model default="1" unique="false"
	 * @generated
	 */
	int getPointSize();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ui.TriangularMeshPresentation#getPointSize <em>Point Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point Size</em>' attribute.
	 * @see #getPointSize()
	 * @generated
	 */
	void setPointSize(int value);

	/**
	 * Returns the value of the '<em><b>Number Of Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Points</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Points</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ui.ApogyCommonGeometryData3DUIPackage#getTriangularMeshPresentation_NumberOfPoints()
	 * @model unique="false" transient="true" changeable="false" derived="true"
	 * @generated
	 */
	int getNumberOfPoints();

	/**
	 * Returns the value of the '<em><b>Number Of Polygons</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Polygons</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Polygons</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ui.ApogyCommonGeometryData3DUIPackage#getTriangularMeshPresentation_NumberOfPolygons()
	 * @model unique="false" transient="true" changeable="false" derived="true"
	 * @generated
	 */
	int getNumberOfPolygons();

	/**
	 * Returns the value of the '<em><b>Presentation Mode</b></em>' attribute.
	 * The default value is <code>"SURFACE"</code>.
	 * The literals are from the enumeration {@link ca.gc.asc_csa.apogy.common.topology.ui.MeshPresentationMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Presentation Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Presentation Mode</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.MeshPresentationMode
	 * @see #setPresentationMode(MeshPresentationMode)
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ui.ApogyCommonGeometryData3DUIPackage#getTriangularMeshPresentation_PresentationMode()
	 * @model default="SURFACE" unique="false"
	 * @generated
	 */
	MeshPresentationMode getPresentationMode();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ui.TriangularMeshPresentation#getPresentationMode <em>Presentation Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Presentation Mode</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.MeshPresentationMode
	 * @see #getPresentationMode()
	 * @generated
	 */
	void setPresentationMode(MeshPresentationMode value);

	/**
	 * Returns the value of the '<em><b>Transparency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transparency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transparency</em>' attribute.
	 * @see #setTransparency(float)
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ui.ApogyCommonGeometryData3DUIPackage#getTriangularMeshPresentation_Transparency()
	 * @model unique="false"
	 * @generated
	 */
	float getTransparency();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ui.TriangularMeshPresentation#getTransparency <em>Transparency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transparency</em>' attribute.
	 * @see #getTransparency()
	 * @generated
	 */
	void setTransparency(float value);

	/**
	 * Returns the value of the '<em><b>Use Shading</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Shading</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Shading</em>' attribute.
	 * @see #setUseShading(boolean)
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ui.ApogyCommonGeometryData3DUIPackage#getTriangularMeshPresentation_UseShading()
	 * @model default="true" unique="false"
	 * @generated
	 */
	boolean isUseShading();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ui.TriangularMeshPresentation#isUseShading <em>Use Shading</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Shading</em>' attribute.
	 * @see #isUseShading()
	 * @generated
	 */
	void setUseShading(boolean value);

	/**
	 * Returns the value of the '<em><b>Texture Image</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Texture Image</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An image to be used as a texture.
	 * Note that the image will be applied using the relative
	 * coordinates of the mesh (i.e. relative to its minimum X and Y).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Texture Image</em>' reference.
	 * @see #setTextureImage(AbstractEImage)
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ui.ApogyCommonGeometryData3DUIPackage#getTriangularMeshPresentation_TextureImage()
	 * @model transient="true"
	 * @generated
	 */
	AbstractEImage getTextureImage();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ui.TriangularMeshPresentation#getTextureImage <em>Texture Image</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Texture Image</em>' reference.
	 * @see #getTextureImage()
	 * @generated
	 */
	void setTextureImage(AbstractEImage value);

} // TriangularMeshPresentation