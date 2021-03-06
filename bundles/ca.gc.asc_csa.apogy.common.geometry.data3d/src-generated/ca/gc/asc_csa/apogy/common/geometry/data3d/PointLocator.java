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
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Point Locator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Definition of a class used to find neighbors in a list of CartesianPositionCoordinates.
 * Specific operation to add/remove points from the list to be searched are defined as opposed to an
 * attribute to enable sub-classes to easily manage changes in the list of point to search.
 * <!-- end-model-doc -->
 *
 *
 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DPackage#getPointLocator()
 * @model abstract="true"
 * @generated
 */
public interface PointLocator extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Returns a list of the points currently available for search.
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="ca.gc.asc_csa.apogy.common.geometry.data3d.List<ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates>" unique="false" many="false"
	 * @generated
	 */
	List<CartesianPositionCoordinates> getPoints();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Adds one point to the list of point to search.
	 * <!-- end-model-doc -->
	 * @model pointUnique="false"
	 * @generated
	 */
	void addPoint(CartesianPositionCoordinates point);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Adds a list of points to the list of point to search.
	 * <!-- end-model-doc -->
	 * @model pointsDataType="ca.gc.asc_csa.apogy.common.geometry.data3d.List<ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates>" pointsUnique="false" pointsMany="false"
	 * @generated
	 */
	void addPoints(List<CartesianPositionCoordinates> points);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Removes one point from the list of point to search.
	 * <!-- end-model-doc -->
	 * @model pointUnique="false"
	 * @generated
	 */
	void removePoint(CartesianPositionCoordinates point);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Removes a list of points from the list of point to search.
	 * <!-- end-model-doc -->
	 * @model pointsDataType="ca.gc.asc_csa.apogy.common.geometry.data3d.List<ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates>" pointsUnique="false" pointsMany="false"
	 * @generated
	 */
	void removePoints(List<CartesianPositionCoordinates> points);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Remove all points from the the list of point to search.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void clearPoints();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Returns a specified point closest neighbor.
	 * @param point The specified point.
	 * @return The closest neighbor, null if the PointLocator has no points.
	 * <!-- end-model-doc -->
	 * @model unique="false" pointUnique="false"
	 * @generated
	 */
	CartesianPositionCoordinates findClosestPoint(CartesianPositionCoordinates point);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Returns a specified point closest neighbor.
	 * @param point The specified point.
	 * @param maximumNumberOfNeighbors The maximum number of neighbors to return.
	 * @return The closest neighbor, null if the PointLocator has no points.
	 * <!-- end-model-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.common.geometry.data3d.List<ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates>" unique="false" many="false" pointUnique="false" maximumNumberOfNeighborsUnique="false"
	 * @generated
	 */
	List<CartesianPositionCoordinates> findClosestPoints(CartesianPositionCoordinates point, int maximumNumberOfNeighbors);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Returns a point's neighbor with a given radius.
	 * @param point The specified point.
	 * @param radius The maximum radius from the point.
	 * @return The list of neighbor within the radius. Never null, but can be empty.
	 * <!-- end-model-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.common.geometry.data3d.List<ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates>" unique="false" many="false" pointUnique="false" radiusUnique="false"
	 * @generated
	 */
	List<CartesianPositionCoordinates> findPointsWithinRadius(CartesianPositionCoordinates point, double radius);

} // PointLocator
