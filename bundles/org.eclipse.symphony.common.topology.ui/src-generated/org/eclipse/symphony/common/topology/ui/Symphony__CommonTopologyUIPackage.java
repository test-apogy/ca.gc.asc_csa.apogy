/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.topology.ui;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.eclipse.symphony.common.topology.ui.Symphony__CommonTopologyUIFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='Symphony__CommonTopologyUI' childCreationExtenders='true' extensibleProviderFactory='true' multipleEditorPages='false' copyrightText='Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)' modelName='Symphony__CommonTopologyUI' complianceLevel='6.0' modelDirectory='/org.eclipse.symphony.common.topology.ui/src-generated' editDirectory='/org.eclipse.symphony.common.topology.ui.edit/src-generated' testsDirectory='/org.eclipse.symphony.common.topology.ui.tests/src-generated' basePackage='org.eclipse.symphony.common.topology'"
 * @generated
 */
public interface Symphony__CommonTopologyUIPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ui";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "org.eclipse.symphony.common.topology.ui";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ui";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Symphony__CommonTopologyUIPackage eINSTANCE = org.eclipse.symphony.common.topology.ui.impl.Symphony__CommonTopologyUIPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.topology.ui.impl.TopologyPresentationRegistryImpl <em>Topology Presentation Registry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.topology.ui.impl.TopologyPresentationRegistryImpl
	 * @see org.eclipse.symphony.common.topology.ui.impl.Symphony__CommonTopologyUIPackageImpl#getTopologyPresentationRegistry()
	 * @generated
	 */
	int TOPOLOGY_PRESENTATION_REGISTRY = 0;

	/**
	 * The feature id for the '<em><b>Topology Presentation Set List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_PRESENTATION_REGISTRY__TOPOLOGY_PRESENTATION_SET_LIST = 0;

	/**
	 * The feature id for the '<em><b>Node Presentation List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_PRESENTATION_REGISTRY__NODE_PRESENTATION_LIST = 1;

	/**
	 * The number of structural features of the '<em>Topology Presentation Registry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_PRESENTATION_REGISTRY_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Create Topology Presentation Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_PRESENTATION_REGISTRY___CREATE_TOPOLOGY_PRESENTATION_SET__NODE = 0;

	/**
	 * The operation id for the '<em>Release</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_PRESENTATION_REGISTRY___RELEASE__TOPOLOGYPRESENTATIONSET = 1;

	/**
	 * The operation id for the '<em>Get Presentation Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_PRESENTATION_REGISTRY___GET_PRESENTATION_NODE__NODE = 2;

	/**
	 * The number of operations of the '<em>Topology Presentation Registry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_PRESENTATION_REGISTRY_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.topology.ui.impl.GraphicsContextImpl <em>Graphics Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.topology.ui.impl.GraphicsContextImpl
	 * @see org.eclipse.symphony.common.topology.ui.impl.Symphony__CommonTopologyUIPackageImpl#getGraphicsContext()
	 * @generated
	 */
	int GRAPHICS_CONTEXT = 1;

	/**
	 * The feature id for the '<em><b>Topology</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICS_CONTEXT__TOPOLOGY = 0;

	/**
	 * The feature id for the '<em><b>Topology Presentation Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICS_CONTEXT__TOPOLOGY_PRESENTATION_SET = 1;

	/**
	 * The number of structural features of the '<em>Graphics Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICS_CONTEXT_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICS_CONTEXT___DISPOSE = 0;

	/**
	 * The number of operations of the '<em>Graphics Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICS_CONTEXT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.topology.ui.impl.NodeSelectionImpl <em>Node Selection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.topology.ui.impl.NodeSelectionImpl
	 * @see org.eclipse.symphony.common.topology.ui.impl.Symphony__CommonTopologyUIPackageImpl#getNodeSelection()
	 * @generated
	 */
	int NODE_SELECTION = 2;

	/**
	 * The feature id for the '<em><b>Topology Presentation Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SELECTION__TOPOLOGY_PRESENTATION_SET = 0;

	/**
	 * The feature id for the '<em><b>Selected Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SELECTION__SELECTED_NODE = 1;

	/**
	 * The feature id for the '<em><b>Node Presentation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SELECTION__NODE_PRESENTATION = 2;

	/**
	 * The feature id for the '<em><b>Relative Intersection Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SELECTION__RELATIVE_INTERSECTION_POINT = 3;

	/**
	 * The feature id for the '<em><b>Absolute Intersection Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SELECTION__ABSOLUTE_INTERSECTION_POINT = 4;

	/**
	 * The feature id for the '<em><b>Relative Intersection Normal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SELECTION__RELATIVE_INTERSECTION_NORMAL = 5;

	/**
	 * The feature id for the '<em><b>Absolute Intersection Normal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SELECTION__ABSOLUTE_INTERSECTION_NORMAL = 6;

	/**
	 * The number of structural features of the '<em>Node Selection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SELECTION_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Node Selection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SELECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.topology.ui.impl.TopologyPresentationSetImpl <em>Topology Presentation Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.topology.ui.impl.TopologyPresentationSetImpl
	 * @see org.eclipse.symphony.common.topology.ui.impl.Symphony__CommonTopologyUIPackageImpl#getTopologyPresentationSet()
	 * @generated
	 */
	int TOPOLOGY_PRESENTATION_SET = 3;

	/**
	 * The feature id for the '<em><b>Topology Presentation Registry</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_PRESENTATION_SET__TOPOLOGY_PRESENTATION_REGISTRY = 0;

	/**
	 * The feature id for the '<em><b>Graphics Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_PRESENTATION_SET__GRAPHICS_CONTEXT = 1;

	/**
	 * The feature id for the '<em><b>Node Presentation List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_PRESENTATION_SET__NODE_PRESENTATION_LIST = 2;

	/**
	 * The number of structural features of the '<em>Topology Presentation Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_PRESENTATION_SET_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Get Presentation Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_PRESENTATION_SET___GET_PRESENTATION_NODE__NODE = 0;

	/**
	 * The operation id for the '<em>Get Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_PRESENTATION_SET___GET_NODES = 1;

	/**
	 * The number of operations of the '<em>Topology Presentation Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_PRESENTATION_SET_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.topology.ui.impl.NodePresentationImpl <em>Node Presentation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.topology.ui.impl.NodePresentationImpl
	 * @see org.eclipse.symphony.common.topology.ui.impl.Symphony__CommonTopologyUIPackageImpl#getNodePresentation()
	 * @generated
	 */
	int NODE_PRESENTATION = 4;

	/**
	 * The feature id for the '<em><b>Topology Presentation Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_PRESENTATION__TOPOLOGY_PRESENTATION_SET = 0;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_PRESENTATION__NODE = 1;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_PRESENTATION__COLOR = 2;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_PRESENTATION__VISIBLE = 3;

	/**
	 * The feature id for the '<em><b>Shadow Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_PRESENTATION__SHADOW_MODE = 4;

	/**
	 * The feature id for the '<em><b>Use In Bounding Calculation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_PRESENTATION__USE_IN_BOUNDING_CALCULATION = 5;

	/**
	 * The feature id for the '<em><b>Centroid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_PRESENTATION__CENTROID = 6;

	/**
	 * The feature id for the '<em><b>Min</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_PRESENTATION__MIN = 7;

	/**
	 * The feature id for the '<em><b>Max</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_PRESENTATION__MAX = 8;

	/**
	 * The feature id for the '<em><b>XRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_PRESENTATION__XRANGE = 9;

	/**
	 * The feature id for the '<em><b>YRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_PRESENTATION__YRANGE = 10;

	/**
	 * The feature id for the '<em><b>ZRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_PRESENTATION__ZRANGE = 11;

	/**
	 * The feature id for the '<em><b>Scene Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_PRESENTATION__SCENE_OBJECT = 12;

	/**
	 * The number of structural features of the '<em>Node Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_PRESENTATION_FEATURE_COUNT = 13;

	/**
	 * The number of operations of the '<em>Node Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_PRESENTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.topology.ui.impl.TransformNodePresentationImpl <em>Transform Node Presentation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.topology.ui.impl.TransformNodePresentationImpl
	 * @see org.eclipse.symphony.common.topology.ui.impl.Symphony__CommonTopologyUIPackageImpl#getTransformNodePresentation()
	 * @generated
	 */
	int TRANSFORM_NODE_PRESENTATION = 5;

	/**
	 * The feature id for the '<em><b>Topology Presentation Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_NODE_PRESENTATION__TOPOLOGY_PRESENTATION_SET = NODE_PRESENTATION__TOPOLOGY_PRESENTATION_SET;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_NODE_PRESENTATION__NODE = NODE_PRESENTATION__NODE;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_NODE_PRESENTATION__COLOR = NODE_PRESENTATION__COLOR;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_NODE_PRESENTATION__VISIBLE = NODE_PRESENTATION__VISIBLE;

	/**
	 * The feature id for the '<em><b>Shadow Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_NODE_PRESENTATION__SHADOW_MODE = NODE_PRESENTATION__SHADOW_MODE;

	/**
	 * The feature id for the '<em><b>Use In Bounding Calculation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_NODE_PRESENTATION__USE_IN_BOUNDING_CALCULATION = NODE_PRESENTATION__USE_IN_BOUNDING_CALCULATION;

	/**
	 * The feature id for the '<em><b>Centroid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_NODE_PRESENTATION__CENTROID = NODE_PRESENTATION__CENTROID;

	/**
	 * The feature id for the '<em><b>Min</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_NODE_PRESENTATION__MIN = NODE_PRESENTATION__MIN;

	/**
	 * The feature id for the '<em><b>Max</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_NODE_PRESENTATION__MAX = NODE_PRESENTATION__MAX;

	/**
	 * The feature id for the '<em><b>XRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_NODE_PRESENTATION__XRANGE = NODE_PRESENTATION__XRANGE;

	/**
	 * The feature id for the '<em><b>YRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_NODE_PRESENTATION__YRANGE = NODE_PRESENTATION__YRANGE;

	/**
	 * The feature id for the '<em><b>ZRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_NODE_PRESENTATION__ZRANGE = NODE_PRESENTATION__ZRANGE;

	/**
	 * The feature id for the '<em><b>Scene Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_NODE_PRESENTATION__SCENE_OBJECT = NODE_PRESENTATION__SCENE_OBJECT;

	/**
	 * The feature id for the '<em><b>Axis Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_NODE_PRESENTATION__AXIS_VISIBLE = NODE_PRESENTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Axis Lenght</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_NODE_PRESENTATION__AXIS_LENGHT = NODE_PRESENTATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Transform Node Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_NODE_PRESENTATION_FEATURE_COUNT = NODE_PRESENTATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Transform Node Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_NODE_PRESENTATION_OPERATION_COUNT = NODE_PRESENTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.topology.ui.impl.RotationNodePresentationImpl <em>Rotation Node Presentation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.topology.ui.impl.RotationNodePresentationImpl
	 * @see org.eclipse.symphony.common.topology.ui.impl.Symphony__CommonTopologyUIPackageImpl#getRotationNodePresentation()
	 * @generated
	 */
	int ROTATION_NODE_PRESENTATION = 6;

	/**
	 * The feature id for the '<em><b>Topology Presentation Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION_NODE_PRESENTATION__TOPOLOGY_PRESENTATION_SET = NODE_PRESENTATION__TOPOLOGY_PRESENTATION_SET;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION_NODE_PRESENTATION__NODE = NODE_PRESENTATION__NODE;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION_NODE_PRESENTATION__COLOR = NODE_PRESENTATION__COLOR;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION_NODE_PRESENTATION__VISIBLE = NODE_PRESENTATION__VISIBLE;

	/**
	 * The feature id for the '<em><b>Shadow Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION_NODE_PRESENTATION__SHADOW_MODE = NODE_PRESENTATION__SHADOW_MODE;

	/**
	 * The feature id for the '<em><b>Use In Bounding Calculation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION_NODE_PRESENTATION__USE_IN_BOUNDING_CALCULATION = NODE_PRESENTATION__USE_IN_BOUNDING_CALCULATION;

	/**
	 * The feature id for the '<em><b>Centroid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION_NODE_PRESENTATION__CENTROID = NODE_PRESENTATION__CENTROID;

	/**
	 * The feature id for the '<em><b>Min</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION_NODE_PRESENTATION__MIN = NODE_PRESENTATION__MIN;

	/**
	 * The feature id for the '<em><b>Max</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION_NODE_PRESENTATION__MAX = NODE_PRESENTATION__MAX;

	/**
	 * The feature id for the '<em><b>XRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION_NODE_PRESENTATION__XRANGE = NODE_PRESENTATION__XRANGE;

	/**
	 * The feature id for the '<em><b>YRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION_NODE_PRESENTATION__YRANGE = NODE_PRESENTATION__YRANGE;

	/**
	 * The feature id for the '<em><b>ZRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION_NODE_PRESENTATION__ZRANGE = NODE_PRESENTATION__ZRANGE;

	/**
	 * The feature id for the '<em><b>Scene Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION_NODE_PRESENTATION__SCENE_OBJECT = NODE_PRESENTATION__SCENE_OBJECT;

	/**
	 * The feature id for the '<em><b>Axis Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION_NODE_PRESENTATION__AXIS_VISIBLE = NODE_PRESENTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Axis Lenght</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION_NODE_PRESENTATION__AXIS_LENGHT = NODE_PRESENTATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rotation Node Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION_NODE_PRESENTATION_FEATURE_COUNT = NODE_PRESENTATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Rotation Node Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION_NODE_PRESENTATION_OPERATION_COUNT = NODE_PRESENTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.topology.ui.impl.PositionNodePresentationImpl <em>Position Node Presentation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.topology.ui.impl.PositionNodePresentationImpl
	 * @see org.eclipse.symphony.common.topology.ui.impl.Symphony__CommonTopologyUIPackageImpl#getPositionNodePresentation()
	 * @generated
	 */
	int POSITION_NODE_PRESENTATION = 7;

	/**
	 * The feature id for the '<em><b>Topology Presentation Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_NODE_PRESENTATION__TOPOLOGY_PRESENTATION_SET = NODE_PRESENTATION__TOPOLOGY_PRESENTATION_SET;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_NODE_PRESENTATION__NODE = NODE_PRESENTATION__NODE;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_NODE_PRESENTATION__COLOR = NODE_PRESENTATION__COLOR;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_NODE_PRESENTATION__VISIBLE = NODE_PRESENTATION__VISIBLE;

	/**
	 * The feature id for the '<em><b>Shadow Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_NODE_PRESENTATION__SHADOW_MODE = NODE_PRESENTATION__SHADOW_MODE;

	/**
	 * The feature id for the '<em><b>Use In Bounding Calculation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_NODE_PRESENTATION__USE_IN_BOUNDING_CALCULATION = NODE_PRESENTATION__USE_IN_BOUNDING_CALCULATION;

	/**
	 * The feature id for the '<em><b>Centroid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_NODE_PRESENTATION__CENTROID = NODE_PRESENTATION__CENTROID;

	/**
	 * The feature id for the '<em><b>Min</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_NODE_PRESENTATION__MIN = NODE_PRESENTATION__MIN;

	/**
	 * The feature id for the '<em><b>Max</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_NODE_PRESENTATION__MAX = NODE_PRESENTATION__MAX;

	/**
	 * The feature id for the '<em><b>XRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_NODE_PRESENTATION__XRANGE = NODE_PRESENTATION__XRANGE;

	/**
	 * The feature id for the '<em><b>YRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_NODE_PRESENTATION__YRANGE = NODE_PRESENTATION__YRANGE;

	/**
	 * The feature id for the '<em><b>ZRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_NODE_PRESENTATION__ZRANGE = NODE_PRESENTATION__ZRANGE;

	/**
	 * The feature id for the '<em><b>Scene Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_NODE_PRESENTATION__SCENE_OBJECT = NODE_PRESENTATION__SCENE_OBJECT;

	/**
	 * The feature id for the '<em><b>Axis Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_NODE_PRESENTATION__AXIS_VISIBLE = NODE_PRESENTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Axis Lenght</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_NODE_PRESENTATION__AXIS_LENGHT = NODE_PRESENTATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Position Node Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_NODE_PRESENTATION_FEATURE_COUNT = NODE_PRESENTATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Position Node Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_NODE_PRESENTATION_OPERATION_COUNT = NODE_PRESENTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.topology.ui.impl.URLNodePresentationImpl <em>URL Node Presentation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.topology.ui.impl.URLNodePresentationImpl
	 * @see org.eclipse.symphony.common.topology.ui.impl.Symphony__CommonTopologyUIPackageImpl#getURLNodePresentation()
	 * @generated
	 */
	int URL_NODE_PRESENTATION = 8;

	/**
	 * The feature id for the '<em><b>Topology Presentation Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_NODE_PRESENTATION__TOPOLOGY_PRESENTATION_SET = NODE_PRESENTATION__TOPOLOGY_PRESENTATION_SET;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_NODE_PRESENTATION__NODE = NODE_PRESENTATION__NODE;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_NODE_PRESENTATION__COLOR = NODE_PRESENTATION__COLOR;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_NODE_PRESENTATION__VISIBLE = NODE_PRESENTATION__VISIBLE;

	/**
	 * The feature id for the '<em><b>Shadow Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_NODE_PRESENTATION__SHADOW_MODE = NODE_PRESENTATION__SHADOW_MODE;

	/**
	 * The feature id for the '<em><b>Use In Bounding Calculation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_NODE_PRESENTATION__USE_IN_BOUNDING_CALCULATION = NODE_PRESENTATION__USE_IN_BOUNDING_CALCULATION;

	/**
	 * The feature id for the '<em><b>Centroid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_NODE_PRESENTATION__CENTROID = NODE_PRESENTATION__CENTROID;

	/**
	 * The feature id for the '<em><b>Min</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_NODE_PRESENTATION__MIN = NODE_PRESENTATION__MIN;

	/**
	 * The feature id for the '<em><b>Max</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_NODE_PRESENTATION__MAX = NODE_PRESENTATION__MAX;

	/**
	 * The feature id for the '<em><b>XRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_NODE_PRESENTATION__XRANGE = NODE_PRESENTATION__XRANGE;

	/**
	 * The feature id for the '<em><b>YRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_NODE_PRESENTATION__YRANGE = NODE_PRESENTATION__YRANGE;

	/**
	 * The feature id for the '<em><b>ZRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_NODE_PRESENTATION__ZRANGE = NODE_PRESENTATION__ZRANGE;

	/**
	 * The feature id for the '<em><b>Scene Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_NODE_PRESENTATION__SCENE_OBJECT = NODE_PRESENTATION__SCENE_OBJECT;

	/**
	 * The feature id for the '<em><b>Axis Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_NODE_PRESENTATION__AXIS_VISIBLE = NODE_PRESENTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Axis Lenght</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_NODE_PRESENTATION__AXIS_LENGHT = NODE_PRESENTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Presentation Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_NODE_PRESENTATION__PRESENTATION_MODE = NODE_PRESENTATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>URL Node Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_NODE_PRESENTATION_FEATURE_COUNT = NODE_PRESENTATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>URL Node Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_NODE_PRESENTATION_OPERATION_COUNT = NODE_PRESENTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.topology.ui.impl.Symphony__CommonTopologyUIFacadeImpl <em>Facade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.topology.ui.impl.Symphony__CommonTopologyUIFacadeImpl
	 * @see org.eclipse.symphony.common.topology.ui.impl.Symphony__CommonTopologyUIPackageImpl#getSymphony__CommonTopologyUIFacade()
	 * @generated
	 */
	int SYMPHONY_COMMON_TOPOLOGY_UI_FACADE = 9;

	/**
	 * The number of structural features of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_COMMON_TOPOLOGY_UI_FACADE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Create Graphics Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_COMMON_TOPOLOGY_UI_FACADE___CREATE_GRAPHICS_CONTEXT__NODE = 0;

	/**
	 * The operation id for the '<em>Find Extent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_COMMON_TOPOLOGY_UI_FACADE___FIND_EXTENT__NODE_TOPOLOGYPRESENTATIONSET_TUPLE3D_TUPLE3D = 1;

	/**
	 * The operation id for the '<em>Create Node Selection</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_COMMON_TOPOLOGY_UI_FACADE___CREATE_NODE_SELECTION__TOPOLOGYPRESENTATIONSET_NODEPRESENTATION_POINT3D = 2;

	/**
	 * The operation id for the '<em>Create Node Selection</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_COMMON_TOPOLOGY_UI_FACADE___CREATE_NODE_SELECTION__TOPOLOGYPRESENTATIONSET_NODE_POINT3D_VECTOR3F = 3;

	/**
	 * The number of operations of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_COMMON_TOPOLOGY_UI_FACADE_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.topology.ui.ShadowMode <em>Shadow Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.topology.ui.ShadowMode
	 * @see org.eclipse.symphony.common.topology.ui.impl.Symphony__CommonTopologyUIPackageImpl#getShadowMode()
	 * @generated
	 */
	int SHADOW_MODE = 10;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.topology.ui.MeshPresentationMode <em>Mesh Presentation Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.topology.ui.MeshPresentationMode
	 * @see org.eclipse.symphony.common.topology.ui.impl.Symphony__CommonTopologyUIPackageImpl#getMeshPresentationMode()
	 * @generated
	 */
	int MESH_PRESENTATION_MODE = 11;

	/**
	 * The meta object id for the '<em>List</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.eclipse.symphony.common.topology.ui.impl.Symphony__CommonTopologyUIPackageImpl#getList()
	 * @generated
	 */
	int LIST = 12;

	/**
	 * The meta object id for the '<em>RGB</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.swt.graphics.RGB
	 * @see org.eclipse.symphony.common.topology.ui.impl.Symphony__CommonTopologyUIPackageImpl#getRGB()
	 * @generated
	 */
	int RGB = 13;

	/**
	 * The meta object id for the '<em>Point3d</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.vecmath.Point3d
	 * @see org.eclipse.symphony.common.topology.ui.impl.Symphony__CommonTopologyUIPackageImpl#getPoint3d()
	 * @generated
	 */
	int POINT3D = 14;

	/**
	 * The meta object id for the '<em>Vector3f</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.vecmath.Vector3f
	 * @see org.eclipse.symphony.common.topology.ui.impl.Symphony__CommonTopologyUIPackageImpl#getVector3f()
	 * @generated
	 */
	int VECTOR3F = 15;

	/**
	 * The meta object id for the '<em>Scene Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.topology.ui.SceneObject
	 * @see org.eclipse.symphony.common.topology.ui.impl.Symphony__CommonTopologyUIPackageImpl#getSceneObject()
	 * @generated
	 */
	int SCENE_OBJECT = 16;


	/**
	 * The meta object id for the '<em>Notification</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.notify.Notification
	 * @see org.eclipse.symphony.common.topology.ui.impl.Symphony__CommonTopologyUIPackageImpl#getNotification()
	 * @generated
	 */
	int NOTIFICATION = 17;


	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.topology.ui.TopologyPresentationRegistry <em>Topology Presentation Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Topology Presentation Registry</em>'.
	 * @see org.eclipse.symphony.common.topology.ui.TopologyPresentationRegistry
	 * @generated
	 */
	EClass getTopologyPresentationRegistry();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.symphony.common.topology.ui.TopologyPresentationRegistry#getTopologyPresentationSetList <em>Topology Presentation Set List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Topology Presentation Set List</em>'.
	 * @see org.eclipse.symphony.common.topology.ui.TopologyPresentationRegistry#getTopologyPresentationSetList()
	 * @see #getTopologyPresentationRegistry()
	 * @generated
	 */
	EReference getTopologyPresentationRegistry_TopologyPresentationSetList();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.symphony.common.topology.ui.TopologyPresentationRegistry#getNodePresentationList <em>Node Presentation List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Node Presentation List</em>'.
	 * @see org.eclipse.symphony.common.topology.ui.TopologyPresentationRegistry#getNodePresentationList()
	 * @see #getTopologyPresentationRegistry()
	 * @generated
	 */
	EReference getTopologyPresentationRegistry_NodePresentationList();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.topology.ui.TopologyPresentationRegistry#createTopologyPresentationSet(org.eclipse.symphony.common.topology.Node) <em>Create Topology Presentation Set</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Topology Presentation Set</em>' operation.
	 * @see org.eclipse.symphony.common.topology.ui.TopologyPresentationRegistry#createTopologyPresentationSet(org.eclipse.symphony.common.topology.Node)
	 * @generated
	 */
	EOperation getTopologyPresentationRegistry__CreateTopologyPresentationSet__Node();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.topology.ui.TopologyPresentationRegistry#release(org.eclipse.symphony.common.topology.ui.TopologyPresentationSet) <em>Release</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Release</em>' operation.
	 * @see org.eclipse.symphony.common.topology.ui.TopologyPresentationRegistry#release(org.eclipse.symphony.common.topology.ui.TopologyPresentationSet)
	 * @generated
	 */
	EOperation getTopologyPresentationRegistry__Release__TopologyPresentationSet();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.topology.ui.TopologyPresentationRegistry#getPresentationNode(org.eclipse.symphony.common.topology.Node) <em>Get Presentation Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Presentation Node</em>' operation.
	 * @see org.eclipse.symphony.common.topology.ui.TopologyPresentationRegistry#getPresentationNode(org.eclipse.symphony.common.topology.Node)
	 * @generated
	 */
	EOperation getTopologyPresentationRegistry__GetPresentationNode__Node();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.topology.ui.GraphicsContext <em>Graphics Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graphics Context</em>'.
	 * @see org.eclipse.symphony.common.topology.ui.GraphicsContext
	 * @generated
	 */
	EClass getGraphicsContext();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.common.topology.ui.GraphicsContext#getTopology <em>Topology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Topology</em>'.
	 * @see org.eclipse.symphony.common.topology.ui.GraphicsContext#getTopology()
	 * @see #getGraphicsContext()
	 * @generated
	 */
	EReference getGraphicsContext_Topology();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.common.topology.ui.GraphicsContext#getTopologyPresentationSet <em>Topology Presentation Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Topology Presentation Set</em>'.
	 * @see org.eclipse.symphony.common.topology.ui.GraphicsContext#getTopologyPresentationSet()
	 * @see #getGraphicsContext()
	 * @generated
	 */
	EReference getGraphicsContext_TopologyPresentationSet();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.topology.ui.GraphicsContext#dispose() <em>Dispose</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Dispose</em>' operation.
	 * @see org.eclipse.symphony.common.topology.ui.GraphicsContext#dispose()
	 * @generated
	 */
	EOperation getGraphicsContext__Dispose();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.topology.ui.NodeSelection <em>Node Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Selection</em>'.
	 * @see org.eclipse.symphony.common.topology.ui.NodeSelection
	 * @generated
	 */
	EClass getNodeSelection();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.common.topology.ui.NodeSelection#getTopologyPresentationSet <em>Topology Presentation Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Topology Presentation Set</em>'.
	 * @see org.eclipse.symphony.common.topology.ui.NodeSelection#getTopologyPresentationSet()
	 * @see #getNodeSelection()
	 * @generated
	 */
	EReference getNodeSelection_TopologyPresentationSet();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.common.topology.ui.NodeSelection#getSelectedNode <em>Selected Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Selected Node</em>'.
	 * @see org.eclipse.symphony.common.topology.ui.NodeSelection#getSelectedNode()
	 * @see #getNodeSelection()
	 * @generated
	 */
	EReference getNodeSelection_SelectedNode();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.common.topology.ui.NodeSelection#getNodePresentation <em>Node Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Node Presentation</em>'.
	 * @see org.eclipse.symphony.common.topology.ui.NodeSelection#getNodePresentation()
	 * @see #getNodeSelection()
	 * @generated
	 */
	EReference getNodeSelection_NodePresentation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.topology.ui.NodeSelection#getRelativeIntersectionPoint <em>Relative Intersection Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relative Intersection Point</em>'.
	 * @see org.eclipse.symphony.common.topology.ui.NodeSelection#getRelativeIntersectionPoint()
	 * @see #getNodeSelection()
	 * @generated
	 */
	EAttribute getNodeSelection_RelativeIntersectionPoint();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.topology.ui.NodeSelection#getAbsoluteIntersectionPoint <em>Absolute Intersection Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Absolute Intersection Point</em>'.
	 * @see org.eclipse.symphony.common.topology.ui.NodeSelection#getAbsoluteIntersectionPoint()
	 * @see #getNodeSelection()
	 * @generated
	 */
	EAttribute getNodeSelection_AbsoluteIntersectionPoint();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.topology.ui.NodeSelection#getRelativeIntersectionNormal <em>Relative Intersection Normal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relative Intersection Normal</em>'.
	 * @see org.eclipse.symphony.common.topology.ui.NodeSelection#getRelativeIntersectionNormal()
	 * @see #getNodeSelection()
	 * @generated
	 */
	EAttribute getNodeSelection_RelativeIntersectionNormal();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.topology.ui.NodeSelection#getAbsoluteIntersectionNormal <em>Absolute Intersection Normal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Absolute Intersection Normal</em>'.
	 * @see org.eclipse.symphony.common.topology.ui.NodeSelection#getAbsoluteIntersectionNormal()
	 * @see #getNodeSelection()
	 * @generated
	 */
	EAttribute getNodeSelection_AbsoluteIntersectionNormal();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.topology.ui.TopologyPresentationSet <em>Topology Presentation Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Topology Presentation Set</em>'.
	 * @see org.eclipse.symphony.common.topology.ui.TopologyPresentationSet
	 * @generated
	 */
	EClass getTopologyPresentationSet();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.symphony.common.topology.ui.TopologyPresentationSet#getTopologyPresentationRegistry <em>Topology Presentation Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Topology Presentation Registry</em>'.
	 * @see org.eclipse.symphony.common.topology.ui.TopologyPresentationSet#getTopologyPresentationRegistry()
	 * @see #getTopologyPresentationSet()
	 * @generated
	 */
	EReference getTopologyPresentationSet_TopologyPresentationRegistry();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.common.topology.ui.TopologyPresentationSet#getGraphicsContext <em>Graphics Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Graphics Context</em>'.
	 * @see org.eclipse.symphony.common.topology.ui.TopologyPresentationSet#getGraphicsContext()
	 * @see #getTopologyPresentationSet()
	 * @generated
	 */
	EReference getTopologyPresentationSet_GraphicsContext();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.symphony.common.topology.ui.TopologyPresentationSet#getNodePresentationList <em>Node Presentation List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Node Presentation List</em>'.
	 * @see org.eclipse.symphony.common.topology.ui.TopologyPresentationSet#getNodePresentationList()
	 * @see #getTopologyPresentationSet()
	 * @generated
	 */
	EReference getTopologyPresentationSet_NodePresentationList();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.topology.ui.TopologyPresentationSet#getPresentationNode(org.eclipse.symphony.common.topology.Node) <em>Get Presentation Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Presentation Node</em>' operation.
	 * @see org.eclipse.symphony.common.topology.ui.TopologyPresentationSet#getPresentationNode(org.eclipse.symphony.common.topology.Node)
	 * @generated
	 */
	EOperation getTopologyPresentationSet__GetPresentationNode__Node();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.topology.ui.TopologyPresentationSet#getNodes() <em>Get Nodes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Nodes</em>' operation.
	 * @see org.eclipse.symphony.common.topology.ui.TopologyPresentationSet#getNodes()
	 * @generated
	 */
	EOperation getTopologyPresentationSet__GetNodes();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.topology.ui.NodePresentation <em>Node Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Presentation</em>'.
	 * @see org.eclipse.symphony.common.topology.ui.NodePresentation
	 * @generated
	 */
	EClass getNodePresentation();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.symphony.common.topology.ui.NodePresentation#getTopologyPresentationSet <em>Topology Presentation Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Topology Presentation Set</em>'.
	 * @see org.eclipse.symphony.common.topology.ui.NodePresentation#getTopologyPresentationSet()
	 * @see #getNodePresentation()
	 * @generated
	 */
	EReference getNodePresentation_TopologyPresentationSet();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.common.topology.ui.NodePresentation#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Node</em>'.
	 * @see org.eclipse.symphony.common.topology.ui.NodePresentation#getNode()
	 * @see #getNodePresentation()
	 * @generated
	 */
	EReference getNodePresentation_Node();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.topology.ui.NodePresentation#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see org.eclipse.symphony.common.topology.ui.NodePresentation#getColor()
	 * @see #getNodePresentation()
	 * @generated
	 */
	EAttribute getNodePresentation_Color();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.topology.ui.NodePresentation#isVisible <em>Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visible</em>'.
	 * @see org.eclipse.symphony.common.topology.ui.NodePresentation#isVisible()
	 * @see #getNodePresentation()
	 * @generated
	 */
	EAttribute getNodePresentation_Visible();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.topology.ui.NodePresentation#isUseInBoundingCalculation <em>Use In Bounding Calculation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use In Bounding Calculation</em>'.
	 * @see org.eclipse.symphony.common.topology.ui.NodePresentation#isUseInBoundingCalculation()
	 * @see #getNodePresentation()
	 * @generated
	 */
	EAttribute getNodePresentation_UseInBoundingCalculation();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.common.topology.ui.NodePresentation#getCentroid <em>Centroid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Centroid</em>'.
	 * @see org.eclipse.symphony.common.topology.ui.NodePresentation#getCentroid()
	 * @see #getNodePresentation()
	 * @generated
	 */
	EReference getNodePresentation_Centroid();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.common.topology.ui.NodePresentation#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Min</em>'.
	 * @see org.eclipse.symphony.common.topology.ui.NodePresentation#getMin()
	 * @see #getNodePresentation()
	 * @generated
	 */
	EReference getNodePresentation_Min();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.common.topology.ui.NodePresentation#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Max</em>'.
	 * @see org.eclipse.symphony.common.topology.ui.NodePresentation#getMax()
	 * @see #getNodePresentation()
	 * @generated
	 */
	EReference getNodePresentation_Max();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.topology.ui.NodePresentation#getXRange <em>XRange</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XRange</em>'.
	 * @see org.eclipse.symphony.common.topology.ui.NodePresentation#getXRange()
	 * @see #getNodePresentation()
	 * @generated
	 */
	EAttribute getNodePresentation_XRange();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.topology.ui.NodePresentation#getYRange <em>YRange</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YRange</em>'.
	 * @see org.eclipse.symphony.common.topology.ui.NodePresentation#getYRange()
	 * @see #getNodePresentation()
	 * @generated
	 */
	EAttribute getNodePresentation_YRange();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.topology.ui.NodePresentation#getZRange <em>ZRange</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ZRange</em>'.
	 * @see org.eclipse.symphony.common.topology.ui.NodePresentation#getZRange()
	 * @see #getNodePresentation()
	 * @generated
	 */
	EAttribute getNodePresentation_ZRange();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.topology.ui.NodePresentation#getSceneObject <em>Scene Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scene Object</em>'.
	 * @see org.eclipse.symphony.common.topology.ui.NodePresentation#getSceneObject()
	 * @see #getNodePresentation()
	 * @generated
	 */
	EAttribute getNodePresentation_SceneObject();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.topology.ui.NodePresentation#getShadowMode <em>Shadow Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shadow Mode</em>'.
	 * @see org.eclipse.symphony.common.topology.ui.NodePresentation#getShadowMode()
	 * @see #getNodePresentation()
	 * @generated
	 */
	EAttribute getNodePresentation_ShadowMode();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.topology.ui.TransformNodePresentation <em>Transform Node Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transform Node Presentation</em>'.
	 * @see org.eclipse.symphony.common.topology.ui.TransformNodePresentation
	 * @generated
	 */
	EClass getTransformNodePresentation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.topology.ui.TransformNodePresentation#isAxisVisible <em>Axis Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Axis Visible</em>'.
	 * @see org.eclipse.symphony.common.topology.ui.TransformNodePresentation#isAxisVisible()
	 * @see #getTransformNodePresentation()
	 * @generated
	 */
	EAttribute getTransformNodePresentation_AxisVisible();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.topology.ui.TransformNodePresentation#getAxisLenght <em>Axis Lenght</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Axis Lenght</em>'.
	 * @see org.eclipse.symphony.common.topology.ui.TransformNodePresentation#getAxisLenght()
	 * @see #getTransformNodePresentation()
	 * @generated
	 */
	EAttribute getTransformNodePresentation_AxisLenght();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.topology.ui.RotationNodePresentation <em>Rotation Node Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rotation Node Presentation</em>'.
	 * @see org.eclipse.symphony.common.topology.ui.RotationNodePresentation
	 * @generated
	 */
	EClass getRotationNodePresentation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.topology.ui.RotationNodePresentation#isAxisVisible <em>Axis Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Axis Visible</em>'.
	 * @see org.eclipse.symphony.common.topology.ui.RotationNodePresentation#isAxisVisible()
	 * @see #getRotationNodePresentation()
	 * @generated
	 */
	EAttribute getRotationNodePresentation_AxisVisible();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.topology.ui.RotationNodePresentation#getAxisLenght <em>Axis Lenght</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Axis Lenght</em>'.
	 * @see org.eclipse.symphony.common.topology.ui.RotationNodePresentation#getAxisLenght()
	 * @see #getRotationNodePresentation()
	 * @generated
	 */
	EAttribute getRotationNodePresentation_AxisLenght();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.topology.ui.PositionNodePresentation <em>Position Node Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Position Node Presentation</em>'.
	 * @see org.eclipse.symphony.common.topology.ui.PositionNodePresentation
	 * @generated
	 */
	EClass getPositionNodePresentation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.topology.ui.PositionNodePresentation#isAxisVisible <em>Axis Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Axis Visible</em>'.
	 * @see org.eclipse.symphony.common.topology.ui.PositionNodePresentation#isAxisVisible()
	 * @see #getPositionNodePresentation()
	 * @generated
	 */
	EAttribute getPositionNodePresentation_AxisVisible();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.topology.ui.PositionNodePresentation#getAxisLenght <em>Axis Lenght</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Axis Lenght</em>'.
	 * @see org.eclipse.symphony.common.topology.ui.PositionNodePresentation#getAxisLenght()
	 * @see #getPositionNodePresentation()
	 * @generated
	 */
	EAttribute getPositionNodePresentation_AxisLenght();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.topology.ui.URLNodePresentation <em>URL Node Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>URL Node Presentation</em>'.
	 * @see org.eclipse.symphony.common.topology.ui.URLNodePresentation
	 * @generated
	 */
	EClass getURLNodePresentation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.topology.ui.URLNodePresentation#isAxisVisible <em>Axis Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Axis Visible</em>'.
	 * @see org.eclipse.symphony.common.topology.ui.URLNodePresentation#isAxisVisible()
	 * @see #getURLNodePresentation()
	 * @generated
	 */
	EAttribute getURLNodePresentation_AxisVisible();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.topology.ui.URLNodePresentation#getAxisLenght <em>Axis Lenght</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Axis Lenght</em>'.
	 * @see org.eclipse.symphony.common.topology.ui.URLNodePresentation#getAxisLenght()
	 * @see #getURLNodePresentation()
	 * @generated
	 */
	EAttribute getURLNodePresentation_AxisLenght();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.topology.ui.URLNodePresentation#getPresentationMode <em>Presentation Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Presentation Mode</em>'.
	 * @see org.eclipse.symphony.common.topology.ui.URLNodePresentation#getPresentationMode()
	 * @see #getURLNodePresentation()
	 * @generated
	 */
	EAttribute getURLNodePresentation_PresentationMode();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.topology.ui.Symphony__CommonTopologyUIFacade <em>Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facade</em>'.
	 * @see org.eclipse.symphony.common.topology.ui.Symphony__CommonTopologyUIFacade
	 * @generated
	 */
	EClass getSymphony__CommonTopologyUIFacade();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.topology.ui.Symphony__CommonTopologyUIFacade#createGraphicsContext(org.eclipse.symphony.common.topology.Node) <em>Create Graphics Context</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Graphics Context</em>' operation.
	 * @see org.eclipse.symphony.common.topology.ui.Symphony__CommonTopologyUIFacade#createGraphicsContext(org.eclipse.symphony.common.topology.Node)
	 * @generated
	 */
	EOperation getSymphony__CommonTopologyUIFacade__CreateGraphicsContext__Node();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.topology.ui.Symphony__CommonTopologyUIFacade#findExtent(org.eclipse.symphony.common.topology.Node, org.eclipse.symphony.common.topology.ui.TopologyPresentationSet, org.eclipse.symphony.common.math.Tuple3d, org.eclipse.symphony.common.math.Tuple3d) <em>Find Extent</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Extent</em>' operation.
	 * @see org.eclipse.symphony.common.topology.ui.Symphony__CommonTopologyUIFacade#findExtent(org.eclipse.symphony.common.topology.Node, org.eclipse.symphony.common.topology.ui.TopologyPresentationSet, org.eclipse.symphony.common.math.Tuple3d, org.eclipse.symphony.common.math.Tuple3d)
	 * @generated
	 */
	EOperation getSymphony__CommonTopologyUIFacade__FindExtent__Node_TopologyPresentationSet_Tuple3d_Tuple3d();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.topology.ui.Symphony__CommonTopologyUIFacade#createNodeSelection(org.eclipse.symphony.common.topology.ui.TopologyPresentationSet, org.eclipse.symphony.common.topology.ui.NodePresentation, javax.vecmath.Point3d) <em>Create Node Selection</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Node Selection</em>' operation.
	 * @see org.eclipse.symphony.common.topology.ui.Symphony__CommonTopologyUIFacade#createNodeSelection(org.eclipse.symphony.common.topology.ui.TopologyPresentationSet, org.eclipse.symphony.common.topology.ui.NodePresentation, javax.vecmath.Point3d)
	 * @generated
	 */
	EOperation getSymphony__CommonTopologyUIFacade__CreateNodeSelection__TopologyPresentationSet_NodePresentation_Point3d();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.topology.ui.Symphony__CommonTopologyUIFacade#createNodeSelection(org.eclipse.symphony.common.topology.ui.TopologyPresentationSet, org.eclipse.symphony.common.topology.Node, javax.vecmath.Point3d, javax.vecmath.Vector3f) <em>Create Node Selection</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Node Selection</em>' operation.
	 * @see org.eclipse.symphony.common.topology.ui.Symphony__CommonTopologyUIFacade#createNodeSelection(org.eclipse.symphony.common.topology.ui.TopologyPresentationSet, org.eclipse.symphony.common.topology.Node, javax.vecmath.Point3d, javax.vecmath.Vector3f)
	 * @generated
	 */
	EOperation getSymphony__CommonTopologyUIFacade__CreateNodeSelection__TopologyPresentationSet_Node_Point3d_Vector3f();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.symphony.common.topology.ui.ShadowMode <em>Shadow Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Shadow Mode</em>'.
	 * @see org.eclipse.symphony.common.topology.ui.ShadowMode
	 * @generated
	 */
	EEnum getShadowMode();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.symphony.common.topology.ui.MeshPresentationMode <em>Mesh Presentation Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Mesh Presentation Mode</em>'.
	 * @see org.eclipse.symphony.common.topology.ui.MeshPresentationMode
	 * @generated
	 */
	EEnum getMeshPresentationMode();

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
	 * Returns the meta object for data type '{@link org.eclipse.swt.graphics.RGB <em>RGB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>RGB</em>'.
	 * @see org.eclipse.swt.graphics.RGB
	 * @model instanceClass="org.eclipse.swt.graphics.RGB"
	 * @generated
	 */
	EDataType getRGB();

	/**
	 * Returns the meta object for data type '{@link javax.vecmath.Point3d <em>Point3d</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Point3d</em>'.
	 * @see javax.vecmath.Point3d
	 * @model instanceClass="javax.vecmath.Point3d"
	 * @generated
	 */
	EDataType getPoint3d();

	/**
	 * Returns the meta object for data type '{@link javax.vecmath.Vector3f <em>Vector3f</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Vector3f</em>'.
	 * @see javax.vecmath.Vector3f
	 * @model instanceClass="javax.vecmath.Vector3f"
	 * @generated
	 */
	EDataType getVector3f();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.symphony.common.topology.ui.SceneObject <em>Scene Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Scene Object</em>'.
	 * @see org.eclipse.symphony.common.topology.ui.SceneObject
	 * @model instanceClass="org.eclipse.symphony.common.topology.ui.SceneObject"
	 * @generated
	 */
	EDataType getSceneObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.common.notify.Notification <em>Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Notification</em>'.
	 * @see org.eclipse.emf.common.notify.Notification
	 * @model instanceClass="org.eclipse.emf.common.notify.Notification"
	 * @generated
	 */
	EDataType getNotification();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Symphony__CommonTopologyUIFactory getSymphony__CommonTopologyUIFactory();

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
		 * The meta object literal for the '{@link org.eclipse.symphony.common.topology.ui.impl.TopologyPresentationRegistryImpl <em>Topology Presentation Registry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.topology.ui.impl.TopologyPresentationRegistryImpl
		 * @see org.eclipse.symphony.common.topology.ui.impl.Symphony__CommonTopologyUIPackageImpl#getTopologyPresentationRegistry()
		 * @generated
		 */
		EClass TOPOLOGY_PRESENTATION_REGISTRY = eINSTANCE.getTopologyPresentationRegistry();

		/**
		 * The meta object literal for the '<em><b>Topology Presentation Set List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOPOLOGY_PRESENTATION_REGISTRY__TOPOLOGY_PRESENTATION_SET_LIST = eINSTANCE.getTopologyPresentationRegistry_TopologyPresentationSetList();

		/**
		 * The meta object literal for the '<em><b>Node Presentation List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOPOLOGY_PRESENTATION_REGISTRY__NODE_PRESENTATION_LIST = eINSTANCE.getTopologyPresentationRegistry_NodePresentationList();

		/**
		 * The meta object literal for the '<em><b>Create Topology Presentation Set</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOPOLOGY_PRESENTATION_REGISTRY___CREATE_TOPOLOGY_PRESENTATION_SET__NODE = eINSTANCE.getTopologyPresentationRegistry__CreateTopologyPresentationSet__Node();

		/**
		 * The meta object literal for the '<em><b>Release</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOPOLOGY_PRESENTATION_REGISTRY___RELEASE__TOPOLOGYPRESENTATIONSET = eINSTANCE.getTopologyPresentationRegistry__Release__TopologyPresentationSet();

		/**
		 * The meta object literal for the '<em><b>Get Presentation Node</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOPOLOGY_PRESENTATION_REGISTRY___GET_PRESENTATION_NODE__NODE = eINSTANCE.getTopologyPresentationRegistry__GetPresentationNode__Node();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.topology.ui.impl.GraphicsContextImpl <em>Graphics Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.topology.ui.impl.GraphicsContextImpl
		 * @see org.eclipse.symphony.common.topology.ui.impl.Symphony__CommonTopologyUIPackageImpl#getGraphicsContext()
		 * @generated
		 */
		EClass GRAPHICS_CONTEXT = eINSTANCE.getGraphicsContext();

		/**
		 * The meta object literal for the '<em><b>Topology</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPHICS_CONTEXT__TOPOLOGY = eINSTANCE.getGraphicsContext_Topology();

		/**
		 * The meta object literal for the '<em><b>Topology Presentation Set</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPHICS_CONTEXT__TOPOLOGY_PRESENTATION_SET = eINSTANCE.getGraphicsContext_TopologyPresentationSet();

		/**
		 * The meta object literal for the '<em><b>Dispose</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAPHICS_CONTEXT___DISPOSE = eINSTANCE.getGraphicsContext__Dispose();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.topology.ui.impl.NodeSelectionImpl <em>Node Selection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.topology.ui.impl.NodeSelectionImpl
		 * @see org.eclipse.symphony.common.topology.ui.impl.Symphony__CommonTopologyUIPackageImpl#getNodeSelection()
		 * @generated
		 */
		EClass NODE_SELECTION = eINSTANCE.getNodeSelection();

		/**
		 * The meta object literal for the '<em><b>Topology Presentation Set</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_SELECTION__TOPOLOGY_PRESENTATION_SET = eINSTANCE.getNodeSelection_TopologyPresentationSet();

		/**
		 * The meta object literal for the '<em><b>Selected Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_SELECTION__SELECTED_NODE = eINSTANCE.getNodeSelection_SelectedNode();

		/**
		 * The meta object literal for the '<em><b>Node Presentation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_SELECTION__NODE_PRESENTATION = eINSTANCE.getNodeSelection_NodePresentation();

		/**
		 * The meta object literal for the '<em><b>Relative Intersection Point</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_SELECTION__RELATIVE_INTERSECTION_POINT = eINSTANCE.getNodeSelection_RelativeIntersectionPoint();

		/**
		 * The meta object literal for the '<em><b>Absolute Intersection Point</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_SELECTION__ABSOLUTE_INTERSECTION_POINT = eINSTANCE.getNodeSelection_AbsoluteIntersectionPoint();

		/**
		 * The meta object literal for the '<em><b>Relative Intersection Normal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_SELECTION__RELATIVE_INTERSECTION_NORMAL = eINSTANCE.getNodeSelection_RelativeIntersectionNormal();

		/**
		 * The meta object literal for the '<em><b>Absolute Intersection Normal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_SELECTION__ABSOLUTE_INTERSECTION_NORMAL = eINSTANCE.getNodeSelection_AbsoluteIntersectionNormal();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.topology.ui.impl.TopologyPresentationSetImpl <em>Topology Presentation Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.topology.ui.impl.TopologyPresentationSetImpl
		 * @see org.eclipse.symphony.common.topology.ui.impl.Symphony__CommonTopologyUIPackageImpl#getTopologyPresentationSet()
		 * @generated
		 */
		EClass TOPOLOGY_PRESENTATION_SET = eINSTANCE.getTopologyPresentationSet();

		/**
		 * The meta object literal for the '<em><b>Topology Presentation Registry</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOPOLOGY_PRESENTATION_SET__TOPOLOGY_PRESENTATION_REGISTRY = eINSTANCE.getTopologyPresentationSet_TopologyPresentationRegistry();

		/**
		 * The meta object literal for the '<em><b>Graphics Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOPOLOGY_PRESENTATION_SET__GRAPHICS_CONTEXT = eINSTANCE.getTopologyPresentationSet_GraphicsContext();

		/**
		 * The meta object literal for the '<em><b>Node Presentation List</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOPOLOGY_PRESENTATION_SET__NODE_PRESENTATION_LIST = eINSTANCE.getTopologyPresentationSet_NodePresentationList();

		/**
		 * The meta object literal for the '<em><b>Get Presentation Node</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOPOLOGY_PRESENTATION_SET___GET_PRESENTATION_NODE__NODE = eINSTANCE.getTopologyPresentationSet__GetPresentationNode__Node();

		/**
		 * The meta object literal for the '<em><b>Get Nodes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOPOLOGY_PRESENTATION_SET___GET_NODES = eINSTANCE.getTopologyPresentationSet__GetNodes();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.topology.ui.impl.NodePresentationImpl <em>Node Presentation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.topology.ui.impl.NodePresentationImpl
		 * @see org.eclipse.symphony.common.topology.ui.impl.Symphony__CommonTopologyUIPackageImpl#getNodePresentation()
		 * @generated
		 */
		EClass NODE_PRESENTATION = eINSTANCE.getNodePresentation();

		/**
		 * The meta object literal for the '<em><b>Topology Presentation Set</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_PRESENTATION__TOPOLOGY_PRESENTATION_SET = eINSTANCE.getNodePresentation_TopologyPresentationSet();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_PRESENTATION__NODE = eINSTANCE.getNodePresentation_Node();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_PRESENTATION__COLOR = eINSTANCE.getNodePresentation_Color();

		/**
		 * The meta object literal for the '<em><b>Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_PRESENTATION__VISIBLE = eINSTANCE.getNodePresentation_Visible();

		/**
		 * The meta object literal for the '<em><b>Use In Bounding Calculation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_PRESENTATION__USE_IN_BOUNDING_CALCULATION = eINSTANCE.getNodePresentation_UseInBoundingCalculation();

		/**
		 * The meta object literal for the '<em><b>Centroid</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_PRESENTATION__CENTROID = eINSTANCE.getNodePresentation_Centroid();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_PRESENTATION__MIN = eINSTANCE.getNodePresentation_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_PRESENTATION__MAX = eINSTANCE.getNodePresentation_Max();

		/**
		 * The meta object literal for the '<em><b>XRange</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_PRESENTATION__XRANGE = eINSTANCE.getNodePresentation_XRange();

		/**
		 * The meta object literal for the '<em><b>YRange</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_PRESENTATION__YRANGE = eINSTANCE.getNodePresentation_YRange();

		/**
		 * The meta object literal for the '<em><b>ZRange</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_PRESENTATION__ZRANGE = eINSTANCE.getNodePresentation_ZRange();

		/**
		 * The meta object literal for the '<em><b>Scene Object</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_PRESENTATION__SCENE_OBJECT = eINSTANCE.getNodePresentation_SceneObject();

		/**
		 * The meta object literal for the '<em><b>Shadow Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_PRESENTATION__SHADOW_MODE = eINSTANCE.getNodePresentation_ShadowMode();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.topology.ui.impl.TransformNodePresentationImpl <em>Transform Node Presentation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.topology.ui.impl.TransformNodePresentationImpl
		 * @see org.eclipse.symphony.common.topology.ui.impl.Symphony__CommonTopologyUIPackageImpl#getTransformNodePresentation()
		 * @generated
		 */
		EClass TRANSFORM_NODE_PRESENTATION = eINSTANCE.getTransformNodePresentation();

		/**
		 * The meta object literal for the '<em><b>Axis Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORM_NODE_PRESENTATION__AXIS_VISIBLE = eINSTANCE.getTransformNodePresentation_AxisVisible();

		/**
		 * The meta object literal for the '<em><b>Axis Lenght</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORM_NODE_PRESENTATION__AXIS_LENGHT = eINSTANCE.getTransformNodePresentation_AxisLenght();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.topology.ui.impl.RotationNodePresentationImpl <em>Rotation Node Presentation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.topology.ui.impl.RotationNodePresentationImpl
		 * @see org.eclipse.symphony.common.topology.ui.impl.Symphony__CommonTopologyUIPackageImpl#getRotationNodePresentation()
		 * @generated
		 */
		EClass ROTATION_NODE_PRESENTATION = eINSTANCE.getRotationNodePresentation();

		/**
		 * The meta object literal for the '<em><b>Axis Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROTATION_NODE_PRESENTATION__AXIS_VISIBLE = eINSTANCE.getRotationNodePresentation_AxisVisible();

		/**
		 * The meta object literal for the '<em><b>Axis Lenght</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROTATION_NODE_PRESENTATION__AXIS_LENGHT = eINSTANCE.getRotationNodePresentation_AxisLenght();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.topology.ui.impl.PositionNodePresentationImpl <em>Position Node Presentation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.topology.ui.impl.PositionNodePresentationImpl
		 * @see org.eclipse.symphony.common.topology.ui.impl.Symphony__CommonTopologyUIPackageImpl#getPositionNodePresentation()
		 * @generated
		 */
		EClass POSITION_NODE_PRESENTATION = eINSTANCE.getPositionNodePresentation();

		/**
		 * The meta object literal for the '<em><b>Axis Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION_NODE_PRESENTATION__AXIS_VISIBLE = eINSTANCE.getPositionNodePresentation_AxisVisible();

		/**
		 * The meta object literal for the '<em><b>Axis Lenght</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION_NODE_PRESENTATION__AXIS_LENGHT = eINSTANCE.getPositionNodePresentation_AxisLenght();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.topology.ui.impl.URLNodePresentationImpl <em>URL Node Presentation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.topology.ui.impl.URLNodePresentationImpl
		 * @see org.eclipse.symphony.common.topology.ui.impl.Symphony__CommonTopologyUIPackageImpl#getURLNodePresentation()
		 * @generated
		 */
		EClass URL_NODE_PRESENTATION = eINSTANCE.getURLNodePresentation();

		/**
		 * The meta object literal for the '<em><b>Axis Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute URL_NODE_PRESENTATION__AXIS_VISIBLE = eINSTANCE.getURLNodePresentation_AxisVisible();

		/**
		 * The meta object literal for the '<em><b>Axis Lenght</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute URL_NODE_PRESENTATION__AXIS_LENGHT = eINSTANCE.getURLNodePresentation_AxisLenght();

		/**
		 * The meta object literal for the '<em><b>Presentation Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute URL_NODE_PRESENTATION__PRESENTATION_MODE = eINSTANCE.getURLNodePresentation_PresentationMode();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.topology.ui.impl.Symphony__CommonTopologyUIFacadeImpl <em>Facade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.topology.ui.impl.Symphony__CommonTopologyUIFacadeImpl
		 * @see org.eclipse.symphony.common.topology.ui.impl.Symphony__CommonTopologyUIPackageImpl#getSymphony__CommonTopologyUIFacade()
		 * @generated
		 */
		EClass SYMPHONY_COMMON_TOPOLOGY_UI_FACADE = eINSTANCE.getSymphony__CommonTopologyUIFacade();

		/**
		 * The meta object literal for the '<em><b>Create Graphics Context</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYMPHONY_COMMON_TOPOLOGY_UI_FACADE___CREATE_GRAPHICS_CONTEXT__NODE = eINSTANCE.getSymphony__CommonTopologyUIFacade__CreateGraphicsContext__Node();

		/**
		 * The meta object literal for the '<em><b>Find Extent</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYMPHONY_COMMON_TOPOLOGY_UI_FACADE___FIND_EXTENT__NODE_TOPOLOGYPRESENTATIONSET_TUPLE3D_TUPLE3D = eINSTANCE.getSymphony__CommonTopologyUIFacade__FindExtent__Node_TopologyPresentationSet_Tuple3d_Tuple3d();

		/**
		 * The meta object literal for the '<em><b>Create Node Selection</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYMPHONY_COMMON_TOPOLOGY_UI_FACADE___CREATE_NODE_SELECTION__TOPOLOGYPRESENTATIONSET_NODEPRESENTATION_POINT3D = eINSTANCE.getSymphony__CommonTopologyUIFacade__CreateNodeSelection__TopologyPresentationSet_NodePresentation_Point3d();

		/**
		 * The meta object literal for the '<em><b>Create Node Selection</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYMPHONY_COMMON_TOPOLOGY_UI_FACADE___CREATE_NODE_SELECTION__TOPOLOGYPRESENTATIONSET_NODE_POINT3D_VECTOR3F = eINSTANCE.getSymphony__CommonTopologyUIFacade__CreateNodeSelection__TopologyPresentationSet_Node_Point3d_Vector3f();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.topology.ui.ShadowMode <em>Shadow Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.topology.ui.ShadowMode
		 * @see org.eclipse.symphony.common.topology.ui.impl.Symphony__CommonTopologyUIPackageImpl#getShadowMode()
		 * @generated
		 */
		EEnum SHADOW_MODE = eINSTANCE.getShadowMode();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.topology.ui.MeshPresentationMode <em>Mesh Presentation Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.topology.ui.MeshPresentationMode
		 * @see org.eclipse.symphony.common.topology.ui.impl.Symphony__CommonTopologyUIPackageImpl#getMeshPresentationMode()
		 * @generated
		 */
		EEnum MESH_PRESENTATION_MODE = eINSTANCE.getMeshPresentationMode();

		/**
		 * The meta object literal for the '<em>List</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see org.eclipse.symphony.common.topology.ui.impl.Symphony__CommonTopologyUIPackageImpl#getList()
		 * @generated
		 */
		EDataType LIST = eINSTANCE.getList();

		/**
		 * The meta object literal for the '<em>RGB</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.swt.graphics.RGB
		 * @see org.eclipse.symphony.common.topology.ui.impl.Symphony__CommonTopologyUIPackageImpl#getRGB()
		 * @generated
		 */
		EDataType RGB = eINSTANCE.getRGB();

		/**
		 * The meta object literal for the '<em>Point3d</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.vecmath.Point3d
		 * @see org.eclipse.symphony.common.topology.ui.impl.Symphony__CommonTopologyUIPackageImpl#getPoint3d()
		 * @generated
		 */
		EDataType POINT3D = eINSTANCE.getPoint3d();

		/**
		 * The meta object literal for the '<em>Vector3f</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.vecmath.Vector3f
		 * @see org.eclipse.symphony.common.topology.ui.impl.Symphony__CommonTopologyUIPackageImpl#getVector3f()
		 * @generated
		 */
		EDataType VECTOR3F = eINSTANCE.getVector3f();

		/**
		 * The meta object literal for the '<em>Scene Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.topology.ui.SceneObject
		 * @see org.eclipse.symphony.common.topology.ui.impl.Symphony__CommonTopologyUIPackageImpl#getSceneObject()
		 * @generated
		 */
		EDataType SCENE_OBJECT = eINSTANCE.getSceneObject();

		/**
		 * The meta object literal for the '<em>Notification</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.common.notify.Notification
		 * @see org.eclipse.symphony.common.topology.ui.impl.Symphony__CommonTopologyUIPackageImpl#getNotification()
		 * @generated
		 */
		EDataType NOTIFICATION = eINSTANCE.getNotification();

	}

} //TopologyTopologyUIPackage
