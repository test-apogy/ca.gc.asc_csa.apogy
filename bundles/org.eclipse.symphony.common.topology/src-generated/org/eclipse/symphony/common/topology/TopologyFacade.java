/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.topology;

import javax.vecmath.Matrix4d;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.symphony.common.topology.impl.TopologyFacadeImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.symphony.common.topology.Symphony__CommonTopologyPackage#getTopologyFacade()
 * @model
 * @generated
 */
public interface TopologyFacade extends EObject 
{
	public static TopologyFacade INSTANCE = TopologyFacadeImpl.getInstance();
	
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
	 * @model unique="false" matrixDataType="org.eclipse.symphony.common.topology.Matrix4d" matrixUnique="false"
	 * @generated
	 */
	TransformNode createTransformNode(Matrix4d matrix);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" matrixDataType="org.eclipse.symphony.common.topology.Matrix4d" matrixUnique="false"
	 * @generated
	 */
	PickAndPlaceNode createPickAndPlaceNode(Matrix4d matrix);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.symphony.common.topology.Matrix4d" unique="false" nodeUnique="false"
	 * @generated
	 */
	Matrix4d expressNodeInRootFrame(Node node);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.symphony.common.topology.Matrix4d" unique="false" nodeUnique="false"
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
	 * @model dataType="org.eclipse.symphony.common.topology.Matrix4d" unique="false" sourceFrameUnique="false" targetFrameUnique="false"
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
	 * @model unique="false" clazzDataType="org.eclipse.symphony.common.topology.EClass" clazzUnique="false" topologyUnique="false"
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

} // TopologyFacade
