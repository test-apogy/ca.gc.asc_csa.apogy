/**
 * <copyright>
 * </copyright>
 *
 * $Id: TopologyPackage.java,v 1.12.2.3 2015/02/03 20:01:30 rlarcheveque Exp $
 */
package ca.gc.space.topology;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ca.gc.space.topology.TopologyFactory
 * @model kind="package"
 * @generated
 */
public interface TopologyPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "topology";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///ca/gc/space/topology.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ca.gc.space.topology";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TopologyPackage eINSTANCE = ca.gc.space.topology.impl.TopologyPackageImpl.init();

	/**
	 * The meta object id for the '{@link ca.gc.space.topology.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.space.topology.impl.NodeImpl
	 * @see ca.gc.space.topology.impl.TopologyPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NODE_ID = 2;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___ACCEPT__INODEVISITOR = 0;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link ca.gc.space.topology.GroupNode <em>Group Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.space.topology.GroupNode
	 * @see ca.gc.space.topology.impl.TopologyPackageImpl#getGroupNode()
	 * @generated
	 */
	int GROUP_NODE = 6;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_NODE__PARENT = NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_NODE__DESCRIPTION = NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_NODE__NODE_ID = NODE__NODE_ID;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_NODE__CHILDREN = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Group Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_NODE_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_NODE___ACCEPT__INODEVISITOR = NODE___ACCEPT__INODEVISITOR;

	/**
	 * The number of operations of the '<em>Group Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_NODE_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.space.topology.impl.PositionNodeImpl <em>Position Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.space.topology.impl.PositionNodeImpl
	 * @see ca.gc.space.topology.impl.TopologyPackageImpl#getPositionNode()
	 * @generated
	 */
	int POSITION_NODE = 4;

	/**
	 * The meta object id for the '{@link ca.gc.space.topology.impl.ContentNodeImpl <em>Content Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.space.topology.impl.ContentNodeImpl
	 * @see ca.gc.space.topology.impl.TopologyPackageImpl#getContentNode()
	 * @generated
	 */
	int CONTENT_NODE = 3;

	/**
	 * The meta object id for the '{@link ca.gc.space.topology.impl.RotationNodeImpl <em>Rotation Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.space.topology.impl.RotationNodeImpl
	 * @see ca.gc.space.topology.impl.TopologyPackageImpl#getRotationNode()
	 * @generated
	 */
	int ROTATION_NODE = 5;

	/**
	 * The meta object id for the '{@link ca.gc.space.topology.impl.TransformNodeImpl <em>Transform Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.space.topology.impl.TransformNodeImpl
	 * @see ca.gc.space.topology.impl.TopologyPackageImpl#getTransformNode()
	 * @generated
	 */
	int TRANSFORM_NODE = 1;

	/**
	 * The meta object id for the '{@link ca.gc.space.topology.impl.TopologyFacadeImpl <em>Facade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.space.topology.impl.TopologyFacadeImpl
	 * @see ca.gc.space.topology.impl.TopologyPackageImpl#getTopologyFacade()
	 * @generated
	 */
	int TOPOLOGY_FACADE = 2;

	/**
	 * The meta object id for the '{@link ca.gc.space.topology.impl.LeafImpl <em>Leaf</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.space.topology.impl.LeafImpl
	 * @see ca.gc.space.topology.impl.TopologyPackageImpl#getLeaf()
	 * @generated
	 */
	int LEAF = 7;

	/**
	 * The meta object id for the '{@link ca.gc.space.topology.impl.PickAndPlaceNodeImpl <em>Pick And Place Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.space.topology.impl.PickAndPlaceNodeImpl
	 * @see ca.gc.space.topology.impl.TopologyPackageImpl#getPickAndPlaceNode()
	 * @generated
	 */
	int PICK_AND_PLACE_NODE = 8;

	/**
	 * The meta object id for the '{@link ca.gc.space.topology.impl.ReferencedContentNodeImpl <em>Referenced Content Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.space.topology.impl.ReferencedContentNodeImpl
	 * @see ca.gc.space.topology.impl.TopologyPackageImpl#getReferencedContentNode()
	 * @generated
	 */
	int REFERENCED_CONTENT_NODE = 9;

	/**
	 * The meta object id for the '{@link ca.gc.space.topology.impl.AggregateContentNodeImpl <em>Aggregate Content Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.space.topology.impl.AggregateContentNodeImpl
	 * @see ca.gc.space.topology.impl.TopologyPackageImpl#getAggregateContentNode()
	 * @generated
	 */
	int AGGREGATE_CONTENT_NODE = 10;

	/**
	 * The meta object id for the '{@link ca.gc.space.topology.impl.URLNodeImpl <em>URL Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.space.topology.impl.URLNodeImpl
	 * @see ca.gc.space.topology.impl.TopologyPackageImpl#getURLNode()
	 * @generated
	 */
	int URL_NODE = 11;

	/**
	 * The meta object id for the '{@link ca.gc.space.topology.TopologyProvider <em>Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.space.topology.TopologyProvider
	 * @see ca.gc.space.topology.impl.TopologyPackageImpl#getTopologyProvider()
	 * @generated
	 */
	int TOPOLOGY_PROVIDER = 12;

	/**
	 * The meta object id for the '{@link ca.gc.space.topology.impl.ReferencedGroupNodeImpl <em>Referenced Group Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.space.topology.impl.ReferencedGroupNodeImpl
	 * @see ca.gc.space.topology.impl.TopologyPackageImpl#getReferencedGroupNode()
	 * @generated
	 */
	int REFERENCED_GROUP_NODE = 13;

	/**
	 * The meta object id for the '{@link ca.gc.space.topology.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.space.topology.impl.LinkImpl
	 * @see ca.gc.space.topology.impl.TopologyPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 14;

	/**
	 * The meta object id for the '{@link ca.gc.space.topology.impl.AggregateGroupNodeImpl <em>Aggregate Group Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.space.topology.impl.AggregateGroupNodeImpl
	 * @see ca.gc.space.topology.impl.TopologyPackageImpl#getAggregateGroupNode()
	 * @generated
	 */
	int AGGREGATE_GROUP_NODE = 15;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_GROUP_NODE__PARENT = GROUP_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_GROUP_NODE__DESCRIPTION = GROUP_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_GROUP_NODE__NODE_ID = GROUP_NODE__NODE_ID;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_GROUP_NODE__CHILDREN = GROUP_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Aggregated Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN = GROUP_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Aggregate Group Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_GROUP_NODE_FEATURE_COUNT = GROUP_NODE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_GROUP_NODE___ACCEPT__INODEVISITOR = GROUP_NODE___ACCEPT__INODEVISITOR;

	/**
	 * The number of operations of the '<em>Aggregate Group Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_GROUP_NODE_OPERATION_COUNT = GROUP_NODE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_NODE__PARENT = AGGREGATE_GROUP_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_NODE__DESCRIPTION = AGGREGATE_GROUP_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_NODE__NODE_ID = AGGREGATE_GROUP_NODE__NODE_ID;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_NODE__CHILDREN = AGGREGATE_GROUP_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Aggregated Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_NODE__AGGREGATED_CHILDREN = AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_NODE__POSITION = AGGREGATE_GROUP_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Position Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_NODE_FEATURE_COUNT = AGGREGATE_GROUP_NODE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_NODE___ACCEPT__INODEVISITOR = AGGREGATE_GROUP_NODE___ACCEPT__INODEVISITOR;

	/**
	 * The number of operations of the '<em>Position Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_NODE_OPERATION_COUNT = AGGREGATE_GROUP_NODE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_NODE__PARENT = POSITION_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_NODE__DESCRIPTION = POSITION_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_NODE__NODE_ID = POSITION_NODE__NODE_ID;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_NODE__CHILDREN = POSITION_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Aggregated Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_NODE__AGGREGATED_CHILDREN = POSITION_NODE__AGGREGATED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_NODE__POSITION = POSITION_NODE__POSITION;

	/**
	 * The feature id for the '<em><b>Rotation Matrix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_NODE__ROTATION_MATRIX = POSITION_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Transform Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_NODE_FEATURE_COUNT = POSITION_NODE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_NODE___ACCEPT__INODEVISITOR = POSITION_NODE___ACCEPT__INODEVISITOR;

	/**
	 * The operation id for the '<em>As Matrix4d</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_NODE___AS_MATRIX4D = POSITION_NODE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Transformation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_NODE___SET_TRANSFORMATION__MATRIX4D = POSITION_NODE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Transform Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_NODE_OPERATION_COUNT = POSITION_NODE_OPERATION_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_FACADE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Create Content Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_FACADE___CREATE_CONTENT_NODE__OBJECT = 0;

	/**
	 * The operation id for the '<em>Create Position Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_FACADE___CREATE_POSITION_NODE__DOUBLE_DOUBLE_DOUBLE = 1;

	/**
	 * The operation id for the '<em>Create Rotation Node XYZ</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_FACADE___CREATE_ROTATION_NODE_XYZ__DOUBLE_DOUBLE_DOUBLE = 2;

	/**
	 * The operation id for the '<em>Express Node In Root Frame</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_FACADE___EXPRESS_NODE_IN_ROOT_FRAME__NODE = 3;

	/**
	 * The operation id for the '<em>Express Root In Node Frame</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_FACADE___EXPRESS_ROOT_IN_NODE_FRAME__NODE = 4;

	/**
	 * The operation id for the '<em>Express In Frame</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_FACADE___EXPRESS_IN_FRAME__NODE_NODE = 5;

	/**
	 * The operation id for the '<em>Create Rotation Node YZX</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_FACADE___CREATE_ROTATION_NODE_YZX__DOUBLE_DOUBLE_DOUBLE = 6;

	/**
	 * The operation id for the '<em>Create Rotation Node ZYX</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_FACADE___CREATE_ROTATION_NODE_ZYX__DOUBLE_DOUBLE_DOUBLE = 7;

	/**
	 * The operation id for the '<em>Create Transform Node XYZ</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_FACADE___CREATE_TRANSFORM_NODE_XYZ__DOUBLE_DOUBLE_DOUBLE_DOUBLE_DOUBLE_DOUBLE = 8;

	/**
	 * The operation id for the '<em>Create Transform Node YZX</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_FACADE___CREATE_TRANSFORM_NODE_YZX__DOUBLE_DOUBLE_DOUBLE_DOUBLE_DOUBLE_DOUBLE = 9;

	/**
	 * The operation id for the '<em>Create Transform Node ZYX</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_FACADE___CREATE_TRANSFORM_NODE_ZYX__DOUBLE_DOUBLE_DOUBLE_DOUBLE_DOUBLE_DOUBLE = 10;

	/**
	 * The operation id for the '<em>Create Transform Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_FACADE___CREATE_TRANSFORM_NODE__MATRIX4D = 11;

	/**
	 * The operation id for the '<em>Create Pick And Place Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_FACADE___CREATE_PICK_AND_PLACE_NODE__MATRIX4D = 12;

	/**
	 * The operation id for the '<em>Print Topology</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_FACADE___PRINT_TOPOLOGY__NODE = 13;

	/**
	 * The operation id for the '<em>Create Referenced Content Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_FACADE___CREATE_REFERENCED_CONTENT_NODE__OBJECT = 14;

	/**
	 * The operation id for the '<em>Create Aggregate Content Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_FACADE___CREATE_AGGREGATE_CONTENT_NODE__OBJECT = 15;

	/**
	 * The operation id for the '<em>Create Link</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_FACADE___CREATE_LINK__NODE = 16;

	/**
	 * The operation id for the '<em>Find Nodes By Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_FACADE___FIND_NODES_BY_DESCRIPTION__STRING_NODE = 17;

	/**
	 * The operation id for the '<em>Find Nodes By ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_FACADE___FIND_NODES_BY_ID__STRING_NODE = 18;

	/**
	 * The operation id for the '<em>Find Nodes By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_FACADE___FIND_NODES_BY_TYPE__ECLASS_NODE = 19;

	/**
	 * The operation id for the '<em>Find Root</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_FACADE___FIND_ROOT__NODE = 20;

	/**
	 * The operation id for the '<em>Get Euclidian Distance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_FACADE___GET_EUCLIDIAN_DISTANCE__NODE_NODE = 21;

	/**
	 * The operation id for the '<em>Get Geodesic Distance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_FACADE___GET_GEODESIC_DISTANCE__NODE_NODE = 22;

	/**
	 * The number of operations of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_FACADE_OPERATION_COUNT = 23;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF__PARENT = NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF__DESCRIPTION = NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF__NODE_ID = NODE__NODE_ID;

	/**
	 * The number of structural features of the '<em>Leaf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF___ACCEPT__INODEVISITOR = NODE___ACCEPT__INODEVISITOR;

	/**
	 * The number of operations of the '<em>Leaf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_NODE__PARENT = LEAF__PARENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_NODE__DESCRIPTION = LEAF__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_NODE__NODE_ID = LEAF__NODE_ID;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_NODE__CONTENT = LEAF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Content Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_NODE_FEATURE_COUNT = LEAF_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_NODE___ACCEPT__INODEVISITOR = LEAF___ACCEPT__INODEVISITOR;

	/**
	 * The number of operations of the '<em>Content Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_NODE_OPERATION_COUNT = LEAF_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION_NODE__PARENT = AGGREGATE_GROUP_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION_NODE__DESCRIPTION = AGGREGATE_GROUP_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION_NODE__NODE_ID = AGGREGATE_GROUP_NODE__NODE_ID;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION_NODE__CHILDREN = AGGREGATE_GROUP_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Aggregated Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION_NODE__AGGREGATED_CHILDREN = AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Rotation Matrix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION_NODE__ROTATION_MATRIX = AGGREGATE_GROUP_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rotation Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION_NODE_FEATURE_COUNT = AGGREGATE_GROUP_NODE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION_NODE___ACCEPT__INODEVISITOR = AGGREGATE_GROUP_NODE___ACCEPT__INODEVISITOR;

	/**
	 * The number of operations of the '<em>Rotation Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION_NODE_OPERATION_COUNT = AGGREGATE_GROUP_NODE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK_AND_PLACE_NODE__PARENT = TRANSFORM_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK_AND_PLACE_NODE__DESCRIPTION = TRANSFORM_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK_AND_PLACE_NODE__NODE_ID = TRANSFORM_NODE__NODE_ID;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK_AND_PLACE_NODE__CHILDREN = TRANSFORM_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Aggregated Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK_AND_PLACE_NODE__AGGREGATED_CHILDREN = TRANSFORM_NODE__AGGREGATED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK_AND_PLACE_NODE__POSITION = TRANSFORM_NODE__POSITION;

	/**
	 * The feature id for the '<em><b>Rotation Matrix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK_AND_PLACE_NODE__ROTATION_MATRIX = TRANSFORM_NODE__ROTATION_MATRIX;

	/**
	 * The number of structural features of the '<em>Pick And Place Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK_AND_PLACE_NODE_FEATURE_COUNT = TRANSFORM_NODE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK_AND_PLACE_NODE___ACCEPT__INODEVISITOR = TRANSFORM_NODE___ACCEPT__INODEVISITOR;

	/**
	 * The operation id for the '<em>As Matrix4d</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK_AND_PLACE_NODE___AS_MATRIX4D = TRANSFORM_NODE___AS_MATRIX4D;

	/**
	 * The operation id for the '<em>Set Transformation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK_AND_PLACE_NODE___SET_TRANSFORMATION__MATRIX4D = TRANSFORM_NODE___SET_TRANSFORMATION__MATRIX4D;

	/**
	 * The number of operations of the '<em>Pick And Place Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK_AND_PLACE_NODE_OPERATION_COUNT = TRANSFORM_NODE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCED_CONTENT_NODE__PARENT = CONTENT_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCED_CONTENT_NODE__DESCRIPTION = CONTENT_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCED_CONTENT_NODE__NODE_ID = CONTENT_NODE__NODE_ID;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCED_CONTENT_NODE__CONTENT = CONTENT_NODE__CONTENT;

	/**
	 * The feature id for the '<em><b>Referenced Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCED_CONTENT_NODE__REFERENCED_CONTENT = CONTENT_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Referenced Content Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCED_CONTENT_NODE_FEATURE_COUNT = CONTENT_NODE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCED_CONTENT_NODE___ACCEPT__INODEVISITOR = CONTENT_NODE___ACCEPT__INODEVISITOR;

	/**
	 * The number of operations of the '<em>Referenced Content Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCED_CONTENT_NODE_OPERATION_COUNT = CONTENT_NODE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_CONTENT_NODE__PARENT = CONTENT_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_CONTENT_NODE__DESCRIPTION = CONTENT_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_CONTENT_NODE__NODE_ID = CONTENT_NODE__NODE_ID;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_CONTENT_NODE__CONTENT = CONTENT_NODE__CONTENT;

	/**
	 * The feature id for the '<em><b>Aggregate Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT = CONTENT_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Aggregate Content Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_CONTENT_NODE_FEATURE_COUNT = CONTENT_NODE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_CONTENT_NODE___ACCEPT__INODEVISITOR = CONTENT_NODE___ACCEPT__INODEVISITOR;

	/**
	 * The number of operations of the '<em>Aggregate Content Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_CONTENT_NODE_OPERATION_COUNT = CONTENT_NODE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_NODE__PARENT = LEAF__PARENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_NODE__DESCRIPTION = LEAF__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_NODE__NODE_ID = LEAF__NODE_ID;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_NODE__URL = LEAF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Polygon Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_NODE__POLYGON_COUNT = LEAF_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Vertex Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_NODE__VERTEX_COUNT = LEAF_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>URL Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_NODE_FEATURE_COUNT = LEAF_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_NODE___ACCEPT__INODEVISITOR = LEAF___ACCEPT__INODEVISITOR;

	/**
	 * The number of operations of the '<em>URL Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_NODE_OPERATION_COUNT = LEAF_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Topology Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_PROVIDER__TOPOLOGY_ROOT = 0;

	/**
	 * The number of structural features of the '<em>Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_PROVIDER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_PROVIDER_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCED_GROUP_NODE__PARENT = GROUP_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCED_GROUP_NODE__DESCRIPTION = GROUP_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCED_GROUP_NODE__NODE_ID = GROUP_NODE__NODE_ID;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCED_GROUP_NODE__CHILDREN = GROUP_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Referenced Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCED_GROUP_NODE__REFERENCED_CHILDREN = GROUP_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Referenced Group Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCED_GROUP_NODE_FEATURE_COUNT = GROUP_NODE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCED_GROUP_NODE___ACCEPT__INODEVISITOR = GROUP_NODE___ACCEPT__INODEVISITOR;

	/**
	 * The number of operations of the '<em>Referenced Group Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCED_GROUP_NODE_OPERATION_COUNT = GROUP_NODE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__PARENT = NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__DESCRIPTION = NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__NODE_ID = NODE__NODE_ID;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__NODE = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK___ACCEPT__INODEVISITOR = NODE___ACCEPT__INODEVISITOR;

	/**
	 * The number of operations of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.space.topology.impl.CADNodeImpl <em>CAD Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.space.topology.impl.CADNodeImpl
	 * @see ca.gc.space.topology.impl.TopologyPackageImpl#getCADNode()
	 * @generated
	 */
	int CAD_NODE = 16;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAD_NODE__PARENT = URL_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAD_NODE__DESCRIPTION = URL_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAD_NODE__NODE_ID = URL_NODE__NODE_ID;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAD_NODE__URL = URL_NODE__URL;

	/**
	 * The feature id for the '<em><b>Polygon Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAD_NODE__POLYGON_COUNT = URL_NODE__POLYGON_COUNT;

	/**
	 * The feature id for the '<em><b>Vertex Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAD_NODE__VERTEX_COUNT = URL_NODE__VERTEX_COUNT;

	/**
	 * The feature id for the '<em><b>Node Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAD_NODE__NODE_NAME = URL_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>CAD Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAD_NODE_FEATURE_COUNT = URL_NODE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAD_NODE___ACCEPT__INODEVISITOR = URL_NODE___ACCEPT__INODEVISITOR;

	/**
	 * The number of operations of the '<em>CAD Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAD_NODE_OPERATION_COUNT = URL_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '<em>Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see ca.gc.space.topology.impl.TopologyPackageImpl#getObject()
	 * @generated
	 */
	int OBJECT = 19;

	/**
	 * The meta object id for the '<em>Double Array</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.space.topology.impl.TopologyPackageImpl#getDoubleArray()
	 * @generated
	 */
	int DOUBLE_ARRAY = 20;

	/**
	 * The meta object id for the '<em>URL</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.net.URL
	 * @see ca.gc.space.topology.impl.TopologyPackageImpl#getURL()
	 * @generated
	 */
	int URL = 17;

	/**
	 * The meta object id for the '<em>INode Visitor</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.space.topology.INodeVisitor
	 * @see ca.gc.space.topology.impl.TopologyPackageImpl#getINodeVisitor()
	 * @generated
	 */
	int INODE_VISITOR = 18;

	/**
	 * Returns the meta object for class '{@link ca.gc.space.topology.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see ca.gc.space.topology.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.space.topology.Node#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see ca.gc.space.topology.Node#getParent()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Parent();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.topology.Node#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see ca.gc.space.topology.Node#getDescription()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Description();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.topology.Node#getNodeId <em>Node Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node Id</em>'.
	 * @see ca.gc.space.topology.Node#getNodeId()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_NodeId();

	/**
	 * Returns the meta object for the '{@link ca.gc.space.topology.Node#accept(ca.gc.space.topology.INodeVisitor) <em>Accept</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Accept</em>' operation.
	 * @see ca.gc.space.topology.Node#accept(ca.gc.space.topology.INodeVisitor)
	 * @generated
	 */
	EOperation getNode__Accept__INodeVisitor();

	/**
	 * Returns the meta object for class '{@link ca.gc.space.topology.ContentNode <em>Content Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content Node</em>'.
	 * @see ca.gc.space.topology.ContentNode
	 * @generated
	 */
	EClass getContentNode();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.space.topology.ContentNode#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Content</em>'.
	 * @see ca.gc.space.topology.ContentNode#getContent()
	 * @see #getContentNode()
	 * @generated
	 */
	EReference getContentNode_Content();

	/**
	 * Returns the meta object for class '{@link ca.gc.space.topology.PositionNode <em>Position Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Position Node</em>'.
	 * @see ca.gc.space.topology.PositionNode
	 * @generated
	 */
	EClass getPositionNode();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.space.topology.PositionNode#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Position</em>'.
	 * @see ca.gc.space.topology.PositionNode#getPosition()
	 * @see #getPositionNode()
	 * @generated
	 */
	EReference getPositionNode_Position();

	/**
	 * Returns the meta object for class '{@link ca.gc.space.topology.RotationNode <em>Rotation Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rotation Node</em>'.
	 * @see ca.gc.space.topology.RotationNode
	 * @generated
	 */
	EClass getRotationNode();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.space.topology.RotationNode#getRotationMatrix <em>Rotation Matrix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rotation Matrix</em>'.
	 * @see ca.gc.space.topology.RotationNode#getRotationMatrix()
	 * @see #getRotationNode()
	 * @generated
	 */
	EReference getRotationNode_RotationMatrix();

	/**
	 * Returns the meta object for class '{@link ca.gc.space.topology.GroupNode <em>Group Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group Node</em>'.
	 * @see ca.gc.space.topology.GroupNode
	 * @generated
	 */
	EClass getGroupNode();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.gc.space.topology.GroupNode#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see ca.gc.space.topology.GroupNode#getChildren()
	 * @see #getGroupNode()
	 * @generated
	 */
	EReference getGroupNode_Children();

	/**
	 * Returns the meta object for class '{@link ca.gc.space.topology.Leaf <em>Leaf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Leaf</em>'.
	 * @see ca.gc.space.topology.Leaf
	 * @generated
	 */
	EClass getLeaf();

	/**
	 * Returns the meta object for class '{@link ca.gc.space.topology.PickAndPlaceNode <em>Pick And Place Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pick And Place Node</em>'.
	 * @see ca.gc.space.topology.PickAndPlaceNode
	 * @generated
	 */
	EClass getPickAndPlaceNode();

	/**
	 * Returns the meta object for class '{@link ca.gc.space.topology.ReferencedContentNode <em>Referenced Content Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Referenced Content Node</em>'.
	 * @see ca.gc.space.topology.ReferencedContentNode
	 * @generated
	 */
	EClass getReferencedContentNode();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.space.topology.ReferencedContentNode#getReferencedContent <em>Referenced Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenced Content</em>'.
	 * @see ca.gc.space.topology.ReferencedContentNode#getReferencedContent()
	 * @see #getReferencedContentNode()
	 * @generated
	 */
	EReference getReferencedContentNode_ReferencedContent();

	/**
	 * Returns the meta object for class '{@link ca.gc.space.topology.AggregateContentNode <em>Aggregate Content Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aggregate Content Node</em>'.
	 * @see ca.gc.space.topology.AggregateContentNode
	 * @generated
	 */
	EClass getAggregateContentNode();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.space.topology.AggregateContentNode#getAggregateContent <em>Aggregate Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Aggregate Content</em>'.
	 * @see ca.gc.space.topology.AggregateContentNode#getAggregateContent()
	 * @see #getAggregateContentNode()
	 * @generated
	 */
	EReference getAggregateContentNode_AggregateContent();

	/**
	 * Returns the meta object for class '{@link ca.gc.space.topology.URLNode <em>URL Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>URL Node</em>'.
	 * @see ca.gc.space.topology.URLNode
	 * @generated
	 */
	EClass getURLNode();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.topology.URLNode#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see ca.gc.space.topology.URLNode#getUrl()
	 * @see #getURLNode()
	 * @generated
	 */
	EAttribute getURLNode_Url();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.topology.URLNode#getPolygonCount <em>Polygon Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Polygon Count</em>'.
	 * @see ca.gc.space.topology.URLNode#getPolygonCount()
	 * @see #getURLNode()
	 * @generated
	 */
	EAttribute getURLNode_PolygonCount();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.topology.URLNode#getVertexCount <em>Vertex Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vertex Count</em>'.
	 * @see ca.gc.space.topology.URLNode#getVertexCount()
	 * @see #getURLNode()
	 * @generated
	 */
	EAttribute getURLNode_VertexCount();

	/**
	 * Returns the meta object for class '{@link ca.gc.space.topology.TopologyProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provider</em>'.
	 * @see ca.gc.space.topology.TopologyProvider
	 * @generated
	 */
	EClass getTopologyProvider();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.space.topology.TopologyProvider#getTopologyRoot <em>Topology Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Topology Root</em>'.
	 * @see ca.gc.space.topology.TopologyProvider#getTopologyRoot()
	 * @see #getTopologyProvider()
	 * @generated
	 */
	EReference getTopologyProvider_TopologyRoot();

	/**
	 * Returns the meta object for class '{@link ca.gc.space.topology.ReferencedGroupNode <em>Referenced Group Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Referenced Group Node</em>'.
	 * @see ca.gc.space.topology.ReferencedGroupNode
	 * @generated
	 */
	EClass getReferencedGroupNode();

	/**
	 * Returns the meta object for the reference list '{@link ca.gc.space.topology.ReferencedGroupNode#getReferencedChildren <em>Referenced Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Referenced Children</em>'.
	 * @see ca.gc.space.topology.ReferencedGroupNode#getReferencedChildren()
	 * @see #getReferencedGroupNode()
	 * @generated
	 */
	EReference getReferencedGroupNode_ReferencedChildren();

	/**
	 * Returns the meta object for class '{@link ca.gc.space.topology.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see ca.gc.space.topology.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.space.topology.Link#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Node</em>'.
	 * @see ca.gc.space.topology.Link#getNode()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Node();

	/**
	 * Returns the meta object for class '{@link ca.gc.space.topology.AggregateGroupNode <em>Aggregate Group Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aggregate Group Node</em>'.
	 * @see ca.gc.space.topology.AggregateGroupNode
	 * @generated
	 */
	EClass getAggregateGroupNode();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.gc.space.topology.AggregateGroupNode#getAggregatedChildren <em>Aggregated Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Aggregated Children</em>'.
	 * @see ca.gc.space.topology.AggregateGroupNode#getAggregatedChildren()
	 * @see #getAggregateGroupNode()
	 * @generated
	 */
	EReference getAggregateGroupNode_AggregatedChildren();

	/**
	 * Returns the meta object for class '{@link ca.gc.space.topology.CADNode <em>CAD Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CAD Node</em>'.
	 * @see ca.gc.space.topology.CADNode
	 * @generated
	 */
	EClass getCADNode();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.topology.CADNode#getNodeName <em>Node Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node Name</em>'.
	 * @see ca.gc.space.topology.CADNode#getNodeName()
	 * @see #getCADNode()
	 * @generated
	 */
	EAttribute getCADNode_NodeName();

	/**
	 * Returns the meta object for class '{@link ca.gc.space.topology.TransformNode <em>Transform Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transform Node</em>'.
	 * @see ca.gc.space.topology.TransformNode
	 * @generated
	 */
	EClass getTransformNode();

	/**
	 * Returns the meta object for the '{@link ca.gc.space.topology.TransformNode#asMatrix4d() <em>As Matrix4d</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>As Matrix4d</em>' operation.
	 * @see ca.gc.space.topology.TransformNode#asMatrix4d()
	 * @generated
	 */
	EOperation getTransformNode__AsMatrix4d();

	/**
	 * Returns the meta object for the '{@link ca.gc.space.topology.TransformNode#setTransformation(javax.vecmath.Matrix4d) <em>Set Transformation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Transformation</em>' operation.
	 * @see ca.gc.space.topology.TransformNode#setTransformation(javax.vecmath.Matrix4d)
	 * @generated
	 */
	EOperation getTransformNode__SetTransformation__Matrix4d();

	/**
	 * Returns the meta object for class '{@link ca.gc.space.topology.TopologyFacade <em>Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facade</em>'.
	 * @see ca.gc.space.topology.TopologyFacade
	 * @generated
	 */
	EClass getTopologyFacade();

	/**
	 * Returns the meta object for the '{@link ca.gc.space.topology.TopologyFacade#createContentNode(java.lang.Object) <em>Create Content Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Content Node</em>' operation.
	 * @see ca.gc.space.topology.TopologyFacade#createContentNode(java.lang.Object)
	 * @generated
	 */
	EOperation getTopologyFacade__CreateContentNode__Object();

	/**
	 * Returns the meta object for the '{@link ca.gc.space.topology.TopologyFacade#createPositionNode(double, double, double) <em>Create Position Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Position Node</em>' operation.
	 * @see ca.gc.space.topology.TopologyFacade#createPositionNode(double, double, double)
	 * @generated
	 */
	EOperation getTopologyFacade__CreatePositionNode__double_double_double();

	/**
	 * Returns the meta object for the '{@link ca.gc.space.topology.TopologyFacade#createRotationNodeXYZ(double, double, double) <em>Create Rotation Node XYZ</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Rotation Node XYZ</em>' operation.
	 * @see ca.gc.space.topology.TopologyFacade#createRotationNodeXYZ(double, double, double)
	 * @generated
	 */
	EOperation getTopologyFacade__CreateRotationNodeXYZ__double_double_double();

	/**
	 * Returns the meta object for the '{@link ca.gc.space.topology.TopologyFacade#expressNodeInRootFrame(ca.gc.space.topology.Node) <em>Express Node In Root Frame</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Express Node In Root Frame</em>' operation.
	 * @see ca.gc.space.topology.TopologyFacade#expressNodeInRootFrame(ca.gc.space.topology.Node)
	 * @generated
	 */
	EOperation getTopologyFacade__ExpressNodeInRootFrame__Node();

	/**
	 * Returns the meta object for the '{@link ca.gc.space.topology.TopologyFacade#expressRootInNodeFrame(ca.gc.space.topology.Node) <em>Express Root In Node Frame</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Express Root In Node Frame</em>' operation.
	 * @see ca.gc.space.topology.TopologyFacade#expressRootInNodeFrame(ca.gc.space.topology.Node)
	 * @generated
	 */
	EOperation getTopologyFacade__ExpressRootInNodeFrame__Node();

	/**
	 * Returns the meta object for the '{@link ca.gc.space.topology.TopologyFacade#expressInFrame(ca.gc.space.topology.Node, ca.gc.space.topology.Node) <em>Express In Frame</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Express In Frame</em>' operation.
	 * @see ca.gc.space.topology.TopologyFacade#expressInFrame(ca.gc.space.topology.Node, ca.gc.space.topology.Node)
	 * @generated
	 */
	EOperation getTopologyFacade__ExpressInFrame__Node_Node();

	/**
	 * Returns the meta object for the '{@link ca.gc.space.topology.TopologyFacade#createRotationNodeYZX(double, double, double) <em>Create Rotation Node YZX</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Rotation Node YZX</em>' operation.
	 * @see ca.gc.space.topology.TopologyFacade#createRotationNodeYZX(double, double, double)
	 * @generated
	 */
	EOperation getTopologyFacade__CreateRotationNodeYZX__double_double_double();

	/**
	 * Returns the meta object for the '{@link ca.gc.space.topology.TopologyFacade#createRotationNodeZYX(double, double, double) <em>Create Rotation Node ZYX</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Rotation Node ZYX</em>' operation.
	 * @see ca.gc.space.topology.TopologyFacade#createRotationNodeZYX(double, double, double)
	 * @generated
	 */
	EOperation getTopologyFacade__CreateRotationNodeZYX__double_double_double();

	/**
	 * Returns the meta object for the '{@link ca.gc.space.topology.TopologyFacade#createTransformNodeXYZ(double, double, double, double, double, double) <em>Create Transform Node XYZ</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Transform Node XYZ</em>' operation.
	 * @see ca.gc.space.topology.TopologyFacade#createTransformNodeXYZ(double, double, double, double, double, double)
	 * @generated
	 */
	EOperation getTopologyFacade__CreateTransformNodeXYZ__double_double_double_double_double_double();

	/**
	 * Returns the meta object for the '{@link ca.gc.space.topology.TopologyFacade#createTransformNodeYZX(double, double, double, double, double, double) <em>Create Transform Node YZX</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Transform Node YZX</em>' operation.
	 * @see ca.gc.space.topology.TopologyFacade#createTransformNodeYZX(double, double, double, double, double, double)
	 * @generated
	 */
	EOperation getTopologyFacade__CreateTransformNodeYZX__double_double_double_double_double_double();

	/**
	 * Returns the meta object for the '{@link ca.gc.space.topology.TopologyFacade#createTransformNodeZYX(double, double, double, double, double, double) <em>Create Transform Node ZYX</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Transform Node ZYX</em>' operation.
	 * @see ca.gc.space.topology.TopologyFacade#createTransformNodeZYX(double, double, double, double, double, double)
	 * @generated
	 */
	EOperation getTopologyFacade__CreateTransformNodeZYX__double_double_double_double_double_double();

	/**
	 * Returns the meta object for the '{@link ca.gc.space.topology.TopologyFacade#createTransformNode(javax.vecmath.Matrix4d) <em>Create Transform Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Transform Node</em>' operation.
	 * @see ca.gc.space.topology.TopologyFacade#createTransformNode(javax.vecmath.Matrix4d)
	 * @generated
	 */
	EOperation getTopologyFacade__CreateTransformNode__Matrix4d();

	/**
	 * Returns the meta object for the '{@link ca.gc.space.topology.TopologyFacade#createPickAndPlaceNode(javax.vecmath.Matrix4d) <em>Create Pick And Place Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Pick And Place Node</em>' operation.
	 * @see ca.gc.space.topology.TopologyFacade#createPickAndPlaceNode(javax.vecmath.Matrix4d)
	 * @generated
	 */
	EOperation getTopologyFacade__CreatePickAndPlaceNode__Matrix4d();

	/**
	 * Returns the meta object for the '{@link ca.gc.space.topology.TopologyFacade#printTopology(ca.gc.space.topology.Node) <em>Print Topology</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Print Topology</em>' operation.
	 * @see ca.gc.space.topology.TopologyFacade#printTopology(ca.gc.space.topology.Node)
	 * @generated
	 */
	EOperation getTopologyFacade__PrintTopology__Node();

	/**
	 * Returns the meta object for the '{@link ca.gc.space.topology.TopologyFacade#createReferencedContentNode(java.lang.Object) <em>Create Referenced Content Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Referenced Content Node</em>' operation.
	 * @see ca.gc.space.topology.TopologyFacade#createReferencedContentNode(java.lang.Object)
	 * @generated
	 */
	EOperation getTopologyFacade__CreateReferencedContentNode__Object();

	/**
	 * Returns the meta object for the '{@link ca.gc.space.topology.TopologyFacade#createAggregateContentNode(java.lang.Object) <em>Create Aggregate Content Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Aggregate Content Node</em>' operation.
	 * @see ca.gc.space.topology.TopologyFacade#createAggregateContentNode(java.lang.Object)
	 * @generated
	 */
	EOperation getTopologyFacade__CreateAggregateContentNode__Object();

	/**
	 * Returns the meta object for the '{@link ca.gc.space.topology.TopologyFacade#createLink(ca.gc.space.topology.Node) <em>Create Link</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Link</em>' operation.
	 * @see ca.gc.space.topology.TopologyFacade#createLink(ca.gc.space.topology.Node)
	 * @generated
	 */
	EOperation getTopologyFacade__CreateLink__Node();

	/**
	 * Returns the meta object for the '{@link ca.gc.space.topology.TopologyFacade#findNodesByDescription(java.lang.String, ca.gc.space.topology.Node) <em>Find Nodes By Description</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Nodes By Description</em>' operation.
	 * @see ca.gc.space.topology.TopologyFacade#findNodesByDescription(java.lang.String, ca.gc.space.topology.Node)
	 * @generated
	 */
	EOperation getTopologyFacade__FindNodesByDescription__String_Node();

	/**
	 * Returns the meta object for the '{@link ca.gc.space.topology.TopologyFacade#findNodesByID(java.lang.String, ca.gc.space.topology.Node) <em>Find Nodes By ID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Nodes By ID</em>' operation.
	 * @see ca.gc.space.topology.TopologyFacade#findNodesByID(java.lang.String, ca.gc.space.topology.Node)
	 * @generated
	 */
	EOperation getTopologyFacade__FindNodesByID__String_Node();

	/**
	 * Returns the meta object for the '{@link ca.gc.space.topology.TopologyFacade#findNodesByType(org.eclipse.emf.ecore.EClass, ca.gc.space.topology.Node) <em>Find Nodes By Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Nodes By Type</em>' operation.
	 * @see ca.gc.space.topology.TopologyFacade#findNodesByType(org.eclipse.emf.ecore.EClass, ca.gc.space.topology.Node)
	 * @generated
	 */
	EOperation getTopologyFacade__FindNodesByType__EClass_Node();

	/**
	 * Returns the meta object for the '{@link ca.gc.space.topology.TopologyFacade#findRoot(ca.gc.space.topology.Node) <em>Find Root</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Root</em>' operation.
	 * @see ca.gc.space.topology.TopologyFacade#findRoot(ca.gc.space.topology.Node)
	 * @generated
	 */
	EOperation getTopologyFacade__FindRoot__Node();

	/**
	 * Returns the meta object for the '{@link ca.gc.space.topology.TopologyFacade#getEuclidianDistance(ca.gc.space.topology.Node, ca.gc.space.topology.Node) <em>Get Euclidian Distance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Euclidian Distance</em>' operation.
	 * @see ca.gc.space.topology.TopologyFacade#getEuclidianDistance(ca.gc.space.topology.Node, ca.gc.space.topology.Node)
	 * @generated
	 */
	EOperation getTopologyFacade__GetEuclidianDistance__Node_Node();

	/**
	 * Returns the meta object for the '{@link ca.gc.space.topology.TopologyFacade#getGeodesicDistance(ca.gc.space.topology.Node, ca.gc.space.topology.Node) <em>Get Geodesic Distance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Geodesic Distance</em>' operation.
	 * @see ca.gc.space.topology.TopologyFacade#getGeodesicDistance(ca.gc.space.topology.Node, ca.gc.space.topology.Node)
	 * @generated
	 */
	EOperation getTopologyFacade__GetGeodesicDistance__Node_Node();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Object</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getObject();

	/**
	 * Returns the meta object for data type '<em>Double Array</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Double Array</em>'.
	 * @model instanceClass="double[]"
	 * @generated
	 */
	EDataType getDoubleArray();

	/**
	 * Returns the meta object for data type '{@link java.net.URL <em>URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>URL</em>'.
	 * @see java.net.URL
	 * @model instanceClass="java.net.URL"
	 * @generated
	 */
	EDataType getURL();

	/**
	 * Returns the meta object for data type '{@link ca.gc.space.topology.INodeVisitor <em>INode Visitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>INode Visitor</em>'.
	 * @see ca.gc.space.topology.INodeVisitor
	 * @model instanceClass="ca.gc.space.topology.INodeVisitor" serializeable="false"
	 * @generated
	 */
	EDataType getINodeVisitor();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TopologyFactory getTopologyFactory();

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
		 * The meta object literal for the '{@link ca.gc.space.topology.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.space.topology.impl.NodeImpl
		 * @see ca.gc.space.topology.impl.TopologyPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__PARENT = eINSTANCE.getNode_Parent();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__DESCRIPTION = eINSTANCE.getNode_Description();

		/**
		 * The meta object literal for the '<em><b>Node Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__NODE_ID = eINSTANCE.getNode_NodeId();

		/**
		 * The meta object literal for the '<em><b>Accept</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE___ACCEPT__INODEVISITOR = eINSTANCE.getNode__Accept__INodeVisitor();

		/**
		 * The meta object literal for the '{@link ca.gc.space.topology.impl.ContentNodeImpl <em>Content Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.space.topology.impl.ContentNodeImpl
		 * @see ca.gc.space.topology.impl.TopologyPackageImpl#getContentNode()
		 * @generated
		 */
		EClass CONTENT_NODE = eINSTANCE.getContentNode();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_NODE__CONTENT = eINSTANCE.getContentNode_Content();

		/**
		 * The meta object literal for the '{@link ca.gc.space.topology.impl.PositionNodeImpl <em>Position Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.space.topology.impl.PositionNodeImpl
		 * @see ca.gc.space.topology.impl.TopologyPackageImpl#getPositionNode()
		 * @generated
		 */
		EClass POSITION_NODE = eINSTANCE.getPositionNode();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSITION_NODE__POSITION = eINSTANCE.getPositionNode_Position();

		/**
		 * The meta object literal for the '{@link ca.gc.space.topology.impl.RotationNodeImpl <em>Rotation Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.space.topology.impl.RotationNodeImpl
		 * @see ca.gc.space.topology.impl.TopologyPackageImpl#getRotationNode()
		 * @generated
		 */
		EClass ROTATION_NODE = eINSTANCE.getRotationNode();

		/**
		 * The meta object literal for the '<em><b>Rotation Matrix</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROTATION_NODE__ROTATION_MATRIX = eINSTANCE.getRotationNode_RotationMatrix();

		/**
		 * The meta object literal for the '{@link ca.gc.space.topology.GroupNode <em>Group Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.space.topology.GroupNode
		 * @see ca.gc.space.topology.impl.TopologyPackageImpl#getGroupNode()
		 * @generated
		 */
		EClass GROUP_NODE = eINSTANCE.getGroupNode();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP_NODE__CHILDREN = eINSTANCE.getGroupNode_Children();

		/**
		 * The meta object literal for the '{@link ca.gc.space.topology.impl.LeafImpl <em>Leaf</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.space.topology.impl.LeafImpl
		 * @see ca.gc.space.topology.impl.TopologyPackageImpl#getLeaf()
		 * @generated
		 */
		EClass LEAF = eINSTANCE.getLeaf();

		/**
		 * The meta object literal for the '{@link ca.gc.space.topology.impl.PickAndPlaceNodeImpl <em>Pick And Place Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.space.topology.impl.PickAndPlaceNodeImpl
		 * @see ca.gc.space.topology.impl.TopologyPackageImpl#getPickAndPlaceNode()
		 * @generated
		 */
		EClass PICK_AND_PLACE_NODE = eINSTANCE.getPickAndPlaceNode();

		/**
		 * The meta object literal for the '{@link ca.gc.space.topology.impl.ReferencedContentNodeImpl <em>Referenced Content Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.space.topology.impl.ReferencedContentNodeImpl
		 * @see ca.gc.space.topology.impl.TopologyPackageImpl#getReferencedContentNode()
		 * @generated
		 */
		EClass REFERENCED_CONTENT_NODE = eINSTANCE.getReferencedContentNode();

		/**
		 * The meta object literal for the '<em><b>Referenced Content</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCED_CONTENT_NODE__REFERENCED_CONTENT = eINSTANCE.getReferencedContentNode_ReferencedContent();

		/**
		 * The meta object literal for the '{@link ca.gc.space.topology.impl.AggregateContentNodeImpl <em>Aggregate Content Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.space.topology.impl.AggregateContentNodeImpl
		 * @see ca.gc.space.topology.impl.TopologyPackageImpl#getAggregateContentNode()
		 * @generated
		 */
		EClass AGGREGATE_CONTENT_NODE = eINSTANCE.getAggregateContentNode();

		/**
		 * The meta object literal for the '<em><b>Aggregate Content</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT = eINSTANCE.getAggregateContentNode_AggregateContent();

		/**
		 * The meta object literal for the '{@link ca.gc.space.topology.impl.URLNodeImpl <em>URL Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.space.topology.impl.URLNodeImpl
		 * @see ca.gc.space.topology.impl.TopologyPackageImpl#getURLNode()
		 * @generated
		 */
		EClass URL_NODE = eINSTANCE.getURLNode();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute URL_NODE__URL = eINSTANCE.getURLNode_Url();

		/**
		 * The meta object literal for the '<em><b>Polygon Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute URL_NODE__POLYGON_COUNT = eINSTANCE.getURLNode_PolygonCount();

		/**
		 * The meta object literal for the '<em><b>Vertex Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute URL_NODE__VERTEX_COUNT = eINSTANCE.getURLNode_VertexCount();

		/**
		 * The meta object literal for the '{@link ca.gc.space.topology.TopologyProvider <em>Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.space.topology.TopologyProvider
		 * @see ca.gc.space.topology.impl.TopologyPackageImpl#getTopologyProvider()
		 * @generated
		 */
		EClass TOPOLOGY_PROVIDER = eINSTANCE.getTopologyProvider();

		/**
		 * The meta object literal for the '<em><b>Topology Root</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOPOLOGY_PROVIDER__TOPOLOGY_ROOT = eINSTANCE.getTopologyProvider_TopologyRoot();

		/**
		 * The meta object literal for the '{@link ca.gc.space.topology.impl.ReferencedGroupNodeImpl <em>Referenced Group Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.space.topology.impl.ReferencedGroupNodeImpl
		 * @see ca.gc.space.topology.impl.TopologyPackageImpl#getReferencedGroupNode()
		 * @generated
		 */
		EClass REFERENCED_GROUP_NODE = eINSTANCE.getReferencedGroupNode();

		/**
		 * The meta object literal for the '<em><b>Referenced Children</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCED_GROUP_NODE__REFERENCED_CHILDREN = eINSTANCE.getReferencedGroupNode_ReferencedChildren();

		/**
		 * The meta object literal for the '{@link ca.gc.space.topology.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.space.topology.impl.LinkImpl
		 * @see ca.gc.space.topology.impl.TopologyPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__NODE = eINSTANCE.getLink_Node();

		/**
		 * The meta object literal for the '{@link ca.gc.space.topology.impl.AggregateGroupNodeImpl <em>Aggregate Group Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.space.topology.impl.AggregateGroupNodeImpl
		 * @see ca.gc.space.topology.impl.TopologyPackageImpl#getAggregateGroupNode()
		 * @generated
		 */
		EClass AGGREGATE_GROUP_NODE = eINSTANCE.getAggregateGroupNode();

		/**
		 * The meta object literal for the '<em><b>Aggregated Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN = eINSTANCE.getAggregateGroupNode_AggregatedChildren();

		/**
		 * The meta object literal for the '{@link ca.gc.space.topology.impl.CADNodeImpl <em>CAD Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.space.topology.impl.CADNodeImpl
		 * @see ca.gc.space.topology.impl.TopologyPackageImpl#getCADNode()
		 * @generated
		 */
		EClass CAD_NODE = eINSTANCE.getCADNode();

		/**
		 * The meta object literal for the '<em><b>Node Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAD_NODE__NODE_NAME = eINSTANCE.getCADNode_NodeName();

		/**
		 * The meta object literal for the '{@link ca.gc.space.topology.impl.TransformNodeImpl <em>Transform Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.space.topology.impl.TransformNodeImpl
		 * @see ca.gc.space.topology.impl.TopologyPackageImpl#getTransformNode()
		 * @generated
		 */
		EClass TRANSFORM_NODE = eINSTANCE.getTransformNode();

		/**
		 * The meta object literal for the '<em><b>As Matrix4d</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRANSFORM_NODE___AS_MATRIX4D = eINSTANCE.getTransformNode__AsMatrix4d();

		/**
		 * The meta object literal for the '<em><b>Set Transformation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRANSFORM_NODE___SET_TRANSFORMATION__MATRIX4D = eINSTANCE.getTransformNode__SetTransformation__Matrix4d();

		/**
		 * The meta object literal for the '{@link ca.gc.space.topology.impl.TopologyFacadeImpl <em>Facade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.space.topology.impl.TopologyFacadeImpl
		 * @see ca.gc.space.topology.impl.TopologyPackageImpl#getTopologyFacade()
		 * @generated
		 */
		EClass TOPOLOGY_FACADE = eINSTANCE.getTopologyFacade();

		/**
		 * The meta object literal for the '<em><b>Create Content Node</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOPOLOGY_FACADE___CREATE_CONTENT_NODE__OBJECT = eINSTANCE.getTopologyFacade__CreateContentNode__Object();

		/**
		 * The meta object literal for the '<em><b>Create Position Node</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOPOLOGY_FACADE___CREATE_POSITION_NODE__DOUBLE_DOUBLE_DOUBLE = eINSTANCE.getTopologyFacade__CreatePositionNode__double_double_double();

		/**
		 * The meta object literal for the '<em><b>Create Rotation Node XYZ</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOPOLOGY_FACADE___CREATE_ROTATION_NODE_XYZ__DOUBLE_DOUBLE_DOUBLE = eINSTANCE.getTopologyFacade__CreateRotationNodeXYZ__double_double_double();

		/**
		 * The meta object literal for the '<em><b>Express Node In Root Frame</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOPOLOGY_FACADE___EXPRESS_NODE_IN_ROOT_FRAME__NODE = eINSTANCE.getTopologyFacade__ExpressNodeInRootFrame__Node();

		/**
		 * The meta object literal for the '<em><b>Express Root In Node Frame</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOPOLOGY_FACADE___EXPRESS_ROOT_IN_NODE_FRAME__NODE = eINSTANCE.getTopologyFacade__ExpressRootInNodeFrame__Node();

		/**
		 * The meta object literal for the '<em><b>Express In Frame</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOPOLOGY_FACADE___EXPRESS_IN_FRAME__NODE_NODE = eINSTANCE.getTopologyFacade__ExpressInFrame__Node_Node();

		/**
		 * The meta object literal for the '<em><b>Create Rotation Node YZX</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOPOLOGY_FACADE___CREATE_ROTATION_NODE_YZX__DOUBLE_DOUBLE_DOUBLE = eINSTANCE.getTopologyFacade__CreateRotationNodeYZX__double_double_double();

		/**
		 * The meta object literal for the '<em><b>Create Rotation Node ZYX</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOPOLOGY_FACADE___CREATE_ROTATION_NODE_ZYX__DOUBLE_DOUBLE_DOUBLE = eINSTANCE.getTopologyFacade__CreateRotationNodeZYX__double_double_double();

		/**
		 * The meta object literal for the '<em><b>Create Transform Node XYZ</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOPOLOGY_FACADE___CREATE_TRANSFORM_NODE_XYZ__DOUBLE_DOUBLE_DOUBLE_DOUBLE_DOUBLE_DOUBLE = eINSTANCE.getTopologyFacade__CreateTransformNodeXYZ__double_double_double_double_double_double();

		/**
		 * The meta object literal for the '<em><b>Create Transform Node YZX</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOPOLOGY_FACADE___CREATE_TRANSFORM_NODE_YZX__DOUBLE_DOUBLE_DOUBLE_DOUBLE_DOUBLE_DOUBLE = eINSTANCE.getTopologyFacade__CreateTransformNodeYZX__double_double_double_double_double_double();

		/**
		 * The meta object literal for the '<em><b>Create Transform Node ZYX</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOPOLOGY_FACADE___CREATE_TRANSFORM_NODE_ZYX__DOUBLE_DOUBLE_DOUBLE_DOUBLE_DOUBLE_DOUBLE = eINSTANCE.getTopologyFacade__CreateTransformNodeZYX__double_double_double_double_double_double();

		/**
		 * The meta object literal for the '<em><b>Create Transform Node</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOPOLOGY_FACADE___CREATE_TRANSFORM_NODE__MATRIX4D = eINSTANCE.getTopologyFacade__CreateTransformNode__Matrix4d();

		/**
		 * The meta object literal for the '<em><b>Create Pick And Place Node</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOPOLOGY_FACADE___CREATE_PICK_AND_PLACE_NODE__MATRIX4D = eINSTANCE.getTopologyFacade__CreatePickAndPlaceNode__Matrix4d();

		/**
		 * The meta object literal for the '<em><b>Print Topology</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOPOLOGY_FACADE___PRINT_TOPOLOGY__NODE = eINSTANCE.getTopologyFacade__PrintTopology__Node();

		/**
		 * The meta object literal for the '<em><b>Create Referenced Content Node</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOPOLOGY_FACADE___CREATE_REFERENCED_CONTENT_NODE__OBJECT = eINSTANCE.getTopologyFacade__CreateReferencedContentNode__Object();

		/**
		 * The meta object literal for the '<em><b>Create Aggregate Content Node</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOPOLOGY_FACADE___CREATE_AGGREGATE_CONTENT_NODE__OBJECT = eINSTANCE.getTopologyFacade__CreateAggregateContentNode__Object();

		/**
		 * The meta object literal for the '<em><b>Create Link</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOPOLOGY_FACADE___CREATE_LINK__NODE = eINSTANCE.getTopologyFacade__CreateLink__Node();

		/**
		 * The meta object literal for the '<em><b>Find Nodes By Description</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOPOLOGY_FACADE___FIND_NODES_BY_DESCRIPTION__STRING_NODE = eINSTANCE.getTopologyFacade__FindNodesByDescription__String_Node();

		/**
		 * The meta object literal for the '<em><b>Find Nodes By ID</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOPOLOGY_FACADE___FIND_NODES_BY_ID__STRING_NODE = eINSTANCE.getTopologyFacade__FindNodesByID__String_Node();

		/**
		 * The meta object literal for the '<em><b>Find Nodes By Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOPOLOGY_FACADE___FIND_NODES_BY_TYPE__ECLASS_NODE = eINSTANCE.getTopologyFacade__FindNodesByType__EClass_Node();

		/**
		 * The meta object literal for the '<em><b>Find Root</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOPOLOGY_FACADE___FIND_ROOT__NODE = eINSTANCE.getTopologyFacade__FindRoot__Node();

		/**
		 * The meta object literal for the '<em><b>Get Euclidian Distance</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOPOLOGY_FACADE___GET_EUCLIDIAN_DISTANCE__NODE_NODE = eINSTANCE.getTopologyFacade__GetEuclidianDistance__Node_Node();

		/**
		 * The meta object literal for the '<em><b>Get Geodesic Distance</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOPOLOGY_FACADE___GET_GEODESIC_DISTANCE__NODE_NODE = eINSTANCE.getTopologyFacade__GetGeodesicDistance__Node_Node();

		/**
		 * The meta object literal for the '<em>Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see ca.gc.space.topology.impl.TopologyPackageImpl#getObject()
		 * @generated
		 */
		EDataType OBJECT = eINSTANCE.getObject();

		/**
		 * The meta object literal for the '<em>Double Array</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.space.topology.impl.TopologyPackageImpl#getDoubleArray()
		 * @generated
		 */
		EDataType DOUBLE_ARRAY = eINSTANCE.getDoubleArray();

		/**
		 * The meta object literal for the '<em>URL</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.net.URL
		 * @see ca.gc.space.topology.impl.TopologyPackageImpl#getURL()
		 * @generated
		 */
		EDataType URL = eINSTANCE.getURL();

		/**
		 * The meta object literal for the '<em>INode Visitor</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.space.topology.INodeVisitor
		 * @see ca.gc.space.topology.impl.TopologyPackageImpl#getINodeVisitor()
		 * @generated
		 */
		EDataType INODE_VISITOR = eINSTANCE.getINodeVisitor();

	}

} //TopologyPackage
