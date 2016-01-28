/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph;

import org.eclipse.emf.ecore.EFactory;

import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPolygon;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.ApogyAddonsMobilityPathplannersGraphPackage
 * @generated
 */
public interface ApogyAddonsMobilityPathplannersGraphFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApogyAddonsMobilityPathplannersGraphFactory eINSTANCE = ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.impl.ApogyAddonsMobilityPathplannersGraphFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Cost Based Mesh Way Point Path Planner</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cost Based Mesh Way Point Path Planner</em>'.
	 * @generated
	 */
	<PolygonType extends CartesianPolygon> CostBasedMeshWayPointPathPlanner<PolygonType> createCostBasedMeshWayPointPathPlanner();

	/**
	 * Returns a new object of class '<em>Mesh Displacement Cost Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mesh Displacement Cost Function</em>'.
	 * @generated
	 */
	MeshDisplacementCostFunction createMeshDisplacementCostFunction();

	/**
	 * Returns a new object of class '<em>Distance Only Cost Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Distance Only Cost Function</em>'.
	 * @generated
	 */
	DistanceOnlyCostFunction createDistanceOnlyCostFunction();

	/**
	 * Returns a new object of class '<em>Simple Directed Weighted Graph Based Mesh Way Point Path Planner</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Directed Weighted Graph Based Mesh Way Point Path Planner</em>'.
	 * @generated
	 */
	<PolygonType extends CartesianPolygon> SimpleDirectedWeightedGraphBasedMeshWayPointPathPlanner<PolygonType> createSimpleDirectedWeightedGraphBasedMeshWayPointPathPlanner();

	/**
	 * Returns a new object of class '<em>Directed Graph Based Mesh Way Point Path Planner</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Directed Graph Based Mesh Way Point Path Planner</em>'.
	 * @generated
	 */
	<PolygonType extends CartesianPolygon> DirectedGraphBasedMeshWayPointPathPlanner<PolygonType> createDirectedGraphBasedMeshWayPointPathPlanner();

	/**
	 * Returns a new object of class '<em>Mobility Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mobility Edge</em>'.
	 * @generated
	 */
	MobilityEdge createMobilityEdge();

	/**
	 * Returns a new object of class '<em>Mobility Edge Factory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mobility Edge Factory</em>'.
	 * @generated
	 */
	MobilityEdgeFactory createMobilityEdgeFactory();

	/**
	 * Returns a new object of class '<em>Distance And Slopes Cost Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Distance And Slopes Cost Function</em>'.
	 * @generated
	 */
	DistanceAndSlopesCostFunction createDistanceAndSlopesCostFunction();

	/**
	 * Returns a new object of class '<em>Exclusion Zones Cost Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exclusion Zones Cost Function</em>'.
	 * @generated
	 */
	ExclusionZonesCostFunction createExclusionZonesCostFunction();

	/**
	 * Returns a new object of class '<em>Distance And Rover Footprint Cost Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Distance And Rover Footprint Cost Function</em>'.
	 * @generated
	 */
	DistanceAndRoverFootprintCostFunction createDistanceAndRoverFootprintCostFunction();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ApogyAddonsMobilityPathplannersGraphPackage getApogyAddonsMobilityPathplannersGraphPackage();

} //ApogyAddonsMobilityPathplannersGraphFactory
