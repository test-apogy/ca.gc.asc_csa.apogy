package ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph;
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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import ca.gc.asc_csa.apogy.addons.mobility.pathplanners.ApogyAddonsMobilityPathplannersPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
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
 * <!-- end-model-doc -->
 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.ApogyAddonsMobilityPathplannersGraphFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='ApogyAddonsMobilityPathplannersGraph' childCreationExtenders='true' extensibleProviderFactory='true' copyrightText='Copyright (c) 2015-2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    Pierre Allard (Pierre.Allard@canada.ca), \n    Regent L\'Archeveque (Regent.Larcheveque@canada.ca),\n    Sebastien Gemme (Sebastien.Gemme@canada.ca),\n    Canadian Space Agency (CSA) - Initial API and implementation' modelName='ApogyAddonsMobilityPathplannersGraph' modelDirectory='/ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph/src-generated' editDirectory='/ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.edit/src-generated' basePackage='ca.gc.asc_csa.apogy.addons.mobility.pathplanners'"
 * @generated
 */
public interface ApogyAddonsMobilityPathplannersGraphPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "graph";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "graph";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApogyAddonsMobilityPathplannersGraphPackage eINSTANCE = ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.impl.ApogyAddonsMobilityPathplannersGraphPackageImpl.init();

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.impl.CostBasedMeshWayPointPathPlannerImpl <em>Cost Based Mesh Way Point Path Planner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.impl.CostBasedMeshWayPointPathPlannerImpl
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.impl.ApogyAddonsMobilityPathplannersGraphPackageImpl#getCostBasedMeshWayPointPathPlanner()
	 * @generated
	 */
	int COST_BASED_MESH_WAY_POINT_PATH_PLANNER = 0;

	/**
	 * The feature id for the '<em><b>Progress Monitor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_BASED_MESH_WAY_POINT_PATH_PLANNER__PROGRESS_MONITOR = ApogyAddonsMobilityPathplannersPackage.MESH_WAY_POINT_PATH_PLANNER__PROGRESS_MONITOR;

	/**
	 * The feature id for the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_BASED_MESH_WAY_POINT_PATH_PLANNER__INPUT = ApogyAddonsMobilityPathplannersPackage.MESH_WAY_POINT_PATH_PLANNER__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_BASED_MESH_WAY_POINT_PATH_PLANNER__OUTPUT = ApogyAddonsMobilityPathplannersPackage.MESH_WAY_POINT_PATH_PLANNER__OUTPUT;

	/**
	 * The feature id for the '<em><b>Current Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_BASED_MESH_WAY_POINT_PATH_PLANNER__CURRENT_POSITION = ApogyAddonsMobilityPathplannersPackage.MESH_WAY_POINT_PATH_PLANNER__CURRENT_POSITION;

	/**
	 * The feature id for the '<em><b>Current Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_BASED_MESH_WAY_POINT_PATH_PLANNER__CURRENT_DESTINATION = ApogyAddonsMobilityPathplannersPackage.MESH_WAY_POINT_PATH_PLANNER__CURRENT_DESTINATION;

	/**
	 * The feature id for the '<em><b>Mesh</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_BASED_MESH_WAY_POINT_PATH_PLANNER__MESH = ApogyAddonsMobilityPathplannersPackage.MESH_WAY_POINT_PATH_PLANNER__MESH;

	/**
	 * The feature id for the '<em><b>Cost Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_BASED_MESH_WAY_POINT_PATH_PLANNER__COST_FUNCTIONS = ApogyAddonsMobilityPathplannersPackage.MESH_WAY_POINT_PATH_PLANNER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cost Based Mesh Way Point Path Planner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_BASED_MESH_WAY_POINT_PATH_PLANNER_FEATURE_COUNT = ApogyAddonsMobilityPathplannersPackage.MESH_WAY_POINT_PATH_PLANNER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Process</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_BASED_MESH_WAY_POINT_PATH_PLANNER___PROCESS__OBJECT = ApogyAddonsMobilityPathplannersPackage.MESH_WAY_POINT_PATH_PLANNER___PROCESS__OBJECT;

	/**
	 * The operation id for the '<em>Plan</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_BASED_MESH_WAY_POINT_PATH_PLANNER___PLAN__CARTESIANPOSITIONCOORDINATES_CARTESIANPOSITIONCOORDINATES = ApogyAddonsMobilityPathplannersPackage.MESH_WAY_POINT_PATH_PLANNER___PLAN__CARTESIANPOSITIONCOORDINATES_CARTESIANPOSITIONCOORDINATES;

	/**
	 * The number of operations of the '<em>Cost Based Mesh Way Point Path Planner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_BASED_MESH_WAY_POINT_PATH_PLANNER_OPERATION_COUNT = ApogyAddonsMobilityPathplannersPackage.MESH_WAY_POINT_PATH_PLANNER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.impl.DisplacementCostFunctionImpl <em>Displacement Cost Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.impl.DisplacementCostFunctionImpl
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.impl.ApogyAddonsMobilityPathplannersGraphPackageImpl#getDisplacementCostFunction()
	 * @generated
	 */
	int DISPLACEMENT_COST_FUNCTION = 1;

	/**
	 * The number of structural features of the '<em>Displacement Cost Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLACEMENT_COST_FUNCTION_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Cost</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLACEMENT_COST_FUNCTION___GET_COST__CARTESIANPOLYGON_CARTESIANPOLYGON = 0;

	/**
	 * The number of operations of the '<em>Displacement Cost Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLACEMENT_COST_FUNCTION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.impl.MeshDisplacementCostFunctionImpl <em>Mesh Displacement Cost Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.impl.MeshDisplacementCostFunctionImpl
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.impl.ApogyAddonsMobilityPathplannersGraphPackageImpl#getMeshDisplacementCostFunction()
	 * @generated
	 */
	int MESH_DISPLACEMENT_COST_FUNCTION = 2;

	/**
	 * The feature id for the '<em><b>Planner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_DISPLACEMENT_COST_FUNCTION__PLANNER = DISPLACEMENT_COST_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Mesh Displacement Cost Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_DISPLACEMENT_COST_FUNCTION_FEATURE_COUNT = DISPLACEMENT_COST_FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Cost</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_DISPLACEMENT_COST_FUNCTION___GET_COST__CARTESIANPOLYGON_CARTESIANPOLYGON = DISPLACEMENT_COST_FUNCTION___GET_COST__CARTESIANPOLYGON_CARTESIANPOLYGON;

	/**
	 * The number of operations of the '<em>Mesh Displacement Cost Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_DISPLACEMENT_COST_FUNCTION_OPERATION_COUNT = DISPLACEMENT_COST_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.impl.DistanceOnlyCostFunctionImpl <em>Distance Only Cost Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.impl.DistanceOnlyCostFunctionImpl
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.impl.ApogyAddonsMobilityPathplannersGraphPackageImpl#getDistanceOnlyCostFunction()
	 * @generated
	 */
	int DISTANCE_ONLY_COST_FUNCTION = 3;

	/**
	 * The feature id for the '<em><b>Planner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_ONLY_COST_FUNCTION__PLANNER = MESH_DISPLACEMENT_COST_FUNCTION__PLANNER;

	/**
	 * The number of structural features of the '<em>Distance Only Cost Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_ONLY_COST_FUNCTION_FEATURE_COUNT = MESH_DISPLACEMENT_COST_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Cost</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_ONLY_COST_FUNCTION___GET_COST__CARTESIANPOLYGON_CARTESIANPOLYGON = MESH_DISPLACEMENT_COST_FUNCTION___GET_COST__CARTESIANPOLYGON_CARTESIANPOLYGON;

	/**
	 * The number of operations of the '<em>Distance Only Cost Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_ONLY_COST_FUNCTION_OPERATION_COUNT = MESH_DISPLACEMENT_COST_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.impl.SimpleDirectedWeightedGraphBasedMeshWayPointPathPlannerImpl <em>Simple Directed Weighted Graph Based Mesh Way Point Path Planner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.impl.SimpleDirectedWeightedGraphBasedMeshWayPointPathPlannerImpl
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.impl.ApogyAddonsMobilityPathplannersGraphPackageImpl#getSimpleDirectedWeightedGraphBasedMeshWayPointPathPlanner()
	 * @generated
	 */
	int SIMPLE_DIRECTED_WEIGHTED_GRAPH_BASED_MESH_WAY_POINT_PATH_PLANNER = 4;

	/**
	 * The feature id for the '<em><b>Progress Monitor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DIRECTED_WEIGHTED_GRAPH_BASED_MESH_WAY_POINT_PATH_PLANNER__PROGRESS_MONITOR = COST_BASED_MESH_WAY_POINT_PATH_PLANNER__PROGRESS_MONITOR;

	/**
	 * The feature id for the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DIRECTED_WEIGHTED_GRAPH_BASED_MESH_WAY_POINT_PATH_PLANNER__INPUT = COST_BASED_MESH_WAY_POINT_PATH_PLANNER__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DIRECTED_WEIGHTED_GRAPH_BASED_MESH_WAY_POINT_PATH_PLANNER__OUTPUT = COST_BASED_MESH_WAY_POINT_PATH_PLANNER__OUTPUT;

	/**
	 * The feature id for the '<em><b>Current Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DIRECTED_WEIGHTED_GRAPH_BASED_MESH_WAY_POINT_PATH_PLANNER__CURRENT_POSITION = COST_BASED_MESH_WAY_POINT_PATH_PLANNER__CURRENT_POSITION;

	/**
	 * The feature id for the '<em><b>Current Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DIRECTED_WEIGHTED_GRAPH_BASED_MESH_WAY_POINT_PATH_PLANNER__CURRENT_DESTINATION = COST_BASED_MESH_WAY_POINT_PATH_PLANNER__CURRENT_DESTINATION;

	/**
	 * The feature id for the '<em><b>Mesh</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DIRECTED_WEIGHTED_GRAPH_BASED_MESH_WAY_POINT_PATH_PLANNER__MESH = COST_BASED_MESH_WAY_POINT_PATH_PLANNER__MESH;

	/**
	 * The feature id for the '<em><b>Cost Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DIRECTED_WEIGHTED_GRAPH_BASED_MESH_WAY_POINT_PATH_PLANNER__COST_FUNCTIONS = COST_BASED_MESH_WAY_POINT_PATH_PLANNER__COST_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Verbose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DIRECTED_WEIGHTED_GRAPH_BASED_MESH_WAY_POINT_PATH_PLANNER__VERBOSE = COST_BASED_MESH_WAY_POINT_PATH_PLANNER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Simple Directed Weighted Graph</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DIRECTED_WEIGHTED_GRAPH_BASED_MESH_WAY_POINT_PATH_PLANNER__SIMPLE_DIRECTED_WEIGHTED_GRAPH = COST_BASED_MESH_WAY_POINT_PATH_PLANNER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Enable Path Simplification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DIRECTED_WEIGHTED_GRAPH_BASED_MESH_WAY_POINT_PATH_PLANNER__ENABLE_PATH_SIMPLIFICATION = COST_BASED_MESH_WAY_POINT_PATH_PLANNER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Robot Width For Path Simplication</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DIRECTED_WEIGHTED_GRAPH_BASED_MESH_WAY_POINT_PATH_PLANNER__ROBOT_WIDTH_FOR_PATH_SIMPLICATION = COST_BASED_MESH_WAY_POINT_PATH_PLANNER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Simple Directed Weighted Graph Based Mesh Way Point Path Planner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DIRECTED_WEIGHTED_GRAPH_BASED_MESH_WAY_POINT_PATH_PLANNER_FEATURE_COUNT = COST_BASED_MESH_WAY_POINT_PATH_PLANNER_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Process</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DIRECTED_WEIGHTED_GRAPH_BASED_MESH_WAY_POINT_PATH_PLANNER___PROCESS__OBJECT = COST_BASED_MESH_WAY_POINT_PATH_PLANNER___PROCESS__OBJECT;

	/**
	 * The operation id for the '<em>Plan</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DIRECTED_WEIGHTED_GRAPH_BASED_MESH_WAY_POINT_PATH_PLANNER___PLAN__CARTESIANPOSITIONCOORDINATES_CARTESIANPOSITIONCOORDINATES = COST_BASED_MESH_WAY_POINT_PATH_PLANNER___PLAN__CARTESIANPOSITIONCOORDINATES_CARTESIANPOSITIONCOORDINATES;

	/**
	 * The operation id for the '<em>Print Verbose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DIRECTED_WEIGHTED_GRAPH_BASED_MESH_WAY_POINT_PATH_PLANNER___PRINT_VERBOSE__STRING = COST_BASED_MESH_WAY_POINT_PATH_PLANNER_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Simple Directed Weighted Graph Based Mesh Way Point Path Planner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DIRECTED_WEIGHTED_GRAPH_BASED_MESH_WAY_POINT_PATH_PLANNER_OPERATION_COUNT = COST_BASED_MESH_WAY_POINT_PATH_PLANNER_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.impl.DirectedGraphBasedMeshWayPointPathPlannerImpl <em>Directed Graph Based Mesh Way Point Path Planner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.impl.DirectedGraphBasedMeshWayPointPathPlannerImpl
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.impl.ApogyAddonsMobilityPathplannersGraphPackageImpl#getDirectedGraphBasedMeshWayPointPathPlanner()
	 * @generated
	 */
	int DIRECTED_GRAPH_BASED_MESH_WAY_POINT_PATH_PLANNER = 5;

	/**
	 * The feature id for the '<em><b>Progress Monitor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_GRAPH_BASED_MESH_WAY_POINT_PATH_PLANNER__PROGRESS_MONITOR = COST_BASED_MESH_WAY_POINT_PATH_PLANNER__PROGRESS_MONITOR;

	/**
	 * The feature id for the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_GRAPH_BASED_MESH_WAY_POINT_PATH_PLANNER__INPUT = COST_BASED_MESH_WAY_POINT_PATH_PLANNER__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_GRAPH_BASED_MESH_WAY_POINT_PATH_PLANNER__OUTPUT = COST_BASED_MESH_WAY_POINT_PATH_PLANNER__OUTPUT;

	/**
	 * The feature id for the '<em><b>Current Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_GRAPH_BASED_MESH_WAY_POINT_PATH_PLANNER__CURRENT_POSITION = COST_BASED_MESH_WAY_POINT_PATH_PLANNER__CURRENT_POSITION;

	/**
	 * The feature id for the '<em><b>Current Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_GRAPH_BASED_MESH_WAY_POINT_PATH_PLANNER__CURRENT_DESTINATION = COST_BASED_MESH_WAY_POINT_PATH_PLANNER__CURRENT_DESTINATION;

	/**
	 * The feature id for the '<em><b>Mesh</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_GRAPH_BASED_MESH_WAY_POINT_PATH_PLANNER__MESH = COST_BASED_MESH_WAY_POINT_PATH_PLANNER__MESH;

	/**
	 * The feature id for the '<em><b>Cost Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_GRAPH_BASED_MESH_WAY_POINT_PATH_PLANNER__COST_FUNCTIONS = COST_BASED_MESH_WAY_POINT_PATH_PLANNER__COST_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Directed Graph</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_GRAPH_BASED_MESH_WAY_POINT_PATH_PLANNER__DIRECTED_GRAPH = COST_BASED_MESH_WAY_POINT_PATH_PLANNER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Directed Graph Based Mesh Way Point Path Planner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_GRAPH_BASED_MESH_WAY_POINT_PATH_PLANNER_FEATURE_COUNT = COST_BASED_MESH_WAY_POINT_PATH_PLANNER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Process</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_GRAPH_BASED_MESH_WAY_POINT_PATH_PLANNER___PROCESS__OBJECT = COST_BASED_MESH_WAY_POINT_PATH_PLANNER___PROCESS__OBJECT;

	/**
	 * The operation id for the '<em>Plan</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_GRAPH_BASED_MESH_WAY_POINT_PATH_PLANNER___PLAN__CARTESIANPOSITIONCOORDINATES_CARTESIANPOSITIONCOORDINATES = COST_BASED_MESH_WAY_POINT_PATH_PLANNER___PLAN__CARTESIANPOSITIONCOORDINATES_CARTESIANPOSITIONCOORDINATES;

	/**
	 * The number of operations of the '<em>Directed Graph Based Mesh Way Point Path Planner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_GRAPH_BASED_MESH_WAY_POINT_PATH_PLANNER_OPERATION_COUNT = COST_BASED_MESH_WAY_POINT_PATH_PLANNER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.impl.EdgeFactoryImpl <em>Edge Factory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.impl.EdgeFactoryImpl
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.impl.ApogyAddonsMobilityPathplannersGraphPackageImpl#getEdgeFactory()
	 * @generated
	 */
	int EDGE_FACTORY = 6;

	/**
	 * The number of structural features of the '<em>Edge Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_FACTORY_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Edge Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_FACTORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.impl.MobilityEdgeImpl <em>Mobility Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.impl.MobilityEdgeImpl
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.impl.ApogyAddonsMobilityPathplannersGraphPackageImpl#getMobilityEdge()
	 * @generated
	 */
	int MOBILITY_EDGE = 7;

	/**
	 * The feature id for the '<em><b>Cost Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILITY_EDGE__COST_FUNCTIONS = 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILITY_EDGE__FROM = 1;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILITY_EDGE__TO = 2;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILITY_EDGE__WEIGHT = 3;

	/**
	 * The number of structural features of the '<em>Mobility Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILITY_EDGE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Mobility Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILITY_EDGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.impl.MobilityEdgeFactoryImpl <em>Mobility Edge Factory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.impl.MobilityEdgeFactoryImpl
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.impl.ApogyAddonsMobilityPathplannersGraphPackageImpl#getMobilityEdgeFactory()
	 * @generated
	 */
	int MOBILITY_EDGE_FACTORY = 8;

	/**
	 * The feature id for the '<em><b>Cost Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILITY_EDGE_FACTORY__COST_FUNCTIONS = EDGE_FACTORY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Mobility Edge Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILITY_EDGE_FACTORY_FEATURE_COUNT = EDGE_FACTORY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Mobility Edge Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILITY_EDGE_FACTORY_OPERATION_COUNT = EDGE_FACTORY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.impl.DistanceAndSlopesCostFunctionImpl <em>Distance And Slopes Cost Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.impl.DistanceAndSlopesCostFunctionImpl
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.impl.ApogyAddonsMobilityPathplannersGraphPackageImpl#getDistanceAndSlopesCostFunction()
	 * @generated
	 */
	int DISTANCE_AND_SLOPES_COST_FUNCTION = 9;

	/**
	 * The feature id for the '<em><b>Planner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_AND_SLOPES_COST_FUNCTION__PLANNER = MESH_DISPLACEMENT_COST_FUNCTION__PLANNER;

	/**
	 * The feature id for the '<em><b>Up Slope Cost Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_AND_SLOPES_COST_FUNCTION__UP_SLOPE_COST_FACTOR = MESH_DISPLACEMENT_COST_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Down Slope Cost Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_AND_SLOPES_COST_FUNCTION__DOWN_SLOPE_COST_FACTOR = MESH_DISPLACEMENT_COST_FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Gravity Axis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_AND_SLOPES_COST_FUNCTION__GRAVITY_AXIS = MESH_DISPLACEMENT_COST_FUNCTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Maximum Up Slope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_AND_SLOPES_COST_FUNCTION__MAXIMUM_UP_SLOPE = MESH_DISPLACEMENT_COST_FUNCTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Maximum Down Slope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_AND_SLOPES_COST_FUNCTION__MAXIMUM_DOWN_SLOPE = MESH_DISPLACEMENT_COST_FUNCTION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Distance And Slopes Cost Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_AND_SLOPES_COST_FUNCTION_FEATURE_COUNT = MESH_DISPLACEMENT_COST_FUNCTION_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Cost</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_AND_SLOPES_COST_FUNCTION___GET_COST__CARTESIANPOLYGON_CARTESIANPOLYGON = MESH_DISPLACEMENT_COST_FUNCTION___GET_COST__CARTESIANPOLYGON_CARTESIANPOLYGON;

	/**
	 * The number of operations of the '<em>Distance And Slopes Cost Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_AND_SLOPES_COST_FUNCTION_OPERATION_COUNT = MESH_DISPLACEMENT_COST_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.impl.ExclusionZonesCostFunctionImpl <em>Exclusion Zones Cost Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.impl.ExclusionZonesCostFunctionImpl
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.impl.ApogyAddonsMobilityPathplannersGraphPackageImpl#getExclusionZonesCostFunction()
	 * @generated
	 */
	int EXCLUSION_ZONES_COST_FUNCTION = 10;

	/**
	 * The feature id for the '<em><b>Exclusion Zones</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSION_ZONES_COST_FUNCTION__EXCLUSION_ZONES = DISPLACEMENT_COST_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Exclusion Zones Cost Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSION_ZONES_COST_FUNCTION_FEATURE_COUNT = DISPLACEMENT_COST_FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Cost</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSION_ZONES_COST_FUNCTION___GET_COST__CARTESIANPOLYGON_CARTESIANPOLYGON = DISPLACEMENT_COST_FUNCTION___GET_COST__CARTESIANPOLYGON_CARTESIANPOLYGON;

	/**
	 * The number of operations of the '<em>Exclusion Zones Cost Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSION_ZONES_COST_FUNCTION_OPERATION_COUNT = DISPLACEMENT_COST_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.impl.DistanceAndRoverFootprintCostFunctionImpl <em>Distance And Rover Footprint Cost Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.impl.DistanceAndRoverFootprintCostFunctionImpl
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.impl.ApogyAddonsMobilityPathplannersGraphPackageImpl#getDistanceAndRoverFootprintCostFunction()
	 * @generated
	 */
	int DISTANCE_AND_ROVER_FOOTPRINT_COST_FUNCTION = 11;

	/**
	 * The feature id for the '<em><b>Planner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_AND_ROVER_FOOTPRINT_COST_FUNCTION__PLANNER = DISTANCE_AND_SLOPES_COST_FUNCTION__PLANNER;

	/**
	 * The feature id for the '<em><b>Up Slope Cost Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_AND_ROVER_FOOTPRINT_COST_FUNCTION__UP_SLOPE_COST_FACTOR = DISTANCE_AND_SLOPES_COST_FUNCTION__UP_SLOPE_COST_FACTOR;

	/**
	 * The feature id for the '<em><b>Down Slope Cost Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_AND_ROVER_FOOTPRINT_COST_FUNCTION__DOWN_SLOPE_COST_FACTOR = DISTANCE_AND_SLOPES_COST_FUNCTION__DOWN_SLOPE_COST_FACTOR;

	/**
	 * The feature id for the '<em><b>Gravity Axis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_AND_ROVER_FOOTPRINT_COST_FUNCTION__GRAVITY_AXIS = DISTANCE_AND_SLOPES_COST_FUNCTION__GRAVITY_AXIS;

	/**
	 * The feature id for the '<em><b>Maximum Up Slope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_AND_ROVER_FOOTPRINT_COST_FUNCTION__MAXIMUM_UP_SLOPE = DISTANCE_AND_SLOPES_COST_FUNCTION__MAXIMUM_UP_SLOPE;

	/**
	 * The feature id for the '<em><b>Maximum Down Slope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_AND_ROVER_FOOTPRINT_COST_FUNCTION__MAXIMUM_DOWN_SLOPE = DISTANCE_AND_SLOPES_COST_FUNCTION__MAXIMUM_DOWN_SLOPE;

	/**
	 * The feature id for the '<em><b>Rover Foot Print Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_AND_ROVER_FOOTPRINT_COST_FUNCTION__ROVER_FOOT_PRINT_RADIUS = DISTANCE_AND_SLOPES_COST_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Maximum Roughness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_AND_ROVER_FOOTPRINT_COST_FUNCTION__MAXIMUM_ROUGHNESS = DISTANCE_AND_SLOPES_COST_FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Maximum Cross Slope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_AND_ROVER_FOOTPRINT_COST_FUNCTION__MAXIMUM_CROSS_SLOPE = DISTANCE_AND_SLOPES_COST_FUNCTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Distance And Rover Footprint Cost Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_AND_ROVER_FOOTPRINT_COST_FUNCTION_FEATURE_COUNT = DISTANCE_AND_SLOPES_COST_FUNCTION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Cost</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_AND_ROVER_FOOTPRINT_COST_FUNCTION___GET_COST__CARTESIANPOLYGON_CARTESIANPOLYGON = DISTANCE_AND_SLOPES_COST_FUNCTION___GET_COST__CARTESIANPOLYGON_CARTESIANPOLYGON;

	/**
	 * The number of operations of the '<em>Distance And Rover Footprint Cost Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_AND_ROVER_FOOTPRINT_COST_FUNCTION_OPERATION_COUNT = DISTANCE_AND_SLOPES_COST_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '<em>Directed Graph</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jgrapht.DirectedGraph
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.impl.ApogyAddonsMobilityPathplannersGraphPackageImpl#getDirectedGraph()
	 * @generated
	 */
	int DIRECTED_GRAPH = 12;

	/**
	 * The meta object id for the '<em>Simple Directed Weighted Graph</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jgrapht.graph.SimpleDirectedWeightedGraph
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.impl.ApogyAddonsMobilityPathplannersGraphPackageImpl#getSimpleDirectedWeightedGraph()
	 * @generated
	 */
	int SIMPLE_DIRECTED_WEIGHTED_GRAPH = 13;


	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.CostBasedMeshWayPointPathPlanner <em>Cost Based Mesh Way Point Path Planner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cost Based Mesh Way Point Path Planner</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.CostBasedMeshWayPointPathPlanner
	 * @generated
	 */
	EClass getCostBasedMeshWayPointPathPlanner();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.CostBasedMeshWayPointPathPlanner#getCostFunctions <em>Cost Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cost Functions</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.CostBasedMeshWayPointPathPlanner#getCostFunctions()
	 * @see #getCostBasedMeshWayPointPathPlanner()
	 * @generated
	 */
	EReference getCostBasedMeshWayPointPathPlanner_CostFunctions();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.DisplacementCostFunction <em>Displacement Cost Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Displacement Cost Function</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.DisplacementCostFunction
	 * @generated
	 */
	EClass getDisplacementCostFunction();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.DisplacementCostFunction#getCost(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPolygon, ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPolygon) <em>Get Cost</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Cost</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.DisplacementCostFunction#getCost(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPolygon, ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPolygon)
	 * @generated
	 */
	EOperation getDisplacementCostFunction__GetCost__CartesianPolygon_CartesianPolygon();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.MeshDisplacementCostFunction <em>Mesh Displacement Cost Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mesh Displacement Cost Function</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.MeshDisplacementCostFunction
	 * @generated
	 */
	EClass getMeshDisplacementCostFunction();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.MeshDisplacementCostFunction#getPlanner <em>Planner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Planner</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.MeshDisplacementCostFunction#getPlanner()
	 * @see #getMeshDisplacementCostFunction()
	 * @generated
	 */
	EReference getMeshDisplacementCostFunction_Planner();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.DistanceOnlyCostFunction <em>Distance Only Cost Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Distance Only Cost Function</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.DistanceOnlyCostFunction
	 * @generated
	 */
	EClass getDistanceOnlyCostFunction();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.SimpleDirectedWeightedGraphBasedMeshWayPointPathPlanner <em>Simple Directed Weighted Graph Based Mesh Way Point Path Planner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Directed Weighted Graph Based Mesh Way Point Path Planner</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.SimpleDirectedWeightedGraphBasedMeshWayPointPathPlanner
	 * @generated
	 */
	EClass getSimpleDirectedWeightedGraphBasedMeshWayPointPathPlanner();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.SimpleDirectedWeightedGraphBasedMeshWayPointPathPlanner#getSimpleDirectedWeightedGraph <em>Simple Directed Weighted Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Simple Directed Weighted Graph</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.SimpleDirectedWeightedGraphBasedMeshWayPointPathPlanner#getSimpleDirectedWeightedGraph()
	 * @see #getSimpleDirectedWeightedGraphBasedMeshWayPointPathPlanner()
	 * @generated
	 */
	EAttribute getSimpleDirectedWeightedGraphBasedMeshWayPointPathPlanner_SimpleDirectedWeightedGraph();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.SimpleDirectedWeightedGraphBasedMeshWayPointPathPlanner#isEnablePathSimplification <em>Enable Path Simplification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enable Path Simplification</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.SimpleDirectedWeightedGraphBasedMeshWayPointPathPlanner#isEnablePathSimplification()
	 * @see #getSimpleDirectedWeightedGraphBasedMeshWayPointPathPlanner()
	 * @generated
	 */
	EAttribute getSimpleDirectedWeightedGraphBasedMeshWayPointPathPlanner_EnablePathSimplification();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.SimpleDirectedWeightedGraphBasedMeshWayPointPathPlanner#getRobotWidthForPathSimplication <em>Robot Width For Path Simplication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Robot Width For Path Simplication</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.SimpleDirectedWeightedGraphBasedMeshWayPointPathPlanner#getRobotWidthForPathSimplication()
	 * @see #getSimpleDirectedWeightedGraphBasedMeshWayPointPathPlanner()
	 * @generated
	 */
	EAttribute getSimpleDirectedWeightedGraphBasedMeshWayPointPathPlanner_RobotWidthForPathSimplication();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.DirectedGraphBasedMeshWayPointPathPlanner <em>Directed Graph Based Mesh Way Point Path Planner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Directed Graph Based Mesh Way Point Path Planner</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.DirectedGraphBasedMeshWayPointPathPlanner
	 * @generated
	 */
	EClass getDirectedGraphBasedMeshWayPointPathPlanner();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.DirectedGraphBasedMeshWayPointPathPlanner#getDirectedGraph <em>Directed Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Directed Graph</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.DirectedGraphBasedMeshWayPointPathPlanner#getDirectedGraph()
	 * @see #getDirectedGraphBasedMeshWayPointPathPlanner()
	 * @generated
	 */
	EAttribute getDirectedGraphBasedMeshWayPointPathPlanner_DirectedGraph();

	/**
	 * Returns the meta object for class '{@link org.jgrapht.EdgeFactory <em>Edge Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge Factory</em>'.
	 * @see org.jgrapht.EdgeFactory
	 * @model instanceClass="org.jgrapht.EdgeFactory" typeParameters="V E"
	 * @generated
	 */
	EClass getEdgeFactory();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.MobilityEdge <em>Mobility Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mobility Edge</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.MobilityEdge
	 * @generated
	 */
	EClass getMobilityEdge();

	/**
	 * Returns the meta object for the reference list '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.MobilityEdge#getCostFunctions <em>Cost Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cost Functions</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.MobilityEdge#getCostFunctions()
	 * @see #getMobilityEdge()
	 * @generated
	 */
	EReference getMobilityEdge_CostFunctions();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.MobilityEdge#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.MobilityEdge#getFrom()
	 * @see #getMobilityEdge()
	 * @generated
	 */
	EReference getMobilityEdge_From();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.MobilityEdge#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.MobilityEdge#getTo()
	 * @see #getMobilityEdge()
	 * @generated
	 */
	EReference getMobilityEdge_To();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.MobilityEdge#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.MobilityEdge#getWeight()
	 * @see #getMobilityEdge()
	 * @generated
	 */
	EAttribute getMobilityEdge_Weight();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.MobilityEdgeFactory <em>Mobility Edge Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mobility Edge Factory</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.MobilityEdgeFactory
	 * @generated
	 */
	EClass getMobilityEdgeFactory();

	/**
	 * Returns the meta object for the reference list '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.MobilityEdgeFactory#getCostFunctions <em>Cost Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cost Functions</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.MobilityEdgeFactory#getCostFunctions()
	 * @see #getMobilityEdgeFactory()
	 * @generated
	 */
	EReference getMobilityEdgeFactory_CostFunctions();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.DistanceAndSlopesCostFunction <em>Distance And Slopes Cost Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Distance And Slopes Cost Function</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.DistanceAndSlopesCostFunction
	 * @generated
	 */
	EClass getDistanceAndSlopesCostFunction();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.DistanceAndSlopesCostFunction#getUpSlopeCostFactor <em>Up Slope Cost Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Up Slope Cost Factor</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.DistanceAndSlopesCostFunction#getUpSlopeCostFactor()
	 * @see #getDistanceAndSlopesCostFunction()
	 * @generated
	 */
	EAttribute getDistanceAndSlopesCostFunction_UpSlopeCostFactor();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.DistanceAndSlopesCostFunction#getDownSlopeCostFactor <em>Down Slope Cost Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Down Slope Cost Factor</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.DistanceAndSlopesCostFunction#getDownSlopeCostFactor()
	 * @see #getDistanceAndSlopesCostFunction()
	 * @generated
	 */
	EAttribute getDistanceAndSlopesCostFunction_DownSlopeCostFactor();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.DistanceAndSlopesCostFunction#getGravityAxis <em>Gravity Axis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gravity Axis</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.DistanceAndSlopesCostFunction#getGravityAxis()
	 * @see #getDistanceAndSlopesCostFunction()
	 * @generated
	 */
	EAttribute getDistanceAndSlopesCostFunction_GravityAxis();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.DistanceAndSlopesCostFunction#getMaximumUpSlope <em>Maximum Up Slope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum Up Slope</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.DistanceAndSlopesCostFunction#getMaximumUpSlope()
	 * @see #getDistanceAndSlopesCostFunction()
	 * @generated
	 */
	EAttribute getDistanceAndSlopesCostFunction_MaximumUpSlope();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.DistanceAndSlopesCostFunction#getMaximumDownSlope <em>Maximum Down Slope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum Down Slope</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.DistanceAndSlopesCostFunction#getMaximumDownSlope()
	 * @see #getDistanceAndSlopesCostFunction()
	 * @generated
	 */
	EAttribute getDistanceAndSlopesCostFunction_MaximumDownSlope();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.ExclusionZonesCostFunction <em>Exclusion Zones Cost Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exclusion Zones Cost Function</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.ExclusionZonesCostFunction
	 * @generated
	 */
	EClass getExclusionZonesCostFunction();

	/**
	 * Returns the meta object for the reference list '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.ExclusionZonesCostFunction#getExclusionZones <em>Exclusion Zones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Exclusion Zones</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.ExclusionZonesCostFunction#getExclusionZones()
	 * @see #getExclusionZonesCostFunction()
	 * @generated
	 */
	EReference getExclusionZonesCostFunction_ExclusionZones();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.DistanceAndRoverFootprintCostFunction <em>Distance And Rover Footprint Cost Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Distance And Rover Footprint Cost Function</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.DistanceAndRoverFootprintCostFunction
	 * @generated
	 */
	EClass getDistanceAndRoverFootprintCostFunction();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.DistanceAndRoverFootprintCostFunction#getRoverFootPrintRadius <em>Rover Foot Print Radius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rover Foot Print Radius</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.DistanceAndRoverFootprintCostFunction#getRoverFootPrintRadius()
	 * @see #getDistanceAndRoverFootprintCostFunction()
	 * @generated
	 */
	EAttribute getDistanceAndRoverFootprintCostFunction_RoverFootPrintRadius();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.DistanceAndRoverFootprintCostFunction#getMaximumRoughness <em>Maximum Roughness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum Roughness</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.DistanceAndRoverFootprintCostFunction#getMaximumRoughness()
	 * @see #getDistanceAndRoverFootprintCostFunction()
	 * @generated
	 */
	EAttribute getDistanceAndRoverFootprintCostFunction_MaximumRoughness();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.DistanceAndRoverFootprintCostFunction#getMaximumCrossSlope <em>Maximum Cross Slope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum Cross Slope</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.DistanceAndRoverFootprintCostFunction#getMaximumCrossSlope()
	 * @see #getDistanceAndRoverFootprintCostFunction()
	 * @generated
	 */
	EAttribute getDistanceAndRoverFootprintCostFunction_MaximumCrossSlope();

	/**
	 * Returns the meta object for data type '{@link org.jgrapht.DirectedGraph <em>Directed Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Directed Graph</em>'.
	 * @see org.jgrapht.DirectedGraph
	 * @model instanceClass="org.jgrapht.DirectedGraph<?, ?>"
	 * @generated
	 */
	EDataType getDirectedGraph();

	/**
	 * Returns the meta object for data type '{@link org.jgrapht.graph.SimpleDirectedWeightedGraph <em>Simple Directed Weighted Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Simple Directed Weighted Graph</em>'.
	 * @see org.jgrapht.graph.SimpleDirectedWeightedGraph
	 * @model instanceClass="org.jgrapht.graph.SimpleDirectedWeightedGraph<?, ?>"
	 * @generated
	 */
	EDataType getSimpleDirectedWeightedGraph();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ApogyAddonsMobilityPathplannersGraphFactory getApogyAddonsMobilityPathplannersGraphFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.impl.CostBasedMeshWayPointPathPlannerImpl <em>Cost Based Mesh Way Point Path Planner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.impl.CostBasedMeshWayPointPathPlannerImpl
		 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.impl.ApogyAddonsMobilityPathplannersGraphPackageImpl#getCostBasedMeshWayPointPathPlanner()
		 * @generated
		 */
		EClass COST_BASED_MESH_WAY_POINT_PATH_PLANNER = eINSTANCE.getCostBasedMeshWayPointPathPlanner();

		/**
		 * The meta object literal for the '<em><b>Cost Functions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COST_BASED_MESH_WAY_POINT_PATH_PLANNER__COST_FUNCTIONS = eINSTANCE.getCostBasedMeshWayPointPathPlanner_CostFunctions();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.impl.DisplacementCostFunctionImpl <em>Displacement Cost Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.impl.DisplacementCostFunctionImpl
		 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.impl.ApogyAddonsMobilityPathplannersGraphPackageImpl#getDisplacementCostFunction()
		 * @generated
		 */
		EClass DISPLACEMENT_COST_FUNCTION = eINSTANCE.getDisplacementCostFunction();

		/**
		 * The meta object literal for the '<em><b>Get Cost</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DISPLACEMENT_COST_FUNCTION___GET_COST__CARTESIANPOLYGON_CARTESIANPOLYGON = eINSTANCE.getDisplacementCostFunction__GetCost__CartesianPolygon_CartesianPolygon();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.impl.MeshDisplacementCostFunctionImpl <em>Mesh Displacement Cost Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.impl.MeshDisplacementCostFunctionImpl
		 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.impl.ApogyAddonsMobilityPathplannersGraphPackageImpl#getMeshDisplacementCostFunction()
		 * @generated
		 */
		EClass MESH_DISPLACEMENT_COST_FUNCTION = eINSTANCE.getMeshDisplacementCostFunction();

		/**
		 * The meta object literal for the '<em><b>Planner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESH_DISPLACEMENT_COST_FUNCTION__PLANNER = eINSTANCE.getMeshDisplacementCostFunction_Planner();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.impl.DistanceOnlyCostFunctionImpl <em>Distance Only Cost Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.impl.DistanceOnlyCostFunctionImpl
		 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.impl.ApogyAddonsMobilityPathplannersGraphPackageImpl#getDistanceOnlyCostFunction()
		 * @generated
		 */
		EClass DISTANCE_ONLY_COST_FUNCTION = eINSTANCE.getDistanceOnlyCostFunction();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.impl.SimpleDirectedWeightedGraphBasedMeshWayPointPathPlannerImpl <em>Simple Directed Weighted Graph Based Mesh Way Point Path Planner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.impl.SimpleDirectedWeightedGraphBasedMeshWayPointPathPlannerImpl
		 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.impl.ApogyAddonsMobilityPathplannersGraphPackageImpl#getSimpleDirectedWeightedGraphBasedMeshWayPointPathPlanner()
		 * @generated
		 */
		EClass SIMPLE_DIRECTED_WEIGHTED_GRAPH_BASED_MESH_WAY_POINT_PATH_PLANNER = eINSTANCE.getSimpleDirectedWeightedGraphBasedMeshWayPointPathPlanner();

		/**
		 * The meta object literal for the '<em><b>Simple Directed Weighted Graph</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_DIRECTED_WEIGHTED_GRAPH_BASED_MESH_WAY_POINT_PATH_PLANNER__SIMPLE_DIRECTED_WEIGHTED_GRAPH = eINSTANCE.getSimpleDirectedWeightedGraphBasedMeshWayPointPathPlanner_SimpleDirectedWeightedGraph();

		/**
		 * The meta object literal for the '<em><b>Enable Path Simplification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_DIRECTED_WEIGHTED_GRAPH_BASED_MESH_WAY_POINT_PATH_PLANNER__ENABLE_PATH_SIMPLIFICATION = eINSTANCE.getSimpleDirectedWeightedGraphBasedMeshWayPointPathPlanner_EnablePathSimplification();

		/**
		 * The meta object literal for the '<em><b>Robot Width For Path Simplication</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_DIRECTED_WEIGHTED_GRAPH_BASED_MESH_WAY_POINT_PATH_PLANNER__ROBOT_WIDTH_FOR_PATH_SIMPLICATION = eINSTANCE.getSimpleDirectedWeightedGraphBasedMeshWayPointPathPlanner_RobotWidthForPathSimplication();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.impl.DirectedGraphBasedMeshWayPointPathPlannerImpl <em>Directed Graph Based Mesh Way Point Path Planner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.impl.DirectedGraphBasedMeshWayPointPathPlannerImpl
		 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.impl.ApogyAddonsMobilityPathplannersGraphPackageImpl#getDirectedGraphBasedMeshWayPointPathPlanner()
		 * @generated
		 */
		EClass DIRECTED_GRAPH_BASED_MESH_WAY_POINT_PATH_PLANNER = eINSTANCE.getDirectedGraphBasedMeshWayPointPathPlanner();

		/**
		 * The meta object literal for the '<em><b>Directed Graph</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIRECTED_GRAPH_BASED_MESH_WAY_POINT_PATH_PLANNER__DIRECTED_GRAPH = eINSTANCE.getDirectedGraphBasedMeshWayPointPathPlanner_DirectedGraph();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.impl.EdgeFactoryImpl <em>Edge Factory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.impl.EdgeFactoryImpl
		 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.impl.ApogyAddonsMobilityPathplannersGraphPackageImpl#getEdgeFactory()
		 * @generated
		 */
		EClass EDGE_FACTORY = eINSTANCE.getEdgeFactory();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.impl.MobilityEdgeImpl <em>Mobility Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.impl.MobilityEdgeImpl
		 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.impl.ApogyAddonsMobilityPathplannersGraphPackageImpl#getMobilityEdge()
		 * @generated
		 */
		EClass MOBILITY_EDGE = eINSTANCE.getMobilityEdge();

		/**
		 * The meta object literal for the '<em><b>Cost Functions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOBILITY_EDGE__COST_FUNCTIONS = eINSTANCE.getMobilityEdge_CostFunctions();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOBILITY_EDGE__FROM = eINSTANCE.getMobilityEdge_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOBILITY_EDGE__TO = eINSTANCE.getMobilityEdge_To();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBILITY_EDGE__WEIGHT = eINSTANCE.getMobilityEdge_Weight();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.impl.MobilityEdgeFactoryImpl <em>Mobility Edge Factory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.impl.MobilityEdgeFactoryImpl
		 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.impl.ApogyAddonsMobilityPathplannersGraphPackageImpl#getMobilityEdgeFactory()
		 * @generated
		 */
		EClass MOBILITY_EDGE_FACTORY = eINSTANCE.getMobilityEdgeFactory();

		/**
		 * The meta object literal for the '<em><b>Cost Functions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOBILITY_EDGE_FACTORY__COST_FUNCTIONS = eINSTANCE.getMobilityEdgeFactory_CostFunctions();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.impl.DistanceAndSlopesCostFunctionImpl <em>Distance And Slopes Cost Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.impl.DistanceAndSlopesCostFunctionImpl
		 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.impl.ApogyAddonsMobilityPathplannersGraphPackageImpl#getDistanceAndSlopesCostFunction()
		 * @generated
		 */
		EClass DISTANCE_AND_SLOPES_COST_FUNCTION = eINSTANCE.getDistanceAndSlopesCostFunction();

		/**
		 * The meta object literal for the '<em><b>Up Slope Cost Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTANCE_AND_SLOPES_COST_FUNCTION__UP_SLOPE_COST_FACTOR = eINSTANCE.getDistanceAndSlopesCostFunction_UpSlopeCostFactor();

		/**
		 * The meta object literal for the '<em><b>Down Slope Cost Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTANCE_AND_SLOPES_COST_FUNCTION__DOWN_SLOPE_COST_FACTOR = eINSTANCE.getDistanceAndSlopesCostFunction_DownSlopeCostFactor();

		/**
		 * The meta object literal for the '<em><b>Gravity Axis</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTANCE_AND_SLOPES_COST_FUNCTION__GRAVITY_AXIS = eINSTANCE.getDistanceAndSlopesCostFunction_GravityAxis();

		/**
		 * The meta object literal for the '<em><b>Maximum Up Slope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTANCE_AND_SLOPES_COST_FUNCTION__MAXIMUM_UP_SLOPE = eINSTANCE.getDistanceAndSlopesCostFunction_MaximumUpSlope();

		/**
		 * The meta object literal for the '<em><b>Maximum Down Slope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTANCE_AND_SLOPES_COST_FUNCTION__MAXIMUM_DOWN_SLOPE = eINSTANCE.getDistanceAndSlopesCostFunction_MaximumDownSlope();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.impl.ExclusionZonesCostFunctionImpl <em>Exclusion Zones Cost Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.impl.ExclusionZonesCostFunctionImpl
		 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.impl.ApogyAddonsMobilityPathplannersGraphPackageImpl#getExclusionZonesCostFunction()
		 * @generated
		 */
		EClass EXCLUSION_ZONES_COST_FUNCTION = eINSTANCE.getExclusionZonesCostFunction();

		/**
		 * The meta object literal for the '<em><b>Exclusion Zones</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCLUSION_ZONES_COST_FUNCTION__EXCLUSION_ZONES = eINSTANCE.getExclusionZonesCostFunction_ExclusionZones();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.impl.DistanceAndRoverFootprintCostFunctionImpl <em>Distance And Rover Footprint Cost Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.impl.DistanceAndRoverFootprintCostFunctionImpl
		 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.impl.ApogyAddonsMobilityPathplannersGraphPackageImpl#getDistanceAndRoverFootprintCostFunction()
		 * @generated
		 */
		EClass DISTANCE_AND_ROVER_FOOTPRINT_COST_FUNCTION = eINSTANCE.getDistanceAndRoverFootprintCostFunction();

		/**
		 * The meta object literal for the '<em><b>Rover Foot Print Radius</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTANCE_AND_ROVER_FOOTPRINT_COST_FUNCTION__ROVER_FOOT_PRINT_RADIUS = eINSTANCE.getDistanceAndRoverFootprintCostFunction_RoverFootPrintRadius();

		/**
		 * The meta object literal for the '<em><b>Maximum Roughness</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTANCE_AND_ROVER_FOOTPRINT_COST_FUNCTION__MAXIMUM_ROUGHNESS = eINSTANCE.getDistanceAndRoverFootprintCostFunction_MaximumRoughness();

		/**
		 * The meta object literal for the '<em><b>Maximum Cross Slope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTANCE_AND_ROVER_FOOTPRINT_COST_FUNCTION__MAXIMUM_CROSS_SLOPE = eINSTANCE.getDistanceAndRoverFootprintCostFunction_MaximumCrossSlope();

		/**
		 * The meta object literal for the '<em>Directed Graph</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jgrapht.DirectedGraph
		 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.impl.ApogyAddonsMobilityPathplannersGraphPackageImpl#getDirectedGraph()
		 * @generated
		 */
		EDataType DIRECTED_GRAPH = eINSTANCE.getDirectedGraph();

		/**
		 * The meta object literal for the '<em>Simple Directed Weighted Graph</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jgrapht.graph.SimpleDirectedWeightedGraph
		 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.impl.ApogyAddonsMobilityPathplannersGraphPackageImpl#getSimpleDirectedWeightedGraph()
		 * @generated
		 */
		EDataType SIMPLE_DIRECTED_WEIGHTED_GRAPH = eINSTANCE.getSimpleDirectedWeightedGraph();

	}

} //ApogyAddonsMobilityPathplannersGraphPackage
