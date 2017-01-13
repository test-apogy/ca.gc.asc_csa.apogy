package ca.gc.asc_csa.apogy.common.topology;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import javax.vecmath.Matrix4d;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import ca.gc.asc_csa.apogy.common.topology.impl.ApogyCommonTopologyFacadeImpl;
import java.util.Collection;
import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyPackage#getApogyCommonTopologyFacade()
 * @model
 * @generated
 */
public interface ApogyCommonTopologyFacade extends EObject 
{
	public static ApogyCommonTopologyFacade INSTANCE = ApogyCommonTopologyFacadeImpl.getInstance();
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Creates a Link node that point to a specified Node.
	 * @param node The node the Link point to.
	 * @return The Link node created.
	 * <!-- end-model-doc -->
	 * @model unique="false" nodeUnique="false"
	 * @generated
	 */
	Link createLink(Node node);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Creates a ContentNode that contains a specified content.
	 * @param content The content of the node.
	 * @return The ContentNode created.
	 * <!-- end-model-doc -->
	 * @model unique="false" contentUnique="false"
	 * @generated
	 */
	<T> ContentNode<T> createContentNode(T content);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Creates a ReferencedContentNode that refers to a specified content.
	 * @param content The content the node is to refer to.
	 * @return The ReferencedContentNode created.
	 * <!-- end-model-doc -->
	 * @model unique="false" contentUnique="false"
	 * @generated
	 */
	<T> ReferencedContentNode<T> createReferencedContentNode(T content);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Creates a AggregateContentNode that contains a specified content.
	 * @param content The content of the node.
	 * @return The AggregateContentNode created.
	 * <!-- end-model-doc -->
	 * @model unique="false" contentUnique="false"
	 * @generated
	 */
	<T> AggregateContentNode<T> createAggregateContentNode(T content);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Creates a PositionNode with x,y,and z coordinates.
	 * @param x the position along the x axis.
	 * @param y the position along the y axis.
	 * @param z the position along the z axis.
	 * <!-- end-model-doc -->
	 * @model unique="false" xUnique="false" yUnique="false" zUnique="false"
	 * @generated
	 */
	PositionNode createPositionNode(double x, double y, double z);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates a rotation node with the rotation order
	 * x*y*z
	 * 
	 * @param x
	 *            the rotation around the x axis, in radians.
	 * @param y
	 *            the rotation around the y axis, in radians.
	 * @param z
	 *            the rotation around the z axis, in radians.
	 * <!-- end-model-doc -->
	 * @model unique="false" xUnique="false" yUnique="false" zUnique="false"
	 * @generated
	 */
	RotationNode createRotationNodeXYZ(double x, double y, double z);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates a rotation node with the rotation order
	 * y*z*x
	 * 
	 * @param x
	 *            the rotation around the x axis, in radians.
	 * @param y
	 *            the rotation around the y axis, in radians.
	 * @param z
	 *            the rotation around the z axis, in radians.
	 * <!-- end-model-doc -->
	 * @model unique="false" xUnique="false" yUnique="false" zUnique="false"
	 * @generated
	 */
	RotationNode createRotationNodeYZX(double x, double y, double z);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates a rotation node with the rotation order
	 * z*y*x
	 * 
	 * @param x
	 *            the rotation around the x axis, in radians.
	 * @param y
	 *            the rotation around the y axis, in radians.
	 * @param z
	 *            the rotation around the z axis, in radians.
	 * <!-- end-model-doc -->
	 * @model unique="false" xUnique="false" yUnique="false" zUnique="false"
	 * @generated
	 */
	RotationNode createRotationNodeZYX(double x, double y, double z);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates a transformation node with the rotation
	 * order x*y*z
	 * 
	 * @param tx
	 *            the x translation.
	 * @param ty
	 *            the y translation.
	 * @param tz
	 *            the z translation.
	 * @param rx
	 *            the rotation around the x axis, in radians.
	 * @param ry
	 *            the rotation around the y axis, in radians.
	 * @param rz
	 *            the rotation around the z axis, in radians.
	 * <!-- end-model-doc -->
	 * @model unique="false" txUnique="false" tyUnique="false" tzUnique="false" rxUnique="false" ryUnique="false" rzUnique="false"
	 * @generated
	 */
	TransformNode createTransformNodeXYZ(double tx, double ty, double tz, double rx, double ry, double rz);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates a transformation node with the rotation
	 * order y*z*x
	 * 
	 * @param tx
	 *            the x translation.
	 * @param ty
	 *            the y translation.
	 * @param tz
	 *            the z translation.
	 * @param rx
	 *            the rotation around the x axis, in radians.
	 * @param ry
	 *            the rotation around the y axis, in radians.
	 * @param rz
	 *            the rotation around the z axis, in radians.
	 * <!-- end-model-doc -->
	 * @model unique="false" txUnique="false" tyUnique="false" tzUnique="false" rxUnique="false" ryUnique="false" rzUnique="false"
	 * @generated
	 */
	TransformNode createTransformNodeYZX(double tx, double ty, double tz, double rx, double ry, double rz);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates a transformation node with the rotation
	 * order z*y*x
	 * 
	 * @param tx
	 *            the x translation.
	 * @param ty
	 *            the y translation.
	 * @param tz
	 *            the z translation.
	 * @param rx
	 *            the rotation around the x axis, in radians.
	 * @param ry
	 *            the rotation around the y axis, in radians.
	 * @param rz
	 *            the rotation around the z axis, in radians.
	 * <!-- end-model-doc -->
	 * @model unique="false" txUnique="false" tyUnique="false" tzUnique="false" rxUnique="false" ryUnique="false" rzUnique="false"
	 * @generated
	 */
	TransformNode createTransformNodeZYX(double tx, double ty, double tz, double rx, double ry, double rz);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Creates a TransformNode using a pose expressed as a Matrix4d (4x4 matrix).
	 * @param matrix The matrix.
	 * @result The TransformNode created.
	 * <!-- end-model-doc -->
	 * @model unique="false" matrixDataType="ca.gc.asc_csa.apogy.common.topology.Matrix4d" matrixUnique="false"
	 * @generated
	 */
	TransformNode createTransformNode(Matrix4d matrix);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Creates a PickAndPlaceNode using a pose expressed as a Matrix4d (4x4 matrix).
	 * @param matrix The matrix.
	 * @result The PickAndPlaceNode created.
	 * <!-- end-model-doc -->
	 * @model unique="false" matrixDataType="ca.gc.asc_csa.apogy.common.topology.Matrix4d" matrixUnique="false"
	 * @generated
	 */
	PickAndPlaceNode createPickAndPlaceNode(Matrix4d matrix);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Return the 4x4 matrix expressing the pose of a specified Node in its root node.
	 * @param node The specified Node.
	 * @return The pose.
	 * <!-- end-model-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.common.topology.Matrix4d" unique="false" nodeUnique="false"
	 * @generated
	 */
	Matrix4d expressNodeInRootFrame(Node node);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Return the 4x4 matrix expressing the pose of a Node's root in that Node reference.
	 * @param node The specified Node.
	 * @return The pose.
	 * <!-- end-model-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.common.topology.Matrix4d" unique="false" nodeUnique="false"
	 * @generated
	 */
	Matrix4d expressRootInNodeFrame(Node node);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Compute the transformation to express sourceFrame
	 * into targetFrame.
	 * <p>
	 * For example
	 * <ul>
	 * <li>sourceFrame could be laser scanner</li>
	 * <li>targetFrame could be the sonar sensor</li>
	 * </ul>
	 * This method can be used to express the point cloud coming out of the
	 * laser scanner in the frame of the sonar sensor.
	 * </p>
	 * <!-- end-model-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.common.topology.Matrix4d" unique="false" sourceFrameUnique="false" targetFrameUnique="false"
	 * @generated
	 */
	Matrix4d expressInFrame(Node sourceFrame, Node targetFrame);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Returns all Node for which the description matches a specified string.
	 * @param description The description to match.
	 * @param root The root node of the topology.
	 * @return The list of matching Nodes.
	 * <!-- end-model-doc -->
	 * @model unique="false" descriptionUnique="false" rootUnique="false"
	 * @generated
	 */
	EList<Node> findNodesByDescription(String description, Node root);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Returns all Node for which the Id matches a specified string.
	 * @param nodeId The Id to match.
	 * @param root The root node of the topology.
	 * @return The list of matching Nodes.
	 * <!-- end-model-doc -->
	 * @model unique="false" nodeIdUnique="false" rootUnique="false"
	 * @generated
	 */
	EList<Node> findNodesByID(String nodeId, Node root);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Returns all Node that are matches or are sub-classes of a specified EClass.
	 * @param clazz The EClass to match.
	 * @param root The root node of the topology.
	 * @return The list of matching Nodes.
	 * <!-- end-model-doc -->
	 * @model unique="false" clazzDataType="ca.gc.asc_csa.apogy.common.topology.EClass" clazzUnique="false" rootUnique="false"
	 * @generated
	 */
	EList<Node> findNodesByType(EClass clazz, Node root);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Returns the root node (i.e. moves up the topology tree until the ultimate parent node is found) of a specified Node.
	 * @param node The specified Node.
	 * @return The root Node.
	 * <!-- end-model-doc -->
	 * @model unique="false" nodeUnique="false"
	 * @generated
	 */
	Node findRoot(Node node);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Returns whether or not two specified Nodes shared the same topology tree.
	 * @param node1 The first Node.
	 * @param node2 The second Node.
	 * return True if the nodes share the same root Node.
	 * <!-- end-model-doc -->
	 * @model unique="false" node1Unique="false" node2Unique="false"
	 * @generated
	 */
	boolean doNodesShareTopologyTree(Node node1, Node node2);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Finds the list of Node that connects fromNode to toNode.
	 * @param fromNode The node from which to start.
	 * @param toNode The destination node.
	 * @return The list of nodes connecting fromNode to toNode. Never null.
	 * <!-- end-model-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.common.topology.List<ca.gc.asc_csa.apogy.common.topology.Node>" unique="false" many="false" fromNodeUnique="false" toNodeUnique="false"
	 * @generated
	 */
	List<Node> findNodePath(Node fromNode, Node toNode);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Returns the Euclidian (i.e. straight line) distance between two Nodes. The nodes must be part of a common topology tree.
	 * @param fromNode The first Node.
	 * @param fromNode The second Node.
	 * return The distance between the specified Nodes, NaN if the specified node do no share the same topology tree.
	 * <!-- end-model-doc -->
	 * @model unique="false" fromNodeUnique="false" toNodeUnique="false"
	 * @generated
	 */
	double getEuclideanDistance(Node fromNode, Node toNode);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Returns the geodesic (i.e. along the connecting edges) distance between two Nodes. The nodes must be part of a common topology tree.
	 * @param fromNode The first Node.
	 * @param fromNode The second Node.
	 * return The distance between the specified Nodes, NaN if the specified node do no share the same topology tree.
	 * <!-- end-model-doc -->
	 * @model unique="false" fromNodeUnique="false" toNodeUnique="false"
	 * @generated
	 */
	double getGeodesicDistance(Node fromNode, Node toNode);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Prints the topology as text to the console.
	 * @param root The root node of the topology.
	 * <!-- end-model-doc -->
	 * @model rootUnique="false"
	 * @generated
	 */
	void printTopology(Node root);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Applies a NodfeFilter to a list of Nodes.
	 * @param filter The filter to apply.
	 * @param nodes The list of Nodes on which to apply the filter.
	 * @return The list of Node that passes through the filter.
	 * <!-- end-model-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.common.topology.Collection<ca.gc.asc_csa.apogy.common.topology.Node>" unique="false" filterUnique="false" nodesDataType="ca.gc.asc_csa.apogy.common.topology.Collection<ca.gc.asc_csa.apogy.common.topology.Node>" nodesUnique="false"
	 * @generated
	 */
	Collection<Node> filter(NodeFilter filter, Collection<Node> nodes);

} // ApogyCommonTopologyFacade
