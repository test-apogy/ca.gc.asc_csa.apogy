/**
 * Canadian Space Agency 2008.
 *
 * $Id: Symphony__AddonsMobilityPathplannersGraphFactoryImpl.java,v 1.2.4.3 2015/09/22 19:39:37 rlarcheveque Exp $
 */
package org.eclipse.symphony.addons.mobility.pathplanners.graph.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.symphony.addons.mobility.pathplanners.graph.*;
import org.eclipse.symphony.common.geometry.data3d.CartesianPolygon;
import org.jgrapht.DirectedGraph;
import org.jgrapht.graph.SimpleDirectedWeightedGraph;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Symphony__AddonsMobilityPathplannersGraphFactoryImpl extends EFactoryImpl implements Symphony__AddonsMobilityPathplannersGraphFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Symphony__AddonsMobilityPathplannersGraphFactory init() {
		try {
			Symphony__AddonsMobilityPathplannersGraphFactory theSymphony__AddonsMobilityPathplannersGraphFactory = (Symphony__AddonsMobilityPathplannersGraphFactory)EPackage.Registry.INSTANCE.getEFactory(Symphony__AddonsMobilityPathplannersGraphPackage.eNS_URI);
			if (theSymphony__AddonsMobilityPathplannersGraphFactory != null) {
				return theSymphony__AddonsMobilityPathplannersGraphFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Symphony__AddonsMobilityPathplannersGraphFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__AddonsMobilityPathplannersGraphFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Symphony__AddonsMobilityPathplannersGraphPackage.COST_BASED_MESH_WAY_POINT_PATH_PLANNER: return createCostBasedMeshWayPointPathPlanner();
			case Symphony__AddonsMobilityPathplannersGraphPackage.MESH_DISPLACEMENT_COST_FUNCTION: return createMeshDisplacementCostFunction();
			case Symphony__AddonsMobilityPathplannersGraphPackage.DISTANCE_ONLY_COST_FUNCTION: return createDistanceOnlyCostFunction();
			case Symphony__AddonsMobilityPathplannersGraphPackage.SIMPLE_DIRECTED_WEIGHTED_GRAPH_BASED_MESH_WAY_POINT_PATH_PLANNER: return createSimpleDirectedWeightedGraphBasedMeshWayPointPathPlanner();
			case Symphony__AddonsMobilityPathplannersGraphPackage.DIRECTED_GRAPH_BASED_MESH_WAY_POINT_PATH_PLANNER: return createDirectedGraphBasedMeshWayPointPathPlanner();
			case Symphony__AddonsMobilityPathplannersGraphPackage.MOBILITY_EDGE: return createMobilityEdge();
			case Symphony__AddonsMobilityPathplannersGraphPackage.MOBILITY_EDGE_FACTORY: return createMobilityEdgeFactory();
			case Symphony__AddonsMobilityPathplannersGraphPackage.DISTANCE_AND_SLOPES_COST_FUNCTION: return createDistanceAndSlopesCostFunction();
			case Symphony__AddonsMobilityPathplannersGraphPackage.EXCLUSION_ZONES_COST_FUNCTION: return createExclusionZonesCostFunction();
			case Symphony__AddonsMobilityPathplannersGraphPackage.DISTANCE_AND_ROVER_FOOTPRINT_COST_FUNCTION: return createDistanceAndRoverFootprintCostFunction();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case Symphony__AddonsMobilityPathplannersGraphPackage.DIRECTED_GRAPH:
				return createDirectedGraphFromString(eDataType, initialValue);
			case Symphony__AddonsMobilityPathplannersGraphPackage.SIMPLE_DIRECTED_WEIGHTED_GRAPH:
				return createSimpleDirectedWeightedGraphFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case Symphony__AddonsMobilityPathplannersGraphPackage.DIRECTED_GRAPH:
				return convertDirectedGraphToString(eDataType, instanceValue);
			case Symphony__AddonsMobilityPathplannersGraphPackage.SIMPLE_DIRECTED_WEIGHTED_GRAPH:
				return convertSimpleDirectedWeightedGraphToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <PolygonType extends CartesianPolygon> CostBasedMeshWayPointPathPlanner<PolygonType> createCostBasedMeshWayPointPathPlanner() {
		CostBasedMeshWayPointPathPlannerImpl<PolygonType> costBasedMeshWayPointPathPlanner = new CostBasedMeshWayPointPathPlannerImpl<PolygonType>();
		return costBasedMeshWayPointPathPlanner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeshDisplacementCostFunction createMeshDisplacementCostFunction() {
		MeshDisplacementCostFunctionImpl meshDisplacementCostFunction = new MeshDisplacementCostFunctionImpl();
		return meshDisplacementCostFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DistanceOnlyCostFunction createDistanceOnlyCostFunction() {
		DistanceOnlyCostFunctionImpl distanceOnlyCostFunction = new DistanceOnlyCostFunctionImpl();
		return distanceOnlyCostFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <PolygonType extends CartesianPolygon> SimpleDirectedWeightedGraphBasedMeshWayPointPathPlanner<PolygonType> createSimpleDirectedWeightedGraphBasedMeshWayPointPathPlanner() {
		SimpleDirectedWeightedGraphBasedMeshWayPointPathPlannerImpl<PolygonType> simpleDirectedWeightedGraphBasedMeshWayPointPathPlanner = new SimpleDirectedWeightedGraphBasedMeshWayPointPathPlannerImpl<PolygonType>();
		return simpleDirectedWeightedGraphBasedMeshWayPointPathPlanner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <PolygonType extends CartesianPolygon> DirectedGraphBasedMeshWayPointPathPlanner<PolygonType> createDirectedGraphBasedMeshWayPointPathPlanner() {
		DirectedGraphBasedMeshWayPointPathPlannerImpl<PolygonType> directedGraphBasedMeshWayPointPathPlanner = new DirectedGraphBasedMeshWayPointPathPlannerImpl<PolygonType>();
		return directedGraphBasedMeshWayPointPathPlanner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobilityEdge createMobilityEdge() {
		MobilityEdgeImpl mobilityEdge = new MobilityEdgeImpl();
		return mobilityEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobilityEdgeFactory createMobilityEdgeFactory() {
		MobilityEdgeFactoryImpl mobilityEdgeFactory = new MobilityEdgeFactoryImpl();
		return mobilityEdgeFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DistanceAndSlopesCostFunction createDistanceAndSlopesCostFunction() {
		DistanceAndSlopesCostFunctionImpl distanceAndSlopesCostFunction = new DistanceAndSlopesCostFunctionImpl();
		return distanceAndSlopesCostFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExclusionZonesCostFunction createExclusionZonesCostFunction() {
		ExclusionZonesCostFunctionImpl exclusionZonesCostFunction = new ExclusionZonesCostFunctionImpl();
		return exclusionZonesCostFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DistanceAndRoverFootprintCostFunction createDistanceAndRoverFootprintCostFunction() {
		DistanceAndRoverFootprintCostFunctionImpl distanceAndRoverFootprintCostFunction = new DistanceAndRoverFootprintCostFunctionImpl();
		return distanceAndRoverFootprintCostFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public DirectedGraph<?, ?> createDirectedGraphFromString(EDataType eDataType, String initialValue) {
		return (DirectedGraph<?, ?>)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDirectedGraphToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public SimpleDirectedWeightedGraph<?, ?> createSimpleDirectedWeightedGraphFromString(EDataType eDataType, String initialValue) {
		return (SimpleDirectedWeightedGraph<?, ?>)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSimpleDirectedWeightedGraphToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__AddonsMobilityPathplannersGraphPackage getSymphony__AddonsMobilityPathplannersGraphPackage() {
		return (Symphony__AddonsMobilityPathplannersGraphPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Symphony__AddonsMobilityPathplannersGraphPackage getPackage() {
		return Symphony__AddonsMobilityPathplannersGraphPackage.eINSTANCE;
	}

} //Symphony__AddonsMobilityPathplannersGraphFactoryImpl
