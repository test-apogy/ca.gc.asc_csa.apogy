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
 * @see org.eclipse.symphony.addons.mobility.pathplanners.Symphony__AddonsMobilityPathplannersPackage
 * @generated
 */
public interface Symphony__AddonsMobilityPathplannersFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Symphony__AddonsMobilityPathplannersFactory eINSTANCE = org.eclipse.symphony.addons.mobility.pathplanners.impl.Symphony__AddonsMobilityPathplannersFactoryImpl.init();

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
	 * Returns a new object of class '<em>Facade</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Facade</em>'.
	 * @generated
	 */
	Symphony__AddonsMobilityPathplannersFacade createSymphony__AddonsMobilityPathplannersFacade();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Symphony__AddonsMobilityPathplannersPackage getSymphony__AddonsMobilityPathplannersPackage();

} //Symphony__AddonsMobilityPathplannersFactory
