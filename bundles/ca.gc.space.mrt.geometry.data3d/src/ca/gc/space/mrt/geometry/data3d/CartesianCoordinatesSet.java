/**
 * Canadian Space Agency 2008.
 *
 * $Id: CartesianCoordinatesSet.java,v 1.2.4.4 2015/08/13 19:12:07 pallard Exp $
 */
package ca.gc.space.mrt.geometry.data3d;

import ca.gc.space.mrt.geometry.data.CoordinatesSet;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cartesian Coordinates Set</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ca.gc.space.mrt.geometry.data3d.Data3dPackage#getCartesianCoordinatesSet()
 * @model
 * @generated
 */
public interface CartesianCoordinatesSet extends CoordinatesSet<CartesianPositionCoordinates> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Canadian Space Agency 2008.";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	CartesianCoordinatesSetExtent getExtent();

} // CartesianCoordinatesSet
