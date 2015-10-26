/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.addons.mobility.pathplanners;

import org.eclipse.emf.ecore.EFactory;

import org.eclipse.symphony.common.geometry.data3d.CartesianPolygon;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.symphony.addons.mobility.pathplanners.PathplannersPackage
 * @generated
 */
public interface PathplannersFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PathplannersFactory eINSTANCE = org.eclipse.symphony.addons.mobility.pathplanners.impl.PathplannersFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Way Point Path Planner</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Way Point Path Planner</em>'.
	 * @generated
	 */
	WayPointPathPlanner createWayPointPathPlanner();

	/**
	 * Returns a new object of class '<em>Mesh Way Point Path Planner</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mesh Way Point Path Planner</em>'.
	 * @generated
	 */
	<T extends CartesianPolygon> MeshWayPointPathPlanner<T> createMeshWayPointPathPlanner();

	/**
	 * Returns a new object of class '<em>Circular Exclusion Zone</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Circular Exclusion Zone</em>'.
	 * @generated
	 */
	CircularExclusionZone createCircularExclusionZone();

	/**
	 * Returns a new object of class '<em>Path Planners Facade</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Path Planners Facade</em>'.
	 * @generated
	 */
	PathPlannersFacade createPathPlannersFacade();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PathplannersPackage getPathplannersPackage();

} //PathplannersFactory
