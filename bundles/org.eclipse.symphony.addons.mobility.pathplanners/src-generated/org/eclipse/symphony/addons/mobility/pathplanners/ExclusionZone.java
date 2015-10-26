/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.addons.mobility.pathplanners;

import org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates;

import org.eclipse.symphony.common.topology.Node;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exclusion Zone</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Represent a zone to be excluded from trajectory generated by path planners that
 * support exclusion zones.
 * <!-- end-model-doc -->
 *
 *
 * @see org.eclipse.symphony.addons.mobility.pathplanners.Symphony__AddonsMobilityPathplannersPackage#getExclusionZone()
 * @model abstract="true"
 * @generated
 */
public interface ExclusionZone extends Node {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" pointUnique="false"
	 * @generated
	 */
	boolean isInside(CartesianPositionCoordinates point);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" fromUnique="false" toUnique="false"
	 * @generated
	 */
	boolean intersects(CartesianPositionCoordinates from, CartesianPositionCoordinates to);

} // ExclusionZone
