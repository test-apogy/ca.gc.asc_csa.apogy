/**
 * Canadian Space Agency 2008.
 *
 * $Id: PathplannersGraphSwitch.java,v 1.3.4.3 2015/09/22 19:39:37 rlarcheveque Exp $
 */
package org.eclipse.symphony.addons.mobility.pathplanners.graph.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.eclipse.symphony.addons.mobility.pathplanners.MeshWayPointPathPlanner;
import org.eclipse.symphony.addons.mobility.pathplanners.WayPointPathPlanner;
import org.eclipse.symphony.addons.mobility.pathplanners.graph.*;
import org.eclipse.symphony.addons.mobility.pathplanners.graph.CostBasedMeshWayPointPathPlanner;
import org.eclipse.symphony.addons.mobility.pathplanners.graph.PathplannersGraphPackage;
import org.eclipse.symphony.common.geometry.data3d.CartesianPolygon;
import org.eclipse.symphony.common.processors.Monitorable;
import org.eclipse.symphony.common.processors.Processor;
import org.eclipse.symphony.common.processors.VerboseProvider;
import org.jgrapht.EdgeFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.symphony.addons.mobility.pathplanners.graph.PathplannersGraphPackage
 * @generated
 */
public class PathplannersGraphSwitch<T1> extends Switch<T1> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PathplannersGraphPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathplannersGraphSwitch() {
		if (modelPackage == null) {
			modelPackage = PathplannersGraphPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T1 doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case PathplannersGraphPackage.COST_BASED_MESH_WAY_POINT_PATH_PLANNER: {
				CostBasedMeshWayPointPathPlanner<?> costBasedMeshWayPointPathPlanner = (CostBasedMeshWayPointPathPlanner<?>)theEObject;
				T1 result = caseCostBasedMeshWayPointPathPlanner(costBasedMeshWayPointPathPlanner);
				if (result == null) result = caseMeshWayPointPathPlanner(costBasedMeshWayPointPathPlanner);
				if (result == null) result = caseWayPointPathPlanner(costBasedMeshWayPointPathPlanner);
				if (result == null) result = caseProcessor(costBasedMeshWayPointPathPlanner);
				if (result == null) result = caseMonitorable(costBasedMeshWayPointPathPlanner);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PathplannersGraphPackage.DISPLACEMENT_COST_FUNCTION: {
				DisplacementCostFunction displacementCostFunction = (DisplacementCostFunction)theEObject;
				T1 result = caseDisplacementCostFunction(displacementCostFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PathplannersGraphPackage.MESH_DISPLACEMENT_COST_FUNCTION: {
				MeshDisplacementCostFunction meshDisplacementCostFunction = (MeshDisplacementCostFunction)theEObject;
				T1 result = caseMeshDisplacementCostFunction(meshDisplacementCostFunction);
				if (result == null) result = caseDisplacementCostFunction(meshDisplacementCostFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PathplannersGraphPackage.DISTANCE_ONLY_COST_FUNCTION: {
				DistanceOnlyCostFunction distanceOnlyCostFunction = (DistanceOnlyCostFunction)theEObject;
				T1 result = caseDistanceOnlyCostFunction(distanceOnlyCostFunction);
				if (result == null) result = caseMeshDisplacementCostFunction(distanceOnlyCostFunction);
				if (result == null) result = caseDisplacementCostFunction(distanceOnlyCostFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PathplannersGraphPackage.SIMPLE_DIRECTED_WEIGHTED_GRAPH_BASED_MESH_WAY_POINT_PATH_PLANNER: {
				SimpleDirectedWeightedGraphBasedMeshWayPointPathPlanner<?> simpleDirectedWeightedGraphBasedMeshWayPointPathPlanner = (SimpleDirectedWeightedGraphBasedMeshWayPointPathPlanner<?>)theEObject;
				T1 result = caseSimpleDirectedWeightedGraphBasedMeshWayPointPathPlanner(simpleDirectedWeightedGraphBasedMeshWayPointPathPlanner);
				if (result == null) result = caseCostBasedMeshWayPointPathPlanner(simpleDirectedWeightedGraphBasedMeshWayPointPathPlanner);
				if (result == null) result = caseVerboseProvider(simpleDirectedWeightedGraphBasedMeshWayPointPathPlanner);
				if (result == null) result = caseMeshWayPointPathPlanner(simpleDirectedWeightedGraphBasedMeshWayPointPathPlanner);
				if (result == null) result = caseWayPointPathPlanner(simpleDirectedWeightedGraphBasedMeshWayPointPathPlanner);
				if (result == null) result = caseProcessor(simpleDirectedWeightedGraphBasedMeshWayPointPathPlanner);
				if (result == null) result = caseMonitorable(simpleDirectedWeightedGraphBasedMeshWayPointPathPlanner);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PathplannersGraphPackage.DIRECTED_GRAPH_BASED_MESH_WAY_POINT_PATH_PLANNER: {
				DirectedGraphBasedMeshWayPointPathPlanner<?> directedGraphBasedMeshWayPointPathPlanner = (DirectedGraphBasedMeshWayPointPathPlanner<?>)theEObject;
				T1 result = caseDirectedGraphBasedMeshWayPointPathPlanner(directedGraphBasedMeshWayPointPathPlanner);
				if (result == null) result = caseCostBasedMeshWayPointPathPlanner(directedGraphBasedMeshWayPointPathPlanner);
				if (result == null) result = caseMeshWayPointPathPlanner(directedGraphBasedMeshWayPointPathPlanner);
				if (result == null) result = caseWayPointPathPlanner(directedGraphBasedMeshWayPointPathPlanner);
				if (result == null) result = caseProcessor(directedGraphBasedMeshWayPointPathPlanner);
				if (result == null) result = caseMonitorable(directedGraphBasedMeshWayPointPathPlanner);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PathplannersGraphPackage.EDGE_FACTORY: {
				EdgeFactory<?, ?> edgeFactory = (EdgeFactory<?, ?>)theEObject;
				T1 result = caseEdgeFactory(edgeFactory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PathplannersGraphPackage.MOBILITY_EDGE: {
				MobilityEdge mobilityEdge = (MobilityEdge)theEObject;
				T1 result = caseMobilityEdge(mobilityEdge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PathplannersGraphPackage.MOBILITY_EDGE_FACTORY: {
				MobilityEdgeFactory mobilityEdgeFactory = (MobilityEdgeFactory)theEObject;
				T1 result = caseMobilityEdgeFactory(mobilityEdgeFactory);
				if (result == null) result = caseEdgeFactory(mobilityEdgeFactory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PathplannersGraphPackage.DISTANCE_AND_SLOPES_COST_FUNCTION: {
				DistanceAndSlopesCostFunction distanceAndSlopesCostFunction = (DistanceAndSlopesCostFunction)theEObject;
				T1 result = caseDistanceAndSlopesCostFunction(distanceAndSlopesCostFunction);
				if (result == null) result = caseMeshDisplacementCostFunction(distanceAndSlopesCostFunction);
				if (result == null) result = caseDisplacementCostFunction(distanceAndSlopesCostFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PathplannersGraphPackage.EXCLUSION_ZONES_COST_FUNCTION: {
				ExclusionZonesCostFunction exclusionZonesCostFunction = (ExclusionZonesCostFunction)theEObject;
				T1 result = caseExclusionZonesCostFunction(exclusionZonesCostFunction);
				if (result == null) result = caseDisplacementCostFunction(exclusionZonesCostFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PathplannersGraphPackage.DISTANCE_AND_ROVER_FOOTPRINT_COST_FUNCTION: {
				DistanceAndRoverFootprintCostFunction distanceAndRoverFootprintCostFunction = (DistanceAndRoverFootprintCostFunction)theEObject;
				T1 result = caseDistanceAndRoverFootprintCostFunction(distanceAndRoverFootprintCostFunction);
				if (result == null) result = caseDistanceAndSlopesCostFunction(distanceAndRoverFootprintCostFunction);
				if (result == null) result = caseMeshDisplacementCostFunction(distanceAndRoverFootprintCostFunction);
				if (result == null) result = caseDisplacementCostFunction(distanceAndRoverFootprintCostFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cost Based Mesh Way Point Path Planner</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cost Based Mesh Way Point Path Planner</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <PolygonType extends CartesianPolygon> T1 caseCostBasedMeshWayPointPathPlanner(CostBasedMeshWayPointPathPlanner<PolygonType> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Displacement Cost Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Displacement Cost Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDisplacementCostFunction(DisplacementCostFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mesh Displacement Cost Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mesh Displacement Cost Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseMeshDisplacementCostFunction(MeshDisplacementCostFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Distance Only Cost Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Distance Only Cost Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDistanceOnlyCostFunction(DistanceOnlyCostFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Directed Weighted Graph Based Mesh Way Point Path Planner</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Directed Weighted Graph Based Mesh Way Point Path Planner</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <PolygonType extends CartesianPolygon> T1 caseSimpleDirectedWeightedGraphBasedMeshWayPointPathPlanner(SimpleDirectedWeightedGraphBasedMeshWayPointPathPlanner<PolygonType> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Directed Graph Based Mesh Way Point Path Planner</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Directed Graph Based Mesh Way Point Path Planner</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <PolygonType extends CartesianPolygon> T1 caseDirectedGraphBasedMeshWayPointPathPlanner(DirectedGraphBasedMeshWayPointPathPlanner<PolygonType> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Edge Factory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Edge Factory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <V, E> T1 caseEdgeFactory(EdgeFactory<V, E> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mobility Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mobility Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseMobilityEdge(MobilityEdge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mobility Edge Factory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mobility Edge Factory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseMobilityEdgeFactory(MobilityEdgeFactory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Distance And Slopes Cost Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Distance And Slopes Cost Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDistanceAndSlopesCostFunction(DistanceAndSlopesCostFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exclusion Zones Cost Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exclusion Zones Cost Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseExclusionZonesCostFunction(ExclusionZonesCostFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Distance And Rover Footprint Cost Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Distance And Rover Footprint Cost Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDistanceAndRoverFootprintCostFunction(DistanceAndRoverFootprintCostFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Monitorable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Monitorable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseMonitorable(Monitorable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Processor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Processor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <I, O> T1 caseProcessor(Processor<I, O> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Way Point Path Planner</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Way Point Path Planner</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseWayPointPathPlanner(WayPointPathPlanner object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mesh Way Point Path Planner</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mesh Way Point Path Planner</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends CartesianPolygon> T1 caseMeshWayPointPathPlanner(MeshWayPointPathPlanner<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Verbose Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Verbose Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseVerboseProvider(VerboseProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T1 defaultCase(EObject object) {
		return null;
	}

} //PathplannersGraphSwitch
