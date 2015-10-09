/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.geometry.data3d;

import org.eclipse.symphony.common.geometry.data.CoordinatesSet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cartesian Coordinates Set</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.symphony.common.geometry.data3d.Data3dPackage#getCartesianCoordinatesSet()
 * @model
 * @generated
 */
public interface CartesianCoordinatesSet extends CoordinatesSet<CartesianPositionCoordinates> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	CartesianCoordinatesSetExtent getExtent();

} // CartesianCoordinatesSet