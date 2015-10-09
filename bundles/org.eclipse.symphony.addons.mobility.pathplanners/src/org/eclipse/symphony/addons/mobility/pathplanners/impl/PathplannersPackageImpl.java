/**
 * Canadian Space Agency 2007.
 *
 * $Id: PathplannersPackageImpl.java,v 1.3.4.2 2015/05/21 15:50:52 pallard Exp $
 */
package org.eclipse.symphony.addons.mobility.pathplanners.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.symphony.addons.geometry.paths.PathsPackage;
import org.eclipse.symphony.addons.mobility.pathplanners.CircularExclusionZone;
import org.eclipse.symphony.addons.mobility.pathplanners.ExclusionZone;
import org.eclipse.symphony.addons.mobility.pathplanners.MeshWayPointPathPlanner;
import org.eclipse.symphony.addons.mobility.pathplanners.PathPlannersFacade;
import org.eclipse.symphony.addons.mobility.pathplanners.PathplannersFactory;
import org.eclipse.symphony.addons.mobility.pathplanners.PathplannersPackage;
import org.eclipse.symphony.addons.mobility.pathplanners.WayPointPathPlanner;
import org.eclipse.symphony.common.geometry.data.DataPackage;
import org.eclipse.symphony.common.geometry.data3d.Data3dPackage;
import org.eclipse.symphony.common.processors.ProcessorsPackage;
import org.eclipse.symphony.common.topology.TopologyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PathplannersPackageImpl extends EPackageImpl implements PathplannersPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Canadian Space Agency 2007.";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wayPointPathPlannerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass meshWayPointPathPlannerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exclusionZoneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass circularExclusionZoneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pathPlannersFacadeEClass = null;

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
	 * @see org.eclipse.symphony.addons.mobility.pathplanners.PathplannersPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PathplannersPackageImpl() {
		super(eNS_URI, PathplannersFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PathplannersPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PathplannersPackage init() {
		if (isInited) return (PathplannersPackage)EPackage.Registry.INSTANCE.getEPackage(PathplannersPackage.eNS_URI);

		// Obtain or create and register package
		PathplannersPackageImpl thePathplannersPackage = (PathplannersPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PathplannersPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PathplannersPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		PathsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thePathplannersPackage.createPackageContents();

		// Initialize created meta-data
		thePathplannersPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePathplannersPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PathplannersPackage.eNS_URI, thePathplannersPackage);
		return thePathplannersPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWayPointPathPlanner() {
		return wayPointPathPlannerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWayPointPathPlanner_CurrentDestination()
	{
		return (EReference)wayPointPathPlannerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWayPointPathPlanner_CurrentPosition()
	{
		return (EReference)wayPointPathPlannerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWayPointPathPlanner__Plan__CartesianPositionCoordinates_CartesianPositionCoordinates() {
		return wayPointPathPlannerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeshWayPointPathPlanner() {
		return meshWayPointPathPlannerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeshWayPointPathPlanner_Mesh() {
		return (EReference)meshWayPointPathPlannerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExclusionZone() {
		return exclusionZoneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusionZone__IsInside__CartesianPositionCoordinates() {
		return exclusionZoneEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusionZone__Intersects__CartesianPositionCoordinates_CartesianPositionCoordinates() {
		return exclusionZoneEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCircularExclusionZone() {
		return circularExclusionZoneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCircularExclusionZone_Radius() {
		return (EAttribute)circularExclusionZoneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCircularExclusionZone_InvertSamplingShape() {
		return (EAttribute)circularExclusionZoneEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPathPlannersFacade() {
		return pathPlannersFacadeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPathPlannersFacade__CreateCircularExclusionZone__double_GroupNode() {
		return pathPlannersFacadeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathplannersFactory getPathplannersFactory() {
		return (PathplannersFactory)getEFactoryInstance();
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
		wayPointPathPlannerEClass = createEClass(WAY_POINT_PATH_PLANNER);
		createEReference(wayPointPathPlannerEClass, WAY_POINT_PATH_PLANNER__CURRENT_DESTINATION);
		createEReference(wayPointPathPlannerEClass, WAY_POINT_PATH_PLANNER__CURRENT_POSITION);
		createEOperation(wayPointPathPlannerEClass, WAY_POINT_PATH_PLANNER___PLAN__CARTESIANPOSITIONCOORDINATES_CARTESIANPOSITIONCOORDINATES);

		meshWayPointPathPlannerEClass = createEClass(MESH_WAY_POINT_PATH_PLANNER);
		createEReference(meshWayPointPathPlannerEClass, MESH_WAY_POINT_PATH_PLANNER__MESH);

		exclusionZoneEClass = createEClass(EXCLUSION_ZONE);
		createEOperation(exclusionZoneEClass, EXCLUSION_ZONE___IS_INSIDE__CARTESIANPOSITIONCOORDINATES);
		createEOperation(exclusionZoneEClass, EXCLUSION_ZONE___INTERSECTS__CARTESIANPOSITIONCOORDINATES_CARTESIANPOSITIONCOORDINATES);

		circularExclusionZoneEClass = createEClass(CIRCULAR_EXCLUSION_ZONE);
		createEAttribute(circularExclusionZoneEClass, CIRCULAR_EXCLUSION_ZONE__RADIUS);
		createEAttribute(circularExclusionZoneEClass, CIRCULAR_EXCLUSION_ZONE__INVERT_SAMPLING_SHAPE);

		pathPlannersFacadeEClass = createEClass(PATH_PLANNERS_FACADE);
		createEOperation(pathPlannersFacadeEClass, PATH_PLANNERS_FACADE___CREATE_CIRCULAR_EXCLUSION_ZONE__DOUBLE_GROUPNODE);
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
		ProcessorsPackage theProcessorsPackage = (ProcessorsPackage)EPackage.Registry.INSTANCE.getEPackage(ProcessorsPackage.eNS_URI);
		Data3dPackage theData3dPackage = (Data3dPackage)EPackage.Registry.INSTANCE.getEPackage(Data3dPackage.eNS_URI);
		PathsPackage thePathsPackage = (PathsPackage)EPackage.Registry.INSTANCE.getEPackage(PathsPackage.eNS_URI);
		DataPackage theDataPackage = (DataPackage)EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI);
		TopologyPackage theTopologyPackage = (TopologyPackage)EPackage.Registry.INSTANCE.getEPackage(TopologyPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters
		ETypeParameter meshWayPointPathPlannerEClass_T = addETypeParameter(meshWayPointPathPlannerEClass, "T");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(theData3dPackage.getCartesianPolygon());
		meshWayPointPathPlannerEClass_T.getEBounds().add(g1);

		// Add supertypes to classes
		g1 = createEGenericType(theProcessorsPackage.getProcessor());
		EGenericType g2 = createEGenericType(theData3dPackage.getCartesianCoordinatesSet());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(thePathsPackage.getWayPointPath());
		g1.getETypeArguments().add(g2);
		wayPointPathPlannerEClass.getEGenericSuperTypes().add(g1);
		meshWayPointPathPlannerEClass.getESuperTypes().add(this.getWayPointPathPlanner());
		exclusionZoneEClass.getESuperTypes().add(theTopologyPackage.getNode());
		g1 = createEGenericType(this.getExclusionZone());
		circularExclusionZoneEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theDataPackage.getCoordinatesSamplingShape());
		g2 = createEGenericType(theData3dPackage.getCartesianPositionCoordinates());
		g1.getETypeArguments().add(g2);
		circularExclusionZoneEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theDataPackage.getPolygonSamplingShape());
		g2 = createEGenericType(theData3dPackage.getCartesianPositionCoordinates());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(theData3dPackage.getCartesianTriangle());
		g1.getETypeArguments().add(g2);
		circularExclusionZoneEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes, features, and operations; add parameters
		initEClass(wayPointPathPlannerEClass, WayPointPathPlanner.class, "WayPointPathPlanner", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWayPointPathPlanner_CurrentDestination(), theData3dPackage.getCartesianPositionCoordinates(), null, "currentDestination", null, 0, 1, WayPointPathPlanner.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWayPointPathPlanner_CurrentPosition(), theData3dPackage.getCartesianPositionCoordinates(), null, "currentPosition", null, 0, 1, WayPointPathPlanner.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getWayPointPathPlanner__Plan__CartesianPositionCoordinates_CartesianPositionCoordinates(), thePathsPackage.getWayPointPath(), "plan", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theData3dPackage.getCartesianPositionCoordinates(), "currentPosition", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theData3dPackage.getCartesianPositionCoordinates(), "destinationPosition", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theProcessorsPackage.getException());

		initEClass(meshWayPointPathPlannerEClass, MeshWayPointPathPlanner.class, "MeshWayPointPathPlanner", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(theDataPackage.getMesh());
		g2 = createEGenericType(theData3dPackage.getCartesianPositionCoordinates());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(theData3dPackage.getCartesianPolygon());
		g1.getETypeArguments().add(g2);
		initEReference(getMeshWayPointPathPlanner_Mesh(), g1, null, "mesh", null, 0, 1, MeshWayPointPathPlanner.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exclusionZoneEClass, ExclusionZone.class, "ExclusionZone", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getExclusionZone__IsInside__CartesianPositionCoordinates(), theEcorePackage.getEBoolean(), "isInside", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theData3dPackage.getCartesianPositionCoordinates(), "point", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExclusionZone__Intersects__CartesianPositionCoordinates_CartesianPositionCoordinates(), theEcorePackage.getEBoolean(), "intersects", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theData3dPackage.getCartesianPositionCoordinates(), "from", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theData3dPackage.getCartesianPositionCoordinates(), "to", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(circularExclusionZoneEClass, CircularExclusionZone.class, "CircularExclusionZone", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCircularExclusionZone_Radius(), theEcorePackage.getEDouble(), "radius", null, 1, 1, CircularExclusionZone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCircularExclusionZone_InvertSamplingShape(), theEcorePackage.getEBoolean(), "invertSamplingShape", "false", 0, 1, CircularExclusionZone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pathPlannersFacadeEClass, PathPlannersFacade.class, "PathPlannersFacade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getPathPlannersFacade__CreateCircularExclusionZone__double_GroupNode(), this.getCircularExclusionZone(), "createCircularExclusionZone", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "radius", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTopologyPackage.getGroupNode(), "parent", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //PathplannersPackageImpl
