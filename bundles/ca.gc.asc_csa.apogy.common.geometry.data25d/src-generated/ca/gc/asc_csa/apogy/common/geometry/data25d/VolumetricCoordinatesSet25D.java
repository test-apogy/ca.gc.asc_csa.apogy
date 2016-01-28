/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.common.geometry.data25d;

import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Volumetric Coordinates Set25 D</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ca.gc.asc_csa.apogy.common.geometry.data25d.ApogyCommonGeometryData25DPackage#getVolumetricCoordinatesSet25D()
 * @model
 * @generated
 */
public interface VolumetricCoordinatesSet25D extends CoordinatesSet25D {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" coordinatesUnique="false"
	 * @generated
	 */
	CartesianPositionCoordinates getCartesianPositionCoordinates(Coordinates25D coordinates);

} // VolumetricCoordinatesSet25D
