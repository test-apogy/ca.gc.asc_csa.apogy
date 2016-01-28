/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.addons.mobility.pathplanners;

import org.eclipse.emf.ecore.EFactory;

import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPolygon;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.ApogyAddonsMobilityPathplannersPackage
 * @generated
 */
public interface ApogyAddonsMobilityPathplannersFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApogyAddonsMobilityPathplannersFactory eINSTANCE = ca.gc.asc_csa.apogy.addons.mobility.pathplanners.impl.ApogyAddonsMobilityPathplannersFactoryImpl.init();

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
	ApogyAddonsMobilityPathplannersFacade createApogyAddonsMobilityPathplannersFacade();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ApogyAddonsMobilityPathplannersPackage getApogyAddonsMobilityPathplannersPackage();

} //ApogyAddonsMobilityPathplannersFactory
