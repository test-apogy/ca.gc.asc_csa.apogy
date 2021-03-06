package ca.gc.asc_csa.apogy.common.geometry.data3d;
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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Triangle Edge Length Triangular Mesh Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Filters a triangular mesh based on the range of the triangle center relative to the origin and
 * the length of the longest edge the triangle.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.TriangleEdgeLengthTriangularMeshFilter#getMinimumRange <em>Minimum Range</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.TriangleEdgeLengthTriangularMeshFilter#getMaximumRange <em>Maximum Range</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.TriangleEdgeLengthTriangularMeshFilter#getMaximumEdgeLength <em>Maximum Edge Length</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DPackage#getTriangleEdgeLengthTriangularMeshFilter()
 * @model
 * @generated
 */
public interface TriangleEdgeLengthTriangularMeshFilter extends EObject {
	/**
	 * Returns the value of the '<em><b>Minimum Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum Range</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * The minimum range of the center of the triangle with respect to the origin. Triangles with their center closer
	 * to the origin than this value are filtered out.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Minimum Range</em>' attribute.
	 * @see #setMinimumRange(double)
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DPackage#getTriangleEdgeLengthTriangularMeshFilter_MinimumRange()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' children='false' apogy_units='m'"
	 * @generated
	 */
	double getMinimumRange();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.TriangleEdgeLengthTriangularMeshFilter#getMinimumRange <em>Minimum Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Range</em>' attribute.
	 * @see #getMinimumRange()
	 * @generated
	 */
	void setMinimumRange(double value);

	/**
	 * Returns the value of the '<em><b>Maximum Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum Range</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * The maximum range of the center of the triangle with respect to the origin. Triangles with their center further
	 * from the origin than this value are filtered out.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Maximum Range</em>' attribute.
	 * @see #setMaximumRange(double)
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DPackage#getTriangleEdgeLengthTriangularMeshFilter_MaximumRange()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' children='false' apogy_units='m'"
	 * @generated
	 */
	double getMaximumRange();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.TriangleEdgeLengthTriangularMeshFilter#getMaximumRange <em>Maximum Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Range</em>' attribute.
	 * @see #getMaximumRange()
	 * @generated
	 */
	void setMaximumRange(double value);

	/**
	 * Returns the value of the '<em><b>Maximum Edge Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum Edge Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * The maximum length of a edge that a triangle can have to pass the filter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Maximum Edge Length</em>' attribute.
	 * @see #setMaximumEdgeLength(double)
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DPackage#getTriangleEdgeLengthTriangularMeshFilter_MaximumEdgeLength()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' children='false' apogy_units='m'"
	 * @generated
	 */
	double getMaximumEdgeLength();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.TriangleEdgeLengthTriangularMeshFilter#getMaximumEdgeLength <em>Maximum Edge Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Edge Length</em>' attribute.
	 * @see #getMaximumEdgeLength()
	 * @generated
	 */
	void setMaximumEdgeLength(double value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Applies the filter to a triangular mesh.
	 * @param input The input triangular mesh.
	 * @return A triangular mesh containing only the triangles that passed the filter.
	 * <!-- end-model-doc -->
	 * @model unique="false" inputUnique="false"
	 * @generated
	 */
	CartesianTriangularMesh filter(CartesianTriangularMesh input);

} // TriangleEdgeLengthTriangularMeshFilter
