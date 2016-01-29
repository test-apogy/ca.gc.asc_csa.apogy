/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.addons.geometry.paths;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import ca.gc.asc_csa.apogy.addons.geometry.paths.impl.ApogyAddonsGeometryPathsFacadeImpl;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ca.gc.asc_csa.apogy.addons.geometry.paths.ApogyAddonsGeometryPathsPackage#getApogyAddonsGeometryPathsFacade()
 * @model
 * @generated
 */
public interface ApogyAddonsGeometryPathsFacade extends EObject {

	public static ApogyAddonsGeometryPathsFacade INSTANCE = ApogyAddonsGeometryPathsFacadeImpl.getInstance();
	
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
	 * @model unique="false" pointsDataType="ca.gc.asc_csa.apogy.addons.geometry.paths.List<ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates>" pointsUnique="false" pointsMany="false"
	 * @generated
	 */
	WayPointPath createWayPointPath(List<CartesianPositionCoordinates> points);

} // ApogyAddonsGeometryPathsFacade
