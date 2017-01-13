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
	 * @model unique="false" nodeUnique="false"
	 * @generated
	 */
	Link createLink(Node node);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" contentUnique="false"
	 * @generated
	 */
	<T> ContentNode<T> createContentNode(T content);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" contentUnique="false"
	 * @generated
	 */
	<T> ReferencedContentNode<T> createReferencedContentNode(T content);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" contentUnique="false"
	 * @generated
	 */
	<T> AggregateContentNode<T> createAggregateContentNode(T content);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * @model unique="false" matrixDataType="ca.gc.asc_csa.apogy.common.topology.Matrix4d" matrixUnique="false"
	 * @generated
	 */
	TransformNode createTransformNode(Matrix4d matrix);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" matrixDataType="ca.gc.asc_csa.apogy.common.topology.Matrix4d" matrixUnique="false"
	 * @generated
	 */
	PickAndPlaceNode createPickAndPlaceNode(Matrix4d matrix);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.common.topology.Matrix4d" unique="false" nodeUnique="false"
	 * @generated
	 */
	Matrix4d expressNodeInRootFrame(Node node);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * @model unique="false" descriptionUnique="false" topologyUnique="false"
	 * @generated
	 */
	EList<Node> findNodesByDescription(String description, Node topology);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" nodeIdUnique="false" topologyUnique="false"
	 * @generated
	 */
	EList<Node> findNodesByID(String nodeId, Node topology);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" clazzDataType="ca.gc.asc_csa.apogy.common.topology.EClass" clazzUnique="false" topologyUnique="false"
	 * @generated
	 */
	EList<Node> findNodesByType(EClass clazz, Node topology);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" nodeUnique="false"
	 * @generated
	 */
	Node findRoot(Node node);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" fromNodeUnique="false" toNodeUnique="false"
	 * @generated
	 */
	double getEuclideanDistance(Node fromNode, Node toNode);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" fromNodeUnique="false" toNodeUnique="false"
	 * @generated
	 */
	double getGeodesicDistance(Node fromNode, Node toNode);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nodeUnique="false"
	 * @generated
	 */
	void printTopology(Node node);

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
