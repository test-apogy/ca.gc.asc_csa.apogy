/**
 * Canadian Space Agency 2007.
 *
 * $Id: VolumetricCoordinatesSet25D.java,v 1.4.4.2 2015/05/21 15:51:20 pallard Exp $
 */
package ca.gc.space.mrt.geometry.data25d;

import ca.gc.space.mrt.geometry.data3d.CartesianPositionCoordinates;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Volumetric Coordinates Set25 D</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ca.gc.space.mrt.geometry.data25d.Data25dPackage#getVolumetricCoordinatesSet25D()
 * @model
 * @generated
 */
public interface VolumetricCoordinatesSet25D extends CoordinatesSet25D
{
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
	CartesianPositionCoordinates getCartesianPositionCoordinates(Coordinates25D coordinates);

} // VolumetricCoordinatesSet25D
