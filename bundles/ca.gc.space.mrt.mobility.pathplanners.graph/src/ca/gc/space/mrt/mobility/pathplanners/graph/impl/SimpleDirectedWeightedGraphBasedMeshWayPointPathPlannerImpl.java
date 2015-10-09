/**
 * Canadian Space Agency 2008.
 *
 * $Id: SimpleDirectedWeightedGraphBasedMeshWayPointPathPlannerImpl.java,v 1.3.4.2 2015/05/21 15:50:20 pallard Exp $
 */
package ca.gc.space.mrt.mobility.pathplanners.graph.impl;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.SortedSet;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.symphony.addons.geometry.paths.PathUtilities;
import org.eclipse.symphony.addons.geometry.paths.PathsFactory;
import org.eclipse.symphony.addons.geometry.paths.WayPointPath;
import org.eclipse.symphony.common.geometry.data.Mesh;
import org.eclipse.symphony.common.geometry.data3d.CartesianCoordinatesSet;
import org.eclipse.symphony.common.geometry.data3d.CartesianPlane;
import org.eclipse.symphony.common.geometry.data3d.CartesianPolygon;
import org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates;
import org.eclipse.symphony.common.geometry.data3d.CartesianTriangle;
import org.eclipse.symphony.common.geometry.data3d.Data3dFacade;
import org.eclipse.symphony.common.geometry.data3d.Data3dFactory;
import org.eclipse.symphony.common.geometry.data3d.Geometry3dUtilities;
import org.eclipse.symphony.common.processors.ProcessorsPackage;
import org.eclipse.symphony.common.processors.VerboseProvider;
import org.eclipse.symphony.common.topology.ContentNode;
import org.eclipse.symphony.common.topology.TopologyFacade;
import org.eclipse.symphony.common.topology.TopologyFactory;
import org.eclipse.symphony.common.topology.TransformNode;
import org.jgrapht.graph.SimpleDirectedWeightedGraph;

import ca.gc.space.mrt.mobility.pathplanners.graph.CostBasedMeshWayPointPathPlanner;
import ca.gc.space.mrt.mobility.pathplanners.graph.GraphUtilities;
import ca.gc.space.mrt.mobility.pathplanners.graph.MobilityEdge;
import ca.gc.space.mrt.mobility.pathplanners.graph.MobilityEdgeFactory;
import ca.gc.space.mrt.mobility.pathplanners.graph.PathplannersGraphFactory;
import ca.gc.space.mrt.mobility.pathplanners.graph.PathplannersGraphPackage;
import ca.gc.space.mrt.mobility.pathplanners.graph.SimpleDirectedWeightedGraphBasedMeshWayPointPathPlanner;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Directed Weighted Graph Based Mesh Way Point Path Planner</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.gc.space.mrt.mobility.pathplanners.graph.impl.SimpleDirectedWeightedGraphBasedMeshWayPointPathPlannerImpl#isVerbose <em>Verbose</em>}</li>
 *   <li>{@link ca.gc.space.mrt.mobility.pathplanners.graph.impl.SimpleDirectedWeightedGraphBasedMeshWayPointPathPlannerImpl#getSimpleDirectedWeightedGraph <em>Simple Directed Weighted Graph</em>}</li>
 *   <li>{@link ca.gc.space.mrt.mobility.pathplanners.graph.impl.SimpleDirectedWeightedGraphBasedMeshWayPointPathPlannerImpl#isEnablePathSimplification <em>Enable Path Simplification</em>}</li>
 *   <li>{@link ca.gc.space.mrt.mobility.pathplanners.graph.impl.SimpleDirectedWeightedGraphBasedMeshWayPointPathPlannerImpl#getRobotWidthForPathSimplication <em>Robot Width For Path Simplication</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SimpleDirectedWeightedGraphBasedMeshWayPointPathPlannerImpl<PolygonType extends CartesianPolygon> extends CostBasedMeshWayPointPathPlannerImpl<PolygonType> implements SimpleDirectedWeightedGraphBasedMeshWayPointPathPlanner<PolygonType> {	

	private Adapter costFunctionsAdapter = null;
	
	
	protected static Data3dFacade data3dFacade = Data3dFactory.eINSTANCE.createData3dFacade();
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Canadian Space Agency 2008.";

	/**
	 * The default value of the '{@link #isVerbose() <em>Verbose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVerbose()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VERBOSE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isVerbose() <em>Verbose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVerbose()
	 * @generated
	 * @ordered
	 */
	protected boolean verbose = VERBOSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSimpleDirectedWeightedGraph() <em>Simple Directed Weighted Graph</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimpleDirectedWeightedGraph()
	 * @generated
	 * @ordered
	 */
	protected static final SimpleDirectedWeightedGraph SIMPLE_DIRECTED_WEIGHTED_GRAPH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSimpleDirectedWeightedGraph() <em>Simple Directed Weighted Graph</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimpleDirectedWeightedGraph()
	 * @generated
	 * @ordered
	 */
	protected SimpleDirectedWeightedGraph simpleDirectedWeightedGraph = SIMPLE_DIRECTED_WEIGHTED_GRAPH_EDEFAULT;

	/**
	 * The default value of the '{@link #isEnablePathSimplification() <em>Enable Path Simplification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnablePathSimplification()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENABLE_PATH_SIMPLIFICATION_EDEFAULT = true;


	/**
	 * The cached value of the '{@link #isEnablePathSimplification() <em>Enable Path Simplification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnablePathSimplification()
	 * @generated
	 * @ordered
	 */
	protected boolean enablePathSimplification = ENABLE_PATH_SIMPLIFICATION_EDEFAULT;


	/**
	 * The default value of the '{@link #getRobotWidthForPathSimplication() <em>Robot Width For Path Simplication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRobotWidthForPathSimplication()
	 * @generated
	 * @ordered
	 */
	protected static final double ROBOT_WIDTH_FOR_PATH_SIMPLICATION_EDEFAULT = 0.5;


	/**
	 * The cached value of the '{@link #getRobotWidthForPathSimplication() <em>Robot Width For Path Simplication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRobotWidthForPathSimplication()
	 * @generated
	 * @ordered
	 */
	protected double robotWidthForPathSimplication = ROBOT_WIDTH_FOR_PATH_SIMPLICATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	protected SimpleDirectedWeightedGraphBasedMeshWayPointPathPlannerImpl() {
		super();	
		
		// Register a listener to the CostFunction to ensure the SimpleDirectedWeightedGraph is updated.
		this.eAdapters().add(getCostFunctionsAdapter());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PathplannersGraphPackage.Literals.SIMPLE_DIRECTED_WEIGHTED_GRAPH_BASED_MESH_WAY_POINT_PATH_PLANNER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isVerbose() {
		return verbose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerbose(boolean newVerbose) {
		boolean oldVerbose = verbose;
		verbose = newVerbose;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PathplannersGraphPackage.SIMPLE_DIRECTED_WEIGHTED_GRAPH_BASED_MESH_WAY_POINT_PATH_PLANNER__VERBOSE, oldVerbose, verbose));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public SimpleDirectedWeightedGraph getSimpleDirectedWeightedGraph() {
		if(!eIsSet(PathplannersGraphPackage.SIMPLE_DIRECTED_WEIGHTED_GRAPH_BASED_MESH_WAY_POINT_PATH_PLANNER__SIMPLE_DIRECTED_WEIGHTED_GRAPH))
		{
			printVerbose("Graph is dirty, regenerating it...");
			try
			{
				setSimpleDirectedWeightedGraph(createGraph());
			}
			catch(Exception e)
			{
				e.printStackTrace();
				eUnset(PathplannersGraphPackage.SIMPLE_DIRECTED_WEIGHTED_GRAPH_BASED_MESH_WAY_POINT_PATH_PLANNER__SIMPLE_DIRECTED_WEIGHTED_GRAPH);
			}
		}
		return getSimpleDirectedWeightedGraphGen();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleDirectedWeightedGraph getSimpleDirectedWeightedGraphGen() {
		return simpleDirectedWeightedGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimpleDirectedWeightedGraph(SimpleDirectedWeightedGraph newSimpleDirectedWeightedGraph) {
		SimpleDirectedWeightedGraph oldSimpleDirectedWeightedGraph = simpleDirectedWeightedGraph;
		simpleDirectedWeightedGraph = newSimpleDirectedWeightedGraph;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PathplannersGraphPackage.SIMPLE_DIRECTED_WEIGHTED_GRAPH_BASED_MESH_WAY_POINT_PATH_PLANNER__SIMPLE_DIRECTED_WEIGHTED_GRAPH, oldSimpleDirectedWeightedGraph, simpleDirectedWeightedGraph));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnablePathSimplification()
	{
		return enablePathSimplification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnablePathSimplification(boolean newEnablePathSimplification)
	{
		boolean oldEnablePathSimplification = enablePathSimplification;
		enablePathSimplification = newEnablePathSimplification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PathplannersGraphPackage.SIMPLE_DIRECTED_WEIGHTED_GRAPH_BASED_MESH_WAY_POINT_PATH_PLANNER__ENABLE_PATH_SIMPLIFICATION, oldEnablePathSimplification, enablePathSimplification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRobotWidthForPathSimplication()
	{
		return robotWidthForPathSimplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRobotWidthForPathSimplication(double newRobotWidthForPathSimplication)
	{
		double oldRobotWidthForPathSimplication = robotWidthForPathSimplication;
		robotWidthForPathSimplication = newRobotWidthForPathSimplication;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PathplannersGraphPackage.SIMPLE_DIRECTED_WEIGHTED_GRAPH_BASED_MESH_WAY_POINT_PATH_PLANNER__ROBOT_WIDTH_FOR_PATH_SIMPLICATION, oldRobotWidthForPathSimplication, robotWidthForPathSimplication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void printVerbose(String message) {
		System.out.println(this.getClass().getSimpleName() + " : " + message);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PathplannersGraphPackage.SIMPLE_DIRECTED_WEIGHTED_GRAPH_BASED_MESH_WAY_POINT_PATH_PLANNER__VERBOSE:
				return isVerbose();
			case PathplannersGraphPackage.SIMPLE_DIRECTED_WEIGHTED_GRAPH_BASED_MESH_WAY_POINT_PATH_PLANNER__SIMPLE_DIRECTED_WEIGHTED_GRAPH:
				return getSimpleDirectedWeightedGraph();
			case PathplannersGraphPackage.SIMPLE_DIRECTED_WEIGHTED_GRAPH_BASED_MESH_WAY_POINT_PATH_PLANNER__ENABLE_PATH_SIMPLIFICATION:
				return isEnablePathSimplification();
			case PathplannersGraphPackage.SIMPLE_DIRECTED_WEIGHTED_GRAPH_BASED_MESH_WAY_POINT_PATH_PLANNER__ROBOT_WIDTH_FOR_PATH_SIMPLICATION:
				return getRobotWidthForPathSimplication();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PathplannersGraphPackage.SIMPLE_DIRECTED_WEIGHTED_GRAPH_BASED_MESH_WAY_POINT_PATH_PLANNER__VERBOSE:
				setVerbose((Boolean)newValue);
				return;
			case PathplannersGraphPackage.SIMPLE_DIRECTED_WEIGHTED_GRAPH_BASED_MESH_WAY_POINT_PATH_PLANNER__SIMPLE_DIRECTED_WEIGHTED_GRAPH:
				setSimpleDirectedWeightedGraph((SimpleDirectedWeightedGraph)newValue);
				return;
			case PathplannersGraphPackage.SIMPLE_DIRECTED_WEIGHTED_GRAPH_BASED_MESH_WAY_POINT_PATH_PLANNER__ENABLE_PATH_SIMPLIFICATION:
				setEnablePathSimplification((Boolean)newValue);
				return;
			case PathplannersGraphPackage.SIMPLE_DIRECTED_WEIGHTED_GRAPH_BASED_MESH_WAY_POINT_PATH_PLANNER__ROBOT_WIDTH_FOR_PATH_SIMPLICATION:
				setRobotWidthForPathSimplication((Double)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PathplannersGraphPackage.SIMPLE_DIRECTED_WEIGHTED_GRAPH_BASED_MESH_WAY_POINT_PATH_PLANNER__VERBOSE:
				setVerbose(VERBOSE_EDEFAULT);
				return;
			case PathplannersGraphPackage.SIMPLE_DIRECTED_WEIGHTED_GRAPH_BASED_MESH_WAY_POINT_PATH_PLANNER__SIMPLE_DIRECTED_WEIGHTED_GRAPH:
				setSimpleDirectedWeightedGraph(SIMPLE_DIRECTED_WEIGHTED_GRAPH_EDEFAULT);
				return;
			case PathplannersGraphPackage.SIMPLE_DIRECTED_WEIGHTED_GRAPH_BASED_MESH_WAY_POINT_PATH_PLANNER__ENABLE_PATH_SIMPLIFICATION:
				setEnablePathSimplification(ENABLE_PATH_SIMPLIFICATION_EDEFAULT);
				return;
			case PathplannersGraphPackage.SIMPLE_DIRECTED_WEIGHTED_GRAPH_BASED_MESH_WAY_POINT_PATH_PLANNER__ROBOT_WIDTH_FOR_PATH_SIMPLICATION:
				setRobotWidthForPathSimplication(ROBOT_WIDTH_FOR_PATH_SIMPLICATION_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PathplannersGraphPackage.SIMPLE_DIRECTED_WEIGHTED_GRAPH_BASED_MESH_WAY_POINT_PATH_PLANNER__VERBOSE:
				return verbose != VERBOSE_EDEFAULT;
			case PathplannersGraphPackage.SIMPLE_DIRECTED_WEIGHTED_GRAPH_BASED_MESH_WAY_POINT_PATH_PLANNER__SIMPLE_DIRECTED_WEIGHTED_GRAPH:
				return SIMPLE_DIRECTED_WEIGHTED_GRAPH_EDEFAULT == null ? simpleDirectedWeightedGraph != null : !SIMPLE_DIRECTED_WEIGHTED_GRAPH_EDEFAULT.equals(simpleDirectedWeightedGraph);
			case PathplannersGraphPackage.SIMPLE_DIRECTED_WEIGHTED_GRAPH_BASED_MESH_WAY_POINT_PATH_PLANNER__ENABLE_PATH_SIMPLIFICATION:
				return enablePathSimplification != ENABLE_PATH_SIMPLIFICATION_EDEFAULT;
			case PathplannersGraphPackage.SIMPLE_DIRECTED_WEIGHTED_GRAPH_BASED_MESH_WAY_POINT_PATH_PLANNER__ROBOT_WIDTH_FOR_PATH_SIMPLICATION:
				return robotWidthForPathSimplication != ROBOT_WIDTH_FOR_PATH_SIMPLICATION_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == VerboseProvider.class) {
			switch (derivedFeatureID) {
				case PathplannersGraphPackage.SIMPLE_DIRECTED_WEIGHTED_GRAPH_BASED_MESH_WAY_POINT_PATH_PLANNER__VERBOSE: return ProcessorsPackage.VERBOSE_PROVIDER__VERBOSE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == VerboseProvider.class) {
			switch (baseFeatureID) {
				case ProcessorsPackage.VERBOSE_PROVIDER__VERBOSE: return PathplannersGraphPackage.SIMPLE_DIRECTED_WEIGHTED_GRAPH_BASED_MESH_WAY_POINT_PATH_PLANNER__VERBOSE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == VerboseProvider.class) {
			switch (baseOperationID) {
				case ProcessorsPackage.VERBOSE_PROVIDER___PRINT_VERBOSE__STRING: return PathplannersGraphPackage.SIMPLE_DIRECTED_WEIGHTED_GRAPH_BASED_MESH_WAY_POINT_PATH_PLANNER___PRINT_VERBOSE__STRING;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case PathplannersGraphPackage.SIMPLE_DIRECTED_WEIGHTED_GRAPH_BASED_MESH_WAY_POINT_PATH_PLANNER___PRINT_VERBOSE__STRING:
				printVerbose((String)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (verbose: ");
		result.append(verbose);
		result.append(", simpleDirectedWeightedGraph: ");
		result.append(simpleDirectedWeightedGraph);
		result.append(", enablePathSimplification: ");
		result.append(enablePathSimplification);
		result.append(", robotWidthForPathSimplication: ");
		result.append(robotWidthForPathSimplication);
		result.append(')');
		return result.toString();
	}
	
	@Override
	public WayPointPath plan(CartesianPositionCoordinates currentPosition, CartesianPositionCoordinates destinationPosition) throws Exception 
	{
		setCurrentPosition(currentPosition);
		setCurrentDestination(destinationPosition);
		
		Date start = new Date();
		WayPointPath path = PathsFactory.eINSTANCE.createWayPointPath();
				
		// Gets the polygon path.
		List<CartesianPolygon> polygonPath = null;
		polygonPath = getPolygonPath(currentPosition, destinationPosition);		
		
		// Generates the WayPointPath that goes through the polygon path.
		path = generatePath(currentPosition, destinationPosition, polygonPath);	
		Date end = new Date();
		
		double time = (end.getTime() - start.getTime()) / 1000.0;
		printVerbose("Planned path between (" + currentPosition.getX() + ", " + 
												currentPosition.getY() + ", " + 
												currentPosition.getZ() + ") and (" + 
												destinationPosition.getX() + ", " + 
												destinationPosition.getY() + ", " + 
												destinationPosition.getZ() + ") in " + time + " seconds.");
		
		return path;
	}
	
	@Override
	public WayPointPath process(CartesianCoordinatesSet input) throws Exception {
		
		// Need at least two points to plan a path.
		if(input.getPoints().size() < 2)
		{
			printVerbose("Needs to specify at least two points to plan a path ! Specified <" + input.getPoints().size() + "> points !");
			throw new Exception("Needs to specify at least two points to plan a path ! Specified <" + input.getPoints().size() + "> points !");
		}

		WayPointPath path = PathsFactory.eINSTANCE.createWayPointPath();
				
		try
		{
			// Plan a path segment between each of the points specified as inputs.
			getProgressMonitor().beginTask("Planning path.", input.getPoints().size() - 1);
			for(int i = 1; i < input.getPoints().size(); i++)
			{
				printVerbose("Planning between point[" +  (i -1) + "] and point [" + i + "]...");
				
				setCurrentPosition(input.getPoints().get(i-1));
				setCurrentDestination(input.getPoints().get(i));
				WayPointPath pathSegment = plan(getCurrentPosition(), getCurrentDestination());
				
				// Appends the current path segment to the overall path.
				path = PathUtilities.append(path, pathSegment, true);
				
				// Updates next start location to current destination.
				setCurrentPosition(getCurrentDestination());
				
				getProgressMonitor().worked(1);
				
				printVerbose("Planning between point[" +  (i -1) + "] and point [" + i + "] done.");
			}
			
			printVerbose("Planning completed.");			
		}
		finally
		{
			getProgressMonitor().done();
		}
		
		return path;
	}
	
	/**
	 * Create a SimpleDirectedWeightedGraph that represents the connectivity of a CartesianCoordinatesMesh.
	 * This method can be overiden to creates the graph differently.	 
	 * @return The SimpleDirectedWeightedGraph representing the polygon connectivity.	 
	 */
	protected SimpleDirectedWeightedGraph createGraph() throws Exception
	{
		printVerbose("Creating Graph...");
		if(getMesh() == null)
		{
			printVerbose("No mesh has been defined defined !");
			throw new Exception("No mesh has been defined defined !");
		}
		else if(getCostFunctions().size() == 0)
		{
			printVerbose("No cost function has been defined !");
			throw new Exception("No cost function has been defined !");
		}
		else
		{								
			printVerbose("Creating Graph using <" + getCostFunctions() + "> cost function(s)...");
						
			MobilityEdgeFactory edgeFactory = PathplannersGraphFactory.eINSTANCE.createMobilityEdgeFactory();
			edgeFactory.getCostFunctions().addAll(getCostFunctions());
			Date start = new Date();
			SimpleDirectedWeightedGraph tempGraph = GraphUtilities.createGraph(getMesh(), edgeFactory, null);
			Date end = new Date();	
			
			double time = (end.getTime() - start.getTime()) / 1000.0;
			printVerbose("Created Graph with " + tempGraph.vertexSet().size() + " vertices and " + tempGraph.edgeSet().size() + " edges in " + time + " seconds.");			
			return tempGraph;
		}
	}		
	
	/**
	 * Find the polygon on the mesh that is closest to the coordinates of the start point.
	 * @param startPositionCoordinates Coordinates of the start point.
	 * @return The CartesianPolygon to start from, null if none is found.
	 */
	protected CartesianPolygon getStartPolygon(CartesianPositionCoordinates startPositionCoordinates)
	{				
		printVerbose("getStartPolygon()...");
		CartesianPolygon start = null;
		
		SortedSet<CartesianPolygon> sortedPolygons =Geometry3dUtilities.sortCartesianPolygonByDistance(startPositionCoordinates, this.getMesh().getPolygons());
		
		if(sortedPolygons.size() > 0)
		{
			start = sortedPolygons.first();
		}
		printVerbose("getStartPolygon(). Done.");
		
		return start;
	}
	
	/**
	 * Find the polygon on the mesh that is closest to the coordinates of the destination point.
	 * @param endPositionCoordinates Coordinates of the end point.
	 * @return The CartesianPolygon to go to, null if none is found.
	 */
	protected CartesianPolygon getEndPolygon(CartesianPositionCoordinates endPositionCoordinates)
	{
		printVerbose("getEndPolygon()...");
		
		CartesianPolygon end = null;		
		SortedSet<CartesianPolygon> sortedPolygons = Geometry3dUtilities.sortCartesianPolygonByDistance(endPositionCoordinates, this.getMesh().getPolygons());
		
		if(sortedPolygons.size() > 0)
		{
			end = sortedPolygons.first();
		}
		printVerbose("getEndPolygon(). Done.");
		
		return end;
	}
	
	/**
	 * Gets the list of polygons that represents the safe path on the mesh.
	 * @return The list of safe polygons to travel on.
	 */
	protected List<CartesianPolygon> getPolygonPath(CartesianPositionCoordinates currentPosition, CartesianPositionCoordinates destinationPosition) throws Exception
	{
		List<CartesianPolygon> polygonPath = new ArrayList<CartesianPolygon>();
		
		// Gets the start and end polygon.
		CartesianPolygon startPolygon = getStartPolygon(currentPosition);
		CartesianPolygon endPolygon  = getEndPolygon(destinationPosition);
		
		if((startPolygon != null) || (endPolygon != null))
		{				
			printVerbose("Calling DijkstraShortestPath...");		
			List <MobilityEdge> edges = GraphUtilities.getDijkstraShortestPath(this.getSimpleDirectedWeightedGraph(), startPolygon, endPolygon);			
			double pathCost = GraphUtilities.getPathCost(edges);
			printVerbose("Calling DijkstraShortestPath done.");
			
			if(Double.isInfinite(pathCost))
			{
				printVerbose("Infinite cost Path.");
				throw(new Exception("Infinite cost Path."));
			}
			else
			{
				polygonPath = GraphUtilities.getPolygonPath(edges);
			}
		}
		else if(startPolygon == null)
		{
			printVerbose("Could not find a polygon for the start position !");
			throw(new Exception("Could not find a polygon for the start position !"));
		}
		else if(endPolygon == null)
		{
			printVerbose("Could not find a polygon for the destination position !");
			throw(new Exception("Could not find a polygon for the destination position !"));
		}
			
		
		return polygonPath;
	}
	
	/**
	 * Generates the actual WayPointPath using the list of polygons that represents the safe path on the mesh.
	 * @param polygonPath The list of safe polygons to travel on.
	 * @return The WayPointPath generated.
	 */
	protected WayPointPath generatePath(CartesianPositionCoordinates currentPosition, CartesianPositionCoordinates destinationPosition, List<CartesianPolygon> polygonPath)
	{
		WayPointPath path = null;
		
		if(isEnablePathSimplification())
		{
			path = GraphUtilities.getSimplifiedPathThroughPolygonsCentroid(CartesianPlane.XY, currentPosition, destinationPosition, polygonPath, getRobotWidthForPathSimplication());
		}
		else
		{
			path = GraphUtilities.getPathThroughPolygonsCentroid(polygonPath);
			
			// Adds the start and end points.
			path.getPoints().add(0, data3dFacade.createCartesianPositionCoordinates(currentPosition));
			path.getPoints().add(data3dFacade.createCartesianPositionCoordinates(destinationPosition));
		}
				
		return path;
	}	
	
	/**
	 * Saves the polygon path return from the search algorithm to a topology file for debugging.
	 * @param polygonPath THe polygon path.
	 * @param path The path of the folder where to save the data.
	 * @param fileName The file name to save the data to.
	 */
	@SuppressWarnings({ "unused", "unchecked" })
	private void savePolygonPath(List<CartesianTriangle> polygonPath, String path, String fileName)
	{
		TopologyFacade topologyFacade = TopologyFactory.eINSTANCE.createTopologyFacade();
				
		TransformNode root = topologyFacade.createTransformNodeXYZ(0, 0, 0, 0, 0, 0);						
		Mesh pathMesh = Data3dFacade.INSTANCE.createCartesianTriangularMesh(polygonPath);
						
		ContentNode<Mesh> pathNode = topologyFacade.createContentNode(pathMesh); 
		pathNode.setDescription("Polygon Path.");
		root.getChildren().add(pathNode);	
		
		// Saves the topology.
		System.out.println(" Saving polygon path...");
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.createResource(URI.createFileURI(path + File.separator + fileName + ""));
		resource.getContents().add(pathMesh);
		try
		{
			resource.save(Collections.EMPTY_MAP);
		} 
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Saved topology in : " + resource.getURI());
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void setMesh(Mesh newMesh)
	{
		eUnset(PathplannersGraphPackage.SIMPLE_DIRECTED_WEIGHTED_GRAPH_BASED_MESH_WAY_POINT_PATH_PLANNER__SIMPLE_DIRECTED_WEIGHTED_GRAPH);
		super.setMesh(newMesh);
	}
	
	/**
	 * Returns an Adapter that listens for change on the list of cost functions and UNSET the graph to for it to update.
	 * @return The adapter.
	 */
	private Adapter getCostFunctionsAdapter()
	{
		if(costFunctionsAdapter == null)
		{
			costFunctionsAdapter = new AdapterImpl()
			{
				@Override
				public void notifyChanged(Notification msg)
				{
					if(msg.getFeatureID(CostBasedMeshWayPointPathPlanner.class) == PathplannersGraphPackage.COST_BASED_MESH_WAY_POINT_PATH_PLANNER__COST_FUNCTIONS)
					{
						eUnset(PathplannersGraphPackage.SIMPLE_DIRECTED_WEIGHTED_GRAPH_BASED_MESH_WAY_POINT_PATH_PLANNER__SIMPLE_DIRECTED_WEIGHTED_GRAPH);
					}
				}
			};
		}
		
		return costFunctionsAdapter;
	}
} //SimpleDirectedWeightedGraphBasedMeshWayPointPathPlannerImpl
