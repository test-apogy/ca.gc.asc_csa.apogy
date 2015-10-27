/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.addons.geometry.paths;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.symphony.common.geometry.data3d.Symphony__CommonGeometryData3DPackage;
import org.eclipse.symphony.common.processors.Symphony__CommonProcessorsPackage;
import org.eclipse.symphony.common.topology.Symphony__CommonTopologyPackage;

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
 * @see org.eclipse.symphony.addons.geometry.paths.Symphony__AddonsGeometryPathsFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='Symphony__AddonsGeometryPaths' childCreationExtenders='true' extensibleProviderFactory='true' multipleEditorPages='false' copyrightText='Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)' modelName='Symphony__AddonsGeometryPaths' suppressGenModelAnnotations='false' modelDirectory='/org.eclipse.symphony.addons.geometry.paths/src-generated' editDirectory='/org.eclipse.symphony.addons.geometry.paths.edit/src-generated' basePackage='org.eclipse.symphony.addons.geometry'"
 * @generated
 */
public interface Symphony__AddonsGeometryPathsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "paths";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "org.eclipse.symphony.addons.geometry.paths";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "paths";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Symphony__AddonsGeometryPathsPackage eINSTANCE = org.eclipse.symphony.addons.geometry.paths.impl.Symphony__AddonsGeometryPathsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.geometry.paths.impl.WayPointImpl <em>Way Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.geometry.paths.impl.WayPointImpl
	 * @see org.eclipse.symphony.addons.geometry.paths.impl.Symphony__AddonsGeometryPathsPackageImpl#getWayPoint()
	 * @generated
	 */
	int WAY_POINT = 0;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY_POINT__X = Symphony__CommonGeometryData3DPackage.CARTESIAN_POSITION_COORDINATES__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY_POINT__Y = Symphony__CommonGeometryData3DPackage.CARTESIAN_POSITION_COORDINATES__Y;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY_POINT__Z = Symphony__CommonGeometryData3DPackage.CARTESIAN_POSITION_COORDINATES__Z;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY_POINT__PARENT = Symphony__CommonGeometryData3DPackage.CARTESIAN_POSITION_COORDINATES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY_POINT__DESCRIPTION = Symphony__CommonGeometryData3DPackage.CARTESIAN_POSITION_COORDINATES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY_POINT__NODE_ID = Symphony__CommonGeometryData3DPackage.CARTESIAN_POSITION_COORDINATES_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY_POINT__CHILDREN = Symphony__CommonGeometryData3DPackage.CARTESIAN_POSITION_COORDINATES_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Way Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY_POINT_FEATURE_COUNT = Symphony__CommonGeometryData3DPackage.CARTESIAN_POSITION_COORDINATES_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>As Point3d</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY_POINT___AS_POINT3D = Symphony__CommonGeometryData3DPackage.CARTESIAN_POSITION_COORDINATES___AS_POINT3D;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY_POINT___ACCEPT__INODEVISITOR = Symphony__CommonGeometryData3DPackage.CARTESIAN_POSITION_COORDINATES_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Way Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY_POINT_OPERATION_COUNT = Symphony__CommonGeometryData3DPackage.CARTESIAN_POSITION_COORDINATES_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.geometry.paths.impl.PathImpl <em>Path</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.geometry.paths.impl.PathImpl
	 * @see org.eclipse.symphony.addons.geometry.paths.impl.Symphony__AddonsGeometryPathsPackageImpl#getPath()
	 * @generated
	 */
	int PATH = 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__PARENT = Symphony__CommonTopologyPackage.NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__DESCRIPTION = Symphony__CommonTopologyPackage.NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__NODE_ID = Symphony__CommonTopologyPackage.NODE__NODE_ID;

	/**
	 * The number of structural features of the '<em>Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_FEATURE_COUNT = Symphony__CommonTopologyPackage.NODE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH___ACCEPT__INODEVISITOR = Symphony__CommonTopologyPackage.NODE___ACCEPT__INODEVISITOR;

	/**
	 * The number of operations of the '<em>Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_OPERATION_COUNT = Symphony__CommonTopologyPackage.NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.geometry.paths.impl.WayPointPathImpl <em>Way Point Path</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.geometry.paths.impl.WayPointPathImpl
	 * @see org.eclipse.symphony.addons.geometry.paths.impl.Symphony__AddonsGeometryPathsPackageImpl#getWayPointPath()
	 * @generated
	 */
	int WAY_POINT_PATH = 2;

	/**
	 * The feature id for the '<em><b>Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY_POINT_PATH__POINTS = Symphony__CommonGeometryData3DPackage.CARTESIAN_COORDINATES_SET__POINTS;

	/**
	 * The feature id for the '<em><b>Normals</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY_POINT_PATH__NORMALS = Symphony__CommonGeometryData3DPackage.CARTESIAN_COORDINATES_SET__NORMALS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY_POINT_PATH__PARENT = Symphony__CommonGeometryData3DPackage.CARTESIAN_COORDINATES_SET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY_POINT_PATH__DESCRIPTION = Symphony__CommonGeometryData3DPackage.CARTESIAN_COORDINATES_SET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY_POINT_PATH__NODE_ID = Symphony__CommonGeometryData3DPackage.CARTESIAN_COORDINATES_SET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY_POINT_PATH__LENGTH = Symphony__CommonGeometryData3DPackage.CARTESIAN_COORDINATES_SET_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Way Point Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY_POINT_PATH_FEATURE_COUNT = Symphony__CommonGeometryData3DPackage.CARTESIAN_COORDINATES_SET_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Extent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY_POINT_PATH___GET_EXTENT = Symphony__CommonGeometryData3DPackage.CARTESIAN_COORDINATES_SET___GET_EXTENT;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY_POINT_PATH___ACCEPT__INODEVISITOR = Symphony__CommonGeometryData3DPackage.CARTESIAN_COORDINATES_SET_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Start Point</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY_POINT_PATH___GET_START_POINT = Symphony__CommonGeometryData3DPackage.CARTESIAN_COORDINATES_SET_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get End Point</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY_POINT_PATH___GET_END_POINT = Symphony__CommonGeometryData3DPackage.CARTESIAN_COORDINATES_SET_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Way Point Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY_POINT_PATH_OPERATION_COUNT = Symphony__CommonGeometryData3DPackage.CARTESIAN_COORDINATES_SET_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.geometry.paths.impl.WayPointPathInterpolatorImpl <em>Way Point Path Interpolator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.geometry.paths.impl.WayPointPathInterpolatorImpl
	 * @see org.eclipse.symphony.addons.geometry.paths.impl.Symphony__AddonsGeometryPathsPackageImpl#getWayPointPathInterpolator()
	 * @generated
	 */
	int WAY_POINT_PATH_INTERPOLATOR = 3;

	/**
	 * The feature id for the '<em><b>Progress Monitor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY_POINT_PATH_INTERPOLATOR__PROGRESS_MONITOR = Symphony__CommonProcessorsPackage.PROCESSOR__PROGRESS_MONITOR;

	/**
	 * The feature id for the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY_POINT_PATH_INTERPOLATOR__INPUT = Symphony__CommonProcessorsPackage.PROCESSOR__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY_POINT_PATH_INTERPOLATOR__OUTPUT = Symphony__CommonProcessorsPackage.PROCESSOR__OUTPUT;

	/**
	 * The number of structural features of the '<em>Way Point Path Interpolator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY_POINT_PATH_INTERPOLATOR_FEATURE_COUNT = Symphony__CommonProcessorsPackage.PROCESSOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Process</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY_POINT_PATH_INTERPOLATOR___PROCESS__OBJECT = Symphony__CommonProcessorsPackage.PROCESSOR___PROCESS__OBJECT;

	/**
	 * The number of operations of the '<em>Way Point Path Interpolator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY_POINT_PATH_INTERPOLATOR_OPERATION_COUNT = Symphony__CommonProcessorsPackage.PROCESSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.geometry.paths.impl.CatmullRomWayPointPathInterpolatorImpl <em>Catmull Rom Way Point Path Interpolator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.geometry.paths.impl.CatmullRomWayPointPathInterpolatorImpl
	 * @see org.eclipse.symphony.addons.geometry.paths.impl.Symphony__AddonsGeometryPathsPackageImpl#getCatmullRomWayPointPathInterpolator()
	 * @generated
	 */
	int CATMULL_ROM_WAY_POINT_PATH_INTERPOLATOR = 4;

	/**
	 * The feature id for the '<em><b>Progress Monitor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATMULL_ROM_WAY_POINT_PATH_INTERPOLATOR__PROGRESS_MONITOR = WAY_POINT_PATH_INTERPOLATOR__PROGRESS_MONITOR;

	/**
	 * The feature id for the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATMULL_ROM_WAY_POINT_PATH_INTERPOLATOR__INPUT = WAY_POINT_PATH_INTERPOLATOR__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATMULL_ROM_WAY_POINT_PATH_INTERPOLATOR__OUTPUT = WAY_POINT_PATH_INTERPOLATOR__OUTPUT;

	/**
	 * The feature id for the '<em><b>Tension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATMULL_ROM_WAY_POINT_PATH_INTERPOLATOR__TENSION = WAY_POINT_PATH_INTERPOLATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Maximum Way Points Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATMULL_ROM_WAY_POINT_PATH_INTERPOLATOR__MAXIMUM_WAY_POINTS_DISTANCE = WAY_POINT_PATH_INTERPOLATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>End Control Point Generation Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATMULL_ROM_WAY_POINT_PATH_INTERPOLATOR__END_CONTROL_POINT_GENERATION_MODE = WAY_POINT_PATH_INTERPOLATOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Catmull Rom Way Point Path Interpolator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATMULL_ROM_WAY_POINT_PATH_INTERPOLATOR_FEATURE_COUNT = WAY_POINT_PATH_INTERPOLATOR_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Process</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATMULL_ROM_WAY_POINT_PATH_INTERPOLATOR___PROCESS__OBJECT = WAY_POINT_PATH_INTERPOLATOR___PROCESS__OBJECT;

	/**
	 * The number of operations of the '<em>Catmull Rom Way Point Path Interpolator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATMULL_ROM_WAY_POINT_PATH_INTERPOLATOR_OPERATION_COUNT = WAY_POINT_PATH_INTERPOLATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.geometry.paths.impl.SegmentWayPointPathInterpolatorImpl <em>Segment Way Point Path Interpolator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.geometry.paths.impl.SegmentWayPointPathInterpolatorImpl
	 * @see org.eclipse.symphony.addons.geometry.paths.impl.Symphony__AddonsGeometryPathsPackageImpl#getSegmentWayPointPathInterpolator()
	 * @generated
	 */
	int SEGMENT_WAY_POINT_PATH_INTERPOLATOR = 5;

	/**
	 * The feature id for the '<em><b>Progress Monitor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_WAY_POINT_PATH_INTERPOLATOR__PROGRESS_MONITOR = WAY_POINT_PATH_INTERPOLATOR__PROGRESS_MONITOR;

	/**
	 * The feature id for the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_WAY_POINT_PATH_INTERPOLATOR__INPUT = WAY_POINT_PATH_INTERPOLATOR__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_WAY_POINT_PATH_INTERPOLATOR__OUTPUT = WAY_POINT_PATH_INTERPOLATOR__OUTPUT;

	/**
	 * The feature id for the '<em><b>Maximum Distance Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_WAY_POINT_PATH_INTERPOLATOR__MAXIMUM_DISTANCE_INTERVAL = WAY_POINT_PATH_INTERPOLATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Segment Way Point Path Interpolator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_WAY_POINT_PATH_INTERPOLATOR_FEATURE_COUNT = WAY_POINT_PATH_INTERPOLATOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Process</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_WAY_POINT_PATH_INTERPOLATOR___PROCESS__OBJECT = WAY_POINT_PATH_INTERPOLATOR___PROCESS__OBJECT;

	/**
	 * The number of operations of the '<em>Segment Way Point Path Interpolator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_WAY_POINT_PATH_INTERPOLATOR_OPERATION_COUNT = WAY_POINT_PATH_INTERPOLATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.geometry.paths.impl.WayPointPathFilterImpl <em>Way Point Path Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.geometry.paths.impl.WayPointPathFilterImpl
	 * @see org.eclipse.symphony.addons.geometry.paths.impl.Symphony__AddonsGeometryPathsPackageImpl#getWayPointPathFilter()
	 * @generated
	 */
	int WAY_POINT_PATH_FILTER = 6;

	/**
	 * The feature id for the '<em><b>Progress Monitor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY_POINT_PATH_FILTER__PROGRESS_MONITOR = Symphony__CommonProcessorsPackage.PROCESSOR__PROGRESS_MONITOR;

	/**
	 * The feature id for the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY_POINT_PATH_FILTER__INPUT = Symphony__CommonProcessorsPackage.PROCESSOR__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY_POINT_PATH_FILTER__OUTPUT = Symphony__CommonProcessorsPackage.PROCESSOR__OUTPUT;

	/**
	 * The number of structural features of the '<em>Way Point Path Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY_POINT_PATH_FILTER_FEATURE_COUNT = Symphony__CommonProcessorsPackage.PROCESSOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Process</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY_POINT_PATH_FILTER___PROCESS__OBJECT = Symphony__CommonProcessorsPackage.PROCESSOR___PROCESS__OBJECT;

	/**
	 * The number of operations of the '<em>Way Point Path Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY_POINT_PATH_FILTER_OPERATION_COUNT = Symphony__CommonProcessorsPackage.PROCESSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.geometry.paths.impl.MinimumDistanceFilterImpl <em>Minimum Distance Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.geometry.paths.impl.MinimumDistanceFilterImpl
	 * @see org.eclipse.symphony.addons.geometry.paths.impl.Symphony__AddonsGeometryPathsPackageImpl#getMinimumDistanceFilter()
	 * @generated
	 */
	int MINIMUM_DISTANCE_FILTER = 7;

	/**
	 * The feature id for the '<em><b>Progress Monitor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIMUM_DISTANCE_FILTER__PROGRESS_MONITOR = WAY_POINT_PATH_FILTER__PROGRESS_MONITOR;

	/**
	 * The feature id for the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIMUM_DISTANCE_FILTER__INPUT = WAY_POINT_PATH_FILTER__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIMUM_DISTANCE_FILTER__OUTPUT = WAY_POINT_PATH_FILTER__OUTPUT;

	/**
	 * The feature id for the '<em><b>Minimum Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIMUM_DISTANCE_FILTER__MINIMUM_DISTANCE = WAY_POINT_PATH_FILTER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Minimum Distance Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIMUM_DISTANCE_FILTER_FEATURE_COUNT = WAY_POINT_PATH_FILTER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Process</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIMUM_DISTANCE_FILTER___PROCESS__OBJECT = WAY_POINT_PATH_FILTER___PROCESS__OBJECT;

	/**
	 * The number of operations of the '<em>Minimum Distance Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIMUM_DISTANCE_FILTER_OPERATION_COUNT = WAY_POINT_PATH_FILTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.geometry.paths.impl.UniformDistanceWayPointPathInterpolatorImpl <em>Uniform Distance Way Point Path Interpolator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.geometry.paths.impl.UniformDistanceWayPointPathInterpolatorImpl
	 * @see org.eclipse.symphony.addons.geometry.paths.impl.Symphony__AddonsGeometryPathsPackageImpl#getUniformDistanceWayPointPathInterpolator()
	 * @generated
	 */
	int UNIFORM_DISTANCE_WAY_POINT_PATH_INTERPOLATOR = 8;

	/**
	 * The feature id for the '<em><b>Progress Monitor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFORM_DISTANCE_WAY_POINT_PATH_INTERPOLATOR__PROGRESS_MONITOR = WAY_POINT_PATH_FILTER__PROGRESS_MONITOR;

	/**
	 * The feature id for the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFORM_DISTANCE_WAY_POINT_PATH_INTERPOLATOR__INPUT = WAY_POINT_PATH_FILTER__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFORM_DISTANCE_WAY_POINT_PATH_INTERPOLATOR__OUTPUT = WAY_POINT_PATH_FILTER__OUTPUT;

	/**
	 * The feature id for the '<em><b>Distance Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFORM_DISTANCE_WAY_POINT_PATH_INTERPOLATOR__DISTANCE_INTERVAL = WAY_POINT_PATH_FILTER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Uniform Distance Way Point Path Interpolator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFORM_DISTANCE_WAY_POINT_PATH_INTERPOLATOR_FEATURE_COUNT = WAY_POINT_PATH_FILTER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Process</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFORM_DISTANCE_WAY_POINT_PATH_INTERPOLATOR___PROCESS__OBJECT = WAY_POINT_PATH_FILTER___PROCESS__OBJECT;

	/**
	 * The number of operations of the '<em>Uniform Distance Way Point Path Interpolator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFORM_DISTANCE_WAY_POINT_PATH_INTERPOLATOR_OPERATION_COUNT = WAY_POINT_PATH_FILTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.geometry.paths.impl.Symphony__AddonsGeometryPathsFacadeImpl <em>Facade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.geometry.paths.impl.Symphony__AddonsGeometryPathsFacadeImpl
	 * @see org.eclipse.symphony.addons.geometry.paths.impl.Symphony__AddonsGeometryPathsPackageImpl#getSymphony__AddonsGeometryPathsFacade()
	 * @generated
	 */
	int SYMPHONY_ADDONS_GEOMETRY_PATHS_FACADE = 9;

	/**
	 * The number of structural features of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_ADDONS_GEOMETRY_PATHS_FACADE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Create Way Point Path</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_ADDONS_GEOMETRY_PATHS_FACADE___CREATE_WAY_POINT_PATH__WAYPOINTPATH = 0;

	/**
	 * The operation id for the '<em>Create Way Point Path</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_ADDONS_GEOMETRY_PATHS_FACADE___CREATE_WAY_POINT_PATH__LIST = 1;

	/**
	 * The number of operations of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_ADDONS_GEOMETRY_PATHS_FACADE_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.geometry.paths.SplineEndControlPointGenerationMode <em>Spline End Control Point Generation Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.geometry.paths.SplineEndControlPointGenerationMode
	 * @see org.eclipse.symphony.addons.geometry.paths.impl.Symphony__AddonsGeometryPathsPackageImpl#getSplineEndControlPointGenerationMode()
	 * @generated
	 */
	int SPLINE_END_CONTROL_POINT_GENERATION_MODE = 10;

	/**
	 * The meta object id for the '<em>List</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.eclipse.symphony.addons.geometry.paths.impl.Symphony__AddonsGeometryPathsPackageImpl#getList()
	 * @generated
	 */
	int LIST = 11;


	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.geometry.paths.WayPoint <em>Way Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Way Point</em>'.
	 * @see org.eclipse.symphony.addons.geometry.paths.WayPoint
	 * @generated
	 */
	EClass getWayPoint();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.geometry.paths.Path <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path</em>'.
	 * @see org.eclipse.symphony.addons.geometry.paths.Path
	 * @generated
	 */
	EClass getPath();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.geometry.paths.WayPointPath <em>Way Point Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Way Point Path</em>'.
	 * @see org.eclipse.symphony.addons.geometry.paths.WayPointPath
	 * @generated
	 */
	EClass getWayPointPath();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.geometry.paths.WayPointPath#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see org.eclipse.symphony.addons.geometry.paths.WayPointPath#getLength()
	 * @see #getWayPointPath()
	 * @generated
	 */
	EAttribute getWayPointPath_Length();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.addons.geometry.paths.WayPointPath#getStartPoint() <em>Get Start Point</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Start Point</em>' operation.
	 * @see org.eclipse.symphony.addons.geometry.paths.WayPointPath#getStartPoint()
	 * @generated
	 */
	EOperation getWayPointPath__GetStartPoint();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.addons.geometry.paths.WayPointPath#getEndPoint() <em>Get End Point</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get End Point</em>' operation.
	 * @see org.eclipse.symphony.addons.geometry.paths.WayPointPath#getEndPoint()
	 * @generated
	 */
	EOperation getWayPointPath__GetEndPoint();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.geometry.paths.WayPointPathInterpolator <em>Way Point Path Interpolator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Way Point Path Interpolator</em>'.
	 * @see org.eclipse.symphony.addons.geometry.paths.WayPointPathInterpolator
	 * @generated
	 */
	EClass getWayPointPathInterpolator();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.geometry.paths.CatmullRomWayPointPathInterpolator <em>Catmull Rom Way Point Path Interpolator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Catmull Rom Way Point Path Interpolator</em>'.
	 * @see org.eclipse.symphony.addons.geometry.paths.CatmullRomWayPointPathInterpolator
	 * @generated
	 */
	EClass getCatmullRomWayPointPathInterpolator();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.geometry.paths.CatmullRomWayPointPathInterpolator#getTension <em>Tension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tension</em>'.
	 * @see org.eclipse.symphony.addons.geometry.paths.CatmullRomWayPointPathInterpolator#getTension()
	 * @see #getCatmullRomWayPointPathInterpolator()
	 * @generated
	 */
	EAttribute getCatmullRomWayPointPathInterpolator_Tension();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.geometry.paths.CatmullRomWayPointPathInterpolator#getMaximumWayPointsDistance <em>Maximum Way Points Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum Way Points Distance</em>'.
	 * @see org.eclipse.symphony.addons.geometry.paths.CatmullRomWayPointPathInterpolator#getMaximumWayPointsDistance()
	 * @see #getCatmullRomWayPointPathInterpolator()
	 * @generated
	 */
	EAttribute getCatmullRomWayPointPathInterpolator_MaximumWayPointsDistance();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.geometry.paths.CatmullRomWayPointPathInterpolator#getEndControlPointGenerationMode <em>End Control Point Generation Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Control Point Generation Mode</em>'.
	 * @see org.eclipse.symphony.addons.geometry.paths.CatmullRomWayPointPathInterpolator#getEndControlPointGenerationMode()
	 * @see #getCatmullRomWayPointPathInterpolator()
	 * @generated
	 */
	EAttribute getCatmullRomWayPointPathInterpolator_EndControlPointGenerationMode();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.geometry.paths.SegmentWayPointPathInterpolator <em>Segment Way Point Path Interpolator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Segment Way Point Path Interpolator</em>'.
	 * @see org.eclipse.symphony.addons.geometry.paths.SegmentWayPointPathInterpolator
	 * @generated
	 */
	EClass getSegmentWayPointPathInterpolator();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.geometry.paths.SegmentWayPointPathInterpolator#getMaximumDistanceInterval <em>Maximum Distance Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum Distance Interval</em>'.
	 * @see org.eclipse.symphony.addons.geometry.paths.SegmentWayPointPathInterpolator#getMaximumDistanceInterval()
	 * @see #getSegmentWayPointPathInterpolator()
	 * @generated
	 */
	EAttribute getSegmentWayPointPathInterpolator_MaximumDistanceInterval();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.geometry.paths.WayPointPathFilter <em>Way Point Path Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Way Point Path Filter</em>'.
	 * @see org.eclipse.symphony.addons.geometry.paths.WayPointPathFilter
	 * @generated
	 */
	EClass getWayPointPathFilter();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.geometry.paths.MinimumDistanceFilter <em>Minimum Distance Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Minimum Distance Filter</em>'.
	 * @see org.eclipse.symphony.addons.geometry.paths.MinimumDistanceFilter
	 * @generated
	 */
	EClass getMinimumDistanceFilter();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.geometry.paths.MinimumDistanceFilter#getMinimumDistance <em>Minimum Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum Distance</em>'.
	 * @see org.eclipse.symphony.addons.geometry.paths.MinimumDistanceFilter#getMinimumDistance()
	 * @see #getMinimumDistanceFilter()
	 * @generated
	 */
	EAttribute getMinimumDistanceFilter_MinimumDistance();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.geometry.paths.UniformDistanceWayPointPathInterpolator <em>Uniform Distance Way Point Path Interpolator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uniform Distance Way Point Path Interpolator</em>'.
	 * @see org.eclipse.symphony.addons.geometry.paths.UniformDistanceWayPointPathInterpolator
	 * @generated
	 */
	EClass getUniformDistanceWayPointPathInterpolator();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.geometry.paths.UniformDistanceWayPointPathInterpolator#getDistanceInterval <em>Distance Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance Interval</em>'.
	 * @see org.eclipse.symphony.addons.geometry.paths.UniformDistanceWayPointPathInterpolator#getDistanceInterval()
	 * @see #getUniformDistanceWayPointPathInterpolator()
	 * @generated
	 */
	EAttribute getUniformDistanceWayPointPathInterpolator_DistanceInterval();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.geometry.paths.Symphony__AddonsGeometryPathsFacade <em>Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facade</em>'.
	 * @see org.eclipse.symphony.addons.geometry.paths.Symphony__AddonsGeometryPathsFacade
	 * @generated
	 */
	EClass getSymphony__AddonsGeometryPathsFacade();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.addons.geometry.paths.Symphony__AddonsGeometryPathsFacade#createWayPointPath(org.eclipse.symphony.addons.geometry.paths.WayPointPath) <em>Create Way Point Path</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Way Point Path</em>' operation.
	 * @see org.eclipse.symphony.addons.geometry.paths.Symphony__AddonsGeometryPathsFacade#createWayPointPath(org.eclipse.symphony.addons.geometry.paths.WayPointPath)
	 * @generated
	 */
	EOperation getSymphony__AddonsGeometryPathsFacade__CreateWayPointPath__WayPointPath();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.addons.geometry.paths.Symphony__AddonsGeometryPathsFacade#createWayPointPath(java.util.List) <em>Create Way Point Path</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Way Point Path</em>' operation.
	 * @see org.eclipse.symphony.addons.geometry.paths.Symphony__AddonsGeometryPathsFacade#createWayPointPath(java.util.List)
	 * @generated
	 */
	EOperation getSymphony__AddonsGeometryPathsFacade__CreateWayPointPath__List();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.symphony.addons.geometry.paths.SplineEndControlPointGenerationMode <em>Spline End Control Point Generation Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Spline End Control Point Generation Mode</em>'.
	 * @see org.eclipse.symphony.addons.geometry.paths.SplineEndControlPointGenerationMode
	 * @generated
	 */
	EEnum getSplineEndControlPointGenerationMode();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>List</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List" typeParameters="T"
	 * @generated
	 */
	EDataType getList();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Symphony__AddonsGeometryPathsFactory getSymphony__AddonsGeometryPathsFactory();

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
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.geometry.paths.impl.WayPointImpl <em>Way Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.geometry.paths.impl.WayPointImpl
		 * @see org.eclipse.symphony.addons.geometry.paths.impl.Symphony__AddonsGeometryPathsPackageImpl#getWayPoint()
		 * @generated
		 */
		EClass WAY_POINT = eINSTANCE.getWayPoint();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.geometry.paths.impl.PathImpl <em>Path</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.geometry.paths.impl.PathImpl
		 * @see org.eclipse.symphony.addons.geometry.paths.impl.Symphony__AddonsGeometryPathsPackageImpl#getPath()
		 * @generated
		 */
		EClass PATH = eINSTANCE.getPath();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.geometry.paths.impl.WayPointPathImpl <em>Way Point Path</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.geometry.paths.impl.WayPointPathImpl
		 * @see org.eclipse.symphony.addons.geometry.paths.impl.Symphony__AddonsGeometryPathsPackageImpl#getWayPointPath()
		 * @generated
		 */
		EClass WAY_POINT_PATH = eINSTANCE.getWayPointPath();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WAY_POINT_PATH__LENGTH = eINSTANCE.getWayPointPath_Length();

		/**
		 * The meta object literal for the '<em><b>Get Start Point</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation WAY_POINT_PATH___GET_START_POINT = eINSTANCE.getWayPointPath__GetStartPoint();

		/**
		 * The meta object literal for the '<em><b>Get End Point</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation WAY_POINT_PATH___GET_END_POINT = eINSTANCE.getWayPointPath__GetEndPoint();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.geometry.paths.impl.WayPointPathInterpolatorImpl <em>Way Point Path Interpolator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.geometry.paths.impl.WayPointPathInterpolatorImpl
		 * @see org.eclipse.symphony.addons.geometry.paths.impl.Symphony__AddonsGeometryPathsPackageImpl#getWayPointPathInterpolator()
		 * @generated
		 */
		EClass WAY_POINT_PATH_INTERPOLATOR = eINSTANCE.getWayPointPathInterpolator();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.geometry.paths.impl.CatmullRomWayPointPathInterpolatorImpl <em>Catmull Rom Way Point Path Interpolator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.geometry.paths.impl.CatmullRomWayPointPathInterpolatorImpl
		 * @see org.eclipse.symphony.addons.geometry.paths.impl.Symphony__AddonsGeometryPathsPackageImpl#getCatmullRomWayPointPathInterpolator()
		 * @generated
		 */
		EClass CATMULL_ROM_WAY_POINT_PATH_INTERPOLATOR = eINSTANCE.getCatmullRomWayPointPathInterpolator();

		/**
		 * The meta object literal for the '<em><b>Tension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATMULL_ROM_WAY_POINT_PATH_INTERPOLATOR__TENSION = eINSTANCE.getCatmullRomWayPointPathInterpolator_Tension();

		/**
		 * The meta object literal for the '<em><b>Maximum Way Points Distance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATMULL_ROM_WAY_POINT_PATH_INTERPOLATOR__MAXIMUM_WAY_POINTS_DISTANCE = eINSTANCE.getCatmullRomWayPointPathInterpolator_MaximumWayPointsDistance();

		/**
		 * The meta object literal for the '<em><b>End Control Point Generation Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATMULL_ROM_WAY_POINT_PATH_INTERPOLATOR__END_CONTROL_POINT_GENERATION_MODE = eINSTANCE.getCatmullRomWayPointPathInterpolator_EndControlPointGenerationMode();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.geometry.paths.impl.SegmentWayPointPathInterpolatorImpl <em>Segment Way Point Path Interpolator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.geometry.paths.impl.SegmentWayPointPathInterpolatorImpl
		 * @see org.eclipse.symphony.addons.geometry.paths.impl.Symphony__AddonsGeometryPathsPackageImpl#getSegmentWayPointPathInterpolator()
		 * @generated
		 */
		EClass SEGMENT_WAY_POINT_PATH_INTERPOLATOR = eINSTANCE.getSegmentWayPointPathInterpolator();

		/**
		 * The meta object literal for the '<em><b>Maximum Distance Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEGMENT_WAY_POINT_PATH_INTERPOLATOR__MAXIMUM_DISTANCE_INTERVAL = eINSTANCE.getSegmentWayPointPathInterpolator_MaximumDistanceInterval();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.geometry.paths.impl.WayPointPathFilterImpl <em>Way Point Path Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.geometry.paths.impl.WayPointPathFilterImpl
		 * @see org.eclipse.symphony.addons.geometry.paths.impl.Symphony__AddonsGeometryPathsPackageImpl#getWayPointPathFilter()
		 * @generated
		 */
		EClass WAY_POINT_PATH_FILTER = eINSTANCE.getWayPointPathFilter();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.geometry.paths.impl.MinimumDistanceFilterImpl <em>Minimum Distance Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.geometry.paths.impl.MinimumDistanceFilterImpl
		 * @see org.eclipse.symphony.addons.geometry.paths.impl.Symphony__AddonsGeometryPathsPackageImpl#getMinimumDistanceFilter()
		 * @generated
		 */
		EClass MINIMUM_DISTANCE_FILTER = eINSTANCE.getMinimumDistanceFilter();

		/**
		 * The meta object literal for the '<em><b>Minimum Distance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MINIMUM_DISTANCE_FILTER__MINIMUM_DISTANCE = eINSTANCE.getMinimumDistanceFilter_MinimumDistance();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.geometry.paths.impl.UniformDistanceWayPointPathInterpolatorImpl <em>Uniform Distance Way Point Path Interpolator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.geometry.paths.impl.UniformDistanceWayPointPathInterpolatorImpl
		 * @see org.eclipse.symphony.addons.geometry.paths.impl.Symphony__AddonsGeometryPathsPackageImpl#getUniformDistanceWayPointPathInterpolator()
		 * @generated
		 */
		EClass UNIFORM_DISTANCE_WAY_POINT_PATH_INTERPOLATOR = eINSTANCE.getUniformDistanceWayPointPathInterpolator();

		/**
		 * The meta object literal for the '<em><b>Distance Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIFORM_DISTANCE_WAY_POINT_PATH_INTERPOLATOR__DISTANCE_INTERVAL = eINSTANCE.getUniformDistanceWayPointPathInterpolator_DistanceInterval();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.geometry.paths.impl.Symphony__AddonsGeometryPathsFacadeImpl <em>Facade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.geometry.paths.impl.Symphony__AddonsGeometryPathsFacadeImpl
		 * @see org.eclipse.symphony.addons.geometry.paths.impl.Symphony__AddonsGeometryPathsPackageImpl#getSymphony__AddonsGeometryPathsFacade()
		 * @generated
		 */
		EClass SYMPHONY_ADDONS_GEOMETRY_PATHS_FACADE = eINSTANCE.getSymphony__AddonsGeometryPathsFacade();

		/**
		 * The meta object literal for the '<em><b>Create Way Point Path</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYMPHONY_ADDONS_GEOMETRY_PATHS_FACADE___CREATE_WAY_POINT_PATH__WAYPOINTPATH = eINSTANCE.getSymphony__AddonsGeometryPathsFacade__CreateWayPointPath__WayPointPath();

		/**
		 * The meta object literal for the '<em><b>Create Way Point Path</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYMPHONY_ADDONS_GEOMETRY_PATHS_FACADE___CREATE_WAY_POINT_PATH__LIST = eINSTANCE.getSymphony__AddonsGeometryPathsFacade__CreateWayPointPath__List();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.geometry.paths.SplineEndControlPointGenerationMode <em>Spline End Control Point Generation Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.geometry.paths.SplineEndControlPointGenerationMode
		 * @see org.eclipse.symphony.addons.geometry.paths.impl.Symphony__AddonsGeometryPathsPackageImpl#getSplineEndControlPointGenerationMode()
		 * @generated
		 */
		EEnum SPLINE_END_CONTROL_POINT_GENERATION_MODE = eINSTANCE.getSplineEndControlPointGenerationMode();

		/**
		 * The meta object literal for the '<em>List</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see org.eclipse.symphony.addons.geometry.paths.impl.Symphony__AddonsGeometryPathsPackageImpl#getList()
		 * @generated
		 */
		EDataType LIST = eINSTANCE.getList();

	}

} //Symphony__AddonsGeometryPathsPackage
