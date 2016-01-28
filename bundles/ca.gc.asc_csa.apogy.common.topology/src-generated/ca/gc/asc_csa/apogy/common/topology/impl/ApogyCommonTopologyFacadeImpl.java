/**
 * <copyright>
 * </copyright>
 *
 * $Id: ApogyCommonTopologyFacadeImpl.java,v 1.10.2.3 2015/02/03 20:01:30 rlarcheveque Exp $
 */
package ca.gc.asc_csa.apogy.common.topology.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

import javax.vecmath.Matrix3d;
import javax.vecmath.Matrix4d;
import javax.vecmath.Vector3d;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import ca.gc.asc_csa.apogy.common.math.GeometricUtils;
import ca.gc.asc_csa.apogy.common.math.ApogyCommonMathFacade;
import ca.gc.asc_csa.apogy.common.math.ApogyCommonMathFactory;
import ca.gc.asc_csa.apogy.common.math.Matrix3x3;
import ca.gc.asc_csa.apogy.common.math.Tuple3d;
import ca.gc.asc_csa.apogy.common.topology.AbstractNodeVisitor;
import ca.gc.asc_csa.apogy.common.topology.AggregateContentNode;
import ca.gc.asc_csa.apogy.common.topology.ContentNode;
import ca.gc.asc_csa.apogy.common.topology.GroupNode;
import ca.gc.asc_csa.apogy.common.topology.INodeVisitor;
import ca.gc.asc_csa.apogy.common.topology.Link;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.PickAndPlaceNode;
import ca.gc.asc_csa.apogy.common.topology.PositionNode;
import ca.gc.asc_csa.apogy.common.topology.ReferencedContentNode;
import ca.gc.asc_csa.apogy.common.topology.RotationNode;
import ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyFacade;
import ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyFactory;
import ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyPackage;
import ca.gc.asc_csa.apogy.common.topology.TransformNode;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Facade</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class ApogyCommonTopologyFacadeImpl extends MinimalEObjectImpl.Container implements ApogyCommonTopologyFacade {

	private static ApogyCommonTopologyFacade instance;

	public static ApogyCommonTopologyFacade getInstance() {
		if (instance == null) {
			instance = new ApogyCommonTopologyFacadeImpl();
		}

		return instance;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ApogyCommonTopologyFacadeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCommonTopologyPackage.Literals.APOGY_COMMON_TOPOLOGY_FACADE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public <T> ContentNode<T> createContentNode(T content) {
		return createAggregateContentNode(content);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public PositionNode createPositionNode(double x, double y, double z) {
		PositionNode node = ApogyCommonTopologyFactory.eINSTANCE.createPositionNode();

		Tuple3d position = ApogyCommonMathFactory.eINSTANCE.createTuple3d();

		node.setPosition(position);

		node.getPosition().setX(x);
		node.getPosition().setY(y);
		node.getPosition().setZ(z);

		return node;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public RotationNode createRotationNodeXYZ(double x, double y, double z) {

		RotationNode node = ApogyCommonTopologyFactory.eINSTANCE.createRotationNode();

		Matrix3d rotationMatrix = GeometricUtils.packXYZ(x, y, z);

		Matrix3x3 matrix = ApogyCommonMathFacade.INSTANCE.createMatrix3x3(rotationMatrix);

		node.setRotationMatrix(matrix);

		return node;

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public Matrix4d expressRootInNodeFrame(Node node) {

		Matrix4d mat = expressNodeInRootFrame(node);
		mat.invert();

		return mat;

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public Matrix4d expressInFrame(Node sourceFrame, Node targetFrame) 
	{
		Matrix4d sourceFrameToRoot = expressNodeInRootFrame(sourceFrame);		
		Matrix4d rootToTargetFrame = expressNodeInRootFrame(targetFrame);
		rootToTargetFrame.invert();
		rootToTargetFrame.mul(sourceFrameToRoot);

		return rootToTargetFrame;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public RotationNode createRotationNodeYZX(double x, double y, double z) {
		RotationNode node = ApogyCommonTopologyFactory.eINSTANCE.createRotationNode();

		Matrix3d rotationMatrix = GeometricUtils.packYZX(x, y, z);

		Matrix3x3 matrix = ApogyCommonMathFacade.INSTANCE.createMatrix3x3(rotationMatrix);

		node.setRotationMatrix(matrix);

		return node;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public RotationNode createRotationNodeZYX(double x, double y, double z) {
		RotationNode node = ApogyCommonTopologyFactory.eINSTANCE.createRotationNode();

		Matrix3d rotationMatrix = GeometricUtils.packZYX(x, y, z);

		Matrix3x3 matrix = ApogyCommonMathFacade.INSTANCE.createMatrix3x3(rotationMatrix);

		node.setRotationMatrix(matrix);

		return node;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public TransformNode createTransformNodeXYZ(double tx, double ty,
			double tz, double rx, double ry, double rz) {

		RotationNode rotationNode = createRotationNodeXYZ(rx, ry, rz);

		Tuple3d translation = ApogyCommonMathFactory.eINSTANCE.createTuple3d();
		translation.setX(tx);
		translation.setY(ty);
		translation.setZ(tz);

		TransformNode trNode = ApogyCommonTopologyFactory.eINSTANCE.createTransformNode();
		trNode.setRotationMatrix(rotationNode.getRotationMatrix());
		trNode.setPosition(translation);

		return trNode;

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public TransformNode createTransformNodeYZX(double tx, double ty,
			double tz, double rx, double ry, double rz) {
		RotationNode rotationNode = createRotationNodeYZX(rx, ry, rz);

		Tuple3d translation = ApogyCommonMathFactory.eINSTANCE.createTuple3d();
		translation.setX(tx);
		translation.setY(ty);
		translation.setZ(tz);

		TransformNode trNode = ApogyCommonTopologyFactory.eINSTANCE.createTransformNode();
		trNode.setRotationMatrix(rotationNode.getRotationMatrix());
		trNode.setPosition(translation);

		return trNode;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public TransformNode createTransformNodeZYX(double tx, double ty,
			double tz, double rx, double ry, double rz) {
		RotationNode rotationNode = createRotationNodeZYX(rx, ry, rz);

		Tuple3d translation = ApogyCommonMathFactory.eINSTANCE.createTuple3d();
		translation.setX(tx);
		translation.setY(ty);
		translation.setZ(tz);

		TransformNode trNode = ApogyCommonTopologyFactory.eINSTANCE.createTransformNode();
		trNode.setRotationMatrix(rotationNode.getRotationMatrix());
		trNode.setPosition(translation);

		return trNode;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public TransformNode createTransformNode(Matrix4d matrix) {

		TransformNode tn = ApogyCommonTopologyFactory.eINSTANCE.createTransformNode();

		tn.setTransformation(matrix);

		return tn;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public PickAndPlaceNode createPickAndPlaceNode(Matrix4d matrix) {

		PickAndPlaceNode pnpn = ApogyCommonTopologyFactory.eINSTANCE
				.createPickAndPlaceNode();

		pnpn.setTransformation(matrix);

		return pnpn;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public void printTopology(Node node) {
		System.out.println("graph G {");

		printTopology(node, null);

		System.out.println("}");
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public <T> ReferencedContentNode<T> createReferencedContentNode(T content) {
		ReferencedContentNode<T> contentNode = ApogyCommonTopologyFactory.eINSTANCE
				.createReferencedContentNode();
		contentNode.setContent(content);

		return contentNode;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public <T> AggregateContentNode<T> createAggregateContentNode(T content) {
		AggregateContentNode<T> contentNode = ApogyCommonTopologyFactory.eINSTANCE
				.createAggregateContentNode();
		contentNode.setContent(content);

		return contentNode;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public Link createLink(Node node) {
		Link link = ApogyCommonTopologyFactory.eINSTANCE.createLink();
		link.setNode(node);

		return link;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public EList<Node> findNodesByDescription(String description, Node topology) {

		final String fDescription = description;

		final EList<Node> matches = new BasicEList<Node>();

		INodeVisitor visitor = new AbstractNodeVisitor() {

			@Override
			public void visit(Node node) {
				// Special case: description is null
				if (node.getDescription() == null && fDescription == null) {
					matches.add(node);
				} else if (node.getDescription() != null
						&& node.getDescription().equals(fDescription)) {
					matches.add(node);
				}
			}
		};

		topology.accept(visitor);

		return matches;

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public EList<Node> findNodesByID(String id, Node topology) {
		final String fId = id;

		final EList<Node> matches = new BasicEList<Node>();

		INodeVisitor visitor = new AbstractNodeVisitor() {

			@Override
			public void visit(Node node) {
				// Special case: ID is null
				if (node.getNodeId() == null && fId == null) {
					matches.add(node);
				} else if (node.getNodeId() != null
						&& node.getNodeId().equals(fId)) {
					matches.add(node);
				}
			}
		};

		topology.accept(visitor);

		return matches;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public EList<Node> findNodesByType(final EClass clazz, Node topology) {
		final EList<Node> matches = new BasicEList<Node>();

		INodeVisitor visitor = new AbstractNodeVisitor() 
		{
			@Override
			public void visit(Node node) 
			{
				System.out.println(node.getClass() + " ID " + node.getNodeId());
				
				if(clazz.isSuperTypeOf(node.eClass()))
				{
					matches.add(node);
				}				
			}
		};

		topology.accept(visitor);

		return matches;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public Node findRoot(Node node) {
		Node current = node;
		Node root = node;

		while (current != null) {
			root = current;
			current = current.getParent();
		}

		return root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public double getEuclideanDistance(Node fromNode, Node toNode)
	{
		if(fromNode == toNode)
		{
			return 0.0;
		}
		else
		{
			Matrix4d m = expressInFrame(fromNode, toNode);
			Vector3d v = new Vector3d();		
			m.get(v);		
			return v.length();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public double getGeodesicDistance(Node fromNode, Node toNode) 
	{
		if(fromNode == toNode)
		{
			return 0.0;
		}
		else
		{
			List<Node> nodePath = findNodePath(fromNode, toNode);
			
			double distance = 0.0;
			
			Node currentNode = null;
			Node previousNode = null;
			for(int i = 0; i < nodePath.size(); i++ )
			{
				currentNode = nodePath.get(i);			
				if(previousNode != null && currentNode != null)
				{
					distance += getEuclideanDistance(previousNode, currentNode);
				}			
				previousNode = currentNode;
			}
			
			return distance;
		}
	}

	private List<Node> findNodePath(Node fromNode, Node toNode)
	{
		// Return path with from node if from and to are the same node.
		if(fromNode == toNode)
		{
			List<Node> nodePath = new ArrayList<Node>();
			nodePath.add(fromNode);
			return nodePath;
		}
				
		// Traverses the topology from fromNode to root.
		Node current = fromNode;				
		List<Node> fromToRootList = new ArrayList<Node>();			
		while (current != null) 
		{						
			fromToRootList.add(current);			
			
			// Move up the tree.
			current = current.getParent();
		}
	
		// Traverses the topology from toNode to root.
		current = toNode;		
		List<Node> toToRootList = new ArrayList<Node>();
		while (current != null) 
		{									
			toToRootList.add(current);
			
			// Move up the tree.
			current = current.getParent();
		}	
				
		// Finds the intersection of both path.
		Node intersectionNode = null;
		Iterator<Node> iterator = fromToRootList.iterator();
		while(intersectionNode == null && iterator.hasNext())
		{
			Node node = iterator.next();
			
			if(toToRootList.contains(node))
			{
				intersectionNode = node;
			}
		}
		
		// If no intersection is found.
		if(intersectionNode == null)
		{
			return new ArrayList<Node>();
		}
		else
		{
			List<Node> nodePath = new ArrayList<Node>();
			
			// Gets the from items up to intersectionNode.
			int index = 0;
			boolean stop = false;
			while(!stop && index < fromToRootList.size())
			{
				Node node = fromToRootList.get(index);
				
				if(node == intersectionNode)
				{
					stop = true;
				}
				else
				{
					nodePath.add(node);
				}
				index++;
			}
			
			// Gets the to items from intersectionNode to to. 
			index = toToRootList.indexOf(intersectionNode);			
			while(index >= 0)
			{
				Node node = toToRootList.get(index);
				nodePath.add(node);			
				index--;
			}
			
			return nodePath;
		}
	}
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments)
			throws InvocationTargetException {
		switch (operationID) {
			case ApogyCommonTopologyPackage.APOGY_COMMON_TOPOLOGY_FACADE___CREATE_LINK__NODE:
				return createLink((Node)arguments.get(0));
			case ApogyCommonTopologyPackage.APOGY_COMMON_TOPOLOGY_FACADE___CREATE_CONTENT_NODE__OBJECT:
				return createContentNode(arguments.get(0));
			case ApogyCommonTopologyPackage.APOGY_COMMON_TOPOLOGY_FACADE___CREATE_REFERENCED_CONTENT_NODE__OBJECT:
				return createReferencedContentNode(arguments.get(0));
			case ApogyCommonTopologyPackage.APOGY_COMMON_TOPOLOGY_FACADE___CREATE_AGGREGATE_CONTENT_NODE__OBJECT:
				return createAggregateContentNode(arguments.get(0));
			case ApogyCommonTopologyPackage.APOGY_COMMON_TOPOLOGY_FACADE___CREATE_POSITION_NODE__DOUBLE_DOUBLE_DOUBLE:
				return createPositionNode((Double)arguments.get(0), (Double)arguments.get(1), (Double)arguments.get(2));
			case ApogyCommonTopologyPackage.APOGY_COMMON_TOPOLOGY_FACADE___CREATE_ROTATION_NODE_XYZ__DOUBLE_DOUBLE_DOUBLE:
				return createRotationNodeXYZ((Double)arguments.get(0), (Double)arguments.get(1), (Double)arguments.get(2));
			case ApogyCommonTopologyPackage.APOGY_COMMON_TOPOLOGY_FACADE___CREATE_ROTATION_NODE_YZX__DOUBLE_DOUBLE_DOUBLE:
				return createRotationNodeYZX((Double)arguments.get(0), (Double)arguments.get(1), (Double)arguments.get(2));
			case ApogyCommonTopologyPackage.APOGY_COMMON_TOPOLOGY_FACADE___CREATE_ROTATION_NODE_ZYX__DOUBLE_DOUBLE_DOUBLE:
				return createRotationNodeZYX((Double)arguments.get(0), (Double)arguments.get(1), (Double)arguments.get(2));
			case ApogyCommonTopologyPackage.APOGY_COMMON_TOPOLOGY_FACADE___CREATE_TRANSFORM_NODE_XYZ__DOUBLE_DOUBLE_DOUBLE_DOUBLE_DOUBLE_DOUBLE:
				return createTransformNodeXYZ((Double)arguments.get(0), (Double)arguments.get(1), (Double)arguments.get(2), (Double)arguments.get(3), (Double)arguments.get(4), (Double)arguments.get(5));
			case ApogyCommonTopologyPackage.APOGY_COMMON_TOPOLOGY_FACADE___CREATE_TRANSFORM_NODE_YZX__DOUBLE_DOUBLE_DOUBLE_DOUBLE_DOUBLE_DOUBLE:
				return createTransformNodeYZX((Double)arguments.get(0), (Double)arguments.get(1), (Double)arguments.get(2), (Double)arguments.get(3), (Double)arguments.get(4), (Double)arguments.get(5));
			case ApogyCommonTopologyPackage.APOGY_COMMON_TOPOLOGY_FACADE___CREATE_TRANSFORM_NODE_ZYX__DOUBLE_DOUBLE_DOUBLE_DOUBLE_DOUBLE_DOUBLE:
				return createTransformNodeZYX((Double)arguments.get(0), (Double)arguments.get(1), (Double)arguments.get(2), (Double)arguments.get(3), (Double)arguments.get(4), (Double)arguments.get(5));
			case ApogyCommonTopologyPackage.APOGY_COMMON_TOPOLOGY_FACADE___CREATE_TRANSFORM_NODE__MATRIX4D:
				return createTransformNode((Matrix4d)arguments.get(0));
			case ApogyCommonTopologyPackage.APOGY_COMMON_TOPOLOGY_FACADE___CREATE_PICK_AND_PLACE_NODE__MATRIX4D:
				return createPickAndPlaceNode((Matrix4d)arguments.get(0));
			case ApogyCommonTopologyPackage.APOGY_COMMON_TOPOLOGY_FACADE___EXPRESS_NODE_IN_ROOT_FRAME__NODE:
				return expressNodeInRootFrame((Node)arguments.get(0));
			case ApogyCommonTopologyPackage.APOGY_COMMON_TOPOLOGY_FACADE___EXPRESS_ROOT_IN_NODE_FRAME__NODE:
				return expressRootInNodeFrame((Node)arguments.get(0));
			case ApogyCommonTopologyPackage.APOGY_COMMON_TOPOLOGY_FACADE___EXPRESS_IN_FRAME__NODE_NODE:
				return expressInFrame((Node)arguments.get(0), (Node)arguments.get(1));
			case ApogyCommonTopologyPackage.APOGY_COMMON_TOPOLOGY_FACADE___FIND_NODES_BY_DESCRIPTION__STRING_NODE:
				return findNodesByDescription((String)arguments.get(0), (Node)arguments.get(1));
			case ApogyCommonTopologyPackage.APOGY_COMMON_TOPOLOGY_FACADE___FIND_NODES_BY_ID__STRING_NODE:
				return findNodesByID((String)arguments.get(0), (Node)arguments.get(1));
			case ApogyCommonTopologyPackage.APOGY_COMMON_TOPOLOGY_FACADE___FIND_NODES_BY_TYPE__ECLASS_NODE:
				return findNodesByType((EClass)arguments.get(0), (Node)arguments.get(1));
			case ApogyCommonTopologyPackage.APOGY_COMMON_TOPOLOGY_FACADE___FIND_ROOT__NODE:
				return findRoot((Node)arguments.get(0));
			case ApogyCommonTopologyPackage.APOGY_COMMON_TOPOLOGY_FACADE___GET_EUCLIDEAN_DISTANCE__NODE_NODE:
				return getEuclideanDistance((Node)arguments.get(0), (Node)arguments.get(1));
			case ApogyCommonTopologyPackage.APOGY_COMMON_TOPOLOGY_FACADE___GET_GEODESIC_DISTANCE__NODE_NODE:
				return getGeodesicDistance((Node)arguments.get(0), (Node)arguments.get(1));
			case ApogyCommonTopologyPackage.APOGY_COMMON_TOPOLOGY_FACADE___PRINT_TOPOLOGY__NODE:
				printTopology((Node)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	private void printTopology(Node currentNode, Node parentNode) {
		if (parentNode == null && !(currentNode instanceof GroupNode)) {
			System.out.println(currentNode);
		} else if (parentNode != null) {
			System.out.println("\"" + parentNode + "\" -- \"" + currentNode
					+ "\"");
		}

		if (currentNode instanceof GroupNode) {
			GroupNode groupNode = (GroupNode) currentNode;

			for (Node node : groupNode.getChildren()) {
				printTopology(node, currentNode);
			}
		}
	}

	/**
	 * <!-- begin-user-doc --> Computes the transformation matrix of the node in
	 * root coordinates. <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public Matrix4d expressNodeInRootFrame(Node node) {
		List<Matrix4d> matrices = computeMatrixList(node);

		return computeMatrix(matrices, true);
	}

	private List<Matrix4d> computeMatrixList(Node node) {
		Matrix4d transformationMatrix = new Matrix4d();
		transformationMatrix.setIdentity();

		Stack<Matrix4d> matrices = new Stack<Matrix4d>();
		Node currentNode = node;

		// We get the parent of the node until we get to the root,
		// i.e. when the parent is null.
		while (currentNode != null) 
		{
			Matrix4d nodeMatrix = null;
			if (currentNode instanceof TransformNode) {
				TransformNode tnode = (TransformNode) currentNode;
				nodeMatrix = tnode.asMatrix4d();
			} else if (currentNode instanceof PositionNode) {
				PositionNode pNode = (PositionNode) currentNode;
				nodeMatrix = new Matrix4d();
				nodeMatrix.setIdentity();
				nodeMatrix.setTranslation(new Vector3d(pNode.getPosition()
						.asTuple3d()));
			} else if (currentNode instanceof RotationNode) {
				RotationNode rNode = (RotationNode) currentNode;
				nodeMatrix = new Matrix4d();
				nodeMatrix.setIdentity();
				nodeMatrix.setRotation(rNode.getRotationMatrix().asMatrix3d());
			}

			if (nodeMatrix != null) {
				matrices.push(nodeMatrix);
			}
			currentNode = currentNode.getParent();
		}

		return matrices;
	}

	private Matrix4d computeMatrix(List<Matrix4d> matrices, boolean reverse) {
		Matrix4d result = new Matrix4d();
		result.setIdentity();
		// System.out.println("ApogyCommonTopologyFacadeImpl.computeMatrix()");

		while (!matrices.isEmpty()) {
			Matrix4d matrix = null;
			if (reverse) {
				matrix = matrices.remove(matrices.size() - 1);
			} else {
				matrix = matrices.remove(0);
			}
			// System.out.println("ApogyCommonTopologyFacadeImpl.computeMatrix() multiplying "
			// + matrix);
			result.mul(matrix);
		}

		return result;
	}

} // ApogyCommonTopologyFacadeImpl
