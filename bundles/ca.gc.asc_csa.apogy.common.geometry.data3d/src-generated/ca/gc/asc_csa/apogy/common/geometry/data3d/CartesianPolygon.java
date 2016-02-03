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

import javax.vecmath.Vector3d;

import ca.gc.asc_csa.apogy.common.geometry.data.Polygon;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cartesian Polygon</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * A polygon having Cartesian position as its vertices.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPolygon#getSurface <em>Surface</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPolygon#getNormal <em>Normal</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPolygon#getCentroid <em>Centroid</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DPackage#getCartesianPolygon()
 * @model
 * @generated
 */
public interface CartesianPolygon extends Polygon<CartesianPositionCoordinates> {
	/**
	 * Returns the value of the '<em><b>Surface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Surface</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * The surface of the polygon.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Surface</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DPackage#getCartesianPolygon_Surface()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' children='false' apogy_units='m\262'"
	 * @generated
	 */
	double getSurface();

	/**
	 * Returns the value of the '<em><b>Normal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Normal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * The normal of the polygon.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Normal</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DPackage#getCartesianPolygon_Normal()
	 * @model unique="false" dataType="ca.gc.asc_csa.apogy.common.geometry.data3d.Vector3d" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	Vector3d getNormal();

	/**
	 * Returns the value of the '<em><b>Centroid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Centroid</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * The centroid of the polygon.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Centroid</em>' reference.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DPackage#getCartesianPolygon_Centroid()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	CartesianPositionCoordinates getCentroid();

} // CartesianPolygon
