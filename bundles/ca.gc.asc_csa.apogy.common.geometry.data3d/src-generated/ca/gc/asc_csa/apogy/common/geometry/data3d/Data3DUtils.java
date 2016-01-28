/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.geometry.data3d;

import java.util.List;

import javax.vecmath.Point3d;
import javax.vecmath.Vector3d;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Utils</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.symphony.common.geometry.data3d.Symphony__CommonGeometryData3DPackage#getData3DUtils()
 * @model
 * @generated
 */
public interface Data3DUtils extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.symphony.common.geometry.data3d.EList<org.eclipse.symphony.common.geometry.data3d.Vector3d>" unique="false" many="false" meshUnique="false"
	 * @generated
	 */
	EList<Vector3d> computeNormals(CartesianTriangularMesh mesh);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Computes the position of the centroid of a list of CartesianPositionCoordinates.
	 * @param points The list of CartesianPositionCoordinates.
	 * @return The centroid position of the list of CartesianPositionCoordinates, null if the list is empty.
	 * <!-- end-model-doc -->
	 * @model unique="false" pointsDataType="org.eclipse.symphony.common.geometry.data3d.List<org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates>" pointsUnique="false" pointsMany="false"
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
	 * @model minDataType="org.eclipse.symphony.common.geometry.data3d.Point3d" minUnique="false" maxDataType="org.eclipse.symphony.common.geometry.data3d.Point3d" maxUnique="false" dataUnique="false"
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
	 * @model unique="false" profilePointsDataType="org.eclipse.symphony.common.geometry.data3d.List<org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates>" profilePointsUnique="false" profilePointsMany="false" extrusionAxisUnique="false" extrusionWidthUnique="false" closeMeshUnique="false"
	 * @generated
	 */
	CartesianTriangularMesh extrude(List<CartesianPositionCoordinates> profilePoints, CartesianAxis extrusionAxis, double extrusionWidth, boolean closeMesh);

} // Data3DUtils
