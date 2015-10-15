/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.addons.geometry.paths.impl;

import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.symphony.addons.geometry.paths.CatmullRomWayPointPathInterpolator;
import org.eclipse.symphony.addons.geometry.paths.MinimumDistanceFilter;
import org.eclipse.symphony.addons.geometry.paths.Path;
import org.eclipse.symphony.addons.geometry.paths.PathsFacade;
import org.eclipse.symphony.addons.geometry.paths.PathsFactory;
import org.eclipse.symphony.addons.geometry.paths.PathsPackage;
import org.eclipse.symphony.addons.geometry.paths.SegmentWayPointPathInterpolator;
import org.eclipse.symphony.addons.geometry.paths.SplineEndControlPointGenerationMode;
import org.eclipse.symphony.addons.geometry.paths.UniformDistanceWayPointPathInterpolator;
import org.eclipse.symphony.addons.geometry.paths.WayPoint;
import org.eclipse.symphony.addons.geometry.paths.WayPointPath;
import org.eclipse.symphony.addons.geometry.paths.WayPointPathFilter;
import org.eclipse.symphony.addons.geometry.paths.WayPointPathInterpolator;

import org.eclipse.symphony.common.geometry.data3d.Data3dPackage;

import org.eclipse.symphony.common.processors.ProcessorsPackage;

import org.eclipse.symphony.common.topology.TopologyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PathsPackageImpl extends EPackageImpl implements PathsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wayPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pathEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wayPointPathEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wayPointPathInterpolatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass catmullRomWayPointPathInterpolatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass segmentWayPointPathInterpolatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wayPointPathFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass minimumDistanceFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uniformDistanceWayPointPathInterpolatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pathsFacadeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum splineEndControlPointGenerationModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType listEDataType = null;

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
	 * @see org.eclipse.symphony.addons.geometry.paths.PathsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PathsPackageImpl() {
		super(eNS_URI, PathsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PathsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PathsPackage init() {
		if (isInited) return (PathsPackage)EPackage.Registry.INSTANCE.getEPackage(PathsPackage.eNS_URI);

		// Obtain or create and register package
		PathsPackageImpl thePathsPackage = (PathsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PathsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PathsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TopologyPackage.eINSTANCE.eClass();
		Data3dPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thePathsPackage.createPackageContents();

		// Initialize created meta-data
		thePathsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePathsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PathsPackage.eNS_URI, thePathsPackage);
		return thePathsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWayPoint() {
		return wayPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPath() {
		return pathEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWayPointPath() {
		return wayPointPathEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWayPointPath_Length() {
		return (EAttribute)wayPointPathEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWayPointPath__GetStartPoint() {
		return wayPointPathEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWayPointPath__GetEndPoint() {
		return wayPointPathEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWayPointPathInterpolator() {
		return wayPointPathInterpolatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCatmullRomWayPointPathInterpolator() {
		return catmullRomWayPointPathInterpolatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCatmullRomWayPointPathInterpolator_Tension() {
		return (EAttribute)catmullRomWayPointPathInterpolatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCatmullRomWayPointPathInterpolator_MaximumWayPointsDistance() {
		return (EAttribute)catmullRomWayPointPathInterpolatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCatmullRomWayPointPathInterpolator_EndControlPointGenerationMode() {
		return (EAttribute)catmullRomWayPointPathInterpolatorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSegmentWayPointPathInterpolator() {
		return segmentWayPointPathInterpolatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSegmentWayPointPathInterpolator_MaximumDistanceInterval() {
		return (EAttribute)segmentWayPointPathInterpolatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWayPointPathFilter() {
		return wayPointPathFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMinimumDistanceFilter() {
		return minimumDistanceFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMinimumDistanceFilter_MinimumDistance() {
		return (EAttribute)minimumDistanceFilterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUniformDistanceWayPointPathInterpolator() {
		return uniformDistanceWayPointPathInterpolatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUniformDistanceWayPointPathInterpolator_DistanceInterval() {
		return (EAttribute)uniformDistanceWayPointPathInterpolatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPathsFacade() {
		return pathsFacadeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPathsFacade__CreateWayPointPath__WayPointPath() {
		return pathsFacadeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPathsFacade__CreateWayPointPath__List() {
		return pathsFacadeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSplineEndControlPointGenerationMode() {
		return splineEndControlPointGenerationModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getList() {
		return listEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathsFactory getPathsFactory() {
		return (PathsFactory)getEFactoryInstance();
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
		wayPointEClass = createEClass(WAY_POINT);

		pathEClass = createEClass(PATH);

		wayPointPathEClass = createEClass(WAY_POINT_PATH);
		createEAttribute(wayPointPathEClass, WAY_POINT_PATH__LENGTH);
		createEOperation(wayPointPathEClass, WAY_POINT_PATH___GET_START_POINT);
		createEOperation(wayPointPathEClass, WAY_POINT_PATH___GET_END_POINT);

		wayPointPathInterpolatorEClass = createEClass(WAY_POINT_PATH_INTERPOLATOR);

		catmullRomWayPointPathInterpolatorEClass = createEClass(CATMULL_ROM_WAY_POINT_PATH_INTERPOLATOR);
		createEAttribute(catmullRomWayPointPathInterpolatorEClass, CATMULL_ROM_WAY_POINT_PATH_INTERPOLATOR__TENSION);
		createEAttribute(catmullRomWayPointPathInterpolatorEClass, CATMULL_ROM_WAY_POINT_PATH_INTERPOLATOR__MAXIMUM_WAY_POINTS_DISTANCE);
		createEAttribute(catmullRomWayPointPathInterpolatorEClass, CATMULL_ROM_WAY_POINT_PATH_INTERPOLATOR__END_CONTROL_POINT_GENERATION_MODE);

		segmentWayPointPathInterpolatorEClass = createEClass(SEGMENT_WAY_POINT_PATH_INTERPOLATOR);
		createEAttribute(segmentWayPointPathInterpolatorEClass, SEGMENT_WAY_POINT_PATH_INTERPOLATOR__MAXIMUM_DISTANCE_INTERVAL);

		wayPointPathFilterEClass = createEClass(WAY_POINT_PATH_FILTER);

		minimumDistanceFilterEClass = createEClass(MINIMUM_DISTANCE_FILTER);
		createEAttribute(minimumDistanceFilterEClass, MINIMUM_DISTANCE_FILTER__MINIMUM_DISTANCE);

		uniformDistanceWayPointPathInterpolatorEClass = createEClass(UNIFORM_DISTANCE_WAY_POINT_PATH_INTERPOLATOR);
		createEAttribute(uniformDistanceWayPointPathInterpolatorEClass, UNIFORM_DISTANCE_WAY_POINT_PATH_INTERPOLATOR__DISTANCE_INTERVAL);

		pathsFacadeEClass = createEClass(PATHS_FACADE);
		createEOperation(pathsFacadeEClass, PATHS_FACADE___CREATE_WAY_POINT_PATH__WAYPOINTPATH);
		createEOperation(pathsFacadeEClass, PATHS_FACADE___CREATE_WAY_POINT_PATH__LIST);

		// Create enums
		splineEndControlPointGenerationModeEEnum = createEEnum(SPLINE_END_CONTROL_POINT_GENERATION_MODE);

		// Create data types
		listEDataType = createEDataType(LIST);
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
		TopologyPackage theTopologyPackage = (TopologyPackage)EPackage.Registry.INSTANCE.getEPackage(TopologyPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		ProcessorsPackage theProcessorsPackage = (ProcessorsPackage)EPackage.Registry.INSTANCE.getEPackage(ProcessorsPackage.eNS_URI);

		// Create type parameters
		addETypeParameter(listEDataType, "T");

		// Set bounds for type parameters

		// Add supertypes to classes
		wayPointEClass.getESuperTypes().add(theData3dPackage.getCartesianPositionCoordinates());
		wayPointEClass.getESuperTypes().add(theTopologyPackage.getGroupNode());
		pathEClass.getESuperTypes().add(theTopologyPackage.getNode());
		wayPointPathEClass.getESuperTypes().add(theData3dPackage.getCartesianCoordinatesSet());
		wayPointPathEClass.getESuperTypes().add(this.getPath());
		EGenericType g1 = createEGenericType(theProcessorsPackage.getProcessor());
		EGenericType g2 = createEGenericType(this.getWayPointPath());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getWayPointPath());
		g1.getETypeArguments().add(g2);
		wayPointPathInterpolatorEClass.getEGenericSuperTypes().add(g1);
		catmullRomWayPointPathInterpolatorEClass.getESuperTypes().add(this.getWayPointPathInterpolator());
		segmentWayPointPathInterpolatorEClass.getESuperTypes().add(this.getWayPointPathInterpolator());
		g1 = createEGenericType(theProcessorsPackage.getProcessor());
		g2 = createEGenericType(this.getWayPointPath());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getWayPointPath());
		g1.getETypeArguments().add(g2);
		wayPointPathFilterEClass.getEGenericSuperTypes().add(g1);
		minimumDistanceFilterEClass.getESuperTypes().add(this.getWayPointPathFilter());
		uniformDistanceWayPointPathInterpolatorEClass.getESuperTypes().add(this.getWayPointPathFilter());

		// Initialize classes, features, and operations; add parameters
		initEClass(wayPointEClass, WayPoint.class, "WayPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pathEClass, Path.class, "Path", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(wayPointPathEClass, WayPointPath.class, "WayPointPath", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWayPointPath_Length(), theEcorePackage.getEDouble(), "length", "0.0", 0, 1, WayPointPath.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEOperation(getWayPointPath__GetStartPoint(), theData3dPackage.getCartesianPositionCoordinates(), "getStartPoint", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getWayPointPath__GetEndPoint(), theData3dPackage.getCartesianPositionCoordinates(), "getEndPoint", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(wayPointPathInterpolatorEClass, WayPointPathInterpolator.class, "WayPointPathInterpolator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(catmullRomWayPointPathInterpolatorEClass, CatmullRomWayPointPathInterpolator.class, "CatmullRomWayPointPathInterpolator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCatmullRomWayPointPathInterpolator_Tension(), theEcorePackage.getEDouble(), "tension", "0.5", 0, 1, CatmullRomWayPointPathInterpolator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCatmullRomWayPointPathInterpolator_MaximumWayPointsDistance(), theEcorePackage.getEDouble(), "maximumWayPointsDistance", "1.0", 0, 1, CatmullRomWayPointPathInterpolator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCatmullRomWayPointPathInterpolator_EndControlPointGenerationMode(), this.getSplineEndControlPointGenerationMode(), "endControlPointGenerationMode", "AUTO_CTRL_POINTS_DUPLICATE_ENDNODES", 0, 1, CatmullRomWayPointPathInterpolator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(segmentWayPointPathInterpolatorEClass, SegmentWayPointPathInterpolator.class, "SegmentWayPointPathInterpolator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSegmentWayPointPathInterpolator_MaximumDistanceInterval(), theEcorePackage.getEDouble(), "maximumDistanceInterval", "1.0", 0, 1, SegmentWayPointPathInterpolator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wayPointPathFilterEClass, WayPointPathFilter.class, "WayPointPathFilter", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(minimumDistanceFilterEClass, MinimumDistanceFilter.class, "MinimumDistanceFilter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMinimumDistanceFilter_MinimumDistance(), theEcorePackage.getEDouble(), "minimumDistance", null, 0, 1, MinimumDistanceFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uniformDistanceWayPointPathInterpolatorEClass, UniformDistanceWayPointPathInterpolator.class, "UniformDistanceWayPointPathInterpolator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUniformDistanceWayPointPathInterpolator_DistanceInterval(), theEcorePackage.getEDouble(), "distanceInterval", null, 0, 1, UniformDistanceWayPointPathInterpolator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pathsFacadeEClass, PathsFacade.class, "PathsFacade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getPathsFacade__CreateWayPointPath__WayPointPath(), this.getWayPointPath(), "createWayPointPath", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getWayPointPath(), "wayPointPath", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPathsFacade__CreateWayPointPath__List(), this.getWayPointPath(), "createWayPointPath", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(theData3dPackage.getCartesianPositionCoordinates());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "points", 0, 1, !IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(splineEndControlPointGenerationModeEEnum, SplineEndControlPointGenerationMode.class, "SplineEndControlPointGenerationMode");
		addEEnumLiteral(splineEndControlPointGenerationModeEEnum, SplineEndControlPointGenerationMode.AUTO_CTRL_POINTS_NONE);
		addEEnumLiteral(splineEndControlPointGenerationModeEEnum, SplineEndControlPointGenerationMode.AUTO_CTRL_POINTS_DUPLICATE_ENDNODES);
		addEEnumLiteral(splineEndControlPointGenerationModeEEnum, SplineEndControlPointGenerationMode.AUTO_CTRL_POINTS_REFLECTION);
		addEEnumLiteral(splineEndControlPointGenerationModeEEnum, SplineEndControlPointGenerationMode.AUTO_CTRL_POINTS_CLOSE_LOOPS);

		// Initialize data types
		initEDataType(listEDataType, List.class, "List", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "prefix", "Paths",
			 "childCreationExtenders", "true",
			 "extensibleProviderFactory", "true",
			 "multipleEditorPages", "false",
			 "copyrightText", "Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)",
			 "modelName", "Paths",
			 "operationReflection", "true",
			 "suppressGenModelAnnotations", "false",
			 "modelDirectory", "/org.eclipse.symphony.addons.geometry.paths/src-generated",
			 "editDirectory", "/org.eclipse.symphony.addons.geometry.paths.edit/src-generated",
			 "basePackage", "org.eclipse.symphony.addons.geometry"
		   });	
		addAnnotation
		  (catmullRomWayPointPathInterpolatorEClass, 
		   source, 
		   new String[] {
			 "documentation", "Fits a spline on the specified path using Catmull-Rom and generates an\ninterpolated path using the specified maximum point to point distance.\nThe original waypoints are included in the resulting interpolated path."
		   });	
		addAnnotation
		  (getPathsFacade__CreateWayPointPath__WayPointPath(), 
		   source, 
		   new String[] {
			 "documentation", "Creates a WayPointPath from a WayPointPath. The WayPointPath created\ncontains copies of all the points found in the specified WayPointPath."
		   });	
		addAnnotation
		  (getPathsFacade__CreateWayPointPath__List(), 
		   source, 
		   new String[] {
			 "documentation", "Creates a WayPointPath using a list of CartesianPositionCoordinates.\nThe WayPointPath created contains copies of all the points found in\nthe specified list."
		   });
	}

} //PathsPackageImpl
