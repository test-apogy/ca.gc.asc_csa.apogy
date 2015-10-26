/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.geometry.data3d;

import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Point Locator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.PointLocator#getPoints <em>Points</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.common.geometry.data3d.Data3dPackage#getPointLocator()
 * @model
 * @generated
 */
public interface PointLocator extends EObject {
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
	 * @see org.eclipse.symphony.common.geometry.data3d.Data3dPackage#getPointLocator_Points()
	 * @model unique="false" dataType="org.eclipse.symphony.common.geometry.data3d.List<org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates>" many="false"
	 * @generated
	 */
	List<CartesianPositionCoordinates> getPoints();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.geometry.data3d.PointLocator#getPoints <em>Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Points</em>' attribute.
	 * @see #getPoints()
	 * @generated
	 */
	void setPoints(List<CartesianPositionCoordinates> value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" pointUnique="false"
	 * @generated
	 */
	CartesianPositionCoordinates findClosestPoint(CartesianPositionCoordinates point);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" radiusUnique="false" pointUnique="false"
	 * @generated
	 */
	EList<CartesianPositionCoordinates> findPointsWithinRadius(double radius, CartesianPositionCoordinates point);

} // PointLocator
