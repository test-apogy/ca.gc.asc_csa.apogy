/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.topology.impl;

import javax.vecmath.Matrix4d;

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
import org.eclipse.symphony.common.math.MathPackage;
import org.eclipse.symphony.common.topology.AggregateContentNode;
import org.eclipse.symphony.common.topology.AggregateGroupNode;
import org.eclipse.symphony.common.topology.CADNode;
import org.eclipse.symphony.common.topology.ContentNode;
import org.eclipse.symphony.common.topology.GroupNode;
import org.eclipse.symphony.common.topology.INodeVisitor;
import org.eclipse.symphony.common.topology.Leaf;
import org.eclipse.symphony.common.topology.Link;
import org.eclipse.symphony.common.topology.Node;
import org.eclipse.symphony.common.topology.PickAndPlaceNode;
import org.eclipse.symphony.common.topology.PositionNode;
import org.eclipse.symphony.common.topology.ReferencedContentNode;
import org.eclipse.symphony.common.topology.ReferencedGroupNode;
import org.eclipse.symphony.common.topology.RotationNode;
import org.eclipse.symphony.common.topology.TopologyFacade;
import org.eclipse.symphony.common.topology.TopologyFactory;
import org.eclipse.symphony.common.topology.TopologyPackage;
import org.eclipse.symphony.common.topology.TopologyProvider;
import org.eclipse.symphony.common.topology.TransformNode;
import org.eclipse.symphony.common.topology.URLNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TopologyPackageImpl extends EPackageImpl implements TopologyPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass topologyProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass leafEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass urlNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cadNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contentNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referencedContentNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aggregateContentNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referencedGroupNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aggregateGroupNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass positionNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rotationNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pickAndPlaceNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass topologyFacadeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType matrix4dEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eClassEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType iNodeVisitorEDataType = null;

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
	 * @see org.eclipse.symphony.common.topology.TopologyPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TopologyPackageImpl() {
		super(eNS_URI, TopologyFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TopologyPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TopologyPackage init() {
		if (isInited) return (TopologyPackage)EPackage.Registry.INSTANCE.getEPackage(TopologyPackage.eNS_URI);

		// Obtain or create and register package
		TopologyPackageImpl theTopologyPackage = (TopologyPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TopologyPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TopologyPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		MathPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theTopologyPackage.createPackageContents();

		// Initialize created meta-data
		theTopologyPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTopologyPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TopologyPackage.eNS_URI, theTopologyPackage);
		return theTopologyPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTopologyProvider() {
		return topologyProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTopologyProvider_TopologyRoot() {
		return (EReference)topologyProviderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNode() {
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_Parent() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNode_Description() {
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNode_NodeId() {
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNode__Accept__INodeVisitor() {
		return nodeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLink() {
		return linkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLink_Node() {
		return (EReference)linkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLeaf() {
		return leafEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getURLNode() {
		return urlNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getURLNode_Url() {
		return (EAttribute)urlNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getURLNode_PolygonCount() {
		return (EAttribute)urlNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getURLNode_VertexCount() {
		return (EAttribute)urlNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCADNode() {
		return cadNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCADNode_NodeName() {
		return (EAttribute)cadNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContentNode() {
		return contentNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContentNode_Content() {
		return (EReference)contentNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferencedContentNode() {
		return referencedContentNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferencedContentNode_ReferencedContent() {
		return (EReference)referencedContentNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAggregateContentNode() {
		return aggregateContentNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAggregateContentNode_AggregateContent() {
		return (EReference)aggregateContentNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroupNode() {
		return groupNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupNode_Children() {
		return (EReference)groupNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferencedGroupNode() {
		return referencedGroupNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferencedGroupNode_ReferencedChildren() {
		return (EReference)referencedGroupNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAggregateGroupNode() {
		return aggregateGroupNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAggregateGroupNode_AggregatedChildren() {
		return (EReference)aggregateGroupNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPositionNode() {
		return positionNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPositionNode_Position() {
		return (EReference)positionNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRotationNode() {
		return rotationNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRotationNode_RotationMatrix() {
		return (EReference)rotationNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransformNode() {
		return transformNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTransformNode__AsMatrix4d() {
		return transformNodeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTransformNode__SetTransformation__Matrix4d() {
		return transformNodeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPickAndPlaceNode() {
		return pickAndPlaceNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTopologyFacade() {
		return topologyFacadeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTopologyFacade__CreateLink__Node() {
		return topologyFacadeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTopologyFacade__CreateContentNode__Object() {
		return topologyFacadeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTopologyFacade__CreateReferencedContentNode__Object() {
		return topologyFacadeEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTopologyFacade__CreateAggregateContentNode__Object() {
		return topologyFacadeEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTopologyFacade__CreatePositionNode__double_double_double() {
		return topologyFacadeEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTopologyFacade__CreateRotationNodeXYZ__double_double_double() {
		return topologyFacadeEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTopologyFacade__CreateRotationNodeYZX__double_double_double() {
		return topologyFacadeEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTopologyFacade__CreateRotationNodeZYX__double_double_double() {
		return topologyFacadeEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTopologyFacade__CreateTransformNodeXYZ__double_double_double_double_double_double() {
		return topologyFacadeEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTopologyFacade__CreateTransformNodeYZX__double_double_double_double_double_double() {
		return topologyFacadeEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTopologyFacade__CreateTransformNodeZYX__double_double_double_double_double_double() {
		return topologyFacadeEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTopologyFacade__CreateTransformNode__Matrix4d() {
		return topologyFacadeEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTopologyFacade__CreatePickAndPlaceNode__Matrix4d() {
		return topologyFacadeEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTopologyFacade__ExpressNodeInRootFrame__Node() {
		return topologyFacadeEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTopologyFacade__ExpressRootInNodeFrame__Node() {
		return topologyFacadeEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTopologyFacade__ExpressInFrame__Node_Node() {
		return topologyFacadeEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTopologyFacade__FindNodesByDescription__String_Node() {
		return topologyFacadeEClass.getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTopologyFacade__FindNodesByID__String_Node() {
		return topologyFacadeEClass.getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTopologyFacade__FindNodesByType__EClass_Node() {
		return topologyFacadeEClass.getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTopologyFacade__FindRoot__Node() {
		return topologyFacadeEClass.getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTopologyFacade__GetEuclideanDistance__Node_Node() {
		return topologyFacadeEClass.getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTopologyFacade__GetGeodesicDistance__Node_Node() {
		return topologyFacadeEClass.getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTopologyFacade__PrintTopology__Node() {
		return topologyFacadeEClass.getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMatrix4d() {
		return matrix4dEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEClass() {
		return eClassEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getINodeVisitor() {
		return iNodeVisitorEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopologyFactory getTopologyFactory() {
		return (TopologyFactory)getEFactoryInstance();
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
		topologyProviderEClass = createEClass(TOPOLOGY_PROVIDER);
		createEReference(topologyProviderEClass, TOPOLOGY_PROVIDER__TOPOLOGY_ROOT);

		nodeEClass = createEClass(NODE);
		createEReference(nodeEClass, NODE__PARENT);
		createEAttribute(nodeEClass, NODE__DESCRIPTION);
		createEAttribute(nodeEClass, NODE__NODE_ID);
		createEOperation(nodeEClass, NODE___ACCEPT__INODEVISITOR);

		linkEClass = createEClass(LINK);
		createEReference(linkEClass, LINK__NODE);

		leafEClass = createEClass(LEAF);

		urlNodeEClass = createEClass(URL_NODE);
		createEAttribute(urlNodeEClass, URL_NODE__URL);
		createEAttribute(urlNodeEClass, URL_NODE__POLYGON_COUNT);
		createEAttribute(urlNodeEClass, URL_NODE__VERTEX_COUNT);

		cadNodeEClass = createEClass(CAD_NODE);
		createEAttribute(cadNodeEClass, CAD_NODE__NODE_NAME);

		contentNodeEClass = createEClass(CONTENT_NODE);
		createEReference(contentNodeEClass, CONTENT_NODE__CONTENT);

		referencedContentNodeEClass = createEClass(REFERENCED_CONTENT_NODE);
		createEReference(referencedContentNodeEClass, REFERENCED_CONTENT_NODE__REFERENCED_CONTENT);

		aggregateContentNodeEClass = createEClass(AGGREGATE_CONTENT_NODE);
		createEReference(aggregateContentNodeEClass, AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT);

		groupNodeEClass = createEClass(GROUP_NODE);
		createEReference(groupNodeEClass, GROUP_NODE__CHILDREN);

		referencedGroupNodeEClass = createEClass(REFERENCED_GROUP_NODE);
		createEReference(referencedGroupNodeEClass, REFERENCED_GROUP_NODE__REFERENCED_CHILDREN);

		aggregateGroupNodeEClass = createEClass(AGGREGATE_GROUP_NODE);
		createEReference(aggregateGroupNodeEClass, AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN);

		positionNodeEClass = createEClass(POSITION_NODE);
		createEReference(positionNodeEClass, POSITION_NODE__POSITION);

		rotationNodeEClass = createEClass(ROTATION_NODE);
		createEReference(rotationNodeEClass, ROTATION_NODE__ROTATION_MATRIX);

		transformNodeEClass = createEClass(TRANSFORM_NODE);
		createEOperation(transformNodeEClass, TRANSFORM_NODE___AS_MATRIX4D);
		createEOperation(transformNodeEClass, TRANSFORM_NODE___SET_TRANSFORMATION__MATRIX4D);

		pickAndPlaceNodeEClass = createEClass(PICK_AND_PLACE_NODE);

		topologyFacadeEClass = createEClass(TOPOLOGY_FACADE);
		createEOperation(topologyFacadeEClass, TOPOLOGY_FACADE___CREATE_LINK__NODE);
		createEOperation(topologyFacadeEClass, TOPOLOGY_FACADE___CREATE_CONTENT_NODE__OBJECT);
		createEOperation(topologyFacadeEClass, TOPOLOGY_FACADE___CREATE_REFERENCED_CONTENT_NODE__OBJECT);
		createEOperation(topologyFacadeEClass, TOPOLOGY_FACADE___CREATE_AGGREGATE_CONTENT_NODE__OBJECT);
		createEOperation(topologyFacadeEClass, TOPOLOGY_FACADE___CREATE_POSITION_NODE__DOUBLE_DOUBLE_DOUBLE);
		createEOperation(topologyFacadeEClass, TOPOLOGY_FACADE___CREATE_ROTATION_NODE_XYZ__DOUBLE_DOUBLE_DOUBLE);
		createEOperation(topologyFacadeEClass, TOPOLOGY_FACADE___CREATE_ROTATION_NODE_YZX__DOUBLE_DOUBLE_DOUBLE);
		createEOperation(topologyFacadeEClass, TOPOLOGY_FACADE___CREATE_ROTATION_NODE_ZYX__DOUBLE_DOUBLE_DOUBLE);
		createEOperation(topologyFacadeEClass, TOPOLOGY_FACADE___CREATE_TRANSFORM_NODE_XYZ__DOUBLE_DOUBLE_DOUBLE_DOUBLE_DOUBLE_DOUBLE);
		createEOperation(topologyFacadeEClass, TOPOLOGY_FACADE___CREATE_TRANSFORM_NODE_YZX__DOUBLE_DOUBLE_DOUBLE_DOUBLE_DOUBLE_DOUBLE);
		createEOperation(topologyFacadeEClass, TOPOLOGY_FACADE___CREATE_TRANSFORM_NODE_ZYX__DOUBLE_DOUBLE_DOUBLE_DOUBLE_DOUBLE_DOUBLE);
		createEOperation(topologyFacadeEClass, TOPOLOGY_FACADE___CREATE_TRANSFORM_NODE__MATRIX4D);
		createEOperation(topologyFacadeEClass, TOPOLOGY_FACADE___CREATE_PICK_AND_PLACE_NODE__MATRIX4D);
		createEOperation(topologyFacadeEClass, TOPOLOGY_FACADE___EXPRESS_NODE_IN_ROOT_FRAME__NODE);
		createEOperation(topologyFacadeEClass, TOPOLOGY_FACADE___EXPRESS_ROOT_IN_NODE_FRAME__NODE);
		createEOperation(topologyFacadeEClass, TOPOLOGY_FACADE___EXPRESS_IN_FRAME__NODE_NODE);
		createEOperation(topologyFacadeEClass, TOPOLOGY_FACADE___FIND_NODES_BY_DESCRIPTION__STRING_NODE);
		createEOperation(topologyFacadeEClass, TOPOLOGY_FACADE___FIND_NODES_BY_ID__STRING_NODE);
		createEOperation(topologyFacadeEClass, TOPOLOGY_FACADE___FIND_NODES_BY_TYPE__ECLASS_NODE);
		createEOperation(topologyFacadeEClass, TOPOLOGY_FACADE___FIND_ROOT__NODE);
		createEOperation(topologyFacadeEClass, TOPOLOGY_FACADE___GET_EUCLIDEAN_DISTANCE__NODE_NODE);
		createEOperation(topologyFacadeEClass, TOPOLOGY_FACADE___GET_GEODESIC_DISTANCE__NODE_NODE);
		createEOperation(topologyFacadeEClass, TOPOLOGY_FACADE___PRINT_TOPOLOGY__NODE);

		// Create data types
		matrix4dEDataType = createEDataType(MATRIX4D);
		eClassEDataType = createEDataType(ECLASS);
		iNodeVisitorEDataType = createEDataType(INODE_VISITOR);
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
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		MathPackage theMathPackage = (MathPackage)EPackage.Registry.INSTANCE.getEPackage(MathPackage.eNS_URI);

		// Create type parameters
		ETypeParameter contentNodeEClass_T = addETypeParameter(contentNodeEClass, "T");
		ETypeParameter referencedContentNodeEClass_T = addETypeParameter(referencedContentNodeEClass, "T");
		ETypeParameter aggregateContentNodeEClass_T = addETypeParameter(aggregateContentNodeEClass, "T");

		// Set bounds for type parameters

		// Add supertypes to classes
		linkEClass.getESuperTypes().add(this.getNode());
		leafEClass.getESuperTypes().add(this.getNode());
		urlNodeEClass.getESuperTypes().add(this.getLeaf());
		cadNodeEClass.getESuperTypes().add(this.getURLNode());
		contentNodeEClass.getESuperTypes().add(this.getLeaf());
		EGenericType g1 = createEGenericType(this.getContentNode());
		EGenericType g2 = createEGenericType(referencedContentNodeEClass_T);
		g1.getETypeArguments().add(g2);
		referencedContentNodeEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getContentNode());
		g2 = createEGenericType(aggregateContentNodeEClass_T);
		g1.getETypeArguments().add(g2);
		aggregateContentNodeEClass.getEGenericSuperTypes().add(g1);
		groupNodeEClass.getESuperTypes().add(this.getNode());
		referencedGroupNodeEClass.getESuperTypes().add(this.getGroupNode());
		aggregateGroupNodeEClass.getESuperTypes().add(this.getGroupNode());
		positionNodeEClass.getESuperTypes().add(this.getAggregateGroupNode());
		rotationNodeEClass.getESuperTypes().add(this.getAggregateGroupNode());
		transformNodeEClass.getESuperTypes().add(this.getPositionNode());
		transformNodeEClass.getESuperTypes().add(this.getRotationNode());
		pickAndPlaceNodeEClass.getESuperTypes().add(this.getTransformNode());

		// Initialize classes, features, and operations; add parameters
		initEClass(topologyProviderEClass, TopologyProvider.class, "TopologyProvider", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTopologyProvider_TopologyRoot(), this.getGroupNode(), null, "topologyRoot", null, 0, 1, TopologyProvider.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeEClass, Node.class, "Node", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNode_Parent(), this.getNode(), null, "parent", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_Description(), theEcorePackage.getEString(), "description", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_NodeId(), theEcorePackage.getEString(), "nodeId", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getNode__Accept__INodeVisitor(), null, "accept", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getINodeVisitor(), "visitor", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(linkEClass, Link.class, "Link", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLink_Node(), this.getNode(), null, "node", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(leafEClass, Leaf.class, "Leaf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(urlNodeEClass, URLNode.class, "URLNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getURLNode_Url(), theEcorePackage.getEString(), "url", null, 0, 1, URLNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getURLNode_PolygonCount(), theEcorePackage.getEInt(), "polygonCount", null, 0, 1, URLNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getURLNode_VertexCount(), theEcorePackage.getEInt(), "vertexCount", null, 0, 1, URLNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cadNodeEClass, CADNode.class, "CADNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCADNode_NodeName(), theEcorePackage.getEString(), "nodeName", null, 0, 1, CADNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contentNodeEClass, ContentNode.class, "ContentNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(contentNodeEClass_T);
		initEReference(getContentNode_Content(), g1, null, "content", null, 0, 1, ContentNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referencedContentNodeEClass, ReferencedContentNode.class, "ReferencedContentNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(referencedContentNodeEClass_T);
		initEReference(getReferencedContentNode_ReferencedContent(), g1, null, "referencedContent", null, 0, 1, ReferencedContentNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aggregateContentNodeEClass, AggregateContentNode.class, "AggregateContentNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(aggregateContentNodeEClass_T);
		initEReference(getAggregateContentNode_AggregateContent(), g1, null, "aggregateContent", null, 0, 1, AggregateContentNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(groupNodeEClass, GroupNode.class, "GroupNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGroupNode_Children(), this.getNode(), null, "children", null, 0, -1, GroupNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referencedGroupNodeEClass, ReferencedGroupNode.class, "ReferencedGroupNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReferencedGroupNode_ReferencedChildren(), this.getNode(), null, "referencedChildren", null, 0, -1, ReferencedGroupNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aggregateGroupNodeEClass, AggregateGroupNode.class, "AggregateGroupNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAggregateGroupNode_AggregatedChildren(), this.getNode(), null, "aggregatedChildren", null, 0, -1, AggregateGroupNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(positionNodeEClass, PositionNode.class, "PositionNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPositionNode_Position(), theMathPackage.getTuple3d(), null, "position", null, 0, 1, PositionNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rotationNodeEClass, RotationNode.class, "RotationNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRotationNode_RotationMatrix(), theMathPackage.getMatrix3x3(), null, "rotationMatrix", null, 0, 1, RotationNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transformNodeEClass, TransformNode.class, "TransformNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getTransformNode__AsMatrix4d(), this.getMatrix4d(), "asMatrix4d", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTransformNode__SetTransformation__Matrix4d(), null, "setTransformation", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMatrix4d(), "matrix", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(pickAndPlaceNodeEClass, PickAndPlaceNode.class, "PickAndPlaceNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(topologyFacadeEClass, TopologyFacade.class, "TopologyFacade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getTopologyFacade__CreateLink__Node(), this.getLink(), "createLink", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNode(), "node", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTopologyFacade__CreateContentNode__Object(), null, "createContentNode", 0, 1, !IS_UNIQUE, IS_ORDERED);
		ETypeParameter t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(t1);
		addEParameter(op, g1, "content", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getContentNode());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getTopologyFacade__CreateReferencedContentNode__Object(), null, "createReferencedContentNode", 0, 1, !IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(t1);
		addEParameter(op, g1, "content", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getReferencedContentNode());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getTopologyFacade__CreateAggregateContentNode__Object(), null, "createAggregateContentNode", 0, 1, !IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(t1);
		addEParameter(op, g1, "content", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getAggregateContentNode());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getTopologyFacade__CreatePositionNode__double_double_double(), this.getPositionNode(), "createPositionNode", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "x", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "y", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "z", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTopologyFacade__CreateRotationNodeXYZ__double_double_double(), this.getRotationNode(), "createRotationNodeXYZ", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "x", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "y", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "z", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTopologyFacade__CreateRotationNodeYZX__double_double_double(), this.getRotationNode(), "createRotationNodeYZX", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "x", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "y", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "z", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTopologyFacade__CreateRotationNodeZYX__double_double_double(), this.getRotationNode(), "createRotationNodeZYX", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "x", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "y", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "z", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTopologyFacade__CreateTransformNodeXYZ__double_double_double_double_double_double(), this.getTransformNode(), "createTransformNodeXYZ", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "tx", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "ty", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "tz", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "rx", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "ry", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "rz", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTopologyFacade__CreateTransformNodeYZX__double_double_double_double_double_double(), this.getTransformNode(), "createTransformNodeYZX", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "tx", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "ty", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "tz", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "rx", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "ry", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "rz", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTopologyFacade__CreateTransformNodeZYX__double_double_double_double_double_double(), this.getTransformNode(), "createTransformNodeZYX", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "tx", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "ty", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "tz", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "rx", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "ry", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "rz", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTopologyFacade__CreateTransformNode__Matrix4d(), this.getTransformNode(), "createTransformNode", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMatrix4d(), "matrix", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTopologyFacade__CreatePickAndPlaceNode__Matrix4d(), this.getPickAndPlaceNode(), "createPickAndPlaceNode", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMatrix4d(), "matrix", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTopologyFacade__ExpressNodeInRootFrame__Node(), this.getMatrix4d(), "expressNodeInRootFrame", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNode(), "node", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTopologyFacade__ExpressRootInNodeFrame__Node(), this.getMatrix4d(), "expressRootInNodeFrame", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNode(), "node", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTopologyFacade__ExpressInFrame__Node_Node(), this.getMatrix4d(), "expressInFrame", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNode(), "sourceFrame", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNode(), "targetFrame", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTopologyFacade__FindNodesByDescription__String_Node(), this.getNode(), "findNodesByDescription", 0, -1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "description", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNode(), "topology", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTopologyFacade__FindNodesByID__String_Node(), this.getNode(), "findNodesByID", 0, -1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "nodeId", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNode(), "topology", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTopologyFacade__FindNodesByType__EClass_Node(), this.getNode(), "findNodesByType", 0, -1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEClass(), "clazz", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNode(), "topology", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTopologyFacade__FindRoot__Node(), this.getNode(), "findRoot", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNode(), "node", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTopologyFacade__GetEuclideanDistance__Node_Node(), theEcorePackage.getEDouble(), "getEuclideanDistance", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNode(), "fromNode", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNode(), "toNode", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTopologyFacade__GetGeodesicDistance__Node_Node(), theEcorePackage.getEDouble(), "getGeodesicDistance", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNode(), "fromNode", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNode(), "toNode", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTopologyFacade__PrintTopology__Node(), null, "printTopology", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNode(), "node", 0, 1, !IS_UNIQUE, IS_ORDERED);

		// Initialize data types
		initEDataType(matrix4dEDataType, Matrix4d.class, "Matrix4d", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eClassEDataType, EClass.class, "EClass", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(iNodeVisitorEDataType, INodeVisitor.class, "INodeVisitor", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

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
			 "prefix", "Topology",
			 "childCreationExtenders", "true",
			 "extensibleProviderFactory", "true",
			 "multipleEditorPages", "false",
			 "copyrightText", "Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)",
			 "modelName", "Topology",
			 "operationReflection", "true",
			 "suppressGenModelAnnotations", "false",
			 "modelDirectory", "/org.eclipse.symphony.common.topology.core/src-generated",
			 "editDirectory", "/org.eclipse.symphony.common.topology.core.edit/src-generated",
			 "basePackage", "ca.gc.space"
		   });	
		addAnnotation
		  (getTopologyFacade__CreateRotationNodeXYZ__double_double_double(), 
		   source, 
		   new String[] {
			 "documentation", "Creates a rotation node with the rotation order\nx*y*z\n\n@param x\n           the rotation around the x axis, in radians.\n@param y\n           the rotation around the y axis, in radians.\n@param z\n           the rotation around the z axis, in radians."
		   });	
		addAnnotation
		  (getTopologyFacade__CreateRotationNodeYZX__double_double_double(), 
		   source, 
		   new String[] {
			 "documentation", "Creates a rotation node with the rotation order\ny*z*x\n\n@param x\n           the rotation around the x axis, in radians.\n@param y\n           the rotation around the y axis, in radians.\n@param z\n           the rotation around the z axis, in radians."
		   });	
		addAnnotation
		  (getTopologyFacade__CreateRotationNodeZYX__double_double_double(), 
		   source, 
		   new String[] {
			 "documentation", "Creates a rotation node with the rotation order\nz*y*x\n\n@param x\n           the rotation around the x axis, in radians.\n@param y\n           the rotation around the y axis, in radians.\n@param z\n           the rotation around the z axis, in radians."
		   });	
		addAnnotation
		  (getTopologyFacade__CreateTransformNodeXYZ__double_double_double_double_double_double(), 
		   source, 
		   new String[] {
			 "documentation", "Creates a transformation node with the rotation\norder x*y*z\n\n@param tx\n           the x translation.\n@param ty\n           the y translation.\n@param tz\n           the z translation.\n@param rx\n           the rotation around the x axis, in radians.\n@param ry\n           the rotation around the y axis, in radians.\n@param rz\n           the rotation around the z axis, in radians."
		   });	
		addAnnotation
		  (getTopologyFacade__CreateTransformNodeYZX__double_double_double_double_double_double(), 
		   source, 
		   new String[] {
			 "documentation", "Creates a transformation node with the rotation\norder y*z*x\n\n@param tx\n           the x translation.\n@param ty\n           the y translation.\n@param tz\n           the z translation.\n@param rx\n           the rotation around the x axis, in radians.\n@param ry\n           the rotation around the y axis, in radians.\n@param rz\n           the rotation around the z axis, in radians."
		   });	
		addAnnotation
		  (getTopologyFacade__CreateTransformNodeZYX__double_double_double_double_double_double(), 
		   source, 
		   new String[] {
			 "documentation", "Creates a transformation node with the rotation\norder z*y*x\n\n@param tx\n           the x translation.\n@param ty\n           the y translation.\n@param tz\n           the z translation.\n@param rx\n           the rotation around the x axis, in radians.\n@param ry\n           the rotation around the y axis, in radians.\n@param rz\n           the rotation around the z axis, in radians."
		   });	
		addAnnotation
		  (getTopologyFacade__ExpressInFrame__Node_Node(), 
		   source, 
		   new String[] {
			 "documentation", "Compute the transformation to express sourceFrame\ninto targetFrame.\n<p>\nFor example\n<ul>\n<li>sourceFrame could be laser scanner</li>\n<li>targetFrame could be the sonar sensor</li>\n</ul>\nThis method can be used to express the point cloud coming out of the\nlaser scanner in the frame of the sonar sensor.\n</p>"
		   });
	}

} //TopologyPackageImpl
