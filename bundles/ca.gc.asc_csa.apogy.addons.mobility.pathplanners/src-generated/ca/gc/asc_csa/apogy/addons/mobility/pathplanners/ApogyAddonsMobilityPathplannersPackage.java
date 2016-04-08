package ca.gc.asc_csa.apogy.addons.mobility.pathplanners;
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
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import ca.gc.asc_csa.apogy.common.processors.ApogyCommonProcessorsPackage;
import ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyPackage;

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
 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.ApogyAddonsMobilityPathplannersFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='ApogyAddonsMobilityPathplanners' childCreationExtenders='true' extensibleProviderFactory='true' copyrightText='Copyright (c) 2015-2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    Pierre Allard (Pierre.Allard@canada.ca), \n    Regent L\'Archeveque (Regent.Larcheveque@canada.ca),\n    Sebastien Gemme (Sebastien.Gemme@canada.ca),\n    Canadian Space Agency (CSA) - Initial API and implementation' modelName='ApogyAddonsMobilityPathplanners' dynamicTemplates='true' templateDirectory='platform:/plugin/ca.gc.asc_csa.apogy.common.emf/templates' modelDirectory='/ca.gc.asc_csa.apogy.addons.mobility.pathplanners/src-generated' editDirectory='/ca.gc.asc_csa.apogy.addons.mobility.pathplanners.edit/src-generated' basePackage='ca.gc.asc_csa.apogy.addons.mobility'"
 * @generated
 */
public interface ApogyAddonsMobilityPathplannersPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "pathplanners";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ca.gc.asc_csa.apogy.addons.mobility.pathplanners";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "pathplanners";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApogyAddonsMobilityPathplannersPackage eINSTANCE = ca.gc.asc_csa.apogy.addons.mobility.pathplanners.impl.ApogyAddonsMobilityPathplannersPackageImpl.init();

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.impl.WayPointPathPlannerImpl <em>Way Point Path Planner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.impl.WayPointPathPlannerImpl
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.impl.ApogyAddonsMobilityPathplannersPackageImpl#getWayPointPathPlanner()
	 * @generated
	 */
	int WAY_POINT_PATH_PLANNER = 0;

	/**
	 * The feature id for the '<em><b>Progress Monitor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY_POINT_PATH_PLANNER__PROGRESS_MONITOR = ApogyCommonProcessorsPackage.PROCESSOR__PROGRESS_MONITOR;

	/**
	 * The feature id for the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY_POINT_PATH_PLANNER__INPUT = ApogyCommonProcessorsPackage.PROCESSOR__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY_POINT_PATH_PLANNER__OUTPUT = ApogyCommonProcessorsPackage.PROCESSOR__OUTPUT;

	/**
	 * The feature id for the '<em><b>Current Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY_POINT_PATH_PLANNER__CURRENT_POSITION = ApogyCommonProcessorsPackage.PROCESSOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Current Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY_POINT_PATH_PLANNER__CURRENT_DESTINATION = ApogyCommonProcessorsPackage.PROCESSOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Way Point Path Planner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY_POINT_PATH_PLANNER_FEATURE_COUNT = ApogyCommonProcessorsPackage.PROCESSOR_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Process</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY_POINT_PATH_PLANNER___PROCESS__OBJECT = ApogyCommonProcessorsPackage.PROCESSOR___PROCESS__OBJECT;

	/**
	 * The operation id for the '<em>Plan</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY_POINT_PATH_PLANNER___PLAN__CARTESIANPOSITIONCOORDINATES_CARTESIANPOSITIONCOORDINATES = ApogyCommonProcessorsPackage.PROCESSOR_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Way Point Path Planner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY_POINT_PATH_PLANNER_OPERATION_COUNT = ApogyCommonProcessorsPackage.PROCESSOR_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.impl.MeshWayPointPathPlannerImpl <em>Mesh Way Point Path Planner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.impl.MeshWayPointPathPlannerImpl
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.impl.ApogyAddonsMobilityPathplannersPackageImpl#getMeshWayPointPathPlanner()
	 * @generated
	 */
	int MESH_WAY_POINT_PATH_PLANNER = 1;

	/**
	 * The feature id for the '<em><b>Progress Monitor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_WAY_POINT_PATH_PLANNER__PROGRESS_MONITOR = WAY_POINT_PATH_PLANNER__PROGRESS_MONITOR;

	/**
	 * The feature id for the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_WAY_POINT_PATH_PLANNER__INPUT = WAY_POINT_PATH_PLANNER__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_WAY_POINT_PATH_PLANNER__OUTPUT = WAY_POINT_PATH_PLANNER__OUTPUT;

	/**
	 * The feature id for the '<em><b>Current Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_WAY_POINT_PATH_PLANNER__CURRENT_POSITION = WAY_POINT_PATH_PLANNER__CURRENT_POSITION;

	/**
	 * The feature id for the '<em><b>Current Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_WAY_POINT_PATH_PLANNER__CURRENT_DESTINATION = WAY_POINT_PATH_PLANNER__CURRENT_DESTINATION;

	/**
	 * The feature id for the '<em><b>Mesh</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_WAY_POINT_PATH_PLANNER__MESH = WAY_POINT_PATH_PLANNER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Mesh Way Point Path Planner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_WAY_POINT_PATH_PLANNER_FEATURE_COUNT = WAY_POINT_PATH_PLANNER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Process</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_WAY_POINT_PATH_PLANNER___PROCESS__OBJECT = WAY_POINT_PATH_PLANNER___PROCESS__OBJECT;

	/**
	 * The operation id for the '<em>Plan</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_WAY_POINT_PATH_PLANNER___PLAN__CARTESIANPOSITIONCOORDINATES_CARTESIANPOSITIONCOORDINATES = WAY_POINT_PATH_PLANNER___PLAN__CARTESIANPOSITIONCOORDINATES_CARTESIANPOSITIONCOORDINATES;

	/**
	 * The number of operations of the '<em>Mesh Way Point Path Planner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_WAY_POINT_PATH_PLANNER_OPERATION_COUNT = WAY_POINT_PATH_PLANNER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.impl.ExclusionZoneImpl <em>Exclusion Zone</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.impl.ExclusionZoneImpl
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.impl.ApogyAddonsMobilityPathplannersPackageImpl#getExclusionZone()
	 * @generated
	 */
	int EXCLUSION_ZONE = 2;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSION_ZONE__PARENT = ApogyCommonTopologyPackage.NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSION_ZONE__DESCRIPTION = ApogyCommonTopologyPackage.NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSION_ZONE__NODE_ID = ApogyCommonTopologyPackage.NODE__NODE_ID;

	/**
	 * The number of structural features of the '<em>Exclusion Zone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSION_ZONE_FEATURE_COUNT = ApogyCommonTopologyPackage.NODE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSION_ZONE___ACCEPT__INODEVISITOR = ApogyCommonTopologyPackage.NODE___ACCEPT__INODEVISITOR;

	/**
	 * The operation id for the '<em>Is Inside</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSION_ZONE___IS_INSIDE__CARTESIANPOSITIONCOORDINATES = ApogyCommonTopologyPackage.NODE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Intersects</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSION_ZONE___INTERSECTS__CARTESIANPOSITIONCOORDINATES_CARTESIANPOSITIONCOORDINATES = ApogyCommonTopologyPackage.NODE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Exclusion Zone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSION_ZONE_OPERATION_COUNT = ApogyCommonTopologyPackage.NODE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.impl.CircularExclusionZoneImpl <em>Circular Exclusion Zone</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.impl.CircularExclusionZoneImpl
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.impl.ApogyAddonsMobilityPathplannersPackageImpl#getCircularExclusionZone()
	 * @generated
	 */
	int CIRCULAR_EXCLUSION_ZONE = 3;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULAR_EXCLUSION_ZONE__PARENT = EXCLUSION_ZONE__PARENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULAR_EXCLUSION_ZONE__DESCRIPTION = EXCLUSION_ZONE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULAR_EXCLUSION_ZONE__NODE_ID = EXCLUSION_ZONE__NODE_ID;

	/**
	 * The feature id for the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULAR_EXCLUSION_ZONE__RADIUS = EXCLUSION_ZONE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invert Sampling Shape</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULAR_EXCLUSION_ZONE__INVERT_SAMPLING_SHAPE = EXCLUSION_ZONE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Circular Exclusion Zone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULAR_EXCLUSION_ZONE_FEATURE_COUNT = EXCLUSION_ZONE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULAR_EXCLUSION_ZONE___ACCEPT__INODEVISITOR = EXCLUSION_ZONE___ACCEPT__INODEVISITOR;

	/**
	 * The operation id for the '<em>Intersects</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULAR_EXCLUSION_ZONE___INTERSECTS__CARTESIANPOSITIONCOORDINATES_CARTESIANPOSITIONCOORDINATES = EXCLUSION_ZONE___INTERSECTS__CARTESIANPOSITIONCOORDINATES_CARTESIANPOSITIONCOORDINATES;

	/**
	 * The operation id for the '<em>Is Inside</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULAR_EXCLUSION_ZONE___IS_INSIDE__COORDINATES = EXCLUSION_ZONE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Polygon Inside</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULAR_EXCLUSION_ZONE___IS_POLYGON_INSIDE__POLYGON = EXCLUSION_ZONE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Circular Exclusion Zone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULAR_EXCLUSION_ZONE_OPERATION_COUNT = EXCLUSION_ZONE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.impl.ApogyAddonsMobilityPathplannersFacadeImpl <em>Facade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.impl.ApogyAddonsMobilityPathplannersFacadeImpl
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.impl.ApogyAddonsMobilityPathplannersPackageImpl#getApogyAddonsMobilityPathplannersFacade()
	 * @generated
	 */
	int APOGY_ADDONS_MOBILITY_PATHPLANNERS_FACADE = 4;

	/**
	 * The number of structural features of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_ADDONS_MOBILITY_PATHPLANNERS_FACADE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Create Circular Exclusion Zone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_ADDONS_MOBILITY_PATHPLANNERS_FACADE___CREATE_CIRCULAR_EXCLUSION_ZONE__DOUBLE_GROUPNODE = 0;

	/**
	 * The number of operations of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_ADDONS_MOBILITY_PATHPLANNERS_FACADE_OPERATION_COUNT = 1;

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.WayPointPathPlanner <em>Way Point Path Planner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Way Point Path Planner</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.WayPointPathPlanner
	 * @generated
	 */
	EClass getWayPointPathPlanner();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.WayPointPathPlanner#getCurrentPosition <em>Current Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current Position</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.WayPointPathPlanner#getCurrentPosition()
	 * @see #getWayPointPathPlanner()
	 * @generated
	 */
	EReference getWayPointPathPlanner_CurrentPosition();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.WayPointPathPlanner#getCurrentDestination <em>Current Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current Destination</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.WayPointPathPlanner#getCurrentDestination()
	 * @see #getWayPointPathPlanner()
	 * @generated
	 */
	EReference getWayPointPathPlanner_CurrentDestination();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.WayPointPathPlanner#plan(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates, ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates) <em>Plan</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Plan</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.WayPointPathPlanner#plan(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates, ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates)
	 * @generated
	 */
	EOperation getWayPointPathPlanner__Plan__CartesianPositionCoordinates_CartesianPositionCoordinates();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.MeshWayPointPathPlanner <em>Mesh Way Point Path Planner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mesh Way Point Path Planner</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.MeshWayPointPathPlanner
	 * @generated
	 */
	EClass getMeshWayPointPathPlanner();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.MeshWayPointPathPlanner#getMesh <em>Mesh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mesh</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.MeshWayPointPathPlanner#getMesh()
	 * @see #getMeshWayPointPathPlanner()
	 * @generated
	 */
	EReference getMeshWayPointPathPlanner_Mesh();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.ExclusionZone <em>Exclusion Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exclusion Zone</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.ExclusionZone
	 * @generated
	 */
	EClass getExclusionZone();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.ExclusionZone#isInside(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates) <em>Is Inside</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Inside</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.ExclusionZone#isInside(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates)
	 * @generated
	 */
	EOperation getExclusionZone__IsInside__CartesianPositionCoordinates();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.ExclusionZone#intersects(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates, ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates) <em>Intersects</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Intersects</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.ExclusionZone#intersects(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates, ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates)
	 * @generated
	 */
	EOperation getExclusionZone__Intersects__CartesianPositionCoordinates_CartesianPositionCoordinates();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.CircularExclusionZone <em>Circular Exclusion Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Circular Exclusion Zone</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.CircularExclusionZone
	 * @generated
	 */
	EClass getCircularExclusionZone();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.CircularExclusionZone#getRadius <em>Radius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Radius</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.CircularExclusionZone#getRadius()
	 * @see #getCircularExclusionZone()
	 * @generated
	 */
	EAttribute getCircularExclusionZone_Radius();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.CircularExclusionZone#isInvertSamplingShape <em>Invert Sampling Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invert Sampling Shape</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.CircularExclusionZone#isInvertSamplingShape()
	 * @see #getCircularExclusionZone()
	 * @generated
	 */
	EAttribute getCircularExclusionZone_InvertSamplingShape();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.ApogyAddonsMobilityPathplannersFacade <em>Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facade</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.ApogyAddonsMobilityPathplannersFacade
	 * @generated
	 */
	EClass getApogyAddonsMobilityPathplannersFacade();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.ApogyAddonsMobilityPathplannersFacade#createCircularExclusionZone(double, ca.gc.asc_csa.apogy.common.topology.GroupNode) <em>Create Circular Exclusion Zone</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Circular Exclusion Zone</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.ApogyAddonsMobilityPathplannersFacade#createCircularExclusionZone(double, ca.gc.asc_csa.apogy.common.topology.GroupNode)
	 * @generated
	 */
	EOperation getApogyAddonsMobilityPathplannersFacade__CreateCircularExclusionZone__double_GroupNode();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ApogyAddonsMobilityPathplannersFactory getApogyAddonsMobilityPathplannersFactory();

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
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.impl.WayPointPathPlannerImpl <em>Way Point Path Planner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.impl.WayPointPathPlannerImpl
		 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.impl.ApogyAddonsMobilityPathplannersPackageImpl#getWayPointPathPlanner()
		 * @generated
		 */
		EClass WAY_POINT_PATH_PLANNER = eINSTANCE.getWayPointPathPlanner();

		/**
		 * The meta object literal for the '<em><b>Current Position</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WAY_POINT_PATH_PLANNER__CURRENT_POSITION = eINSTANCE.getWayPointPathPlanner_CurrentPosition();

		/**
		 * The meta object literal for the '<em><b>Current Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WAY_POINT_PATH_PLANNER__CURRENT_DESTINATION = eINSTANCE.getWayPointPathPlanner_CurrentDestination();

		/**
		 * The meta object literal for the '<em><b>Plan</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation WAY_POINT_PATH_PLANNER___PLAN__CARTESIANPOSITIONCOORDINATES_CARTESIANPOSITIONCOORDINATES = eINSTANCE.getWayPointPathPlanner__Plan__CartesianPositionCoordinates_CartesianPositionCoordinates();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.impl.MeshWayPointPathPlannerImpl <em>Mesh Way Point Path Planner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.impl.MeshWayPointPathPlannerImpl
		 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.impl.ApogyAddonsMobilityPathplannersPackageImpl#getMeshWayPointPathPlanner()
		 * @generated
		 */
		EClass MESH_WAY_POINT_PATH_PLANNER = eINSTANCE.getMeshWayPointPathPlanner();

		/**
		 * The meta object literal for the '<em><b>Mesh</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESH_WAY_POINT_PATH_PLANNER__MESH = eINSTANCE.getMeshWayPointPathPlanner_Mesh();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.impl.ExclusionZoneImpl <em>Exclusion Zone</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.impl.ExclusionZoneImpl
		 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.impl.ApogyAddonsMobilityPathplannersPackageImpl#getExclusionZone()
		 * @generated
		 */
		EClass EXCLUSION_ZONE = eINSTANCE.getExclusionZone();

		/**
		 * The meta object literal for the '<em><b>Is Inside</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXCLUSION_ZONE___IS_INSIDE__CARTESIANPOSITIONCOORDINATES = eINSTANCE.getExclusionZone__IsInside__CartesianPositionCoordinates();

		/**
		 * The meta object literal for the '<em><b>Intersects</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXCLUSION_ZONE___INTERSECTS__CARTESIANPOSITIONCOORDINATES_CARTESIANPOSITIONCOORDINATES = eINSTANCE.getExclusionZone__Intersects__CartesianPositionCoordinates_CartesianPositionCoordinates();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.impl.CircularExclusionZoneImpl <em>Circular Exclusion Zone</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.impl.CircularExclusionZoneImpl
		 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.impl.ApogyAddonsMobilityPathplannersPackageImpl#getCircularExclusionZone()
		 * @generated
		 */
		EClass CIRCULAR_EXCLUSION_ZONE = eINSTANCE.getCircularExclusionZone();

		/**
		 * The meta object literal for the '<em><b>Radius</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CIRCULAR_EXCLUSION_ZONE__RADIUS = eINSTANCE.getCircularExclusionZone_Radius();

		/**
		 * The meta object literal for the '<em><b>Invert Sampling Shape</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CIRCULAR_EXCLUSION_ZONE__INVERT_SAMPLING_SHAPE = eINSTANCE.getCircularExclusionZone_InvertSamplingShape();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.impl.ApogyAddonsMobilityPathplannersFacadeImpl <em>Facade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.impl.ApogyAddonsMobilityPathplannersFacadeImpl
		 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.impl.ApogyAddonsMobilityPathplannersPackageImpl#getApogyAddonsMobilityPathplannersFacade()
		 * @generated
		 */
		EClass APOGY_ADDONS_MOBILITY_PATHPLANNERS_FACADE = eINSTANCE.getApogyAddonsMobilityPathplannersFacade();

		/**
		 * The meta object literal for the '<em><b>Create Circular Exclusion Zone</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_ADDONS_MOBILITY_PATHPLANNERS_FACADE___CREATE_CIRCULAR_EXCLUSION_ZONE__DOUBLE_GROUPNODE = eINSTANCE.getApogyAddonsMobilityPathplannersFacade__CreateCircularExclusionZone__double_GroupNode();

	}

} //ApogyAddonsMobilityPathplannersPackage
