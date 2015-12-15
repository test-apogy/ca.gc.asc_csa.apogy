/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.geometry.data3d;

import org.eclipse.symphony.common.geometry.data.CoordinatesSet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Cartesian Coordinates Set</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.symphony.common.geometry.data3d.Symphony__CommonGeometryData3DPackage#getAbstractCartesianCoordinatesSet()
 * @model
 * @generated
 */
public interface AbstractCartesianCoordinatesSet<T extends CartesianPositionCoordinates> extends CoordinatesSet<T> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Returns the extent of the point cloud.
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	CartesianCoordinatesSetExtent getExtent();

} // AbstractCartesianCoordinatesSet
