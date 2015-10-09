/**
 * Canadian Space Agency 2008.
 *
 * $Id: PathplannersGraphPackageImpl.java,v 1.3.4.3 2015/09/22 19:39:37 rlarcheveque Exp $
 */
package ca.gc.space.mrt.mobility.pathplanners.graph.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.symphony.common.geometry.data3d.Data3dPackage;
import org.jgrapht.DirectedGraph;
import org.jgrapht.EdgeFactory;
import org.jgrapht.graph.SimpleDirectedWeightedGraph;

import ca.gc.space.mrt.common.processors.ProcessorsPackage;
import ca.gc.space.mrt.mobility.pathplanners.PathplannersPackage;
import ca.gc.space.mrt.mobility.pathplanners.graph.CostBasedMeshWayPointPathPlanner;
import ca.gc.space.mrt.mobility.pathplanners.graph.DirectedGraphBasedMeshWayPointPathPlanner;
import ca.gc.space.mrt.mobility.pathplanners.graph.DisplacementCostFunction;
import ca.gc.space.mrt.mobility.pathplanners.graph.DistanceAndRoverFootprintCostFunction;
import ca.gc.space.mrt.mobility.pathplanners.graph.DistanceAndSlopesCostFunction;
import ca.gc.space.mrt.mobility.pathplanners.graph.DistanceOnlyCostFunction;
import ca.gc.space.mrt.mobility.pathplanners.graph.ExclusionZonesCostFunction;
import ca.gc.space.mrt.mobility.pathplanners.graph.MeshDisplacementCostFunction;
import ca.gc.space.mrt.mobility.pathplanners.graph.MobilityEdge;
import ca.gc.space.mrt.mobility.pathplanners.graph.MobilityEdgeFactory;
import ca.gc.space.mrt.mobility.pathplanners.graph.PathplannersGraphFactory;
import ca.gc.space.mrt.mobility.pathplanners.graph.PathplannersGraphPackage;
import ca.gc.space.mrt.mobility.pathplanners.graph.SimpleDirectedWeightedGraphBasedMeshWayPointPathPlanner;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PathplannersGraphPackageImpl extends EPackageImpl implements PathplannersGraphPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Canadian Space Agency 2008.";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass costBasedMeshWayPointPathPlannerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass meshDisplacementCostFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass distanceOnlyCostFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleDirectedWeightedGraphBasedMeshWayPointPathPlannerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mobilityEdgeFactoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass directedGraphBasedMeshWayPointPathPlannerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass edgeFactoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mobilityEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass distanceAndSlopesCostFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exclusionZonesCostFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass displacementCostFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass distanceAndRoverFootprintCostFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType simpleDirectedWeightedGraphEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType directedGraphEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ca.gc.space.mrt.mobility.pathplanners.graph.PathplannersGraphPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PathplannersGraphPackageImpl() {
		super(eNS_URI, PathplannersGraphFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link PathplannersGraphPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PathplannersGraphPackage init() {
		if (isInited) return (PathplannersGraphPackage)EPackage.Registry.INSTANCE.getEPackage(PathplannersGraphPackage.eNS_URI);

		// Obtain or create and register package
		PathplannersGraphPackageImpl thePathplannersGraphPackage = (PathplannersGraphPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PathplannersGraphPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PathplannersGraphPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		PathplannersPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thePathplannersGraphPackage.createPackageContents();

		// Initialize created meta-data
		thePathplannersGraphPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePathplannersGraphPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PathplannersGraphPackage.eNS_URI, thePathplannersGraphPackage);
		return thePathplannersGraphPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCostBasedMeshWayPointPathPlanner() {
		return costBasedMeshWayPointPathPlannerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCostBasedMeshWayPointPathPlanner_CostFunctions() {
		return (EReference)costBasedMeshWayPointPathPlannerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeshDisplacementCostFunction() {
		return meshDisplacementCostFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeshDisplacementCostFunction_Planner() {
		return (EReference)meshDisplacementCostFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDistanceOnlyCostFunction() {
		return distanceOnlyCostFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleDirectedWeightedGraphBasedMeshWayPointPathPlanner() {
		return simpleDirectedWeightedGraphBasedMeshWayPointPathPlannerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleDirectedWeightedGraphBasedMeshWayPointPathPlanner_SimpleDirectedWeightedGraph() {
		return (EAttribute)simpleDirectedWeightedGraphBasedMeshWayPointPathPlannerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleDirectedWeightedGraphBasedMeshWayPointPathPlanner_EnablePathSimplification()
	{
		return (EAttribute)simpleDirectedWeightedGraphBasedMeshWayPointPathPlannerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleDirectedWeightedGraphBasedMeshWayPointPathPlanner_RobotWidthForPathSimplication()
	{
		return (EAttribute)simpleDirectedWeightedGraphBasedMeshWayPointPathPlannerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMobilityEdgeFactory() {
		return mobilityEdgeFactoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMobilityEdgeFactory_CostFunctions() {
		return (EReference)mobilityEdgeFactoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDirectedGraphBasedMeshWayPointPathPlanner() {
		return directedGraphBasedMeshWayPointPathPlannerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirectedGraphBasedMeshWayPointPathPlanner_DirectedGraph() {
		return (EAttribute)directedGraphBasedMeshWayPointPathPlannerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSimpleDirectedWeightedGraph() {
		return simpleDirectedWeightedGraphEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEdgeFactory() {
		return edgeFactoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMobilityEdge() {
		return mobilityEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMobilityEdge_CostFunctions() {
		return (EReference)mobilityEdgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMobilityEdge_From() {
		return (EReference)mobilityEdgeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMobilityEdge_To() {
		return (EReference)mobilityEdgeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobilityEdge_Weight() {
		return (EAttribute)mobilityEdgeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDistanceAndSlopesCostFunction() {
		return distanceAndSlopesCostFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDistanceAndSlopesCostFunction_UpSlopeCostFactor() {
		return (EAttribute)distanceAndSlopesCostFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDistanceAndSlopesCostFunction_DownSlopeCostFactor() {
		return (EAttribute)distanceAndSlopesCostFunctionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDistanceAndSlopesCostFunction_GravityAxis() {
		return (EAttribute)distanceAndSlopesCostFunctionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDistanceAndSlopesCostFunction_MaximumUpSlope() {
		return (EAttribute)distanceAndSlopesCostFunctionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDistanceAndSlopesCostFunction_MaximumDownSlope() {
		return (EAttribute)distanceAndSlopesCostFunctionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExclusionZonesCostFunction() {
		return exclusionZonesCostFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExclusionZonesCostFunction_ExclusionZones() {
		return (EReference)exclusionZonesCostFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDisplacementCostFunction() {
		return displacementCostFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDisplacementCostFunction__GetCost__CartesianPolygon_CartesianPolygon() {
		return displacementCostFunctionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDistanceAndRoverFootprintCostFunction()
	{
		return distanceAndRoverFootprintCostFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDistanceAndRoverFootprintCostFunction_RoverFootPrintRadius()
	{
		return (EAttribute)distanceAndRoverFootprintCostFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDistanceAndRoverFootprintCostFunction_MaximumRoughness()
	{
		return (EAttribute)distanceAndRoverFootprintCostFunctionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDistanceAndRoverFootprintCostFunction_MaximumCrossSlope()
	{
		return (EAttribute)distanceAndRoverFootprintCostFunctionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDirectedGraph() {
		return directedGraphEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathplannersGraphFactory getPathplannersGraphFactory() {
		return (PathplannersGraphFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		costBasedMeshWayPointPathPlannerEClass = createEClass(COST_BASED_MESH_WAY_POINT_PATH_PLANNER);
		createEReference(costBasedMeshWayPointPathPlannerEClass, COST_BASED_MESH_WAY_POINT_PATH_PLANNER__COST_FUNCTIONS);

		meshDisplacementCostFunctionEClass = createEClass(MESH_DISPLACEMENT_COST_FUNCTION);
		createEReference(meshDisplacementCostFunctionEClass, MESH_DISPLACEMENT_COST_FUNCTION__PLANNER);

		distanceOnlyCostFunctionEClass = createEClass(DISTANCE_ONLY_COST_FUNCTION);

		simpleDirectedWeightedGraphBasedMeshWayPointPathPlannerEClass = createEClass(SIMPLE_DIRECTED_WEIGHTED_GRAPH_BASED_MESH_WAY_POINT_PATH_PLANNER);
		createEAttribute(simpleDirectedWeightedGraphBasedMeshWayPointPathPlannerEClass, SIMPLE_DIRECTED_WEIGHTED_GRAPH_BASED_MESH_WAY_POINT_PATH_PLANNER__SIMPLE_DIRECTED_WEIGHTED_GRAPH);
		createEAttribute(simpleDirectedWeightedGraphBasedMeshWayPointPathPlannerEClass, SIMPLE_DIRECTED_WEIGHTED_GRAPH_BASED_MESH_WAY_POINT_PATH_PLANNER__ENABLE_PATH_SIMPLIFICATION);
		createEAttribute(simpleDirectedWeightedGraphBasedMeshWayPointPathPlannerEClass, SIMPLE_DIRECTED_WEIGHTED_GRAPH_BASED_MESH_WAY_POINT_PATH_PLANNER__ROBOT_WIDTH_FOR_PATH_SIMPLICATION);

		directedGraphBasedMeshWayPointPathPlannerEClass = createEClass(DIRECTED_GRAPH_BASED_MESH_WAY_POINT_PATH_PLANNER);
		createEAttribute(directedGraphBasedMeshWayPointPathPlannerEClass, DIRECTED_GRAPH_BASED_MESH_WAY_POINT_PATH_PLANNER__DIRECTED_GRAPH);

		edgeFactoryEClass = createEClass(EDGE_FACTORY);

		mobilityEdgeEClass = createEClass(MOBILITY_EDGE);
		createEReference(mobilityEdgeEClass, MOBILITY_EDGE__COST_FUNCTIONS);
		createEReference(mobilityEdgeEClass, MOBILITY_EDGE__FROM);
		createEReference(mobilityEdgeEClass, MOBILITY_EDGE__TO);
		createEAttribute(mobilityEdgeEClass, MOBILITY_EDGE__WEIGHT);

		mobilityEdgeFactoryEClass = createEClass(MOBILITY_EDGE_FACTORY);
		createEReference(mobilityEdgeFactoryEClass, MOBILITY_EDGE_FACTORY__COST_FUNCTIONS);

		distanceAndSlopesCostFunctionEClass = createEClass(DISTANCE_AND_SLOPES_COST_FUNCTION);
		createEAttribute(distanceAndSlopesCostFunctionEClass, DISTANCE_AND_SLOPES_COST_FUNCTION__UP_SLOPE_COST_FACTOR);
		createEAttribute(distanceAndSlopesCostFunctionEClass, DISTANCE_AND_SLOPES_COST_FUNCTION__DOWN_SLOPE_COST_FACTOR);
		createEAttribute(distanceAndSlopesCostFunctionEClass, DISTANCE_AND_SLOPES_COST_FUNCTION__GRAVITY_AXIS);
		createEAttribute(distanceAndSlopesCostFunctionEClass, DISTANCE_AND_SLOPES_COST_FUNCTION__MAXIMUM_UP_SLOPE);
		createEAttribute(distanceAndSlopesCostFunctionEClass, DISTANCE_AND_SLOPES_COST_FUNCTION__MAXIMUM_DOWN_SLOPE);

		exclusionZonesCostFunctionEClass = createEClass(EXCLUSION_ZONES_COST_FUNCTION);
		createEReference(exclusionZonesCostFunctionEClass, EXCLUSION_ZONES_COST_FUNCTION__EXCLUSION_ZONES);

		displacementCostFunctionEClass = createEClass(DISPLACEMENT_COST_FUNCTION);
		createEOperation(displacementCostFunctionEClass, DISPLACEMENT_COST_FUNCTION___GET_COST__CARTESIANPOLYGON_CARTESIANPOLYGON);

		distanceAndRoverFootprintCostFunctionEClass = createEClass(DISTANCE_AND_ROVER_FOOTPRINT_COST_FUNCTION);
		createEAttribute(distanceAndRoverFootprintCostFunctionEClass, DISTANCE_AND_ROVER_FOOTPRINT_COST_FUNCTION__ROVER_FOOT_PRINT_RADIUS);
		createEAttribute(distanceAndRoverFootprintCostFunctionEClass, DISTANCE_AND_ROVER_FOOTPRINT_COST_FUNCTION__MAXIMUM_ROUGHNESS);
		createEAttribute(distanceAndRoverFootprintCostFunctionEClass, DISTANCE_AND_ROVER_FOOTPRINT_COST_FUNCTION__MAXIMUM_CROSS_SLOPE);

		// Create data types
		simpleDirectedWeightedGraphEDataType = createEDataType(SIMPLE_DIRECTED_WEIGHTED_GRAPH);
		directedGraphEDataType = createEDataType(DIRECTED_GRAPH);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		Data3dPackage theData3dPackage = (Data3dPackage)EPackage.Registry.INSTANCE.getEPackage(Data3dPackage.eNS_URI);
		PathplannersPackage thePathplannersPackage = (PathplannersPackage)EPackage.Registry.INSTANCE.getEPackage(PathplannersPackage.eNS_URI);
		ProcessorsPackage theProcessorsPackage = (ProcessorsPackage)EPackage.Registry.INSTANCE.getEPackage(ProcessorsPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters
		ETypeParameter costBasedMeshWayPointPathPlannerEClass_PolygonType = addETypeParameter(costBasedMeshWayPointPathPlannerEClass, "PolygonType");
		ETypeParameter simpleDirectedWeightedGraphBasedMeshWayPointPathPlannerEClass_PolygonType = addETypeParameter(simpleDirectedWeightedGraphBasedMeshWayPointPathPlannerEClass, "PolygonType");
		ETypeParameter directedGraphBasedMeshWayPointPathPlannerEClass_PolygonType = addETypeParameter(directedGraphBasedMeshWayPointPathPlannerEClass, "PolygonType");
		addETypeParameter(edgeFactoryEClass, "V");
		addETypeParameter(edgeFactoryEClass, "E");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(theData3dPackage.getCartesianPolygon());
		costBasedMeshWayPointPathPlannerEClass_PolygonType.getEBounds().add(g1);
		g1 = createEGenericType(theData3dPackage.getCartesianPolygon());
		simpleDirectedWeightedGraphBasedMeshWayPointPathPlannerEClass_PolygonType.getEBounds().add(g1);
		g1 = createEGenericType(theData3dPackage.getCartesianPolygon());
		directedGraphBasedMeshWayPointPathPlannerEClass_PolygonType.getEBounds().add(g1);

		// Add supertypes to classes
		g1 = createEGenericType(thePathplannersPackage.getMeshWayPointPathPlanner());
		EGenericType g2 = createEGenericType(costBasedMeshWayPointPathPlannerEClass_PolygonType);
		g1.getETypeArguments().add(g2);
		costBasedMeshWayPointPathPlannerEClass.getEGenericSuperTypes().add(g1);
		meshDisplacementCostFunctionEClass.getESuperTypes().add(this.getDisplacementCostFunction());
		distanceOnlyCostFunctionEClass.getESuperTypes().add(this.getMeshDisplacementCostFunction());
		g1 = createEGenericType(this.getCostBasedMeshWayPointPathPlanner());
		g2 = createEGenericType(simpleDirectedWeightedGraphBasedMeshWayPointPathPlannerEClass_PolygonType);
		g1.getETypeArguments().add(g2);
		simpleDirectedWeightedGraphBasedMeshWayPointPathPlannerEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theProcessorsPackage.getVerboseProvider());
		simpleDirectedWeightedGraphBasedMeshWayPointPathPlannerEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getCostBasedMeshWayPointPathPlanner());
		g2 = createEGenericType(directedGraphBasedMeshWayPointPathPlannerEClass_PolygonType);
		g1.getETypeArguments().add(g2);
		directedGraphBasedMeshWayPointPathPlannerEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getEdgeFactory());
		g2 = createEGenericType(theData3dPackage.getCartesianPolygon());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getMobilityEdge());
		g1.getETypeArguments().add(g2);
		mobilityEdgeFactoryEClass.getEGenericSuperTypes().add(g1);
		distanceAndSlopesCostFunctionEClass.getESuperTypes().add(this.getMeshDisplacementCostFunction());
		exclusionZonesCostFunctionEClass.getESuperTypes().add(this.getDisplacementCostFunction());
		distanceAndRoverFootprintCostFunctionEClass.getESuperTypes().add(this.getDistanceAndSlopesCostFunction());

		// Initialize classes, features, and operations; add parameters
		initEClass(costBasedMeshWayPointPathPlannerEClass, CostBasedMeshWayPointPathPlanner.class, "CostBasedMeshWayPointPathPlanner", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCostBasedMeshWayPointPathPlanner_CostFunctions(), this.getDisplacementCostFunction(), null, "costFunctions", null, 0, -1, CostBasedMeshWayPointPathPlanner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(meshDisplacementCostFunctionEClass, MeshDisplacementCostFunction.class, "MeshDisplacementCostFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(this.getCostBasedMeshWayPointPathPlanner());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		EGenericType g3 = createEGenericType(theData3dPackage.getCartesianPolygon());
		g2.setEUpperBound(g3);
		initEReference(getMeshDisplacementCostFunction_Planner(), g1, null, "planner", null, 0, 1, MeshDisplacementCostFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(distanceOnlyCostFunctionEClass, DistanceOnlyCostFunction.class, "DistanceOnlyCostFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(simpleDirectedWeightedGraphBasedMeshWayPointPathPlannerEClass, SimpleDirectedWeightedGraphBasedMeshWayPointPathPlanner.class, "SimpleDirectedWeightedGraphBasedMeshWayPointPathPlanner", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimpleDirectedWeightedGraphBasedMeshWayPointPathPlanner_SimpleDirectedWeightedGraph(), this.getSimpleDirectedWeightedGraph(), "simpleDirectedWeightedGraph", null, 0, 1, SimpleDirectedWeightedGraphBasedMeshWayPointPathPlanner.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleDirectedWeightedGraphBasedMeshWayPointPathPlanner_EnablePathSimplification(), theEcorePackage.getEBoolean(), "enablePathSimplification", "true", 0, 1, SimpleDirectedWeightedGraphBasedMeshWayPointPathPlanner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleDirectedWeightedGraphBasedMeshWayPointPathPlanner_RobotWidthForPathSimplication(), theEcorePackage.getEDouble(), "robotWidthForPathSimplication", "0.5", 0, 1, SimpleDirectedWeightedGraphBasedMeshWayPointPathPlanner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(directedGraphBasedMeshWayPointPathPlannerEClass, DirectedGraphBasedMeshWayPointPathPlanner.class, "DirectedGraphBasedMeshWayPointPathPlanner", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDirectedGraphBasedMeshWayPointPathPlanner_DirectedGraph(), this.getDirectedGraph(), "directedGraph", null, 0, 1, DirectedGraphBasedMeshWayPointPathPlanner.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(edgeFactoryEClass, EdgeFactory.class, "EdgeFactory", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(mobilityEdgeEClass, MobilityEdge.class, "MobilityEdge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMobilityEdge_CostFunctions(), this.getDisplacementCostFunction(), null, "costFunctions", null, 0, -1, MobilityEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMobilityEdge_From(), theData3dPackage.getCartesianPolygon(), null, "from", null, 0, 1, MobilityEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMobilityEdge_To(), theData3dPackage.getCartesianPolygon(), null, "to", null, 0, 1, MobilityEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMobilityEdge_Weight(), theEcorePackage.getEDouble(), "weight", null, 0, 1, MobilityEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(mobilityEdgeFactoryEClass, MobilityEdgeFactory.class, "MobilityEdgeFactory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMobilityEdgeFactory_CostFunctions(), this.getDisplacementCostFunction(), null, "costFunctions", null, 0, -1, MobilityEdgeFactory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(distanceAndSlopesCostFunctionEClass, DistanceAndSlopesCostFunction.class, "DistanceAndSlopesCostFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDistanceAndSlopesCostFunction_UpSlopeCostFactor(), theEcorePackage.getEDouble(), "upSlopeCostFactor", "1", 0, 1, DistanceAndSlopesCostFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDistanceAndSlopesCostFunction_DownSlopeCostFactor(), theEcorePackage.getEDouble(), "downSlopeCostFactor", "1", 0, 1, DistanceAndSlopesCostFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDistanceAndSlopesCostFunction_GravityAxis(), theData3dPackage.getCartesianAxis(), "gravityAxis", "Z", 0, 1, DistanceAndSlopesCostFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDistanceAndSlopesCostFunction_MaximumUpSlope(), theEcorePackage.getEDouble(), "maximumUpSlope", "0.33", 0, 1, DistanceAndSlopesCostFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDistanceAndSlopesCostFunction_MaximumDownSlope(), theEcorePackage.getEDouble(), "maximumDownSlope", "0.33", 0, 1, DistanceAndSlopesCostFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exclusionZonesCostFunctionEClass, ExclusionZonesCostFunction.class, "ExclusionZonesCostFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExclusionZonesCostFunction_ExclusionZones(), thePathplannersPackage.getExclusionZone(), null, "exclusionZones", null, 0, -1, ExclusionZonesCostFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(displacementCostFunctionEClass, DisplacementCostFunction.class, "DisplacementCostFunction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getDisplacementCostFunction__GetCost__CartesianPolygon_CartesianPolygon(), theEcorePackage.getEDouble(), "getCost", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theData3dPackage.getCartesianPolygon(), "from", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theData3dPackage.getCartesianPolygon(), "to", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(distanceAndRoverFootprintCostFunctionEClass, DistanceAndRoverFootprintCostFunction.class, "DistanceAndRoverFootprintCostFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDistanceAndRoverFootprintCostFunction_RoverFootPrintRadius(), theEcorePackage.getEDouble(), "roverFootPrintRadius", "0.5", 0, 1, DistanceAndRoverFootprintCostFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDistanceAndRoverFootprintCostFunction_MaximumRoughness(), theEcorePackage.getEDouble(), "maximumRoughness", "0.1", 0, 1, DistanceAndRoverFootprintCostFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDistanceAndRoverFootprintCostFunction_MaximumCrossSlope(), theEcorePackage.getEDouble(), "maximumCrossSlope", "0.488", 0, 1, DistanceAndRoverFootprintCostFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(simpleDirectedWeightedGraphEDataType, SimpleDirectedWeightedGraph.class, "SimpleDirectedWeightedGraph", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(directedGraphEDataType, DirectedGraph.class, "DirectedGraph", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //PathplannersGraphPackageImpl
