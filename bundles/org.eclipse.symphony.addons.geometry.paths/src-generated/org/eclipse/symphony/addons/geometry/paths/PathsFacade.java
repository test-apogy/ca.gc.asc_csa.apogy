/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.addons.geometry.paths;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.symphony.addons.geometry.paths.impl.PathsFacadeImpl;
import org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.symphony.addons.geometry.paths.PathsPackage#getPathsFacade()
 * @model
 * @generated
 */
public interface PathsFacade extends EObject {

	public static PathsFacade INSTANCE = PathsFacadeImpl.getInstance();
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates a WayPointPath from a WayPointPath. The WayPointPath created
	 * contains copies of all the points found in the specified WayPointPath.
	 * <!-- end-model-doc -->
	 * @model unique="false" wayPointPathUnique="false"
	 * @generated
	 */
	WayPointPath createWayPointPath(WayPointPath wayPointPath);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates a WayPointPath using a list of CartesianPositionCoordinates.
	 * The WayPointPath created contains copies of all the points found in
	 * the specified list.
	 * <!-- end-model-doc -->
	 * @model unique="false" pointsDataType="org.eclipse.symphony.addons.geometry.paths.List<org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates>" pointsUnique="false" pointsMany="false"
	 * @generated
	 */
	WayPointPath createWayPointPath(List<CartesianPositionCoordinates> points);

} // PathsFacade
