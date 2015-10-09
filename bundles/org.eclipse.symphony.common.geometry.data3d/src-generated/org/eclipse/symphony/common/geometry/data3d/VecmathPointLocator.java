/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.geometry.data3d;

import java.util.List;

import javax.vecmath.Point3d;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vecmath Point Locator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.VecmathPointLocator#getPoints <em>Points</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.common.geometry.data3d.Data3dPackage#getVecmathPointLocator()
 * @model
 * @generated
 */
public interface VecmathPointLocator extends EObject {
	/**
	 * Returns the value of the '<em><b>Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Points</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Points</em>' attribute.
	 * @see #setPoints(List)
	 * @see org.eclipse.symphony.common.geometry.data3d.Data3dPackage#getVecmathPointLocator_Points()
	 * @model unique="false" dataType="org.eclipse.symphony.common.geometry.data3d.List<org.eclipse.symphony.common.geometry.data3d.Point3d>" many="false"
	 * @generated
	 */
	List<Point3d> getPoints();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.geometry.data3d.VecmathPointLocator#getPoints <em>Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Points</em>' attribute.
	 * @see #getPoints()
	 * @generated
	 */
	void setPoints(List<Point3d> value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.symphony.common.geometry.data3d.Point3d" unique="false" pointDataType="org.eclipse.symphony.common.geometry.data3d.Point3d" pointUnique="false"
	 * @generated
	 */
	Point3d findClosestPoint(Point3d point);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.symphony.common.geometry.data3d.Point3d" unique="false" radiusUnique="false" pointDataType="org.eclipse.symphony.common.geometry.data3d.Point3d" pointUnique="false"
	 * @generated
	 */
	EList<Point3d> findPointsWithinRadius(double radius, Point3d point);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" pointDataType="org.eclipse.symphony.common.geometry.data3d.Point3d" pointUnique="false"
	 * @generated
	 */
	int findClosestPointId(Point3d point);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.symphony.common.geometry.data3d.IntArray" unique="false" radiusUnique="false" pointDataType="org.eclipse.symphony.common.geometry.data3d.Point3d" pointUnique="false"
	 * @generated
	 */
	int[] findPointIdsWithinRadius(double radius, Point3d point);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.symphony.common.geometry.data3d.Point3d" unique="false" referencePointDataType="org.eclipse.symphony.common.geometry.data3d.Point3d" referencePointUnique="false" nUnique="false"
	 * @generated
	 */
	EList<Point3d> findClosestNPoints(Point3d referencePoint, int n);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.symphony.common.geometry.data3d.IntArray" unique="false" referencePointDataType="org.eclipse.symphony.common.geometry.data3d.Point3d" referencePointUnique="false" nUnique="false"
	 * @generated
	 */
	int[] findClosestNPointIds(Point3d referencePoint, int n);

} // VecmathPointLocator
