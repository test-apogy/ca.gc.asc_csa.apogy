/**
 * Canadian Space Agency 2007.
 *
 * $Id: ExclusionZone.java,v 1.2.4.2 2015/05/21 15:50:52 pallard Exp $
 */
package ca.gc.space.mrt.mobility.pathplanners;

import ca.gc.space.mrt.geometry.data3d.CartesianPositionCoordinates;
import ca.gc.space.topology.Node;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exclusion Zone</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represent a zone to be excluded from trajectory generated by path planners that support exclusion zones.
 * <!-- end-model-doc -->
 *
 *
 * @see ca.gc.space.mrt.mobility.pathplanners.PathplannersPackage#getExclusionZone()
 * @model abstract="true"
 * @generated
 */
public interface ExclusionZone extends Node {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Canadian Space Agency 2007.";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isInside(CartesianPositionCoordinates point);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean intersects(CartesianPositionCoordinates from, CartesianPositionCoordinates to);

} // ExclusionZone
