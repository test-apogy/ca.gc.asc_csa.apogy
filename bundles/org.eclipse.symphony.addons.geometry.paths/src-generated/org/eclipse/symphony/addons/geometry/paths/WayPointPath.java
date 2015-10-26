/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.addons.geometry.paths;

import org.eclipse.symphony.common.geometry.data3d.CartesianCoordinatesSet;
import org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Way Point Path</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.geometry.paths.WayPointPath#getLength <em>Length</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.addons.geometry.paths.Symphony__AddonsGeometryPathsPackage#getWayPointPath()
 * @model
 * @generated
 */
public interface WayPointPath extends CartesianCoordinatesSet, Path {
	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see org.eclipse.symphony.addons.geometry.paths.Symphony__AddonsGeometryPathsPackage#getWayPointPath_Length()
	 * @model default="0.0" unique="false" transient="true" changeable="false" derived="true"
	 * @generated
	 */
	double getLength();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	CartesianPositionCoordinates getStartPoint();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	CartesianPositionCoordinates getEndPoint();

} // WayPointPath
