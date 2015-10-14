/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.addons.sensors.fov;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.symphony.common.geometry.data.DataPackage;

import org.eclipse.symphony.common.topology.TopologyPackage;

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
 * @see org.eclipse.symphony.addons.sensors.fov.FovFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='Fov' childCreationExtenders='true' extensibleProviderFactory='true' multipleEditorPages='false' copyrightText='Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)' modelName='Fov' operationReflection='true' suppressGenModelAnnotations='false' modelDirectory='/org.eclipse.symphony.addons.sensors.fov/src-generated' editDirectory='/org.eclipse.symphony.addons.sensors.fov.edit/src-generated' basePackage='org.eclipse.symphony.addons.sensors'"
 * @generated
 */
public interface FovPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "fov";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "org.eclipse.symphony.addons.sensors.fov";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "fov";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FovPackage eINSTANCE = org.eclipse.symphony.addons.sensors.fov.impl.FovPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.sensors.fov.impl.FieldOfViewImpl <em>Field Of View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.sensors.fov.impl.FieldOfViewImpl
	 * @see org.eclipse.symphony.addons.sensors.fov.impl.FovPackageImpl#getFieldOfView()
	 * @generated
	 */
	int FIELD_OF_VIEW = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OF_VIEW__PARENT = TopologyPackage.NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OF_VIEW__DESCRIPTION = TopologyPackage.NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OF_VIEW__NODE_ID = TopologyPackage.NODE__NODE_ID;

	/**
	 * The number of structural features of the '<em>Field Of View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OF_VIEW_FEATURE_COUNT = TopologyPackage.NODE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OF_VIEW___ACCEPT__INODEVISITOR = TopologyPackage.NODE___ACCEPT__INODEVISITOR;

	/**
	 * The number of operations of the '<em>Field Of View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OF_VIEW_OPERATION_COUNT = TopologyPackage.NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.sensors.fov.impl.DistanceRangeImpl <em>Distance Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.sensors.fov.impl.DistanceRangeImpl
	 * @see org.eclipse.symphony.addons.sensors.fov.impl.FovPackageImpl#getDistanceRange()
	 * @generated
	 */
	int DISTANCE_RANGE = 1;

	/**
	 * The feature id for the '<em><b>Minimum Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_RANGE__MINIMUM_DISTANCE = 0;

	/**
	 * The feature id for the '<em><b>Maximum Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_RANGE__MAXIMUM_DISTANCE = 1;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_RANGE__DISTANCE = 2;

	/**
	 * The number of structural features of the '<em>Distance Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_RANGE_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Is Within Range</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_RANGE___IS_WITHIN_RANGE__DOUBLE = 0;

	/**
	 * The number of operations of the '<em>Distance Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_RANGE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.sensors.fov.impl.AngularSpanImpl <em>Angular Span</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.sensors.fov.impl.AngularSpanImpl
	 * @see org.eclipse.symphony.addons.sensors.fov.impl.FovPackageImpl#getAngularSpan()
	 * @generated
	 */
	int ANGULAR_SPAN = 2;

	/**
	 * The feature id for the '<em><b>Minimum Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGULAR_SPAN__MINIMUM_ANGLE = 0;

	/**
	 * The feature id for the '<em><b>Maximum Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGULAR_SPAN__MAXIMUM_ANGLE = 1;

	/**
	 * The feature id for the '<em><b>Spanning Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGULAR_SPAN__SPANNING_ANGLE = 2;

	/**
	 * The feature id for the '<em><b>Center Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGULAR_SPAN__CENTER_ANGLE = 3;

	/**
	 * The number of structural features of the '<em>Angular Span</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGULAR_SPAN_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Is Within Range</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGULAR_SPAN___IS_WITHIN_RANGE__DOUBLE = 0;

	/**
	 * The number of operations of the '<em>Angular Span</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGULAR_SPAN_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.sensors.fov.impl.RectangularFrustrumFieldOfViewImpl <em>Rectangular Frustrum Field Of View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.sensors.fov.impl.RectangularFrustrumFieldOfViewImpl
	 * @see org.eclipse.symphony.addons.sensors.fov.impl.FovPackageImpl#getRectangularFrustrumFieldOfView()
	 * @generated
	 */
	int RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW = 3;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW__PARENT = FIELD_OF_VIEW__PARENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW__DESCRIPTION = FIELD_OF_VIEW__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW__NODE_ID = FIELD_OF_VIEW__NODE_ID;

	/**
	 * The feature id for the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW__RANGE = FIELD_OF_VIEW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Horizontal Field Of View Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW__HORIZONTAL_FIELD_OF_VIEW_ANGLE = FIELD_OF_VIEW_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Vertical Field Of View Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW__VERTICAL_FIELD_OF_VIEW_ANGLE = FIELD_OF_VIEW_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Volume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW__VOLUME = FIELD_OF_VIEW_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Rectangular Frustrum Field Of View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW_FEATURE_COUNT = FIELD_OF_VIEW_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW___ACCEPT__INODEVISITOR = FIELD_OF_VIEW___ACCEPT__INODEVISITOR;

	/**
	 * The number of operations of the '<em>Rectangular Frustrum Field Of View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW_OPERATION_COUNT = FIELD_OF_VIEW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.sensors.fov.impl.ConicalFieldOfViewImpl <em>Conical Field Of View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.sensors.fov.impl.ConicalFieldOfViewImpl
	 * @see org.eclipse.symphony.addons.sensors.fov.impl.FovPackageImpl#getConicalFieldOfView()
	 * @generated
	 */
	int CONICAL_FIELD_OF_VIEW = 4;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONICAL_FIELD_OF_VIEW__PARENT = FIELD_OF_VIEW__PARENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONICAL_FIELD_OF_VIEW__DESCRIPTION = FIELD_OF_VIEW__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONICAL_FIELD_OF_VIEW__NODE_ID = FIELD_OF_VIEW__NODE_ID;

	/**
	 * The feature id for the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONICAL_FIELD_OF_VIEW__RANGE = FIELD_OF_VIEW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Field Of View Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONICAL_FIELD_OF_VIEW__FIELD_OF_VIEW_ANGLE = FIELD_OF_VIEW_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Volume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONICAL_FIELD_OF_VIEW__VOLUME = FIELD_OF_VIEW_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Conical Field Of View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONICAL_FIELD_OF_VIEW_FEATURE_COUNT = FIELD_OF_VIEW_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONICAL_FIELD_OF_VIEW___ACCEPT__INODEVISITOR = FIELD_OF_VIEW___ACCEPT__INODEVISITOR;

	/**
	 * The number of operations of the '<em>Conical Field Of View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONICAL_FIELD_OF_VIEW_OPERATION_COUNT = FIELD_OF_VIEW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.sensors.fov.impl.CircularSectorFieldOfViewImpl <em>Circular Sector Field Of View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.sensors.fov.impl.CircularSectorFieldOfViewImpl
	 * @see org.eclipse.symphony.addons.sensors.fov.impl.FovPackageImpl#getCircularSectorFieldOfView()
	 * @generated
	 */
	int CIRCULAR_SECTOR_FIELD_OF_VIEW = 5;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULAR_SECTOR_FIELD_OF_VIEW__PARENT = FIELD_OF_VIEW__PARENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULAR_SECTOR_FIELD_OF_VIEW__DESCRIPTION = FIELD_OF_VIEW__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULAR_SECTOR_FIELD_OF_VIEW__NODE_ID = FIELD_OF_VIEW__NODE_ID;

	/**
	 * The feature id for the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULAR_SECTOR_FIELD_OF_VIEW__RANGE = FIELD_OF_VIEW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Angular Span</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULAR_SECTOR_FIELD_OF_VIEW__ANGULAR_SPAN = FIELD_OF_VIEW_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULAR_SECTOR_FIELD_OF_VIEW__AREA = FIELD_OF_VIEW_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Circular Sector Field Of View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULAR_SECTOR_FIELD_OF_VIEW_FEATURE_COUNT = FIELD_OF_VIEW_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULAR_SECTOR_FIELD_OF_VIEW___ACCEPT__INODEVISITOR = FIELD_OF_VIEW___ACCEPT__INODEVISITOR;

	/**
	 * The number of operations of the '<em>Circular Sector Field Of View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULAR_SECTOR_FIELD_OF_VIEW_OPERATION_COUNT = FIELD_OF_VIEW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.sensors.fov.impl.RectangularFrustrumFieldOfViewSamplingShapeImpl <em>Rectangular Frustrum Field Of View Sampling Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.sensors.fov.impl.RectangularFrustrumFieldOfViewSamplingShapeImpl
	 * @see org.eclipse.symphony.addons.sensors.fov.impl.FovPackageImpl#getRectangularFrustrumFieldOfViewSamplingShape()
	 * @generated
	 */
	int RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW_SAMPLING_SHAPE = 6;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW_SAMPLING_SHAPE__TRANSFORM = DataPackage.COORDINATES_SAMPLING_SHAPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rectangular Frustrum Field Of View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW_SAMPLING_SHAPE__RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW = DataPackage.COORDINATES_SAMPLING_SHAPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rectangular Frustrum Field Of View Sampling Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW_SAMPLING_SHAPE_FEATURE_COUNT = DataPackage.COORDINATES_SAMPLING_SHAPE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Is Inside</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW_SAMPLING_SHAPE___IS_INSIDE__COORDINATES = DataPackage.COORDINATES_SAMPLING_SHAPE___IS_INSIDE__COORDINATES;

	/**
	 * The operation id for the '<em>Is Polygon Inside</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW_SAMPLING_SHAPE___IS_POLYGON_INSIDE__POLYGON = DataPackage.COORDINATES_SAMPLING_SHAPE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Rectangular Frustrum Field Of View Sampling Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW_SAMPLING_SHAPE_OPERATION_COUNT = DataPackage.COORDINATES_SAMPLING_SHAPE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.sensors.fov.impl.FOVFacadeImpl <em>FOV Facade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.sensors.fov.impl.FOVFacadeImpl
	 * @see org.eclipse.symphony.addons.sensors.fov.impl.FovPackageImpl#getFOVFacade()
	 * @generated
	 */
	int FOV_FACADE = 7;

	/**
	 * The number of structural features of the '<em>FOV Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOV_FACADE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Create Distance Range</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOV_FACADE___CREATE_DISTANCE_RANGE__DOUBLE_DOUBLE = 0;

	/**
	 * The operation id for the '<em>Create Distance Range</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOV_FACADE___CREATE_DISTANCE_RANGE__DISTANCERANGE = 1;

	/**
	 * The operation id for the '<em>Create Angular Span</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOV_FACADE___CREATE_ANGULAR_SPAN__DOUBLE_DOUBLE = 2;

	/**
	 * The operation id for the '<em>Create Angular Span</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOV_FACADE___CREATE_ANGULAR_SPAN__ANGULARSPAN = 3;

	/**
	 * The operation id for the '<em>Create Rectangular Frustrum Field Of View</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOV_FACADE___CREATE_RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW__DOUBLE_DOUBLE_DOUBLE_DOUBLE = 4;

	/**
	 * The operation id for the '<em>Create Rectangular Frustrum Field Of View</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOV_FACADE___CREATE_RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW__RECTANGULARFRUSTRUMFIELDOFVIEW = 5;

	/**
	 * The operation id for the '<em>Create Conical Field Of View</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOV_FACADE___CREATE_CONICAL_FIELD_OF_VIEW__DOUBLE_DOUBLE_DOUBLE = 6;

	/**
	 * The operation id for the '<em>Create Conical Field Of View</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOV_FACADE___CREATE_CONICAL_FIELD_OF_VIEW__CONICALFIELDOFVIEW = 7;

	/**
	 * The operation id for the '<em>Create Circular Sector Field Of View</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOV_FACADE___CREATE_CIRCULAR_SECTOR_FIELD_OF_VIEW__DOUBLE_DOUBLE_DOUBLE_DOUBLE = 8;

	/**
	 * The operation id for the '<em>Create Circular Sector Field Of View</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOV_FACADE___CREATE_CIRCULAR_SECTOR_FIELD_OF_VIEW__CIRCULARSECTORFIELDOFVIEW = 9;

	/**
	 * The number of operations of the '<em>FOV Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOV_FACADE_OPERATION_COUNT = 10;


	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.sensors.fov.FieldOfView <em>Field Of View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Of View</em>'.
	 * @see org.eclipse.symphony.addons.sensors.fov.FieldOfView
	 * @generated
	 */
	EClass getFieldOfView();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.sensors.fov.DistanceRange <em>Distance Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Distance Range</em>'.
	 * @see org.eclipse.symphony.addons.sensors.fov.DistanceRange
	 * @generated
	 */
	EClass getDistanceRange();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.fov.DistanceRange#getMinimumDistance <em>Minimum Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum Distance</em>'.
	 * @see org.eclipse.symphony.addons.sensors.fov.DistanceRange#getMinimumDistance()
	 * @see #getDistanceRange()
	 * @generated
	 */
	EAttribute getDistanceRange_MinimumDistance();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.fov.DistanceRange#getMaximumDistance <em>Maximum Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum Distance</em>'.
	 * @see org.eclipse.symphony.addons.sensors.fov.DistanceRange#getMaximumDistance()
	 * @see #getDistanceRange()
	 * @generated
	 */
	EAttribute getDistanceRange_MaximumDistance();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.fov.DistanceRange#getDistance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance</em>'.
	 * @see org.eclipse.symphony.addons.sensors.fov.DistanceRange#getDistance()
	 * @see #getDistanceRange()
	 * @generated
	 */
	EAttribute getDistanceRange_Distance();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.addons.sensors.fov.DistanceRange#isWithinRange(double) <em>Is Within Range</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Within Range</em>' operation.
	 * @see org.eclipse.symphony.addons.sensors.fov.DistanceRange#isWithinRange(double)
	 * @generated
	 */
	EOperation getDistanceRange__IsWithinRange__double();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.sensors.fov.AngularSpan <em>Angular Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Angular Span</em>'.
	 * @see org.eclipse.symphony.addons.sensors.fov.AngularSpan
	 * @generated
	 */
	EClass getAngularSpan();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.fov.AngularSpan#getMinimumAngle <em>Minimum Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum Angle</em>'.
	 * @see org.eclipse.symphony.addons.sensors.fov.AngularSpan#getMinimumAngle()
	 * @see #getAngularSpan()
	 * @generated
	 */
	EAttribute getAngularSpan_MinimumAngle();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.fov.AngularSpan#getMaximumAngle <em>Maximum Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum Angle</em>'.
	 * @see org.eclipse.symphony.addons.sensors.fov.AngularSpan#getMaximumAngle()
	 * @see #getAngularSpan()
	 * @generated
	 */
	EAttribute getAngularSpan_MaximumAngle();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.fov.AngularSpan#getSpanningAngle <em>Spanning Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spanning Angle</em>'.
	 * @see org.eclipse.symphony.addons.sensors.fov.AngularSpan#getSpanningAngle()
	 * @see #getAngularSpan()
	 * @generated
	 */
	EAttribute getAngularSpan_SpanningAngle();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.fov.AngularSpan#getCenterAngle <em>Center Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Center Angle</em>'.
	 * @see org.eclipse.symphony.addons.sensors.fov.AngularSpan#getCenterAngle()
	 * @see #getAngularSpan()
	 * @generated
	 */
	EAttribute getAngularSpan_CenterAngle();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.addons.sensors.fov.AngularSpan#isWithinRange(double) <em>Is Within Range</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Within Range</em>' operation.
	 * @see org.eclipse.symphony.addons.sensors.fov.AngularSpan#isWithinRange(double)
	 * @generated
	 */
	EOperation getAngularSpan__IsWithinRange__double();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.sensors.fov.RectangularFrustrumFieldOfView <em>Rectangular Frustrum Field Of View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rectangular Frustrum Field Of View</em>'.
	 * @see org.eclipse.symphony.addons.sensors.fov.RectangularFrustrumFieldOfView
	 * @generated
	 */
	EClass getRectangularFrustrumFieldOfView();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.symphony.addons.sensors.fov.RectangularFrustrumFieldOfView#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Range</em>'.
	 * @see org.eclipse.symphony.addons.sensors.fov.RectangularFrustrumFieldOfView#getRange()
	 * @see #getRectangularFrustrumFieldOfView()
	 * @generated
	 */
	EReference getRectangularFrustrumFieldOfView_Range();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.fov.RectangularFrustrumFieldOfView#getHorizontalFieldOfViewAngle <em>Horizontal Field Of View Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Horizontal Field Of View Angle</em>'.
	 * @see org.eclipse.symphony.addons.sensors.fov.RectangularFrustrumFieldOfView#getHorizontalFieldOfViewAngle()
	 * @see #getRectangularFrustrumFieldOfView()
	 * @generated
	 */
	EAttribute getRectangularFrustrumFieldOfView_HorizontalFieldOfViewAngle();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.fov.RectangularFrustrumFieldOfView#getVerticalFieldOfViewAngle <em>Vertical Field Of View Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vertical Field Of View Angle</em>'.
	 * @see org.eclipse.symphony.addons.sensors.fov.RectangularFrustrumFieldOfView#getVerticalFieldOfViewAngle()
	 * @see #getRectangularFrustrumFieldOfView()
	 * @generated
	 */
	EAttribute getRectangularFrustrumFieldOfView_VerticalFieldOfViewAngle();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.fov.RectangularFrustrumFieldOfView#getVolume <em>Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volume</em>'.
	 * @see org.eclipse.symphony.addons.sensors.fov.RectangularFrustrumFieldOfView#getVolume()
	 * @see #getRectangularFrustrumFieldOfView()
	 * @generated
	 */
	EAttribute getRectangularFrustrumFieldOfView_Volume();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.sensors.fov.ConicalFieldOfView <em>Conical Field Of View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conical Field Of View</em>'.
	 * @see org.eclipse.symphony.addons.sensors.fov.ConicalFieldOfView
	 * @generated
	 */
	EClass getConicalFieldOfView();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.symphony.addons.sensors.fov.ConicalFieldOfView#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Range</em>'.
	 * @see org.eclipse.symphony.addons.sensors.fov.ConicalFieldOfView#getRange()
	 * @see #getConicalFieldOfView()
	 * @generated
	 */
	EReference getConicalFieldOfView_Range();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.fov.ConicalFieldOfView#getFieldOfViewAngle <em>Field Of View Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field Of View Angle</em>'.
	 * @see org.eclipse.symphony.addons.sensors.fov.ConicalFieldOfView#getFieldOfViewAngle()
	 * @see #getConicalFieldOfView()
	 * @generated
	 */
	EAttribute getConicalFieldOfView_FieldOfViewAngle();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.fov.ConicalFieldOfView#getVolume <em>Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volume</em>'.
	 * @see org.eclipse.symphony.addons.sensors.fov.ConicalFieldOfView#getVolume()
	 * @see #getConicalFieldOfView()
	 * @generated
	 */
	EAttribute getConicalFieldOfView_Volume();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.sensors.fov.CircularSectorFieldOfView <em>Circular Sector Field Of View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Circular Sector Field Of View</em>'.
	 * @see org.eclipse.symphony.addons.sensors.fov.CircularSectorFieldOfView
	 * @generated
	 */
	EClass getCircularSectorFieldOfView();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.symphony.addons.sensors.fov.CircularSectorFieldOfView#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Range</em>'.
	 * @see org.eclipse.symphony.addons.sensors.fov.CircularSectorFieldOfView#getRange()
	 * @see #getCircularSectorFieldOfView()
	 * @generated
	 */
	EReference getCircularSectorFieldOfView_Range();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.symphony.addons.sensors.fov.CircularSectorFieldOfView#getAngularSpan <em>Angular Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Angular Span</em>'.
	 * @see org.eclipse.symphony.addons.sensors.fov.CircularSectorFieldOfView#getAngularSpan()
	 * @see #getCircularSectorFieldOfView()
	 * @generated
	 */
	EReference getCircularSectorFieldOfView_AngularSpan();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.fov.CircularSectorFieldOfView#getArea <em>Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Area</em>'.
	 * @see org.eclipse.symphony.addons.sensors.fov.CircularSectorFieldOfView#getArea()
	 * @see #getCircularSectorFieldOfView()
	 * @generated
	 */
	EAttribute getCircularSectorFieldOfView_Area();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.sensors.fov.RectangularFrustrumFieldOfViewSamplingShape <em>Rectangular Frustrum Field Of View Sampling Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rectangular Frustrum Field Of View Sampling Shape</em>'.
	 * @see org.eclipse.symphony.addons.sensors.fov.RectangularFrustrumFieldOfViewSamplingShape
	 * @generated
	 */
	EClass getRectangularFrustrumFieldOfViewSamplingShape();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.addons.sensors.fov.RectangularFrustrumFieldOfViewSamplingShape#getTransform <em>Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform</em>'.
	 * @see org.eclipse.symphony.addons.sensors.fov.RectangularFrustrumFieldOfViewSamplingShape#getTransform()
	 * @see #getRectangularFrustrumFieldOfViewSamplingShape()
	 * @generated
	 */
	EReference getRectangularFrustrumFieldOfViewSamplingShape_Transform();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.addons.sensors.fov.RectangularFrustrumFieldOfViewSamplingShape#getRectangularFrustrumFieldOfView <em>Rectangular Frustrum Field Of View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rectangular Frustrum Field Of View</em>'.
	 * @see org.eclipse.symphony.addons.sensors.fov.RectangularFrustrumFieldOfViewSamplingShape#getRectangularFrustrumFieldOfView()
	 * @see #getRectangularFrustrumFieldOfViewSamplingShape()
	 * @generated
	 */
	EReference getRectangularFrustrumFieldOfViewSamplingShape_RectangularFrustrumFieldOfView();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.sensors.fov.FOVFacade <em>FOV Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FOV Facade</em>'.
	 * @see org.eclipse.symphony.addons.sensors.fov.FOVFacade
	 * @generated
	 */
	EClass getFOVFacade();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.addons.sensors.fov.FOVFacade#createDistanceRange(double, double) <em>Create Distance Range</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Distance Range</em>' operation.
	 * @see org.eclipse.symphony.addons.sensors.fov.FOVFacade#createDistanceRange(double, double)
	 * @generated
	 */
	EOperation getFOVFacade__CreateDistanceRange__double_double();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.addons.sensors.fov.FOVFacade#createDistanceRange(org.eclipse.symphony.addons.sensors.fov.DistanceRange) <em>Create Distance Range</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Distance Range</em>' operation.
	 * @see org.eclipse.symphony.addons.sensors.fov.FOVFacade#createDistanceRange(org.eclipse.symphony.addons.sensors.fov.DistanceRange)
	 * @generated
	 */
	EOperation getFOVFacade__CreateDistanceRange__DistanceRange();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.addons.sensors.fov.FOVFacade#createAngularSpan(double, double) <em>Create Angular Span</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Angular Span</em>' operation.
	 * @see org.eclipse.symphony.addons.sensors.fov.FOVFacade#createAngularSpan(double, double)
	 * @generated
	 */
	EOperation getFOVFacade__CreateAngularSpan__double_double();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.addons.sensors.fov.FOVFacade#createAngularSpan(org.eclipse.symphony.addons.sensors.fov.AngularSpan) <em>Create Angular Span</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Angular Span</em>' operation.
	 * @see org.eclipse.symphony.addons.sensors.fov.FOVFacade#createAngularSpan(org.eclipse.symphony.addons.sensors.fov.AngularSpan)
	 * @generated
	 */
	EOperation getFOVFacade__CreateAngularSpan__AngularSpan();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.addons.sensors.fov.FOVFacade#createRectangularFrustrumFieldOfView(double, double, double, double) <em>Create Rectangular Frustrum Field Of View</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Rectangular Frustrum Field Of View</em>' operation.
	 * @see org.eclipse.symphony.addons.sensors.fov.FOVFacade#createRectangularFrustrumFieldOfView(double, double, double, double)
	 * @generated
	 */
	EOperation getFOVFacade__CreateRectangularFrustrumFieldOfView__double_double_double_double();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.addons.sensors.fov.FOVFacade#createRectangularFrustrumFieldOfView(org.eclipse.symphony.addons.sensors.fov.RectangularFrustrumFieldOfView) <em>Create Rectangular Frustrum Field Of View</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Rectangular Frustrum Field Of View</em>' operation.
	 * @see org.eclipse.symphony.addons.sensors.fov.FOVFacade#createRectangularFrustrumFieldOfView(org.eclipse.symphony.addons.sensors.fov.RectangularFrustrumFieldOfView)
	 * @generated
	 */
	EOperation getFOVFacade__CreateRectangularFrustrumFieldOfView__RectangularFrustrumFieldOfView();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.addons.sensors.fov.FOVFacade#createConicalFieldOfView(double, double, double) <em>Create Conical Field Of View</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Conical Field Of View</em>' operation.
	 * @see org.eclipse.symphony.addons.sensors.fov.FOVFacade#createConicalFieldOfView(double, double, double)
	 * @generated
	 */
	EOperation getFOVFacade__CreateConicalFieldOfView__double_double_double();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.addons.sensors.fov.FOVFacade#createConicalFieldOfView(org.eclipse.symphony.addons.sensors.fov.ConicalFieldOfView) <em>Create Conical Field Of View</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Conical Field Of View</em>' operation.
	 * @see org.eclipse.symphony.addons.sensors.fov.FOVFacade#createConicalFieldOfView(org.eclipse.symphony.addons.sensors.fov.ConicalFieldOfView)
	 * @generated
	 */
	EOperation getFOVFacade__CreateConicalFieldOfView__ConicalFieldOfView();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.addons.sensors.fov.FOVFacade#createCircularSectorFieldOfView(double, double, double, double) <em>Create Circular Sector Field Of View</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Circular Sector Field Of View</em>' operation.
	 * @see org.eclipse.symphony.addons.sensors.fov.FOVFacade#createCircularSectorFieldOfView(double, double, double, double)
	 * @generated
	 */
	EOperation getFOVFacade__CreateCircularSectorFieldOfView__double_double_double_double();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.addons.sensors.fov.FOVFacade#createCircularSectorFieldOfView(org.eclipse.symphony.addons.sensors.fov.CircularSectorFieldOfView) <em>Create Circular Sector Field Of View</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Circular Sector Field Of View</em>' operation.
	 * @see org.eclipse.symphony.addons.sensors.fov.FOVFacade#createCircularSectorFieldOfView(org.eclipse.symphony.addons.sensors.fov.CircularSectorFieldOfView)
	 * @generated
	 */
	EOperation getFOVFacade__CreateCircularSectorFieldOfView__CircularSectorFieldOfView();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FovFactory getFovFactory();

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
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.sensors.fov.impl.FieldOfViewImpl <em>Field Of View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.sensors.fov.impl.FieldOfViewImpl
		 * @see org.eclipse.symphony.addons.sensors.fov.impl.FovPackageImpl#getFieldOfView()
		 * @generated
		 */
		EClass FIELD_OF_VIEW = eINSTANCE.getFieldOfView();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.sensors.fov.impl.DistanceRangeImpl <em>Distance Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.sensors.fov.impl.DistanceRangeImpl
		 * @see org.eclipse.symphony.addons.sensors.fov.impl.FovPackageImpl#getDistanceRange()
		 * @generated
		 */
		EClass DISTANCE_RANGE = eINSTANCE.getDistanceRange();

		/**
		 * The meta object literal for the '<em><b>Minimum Distance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTANCE_RANGE__MINIMUM_DISTANCE = eINSTANCE.getDistanceRange_MinimumDistance();

		/**
		 * The meta object literal for the '<em><b>Maximum Distance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTANCE_RANGE__MAXIMUM_DISTANCE = eINSTANCE.getDistanceRange_MaximumDistance();

		/**
		 * The meta object literal for the '<em><b>Distance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTANCE_RANGE__DISTANCE = eINSTANCE.getDistanceRange_Distance();

		/**
		 * The meta object literal for the '<em><b>Is Within Range</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DISTANCE_RANGE___IS_WITHIN_RANGE__DOUBLE = eINSTANCE.getDistanceRange__IsWithinRange__double();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.sensors.fov.impl.AngularSpanImpl <em>Angular Span</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.sensors.fov.impl.AngularSpanImpl
		 * @see org.eclipse.symphony.addons.sensors.fov.impl.FovPackageImpl#getAngularSpan()
		 * @generated
		 */
		EClass ANGULAR_SPAN = eINSTANCE.getAngularSpan();

		/**
		 * The meta object literal for the '<em><b>Minimum Angle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANGULAR_SPAN__MINIMUM_ANGLE = eINSTANCE.getAngularSpan_MinimumAngle();

		/**
		 * The meta object literal for the '<em><b>Maximum Angle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANGULAR_SPAN__MAXIMUM_ANGLE = eINSTANCE.getAngularSpan_MaximumAngle();

		/**
		 * The meta object literal for the '<em><b>Spanning Angle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANGULAR_SPAN__SPANNING_ANGLE = eINSTANCE.getAngularSpan_SpanningAngle();

		/**
		 * The meta object literal for the '<em><b>Center Angle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANGULAR_SPAN__CENTER_ANGLE = eINSTANCE.getAngularSpan_CenterAngle();

		/**
		 * The meta object literal for the '<em><b>Is Within Range</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ANGULAR_SPAN___IS_WITHIN_RANGE__DOUBLE = eINSTANCE.getAngularSpan__IsWithinRange__double();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.sensors.fov.impl.RectangularFrustrumFieldOfViewImpl <em>Rectangular Frustrum Field Of View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.sensors.fov.impl.RectangularFrustrumFieldOfViewImpl
		 * @see org.eclipse.symphony.addons.sensors.fov.impl.FovPackageImpl#getRectangularFrustrumFieldOfView()
		 * @generated
		 */
		EClass RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW = eINSTANCE.getRectangularFrustrumFieldOfView();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW__RANGE = eINSTANCE.getRectangularFrustrumFieldOfView_Range();

		/**
		 * The meta object literal for the '<em><b>Horizontal Field Of View Angle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW__HORIZONTAL_FIELD_OF_VIEW_ANGLE = eINSTANCE.getRectangularFrustrumFieldOfView_HorizontalFieldOfViewAngle();

		/**
		 * The meta object literal for the '<em><b>Vertical Field Of View Angle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW__VERTICAL_FIELD_OF_VIEW_ANGLE = eINSTANCE.getRectangularFrustrumFieldOfView_VerticalFieldOfViewAngle();

		/**
		 * The meta object literal for the '<em><b>Volume</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW__VOLUME = eINSTANCE.getRectangularFrustrumFieldOfView_Volume();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.sensors.fov.impl.ConicalFieldOfViewImpl <em>Conical Field Of View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.sensors.fov.impl.ConicalFieldOfViewImpl
		 * @see org.eclipse.symphony.addons.sensors.fov.impl.FovPackageImpl#getConicalFieldOfView()
		 * @generated
		 */
		EClass CONICAL_FIELD_OF_VIEW = eINSTANCE.getConicalFieldOfView();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONICAL_FIELD_OF_VIEW__RANGE = eINSTANCE.getConicalFieldOfView_Range();

		/**
		 * The meta object literal for the '<em><b>Field Of View Angle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONICAL_FIELD_OF_VIEW__FIELD_OF_VIEW_ANGLE = eINSTANCE.getConicalFieldOfView_FieldOfViewAngle();

		/**
		 * The meta object literal for the '<em><b>Volume</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONICAL_FIELD_OF_VIEW__VOLUME = eINSTANCE.getConicalFieldOfView_Volume();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.sensors.fov.impl.CircularSectorFieldOfViewImpl <em>Circular Sector Field Of View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.sensors.fov.impl.CircularSectorFieldOfViewImpl
		 * @see org.eclipse.symphony.addons.sensors.fov.impl.FovPackageImpl#getCircularSectorFieldOfView()
		 * @generated
		 */
		EClass CIRCULAR_SECTOR_FIELD_OF_VIEW = eINSTANCE.getCircularSectorFieldOfView();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CIRCULAR_SECTOR_FIELD_OF_VIEW__RANGE = eINSTANCE.getCircularSectorFieldOfView_Range();

		/**
		 * The meta object literal for the '<em><b>Angular Span</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CIRCULAR_SECTOR_FIELD_OF_VIEW__ANGULAR_SPAN = eINSTANCE.getCircularSectorFieldOfView_AngularSpan();

		/**
		 * The meta object literal for the '<em><b>Area</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CIRCULAR_SECTOR_FIELD_OF_VIEW__AREA = eINSTANCE.getCircularSectorFieldOfView_Area();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.sensors.fov.impl.RectangularFrustrumFieldOfViewSamplingShapeImpl <em>Rectangular Frustrum Field Of View Sampling Shape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.sensors.fov.impl.RectangularFrustrumFieldOfViewSamplingShapeImpl
		 * @see org.eclipse.symphony.addons.sensors.fov.impl.FovPackageImpl#getRectangularFrustrumFieldOfViewSamplingShape()
		 * @generated
		 */
		EClass RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW_SAMPLING_SHAPE = eINSTANCE.getRectangularFrustrumFieldOfViewSamplingShape();

		/**
		 * The meta object literal for the '<em><b>Transform</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW_SAMPLING_SHAPE__TRANSFORM = eINSTANCE.getRectangularFrustrumFieldOfViewSamplingShape_Transform();

		/**
		 * The meta object literal for the '<em><b>Rectangular Frustrum Field Of View</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW_SAMPLING_SHAPE__RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW = eINSTANCE.getRectangularFrustrumFieldOfViewSamplingShape_RectangularFrustrumFieldOfView();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.sensors.fov.impl.FOVFacadeImpl <em>FOV Facade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.sensors.fov.impl.FOVFacadeImpl
		 * @see org.eclipse.symphony.addons.sensors.fov.impl.FovPackageImpl#getFOVFacade()
		 * @generated
		 */
		EClass FOV_FACADE = eINSTANCE.getFOVFacade();

		/**
		 * The meta object literal for the '<em><b>Create Distance Range</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FOV_FACADE___CREATE_DISTANCE_RANGE__DOUBLE_DOUBLE = eINSTANCE.getFOVFacade__CreateDistanceRange__double_double();

		/**
		 * The meta object literal for the '<em><b>Create Distance Range</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FOV_FACADE___CREATE_DISTANCE_RANGE__DISTANCERANGE = eINSTANCE.getFOVFacade__CreateDistanceRange__DistanceRange();

		/**
		 * The meta object literal for the '<em><b>Create Angular Span</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FOV_FACADE___CREATE_ANGULAR_SPAN__DOUBLE_DOUBLE = eINSTANCE.getFOVFacade__CreateAngularSpan__double_double();

		/**
		 * The meta object literal for the '<em><b>Create Angular Span</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FOV_FACADE___CREATE_ANGULAR_SPAN__ANGULARSPAN = eINSTANCE.getFOVFacade__CreateAngularSpan__AngularSpan();

		/**
		 * The meta object literal for the '<em><b>Create Rectangular Frustrum Field Of View</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FOV_FACADE___CREATE_RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW__DOUBLE_DOUBLE_DOUBLE_DOUBLE = eINSTANCE.getFOVFacade__CreateRectangularFrustrumFieldOfView__double_double_double_double();

		/**
		 * The meta object literal for the '<em><b>Create Rectangular Frustrum Field Of View</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FOV_FACADE___CREATE_RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW__RECTANGULARFRUSTRUMFIELDOFVIEW = eINSTANCE.getFOVFacade__CreateRectangularFrustrumFieldOfView__RectangularFrustrumFieldOfView();

		/**
		 * The meta object literal for the '<em><b>Create Conical Field Of View</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FOV_FACADE___CREATE_CONICAL_FIELD_OF_VIEW__DOUBLE_DOUBLE_DOUBLE = eINSTANCE.getFOVFacade__CreateConicalFieldOfView__double_double_double();

		/**
		 * The meta object literal for the '<em><b>Create Conical Field Of View</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FOV_FACADE___CREATE_CONICAL_FIELD_OF_VIEW__CONICALFIELDOFVIEW = eINSTANCE.getFOVFacade__CreateConicalFieldOfView__ConicalFieldOfView();

		/**
		 * The meta object literal for the '<em><b>Create Circular Sector Field Of View</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FOV_FACADE___CREATE_CIRCULAR_SECTOR_FIELD_OF_VIEW__DOUBLE_DOUBLE_DOUBLE_DOUBLE = eINSTANCE.getFOVFacade__CreateCircularSectorFieldOfView__double_double_double_double();

		/**
		 * The meta object literal for the '<em><b>Create Circular Sector Field Of View</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FOV_FACADE___CREATE_CIRCULAR_SECTOR_FIELD_OF_VIEW__CIRCULARSECTORFIELDOFVIEW = eINSTANCE.getFOVFacade__CreateCircularSectorFieldOfView__CircularSectorFieldOfView();

	}

} //FovPackage
