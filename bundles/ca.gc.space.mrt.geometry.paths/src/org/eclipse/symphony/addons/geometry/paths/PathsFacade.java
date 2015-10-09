/**
 * Canadian Space Agency 2007.
 *
 * $Id: PathsFacade.java,v 1.2.4.2 2015/05/21 15:50:36 pallard Exp $
 */
package org.eclipse.symphony.addons.geometry.paths;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
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

	public static PathsFacade INSTANCE = PathsFactory.eINSTANCE.createPathsFacade();
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Canadian Space Agency 2007.";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates a WayPointPath from a WayPointPath. The WayPointPath created contains copies of all the points found in the specified WayPointPath.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	WayPointPath createWayPointPath(WayPointPath wayPointPath);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates a WayPointPath using a list of CartesianPositionCoordinates. The WayPointPath created contains copies of all the points found in the specified list.
	 * <!-- end-model-doc -->
	 * @model pointsDataType="org.eclipse.symphony.addons.geometry.paths.List<org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates>" pointsMany="false"
	 * @generated
	 */
	WayPointPath createWayPointPath(List<CartesianPositionCoordinates> points);

} // PathsFacade
