package ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.impl;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.*;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPolygon;
import org.jgrapht.DirectedGraph;
import org.jgrapht.graph.SimpleDirectedWeightedGraph;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyAddonsMobilityPathplannersGraphFactoryImpl extends EFactoryImpl implements ApogyAddonsMobilityPathplannersGraphFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ApogyAddonsMobilityPathplannersGraphFactory init() {
		try {
			ApogyAddonsMobilityPathplannersGraphFactory theApogyAddonsMobilityPathplannersGraphFactory = (ApogyAddonsMobilityPathplannersGraphFactory)EPackage.Registry.INSTANCE.getEFactory(ApogyAddonsMobilityPathplannersGraphPackage.eNS_URI);
			if (theApogyAddonsMobilityPathplannersGraphFactory != null) {
				return theApogyAddonsMobilityPathplannersGraphFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ApogyAddonsMobilityPathplannersGraphFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyAddonsMobilityPathplannersGraphFactoryImpl() {
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
			case ApogyAddonsMobilityPathplannersGraphPackage.COST_BASED_MESH_WAY_POINT_PATH_PLANNER: return createCostBasedMeshWayPointPathPlanner();
			case ApogyAddonsMobilityPathplannersGraphPackage.MESH_DISPLACEMENT_COST_FUNCTION: return createMeshDisplacementCostFunction();
			case ApogyAddonsMobilityPathplannersGraphPackage.DISTANCE_ONLY_COST_FUNCTION: return createDistanceOnlyCostFunction();
			case ApogyAddonsMobilityPathplannersGraphPackage.SIMPLE_DIRECTED_WEIGHTED_GRAPH_BASED_MESH_WAY_POINT_PATH_PLANNER: return createSimpleDirectedWeightedGraphBasedMeshWayPointPathPlanner();
			case ApogyAddonsMobilityPathplannersGraphPackage.DIRECTED_GRAPH_BASED_MESH_WAY_POINT_PATH_PLANNER: return createDirectedGraphBasedMeshWayPointPathPlanner();
			case ApogyAddonsMobilityPathplannersGraphPackage.MOBILITY_EDGE: return createMobilityEdge();
			case ApogyAddonsMobilityPathplannersGraphPackage.MOBILITY_EDGE_FACTORY: return createMobilityEdgeFactory();
			case ApogyAddonsMobilityPathplannersGraphPackage.DISTANCE_AND_SLOPES_COST_FUNCTION: return createDistanceAndSlopesCostFunction();
			case ApogyAddonsMobilityPathplannersGraphPackage.EXCLUSION_ZONES_COST_FUNCTION: return createExclusionZonesCostFunction();
			case ApogyAddonsMobilityPathplannersGraphPackage.DISTANCE_AND_ROVER_FOOTPRINT_COST_FUNCTION: return createDistanceAndRoverFootprintCostFunction();
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
			case ApogyAddonsMobilityPathplannersGraphPackage.DIRECTED_GRAPH:
				return createDirectedGraphFromString(eDataType, initialValue);
			case ApogyAddonsMobilityPathplannersGraphPackage.SIMPLE_DIRECTED_WEIGHTED_GRAPH:
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
			case ApogyAddonsMobilityPathplannersGraphPackage.DIRECTED_GRAPH:
				return convertDirectedGraphToString(eDataType, instanceValue);
			case ApogyAddonsMobilityPathplannersGraphPackage.SIMPLE_DIRECTED_WEIGHTED_GRAPH:
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
	public ApogyAddonsMobilityPathplannersGraphPackage getApogyAddonsMobilityPathplannersGraphPackage() {
		return (ApogyAddonsMobilityPathplannersGraphPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ApogyAddonsMobilityPathplannersGraphPackage getPackage() {
		return ApogyAddonsMobilityPathplannersGraphPackage.eINSTANCE;
	}

} //ApogyAddonsMobilityPathplannersGraphFactoryImpl
