/**
 * Canadian Space Agency 2007.
 *
 * $Id: PathplannersPackage.java,v 1.3.4.2 2015/05/21 15:50:52 pallard Exp $
 */
package org.eclipse.symphony.addons.mobility.pathplanners;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.symphony.common.processors.ProcessorsPackage;
import org.eclipse.symphony.common.topology.TopologyPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.symphony.addons.mobility.pathplanners.PathplannersFactory
 * @model kind="package"
 * @generated
 */
public interface PathplannersPackage extends EPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Canadian Space Agency 2007.";

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
	String eNS_URI = "http:///ca/gc/space/mrt/pathplanners/pathplanners.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ca.gc.space.mrt.pathplanners";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PathplannersPackage eINSTANCE = org.eclipse.symphony.addons.mobility.pathplanners.impl.PathplannersPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.mobility.pathplanners.impl.WayPointPathPlannerImpl <em>Way Point Path Planner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.mobility.pathplanners.impl.WayPointPathPlannerImpl
	 * @see org.eclipse.symphony.addons.mobility.pathplanners.impl.PathplannersPackageImpl#getWayPointPathPlanner()
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
	int WAY_POINT_PATH_PLANNER__PROGRESS_MONITOR = ProcessorsPackage.PROCESSOR__PROGRESS_MONITOR;

	/**
	 * The feature id for the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY_POINT_PATH_PLANNER__INPUT = ProcessorsPackage.PROCESSOR__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY_POINT_PATH_PLANNER__OUTPUT = ProcessorsPackage.PROCESSOR__OUTPUT;

	/**
	 * The feature id for the '<em><b>Current Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY_POINT_PATH_PLANNER__CURRENT_DESTINATION = ProcessorsPackage.PROCESSOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Current Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY_POINT_PATH_PLANNER__CURRENT_POSITION = ProcessorsPackage.PROCESSOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Way Point Path Planner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY_POINT_PATH_PLANNER_FEATURE_COUNT = ProcessorsPackage.PROCESSOR_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Process</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY_POINT_PATH_PLANNER___PROCESS__OBJECT = ProcessorsPackage.PROCESSOR___PROCESS__OBJECT;

	/**
	 * The operation id for the '<em>Plan</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY_POINT_PATH_PLANNER___PLAN__CARTESIANPOSITIONCOORDINATES_CARTESIANPOSITIONCOORDINATES = ProcessorsPackage.PROCESSOR_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Way Point Path Planner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY_POINT_PATH_PLANNER_OPERATION_COUNT = ProcessorsPackage.PROCESSOR_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.mobility.pathplanners.impl.MeshWayPointPathPlannerImpl <em>Mesh Way Point Path Planner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.mobility.pathplanners.impl.MeshWayPointPathPlannerImpl
	 * @see org.eclipse.symphony.addons.mobility.pathplanners.impl.PathplannersPackageImpl#getMeshWayPointPathPlanner()
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
	 * The feature id for the '<em><b>Current Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_WAY_POINT_PATH_PLANNER__CURRENT_DESTINATION = WAY_POINT_PATH_PLANNER__CURRENT_DESTINATION;

	/**
	 * The feature id for the '<em><b>Current Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_WAY_POINT_PATH_PLANNER__CURRENT_POSITION = WAY_POINT_PATH_PLANNER__CURRENT_POSITION;

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
	 * The meta object id for the '{@link org.eclipse.symphony.addons.mobility.pathplanners.impl.ExclusionZoneImpl <em>Exclusion Zone</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.mobility.pathplanners.impl.ExclusionZoneImpl
	 * @see org.eclipse.symphony.addons.mobility.pathplanners.impl.PathplannersPackageImpl#getExclusionZone()
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
	int EXCLUSION_ZONE__PARENT = TopologyPackage.NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSION_ZONE__DESCRIPTION = TopologyPackage.NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSION_ZONE__NODE_ID = TopologyPackage.NODE__NODE_ID;

	/**
	 * The number of structural features of the '<em>Exclusion Zone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSION_ZONE_FEATURE_COUNT = TopologyPackage.NODE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSION_ZONE___ACCEPT__INODEVISITOR = TopologyPackage.NODE___ACCEPT__INODEVISITOR;

	/**
	 * The operation id for the '<em>Is Inside</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSION_ZONE___IS_INSIDE__CARTESIANPOSITIONCOORDINATES = TopologyPackage.NODE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Intersects</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSION_ZONE___INTERSECTS__CARTESIANPOSITIONCOORDINATES_CARTESIANPOSITIONCOORDINATES = TopologyPackage.NODE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Exclusion Zone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSION_ZONE_OPERATION_COUNT = TopologyPackage.NODE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.mobility.pathplanners.impl.CircularExclusionZoneImpl <em>Circular Exclusion Zone</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.mobility.pathplanners.impl.CircularExclusionZoneImpl
	 * @see org.eclipse.symphony.addons.mobility.pathplanners.impl.PathplannersPackageImpl#getCircularExclusionZone()
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
	 * The meta object id for the '{@link org.eclipse.symphony.addons.mobility.pathplanners.impl.PathPlannersFacadeImpl <em>Path Planners Facade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.mobility.pathplanners.impl.PathPlannersFacadeImpl
	 * @see org.eclipse.symphony.addons.mobility.pathplanners.impl.PathplannersPackageImpl#getPathPlannersFacade()
	 * @generated
	 */
	int PATH_PLANNERS_FACADE = 4;

	/**
	 * The number of structural features of the '<em>Path Planners Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PLANNERS_FACADE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Create Circular Exclusion Zone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PLANNERS_FACADE___CREATE_CIRCULAR_EXCLUSION_ZONE__DOUBLE_GROUPNODE = 0;

	/**
	 * The number of operations of the '<em>Path Planners Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PLANNERS_FACADE_OPERATION_COUNT = 1;

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.mobility.pathplanners.WayPointPathPlanner <em>Way Point Path Planner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Way Point Path Planner</em>'.
	 * @see org.eclipse.symphony.addons.mobility.pathplanners.WayPointPathPlanner
	 * @generated
	 */
	EClass getWayPointPathPlanner();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.addons.mobility.pathplanners.WayPointPathPlanner#getCurrentDestination <em>Current Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current Destination</em>'.
	 * @see org.eclipse.symphony.addons.mobility.pathplanners.WayPointPathPlanner#getCurrentDestination()
	 * @see #getWayPointPathPlanner()
	 * @generated
	 */
	EReference getWayPointPathPlanner_CurrentDestination();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.addons.mobility.pathplanners.WayPointPathPlanner#getCurrentPosition <em>Current Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current Position</em>'.
	 * @see org.eclipse.symphony.addons.mobility.pathplanners.WayPointPathPlanner#getCurrentPosition()
	 * @see #getWayPointPathPlanner()
	 * @generated
	 */
	EReference getWayPointPathPlanner_CurrentPosition();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.addons.mobility.pathplanners.WayPointPathPlanner#plan(org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates, org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates) <em>Plan</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Plan</em>' operation.
	 * @see org.eclipse.symphony.addons.mobility.pathplanners.WayPointPathPlanner#plan(org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates, org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates)
	 * @generated
	 */
	EOperation getWayPointPathPlanner__Plan__CartesianPositionCoordinates_CartesianPositionCoordinates();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.mobility.pathplanners.MeshWayPointPathPlanner <em>Mesh Way Point Path Planner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mesh Way Point Path Planner</em>'.
	 * @see org.eclipse.symphony.addons.mobility.pathplanners.MeshWayPointPathPlanner
	 * @generated
	 */
	EClass getMeshWayPointPathPlanner();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.addons.mobility.pathplanners.MeshWayPointPathPlanner#getMesh <em>Mesh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mesh</em>'.
	 * @see org.eclipse.symphony.addons.mobility.pathplanners.MeshWayPointPathPlanner#getMesh()
	 * @see #getMeshWayPointPathPlanner()
	 * @generated
	 */
	EReference getMeshWayPointPathPlanner_Mesh();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.mobility.pathplanners.ExclusionZone <em>Exclusion Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exclusion Zone</em>'.
	 * @see org.eclipse.symphony.addons.mobility.pathplanners.ExclusionZone
	 * @generated
	 */
	EClass getExclusionZone();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.addons.mobility.pathplanners.ExclusionZone#isInside(org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates) <em>Is Inside</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Inside</em>' operation.
	 * @see org.eclipse.symphony.addons.mobility.pathplanners.ExclusionZone#isInside(org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates)
	 * @generated
	 */
	EOperation getExclusionZone__IsInside__CartesianPositionCoordinates();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.addons.mobility.pathplanners.ExclusionZone#intersects(org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates, org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates) <em>Intersects</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Intersects</em>' operation.
	 * @see org.eclipse.symphony.addons.mobility.pathplanners.ExclusionZone#intersects(org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates, org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates)
	 * @generated
	 */
	EOperation getExclusionZone__Intersects__CartesianPositionCoordinates_CartesianPositionCoordinates();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.mobility.pathplanners.CircularExclusionZone <em>Circular Exclusion Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Circular Exclusion Zone</em>'.
	 * @see org.eclipse.symphony.addons.mobility.pathplanners.CircularExclusionZone
	 * @generated
	 */
	EClass getCircularExclusionZone();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.mobility.pathplanners.CircularExclusionZone#getRadius <em>Radius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Radius</em>'.
	 * @see org.eclipse.symphony.addons.mobility.pathplanners.CircularExclusionZone#getRadius()
	 * @see #getCircularExclusionZone()
	 * @generated
	 */
	EAttribute getCircularExclusionZone_Radius();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.mobility.pathplanners.CircularExclusionZone#isInvertSamplingShape <em>Invert Sampling Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invert Sampling Shape</em>'.
	 * @see org.eclipse.symphony.addons.mobility.pathplanners.CircularExclusionZone#isInvertSamplingShape()
	 * @see #getCircularExclusionZone()
	 * @generated
	 */
	EAttribute getCircularExclusionZone_InvertSamplingShape();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.mobility.pathplanners.PathPlannersFacade <em>Path Planners Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path Planners Facade</em>'.
	 * @see org.eclipse.symphony.addons.mobility.pathplanners.PathPlannersFacade
	 * @generated
	 */
	EClass getPathPlannersFacade();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.addons.mobility.pathplanners.PathPlannersFacade#createCircularExclusionZone(double, org.eclipse.symphony.common.topology.GroupNode) <em>Create Circular Exclusion Zone</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Circular Exclusion Zone</em>' operation.
	 * @see org.eclipse.symphony.addons.mobility.pathplanners.PathPlannersFacade#createCircularExclusionZone(double, org.eclipse.symphony.common.topology.GroupNode)
	 * @generated
	 */
	EOperation getPathPlannersFacade__CreateCircularExclusionZone__double_GroupNode();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PathplannersFactory getPathplannersFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.mobility.pathplanners.impl.WayPointPathPlannerImpl <em>Way Point Path Planner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.mobility.pathplanners.impl.WayPointPathPlannerImpl
		 * @see org.eclipse.symphony.addons.mobility.pathplanners.impl.PathplannersPackageImpl#getWayPointPathPlanner()
		 * @generated
		 */
		EClass WAY_POINT_PATH_PLANNER = eINSTANCE.getWayPointPathPlanner();

		/**
		 * The meta object literal for the '<em><b>Current Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WAY_POINT_PATH_PLANNER__CURRENT_DESTINATION = eINSTANCE.getWayPointPathPlanner_CurrentDestination();

		/**
		 * The meta object literal for the '<em><b>Current Position</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WAY_POINT_PATH_PLANNER__CURRENT_POSITION = eINSTANCE.getWayPointPathPlanner_CurrentPosition();

		/**
		 * The meta object literal for the '<em><b>Plan</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation WAY_POINT_PATH_PLANNER___PLAN__CARTESIANPOSITIONCOORDINATES_CARTESIANPOSITIONCOORDINATES = eINSTANCE.getWayPointPathPlanner__Plan__CartesianPositionCoordinates_CartesianPositionCoordinates();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.mobility.pathplanners.impl.MeshWayPointPathPlannerImpl <em>Mesh Way Point Path Planner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.mobility.pathplanners.impl.MeshWayPointPathPlannerImpl
		 * @see org.eclipse.symphony.addons.mobility.pathplanners.impl.PathplannersPackageImpl#getMeshWayPointPathPlanner()
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
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.mobility.pathplanners.impl.ExclusionZoneImpl <em>Exclusion Zone</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.mobility.pathplanners.impl.ExclusionZoneImpl
		 * @see org.eclipse.symphony.addons.mobility.pathplanners.impl.PathplannersPackageImpl#getExclusionZone()
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
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.mobility.pathplanners.impl.CircularExclusionZoneImpl <em>Circular Exclusion Zone</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.mobility.pathplanners.impl.CircularExclusionZoneImpl
		 * @see org.eclipse.symphony.addons.mobility.pathplanners.impl.PathplannersPackageImpl#getCircularExclusionZone()
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
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.mobility.pathplanners.impl.PathPlannersFacadeImpl <em>Path Planners Facade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.mobility.pathplanners.impl.PathPlannersFacadeImpl
		 * @see org.eclipse.symphony.addons.mobility.pathplanners.impl.PathplannersPackageImpl#getPathPlannersFacade()
		 * @generated
		 */
		EClass PATH_PLANNERS_FACADE = eINSTANCE.getPathPlannersFacade();

		/**
		 * The meta object literal for the '<em><b>Create Circular Exclusion Zone</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PATH_PLANNERS_FACADE___CREATE_CIRCULAR_EXCLUSION_ZONE__DOUBLE_GROUPNODE = eINSTANCE.getPathPlannersFacade__CreateCircularExclusionZone__double_GroupNode();

	}

} //PathplannersPackage
