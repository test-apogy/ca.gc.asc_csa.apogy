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

import java.util.List;

import javax.vecmath.Point3d;
import javax.vecmath.Vector3d;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Utils</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Utilities class.
 * <!-- end-model-doc -->
 *
 *
 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DPackage#getData3DUtils()
 * @model
 * @generated
 */
public interface Data3DUtils extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.common.geometry.data3d.List<ca.gc.asc_csa.apogy.common.geometry.data3d.Vector3d>" unique="false" many="false" meshUnique="false"
	 * @generated
	 */
	List<Vector3d> computeNormals(CartesianTriangularMesh mesh);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Computes the normal at a given vertex in a mesh. The normal is the weighted average (by polygon area)
	 * of all the polygons sharing the specified point.
	 * @param mesh The mesh containing the point.
	 * @param vertex The vertex contained in the mesh.
	 * <!-- end-model-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.common.geometry.data3d.Vector3d" unique="false" meshUnique="false" vertexUnique="false"
	 * @generated
	 */
	Vector3d computeNormalAtVertex(CartesianTriangularMesh mesh, CartesianPositionCoordinates vertex);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Computes the position of the centroid of a list of CartesianPositionCoordinates.
	 * @param points The list of CartesianPositionCoordinates.
	 * @return The centroid position of the list of CartesianPositionCoordinates, null if the list is empty.
	 * <!-- end-model-doc -->
	 * @model unique="false" pointsDataType="ca.gc.asc_csa.apogy.common.geometry.data3d.List<ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates>" pointsUnique="false" pointsMany="false"
	 * @generated
	 */
	CartesianPositionCoordinates computeCentroid(List<CartesianPositionCoordinates> points);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Computes the position of the centroid of a CartesianCoordinatesSet.
	 * @param points The CartesianCoordinatesSet.
	 * @return The centroide position of the CartesianCoordinatesSet, null if the CartesianCoordinatesSet is empty.
	 * <!-- end-model-doc -->
	 * @model unique="false" pointsUnique="false"
	 * @generated
	 */
	CartesianPositionCoordinates computeCentroid(CartesianCoordinatesSet points);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model minDataType="ca.gc.asc_csa.apogy.common.geometry.data3d.Point3d" minUnique="false" maxDataType="ca.gc.asc_csa.apogy.common.geometry.data3d.Point3d" maxUnique="false" dataUnique="false"
	 * @generated
	 */
	void computeMinMaxValues(Point3d min, Point3d max, CartesianCoordinatesSet data);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" pointLocatorUnique="false" centerPointUnique="false" radiusUnique="false"
	 * @generated
	 */
	double computeCurvatureChange(PointLocator pointLocator, int centerPoint, double radius);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" profilePointsDataType="ca.gc.asc_csa.apogy.common.geometry.data3d.List<ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates>" profilePointsUnique="false" profilePointsMany="false" extrusionAxisUnique="false" extrusionWidthUnique="false" closeMeshUnique="false"
	 * @generated
	 */
	CartesianTriangularMesh extrude(List<CartesianPositionCoordinates> profilePoints, CartesianAxis extrusionAxis, double extrusionWidth, boolean closeMesh);

} // Data3DUtils
